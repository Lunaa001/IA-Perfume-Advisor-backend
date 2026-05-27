package com.iaperfumeadvisor.dto.request.admin;

import com.iaperfumeadvisor.enums.PerfumeCategory;
import com.iaperfumeadvisor.enums.PerfumeStatus;
import com.iaperfumeadvisor.enums.GenderType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdatePerfumeRequest {

    private String name;
    private String brand;
    private String description;
    private PerfumeCategory category;
    private GenderType genderType;
    private BigDecimal price;
    private Integer stock;
    private PerfumeStatus status;
    private String imageUrl;
}
