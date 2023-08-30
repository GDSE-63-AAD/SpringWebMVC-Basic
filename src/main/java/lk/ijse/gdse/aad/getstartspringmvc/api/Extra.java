package lk.ijse.gdse.aad.getstartspringmvc.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/extra")
public class Extra {
    @PostMapping
    void saveData(@RequestBody Employee employee){
        System.out.println(employee);
    }
}
