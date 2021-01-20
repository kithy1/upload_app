package com.example.upload_app.controller;

import com.example.upload_app.model.Resource;
import com.example.upload_app.service.ResourceService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/resource")
public class MainController {

    private final ResourceService resourceService;

    public MainController(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    @PostMapping
    public void storeResource(@RequestBody String resourceContent) {
        Resource resource = new Resource(resourceContent);
        resourceService.saveResource(resource);
    }
}
