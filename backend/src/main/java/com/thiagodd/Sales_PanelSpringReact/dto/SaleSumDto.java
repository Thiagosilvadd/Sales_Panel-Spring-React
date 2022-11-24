package com.thiagodd.Sales_PanelSpringReact.dto;

import com.thiagodd.Sales_PanelSpringReact.entities.Seller;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class SaleSumDto implements Serializable {
    @Serial
    private static final long serialVersionUID = -3818812241486773068L;
    private final String SelleName;
    private final Double sum;

    public SaleSumDto(Seller seller, Double sum) {
        SelleName = seller.getName();
        this.sum = sum;
    }
}
