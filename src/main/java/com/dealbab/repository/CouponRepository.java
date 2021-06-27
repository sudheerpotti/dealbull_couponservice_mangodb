package com.dealbab.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.dealbab.model.Coupon;

public interface CouponRepository extends MongoRepository<Coupon, Integer> {

	Page<Coupon> findById(Integer id,Pageable pageable);

	

	



	

	
	


	

}
