package im.toss.facepay.validation.model.init.config.service;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
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
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class OtaConfig$$serializer implements aeu2<OtaConfig> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 0;
    public static final OtaConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    private OtaConfig$$serializer() {
    }

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            serialDescriptor = descriptor;
            int i4 = 14 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i3 + 85;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onNavigationEvent();
        OtaConfig$$serializer otaConfig$$serializer = new OtaConfig$$serializer();
        INSTANCE = otaConfig$$serializer;
        Object[] objArr = new Object[1];
        a(new char[]{11500, 31616, 11397, 24841, 40505, 44836, 43663, 7724, 48083, 1751, 898, 59334, 554, 28565, 39714, 20317, 59756, 53285, 61672, 55398, 29146, 14581, 18829, 41457, 55320, 41349, 41285, 2369, 42851, 2650, 13999, 37397, 4019, 29408, 36788, 31716, 38466, 56253, 59215, 50353, 32072, 19466, 31762, 44039, 50594, 46354, 54696, 13791, 44210, 7607, 11636, 40634, 15194, 34429, 33282, 26237, 33746, 61227, 7109, 53193, 27343, 22491, 29551, 22686, 61749, 47203}, (Process.getThreadPriority(0) + 20) >> 6, objArr);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop(((String) objArr[0]).intern(), otaConfig$$serializer, 1);
        Object[] objArr2 = new Object[1];
        a(new char[]{10251, 4984, 10363, 26495, 63181, 61647, 44212, 16856, 48954, 28219, 1506, 47181, 1738, 1889, 40274, 4256}, ImageFormat.getBitsPerPixel(0) + 1, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 43;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 24 / 0;
        }
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {OtaConfig.onExtraCallback()[0]};
        int i4 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final OtaConfig deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Map map;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        jp[] jpVarArrOnExtraCallback = OtaConfig.onExtraCallback();
        int i2 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            map = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, jpVarArrOnExtraCallback[0], (Object) null);
        } else {
            Map map2 = null;
            boolean z = true;
            int i3 = 0;
            while (z) {
                int i4 = onExtraCallbackWithResult + 13;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else {
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    map2 = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, jpVarArrOnExtraCallback[0], map2);
                    i3 = 1;
                }
            }
            map = map2;
            i2 = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        OtaConfig otaConfig = new OtaConfig(i2, map, (okycx) null);
        int i6 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return otaConfig;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m332deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            throw null;
        }
        OtaConfig otaConfigDeserialize = deserialize(decoder);
        int i3 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return otaConfigDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull OtaConfig otaConfig) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(otaConfig, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            OtaConfig.onWarmupCompleted(otaConfig, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(otaConfig, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        OtaConfig.onWarmupCompleted(otaConfig, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (OtaConfig) obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 105;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - ExpandableListView.getPackedPositionGroup(0L)), 85 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 14186), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 19, 8808 - (Process.myPid() >> 22), 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $10 + 1;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    static void onNavigationEvent() {
        IAuthTabCallback = -8235627784610013480L;
    }
}
