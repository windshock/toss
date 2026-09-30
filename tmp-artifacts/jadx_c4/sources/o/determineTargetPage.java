package o;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class determineTargetPage {
    public static final determineTargetPage IAuthTabCallback;
    private static int asBinder;
    private static short[] asInterface;
    private static byte[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {119, -27, 13, -93};
    private static final int $$b = 121;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onTransact = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = 1 - (i * 3);
        int i7 = 4 - (i3 * 2);
        int i8 = 115 - (i2 * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i9 = i7;
            i5 = 0;
            i7++;
            i8 += i9;
            i4 = i5;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i8;
            if (i5 == i6) {
                return new String(bArr2, 0);
            }
            i9 = bArr[i7];
            i7++;
            i8 += i9;
            i4 = i5;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i8;
            if (i5 == i6) {
            }
        } else {
            i4 = 0;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i8;
            if (i5 == i6) {
            }
        }
    }

    static {
        asBinder = 1;
        onNavigationEvent();
        IAuthTabCallback = new determineTargetPage();
        int i = onTransact + 17;
        asBinder = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private determineTargetPage() {
    }

    public static /* synthetic */ void onExtraCallbackWithResult(determineTargetPage determinetargetpage, String str, String str2, String str3, String str4, String str5, int i, Map map, int i2, Object obj) throws Throwable {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 79;
        IAuthTabCallbackDefault = i4 % 128;
        determinetargetpage.onExtraCallback(str, str2, str3, str4, str5, i, (i4 % 2 == 0 && (i2 & 64) != 0) ? access8100.onNavigationEvent() : map);
        int i5 = IAuthTabCallbackDefault + 53;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i, @NotNull Map<String, ? extends Object> map) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 89;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(map, "");
            DERSet.onExtraCallback.onExtraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (DERSet.onExtraCallback.onExtraCallbackWithResult()) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Map mapOnExtraCallback = access8100.onExtraCallback();
            mapOnExtraCallback.put("request_id", str);
            mapOnExtraCallback.put("entry_id", str2);
            Object[] objArr = new Object[1];
            a((short) ExpandableListView.getPackedPositionType(0L), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getScrollBarSize() >> 8) - 1551553359, (ViewConfiguration.getTouchSlop() >> 8) - 1274707643, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 25, objArr);
            mapOnExtraCallback.put(((String) objArr[0]).intern(), str3);
            mapOnExtraCallback.put("phase", str4);
            mapOnExtraCallback.put("source", str5);
            mapOnExtraCallback.put("attempt", Integer.valueOf(i));
            mapOnExtraCallback.put("max_attempts", 3);
            mapOnExtraCallback.putAll(map);
            Unit unit = Unit.INSTANCE;
            ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, "ads_sdk_click_tracking", false, null, null, access8100.onExtraCallbackWithResult(mapOnExtraCallback), null, 46, null);
            int i4 = IAuthTabCallbackDefault + 105;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        boolean z;
        int i4 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            float f = 0.0f;
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - ExpandableListView.getPackedPositionChild(0L)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 42, (Process.myTid() >> 22) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                byte[] bArr = onExtraCallback;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i5 = 0;
                    while (i5 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i5])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 12843), 56 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)), 2167 - TextUtils.indexOf("", "", 0, 0), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i5] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i5++;
                        f = 0.0f;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onExtraCallback;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), TextUtils.lastIndexOf("", '0', 0) + 43, 22439 - View.MeasureSpec.getSize(0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (asInterface[i + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onWarmupCompleted ^ j)) + (!(z2 ^ true) ? 1 : 0);
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onNavigationEvent), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName("")), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 86, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallback;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i6 = 0; i6 < length2; i6++) {
                        bArr5[i6] = (byte) (bArr4[i6] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i7 = $10 + 45;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        byte[] bArr6 = onExtraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = asInterface;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    int i9 = $11 + 81;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void onNavigationEvent() {
        onWarmupCompleted = -130217145;
        onExtraCallbackWithResult = -1538795504;
        onNavigationEvent = -272783560;
        onExtraCallback = new byte[]{-29, -14, -11};
    }
}
