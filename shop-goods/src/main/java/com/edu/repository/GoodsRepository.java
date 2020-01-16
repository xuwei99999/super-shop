package com.edu.repository;

import com.edu.pojo.GoodsPojo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GoodsRepository extends JpaRepository<GoodsPojo,Integer> {

    public List<GoodsPojo> findAllByGclass(int gclass);

    public List<GoodsPojo> findAll();

<<<<<<< HEAD
    //根据gid查询
    public GoodsPojo findGoodsPojoByGid(int gid);

=======
>>>>>>> af353e616d2702817808a99a30263fc7c30d021c


}
