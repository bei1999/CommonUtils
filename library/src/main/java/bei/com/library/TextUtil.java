package bei.com.library;

import java.util.Collection;

public class TextUtil {
	public static boolean isValidate(String content){
		return content != null && !"".equals(content.trim())&& !content.equals("null");
	}
	public static boolean isValidate(Collection<?> list){
		return list != null && list.size() > 0;
	}
}
