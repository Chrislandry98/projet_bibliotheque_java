import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialisez la connexion à la base de données
            DBconnection db = new DBconnection();
            db.initialize("jdbc:postgresql://127.0.0.1:5432/bibliotheque", "postgres", "postgres");

            FichierMenus.menuChoice();

            // Fermez la connexion à la fin
            DBconnection.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
