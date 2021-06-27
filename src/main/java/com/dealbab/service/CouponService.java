package com.dealbab.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dealbab.model.Coupon;
import com.dealbab.repository.CouponRepository;

@Service
public class CouponService {
@Autowired
public CouponRepository couponRepository;
static List<Coupon> coupon = new ArrayList<>();
public List<Coupon> getCoupons()
{
	return coupon;
	
}
public Coupon createCoupon(Coupon coupon) {
		
		 return couponRepository.save(coupon);
		
	}
public Optional<Coupon> checkCouponById(Integer id) {
	
	return couponRepository.findById(id);
}

public List<Coupon> getAllCoupon() {
	
	return couponRepository.findAll();
}
public void deleteCoupon(Integer id) {
	
	couponRepository.deleteById(id);
	
}
public Coupon findById(Integer id) {
	for(Coupon coupon : coupon){
        if(coupon.getId().equals(id)){
            return coupon;
        }
    }
    return null;
}
public boolean isCouponIdExist(Coupon coupon) {
	
	return findById(coupon.getId())!=null;
}
/*public Optional<Coupon> getCoupon(Integer id) {
	// TODO Auto-generated method stub
	return couponRepository.findById(id);
}
*/




}

