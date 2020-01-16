package service;

import com.edu.pojo.GoodsPojo;

import java.util.List;

public interface IGoodsService {
<<<<<<< HEAD
    public List<GoodsPojo> queryGoodsAll();

    //根据gid查询
    public GoodsPojo findGoodsPojoByGid(int gid);
=======
    public List<GoodsPojo> findAllByGclass(int gclass);
>>>>>>> af353e616d2702817808a99a30263fc7c30d021c
}
