package im.toss.features.home.core.local.model.dst.widget;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.eventlog.ImpressionEventLogLocal;
import im.toss.features.home.core.local.model.dst.eventlog.ImpressionEventLogLocal$;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.widget.ConsumptionRecommendationBannerLocal;
import im.toss.features.home.core.local.model.dst.widget.TextContentLocal$;
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
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$$serializer implements aeu2<ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static char[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 9;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 103;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onExtraCallbackWithResult();
        ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$$serializer consumptionRecommendationBannerLocal$ConsumptionAmountGraph$$serializer = new ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$$serializer();
        INSTANCE = consumptionRecommendationBannerLocal$ConsumptionAmountGraph$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph", consumptionRecommendationBannerLocal$ConsumptionAmountGraph$$serializer, 7);
        setanimationsloop.onWarmupCompleted("id", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("impressionEventLog", false);
        setanimationsloop.onWarmupCompleted("graph", false);
        setanimationsloop.onWarmupCompleted("amount", false);
        Object[] objArr = new Object[1];
        a(new int[]{0, 11, 147, 9}, false, new byte[]{0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("descriptionHandler", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 15;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(ImpressionEventLogLocal$.serializer.INSTANCE);
        setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent, setappxversioninworker, kSerializerIAuthTabCallback, ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$$serializer.INSTANCE, ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$Amount$$serializer.INSTANCE, TextContentLocal$.serializer.INSTANCE, setappxversioninworker};
        int i4 = onWarmupCompleted + 57;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        HandlerLocal handlerLocal;
        ImpressionEventLogLocal impressionEventLogLocal;
        ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph graph;
        HandlerLocal handlerLocal2;
        int i;
        ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Amount amount;
        TextContentLocal textContentLocal;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i3 = 6;
        ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Amount amount2 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            TextContentLocal textContentLocal2 = null;
            handlerLocal2 = null;
            graph = null;
            impressionEventLogLocal = null;
            handlerLocal = null;
            strAsInterface = null;
            i = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, setAppxVersionInWorker.onExtraCallback, handlerLocal);
                        i |= 2;
                        break;
                    case 2:
                        impressionEventLogLocal = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ImpressionEventLogLocal$.serializer.INSTANCE, impressionEventLogLocal);
                        i |= 4;
                        break;
                    case 3:
                        graph = (ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$$serializer.INSTANCE, graph);
                        i |= 8;
                        break;
                    case 4:
                        amount2 = (ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Amount) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$Amount$$serializer.INSTANCE, amount2);
                        i |= 16;
                        break;
                    case 5:
                        textContentLocal2 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, TextContentLocal$.serializer.INSTANCE, textContentLocal2);
                        i |= 32;
                        break;
                    case 6:
                        handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i3, setAppxVersionInWorker.onExtraCallback, handlerLocal2);
                        i |= 64;
                        int i4 = onNavigationEvent + 41;
                        onWarmupCompleted = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = 5 / 3;
                            break;
                        }
                        break;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
                i3 = 6;
            }
            textContentLocal = textContentLocal2;
            amount = amount2;
        } else {
            int i6 = onWarmupCompleted + 89;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
            handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, setappxversioninworker, (Object) null);
            impressionEventLogLocal = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ImpressionEventLogLocal$.serializer.INSTANCE, (Object) null);
            graph = (ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$$serializer.INSTANCE, (Object) null);
            ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Amount amount3 = (ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Amount) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$Amount$$serializer.INSTANCE, (Object) null);
            TextContentLocal textContentLocal3 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, TextContentLocal$.serializer.INSTANCE, (Object) null);
            handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, setappxversioninworker, (Object) null);
            i = 127;
            amount = amount3;
            textContentLocal = textContentLocal3;
        }
        HandlerLocal handlerLocal3 = handlerLocal2;
        ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph graph2 = graph;
        ImpressionEventLogLocal impressionEventLogLocal2 = impressionEventLogLocal;
        HandlerLocal handlerLocal4 = handlerLocal;
        String str = strAsInterface;
        int i8 = i;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph(i8, str, handlerLocal4, impressionEventLogLocal2, graph2, amount, textContentLocal, handlerLocal3, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m479deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph consumptionAmountGraphDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 119;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return consumptionAmountGraphDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph consumptionAmountGraph) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(consumptionAmountGraph, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.onNavigationEvent(consumptionAmountGraph, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 119;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph) obj);
        int i4 = onWarmupCompleted + 57;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 55;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = onExtraCallbackWithResult;
        if (cArr != null) {
            int i7 = $11 + 119;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 53;
                $11 = i10 % 128;
                if (i10 % i == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16741933) - Color.rgb(0, 0, 0)), 36 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 14239 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i9 >>>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i9])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 35235), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 36, TextUtils.indexOf("", "", 0, 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i9++;
                }
                i = 2;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10935), 65 - KeyEvent.normalizeMetaState(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16719, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), TextUtils.getOffsetBefore("", 0) + 29, View.resolveSize(0, 0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 49419), TextUtils.lastIndexOf("", '0') + 71, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i13 = $11 + 99;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i15 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i15, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i15);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i16 = $11 + 113;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = new char[]{27341, 27312, 27315, 27470, 27313, 27467, 27471, 27313, 27471, 27314, 27321};
    }
}
