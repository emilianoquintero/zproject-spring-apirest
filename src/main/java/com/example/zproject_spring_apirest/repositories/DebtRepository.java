package com.example.zproject_spring_apirest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.zproject_spring_apirest.entities.Debt;

// public interface UserRepository  extends CrudRepository<Debt, Long>{
public interface DebtRepository  extends JpaRepository<Debt, Long>{

    // @Query("SELECT u.firstname, u.secondname, ud.debt_amount, ud.due_date, ud.description FROM users u
    //     JOIN users_debt ud ON u.id = ud.user_id
    //     WHERE u.id = 100;")

    // @Query(
    //     "SELECT u.user_id, u.firstname, u.secondname, ud.debt_amount, ud.due_date, ud.description FROM User u JOIN Debt ud ON u.id = ud.user_id WHERE u.id = :id")    
    //     List<Object[]> findUserDebt(@Param("id") Long id);

    @Query(
    value="SELECT ud.debt_id, u.id, u.firstname, u.secondname, u.email, u.phonenumber, ud.debt_amount, ud.due_date, ud.description FROM users u JOIN users_debt ud ON u.id = ud.user_id", nativeQuery = true)    
    List<Object[]> findAllDebts();

    @Query(
    value="SELECT u.id, u.firstname, u.secondname, u.email, u.phonenumber, ud.debt_amount, ud.due_date, ud.description FROM users u JOIN users_debt ud ON u.id = ud.user_id WHERE u.id = :id", nativeQuery = true)    
    List<Object[]> findUserDebt(@Param("id") Long id);
}
