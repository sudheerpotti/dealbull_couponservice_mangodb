package com.dealbab.controller;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dealbab.model.Coupon;
import com.dealbab.repository.CouponRepository;
import com.dealbab.service.CouponService;
@Controller
@RestController
@RequestMapping(value="/dealbab")
public class CouponController {
	

	@Autowired()
	private CouponService couponService;
	 @Autowired()
	 private CouponRepository couponRepository;
	 
	 @CrossOrigin(origins = "http://localhost:8090")
	@PostMapping(value="/coupon")
		public Coupon createCoupon(@RequestBody Coupon coupon){
		 return couponService.createCoupon(coupon);
			}
	/*public ResponseEntity<?> createCoupon(@Validated @RequestBody Coupon coupon, UriComponentsBuilder ucBuilder){

		  if (couponRepository.findById(coupon.getId()).isPresent()) {
		        throw new CouponAlreadyExistsException(coupon.getId());
		    }
		  couponRepository.save(coupon);

		    HttpHeaders headers = new HttpHeaders();
		    headers.setLocation(ucBuilder.path("/api/coupon/{id}").buildAndExpand(coupon.getId()).toUri());
		    return new ResponseEntity<>(headers, HttpStatus.CREATED);
		}
	*/
/*@CrossOrigin(origins = "http://localhost:8090")
	 @GetMapping(value="/coupon")
	public Optional<Coupon> checkCouponBySid(@RequestParam("sid")Integer sid)
	{ 
	return couponService.checkCouponBySid(sid);
	}*/
	
	/*@CrossOrigin(origins = "http://localhost:8090")
	@GetMapping(value="/coupon/{id}")
	public ResponseEntity<Coupon> getCoupon(@PathVariable("id") Integer id) {
	    return couponRepository.findById(id)
	        .map(coupon -> new ResponseEntity<>(coupon, HttpStatus.OK))
	        .orElseThrow(() -> new CouponNotFoundException(id));
	}*/
	
		@GetMapping(value="/coupon")
		public List<Coupon> getAllCoupon(@RequestParam(value="storeId",required = false)String storeId/*,
				@RequestParam(value="categoryId",required = false)String categoryId*/)
	 {
		
		  List<Coupon> couponList= couponService.getAllCoupon();
		  if(storeId!=null && !storeId.isEmpty()) {
			
			  return couponList.stream().filter(c->c.getSid().equalsIgnoreCase(storeId)).collect(Collectors.toList()); 
		  }
		 /* else if(categoryId!=null && !categoryId.isEmpty()) {
			
			  return couponList.stream().filter(c->c.getCid().equalsIgnoreCase(categoryId)).collect(Collectors.toList()); 
		  }*/
		  else {
			  return couponList;
		  }
		
	 }
	 	   
	
	/* @CrossOrigin(origins = "http://localhost:8090")
		@GetMapping(value="/coupon")
		public ResponseEntity<?> coupon() {
		    List<Coupon> coupon = couponService.getAllCoupon();

		    if (coupon.isEmpty()) {
				return new ResponseEntity(HttpStatus.NO_CONTENT);
			}
		    HashMap<String, Object> hmap = new HashMap<String, Object>();
		    hmap.put("count", coupon.size());
		    hmap.put("coupon", coupon);
		    return new ResponseEntity<HashMap<String, Object>>(hmap, HttpStatus.OK);
		}
	 */
	/*@GetMapping("/coupon")
	 *  http://localhost:8090/dealbab/coupon?page=0&size=1
	public List<Coupon> coupon(@Param(value = "page") int page, 
													@Param(value = "size") int size){
		Pageable requestedPage = PageRequest.of(page, size);
		Page<Coupon> coupon  = couponRepository.findAll(requestedPage);
		return coupon.toList();
	}
	 */
	
	 	 
	 /*
	 @CrossOrigin(origins = "http://localhost:8090")
	@DeleteMapping(value="/coupon/{id}")
	public void deleteCoupon(@PathVariable("id")Integer id){
		couponService.deleteCoupon(id);
}
	
	 */
	 /*@CrossOrigin(origins = "http://localhost:8090")
	 @DeleteMapping(value="/coupon/{id}")
	 public ResponseEntity<?> deleteCoupon(@PathVariable("id") Integer id) {
	     return couponRepository.findById(id)
	         .map(coupon -> {
	             couponRepository.delete(coupon);
	             return new ResponseEntity(HttpStatus.NO_CONTENT);
	          })
	          .orElseThrow(() -> new CouponNotFoundException(id));
	 }
	*/
	 
	 }
    
	

