package Dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImp implements IDao {
    @Override
    public double getData(){
        System.out.println("version base de données");
        double data=34;
        return data;
    }
}
