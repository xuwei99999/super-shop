package com.edu.repository;

import com.edu.pojo.GoodsPojo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoodsRepository extends JpaRepository<GoodsPojo,Integer> {

    public List<GoodsPojo> findAll();

}
