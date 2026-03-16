package com.example.spending.spending;

import com.example.spending.spending.request.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("api/v1/spendings")
@RequiredArgsConstructor
public class SpendingController {

    private final SpendingService spendingService;

    public ResponseEntity<List<SpendingEntity>> GetSpendings(
            @RequestParam(value = "employeeName", required = false) String employeeName,
            @RequestParam(value = "departmentName", required = false) String departmentName
    ) {
        GetSpendings params = GetSpendings.builder()
                .employeeName(employeeName)
                .departmentName(departmentName)
                .build();

        return ResponseEntity.ok(spendingService.GetSpending(params));
    }
}
