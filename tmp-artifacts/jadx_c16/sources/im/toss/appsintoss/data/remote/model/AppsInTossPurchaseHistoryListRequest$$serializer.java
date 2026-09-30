package im.toss.appsintoss.data.remote.model;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AppsInTossPurchaseHistoryListRequest$$serializer implements aeu2<AppsInTossPurchaseHistoryListRequest> {
    public static final int $stable;
    private static long IAuthTabCallback;
    public static final AppsInTossPurchaseHistoryListRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static char[] onExtraCallback;
    private static int onNavigationEvent;
    private static final byte[] $$a = {104, -2, 24, -74};
    private static final int $$b = 218;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, byte b) {
        int i2;
        int i3;
        int i4;
        int i5 = (i * 3) + 4;
        int i6 = (b * 3) + 1;
        byte[] bArr = $$a;
        int i7 = 97 - (s * 2);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i7;
            i4 = 0;
            i3 = i5;
            i5 += i8;
            i3++;
            i2 = i4;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i4 == i6) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i3];
            i5 += i8;
            i3++;
            i2 = i4;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i4 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i5;
            i5 = i7;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i4 == i6) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 67;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        onNavigationEvent = 0;
        onWarmupCompleted();
        AppsInTossPurchaseHistoryListRequest$$serializer appsInTossPurchaseHistoryListRequest$$serializer = new AppsInTossPurchaseHistoryListRequest$$serializer();
        INSTANCE = appsInTossPurchaseHistoryListRequest$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.appsintoss.data.remote.model.AppsInTossPurchaseHistoryListRequest", appsInTossPurchaseHistoryListRequest$$serializer, 3);
        setanimationsloop.onWarmupCompleted("category", false);
        setanimationsloop.onWarmupCompleted("miniAppName", false);
        Object[] objArr = new Object[1];
        a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 3 - TextUtils.getTrimmedLength(""), (char) (37791 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 59;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private AppsInTossPurchaseHistoryListRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = onExtraCallbackWithResult + 93;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AppsInTossPurchaseHistoryListRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        int i3 = 2 % 2;
        int i4 = onTransact + 85;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        String str4 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            i = 7;
            str3 = str5;
            str = str6;
        } else {
            int i6 = 0;
            boolean z = true;
            String str7 = null;
            String str8 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    if (iOnNavigationEvent == 0) {
                        str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str8);
                        i6 |= 1;
                        i2 = onExtraCallbackWithResult + 51;
                    } else if (iOnNavigationEvent == 1) {
                        str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str4);
                        i6 |= 2;
                        i2 = onExtraCallbackWithResult + 37;
                    } else {
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str7);
                        i6 |= 4;
                        int i7 = onExtraCallbackWithResult + 63;
                        onTransact = i7 % 128;
                        int i8 = i7 % 2;
                    }
                    onTransact = i2 % 128;
                    int i9 = i2 % 2;
                } else {
                    z = false;
                }
            }
            i = i6;
            str = str4;
            str2 = str7;
            str3 = str8;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AppsInTossPurchaseHistoryListRequest(i, str3, str, str2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m46deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        AppsInTossPurchaseHistoryListRequest appsInTossPurchaseHistoryListRequestDeserialize = deserialize(decoder);
        int i4 = onTransact + 65;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return appsInTossPurchaseHistoryListRequestDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AppsInTossPurchaseHistoryListRequest appsInTossPurchaseHistoryListRequest) {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(appsInTossPurchaseHistoryListRequest, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            AppsInTossPurchaseHistoryListRequest.onNavigationEvent(appsInTossPurchaseHistoryListRequest, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(appsInTossPurchaseHistoryListRequest, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        AppsInTossPurchaseHistoryListRequest.onNavigationEvent(appsInTossPurchaseHistoryListRequest, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onExtraCallbackWithResult + 103;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AppsInTossPurchaseHistoryListRequest) obj);
        int i4 = onExtraCallbackWithResult + 49;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 5;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3;
        Throwable cause;
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            i3 = -1401950695;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i5 = $11 + 27;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallback[i + i7])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 17 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 46134), 32 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 20220 - ((Process.getThreadPriority(0) + 20) >> 6), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 49123), 44 - View.resolveSize(0, 0), 1494 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
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
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i8 = $11 + 19;
        $10 = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 3 / 4;
        }
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.keyCodeFromString("") + 49123), 44 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i3 = -1401950695;
        }
        String str = new String(cArr);
        int i10 = $11 + 123;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    static void onWarmupCompleted() {
        onExtraCallback = new char[]{32288, 52949, 8132};
        IAuthTabCallback = -6059130698041959121L;
    }
}
