package logic.dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by valeriakulikova on 30.03.17.
 */
public class DbTableCreator {
    public static void main(String[] args) {
        Connection c = null;
        Statement stmt = null;
        String sql = "";
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres", "3713059151");

            stmt = c.createStatement();

            sql = "CREATE SCHEMA IF NOT EXISTS JAVA_TASK ";
            stmt.executeUpdate(sql);

            sql = "CREATE TABLE IF NOT EXISTS JAVA_TASK.DIET "
                    + " ( "
                    + " ID                      SERIAL PRIMARY KEY     NOT NULL, "
                    + " NAME_OF_DIET            VARCHAR(32)            NOT NULL, "
                    + " TIME_OF_DIET                    INT            NOT NULL  "
                    + " ) ";
            stmt.executeUpdate(sql);

            sql = "CREATE TABLE IF NOT EXISTS JAVA_TASK.PRODUCT "
                    + " ( "
                    + " ID                      SERIAL PRIMARY KEY     NOT NULL, "
                    + " DIET_ID                 INT                 NOT NULL, "
                    + " BREAKFAST               VARCHAR(100)           NOT NULL, "
                    + " DINNER                  VARCHAR(500)           NOT NULL , "
                    + " SUPPER                  VARCHAR (500)           NOT NULL  "
                    + " ) ";
            stmt.executeUpdate(sql);


            stmt.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+ e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");

    }
    public void create() {

    }

}

