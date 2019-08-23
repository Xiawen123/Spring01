package com.bean;

import java.util.Date;

public class Toursinfo {
    private Integer id;


    private String introduce;

    private Date pubtime;

    private Double price;

    private Integer cityid;

    @Override
    public String toString() {
        return "Toursinfo{" +
                "id=" + id +
                ", introduce='" + introduce + '\'' +
                ", pubtime=" + pubtime +
                ", price=" + price +
                ", cityid=" + cityid +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public Date getPubtime() {
        return pubtime;
    }

    public void setPubtime(Date pubtime) {
        this.pubtime = pubtime;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }
}