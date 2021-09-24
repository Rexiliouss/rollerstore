package com.rollerstore.ecommerce.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@AllArgsConstructor
@Data
public class BaseEntity {
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

}
