package com.Test.portal.Service;

import com.Test.portal.Model.Address;
import com.Test.portal.Repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;

    public String addAddress(Address address) {
        addressRepo.save(address);
        return "added";
    }

    public List<Address> getAddresses() {
       return addressRepo.findAll();
    }

    public String updateAddress(Long id, String zc) {
        Address curaddress = addressRepo.findById(id).orElse(null);
        if(curaddress!=null){

            curaddress.setZipcode(zc);
            addressRepo.save(curaddress);
            return "updated";
        }
        else{
             return "id not found";
        }
    }

    public String deleteById(Long id) {
        Address del = addressRepo.findById(id).orElse(null);
        if(del!=null){
            addressRepo.deleteById(id);
            return "id removed";
        }
        else{
            return "id not found...";
        }
    }
}
