package com.example.spending.spending;

import jakarta.persistence.*;
import lombok.*;

import java.math.*;
import java.util.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SpendingEntity {
    @Id
    private String ksuid;
    private String employeeKsuid;
    private Date spendingDate;
    private BigDecimal value;
}
