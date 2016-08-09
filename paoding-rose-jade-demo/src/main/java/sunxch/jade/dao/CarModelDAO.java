package sunxch.jade.dao;

import java.util.List;

import net.paoding.rose.jade.annotation.DAO;
import net.paoding.rose.jade.annotation.SQL;
import sunxch.jade.model.CarModel;
import sunxch.jade.model.Zcar;

/**
 * dao
 *
 * @author xiaochen.sun
 * @since 2016-08-09 15:38
 */
@DAO(catalog = "zcars")
public interface CarModelDAO {
    String FIELD = " id, name, brand_name, serial_name, version, level_new ";

    @SQL("select count(1) from car_model where #if (:1 == 0){version = 2} #else {version = :1}")
    public int countCars(int version);

    @SQL("select " + FIELD + " from car_model where #if (:1 == 0){version = 2} #else {version = :1} limit :2, :3")
    public List<CarModel> pageCarModel(int version, int offset, int limit);

    @SQL("select id, brand, serial, output, output_unit from zcar limit :1, :2")
    public List<Zcar> pageZcar(int offset, int limit);
}
