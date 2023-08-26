package lk.ijse.gdse.aad.getstartspringmvc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee implements Serializable {
    List<String>id;
    List<String>name;

}
