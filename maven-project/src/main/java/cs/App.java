package cs;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import java.util.Iterator;

public class App 
{
    public static void main(String[] args) {
        MongoClient client=MongoClients.create("mongodb+srv://odramracs:1234@axxesshack2024.h38ct08.mongodb.net/?retryWrites=true&w=majority");
        MongoDatabase db= client.getDatabase("Accounts");
        MongoCollection col= db.getCollection("user");
        Document doc=new Document("name", "weiner");
        col.insertOne(doc);
        FindIterable<Document> iterDoc = col.find();
        Iterator it = iterDoc.iterator();
        while (it.hasNext()) {
           System.out.println(it.next());
        }

    }

}