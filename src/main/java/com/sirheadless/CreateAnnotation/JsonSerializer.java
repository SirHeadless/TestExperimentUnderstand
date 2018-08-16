package com.sirheadless.CreateAnnotation;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by
 * User: creuter
 * Date: 8/6/2018
 * Time: 11:10 AM
 * Test
 */
public class JsonSerializer {

	public static String serialize(Object o) {
		Map<String, String> fieldsToValues = new HashMap<>();

		try {
			Class<?> objectClass = o.getClass();

			for (Field field : objectClass.getDeclaredFields()){
				if (field.getAnnotation(JsonField.class) != null){
					field.setAccessible(true);
					fieldsToValues.put(getFieldName(field),field.get(o).toString());
				}
			}
		} catch (Exception e) {
			System.out.println(String.format("Could not serialize Object [%s] because [%s]", o,e));
		}
		return mapToJson(fieldsToValues);
	}

	private static String mapToJson(Map<String, String> fieldsToValues) {
		return fieldsToValues.entrySet().stream().map(entry -> "\"" + entry.getKey() + "\" : \"" + entry.getValue() + "\"").collect(Collectors.joining(","));
	}


	private static String getFieldName(Field field) {
		String fieldAnnotationValue = field.getAnnotation(JsonField.class).value();
		if (fieldAnnotationValue.isEmpty()){
			return field.getName();
		} else {
			return fieldAnnotationValue;
		}
	}
}
