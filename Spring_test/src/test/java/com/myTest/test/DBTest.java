package com.myTest.test;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myTest.test.config.WebConfig;

import lombok.extern.log4j.Log4j;
import oracle.jdbc.OracleDriver;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {WebConfig.class})
@Log4j
public class DBTest {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "scott";
	private static final String PASSWORD = "tiger";
	

	/*
	 * @Test public void testConnection() { Connection conn = null;
	 * 
	 * try { DriverManager.registerDriver(new OracleDriver());
	 * DriverManager.getConnection(URL, USER, PASSWORD);
	 * 
	 * } catch (SQLException e) { e.printStackTrace(); } }
	 */
	
	
}
