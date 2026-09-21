package com.devsuperior.dscommerce.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="tb_user")
public class User {
    //mapeamento objecto relacional (criar um mapa para o banco de dados relacional)
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) //auto incrementar o id
    private Long id;
    private String name;

    @Column(unique=true)
    private String email;
    private String phone;
    private LocalDate birthdate;
    private String password;

    @OneToMany(mappedBy ="client")
    private List<Order> orders = new ArrayList<>();

    public User() {

    }

    public User(LocalDate birthdate, String email, Long id, String name, String password, String phone) {
        this.birthdate = birthdate;
        this.email = email;
        this.id = id;
        this.name = name;
        this.password = password;
        this.phone = phone;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
