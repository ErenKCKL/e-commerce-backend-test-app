package ashina.ecommerce.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ashina.ecommerce.business.abstracts.ProductService;
import ashina.ecommerce.dataAccess.abstracts.ProductDao;
import ashina.ecommerce.entities.concretes.Product;

@Service
public class ProductManager implements ProductService{

    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao){
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
      return productDao.findAll();
    }

    
}
