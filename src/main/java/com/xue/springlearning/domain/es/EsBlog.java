package com.xue.springlearning.domain.es;

import java.io.Serializable;

public class EsBlog implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String title;
    private String summary;
    private  String content;
    protected EsBlog() {//Jpa要求
    }

    public EsBlog(String title, String summary, String content) {
        this.title = title;
        this.summary = summary;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
    }

    public String getContent() {
        return content;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
