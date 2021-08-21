import com.chiara.*;
import com.chiara.db.ProductoDAO;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class InsertDB {
    private Producto producto;
    private Producto producto2;
    private ProductoDAO productoDao;
    private Cliente cliente;
    private Administrador admin;
    private Compra compra;
    private Accesorio accesorio;
    private Accesorio accesorio2;
    private Paquete paquete;


    @Before
    public void init(){
        this.accesorio = new Accesorio();
        accesorio.setId_accesorio(2500);
        accesorio.setPrecioUnitario(1200d);
        accesorio.setId_producto(3000);
        accesorio.setNombre("Cadenita Oro");
        accesorio.setDetalle("Oro");
        accesorio.setCantidad(1);

        this.accesorio2 = new Accesorio();
        accesorio2.setId_accesorio(2501);
        accesorio2.setPrecioUnitario(500d);
        accesorio2.setId_producto(3001);
        accesorio2.setNombre("Pulsera tela");
        accesorio2.setDetalle("tela colorida");
        accesorio2.setCantidad(1);

        List<Accesorio> accesorios = new ArrayList<>();
        accesorios.add(accesorio);
        accesorios.add(accesorio2);

        this.paquete = new Paquete();
        paquete.setId_paquete(1);
        paquete.setComponentes(accesorios);

        this.producto = new Accesorio();
        producto.setId_producto(1165);
        producto.setNombre("caterita");
        producto.setDetalle("negra");
        producto.setCantidad(1);


        this.producto2 = new Accesorio();
        producto2.setId_producto(1171);
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
        // paquete.del();

    }

}
