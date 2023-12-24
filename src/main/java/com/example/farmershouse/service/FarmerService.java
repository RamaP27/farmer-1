package com.example.farmershouse.service;

import com.example.farmershouse.model.Farmer;
import com.example.farmershouse.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class FarmerService {
    public List<Farmer> getFarmerAndProducts() {
        List<Farmer> farmers = new ArrayList<>();
        farmers.add(new Farmer(
                "Farmer A",
                List.of(
                        Product.builder().name("Fruit A").price(100.0).isCustomizable(Boolean.TRUE).build(),
                        Product.builder().name("Fruit B").price(150.0).isCustomizable(Boolean.TRUE).build(),
                        Product.builder().name("Fruit C").price(200.0).isCustomizable(Boolean.TRUE).build()
                )
        ));
        farmers.add(new Farmer(
                "Farmer B",
                List.of(
                        Product.builder().name("Fruit X").price(100.0).isCustomizable(Boolean.TRUE).build(),
                        Product.builder().name("Fruit Y").price(150.0).isCustomizable(Boolean.FALSE).build(),
                        Product.builder().name("Fruit Z").price(200.0).isCustomizable(Boolean.FALSE).build()
                )
        ));
        return farmers;
    }
}
