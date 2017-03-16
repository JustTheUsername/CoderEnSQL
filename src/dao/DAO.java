/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Formation
 */
import bddsql.ConnectionBDD;
import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public abstract class DAO<T> {

    protected ConnectionBDD bddmanager = null;

    public DAO() {

        this.bddmanager = ConnectionBDD.getInstance();
    }

    //equivalent à un insernt into T 
    public abstract boolean creer(T obj);

    //equivalent à un delete from T
    public abstract boolean supprimer(T obj);

    //equivalent à un select * from T
    public abstract ArrayList<T> getAll();

    //equivalent à u select * from T WHERE
    public abstract T find(T obj);
    
    public abstract T update(T obj);
}
