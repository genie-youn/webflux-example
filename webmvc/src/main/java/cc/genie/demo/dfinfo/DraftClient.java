package cc.genie.demo.dfinfo;

import cc.genie.demo.domain.DraftInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Component
public class DraftClient {

  private RestTemplate restTemplate = new RestTemplate();

  public DraftInfo getDraftInfoByUser(String employeeNo) {
    return null;
  }
}
