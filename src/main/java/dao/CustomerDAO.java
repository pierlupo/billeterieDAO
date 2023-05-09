package dao;

import jdk.jshell.spi.ExecutionControl;
import model.Customer;

import java.sql.Array;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class CustomerDAO extends BaseDAO<Customer>{
    public CustomerDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(Customer element) throws ExecutionControl.NotImplementedException, SQLException {
        request = "INSERT INTO customer (first_name, last_name, email, number_of_tickets) values (?,?,?,?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, element.getFirstName());
        statement.setString(2, element.getLastName());
        statement.setString(3, element.getEmail());
        statement.setObject(4, element.getNumOfTicketsBought());
        int nbRow = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if(resultSet.next()) element.setId(resultSet.getInt(1));
        return nbRow == 1;
    }

    @Override
    public Customer getById(int id) throws ExecutionControl.NotImplementedException, SQLException {
        return null;
    }

    @Override
    public List<Customer> getAll() throws ExecutionControl.NotImplementedException, SQLException {
        return null;
    }

    @Override
    public boolean update(Customer element) throws ExecutionControl.NotImplementedException, SQLException {
        return false;
    }

    @Override
    public boolean delete(int id) throws ExecutionControl.NotImplementedException, SQLException {
        return false;
    }
}
