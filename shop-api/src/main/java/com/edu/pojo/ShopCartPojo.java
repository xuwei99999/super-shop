package com.edu.pojo;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "shop_cart")
public class ShopCartPojo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cid;
    private int gid;
    private String gimage;
    private String gname;
    private double gprice;
    private int cum;
    private double ctotal;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGimage() {
        return gimage;
    }

    public void setGimage(String gimage) {
        this.gimage = gimage;
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

    public int getCum() {
        return cum;
    }

    public void setCum(int cum) {
        this.cum = cum;
    }

    public double getCtotal() {
        return ctotal;
    }

    public void setCtotal(double ctotal) {
        this.ctotal = ctotal;
    }
}
