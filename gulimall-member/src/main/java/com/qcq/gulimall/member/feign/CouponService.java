package com.qcq.gulimall.member.feign;

import com.qcq.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("gulimall-coupon")
public interface CouponService {
    @GetMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
