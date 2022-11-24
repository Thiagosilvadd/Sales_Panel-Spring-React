package com.thiagodd.Sales_PanelSpringReact.dto;

import com.thiagodd.Sales_PanelSpringReact.entities.Seller;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * A DTO for the {@link com.thiagodd.Sales_PanelSpringReact.entities.Seller} entity
 */
@Data
public class SellerDto implements Serializable {
    @Serial
    private static final long serialVersionUID = -2965362751144193510L;
    private final Long id;
    private final String name;

    public SellerDto(Seller entity){
        this.id = entity.getId();
        this.name = entity.getName();
    }
}