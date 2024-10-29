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


import com.dao.ShengfenDao;
import com.entity.ShengfenEntity;
import com.service.ShengfenService;
import com.entity.vo.ShengfenVO;
import com.entity.view.ShengfenView;

@Service("shengfenService")
public class ShengfenServiceImpl extends ServiceImpl<ShengfenDao, ShengfenEntity> implements ShengfenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShengfenEntity> page = this.selectPage(
                new Query<ShengfenEntity>(params).getPage(),
                new EntityWrapper<ShengfenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShengfenEntity> wrapper) {
		  Page<ShengfenView> page =new Query<ShengfenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShengfenVO> selectListVO(Wrapper<ShengfenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShengfenVO selectVO(Wrapper<ShengfenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShengfenView> selectListView(Wrapper<ShengfenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShengfenView selectView(Wrapper<ShengfenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
