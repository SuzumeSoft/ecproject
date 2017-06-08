package jp.sakuraserver.ecproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserResistController {

    @Autowired
    private UserResistService userResistService;

    @RequestMapping("/resistUser")
    public String ResistUser(){
        String test = userResistService.test();
        userResistService.write();
        return "resistUser";
    }
}