package com.entity.view;

import com.entity.ShengfenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 省份
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-08 17:43:15
 */
@TableName("shengfen")
public class ShengfenView  extends ShengfenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShengfenView(){
	}
 
 	public ShengfenView(ShengfenEntity shengfenEntity){
 	try {
			BeanUtils.copyProperties(this, shengfenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
