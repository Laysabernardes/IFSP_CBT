import java.util.*;
import java.sql.*;
//Laysa e Lucas
public class EmpDao {

    public static Connection getConnection() {
        Connection con = null;
        try {
            String dbDriver = "com.mysql.cj.jdbc.Driver";
            String dbURL = "jdbc:mysql://localhost:3306/tp1?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=America/Sao_Paulo";
            String dbUsername = "Laysa";
            String dbPassword = "Teste123";
            Class.forName(dbDriver);
            con = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
        } catch (Exception e) {
            System.out.println("Erro ao conectar com o banco: " + e.getMessage());
        }
        return con;
    }

    public static int save(Emp e) {
        int status = 0;
        try {
            Connection con = EmpDao.getConnection();
            if (con != null) {
                PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO user905(name, password, email, country) VALUES (?, ?, ?, ?)"
                );
                ps.setString(1, e.getName());
                ps.setString(2, e.getPassword());
                ps.setString(3, e.getEmail());
                ps.setString(4, e.getCountry());

                status = ps.executeUpdate();
                con.close();
            } else {
                System.out.println("Conexão nula no método save");
            }
        } catch (Exception ex) {
            System.out.println("Erro ao salvar: " + ex.getMessage());
            ex.printStackTrace();
        }
        return status;
    }

    public static int update(Emp e) {
        int status = 0;
        try {
            Connection con = EmpDao.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "UPDATE user905 SET name=?, password=?, email=?, country=? WHERE id=?"
            );
            ps.setString(1, e.getName());
            ps.setString(2, e.getPassword());
            ps.setString(3, e.getEmail());
            ps.setString(4, e.getCountry());
            ps.setInt(5, e.getId());

            status = ps.executeUpdate();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return status;
    }

    public static int delete(int id) {
        int status = 0;
        try {
            Connection con = EmpDao.getConnection();
            PreparedStatement ps = con.prepareStatement("DELETE FROM user905 WHERE id=?");
            ps.setInt(1, id);

            status = ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    public static Emp getEmployeeById(int id) {
        Emp e = new Emp();
        try {
            Connection con = EmpDao.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM user905 WHERE id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setPassword(rs.getString("password"));
                e.setEmail(rs.getString("email"));
                e.setCountry(rs.getString("country"));
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return e;
    }

    public static List<Emp> getAllEmployees() {
        List<Emp> list = new ArrayList<>();
        try {
            Connection con = EmpDao.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM user905");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Emp e = new Emp();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setPassword(rs.getString("password"));
                e.setEmail(rs.getString("email"));
                e.setCountry(rs.getString("country"));
                list.add(e);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    // Método auxiliar para testar a conexão
    public static void testConnection() {
        try {
            Connection con = getConnection();
            if (con != null) {
                System.out.println("Conexão OK!");
                con.close();
            } else {
                System.out.println("Falha na conexão.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método main apenas para teste
    public static void main(String[] args) {
        testConnection();
    }
}
