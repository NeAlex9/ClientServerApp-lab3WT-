package by.server.dao.impl;

import by.client.entity.Student;
import by.client.entity.User;
import by.server.dao.StudentServerDAO;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class StudentServerDAOImpl implements StudentServerDAO {
    private static final String STUDENTS_XML = "src/main/resources/students.xml";
    private static final String USERS_XML = "src/main/resources/users.xml";
    private final ReentrantReadWriteLock studentsLock = new ReentrantReadWriteLock(true);
    private final ReentrantReadWriteLock usersLock = new ReentrantReadWriteLock(true);

    @Override
    public List<Student> getAll() {
        return null;
    }

    @Override
    public Student get(int id) {
        return null;
    }

    @Override
    public User userExists(User user) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void rewriteUsers(List<User> users) throws FileNotFoundException {

    }

    @Override
    public void rewriteStudents(List<Student> students) throws FileNotFoundException {

    }
}
