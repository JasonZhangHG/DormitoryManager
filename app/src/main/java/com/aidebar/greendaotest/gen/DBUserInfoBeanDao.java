package com.aidebar.greendaotest.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.dormitory.myoschinatest.bean.DBUserInfoBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DBUSER_INFO_BEAN".
*/
public class DBUserInfoBeanDao extends AbstractDao<DBUserInfoBean, Long> {

    public static final String TABLENAME = "DBUSER_INFO_BEAN";

    /**
     * Properties of entity DBUserInfoBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property CreatTimeAsId = new Property(0, long.class, "creatTimeAsId", true, "_id");
        public final static Property UserName = new Property(1, String.class, "userName", false, "DBUserInfoBean");
        public final static Property PassWord = new Property(2, String.class, "passWord", false, "PASS_WORD");
        public final static Property Name = new Property(3, String.class, "name", false, "NAME");
        public final static Property Old = new Property(4, String.class, "old", false, "OLD");
        public final static Property TellPhone = new Property(5, String.class, "tellPhone", false, "TELL_PHONE");
        public final static Property Mail = new Property(6, String.class, "mail", false, "MAIL");
    }


    public DBUserInfoBeanDao(DaoConfig config) {
        super(config);
    }
    
    public DBUserInfoBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DBUSER_INFO_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY NOT NULL ," + // 0: creatTimeAsId
                "\"DBUserInfoBean\" TEXT," + // 1: userName
                "\"PASS_WORD\" TEXT," + // 2: passWord
                "\"NAME\" TEXT," + // 3: name
                "\"OLD\" TEXT," + // 4: old
                "\"TELL_PHONE\" TEXT," + // 5: tellPhone
                "\"MAIL\" TEXT);"); // 6: mail
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DBUSER_INFO_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, DBUserInfoBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getCreatTimeAsId());
 
        String userName = entity.getUserName();
        if (userName != null) {
            stmt.bindString(2, userName);
        }
 
        String passWord = entity.getPassWord();
        if (passWord != null) {
            stmt.bindString(3, passWord);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(4, name);
        }
 
        String old = entity.getOld();
        if (old != null) {
            stmt.bindString(5, old);
        }
 
        String tellPhone = entity.getTellPhone();
        if (tellPhone != null) {
            stmt.bindString(6, tellPhone);
        }
 
        String mail = entity.getMail();
        if (mail != null) {
            stmt.bindString(7, mail);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, DBUserInfoBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getCreatTimeAsId());
 
        String userName = entity.getUserName();
        if (userName != null) {
            stmt.bindString(2, userName);
        }
 
        String passWord = entity.getPassWord();
        if (passWord != null) {
            stmt.bindString(3, passWord);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(4, name);
        }
 
        String old = entity.getOld();
        if (old != null) {
            stmt.bindString(5, old);
        }
 
        String tellPhone = entity.getTellPhone();
        if (tellPhone != null) {
            stmt.bindString(6, tellPhone);
        }
 
        String mail = entity.getMail();
        if (mail != null) {
            stmt.bindString(7, mail);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public DBUserInfoBean readEntity(Cursor cursor, int offset) {
        DBUserInfoBean entity = new DBUserInfoBean( //
            cursor.getLong(offset + 0), // creatTimeAsId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // userName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // passWord
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // name
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // old
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // tellPhone
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6) // mail
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, DBUserInfoBean entity, int offset) {
        entity.setCreatTimeAsId(cursor.getLong(offset + 0));
        entity.setUserName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setPassWord(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setOld(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setTellPhone(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setMail(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(DBUserInfoBean entity, long rowId) {
        entity.setCreatTimeAsId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(DBUserInfoBean entity) {
        if(entity != null) {
            return entity.getCreatTimeAsId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(DBUserInfoBean entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
