package inclassdemo;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class CityLister {

    public static void main(String[] args) {
        // Datasource
        BasicDataSource usaDataSource = new BasicDataSource();
        usaDataSource.setUrl("jdbc:postgresql://localhost:5432/UnitedStates");
        usaDataSource.setUsername("postgres");
        usaDataSource.setPassword("postgres1");

        // JDBCTemplate
        JdbcTemplate jdbcTemplate = new JdbcTemplate(usaDataSource);
        String sql =
                "SELECT city_name, population AS num_folks "+
                        "FROM city "+
                        "WHERE state_abbreviation = ? " +
                        "ORDER BY city.city_name ; ";

        SqlRowSet sqlResult = jdbcTemplate.queryForRowSet(sql, "NY");

        // SQLRowset
        while(sqlResult.next()){
            String city = sqlResult.getString("city_name");
            int population = sqlResult.getInt("num_folks");
            System.out.println(city + ", " + population);
        }
    }

}
