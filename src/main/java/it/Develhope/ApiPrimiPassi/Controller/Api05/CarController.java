package it.Develhope.ApiPrimiPassi.Controller.Api05;

import it.Develhope.ApiPrimiPassi.DTO.CarDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
public class CarController {

    @GetMapping(value = "/createNewCar")
    public String createNewCar(@RequestParam(required = false) CarDTO car, @RequestParam String id,@RequestParam String modelName,@RequestParam double price ){
        car = new CarDTO(id, modelName, price);
        return car.toString();
    }

    @PostMapping(value = "/getCarBody")
    public String getCarBody(@Valid @RequestBody CarDTO car, HttpServletRequest request, HttpServletResponse responce){
        if(responce != null){
            System.out.println("oggetto creato");
        }
        return car.toString();
    }
}
