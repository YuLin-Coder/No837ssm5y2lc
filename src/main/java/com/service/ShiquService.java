package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiquView;


/**
 * 市区
 *
 * @author 
 * @email 
 * @date 2021-04-08 17:43:15
 */
public interface ShiquService extends IService<ShiquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiquVO> selectListVO(Wrapper<ShiquEntity> wrapper);
   	
   	ShiquVO selectVO(@Param("ew") Wrapper<ShiquEntity> wrapper);
   	
   	List<ShiquView> selectListView(Wrapper<ShiquEntity> wrapper);
   	
   	ShiquView selectView(@Param("ew") Wrapper<ShiquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiquEntity> wrapper);
   	
}

