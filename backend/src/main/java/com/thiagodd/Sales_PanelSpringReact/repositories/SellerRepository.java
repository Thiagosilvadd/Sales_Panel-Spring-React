package com.thiagodd.Sales_PanelSpringReact.repositories;

import com.thiagodd.Sales_PanelSpringReact.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
}
