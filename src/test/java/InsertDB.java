import com.chiara.*;

import com.chiara.db.ProductoDAO;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InsertDB {
    private Producto producto;
    private Producto producto2;
    private ProductoDAO productoDao;
    private Cliente cliente;
    private Administrador admin;
    private Compra compra;
   // private Stock stock;


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

        List<Producto> productos = new ArrayList<>();
        productos.add(producto);
        productos.add(producto2);

        this.cliente = new Cliente();

        cliente.setId_cliente(2);
        cliente.setNombreUsuario("tomikeane");
        cliente.setContrasenia("124365");
        cliente.setNombre("Tomas");
        cliente.setApellido("Gabutti");
        cliente.setTelefono("113243535");

        this.admin = new Administrador();
        admin.setId_administrador(1);
        admin.setNombreUsuario("tomas.gabutti");
        admin.setContrasenia("Temporal.2021");

        this.compra = new Compra();
        compra.setCodigoCompra(2);
        compra.setProductos(productos);
        compra.setCliente(cliente);
        compra.setFechaCompra("20/08/2021");


    }

    @Test
    public void insertarBD(){
        compra.delete();

    }

}
