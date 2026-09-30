package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.property.VerticalPaddingLocal;
import im.toss.features.home.core.local.model.dst.property.VerticalPaddingLocal$$serializer;
import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal;
import im.toss.features.home.core.local.model.dst.widget.TextContentLocal;
import im.toss.features.home.core.local.model.dst.widget.TextContentLocal$;
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
import o.okycx;
import o.removeNextStartHandler;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ExperimentHomeOverviewAssetFooterFLocal$$serializer implements aeu2<ExperimentHomeOverviewAssetFooterFLocal> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final ExperimentHomeOverviewAssetFooterFLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static long onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
        return serialDescriptor;
    }

    static {
        onWarmupCompleted();
        ExperimentHomeOverviewAssetFooterFLocal$$serializer experimentHomeOverviewAssetFooterFLocal$$serializer = new ExperimentHomeOverviewAssetFooterFLocal$$serializer();
        INSTANCE = experimentHomeOverviewAssetFooterFLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ExperimentHomeOverviewAssetFooterFLocal", experimentHomeOverviewAssetFooterFLocal$$serializer, 6);
        Object[] objArr = new Object[1];
        a(new char[]{9661, 3355, 29899, 24468, 34624}, 10427 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a(new char[]{9645, 16993, 59936, 4813, 47759, 8865, 19319, 62246, 7112, 33683, 11173}, TextUtils.indexOf((CharSequence) "", '0', 0) + 26574, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("descriptionIcon", true);
        setanimationsloop.onWarmupCompleted("descriptionGradient", true);
        setanimationsloop.onWarmupCompleted("handler", true);
        setanimationsloop.onWarmupCompleted("verticalPadding", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 73;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ExperimentHomeOverviewAssetFooterFLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(serializerVar), sp.IAuthTabCallback(serializerVar), sp.IAuthTabCallback(removeNextStartHandler.onWarmupCompleted), sp.IAuthTabCallback(getBgColor.IAuthTabCallback), sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback), sp.IAuthTabCallback(VerticalPaddingLocal$$serializer.INSTANCE)};
        int i4 = onWarmupCompleted + 49;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ExperimentHomeOverviewAssetFooterFLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        TextContentLocal textContentLocal;
        TextContentLocal textContentLocal2;
        ImageSourceLocal imageSourceLocal;
        Boolean bool;
        HandlerLocal handlerLocal;
        VerticalPaddingLocal verticalPaddingLocal;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            verticalPaddingLocal = null;
            handlerLocal = null;
            imageSourceLocal = null;
            textContentLocal2 = null;
            i = 0;
            textContentLocal = null;
            bool = null;
            while (z) {
                int i3 = IAuthTabCallback + 3;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        textContentLocal = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, TextContentLocal$.serializer.INSTANCE, textContentLocal);
                        i |= 1;
                        break;
                    case 1:
                        textContentLocal2 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, TextContentLocal$.serializer.INSTANCE, textContentLocal2);
                        i |= 2;
                        break;
                    case 2:
                        imageSourceLocal = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, removeNextStartHandler.onWarmupCompleted, imageSourceLocal);
                        i |= 4;
                        break;
                    case 3:
                        bool = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getBgColor.IAuthTabCallback, bool);
                        i |= 8;
                        int i4 = onWarmupCompleted + 73;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                        break;
                    case 4:
                        handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setAppxVersionInWorker.onExtraCallback, handlerLocal);
                        i |= 16;
                        break;
                    case 5:
                        verticalPaddingLocal = (VerticalPaddingLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, VerticalPaddingLocal$$serializer.INSTANCE, verticalPaddingLocal);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
        } else {
            int i6 = IAuthTabCallback + 43;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
            textContentLocal = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, serializerVar, (Object) null);
            textContentLocal2 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, serializerVar, (Object) null);
            imageSourceLocal = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, removeNextStartHandler.onWarmupCompleted, (Object) null);
            bool = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getBgColor.IAuthTabCallback, (Object) null);
            handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setAppxVersionInWorker.onExtraCallback, (Object) null);
            verticalPaddingLocal = (VerticalPaddingLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, VerticalPaddingLocal$$serializer.INSTANCE, (Object) null);
            i = 63;
        }
        VerticalPaddingLocal verticalPaddingLocal2 = verticalPaddingLocal;
        HandlerLocal handlerLocal2 = handlerLocal;
        ImageSourceLocal imageSourceLocal2 = imageSourceLocal;
        TextContentLocal textContentLocal3 = textContentLocal2;
        int i8 = i;
        TextContentLocal textContentLocal4 = textContentLocal;
        Boolean bool2 = bool;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ExperimentHomeOverviewAssetFooterFLocal(i8, textContentLocal4, textContentLocal3, imageSourceLocal2, bool2, handlerLocal2, verticalPaddingLocal2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m363deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ExperimentHomeOverviewAssetFooterFLocal experimentHomeOverviewAssetFooterFLocalDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 43;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return experimentHomeOverviewAssetFooterFLocalDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ExperimentHomeOverviewAssetFooterFLocal experimentHomeOverviewAssetFooterFLocal) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(experimentHomeOverviewAssetFooterFLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ExperimentHomeOverviewAssetFooterFLocal.IAuthTabCallback(experimentHomeOverviewAssetFooterFLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 57;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ExperimentHomeOverviewAssetFooterFLocal) obj);
        int i4 = onWarmupCompleted + 75;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 49;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 87;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 24 - View.MeasureSpec.getSize(0), 19627 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallback % 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 59 - Color.blue(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getTouchSlop() >> 8) + 24, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 19626, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (-16777157) - Color.rgb(0, 0, 0), 6383 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i6 = $11 + 95;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), 59 - Color.red(0), 6383 - View.combineMeasuredStates(0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    static void onWarmupCompleted() {
        onExtraCallback = -2672177043680026370L;
    }
}
