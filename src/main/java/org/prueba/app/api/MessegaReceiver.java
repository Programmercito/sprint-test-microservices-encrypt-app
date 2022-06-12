package org.prueba.app.api;

import org.prueba.app.model.entities.MessageEncrypt;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 *
 * @author Programmercito <devtecpro.org>
 */
@Component
public class MessegaReceiver {

    @JmsListener(destination = "${activemq.destination}")
    public void receiveMessge(MessageEncrypt mensaje) {
        System.out.println("Message Received: " + mensaje.getMessage());
    }
}
