package hu.dhajdukis.graphql.resolvers;

import java.util.List;
import java.util.stream.Collectors;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import hu.dhajdukis.graphql.enitity.Product;
import hu.dhajdukis.graphql.repository.ProductRepository;
import org.springframework.stereotype.Component;

@Component
public class ProductQuery implements GraphQLQueryResolver {
    private ProductRepository productRepository;

    public ProductQuery(final ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProductById(final Long id) {
        return productRepository
                .findById(id)
                .orElse(null);
    }

    public List<Product> getAllProducts(final int count) {
        return this.productRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }
}
