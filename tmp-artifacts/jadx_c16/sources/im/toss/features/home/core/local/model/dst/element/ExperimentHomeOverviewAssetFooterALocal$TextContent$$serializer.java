package im.toss.features.home.core.local.model.dst.element;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.home.core.local.model.dst.element.ExperimentHomeOverviewAssetFooterALocal;
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
public final /* synthetic */ class ExperimentHomeOverviewAssetFooterALocal$TextContent$$serializer implements aeu2<ExperimentHomeOverviewAssetFooterALocal.TextContent> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    public static final ExperimentHomeOverviewAssetFooterALocal$TextContent$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static long onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 33;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        onNavigationEvent();
        ExperimentHomeOverviewAssetFooterALocal$TextContent$$serializer experimentHomeOverviewAssetFooterALocal$TextContent$$serializer = new ExperimentHomeOverviewAssetFooterALocal$TextContent$$serializer();
        INSTANCE = experimentHomeOverviewAssetFooterALocal$TextContent$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ExperimentHomeOverviewAssetFooterALocal.TextContent", experimentHomeOverviewAssetFooterALocal$TextContent$$serializer, 2);
        Object[] objArr = new Object[1];
        a(new char[]{38216, 39798, 35098, 49093}, 3631 - (KeyEvent.getMaxKeyCode() >> 16), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("logText", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 105;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private ExperimentHomeOverviewAssetFooterALocal$TextContent$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializer, sp.IAuthTabCallback(kSerializer)};
        int i4 = IAuthTabCallback + 59;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ExperimentHomeOverviewAssetFooterALocal.TextContent deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String str;
        int i;
        int iOnNavigationEvent;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = IAuthTabCallback + 1;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            if (i4 != 0) {
                str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
                i = 4;
            } else {
                str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, (Object) null);
                i = 3;
            }
        } else {
            String strAsInterface2 = null;
            String str2 = null;
            boolean z = true;
            int i5 = 0;
            while (z) {
                int i6 = IAuthTabCallback + 95;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    int i7 = 10 / 0;
                    if (iOnNavigationEvent == -1) {
                        int i8 = IAuthTabCallback + 83;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                        z = false;
                    } else if (iOnNavigationEvent != 0) {
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i5 |= 1;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str2);
                        i5 |= 2;
                    }
                } else {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        int i82 = IAuthTabCallback + 83;
                        onWarmupCompleted = i82 % 128;
                        int i92 = i82 % 2;
                        z = false;
                    } else if (iOnNavigationEvent != 0) {
                    }
                }
            }
            strAsInterface = strAsInterface2;
            str = str2;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ExperimentHomeOverviewAssetFooterALocal.TextContent(i, strAsInterface, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m355deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ExperimentHomeOverviewAssetFooterALocal.TextContent textContent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(textContent, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ExperimentHomeOverviewAssetFooterALocal.TextContent.onNavigationEvent(textContent, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(textContent, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        ExperimentHomeOverviewAssetFooterALocal.TextContent.onNavigationEvent(textContent, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = IAuthTabCallback + 13;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ExperimentHomeOverviewAssetFooterALocal.TextContent) obj);
        int i4 = IAuthTabCallback + 69;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onWarmupCompleted + 75;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $11 + 17;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = $11 + 35;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), 24 - (ViewConfiguration.getScrollBarSize() >> 8), KeyEvent.keyCodeFromString("") + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.MeasureSpec.getSize(0) + 59, 6384 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 60, 6384 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    static void onNavigationEvent() {
        onExtraCallback = -1281305282137419765L;
    }
}
