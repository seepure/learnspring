package edu.seepure.javaee.spring.ioc.service;

import edu.seepure.javaee.spring.ioc.dao.DAO;

/**
 * Created by xiaoqiang on 2017/8/12.
 */
public class DataServiceImpl implements DataService{
    private DAO dao;

    @Override
    public void getData() {
        System.out.println(dao.getData());
    }

    public DAO getDao() {
        return dao;
    }

    public void setDao(DAO dao) {
        this.dao = dao;
    }
}
