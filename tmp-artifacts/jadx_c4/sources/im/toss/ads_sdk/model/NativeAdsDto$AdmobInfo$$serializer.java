package im.toss.ads_sdk.model;

import im.toss.ads_sdk.model.NativeAdsDto;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.PangleEncryptConstant;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.setVideoListener;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class NativeAdsDto$AdmobInfo$$serializer implements aeu2<NativeAdsDto.AdmobInfo> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final NativeAdsDto$AdmobInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 65;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 15;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        NativeAdsDto$AdmobInfo$$serializer nativeAdsDto$AdmobInfo$$serializer = new NativeAdsDto$AdmobInfo$$serializer();
        INSTANCE = nativeAdsDto$AdmobInfo$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.model.NativeAdsDto.AdmobInfo", nativeAdsDto$AdmobInfo$$serializer, 7);
        setanimationsloop.onWarmupCompleted("adUnitId", true);
        setanimationsloop.onWarmupCompleted("placementId", true);
        setanimationsloop.onWarmupCompleted("adFormat", true);
        setanimationsloop.onExtraCallback(new PangleEncryptConstant(new String[]{"format"}) { // from class: im.toss.ads_sdk.model.NativeAdsDto$AdmobInfo$$serializer.onExtraCallback
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            private final /* synthetic */ String[] onWarmupCompleted;

            {
                Intrinsics.checkNotNullParameter(strArr, "");
                this.onWarmupCompleted = strArr;
            }

            public final /* synthetic */ Class annotationType() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 15;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 67;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return PangleEncryptConstant.class;
            }

            public final boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (obj instanceof PangleEncryptConstant) {
                    if (Arrays.equals(names(), ((PangleEncryptConstant) obj).names())) {
                        return true;
                    }
                    int i2 = IAuthTabCallback + 13;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
                int i4 = IAuthTabCallback;
                int i5 = i4 + 65;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 95;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }

            public final int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 21;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = Arrays.hashCode(this.onWarmupCompleted) ^ 397397176;
                int i4 = onExtraCallback + 19;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return iHashCode;
            }

            public final /* synthetic */ String[] names() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 27;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                String[] strArr = this.onWarmupCompleted;
                int i5 = i3 + 85;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return strArr;
            }

            public final String toString() {
                int i = 2 % 2;
                String str = "@kotlinx.serialization.json.JsonNames(names=" + Arrays.toString(this.onWarmupCompleted) + ")";
                int i2 = onExtraCallback + 49;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }
        });
        setanimationsloop.onWarmupCompleted("retryCount", true);
        setanimationsloop.onWarmupCompleted("timeoutMillis", true);
        setanimationsloop.onWarmupCompleted("ratio", true);
        setanimationsloop.onWarmupCompleted("requestOptions", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 17;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private NativeAdsDto$AdmobInfo$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallbackWithResult = NativeAdsDto.AdmobInfo.onExtraCallbackWithResult();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, sp.IAuthTabCallback(setvideolistener), getwrigglelayout, setvideolistener, setvideolistener, lazyArrOnExtraCallbackWithResult[5].getValue(), sp.IAuthTabCallback(NativeAdsDto.AdmobRequestOptions.onExtraCallback.onWarmupCompleted)};
        int i4 = onExtraCallback + 89;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final NativeAdsDto.AdmobInfo deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        double dIAuthTabCallback;
        double dIAuthTabCallback2;
        NativeAdsDto.ThumbnailBannerAdMobRatio thumbnailBannerAdMobRatio;
        NativeAdsDto.AdmobRequestOptions admobRequestOptions;
        int i;
        String str;
        Double d;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 17;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = NativeAdsDto.AdmobInfo.onExtraCallbackWithResult();
        int i5 = 6;
        Double d2 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            String strAsInterface2 = null;
            strAsInterface = null;
            dIAuthTabCallback = 0.0d;
            dIAuthTabCallback2 = 0.0d;
            i = 0;
            admobRequestOptions = null;
            thumbnailBannerAdMobRatio = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        d2 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, setVideoListener.onWarmupCompleted, d2);
                        i |= 2;
                        int i6 = onExtraCallback + 89;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                        break;
                    case 2:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i |= 4;
                        continue;
                    case 3:
                        dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 3);
                        i |= 8;
                        continue;
                    case 4:
                        dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 4);
                        i |= 16;
                        continue;
                    case 5:
                        thumbnailBannerAdMobRatio = (NativeAdsDto.ThumbnailBannerAdMobRatio) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrOnExtraCallbackWithResult[5].getValue(), thumbnailBannerAdMobRatio);
                        i |= 32;
                        continue;
                    case 6:
                        admobRequestOptions = (NativeAdsDto.AdmobRequestOptions) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, NativeAdsDto.AdmobRequestOptions.onExtraCallback.onWarmupCompleted, admobRequestOptions);
                        i |= 64;
                        continue;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
                i5 = 6;
            }
            str = strAsInterface2;
            d = d2;
        } else {
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            Double d3 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, setVideoListener.onWarmupCompleted, (Object) null);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 3);
            dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 4);
            thumbnailBannerAdMobRatio = (NativeAdsDto.ThumbnailBannerAdMobRatio) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrOnExtraCallbackWithResult[5].getValue(), (Object) null);
            admobRequestOptions = (NativeAdsDto.AdmobRequestOptions) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, NativeAdsDto.AdmobRequestOptions.onExtraCallback.onWarmupCompleted, (Object) null);
            i = 127;
            str = strAsInterface3;
            d = d3;
        }
        NativeAdsDto.AdmobRequestOptions admobRequestOptions2 = admobRequestOptions;
        NativeAdsDto.ThumbnailBannerAdMobRatio thumbnailBannerAdMobRatio2 = thumbnailBannerAdMobRatio;
        String str2 = strAsInterface;
        double d4 = dIAuthTabCallback;
        double d5 = dIAuthTabCallback2;
        int i8 = i;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new NativeAdsDto.AdmobInfo(i8, str2, d, str, d4, d5, thumbnailBannerAdMobRatio2, admobRequestOptions2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m16deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto.AdmobInfo admobInfoDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 11;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return admobInfoDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull NativeAdsDto.AdmobInfo admobInfo) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(admobInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        NativeAdsDto.AdmobInfo.onExtraCallback(admobInfo, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 83;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (NativeAdsDto.AdmobInfo) obj);
        int i4 = onExtraCallback + 3;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 44 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
