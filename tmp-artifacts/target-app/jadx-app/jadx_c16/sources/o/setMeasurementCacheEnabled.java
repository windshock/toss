package o;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class setMeasurementCacheEnabled extends SQLiteOpenHelper {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 5744116041127454484L;
    private static int onExtraCallback = 0;
    private static setMeasurementCacheEnabled onExtraCallbackWithResult = null;
    private static int onWarmupCompleted = 1;

    private setMeasurementCacheEnabled(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
    }

    public static setMeasurementCacheEnabled onExtraCallbackWithResult(Context context) {
        setMeasurementCacheEnabled setmeasurementcacheenabled;
        synchronized (setMeasurementCacheEnabled.class) {
            if (onExtraCallbackWithResult == null) {
                onExtraCallbackWithResult = new setMeasurementCacheEnabled(context, "otp_temp_database", null, 1);
            }
            setmeasurementcacheenabled = onExtraCallbackWithResult;
        }
        return setmeasurementcacheenabled;
    }

    public boolean IAuthTabCallback(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onNavigationEvent(sQLiteDatabase, str, str2);
            obj.hashCode();
            throw null;
        }
        if (onNavigationEvent(sQLiteDatabase, str, str2) == null) {
            int i3 = onWarmupCompleted + 27;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = onExtraCallback + 53;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public boolean IAuthTabCallback(SQLiteDatabase sQLiteDatabase, startSmoothScroll startsmoothscroll) {
        int i = 2 % 2;
        if (IAuthTabCallback(sQLiteDatabase, startsmoothscroll.IAuthTabCallback, startsmoothscroll.onWarmupCompleted)) {
            return false;
        }
        sQLiteDatabase.beginTransaction();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("product_name", startsmoothscroll.IAuthTabCallback);
            contentValues.put("unique_id", startsmoothscroll.onWarmupCompleted);
            Object[] objArr = new Object[1];
            a(new char[]{57936, 62833, 52265, 42958}, ImageFormat.getBitsPerPixel(0) + 5940, objArr);
            contentValues.put(((String) objArr[0]).intern(), startsmoothscroll.onExtraCallback);
            contentValues.put("user_data", startsmoothscroll.onExtraCallbackWithResult);
            contentValues.put("fail_count", startsmoothscroll.onNavigationEvent);
            contentValues.put("otp_type", startsmoothscroll.asInterface);
            contentValues.put("otp_data", startsmoothscroll.IAuthTabCallbackDefault);
            sQLiteDatabase.insert("otp_temp_user_reg", null, contentValues);
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception unused) {
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
        sQLiteDatabase.endTransaction();
        int i2 = onExtraCallback;
        int i3 = i2 + 99;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 61;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        sQLiteDatabase.beginTransaction();
        try {
            if (i3 == 0) {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS otp_temp_user_reg (_id INTEGER PRIMARY KEY,product_name VARCHAR,unique_id VARCHAR,salt VARCHAR,user_data VARCHAR,fail_count VARCHAR,otp_type VARCHAR,otp_data VARCHAR)");
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                sQLiteDatabase = 5 / 0;
            } else {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS otp_temp_user_reg (_id INTEGER PRIMARY KEY,product_name VARCHAR,unique_id VARCHAR,salt VARCHAR,user_data VARCHAR,fail_count VARCHAR,otp_type VARCHAR,otp_data VARCHAR)");
                sQLiteDatabase.setTransactionSuccessful();
            }
        } catch (Exception unused) {
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public void onExtraCallback(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        int i = 2 % 2;
        sQLiteDatabase.beginTransaction();
        try {
            Object obj = null;
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT  * FROM otp_temp_user_reg WHERE product_name='" + str + "'", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("unique_id"));
                    if (str2.equalsIgnoreCase(string)) {
                        int i2 = onWarmupCompleted + 47;
                        onExtraCallback = i2 % 128;
                        if (i2 % 2 != 0) {
                            sQLiteDatabase.delete("otp_temp_user_reg", "unique_id=?", new String[]{string});
                        } else {
                            sQLiteDatabase.delete("otp_temp_user_reg", "unique_id=?", new String[]{string});
                        }
                    }
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            int i3 = onWarmupCompleted + 27;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Exception unused) {
            sQLiteDatabase.endTransaction();
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    public startSmoothScroll onExtraCallbackWithResult(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        startSmoothScroll startsmoothscrollOnExtraCallbackWithResult;
        Cursor cursorQuery;
        int i = 2 % 2;
        sQLiteDatabase.beginTransaction();
        try {
            try {
                Object[] objArr = new Object[1];
                a(new char[]{57936, 62833, 52265, 42958}, 5939 - Gravity.getAbsoluteGravity(0, 0), objArr);
                cursorQuery = sQLiteDatabase.query("otp_temp_user_reg", new String[]{"_id", ((String) objArr[0]).intern(), "user_data", "fail_count", "otp_type", "otp_data"}, "product_name='" + str + "' COLLATE NOCASE AND unique_id='" + str2 + "'", null, null, null, "_id ASC");
                if (cursorQuery.moveToFirst()) {
                    int i2 = cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
                    Object[] objArr2 = new Object[1];
                    a(new char[]{57936, 62833, 52265, 42958}, 5939 - (ViewConfiguration.getTapTimeout() >> 16), objArr2);
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex(((String) objArr2[0]).intern()));
                    String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("user_data"));
                    startsmoothscrollOnExtraCallbackWithResult = new startSmoothScroll().onWarmupCompleted(str).asBinder(str2).IAuthTabCallback(i2).onExtraCallback(string).IAuthTabCallbackStub(string2).IAuthTabCallback(cursorQuery.getString(cursorQuery.getColumnIndex("fail_count"))).onNavigationEvent(cursorQuery.getString(cursorQuery.getColumnIndex("otp_type"))).onExtraCallbackWithResult(cursorQuery.getString(cursorQuery.getColumnIndex("otp_data")));
                } else {
                    startsmoothscrollOnExtraCallbackWithResult = null;
                }
            } catch (Throwable th) {
                sQLiteDatabase.endTransaction();
                throw th;
            }
        } catch (Exception e) {
            e = e;
            startsmoothscrollOnExtraCallbackWithResult = null;
        }
        try {
            cursorQuery.close();
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception e2) {
            e = e2;
            e.getMessage();
            sQLiteDatabase.endTransaction();
            int i3 = onExtraCallback + 73;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return startsmoothscrollOnExtraCallbackWithResult;
        }
        sQLiteDatabase.endTransaction();
        int i32 = onExtraCallback + 73;
        onWarmupCompleted = i32 % 128;
        int i42 = i32 % 2;
        return startsmoothscrollOnExtraCallbackWithResult;
    }

    public startSmoothScroll onNavigationEvent(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        startSmoothScroll startsmoothscrollOnExtraCallbackWithResult;
        startSmoothScroll startsmoothscroll;
        int i = 2 % 2;
        sQLiteDatabase.beginTransaction();
        try {
            try {
                Object[] objArr = new Object[1];
                a(new char[]{57936, 62833, 52265, 42958}, 5938 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
                Cursor cursorQuery = sQLiteDatabase.query("otp_temp_user_reg", new String[]{"_id", ((String) objArr[0]).intern(), "user_data", "fail_count", "otp_type", "otp_data"}, "product_name='" + str + "' COLLATE NOCASE AND unique_id='" + str2 + "'", null, null, null, "_id ASC");
                if (cursorQuery.moveToFirst()) {
                    try {
                        int i2 = cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
                        Object[] objArr2 = new Object[1];
                        a(new char[]{57936, 62833, 52265, 42958}, Color.blue(0) + 5939, objArr2);
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex(((String) objArr2[0]).intern()));
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("user_data"));
                        startsmoothscrollOnExtraCallbackWithResult = new startSmoothScroll().IAuthTabCallback(i2).onWarmupCompleted(str).asBinder(str2).onExtraCallback(string).IAuthTabCallbackStub(string2).IAuthTabCallback(cursorQuery.getString(cursorQuery.getColumnIndex("fail_count"))).onNavigationEvent(cursorQuery.getString(cursorQuery.getColumnIndex("otp_type"))).onExtraCallbackWithResult(cursorQuery.getString(cursorQuery.getColumnIndex("otp_data")));
                        int i3 = onExtraCallback + 17;
                        onWarmupCompleted = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i4 = 4 % 2;
                        }
                    } catch (Exception unused) {
                        startsmoothscroll = null;
                        return startsmoothscroll;
                    }
                } else {
                    startsmoothscrollOnExtraCallbackWithResult = null;
                }
                try {
                    cursorQuery.close();
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    int i5 = onExtraCallback + 103;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        return startsmoothscrollOnExtraCallbackWithResult;
                    }
                    throw null;
                } catch (Exception unused2) {
                    startsmoothscroll = startsmoothscrollOnExtraCallbackWithResult;
                    return startsmoothscroll;
                }
            } finally {
                sQLiteDatabase.endTransaction();
            }
        } catch (Exception unused3) {
            startsmoothscrollOnExtraCallbackWithResult = null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 31;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onWarmupCompleted(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        sQLiteDatabase.beginTransaction();
        try {
            try {
                if (i3 == 0) {
                    String[] strArr = new String[0];
                    strArr[1] = str2;
                    sQLiteDatabase.delete("otp_temp_user_reg", "unique_id=?", strArr);
                } else {
                    sQLiteDatabase.delete("otp_temp_user_reg", "unique_id=?", new String[]{str2});
                }
                sQLiteDatabase.setTransactionSuccessful();
            } catch (Exception e) {
                e.getMessage();
            }
            sQLiteDatabase.endTransaction();
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 49;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.lastIndexOf("", '0', 0) + 25, (ViewConfiguration.getLongPressTimeout() >> 16) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() & (IAuthTabCallback % 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 60, KeyEvent.normalizeMetaState(0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 24 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 19628, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 59 - (ViewConfiguration.getLongPressTimeout() >> 16), KeyEvent.normalizeMetaState(0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i6 = $10 + 35;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            try {
                Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 'k' - AndroidCharacter.getMirror('0'), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr2);
    }
}
