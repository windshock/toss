package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ALCFaceSDK3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ALCFaceSDK3[] $VALUES;
    public static final ALCFaceSDK3 DISTRIBUTION;
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    public static final ALCFaceSDK3 V1;
    public static final ALCFaceSDK3 V2;
    private static char onExtraCallback;
    private static long onNavigationEvent;
    private final String attributeValue;
    private static final byte[] $$a = {8, -40, 43, -43};
    private static final int $$b = 254;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, int i) {
        int i2;
        int i3 = (i * 2) + 4;
        int i4 = s + 109;
        int i5 = b * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            i3++;
            i4 += i6;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i3];
            i3++;
            i4 += i6;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        }
    }

    private static final /* synthetic */ ALCFaceSDK3[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceSDK3 aLCFaceSDK3 = V1;
        if (i3 == 0) {
            return new ALCFaceSDK3[]{aLCFaceSDK3, V2, DISTRIBUTION};
        }
        ALCFaceSDK3 aLCFaceSDK32 = V2;
        ALCFaceSDK3 aLCFaceSDK33 = DISTRIBUTION;
        ALCFaceSDK3[] aLCFaceSDK3Arr = new ALCFaceSDK3[5];
        aLCFaceSDK3Arr[1] = aLCFaceSDK3;
        aLCFaceSDK3Arr[0] = aLCFaceSDK32;
        aLCFaceSDK3Arr[3] = aLCFaceSDK33;
        return aLCFaceSDK3Arr;
    }

    public static EnumEntries<ALCFaceSDK3> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 101;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        EnumEntries<ALCFaceSDK3> enumEntries = $ENTRIES;
        int i4 = i2 + 109;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return enumEntries;
        }
        obj.hashCode();
        throw null;
    }

    public static ALCFaceSDK3 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceSDK3 aLCFaceSDK3 = (ALCFaceSDK3) Enum.valueOf(ALCFaceSDK3.class, str);
        if (i3 == 0) {
            return aLCFaceSDK3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ALCFaceSDK3[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceSDK3[] aLCFaceSDK3Arr = $VALUES;
        if (i3 != 0) {
            return (ALCFaceSDK3[]) aLCFaceSDK3Arr.clone();
        }
        int i4 = 9 / 0;
        return (ALCFaceSDK3[]) aLCFaceSDK3Arr.clone();
    }

    private ALCFaceSDK3(String str, int i, String str2) {
        this.attributeValue = str2;
    }

    public final String getAttributeValue() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            str = this.attributeValue;
            int i4 = 25 / 0;
        } else {
            str = this.attributeValue;
        }
        int i5 = i3 + 65;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 15 / 0;
        }
        return str;
    }

    static {
        IAuthTabCallbackStub = 1;
        onExtraCallbackWithResult();
        V1 = new ALCFaceSDK3("V1", 0, "v1");
        Object[] objArr = new Object[1];
        a((char) (45953 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), ViewConfiguration.getTapTimeout() >> 16, new char[]{40303, 8404}, new char[]{0, 0, 0, 0}, new char[]{46073, 55083, 33102, 57523}, objArr);
        V2 = new ALCFaceSDK3("V2", 1, ((String) objArr[0]).intern());
        DISTRIBUTION = new ALCFaceSDK3("DISTRIBUTION", 2, "distribution");
        ALCFaceSDK3[] aLCFaceSDK3Arr$values = $values();
        $VALUES = aLCFaceSDK3Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(aLCFaceSDK3Arr$values);
        int i = onTransact + 115;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            int i2 = 44 / 0;
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i4 = $10 + 105;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i6 = $10 + 59;
            $11 = i6 % 128;
            int i7 = i6 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), Color.argb(0, 0, 0, 0) + 43, 1451 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 49122), (KeyEvent.getMaxKeyCode() >> 16) + 44, 1494 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - View.MeasureSpec.getSize(0)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 49, (ViewConfiguration.getEdgeSlop() >> 16) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - View.combineMeasuredStates(0, 0)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 28, TextUtils.lastIndexOf("", '0', 0) + 12578, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (IAuthTabCallback ^ 7798559133331975163L)) ^ ((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void onExtraCallbackWithResult() {
        onNavigationEvent = 7798559133331975163L;
        IAuthTabCallback = 1965694505;
        onExtraCallback = (char) 27643;
    }
}
