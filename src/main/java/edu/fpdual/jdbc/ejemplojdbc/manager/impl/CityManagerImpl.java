package edu.fpdual.jdbc.ejemplojdbc.manager.impl;

import edu.fpdual.jdbc.ejemplojdbc.dao.City;
import edu.fpdual.jdbc.ejemplojdbc.manager.CityManager;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.ConnectException;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class CityManagerImpl implements CityManager {


    @Override
    public Set<City> findCityByCountryCodeBetweenPopulation(Connection con, String countryCode, int startLimit, int endLimit) throws SQLException {
        try(PreparedStatement prepstm = con.prepareStatement("SELECT * FROM world.city " +
                    "where CountryCode = ? AND Population BETWEEN ? AND ?")) {

            prepstm.setString(1, countryCode);
            prepstm.setInt(2, startLimit);
            prepstm.setInt(3, endLimit);

            ResultSet result = prepstm.executeQuery();

            return queryResult(result);
        }
    }

    @Override
    public Set<City> findAllCities(Connection con) throws SQLException {
        try(Statement stm = con.createStatement()){

            ResultSet result = stm.executeQuery("SELECT * FROM world.city ");

            return queryResult(result);
        }
    }

    @Override
    public Set<City> findCityByName(Connection con, String cityName) throws SQLException {
        try(PreparedStatement prepstm = con.prepareStatement("SELECT * FROM world.city" +
                "WHERE city.Name LIKE ?")){

            prepstm.setString(1, cityName);

            ResultSet result = prepstm.executeQuery();
            return queryResult(result);
        }
    }

    @Override
    public Set<City> findCityByNameStartingWith(Connection con, String cityName) throws SQLException {
        try(PreparedStatement prepstm = con.prepareStatement("SELECT * FROM world.city" +
                "WHERE city.Name LIKE ?%")){

            prepstm.setString(1, cityName);

            ResultSet result = prepstm.executeQuery();
            return queryResult(result);
        }
    }

    @Override
    public Set<City> findCityByNameEndingWith(Connection con, String cityName) throws SQLException {
        try(PreparedStatement prepstm = con.prepareStatement("SELECT * FROM world.city" +
                "WHERE city.Name LIKE %?")){

            prepstm.setString(1, cityName);

            ResultSet result = prepstm.executeQuery();
            return queryResult(result);
        }
    }

    @Override
    public int updateCity(Connection con, int id, String newName) throws SQLException {
        try(PreparedStatement prepstm = con.prepareStatement("UPDATE world.city SET Name = ?" +
                "WHERE ID = ?")){

            prepstm.setString(1, newName);
            prepstm.setInt(2, id);

            int result = prepstm.executeUpdate();
            return result;
        }
    }

    @Override
    public int insertNewCity(Connection con, String cityName, String countryCode, String cityDistrict, BigInteger population) throws SQLException{
        try(PreparedStatement prepstm = con.prepareStatement("INSERT INTO world.city (Name, CountyCode, District, Population" +
                "VALUES (?, ?, ?, ?)")){

            prepstm.setString(1, cityName);
            prepstm.setString(2, countryCode);
            prepstm.setString(3, cityDistrict);
            prepstm.setBigDecimal(4, new BigDecimal(population));

            int result = prepstm.executeUpdate();
            return result;
        }
    }

    @Override
    public int deleteCity(Connection con, int id) throws SQLException {
        try(PreparedStatement prepstm = con.prepareStatement("DELETE FROM world.city" +
                "WHERE city.ID = ?")){

            prepstm.setInt(1, id);

            int result = prepstm.executeUpdate();
            return result;
        }
    }

    public Set<City> queryResult (ResultSet result) throws SQLException {

        Set<City> citySet = new HashSet<>();
        result.beforeFirst();
        while (result.next()) {
            City city = new City(result);
            citySet.add(city);
        }

        return citySet;
    }
}
