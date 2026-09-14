package com.example.SpringApp.Product;

import com.example.SpringApp.User.Users;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "products")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String title;
    private String description;
    private double price;

    @ManyToMany(mappedBy = "products")
    private List<Users> users;
}


//new class dto -> شكل الداتا اللي اليوزر هيدخلها
//user->request->dtoreq->entity->dtores->response->user
//transfer from dto to entity
//tranfer from entity to dto