package model.dao;

import model.dao.impl.SellerDAOJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDAOJDBC();
    }
}
