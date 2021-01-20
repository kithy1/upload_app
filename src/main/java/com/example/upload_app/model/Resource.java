package com.example.upload_app.model;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "posts_json")
@TypeDefs( {@TypeDef( name= "StringJsonObject", typeClass = StringJsonUserType.class)})
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Type(type = "StringJsonObject")
    private String data;

    public Resource(String data) {
        this.data = data;
    }

    public Resource() {
    }
}
