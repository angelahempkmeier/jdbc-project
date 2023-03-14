package application;

import db.DB;
import db.DbException;
import db.DbIntegrityException;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("TESTE 1: seller findById");
        Seller seller0 = sellerDao.findById(3);
        System.out.println(seller0);

        System.out.println();
        System.out.println("TESTE 2: seller findByDepartment");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for(Seller obj : list){
            System.out.println(obj);
        }

        System.out.println();
        System.out.println("TESTE 3: seller findAll");
        List<Seller> list2 = sellerDao.findAll();
        for(Seller obj : list2){
            System.out.println(obj);
        }

        System.out.println();
        System.out.println("TESTE 4: seller insert");
        Seller seller1 = new Seller(null, "Greg", "greg@gmail", new Date(), 4000.0, department);
        sellerDao.insert(seller1);
        System.out.println("Inserted! New id = " + seller1.getId());


    }
}