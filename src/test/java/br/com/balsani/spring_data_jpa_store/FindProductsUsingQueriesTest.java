package br.com.balsani.spring_data_jpa_store;

import br.com.balsani.spring_data_jpa_store.domain.entities.Product;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindProductsUsingQueriesTest extends SpringDataJpaStoreApplicationTests{


    @Test
    void testFindAll() {
        List<Product> products = productRepository.findAll();
        assertEquals(10, products.size());
    }
}
