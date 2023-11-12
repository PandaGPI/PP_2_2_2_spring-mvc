package web.DAO;

import web.models.Car;

import java.util.List;

public interface CarDAO {
    List<Car> carList(int count);
}
