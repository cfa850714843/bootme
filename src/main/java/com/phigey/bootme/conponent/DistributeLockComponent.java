package com.phigey.bootme.conponent;

import com.phigey.bootme.constant.LockKeyConstant;
import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.concurrent.TimeUnit;

/**
 * @author lizf
 */
@Component
public class DistributeLockComponent {

    private Logger logger = LoggerFactory.getLogger(DistributeLockComponent.class);

    @Autowired
    private Redisson redisson;

    public void testLock() {
        RLock rLock = rLock();
        try {
            rLock.lock();
            logger.info("{} : Redis current lock request!", System.currentTimeMillis());
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
