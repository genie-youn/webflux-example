package cc.genie.demo.wtinfo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class WorkingTimeServer {

  @GetMapping("/wt/working-times/{employeeNo}")
  public ResponseEntity getWorkingTimeByEmpNo(@PathVariable String employeeNo) {
    return null;
  }
}
