package cc.genie.demo.pkinfo;

import cc.genie.demo.domain.DraftInfo;
import cc.genie.demo.domain.ParkingInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class ParkingService {

  private RestTemplate restTemplate = new RestTemplate();

  public ParkingInfo getParkingInfoByUser(String employeeNo) {
    return restTemplate.getForObject("/pk/parkings/" + employeeNo, ParkingInfo.class);
  }
}
