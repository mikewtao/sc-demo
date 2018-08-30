package com.github.mikewtao.productservice.controller;

import com.github.mikewtao.pojo.productservice.Product;
import com.github.mikewtao.productservice.service.PromotionProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PromotionProductController {

    @Autowired
    private PromotionProductService promotionProductService;

    /**
     * 根据当前浏览用户返回促销商品的不同价格
     * @param name 用户名
     * @return
     */
    @RequestMapping("/product/list_promotion_product")
    public List<Product> listAllPromotionProduct(String name){
        return promotionProductService.listAllPromotionProduct(name);
    }

}
