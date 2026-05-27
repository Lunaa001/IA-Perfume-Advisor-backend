package com.iaperfumeadvisor.service.impl;

import com.iaperfumeadvisor.dto.request.admin.CreatePerfumeRequest;
import com.iaperfumeadvisor.dto.request.admin.UpdatePerfumeRequest;
import com.iaperfumeadvisor.dto.response.PerfumeResponse;
import com.iaperfumeadvisor.entity.Perfume;
import com.iaperfumeadvisor.service.PerfumeService;
import com.iaperfumeadvisor.repository.PerfumeRepository;
import com.iaperfumeadvisor.mapper.PerfumeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PerfumeServiceImpl implements PerfumeService {

    @Autowired
    private PerfumeRepository perfumeRepository;

    @Autowired
    private PerfumeMapper perfumeMapper;

    @Override
    public PerfumeResponse createPerfume(CreatePerfumeRequest request) {
        return new PerfumeResponse();
    }

    @Override
    public PerfumeResponse updatePerfume(Long id, UpdatePerfumeRequest request) {
        return new PerfumeResponse();
    }

    @Override
    public void deletePerfume(Long id) {

    }

    @Override
    public PerfumeResponse getPerfumeById(Long id) {
        return new PerfumeResponse();
    }

    @Override
    public List<PerfumeResponse> getAllPerfumes() {
        return perfumeRepository.findAll()
                .stream()
                .map(perfumeMapper::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    public List<PerfumeResponse> getPerfumesByCategory(String category) {
        return perfumeRepository.findByCategory(category)
                .stream()
                .map(perfumeMapper::toResponse)
                .collect(Collectors.toList());
    }
}
