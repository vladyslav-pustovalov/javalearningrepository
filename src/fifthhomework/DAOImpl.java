package fifthhomework;

import java.util.ArrayList;

public class DAOImpl implements DAO{


    @Override
    public Room save(Room room) {
        System.out.println("Save "+room.toString());
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("Delete "+room.toString());
        return false;
    }

    @Override
    public boolean update(Room room) {
        System.out.println("Update "+room.toString());
        return false;
    }

    @Override
    public Room findById(long id) {
        return null;
    }
}
