package com.javatechie.moviecatalogservice.controller;

import com.javatechie.moviecatalogservice.model.CatalogItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

    @GetMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){

        return Collections.singletonList(
                new CatalogItem("Avengers","Mavel Movie",4.5)
        );

    }

}
