package fifthhomework.DB;

import fifthhomework.model.Room;

public class DAOImpl implements DAO {


    @Override
    public Room save(Room room) {
        System.out.println("Save " + room.toString());
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("Delete " + room.toString());
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println("Update " + room.toString());
        return room;
    }

    @Override
    public long findById(long id) {
        System.out.println("Find room by ID " + id);
        return id;
    }
}
