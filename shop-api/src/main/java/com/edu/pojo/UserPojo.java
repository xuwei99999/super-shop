package com.edu.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "shop_user")
public class UserPojo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;
    private String uaccount;
    private String upass;
    private int upost;
    private String uname;
    private int uphone;
    private int ucard;
    private String uaddress;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUaccount() {
        return uaccount;
    }

    public void setUaccount(String uaccount) {
        this.uaccount = uaccount;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public int getUpost() {
        return upost;
    }

    public void setUpost(int upost) {
        this.upost = upost;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getUphone() {
        return uphone;
    }

    public void setUphone(int uphone) {
        this.uphone = uphone;
    }

    public int getUcard() {
        return ucard;
    }

    public void setUcard(int ucard) {
        this.ucard = ucard;
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress;
    }

    @Override
    public String toString() {
        return "UserPojo{" +
                "uid=" + uid +
                ", uaccount='" + uaccount + '\'' +
                ", upass='" + upass + '\'' +
                ", upost=" + upost +
                ", uname='" + uname + '\'' +
                ", uphone=" + uphone +
                ", ucard=" + ucard +
                ", uaddress='" + uaddress + '\'' +
                '}';
    }
}
