package im.toss.features.home.core.local.model.dst.widget;

import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal;
import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal$;
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
import o.TimelineExternalSyntheticLambda1;
import o.aeu2;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionRecommendationBannerLocal$HorizontalBarGraph$BarGraph$$serializer implements aeu2<ConsumptionRecommendationBannerLocal.HorizontalBarGraph.BarGraph> {
    private static char[] IAuthTabCallback;
    public static final ConsumptionRecommendationBannerLocal$HorizontalBarGraph$BarGraph$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static long onExtraCallback;
    private static int onNavigationEvent;
    private static final byte[] $$a = {15, 58, -59};
    private static final int $$b = 132;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallbackWithResult = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, byte b2) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = b + 3;
        int i5 = 1 - (i * 4);
        int i6 = 97 - (b2 * 4);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            i6 += i7;
            i2 = i3;
            i4++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i4];
            i6 += i7;
            i2 = i3;
            i4++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i4++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 71;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $11 + 1;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i6 = $10 + 61;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i + i8])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59696 - TextUtils.indexOf((CharSequence) "", '0', 0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 17, 10973 - KeyEvent.keyCodeFromString(""), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46133 - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31, 20220 - (ViewConfiguration.getTapTimeout() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i8] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) 0;
                            byte b2 = (byte) (b - 1);
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.getOffsetBefore("", 0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 44, 1494 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1657859959, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
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
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            try {
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (KeyEvent.getMaxKeyCode() >> 16)), ImageFormat.getBitsPerPixel(0) + 45, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1494, -1657859959, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr);
    }

    static {
        onNavigationEvent = 0;
        onExtraCallbackWithResult();
        ConsumptionRecommendationBannerLocal$HorizontalBarGraph$BarGraph$$serializer consumptionRecommendationBannerLocal$HorizontalBarGraph$BarGraph$$serializer = new ConsumptionRecommendationBannerLocal$HorizontalBarGraph$BarGraph$$serializer();
        INSTANCE = consumptionRecommendationBannerLocal$HorizontalBarGraph$BarGraph$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.ConsumptionRecommendationBannerLocal.HorizontalBarGraph.BarGraph", consumptionRecommendationBannerLocal$HorizontalBarGraph$BarGraph$$serializer, 3);
        Object[] objArr = new Object[1];
        a(TextUtils.lastIndexOf("", '0', 0) + 1, TextUtils.lastIndexOf("", '0', 0) + 6, (char) (13430 - (ViewConfiguration.getTouchSlop() >> 8)), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("amount", false);
        setanimationsloop.onWarmupCompleted("amountColor", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 3;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private ConsumptionRecommendationBannerLocal$HorizontalBarGraph$BarGraph$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {TextContentLocal$.serializer.INSTANCE, oty1.onExtraCallback, ColorAttributeLocal$.serializer.INSTANCE};
        int i4 = onWarmupCompleted + 51;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ConsumptionRecommendationBannerLocal.HorizontalBarGraph.BarGraph deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        ColorAttributeLocal colorAttributeLocal;
        TextContentLocal textContentLocal;
        long j;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 121;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        ColorAttributeLocal colorAttributeLocal2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = IAuthTabCallbackStub + 51;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            TextContentLocal textContentLocal2 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, TextContentLocal$.serializer.INSTANCE, (Object) null);
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
            colorAttributeLocal = (ColorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, ColorAttributeLocal$.serializer.INSTANCE, (Object) null);
            textContentLocal = textContentLocal2;
            i = 7;
            j = jIAuthTabCallbackDefault;
        } else {
            int i7 = 0;
            boolean z = true;
            long jIAuthTabCallbackDefault2 = 0;
            TextContentLocal textContentLocal3 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i8 = onWarmupCompleted + 87;
                    int i9 = i8 % 128;
                    IAuthTabCallbackStub = i9;
                    int i10 = i8 % 2;
                    if (iOnNavigationEvent != 0) {
                        int i11 = i9 + 119;
                        onWarmupCompleted = i11 % 128;
                        if (i11 % 2 != 0) {
                            if (iOnNavigationEvent == 0) {
                                jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
                                i7 |= 2;
                            }
                            if (iOnNavigationEvent == 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i12 = i9 + 25;
                            onWarmupCompleted = i12 % 128;
                            if (i12 % 2 != 0) {
                                colorAttributeLocal2 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal2);
                                i7 |= 2;
                            } else {
                                colorAttributeLocal2 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal2);
                                i7 |= 4;
                            }
                        } else {
                            if (iOnNavigationEvent == 1) {
                                jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
                                i7 |= 2;
                            }
                            if (iOnNavigationEvent == 2) {
                            }
                        }
                    } else {
                        textContentLocal3 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, TextContentLocal$.serializer.INSTANCE, textContentLocal3);
                        i7 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            i = i7;
            colorAttributeLocal = colorAttributeLocal2;
            textContentLocal = textContentLocal3;
            j = jIAuthTabCallbackDefault2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ConsumptionRecommendationBannerLocal.HorizontalBarGraph.BarGraph(i, textContentLocal, j, colorAttributeLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m484deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ConsumptionRecommendationBannerLocal.HorizontalBarGraph.BarGraph barGraphDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallbackStub + 63;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return barGraphDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ConsumptionRecommendationBannerLocal.HorizontalBarGraph.BarGraph barGraph) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(barGraph, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ConsumptionRecommendationBannerLocal.HorizontalBarGraph.BarGraph.onExtraCallbackWithResult(barGraph, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallbackStub + 43;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ConsumptionRecommendationBannerLocal.HorizontalBarGraph.BarGraph) obj);
        if (i3 != 0) {
            int i4 = 71 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = new char[]{55766, 54530, 49220, 65429, 60131};
        onExtraCallback = -1415852619157872355L;
    }
}
