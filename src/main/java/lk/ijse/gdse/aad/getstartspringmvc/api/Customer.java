package lk.ijse.gdse.aad.getstartspringmvc.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer/*")
public class Customer {
    @PostMapping
    public String saveCustomer(){
        System.out.println("Saved Customer");
        return "Save customer";
    }
    @GetMapping
    public String getCustomer(){
        return "Get Customer with ?";
    }
}
