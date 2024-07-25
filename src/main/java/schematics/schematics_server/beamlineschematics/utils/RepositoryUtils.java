package schematics.schematics_server.beamlineschematics.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RepositoryUtils {

    private RepositoryUtils() {
        throw new UnsupportedOperationException("RepositoryUtils is a utility class and cannot be instantiated");
    }

    public static Double getNullableDouble(ResultSet rs, String columnName) throws SQLException {
        double value = rs.getDouble(columnName);
        return rs.wasNull() ? null : value;
    }
}
