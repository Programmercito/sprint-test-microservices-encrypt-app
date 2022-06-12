package org.prueba.app.controllers;

import org.prueba.app.model.entities.MessageEncrypt;
import org.prueba.app.model.entities.Result;
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

    @PostMapping(path = "/send", consumes = "application/json;charset=UTF-8", produces = "application/json")
    public Result insert(@RequestBody MessageEncrypt msg) {
        System.out.println(msg);
        Result resul=new Result();
        resul.setResultado("Enviado");
        return resul;
    }
}
