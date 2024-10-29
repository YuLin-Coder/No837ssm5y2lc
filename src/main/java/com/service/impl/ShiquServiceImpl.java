package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShiquDao;
import com.entity.ShiquEntity;
import com.service.ShiquService;
import com.entity.vo.ShiquVO;
import com.entity.view.ShiquView;

@Service("shiquService")
public class ShiquServiceImpl extends ServiceImpl<ShiquDao, ShiquEntity> implements ShiquService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiquEntity> page = this.selectPage(
                new Query<ShiquEntity>(params).getPage(),
                new EntityWrapper<ShiquEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiquEntity> wrapper) {
		  Page<ShiquView> page =new Query<ShiquView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiquVO> selectListVO(Wrapper<ShiquEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiquVO selectVO(Wrapper<ShiquEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiquView> selectListView(Wrapper<ShiquEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiquView selectView(Wrapper<ShiquEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
