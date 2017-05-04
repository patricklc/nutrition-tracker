package org.launchcode.controllers;

import org.launchcode.models.List;
import org.launchcode.models.Search;
import org.launchcode.models.forms.SearchForm;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by Patrick on 4/20/2017.
 */
@Controller
public class SearchController {

    @RequestMapping(value="")
    public String displaySearchForm(Model model) {
        model.addAttribute(new SearchForm());
        model.addAttribute("title", "Search");
        return "search-list";
    }
    @RequestMapping(value="results")
    public String displaySearchResults(Model model
            , @ModelAttribute SearchForm searchForm
    ) {

        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.nal.usda.gov/ndb/search/?format=json&q={q}&sort=n&max=25&offset=0&api_key=baLegQMMRlZ8D82V5RiI29hTtDHNviv0YLu6El3D";

        String k = searchForm.getKeyword();
        Search search =
                restTemplate.getForObject(url, Search.class, k);
        model.addAttribute("title", "Search Results");
        model.addAttribute("search", search);
        return "search-list";
    }
}