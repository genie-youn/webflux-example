package cc.genie.demo.controller;

import cc.genie.demo.service.PayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@RestController
@Slf4j
@RequestMapping("/batch")
public class BatchController {

  private final PayService payService;

  public BatchController(PayService payService) {
    this.payService = payService;
  }

  @PostMapping("/pay")
  public ResponseEntity payAllUser() {
    boolean result = payService.payWithSyncAndBlock();
    return result ? ResponseEntity.ok().build()
        : ResponseEntity.status(INTERNAL_SERVER_ERROR).build();
  }
}
