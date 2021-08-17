import com.chiara.*;

import com.chiara.estados.Estado;
import com.chiara.estados.Rojo;
import com.chiara.estados.Verde;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EstadoTest {
    private TarjetaDebito tarjetaDebito;
    private Estado estadoCliente;



    @Before
    public void init(){
        //TarjetaDebito
        this.tarjetaDebito = new TarjetaDebito();

        tarjetaDebito.setSaldo(30d);
        tarjetaDebito.setEstado(new Rojo());

    }

    @Test
    public void metodoCompra(){
        System.out.println(tarjetaDebito.getEstado().toString());
        System.out.println(tarjetaDebito.getEstado().comprar(15940d,tarjetaDebito));
        System.out.println(tarjetaDebito.getSaldo());
        System.out.println(tarjetaDebito.getEstado().toString());
    }

}
