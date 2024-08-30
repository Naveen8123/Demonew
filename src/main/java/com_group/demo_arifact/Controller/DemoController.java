package com_group.demo_arifact.Controller;

import com_group.demo_arifact.service.Welcome;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Api")
public class DemoController {
    private Welcome welcome;
    public DemoController(Welcome welcome) {
        this.welcome = welcome;
    }

  @GetMapping("welcome")
 public String Welcome(){
     return welcome.demo();
 }
}
