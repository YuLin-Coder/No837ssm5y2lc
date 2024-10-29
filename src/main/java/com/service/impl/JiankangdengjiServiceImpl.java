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


import com.dao.JiankangdengjiDao;
import com.entity.JiankangdengjiEntity;
import com.service.JiankangdengjiService;
import com.entity.vo.JiankangdengjiVO;
import com.entity.view.JiankangdengjiView;

@Service("jiankangdengjiService")
public class JiankangdengjiServiceImpl extends ServiceImpl<JiankangdengjiDao, JiankangdengjiEntity> implements JiankangdengjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiankangdengjiEntity> page = this.selectPage(
                new Query<JiankangdengjiEntity>(params).getPage(),
                new EntityWrapper<JiankangdengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiankangdengjiEntity> wrapper) {
		  Page<JiankangdengjiView> page =new Query<JiankangdengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiankangdengjiVO> selectListVO(Wrapper<JiankangdengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiankangdengjiVO selectVO(Wrapper<JiankangdengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiankangdengjiView> selectListView(Wrapper<JiankangdengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiankangdengjiView selectView(Wrapper<JiankangdengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
