package com.example.gymcenter.request;

import javax.validation.constraints.NotNull;

public class CalculateIndexRequest {
    @NotNull
    private float weight;
    @NotNull
    private float height;
    @NotNull
    private float age;
    @NotNull
    private Integer sex;
    @NotNull
    private Integer activity;

    public CalculateIndexRequest() {
    }

    public CalculateIndexRequest(@NotNull float weight, @NotNull float height, @NotNull float age, @NotNull Integer sex, @NotNull Integer activity) {
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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getActivity() {
        return activity;
    }

    public void setActivity(Integer activity) {
        this.activity = activity;
    }
}
