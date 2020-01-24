package com.edu.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.edu.pojo.GoodsPojo;
import com.edu.pojo.ShopCartPojo;
import com.edu.pojo.UserPojo;
import com.edu.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.edu.service.IGoodsService;
import com.edu.service.IShopCarService;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ShopCarController {

    @Reference(check = false)
    IShopCarService shopCarService;

    @Reference(check = false)
    IGoodsService iGoodsService;

    @Reference
    IUserService userService;

    //点击商品收藏时,把商品加入到购物车
    @RequestMapping("addShopCar")
    @ResponseBody
    public String addShopCar(Integer gid, HttpSession session){

        //获得当前用户的账户名
        String uaccount=(String) session.getAttribute("uaccount");


        GoodsPojo goodsPojo=iGoodsService.findGoodsPojoByGid(gid);

        //创建存储到购物车商品的内容
        ShopCartPojo shopCartPojo=new ShopCartPojo(uaccount,goodsPojo.getGid(),goodsPojo.getGimage(),goodsPojo.getGname(),goodsPojo.getGprice(),1,goodsPojo.getGprice()*1);

        shopCarService.addShopCar(shopCartPojo);

        return "ok";
    }

    //跳转到购物车界面
    @RequestMapping("ToShopCar")
    public String ToShopCar(HttpSession session, Model model){
        String uaccount=(String) session.getAttribute("uaccount");
        //uaccount="aa";
        List<ShopCartPojo> shopCarList=shopCarService.queryAllByUaccount(uaccount);
        model.addAttribute("list",shopCarList);
        return "order";
    }

    //购物车页面中的,用户商品数量加一
    @RequestMapping("addOne")
    @ResponseBody
    public String addOne(int cid,HttpSession session,Model model){
        String uaccount=(String) session.getAttribute("uaccount");
       // uaccount="aa";

        shopCarService.addOne(cid);
        List<ShopCartPojo> shopCarList= shopCarService.queryAllByUaccount(uaccount);
        model.addAttribute("list",shopCarList);

        return "ok";
    }

    //购物车中,某个商品数量减一
    @RequestMapping("reduceOne")
    @ResponseBody
    public String reduceOne(int cid,HttpSession session,Model model){
        String uaccount=(String) session.getAttribute("uaccount");
       // uaccount="aa";

        shopCarService.reduceOne(cid);

        List<ShopCartPojo> shopCarList= shopCarService.queryAllByUaccount(uaccount);
        model.addAttribute("list",shopCarList);

        return "ok";

    }

    //购物车中,删除某个商品
    @RequestMapping("deleteOne")
    @ResponseBody
    public String deleteOne(int cid,HttpSession session,Model model){
        String uaccount=(String) session.getAttribute("uaccount");
        //uaccount="aa";

        shopCarService.deleteShopCartPojoByCid(cid);

        List<ShopCartPojo> shopCarList= shopCarService.queryAllByUaccount(uaccount);
        model.addAttribute("list",shopCarList);

        return "ok";
    }


    @RequestMapping("deleteAll")
    @ResponseBody
    public String deleteAll(HttpSession session,Model model){
        String uaccount=(String) session.getAttribute("uaccount");
        //uaccount="aa";

        shopCarService.deleteAllByUaccount(uaccount);

        List<ShopCartPojo> shopCarList= shopCarService.queryAllByUaccount(uaccount);
        model.addAttribute("list",shopCarList);

        return "ok";
    }

    @RequestMapping("ToSureBuy")
    public String ToSureBuy(String checked,HttpSession session,Model model){
        String uaccount=(String) session.getAttribute("uaccount");
        String[] strings=checked.split(",");



        List<ShopCartPojo> list=shopCarService.findAllByUaccountAndGid(uaccount,strings);

        model.addAttribute("listChecked",list);

        return "order2";
    }







}
