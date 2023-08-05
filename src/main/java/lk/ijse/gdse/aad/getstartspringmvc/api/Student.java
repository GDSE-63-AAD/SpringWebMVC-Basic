package lk.ijse.gdse.aad.getstartspringmvc.api;

import org.springframework.web.bind.annotation.*;
@RestController
//http://localhost:8080/store/student
public class Student {
    @GetMapping("student/{id}*")
    public String getAllStudentWithAll(@PathVariable int id){
        return "Get all student data with "+id;
    }
    @GetMapping("student")
    public String getAllStudent(){
        return "Get all student data";
    }
    @GetMapping("student/{id:S\\d{3}}}")
    public String getStudentDetails(@PathVariable String id){
        return "Get student data of "+id;
    }
    @GetMapping("student/{id}/{code}")
    public String getStudentDetailswithTwoparams(@PathVariable String id,
                                                 @PathVariable int code){
        return "get student data with multi param as id "+id+" and "+ code;
    }
}
