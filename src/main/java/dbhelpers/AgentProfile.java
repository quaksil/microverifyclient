package dbhelpers;

import static connection.SingleConnection.getConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Agent;

public class AgentProfile {

	private ResultSet results;
	PreparedStatement ps = null;

	private boolean token = false;

	public Agent verify(String username, String password) {

		String query = "SELECT * FROM agent WHERE username LIKE ? AND password LIKE ?";

		try {

			ps = getConnection().prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, password);

			this.results = ps.executeQuery();

		} catch (SQLException e) {
			Logger.getLogger(AgentProfile.class.getName()).log(Level.SEVERE, null, e);
		}

		Agent agent = null;

		try {
			if (this.results.next()) {
				token = true;
				
				agent = new Agent();

				agent.setId(this.results.getInt("agent_id"));
				agent.setFirstname(this.results.getString("firstname"));
				agent.setLastname(this.results.getString("lastname"));
				agent.setUsername(this.results.getString("username"));
				agent.setPassword(this.results.getString("password"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return agent;
	}

}
