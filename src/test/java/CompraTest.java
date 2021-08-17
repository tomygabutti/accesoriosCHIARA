import com.chiara.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CompraTest {
    private Compra compra;
    private Accesorio prodSimple1;
    private Accesorio prodSimple2;
    private Accesorio prodSimple3;
    private Paquete paquete;
    private Paquete paquete2;
    private List<Producto> productosTest;

    @Before
    public void init(){
        this.compra = new Compra();
        this.prodSimple1 = new Accesorio();
        this.prodSimple2 = new Accesorio();
        this.prodSimple3 = new Accesorio();
        this.paquete = new Paquete();
        this.paquete2 = new Paquete();
        this.productosTest = new ArrayList<>();

        prodSimple1.setPrecioUnitario(40);
        prodSimple2.setPrecioUnitario(30);
        prodSimple3.setPrecioUnitario(100);

        List<Producto> productos = new ArrayList<>();
        productos.add(prodSimple1);
        productos.add(prodSimple2);
        productos.add(prodSimple3);

        paquete.setComponentes(productos);

        List<Producto> productos2 = new ArrayList<>();
        productos2.add(prodSimple1);
        productos2.add(prodSimple3);

        paquete2.setComponentes(productos2);

        List<Producto> listaCarrito = new ArrayList<>();
        listaCarrito.add(paquete);
        listaCarrito.add(paquete2);

        compra.setProductos(listaCarrito);

        productosTest.add(prodSimple1);
        productosTest.add(prodSimple2);
        productosTest.add(prodSimple3);

    }

    @Test
    public void obtenerPrecioProducto(){
      System.out.println(this.paquete.calcularPrecio());
      System.out.println(this.paquete2.calcularPrecio());
      System.out.println(this.compra.totalCompra());
      String productosToString = this.productosTest.stream().map(Object::toString).collect(Collectors.joining(", "));
      String productosToString2 = this.productosTest.stream().map(producto -> producto.getNombre()+" "+producto.calcularPrecio()).collect(Collectors.joining(", "));
      System.out.println(productosToString2);
    }

}
