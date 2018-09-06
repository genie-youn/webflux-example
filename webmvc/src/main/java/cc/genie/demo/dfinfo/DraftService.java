package cc.genie.demo.dfinfo;

import cc.genie.demo.domain.DraftInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class DraftService {
  private RestTemplate restTemplate = new RestTemplate();

  public DraftInfo getDraftInfoByUser(String employeeNo) {
    return restTemplate.getForObject("/df/drafts/" + employeeNo, DraftInfo.class);
  }
}
