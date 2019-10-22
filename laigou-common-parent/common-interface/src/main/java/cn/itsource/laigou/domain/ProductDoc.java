package cn.itsource.laigou.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import sun.util.calendar.LocalGregorianCalendar;

@Document(indexName = "laigou")
@Data
public class ProductDoc {
    @Id
    private Long id;
    //关键字：分词+索引
    @Field(type = FieldType.Text,analyzer = "ik_max_word")
    private String all;

    private Long productTypeId;
    private Long brandId;
    //最高价
    private Integer maxPrice;
    //最低价
    private Integer minPrice;
    //销售量
    private Integer saleCount;
    //上架时间
    private Long onSaleTime;
    //评论数
    private Integer commentCount;
    //浏览量
    private Integer viewCount;
    //商品名称
    @Field(store = true)
    private String name;
    //商品副标题
    @Field(store = true)
    private String subName;
    //商品媒体属性
    @Field(store = true)
    private String medias;
    //商品显示属性
    @Field(store = true)
    private String viewProperties;
    //商品sku属性
    @Field(store = true)
    private String skuProperties;
}
