package edu.fpdual.jdbc.ejemplojdbc.manager;

import edu.fpdual.jdbc.ejemplojdbc.dao.City;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Set;

/**
 * Interface that contains all query to city entity.
 * @author jose.m.prieto.villar
 */
public interface CityManager {

    /**
     * Find all cities of a country between a range of population
     * @param countryCode the country code
     * @param startLimit the start limit of the range
     * @param endLimit the end limit of the range
     * @return {@code Set} of {@code City}
     */
    public Set<City> findCityByCountryCodeBetweenPopulation(Connection con, String countryCode, int startLimit, int endLimit) throws SQLException;
    public Set<City> findAllCities(Connection con) throws SQLException;
    public Set<City> findCityByName(Connection con, String cityName) throws SQLException;
    public Set<City> findCityByNameStartingWith(Connection con, String cityName) throws SQLException;
    public Set<City> findCityByNameEndingWith(Connection con, String cityName) throws SQLException;
    public int updateCity(Connection con, int id, String newName) throws SQLException;
    public int insertNewCity(Connection con, String cityName, String countryCode, String cityDistrict, BigInteger population) throws SQLException;
    public int deleteCity(Connection con, int id) throws SQLException;
}
