package edu.fpdual.jdbc.ejemplojdbc.manager;

import edu.fpdual.jdbc.ejemplojdbc.dao.CountryLanguage;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Set;

public interface CountryLanguageManager {

    public Set<CountryLanguage> findAllLanguages(Connection con) throws SQLException;
    public Set<CountryLanguage> findLanguageByName(Connection con, String language) throws SQLException;
    public Set<CountryLanguage> findLanguageByCountry(Connection con, String countryCode) throws SQLException;
    public Set<CountryLanguage> updateLanguage(Connection con,String newLanguage, String countryCode, boolean isOfficial, float percentage) throws SQLException;
    public Set<CountryLanguage> newLanguage(Connection con,String newLanguage, String countryCode, boolean isOfficial, float percentage) throws SQLException;
    public Set<CountryLanguage> deleteLanguage(Connection con, String countryCode, String language) throws SQLException;

}
