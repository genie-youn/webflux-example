package cc.genie.demo.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MembershipInfo {
  private String employeeNo;
  private long memberPay;
}
