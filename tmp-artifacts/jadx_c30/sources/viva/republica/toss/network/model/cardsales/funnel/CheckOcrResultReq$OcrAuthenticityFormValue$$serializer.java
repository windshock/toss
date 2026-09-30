package viva.republica.toss.network.model.cardsales.funnel;

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
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class CheckOcrResultReq$OcrAuthenticityFormValue$$serializer implements aeu2<CheckOcrResultReq$OcrAuthenticityFormValue> {
    public static final CheckOcrResultReq$OcrAuthenticityFormValue$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 85;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 7;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        CheckOcrResultReq$OcrAuthenticityFormValue$$serializer checkOcrResultReq$OcrAuthenticityFormValue$$serializer = new CheckOcrResultReq$OcrAuthenticityFormValue$$serializer();
        INSTANCE = checkOcrResultReq$OcrAuthenticityFormValue$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.cardsales.funnel.CheckOcrResultReq.OcrAuthenticityFormValue", checkOcrResultReq$OcrAuthenticityFormValue$$serializer, 2);
        setanimationsloop.onWarmupCompleted("ocrImage", false);
        setanimationsloop.onWarmupCompleted("ocrEditItems", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 89;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private CheckOcrResultReq$OcrAuthenticityFormValue$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent, CheckOcrResultReq$OcrAuthenticityFormValue.onNavigationEvent()[1].getValue()};
        int i4 = onExtraCallbackWithResult + 63;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CheckOcrResultReq$OcrAuthenticityFormValue checkOcrResultReq$OcrAuthenticityFormValueM42deserialize = m42deserialize(decoder);
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        return checkOcrResultReq$OcrAuthenticityFormValueM42deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final CheckOcrResultReq$OcrAuthenticityFormValue m42deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        List list;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 77;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            CheckOcrResultReq$OcrAuthenticityFormValue.onNavigationEvent();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = CheckOcrResultReq$OcrAuthenticityFormValue.onNavigationEvent();
        if (ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            strAsInterface = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 0);
            list = (List) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnNavigationEvent[1].getValue(), (Object) null);
            i = 3;
        } else {
            int i4 = onExtraCallback + 67;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            String strAsInterface2 = null;
            List list2 = null;
            int i6 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i7 = onExtraCallbackWithResult + 53;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        strAsInterface2 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 0);
                        i6 |= 1;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        list2 = (List) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnNavigationEvent[1].getValue(), list2);
                        i6 |= 2;
                    }
                } else {
                    z = false;
                }
            }
            strAsInterface = strAsInterface2;
            list = list2;
            i = i6;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new CheckOcrResultReq$OcrAuthenticityFormValue(i, strAsInterface, list, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CheckOcrResultReq$OcrAuthenticityFormValue) obj);
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CheckOcrResultReq$OcrAuthenticityFormValue checkOcrResultReq$OcrAuthenticityFormValue) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(checkOcrResultReq$OcrAuthenticityFormValue, BuildConfig.FLAVOR);
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CheckOcrResultReq$OcrAuthenticityFormValue.onExtraCallback(checkOcrResultReq$OcrAuthenticityFormValue, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(checkOcrResultReq$OcrAuthenticityFormValue, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CheckOcrResultReq$OcrAuthenticityFormValue.onExtraCallback(checkOcrResultReq$OcrAuthenticityFormValue, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onExtraCallback + 19;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 31 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
