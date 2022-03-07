package br.com.dias.blurrystoremanagersearch.model;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
public class Product {

    private UUID id;
    private String name;
    private Float price;

}
