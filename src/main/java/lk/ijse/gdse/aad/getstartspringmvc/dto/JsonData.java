package lk.ijse.gdse.aad.getstartspringmvc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class JsonData implements Serializable {
    private String id;
    private String name;
    private String city;
}
