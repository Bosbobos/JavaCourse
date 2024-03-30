package io.datajek.springmvc;

import io.datajek.tennisplayername.Athlete;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/player")
public class AthleteController {
    @RequestMapping("/showPlayerForm")
    public String showForm(Model model) {
        model.addAttribute("athlete", new Athlete()); //Can be written shorter as shown below
        return "add-player-form";
    }

    @RequestMapping("/processPlayerForm")
    public static String processForm(@ModelAttribute("athlete") Athlete myAthlete){
        return "player-confirmation";
    }
}
