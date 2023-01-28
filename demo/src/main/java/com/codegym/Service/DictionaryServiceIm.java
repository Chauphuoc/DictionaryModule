package com.codegym.Service;

import com.codegym.Dao.DictionaryDao;
import com.codegym.Model.Dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictionaryServiceIm {
    @Autowired
    private DictionaryDao dictionaryDao;
    public List<Dictionary> getAlldictionary() {
        List<Dictionary> dictionaries = dictionaryDao.getAlldictionary();
        return dictionaries;
    }
}
