package cn.itsource.laigou.service;

import cn.itsource.laigou.domain.Product;
import cn.itsource.laigou.query.ProductQuery;
import cn.itsource.laigou.util.PageList;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 商品 服务类
 * </p>
 *
 * @author solargen
 * @since 2019-10-17
 */
public interface IProductService extends IService<Product> {

    PageList<Product> queryPage(ProductQuery query);
}
