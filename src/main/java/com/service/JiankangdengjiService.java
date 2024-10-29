package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankangdengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankangdengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangdengjiView;


/**
 * 健康登记
 *
 * @author 
 * @email 
 * @date 2021-04-08 17:43:15
 */
public interface JiankangdengjiService extends IService<JiankangdengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangdengjiVO> selectListVO(Wrapper<JiankangdengjiEntity> wrapper);
   	
   	JiankangdengjiVO selectVO(@Param("ew") Wrapper<JiankangdengjiEntity> wrapper);
   	
   	List<JiankangdengjiView> selectListView(Wrapper<JiankangdengjiEntity> wrapper);
   	
   	JiankangdengjiView selectView(@Param("ew") Wrapper<JiankangdengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangdengjiEntity> wrapper);
   	
}

