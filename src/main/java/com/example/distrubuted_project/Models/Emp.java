package com.example.distrubuted_project.Models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="emp")
public class Emp {
    @Basic
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "EMPNO", nullable = false)
    private int empno;
    @Basic
    @Column(name = "ENAME", length = 10)
    private String ename;
    @Basic
    @Column(name = "JOB", length = 9)
    private String job;
    @Basic
    @Column(name = "MGR")
    private Integer mgr;
    @Basic
    @Column(name = "HIREDATE")
    private String hiredate;
    @Basic
    @Column(name = "SAL")
    private Integer sal;
    @Basic
    @Column(name = "COMM")
    private Integer comm;
    @Basic
    @Column(name = "DEPTNO")
    private Integer deptno;

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", mgr=" + mgr +
                ", hiredate='" + hiredate + '\'' +
                ", sal=" + sal +
                ", comm=" + comm +
                ", deptno=" + deptno +
                '}';
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    public Integer getComm() {
        return comm;
    }

    public void setComm(Integer comm) {
        this.comm = comm;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return empno == emp.empno && Objects.equals(ename, emp.ename) && Objects.equals(job, emp.job) && Objects.equals(mgr, emp.mgr) && Objects.equals(hiredate, emp.hiredate) && Objects.equals(sal, emp.sal) && Objects.equals(comm, emp.comm) && Objects.equals(deptno, emp.deptno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empno, ename, job, mgr, hiredate, sal, comm, deptno);
    }
}
