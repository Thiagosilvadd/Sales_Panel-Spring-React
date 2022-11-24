package com.thiagodd.Sales_PanelSpringReact.controllers;

import com.thiagodd.Sales_PanelSpringReact.dto.SellerDto;
import com.thiagodd.Sales_PanelSpringReact.services.SellerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sellers")
public class SellerController {

    private final SellerService service;

    public SellerController(SellerService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<SellerDto>> findAll(){
        List<SellerDto> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
