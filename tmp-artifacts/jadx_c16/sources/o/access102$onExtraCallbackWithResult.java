package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class access102$onExtraCallbackWithResult {

    @SerializedName("userToken")
    private final String IAuthTabCallback;

    @SerializedName("ssaid")
    private final String onExtraCallbackWithResult;
    private static final byte[] $$a = {104, -2, 24, -74};
    private static final int $$b = 15;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 478308887;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, int i2) {
        int i3;
        int i4 = 4 - (i * 3);
        int i5 = s * 2;
        int i6 = (i2 * 2) + 105;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i7;
            int i9 = i4;
            int i10 = 0;
            int i11 = (-i4) + i8;
            int i12 = i9 + 1;
            i3 = i10;
            i6 = i11;
            i4 = i12;
            bArr2[i3] = (byte) i6;
            i10 = i3 + 1;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            int i13 = i6;
            i9 = i4;
            i4 = bArr[i4];
            i8 = i13;
            int i112 = (-i4) + i8;
            int i122 = i9 + 1;
            i3 = i10;
            i6 = i112;
            i4 = i122;
            bArr2[i3] = (byte) i6;
            i10 = i3 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            i10 = i3 + 1;
            if (i3 == i7) {
            }
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 43;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof access102$onExtraCallbackWithResult)) {
            int i5 = i2 + 103;
            onWarmupCompleted = i5 % 128;
            return i5 % 2 != 0;
        }
        access102$onExtraCallbackWithResult access102_onextracallbackwithresult = (access102$onExtraCallbackWithResult) obj;
        if (Intrinsics.areEqual(this.IAuthTabCallback, access102_onextracallbackwithresult.IAuthTabCallback)) {
            return Intrinsics.areEqual(this.onExtraCallbackWithResult, access102_onextracallbackwithresult.onExtraCallbackWithResult);
        }
        int i6 = onExtraCallback + 97;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.IAuthTabCallback.hashCode();
        return i3 != 0 ? (iHashCode - 101) >>> this.onExtraCallbackWithResult.hashCode() : (iHashCode * 31) + this.onExtraCallbackWithResult.hashCode();
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.IAuthTabCallback;
        String str2 = this.onExtraCallbackWithResult;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(TextUtils.getOffsetBefore("", 0) + 20, 11 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{65478, 19, 17, 3, 16, 65522, '\r', '\t', 3, '\f', 65499, 65522, '\r', '\t', 3, '\f', 65511, '\f', 4, '\r'}, false, (ViewConfiguration.getJumpTapTimeout() >> 16) + 160, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 7, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2, new char[]{65485, 65497, 65514, 17, 22, 14, ' ', ' '}, true, 145 - Color.alpha(0), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(str2);
        Object[] objArr3 = new Object[1];
        a(Drawable.resolveOpacity(0, 0) + 1, TextUtils.indexOf("", "") + 1, new char[]{0}, true, 104 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr3);
        sb.append(((String) objArr3[0]).intern());
        String string = sb.toString();
        int i2 = onExtraCallback + 101;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public access102$onExtraCallbackWithResult(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.IAuthTabCallback = str;
        this.onExtraCallbackWithResult = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0163  */
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
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 35126), 23 - (ViewConfiguration.getKeyRepeatDelay() >> 16), MotionEvent.axisFromString("") + 10279, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12843), TextUtils.lastIndexOf("", '0', 0, 0) + 56, ImageFormat.getBitsPerPixel(0) + 2168, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i7 = $11 + 21;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 12843), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 54, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i9 = $11 + 43;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}
