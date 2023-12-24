package com.example.farmershouse.model;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@Builder
@Getter
@Setter
@Data
public class Farmer {
    public String name;
    private List<Product> product;
}
