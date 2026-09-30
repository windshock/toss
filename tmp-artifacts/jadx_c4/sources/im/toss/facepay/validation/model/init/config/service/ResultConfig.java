package im.toss.facepay.validation.model.init.config.service;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ResultConfig {
    public static final Companion Companion;
    private static int onExtraCallback;
    private static int onWarmupCompleted;
    private final FailureImageConfig failure;
    private final SuccessImageConfig success;
    private static final byte[] $$a = {23, 124, -70, -17};
    private static final int $$b = 127;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onExtraCallbackWithResult = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = 3 - (i2 * 3);
        byte[] bArr = $$a;
        int i7 = 1 - (s * 4);
        int i8 = 105 - (i * 3);
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i9 = i7;
            i4 = i6;
            i5 = 0;
            i6 += i9;
            i3 = i5;
            i5 = i3 + 1;
            i4++;
            bArr2[i3] = (byte) i6;
            if (i5 == i7) {
                return new String(bArr2, 0);
            }
            i9 = bArr[i4];
            i6 += i9;
            i3 = i5;
            i5 = i3 + 1;
            i4++;
            bArr2[i3] = (byte) i6;
            if (i5 == i7) {
            }
        } else {
            i3 = 0;
            i6 = i8;
            i4 = i6;
            i5 = i3 + 1;
            i4++;
            bArr2[i3] = (byte) i6;
            if (i5 == i7) {
            }
        }
    }

    static {
        onWarmupCompleted = 1;
        IAuthTabCallback();
        Companion = new Companion(null);
        int i = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResultConfig() {
        this((FailureImageConfig) null, (SuccessImageConfig) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultConfig)) {
            return false;
        }
        ResultConfig resultConfig = (ResultConfig) obj;
        if (!Intrinsics.areEqual(this.failure, resultConfig.failure)) {
            return false;
        }
        if (Intrinsics.areEqual(this.success, resultConfig.success)) {
            return true;
        }
        int i2 = onNavigationEvent + 13;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 37;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.failure.hashCode() * 31) + this.success.hashCode();
        int i4 = IAuthTabCallback + 7;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        FailureImageConfig failureImageConfig = this.failure;
        SuccessImageConfig successImageConfig = this.success;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 21, 4 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{18, 15, 2, 65498, 65519, 2, 16, 18, '\t', 17, 65504, '\f', 11, 3, 6, 4, 65477, 3, 65534, 6, '\t'}, false, 155 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(failureImageConfig);
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getPressedStateDuration() >> 16) + 10, 9 - Color.argb(0, 0, 0, 0), new char[]{26, 26, '\f', '\n', '\n', 28, 26, 65479, 65491, 65508}, true, TextUtils.getCapsMode("", 0, 0) + 145, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(successImageConfig);
        Object[] objArr3 = new Object[1];
        a(1 - View.MeasureSpec.getMode(0), (-16777215) - Color.rgb(0, 0, 0), new char[]{0}, true, 96 - Process.getGidForName(""), objArr3);
        sb.append(((String) objArr3[0]).intern());
        String string = sb.toString();
        int i2 = onNavigationEvent + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public static final class Companion {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ResultConfig> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 49;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                ResultConfig$$serializer resultConfig$$serializer = ResultConfig$$serializer.INSTANCE;
                throw null;
            }
            ResultConfig$$serializer resultConfig$$serializer2 = ResultConfig$$serializer.INSTANCE;
            int i3 = onNavigationEvent + 99;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return resultConfig$$serializer2;
        }
    }

    public /* synthetic */ ResultConfig(int i, FailureImageConfig failureImageConfig, SuccessImageConfig successImageConfig, okycx okycxVar) {
        if ((i & 1) == 0) {
            failureImageConfig = new FailureImageConfig(false, 0.0d, 0, 0, 15, (DefaultConstructorMarker) null);
            int i2 = 2 % 2;
        }
        this.failure = failureImageConfig;
        if ((i & 2) != 0) {
            this.success = successImageConfig;
            int i3 = IAuthTabCallback + 37;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.success = new SuccessImageConfig(0.0d, 0, 3, (DefaultConstructorMarker) null);
        int i5 = onNavigationEvent + 39;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(ResultConfig resultConfig, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || (!Intrinsics.areEqual(resultConfig.failure, new FailureImageConfig(false, 0.0d, 0, 0, 15, (DefaultConstructorMarker) null)))) {
            vylVar.onNavigationEvent(serialDescriptor, 0, FailureImageConfig$$serializer.INSTANCE, resultConfig.failure);
            int i2 = IAuthTabCallback + 53;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(resultConfig.success, new SuccessImageConfig(0.0d, 0, 3, (DefaultConstructorMarker) null))) {
            vylVar.onNavigationEvent(serialDescriptor, 1, SuccessImageConfig$$serializer.INSTANCE, resultConfig.success);
        }
        int i4 = IAuthTabCallback + 25;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
    }

    public ResultConfig(@NotNull FailureImageConfig failureImageConfig, @NotNull SuccessImageConfig successImageConfig) {
        Intrinsics.checkNotNullParameter(failureImageConfig, "");
        Intrinsics.checkNotNullParameter(successImageConfig, "");
        this.failure = failureImageConfig;
        this.success = successImageConfig;
    }

    public /* synthetic */ ResultConfig(FailureImageConfig failureImageConfig, SuccessImageConfig successImageConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            failureImageConfig = new FailureImageConfig(false, 0.0d, 0, 0, 15, (DefaultConstructorMarker) null);
            int i2 = onNavigationEvent + 55;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        if ((i & 2) != 0) {
            successImageConfig = new SuccessImageConfig(0.0d, 0, 3, (DefaultConstructorMarker) null);
            int i4 = IAuthTabCallback + 57;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this(failureImageConfig, successImageConfig);
    }

    public final SuccessImageConfig onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 117;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SuccessImageConfig successImageConfig = this.success;
        int i5 = i2 + 123;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return successImageConfig;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016a  */
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
        int i6 = $11 + 123;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 35125), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23, KeyEvent.normalizeMetaState(0) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - TextUtils.getOffsetBefore("", 0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 55, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            int i9 = $10 + 5;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i11 = $10 + 117;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.keyCodeFromString("") + 12843), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 55, 2166 - TextUtils.indexOf((CharSequence) "", '0'), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i13 = $11 + 45;
        $10 = i13 % 128;
        if (i13 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i14 = 20 / 0;
            objArr[0] = str;
        }
    }

    static void IAuthTabCallback() {
        onExtraCallback = 478308881;
    }
}
