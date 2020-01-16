package com.edu.service;

import com.edu.pojo.GoodsPojo;
import com.edu.repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.IGoodsService;

import java.util.List;
@Service
@com.alibaba.dubbo.config.annotation.Service
public class GoodsServiceImpl implements IGoodsService {
    @Autowired
    GoodsRepository goodsRepository;

    @Override
    public List<GoodsPojo> queryGoodsAll() {
        return goodsRepository.findAll();
    }

    @Override
    public GoodsPojo findGoodsPojoByGid(int gid) {
        return goodsRepository.findGoodsPojoByGid(gid);
    }
}
