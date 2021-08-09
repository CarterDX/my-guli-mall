package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author CarterX
 * @email CarterX@gmail.com
 * @date 2021-08-04 13:22:30
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
