package im.toss.features.home.core.local.model.dst.handler;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.home.core.local.model.dst.eventlog.EventLogLocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BaseWorkerImplRenderReadyListener;
import o.TimelineExternalSyntheticLambda1;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.onAlipayJSBridgeReady;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HandlerLocal$LocalAction$ShowExpiredAccountNudge$$serializer implements aeu2<HandlerLocal.LocalAction.ShowExpiredAccountNudge> {
    public static final HandlerLocal$LocalAction$ShowExpiredAccountNudge$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static long onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char[] onWarmupCompleted;
    private static final byte[] $$a = {115, 102, 60, 8};
    private static final int $$b = 198;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onTransact = 1;
    private static int onNavigationEvent = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = 3 - (i * 2);
        int i7 = 1 - (i2 * 2);
        byte[] bArr = $$a;
        int i8 = 97 - (i3 * 4);
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i9 = i7;
            i5 = 0;
            i8 += -i9;
            i4 = i5;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i8;
            if (i5 == i7) {
                return new String(bArr2, 0);
            }
            i6++;
            i9 = bArr[i6];
            i8 += -i9;
            i4 = i5;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i8;
            if (i5 == i7) {
            }
        } else {
            i4 = 0;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i8;
            if (i5 == i7) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 31;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $11 + 49;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 59697), 17 - View.combineMeasuredStates(0, 0), View.resolveSize(0, 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 31 - View.MeasureSpec.getSize(0), TextUtils.indexOf("", "", 0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 49123), Color.blue(0) + 44, 1493 - TextUtils.lastIndexOf("", '0', 0, 0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 49122), 44 - (ViewConfiguration.getTouchSlop() >> 8), KeyEvent.getDeadChar(0, 0) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            int i7 = $11 + 21;
            $10 = i7 % 128;
            int i8 = i7 % 2;
        }
        objArr[0] = new String(cArr);
    }

    static {
        onExtraCallbackWithResult = 0;
        onWarmupCompleted();
        HandlerLocal$LocalAction$ShowExpiredAccountNudge$$serializer handlerLocal$LocalAction$ShowExpiredAccountNudge$$serializer = new HandlerLocal$LocalAction$ShowExpiredAccountNudge$$serializer();
        INSTANCE = handlerLocal$LocalAction$ShowExpiredAccountNudge$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.handler.HandlerLocal.LocalAction.ShowExpiredAccountNudge", handlerLocal$LocalAction$ShowExpiredAccountNudge$$serializer, 4);
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getTapTimeout() >> 16, 4 - TextUtils.getCapsMode("", 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 495), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("eventLog", false);
        setanimationsloop.onWarmupCompleted("runOption", false);
        Object[] objArr2 = new Object[1];
        a(4 - (ViewConfiguration.getTouchSlop() >> 8), KeyEvent.normalizeMetaState(0) + 4, (char) (11260 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 95;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private HandlerLocal$LocalAction$ShowExpiredAccountNudge$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback(onAlipayJSBridgeReady.onExtraCallbackWithResult), BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, HandlerLocal$LocalAction$ShowExpiredAccountNudge$Data$$serializer.INSTANCE};
        int i4 = IAuthTabCallback + 111;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005a A[PHI: r1 r15
      0x005a: PHI (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0034, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x005a: PHI (r15v5 o.yw) = (r15v1 o.yw), (r15v7 o.yw) binds: [B:8:0x0034, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036 A[PHI: r1 r15
      0x0036: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0034, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0036: PHI (r15v2 o.yw) = (r15v1 o.yw), (r15v7 o.yw) binds: [B:8:0x0034, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HandlerLocal.LocalAction.ShowExpiredAccountNudge deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        String strAsInterface;
        int i;
        HandlerLocal.LocalAction.ShowExpiredAccountNudge.Data data;
        EventLogLocal eventLogLocal;
        HandlerLocal.RunOption runOption;
        int i2 = 2 % 2;
        int i3 = onTransact + 11;
        IAuthTabCallback = i3 % 128;
        HandlerLocal.RunOption runOption2 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            int i4 = 41 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                EventLogLocal eventLogLocal2 = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, onAlipayJSBridgeReady.onExtraCallbackWithResult, (Object) null);
                HandlerLocal.RunOption runOption3 = (HandlerLocal.RunOption) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, (Object) null);
                strAsInterface = strAsInterface2;
                i = 15;
                data = (HandlerLocal.LocalAction.ShowExpiredAccountNudge.Data) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, HandlerLocal$LocalAction$ShowExpiredAccountNudge$Data$$serializer.INSTANCE, (Object) null);
                eventLogLocal = eventLogLocal2;
                runOption = runOption3;
            } else {
                boolean z = true;
                i = 0;
                EventLogLocal eventLogLocal3 = null;
                strAsInterface = null;
                HandlerLocal.LocalAction.ShowExpiredAccountNudge.Data data2 = null;
                while (z) {
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent != -1) {
                        int i5 = onTransact + 103;
                        int i6 = i5 % 128;
                        IAuthTabCallback = i6;
                        int i7 = i5 % 2;
                        if (iOnNavigationEvent == 0) {
                            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            i |= 1;
                        } else if (iOnNavigationEvent == 1) {
                            eventLogLocal3 = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, onAlipayJSBridgeReady.onExtraCallbackWithResult, eventLogLocal3);
                            i |= 2;
                        } else if (iOnNavigationEvent != 2) {
                            int i8 = i6 + 35;
                            onTransact = i8 % 128;
                            int i9 = i8 % 2;
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            data2 = (HandlerLocal.LocalAction.ShowExpiredAccountNudge.Data) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, HandlerLocal$LocalAction$ShowExpiredAccountNudge$Data$$serializer.INSTANCE, data2);
                            i |= 8;
                        } else {
                            runOption2 = (HandlerLocal.RunOption) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, runOption2);
                            i |= 4;
                        }
                    } else {
                        z = false;
                    }
                }
                runOption = runOption2;
                eventLogLocal = eventLogLocal3;
                data = data2;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HandlerLocal.LocalAction.ShowExpiredAccountNudge(i, strAsInterface, eventLogLocal, runOption, data, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m444deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            throw null;
        }
        HandlerLocal.LocalAction.ShowExpiredAccountNudge showExpiredAccountNudgeDeserialize = deserialize(decoder);
        int i3 = IAuthTabCallback + 27;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return showExpiredAccountNudgeDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HandlerLocal.LocalAction.ShowExpiredAccountNudge showExpiredAccountNudge) {
        int i = 2 % 2;
        int i2 = onTransact + 47;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(showExpiredAccountNudge, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            HandlerLocal.LocalAction.ShowExpiredAccountNudge.onExtraCallbackWithResult(showExpiredAccountNudge, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(showExpiredAccountNudge, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        HandlerLocal.LocalAction.ShowExpiredAccountNudge.onExtraCallbackWithResult(showExpiredAccountNudge, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 32 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HandlerLocal.LocalAction.ShowExpiredAccountNudge) obj);
        int i4 = IAuthTabCallback + 9;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onTransact + 9;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    static void onWarmupCompleted() {
        onWarmupCompleted = new char[]{60500, 16031, 18911, 37907, 50763, 5258, 25555, 48642};
        onExtraCallback = 704253555537297168L;
    }
}
