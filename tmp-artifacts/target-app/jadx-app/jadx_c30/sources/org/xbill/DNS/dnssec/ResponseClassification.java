package org.xbill.DNS.dnssec;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ResponseClassification {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ ResponseClassification[] $VALUES;
    public static final ResponseClassification ANY;
    public static final ResponseClassification CNAME;
    public static final ResponseClassification CNAME_NAMEERROR;
    public static final ResponseClassification CNAME_NODATA;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    public static final ResponseClassification NAMEERROR;
    public static final ResponseClassification NODATA;
    public static final ResponseClassification POSITIVE;
    public static final ResponseClassification REFERRAL;
    public static final ResponseClassification UNKNOWN;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static char onWarmupCompleted;

    private static /* synthetic */ ResponseClassification[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        ResponseClassification[] responseClassificationArr = {UNKNOWN, POSITIVE, CNAME, NODATA, NAMEERROR, ANY, CNAME_NODATA, CNAME_NAMEERROR, REFERRAL};
        int i5 = i3 + 89;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return responseClassificationArr;
    }

    private ResponseClassification(String str, int i) {
    }

    public static ResponseClassification valueOf(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ResponseClassification responseClassification = (ResponseClassification) Enum.valueOf(ResponseClassification.class, str);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 15;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return responseClassification;
        }
        throw null;
    }

    public static ResponseClassification[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ResponseClassification[] responseClassificationArr = (ResponseClassification[]) $VALUES.clone();
        int i4 = onNavigationEvent + 65;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return responseClassificationArr;
        }
        throw null;
    }

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new char[]{37561, 45352, 41995, 19097, 14072, 21777, 60964, 35511}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 7, objArr);
        UNKNOWN = new ResponseClassification(((String) objArr[0]).intern(), 0);
        POSITIVE = new ResponseClassification("POSITIVE", 1);
        CNAME = new ResponseClassification("CNAME", 2);
        NODATA = new ResponseClassification("NODATA", 3);
        NAMEERROR = new ResponseClassification("NAMEERROR", 4);
        ANY = new ResponseClassification("ANY", 5);
        CNAME_NODATA = new ResponseClassification("CNAME_NODATA", 6);
        CNAME_NAMEERROR = new ResponseClassification("CNAME_NAMEERROR", 7);
        REFERRAL = new ResponseClassification("REFERRAL", 8);
        $VALUES = $values();
        int i = IAuthTabCallbackDefault + 47;
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
        int i4 = $11 + 53;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = $10 + 25;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 4 % 2;
            }
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                int i10 = $11 + 55;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i12 = (c2 + i8) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i13 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                    objArr2[2] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char threadPriority = (char) ((Process.getThreadPriority(i3) + 20) >> 6);
                        int iMyPid = (Process.myPid() >> 22) + 10;
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(threadPriority, iMyPid, maxKeyCode, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), 10 - View.resolveSize(0, 0), Drawable.resolveOpacity(0, 0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 16013), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 14, (-16757315) - Color.rgb(0, 0, 0), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void IAuthTabCallback() {
        onExtraCallback = (char) 48292;
        onWarmupCompleted = (char) 53697;
        IAuthTabCallback = (char) 48410;
        onExtraCallbackWithResult = (char) 17732;
    }
}
