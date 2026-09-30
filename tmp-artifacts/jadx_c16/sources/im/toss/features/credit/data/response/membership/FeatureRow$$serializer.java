package im.toss.features.credit.data.response.membership;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
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
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
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
public final /* synthetic */ class FeatureRow$$serializer implements aeu2<FeatureRow> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    public static final FeatureRow$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static long onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 53;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 59;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        onWarmupCompleted();
        FeatureRow$$serializer featureRow$$serializer = new FeatureRow$$serializer();
        INSTANCE = featureRow$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.membership.FeatureRow", featureRow$$serializer, 3);
        Object[] objArr = new Object[1];
        a(new char[]{62080, 63630, 59046, 60577, 56029}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2579, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("iconUrl", true);
        Object[] objArr2 = new Object[1];
        a(new char[]{62102, 40518, 11022, 46293, 16775, 60793}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 27846, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 79;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private FeatureRow$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            return new KSerializer[]{sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(Button$$serializer.INSTANCE)};
        }
        getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getwrigglelayout2);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(getwrigglelayout2);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(Button$$serializer.INSTANCE);
        KSerializer<?>[] kSerializerArr = new KSerializer[5];
        kSerializerArr[0] = kSerializerIAuthTabCallback;
        kSerializerArr[0] = kSerializerIAuthTabCallback2;
        kSerializerArr[2] = kSerializerIAuthTabCallback3;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final FeatureRow deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        String str2;
        Button button;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            Button button2 = (Button) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, Button$$serializer.INSTANCE, (Object) null);
            int i3 = onWarmupCompleted + 37;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 / 3;
            }
            str = str4;
            i = 7;
            str2 = str3;
            button = button2;
        } else {
            int i5 = 0;
            boolean z = true;
            String str5 = null;
            String str6 = null;
            Button button3 = null;
            while (!(!z)) {
                int i6 = IAuthTabCallback + 33;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    int i8 = onWarmupCompleted + 115;
                    IAuthTabCallback = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 3 / 2;
                    }
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str6);
                    i5 |= 1;
                } else if (iOnNavigationEvent != 1) {
                    int i10 = onWarmupCompleted + 7;
                    IAuthTabCallback = i10 % 128;
                    if (i10 % 2 == 0) {
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        button3 = (Button) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, Button$$serializer.INSTANCE, button3);
                        i5 |= 4;
                    } else {
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        button3 = (Button) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, Button$$serializer.INSTANCE, button3);
                        i5 |= 4;
                    }
                } else {
                    str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str5);
                    i5 |= 2;
                }
            }
            str = str5;
            str2 = str6;
            button = button3;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        FeatureRow featureRow = new FeatureRow(i, str2, str, button, (okycx) null);
        int i11 = IAuthTabCallback + 63;
        onWarmupCompleted = i11 % 128;
        if (i11 % 2 == 0) {
            return featureRow;
        }
        throw null;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m221deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        FeatureRow featureRowDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 45;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return featureRowDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull FeatureRow featureRow) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(featureRow, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            FeatureRow.IAuthTabCallback(featureRow, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(featureRow, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        FeatureRow.IAuthTabCallback(featureRow, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = IAuthTabCallback + 103;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (FeatureRow) obj);
        int i4 = IAuthTabCallback + 75;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 56 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = IAuthTabCallback + 95;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
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
            int i3 = $11 + 121;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 24, 19627 - Drawable.resolveOpacity(0, 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() | 5407414049857832247L | onNavigationEvent;
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), 59 - KeyEvent.getDeadChar(0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16777216), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24, Color.argb(0, 0, 0, 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (5407414049857832247L ^ onNavigationEvent);
                    Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 58, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i6 = $11 + 57;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), Gravity.getAbsoluteGravity(0, 0) + 59, Color.red(0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        String str = new String(cArr2);
        int i8 = $10 + 123;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    static void onWarmupCompleted() {
        onNavigationEvent = -3968323092090685501L;
    }
}
