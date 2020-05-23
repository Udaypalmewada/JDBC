package com.cla.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementCreator;

import com.cla.bo.Block;

public class BlockDao {
	private JdbcTemplate jdbctamplate;

	public BlockDao(JdbcTemplate jdbctamplate) {
		super();
		this.jdbctamplate = jdbctamplate;
	}

	public List<Block> getBlockByZone(String zone){
		GetBLockZoneCreter getBLockZoneCreter=new GetBLockZoneCreter(zone);
		GetBockByZoneCallback getBockByZoneCallback=new GetBockByZoneCallback();
		List<Block>bllk=jdbctamplate.execute(getBLockZoneCreter,getBockByZoneCallback);
		
		return bllk;
		
		
	}
	
	
	private final class GetBLockZoneCreter implements PreparedStatementCreator {
		private String zone;

		public GetBLockZoneCreter(String zone) {
			super();
			this.zone = zone;
		}

		@Override
		public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
			PreparedStatement psmts = null;
			psmts = con.prepareStatement("SELECT * FROM block WHERE zone=?");
			psmts.setString(1, zone);

			return psmts;
		}

	}

	private final class GetBockByZoneCallback implements PreparedStatementCallback<List<Block>> {

		@Override
		public List<Block> doInPreparedStatement(PreparedStatement psmts) throws SQLException, DataAccessException {

			List<Block> blocks = null;
			Block block = null;
			blocks = new ArrayList<>();
			ResultSet rs = null;
			rs = psmts.executeQuery();
			while (rs.next()) {
				block = new Block();
				block.setBlockno(rs.getInt("blok_nbr"));
				block.setBlocknm(rs.getString("blok_name"));
				block.setCapacity(rs.getInt("capacity"));
				block.setZone(rs.getString("zone"));
				blocks.add(block);
			}
			return blocks;

		}
	}
}
