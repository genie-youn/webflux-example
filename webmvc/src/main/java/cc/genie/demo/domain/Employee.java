package cc.genie.demo.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
  private Long employeeSeq;
  private String employeeNo;
  private String accountNo;
}
