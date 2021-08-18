package onde.digitalinnovation.experts.catalog.repository;

import onde.digitalinnovation.experts.productcatalog.model.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public class ProductRepository extends ElasticsearchRepository<Product, Integer> {
}
