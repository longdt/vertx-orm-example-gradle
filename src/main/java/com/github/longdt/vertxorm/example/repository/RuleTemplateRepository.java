package com.github.longdt.vertxorm.example.repository;


import com.github.longdt.vertxorm.annotation.Repository;
import com.github.longdt.vertxorm.example.model.RuleTemplate;
import com.github.longdt.vertxorm.repository.CrudRepository;

@Repository
public interface RuleTemplateRepository extends CrudRepository<Integer, RuleTemplate> {
}
