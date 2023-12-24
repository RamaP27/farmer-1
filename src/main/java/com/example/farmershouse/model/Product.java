package com.example.farmershouse.model;

import lombok.*;

@AllArgsConstructor
@Builder
@Getter
@Setter
@Data
public class Product {
    private String name;
    private double price;
    private boolean isCustomizable;
}
