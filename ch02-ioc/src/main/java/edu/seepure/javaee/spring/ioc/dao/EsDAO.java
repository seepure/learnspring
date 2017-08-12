package edu.seepure.javaee.spring.ioc.dao;

/**
 * Created by xiaoqiang on 2017/8/12.
 */
public class EsDAO implements DAO {
    @Override
    public String getData() {
        return "get data from elastic search";
    }
}
