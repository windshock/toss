package im.toss.ads_sdk.model;

import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.setVideoListener;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class NativeAdsDto$ExtraInfo$$serializer implements aeu2<NativeAdsDto.ExtraInfo> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final NativeAdsDto$ExtraInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        NativeAdsDto$ExtraInfo$$serializer nativeAdsDto$ExtraInfo$$serializer = new NativeAdsDto$ExtraInfo$$serializer();
        INSTANCE = nativeAdsDto$ExtraInfo$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.model.NativeAdsDto.ExtraInfo", nativeAdsDto$ExtraInfo$$serializer, 7);
        setanimationsloop.onWarmupCompleted("mraidJsUrl", true);
        setanimationsloop.onWarmupCompleted("skippableOffsetSeconds", true);
        setanimationsloop.onWarmupCompleted("reward", true);
        setanimationsloop.onWarmupCompleted("isAdBadgeEnabled", true);
        setanimationsloop.onWarmupCompleted("refetchSeconds", true);
        setanimationsloop.onWarmupCompleted("mediation", true);
        setanimationsloop.onWarmupCompleted("playableTutorialOverlay", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 1;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private NativeAdsDto$ExtraInfo$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent);
        setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, sp.IAuthTabCallback(setvideolistener), sp.IAuthTabCallback(NativeAdsDto$Reward$$serializer.INSTANCE), getBgColor.IAuthTabCallback, sp.IAuthTabCallback(setvideolistener), NativeAdsDto$Mediation$$serializer.INSTANCE, sp.IAuthTabCallback(NativeAdsDto$Creative$TutorialOverlay$$serializer.INSTANCE)};
        int i4 = onWarmupCompleted + 59;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final NativeAdsDto.ExtraInfo deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        NativeAdsDto.Reward reward;
        Double d;
        String str;
        NativeAdsDto.Creative.TutorialOverlay tutorialOverlay;
        NativeAdsDto.Mediation mediation;
        boolean z;
        Double d2;
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Double d3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = onNavigationEvent + 97;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            String str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
            Double d4 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, setvideolistener, (Object) null);
            NativeAdsDto.Reward reward2 = (NativeAdsDto.Reward) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, NativeAdsDto$Reward$$serializer.INSTANCE, (Object) null);
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
            Double d5 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setvideolistener, (Object) null);
            NativeAdsDto.Mediation mediation2 = (NativeAdsDto.Mediation) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, NativeAdsDto$Mediation$$serializer.INSTANCE, (Object) null);
            reward = reward2;
            str = str2;
            tutorialOverlay = (NativeAdsDto.Creative.TutorialOverlay) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, NativeAdsDto$Creative$TutorialOverlay$$serializer.INSTANCE, (Object) null);
            mediation = mediation2;
            z = zOnExtraCallbackWithResult;
            d2 = d5;
            i = 127;
            d = d4;
        } else {
            boolean zOnExtraCallbackWithResult2 = false;
            int i6 = 0;
            boolean z2 = true;
            NativeAdsDto.Reward reward3 = null;
            String str3 = null;
            NativeAdsDto.Creative.TutorialOverlay tutorialOverlay2 = null;
            NativeAdsDto.Mediation mediation3 = null;
            Double d6 = null;
            while (!(!z2)) {
                int i7 = onWarmupCompleted + 61;
                onNavigationEvent = i7 % 128;
                if (i7 % i2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z2 = false;
                        i2 = 2;
                    case 0:
                        str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str3);
                        i6 |= 1;
                        i2 = 2;
                    case 1:
                        d3 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, setVideoListener.onWarmupCompleted, d3);
                        i6 |= 2;
                    case 2:
                        reward3 = (NativeAdsDto.Reward) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2, NativeAdsDto$Reward$$serializer.INSTANCE, reward3);
                        i6 |= 4;
                    case 3:
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
                        i6 |= 8;
                    case 4:
                        d6 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setVideoListener.onWarmupCompleted, d6);
                        i6 |= 16;
                    case 5:
                        mediation3 = (NativeAdsDto.Mediation) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, NativeAdsDto$Mediation$$serializer.INSTANCE, mediation3);
                        i6 |= 32;
                    case 6:
                        tutorialOverlay2 = (NativeAdsDto.Creative.TutorialOverlay) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, NativeAdsDto$Creative$TutorialOverlay$$serializer.INSTANCE, tutorialOverlay2);
                        i6 |= 64;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            reward = reward3;
            d = d3;
            str = str3;
            tutorialOverlay = tutorialOverlay2;
            mediation = mediation3;
            z = zOnExtraCallbackWithResult2;
            d2 = d6;
            i = i6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new NativeAdsDto.ExtraInfo(i, str, d, reward, z, d2, mediation, tutorialOverlay, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m34deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto.ExtraInfo extraInfoDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 101;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return extraInfoDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull NativeAdsDto.ExtraInfo extraInfo) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(extraInfo, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            NativeAdsDto.ExtraInfo.IAuthTabCallback(new Object[]{extraInfo, vylVarOnExtraCallback, serialDescriptor}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1344275129, 1344275129, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), iOnWarmupCompleted);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 95 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(extraInfo, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            NativeAdsDto.ExtraInfo.IAuthTabCallback(new Object[]{extraInfo, vylVarOnExtraCallback2, serialDescriptor2}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1344275129, 1344275129, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), iOnWarmupCompleted2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onWarmupCompleted + 87;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        serialize(encoder, (NativeAdsDto.ExtraInfo) obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 49;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 107;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
