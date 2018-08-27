package cc.genie.demo.hrinfo;

import cc.genie.demo.domain.Employee;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

@Controller
@Slf4j
public class HrServer {

  /**
   * 전체 사원정보를 받아오는 1분정도 걸리는 API
   *
   * @return genie.youn
   */
  @GetMapping("/hr/users")
  public ResponseEntity getAllUsers() {
    List<Employee> employees = IntStream.range(1, 6000).mapToObj(i -> {
      NumberFormat nf = new DecimalFormat("0000");
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        throw new IllegalStateException(e.getMessage());
      }
      return Employee.builder()
          .employeeSeq((long) i)
          .employeeNo("D" + nf.format(i))
          .accountNo(RandomStringUtils.randomAlphabetic(10)).build();
    }).collect(toList());

    return ResponseEntity.ok(employees);
  }
}
