package Repositories;

import Config.MySQLConnection;

import java.sql.*;

public class ChildRepository {


    private Connection con;

    public ChildRepository() {
        MySQLConnection msc = new MySQLConnection();
        this.con = msc.create();
    }

    public void createChild(int cprNrID, int dateOfEntry, String childFirstName, String childLastName, String location, String childrenInfo)throws SQLException {
        String sql ="INSERT INTO childrenTable(cprNrID, dateOfEntry, childFirstName, childLastName, location, childrenInfo)"+"VALUES (?,?,?,?,?,?)";
        //A SQL statement is precompiled and stored in a PreparedStatement object. This object can then be used to efficiently execute this statement multiple times.
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setInt(1,cprNrID);
        preparedStatement.setInt(2,dateOfEntry);
        preparedStatement.setString(3,childFirstName);
        preparedStatement.setString(4,childLastName);
        preparedStatement.setString(5,location);
        preparedStatement.setString(6,childrenInfo);
        preparedStatement.execute();
        preparedStatement.close();
    }

    //Execute a query
    public ResultSet readChildren() throws SQLException {
        String sql = "SELECT * FROM rfb.childrentable";
        Statement stmt = con.createStatement();
        try {
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateChild(int dateOfEntry, String childFirstName, String childLastName, String location, String childrenInfo, int cprNrID) throws SQLException {
        String sql = "UPDATE rfb.childrentable SET dateOfEntry=?, childFirstName=?, childLastName=?, location=?, childrenInfo=? WHERE cprNrID=?";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setInt(1,dateOfEntry);
        preparedStatement.setString(2,childFirstName);
        preparedStatement.setString(3,childLastName);
        preparedStatement.setString(4,location);
        preparedStatement.setString(5,childrenInfo);
        preparedStatement.setInt(6,cprNrID);
        preparedStatement.execute();
        preparedStatement.close();
    }

    public void deleteChild(int cprNrID) throws SQLException {
        String sql = "DELETE FROM rfb.childrentable WHERE cprNrID=?";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setInt(1,cprNrID);
        preparedStatement.execute();
        preparedStatement.close();
    }
}
