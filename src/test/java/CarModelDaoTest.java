import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sunxch.jade.dao.CarModelDAO;

/**
 * CarModelDaoTest
 *
 * @author xiaochen.sun
 * @since 2016-08-09 15:43
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-jade.xml")
public class CarModelDaoTest {
    @Autowired
    CarModelDAO carModelDAO;

    @Test
    public void test(){
        System.out.println(carModelDAO.countCars(2));
        System.out.println(carModelDAO.pageCarModel(2, 0, 10));
        System.out.println(carModelDAO.pageZcar(0, 10));
    }
}
