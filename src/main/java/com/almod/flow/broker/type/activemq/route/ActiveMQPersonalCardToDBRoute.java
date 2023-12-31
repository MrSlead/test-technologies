package com.almod.flow.broker.type.activemq.route;

import com.almod.flow.broker.type.activemq.util.ActiveMQPersonalCardHandlerQueue;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQPersonalCardToDBRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        onException(Exception.class)
                .handled(true)
                .log(LoggingLevel.ERROR, "[${header.UUID}] Error when sending to the db: \n${exception.cause}")
                .setHeader("textBody", simple("${body}"))
                .setBody(simple("${exception.stacktrace}"))
                .to("activemq:error");

         from("activemq:incoming.files")
                .routeId("activemq-to-mysql")
                .log("[${header.UUID}] Try send a message to the db")
                .bean(ActiveMQPersonalCardHandlerQueue.class, "save")
                .log("[${header.UUID}] Successfully persisting to the db");
    }
}

