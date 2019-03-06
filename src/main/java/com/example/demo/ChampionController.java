package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/path")
public class ChampionController {
    private ChampionRepo repo;

    public ChampionController(ChampionRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/add")
    public @ResponseBody String addNewChamp(@RequestParam(required = false, name="name") String name, @RequestParam(required = false, name="role") String role, @RequestParam(required=false,name="att") String att){
        Champion champ = new Champion();
        champ.setName("Nocturne");
        champ.setRole(role);
        champ.setAtt(att);
        repo.save(champ);
        return "Saved";
    }
    @GetMapping("/test")
    public String showDisplay(){
    long a = repo.count();
    String msg = "There is currently " + a + " champions in the database !";

    return  msg;
    }



}
