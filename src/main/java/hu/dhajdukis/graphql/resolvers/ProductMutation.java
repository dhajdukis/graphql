package hu.dhajdukis.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import hu.dhajdukis.graphql.enitity.Product;
import hu.dhajdukis.graphql.repository.ProductRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ProductMutation implements GraphQLMutationResolver {

    private final ProductRepository productRepository;

    public ProductMutation(final ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    public Product createProduct(
            final String name,
            final Integer price,
            final boolean isAvailable
    ) {
        final Product Product = new Product();
        Product.setName(name);
        Product.setPrice(price);
        Product.setAvailable(isAvailable);
        return productRepository.save(Product);
    }
}


