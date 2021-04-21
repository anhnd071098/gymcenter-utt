package com.example.gymcenter.entity;

public class CalculateIndex {
    private float weight;
    private float height;
    private float age;
    private float sex;
    private Integer activity;

    public CalculateIndex() {
    }

    public CalculateIndex(float weight, float height, float age, float sex, Integer activity) {
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.sex = sex;
        this.activity = activity;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public float getSex() {
        return sex;
    }

    public void setSex(float sex) {
        this.sex = sex;
    }

    public Integer getActivity() {
        return activity;
    }

    public void setActivity(Integer activity) {
        this.activity = activity;
    }
}
