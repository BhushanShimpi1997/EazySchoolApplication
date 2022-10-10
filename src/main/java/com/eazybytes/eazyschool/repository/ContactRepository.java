package com.eazybytes.eazyschool.repository;

import com.eazybytes.eazyschool.model.Contact;
import com.eazybytes.eazyschool.rowmappers.ContactRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ContactRepository extends CrudRepository<Contact,Integer> {

   /* private JdbcTemplate jdbcTemplate;

    @Autowired
    public ContactRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int saveContactMsg(Contact contact){
        String sql="INSERT INTO CONTACT_MSG(NAME,mobile_num,email,subject,message,status,created_at,created_by)"
                    +"VALUES(?,?,?,?,?,?,?,?)";
        return this.jdbcTemplate.update(sql,contact.getName(),contact.getMobileNum(),contact.getEmail(),
                                 contact.getSubject(),contact.getMessage(),contact.getStatus(),
                                 contact.getCreatedAt(),contact.getCreatedBy());
    }
    public List<Contact> findMsgsWithOpenStatus(String status) {
        String sql="SELECT * FROM CONTACT_MSG WHERE STATUS=?";
        return this.jdbcTemplate.query(sql, new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps) throws SQLException {
                ps.setString(1,status);
            }
        },new ContactRowMapper());
    }

    public int updateMsgStatus(int id, String status, String updated_by) {
        String sql="UPDATE CONTACT_MSG SET STATUS=?,UPDATED_BY=?,UPDATED_AT=? WHERE CONTACT_ID=?";
        return jdbcTemplate.update(sql, new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps) throws SQLException {
                ps.setString(1,status);
                ps.setString(2,updated_by);
                ps.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
                ps.setInt(4,id);
            }
        });
    }*/

    // Derived Query In JPA
     public List<Contact> findByStatus(String status);

}
