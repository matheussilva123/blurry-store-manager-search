package br.com.dias.blurrystoremanagersearch.model.event;

import lombok.Getter;

import java.util.UUID;

@Getter
public class ProductEvent {

    private UUID productId;
    private String name;
    private Float price;

}
