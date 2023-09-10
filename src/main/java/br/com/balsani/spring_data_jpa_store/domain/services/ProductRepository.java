package br.com.balsani.spring_data_jpa_store.domain.services;

import br.com.balsani.spring_data_jpa_store.domain.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
