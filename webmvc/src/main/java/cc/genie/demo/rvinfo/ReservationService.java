package cc.genie.demo.rvinfo;

import cc.genie.demo.domain.ReservationInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class ReservationService {
  private RestTemplate restTemplate = new RestTemplate();

  public ReservationInfo getReservationInfoByUser(String employeeNo) {
    return restTemplate.getForObject("/rv/reservations/" + employeeNo, ReservationInfo.class);
  }
}
