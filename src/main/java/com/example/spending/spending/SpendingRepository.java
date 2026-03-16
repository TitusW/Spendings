package com.example.spending.spending;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface SpendingRepository extends JpaRepository<SpendingEntity, String>, JpaSpecificationExecutor<SpendingEntity> {
}
