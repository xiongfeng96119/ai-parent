package cn.itsource.laigou.service.impl;

import cn.itsource.laigou.domain.Product;
import cn.itsource.laigou.domain.ProductExt;
import cn.itsource.laigou.mapper.ProductExtMapper;
import cn.itsource.laigou.mapper.ProductMapper;
import cn.itsource.laigou.query.ProductQuery;
import cn.itsource.laigou.service.IProductService;
import cn.itsource.laigou.util.PageList;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 商品 服务实现类
 * </p>
 *
 * @author solargen
 * @since 2019-10-17
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

    @Autowired
    private ProductExtMapper productExtMapper;

    @Override
    @Transactional
    public boolean save(Product product) {
        //创建时间
        product.setCreateTime(System.currentTimeMillis());
        //t_product
        baseMapper.insert(product);//mybatis-plus自动返回生成的主键，主键生成到了product对象中
        //t_product_ext
        ProductExt ext = product.getExt();
        ext.setProductId(product.getId());
        productExtMapper.insert(ext);
        return true;
    }

    @Override
    public PageList<Product> queryPage(ProductQuery query) {
        IPage iPage = baseMapper.queryPage(new Page(query.getPage(), query.getRows()), query);
        return new PageList<>(iPage.getTotal(),iPage.getRecords());
    }
}
