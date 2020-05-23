package comcla.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ConnectionCallback;
import org.springframework.jdbc.core.JdbcTemplate;

import com.cla.bo.Block;
import com.cla.bo.Flot;
import com.cla.bo.Owner;
import com.mysql.jdbc.PreparedStatement;

public class FlotDao {
	private JdbcTemplate jdbctamplate;

	public FlotDao(JdbcTemplate jdbctamplate) {
		super();
		this.jdbctamplate = jdbctamplate;
	}

	public boolean joinFlat(Owner owner, Flot Flot, Block block) {
		return true;
	}

	private final class JoinFlatCallback implements ConnectionCallback<Boolean> {

		private int blockNo;
		private String blockName;
		private int capacity;
		private String zone;

		@Override
		public Boolean doInConnection(Connection con) throws SQLException, DataAccessException {
			ResultSet blkrs = null;
			Block block = null;
			PreparedStatement blkpstmt = null;
			try {
				blkpstmt = (PreparedStatement) con
						.prepareStatement("insert into blocks(block_no,block_name,capacity,zone) values (?,?,?,?)");
				blkpstmt.setInt(1, blockNo);
				blkpstmt.setString(2, blockName);
				blkpstmt.setInt(3, capacity);
				blkpstmt.setString(4, zone);
				blkrs = blkpstmt.executeQuery();
				if (blkrs.next()) {
					block = new Block();
					block.setBlockno(blkrs.getInt("block_no"));
					block.setBlocknm(blkrs.getString("blick_name"));
					block.setCapacity(blkrs.getInt("capacity"));
					block.setZone(blkrs.getString("zone"));
				}

				return true;
			} finally {
				if (blkpstmt != null) {
					blkpstmt.close();
				}
			}
		}
	}
}