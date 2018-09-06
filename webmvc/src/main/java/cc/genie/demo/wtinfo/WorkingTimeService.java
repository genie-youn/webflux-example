package cc.genie.demo.wtinfo;

import cc.genie.demo.domain.WorkingTimeInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class WorkingTimeService {
  private RestTemplate restTemplate = new RestTemplate();

  public WorkingTimeInfo getWorkingTimeInfoByUser(String employeeNo) {
    return restTemplate.getForObject("/wt/working-times/" + employeeNo, WorkingTimeInfo.class);
  }
}
