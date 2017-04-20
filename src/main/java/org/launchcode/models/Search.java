package org.launchcode.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Patrick on 4/20/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Search {
    private List list;

    public Search(){}

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}
