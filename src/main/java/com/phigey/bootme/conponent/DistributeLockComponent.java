package com.phigey.bootme.conponent;

import com.phigey.bootme.constant.LockKeyConstant;
import lombok.extern.slf4j.Slf4j;
import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.concurrent.TimeUnit;

/**
 * @author lizf
 */
@Component
@Slf4j
public class DistributeLockComponent {

    @Autowired
    private Redisson redisson;

    public void testLock() {
        RLock rLock = rLock();
        try {
            rLock.lock();
            log.info("{} : Redis current lock request!", System.currentTimeMillis());
            TimeUnit.SECONDS.sleep(5);
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            rLock.unlock();
        }
    }

    private RLock rLock() {
        return redisson.getLock(LockKeyConstant.KEY1);
    }
}
