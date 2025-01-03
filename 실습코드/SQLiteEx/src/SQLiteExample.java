import java.sql.*;  // JDBC 관련 클래스를 사용하기 위해 import

public class SQLiteExample {
    public static void main(String[] args) {
        // SQLite 데이터베이스 파일 경로 (파일이 없으면 새로 생성됨)
        // "sample.db"는 데이터베이스 파일 이름. 파일이 존재하지 않으면 자동으로 생성
        String url = "jdbc:sqlite:sample.db";  // SQLite 데이터베이스 파일 경로

        try {
            // SQLite 드라이버를 로드하고 데이터베이스 연결을 설정
            // "DriverManager.getConnection(url)" 메서드를 사용하여 연결을 만들어줌
            Connection conn = DriverManager.getConnection(url);  // 데이터베이스에 연결

            // Statement 객체를 사용하여 SQL 쿼리를 실행할 준비
            // Statement는 SQL 쿼리 실행을 담당하는 객체
            Statement stmt = conn.createStatement();

            // 테이블을 생성하는 SQL 쿼리 실행
            stmt.execute("CREATE TABLE IF NOT EXISTS person (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT)");

            // 데이터 삽입
            stmt.execute("INSERT INTO person (name) VALUES ('Alice')");
            stmt.execute("INSERT INTO person (name) VALUES ('Bob')");

            // 데이터 조회
            // "SELECT * FROM person" 쿼리로 person 테이블에 있는 모든 데이터를 조회
            ResultSet rs = stmt.executeQuery("SELECT * FROM person");

            // 조회된 데이터 출력
            // ResultSet은 SQL 쿼리로 반환된 데이터를 포함하는 객체
            // rs.next()는 데이터가 있으면 true를 반환하고, 각 행을 읽어옴
            while (rs.next()) {
                // rs.getInt("id")는 id 열의 값을 가져옴
                // rs.getString("name")은 name 열의 값을 가져옴
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            }

            // 자원 해제
            // 데이터베이스 작업 후에는 자원을 명시적으로 해제해야 함
            // rs.close()는 ResultSet 객체를 닫고, stmt.close()는 Statement 객체를 닫고, conn.close()는 Connection 객체를 닫아줌
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}