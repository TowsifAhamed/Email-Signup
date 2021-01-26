package com.example.emailsignup;

class User {
    public String email;
    public Boolean donor,in_need;
    public User() {

    }
    public User(String email,Boolean donor,Boolean in_need) {
        this.email = email;
        this.donor = donor;
        this.in_need = in_need;
    }
}
