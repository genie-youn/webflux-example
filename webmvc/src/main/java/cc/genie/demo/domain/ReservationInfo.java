package cc.genie.demo.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReservationInfo {
  private String employeeNo;
  private long memberPay;
}
