package com.numbergame.beans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigurationRepository extends JpaRepository<ConfigurationTable, Long>{
    boolean existsById(String propiedadId);

    ConfigurationTable findById(String propiedadId);
}