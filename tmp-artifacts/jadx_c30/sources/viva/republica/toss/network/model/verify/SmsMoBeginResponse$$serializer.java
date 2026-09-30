package viva.republica.toss.network.model.verify;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.oty1;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class SmsMoBeginResponse$$serializer implements aeu2<SmsMoBeginResponse> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 0;
    public static final SmsMoBeginResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 83;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 53;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onNavigationEvent();
        SmsMoBeginResponse$$serializer smsMoBeginResponse$$serializer = new SmsMoBeginResponse$$serializer();
        INSTANCE = smsMoBeginResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.verify.SmsMoBeginResponse", smsMoBeginResponse$$serializer, 4);
        Object[] objArr = new Object[1];
        a(new char[]{4815, 61446, 55123, 47762, 39367, 32512, 16961}, 58049 - Color.argb(0, 0, 0, 0), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("targetPhone", false);
        setanimationsloop.onWarmupCompleted("targetPhones", true);
        setanimationsloop.onWarmupCompleted("verifyId", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 77;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private SmsMoBeginResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallback = SmsMoBeginResponse.onExtraCallback();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, lazyArrOnExtraCallback[2].getValue(), oty1.onExtraCallback};
        int i4 = onWarmupCompleted + 5;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return m117deserialize(decoder);
        }
        m117deserialize(decoder);
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0 A[SYNTHETIC] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SmsMoBeginResponse m117deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        long jIAuthTabCallbackDefault;
        String str2;
        List list;
        int iOnNavigationEvent;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = SmsMoBeginResponse.onExtraCallback();
        String strAsInterface = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnExtraCallback[2].getValue(), (Object) null);
            i = 15;
            str = strAsInterface2;
            jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 3);
            str2 = strAsInterface3;
        } else {
            long jIAuthTabCallbackDefault2 = 0;
            String strAsInterface4 = null;
            List list2 = null;
            int i4 = 0;
            boolean z = true;
            while (z) {
                int i5 = onWarmupCompleted + 13;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    int i6 = 55 / 0;
                    if (iOnNavigationEvent != -1) {
                        if (iOnNavigationEvent != 0) {
                            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            i4 |= 1;
                            i2 = onNavigationEvent + 77;
                            onWarmupCompleted = i2 % 128;
                        } else if (iOnNavigationEvent == 1) {
                            strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                            i4 |= 2;
                        } else if (iOnNavigationEvent != 2) {
                            int i7 = onWarmupCompleted + 55;
                            onNavigationEvent = i7 % 128;
                            if (i7 % 2 == 0) {
                                if (iOnNavigationEvent != 2) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 3);
                                i4 |= 8;
                            } else {
                                if (iOnNavigationEvent != 3) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 3);
                                i4 |= 8;
                            }
                        } else {
                            list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnExtraCallback[2].getValue(), list2);
                            i4 |= 4;
                            i2 = onWarmupCompleted + 27;
                            onNavigationEvent = i2 % 128;
                        }
                        int i8 = i2 % 2;
                    } else {
                        z = false;
                    }
                } else {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent != -1) {
                        if (iOnNavigationEvent != 0) {
                        }
                        int i82 = i2 % 2;
                    } else {
                        z = false;
                    }
                }
            }
            i = i4;
            str = strAsInterface;
            jIAuthTabCallbackDefault = jIAuthTabCallbackDefault2;
            str2 = strAsInterface4;
            list = list2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new SmsMoBeginResponse(i, str, str2, list, jIAuthTabCallbackDefault, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        serialize(encoder, (SmsMoBeginResponse) obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 9;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull SmsMoBeginResponse smsMoBeginResponse) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(smsMoBeginResponse, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        SmsMoBeginResponse.IAuthTabCallback(smsMoBeginResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 73;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 3 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onNavigationEvent + 45;
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
        int i3 = $10 + 83;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = $10 + 81;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 23 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (Process.myTid() >> 22) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 60 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 6383 - View.MeasureSpec.getMode(0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), 59 - Color.argb(0, 0, 0, 0), AndroidCharacter.getMirror('0') + 6335, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    static void onNavigationEvent() {
        IAuthTabCallback = 8394759891494016917L;
    }
}
