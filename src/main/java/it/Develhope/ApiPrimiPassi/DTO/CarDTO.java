package it.Develhope.ApiPrimiPassi.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
public class CarDTO {

    @NotBlank(message = "mandatory")
    private String id;
    @NotBlank(message = "mandatory")
    private String modelName;
    private double price;
}
