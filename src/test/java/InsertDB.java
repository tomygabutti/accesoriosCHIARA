import com.chiara.*;

import com.chiara.db.ProductoDAO;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class InsertDB {
    private Producto producto;
    private Producto producto2;
    private ProductoDAO productoDao;
    private Stock stock;
    private Usuario user;




    @Before
    public void init(){
        this.producto = new Accesorio();
        producto.setCodigo(1165);
        producto.setNombre("caterita");
        producto.setDetalle("negra");
        producto.setCantidad(1);

        this.producto2 = new Accesorio();
        producto2.setCodigo(1171);
        producto.setNombre("colita pelo");
        producto.setDetalle("roja");
        producto.setCantidad(1);

        this.stock = Stock.getInstance();

        stock.addProducto(producto);
        stock.addProducto(producto2);

        this.user = new Cliente();
        user.setNombreUsuario("Androicle");
        user.setNombre("Tomas");
        user.setApellido("Gabutti");
        user.setContrasenia("321341");
        user.setFechaDeNacimiento("18/05/1997");
        user.setTipoDocumento("dni");
        user.setNroDocumento("1222312");





    }

    @Test
    public void insertarBD(){
       user.insert();

    }

 /*   public void eliminarBD(){
        producto2.delete();
    }
*/
}
