package org.launchcode.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

/**
 * Created by Patrick on 4/20/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class List {
    private String q;
    private Integer sr;
    private String ds;
    private Integer start;
    private Integer end;
    private Integer total;
    private String group;
    private Character sort;
    private ArrayList<Item> item;

    public List(){}
    
    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public Integer getSr() {
        return sr;
    }

    public void setSr(Integer sr) {
        this.sr = sr;
    }

    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Character getSort() {
        return sort;
    }

    public void setSort(Character sort) {
        this.sort = sort;
    }

    public ArrayList<Item> getItem() {
        return item;
    }

    public void setItem(ArrayList<Item> item) {
        this.item = item;
    }
}
