package dao;

import jdk.jshell.spi.ExecutionControl;
import model.Place;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class PlaceDAO extends BaseDAO<Place>{
    public PlaceDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(Place element) throws ExecutionControl.NotImplementedException, SQLException {
        request = "INSERT INTO place (name, address, capacity, event_id) values (?,?,?,?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, element.getName());
        statement.setString(2, element.getAddress());
        statement.setInt(3, element.getCapacity());
        statement.setInt(4, element.getEventId());
        int nbRow = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if(resultSet.next()) element.setId(resultSet.getInt(1));
        return nbRow == 1;
    }

    @Override
    public Place getById(int id) throws ExecutionControl.NotImplementedException, SQLException {
        return null;
    }

    @Override
    public List<Place> getAll() throws ExecutionControl.NotImplementedException, SQLException {
        return null;
    }

    @Override
    public boolean update(Place element) throws ExecutionControl.NotImplementedException, SQLException {
        return false;
    }

    @Override
    public boolean delete(int id) throws ExecutionControl.NotImplementedException, SQLException {
        return false;
    }
}
