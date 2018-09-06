package cc.genie.demo.hrinfo;

import cc.genie.demo.domain.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class HrService {

  private RestTemplate restTemplate = new RestTemplate();

  public List<Employee> getAllUsers() {
    return restTemplate.getForObject("/hr/users", ArrayList.class);
  }
}
