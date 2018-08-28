package cc.genie.demo.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WorkingTimeInfo {
  private String employeeNo;
  private long totalHolidayWork;
  private long totalOverWork;
  private long totalNightWork;
  private long totalHolidayNightWork;
}
