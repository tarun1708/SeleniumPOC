package dbUtility;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class DBConfig {

	private static DBCollection collection = null;

	private DBConfig() {

	}

	public static DBCollection getMongoCollection(String dbName, String collectionName) {
		if (collection == null) {

			MongoClient client = new MongoClient("localhost", 27017);
			DB db = client.getDB(dbName);
			collection = db.getCollection(collectionName);

		}
		return collection;

	}
	
	public static DBCursor tokenQuery(String key,String value) {
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put(key, value);
		DBCursor cursor = collection.find(searchQuery);
		return cursor;

	}
	
}
