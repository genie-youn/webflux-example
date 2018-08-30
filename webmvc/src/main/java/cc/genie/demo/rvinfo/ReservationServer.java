package cc.genie.demo.rvinfo;

import cc.genie.demo.domain.ReservationInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@Slf4j
public class ReservationServer {

  @GetMapping("/rv/reservations/{employeeNo}")
  public ResponseEntity getReservationInfoByEmpNo(@PathVariable String employeeNo) {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
    }
    return ResponseEntity.ok(ReservationInfo.builder()
        .employeeNo(employeeNo)
        .memberPay(RandomUtils.nextInt(0,2) * 200000)
        .build());
  }
}
