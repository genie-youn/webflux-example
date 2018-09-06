package cc.genie.demo.service;

import cc.genie.demo.dfinfo.DraftService;
import org.springframework.stereotype.Service;

@Service
public class PayService {

  private final DraftService draftService;

  public PayService(DraftService draftService) {
    this.draftService = draftService;
  }

  public boolean payWithSyncAndBlock() {


    return false;
  }
}
