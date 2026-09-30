package im.toss.features.home.core.local.model.dst.widget;

import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
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
import o.DefaultGainProviderExternalSyntheticLambda1;
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
public final /* synthetic */ class ConsumptionRecommendationBannerLocal$MonthlyExpense$$serializer implements aeu2<ConsumptionRecommendationBannerLocal.MonthlyExpense> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    public static final ConsumptionRecommendationBannerLocal$MonthlyExpense$$serializer INSTANCE;
    private static int asInterface = 0;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 35;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return serialDescriptor;
        }
        obj.hashCode();
        throw null;
    }

    static {
        onWarmupCompleted();
        ConsumptionRecommendationBannerLocal$MonthlyExpense$$serializer consumptionRecommendationBannerLocal$MonthlyExpense$$serializer = new ConsumptionRecommendationBannerLocal$MonthlyExpense$$serializer();
        INSTANCE = consumptionRecommendationBannerLocal$MonthlyExpense$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.ConsumptionRecommendationBannerLocal.MonthlyExpense", consumptionRecommendationBannerLocal$MonthlyExpense$$serializer, 6);
        setanimationsloop.onWarmupCompleted("id", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("impressionEventLog", false);
        Object[] objArr = new Object[1];
        a(new char[]{47285, 14653, 47784, 59794, 36445, 23410}, TextUtils.indexOf("", "", 0) + 5, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("row1", false);
        setanimationsloop.onWarmupCompleted("row2", false);
        descriptor = setanimationsloop;
        int i = onTransact + 61;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 64 / 0;
        }
    }

    private ConsumptionRecommendationBannerLocal$MonthlyExpense$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(ImpressionEventLogLocal$.serializer.INSTANCE);
        KSerializer<?> kSerializer = ConsumptionRecommendationBannerLocal$MonthlyExpense$Row$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent, setAppxVersionInWorker.onExtraCallback, kSerializerIAuthTabCallback, TextContentLocal$.serializer.INSTANCE, kSerializer, sp.IAuthTabCallback(kSerializer)};
        int i4 = asInterface + 1;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ConsumptionRecommendationBannerLocal.MonthlyExpense deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        ConsumptionRecommendationBannerLocal.MonthlyExpense.Row row;
        int i;
        String str;
        ConsumptionRecommendationBannerLocal.MonthlyExpense.Row row2;
        ImpressionEventLogLocal impressionEventLogLocal;
        TextContentLocal textContentLocal;
        HandlerLocal handlerLocal;
        char c;
        boolean z;
        char c2;
        int i2 = 2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        TextContentLocal textContentLocal2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = asInterface + 13;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            HandlerLocal handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, setAppxVersionInWorker.onExtraCallback, (Object) null);
            ImpressionEventLogLocal impressionEventLogLocal2 = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ImpressionEventLogLocal$.serializer.INSTANCE, (Object) null);
            TextContentLocal textContentLocal3 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, TextContentLocal$.serializer.INSTANCE, (Object) null);
            ConsumptionRecommendationBannerLocal$MonthlyExpense$Row$$serializer consumptionRecommendationBannerLocal$MonthlyExpense$Row$$serializer = ConsumptionRecommendationBannerLocal$MonthlyExpense$Row$$serializer.INSTANCE;
            ConsumptionRecommendationBannerLocal.MonthlyExpense.Row row3 = (ConsumptionRecommendationBannerLocal.MonthlyExpense.Row) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, consumptionRecommendationBannerLocal$MonthlyExpense$Row$$serializer, (Object) null);
            impressionEventLogLocal = impressionEventLogLocal2;
            row = (ConsumptionRecommendationBannerLocal.MonthlyExpense.Row) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, consumptionRecommendationBannerLocal$MonthlyExpense$Row$$serializer, (Object) null);
            textContentLocal = textContentLocal3;
            row2 = row3;
            handlerLocal = handlerLocal2;
            i = 63;
            str = strAsInterface;
        } else {
            boolean z2 = true;
            int i6 = 0;
            ConsumptionRecommendationBannerLocal.MonthlyExpense.Row row4 = null;
            ImpressionEventLogLocal impressionEventLogLocal3 = null;
            String strAsInterface2 = null;
            row = null;
            HandlerLocal handlerLocal3 = null;
            while (z2) {
                int i7 = IAuthTabCallbackDefault + 69;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (i8 != 0) {
                    int i9 = 99 / 0;
                    switch (iOnNavigationEvent) {
                        case -1:
                            z = true;
                            z2 = false;
                            i2 = 2;
                            break;
                        case 0:
                            z = true;
                            c2 = 3;
                            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            i6 |= 1;
                            i2 = 2;
                            break;
                        case 1:
                            c2 = 3;
                            z = true;
                            handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, setAppxVersionInWorker.onExtraCallback, handlerLocal3);
                            i6 |= 2;
                            i2 = 2;
                            break;
                        case 2:
                            c = 3;
                            impressionEventLogLocal3 = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2, ImpressionEventLogLocal$.serializer.INSTANCE, impressionEventLogLocal3);
                            i6 |= 4;
                            break;
                        case 3:
                            c = 3;
                            textContentLocal2 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, TextContentLocal$.serializer.INSTANCE, textContentLocal2);
                            i6 |= 8;
                            break;
                        case 4:
                            row4 = (ConsumptionRecommendationBannerLocal.MonthlyExpense.Row) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, ConsumptionRecommendationBannerLocal$MonthlyExpense$Row$$serializer.INSTANCE, row4);
                            i6 |= 16;
                            int i10 = IAuthTabCallbackDefault + 51;
                            asInterface = i10 % 128;
                            int i11 = i10 % i2;
                            break;
                        case 5:
                            row = (ConsumptionRecommendationBannerLocal.MonthlyExpense.Row) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ConsumptionRecommendationBannerLocal$MonthlyExpense$Row$$serializer.INSTANCE, row);
                            i6 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                } else {
                    switch (iOnNavigationEvent) {
                        case -1:
                            z = true;
                            z2 = false;
                            i2 = 2;
                            break;
                        case 0:
                            z = true;
                            c2 = 3;
                            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            i6 |= 1;
                            i2 = 2;
                            break;
                        case 1:
                            c2 = 3;
                            z = true;
                            handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, setAppxVersionInWorker.onExtraCallback, handlerLocal3);
                            i6 |= 2;
                            i2 = 2;
                            break;
                        case 2:
                            c = 3;
                            impressionEventLogLocal3 = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2, ImpressionEventLogLocal$.serializer.INSTANCE, impressionEventLogLocal3);
                            i6 |= 4;
                            break;
                        case 3:
                            c = 3;
                            textContentLocal2 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, TextContentLocal$.serializer.INSTANCE, textContentLocal2);
                            i6 |= 8;
                            break;
                        case 4:
                            row4 = (ConsumptionRecommendationBannerLocal.MonthlyExpense.Row) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, ConsumptionRecommendationBannerLocal$MonthlyExpense$Row$$serializer.INSTANCE, row4);
                            i6 |= 16;
                            int i102 = IAuthTabCallbackDefault + 51;
                            asInterface = i102 % 128;
                            int i112 = i102 % i2;
                            break;
                        case 5:
                            row = (ConsumptionRecommendationBannerLocal.MonthlyExpense.Row) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ConsumptionRecommendationBannerLocal$MonthlyExpense$Row$$serializer.INSTANCE, row);
                            i6 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                }
            }
            i = i6;
            str = strAsInterface2;
            row2 = row4;
            impressionEventLogLocal = impressionEventLogLocal3;
            textContentLocal = textContentLocal2;
            handlerLocal = handlerLocal3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ConsumptionRecommendationBannerLocal.MonthlyExpense(i, str, handlerLocal, impressionEventLogLocal, textContentLocal, row2, row, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m486deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConsumptionRecommendationBannerLocal.MonthlyExpense monthlyExpenseDeserialize = deserialize(decoder);
        int i3 = IAuthTabCallbackDefault + 83;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 88 / 0;
        }
        return monthlyExpenseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ConsumptionRecommendationBannerLocal.MonthlyExpense monthlyExpense) {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(monthlyExpense, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ConsumptionRecommendationBannerLocal.MonthlyExpense.onExtraCallbackWithResult(monthlyExpense, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(monthlyExpense, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        ConsumptionRecommendationBannerLocal.MonthlyExpense.onExtraCallbackWithResult(monthlyExpense, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ConsumptionRecommendationBannerLocal.MonthlyExpense) obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = asInterface + 11;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        CharSequence charSequence;
        int i4 = 2;
        int i5 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i6 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i7 = $11 + 107;
        $10 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 5 % 5;
        }
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i9 = $11 + 33;
            $10 = i9 % 128;
            int i10 = 58224;
            if (i9 % i4 != 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[i6] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                i2 = 1;
            } else {
                cArr3[i6] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = i6;
            }
            while (i2 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i6];
                int i11 = (c2 + i10) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i12 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onNavigationEvent);
                    objArr2[i4] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[i6] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(i6, i6);
                        charSequence = "";
                        int iLastIndexOf = 9 - TextUtils.lastIndexOf(charSequence, '0', i6);
                        int iMyTid = (Process.myTid() >> 22) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i6] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[i4] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cMakeMeasureSpec, iLastIndexOf, iMyTid, -787580090, false, "C", clsArr);
                    } else {
                        charSequence = "";
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda12 = defaultGainProviderExternalSyntheticLambda1;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i6]), Integer.valueOf((cCharValue + i10) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(charSequence), 10 - (ViewConfiguration.getTouchSlop() >> 8), 12434 - (ViewConfiguration.getWindowTouchSlop() >> 8), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i10 -= 40503;
                    i2++;
                    defaultGainProviderExternalSyntheticLambda1 = defaultGainProviderExternalSyntheticLambda12;
                    i4 = 2;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda13 = defaultGainProviderExternalSyntheticLambda1;
            cArr2[defaultGainProviderExternalSyntheticLambda13.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda13.onNavigationEvent + 1] = cArr3[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda13, defaultGainProviderExternalSyntheticLambda13};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                i3 = 2;
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 16014), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, 19900 - TextUtils.lastIndexOf("", '0', 0), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            } else {
                i3 = 2;
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            defaultGainProviderExternalSyntheticLambda1 = defaultGainProviderExternalSyntheticLambda13;
            i4 = i3;
            i6 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onWarmupCompleted() {
        onExtraCallback = (char) 20456;
        onWarmupCompleted = (char) 40298;
        onExtraCallbackWithResult = (char) 21486;
        onNavigationEvent = (char) 23319;
    }
}
