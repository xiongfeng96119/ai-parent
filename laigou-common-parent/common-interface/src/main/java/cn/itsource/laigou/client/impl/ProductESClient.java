package cn.itsource.laigou.client.impl;

import cn.itsource.laigou.domain.ProductDoc;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("LAIGOU-COMMON")
public interface ProductESClient {
    /**
     * 批量保存
     * @param productDocList
     */
    @PostMapping("es/saveBatch")
    void saveBatch(@RequestBody List<ProductDoc> productDocList);

    /**
     * 批量删除
     * @param ids
     */
    @PostMapping("es/deleteBatch")
    void deleteBatch(@RequestBody List<Long> ids);
}
