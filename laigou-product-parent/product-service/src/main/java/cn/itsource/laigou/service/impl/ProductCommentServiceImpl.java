package cn.itsource.laigou.service.impl;

import cn.itsource.laigou.domain.ProductComment;
import cn.itsource.laigou.mapper.ProductCommentMapper;
import cn.itsource.laigou.service.IProductCommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价 服务实现类
 * </p>
 *
 * @author solargen
 * @since 2019-10-17
 */
@Service
public class ProductCommentServiceImpl extends ServiceImpl<ProductCommentMapper, ProductComment> implements IProductCommentService {

}
