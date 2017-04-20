package org.launchcode.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Patrick on 4/20/2017.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {
    private Integer offset;
    private String group;
    private String name;
    private Long ndbno;
    private String ds;

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNdbno() {
        return ndbno;
    }

    public void setNdbno(Long ndbno) {
        this.ndbno = ndbno;
    }

    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }
}
