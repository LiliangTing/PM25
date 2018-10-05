package com.liliangliang.core.entry;

import java.util.Date;

public class CityAir {
  private long id;
  private Date time;
  private String cityname;
  private String aqi;
  private String pm25;
  private String pm10;
  private String co;
  private String so2;
  private String no2;
  private String o3;
  private String primary;
  private Date createTime;

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public String getCityname() {
    return cityname;
  }

  public void setCityname(String cityname) {
    this.cityname = cityname;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public Date getTime() {
    return time;
  }

  public void setTime(Date time) {
    this.time = time;
  }

  public String getAqi() {
    return aqi;
  }

  public void setAqi(String aqi) {
    this.aqi = aqi;
  }

  public String getPm25() {
    return pm25;
  }

  public void setPm25(String pm25) {
    this.pm25 = pm25;
  }

  public String getPm10() {
    return pm10;
  }

  public void setPm10(String pm10) {
    this.pm10 = pm10;
  }

  public String getCo() {
    return co;
  }

  public void setCo(String co) {
    this.co = co;
  }

  public String getSo2() {
    return so2;
  }

  public void setSo2(String so2) {
    this.so2 = so2;
  }

  public String getNo2() {
    return no2;
  }

  public void setNo2(String no2) {
    this.no2 = no2;
  }

  public String getO3() {
    return o3;
  }

  public void setO3(String o3) {
    this.o3 = o3;
  }

  public String getPrimary() {
    return primary;
  }

  public void setPrimary(String primary) {
    this.primary = primary;
  }

  @Override
  public String toString() {
    return "CityAir{" +
            "id=" + id +
            ", time=" + time +
            ", aqi='" + aqi + '\'' +
            ", pm25='" + pm25 + '\'' +
            ", pm10='" + pm10 + '\'' +
            ", co='" + co + '\'' +
            ", so2='" + so2 + '\'' +
            ", no2='" + no2 + '\'' +
            ", o3='" + o3 + '\'' +
            ", primary='" + primary + '\'' +
            ", createTime=" + createTime +
            '}';
  }
}
