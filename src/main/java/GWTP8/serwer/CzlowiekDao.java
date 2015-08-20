package GWTP8.serwer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import GWTP8.shared.CzlowiekDto;

public class CzlowiekDao {
	// public static final String JDBC_DRIVER = "org.postgresql.Driver";
	// public static final String DB_URL =
	// "jdbc:postgresql://localhost:5433/cwiczenie2";
	// public static final String USER = "postgres";
	// public static final String PASS = "adminLWW";
	public void createCzlowiek(CzlowiekDto czlowiekDto) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("cwiczenie2");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		CzlowiekDto czlowiekDto2 = new CzlowiekDto(421L, "dfs", "dfs", "dfs", "dfs", "dfs", "dfs");
		Czlowiek czlowiekDto3 = new Czlowiek(421L, "dfs", "dfs", "dfs", "dfs", "dfs", "dfs");
		entityManager.getTransaction().begin();
		entityManager.persist(czlowiekDto);
		entityManager.persist(czlowiekDto3);
		entityManager.persist(czlowiekDto2);
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();

	}

}
//
//
//
//
// ////////////////////////// Sterownik /////////////////////////
//
// System.out.println("Sprawdzanie sterownika:");
// try {
// Class.forName("org.postgresql.Driver").newInstance();
// } catch (Exception e) {
// System.out.println("Blad przy ladowaniu sterownika bazy!");
// System.exit(1);
// }
// System.out.println("Sterownik OK");
//
// ////////////////////////// Otwieranie ////////////////////////
//
// java.sql.Connection polaczenie = null;
// try {
// polaczenie = DriverManager.getConnection(DB_URL, USER, PASS);
//
// } catch (SQLException e) {
// System.out.println("Blad przy ladowaniu sterownika bazy!");
// System.exit(1);
// }
// System.out.println("Polaczenie OK");
//
// /////////////////////////// Dzialania ////////////////////////
//
// Statement zapytania = null;
//
// try {
// polaczenie.setAutoCommit(false);
// zapytania = polaczenie.createStatement();
// zapytania.execute("INSERT INTO czlowiek(imie) VALUES(\"dsaas\");");
//
// polaczenie.commit();
// System.err.println("Insert zrobiony");
//
// } catch (SQLException e) {
//
// try {
// polaczenie.rollback();
// System.err.println(e.getMessage());
// System.err.println("transakcja cofnieta do poczatku");
//
// } catch (SQLException e1) {
// System.err.println("blad podczas robienia rolbacka");
// }
// }
//
// ////////////////////////// Zamykanie ////////////////////////
//
// System.out.println("Zamykanie polaczenia");
// try {
// zapytania.close();
// polaczenie.close();
// } catch (SQLException e) {
// System.out.println("Blad przy zamykaniu polaczenia " + e.toString());
// System.exit(4);
// }
// System.out.print("Zamkniecie OK");
//
// /////////////////////////////////////////////////////////////
// }
// SessionFactory sessionfactory = new
// Configuration().configure().buildSessionFactory();
// Session session = sessionfactory.openSession();
// Transaction transaction = session.beginTransaction();
//
// try {
//
// session.save(czlowiekDto);
//
// transaction.commit();
// System.err.println("Udalo sie");
//
// } catch (RuntimeException e) {
//
// try {
// transaction.rollback();
// System.err.println(e.getMessage());
// System.err.println("Nie udalo sie - ROLLBACK");
//
// } catch (RuntimeException rbe) {
// System.err.println("Nawet ROLLBACK sie zepsul");
//
// } finally {
// session.close();
// }
// }

// }
