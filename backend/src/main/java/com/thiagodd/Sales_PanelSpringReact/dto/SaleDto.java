package com.thiagodd.Sales_PanelSpringReact.dto;

import com.thiagodd.Sales_PanelSpringReact.entities.Sale;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link com.thiagodd.Sales_PanelSpringReact.entities.Sale} entity
 */
@Data
public class SaleDto implements Serializable {
    @Serial
    private static final long serialVersionUID = -1637077387905186066L;
    private final Long id;
    private final Integer visited;
    private final Integer deals;
    private final Double amount;
    private final LocalDate date;
    private final SellerDto seller;

    public SaleDto(Sale entity){
        id = entity.getId();
        visited = entity.getVisited();
        deals = entity.getDeals();
        amount = entity.getAmount();
        date = entity.getDate();
        seller = new SellerDto(entity.getSeller());
    }
}