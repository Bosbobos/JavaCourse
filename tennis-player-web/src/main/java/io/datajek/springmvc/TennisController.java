package io.datajek.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TennisController {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String welcome() {
        return "main-menu";
    }
}
