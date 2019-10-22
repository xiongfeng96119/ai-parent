package cn.itsource.laigou.repository;

import cn.itsource.laigou.domain.ProductDoc;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductDocRepository extends ElasticsearchRepository<ProductDoc,Long> {
}
