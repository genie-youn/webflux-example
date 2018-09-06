package cc.genie.demo.msinfo;

import cc.genie.demo.domain.DraftInfo;
import cc.genie.demo.domain.MembershipInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class MemberService {
  private RestTemplate restTemplate = new RestTemplate();

  public MembershipInfo getMemberInfoByUser(String employeeNo) {
    return restTemplate.getForObject("/ms/memberships/" + employeeNo, MembershipInfo.class);
  }
}
