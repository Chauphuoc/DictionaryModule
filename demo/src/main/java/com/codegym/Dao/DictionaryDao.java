package com.codegym.Dao;

import com.codegym.Model.Dictionary;
import com.codegym.Model.MapperDictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DictionaryDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Dictionary> getAlldictionary() {
        String query = "select * from dictionary";
        MapperDictionary mapperDictionary = new MapperDictionary();
        List<Dictionary> dictionaries = jdbcTemplate.query(query, mapperDictionary);
        return dictionaries;
    }
}
