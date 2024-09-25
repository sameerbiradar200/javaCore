package jdbcPostgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgresqlOne {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/name";
        String user = "postgres";
        String password = "sameer";
        try(Connection con = DriverManager.getConnection(url,user,password)) {
            if(con !=null){
                System.out.println("database connection is right");
                Statement statement =con.createStatement();
                String createTable = "CREATE TABLE IF NOT EXISTS name (" +
                        "id SERIAL PRIMARY KEY, " + // Optionally keep this if you want a unique identifier
                        "name VARCHAR(50) NOT NULL, " +
                        "age INT NOT NULL)";


                statement.execute(createTable);
                System.out.println("Table 'name' created or already exists.");

                String addData ="INSERT INTO name (name, age) "
                        + "VALUES ('sameer biradar', 23), "
                        + "('ovi biradar', 11), "
                        + "('rahee biradar', 19)";

                statement.execute(addData);
                System.out.println("data added in name DB");

                //for printing data from name DB

                String select ="SELECT * FROM name";
                ResultSet resultSet =statement.executeQuery(select);

                while (resultSet.next()){
                    int id =resultSet.getInt("id");
                    String name =resultSet.getString("name");
                    int age =resultSet.getInt("age");
                    System.out.printf("Name : %name \n Id: %d  Age : %d%n",id,name,age);//hi
                }




            }else{
                System.out.println("failed to make connection");
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
