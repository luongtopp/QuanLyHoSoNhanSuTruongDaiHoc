package UTT.DAO;

import UTT.Connection.JdbcHelper;
import static UTT.Connection.JdbcHelper.executeUpdate;
import static UTT.Connection.JdbcHelper.preparedStatement;
import UTT.Model.KyLuat;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author luongtopp
 */
public class KyLuatDAO {

    public List<KyLuat> hienThiKyLuat() {
        String sql = "SELECT * FROM kyluat";
        return timKyLuat(sql);
    }

    public List<KyLuat> hienThiKyLuat(String timKiem) {
        String sql = "SELECT * FROM kyluat WHERE makyluat = ?";
        return timKyLuat(sql, timKiem);
    }

    public void themKyLuat(String maKyLuat, String maCanBo,
            Date namKyLuat, String hinhThucKyLuat, Object... args)
            throws SQLException {

        String sql = """
                 INSERT INTO
                           kyluat (makyluat, macanbo, namkyluat, hinhthuckyluat)
                       VALUES
                           (?, ?, ?, ?)
                     """;

        try (PreparedStatement pstmt = preparedStatement(sql, maKyLuat,
                maCanBo, namKyLuat, hinhThucKyLuat)) {
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " row(s) affected.");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void suaKyLuat(int id, String maKyLuat, String maCanBo,
            Date namKyLuat, String hinhThucKyLuat, Object... args)
            throws SQLException {

        String sql = """
                     UPDATE kyluat
                     SET
                     makyluat = ?,
                     macanbo = ?,
                     namkyluat = ?,
                     hinhthuckyluat = ?
                     WHERE id = ?;
                     """;
        executeUpdate(sql, maKyLuat,
                maCanBo, namKyLuat, hinhThucKyLuat, id);

    }

    public void xoaKyLuat(int id, Object... args) throws SQLException {
        String sql = """
                      DELETE FROM kyluat WHERE id = ?
                     """;
        try {
            executeUpdate(sql, id);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private List<KyLuat> timKyLuat(String sql, Object... args) {
        List<KyLuat> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);

                while (rs.next()) {
                    KyLuat kyLuat = layDuLieuTuBangKyLuat(rs);
                    list.add(kyLuat);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private KyLuat layDuLieuTuBangKyLuat(ResultSet rs) throws SQLException {
        KyLuat kyLuat = new KyLuat();
        kyLuat.setId(rs.getInt("id"));
        kyLuat.setMaKyLuat(rs.getNString("makyluat"));
        kyLuat.setMaCanBo(rs.getNString("macanbo"));
        kyLuat.setNamKyLuat(rs.getDate("namkyluat"));
        kyLuat.setHinhThucKyLuat(rs.getNString("hinhthuckyluat"));
      
        return kyLuat;
    }

    public static void main(String[] args) throws SQLException {
        List<KyLuat> list = new KyLuatDAO().hienThiKyLuat();

        for (var item : list) {

            System.out.println(item.getMaCanBo());
        }

    }
}
