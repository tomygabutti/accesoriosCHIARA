import com.chiara.*;

import com.chiara.db.ProductoDAO;
import org.junit.Before;
import org.junit.Test;

public class InsertarProductoDB {
    private Producto producto;
    private ProductoDAO productoDao;




    @Before
    public void init(){
        this.producto = new Accesorio();
        producto.setCodigo(1170);
        producto.setNombre("Tobillera");
        producto.setDetalle("Tobillera Tela");
        producto.setCantidad(1);




    }

    @Test
    public void insertarBD(){
       producto.insert();
    }

}
