package com.company.ui.models;

public class Student {
    private Integer id;
    private String name;
    private String family;
    private String college;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public Student(Integer id, String name, String family, String college) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.college = college;
    }

    public Student(String name, String family, String college) {
        this.name = name;
        this.family = family;
        this.college = college;
    }

    public Student() {
    }
}
