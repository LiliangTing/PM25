package test.liliangliang.BasisTest;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.liliangliang.PM25.entry.Aqi;
/**
 * JsonTest 测试Json转换成对象
 * @author Administrator
 *
 */
public class JsonTest {
	public static void jsonConver(String strJson) {

		ObjectMapper om = new ObjectMapper();
		List<Aqi> listAqi = new ArrayList<Aqi>();
		try {
			List<Map<String, Object>> list = om.readValue(strJson, List.class);
			for (int i = 0; i < list.size(); i++) {
				Map<String, Object> map = list.get(i);
				listAqi.add(converBean(map));

			}

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Aqi a : listAqi) {
			System.out.println(a.toString());
		}

	}
/**
 * json转换后的Map生成对象
 * @param map
 * @return
 */
	public static Aqi converBean(Map<String, Object> map) {
		try {
			Class<?> clazz = Class.forName("com.liliangliang.PM25.entry.Aqi");

			//
			Aqi aqi = (Aqi) clazz.newInstance();

			Field[] fs = clazz.getDeclaredFields();

			for (Field field : fs) {
				// 要设置属性可达，不然会抛出IllegalAccessException异常
				field.setAccessible(true);
				field.set(aqi, map.get(field.getName()));
				
			}
			return aqi;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
