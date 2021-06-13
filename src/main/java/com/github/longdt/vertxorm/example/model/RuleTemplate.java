package com.github.longdt.vertxorm.example.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.github.longdt.vertxorm.example.converter.ArgumentMapConverter;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.OffsetDateTime;
import java.util.Map;

@Entity
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class RuleTemplate {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @Convert(converter = ArgumentMapConverter.class)
    private Map<String, ArgumentDescription> arguments;
    private String flinkJob;
    private boolean active;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;

    public RuleTemplate() {
    }

    public Integer getId() {
        return id;
    }

    public RuleTemplate setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public RuleTemplate setName(String name) {
        this.name = name;
        return this;
    }

    public Map<String, ArgumentDescription> getArguments() {
        return arguments;
    }

    public RuleTemplate setArguments(Map<String, ArgumentDescription> arguments) {
        this.arguments = arguments;
        return this;
    }

    public String getFlinkJob() {
        return flinkJob;
    }

    public RuleTemplate setFlinkJob(String flinkJob) {
        this.flinkJob = flinkJob;
        return this;
    }

    public boolean getActive() {
        return active;
    }

    public RuleTemplate setActive(boolean active) {
        this.active = active;
        return this;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public RuleTemplate setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public RuleTemplate setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return "RuleTemplate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", arguments=" + arguments +
                ", flinkJob='" + flinkJob + '\'' +
                ", active=" + active +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
