package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author CarterX
 * @email CarterX@gmail.com
 * @date 2021-08-04 13:31:29
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
