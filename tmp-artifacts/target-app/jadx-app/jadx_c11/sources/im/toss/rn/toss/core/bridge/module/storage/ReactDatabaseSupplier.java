package im.toss.rn.toss.core.bridge.module.storage;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public class ReactDatabaseSupplier extends SQLiteOpenHelper {
    private static int IAuthTabCallbackDefault = 1;

    @Nullable
    private static ReactDatabaseSupplier onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private long IAuthTabCallback;
    private Context onExtraCallback;

    @Nullable
    private SQLiteDatabase onNavigationEvent;

    private ReactDatabaseSupplier(Context context) {
        super(context, "RKStorage", (SQLiteDatabase.CursorFactory) null, 1);
        this.IAuthTabCallback = 6291456L;
        this.onExtraCallback = context;
    }

    public static ReactDatabaseSupplier onNavigationEvent(Context context) {
        int i = 2 % 2;
        if (onExtraCallbackWithResult == null) {
            onExtraCallbackWithResult = new ReactDatabaseSupplier(context.getApplicationContext());
            int i2 = IAuthTabCallbackDefault + 5;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }
        ReactDatabaseSupplier reactDatabaseSupplier = onExtraCallbackWithResult;
        int i4 = IAuthTabCallbackDefault + 17;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return reactDatabaseSupplier;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        sQLiteDatabase.execSQL("CREATE TABLE catalystLocalStorage (key TEXT PRIMARY KEY, value TEXT NOT NULL)");
        if (i3 != 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 87;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        int i3 = 2 % 2;
        if (i != i2) {
            int i4 = onWarmupCompleted + 45;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            IAuthTabCallbackDefault();
            onCreate(sQLiteDatabase);
        }
        int i6 = IAuthTabCallbackDefault + 11;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    boolean onExtraCallback() {
        synchronized (this) {
            SQLiteDatabase sQLiteDatabase = this.onNavigationEvent;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                return true;
            }
            SQLiteException e = null;
            for (int i = 0; i < 2; i++) {
                if (i > 0) {
                    try {
                        IAuthTabCallbackDefault();
                    } catch (SQLiteException e2) {
                        e = e2;
                        try {
                            Thread.sleep(30L);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
                this.onNavigationEvent = getWritableDatabase();
            }
            SQLiteDatabase sQLiteDatabase2 = this.onNavigationEvent;
            if (sQLiteDatabase2 == null) {
                throw e;
            }
            sQLiteDatabase2.setMaximumSize(this.IAuthTabCallback);
            return true;
        }
    }

    public SQLiteDatabase onExtraCallbackWithResult() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this) {
            onExtraCallback();
            sQLiteDatabase = this.onNavigationEvent;
        }
        return sQLiteDatabase;
    }

    public void IAuthTabCallback() throws RuntimeException {
        synchronized (this) {
            try {
                onNavigationEvent();
                onWarmupCompleted();
            } catch (Exception unused) {
                if (IAuthTabCallbackDefault()) {
                } else {
                    throw new RuntimeException("Clearing and deleting database RKStorage failed");
                }
            }
        }
    }

    void onNavigationEvent() {
        synchronized (this) {
            onExtraCallbackWithResult().delete("catalystLocalStorage", null, null);
        }
    }

    private boolean IAuthTabCallbackDefault() {
        boolean zDeleteDatabase;
        synchronized (this) {
            onWarmupCompleted();
            zDeleteDatabase = this.onExtraCallback.deleteDatabase("RKStorage");
        }
        return zDeleteDatabase;
    }

    public void onWarmupCompleted() {
        synchronized (this) {
            SQLiteDatabase sQLiteDatabase = this.onNavigationEvent;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                this.onNavigationEvent.close();
                this.onNavigationEvent = null;
            }
        }
    }
}
