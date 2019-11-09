package org.mapstruct.bean.dto;

import java.util.Set;

public class BDto {

    private Long id;
    private String name;
    private Set<ADto> aData;

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

    public Set<ADto> getaData() {
        return aData;
    }

    public void setaData(Set<ADto> aData) {
        this.aData = aData;
    }
}
