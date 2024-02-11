package com.api.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class bookControllers {

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    @ResponseBody
    public String getBook() {
        return "this is testing book first";
    }

}
