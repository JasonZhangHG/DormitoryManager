package com.aidebar.greendaotest.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.dormitory.myoschinatest.bean.DBStudentMessage;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DBSTUDENT_MESSAGE".
*/
public class DBStudentMessageDao extends AbstractDao<DBStudentMessage, Long> {

    public static final String TABLENAME = "DBSTUDENT_MESSAGE";

    /**
     * Properties of entity DBStudentMessage.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property CreatTimeAsId = new Property(0, long.class, "creatTimeAsId", true, "_id");
        public final static Property SenderName = new Property(1, String.class, "senderName", false, "DBStudentMessage");
        public final static Property SenderUid = new Property(2, String.class, "senderUid", false, "SENDER_UID");
        public final static Property SenderXueHao = new Property(3, String.class, "senderXueHao", false, "SENDER_XUE_HAO");
        public final static Property SenderZhuanYe = new Property(4, String.class, "senderZhuanYe", false, "SENDER_ZHUAN_YE");
        public final static Property SenderXueYuan = new Property(5, String.class, "senderXueYuan", false, "SENDER_XUE_YUAN");
        public final static Property SenderShuSheHao = new Property(6, String.class, "senderShuSheHao", false, "SENDER_SHU_SHE_HAO");
        public final static Property SenderChuangWeiHao = new Property(7, String.class, "senderChuangWeiHao", false, "SENDER_CHUANG_WEI_HAO");
        public final static Property MessageValue = new Property(8, String.class, "messageValue", false, "MESSAGE_VALUE");
        public final static Property MessageTitle = new Property(9, String.class, "messageTitle", false, "MESSAGE_TITLE");
    }


    public DBStudentMessageDao(DaoConfig config) {
        super(config);
    }
    
    public DBStudentMessageDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DBSTUDENT_MESSAGE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY NOT NULL ," + // 0: creatTimeAsId
                "\"DBStudentMessage\" TEXT," + // 1: senderName
                "\"SENDER_UID\" TEXT," + // 2: senderUid
                "\"SENDER_XUE_HAO\" TEXT," + // 3: senderXueHao
                "\"SENDER_ZHUAN_YE\" TEXT," + // 4: senderZhuanYe
                "\"SENDER_XUE_YUAN\" TEXT," + // 5: senderXueYuan
                "\"SENDER_SHU_SHE_HAO\" TEXT," + // 6: senderShuSheHao
                "\"SENDER_CHUANG_WEI_HAO\" TEXT," + // 7: senderChuangWeiHao
                "\"MESSAGE_VALUE\" TEXT," + // 8: messageValue
                "\"MESSAGE_TITLE\" TEXT);"); // 9: messageTitle
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DBSTUDENT_MESSAGE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, DBStudentMessage entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getCreatTimeAsId());
 
        String senderName = entity.getSenderName();
        if (senderName != null) {
            stmt.bindString(2, senderName);
        }
 
        String senderUid = entity.getSenderUid();
        if (senderUid != null) {
            stmt.bindString(3, senderUid);
        }
 
        String senderXueHao = entity.getSenderXueHao();
        if (senderXueHao != null) {
            stmt.bindString(4, senderXueHao);
        }
 
        String senderZhuanYe = entity.getSenderZhuanYe();
        if (senderZhuanYe != null) {
            stmt.bindString(5, senderZhuanYe);
        }
 
        String senderXueYuan = entity.getSenderXueYuan();
        if (senderXueYuan != null) {
            stmt.bindString(6, senderXueYuan);
        }
 
        String senderShuSheHao = entity.getSenderShuSheHao();
        if (senderShuSheHao != null) {
            stmt.bindString(7, senderShuSheHao);
        }
 
        String senderChuangWeiHao = entity.getSenderChuangWeiHao();
        if (senderChuangWeiHao != null) {
            stmt.bindString(8, senderChuangWeiHao);
        }
 
        String messageValue = entity.getMessageValue();
        if (messageValue != null) {
            stmt.bindString(9, messageValue);
        }
 
        String messageTitle = entity.getMessageTitle();
        if (messageTitle != null) {
            stmt.bindString(10, messageTitle);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, DBStudentMessage entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getCreatTimeAsId());
 
        String senderName = entity.getSenderName();
        if (senderName != null) {
            stmt.bindString(2, senderName);
        }
 
        String senderUid = entity.getSenderUid();
        if (senderUid != null) {
            stmt.bindString(3, senderUid);
        }
 
        String senderXueHao = entity.getSenderXueHao();
        if (senderXueHao != null) {
            stmt.bindString(4, senderXueHao);
        }
 
        String senderZhuanYe = entity.getSenderZhuanYe();
        if (senderZhuanYe != null) {
            stmt.bindString(5, senderZhuanYe);
        }
 
        String senderXueYuan = entity.getSenderXueYuan();
        if (senderXueYuan != null) {
            stmt.bindString(6, senderXueYuan);
        }
 
        String senderShuSheHao = entity.getSenderShuSheHao();
        if (senderShuSheHao != null) {
            stmt.bindString(7, senderShuSheHao);
        }
 
        String senderChuangWeiHao = entity.getSenderChuangWeiHao();
        if (senderChuangWeiHao != null) {
            stmt.bindString(8, senderChuangWeiHao);
        }
 
        String messageValue = entity.getMessageValue();
        if (messageValue != null) {
            stmt.bindString(9, messageValue);
        }
 
        String messageTitle = entity.getMessageTitle();
        if (messageTitle != null) {
            stmt.bindString(10, messageTitle);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public DBStudentMessage readEntity(Cursor cursor, int offset) {
        DBStudentMessage entity = new DBStudentMessage( //
            cursor.getLong(offset + 0), // creatTimeAsId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // senderName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // senderUid
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // senderXueHao
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // senderZhuanYe
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // senderXueYuan
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // senderShuSheHao
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // senderChuangWeiHao
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // messageValue
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9) // messageTitle
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, DBStudentMessage entity, int offset) {
        entity.setCreatTimeAsId(cursor.getLong(offset + 0));
        entity.setSenderName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setSenderUid(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setSenderXueHao(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setSenderZhuanYe(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setSenderXueYuan(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setSenderShuSheHao(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setSenderChuangWeiHao(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setMessageValue(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setMessageTitle(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(DBStudentMessage entity, long rowId) {
        entity.setCreatTimeAsId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(DBStudentMessage entity) {
        if(entity != null) {
            return entity.getCreatTimeAsId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(DBStudentMessage entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
