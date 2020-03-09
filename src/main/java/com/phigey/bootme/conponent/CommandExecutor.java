package com.phigey.bootme.conponent;

import com.phigey.bootme.common.StringProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author lizf
 */

@Component
public class CommandExecutor {

    private Logger logger = LoggerFactory.getLogger(CommandExecutor.class);

    @Async
    public void execute (String cmd, StringProcessor stringProcessor) {
        try {
            logger.info("exec: [ {} ]", cmd);
            Process process = Runtime.getRuntime().exec(cmd);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while (null != (line = bufferedReader.readLine())) {
                stringProcessor.process(line);
            }
            bufferedReader.close();
            process.destroy();
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("exec: [ {} ]", e.getMessage());
        }
    }
}
