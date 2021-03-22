package Dao;

import org.springframework.stereotype.Component;

@Component("d")
public class DaoImp implements Idao{

    @Override
    public int getData() {
        return 5;
    }
}
