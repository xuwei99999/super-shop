package com.edu.service.impl;

import com.edu.pojo.GoodsTypePojo;
import com.edu.repository.GoodsTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.edu.service.IGoodsTypeService;

import java.util.LinkedList;
import java.util.List;
@Service
@com.alibaba.dubbo.config.annotation.Service
public class GoodsTypeServiceImpl implements IGoodsTypeService {
    @Autowired
    GoodsTypeRepository goodsTypeRepository;

    /**
     * 查询一级类别
     * @param pid
     * @return
     */
    @Override
    public List<GoodsTypePojo> queryGoodsTypeOne(int pid) {
        return goodsTypeRepository.findAllByPid(pid);
    }

    /**
     * 查询所有类别
     *
     * @return
     */
    @Override
    public List<GoodsTypePojo> queryGoodsTypeAll() {
        return goodsTypeRepository.findAll();
    }

    /**
     * 查询二级类别
     * @param pid
     * @return
     */
    @Override
    public List<GoodsTypePojo> queryGoodsTypeTwo(int pid) {
        List<GoodsTypePojo> list = new LinkedList<>();
        List<GoodsTypePojo> listType = goodsTypeRepository.findAllByPid(pid);
        //查询五个类别
        for (int i=0;i<listType.size();i++){
            if (i<5) {
                list.add(listType.get(i));
            }
        }
        return list;
    }
}
