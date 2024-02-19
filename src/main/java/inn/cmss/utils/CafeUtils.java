package inn.cmss.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


public class CafeUtils {
    //contains the utility methods which are generic and can be used in any class
    private CafeUtils(){

    }
    public static ResponseEntity<String> getResponseEntity(String responseMessage, HttpStatus httpStatus){
        return new ResponseEntity<String>("{\"message\":\""+responseMessage+"\"}", httpStatus);
    }
}
