package org.mapstruct.bean;

import java.util.Set;

public class B {

    private Long id;
    private String name;
    private Set<A> aData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<A> getaData() {
        return aData;
    }

    public void setaData(Set<A> aData) {
        this.aData = aData;
    }
}
