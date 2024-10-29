package com.dao;

import com.entity.ShiquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiquVO;
import com.entity.view.ShiquView;


/**
 * 市区
 * 
 * @author 
 * @email 
 * @date 2021-04-08 17:43:15
 */
public interface ShiquDao extends BaseMapper<ShiquEntity> {
	
	List<ShiquVO> selectListVO(@Param("ew") Wrapper<ShiquEntity> wrapper);
	
	ShiquVO selectVO(@Param("ew") Wrapper<ShiquEntity> wrapper);
	
	List<ShiquView> selectListView(@Param("ew") Wrapper<ShiquEntity> wrapper);

	List<ShiquView> selectListView(Pagination page,@Param("ew") Wrapper<ShiquEntity> wrapper);
	
	ShiquView selectView(@Param("ew") Wrapper<ShiquEntity> wrapper);
	
}
