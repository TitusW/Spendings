package com.example.spending.spending;

public class SpendingSpecification {

    public static org.springframework.data.jpa.domain.Specification<SpendingEntity> hasEmployeeName(String name) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.like(root.get("employeeName"), "%" + name + "%");
    }

    public static org.springframework.data.jpa.domain.Specification<SpendingEntity> hasDepartmentName(String name) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.like(root.get("departmentName"), "%" + name + "%");
    }
}
