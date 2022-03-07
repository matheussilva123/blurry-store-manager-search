package br.com.dias.blurrystoremanagersearch.converter;

import br.com.dias.blurrystoremanagersearch.model.Product;
import br.com.dias.blurrystoremanagersearch.model.event.ProductEvent;

public class ProductConverter {

    public static Product convertEventToProduct(final ProductEvent productEvent) {
        return Product.builder()
                .id(productEvent.getProductId())
                .name(productEvent.getName())
                .price(productEvent.getPrice())
                .build();
    }

}

