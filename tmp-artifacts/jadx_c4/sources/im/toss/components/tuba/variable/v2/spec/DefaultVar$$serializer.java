package im.toss.components.tuba.variable.v2.spec;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.components.tuba.variable.v2.spec.DefaultVar;
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
import o.getBgColor;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class DefaultVar$$serializer implements aeu2<DefaultVar> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final DefaultVar$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static long onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 5;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        onWarmupCompleted();
        DefaultVar$$serializer defaultVar$$serializer = new DefaultVar$$serializer();
        INSTANCE = defaultVar$$serializer;
        Object[] objArr = new Object[1];
        a(new char[]{2805, 5576, 13504, 22339, 30231, 38642, 45497, 53309, 62263, 5106, 13003, 23967, 31839, 40727, 49127, 56997, 63864, 6182, 14512, 23507, 31389, 34131, 42011, 50349, 59314, 1644, 8484, 16886, 24769, 33675, 41566, 52510, 60818, 3251, 12092, 20089, 28395, 35281, 43151, 52048, 59994, 2809, 5539, 13417, 22321, 30700, 38606, 45471, 53370, 62228, 5068}, 7993 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop(((String) objArr[0]).intern(), defaultVar$$serializer, 5);
        Object[] objArr2 = new Object[1];
        a(new char[]{2807, 50986, 37187}, ExpandableListView.getPackedPositionChild(0L) + 52692, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        Object[] objArr3 = new Object[1];
        a(new char[]{2794, 14014, 29302, 48672, 64501}, (-16761789) - Color.rgb(0, 0, 0), objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), false);
        Object[] objArr4 = new Object[1];
        a(new char[]{2804, 10234, 20705, 36296, 48866, 60395, 1235, 12766, 25296, 40912}, 11527 - TextUtils.indexOf("", "", 0, 0), objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), false);
        Object[] objArr5 = new Object[1];
        a(new char[]{2801, 14994, 27196, 39935, 52069, 63725, 10421, 22562, 35274, 47472, 61166, 7811, 20009, 32718, 44880, 56545, 3231}, View.MeasureSpec.makeMeasureSpec(0, 0) + 12391, objArr5);
        setanimationsloop.onWarmupCompleted(((String) objArr5[0]).intern(), true);
        Object[] objArr6 = new Object[1];
        a(new char[]{2801, 19740, 34086, 56681, 5501, 28043, 42393, 64980, 13818, 35846, 50210, 7237, 21617, 44184, 58556, 15559, 29951}, 18400 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr6);
        setanimationsloop.onWarmupCompleted(((String) objArr6[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 57;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private DefaultVar$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            DefaultVar$VersionConstraints$$serializer defaultVar$VersionConstraints$$serializer = DefaultVar$VersionConstraints$$serializer.INSTANCE;
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(defaultVar$VersionConstraints$$serializer);
            KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(defaultVar$VersionConstraints$$serializer);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            return new KSerializer[]{getwrigglelayout, getwrigglelayout, getBgColor.IAuthTabCallback, kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2};
        }
        DefaultVar$VersionConstraints$$serializer defaultVar$VersionConstraints$$serializer2 = DefaultVar$VersionConstraints$$serializer.INSTANCE;
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(defaultVar$VersionConstraints$$serializer2);
        KSerializer<?> kSerializerIAuthTabCallback4 = sp.IAuthTabCallback(defaultVar$VersionConstraints$$serializer2);
        KSerializer<?>[] kSerializerArr = new KSerializer[5];
        getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
        kSerializerArr[0] = getwrigglelayout2;
        kSerializerArr[1] = getwrigglelayout2;
        kSerializerArr[4] = getBgColor.IAuthTabCallback;
        kSerializerArr[4] = kSerializerIAuthTabCallback3;
        kSerializerArr[4] = kSerializerIAuthTabCallback4;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final DefaultVar deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        DefaultVar.VersionConstraints versionConstraints;
        DefaultVar.VersionConstraints versionConstraints2;
        int i;
        boolean z;
        String str;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        boolean z2 = false;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onNavigationEvent + 49;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
            DefaultVar$VersionConstraints$$serializer defaultVar$VersionConstraints$$serializer = DefaultVar$VersionConstraints$$serializer.INSTANCE;
            z = zOnExtraCallbackWithResult;
            str = strAsInterface2;
            versionConstraints = (DefaultVar.VersionConstraints) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, defaultVar$VersionConstraints$$serializer, (Object) null);
            versionConstraints2 = (DefaultVar.VersionConstraints) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, defaultVar$VersionConstraints$$serializer, (Object) null);
            strAsInterface = strAsInterface3;
            i = 31;
        } else {
            boolean zOnExtraCallbackWithResult2 = false;
            int i5 = 0;
            boolean z3 = true;
            String strAsInterface4 = null;
            DefaultVar.VersionConstraints versionConstraints3 = null;
            DefaultVar.VersionConstraints versionConstraints4 = null;
            strAsInterface = null;
            while (z3) {
                int i6 = onExtraCallback + 75;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i8 = onExtraCallback;
                    int i9 = i8 + 33;
                    onNavigationEvent = i9 % 128;
                    if (i9 % 2 == 0) {
                        throw null;
                    }
                    if (iOnNavigationEvent != 0) {
                        if (iOnNavigationEvent == 1) {
                            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                            i5 |= 2;
                        } else if (iOnNavigationEvent == 2) {
                            zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
                            i5 |= 4;
                        } else if (iOnNavigationEvent != 3) {
                            int i10 = i8 + 123;
                            onNavigationEvent = i10 % 128;
                            int i11 = i10 % 2;
                            if (iOnNavigationEvent != 4) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i12 = i8 + 93;
                            onNavigationEvent = i12 % 128;
                            int i13 = i12 % 2;
                            versionConstraints4 = (DefaultVar.VersionConstraints) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, DefaultVar$VersionConstraints$$serializer.INSTANCE, versionConstraints4);
                            i5 = i13 == 0 ? i5 | 30 : i5 | 16;
                        } else {
                            versionConstraints3 = (DefaultVar.VersionConstraints) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, DefaultVar$VersionConstraints$$serializer.INSTANCE, versionConstraints3);
                            i5 |= 8;
                            int i14 = onNavigationEvent + 93;
                            onExtraCallback = i14 % 128;
                            int i15 = i14 % 2;
                        }
                        z2 = false;
                    } else {
                        z2 = false;
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i5 |= 1;
                    }
                } else {
                    z3 = z2;
                }
            }
            versionConstraints = versionConstraints3;
            versionConstraints2 = versionConstraints4;
            i = i5;
            z = zOnExtraCallbackWithResult2;
            str = strAsInterface4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DefaultVar(i, str, strAsInterface, z, versionConstraints, versionConstraints2, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m76deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DefaultVar defaultVarDeserialize = deserialize(decoder);
        int i3 = onNavigationEvent + 43;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 32 / 0;
        }
        return defaultVarDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DefaultVar defaultVar) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(defaultVar, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            DefaultVar.onWarmupCompleted(defaultVar, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(defaultVar, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        DefaultVar.onWarmupCompleted(defaultVar, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onNavigationEvent + 93;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DefaultVar) obj);
        int i4 = onNavigationEvent + 79;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 99;
        onExtraCallback = i4 % 128;
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
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 24 - TextUtils.getCapsMode("", 0, 0), 19627 - Color.blue(0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                try {
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 60 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i4 = $10 + 27;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            try {
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), 59 - TextUtils.indexOf("", ""), 6382 - TextUtils.lastIndexOf("", '0'), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i6 = $10 + 53;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 4 / 2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        String str = new String(cArr2);
        int i8 = $11 + 81;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = -8869982363028189269L;
    }
}
