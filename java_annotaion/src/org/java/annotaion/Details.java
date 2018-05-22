package org.java.annotaion;

import java.lang.annotation.*;


@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented	
@Inherited

public @interface Details {
	
	//����ע��ֵ�����ע����ֻ��һ��ֵ��Ĭ�϶���λvalue�����ҿ�������ע��ֵ��Ĭ��ֵ
	//value���ʾ��ע���Ĭ��ֵ����Ҳ�������Ϊvalueֵ�Ļ�ȡ����
	String value() default"Ĭ��ֵ";
	String className() default "" ;
	String[] fields();
}
