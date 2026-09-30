package im.toss.facepay.validation.model.init.config;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard;
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
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class OperationConfig$$serializer implements aeu2<OperationConfig> {
    private static long IAuthTabCallback;
    public static final OperationConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static char[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static final byte[] $$a = {15, -12, 105, AbstractSmartcard.BYTE_RESPONSE_LENGTH};
    private static final int $$b = 122;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int asBinder = 1;
    private static int onWarmupCompleted = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, byte b2) {
        int i;
        int i2;
        int i3 = (s * 3) + 1;
        int i4 = (b * 4) + 97;
        int i5 = 3 - (b2 * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            int i7 = i3;
            i4 = (-i4) + i7;
            i5 = i6;
            i = i2;
            int i8 = i5 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            byte b3 = bArr[i8];
            i7 = i4;
            i4 = b3;
            i6 = i8;
            i4 = (-i4) + i7;
            i5 = i6;
            i = i2;
            int i82 = i5 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            int i822 = i5 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }

    private OperationConfig$$serializer() {
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 121;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 67;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 89 / 0;
        }
        return serialDescriptor;
    }

    static {
        onNavigationEvent = 1;
        onExtraCallbackWithResult();
        OperationConfig$$serializer operationConfig$$serializer = new OperationConfig$$serializer();
        INSTANCE = operationConfig$$serializer;
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 59, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
        descriptor = new setAnimationsLoop(((String) objArr[0]).intern(), operationConfig$$serializer, 0);
        int i = onWarmupCompleted + 77;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 71;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        KSerializer<?>[] kSerializerArr = new KSerializer[0];
        int i5 = i2 + 43;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034 A[PHI: r1 r7
      0x0034: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v7 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0032, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x0034: PHI (r7v2 o.yw) = (r7v1 o.yw), (r7v6 o.yw) binds: [B:8:0x0032, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final OperationConfig deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            int i3 = 18 / 0;
            if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                int i4 = onExtraCallback + 89;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new OperationConfig(0, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m316deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            obj.hashCode();
            throw null;
        }
        OperationConfig operationConfigDeserialize = deserialize(decoder);
        int i3 = onExtraCallback + 35;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return operationConfigDeserialize;
        }
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull OperationConfig operationConfig) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(operationConfig, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        OperationConfig.onWarmupCompleted(operationConfig, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asBinder + 85;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (OperationConfig) obj);
        int i4 = asBinder + 73;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallbackWithResult[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - KeyEvent.normalizeMetaState(0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 16, TextUtils.getOffsetBefore("", 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 46134), 30 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 20219 - TextUtils.lastIndexOf("", '0'), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getFadingEdgeLength() >> 16)), ((Process.getThreadPriority(0) + 20) >> 6) + 44, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1493, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i5 = $11 + 63;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i7 = $11 + 117;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 49124), 44 - KeyEvent.normalizeMetaState(0), TextUtils.getTrimmedLength("") + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = new char[]{60861, 36983, 5734, 38090, 6787, 39073, 8051, 40280, 962, 33163, 1979, 35435, 2060, 36547, 3305, 45800, 12610, 46875, 13764, 48119, 14760, 48211, 8724, 41023, 9963, 42148, 11030, 43267, 12083, 44518, 21397, 54858, 21562, 55859, 22758, 56983, 23896, 49980, 16675, 51161, 17802, 51276, 20081, 52265, 29330, 61613, 30368, 62819, 31494, 63963, 32668, 64951, 24675, 58908, 25827, 60153, 26794, 61292, 27921, 5065};
        IAuthTabCallback = -1176237237854695398L;
    }
}
