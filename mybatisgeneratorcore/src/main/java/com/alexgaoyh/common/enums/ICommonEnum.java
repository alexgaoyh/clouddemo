/**
 * File : ICommonEnum.java <br/>
 * Author : lenovo <br/>
 * Version : 1.1 <br/>
 * Date : 2017年5月23日 <br/>
 * Modify : <br/>
 * Package Name : com.zhongpin.inventory.persist.enums.handler <br/>
 * Project Name : zp-persist-generator <br/>
 * Description : <br/>
 * 
 */

package com.alexgaoyh.common.enums;

/**
 * ClassName : ICommonEnum <br/>
 * Function : 本系统所有枚举实现的接口 规范key value 用于MyBatis枚举映射. <br/>
 * Reason : 本系统所有枚举实现的接口 规范key value 用于MyBatis枚举映射. <br/>
 * Date : 2017年5月23日 上午10:27:09 <br/>
 * 
 * @author : alexgaoyh <br/>
 * @version : 1.1 <br/>
 * @since : JDK 1.6 <br/>
 * @see
 */

public interface ICommonEnum {

	int getKey();

	void setKey(int key);

	String getValue();

	void setValue(String value);
}
