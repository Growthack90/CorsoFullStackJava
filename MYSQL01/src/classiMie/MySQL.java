package classiMie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class MySQL {
 
	private String dbhost;
	private String dbport;
	private String dbname;
	private String dbusername;
	private String dbpassword;
 
	private Connection dbConn;
 
	private String errorString;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private Integer lastInsertId;
 
	public MySQL()
	{
		this.dbhost = null;
		this.dbport = null;
		this.dbname = null;
		this.dbusername = null;
		this.dbpassword = null;
	}
 
	public MySQL(String dbhost, String dbport, String dbname, String dbusername, String dbpassword) {
		this.dbhost = dbhost;
		this.dbport = dbport;
		this.dbname = dbname;
		this.dbusername = dbusername;
		this.dbpassword = dbpassword;		
		this.Connect();
	}
 
 
	/* ora i get e set per
	 	private String dbhost;
		private String dbport;
		private String dbname;
		private String dbusername;
		private String dbpassword; 
	 */
 
	public String getDbhost() {
		return dbhost;
    }
 
	public void setDbhost(String dbhost) {
		this.dbhost = dbhost;
    }
 
	public String getDbport() {
		return dbport;
    }
 
	public void setDbport(String dbport) {
		this.dbport = dbport;
	}
 
	public String getDbname() {
		return dbname;
	}
 
	public void setDbname(String dbname) {
		this.dbname = dbname;
	}
 
	public String getDbusername() {
		return dbusername;
	}
 
	public void setDbusername(String dbusername) {
		this.dbusername = dbusername;
	}
 
	public String getDbpassword() {
		return dbpassword;
	}
 
	public void setDbpassword(String dbpassword) {
		this.dbpassword = dbpassword;
	}
 
	public String getErrorString() {
		return errorString;
	}
 
 
	public void ClearErrorString()
    {
        this.errorString = null;
    }
 
	public boolean Connect() 
	{
		try 
		{			
        	this.dbConn = DriverManager.getConnection("jdbc:mysql://" + this.dbhost + ":" + this.dbport + "/" + this.dbname, this.dbusername, this.dbpassword);            
        	return true;            
        } 
		catch (SQLException e) 
		{
            this.errorString = e.getMessage();
            return false;
        }	
	}
 
 
	public boolean isConnected()
	{
		this.ClearErrorString();
		try {
				if (this.dbConn == null || this.dbConn.isClosed()) {
					return false;
				}
				return this.dbConn.isValid(0);
		}
		catch (Exception e) {
			this.errorString = e.getMessage();
			return false;
		}
	}
 
	public void Close() {
		this.ClearErrorString();
		try {
			if (this.dbConn != null) {
				this.dbConn.close();
			}
		} catch (SQLException e) {
			this.errorString = e.getMessage();
		}
	}
 
	public Connection getDbConn() {
		return dbConn;
	}
 
	// Distinguiamo ora le query semplici fatte con statement da quelle con PreparedStatement
	// per esempio SelectQuery la useremo per la semplice query di select fatta con Statement
	// e SelectProtectedQuery per la query di select fatta con PreparedStatement
 
	// Utilizzeremo, cioè la parola protected per indicare che il metodo è protetto dalla SQL Injection
 
	public boolean SelectQuery(String query) 
	{
		this.ClearErrorString();
		try {
				this.stmt = this.dbConn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				this.stmt.executeQuery(query);
				this.rs = this.stmt.getResultSet();
				return true;
			} catch (SQLException e) {
			this.errorString = e.getMessage();
			return false;
		}
	}
 
 
	public boolean SelectProtectedQuery(String query, String[] values)
	{
		this.ClearErrorString();
		try {
			this.pstmt = this.dbConn.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			for (int i = 0; i < values.length; i++) {
				this.pstmt.setString(i + 1, values[i]);
			}
			this.rs = this.pstmt.executeQuery();
			return true;
		} catch (SQLException e) {
			this.errorString = e.getMessage();
			return false;
		}
 
	}
 
	public boolean first()
	{
		this.ClearErrorString();
		if (this.rs == null) {
			this.errorString = "ResultSet non inizializzato";
			return false;
		}
 
		try {
			return this.rs.first();
		} catch (SQLException e) {
			this.errorString = e.getMessage();
			return false;
		}
	}
 
 
	public String getString(String field) {
		this.ClearErrorString();
		if (this.rs == null) {
			this.errorString = "ResultSet non inizializzato";
			return null;
		}
 
		try {
			return this.rs.getString(field);
		} catch (SQLException e) {
			this.errorString = e.getMessage();
			return null;
		}
	}
 
	public Integer getInt(String field) {
		this.ClearErrorString();
		if (this.rs == null) {
			this.errorString = "ResultSet non inizializzato";
			return null;
		}
 
		try {
			return this.rs.getInt(field);
		} catch (SQLException e) {
			this.errorString = e.getMessage();
			return null;
		}
	}
 
	public Double getDouble(String field) {
		this.ClearErrorString();
		if (this.rs == null) {
			this.errorString = "ResultSet non inizializzato";
			return null;
		}
 
		try {
			return this.rs.getDouble(field);
		} catch (SQLException e) {
			this.errorString = e.getMessage();
			return null;
		}
	}
 
	public Float getFloat(String field) {
		this.ClearErrorString();
		if (this.rs == null) {
			this.errorString = "ResultSet non inizializzato";
			return null;
		}
 
		try {
			return this.rs.getFloat(field);
		} catch (SQLException e) {
			this.errorString = e.getMessage();
			return null;
		}
	}
 
	public Boolean getBoolean(String field) {
		this.ClearErrorString();
		if (this.rs == null) {
			this.errorString = "ResultSet non inizializzato";
			return null;
		}
 
		try {
			return this.rs.getBoolean(field);
		} catch (SQLException e) {
			this.errorString = e.getMessage();
			return null;
		}
	}
 
	public Integer count()
	{
		this.ClearErrorString();
		if (this.rs == null) {
			this.errorString = "ResultSet non inizializzato";
			return null;
		}
 
		try {
			Integer actualpos = this.rs.getRow();
			this.last();
			Integer c = this.rs.getRow();
			this.absolute(actualpos);
			return c;
		} catch (SQLException e) {
			this.errorString = e.getMessage();
			return null;
		}
	}
 
 
	public boolean next() {
		this.ClearErrorString();
		if (this.rs == null) {
			this.errorString = "ResultSet non inizializzato";
			return false;
		}
 
		try {
			return this.rs.next();
		} catch (SQLException e) {
			this.errorString = e.getMessage();
			return false;
		}
	}
 
	public boolean last() {
		this.ClearErrorString();
		if (this.rs == null) {
			this.errorString = "ResultSet non inizializzato";
			return false;
		}
 
		try {
			return this.rs.last();
		} catch (SQLException e) {
			this.errorString = e.getMessage();
			return false;
		}
	}
 
	public boolean previous() {
		this.ClearErrorString();
		if (this.rs == null) {
			this.errorString = "ResultSet non inizializzato";
			return false;
		}
 
		try {
			return this.rs.previous();
		} catch (SQLException e) {
			this.errorString = e.getMessage();
			return false;
		}
	}
 
	public boolean absolute(int row) //posizionati nella tabella dopo la query di select, ammesso che la select lo permetta, alla riga row
	{  
		this.ClearErrorString();
		if (this.rs == null) {
			this.errorString = "ResultSet non inizializzato";
			return false;
		}
 
		try {
			return this.rs.absolute(row);
		} catch (SQLException e) {
			this.errorString = e.getMessage();
			return false;
		}
	}
 
	public boolean seek(int row) // solo perchè mi piace di più
	{
		return absolute(row);
	}
 
	public boolean updateQuery(String Query)
	{
		this.ClearErrorString();
		try {
			this.stmt = this.dbConn.createStatement();
			this.stmt.executeUpdate(Query);
			return true;
		} catch (SQLException e) {
			this.errorString = e.getMessage();
			return false;
		}
 
	}
 
	public boolean updateProtectedQuery(String Query, String[] values) {
		this.ClearErrorString();
		try {
			this.pstmt = this.dbConn.prepareStatement(Query);
			for (int i = 0; i < values.length; i++) {
				this.pstmt.setString(i + 1, values[i]);
			}
			this.pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			this.errorString = e.getMessage();
			return false;
		}
	}
 
 
	public boolean InsertProtectedQuery(String Query, String[] values) {
		this.ClearErrorString();
		this.resetDataPrequery();
		try {
			this.pstmt = this.dbConn.prepareStatement(Query, Statement.RETURN_GENERATED_KEYS);
			for (int i = 0; i < values.length; i++) {
				this.pstmt.setString(i + 1, values[i]);
			}
			this.pstmt.executeUpdate();
 
			ResultSet rs = this.pstmt.getGeneratedKeys();
			if (rs.next()) {
				this.lastInsertId = rs.getInt(1);
			}
			return true;
		} catch (SQLException e) {
			this.errorString = e.getMessage();
			return false;
		}
 
 
	}
 
	public boolean InsertQuery(String query)
	{
		return this.InsertProtectedQuery(query, new String[] {});
	}
 
	private void resetDataPrequery() {
        this.lastInsertId = null;
    }
 
	public Integer getLastInsertId() {
		return this.lastInsertId;
	}
 
	public boolean DeleteQuery(String query) {
		this.ClearErrorString();
		try {
			this.stmt = this.dbConn.createStatement();
			this.stmt.executeUpdate(query);
			return true;
		} catch (SQLException e) {
			this.errorString = e.getMessage();
			return false;
		}
	}
 
	public boolean DeleteProtectedQuery(String query, String[] values) {
		this.ClearErrorString();
		try {
			this.pstmt = this.dbConn.prepareStatement(query);
			for (int i = 0; i < values.length; i++) {
				this.pstmt.setString(i + 1, values[i]);
			}
			this.pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			this.errorString = e.getMessage();
			return false;
		}
	}
 
 
}
