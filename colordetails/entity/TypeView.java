package com.example.colordetails.entity;

public class TypeView {
    private Integer WateTypeId;
    private String WateTypeName;
    private Integer PackagesId;
    private Integer PackagesNumber;
    private Integer CapacityId;
    private Integer CapacityMl;

    public TypeView() {
    }

    public TypeView(Integer wateTypeId, String wateTypeName, Integer packagesId, Integer packagesNumber, Integer capacityId, Integer capacityMl) {
        WateTypeId = wateTypeId;
        WateTypeName = wateTypeName;
        PackagesId = packagesId;
        PackagesNumber = packagesNumber;
        CapacityId = capacityId;
        CapacityMl = capacityMl;
    }

    @Override
    public String toString() {
        return "TypeView{" +
                "WateTypeId=" + WateTypeId +
                ", WateTypeName='" + WateTypeName + '\'' +
                ", PackagesId=" + PackagesId +
                ", PackagesNumber=" + PackagesNumber +
                ", CapacityId=" + CapacityId +
                ", CapacityMl=" + CapacityMl +
                '}';
    }

    public Integer getWateTypeId() {
        return WateTypeId;
    }

    public void setWateTypeId(Integer wateTypeId) {
        WateTypeId = wateTypeId;
    }

    public String getWateTypeName() {
        return WateTypeName;
    }

    public void setWateTypeName(String wateTypeName) {
        WateTypeName = wateTypeName;
    }

    public Integer getPackagesId() {
        return PackagesId;
    }

    public void setPackagesId(Integer packagesId) {
        PackagesId = packagesId;
    }

    public Integer getPackagesNumber() {
        return PackagesNumber;
    }

    public void setPackagesNumber(Integer packagesNumber) {
        PackagesNumber = packagesNumber;
    }

    public Integer getCapacityId() {
        return CapacityId;
    }

    public void setCapacityId(Integer capacityId) {
        CapacityId = capacityId;
    }

    public Integer getCapacityMl() {
        return CapacityMl;
    }

    public void setCapacityMl(Integer capacityMl) {
        CapacityMl = capacityMl;
    }
}
