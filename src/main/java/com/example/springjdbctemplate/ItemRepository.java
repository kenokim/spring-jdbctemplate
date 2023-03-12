package com.example.springjdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;

public class ItemRepository {
    private final JdbcTemplate template;

    public ItemRepository(DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource);
    }

    public Item save(Item item) {
        String sql = "insert into item (item_name, price, quantity) values (?, ?, ?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        template.update()
        return null;
    }
}
