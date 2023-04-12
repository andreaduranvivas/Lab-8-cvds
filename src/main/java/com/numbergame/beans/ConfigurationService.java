package com.numbergame.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ConfigurationService {
    private final ConfigurationRepository configurationRepository;
    @Autowired
    public ConfigurationService(ConfigurationRepository configurationRepository){
        this.configurationRepository = configurationRepository;
    }
    public ConfigurationTable addConfiguration(ConfigurationTable configurationTable){
        return configurationRepository.save(configurationTable);
    }
    public ConfigurationTable getConfiguration (String propiedadId){
        return configurationRepository.findById(propiedadId);
    }
    public List<ConfigurationTable> getAllConfiguration(){
        return configurationRepository.findAll();
    }
    public ConfigurationTable updateConfiguration(ConfigurationTable configurationTable){
        if(configurationRepository.existsById(configurationTable.getId())){
            return configurationRepository.save(configurationTable);
        }
        return null;
    }

    public void deleteConfiguration(Long configurationId){
        configurationRepository.deleteById(configurationId);
    }

}
