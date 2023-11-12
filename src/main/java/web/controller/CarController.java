package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Services.CarServiceImp;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarServiceImp carServiceImp;

    @Autowired
    public CarController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }

    @GetMapping
    public String printCars(Model model, @RequestParam(value = "count", defaultValue = "10") Integer count) {
        if (count == null) {
            count = 10;
        }
        model.addAttribute("cars", carServiceImp.carList(count));
        return "carController/cars";
    }
}
