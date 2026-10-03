package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setSignatureKey {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ setSignatureKey[] $VALUES;
    public static final setSignatureKey COMPLETED;
    public static final setSignatureKey ERROR;
    private static char[] IAuthTabCallback = null;
    public static final setSignatureKey NONE;
    public static final setSignatureKey PROCESSING;
    public static final setSignatureKey QUEUED;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    private static final /* synthetic */ setSignatureKey[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        setSignatureKey[] setsignaturekeyArr = {NONE, QUEUED, PROCESSING, COMPLETED, ERROR};
        int i5 = i3 + 47;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return setsignaturekeyArr;
    }

    public static EnumEntries<setSignatureKey> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        EnumEntries<setSignatureKey> enumEntries = $ENTRIES;
        int i4 = i3 + 17;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }

    public static setSignatureKey valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        setSignatureKey setsignaturekey = (setSignatureKey) Enum.valueOf(setSignatureKey.class, str);
        int i4 = onWarmupCompleted + 123;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return setsignaturekey;
    }

    public static setSignatureKey[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        setSignatureKey[] setsignaturekeyArr = (setSignatureKey[]) $VALUES.clone();
        int i3 = onNavigationEvent + 23;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return setsignaturekeyArr;
        }
        throw null;
    }

    private setSignatureKey(String str, int i) {
    }

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new int[]{0, 4, 73, 0}, true, new byte[]{0, 1, 1, 1}, objArr);
        NONE = new setSignatureKey(((String) objArr[0]).intern(), 0);
        Object[] objArr2 = new Object[1];
        a(new int[]{4, 6, 86, 0}, true, new byte[]{0, 1, 0, 0, 0, 0}, objArr2);
        QUEUED = new setSignatureKey(((String) objArr2[0]).intern(), 1);
        Object[] objArr3 = new Object[1];
        a(new int[]{10, 10, 134, 8}, true, null, objArr3);
        PROCESSING = new setSignatureKey(((String) objArr3[0]).intern(), 2);
        Object[] objArr4 = new Object[1];
        a(new int[]{20, 9, 131, 1}, true, null, objArr4);
        COMPLETED = new setSignatureKey(((String) objArr4[0]).intern(), 3);
        Object[] objArr5 = new Object[1];
        a(new int[]{29, 5, 58, 3}, false, new byte[]{0, 1, 1, 1, 1}, objArr5);
        ERROR = new setSignatureKey(((String) objArr5[0]).intern(), 4);
        setSignatureKey[] setsignaturekeyArr$values = $values();
        $VALUES = setsignaturekeyArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(setsignaturekeyArr$values);
        int i = onExtraCallback + 25;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final boolean isSyncing() {
        int i = 2 % 2;
        if (this == QUEUED || this == PROCESSING) {
            return true;
        }
        int i2 = onNavigationEvent + 37;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 125;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public final boolean isSuccess() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 93;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (this == COMPLETED) {
            int i5 = i2 + 3;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        int i7 = i2 + 107;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public final boolean isError() {
        int i = 2 % 2;
        if (this != ERROR) {
            return false;
        }
        int i2 = onWarmupCompleted;
        int i3 = i2 + 5;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 43;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public final boolean isDone() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 14 / 0;
            if (isSuccess()) {
                return true;
            }
        } else if (isSuccess()) {
            return true;
        }
        int i4 = onWarmupCompleted + 35;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            isError();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (isError()) {
            return true;
        }
        int i5 = onWarmupCompleted + 67;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = IAuthTabCallback;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 35;
                $10 = i8 % 128;
                if (i8 % i != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 35282), View.MeasureSpec.getSize(0) + 35, AndroidCharacter.getMirror('0') + 14191, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35282 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 34 - TextUtils.lastIndexOf("", '0', 0), Color.blue(0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7++;
                }
                i = 2;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10934), 65 - (Process.myPid() >> 22), 16718 - Color.argb(0, 0, 0, 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), 29 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 17657 - Drawable.resolveOpacity(0, 0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                try {
                    Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 49467), TextUtils.lastIndexOf("", '0', 0) + 71, 12486 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1993337549, false, "w", new Class[]{Object.class, Object.class});
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
            int i11 = $11 + 71;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i13 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i13, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i13);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = new char[]{27145, 27356, 27353, 27353, 27139, 27348, 27373, 27373, 27373, 27367, 27265, 27287, 27287, 27269, 27271, 27291, 27286, 27288, 27267, 27290, 27272, 27273, 27270, 27289, 27270, 27265, 27293, 27294, 27292, 27144, 27332, 27332, 27339, 27339};
    }
}
