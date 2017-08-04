package com.lionsshareweb.customer.repository;

import com.lionsshareweb.aggregate.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface CustomerRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
}
