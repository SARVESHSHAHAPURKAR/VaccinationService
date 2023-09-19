package Models;

import enums.Gender;

public class User {

    private String uniqueId;

    private String name;

    private Gender gender;

    private int age;

    private String state;

    private String district;

    public User(String uniqueId, String name, Gender gender, int age, String state, String district) {
        this.uniqueId = uniqueId;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.state = state;
        this.district = district;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
