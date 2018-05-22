package org.java.annotaion;

import java.lang.annotation.*;


@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented	
@Inherited

public @interface Details {
	
	//定义注解值，如果注解中只有一个值则默认定义位value，并且可以设置注解值的默认值
	//value则表示该注解的默认值名，也可以理解为value值的获取方法
	String value() default"默认值";
	String className() default "" ;
	String[] fields();
}
