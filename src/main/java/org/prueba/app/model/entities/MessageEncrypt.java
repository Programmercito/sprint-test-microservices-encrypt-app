package org.prueba.app.model.entities;

import java.io.Serializable;

/**
 *
 * @author Programmercito <devtecpro.org>
 */
public class MessageEncrypt implements Serializable{
private String message;    

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
