package im.toss.features.home.core.local.model.dst.widget;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
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
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.aeu2;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$$serializer implements aeu2<ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    public static final ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 29;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onWarmupCompleted();
        ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$$serializer consumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$$serializer = new ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$$serializer();
        INSTANCE = consumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph", consumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$$serializer, 3);
        setanimationsloop.onWarmupCompleted("base", true);
        setanimationsloop.onWarmupCompleted("comparison", true);
        Object[] objArr = new Object[1];
        a(new int[]{-1250909989, -1206532288, -1542203167, -1597858614, 645878488, 489811261}, ';' - AndroidCharacter.getMirror('0'), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 97;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$GraphItem$$serializer consumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$GraphItem$$serializer = ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$GraphItem$$serializer.INSTANCE;
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(consumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$GraphItem$$serializer);
            KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(consumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$GraphItem$$serializer);
            KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(TextContentLocal$.serializer.INSTANCE);
            kSerializerArr = new KSerializer[4];
            kSerializerArr[1] = kSerializerIAuthTabCallback;
            kSerializerArr[1] = kSerializerIAuthTabCallback2;
            kSerializerArr[4] = kSerializerIAuthTabCallback3;
        } else {
            ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$GraphItem$$serializer consumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$GraphItem$$serializer2 = ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$GraphItem$$serializer.INSTANCE;
            kSerializerArr = new KSerializer[]{sp.IAuthTabCallback(consumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$GraphItem$$serializer2), sp.IAuthTabCallback(consumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$GraphItem$$serializer2), sp.IAuthTabCallback(TextContentLocal$.serializer.INSTANCE)};
        }
        int i3 = onExtraCallback + 91;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        TextContentLocal textContentLocal;
        ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph.GraphItem graphItem;
        ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph.GraphItem graphItem2;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$GraphItem$$serializer consumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$GraphItem$$serializer = ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$GraphItem$$serializer.INSTANCE;
            ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph.GraphItem graphItem3 = (ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph.GraphItem) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, consumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$GraphItem$$serializer, (Object) null);
            ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph.GraphItem graphItem4 = (ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph.GraphItem) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, consumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$GraphItem$$serializer, (Object) null);
            textContentLocal = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, TextContentLocal$.serializer.INSTANCE, (Object) null);
            graphItem = graphItem4;
            graphItem2 = graphItem3;
            i = 7;
        } else {
            int i3 = 0;
            boolean z = true;
            TextContentLocal textContentLocal2 = null;
            ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph.GraphItem graphItem5 = null;
            ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph.GraphItem graphItem6 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = IAuthTabCallback;
                    int i5 = i4 + 7;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        graphItem6 = (ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph.GraphItem) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$GraphItem$$serializer.INSTANCE, graphItem6);
                        i3 |= 1;
                    } else if (iOnNavigationEvent != 1) {
                        int i6 = i4 + 101;
                        int i7 = i6 % 128;
                        onExtraCallback = i7;
                        int i8 = i6 % 2;
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i9 = i7 + 99;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        textContentLocal2 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, TextContentLocal$.serializer.INSTANCE, textContentLocal2);
                        i3 |= 4;
                    } else {
                        graphItem5 = (ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph.GraphItem) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ConsumptionRecommendationBannerLocal$ConsumptionAmountGraph$Graph$GraphItem$$serializer.INSTANCE, graphItem5);
                        i3 |= 2;
                    }
                } else {
                    z = false;
                }
            }
            textContentLocal = textContentLocal2;
            graphItem = graphItem5;
            graphItem2 = graphItem6;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph(i, graphItem2, graphItem, textContentLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m481deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph graphDeserialize = deserialize(decoder);
        int i3 = IAuthTabCallback + 125;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return graphDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph graph) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(graph, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph.onExtraCallback(graph, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 15;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ConsumptionRecommendationBannerLocal.ConsumptionAmountGraph.Graph) obj);
        int i4 = IAuthTabCallback + 103;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 77;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallbackWithResult;
        long j = 0;
        int i3 = -1469660336;
        float f = 0.0f;
        if (iArr2 != null) {
            int i4 = $11 + 25;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 25;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 72 - ExpandableListView.getPackedPositionType(j), 8848 - View.MeasureSpec.makeMeasureSpec(0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i6])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 'x' - AndroidCharacter.getMirror('0'), View.getDefaultSize(0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i6++;
                }
                j = 0;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallbackWithResult;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr5[i8])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), ((Process.getThreadPriority(0) + 20) >> 6) + 72, 8849 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i8] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                i8++;
                i3 = -1469660336;
                f = 0.0f;
            }
            int i9 = $11 + 61;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            for (int i11 = 0; i11 < 16; i11++) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i11];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionGroup(0L) + 22252), 39 - (Process.myTid() >> 22), Color.alpha(0) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
            }
            int i12 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i12;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 4032), ExpandableListView.getPackedPositionGroup(0L) + 78, (ViewConfiguration.getLongPressTimeout() >> 16) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = new int[]{1682269246, 1581109972, -1278060068, 826763449, -1560877751, -1235197971, 676299872, 1819065130, -1329610338, -1797860527, 823153482, 2135137365, -1880895804, 1994254066, -330031601, -762883751, -2085373807, 1567353610};
    }
}
