package ReflectionApi;

import java.lang.reflect.Field;

public class TestReflectionApi {

	public static void main(String[] args) throws Exception {
		
		Class name = Class.forName("ReflectionApi.CreatePrivateVariable"); //  give fully qualified name in small brecis
		 Object object = name.newInstance();
		 
		 Field field2 = name.getDeclaredField("name");
		field2.setAccessible(true);
			
			field2.set(object, "Talib");
			
			System.out.println(field2.get(object));
			
		
	}
}
