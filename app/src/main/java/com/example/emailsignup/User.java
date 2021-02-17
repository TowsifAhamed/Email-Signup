package com.example.emailsignup;

class User {
    public String email,name,phone,country,city,bday,bgroup,need_bgroup;
    public Boolean donor,in_need;
    public Double latitude,longitude;
    public User() {

    }
    public User(String email,Boolean donor,Boolean in_need,String name,String phone,String country,String city,String bday,Double latitude,Double longitude,String bgroup,String need_bgroup) {
        this.email = email;
        this.donor = donor;
        this.in_need = in_need;
        this.name = name;
        this.phone = phone;
        this.country = country;
        this.city = city;
        this.bday = bday;
        this.latitude=latitude;
        this.longitude=longitude;
        this.bgroup = bgroup;
        this.need_bgroup = need_bgroup;
    }
}
