//22.10.2015 r., Robert Fidytek
//Przyklad demonstruje jak zapisac i odczytac dane z bazy danych SQLite

//Przygotowania:
/*
1. Pobierz sterownik do SQLite: https://bitbucket.org/xerial/sqlite-jdbc/downloads/
W moim przypadku jest to plik "sqlite-jdbc-3.7.2.jar" (stosunkowo szybki i zajmuje 3.1 MB)
2. Utworz nowy "Java Project" w Eclipse, kliknij na niego prawym przyciskiem, 
wybierz "Properties" i przejdz do zakladki "Java Build Path". 
Nastepnie w zakladce "Libraries" wybierz opcje "Add External Jar" i znajdz przed 
chwila ściagniety sterownik. U mnie jest to plik "sqlite-jdbc-3.7.2.jar".
*/

import java.sql.*;

public class JDBCTestSQLite {
	
	public static final String DRIVER = "org.sqlite.JDBC";
    public static final String DB_URL = "jdbc:sqlite:test1.db";
    
    private static Connection conn;
    private static Statement stmt;
	
    
	public static void main(String[] args) {

		//dodaje klase JDBC
	    try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            System.err.println("Brak sterownika JDBC");
            e.printStackTrace();
        }
	    
        //nawiazuje polaczenie z baza danych
        try {
            conn = DriverManager.getConnection(DB_URL);
            stmt = conn.createStatement();
        } catch (SQLException e) {
            System.err.println("Problem z otwarciem połączenia");
            e.printStackTrace();
        }
       
        //tworze tabele
        String createOsoba="CREATE TABLE IF NOT EXISTS osoba(id INTEGER PRIMARY KEY AUTOINCREMENT, imie VARCHAR(20))";
        try {
            stmt.execute(createOsoba);

        } catch (SQLException e) {
            System.err.println("Blad przy tworzeniu tabeli");
            e.printStackTrace();
        }
       
        //dodaje przykladowe osoby
        String sql;
        try {
        	sql="INSERT INTO osoba (imie) VALUES ('Jan');";
            stmt.execute(sql);
        	sql="INSERT INTO osoba (imie) VALUES ('Jerzy');";
            stmt.execute(sql);
        	sql="INSERT INTO osoba (imie) VALUES ('Emil');";
            stmt.execute(sql);
        } catch (SQLException e) {
            System.err.println("Blad przy dodawaniu osoby");
            e.printStackTrace();
        }
       
        //wyswietlam zawartosc tabeli
        try {
            ResultSet result = stmt.executeQuery("SELECT * FROM osoba");
            int id;
            String imie;
            while(result.next()) {
                id = result.getInt("id");
                imie = result.getString("imie");
                System.out.println("id="+id+", imie="+imie);
            }
        } catch (SQLException e) {
            System.err.println("Blad przy wykonywaniu SELECT");
            e.printStackTrace();
        }
        
	}
}
