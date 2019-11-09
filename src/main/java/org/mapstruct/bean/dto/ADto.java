package org.mapstruct.bean.dto;

public class ADto {

    private Long id;
    private String name;
    private BDto bData;

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

    public BDto getbData() {
        return bData;
    }

    public void setbData(BDto bData) {
        this.bData = bData;
    }
}
