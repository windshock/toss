package o;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class shouldReMeasureChild extends SQLiteOpenHelper {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 3365764463779263919L;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static shouldReMeasureChild onNavigationEvent;

    private shouldReMeasureChild(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
    }

    public static shouldReMeasureChild onExtraCallback(Context context) {
        shouldReMeasureChild shouldremeasurechild;
        synchronized (shouldReMeasureChild.class) {
            if (onNavigationEvent == null) {
                onNavigationEvent = new shouldReMeasureChild(context, "otp_database", null, 1);
            }
            shouldremeasurechild = onNavigationEvent;
        }
        return shouldremeasurechild;
    }

    public startSmoothScroll IAuthTabCallback(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        startSmoothScroll startsmoothscrollOnExtraCallbackWithResult;
        int i = 2 % 2;
        sQLiteDatabase.beginTransaction();
        try {
            try {
                Object[] objArr = new Object[1];
                a(new char[]{13780, 35014, 13735, 50692, 47037, 10903, 34692, 27673}, KeyEvent.normalizeMetaState(0) + 1, objArr);
                Cursor cursorQuery = sQLiteDatabase.query("otp_user_reg", new String[]{"_id", ((String) objArr[0]).intern(), "user_data", "fail_count", "otp_type", "otp_data"}, "product_name='" + str + "' COLLATE NOCASE AND unique_id='" + str2 + "'", null, null, null, "_id ASC");
                if (cursorQuery.moveToFirst()) {
                    int i2 = cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
                    Object[] objArr2 = new Object[1];
                    a(new char[]{13780, 35014, 13735, 50692, 47037, 10903, 34692, 27673}, -MotionEvent.axisFromString(""), objArr2);
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex(((String) objArr2[0]).intern()));
                    String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("user_data"));
                    startsmoothscrollOnExtraCallbackWithResult = new startSmoothScroll().IAuthTabCallback(i2).onWarmupCompleted(str).asBinder(str2).onExtraCallback(string).IAuthTabCallbackStub(string2).IAuthTabCallback(cursorQuery.getString(cursorQuery.getColumnIndex("fail_count"))).onNavigationEvent(cursorQuery.getString(cursorQuery.getColumnIndex("otp_type"))).onExtraCallbackWithResult(cursorQuery.getString(cursorQuery.getColumnIndex("otp_data")));
                } else {
                    startsmoothscrollOnExtraCallbackWithResult = null;
                }
                try {
                    cursorQuery.close();
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    int i3 = onExtraCallback + 51;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    return startsmoothscrollOnExtraCallbackWithResult;
                } catch (Exception unused) {
                    return startsmoothscrollOnExtraCallbackWithResult;
                }
            } finally {
                sQLiteDatabase.endTransaction();
            }
        } catch (Exception unused2) {
            startsmoothscrollOnExtraCallbackWithResult = null;
        }
    }

    public boolean IAuthTabCallback(SQLiteDatabase sQLiteDatabase, startSmoothScroll startsmoothscroll) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (!(!asBinder(sQLiteDatabase, startsmoothscroll.IAuthTabCallback, startsmoothscroll.onWarmupCompleted))) {
            return false;
        }
        sQLiteDatabase.beginTransaction();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("product_name", startsmoothscroll.IAuthTabCallback);
            contentValues.put("unique_id", startsmoothscroll.onWarmupCompleted);
            Object[] objArr = new Object[1];
            a(new char[]{13780, 35014, 13735, 50692, 47037, 10903, 34692, 27673}, View.resolveSizeAndState(0, 0, 0) + 1, objArr);
            contentValues.put(((String) objArr[0]).intern(), startsmoothscroll.onExtraCallback);
            contentValues.put("user_data", startsmoothscroll.onExtraCallbackWithResult);
            contentValues.put("fail_count", startsmoothscroll.onNavigationEvent);
            contentValues.put("otp_type", startsmoothscroll.asInterface);
            contentValues.put("otp_data", startsmoothscroll.IAuthTabCallbackDefault);
            sQLiteDatabase.insert("otp_user_reg", null, contentValues);
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception unused) {
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
        sQLiteDatabase.endTransaction();
        int i4 = onExtraCallbackWithResult + 119;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public boolean asBinder(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallback(sQLiteDatabase, str, str2);
            obj.hashCode();
            throw null;
        }
        if (IAuthTabCallback(sQLiteDatabase, str, str2) == null) {
            return false;
        }
        int i3 = onExtraCallbackWithResult + 103;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return true;
        }
        throw null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        sQLiteDatabase.beginTransaction();
        try {
            if (i3 != 0) {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS otp_user_reg (_id INTEGER PRIMARY KEY,product_name VARCHAR,unique_id VARCHAR,salt VARCHAR,user_data VARCHAR,fail_count VARCHAR,otp_type VARCHAR,otp_data VARCHAR)");
                sQLiteDatabase.setTransactionSuccessful();
            } else {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS otp_user_reg (_id INTEGER PRIMARY KEY,product_name VARCHAR,unique_id VARCHAR,salt VARCHAR,user_data VARCHAR,fail_count VARCHAR,otp_type VARCHAR,otp_data VARCHAR)");
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                throw null;
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
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT  * FROM otp_user_reg WHERE product_name='" + str + "'", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("unique_id"));
                    if (!(!str2.equalsIgnoreCase(string))) {
                        int i2 = onExtraCallbackWithResult + 63;
                        onExtraCallback = i2 % 128;
                        int i3 = i2 % 2;
                        sQLiteDatabase.delete("otp_user_reg", "unique_id=?", new String[]{string});
                        int i4 = onExtraCallback + 55;
                        onExtraCallbackWithResult = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = 5 % 5;
                        }
                    }
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception unused) {
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public String onExtraCallbackWithResult(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(sQLiteDatabase, str, str2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        startSmoothScroll startsmoothscrollOnWarmupCompleted = onWarmupCompleted(sQLiteDatabase, str, str2);
        if (startsmoothscrollOnWarmupCompleted == null) {
            return "";
        }
        int i3 = onExtraCallbackWithResult + 11;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return startsmoothscrollOnWarmupCompleted.onExtraCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        r3 = new android.content.ContentValues();
        r3.put("product_name", r9);
        r3.put("unique_id", r10);
        r6 = new java.lang.Object[1];
        a(new char[]{13780, 35014, 13735, 50692, 47037, 10903, 34692, 27673}, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, r6);
        r3.put(((java.lang.String) r6[0]).intern(), r0.onExtraCallback);
        r3.put("user_data", r0.onExtraCallbackWithResult);
        r3.put("otp_type", r0.asInterface);
        r3.put("otp_data", r0.IAuthTabCallbackDefault);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0073, code lost:
    
        if ((!r12) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        r1 = java.lang.Integer.parseInt(r0.onNavigationEvent) + 1;
        r10 = o.shouldReMeasureChild.onExtraCallback + 113;
        o.shouldReMeasureChild.onExtraCallbackWithResult = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0087, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a0, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a1, code lost:
    
        r8.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a4, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b6, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (asBinder(r8, r9, r2) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (asBinder(r8, r9, r2) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r8.beginTransaction();
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int onNavigationEvent(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, boolean z) {
        startSmoothScroll startsmoothscrollIAuthTabCallback;
        String str4;
        int i;
        ContentValues contentValues;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 47;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = 0;
        if (i3 % 2 != 0) {
            startsmoothscrollIAuthTabCallback = IAuthTabCallback(sQLiteDatabase, str, str2);
            str4 = startsmoothscrollIAuthTabCallback.onWarmupCompleted;
        } else {
            startsmoothscrollIAuthTabCallback = IAuthTabCallback(sQLiteDatabase, str, str2);
            str4 = startsmoothscrollIAuthTabCallback.onWarmupCompleted;
        }
        contentValues.put("fail_count", String.valueOf(i4));
        sQLiteDatabase.update("otp_user_reg", contentValues, "product_name=? AND unique_id=?", new String[]{str, str4});
        sQLiteDatabase.setTransactionSuccessful();
        sQLiteDatabase.endTransaction();
        i = onExtraCallbackWithResult + 15;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return i4;
        }
        throw null;
        sQLiteDatabase.endTransaction();
        i = onExtraCallbackWithResult + 15;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
        }
    }

    public String onNavigationEvent(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        startSmoothScroll startsmoothscrollOnWarmupCompleted = onWarmupCompleted(sQLiteDatabase, str, str2);
        if (startsmoothscrollOnWarmupCompleted == null) {
            int i4 = onExtraCallbackWithResult + 119;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return "";
        }
        int i6 = onExtraCallback + 43;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        String str3 = startsmoothscrollOnWarmupCompleted.onExtraCallbackWithResult;
        if (i7 == 0) {
            return str3;
        }
        throw null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 15;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0124 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public startSmoothScroll onWarmupCompleted(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        startSmoothScroll startsmoothscroll;
        int i;
        Cursor cursorQuery;
        int i2 = 2 % 2;
        sQLiteDatabase.beginTransaction();
        try {
            try {
                Object[] objArr = new Object[1];
                a(new char[]{13780, 35014, 13735, 50692, 47037, 10903, 34692, 27673}, 1 - KeyEvent.normalizeMetaState(0), objArr);
                cursorQuery = sQLiteDatabase.query("otp_user_reg", new String[]{"_id", ((String) objArr[0]).intern(), "user_data", "fail_count", "otp_type", "otp_data"}, "product_name='" + str + "' COLLATE NOCASE AND unique_id='" + str2 + "'", null, null, null, "_id ASC");
                if (cursorQuery.moveToFirst()) {
                    int i3 = cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
                    Object[] objArr2 = new Object[1];
                    a(new char[]{13780, 35014, 13735, 50692, 47037, 10903, 34692, 27673}, (Process.myTid() >> 22) + 1, objArr2);
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex(((String) objArr2[0]).intern()));
                    String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("user_data"));
                    startSmoothScroll startsmoothscrollOnExtraCallbackWithResult = new startSmoothScroll().onWarmupCompleted(str).asBinder(str2).IAuthTabCallback(i3).onExtraCallback(string).IAuthTabCallbackStub(string2).IAuthTabCallback(cursorQuery.getString(cursorQuery.getColumnIndex("fail_count"))).onNavigationEvent(cursorQuery.getString(cursorQuery.getColumnIndex("otp_type"))).onExtraCallbackWithResult(cursorQuery.getString(cursorQuery.getColumnIndex("otp_data")));
                    int i4 = onExtraCallbackWithResult + 123;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    startsmoothscroll = startsmoothscrollOnExtraCallbackWithResult;
                } else {
                    startsmoothscroll = null;
                }
            } catch (Exception e) {
                e = e;
                startsmoothscroll = null;
            }
            try {
                cursorQuery.close();
                sQLiteDatabase.setTransactionSuccessful();
            } catch (Exception e2) {
                e = e2;
                e.getMessage();
                sQLiteDatabase.endTransaction();
                i = onExtraCallbackWithResult + 123;
                onExtraCallback = i % 128;
                if (i % 2 == 0) {
                }
            }
            sQLiteDatabase.endTransaction();
            i = onExtraCallbackWithResult + 123;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                return startsmoothscroll;
            }
            throw null;
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 69;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 45813), 83 - TextUtils.lastIndexOf("", '0'), TextUtils.indexOf((CharSequence) "", '0') + 21234, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - View.MeasureSpec.getSize(0)), 19 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 8808 - (ViewConfiguration.getJumpTapTimeout() >> 16), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $10 + 93;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }
}
