package com.edu.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.edu.pojo.GoodsPojo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.DetailsService;

@Controller
public class DetailsController {

    @Reference
    DetailsService detailsService;

    @RequestMapping("ToDetails")
    public String ToDetails(Model model){
        GoodsPojo goodsPojo=detailsService.findByGid(2);
        model.addAttribute("goods",goodsPojo);
        System.out.println(goodsPojo);
        return "proinfo";
    }


}
