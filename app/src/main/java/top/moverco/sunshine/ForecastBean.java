package top.moverco.sunshine;

import java.util.Date;

/**
 * Created by liuzongxiang on 2016/12/20.
 */

public class ForecastBean {
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public int getHi_tem() {
        return hi_tem;
    }

    public void setHi_tem(int hi_tem) {
        this.hi_tem = hi_tem;
    }

    public int getLo_tem() {
        return lo_tem;
    }

    public void setLo_tem(int lo_tem) {
        this.lo_tem = lo_tem;
    }

    public int getSrc() {
        return src;
    }

    public void setSrc(int src) {
        this.src = src;
    }

    private Date date = new Date();
    private String weather ;
    private int hi_tem,lo_tem;
    private int src;

}
