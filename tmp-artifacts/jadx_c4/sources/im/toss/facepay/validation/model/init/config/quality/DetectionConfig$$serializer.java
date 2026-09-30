package im.toss.facepay.validation.model.init.config.quality;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.aeu2;
import o.dj3;
import o.getDynamicHeight;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class DetectionConfig$$serializer implements aeu2<DetectionConfig> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 0;
    public static final DetectionConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    private DetectionConfig$$serializer() {
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 105;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onNavigationEvent();
        DetectionConfig$$serializer detectionConfig$$serializer = new DetectionConfig$$serializer();
        INSTANCE = detectionConfig$$serializer;
        Object[] objArr = new Object[1];
        a(new char[]{61248, 62429, 54837, 47766, 40226, 24999, 17612, 10024, 2951, 60969, 62128, 54751, 47221, 40077, 32526, 17392, 9935, 2401, 60807, 61467, 54457, 47045, 39547, 32511, 16670, 9654, 2189, 60263, 53242, 53784, 46754, 39362, 31783, 16633, 8981, 1963, 60121, 52506, 53756, 46089, 39087, 31694, 24154, 8957, 1355, 59837, 52258, 44895, 46069, 38409, 31423, 23851, 8211, 1216, 59146, 52098, 44596, 45403, 38391, 30723, 23706, 16178, 612, 59105, 51463, 44438, 45106, 37701}, 7321 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop(((String) objArr[0]).intern(), detectionConfig$$serializer, 3);
        Object[] objArr2 = new Object[1];
        a(new char[]{61252, 53477, 36875, 20577, 4584, 53564, 37207, 21223, 4661, 53839}, (ViewConfiguration.getTapTimeout() >> 16) + 16301, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        Object[] objArr3 = new Object[1];
        a(new char[]{61248, 37097, 4098, 36976, 4605, 37168, 4438, 37523, 4665, 37473, 5011, 37832}, ExpandableListView.getPackedPositionGroup(0L) + 32687, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        Object[] objArr4 = new Object[1];
        a(new char[]{61274, 36915, 4532, 37168, 4776, 37408, 5015, 37652, 5252, 37915, 5627, 38261, 5865, 38504}, 32633 - View.resolveSizeAndState(0, 0, 0), objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 67;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 37 / 0;
        }
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArr = new KSerializer[3];
            kSerializerArr[0] = getDynamicHeight.onWarmupCompleted;
            dj3 dj3Var = dj3.onWarmupCompleted;
            kSerializerArr[1] = dj3Var;
            kSerializerArr[3] = dj3Var;
        } else {
            dj3 dj3Var2 = dj3.onWarmupCompleted;
            kSerializerArr = new KSerializer[]{getDynamicHeight.onWarmupCompleted, dj3Var2, dj3Var2};
        }
        int i3 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final DetectionConfig deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        float f;
        float f2;
        int i2;
        int i3;
        float fOnWarmupCompleted;
        int iOnTransact;
        float fOnWarmupCompleted2;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onExtraCallbackWithResult + 5;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 0);
                fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 4);
                i3 = 99;
            } else {
                int iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                float fOnWarmupCompleted3 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
                i3 = 7;
                fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 2);
                iOnTransact = iOnTransact2;
                fOnWarmupCompleted2 = fOnWarmupCompleted3;
            }
            i = iOnTransact;
            f = fOnWarmupCompleted2;
            f2 = fOnWarmupCompleted;
            i2 = i3;
        } else {
            float fOnWarmupCompleted4 = 0.0f;
            float fOnWarmupCompleted5 = 0.0f;
            boolean z = true;
            int iOnTransact3 = 0;
            int i6 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i7 = onNavigationEvent + 87;
                    int i8 = i7 % 128;
                    onExtraCallbackWithResult = i8;
                    int i9 = i7 % 2;
                    if (iOnNavigationEvent == 0) {
                        iOnTransact3 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                        i6 |= 1;
                    } else if (iOnNavigationEvent != 1) {
                        int i10 = i8 + 121;
                        onNavigationEvent = i10 % 128;
                        if (i10 % 2 == 0) {
                            if (iOnNavigationEvent != 5) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            fOnWarmupCompleted5 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 2);
                            i6 |= 4;
                        } else {
                            if (iOnNavigationEvent != 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            fOnWarmupCompleted5 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 2);
                            i6 |= 4;
                        }
                    } else {
                        fOnWarmupCompleted4 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
                        i6 |= 2;
                        int i11 = onExtraCallbackWithResult + 69;
                        onNavigationEvent = i11 % 128;
                        int i12 = i11 % 2;
                    }
                } else {
                    z = false;
                }
            }
            i = iOnTransact3;
            f = fOnWarmupCompleted4;
            f2 = fOnWarmupCompleted5;
            i2 = i6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DetectionConfig(i2, i, f, f2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m321deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        DetectionConfig detectionConfigDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return detectionConfigDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DetectionConfig detectionConfig) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(detectionConfig, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        DetectionConfig.onExtraCallbackWithResult(detectionConfig, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DetectionConfig) obj);
        int i4 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 95;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23, View.resolveSizeAndState(0, 0, 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), 58 - ExpandableListView.getPackedPositionChild(0L), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 27;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            try {
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 60 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i8 = $10 + 75;
                $11 = i8 % 128;
                int i9 = i8 % 2;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr2);
    }

    static void onNavigationEvent() {
        IAuthTabCallback = 2056361925603125790L;
    }
}
