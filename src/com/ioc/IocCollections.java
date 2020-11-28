package com.ioc;

import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * @author xiayj@jiedaibao.com
 * @date 2020/11/22 21:48
 */
public class IocCollections {
    private List<String> listColl;
    private Set<String> setColl;
    private String[] arrayColl;
    private Map<String,String> mapColl;

    public List<String> getListColl() {
        return listColl;
    }

    public void setListColl(List<String> listColl) {
        this.listColl = listColl;
    }

    public Set<String> getSetColl() {
        return setColl;
    }

    public void setSetColl(Set<String> setColl) {
        this.setColl = setColl;
    }

    public String[] getArrayColl() {
        return arrayColl;
    }

    public void setArrayColl(String[] arrayColl) {
        this.arrayColl = arrayColl;
    }

    public Map<String, String> getMapColl() {
        return mapColl;
    }

    public void setMapColl(Map<String, String> mapColl) {
        this.mapColl = mapColl;
    }

    public Properties getPropColl() {
        return propColl;
    }

    public void setPropColl(Properties propColl) {
        this.propColl = propColl;
    }

    private Properties propColl;

    public void show() {
        System.out.println("list"+listColl);
        System.out.println("set"+setColl);
        System.out.println("array"+ Arrays.asList(arrayColl));
        System.out.println("map"+mapColl);
        System.out.println("prop"+propColl);
    }
}
