package com.sirheadless.CreateAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by
 * User: creuter
 * Date: 8/6/2018
 * Time: 10:34 AM
 * Test
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface JsonField {
	public String value() default "";
}
