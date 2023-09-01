package com.example.demo.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;

import java.math.BigDecimal;

@Embeddable
@Getter
public class Point {
    private BigDecimal latitude;
    private BigDecimal longitude;
}
