package org.example.stereotype_annotations.model;

import lombok.Data;
import lombok.NonNull;
import org.springframework.stereotype.Component;
@Data
@Component
public class ExtraHours {
@NonNull
    public int getHours(){
        return 10;
    }



}
