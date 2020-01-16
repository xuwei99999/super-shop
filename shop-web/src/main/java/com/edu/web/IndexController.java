package com.edu.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.edu.pojo.GoodsPojo;
import com.edu.pojo.GoodsTypePojo;
import com.edu.pojo.UserPojo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.IGoodsService;
import service.IGoodsTypeService;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class IndexController {
    @Reference(check = false)
    IGoodsTypeService goodsTypeService;
    @Reference(check = false)
    IGoodsService goodsService;
    @RequestMapping("toindex")
    public String toIndex(UserPojo userPojo, Model model, HttpSession session){
        session.setAttribute("uaccount",userPojo.getUaccount());  //用户名
        //一级类别
        List<GoodsTypePojo> goodsTypePojos = goodsTypeService.queryGoodsTypeOne(0);

        session.setAttribute("goodsTypePojos",goodsTypePojos);

        //所有类别
        List<GoodsTypePojo> gtlist = goodsTypeService.queryGoodsTypeAll();
        session.setAttribute("gtlist",gtlist);
        
        
        //促销产品查询
//        List<GoodsPojo> promotions = goodsService.findAllByGclass(0);
//        model.addAttribute("promotions",promotions);
        return "index";
    }
    //推荐商品和促销产品查询展示
    @RequestMapping("queryPromotions")
    @ResponseBody
    public List<GoodsPojo> queryPromotions(int gclass,Model model){
        List<GoodsPojo> goodsByGclass = goodsService.findAllByGclass(gclass);
        model.addAttribute("goodsByGclass",goodsByGclass);
        return goodsByGclass;
    }


}
