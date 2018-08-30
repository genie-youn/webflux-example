package cc.genie.demo.pkinfo;

import cc.genie.demo.domain.ParkingInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@Slf4j
public class ParkingServer {

  @GetMapping("/pk/parkings/{employeeNo}")
  public ResponseEntity getParkingInfoByEmpNo(@PathVariable String employeeNo) {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      log.error(e.getMessage());
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
    }
    return ResponseEntity.ok(ParkingInfo.builder()
        .employeeNo(employeeNo)
        .memberPay(RandomUtils.nextInt(0,1) * 90000)
        .build());
  }
}
