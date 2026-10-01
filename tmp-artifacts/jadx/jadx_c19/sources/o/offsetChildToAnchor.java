package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class offsetChildToAnchor {
    private static short[] access100;
    public final String IAuthTabCallback;
    public final String IAuthTabCallbackDefault;
    public final int asBinder;
    public final String asInterface;
    public final String onExtraCallback;
    public final int onExtraCallbackWithResult;
    public final int onNavigationEvent;
    public final String onWarmupCompleted;
    private static final byte[] $$a = {77, -64, 102, Byte.MIN_VALUE};
    private static final int $$b = 169;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = -1367581203;
    private static int onTransact = -1538795453;
    private static int getInterfaceDescriptor = 869587123;
    private static byte[] access000 = {96, -33, 125, -32, -39, -22, -37, -40, -24, -48, -17, -47, -34, 8, 8};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, int i2) {
        int i3;
        int i4 = 115 - (b * 2);
        int i5 = b2 * 3;
        int i6 = i2 + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            i4 = i7;
            int i8 = i6;
            int i9 = 0;
            i4 += i6;
            i6 = i8;
            i3 = i9;
            int i10 = i6 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            int i11 = i3 + 1;
            i8 = i10;
            i6 = bArr[i10];
            i9 = i11;
            i4 += i6;
            i6 = i8;
            i3 = i9;
            int i102 = i6 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            int i1022 = i6 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        }
    }

    public enum onExtraCallbackWithResult {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);

        private final int value;

        onExtraCallbackWithResult(int i2) {
            this.value = i2;
        }

        public int getValue() {
            return this.value;
        }
    }

    offsetChildToAnchor(JSONObject jSONObject) throws Throwable {
        this.IAuthTabCallback = jSONObject.getString("class_name");
        this.onNavigationEvent = jSONObject.optInt("index", -1);
        this.onExtraCallbackWithResult = jSONObject.optInt(TtmlNode.ATTR_ID);
        Object[] objArr = new Object[1];
        a((short) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 104), (byte) (44 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (-171673061) - TextUtils.indexOf("", "", 0), 1751973817 + (ViewConfiguration.getScrollDefaultDelay() >> 16), ImageFormat.getBitsPerPixel(0) - 70, objArr);
        this.asInterface = jSONObject.optString(((String) objArr[0]).intern());
        this.IAuthTabCallbackDefault = jSONObject.optString("tag");
        Object[] objArr2 = new Object[1];
        a((short) (32 - (Process.myTid() >> 22)), (byte) ((-8) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (-171673059) - TextUtils.lastIndexOf("", '0', 0), Color.green(0) + 1751973801, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 65, objArr2);
        this.onExtraCallback = jSONObject.optString(((String) objArr2[0]).intern());
        this.onWarmupCompleted = jSONObject.optString("hint");
        this.asBinder = jSONObject.optInt("match_bitmask");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01bc A[PHI: r0
      0x01bc: PHI (r0v9 int) = (r0v8 int), (r0v47 int) binds: [B:43:0x01ba, B:40:0x01a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01be A[PHI: r0
      0x01be: PHI (r0v44 int) = (r0v8 int), (r0v47 int) binds: [B:43:0x01ba, B:40:0x01a8] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i2, int i3, int i4, Object[] objArr) throws Throwable {
        int i5;
        int i6;
        boolean z;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(onTransact)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            char c = '0';
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), KeyEvent.keyCodeFromString("") + 42, 22440 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                int i8 = $11 + 73;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                byte[] bArr = access000;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = 0;
                    while (i9 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            char cResolveOpacity = (char) (12843 - Drawable.resolveOpacity(0, 0));
                            int iRgb = (-16777161) - Color.rgb(0, 0, 0);
                            int iLastIndexOf = 2166 - TextUtils.lastIndexOf("", c, 0, 0);
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cResolveOpacity, iRgb, iLastIndexOf, -299036574, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i9++;
                        int i10 = $11 + 103;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        c = '0';
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i12 = $10 + 81;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    byte[] bArr3 = access000;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(IAuthTabCallbackStub)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 43424), ImageFormat.getBitsPerPixel(0) + 43, 22439 - TextUtils.indexOf("", "", 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onTransact ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (access100[i2 + ((int) (IAuthTabCallbackStub ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onTransact ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i14 = $11 + 71;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    i5 = ((i2 * iIntValue) * 5) >>> ((int) (IAuthTabCallbackStub | (-4629411779493505016L)));
                    i6 = z2 ? 1 : 0;
                } else {
                    i5 = ((i2 + iIntValue) - 2) + ((int) (IAuthTabCallbackStub ^ (-4629411779493505016L)));
                    if (z2) {
                    }
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i5 + i6;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(getInterfaceDescriptor), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 86 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 9566 - ImageFormat.getBitsPerPixel(0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = access000;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i15 = 0; i15 < length2; i15++) {
                        bArr5[i15] = (byte) (bArr4[i15] ^ (-4629411779493505016L));
                    }
                    int i16 = $11 + 3;
                    $10 = i16 % 128;
                    int i17 = i16 % 2;
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i18 = $10 + 37;
                    $11 = i18 % 128;
                    int i19 = i18 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i20 = $10 + 19;
                    $11 = i20 % 128;
                    if (i20 % 2 == 0) {
                        throw null;
                    }
                    if (z) {
                        byte[] bArr6 = access000;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = access100;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            String string = sb.toString();
            int i21 = $11 + 91;
            $10 = i21 % 128;
            int i22 = i21 % 2;
            objArr[0] = string;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
