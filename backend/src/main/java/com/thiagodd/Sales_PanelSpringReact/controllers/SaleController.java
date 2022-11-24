package com.thiagodd.Sales_PanelSpringReact.controllers;

import com.thiagodd.Sales_PanelSpringReact.dto.SaleDto;
import com.thiagodd.Sales_PanelSpringReact.dto.SellerDto;
import com.thiagodd.Sales_PanelSpringReact.services.SaleService;
import com.thiagodd.Sales_PanelSpringReact.services.SellerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SaleController {

    private final SaleService service;

    public SaleController(SaleService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Page<SaleDto>> findAll(Pageable pageable){
        Page<SaleDto> list = service.findAll(pageable);
        return ResponseEntity.ok().body(list);
    }
}
