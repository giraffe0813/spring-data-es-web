package com.ymy.springdata.es.web.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;


/**
 * Created by yemengying on 16/1/10.
 */


@Document(indexName= "book", type= "book", indexStoreType = "memory", shards = 1, replicas = 0, refreshInterval = "-1")
public class Book {

    @Id
    private String id;
    @Field(type = FieldType.String)
    private String name;
    @Field
    private Long price;
    @Version
    private Long version;

    public Book(){}

    public Book(String id, String name,Long version) {
        this.id = id;
        this.name = name;
        this.version = version;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }
}
