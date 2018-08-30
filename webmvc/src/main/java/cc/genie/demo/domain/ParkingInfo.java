package cc.genie.demo.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ParkingInfo {
  private String employeeNo;
  private long memberPay;
}
