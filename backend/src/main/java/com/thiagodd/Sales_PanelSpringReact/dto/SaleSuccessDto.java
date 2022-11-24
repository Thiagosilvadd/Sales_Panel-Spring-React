package com.thiagodd.Sales_PanelSpringReact.dto;

import com.thiagodd.Sales_PanelSpringReact.entities.Seller;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class SaleSuccessDto implements Serializable {
    @Serial
    private static final long serialVersionUID = -3818812241486773068L;
    private final String sellerName;
    private final Long visited;
    private final Long deals;

    public SaleSuccessDto(Seller seller, Long visited, Long deals) {
        sellerName = seller.getName();
        this.visited = visited;
        this.deals = deals;
    }
}
