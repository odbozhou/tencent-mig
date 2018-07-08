package com.tencent.mig.model;

/**
 * @author jiajia
 */
public class JobDetail {
    private String id;

    private String requirment;

    private String responsibility;

    public JobDetail(String id, String requirment, String responsibility) {
        this.id = id;
        this.requirment = requirment;
        this.responsibility = responsibility;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRequirment() {
        return requirment;
    }

    public void setRequirment(String requirment) {
        this.requirment = requirment == null ? null : requirment.trim();
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility == null ? null : responsibility.trim();
    }
}