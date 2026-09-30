package im.toss.facepay.validation.model.init.config.quality;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
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
import o.TimelineExternalSyntheticLambda0;
import o.aeu2;
import o.getDynamicHeight;
import o.okycx;
import o.setAnimationsLoop;
import o.setVideoListener;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class BlurConfig$$serializer implements aeu2<BlurConfig> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final BlurConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static long onNavigationEvent;
    private static int onWarmupCompleted;

    private BlurConfig$$serializer() {
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 73;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 62 / 0;
        }
        return serialDescriptor;
    }

    static {
        onNavigationEvent();
        BlurConfig$$serializer blurConfig$$serializer = new BlurConfig$$serializer();
        INSTANCE = blurConfig$$serializer;
        Object[] objArr = new Object[1];
        a(new char[]{29714, 29819, 10279, 13134, 50788, 49519, 61244, 2961, 52421, 24817, 31323, 35069, 1284, 39323, 41619, 12302, 24138, 56915, 59841, 65293, 38532, 5899, 20588, 42642, 61422, 20419, 39100, 28122, 8237, 33908, 57278, 5414, 31093, 15670, 1597, 56431, 45564, 30179, 19790, 39858, 2590, 43756, 46475, 17148, 17228, 58204, 64729, 2636, 39892, 6147, 8973, 45442, 56542, 20675, 27572, 30914, 5476, 35232, 53988, 8198, 28272, 52761, 6463, 61285, 42684, 1787, 16511}, TextUtils.indexOf((CharSequence) "", '0', 0) + 1, objArr);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop(((String) objArr[0]).intern(), blurConfig$$serializer, 2);
        Object[] objArr2 = new Object[1];
        a(new char[]{32281, 32362, 12498, 52043, 56970, 8504, 5977, 60359, 50892}, Process.myTid() >> 22, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        Object[] objArr3 = new Object[1];
        a(new char[]{12946, 13040, 11031, 'a', 50517, 28445, 56392, 42469, 35454, 25563, 18734, 9922, 17297, 39587, 37355, 40563, 6366}, 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 109;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArr = new KSerializer[4];
            kSerializerArr[0] = getDynamicHeight.onWarmupCompleted;
            kSerializerArr[1] = setVideoListener.onWarmupCompleted;
        } else {
            kSerializerArr = new KSerializer[]{getDynamicHeight.onWarmupCompleted, setVideoListener.onWarmupCompleted};
        }
        int i3 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BlurConfig deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int iOnTransact;
        double dIAuthTabCallback;
        int i;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
            dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
            i = 3;
        } else {
            double dIAuthTabCallback2 = 0.0d;
            int iOnTransact2 = 0;
            int i4 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i5 = onExtraCallbackWithResult + 35;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
                        i4 |= 2;
                        i2 = onExtraCallbackWithResult + 123;
                        IAuthTabCallback = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i6 = 4 / 4;
                        }
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
                        i4 |= 2;
                        i2 = onExtraCallbackWithResult + 123;
                        IAuthTabCallback = i2 % 128;
                        if (i2 % 2 == 0) {
                        }
                    }
                } else {
                    iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                    i4 |= 1;
                    int i7 = IAuthTabCallback + 69;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
            iOnTransact = iOnTransact2;
            dIAuthTabCallback = dIAuthTabCallback2;
            i = i4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BlurConfig(i, iOnTransact, dIAuthTabCallback, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m319deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        BlurConfig blurConfigDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return blurConfigDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BlurConfig blurConfig) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(blurConfig, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            BlurConfig.onWarmupCompleted(blurConfig, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(blurConfig, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        BlurConfig.onWarmupCompleted(blurConfig, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BlurConfig) obj);
        int i4 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 115;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 45812), TextUtils.indexOf((CharSequence) "", '0') + 85, 21234 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 14185), (ViewConfiguration.getFadingEdgeLength() >> 16) + 19, 8807 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $10 + 77;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    static void onNavigationEvent() {
        onNavigationEvent = 5095585731491304738L;
    }
}
