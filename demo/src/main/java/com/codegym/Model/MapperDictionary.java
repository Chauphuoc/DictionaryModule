package com.codegym.Model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MapperDictionary implements RowMapper<Dictionary> {
    @Override
    public Dictionary mapRow(ResultSet rs, int rowNum) throws SQLException {
        Dictionary dictionary = new Dictionary();
        dictionary.setId(rs.getInt("id"));
        dictionary.setEnglish(rs.getString("english"));
        dictionary.setVietnam(rs.getString("vietnam"));
        return dictionary;
    }
}
