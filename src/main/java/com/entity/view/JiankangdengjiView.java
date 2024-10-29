package com.entity.view;

import com.entity.JiankangdengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健康登记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-08 17:43:15
 */
@TableName("jiankangdengji")
public class JiankangdengjiView  extends JiankangdengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiankangdengjiView(){
	}
 
 	public JiankangdengjiView(JiankangdengjiEntity jiankangdengjiEntity){
 	try {
			BeanUtils.copyProperties(this, jiankangdengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
