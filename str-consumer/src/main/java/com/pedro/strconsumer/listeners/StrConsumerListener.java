package com.pedro.strconsumer.listeners;

import com.pedro.strconsumer.custom.StrConstumerCustomListener;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StrConsumerListener {

   @StrConstumerCustomListener(groupId = "group-1")
    public void create(String message) {
        log.info("create ::: Message {}", message);
    }

    @StrConstumerCustomListener(groupId = "group-1")
    public void log(String message) {
        log.info("LOG ::: Message {}", message);
    }

    @KafkaListener(groupId = "group-2", topics = "str-topic", containerFactory = "validMessageContainerFactory")
    public void history(String message) {
        log.info("HISTORY ::: Message {}", message);
    }
}
