package com.chiara.notificaciones;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class Whatsapp extends Notificacion{
    public void comprobanteCompra(String mensaje,String numero){
        PhoneNumber from = new PhoneNumber("whatsapp:+14242034681");
        PhoneNumber to   = new PhoneNumber("whatsapp:"+numero);

        Message message = Message.creator(
                to,
                from,
                mensaje)
                .create();

        System.out.println(message.getSid());
    };
}
