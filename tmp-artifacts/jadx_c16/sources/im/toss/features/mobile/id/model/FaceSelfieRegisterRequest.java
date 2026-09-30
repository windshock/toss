package im.toss.features.mobile.id.model;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.mobile.id.model.FaceSelfieRegisterRequest$;
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
public final class FaceSelfieRegisterRequest {
    public static final Companion Companion;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private final String encFaceRegisterTokenHash;
    private final long id;
    private static final byte[] $$a = {68, -127, 122, -15};
    private static final int $$b = 64;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, byte b) {
        int i;
        int i2 = s2 * 4;
        int i3 = (s * 2) + 4;
        byte[] bArr = $$a;
        int i4 = (b * 3) + 105;
        byte[] bArr2 = new byte[i2 + 1];
        if (bArr == null) {
            int i5 = i2;
            i = 0;
            i4 += -i5;
            i3++;
            bArr2[i] = (byte) i4;
            if (i == i2) {
                return new String(bArr2, 0);
            }
            i++;
            i5 = bArr[i3];
            i4 += -i5;
            i3++;
            bArr2[i] = (byte) i4;
            if (i == i2) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            if (i == i2) {
            }
        }
    }

    static {
        onExtraCallbackWithResult = 1;
        onWarmupCompleted();
        Companion = new Companion((DefaultConstructorMarker) null);
        int i = onNavigationEvent + 105;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 95;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 65;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof FaceSelfieRegisterRequest)) {
            return false;
        }
        FaceSelfieRegisterRequest faceSelfieRegisterRequest = (FaceSelfieRegisterRequest) obj;
        if (this.id != faceSelfieRegisterRequest.id) {
            int i6 = IAuthTabCallback + 45;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.encFaceRegisterTokenHash, faceSelfieRegisterRequest.encFaceRegisterTokenHash)) {
            return false;
        }
        int i8 = IAuthTabCallback + 77;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Long.hashCode(this.id) * 31) + this.encFaceRegisterTokenHash.hashCode();
        int i4 = IAuthTabCallback + 63;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        long j = this.id;
        String str = this.encFaceRegisterTokenHash;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(29 - (ViewConfiguration.getWindowTouchSlop() >> 8), 12 - (ViewConfiguration.getJumpTapTimeout() >> 16), new char[]{3, 65520, 3, 7, 4, '\n', 3, 65521, 3, 1, 65535, 65508, 65499, 2, 7, 65478, 18, 17, 3, 19, 15, 3, 65520, 16, 3, 18, 17, 7, 5}, true, 212 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(j);
        Object[] objArr2 = new Object[1];
        a(27 - Color.green(0), 26 - View.getDefaultSize(0, 0), new char[]{'\n', 21, 3, 65514, 16, 7, '\r', 17, 65526, 20, 7, 22, 21, 11, '\t', 7, 65524, 7, 5, 3, 65512, 5, 16, 7, 65474, 65486, 65503}, true, 209 - View.MeasureSpec.getSize(0), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(str);
        Object[] objArr3 = new Object[1];
        a(TextUtils.getTrimmedLength("") + 1, Color.green(0) + 1, new char[]{0}, true, Color.blue(0) + 156, objArr3);
        sb.append(((String) objArr3[0]).intern());
        String string = sb.toString();
        int i2 = IAuthTabCallback + 23;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public /* synthetic */ FaceSelfieRegisterRequest(int i, long j, String str, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = IAuthTabCallback + 67;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, FaceSelfieRegisterRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = IAuthTabCallback + 55;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.id = j;
        this.encFaceRegisterTokenHash = str;
    }

    public FaceSelfieRegisterRequest(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = j;
        this.encFaceRegisterTokenHash = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(FaceSelfieRegisterRequest faceSelfieRegisterRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, faceSelfieRegisterRequest.id);
        vylVar.onExtraCallback(serialDescriptor, 1, faceSelfieRegisterRequest.encFaceRegisterTokenHash);
        int i4 = IAuthTabCallback + 65;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015b  */
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
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 35125), 23 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 12843), (KeyEvent.getMaxKeyCode() >> 16) + 55, ImageFormat.getBitsPerPixel(0) + 2168, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
            int i7 = $11 + 77;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (!(!z)) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i9 = $11 + 27;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - View.MeasureSpec.makeMeasureSpec(0, 0)), 54 - TextUtils.indexOf((CharSequence) "", '0', 0), Drawable.resolveOpacity(0, 0) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onWarmupCompleted() {
        onWarmupCompleted = 478308954;
    }
}
