package com.redhat.ba;

import java.io.Serializable;
import java.math.BigDecimal;

public class Applicant implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String name;
    private String ssn;
    private Integer age;
    private BigDecimal income;
    private BigDecimal monthlyDebt;
    private String bank;
    private String state;

    public Applicant() {}

    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public BigDecimal getIncome() {
        return income;
    }
    public void setIncome(BigDecimal income) {
        this.income = income;
    }
    public BigDecimal getMonthlyDebt() {
        return monthlyDebt;
    }
    public void setMonthlyDebt(BigDecimal monthlyDebt) {
        this.monthlyDebt = monthlyDebt;
    }
    public String getBank() {
        return bank;
    }
    public void setBank(String bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "Applicant [age=" + age + ", bank=" + bank + ", income=" + income + ", monthlyDebt=" + monthlyDebt + ", name=" + name + ", ssn=" + ssn +  ", state=" + state + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((age == null) ? 0 : age.hashCode());
        result = prime * result + ((bank == null) ? 0 : bank.hashCode());
        result = prime * result + ((income == null) ? 0 : income.hashCode());
        result = prime * result + ((monthlyDebt == null) ? 0 : monthlyDebt.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((ssn == null) ? 0 : ssn.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Applicant other = (Applicant) obj;
        if (age == null) {
            if (other.age != null)
                return false;
        } else if (!age.equals(other.age))
            return false;
        if (bank == null) {
            if (other.bank != null)
                return false;
        } else if (!bank.equals(other.bank))
            return false;
        if (income == null) {
            if (other.income != null)
                return false;
        } else if (!income.equals(other.income))
            return false;
        if (monthlyDebt == null) {
            if (other.monthlyDebt != null)
                return false;
        } else if (!monthlyDebt.equals(other.monthlyDebt))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (ssn == null) {
            if (other.ssn != null)
                return false;
        } else if (!ssn.equals(other.ssn))
            return false;
        return true;
    }
    public Applicant(String name, String ssn, Integer age, BigDecimal income, BigDecimal monthlyDebt, String bank,
            String state) {
        this.name = name;
        this.ssn = ssn;
        this.age = age;
        this.income = income;
        this.monthlyDebt = monthlyDebt;
        this.bank = bank;
        this.state = state;
    }



    /**
     * @return the state
     */
    public String getState() {
        return state;
    }



    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

}
