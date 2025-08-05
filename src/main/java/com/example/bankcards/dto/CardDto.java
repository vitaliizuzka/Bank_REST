package com.example.bankcards.dto;

import com.example.bankcards.entity.CardStatus;

import java.math.BigDecimal;
import java.time.LocalDate;


    public class CardDto {
        private Long id;
        private String cardNumber; // Маскированный номер карты
        private String owner;
        private LocalDate expiryDate;
        private CardStatus status;
        private BigDecimal balance;

        // Геттеры и сеттеры
    }

