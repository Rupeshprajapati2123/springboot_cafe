package inn.cmss.service;

import inn.cmss.POJO.Category;
import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

//@Service
public interface CategoryService {
    ResponseEntity<String> addNewCategory(Map<String, String> requestMap);

    ResponseEntity<List<Category>> getAllCategory(String filterValue);

    ResponseEntity<String> updateCategory(Map<String, String> requestMap);
}
