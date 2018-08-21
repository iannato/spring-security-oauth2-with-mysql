package oauth2.service.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HalloWorldController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String index(){

        return "hello";
    }
}
