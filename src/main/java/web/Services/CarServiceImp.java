package web.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDAO;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarServise{

    @Autowired
    private CarDAO carDAO;

    @Override
    public List<Car> carList(Integer count) {
        return carDAO.carList(count);
    }

}
