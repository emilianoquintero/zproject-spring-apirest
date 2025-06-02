package models;

import lombok.Getter;
import lombok.Setter;

// 1. Create de model of the outcome information
// 2. Create sets/gets for de data managment

@Getter
@Setter
public class User {

    private String firstName;
    private String secondName;
    private String email;
    private String phoneNumber;
    private String password;  


}
