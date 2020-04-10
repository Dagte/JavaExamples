package com.sda.oop.product;

public class Category {
    private String departmentName;
//    private Product product;

    public Category(String department) {
        this.departmentName = department;
//        this.product = product;
    }


    public String getDepartment() {
        return this.departmentName;
    }

    public void setDepartment(final String department) {
        this.departmentName = department;
    }
}
