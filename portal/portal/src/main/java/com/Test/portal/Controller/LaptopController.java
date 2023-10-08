package com.Test.portal.Controller;
import com.Test.portal.Model.Laptop;
import com.Test.portal.Service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {

    @Autowired
    LaptopService laptopService;


    @PostMapping("laptop")
    public String addLaptop(@RequestBody Laptop laptop){
        return laptopService.addlaptops(laptop);
    }

    @GetMapping("laptop")
    public List<Laptop> getAllLaptops(){
        return laptopService.getAlllaptops();
    }

    @PutMapping("update/laptop/{id}/{price}")
    public String updatePriceById(@PathVariable String id , @RequestBody String price){
        return laptopService.updatePriceById(id,price);
    }

    @DeleteMapping("removing/{id}")
    public String removeById(@PathVariable String id){
        return laptopService. removeById(id);
    }
}
