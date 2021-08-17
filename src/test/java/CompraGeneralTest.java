import com.chiara.*;

import com.chiara.estados.Estado;
import com.chiara.estados.Verde;
import com.chiara.notificaciones.Notificacion;
import com.chiara.notificaciones.SMS;
import com.twilio.Twilio;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompraGeneralTest {
    private Compra compraTest;
    private Cliente cliente;
    private TarjetaDebito tarjetaDebito;
    private Estado estadoCliente;
    private Notificacion sms;
    private static final String ACCOUNT_SID = "AC46bcd54606fd1a3c5ad58b9399b17d69";
    private static final String AUTH_TOKEN = "012ec3d5adfb5a193228600248f27bf0";

    //Productos
    private Accesorio prodSimple1;
    private Accesorio prodSimple2;
    private Accesorio prodSimple3;
    private Paquete paquete;
    private Paquete paquete2;


    @Before
    public void init(){
        //Notificacion
        this.sms = new SMS();
        Twilio.init(ACCOUNT_SID,AUTH_TOKEN);

        //Productos
        this.prodSimple1 = new Accesorio();
        this.prodSimple2 = new Accesorio();
        this.prodSimple3 = new Accesorio();
        this.paquete = new Paquete();
        this.paquete2 = new Paquete();


        prodSimple1.setPrecioUnitario(300);
        prodSimple2.setPrecioUnitario(200);
        prodSimple3.setPrecioUnitario(500);

        List<Producto> productos = new ArrayList<>();
        productos.add(prodSimple1);
        productos.add(prodSimple2);
        productos.add(prodSimple3);

        paquete.setComponentes(productos);
        paquete.setNombre("Pack Aros");

        List<Producto> productos2 = new ArrayList<>();
        productos2.add(prodSimple1);
        productos2.add(prodSimple3);

        paquete2.setComponentes(productos2);
        paquete2.setNombre("Pack pulseras");

        List<Producto> listaCarrito = new ArrayList<>();
        listaCarrito.add(paquete);
        listaCarrito.add(paquete2);

        //TarjetaDebito
        this.tarjetaDebito = new TarjetaDebito();

        tarjetaDebito.setSaldo(160d);
        tarjetaDebito.setEstado(new Verde());

        //Cliente
        this.cliente = new Cliente();

        cliente.setNombre("Tomas");
        cliente.setApellido("Gabutti");
        cliente.setTarjetaDeDebito(tarjetaDebito);
        cliente.setTelefono("+541141882877");
        cliente.setFormaDeNotificacion(sms);


        //Compra

        this.compraTest = new Compra();

        compraTest.setCliente(cliente);
        compraTest.setCodigoCompra("xdlol45");
        compraTest.setFechaCompra(new Date());
        compraTest.setProductos(listaCarrito);


    }

    @Test
    public void metodoCompra(){

        compraTest.compraGeneral();
    }

}
