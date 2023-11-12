package web.DAO;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImp implements CarDAO{
    @Override
    public List<Car> carList(int count) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("F", 5, "black"));
        carList.add(new Car("S", 7, "green"));
        carList.add(new Car("A", 3, "yellow"));
        carList.add(new Car("Q", 10, "grey"));
        carList.add(new Car("L", 1, "red"));
        if (count >= 5 || count <= 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
