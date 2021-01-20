package com.example.upload_app.service;

import com.example.upload_app.model.Resource;
import com.example.upload_app.repository.ResourceRepository;
import org.springframework.stereotype.Service;

@Service
public class ResourceService {

    private ResourceRepository repository;

    public ResourceService(ResourceRepository repository) {
        this.repository = repository;
    }

    public void saveResource(Resource resource) {
        repository.save(resource);
    }
}
