package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

// 1. Create de model of the outcome information
// 2. Create sets/gets for de data managment

@Entity(name = "User")
@Table(name = "users")
public class User {

    // The @id Annotation specify the primary key 
    // @Column Specify the mapped column
    @Id
    @Getter @Setter @Column(name = "id")
    private Long id;
    @Getter @Setter @Column(name = "firstname")
    private String firstName;
    @Getter @Setter @Column(name = "secondname")
    private String secondName;
    @Getter @Setter @Column(name = "email")
    private String email;
    @Getter @Setter @Column(name = "phonenumber")
    private String phoneNumber;
    @Getter @Setter @Column(name = "password")
    private String password;  


}
