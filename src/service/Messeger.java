package service;

public class Messeger {
    private String name;
    private String Phone;
    private String address;
    private String email;
    private String facebook;

    private String gender;

    public Messeger() {
    }

    public Messeger(String name, String phone, String address, String email, String facebook, String gender) {
        this.name = name;
        Phone = phone;
        this.address = address;
        this.email = email;
        this.facebook = facebook;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Messeger{" +
                "name='" + name + '\'' +
                ", Phone='" + Phone + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", facebook='" + facebook + '\'' +
                '}'+'\n';
    }
}
