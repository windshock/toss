package im.toss.features.benefit.dto;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.benefit.dto.BenefitActivationIntelligence;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.aeu2;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitActivationIntelligence$$serializer implements aeu2<BenefitActivationIntelligence> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final BenefitActivationIntelligence$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static long onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        onExtraCallback();
        BenefitActivationIntelligence$$serializer benefitActivationIntelligence$$serializer = new BenefitActivationIntelligence$$serializer();
        INSTANCE = benefitActivationIntelligence$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.benefit.dto.BenefitActivationIntelligence", benefitActivationIntelligence$$serializer, 4);
        Object[] objArr = new Object[1];
        a(new char[]{8569, 14657, 4375, 27127}, TextUtils.indexOf("", "", 0) + 6197, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("type1", true);
        setanimationsloop.onWarmupCompleted("type2", true);
        setanimationsloop.onWarmupCompleted("type3", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 71;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private BenefitActivationIntelligence$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback((KSerializer) BenefitActivationIntelligence.IAuthTabCallback()[0].getValue()), sp.IAuthTabCallback(BenefitActivationIntelligence$Type1$$serializer.INSTANCE), sp.IAuthTabCallback(BenefitActivationIntelligence$Type2$$serializer.INSTANCE), sp.IAuthTabCallback(BenefitActivationIntelligence$Type3$$serializer.INSTANCE)};
        int i4 = onExtraCallback + 91;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final BenefitActivationIntelligence deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        BenefitActivationIntelligence.Type2 type2;
        BenefitActivationIntelligence.onWarmupCompleted onwarmupcompleted;
        BenefitActivationIntelligence.Type3 type3;
        BenefitActivationIntelligence.Type1 type1;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 85;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = BenefitActivationIntelligence.IAuthTabCallback();
        boolean z = false;
        BenefitActivationIntelligence.Type2 type22 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onNavigationEvent + 63;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            BenefitActivationIntelligence.onWarmupCompleted onwarmupcompleted2 = (BenefitActivationIntelligence.onWarmupCompleted) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), (Object) null);
            BenefitActivationIntelligence.Type1 type12 = (BenefitActivationIntelligence.Type1) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, BenefitActivationIntelligence$Type1$$serializer.INSTANCE, (Object) null);
            type2 = (BenefitActivationIntelligence.Type2) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, BenefitActivationIntelligence$Type2$$serializer.INSTANCE, (Object) null);
            onwarmupcompleted = onwarmupcompleted2;
            type1 = type12;
            type3 = (BenefitActivationIntelligence.Type3) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BenefitActivationIntelligence$Type3$$serializer.INSTANCE, (Object) null);
            i = 15;
        } else {
            int i7 = 0;
            boolean z2 = true;
            BenefitActivationIntelligence.onWarmupCompleted onwarmupcompleted3 = null;
            BenefitActivationIntelligence.Type3 type32 = null;
            BenefitActivationIntelligence.Type1 type13 = null;
            while (!(!z2)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i8 = onExtraCallback;
                    int i9 = i8 + 5;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    if (iOnNavigationEvent != 0) {
                        if (iOnNavigationEvent == 1) {
                            type13 = (BenefitActivationIntelligence.Type1) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, BenefitActivationIntelligence$Type1$$serializer.INSTANCE, type13);
                            i7 |= 2;
                        } else if (iOnNavigationEvent == 2) {
                            type22 = (BenefitActivationIntelligence.Type2) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, BenefitActivationIntelligence$Type2$$serializer.INSTANCE, type22);
                            i7 |= 4;
                        } else {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i11 = i8 + 5;
                            onNavigationEvent = i11 % 128;
                            int i12 = i11 % 2;
                            type32 = (BenefitActivationIntelligence.Type3) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BenefitActivationIntelligence$Type3$$serializer.INSTANCE, type32);
                            i7 |= 8;
                        }
                        z = false;
                    } else {
                        z = false;
                        onwarmupcompleted3 = (BenefitActivationIntelligence.onWarmupCompleted) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), onwarmupcompleted3);
                        i7 |= 1;
                    }
                } else {
                    z2 = z;
                }
            }
            int i13 = onExtraCallback + 33;
            onNavigationEvent = i13 % 128;
            int i14 = i13 % 2;
            i = i7;
            type2 = type22;
            onwarmupcompleted = onwarmupcompleted3;
            type3 = type32;
            type1 = type13;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BenefitActivationIntelligence(i, onwarmupcompleted, type1, type2, type3, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m85deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BenefitActivationIntelligence benefitActivationIntelligenceDeserialize = deserialize(decoder);
        int i3 = onExtraCallback + 93;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 59 / 0;
        }
        return benefitActivationIntelligenceDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BenefitActivationIntelligence benefitActivationIntelligence) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(benefitActivationIntelligence, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        BenefitActivationIntelligence.onExtraCallback(benefitActivationIntelligence, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 1;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BenefitActivationIntelligence) obj);
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        int i5 = onNavigationEvent + 59;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallback + 121;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 87 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 107;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), Color.blue(0) + 24, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() & (onExtraCallbackWithResult ^ 5407414049857832247L);
                    try {
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 1), (ViewConfiguration.getLongPressTimeout() >> 16) + 59, 6383 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
            } else {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 23, 19627 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 59, 6383 - (ViewConfiguration.getScrollBarSize() >> 8), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i6 = $11 + 11;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') - '0'), TextUtils.lastIndexOf("", '0', 0) + 60, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = 6632857411256493114L;
    }
}
