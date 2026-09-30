package im.toss.ads_sdk.model;

import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tmoney.LiveCheckConstants;
import im.toss.ads_sdk.model.NativeAdsDto;
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
import o.setVideoListener;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class NativeAdsDto$Reward$$serializer implements aeu2<NativeAdsDto.Reward> {
    public static final int $stable;
    private static long IAuthTabCallback;
    public static final NativeAdsDto$Reward$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static char[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static final byte[] $$a = {79, -25, -14, 102};
    private static final int $$b = 221;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onNavigationEvent = 1;

    private static String $$c(byte b, int i, byte b2) {
        byte[] bArr = $$a;
        int i2 = i * 2;
        int i3 = 3 - (b * 2);
        int i4 = 97 - (b2 * 3);
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i4 = (-i4) + i5;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            i3++;
            bArr2[i7] = (byte) i4;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            i4 = (-bArr[i3]) + i4;
            i6 = i7;
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 117;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 113;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a5  */
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
            int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallback[i + i5])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59745 - AndroidCharacter.getMirror('0')), TextUtils.getCapsMode("", 0, 0) + 17, TextUtils.indexOf((CharSequence) "", '0', 0) + 10974, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 46134), 31 - (ViewConfiguration.getScrollDefaultDelay() >> 16), View.combineMeasuredStates(0, 0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.getTrimmedLength("")), '\\' - AndroidCharacter.getMirror('0'), 1493 - TextUtils.lastIndexOf("", '0'), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                        }
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i6 = $11 + 111;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i8 = $11 + 59;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 49123), 44 - KeyEvent.getDeadChar(0, 0), 1494 - TextUtils.getCapsMode("", 0, 0), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i3 = -1401950695;
        }
        String str = new String(cArr);
        int i10 = $10 + 7;
        $11 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    static {
        onExtraCallbackWithResult = 0;
        onWarmupCompleted();
        NativeAdsDto$Reward$$serializer nativeAdsDto$Reward$$serializer = new NativeAdsDto$Reward$$serializer();
        INSTANCE = nativeAdsDto$Reward$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.model.NativeAdsDto.Reward", nativeAdsDto$Reward$$serializer, 2);
        Object[] objArr = new Object[1];
        a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, 4 - TextUtils.getCapsMode("", 0, 0), (char) (13971 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted(LiveCheckConstants.AMOUNT, true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 37;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private NativeAdsDto$Reward$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent, setVideoListener.onWarmupCompleted};
        int i4 = IAuthTabCallbackDefault + 87;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final NativeAdsDto.Reward deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        double dIAuthTabCallback;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 33;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
            i = 3;
        } else {
            Object obj = null;
            int i5 = 0;
            boolean z = true;
            double dIAuthTabCallback2 = 0.0d;
            String strAsInterface2 = null;
            while (!(!z)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = IAuthTabCallbackDefault + 69;
                    int i7 = i6 % 128;
                    onWarmupCompleted = i7;
                    if (i6 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i5 |= 1;
                        int i8 = onWarmupCompleted + 5;
                        IAuthTabCallbackDefault = i8 % 128;
                        int i9 = i8 % 2;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i10 = i7 + 63;
                        IAuthTabCallbackDefault = i10 % 128;
                        int i11 = i10 % 2;
                        dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
                        i5 = i11 == 0 ? i5 | 4 : i5 | 2;
                    }
                } else {
                    z = false;
                }
            }
            strAsInterface = strAsInterface2;
            dIAuthTabCallback = dIAuthTabCallback2;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new NativeAdsDto.Reward(i, strAsInterface, dIAuthTabCallback, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m37deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto.Reward rewardDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallbackDefault + 91;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return rewardDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull NativeAdsDto.Reward reward) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(reward, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        NativeAdsDto.Reward.onNavigationEvent(reward, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 1;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (NativeAdsDto.Reward) obj);
        int i4 = onWarmupCompleted + 77;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallbackDefault + 83;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    static void onWarmupCompleted() {
        onExtraCallback = new char[]{56114, 16102, 4228, 27304};
        IAuthTabCallback = 6963028729023498253L;
    }
}
