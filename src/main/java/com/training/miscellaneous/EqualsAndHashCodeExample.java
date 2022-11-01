package com.training.miscellaneous;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student {
    private int id;
    private String name;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getId() == student.getId() && Objects.equals(getName(), student.getName()) && Objects.equals(getAddress(), student.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAddress());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

public class EqualsAndHashCodeExample {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        Student s = new Student();
        s.setId(10);
        s.setName("test");
        s.setAddress("hyd");
        set.add(s);
        Student s1 = new Student();
        s1.setId(10);
        s1.setName("test");
        s1.setAddress("hyd");
        set.add(s1);
        System.out.println(set);
    }
}
