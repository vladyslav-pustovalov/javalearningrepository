package fifthhomework;

public class DAOImpl implements DAO{

    @Override
    public Room save(Room room) {
        return room;
    }

    @Override
    public boolean delete(Room room) {
        return false;
    }

    @Override
    public Room update(Room room) {
        return room;
    }

    @Override
    public Room findById(long id) {
        return null;
    }
}
