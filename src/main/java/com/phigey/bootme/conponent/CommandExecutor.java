package com.phigey.bootme.conponent;

import com.phigey.bootme.common.StringProcessor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author lizf
 */

@Component
@Slf4j
public class CommandExecutor {

    @Async
    public void execute (String cmd, StringProcessor stringProcessor) {
        try {
            log.info("exec: [ {} ]", cmd);
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
            log.info("exec: [ {} ]", e.getMessage());
        }
    }
}
