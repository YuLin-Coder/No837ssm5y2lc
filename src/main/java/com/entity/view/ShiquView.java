package com.entity.view;

import com.entity.ShiquEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 市区
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-08 17:43:15
 */
@TableName("shiqu")
public class ShiquView  extends ShiquEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShiquView(){
	}
 
 	public ShiquView(ShiquEntity shiquEntity){
 	try {
			BeanUtils.copyProperties(this, shiquEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
