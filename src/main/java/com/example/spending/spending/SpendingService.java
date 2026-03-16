package com.example.spending.spending;

import com.example.spending.spending.request.*;
import lombok.*;
import org.springframework.data.jpa.domain.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
@RequiredArgsConstructor
public class SpendingService {

    private final SpendingRepository spendingRepository;

    public List<SpendingEntity> GetSpending(GetSpendings params) {
        Specification<SpendingEntity> specification = Specification.where((Specification<SpendingEntity>) null);

        if (Objects.nonNull(params.getEmployeeName())) {
            specification = specification.and(SpendingSpecification.hasEmployeeName(params.getEmployeeName()));
        }

        if (Objects.nonNull(params.getEmployeeName())) {
            specification = specification.and(SpendingSpecification.hasDepartmentName(params.getDepartmentName()));
        }

        return spendingRepository.findAll(specification);
    }
}
