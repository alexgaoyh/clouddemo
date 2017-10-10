package com.alexgaoyh.common.enums.pojo;

/**
 * ClassName : SexEnum <br/>
 * Function : 具体的业务对应的详细业务枚举类. <br/>
 * Reason : 具体的业务对应的详细业务枚举类. <br/>
 * Date : 2017年5月23日 上午10:31:30 <br/>
 *
 * @author : alexgaoyh  <br/>
 * @version : 1.1 <br/>
 * @since : JDK 1.6 <br/>
 * @see
 */

import com.alexgaoyh.common.enums.ICommonEnum;

/**
 * 需要注意的是，key的数据类型必须是 int 整型，
 * 因为 EnumKeyTypeHandler.java 与 ICommonEnum.java 两个类是针对 int 进行了封装操作
 * 类名：SexEnum  <br />
 */
public enum ResourceTypeEnum implements ICommonEnum {

    MAN(1, "菜单"), WOMAN(2, "按钮");

    private int key;
    private String value;

    private ResourceTypeEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
