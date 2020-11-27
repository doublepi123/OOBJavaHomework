package com.lcy.student.daoimpl;

import com.lcy.student.dao.StudentDao;
import com.lcy.student.model.Student;
import com.lcy.student.util.SQLHelper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentDaoimpl implements StudentDao {
    private SQLHelper sqlHelper;
    public StudentDaoimpl(){
        sqlHelper = new SQLHelper();
    }
    @Override
    public boolean add(Student st) {
        String sql = "INSERT INTO studentinfo VALUES('"+st.getId()+"','"+st.getName()+"','"+st.getAge()+"')";
        return sqlHelper.executeUpdate(sql) == 1 ? true : false;
    }

    @Override
    public boolean update(Student st) {
        return false;
    }

    @Override
    public boolean delete(Student st) {
        return delete(st.getId());
    }

    @Override
    public boolean delete(String id) {
        String sql = "DELETE FROM studentinfo WHERE id = '"+id+"+'";
        return sqlHelper.executeUpdate(sql) == 1 ? true : false;
    }

    @Override
    public Student find(String id) {
        String sql = "SELECT * FROM studentinfo WHERE id = '"+id+"+'";
        ResultSet rs = sqlHelper.executeQuery(sql);
        Student st = null;
        try{
            if(rs.next()){
                st = new Student(rs.getString("id"),rs.getString("name"),rs.getInt("age"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return st;
    }

    @Override
    public List<Student> findByName(String name) {
        String sql = "SELECT * FROM studentinfo WHERE name = '"+name+"+'";
        ResultSet rs = sqlHelper.executeQuery(sql);
        List<Student> L = new List<Student>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Student> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Student student) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Student> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Student> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public Student get(int index) {
                return null;
            }

            @Override
            public Student set(int index, Student element) {
                return null;
            }

            @Override
            public void add(int index, Student element) {

            }

            @Override
            public Student remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Student> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Student> listIterator(int index) {
                return null;
            }

            @Override
            public List<Student> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        Student st = null;
        try{
            while(rs.next()){
                st = new Student(rs.getString("id"),rs.getString("name"),rs.getInt("age"));
                L.add(st);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return L;
    }
}
