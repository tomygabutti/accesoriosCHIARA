import com.chiara.*;
import com.chiara.catalogo.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class MenosEstrellaTest {
    private Administrador admin;
    private Catalogo cata;
    private ProductoCatalogo prod1;
    private ProductoCatalogo prod2;
    private ProductoCatalogo prod3;
    private ProductoCatalogo prod4;
    private ProductoCatalogo prod5;
    private Review re1;
    private Review re2;
    private Review re3;

    @Before
    public void init(){
        this.admin = new Administrador();
        this.prod1 = new ProductoCatalogo();
        this.prod2 = new ProductoCatalogo();
        this.prod3 = new ProductoCatalogo();
        this.prod4 = new ProductoCatalogo();
        this.prod5 = new ProductoCatalogo();
        this.cata = Catalogo.getInstance();
        this.re1 = new Review();
        this.re2 = new Review();
        this.re3 = new Review();

        re1.setCalificacion(1);
        re2.setCalificacion(5);
        re3.setCalificacion(2);

        List<Review> positivas = new ArrayList<>();
        List<Review> unaMala = new ArrayList<>();
        List<Review> malas = new ArrayList<>();

        positivas.add(re2);
        positivas.add(re3);

        unaMala.add(re2);
        unaMala.add(re1);

        malas.add(re1);
        malas.add(re1);

        prod1.setReviews(positivas);
        //prod1.setReviews(unaMala);

        prod2.setReviews(unaMala);
        prod2.setReviews(malas);

        prod3.setReviews(positivas);

        prod4.setReviews(positivas);

        prod5.setReviews(positivas);

        admin.setCatalogo(cata);
        cata.addProducto(prod1);
        cata.addProducto(prod2);
        cata.addProducto(prod3);
        cata.addProducto(prod4);
        cata.addProducto(prod5);

    }

    @Test
    public void metodoCompra(){
        System.out.println(admin.productosAlMenosUnaEstrella());
    }

}
