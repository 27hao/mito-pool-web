package cn.bclearn.mitopoolweb.dao.entity;

import java.util.List;

public class Data {
    private List<Blog> blogs;
    private Boolean hasrp;
    private Boolean has_next;
    private String pgsource;
    private Boolean nopth;

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }

    public Boolean getHasrp() {
        return hasrp;
    }

    public void setHasrp(Boolean hasrp) {
        this.hasrp = hasrp;
    }

    public Boolean getHas_next() {
        return has_next;
    }

    public void setHas_next(Boolean has_next) {
        this.has_next = has_next;
    }

    public String getPgsource() {
        return pgsource;
    }

    public void setPgsource(String pgsource) {
        this.pgsource = pgsource;
    }

    public Boolean getNopth() {
        return nopth;
    }

    public void setNopth(Boolean nopth) {
        this.nopth = nopth;
    }
}
