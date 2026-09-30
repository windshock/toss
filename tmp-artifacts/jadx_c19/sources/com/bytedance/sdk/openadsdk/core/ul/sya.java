package com.bytedance.sdk.openadsdk.core.ul;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.utils.thx;
import com.bytedance.sdk.openadsdk.core.pmi;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class sya {
    private static final Object sya = new Object();
    private C0024sya ycx;
    private Context zb;

    sya(Context context) {
        try {
            this.zb = context == null ? pmi.ycx() : context.getApplicationContext();
            if (this.ycx == null) {
                this.ycx = new C0024sya();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V6i8=", "b9oJtyu5ZdeFWA==", "B+cjnBfi", 37);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context sya() {
        Context context = this.zb;
        return context == null ? pmi.ycx() : context;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.ul.sya$sya, reason: collision with other inner class name */
    public class C0024sya {
        private SQLiteDatabase zb = null;

        public C0024sya() {
        }

        private void ycx() {
            ycx ycxVar;
            synchronized (this) {
                try {
                    synchronized (sya.sya) {
                        SQLiteDatabase sQLiteDatabase = this.zb;
                        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                            if (thx.ycx(sya.this.sya())) {
                                sya syaVar = sya.this;
                                ycxVar = syaVar.new ycx(syaVar.sya(), "pag_business.db");
                            } else {
                                sya syaVar2 = sya.this;
                                ycxVar = syaVar2.new ycx(syaVar2.sya(), "pag_business_" + thx.sya(sya.this.sya()) + ".db");
                            }
                            SQLiteDatabase writableDatabase = ycxVar.getWritableDatabase();
                            this.zb = writableDatabase;
                            writableDatabase.setLockingEnabled(false);
                        }
                    }
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V6i8=", "b9oJtyu5ZdeFWJNwlSKRBFL6KLECqGjFgVnS", "WOYolgiYS+6TZcdYgg==", 63);
                    th.getMessage();
                    if (zb()) {
                        throw th;
                    }
                }
            }
        }

        public Cursor ycx(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursorQuery;
            synchronized (this) {
                try {
                    ycx();
                    cursorQuery = this.zb.query(str, strArr, str2, strArr2, str3, str4, str5);
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V6i8=", "b9oJtyu5ZdeFWJNwlSKRBFL6KLECqGjFgVnS", "Svsohxo=", 101);
                    th.getMessage();
                    zb zbVar = new zb();
                    if (zb()) {
                        throw th;
                    }
                    cursorQuery = zbVar;
                }
            }
            return cursorQuery;
        }

        public int ycx(String str, ContentValues contentValues, String str2, String[] strArr) {
            int iUpdate;
            synchronized (this) {
                try {
                    ycx();
                    iUpdate = this.zb.update(str, contentValues, str2, strArr);
                } catch (Exception e) {
                    com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V6i8=", "b9oJtyu5ZdeFWJNwlSKRBFL6KLECqGjFgVnS", "Tv4plBe5", 118);
                    e.getMessage();
                    if (zb()) {
                        throw e;
                    }
                    iUpdate = 0;
                }
            }
            return iUpdate;
        }

        public long ycx(String str, String str2, ContentValues contentValues) {
            long jReplace;
            synchronized (this) {
                try {
                    ycx();
                    jReplace = this.zb.replace(str, str2, contentValues);
                } catch (Exception e) {
                    com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V6i8=", "b9oJtyu5ZdeFWJNwlSKRBFL6KLECqGjFgVnS", "UuA+kBGo", 134);
                    e.getMessage();
                    if (zb()) {
                        throw e;
                    }
                    jReplace = -1;
                }
            }
            return jReplace;
        }

        public long zb(String str, String str2, ContentValues contentValues) {
            try {
                ycx();
                SQLiteDatabase sQLiteDatabase = this.zb;
                if (sQLiteDatabase == null) {
                    return -1L;
                }
                return sQLiteDatabase.insertWithOnConflict(str, str2, contentValues, 5);
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V6i8=", "b9oJtyu5ZdeFWJNwlSKRBFL6KLECqGjFgVnS", "UuA+kBGoRtWyT8dRjRKl", 152);
                e.getMessage();
                return -1L;
            }
        }

        public int ycx(String str, String str2, String[] strArr) {
            int iDelete;
            synchronized (this) {
                try {
                    ycx();
                    iDelete = this.zb.delete(str, str2, strArr);
                } catch (Exception e) {
                    com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V6i8=", "b9oJtyu5ZdeFWJNwlSKRBFL6KLECqGjFgVnS", "X+shkBe5", 164);
                    e.getMessage();
                    if (zb()) {
                        throw e;
                    }
                    iDelete = 0;
                }
            }
            return iDelete;
        }

        private boolean zb() {
            synchronized (this) {
                SQLiteDatabase sQLiteDatabase = this.zb;
                if (sQLiteDatabase != null) {
                    if (sQLiteDatabase.inTransaction()) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    class ycx extends SQLiteOpenHelper {
        final Context ycx;

        public ycx(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
            this.ycx = context;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                ycx(sQLiteDatabase, this.ycx);
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V6i8=", "b9oJtyu5ZdeFWJN5jQWhKlr9KL0GsHnCkg==", "VOAOhwa9fcI=", 202);
                th.getMessage();
            }
        }

        private void ycx(SQLiteDatabase sQLiteDatabase, Context context) throws SQLException {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.xkz.ycx.ycx.zb.lud());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.xkz.ycx.ycx.zb.lt());
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            if (i2 > i3) {
                try {
                    ycx(sQLiteDatabase);
                    ycx(sQLiteDatabase, sya.this.zb);
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V6i8=", "b9oJtyu5ZdeFWJN5jQWhKlr9KL0GsHnCkg==", "VOAJmhSybtWBTtI=", 227);
                    th.getMessage();
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            try {
                if (i2 <= i3) {
                    ycx(sQLiteDatabase, sya.this.zb);
                } else {
                    ycx(sQLiteDatabase);
                    ycx(sQLiteDatabase, sya.this.zb);
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V6i8=", "b9oJtyu5ZdeFWJN5jQWhKlr9KL0GsHnCkg==", "VOAYhQSuaMOF", 250);
            }
        }

        private void ycx(SQLiteDatabase sQLiteDatabase) throws SQLException {
            ArrayList<String> arrayListZb = zb(sQLiteDatabase);
            if (arrayListZb == null || arrayListZb.size() <= 0) {
                return;
            }
            Iterator<String> it = arrayListZb.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
            }
        }

        private ArrayList<String> zb(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayList = new ArrayList<>();
            Cursor cursorRawQuery = null;
            try {
                try {
                    cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
                    if (cursorRawQuery != null) {
                        while (cursorRawQuery.moveToNext()) {
                            String string = cursorRawQuery.getString(0);
                            if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                                arrayList.add(string);
                            }
                        }
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                        return arrayList;
                    }
                } catch (Exception e) {
                    com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V6i8=", "b9oJtyu5ZdeFWJN5jQWhKlr9KL0GsHnCkg==", "V+c+gSeeXcaCRtJO", 292);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
        }
    }

    public C0024sya ycx() {
        return this.ycx;
    }

    class zb extends AbstractCursor {
        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i2) {
            return 0.0d;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i2) {
            return 0.0f;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i2) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i2) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i2) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String getString(int i2) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i2) {
            return true;
        }

        private zb() {
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }
    }
}
