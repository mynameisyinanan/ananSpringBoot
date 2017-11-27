package com.mk.mapper;

import java.util.HashMap;
import java.util.List;

import com.mk.bean.Params;

/**
 * IContentMapper<br/>
 * 创建人:yinanan<br/>
 * 时间：2017年11月7日-下午2:28:37 <br/>
 * @version 1.0.0<br/>
 *
 */

public interface IContentMapper {

	/**
	 * 查询全部加分页<br/>
	 * 方法名：query<br/>
	 * 创建人：yinanan <br/>
	 * 时间：2017年11月7日-下午2:30:34 <br/>
	 * 手机:15116474796<br/>
	 * @param params
	 * @return List<Content><br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public List<HashMap<String, Object>> query();
	
	/**
	 * 获得总数<br/>
	 * 方法名：count<br/>
	 * 创建人：yinanan <br/>
	 * 时间：2017年11月8日-下午3:55:12 <br/>
	 * 手机:15116474796<br/>
	 * @return int<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public int count();
	
}
