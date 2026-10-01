package im.toss.features.benefit.admob;

import im.toss.features.benefit.admob.AdMobLogEventRequest;
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
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AdMobLogEventRequest$AdMobLoadSuccess$$serializer implements aeu2<AdMobLogEventRequest.AdMobLoadSuccess> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final AdMobLogEventRequest$AdMobLoadSuccess$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 101;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 117;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        AdMobLogEventRequest$AdMobLoadSuccess$$serializer adMobLogEventRequest$AdMobLoadSuccess$$serializer = new AdMobLogEventRequest$AdMobLoadSuccess$$serializer();
        INSTANCE = adMobLogEventRequest$AdMobLoadSuccess$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.benefit.admob.AdMobLogEventRequest.AdMobLoadSuccess", adMobLogEventRequest$AdMobLoadSuccess$$serializer, 7);
        setanimationsloop.onWarmupCompleted("requestId", false);
        setanimationsloop.onWarmupCompleted("responseId", false);
        setanimationsloop.onWarmupCompleted("eventTs", false);
        setanimationsloop.onWarmupCompleted("filterReasons", false);
        setanimationsloop.onWarmupCompleted("content", false);
        setanimationsloop.onWarmupCompleted("adUnit", true);
        setanimationsloop.onWarmupCompleted("mediationType", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 123;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 37 / 0;
        }
    }

    private AdMobLogEventRequest$AdMobLoadSuccess$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallbackWithResult = AdMobLogEventRequest.AdMobLoadSuccess.onExtraCallbackWithResult();
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializer, sp.IAuthTabCallback(kSerializer), kSerializer, sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallbackWithResult[3].getValue()), AdMobNativeAdContent$$serializer.INSTANCE, kSerializer, kSerializer};
        int i4 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AdMobLogEventRequest.AdMobLoadSuccess deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String str;
        String strAsInterface2;
        String strAsInterface3;
        String strAsInterface4;
        int i;
        List list;
        AdMobNativeAdContent adMobNativeAdContent;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = AdMobLogEventRequest.AdMobLoadSuccess.onExtraCallbackWithResult();
        List list2 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            AdMobNativeAdContent adMobNativeAdContent2 = null;
            strAsInterface3 = null;
            str = null;
            strAsInterface4 = null;
            strAsInterface2 = null;
            strAsInterface = null;
            i = 0;
            while (z) {
                int i5 = onWarmupCompleted + 115;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
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
                        str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str);
                        i |= 2;
                        int i7 = onWarmupCompleted + 53;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        break;
                    case 2:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, (jp) lazyArrOnExtraCallbackWithResult[3].getValue(), list2);
                        i |= 8;
                        break;
                    case 4:
                        adMobNativeAdContent2 = (AdMobNativeAdContent) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, AdMobNativeAdContent$$serializer.INSTANCE, adMobNativeAdContent2);
                        i |= 16;
                        break;
                    case 5:
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                        i |= 32;
                        break;
                    case 6:
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
                        i |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            int i9 = onExtraCallbackWithResult + 69;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            adMobNativeAdContent = adMobNativeAdContent2;
            list = list2;
        } else {
            int i11 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, (Object) null);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            List list3 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, (jp) lazyArrOnExtraCallbackWithResult[3].getValue(), (Object) null);
            AdMobNativeAdContent adMobNativeAdContent3 = (AdMobNativeAdContent) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, AdMobNativeAdContent$$serializer.INSTANCE, (Object) null);
            strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
            strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
            i = 127;
            list = list3;
            adMobNativeAdContent = adMobNativeAdContent3;
        }
        String str2 = str;
        String str3 = strAsInterface2;
        String str4 = strAsInterface;
        int i13 = i;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AdMobLogEventRequest.AdMobLoadSuccess(i13, str4, str2, str3, list, adMobNativeAdContent, strAsInterface3, strAsInterface4, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m80deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        AdMobLogEventRequest.AdMobLoadSuccess adMobLoadSuccessDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        int i5 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return adMobLoadSuccessDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AdMobLogEventRequest.AdMobLoadSuccess adMobLoadSuccess) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(adMobLoadSuccess, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AdMobLogEventRequest.AdMobLoadSuccess.onExtraCallback(adMobLoadSuccess, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AdMobLogEventRequest.AdMobLoadSuccess) obj);
        int i4 = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 68 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
