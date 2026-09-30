package o;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.devtool.runtime.data.util.Hilt_SchemeExecutorActivity$1;
import im.toss.global.features.leave.test.GlobalLeaveTestActivity$IAuthTabCallback;
import im.toss.security.impl.malware.MalwareDetectActivity$onExtraCallbackWithResult;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class getActivePage {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getActivePage[] $VALUES;
    public static final getActivePage APP_LINK;
    public static final getActivePage APP_SCHEME;
    public static final getActivePage HIDDEN_LAB;
    private static boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackDefault = 1;
    public static final getActivePage ROUTE_RESULT;
    public static final getActivePage ROUTE_START;
    public static final getActivePage TARGET_OPEN;
    public static final getActivePage VISIBLE_FALLBACK;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static boolean onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static char[] onWarmupCompleted;

    private static final /* synthetic */ getActivePage[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 97;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        getActivePage[] getactivepageArr = {ROUTE_START, APP_LINK, APP_SCHEME, HIDDEN_LAB, VISIBLE_FALLBACK, TARGET_OPEN, ROUTE_RESULT};
        int i5 = i2 + 69;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 43 / 0;
        }
        return getactivepageArr;
    }

    public static EnumEntries<getActivePage> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<getActivePage> enumEntries = $ENTRIES;
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        return enumEntries;
    }

    public static getActivePage valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        getActivePage getactivepage = (getActivePage) Enum.valueOf(getActivePage.class, str);
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        int i5 = asInterface + 121;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return getactivepage;
        }
        throw null;
    }

    public static getActivePage[] values() {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getActivePage[] getactivepageArr = (getActivePage[]) $VALUES.clone();
        int i4 = asInterface + 105;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return getactivepageArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private getActivePage(String str, int i) {
    }

    static {
        onExtraCallback();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-124, -127, -120, -124, -121, -122, -123, -124, -125, -126, -127}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, objArr);
        ROUTE_START = new getActivePage(((String) objArr[0]).intern(), 0);
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-115, -116, -117, -118, -122, -119, -119, -120}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, objArr2);
        APP_LINK = new getActivePage(((String) objArr2[0]).intern(), 1);
        Object[] objArr3 = new Object[1];
        a(null, null, new byte[]{-123, -112, -123, -113, -114, -121, -122, -119, -119, -120}, 127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr3);
        APP_SCHEME = new getActivePage(((String) objArr3[0]).intern(), 2);
        Object[] objArr4 = new Object[1];
        a(null, null, new byte[]{-110, -120, -118, -122, -116, -123, -111, -111, -117, -113}, (ViewConfiguration.getLongPressTimeout() >> 16) + 127, objArr4);
        HIDDEN_LAB = new getActivePage(((String) objArr4[0]).intern(), 3);
        Object[] objArr5 = new Object[1];
        a(null, null, new byte[]{-115, -114, -120, -110, -118, -118, -120, -108, -122, -123, -118, -110, -117, -121, -117, -109}, 127 - (ViewConfiguration.getEdgeSlop() >> 16), objArr5);
        VISIBLE_FALLBACK = new getActivePage(((String) objArr5[0]).intern(), 4);
        Object[] objArr6 = new Object[1];
        a(null, null, new byte[]{-116, -123, -119, -126, -122, -124, -123, -107, -127, -120, -124}, TextUtils.getOffsetBefore("", 0) + 127, objArr6);
        TARGET_OPEN = new getActivePage(((String) objArr6[0]).intern(), 5);
        Object[] objArr7 = new Object[1];
        a(null, null, new byte[]{-124, -118, -125, -121, -123, -127, -122, -123, -124, -125, -126, -127}, 127 - View.MeasureSpec.getMode(0), objArr7);
        ROUTE_RESULT = new getActivePage(((String) objArr7[0]).intern(), 6);
        getActivePage[] getactivepageArr$values = $values();
        $VALUES = getactivepageArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getactivepageArr$values);
        int i = IAuthTabCallbackDefault + 35;
        asBinder = i % 128;
        if (i % 2 != 0) {
            int i2 = 99 / 0;
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onWarmupCompleted;
        if (cArr2 != null) {
            int i3 = $11 + 73;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                int i6 = $11 + 105;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                cArr3[i5] = MalwareDetectActivity$onExtraCallbackWithResult.x(cArr2[i5]);
            }
            cArr2 = cArr3;
        }
        int iY = GlobalLeaveTestActivity$IAuthTabCallback.y(onExtraCallbackWithResult);
        if (onExtraCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iY);
                Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
                int i8 = $11 + 91;
                $10 = i8 % 128;
                int i9 = i8 % 2;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!IAuthTabCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i10 = $11 + 23;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
            Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
        }
        objArr[0] = new String(cArr6);
    }

    static void onExtraCallback() {
        onWarmupCompleted = new char[]{32604, 32607, 32593, 32594, 32545, 32591, 32595, 32557, 32606, 32602, 32549, 32600, 32603, 32547, 32550, 32601, 32546, 32556, 32592, 32544, 32551};
        onExtraCallbackWithResult = -1184333842;
        IAuthTabCallback = true;
        onExtraCallback = true;
    }
}
