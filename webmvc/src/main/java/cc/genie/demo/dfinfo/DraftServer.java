package cc.genie.demo.dfinfo;

import cc.genie.demo.domain.DraftInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.atomic.AtomicInteger;

@Controller
@Slf4j
public class DraftServer {

  private AtomicInteger failCount = new AtomicInteger();

  @GetMapping("/df/drafts/{employeeNo}")
  public ResponseEntity getDraftInfoByEmpNo(@PathVariable String employeeNo) {
    try {
      if ((failCount.addAndGet(1) % 7) == 0) throw new IllegalStateException("Server is gone");
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      log.error(e.getMessage());
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
    }
    return ResponseEntity.ok(DraftInfo.builder()
        .employeeNo(employeeNo)
        .memberPay(RandomUtils.nextInt(0,10) * 200000)
        .build()
    );
  }
}
