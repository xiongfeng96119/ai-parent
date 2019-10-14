package cn.itsource.laigou.service.impl;

import cn.itsource.laigou.domain.Product;
import cn.itsource.laigou.mapper.ProductMapper;
import cn.itsource.laigou.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品 服务实现类
 * </p>
 *
 * @author solargen
 * @since 2019-10-14
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
