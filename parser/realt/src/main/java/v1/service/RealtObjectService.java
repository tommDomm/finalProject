package v1.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class RealtObjectService {
    private final String beginPatternString="<loc>";
    private final String endPatternString="</loc>";
    private final String start="<script id=\"__NEXT_DATA__\" type=\"application/json\">";
    private final String end="</script></body></html>";
    private Pattern address=null;

    public RealtObjectService() {

    }

    public List<String> getAllUrlsFromResponse(String response){
        List<String> urls=new ArrayList<>();

        String pattern=Pattern.quote(beginPatternString)+".*"+Pattern.quote(endPatternString);
        if (address==null){
            address=Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        }

        Matcher matcher=address.matcher(response);
        while (matcher.find()){
            String url=matcher.group();
            url=url.substring(beginPatternString.length(),url.length()-endPatternString.length());
            urls.add(url.replace("sale-rooms","sale-flats"));
        }
        return urls;
    }

    public String getJsonEntity(String stringResponse){
        return stringResponse.substring(stringResponse.indexOf(start)+start.length(),stringResponse.indexOf(end));
    }


}
