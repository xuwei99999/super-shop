package com.edu.pojo;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "shop_order_detail")
public class OrderDetailPojo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int odid;   //订单详情id
    private String oid;
    private String gname;
    private double gprice;
    private String uaddress;
    private String odstore;
    private String opaytype;
    private String opaystatus;

    public int getOdid() {
        return odid;
    }

    public void setOdid(int odid) {
        this.odid = odid;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public double getGprice() {
        return gprice;
    }

    public void setGprice(double gprice) {
        this.gprice = gprice;
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress;
    }

    public String getOdstore() {
        return odstore;
    }

    public void setOdstore(String odstore) {
        this.odstore = odstore;
    }

    public String getOpaytype() {
        return opaytype;
    }

    public void setOpaytype(String opaytype) {
        this.opaytype = opaytype;
    }

    public String getOpaystatus() {
        return opaystatus;
    }

    public void setOpaystatus(String opaystatus) {
        this.opaystatus = opaystatus;
    }
}
