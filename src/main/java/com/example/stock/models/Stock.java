package com.example.stock.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Stock {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer stockId;

    @Column(unique = true)
    private String stockName;

    private Double stockPrice;

    private Integer stockOwnerCount;

    @Enumerated(EnumType.STRING)
    private StockType stockType;

    private Double stockMarketCap;

    private LocalDateTime stockBirthTimeStamp;

}
