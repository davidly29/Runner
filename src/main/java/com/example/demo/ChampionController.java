package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/path")
public class ChampionController {
    private ChampionRepo repo;

    public ChampionController(ChampionRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/add")
    public @ResponseBody String addNewChamp(@RequestParam(required = false, name="name") String name, @RequestParam(required = false, name="role") String role, @RequestParam(required=false,name="att") String att){
        Champion champ = new Champion();
        champ.setName("Key");
        champ.setRole(role);
        champ.setAtt(att);

        repo.save(champ);
        return "Saved";
    }
}
