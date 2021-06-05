package com.woniu.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * emp
 * @author 
 */
public class Emp implements Serializable {
    private Integer empid;

    private String empname;

    private String empsex;

    private Integer empage;

    private String empphone;

    private String empaddress;

    private Date empdate;

    private Integer deptid;

    private static final long serialVersionUID = 1L;

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpsex() {
        return empsex;
    }

    public void setEmpsex(String empsex) {
        this.empsex = empsex;
    }

    public Integer getEmpage() {
        return empage;
    }

    public void setEmpage(Integer empage) {
        this.empage = empage;
    }

    public String getEmpphone() {
        return empphone;
    }

    public void setEmpphone(String empphone) {
        this.empphone = empphone;
    }

    public String getEmpaddress() {
        return empaddress;
    }

    public void setEmpaddress(String empaddress) {
        this.empaddress = empaddress;
    }

    public Date getEmpdate() {
        return empdate;
    }

    public void setEmpdate(Date empdate) {
        this.empdate = empdate;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Emp other = (Emp) that;
        return (this.getEmpid() == null ? other.getEmpid() == null : this.getEmpid().equals(other.getEmpid()))
            && (this.getEmpname() == null ? other.getEmpname() == null : this.getEmpname().equals(other.getEmpname()))
            && (this.getEmpsex() == null ? other.getEmpsex() == null : this.getEmpsex().equals(other.getEmpsex()))
            && (this.getEmpage() == null ? other.getEmpage() == null : this.getEmpage().equals(other.getEmpage()))
            && (this.getEmpphone() == null ? other.getEmpphone() == null : this.getEmpphone().equals(other.getEmpphone()))
            && (this.getEmpaddress() == null ? other.getEmpaddress() == null : this.getEmpaddress().equals(other.getEmpaddress()))
            && (this.getEmpdate() == null ? other.getEmpdate() == null : this.getEmpdate().equals(other.getEmpdate()))
            && (this.getDeptid() == null ? other.getDeptid() == null : this.getDeptid().equals(other.getDeptid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEmpid() == null) ? 0 : getEmpid().hashCode());
        result = prime * result + ((getEmpname() == null) ? 0 : getEmpname().hashCode());
        result = prime * result + ((getEmpsex() == null) ? 0 : getEmpsex().hashCode());
        result = prime * result + ((getEmpage() == null) ? 0 : getEmpage().hashCode());
        result = prime * result + ((getEmpphone() == null) ? 0 : getEmpphone().hashCode());
        result = prime * result + ((getEmpaddress() == null) ? 0 : getEmpaddress().hashCode());
        result = prime * result + ((getEmpdate() == null) ? 0 : getEmpdate().hashCode());
        result = prime * result + ((getDeptid() == null) ? 0 : getDeptid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", empid=").append(empid);
        sb.append(", empname=").append(empname);
        sb.append(", empsex=").append(empsex);
        sb.append(", empage=").append(empage);
        sb.append(", empphone=").append(empphone);
        sb.append(", empaddress=").append(empaddress);
        sb.append(", empdate=").append(empdate);
        sb.append(", deptid=").append(deptid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}