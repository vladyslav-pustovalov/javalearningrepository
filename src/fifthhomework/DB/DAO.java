package fifthhomework.DB;

import fifthhomework.model.Room;

public interface DAO {

    Room save(Room room);

    boolean delete(Room room);

    boolean update(Room room);

    Room findById(long id);
}
