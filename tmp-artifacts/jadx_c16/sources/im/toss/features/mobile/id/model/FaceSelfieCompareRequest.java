package im.toss.features.mobile.id.model;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.core.security.EncryptedDatasRequest;
import im.toss.core.security.EncryptedDatasRequest$$serializer;
import im.toss.features.mobile.id.model.FaceSelfieCompareRequest$;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class FaceSelfieCompareRequest {
    public static final Companion Companion;
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static byte[] onNavigationEvent;
    private static short[] onWarmupCompleted;
    private final EncryptedDatasRequest encryptedData;
    private final String faceAccessTempToken;
    private final String vcTypeCode;
    private static final byte[] $$a = {93, -40, 95, -94};
    private static final int $$b = 100;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int onTransact = 1;
    private static int IAuthTabCallbackDefault = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, int i2) {
        int i3;
        int i4 = 3 - (i2 * 4);
        int i5 = i * 4;
        byte[] bArr = $$a;
        int i6 = (b * 4) + 115;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i4;
            int i9 = 0;
            i6 = (-i6) + i4;
            i4 = i8;
            i3 = i9;
            int i10 = i4 + 1;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            byte b2 = bArr[i10];
            i4 = i6;
            i6 = b2;
            i9 = i3 + 1;
            i8 = i10;
            i6 = (-i6) + i4;
            i4 = i8;
            i3 = i9;
            int i102 = i4 + 1;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            int i1022 = i4 + 1;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        }
    }

    static {
        IAuthTabCallbackStub = 1;
        onExtraCallback();
        Companion = new Companion((DefaultConstructorMarker) null);
        int i = IAuthTabCallbackDefault + 73;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            int i2 = 63 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = asInterface + 89;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof FaceSelfieCompareRequest)) {
            int i4 = onTransact + 119;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        FaceSelfieCompareRequest faceSelfieCompareRequest = (FaceSelfieCompareRequest) obj;
        if (!Intrinsics.areEqual(this.vcTypeCode, faceSelfieCompareRequest.vcTypeCode)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.encryptedData, faceSelfieCompareRequest.encryptedData)) {
            int i6 = asInterface + 45;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 6 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.faceAccessTempToken, faceSelfieCompareRequest.faceAccessTempToken)) {
            return false;
        }
        int i8 = onTransact + 13;
        asInterface = i8 % 128;
        if (i8 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onTransact + 15;
        asInterface = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((this.vcTypeCode.hashCode() * 57) % this.encryptedData.hashCode()) << 15) >>> this.faceAccessTempToken.hashCode() : (((this.vcTypeCode.hashCode() * 31) + this.encryptedData.hashCode()) * 31) + this.faceAccessTempToken.hashCode();
        int i3 = onTransact + 31;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 15 / 0;
        }
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.vcTypeCode;
        EncryptedDatasRequest encryptedDatasRequest = this.encryptedData;
        String str2 = this.faceAccessTempToken;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((short) (6 - TextUtils.getOffsetAfter("", 0)), (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 10), (-1289105532) - TextUtils.indexOf("", ""), (-1077566407) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 125, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a((short) (Process.getGidForName("") - 124), (byte) (View.MeasureSpec.getMode(0) + 91), TextUtils.getOffsetBefore("", 0) - 1289105496, (-1077566434) - TextUtils.getCapsMode("", 0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 125, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(encryptedDatasRequest);
        Object[] objArr3 = new Object[1];
        a((short) (112 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (byte) (Process.getGidForName("") - 1), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 1289105479, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1077566435, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 125, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(str2);
        Object[] objArr4 = new Object[1];
        a((short) (ImageFormat.getBitsPerPixel(0) - 124), (byte) ((-89) - (ViewConfiguration.getEdgeSlop() >> 16)), (-1289105458) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-1077566437) - View.MeasureSpec.getMode(0), (-125) - KeyEvent.getDeadChar(0, 0), objArr4);
        sb.append(((String) objArr4[0]).intern());
        String string = sb.toString();
        int i2 = asInterface + 53;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public /* synthetic */ FaceSelfieCompareRequest(int i, String str, EncryptedDatasRequest encryptedDatasRequest, String str2, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 7;
        if (7 != (i & 7)) {
            int i3 = onTransact + 117;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = FaceSelfieCompareRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 65;
            } else {
                descriptor = FaceSelfieCompareRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        this.vcTypeCode = str;
        this.encryptedData = encryptedDatasRequest;
        this.faceAccessTempToken = str2;
    }

    public FaceSelfieCompareRequest(@NotNull String str, @NotNull EncryptedDatasRequest encryptedDatasRequest, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(encryptedDatasRequest, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.vcTypeCode = str;
        this.encryptedData = encryptedDatasRequest;
        this.faceAccessTempToken = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(FaceSelfieCompareRequest faceSelfieCompareRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, faceSelfieCompareRequest.vcTypeCode);
        vylVar.onNavigationEvent(serialDescriptor, 1, EncryptedDatasRequest$$serializer.INSTANCE, faceSelfieCompareRequest.encryptedData);
        vylVar.onExtraCallback(serialDescriptor, 2, faceSelfieCompareRequest.faceAccessTempToken);
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        int i4;
        boolean z2;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - KeyEvent.normalizeMetaState(0)), Color.blue(0) + 42, 22439 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $10 + 63;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i8 = $11 + 103;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                byte[] bArr = onNavigationEvent;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i10 = 0;
                    while (i10 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 12844), 54 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 2167 - TextUtils.indexOf("", "", 0), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i10] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i10++;
                        int i11 = $10 + 21;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 43424), TextUtils.indexOf("", "", 0) + 42, 22439 - Color.green(0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onWarmupCompleted[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                int i13 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ j));
                if (!z) {
                    i4 = 0;
                } else {
                    int i14 = $11 + 37;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    i4 = 1;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i13 + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallback), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), 86 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 9567 - View.MeasureSpec.getMode(0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onNavigationEvent;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i16 = 0; i16 < length2; i16++) {
                        int i17 = $10 + 79;
                        $11 = i17 % 128;
                        if (i17 % 2 == 0) {
                            bArr5[i16] = (byte) (bArr4[i16] - (-4629411779493505016L));
                        } else {
                            bArr5[i16] = (byte) (bArr4[i16] ^ (-4629411779493505016L));
                        }
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i18 = $11 + 41;
                    $10 = i18 % 128;
                    int i19 = i18 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onWarmupCompleted;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
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

    static void onExtraCallback() {
        IAuthTabCallback = -393090956;
        onExtraCallbackWithResult = -1538795404;
        onExtraCallback = -461536250;
        onNavigationEvent = new byte[]{-96, -60, 13, -15, 40, -58, -15, -1, 33, -3, -23, 54, -80, 13, -10, -4, 0, 8, 27, -23, -5, 29, -3, 11, -26, 40, -58, -8, 11, -30, 15, 26, -42, 10, 10, 3, -100, 12, 59, -51, -53, 48, 41, 47, -44, 33, -47, -39, 35, -57, -109, 36, -110, -55, -113, -100, -102, 125, -94, -123, -114, 119, -89, -122, -120, -124, -122, 100, -70, -124, -124, -99, 64, -110, -115};
    }
}
