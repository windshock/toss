package im.toss.features.mobile.id.model;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.mobile.id.model.EncryptionKeyResponse$;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class EncryptionKeyResponse {
    public static final Companion Companion;
    private static int IAuthTabCallback;
    private static int asBinder;
    private static int onExtraCallback;
    private static byte[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static short[] onWarmupCompleted;
    private final String keyEncryptionKey;
    private static final byte[] $$a = {93, -40, 95, -94};
    private static final int $$b = 208;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, byte b) {
        int i2;
        byte[] bArr = $$a;
        int i3 = b * 4;
        int i4 = (i * 4) + 115;
        int i5 = (s * 4) + 4;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            i4 += i6;
            i5++;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            i2++;
            i6 = bArr[i5];
            i4 += i6;
            i5++;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }

    static {
        asBinder = 1;
        onExtraCallback();
        Companion = new Companion((DefaultConstructorMarker) null);
        int i = asInterface + 55;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof EncryptionKeyResponse) {
            return Intrinsics.areEqual(this.keyEncryptionKey, ((EncryptionKeyResponse) obj).keyEncryptionKey);
        }
        int i5 = i3 + 45;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.keyEncryptionKey.hashCode();
        int i4 = IAuthTabCallbackDefault + 39;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.keyEncryptionKey;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((short) ((-26) - TextUtils.getCapsMode("", 0, 0)), (byte) (Process.myTid() >> 22), (-784468577) + (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 132218543 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) - 58, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a((short) (Drawable.resolveOpacity(0, 0) - 113), (byte) ('0' - AndroidCharacter.getMirror('0')), 62965 - AndroidCharacter.getMirror('0'), 32451 - AndroidCharacter.getMirror('0'), (-96) - (ViewConfiguration.getTapTimeout() >> 16), objArr2);
        sb.append(((String) objArr2[0]).intern());
        String string = sb.toString();
        int i2 = IAuthTabCallbackDefault + 45;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public /* synthetic */ EncryptionKeyResponse(int i, String str, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 1;
        if (1 != (i & 1)) {
            int i3 = IAuthTabCallbackDefault + 117;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = EncryptionKeyResponse$.serializer.INSTANCE.getDescriptor();
                i2 = 0;
            } else {
                descriptor = EncryptionKeyResponse$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = IAuthTabCallbackDefault + 59;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.keyEncryptionKey = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(EncryptionKeyResponse encryptionKeyResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, encryptionKeyResponse.keyEncryptionKey);
        int i4 = IAuthTabCallbackDefault + 53;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String str = this.keyEncryptionKey;
        if (i3 != 0) {
            int i4 = 10 / 0;
        }
        return str;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        int i4;
        boolean z2;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 43424), (Process.myTid() >> 22) + 42, Gravity.getAbsoluteGravity(0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i8 = $10 + 27;
                int i9 = i8 % 128;
                $11 = i9;
                int i10 = i8 % 2;
                int i11 = i9 + 67;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr = onExtraCallbackWithResult;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i13 = 0;
                    while (i13 < length) {
                        int i14 = $10 + 33;
                        $11 = i14 % 128;
                        int i15 = i14 % i6;
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i13])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 55 - KeyEvent.keyCodeFromString(""), 2167 - TextUtils.indexOf("", ""), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i13] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i13++;
                            i6 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i16 = $10 + 109;
                    $11 = i16 % 128;
                    if (i16 % 2 == 0) {
                        byte[] bArr3 = onExtraCallbackWithResult;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 43424), (ViewConfiguration.getTouchSlop() >> 8) + 42, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] | (-4629411779493505016L))) << ((int) (onNavigationEvent | (-4629411779493505016L)));
                    } else {
                        byte[] bArr4 = onExtraCallbackWithResult;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 43423), 42 - (ViewConfiguration.getFadingEdgeLength() >> 16), 22439 - View.resolveSize(0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L)));
                    }
                    iIntValue = (byte) i5;
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onWarmupCompleted[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                int i17 = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ j));
                if (z) {
                    int i18 = $11 + 41;
                    $10 = i18 % 128;
                    int i19 = i18 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i17 + i4;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 86 - (ViewConfiguration.getEdgeSlop() >> 16), 9567 - Color.red(0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = onExtraCallbackWithResult;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i20 = 0; i20 < length2; i20++) {
                        bArr6[i20] = (byte) (bArr5[i20] ^ (-4629411779493505016L));
                    }
                    bArr5 = bArr6;
                }
                if (bArr5 != null) {
                    int i21 = $10 + 43;
                    int i22 = i21 % 128;
                    $11 = i22;
                    int i23 = i21 % 2;
                    int i24 = i22 + 19;
                    $10 = i24 % 128;
                    if (i24 % 2 != 0) {
                        int i25 = 4 / 4;
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i26 = $11 + 69;
                    $10 = i26 % 128;
                    if (i26 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (!(!z2)) {
                        byte[] bArr7 = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onWarmupCompleted;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onExtraCallback() {
        onExtraCallback = -1970941335;
        onNavigationEvent = -1538795415;
        IAuthTabCallback = 1549359518;
        onExtraCallbackWithResult = new byte[]{-42, 38, 60, -1, 17, 40, 7, 22, 25, 41, 33, 7, 75, -18, 38, 28, 85, -43, 4, 23, 17, 17, 31, 32, 37, -5, 38, 60, -1, 17, 40, 7, 22, 25, 41, 33, 7, 75, 8, 8};
    }
}
