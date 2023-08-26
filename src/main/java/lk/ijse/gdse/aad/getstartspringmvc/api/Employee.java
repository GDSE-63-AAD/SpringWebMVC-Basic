package lk.ijse.gdse.aad.getstartspringmvc.api;

import lk.ijse.gdse.aad.getstartspringmvc.dto.EmpUpdate;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

@RestController
@RequestMapping("api/v1/emp")
public class Employee {
    @GetMapping(params = {"id","name"})
    public String saveEmployee(String id, String name,
                               @RequestParam MultiValueMap<String,
                                       String> emplist, lk.ijse.gdse.aad.getstartspringmvc.dto.Employee emp){
        System.out.println(emp);
        return String.format("EmpDetails(%s,%s)",id,name);
    }
    @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String getMultiTypeData(String id,String country,String city,
                                   @RequestParam("towns") String[] towns,
                                   @RequestParam Map<String,String>data
    ){
        printValues(id,city,country,towns);
        System.out.println(data);
        return "Saved";
    }

    private void printValues(String id, String city, String country, String[] towns) {
        System.out.println(id);
        System.out.println(city);
        System.out.println(country);
        System.out.println(Arrays.toString(towns));
    }
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String JSONDataExtractOne(@RequestBody EmpUpdate emp){
        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getCity());
        return "Updated";
    }
}
