package com.alphasense.cloudconfiguration.repository;

import com.alphasense.cloudconfiguration.entity.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParameterRepository extends JpaRepository<Parameter, Integer> {
}
