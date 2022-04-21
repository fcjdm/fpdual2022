package edu.fpdual.jdbc.ejemplojdbc.manager;

import edu.fpdual.jdbc.ejemplojdbc.dao.City;

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

}
