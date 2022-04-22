package edu.fpdual.jdbc.ejemplojdbc.manager.impl;

import edu.fpdual.jdbc.ejemplojdbc.dao.City;
import edu.fpdual.jdbc.ejemplojdbc.dao.CountryLanguage;
import edu.fpdual.jdbc.ejemplojdbc.manager.CountryLanguageManager;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class CountryLanguageManagerImpl implements CountryLanguageManager {
    @Override
    public Set<CountryLanguage> findAllLanguages(Connection con) throws SQLException {
        try(Statement stm = con.createStatement()){

            ResultSet result = stm.executeQuery("SELECT * FROM world.countrylanguage ");

            return queryResult(result);
        }
    }

    @Override
    public Set<CountryLanguage> findLanguageByName(Connection con, String language) throws SQLException {
        try(PreparedStatement prepstm = con.prepareStatement("SELECT * FROM world.countrylanguage" +
                "WHERE countrylanguage.Language = ?")){

            prepstm.setString(1, language);

            ResultSet result = prepstm.executeQuery();
            return queryResult(result);
        }
    }

    @Override
    public Set<CountryLanguage> findLanguageByCountry(Connection con, String countryCode) throws SQLException {
        try(PreparedStatement prepstm = con.prepareStatement("SELECT * FROM world.countrylanguage" +
                "WHERE countrylanguage.CountryCode = ?")){

            prepstm.setString(1, countryCode);

            ResultSet result = prepstm.executeQuery();
            return queryResult(result);
        }
    }

    @Override
    public Set<CountryLanguage> updateLanguage(Connection con, String newLanguage, String countryCode, boolean isOfficial, float percentage) throws SQLException {
        try(PreparedStatement prepstm = con.prepareStatement("UPDATE world.countrylanguage SET Language = ?. CountryCode = ?, IsOfficial = ?, Percentage = ?" +
                "WHERE countrylanguage.CountryCode = ?")){

            prepstm.setString(1, newLanguage);
            prepstm.setString(2, countryCode);
            prepstm.setBoolean(3, isOfficial);
            prepstm.setFloat(4, percentage);
            prepstm.setString(5, countryCode);

            ResultSet result = prepstm.executeQuery();
            return queryResult(result);
        }
    }

    @Override
    public Set<CountryLanguage> newLanguage(Connection con, String newLanguage, String countryCode, boolean isOfficial, float percentage) throws SQLException {
        try(PreparedStatement prepstm = con.prepareStatement("INSERT INTO world.countrylanguage" +
                "VALUES(?,?,?,?;?)")){

            prepstm.setString(1, newLanguage);
            prepstm.setString(2, countryCode);
            prepstm.setBoolean(3, isOfficial);
            prepstm.setFloat(4, percentage);
            prepstm.setString(5, countryCode);

            ResultSet result = prepstm.executeQuery();
            return queryResult(result);
        }
    }

    @Override
    public Set<CountryLanguage> deleteLanguage(Connection con, String countryCode, String language) throws SQLException {
        try(PreparedStatement prepstm = con.prepareStatement("DELETE FROM world.countrylanguage" +
                "WHERE CountryCode = ? AND Language = ?")){

            prepstm.setString(1, countryCode);
            prepstm.setString(2, language);
            ResultSet result = prepstm.executeQuery();
            return queryResult(result);
        }
    }

    public Set<CountryLanguage> queryResult (ResultSet result) throws SQLException {

        Set<CountryLanguage> countryLanguageSet = new HashSet<>();
        result.beforeFirst();
        while (result.next()) {
            CountryLanguage countryLanguage = new CountryLanguage(result);
            countryLanguageSet.add(countryLanguage);
        }

        return countryLanguageSet;
    }
}
