package im.toss.features.mobile.id.model;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.core.security.EncryptedDataRequest;
import im.toss.core.security.EncryptedDataRequest$$serializer;
import im.toss.features.mobile.id.model.VpVerifyRequest$;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class VpVerifyRequest {
    public static final Companion Companion;
    private static int onExtraCallback;
    private static int onNavigationEvent;
    private final EncryptedDataRequest encryptedData;
    private final long id;
    private static final byte[] $$a = {106, 40, -98, -117};
    private static final int $$b = 151;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, byte b) {
        int i3;
        byte[] bArr = $$a;
        int i4 = 3 - (i * 3);
        int i5 = b * 3;
        int i6 = (i2 * 3) + 105;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i7;
            int i9 = 0;
            i6 = (-i6) + i8;
            i3 = i9;
            i4++;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            int i10 = i3 + 1;
            i8 = i6;
            i6 = bArr[i4];
            i9 = i10;
            i6 = (-i6) + i8;
            i3 = i9;
            i4++;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            i4++;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        }
    }

    static {
        onNavigationEvent = 0;
        onWarmupCompleted();
        Companion = new Companion((DefaultConstructorMarker) null);
        int i = onWarmupCompleted + 83;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VpVerifyRequest)) {
            int i2 = onExtraCallbackWithResult + 23;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        VpVerifyRequest vpVerifyRequest = (VpVerifyRequest) obj;
        if (this.id != vpVerifyRequest.id) {
            int i4 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.encryptedData, vpVerifyRequest.encryptedData)) {
            return false;
        }
        int i6 = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i2 % 128;
        return i2 % 2 != 0 ? (Long.hashCode(this.id) << 51) - this.encryptedData.hashCode() : (Long.hashCode(this.id) * 31) + this.encryptedData.hashCode();
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        long j = this.id;
        EncryptedDataRequest encryptedDataRequest = this.encryptedData;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(TextUtils.lastIndexOf("", '0', 0, 0) + 20, 14 - (KeyEvent.getMaxKeyCode() >> 16), new char[]{7, 4, 23, 65520, 3, 15, 19, 3, 17, 18, 65478, 7, 2, 65499, 65524, 14, 65524, 3, 16}, false, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 224, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(j);
        Object[] objArr2 = new Object[1];
        a(16 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 4, new char[]{17, '\b', 65475, 65487, 65504, 4, 23, 4, 65511, 7, '\b', 23, 19, 28, 21, 6}, true, (ViewConfiguration.getEdgeSlop() >> 16) + 220, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(encryptedDataRequest);
        Object[] objArr3 = new Object[1];
        a(1 - TextUtils.getCapsMode("", 0, 0), -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new char[]{0}, true, 168 - (Process.myPid() >> 22), objArr3);
        sb.append(((String) objArr3[0]).intern());
        String string = sb.toString();
        int i2 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public /* synthetic */ VpVerifyRequest(int i, long j, EncryptedDataRequest encryptedDataRequest, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onExtraCallbackWithResult + 105;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, VpVerifyRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 % 4;
            } else {
                int i6 = 2 % 2;
            }
        }
        this.id = j;
        this.encryptedData = encryptedDataRequest;
    }

    public VpVerifyRequest(long j, @NotNull EncryptedDataRequest encryptedDataRequest) {
        Intrinsics.checkNotNullParameter(encryptedDataRequest, "");
        this.id = j;
        this.encryptedData = encryptedDataRequest;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(VpVerifyRequest vpVerifyRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            vylVar.onExtraCallback(serialDescriptor, 0, vpVerifyRequest.id);
            vylVar.onNavigationEvent(serialDescriptor, 0, EncryptedDataRequest$$serializer.INSTANCE, vpVerifyRequest.encryptedData);
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, vpVerifyRequest.id);
            vylVar.onNavigationEvent(serialDescriptor, 1, EncryptedDataRequest$$serializer.INSTANCE, vpVerifyRequest.encryptedData);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - TextUtils.indexOf("", "")), ExpandableListView.getPackedPositionChild(0L) + 24, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - ((Process.getThreadPriority(0) + 20) >> 6)), 54 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2166, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i7 = $10 + 83;
                $11 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            int i9 = $11 + 57;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i11 = $10 + 39;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i13 = $10 + 1;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 12844), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 54, View.MeasureSpec.getSize(0) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onWarmupCompleted() {
        onExtraCallback = 478308950;
    }
}
