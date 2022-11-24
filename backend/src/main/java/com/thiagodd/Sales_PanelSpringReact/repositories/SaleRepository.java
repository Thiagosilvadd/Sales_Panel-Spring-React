package com.thiagodd.Sales_PanelSpringReact.repositories;

import com.thiagodd.Sales_PanelSpringReact.dto.SaleSuccessDto;
import com.thiagodd.Sales_PanelSpringReact.dto.SaleSumDto;
import com.thiagodd.Sales_PanelSpringReact.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.thiagodd.Sales_PanelSpringReact.dto.SaleSumDto(obj.seller, SUM(obj.amount)) " +
            "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDto> amountGroupedBySeller();

    @Query("SELECT new com.thiagodd.Sales_PanelSpringReact.dto.SaleSuccessDto(obj.seller, SUM(obj.visited), SUM(obj.deals)) " +
            "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSuccessDto> successGroupedBySeller();



}
