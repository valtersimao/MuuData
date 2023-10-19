
package model.dao;

import java.util.ArrayList;

/**
 *
 * @author arthur
 */
public interface DAO {
    public boolean insert(Object entite);
    public boolean update(Object entite);
    public boolean delete(long id);
    public Object getById(long id);
    public ArrayList<Object> getAll();
    public ArrayList<Object> getWithFilter(Object filter);
}
