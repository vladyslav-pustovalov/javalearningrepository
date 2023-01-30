package fifthhomework.DB;

import fifthhomework.model.Room;

public interface DAO {

    Room save(Room room);

    boolean delete(Room room);

    Room update(Room room);

    long findById(long id);
}
