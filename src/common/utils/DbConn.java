package common.utils;

public class DbConn {

	private static final String DEFAULT_SERVE = "jdbc:oracle:thin:@";
	private static final String HOST = "localhost";
	private static final String PORT = "1521";
	private static final String SERVICE = "orcl";
	
	private static final String ID = "id";
	private static final String PW = "pw";
	
	static DbConn dbInstance;
	
	private DbConn() {}
	public static DbConn getDbInstance() {
		if (dbInstance == null) {
			dbInstance = new DbConn();
		}
		return dbInstance;
	}
	
	public static String getDbUrl() {
		return DEFAULT_SERVE + HOST + ":" + PORT + ":" + SERVICE;
	}
	
	public static String getDefaultServe() {
		return DEFAULT_SERVE;
	}
	public static String getHost() {
		return HOST;
	}
	public static String getPort() {
		return PORT;
	}
	public static String getService() {
		return SERVICE;
	}
	public static String getId() {
		return ID;
	}
	public static String getPw() {
		return PW;
	}

}
