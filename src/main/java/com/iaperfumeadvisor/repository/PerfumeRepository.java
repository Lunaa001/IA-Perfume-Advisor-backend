package com.iaperfumeadvisor.repository;

import com.iaperfumeadvisor.entity.Perfume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PerfumeRepository extends JpaRepository<Perfume, Long> {

    List<Perfume> findByBrand(String brand);

    List<Perfume> findByCategory(String category);
}
