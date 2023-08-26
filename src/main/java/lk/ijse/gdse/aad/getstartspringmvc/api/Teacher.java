package lk.ijse.gdse.aad.getstartspringmvc.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Base64;

@RestController
@RequestMapping("/api/v1/teacher")
public class Teacher {

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String handleMultiPart(
    @RequestPart String id,
    @RequestPart String name,
    @RequestPart String city,
    @RequestPart byte [] profile
    ){
        System.out.println(id);
        System.out.println(name);
        System.out.println(city);

        byte [] decoded = Base64.getDecoder().decode(profile);
        String profileStr = new String(decoded);
        System.out.println(profileStr);
        return "Saved";
    }
}
