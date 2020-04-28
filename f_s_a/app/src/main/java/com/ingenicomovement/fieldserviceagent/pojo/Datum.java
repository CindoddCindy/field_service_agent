
package com.ingenicomovement.fieldserviceagent.pojo;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
//import org.apache.commons.lang.builder.ToStringBuilder;

public class Datum {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("fullname")
    @Expose
    private String fullname;
    @SerializedName("project")
    @Expose
    private List<Project> project = new ArrayList<Project>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Datum() {
    }

    /**
     * 
     * @param project
     * @param id
     * @param fullname
     * @param username
     */
    public Datum(String id, String username, String fullname, List<Project> project) {
        super();
        this.id = id;
        this.username = username;
        this.fullname = fullname;
        this.project = project;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public List<Project> getProject() {
        return project;
    }

    public void setProject(List<Project> project) {
        this.project = project;
    }


   /*
    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("username", username).append("fullname", fullname).append("project", project).toString();
    }

    */

}
