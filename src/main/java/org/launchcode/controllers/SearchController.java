package org.launchcode.controllers;

import org.launchcode.models.List;
import org.launchcode.models.Search;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;


/**
 * Created by Patrick on 4/20/2017.
 */
@Controller
public class SearchController {


    @RequestMapping
    public String displaySearchFoods(Model model, RestTemplate restTemplate) {
        Search search = restTemplate.getForObject("https://api.nal.usda.gov/ndb/search/?format=json&q=butter&sort=n&max=25&offset=0&api_key=DEMO_KEY", Search.class);
        model.addAttribute("title", "Search Results");
        model.addAttribute("search", search);
        return "search/list";
    }
}
