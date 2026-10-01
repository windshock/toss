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
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ScoreRaisePackageHomeResponse$$serializer implements aeu2<ScoreRaisePackageHomeResponse> {
    private static int IAuthTabCallback = 1;
    public static final ScoreRaisePackageHomeResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 41;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 95;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        ScoreRaisePackageHomeResponse$$serializer scoreRaisePackageHomeResponse$$serializer = new ScoreRaisePackageHomeResponse$$serializer();
        INSTANCE = scoreRaisePackageHomeResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.ScoreRaisePackageHomeResponse", scoreRaisePackageHomeResponse$$serializer, 7);
        setanimationsloop.onWarmupCompleted("disclaimerSections", true);
        setanimationsloop.onWarmupCompleted("faqSection", true);
        setanimationsloop.onWarmupCompleted("headerSection", true);
        setanimationsloop.onWarmupCompleted("introSection", true);
        setanimationsloop.onWarmupCompleted("scoreRaiseButton", true);
        setanimationsloop.onWarmupCompleted("statsSection", true);
        setanimationsloop.onWarmupCompleted("raisedUserCount", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 13;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private ScoreRaisePackageHomeResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback((KSerializer) ScoreRaisePackageHomeResponse.onWarmupCompleted()[0].getValue()), sp.IAuthTabCallback(ScoreRaisePackageHomeResponse$FaqSection$$serializer.INSTANCE), sp.IAuthTabCallback(ScoreRaisePackageHomeResponse$HeaderSection$$serializer.INSTANCE), sp.IAuthTabCallback(ScoreRaisePackageHomeResponse$IntroSection$$serializer.INSTANCE), sp.IAuthTabCallback(ScoreRaisePackageHomeResponse$ScoreRaiseButton$$serializer.INSTANCE), sp.IAuthTabCallback(ScoreRaisePackageHomeResponse$StatsSection$$serializer.INSTANCE), sp.IAuthTabCallback(oty1.onExtraCallback)};
        int i4 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x008e A[PHI: r0 r2 r5
      0x008e: PHI (r0v5 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0041, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0041, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r5v10 kotlin.Lazy[]) = (r5v1 kotlin.Lazy[]), (r5v12 kotlin.Lazy[]) binds: [B:8:0x0041, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0043 A[PHI: r0 r2 r5
      0x0043: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0041, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0043: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0041, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0043: PHI (r5v2 kotlin.Lazy[]) = (r5v1 kotlin.Lazy[]), (r5v12 kotlin.Lazy[]) binds: [B:8:0x0041, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ScoreRaisePackageHomeResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrOnWarmupCompleted;
        ScoreRaisePackageHomeResponse.ScoreRaiseButton scoreRaiseButton;
        int i;
        Long l;
        List list;
        ScoreRaisePackageHomeResponse.HeaderSection headerSection;
        ScoreRaisePackageHomeResponse.IntroSection introSection;
        ScoreRaisePackageHomeResponse.FaqSection faqSection;
        ScoreRaisePackageHomeResponse.StatsSection statsSection;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 93;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = 6;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnWarmupCompleted = ScoreRaisePackageHomeResponse.onWarmupCompleted();
            int i6 = 70 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                List list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), (Object) null);
                ScoreRaisePackageHomeResponse.FaqSection faqSection2 = (ScoreRaisePackageHomeResponse.FaqSection) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ScoreRaisePackageHomeResponse$FaqSection$$serializer.INSTANCE, (Object) null);
                ScoreRaisePackageHomeResponse.HeaderSection headerSection2 = (ScoreRaisePackageHomeResponse.HeaderSection) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ScoreRaisePackageHomeResponse$HeaderSection$$serializer.INSTANCE, (Object) null);
                ScoreRaisePackageHomeResponse.IntroSection introSection2 = (ScoreRaisePackageHomeResponse.IntroSection) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, ScoreRaisePackageHomeResponse$IntroSection$$serializer.INSTANCE, (Object) null);
                scoreRaiseButton = (ScoreRaisePackageHomeResponse.ScoreRaiseButton) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, ScoreRaisePackageHomeResponse$ScoreRaiseButton$$serializer.INSTANCE, (Object) null);
                ScoreRaisePackageHomeResponse.StatsSection statsSection2 = (ScoreRaisePackageHomeResponse.StatsSection) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ScoreRaisePackageHomeResponse$StatsSection$$serializer.INSTANCE, (Object) null);
                i = 127;
                l = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, oty1.onExtraCallback, (Object) null);
                list = list2;
                headerSection = headerSection2;
                introSection = introSection2;
                faqSection = faqSection2;
                statsSection = statsSection2;
            } else {
                boolean z = true;
                l = null;
                ScoreRaisePackageHomeResponse.StatsSection statsSection3 = null;
                ScoreRaisePackageHomeResponse.ScoreRaiseButton scoreRaiseButton2 = null;
                ScoreRaisePackageHomeResponse.IntroSection introSection3 = null;
                ScoreRaisePackageHomeResponse.FaqSection faqSection3 = null;
                List list3 = null;
                int i7 = 0;
                ScoreRaisePackageHomeResponse.HeaderSection headerSection3 = null;
                for (boolean z2 = true; (!z) != z2; z2 = true) {
                    int i8 = IAuthTabCallback + 25;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % i2;
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    switch (iOnNavigationEvent) {
                        case -1:
                            z = false;
                            i2 = 2;
                            i5 = 6;
                        case 0:
                            list3 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), list3);
                            i7 |= 1;
                            i2 = 2;
                            i5 = 6;
                        case 1:
                            faqSection3 = (ScoreRaisePackageHomeResponse.FaqSection) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ScoreRaisePackageHomeResponse$FaqSection$$serializer.INSTANCE, faqSection3);
                            i7 |= 2;
                            int i10 = onExtraCallbackWithResult + 13;
                            IAuthTabCallback = i10 % 128;
                            int i11 = i10 % i2;
                            i5 = 6;
                        case 2:
                            headerSection3 = (ScoreRaisePackageHomeResponse.HeaderSection) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2, ScoreRaisePackageHomeResponse$HeaderSection$$serializer.INSTANCE, headerSection3);
                            i7 |= 4;
                        case 3:
                            introSection3 = (ScoreRaisePackageHomeResponse.IntroSection) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, ScoreRaisePackageHomeResponse$IntroSection$$serializer.INSTANCE, introSection3);
                            i7 |= 8;
                        case 4:
                            scoreRaiseButton2 = (ScoreRaisePackageHomeResponse.ScoreRaiseButton) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, ScoreRaisePackageHomeResponse$ScoreRaiseButton$$serializer.INSTANCE, scoreRaiseButton2);
                            i7 |= 16;
                            int i12 = onExtraCallbackWithResult + 25;
                            IAuthTabCallback = i12 % 128;
                            if (i12 % i2 == 0) {
                                int i13 = 5 / i2;
                            }
                        case 5:
                            statsSection3 = (ScoreRaisePackageHomeResponse.StatsSection) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ScoreRaisePackageHomeResponse$StatsSection$$serializer.INSTANCE, statsSection3);
                            i7 |= 32;
                        case 6:
                            l = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, oty1.onExtraCallback, l);
                            i7 |= 64;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                }
                list = list3;
                headerSection = headerSection3;
                i = i7;
                statsSection = statsSection3;
                scoreRaiseButton = scoreRaiseButton2;
                introSection = introSection3;
                faqSection = faqSection3;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnWarmupCompleted = ScoreRaisePackageHomeResponse.onWarmupCompleted();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ScoreRaisePackageHomeResponse(i, list, faqSection, headerSection, introSection, scoreRaiseButton, statsSection, l, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m189deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ScoreRaisePackageHomeResponse scoreRaisePackageHomeResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(scoreRaisePackageHomeResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ScoreRaisePackageHomeResponse.onExtraCallback(scoreRaisePackageHomeResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 35;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ScoreRaisePackageHomeResponse) obj);
        if (i3 != 0) {
            int i4 = 17 / 0;
        }
        int i5 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 37 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
