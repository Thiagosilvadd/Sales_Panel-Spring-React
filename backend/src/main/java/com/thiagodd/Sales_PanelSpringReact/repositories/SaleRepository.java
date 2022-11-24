package com.thiagodd.Sales_PanelSpringReact.repositories;

import com.thiagodd.Sales_PanelSpringReact.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
