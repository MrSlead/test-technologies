package com.almod.flow.broker;

import com.almod.flow.broker.entity.AbstractClientRequest;
import jakarta.jms.TextMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class TransferDataToBroker {
    private final Logger LOGGER = LoggerFactory.getLogger(TransferDataToBroker.class);

    private JmsTemplate jmsTemplate;

    public TransferDataToBroker(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void transferData(AbstractClientRequest clientRequest, String queue) {
        jmsTemplate.send(queue, session -> {
            TextMessage textMessage = session.createTextMessage();
            textMessage.setStringProperty("clientRequestString", clientRequest.toString());

            return textMessage;
        });

        LOGGER.info("The data has been successfully inserted into the queue: " + queue);
    }
}