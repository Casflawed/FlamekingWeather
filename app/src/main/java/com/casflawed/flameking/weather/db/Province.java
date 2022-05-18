package com.casflawed.flameking.weather.db;

import org.litepal.crud.LitePalSupport;

public class Province extends LitePalSupport {
    private Integer id;
    private Integer provinceCode;
    private String provinceName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(Integer provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    @Override
    public String toString() {
        return "Province{" +
                "id=" + id +
                ", provinceCode=" + provinceCode +
                ", provinceName='" + provinceName + '\'' +
                '}';
    }
}
