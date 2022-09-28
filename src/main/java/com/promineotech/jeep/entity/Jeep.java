package com.promineotech.jeep.entity;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Jeep {
  
  private Long modelOK;
  private JeepModel modelId;
  private String trimLevel;
  private int wheelSize;
  private BigDecimal basePrice;
  private int numDoors;

}
