/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac.za.tut.gui;

/**
 *
 * @author LENOVO
 */
public class GymMember {
    private String name;
    private String surname;
    private String idNo;
    private String gender;
    
    private String contractaType;
    private Boolean isPersonalTrainerNeeded;

    public GymMember(String name, String surname, String idNo, String gender, String contractaType, Boolean isPersonalTrainerNeeded) {
        this.name = name;
        this.surname = surname;
        this.idNo = idNo;
        this.gender = gender;
        this.contractaType = contractaType;
        this.isPersonalTrainerNeeded = isPersonalTrainerNeeded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContractaType() {
        return contractaType;
    }

    public void setContractaType(String contractaType) {
        this.contractaType = contractaType;
    }

    public Boolean getIsPersonalTrainerNeeded() {
        return isPersonalTrainerNeeded;
    }

    public void setIsPersonalTrainerNeeded(Boolean isPersonalTrainerNeeded) {
        this.isPersonalTrainerNeeded = isPersonalTrainerNeeded;
    }

    @Override
    public String toString() {
        return "Member{" + "name=" + name + ", surname=" + surname + ", idNo=" + idNo + ", gender=" + gender + ", contractaType=" + contractaType + ", isPersonalTrainerNeeded=" + isPersonalTrainerNeeded + '}';
    }
    
    
}
