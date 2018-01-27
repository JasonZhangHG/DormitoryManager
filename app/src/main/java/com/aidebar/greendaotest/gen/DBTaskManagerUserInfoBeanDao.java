package com.aidebar.greendaotest.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.education.myoschinatest.bean.DBTaskManagerUserInfoBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DBTASK_MANAGER_USER_INFO_BEAN".
*/
public class DBTaskManagerUserInfoBeanDao extends AbstractDao<DBTaskManagerUserInfoBean, Long> {

    public static final String TABLENAME = "DBTASK_MANAGER_USER_INFO_BEAN";

    /**
     * Properties of entity DBTaskManagerUserInfoBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property CreatTimeAsId = new Property(0, long.class, "creatTimeAsId", true, "_id");
        public final static Property Name = new Property(1, String.class, "name", false, "DBTaskManagerUserInfoBean");
        public final static Property Old = new Property(2, String.class, "old", false, "OLD");
        public final static Property TellPhone = new Property(3, String.class, "tellPhone", false, "TELL_PHONE");
        public final static Property Mail = new Property(4, String.class, "mail", false, "MAIL");
        public final static Property TypeOfWork = new Property(5, String.class, "typeOfWork", false, "TYPE_OF_WORK");
        public final static Property TypeOfWorkManager = new Property(6, int.class, "typeOfWorkManager", false, "TYPE_OF_WORK_MANAGER");
    }


    public DBTaskManagerUserInfoBeanDao(DaoConfig config) {
        super(config);
    }
    
    public DBTaskManagerUserInfoBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DBTASK_MANAGER_USER_INFO_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY NOT NULL ," + // 0: creatTimeAsId
                "\"DBTaskManagerUserInfoBean\" TEXT," + // 1: name
                "\"OLD\" TEXT," + // 2: old
                "\"TELL_PHONE\" TEXT," + // 3: tellPhone
                "\"MAIL\" TEXT," + // 4: mail
                "\"TYPE_OF_WORK\" TEXT," + // 5: typeOfWork
                "\"TYPE_OF_WORK_MANAGER\" INTEGER NOT NULL );"); // 6: typeOfWorkManager
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DBTASK_MANAGER_USER_INFO_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, DBTaskManagerUserInfoBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getCreatTimeAsId());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String old = entity.getOld();
        if (old != null) {
            stmt.bindString(3, old);
        }
 
        String tellPhone = entity.getTellPhone();
        if (tellPhone != null) {
            stmt.bindString(4, tellPhone);
        }
 
        String mail = entity.getMail();
        if (mail != null) {
            stmt.bindString(5, mail);
        }
 
        String typeOfWork = entity.getTypeOfWork();
        if (typeOfWork != null) {
            stmt.bindString(6, typeOfWork);
        }
        stmt.bindLong(7, entity.getTypeOfWorkManager());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, DBTaskManagerUserInfoBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getCreatTimeAsId());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String old = entity.getOld();
        if (old != null) {
            stmt.bindString(3, old);
        }
 
        String tellPhone = entity.getTellPhone();
        if (tellPhone != null) {
            stmt.bindString(4, tellPhone);
        }
 
        String mail = entity.getMail();
        if (mail != null) {
            stmt.bindString(5, mail);
        }
 
        String typeOfWork = entity.getTypeOfWork();
        if (typeOfWork != null) {
            stmt.bindString(6, typeOfWork);
        }
        stmt.bindLong(7, entity.getTypeOfWorkManager());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public DBTaskManagerUserInfoBean readEntity(Cursor cursor, int offset) {
        DBTaskManagerUserInfoBean entity = new DBTaskManagerUserInfoBean( //
            cursor.getLong(offset + 0), // creatTimeAsId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // old
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // tellPhone
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // mail
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // typeOfWork
            cursor.getInt(offset + 6) // typeOfWorkManager
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, DBTaskManagerUserInfoBean entity, int offset) {
        entity.setCreatTimeAsId(cursor.getLong(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setOld(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setTellPhone(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setMail(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setTypeOfWork(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setTypeOfWorkManager(cursor.getInt(offset + 6));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(DBTaskManagerUserInfoBean entity, long rowId) {
        entity.setCreatTimeAsId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(DBTaskManagerUserInfoBean entity) {
        if(entity != null) {
            return entity.getCreatTimeAsId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(DBTaskManagerUserInfoBean entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}