package com.search.demo.cache;

import com.search.demo.data.DataSource;
import com.search.demo.model.GeneralizedSuffixTree;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TreeLoader {

    @Bean
    public DataSource inputDataSource(){
        String[] words = new String[] {"Terry	Wikivu	Jaqueminet",
                "Moise	Skajo	Desquesnes",
                "Winni	Gabtype	Woffinden",
                "Butch	Twimbo	Bosch",
                "Adamo	Trilith	Madders",
                "Midge	Divanoodle	Dowry",
                "Caldwell	Skajo	Portchmouth",
                "Alfi	Rhybox	Van der Mark",
                "Laurene	Centidel	Hukin",
                "Leandra	Cogilith	Lampard",
                "Carroll	Riffpedia	Pessel",
                "Blane	Fiveclub	Matis",
                "Britt	Meejo	Keyhoe",
                "Niall	Ozu	Sidney",
                "Tasha	Quire	Bilney"
        };
        DataSource dataSource = new DataSource();
        dataSource.setDataSource(words);
        return dataSource;
    }

    @Bean
    public GeneralizedSuffixTree loadTree() {
        GeneralizedSuffixTree tree = new GeneralizedSuffixTree();
        for (int i = 0; i < inputDataSource().getDataSource().length; ++i) {
            tree.put(inputDataSource().getDataSource()[i], i);
        }
        return tree;
    }
}
