package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author CarterX
 * @email CarterX@gmail.com
 * @date 2021-08-04 13:11:36
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
