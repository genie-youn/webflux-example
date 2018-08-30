package cc.genie.demo.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DraftInfo {
  private String employeeNo;
  private long memberPay;
}
