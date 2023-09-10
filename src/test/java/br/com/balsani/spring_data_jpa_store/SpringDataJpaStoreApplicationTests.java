package br.com.balsani.spring_data_jpa_store;

import br.com.balsani.spring_data_jpa_store.domain.entities.Product;
import br.com.balsani.spring_data_jpa_store.domain.services.ProductRepository;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
abstract class SpringDataJpaStoreApplicationTests {

    @Autowired
    ProductRepository productRepository;

    @BeforeAll
    void beforeAll() {
        productRepository.saveAll(generetedProduct());
    }

    private static List<Product> generetedProduct() {
        List<Product> products = new ArrayList<>();
        var p1 = Product.getProduct("Smart TV Philco", "PTV50G7ER2CPBL 50” Dolby Audio 4K Led ", new BigDecimal(1899));
        var p2 = Product.getProduct("ACER Notebook Gamer Nitro 5 ", "AN515-57-52LC, CI5 11400H, 8GB, 512GB SDD, (NVIDIA GTX 1650) Windows11. 15,6” LED FHD IPS Preto e vermelho ", new BigDecimal(4305));
        var p3 = Product.getProduct("Apple AirPods Pro ", "(2ª geração)", new BigDecimal(1896));
        var p4 = Product.getProduct("Lenovo 82MG0009BR - Notebook ideapad Gaming 3i", "i5-11300H, 8GB, 512GB SSD Dedicada GTX 1650 4GB 15.6\" FHD WVA W11, Preto ", new BigDecimal(3729));
        var p5 = Product.getProduct("Teclado Mecânico Gamer AOC ", "GK500", new BigDecimal(239));
        var p6 = Product.getProduct("Samsung Galaxy S21", "6.2\" 5G 128GB 12GB RAM", new BigDecimal(899));
        var p7 = Product.getProduct("Sony PlayStation 5", "Console de jogos 4K UHD 825GB SSD", new BigDecimal(4000));
        var p8 = Product.getProduct("Canon EOS Rebel T7i", "Câmera DSLR com lente 18-55mm", new BigDecimal(699));
        var p9 = Product.getProduct("Bose QuietComfort 35 II", "Fones de ouvido com cancelamento de ruído", new BigDecimal(299));
        var p10 = Product.getProduct("Dell XPS 13", "Notebook com tela InfinityEdge 13.4\"", new BigDecimal(1199));

        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        products.add(p6);
        products.add(p7);
        products.add(p8);
        products.add(p9);
        products.add(p10);

        return products;
    }

    @AfterAll
    void afterAll() {
        productRepository.deleteAll();
    }
}
