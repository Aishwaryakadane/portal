package com.Test.portal.Controller;

import com.Test.portal.Model.Address;
import com.Test.portal.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }

    @GetMapping("addresses")
    public List<Address> getAddresses(){
        return addressService.getAddresses();
    }

    @PutMapping("update/{id}/{zc}")
    public String updateAddress(@PathVariable Long id,@PathVariable String zc){
        return addressService.updateAddress(id,zc);
    }

    @DeleteMapping("address/deleted/{id}")
    public String deleteById(@PathVariable Long id){
        return addressService.deleteById(id);
    }
}
