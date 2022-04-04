
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;
import com.wolfram.alpha.WAEngine;
import com.wolfram.alpha.WAException;
import com.wolfram.alpha.WAPlainText;
import com.wolfram.alpha.WAPod;
import com.wolfram.alpha.WAQuery;
import com.wolfram.alpha.WAQueryResult;
import com.wolfram.alpha.WASubpod;


public class API {
    private String key = "";
    private String appid= "";

    public String translate(String s){
       try{
        String urlEncode = URLEncoder.encode(s,"UTF-8");
        String url = "https://www.googleapis.com/language/translate/v2?key=" + key + "&q=" + urlEncode + "&target=zh-CN&source=en";
        URL newURL = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) newURL.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        StringBuilder b = new StringBuilder();
        String s1;
        while((s1 = in.readLine()) != null){
            b.append(s1);
        }
        JSONObject object = new JSONObject(b.toString());
        String translated = object.getJSONObject("data").getJSONArray("translations").getJSONObject(0).getString("translatedText");
        return translated;
       }catch(Exception e){
            System.out.println("error has occured");
       }
        return null;
    }

    public String Wolfram(String s){
        String string="";
        try{
      
            WAEngine engine = new WAEngine();
            engine.setAppID(appid);
            engine.addFormat("plaintext");
            WAQuery query = engine.createQuery();
            query.setInput(s);
            System.out.println(1);
            WAQueryResult result = engine.performQuery(query);
            for (WAPod pod : result.getPods()) {
                if (!pod.isError()) {
                    if(pod.getTitle().contains("Result")){
                        for (WASubpod subpod : pod.getSubpods()) {
                            for (Object element : subpod.getContents()) {
                                if (element instanceof WAPlainText) {
                                    string = ((WAPlainText) element).getText().toString();
                                }
                            }
                        }
                    }
                }
            }
        } catch (WAException e) {
            e.printStackTrace();
        }
        return string;
    }


}
