package im.toss.core.tuba;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.ALCFaceSDK4ExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.aeu2;
import o.getDynamicHeight;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class TriggerWhen$$serializer implements aeu2<TriggerWhen> {
    public static final TriggerWhen$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static char[] onExtraCallbackWithResult;
    private static long onWarmupCompleted;
    private static final byte[] $$a = {111, -53, -88, 102};
    private static final int $$b = 239;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onNavigationEvent = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, int i2) {
        int i3;
        int i4 = (i * 4) + 4;
        byte[] bArr = $$a;
        int i5 = 97 - (i2 * 3);
        int i6 = s * 4;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i7 = i6;
            int i8 = i4;
            int i9 = 0;
            i4++;
            i5 = i8 + i7;
            i3 = i9;
            int i10 = i5;
            int i11 = i4;
            bArr2[i3] = (byte) i10;
            i9 = i3 + 1;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i11];
            i8 = i10;
            i4 = i11;
            i4++;
            i5 = i8 + i7;
            i3 = i9;
            int i102 = i5;
            int i112 = i4;
            bArr2[i3] = (byte) i102;
            i9 = i3 + 1;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            int i1022 = i5;
            int i1122 = i4;
            bArr2[i3] = (byte) i1022;
            i9 = i3 + 1;
            if (i3 == i6) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 41;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a1  */
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
        int i5 = $11 + 21;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (true) {
            i3 = -1401950695;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i7 = $11 + 81;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallbackWithResult[i + i9])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - TextUtils.getOffsetBefore("", 0)), 17 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 10973 - TextUtils.getCapsMode("", 0, 0), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i9), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - Drawable.resolveOpacity(0, 0)), 31 - TextUtils.getCapsMode("", 0, 0), 20220 - (ViewConfiguration.getScrollBarSize() >> 8), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i9] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 49122), 44 - KeyEvent.normalizeMetaState(0), TextUtils.indexOf("", "") + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 49122), Color.blue(0) + 44, 1494 - (Process.myTid() >> 22), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i3 = -1401950695;
        }
        String str = new String(cArr);
        int i10 = $10 + 87;
        $11 = i10 % 128;
        if (i10 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i11 = 19 / 0;
            objArr[0] = str;
        }
    }

    static {
        onExtraCallback = 0;
        onWarmupCompleted();
        TriggerWhen$$serializer triggerWhen$$serializer = new TriggerWhen$$serializer();
        INSTANCE = triggerWhen$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.core.tuba.TriggerWhen", triggerWhen$$serializer, 2);
        Object[] objArr = new Object[1];
        a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, TextUtils.indexOf((CharSequence) "", '0', 0) + 5, (char) (34059 - TextUtils.indexOf("", "", 0, 0)), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("times", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 9;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private TriggerWhen$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback((KSerializer) TriggerWhen.onExtraCallbackWithResult()[0].getValue()), getDynamicHeight.onWarmupCompleted};
        int i4 = IAuthTabCallback + 117;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TriggerWhen deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        ALCFaceSDK4ExternalSyntheticLambda0 aLCFaceSDK4ExternalSyntheticLambda0;
        int iOnTransact;
        int i2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 7;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = TriggerWhen.onExtraCallbackWithResult();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            aLCFaceSDK4ExternalSyntheticLambda0 = (ALCFaceSDK4ExternalSyntheticLambda0) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), (Object) null);
            iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
            int i6 = IAuthTabCallbackStub + 117;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 4 % 2;
            }
            i = 3;
        } else {
            ALCFaceSDK4ExternalSyntheticLambda0 aLCFaceSDK4ExternalSyntheticLambda02 = null;
            int i8 = 0;
            int iOnTransact2 = 0;
            boolean z = true;
            while (z) {
                int i9 = IAuthTabCallbackStub + 117;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i10 = IAuthTabCallbackStub;
                    int i11 = i10 + 25;
                    IAuthTabCallback = i11 % 128;
                    if (i11 % 2 != 0) {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        i2 = i10 + 45;
                        IAuthTabCallback = i2 % 128;
                        if (i2 % 2 == 0) {
                            iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
                            i8 |= 4;
                        } else {
                            iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
                            i8 |= 2;
                        }
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        i2 = i10 + 45;
                        IAuthTabCallback = i2 % 128;
                        if (i2 % 2 == 0) {
                        }
                    }
                } else {
                    aLCFaceSDK4ExternalSyntheticLambda02 = (ALCFaceSDK4ExternalSyntheticLambda0) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), aLCFaceSDK4ExternalSyntheticLambda02);
                    i8 |= 1;
                }
            }
            i = i8;
            aLCFaceSDK4ExternalSyntheticLambda0 = aLCFaceSDK4ExternalSyntheticLambda02;
            iOnTransact = iOnTransact2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TriggerWhen(i, aLCFaceSDK4ExternalSyntheticLambda0, iOnTransact, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m95deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 105;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            throw null;
        }
        TriggerWhen triggerWhenDeserialize = deserialize(decoder);
        int i3 = IAuthTabCallbackStub + 99;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return triggerWhenDeserialize;
        }
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TriggerWhen triggerWhen) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(triggerWhen, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TriggerWhen.onExtraCallbackWithResult(triggerWhen, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 75;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TriggerWhen) obj);
        int i4 = IAuthTabCallback + 13;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 61;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = new char[]{26795, 52315, 8533, 34381};
        onWarmupCompleted = -6082626953481402071L;
    }
}
