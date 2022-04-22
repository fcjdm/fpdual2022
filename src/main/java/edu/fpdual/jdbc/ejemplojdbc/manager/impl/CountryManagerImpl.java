package edu.fpdual.jdbc.ejemplojdbc.manager.impl;

import edu.fpdual.jdbc.ejemplojdbc.dao.City;
import edu.fpdual.jdbc.ejemplojdbc.dao.Country;
import edu.fpdual.jdbc.ejemplojdbc.manager.CountryManager;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class CountryManagerImpl implements CountryManager {

    @Override
    public Set<Country> findAllCountries(Connection con) throws SQLException {
        try(Statement stm = con.createStatement()){

            ResultSet result = stm.executeQuery("SELECT * FROM world.country ");

            return queryResult(result);
        }
    }

    @Override
    public Set<Country> findCountryByName(Connection con, String countryName) throws SQLException {
        try(PreparedStatement prepstm = con.prepareStatement("SELECT * FROM world.country" +
                "WHERE country.Name LIKE ?")){

            prepstm.setString(1, countryName);

            ResultSet result = prepstm.executeQuery();
            return queryResult(result);
        }
    }

    @Override
    public Set<Country> findCountryByNameStartingWith(Connection con, String countryName) throws SQLException {
        try(PreparedStatement prepstm = con.prepareStatement("SELECT * FROM world.country" +
                "WHERE country.Name LIKE ?%")){

            prepstm.setString(1, countryName);

            ResultSet result = prepstm.executeQuery();
            return queryResult(result);
        }
    }

    @Override
    public Set<Country> findCountryByNameEndingWith(Connection con, String countryName) throws SQLException {
        try(PreparedStatement prepstm = con.prepareStatement("SELECT * FROM world.country" +
                "WHERE country.Name LIKE %?")){

            prepstm.setString(1, countryName);

            ResultSet result = prepstm.executeQuery();
            return queryResult(result);
        }
    }

    @Override
    public int updateCountryName(Connection con, String code, String newName) throws SQLException {
        try(PreparedStatement prepstm = con.prepareStatement("UPDATE world.country SET Name = ?" +
                "WHERE Code = ?")){

            prepstm.setString(1, newName);
            prepstm.setString(2, code);

            int result = prepstm.executeUpdate();
            return result;
        }
    }

    @Override
    public int insertNewCountry(Connection con, String code, String name, String continent, String region, float surfaceArea, int indepYear, BigInteger population, float lifeExpectancy, float gnp, float gnpold, String localName, String govermentForm, String headOfState, int capital, String code2) throws SQLException {
        try(PreparedStatement prepstm = con.prepareStatement("INSERT INTO world.country (Code,Name,Continent,Region,SurfaceArea,IndepYear,Population, LifeExpectancy, GNP, GNPOld, LocalName, GovermentForm, HeadOfState, Capital, Code2) " +
                " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)")){

            prepstm.setString(1, code);
            prepstm.setString(2, name);
            prepstm.setString(3, continent);
            prepstm.setString(4, region);
            prepstm.setFloat(5, surfaceArea);
            prepstm.setInt(6, indepYear);
            prepstm.setBigDecimal(7, new BigDecimal(population));
            prepstm.setFloat(8, lifeExpectancy);
            prepstm.setFloat(9, gnp);
            prepstm.setFloat(10, gnpold);
            prepstm.setString(11, localName);
            prepstm.setString(12, govermentForm);
            prepstm.setString(13, headOfState);
            prepstm.setInt(14, capital);
            prepstm.setString(15, code2);



            int result = prepstm.executeUpdate();
            return result;
        }
    }

    @Override
    public int deleteCountry(Connection con, String code) throws SQLException {
        try(PreparedStatement prepstm = con.prepareStatement("DELETE FROM world.country" +
                "WHERE Code = ?")){

            prepstm.setString(1, code);

            int result = prepstm.executeUpdate();
            return result;
        }
    }

    public Set<Country> queryResult (ResultSet result) throws SQLException {

        Set<Country> countrySet = new HashSet<>();
        result.beforeFirst();
        while (result.next()) {
            Country country = new Country(result);
            countrySet.add(country);
        }

        return countrySet;
    }

}

