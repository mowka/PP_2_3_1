package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarServiceImpl carService;

    @GetMapping()
    public String getCarList(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("listOfCars", carService.getCarList(count));
        return "car-list";
    }
}
