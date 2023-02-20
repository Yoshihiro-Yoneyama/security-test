package com.designtest.webserver.application.service.strategy;

import com.designtest.webserver.domain.model.strategy.ShippingStrategy;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@AllArgsConstructor
public class ShippingService {
  private ShippingStrategy shippingStrategy;


  public int calculateShippingCost(double weight) {
    return shippingStrategy.calculateShippingCost(weight);
  }

  public LocalDate getDeliveryDate() {
    return shippingStrategy.getDeliveryDate();
  }
}
