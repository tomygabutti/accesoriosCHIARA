import com.chiara.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class InsertDB2 {
    private Producto producto;
    private Accesorio accesorio;
    private Accesorio accesorio2;
    private Paquete paquete;
    private Paquete paquete2;


    @Before
    public void init(){
        this.accesorio = new Accesorio();
        accesorio.setId_accesorio(12343);
        accesorio.setPrecioUnitario(1200d);
        accesorio.setNombre("Cadenita Oro");
        accesorio.setDetalle("Oro");
        accesorio.setId_paquete(10);

        this.accesorio2 = new Accesorio();
        accesorio2.setId_accesorio(1232);
        accesorio2.setPrecioUnitario(500d);
        accesorio2.setNombre("Pulsera tela");
        accesorio2.setDetalle("tela colorida");
        accesorio.setId_paquete(10);
    }

    @Test
    public void insertarBD(){
        accesorio2.insert();
        // accesorio.insert();

    }

}