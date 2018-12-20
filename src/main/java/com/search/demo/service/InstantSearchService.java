package com.search.demo.service;

import com.search.demo.data.DataSource;
import com.search.demo.model.GeneralizedSuffixTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class InstantSearchService {

    @Autowired
    DataSource inputDataSource;

    @Autowired
    GeneralizedSuffixTree tree;

    public String[] getMatchingStrings(String key) {
        Collection<Integer> indices = tree.search(key);
        String[] resultStrings = new String[indices.size()];
        int count = 0;
        for (Integer i : indices) {
            resultStrings[count] = inputDataSource.getDataSource()[i];
            count++;
        }
        return resultStrings;
    }
}
