package im.toss.features.credit.data.response;

import im.toss.features.credit.data.response.ScoreRaisePackageHomeResponse;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ScoreRaisePackageHomeResponse$FaqSection$$serializer implements aeu2<ScoreRaisePackageHomeResponse.FaqSection> {
    private static int IAuthTabCallback = 0;
    public static final ScoreRaisePackageHomeResponse$FaqSection$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 1;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        ScoreRaisePackageHomeResponse$FaqSection$$serializer scoreRaisePackageHomeResponse$FaqSection$$serializer = new ScoreRaisePackageHomeResponse$FaqSection$$serializer();
        INSTANCE = scoreRaisePackageHomeResponse$FaqSection$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.ScoreRaisePackageHomeResponse.FaqSection", scoreRaisePackageHomeResponse$FaqSection$$serializer, 1);
        setanimationsloop.onWarmupCompleted("faq", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 75;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private ScoreRaisePackageHomeResponse$FaqSection$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArr = new KSerializer[1];
            kSerializerArr[1] = sp.IAuthTabCallback((KSerializer) ScoreRaisePackageHomeResponse.FaqSection.onExtraCallbackWithResult()[0].getValue());
        } else {
            kSerializerArr = new KSerializer[]{sp.IAuthTabCallback((KSerializer) ScoreRaisePackageHomeResponse.FaqSection.onExtraCallbackWithResult()[0].getValue())};
        }
        int i3 = IAuthTabCallback + 59;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ScoreRaisePackageHomeResponse.FaqSection deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrOnExtraCallbackWithResult;
        List list;
        boolean z;
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 87;
        IAuthTabCallback = i3 % 128;
        int i4 = 1;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnExtraCallbackWithResult = ScoreRaisePackageHomeResponse.FaqSection.onExtraCallbackWithResult();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                i4 = 0;
                list = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), (Object) null);
                i = i4;
            }
            list = null;
            z = true;
            i = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else {
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i5 = onWarmupCompleted + 37;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    list = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), list);
                    i = 1;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnExtraCallbackWithResult = ScoreRaisePackageHomeResponse.FaqSection.onExtraCallbackWithResult();
            if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                list = null;
                z = true;
                i = 0;
                while (z) {
                }
            } else {
                list = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), (Object) null);
                i = i4;
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ScoreRaisePackageHomeResponse.FaqSection(i, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m190deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ScoreRaisePackageHomeResponse.FaqSection faqSectionDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 59;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return faqSectionDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ScoreRaisePackageHomeResponse.FaqSection faqSection) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(faqSection, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ScoreRaisePackageHomeResponse.FaqSection.onWarmupCompleted(faqSection, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 77 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(faqSection, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            ScoreRaisePackageHomeResponse.FaqSection.onWarmupCompleted(faqSection, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onWarmupCompleted + 41;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ScoreRaisePackageHomeResponse.FaqSection) obj);
        int i4 = IAuthTabCallback + 69;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 19;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
