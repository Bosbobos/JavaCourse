package io.datajek.springmvc;

import io.datajek.tennisplayername.Player;
import io.datajek.tennisplayername.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String processForm(@RequestParam(defaultValue = "hehe") String playerName,
                              Model model) {
        Player player = service.getPlayerByName(playerName);
        model.addAttribute("country", player.getNationality());
        model.addAttribute("dob", player.getBirthDate());
        model.addAttribute("titles", player.getTitles());
        model.addAttribute("name", playerName);
        return "player-detail";
    }
}
