package org.prueba.app.api.controllers;

import javax.jms.Queue;
import org.prueba.app.model.entities.MessageEncrypt;
import org.prueba.app.model.entities.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Programmercito <devtecpro.org>
 */
@RestController
@RequestMapping(path = "/api")
public class ReceptorMessageController {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    @PostMapping(path = "/send", consumes = "application/json;charset=UTF-8", produces = "application/json")
    public Result insert(@RequestBody MessageEncrypt msg) {
        System.out.println(msg.getMessage());
        this.jmsMessagingTemplate.convertAndSend(this.queue, msg);
        System.out.println("message sent.");
        Result resul = new Result();

        resul.setResultado("Enviado");
        return resul;
    }
}
