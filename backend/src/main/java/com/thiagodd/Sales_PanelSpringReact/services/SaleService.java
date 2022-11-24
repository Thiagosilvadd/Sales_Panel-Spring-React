package com.thiagodd.Sales_PanelSpringReact.services;

import com.thiagodd.Sales_PanelSpringReact.dto.SaleDto;
import com.thiagodd.Sales_PanelSpringReact.entities.Sale;
import com.thiagodd.Sales_PanelSpringReact.repositories.SaleRepository;
import com.thiagodd.Sales_PanelSpringReact.repositories.SellerRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {

    private final SaleRepository repository;
    private final SellerRepository sellerRepository;

    public SaleService(SaleRepository repository, SellerRepository sellerRepository) {
        this.repository = repository;
        this.sellerRepository = sellerRepository;
    }

    @Transactional(readOnly = true)
    public Page<SaleDto> findAll(Pageable pageable){
        sellerRepository.findAll();
        Page<Sale> result = repository.findAll(pageable);
        return result.map(SaleDto::new);
    }
}
