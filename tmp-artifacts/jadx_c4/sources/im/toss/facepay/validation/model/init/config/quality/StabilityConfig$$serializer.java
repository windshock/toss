package im.toss.facepay.validation.model.init.config.quality;

import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
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
import o.TrackGroupExternalSyntheticLambda0;
import o.aeu2;
import o.getDynamicHeight;
import o.okycx;
import o.setAnimationsLoop;
import o.setVideoListener;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class StabilityConfig$$serializer implements aeu2<StabilityConfig> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    public static final StabilityConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static char[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    private StabilityConfig$$serializer() {
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 1;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onNavigationEvent();
        StabilityConfig$$serializer stabilityConfig$$serializer = new StabilityConfig$$serializer();
        INSTANCE = stabilityConfig$$serializer;
        Object[] objArr = new Object[1];
        a(new int[]{0, 68, 90, 27}, false, new byte[]{0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1}, objArr);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop(((String) objArr[0]).intern(), stabilityConfig$$serializer, 5);
        Object[] objArr2 = new Object[1];
        a(new int[]{68, 26, 0, 9}, false, new byte[]{0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        Object[] objArr3 = new Object[1];
        a(new int[]{94, 22, 0, 9}, true, new byte[]{1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1}, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        Object[] objArr4 = new Object[1];
        a(new int[]{116, 22, 28, 0}, false, new byte[]{0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0}, objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), true);
        Object[] objArr5 = new Object[1];
        a(new int[]{138, 11, 31, 9}, true, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1}, objArr5);
        setanimationsloop.onWarmupCompleted(((String) objArr5[0]).intern(), true);
        Object[] objArr6 = new Object[1];
        a(new int[]{149, 16, 99, 0}, false, new byte[]{1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0}, objArr6);
        setanimationsloop.onWarmupCompleted(((String) objArr6[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 109;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = setVideoListener.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), kSerializer, getDynamicHeight.onWarmupCompleted};
        int i4 = onNavigationEvent + 23;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final StabilityConfig deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Double d;
        double dIAuthTabCallback;
        int iOnTransact;
        int i;
        Double d2;
        Double d3;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 37;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
            Double d4 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, setvideolistener, (Object) null);
            Double d5 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, setvideolistener, (Object) null);
            d = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, setvideolistener, (Object) null);
            dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 3);
            iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 4);
            i = 31;
            d2 = d4;
            d3 = d5;
        } else {
            double dIAuthTabCallback2 = 0.0d;
            Double d6 = null;
            Double d7 = null;
            Double d8 = null;
            int iOnTransact2 = 0;
            int i5 = 0;
            int i6 = 1;
            while (i6 == i4) {
                int i7 = IAuthTabCallback + 53;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    i6 = 0;
                    i4 = i4;
                } else if (iOnNavigationEvent == 0) {
                    d7 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, setVideoListener.onWarmupCompleted, d7);
                    i5 |= 1;
                    i4 = i4;
                } else if (iOnNavigationEvent != i4) {
                    int i8 = onNavigationEvent + 101;
                    IAuthTabCallback = i8 % 128;
                    if (i8 % 2 != 0 ? iOnNavigationEvent == 2 : iOnNavigationEvent == 2) {
                        d6 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, setVideoListener.onWarmupCompleted, d6);
                        i5 |= 4;
                    } else if (iOnNavigationEvent == 3) {
                        dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 3);
                        i5 |= 8;
                    } else {
                        if (iOnNavigationEvent != 4) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 4);
                        i5 |= 16;
                    }
                    i4 = 1;
                } else {
                    d8 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, setVideoListener.onWarmupCompleted, d8);
                    i5 |= 2;
                    i4 = 1;
                }
            }
            d = d6;
            dIAuthTabCallback = dIAuthTabCallback2;
            iOnTransact = iOnTransact2;
            i = i5;
            d2 = d7;
            d3 = d8;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new StabilityConfig(i, d2, d3, d, dIAuthTabCallback, iOnTransact, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m325deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        StabilityConfig stabilityConfigDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        return stabilityConfigDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull StabilityConfig stabilityConfig) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(stabilityConfig, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            StabilityConfig.IAuthTabCallback(stabilityConfig, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(stabilityConfig, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        StabilityConfig.IAuthTabCallback(stabilityConfig, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (StabilityConfig) obj);
        if (i3 == 0) {
            int i4 = 76 / 0;
        }
        int i5 = IAuthTabCallback + 79;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = onExtraCallbackWithResult;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35282 - MotionEvent.axisFromString("")), (KeyEvent.getMaxKeyCode() >> 16) + 35, (ViewConfiguration.getTouchSlop() >> 8) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    int i7 = $11 + 17;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i9 = $11 + 105;
                $10 = i9 % 128;
                if (i9 % 2 == 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 0) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 28 - ((byte) KeyEvent.getModifierMetaStateMask()), 17657 - (ViewConfiguration.getLongPressTimeout() >> 16), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 10935), 65 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 16718 - (ViewConfiguration.getScrollBarSize() >> 8), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49466 - Process.getGidForName("")), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 69, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i12 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i12, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i12);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i13 = $11 + 111;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = new char[]{27182, 27279, 27276, 27370, 27367, 27267, 27275, 27278, 27274, 27270, 27294, 27363, 27348, 27379, 27274, 27381, 27377, 27274, 27274, 27270, 27294, 27382, 27389, 27270, 27274, 27279, 27276, 27276, 27275, 27369, 27365, 27269, 27269, 27267, 27364, 27370, 27379, 27378, 27376, 27274, 27276, 27273, 27363, 27362, 27275, 27278, 27274, 27278, 27378, 27274, 27270, 27272, 27270, 27366, 27369, 27270, 27277, 27376, 27276, 27369, 27371, 27275, 27275, 27270, 27365, 27372, 27277, 27270, 27236, 27152, 27171, 27173, 27170, 27171, 27173, 27171, 27174, 27172, 27169, 27199, 27168, 27168, 27168, 27170, 27168, 27182, 27181, 27172, 27183, 27179, 27172, 27172, 27168, 27192, 27258, 27179, 27183, 27172, 27181, 27154, 27169, 27199, 27168, 27173, 27174, 27171, 27173, 27171, 27170, 27173, 27171, 27152, 27176, 27192, 27168, 27172, 27144, 27333, 27331, 27334, 27190, 27185, 27336, 27187, 27343, 27336, 27336, 27332, 27356, 27340, 27188, 27335, 27337, 27334, 27335, 27337, 27335, 27338, 27146, 27328, 27328, 27331, 27331, 27331, 27329, 27334, 27333, 27355, 27355, 27180, 27264, 27294, 27271, 27270, 27264, 27278, 27376, 27268, 27273, 27271, 27385, 27378, 27291, 27290, 27290};
    }
}
