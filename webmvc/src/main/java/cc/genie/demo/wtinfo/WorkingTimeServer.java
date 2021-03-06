package cc.genie.demo.wtinfo;

import cc.genie.demo.domain.WorkingTimeInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@Slf4j
public class WorkingTimeServer {

  @GetMapping("/wt/working-times/{employeeNo}")
  public ResponseEntity getWorkingTimeByEmpNo(@PathVariable String employeeNo) {
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
    }
    return ResponseEntity.ok(WorkingTimeInfo.builder()
        .employeeNo(employeeNo)
        .totalOverWork(RandomUtils.nextLong(0, 30))
        .totalHolidayWork(RandomUtils.nextLong(0, 30))
        .totalHolidayNightWork(RandomUtils.nextLong(0, 30))
        .totalNightWork(RandomUtils.nextLong(0, 30))
        .build());
  }
}
