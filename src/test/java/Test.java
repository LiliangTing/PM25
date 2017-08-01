import com.liliangliang.envicloud.util.AppInfo;
import com.liliangliang.envicloud.util.HttpUtil;

public class Test {
    public static void main(String[] args){
        String  aqiJson = HttpUtil.HttpGetJson(AppInfo.url + AppInfo.tocken);
        System.out.println(aqiJson);
    }
}
