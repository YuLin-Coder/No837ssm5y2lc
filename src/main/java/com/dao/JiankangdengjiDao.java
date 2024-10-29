package com.dao;

import com.entity.JiankangdengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiankangdengjiVO;
import com.entity.view.JiankangdengjiView;


/**
 * 健康登记
 * 
 * @author 
 * @email 
 * @date 2021-04-08 17:43:15
 */
public interface JiankangdengjiDao extends BaseMapper<JiankangdengjiEntity> {
	
	List<JiankangdengjiVO> selectListVO(@Param("ew") Wrapper<JiankangdengjiEntity> wrapper);
	
	JiankangdengjiVO selectVO(@Param("ew") Wrapper<JiankangdengjiEntity> wrapper);
	
	List<JiankangdengjiView> selectListView(@Param("ew") Wrapper<JiankangdengjiEntity> wrapper);

	List<JiankangdengjiView> selectListView(Pagination page,@Param("ew") Wrapper<JiankangdengjiEntity> wrapper);
	
	JiankangdengjiView selectView(@Param("ew") Wrapper<JiankangdengjiEntity> wrapper);
	
}
