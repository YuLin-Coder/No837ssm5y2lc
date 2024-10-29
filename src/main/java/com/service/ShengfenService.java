package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShengfenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShengfenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShengfenView;


/**
 * 省份
 *
 * @author 
 * @email 
 * @date 2021-04-08 17:43:15
 */
public interface ShengfenService extends IService<ShengfenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShengfenVO> selectListVO(Wrapper<ShengfenEntity> wrapper);
   	
   	ShengfenVO selectVO(@Param("ew") Wrapper<ShengfenEntity> wrapper);
   	
   	List<ShengfenView> selectListView(Wrapper<ShengfenEntity> wrapper);
   	
   	ShengfenView selectView(@Param("ew") Wrapper<ShengfenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShengfenEntity> wrapper);
   	
}

