package com.example.SpringApp.Product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponse {

    private Long id;
    private String title;
    private String description;
    private double price;
    private String username;

}
