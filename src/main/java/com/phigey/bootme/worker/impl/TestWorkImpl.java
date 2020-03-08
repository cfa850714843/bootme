package com.phigey.bootme.worker.impl;

import com.phigey.bootme.conponent.DistributeLockComponent;
import com.phigey.bootme.worker.IWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author lizf
 */

@Service
public class TestWorkImpl implements IWorker {

    @Autowired
    private DistributeLockComponent distributeLockComponent;

    @Async
    @Override
    public void doSomething() {
        distributeLockComponent.testLock();
    }

}
