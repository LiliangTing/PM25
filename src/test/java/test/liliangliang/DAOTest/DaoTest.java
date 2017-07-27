package test.liliangliang.DAOTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.liliangliang.PM25.dao.AqiDAO;
import com.liliangliang.PM25.entry.Aqi;

/**
 * 自定义测试类
 * 
 * @author Administrator
 * 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DaoTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(DaoTest.class);

	@Autowired
	private AqiDAO aqiDAO;

	@Test
	public void insertListTest() {
		Aqi a = new Aqi();
		a.setAqi(11);
		a.setArea("河南");
		a.setCo(22.3);
		a.setCo_24h(22.2);
		a.setNo2(22);
		a.setNo2_24h(2);
		a.setO3(22);
		a.setO3_24h(22);
		a.setO3_8h(33);
		a.setO3_8h_24h(44);
		a.setPm10(22);
		a.setPm10_24h(33);
		a.setPm2_5(22);
		a.setPm2_5_24h(33);
		a.setPosition_name("监测点");
		a.setPrimary_pollutant("主要污染物");
		a.setQuality("良");
		a.setSo2(22);
		a.setSo2_24h(33);
		a.setTime_point("2017-07-27T09:00:00Z");
		List<Aqi> list = new ArrayList<Aqi>();
		list.add(a);
		System.out.println(this.aqiDAO.insertList(list));
	}

	@Test
	public void insertTest() {
		Aqi a = new Aqi();
		a.setAqi(11);
		a.setArea("河南");
		a.setCo(22.3);
		a.setCo_24h(22.2);
		a.setNo2(22);
		a.setNo2_24h(2);
		a.setO3(22);
		a.setO3_24h(22);
		a.setO3_8h(33);
		a.setO3_8h_24h(44);
		a.setPm10(22);
		a.setPm10_24h(33);
		a.setPm2_5(22);
		a.setPm2_5_24h(33);
		a.setPosition_name("监测点");
		a.setPrimary_pollutant("主要污染物");
		a.setQuality("良");
		a.setSo2(22);
		a.setSo2_24h(33);
		a.setTime_point("2017-07-27T09:00:00Z");
		System.out.println(this.aqiDAO.insert(a));

	}

}
