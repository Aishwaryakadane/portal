package com.Test.portal.Service;

import com.Test.portal.Model.Book;
import com.Test.portal.Model.Laptop;
import com.Test.portal.Repo.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {

    @Autowired
    ILaptopRepo laptopRepo;

    public String addlaptops(Laptop laptop) {
        laptopRepo.save(laptop);
        return "book added";
    }

    public List<Laptop> getAlllaptops() {
        return laptopRepo.findAll();
    }

    public String updatePriceById(String id, String price) {
        Laptop laptop = laptopRepo.findById(id).orElse(null);
        if(laptop!=null){
            laptop.setLaptopPrice(price);
            laptopRepo.save(laptop);
            return "book price updated";
        }
        else{
            return id+"Id not found";
        }
    }

    public String removeById(String id) {
        laptopRepo.deleteById(id);
        return "deleted";
    }
}