package o;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class shared {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ shared[] $VALUES;
    public static final shared APP_LINK;
    public static final shared DEFAULT;
    private static char IAuthTabCallback = 0;
    public static final shared NOTIFICATION;
    public static final shared PUSH;
    public static final shared SHORTCUT;
    public static final shared UNKNOWN;
    public static final shared URL_SCHEME;
    public static final shared WIDGET;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static int onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onTransact;
    private static char onWarmupCompleted;
    private final String key;

    private static final /* synthetic */ shared[] $values() {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        shared[] sharedVarArr = {UNKNOWN, DEFAULT, PUSH, SHORTCUT, WIDGET, NOTIFICATION, URL_SCHEME, APP_LINK};
        int i5 = i3 + 63;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return sharedVarArr;
    }

    public static EnumEntries<shared> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static shared valueOf(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        shared sharedVar = (shared) Enum.valueOf(shared.class, str);
        int i4 = onExtraCallback + 5;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return sharedVar;
    }

    public static shared[] values() {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        shared[] sharedVarArr = (shared[]) $VALUES.clone();
        int i3 = asInterface + 115;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return sharedVarArr;
    }

    private shared(String str, int i, String str2) {
        this.key = str2;
    }

    public final String getKey() {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.key;
        int i5 = i3 + 17;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        a(new char[]{30316, 14297, 21555, 3302, 50758, 13079, 4071, 41682}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{30316, 14297, 21555, 3302, 50758, 13079, 4071, 41682}, 7 - ExpandableListView.getPackedPositionGroup(0L), objArr2);
        UNKNOWN = new shared(strIntern, 0, ((String) objArr2[0]).intern());
        DEFAULT = new shared("DEFAULT", 1, "DEFAULT");
        PUSH = new shared("PUSH", 2, "PUSH");
        SHORTCUT = new shared("SHORTCUT", 3, "SHORTCUT");
        WIDGET = new shared("WIDGET", 4, "WIDGET");
        NOTIFICATION = new shared("NOTIFICATION", 5, "NOTIFICATION");
        URL_SCHEME = new shared("URL_SCHEME", 6, "URL_SCHEME");
        APP_LINK = new shared("APP_LINK", 7, "APP_LINK");
        shared[] sharedVarArr$values = $values();
        $VALUES = sharedVarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(sharedVarArr$values);
        int i = onTransact + 7;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $11 + 49;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 63;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int mode = 10 - View.MeasureSpec.getMode(i3);
                        int gidForName = Process.getGidForName("") + 12435;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionType, mode, gidForName, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') - '0'), 11 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    cArr3 = cArr4;
                    i3 = 0;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getEdgeSlop() >> 16)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = (char) 62143;
        onNavigationEvent = (char) 23594;
        onExtraCallbackWithResult = (char) 61382;
        onWarmupCompleted = (char) 56187;
    }
}
