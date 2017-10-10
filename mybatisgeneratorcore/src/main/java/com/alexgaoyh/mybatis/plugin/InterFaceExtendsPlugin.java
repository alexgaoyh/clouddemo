package com.alexgaoyh.mybatis.plugin;

import com.alexgaoyh.mybatis.plugin.exception.MybatisPluginException;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.internal.util.StringUtility;

import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class InterFaceExtendsPlugin extends PluginAdapter{
	
	  private Set<String> mappers = new HashSet<String>();
	  
	  @Override
	    public void setProperties(Properties properties) {
	        super.setProperties(properties);
	        String strMappers = this.properties.getProperty("mappers");
	        if (StringUtility.stringHasValue(strMappers)) {
	            for (String mapper : strMappers.split(",")) {
	                this.mappers.add(mapper);
	            }
	        } else {
	            throw new MybatisPluginException("Mapper插件缺少必要的mappers属性!");
	        }
	    }
	 
	
    /**
     * 生成的mapper接口能够继承基类方法
     *
     * @param interfaze
     * @param topLevelClass
     * @param introspectedTable
     * @return
     */
    @Override
    public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        //获取实体类
        FullyQualifiedJavaType entityType = new FullyQualifiedJavaType(introspectedTable.getBaseRecordType());
        //import接口
        for (String mapper : mappers) {
            interfaze.addImportedType(new FullyQualifiedJavaType(mapper));
            interfaze.addSuperInterface(new FullyQualifiedJavaType(mapper + "<" + entityType.getShortName() + ">"));
        }
        //import实体类
        interfaze.addImportedType(entityType);
        return true;
    }

	@Override
	public boolean validate(List<String> warnings) {
	
		return true;
	}

}
