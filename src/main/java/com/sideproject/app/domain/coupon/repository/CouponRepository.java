package com.sideproject.app.domain.coupon.repository;

import com.sideproject.app.domain.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon, Long> {
}