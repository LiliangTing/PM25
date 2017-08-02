import com.liliangliang.envicloud.util.EnvicloudInfo;
import com.liliangliang.envicloud.util.HttpUtil;

public class Test {
	public static void main(String[] args) {
		String aqiJson = HttpUtil.HttpGetJson(EnvicloudInfo.BASISURL,
				EnvicloudInfo.VERSION, EnvicloudInfo.AIR_LIVE_CIRT,
				EnvicloudInfo.ACCESSKEY, "/101010100");
		System.out.println(aqiJson);
	}
}
