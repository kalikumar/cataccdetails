package example.utility;
import example.nosql.CloudantClientMgr;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Part;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.cloudant.client.api.Database;
public class Login {  
  
public static boolean validate(LoginProcess bean){  
boolean status=false;  

String email = bean.getEmail());  
String pass = bean.getPass());
System.out.println("I am here.");
Database db = null;
		try {
			db = getDB();
		} catch (Exception re) {
			re.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}

		JsonObject resultObject = new JsonObject();
		JsonArray jsonArray = new JsonArray();

				// get all the document present in database
				List<HashMap> allDocs = db.getAllDocsRequestBuilder().includeDocs(true).build().getResponse()
						.getDocsAs(HashMap.class);

             for (HashMap doc : allDocs) {
             HashMap<String, Object> obj = db.find(HashMap.class, doc.get("_id") + "");
             String	email1 = obj.get("id");
             String pass1= obj.get("password");
             	
				System.out.println(email1);	
				System.out.println(pass);	
				}
 
              
return status;  
  

}  