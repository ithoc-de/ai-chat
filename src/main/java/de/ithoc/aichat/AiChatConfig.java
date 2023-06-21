package de.ithoc.aichat;

import org.apache.ibatis.logging.LogFactory;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class AiChatConfig {

    @PostConstruct
    public void initLogging() {
        LogFactory.useSlf4jLogging();
    }

}
