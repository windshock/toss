package im.toss.securities.libs.performance.tracker.data.model;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.Deinitialize;
import o.PangleEncryptUtilsType4;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.appInfo;
import o.checkValidYaw;
import o.kt;
import o.liq;
import o.okycx;
import o.wie2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@appInfo(IAuthTabCallback = "type")
@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class SecuritiesPerformanceLogBody implements Deinitialize {
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final int $stable = 0;
    public static final Companion Companion;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {118, 33, 67, 92};
    private static final int $$b = 141;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, short s3) {
        int i;
        int i2 = 4 - (s2 * 2);
        byte[] bArr = $$a;
        int i3 = (s * 2) + 105;
        int i4 = s3 * 2;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i5 = i2;
            int i6 = 0;
            i3 += i2;
            i2 = i5 + 1;
            i = i6;
            bArr2[i] = (byte) i3;
            i6 = i + 1;
            if (i == i4) {
                return new String(bArr2, 0);
            }
            i5 = i2;
            i2 = bArr[i2];
            i3 += i2;
            i2 = i5 + 1;
            i = i6;
            bArr2[i] = (byte) i3;
            i6 = i + 1;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            i6 = i + 1;
            if (i == i4) {
            }
        }
    }

    public /* synthetic */ SecuritiesPerformanceLogBody(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ KSerializer IAuthTabCallback_Parcel() throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult();
            throw null;
        }
        KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i3 = onNavigationEvent + 73;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 34 / 0;
        }
        return kSerializerOnExtraCallbackWithResult;
    }

    public abstract String asInterface();

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer = (KSerializer) SecuritiesPerformanceLogBody.IAuthTabCallbackStubProxy().getValue();
            int i4 = IAuthTabCallback + 25;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return kSerializer;
        }

        public final KSerializer<SecuritiesPerformanceLogBody> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<SecuritiesPerformanceLogBody> kSerializerOnNavigationEvent = onNavigationEvent();
            int i4 = IAuthTabCallback + 13;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnNavigationEvent;
        }
    }

    static {
        onWarmupCompleted = 0;
        access000();
        Companion = new Companion(null);
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.libs.performance.tracker.data.model.SecuritiesPerformanceLogBody$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() throws Throwable {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 55;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerIAuthTabCallback_Parcel = SecuritiesPerformanceLogBody.IAuthTabCallback_Parcel();
                int i4 = onExtraCallbackWithResult + 51;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 98 / 0;
                }
                return kSerializerIAuthTabCallback_Parcel;
            }
        });
        int i = IAuthTabCallback + 57;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private SecuritiesPerformanceLogBody() {
    }

    public /* synthetic */ SecuritiesPerformanceLogBody(int i, okycx okycxVar) {
    }

    public static final /* synthetic */ Lazy IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return $cachedSerializer$delegate;
        }
        throw null;
    }

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() throws Throwable {
        int i = 2 % 2;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SecuritiesPerformanceLogBody.class);
        KClass[] kClassArr = {Reflection.getOrCreateKotlinClass(MetricV1LogBody.class)};
        KSerializer[] kSerializerArr = {MetricV1LogBody$$serializer.INSTANCE};
        Object[] objArr = new Object[1];
        a(4 - KeyEvent.keyCodeFromString(""), 1 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), new char[]{65525, 4, '\t', 0}, false, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 296, objArr);
        kt ktVar = new kt("im.toss.securities.libs.performance.tracker.data.model.SecuritiesPerformanceLogBody", orCreateKotlinClass, kClassArr, kSerializerArr, new Annotation[]{new appInfo(((String) objArr[0]).intern()) { // from class: im.toss.securities.libs.performance.tracker.data.model.SecuritiesPerformanceLogBody.Companion.onNavigationEvent
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;
            private final /* synthetic */ String IAuthTabCallback;

            {
                Intrinsics.checkNotNullParameter(str, "");
                this.IAuthTabCallback = str;
            }

            public final /* synthetic */ String IAuthTabCallback() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted;
                int i4 = i3 + 1;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                String str = this.IAuthTabCallback;
                int i6 = i3 + 83;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return str;
            }

            public final /* synthetic */ Class annotationType() {
                Class<appInfo> cls;
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 5;
                int i4 = i3 % 128;
                onExtraCallback = i4;
                if (i3 % 2 == 0) {
                    cls = appInfo.class;
                    int i5 = 74 / 0;
                } else {
                    cls = appInfo.class;
                }
                int i6 = i4 + 41;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                return cls;
            }

            public final boolean equals(@Nullable Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 85;
                int i4 = i3 % 128;
                onExtraCallback = i4;
                int i5 = i3 % 2;
                if (!(!(obj instanceof appInfo))) {
                    return Intrinsics.areEqual(IAuthTabCallback(), ((appInfo) obj).IAuthTabCallback());
                }
                int i6 = i4 + 79;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public final int hashCode() {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 99;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                int iHashCode = this.IAuthTabCallback.hashCode() ^ 707790692;
                int i5 = onWarmupCompleted + 45;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 56 / 0;
                }
                return iHashCode;
            }

            public final String toString() {
                int i2 = 2 % 2;
                String str = "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=" + this.IAuthTabCallback + ")";
                int i3 = onExtraCallback + 97;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    return str;
                }
                throw null;
            }
        }});
        int i2 = onExtraCallback + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return ktVar;
    }

    public void IAuthTabCallback(@NotNull OutputStream outputStream) throws IOException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onNavigationEvent = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(outputStream, "");
                wie2 wie2VarIAuthTabCallback = checkValidYaw.IAuthTabCallback();
                wie2VarIAuthTabCallback.onExtraCallback();
                PangleEncryptUtilsType4.onExtraCallback(wie2VarIAuthTabCallback, Companion.serializer(), this, outputStream);
                return;
            }
            Intrinsics.checkNotNullParameter(outputStream, "");
            wie2 wie2VarIAuthTabCallback2 = checkValidYaw.IAuthTabCallback();
            wie2VarIAuthTabCallback2.onExtraCallback();
            PangleEncryptUtilsType4.onExtraCallback(wie2VarIAuthTabCallback2, Companion.serializer(), this, outputStream);
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    public String onWarmupCompleted() {
        int i = 2 % 2;
        String str = asInterface() + ".json";
        int i2 = onNavigationEvent + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        int i6 = $10 + 121;
        $11 = i6 % 128;
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
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 35126), 23 - Color.green(0), 10278 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode("", 0, 0) + 12843), 55 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 2167 - Color.alpha(0), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            int i9 = $10 + 81;
            $11 = i9 % 128;
            int i10 = i9 % 2;
        }
        if (!(!z)) {
            int i11 = $10 + 121;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 12843), (ViewConfiguration.getTouchSlop() >> 8) + 55, 2167 - (ViewConfiguration.getLongPressTimeout() >> 16), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i13 = $10 + 119;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    i4 = 2083011369;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void access000() {
        onExtraCallbackWithResult = 478309009;
    }
}
