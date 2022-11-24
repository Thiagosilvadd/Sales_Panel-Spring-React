package com.thiagodd.Sales_PanelSpringReact.services;

import com.thiagodd.Sales_PanelSpringReact.dto.SellerDto;
import com.thiagodd.Sales_PanelSpringReact.entities.Seller;
import com.thiagodd.Sales_PanelSpringReact.repositories.SellerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    private final SellerRepository repository;

    public SellerService(SellerRepository repository) {
        this.repository = repository;
    }

    public List<SellerDto> findAll(){
        List<Seller> result = repository.findAll();
        return result.stream().map(x -> new SellerDto(x)).collect(Collectors.toList());
    }
}
