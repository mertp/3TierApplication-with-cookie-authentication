package com.example.distrubuted_project.Models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Salgrade {
    @Basic
    @Id
    @Column(name = "GRADE", nullable = true)
    private Integer grade;
    @Basic
    @Column(name = "LOSAL", nullable = true)
    private Integer losal;
    @Basic
    @Column(name = "HISAL", nullable = true)
    private Integer hisal;

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getLosal() {
        return losal;
    }

    public void setLosal(Integer losal) {
        this.losal = losal;
    }

    public Integer getHisal() {
        return hisal;
    }

    public void setHisal(Integer hisal) {
        this.hisal = hisal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salgrade salgrade = (Salgrade) o;
        return Objects.equals(grade, salgrade.grade) && Objects.equals(losal, salgrade.losal) && Objects.equals(hisal, salgrade.hisal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grade, losal, hisal);
    }
}
