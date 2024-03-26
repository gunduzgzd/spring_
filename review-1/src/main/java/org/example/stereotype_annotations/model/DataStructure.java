package org.example.stereotype_annotations.model;

import lombok.Data;
import lombok.NonNull;
import org.springframework.stereotype.Component;
@Data
@Component
public class DataStructure {
    @NonNull
private ExtraHours extraHours;
    public void getTotalHours(){
        System.out.println("total hours: "+(45+extraHours.getHours()));
    }


}
