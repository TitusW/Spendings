package com.example.spending.spending.request;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetSpendings {
    private String employeeName;
    private String departmentName;
}
