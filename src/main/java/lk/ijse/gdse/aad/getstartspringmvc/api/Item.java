package lk.ijse.gdse.aad.getstartspringmvc.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class Item {
    @GetMapping(params = "data")
    public String getItemswithParams(String data){
        return "Get item "+data;
    }
    @PostMapping(headers = "X-token")
    public String setItemwithCustomToken(@RequestHeader("X-token") String token){
        return "Saved the item as: "+token;
    }
    @PostMapping(value = "/{code}",headers = "X-token")
    public String setItemwithCustomTokenandValue(@RequestHeader("X-token") String token,@PathVariable String code){
        return "Saved the item as: "+token +"and "+code;
    }
}
