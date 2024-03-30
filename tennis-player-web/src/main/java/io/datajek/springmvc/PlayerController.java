package io.datajek.springmvc;

import io.datajek.tennisplayername.Player;
import io.datajek.tennisplayername.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PlayerController {
    @Autowired
    PlayerService service;
    @RequestMapping("/showPlayerForm")
    public String showForm () {
        return "search-player-form";
    }

    @RequestMapping("/processPlayerForm")
    public String processForm(HttpServletRequest request,
                              Model model) {
        String pName = request.getParameter("playerName");
        Player player = service.getPlayerByName(pName);
        model.addAttribute("country", player.getNationality());
        model.addAttribute("dob", player.getBirthDate());
        model.addAttribute("titles", player.getTitles());
        model.addAttribute("name", pName); // Can it be automated?????
        return "player-detail";
    }
}
