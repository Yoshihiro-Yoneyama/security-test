package com.designtest.webserver.presentation.strategy;

import com.designtest.webserver.application.service.strategy.ShippingService;
import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public class OrderController {
  private double weight;
  private ShippingService shippingService;

    public int calculateShippingCost() {
      return shippingService.calculateShippingCost(weight);
    }

    public LocalDate getDeliveryDate() {
      return shippingService.getDeliveryDate();
    }
}
