import com.chiara.notificaciones.Notificacion;
import com.chiara.notificaciones.SMS;
import com.twilio.Twilio;
import org.junit.Before;
import org.junit.Test;

public class NotificacionesTest {
  // private EnviadorNotificacion enviador;
   private Notificacion sms;
   private static final String ACCOUNT_SID = "AC46bcd54606fd1a3c5ad58b9399b17d69";
   private static final String AUTH_TOKEN = "012ec3d5adfb5a193228600248f27bf0";


    @Before
    public void init(){
       // this.enviador = EnviadorNotificacion.getInstance();
        this.sms = new SMS();
      //  this.wpp = new Whatsapp();
        Twilio.init(ACCOUNT_SID,AUTH_TOKEN);

    }

    @Test
    public void notificacionDePrueba() {
        sms.comprobanteCompra("probando","+541141882877");
    }


}
