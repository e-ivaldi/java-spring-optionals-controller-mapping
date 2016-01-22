package com.foolver.improvedapi;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.Optional;

@JsonTypeInfo(use=JsonTypeInfo.Id.MINIMAL_CLASS, include=JsonTypeInfo.As.PROPERTY, property="type")
public class SimpleObject {

    private Optional<String> name;
    private Optional<String> age;
    private Optional<String> description;

    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public Optional<String> getDescription() {
        return description;
    }

    public void setDescription(Optional<String> description) {
        this.description = description;
    }

    public Optional<String> getAge() {
        return age;
    }

    public void setAge(Optional<String> age) {
        this.age = age;
    }
}
