package com.iaperfumeadvisor.mapper;

import com.iaperfumeadvisor.dto.response.PerfumeResponse;
import com.iaperfumeadvisor.entity.Perfume;
import org.springframework.stereotype.Component;

@Component
public class PerfumeMapper {

    public PerfumeResponse toResponse(Perfume perfume) {
        return PerfumeResponse.builder()
                .id(perfume.getId())
                .name(perfume.getName())
                .brand(perfume.getBrand())
                .description(perfume.getDescription())
                .category(perfume.getCategory().toString())
                .genderType(perfume.getGenderType().toString())
                .price(perfume.getPrice())
                .stock(perfume.getStock())
                .status(perfume.getStatus().toString())
                .imageUrl(perfume.getImageUrl())
                .rating(perfume.getRating())
                .build();
    }

    public Perfume toEntity(PerfumeResponse response) {
        return new Perfume();
    }
}
