package dao;

import jdk.jshell.spi.ExecutionControl;
import model.Event;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class EventDAO extends BaseDAO<Event>{
    public EventDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(Event element) throws ExecutionControl.NotImplementedException, SQLException {
        request = "INSERT INTO event (name, date, hour, place, price, number_of_tickets_sold, customer_id) values (?,?,?,?,?,?,?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, element.getName());
        statement.setString(2, element.getDate());
        statement.setString(3, element.getHour());
        statement.setString(4, String.valueOf(element.getPlace()));
        statement.setFloat(5, element.getPrice());
        statement.setInt(6, element.getNumOfTicketsSold());
        statement.setInt(7, element.getCustomerId());
        int nbRow = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if(resultSet.next()) {
            element.setId(resultSet.getInt(1)) ;
        }
        return nbRow == 1;
    }

    @Override
    public Event getById(int id) throws ExecutionControl.NotImplementedException, SQLException {
        return null;
    }

    @Override
    public List<Event> getAll() throws ExecutionControl.NotImplementedException, SQLException {
        return null;
    }

    @Override
    public boolean update(Event element) throws ExecutionControl.NotImplementedException, SQLException {
        return false;
    }

    @Override
    public boolean delete(int id) throws ExecutionControl.NotImplementedException, SQLException {
        return false;
    }
}
