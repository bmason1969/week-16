package com.promineotech.jeep.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Component
@Service
public class DefaultJeepSalesDao implements JeepSalesDao {
  Logger log = LoggerFactory.getLogger(getClass());
    @Override
    public List<Jeep> fetchJeeps(JeepModel model, String trim) {
      log.info("DAO: model={}, trim={}", model, trim);
       
 // @formatter:off
    String sql = "" 
        + "SELECT * "
        + "FROM models "
        + "WHERE model_id = :model_id AND trim_level = :trim_level";
    // @formatter:on
    
    return null;
    
    
  }

}
