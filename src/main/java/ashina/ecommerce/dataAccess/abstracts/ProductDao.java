package ashina.ecommerce.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ashina.ecommerce.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{
    
    
}
