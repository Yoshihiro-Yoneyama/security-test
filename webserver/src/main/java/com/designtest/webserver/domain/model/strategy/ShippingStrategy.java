package com.designtest.webserver.domain.model.strategy;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;

//宅配システムでのストラテジーパターン
public sealed interface ShippingStrategy {
  int calculateShippingCost(double wight);
  LocalDate getDeliveryDate();

  final class ConcreteShippingStrategyA implements ShippingStrategy {

    @Override
    public int calculateShippingCost(double weight) {
      return 500 + (int)(weight * 50);
    }

    @Override
    public LocalDate getDeliveryDate() {
      return LocalDate.now().plusDays(2);
    }
  }

  final class ConcreteShippingStrategyB implements ShippingStrategy {
    @Override
    public int calculateShippingCost(double weight) {
      return 700 + (int)(weight * 70);
    }

    @Override
    public LocalDate getDeliveryDate() {
      return LocalDate.now().plusDays(3);
    }
  }
}

