package com.malykriszo.kursspring.config;

import com.malykriszo.kursspring.domain.Knight;
import com.malykriszo.kursspring.domain.Quest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ImportResource("classpath:config/castle-config.xml")
public class MainConfig {

    @Autowired
    Quest quest;

    @Bean(name = "lancelot")
    public Knight lancelot() {
        Knight lancelot = new Knight("Lancelot", 29);
        lancelot.setQuest(quest);
        return lancelot;
    }

    @Bean(name = "percival")
    public Knight createKnightBean() {
        Knight percival = new Knight("Percival", 25);
        percival.setQuest(quest);
        return percival;
    }
}
