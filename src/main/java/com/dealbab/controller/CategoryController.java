package com.dealbab.controller;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.dealbab.exception.CategoryAlreadyExistsException;
import com.dealbab.exception.CategoryNotFoundException;
import com.dealbab.model.Category;
import com.dealbab.repository.CategoryRepository;
import com.dealbab.service.CategoryService;

@RestController
@RequestMapping(value="/dealbab")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	@Autowired 
	private CategoryRepository categoryRepository;
	@CrossOrigin(origins = "http://localhost:8080")
	@PostMapping(value="/category")
	public ResponseEntity<?> createCategory(@Validated @RequestBody Category category, UriComponentsBuilder ucBuilder){

		  if (categoryRepository.findById(category.getId()).isPresent()) {
		        throw new CategoryAlreadyExistsException(category.getId());
		    }
		  categoryRepository.save(category);
		    HttpHeaders headers = new HttpHeaders();
		    headers.setLocation(ucBuilder.path("/api/category/{id}").buildAndExpand(category.getId()).toUri());
		    return new ResponseEntity<>(headers, HttpStatus.CREATED);
		}
	
	/*@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping(value="/category/{id}")
	public Optional<Category> checkCategoryById(@PathVariable("id")Integer id)
	{
	return 	categoryService.checkCategoryById(id);
	}*/
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping(value="/category/{id}")
	public ResponseEntity<Category> getCategory(@PathVariable("id") Integer id) {
	    return categoryRepository.findById(id)
	        .map(category -> new ResponseEntity<>(category, HttpStatus.OK))
	        .orElseThrow(() -> new CategoryNotFoundException(id));
	}

	/*@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping(value="/category")
	public Iterable<Category> getAllCategory()
	{
		return categoryService.getAllCategory();
		
	}*/
	
	 @CrossOrigin(origins = "http://localhost:8080")
		@GetMapping(value="/category")
		public ResponseEntity<?> category() {
		    List<Category> category = categoryService.getAllCategory();

		    if (category.isEmpty()) {
				return new ResponseEntity(HttpStatus.NO_CONTENT);
			}
		    HashMap<String, Object> hmap = new HashMap<String, Object>();
		    hmap.put("count", category.size());
		    hmap.put("category", category);
		    return new ResponseEntity<HashMap<String, Object>>(hmap, HttpStatus.OK);
		}
	/*@DeleteMapping(value="/category/{id}")
	public void deleteCategory(@PathVariable("id")Integer id){
		categoryService.deletecategory(id);
}
*/
	 @CrossOrigin(origins = "http://localhost:8080")
	 @DeleteMapping(value="/category/{id}")
	 public ResponseEntity<?> deleteCategory(@PathVariable("id") Integer id) {
	     return categoryRepository.findById(id)
	         .map(category -> {
	        	 categoryRepository.delete(category);
	             return new ResponseEntity(HttpStatus.NO_CONTENT);
	          })
	          .orElseThrow(() -> new CategoryNotFoundException(id));
	 }
	 
	 }
    
