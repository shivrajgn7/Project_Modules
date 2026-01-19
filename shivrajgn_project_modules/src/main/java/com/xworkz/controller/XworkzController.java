package com.xworkz.controller;

import com.xworkz.dto.XworkzDto;
import com.xworkz.service.XworkzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class XworkzController {
@Autowired
private XworkzService xworkzService;

    @PostMapping("/signUp")
    public String signUp(XworkzDto xworkzDto) {
        System.out.println("add user is started");
        boolean signUp = false;
        if (xworkzService.emailExist(xworkzDto.getEmail())) {
        }signUp = xworkzService.validateAndSave(xworkzDto);
        if (signUp) {
            return "Error";
        }
        return "Success";

    }

    @PostMapping("/signIn")
    public String signin(String email, String password, Model model) {
        System.out.println("Controller is started");
        boolean dto = xworkzService.validateLoginAndGetUser(email, password);

        if (dto) {
            return "SignInResult";
        } else {
            model.addAttribute("email",email);
            int count=xworkzService.getCount(email);
            System.out.println("count stmt"+count);
            if(count>3){
                System.out.println("Your account is blocked due to multiple invalid login attempts"+count);
               return "BlockedOtpPage";
            }else {
                System.out.println("Invalid email or password");
                xworkzService.updateCount(email);
            }
            model.addAttribute("error", "Invalid email or password only "+(2-count+1)+" times of attemps available");
        }
        return "Signin";
    }
}
