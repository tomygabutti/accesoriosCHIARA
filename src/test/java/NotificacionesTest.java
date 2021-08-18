import com.chiara.notificaciones.Notificacion;
import com.chiara.notificaciones.*;
import com.twilio.Twilio;
import org.junit.Before;
import org.junit.Test;

public class NotificacionesTest {
  // private EnviadorNotificacion enviador;
  // private Notificacion sms;
   private Notificacion wpp;
   private static final String ACCOUNT_SID = "AC46bcd54606fd1a3c5ad58b9399b17d69";
   private static final String AUTH_TOKEN = "012ec3d5adfb5a193228600248f27bf0";


    @Before
    public void init(){

       // this.sms = new SMS();
        this.wpp = new Whatsapp();
        Twilio.init(ACCOUNT_SID,AUTH_TOKEN);

    }

    @Test
    public void notificacionDePrueba() {

        wpp.comprobanteCompra("hola que tal?","+5491141882877");
    }


}
