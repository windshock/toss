package o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.database.DatabaseIOException;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldMagnifierNodeImpl28ExternalSyntheticLambda0 {
    static {
        HandwritingDetectorNodeExternalSyntheticLambda0.onExtraCallback("media3.database");
    }

    public static void IAuthTabCallback(SQLiteDatabase sQLiteDatabase, int i2, String str, int i3) throws DatabaseIOException, SQLException {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i2));
            contentValues.put("instance_uid", str);
            contentValues.put("version", Integer.valueOf(i3));
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public static void onExtraCallback(SQLiteDatabase sQLiteDatabase, int i2, String str) throws DatabaseIOException {
        try {
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            if (((Boolean) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(-70304357, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, new Object[]{sQLiteDatabase, "ExoPlayerVersions"}, 70304380)).booleanValue()) {
                sQLiteDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", onExtraCallback(i2, str));
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public static int onExtraCallbackWithResult(SQLiteDatabase sQLiteDatabase, int i2, String str) throws DatabaseIOException {
        try {
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            if (!((Boolean) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(-70304357, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, new Object[]{sQLiteDatabase, "ExoPlayerVersions"}, 70304380)).booleanValue()) {
                return -1;
            }
            Cursor cursorQuery = sQLiteDatabase.query("ExoPlayerVersions", new String[]{"version"}, "feature = ? AND instance_uid = ?", onExtraCallback(i2, str), null, null, null);
            try {
                if (cursorQuery.getCount() != 0) {
                    cursorQuery.moveToNext();
                    int i3 = cursorQuery.getInt(0);
                    cursorQuery.close();
                    return i3;
                }
                cursorQuery.close();
                return -1;
            } finally {
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    private static String[] onExtraCallback(int i2, String str) {
        return new String[]{Integer.toString(i2), str};
    }
}
