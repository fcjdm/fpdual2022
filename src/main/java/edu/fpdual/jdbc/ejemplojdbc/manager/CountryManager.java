package edu.fpdual.jdbc.ejemplojdbc.manager;

import edu.fpdual.jdbc.ejemplojdbc.dao.City;
import edu.fpdual.jdbc.ejemplojdbc.dao.Country;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Set;

public interface CountryManager {
    Set<Country> findAllCountries(Connection con) throws SQLException;
    public Set<Country> findCountryByName(Connection con, String countryName) throws SQLException;
    public Set<Country> findCountryByNameStartingWith(Connection con, String countryName) throws SQLException;
    public Set<Country> findCountryByNameEndingWith(Connection con, String countryName) throws SQLException;
    public int updateCountryName(Connection con, String code, String newName) throws SQLException;
    public int insertNewCountry(Connection con, String code, String name, String continent, String region,
    float surfaceArea, int indepYear, BigInteger population, float lifeExpectancy, float gnp, float gnpold,
                                String localName, String govermentForm, String headOfState, int capital, String code2) throws SQLException;
    public int deleteCountry(Connection con, String code) throws SQLException;

}
