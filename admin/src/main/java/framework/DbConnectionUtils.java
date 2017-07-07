package framework;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class DbConnectionUtils {

	MongoClient client=new MongoClient("localhost",27017);
	DB db= client.getDB("voler_ums");
	DBCollection collection= db.getCollection("user");
	
}
