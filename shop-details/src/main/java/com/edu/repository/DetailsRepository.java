package com.edu.repository;

import com.edu.pojo.GoodsPojo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailsRepository extends JpaRepository<GoodsPojo,Integer> {

    public GoodsPojo findByGid(int gid);

}
