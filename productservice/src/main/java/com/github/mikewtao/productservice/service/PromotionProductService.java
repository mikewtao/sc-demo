package com.github.mikewtao.productservice.service;

import com.github.mikewtao.feignclient.userservice.UserServiceClientInterface;
import com.github.mikewtao.pojo.productservice.Product;
import com.github.mikewtao.pojo.userservice.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PromotionProductService {

    @Autowired
    UserServiceClientInterface userServiceClientInterface;

    /**
     * 显示促销商品 显示非会员正常价格
     * @param name 用户
     * @return
     */
    public List<Product> listAllPromotionProduct(String name){
        List<User> userList=userServiceClientInterface.getUserByLevel(2);
        List<Product> productList=new ArrayList<>();
        if(userList.contains(name)){
           productList.add(new Product(13.31,"苹果","新疆"));
           productList.add(new Product(8,"橘子","江西"));
        }else{
            productList.add(new Product(16,"苹果","新疆"));
            productList.add(new Product(10,"橘子","江西"));
        }
        return productList;
    }
}
