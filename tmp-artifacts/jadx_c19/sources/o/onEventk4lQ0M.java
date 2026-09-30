package o;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class onEventk4lQ0M extends SQLiteOpenHelper implements TextLayoutStateExternalSyntheticLambda0 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 42135;
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 13270;
    private static char onNavigationEvent = 33945;
    private static char onWarmupCompleted = 32218;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 85;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 68 / 0;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 119;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 78 / 0;
        }
    }

    public onEventk4lQ0M(Context context) {
        super(context.getApplicationContext(), "exoplayer_internal.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 67;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallbackWithResult(sQLiteDatabase);
        if (i6 == 0) {
            throw null;
        }
    }

    private static void onExtraCallbackWithResult(SQLiteDatabase sQLiteDatabase) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 97;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{29848, 24547, 14131, 16778}, 4 - (ViewConfiguration.getEdgeSlop() >> 16), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{63159, 43295, 47111, 13004}, View.resolveSizeAndState(0, 0, 0) + 4, objArr2);
        Cursor cursorQuery = sQLiteDatabase.query("sqlite_master", new String[]{strIntern, ((String) objArr2[0]).intern()}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                String string = cursorQuery.getString(0);
                String string2 = cursorQuery.getString(1);
                if (!"sqlite_sequence".equals(string2)) {
                    String str = "DROP " + string + " IF EXISTS " + string2;
                    try {
                        sQLiteDatabase.execSQL(str);
                    } catch (SQLException e) {
                        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("SADatabaseProvider", "Error executing " + str, e);
                    }
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        cursorQuery.close();
        int i5 = asInterface + 29;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $11 + 91;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i7 = 58224;
            int i8 = i4;
            while (i8 < 16) {
                int i9 = $10 + 105;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i11 = (c2 + i7) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i12 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char capsMode = (char) TextUtils.getCapsMode("", i4, i4);
                        int threadPriority = ((Process.getThreadPriority(i4) + 20) >> 6) + 10;
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(capsMode, threadPriority, minimumFlingVelocity, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), AndroidCharacter.getMirror('0') - '&', 12435 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
                    cArr3 = cArr4;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - Color.green(0)), 14 - TextUtils.indexOf("", ""), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }
}
