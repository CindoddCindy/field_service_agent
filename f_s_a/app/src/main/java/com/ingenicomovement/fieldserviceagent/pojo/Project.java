
package com.ingenicomovement.fieldserviceagent.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
//import org.apache.commons.lang.builder.ToStringBuilder;

public class Project {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Project() {
    }

    /**
     * 
     * @param name
     * @param id
     */
    public Project(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
/*
    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).toString();
    }

 */

}
