package json_writter;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;

public class NewClass {

	public static void main(String[] args) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("ID", "1");
	      jsonObject.put("First_Name", "Shikhar");
	      jsonObject.put("Last_Name", "Dhawan");
	      jsonObject.put("Date_Of_Birth", "1981-12-05");
	      jsonObject.put("Place_Of_Birth", "Delhi");
	      jsonObject.put("Country", "India");
	      try {
	         FileWriter file = new FileWriter("C:\\Users\\venka\\eclipse-workspace\\output.json");
	         file.write(jsonObject.toJSONString());
	         file.close();
	      } catch (IOException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	      System.out.println("JSON file created: "+jsonObject);

	}

}
