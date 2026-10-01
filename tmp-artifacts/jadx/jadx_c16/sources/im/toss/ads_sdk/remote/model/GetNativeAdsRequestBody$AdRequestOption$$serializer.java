package im.toss.ads_sdk.remote.model;

import im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody;
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
public final /* synthetic */ class GetNativeAdsRequestBody$AdRequestOption$$serializer implements aeu2<GetNativeAdsRequestBody.AdRequestOption> {
    public static final int $stable;
    public static final GetNativeAdsRequestBody$AdRequestOption$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 41;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 35;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        GetNativeAdsRequestBody$AdRequestOption$$serializer getNativeAdsRequestBody$AdRequestOption$$serializer = new GetNativeAdsRequestBody$AdRequestOption$$serializer();
        INSTANCE = getNativeAdsRequestBody$AdRequestOption$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody.AdRequestOption", getNativeAdsRequestBody$AdRequestOption$$serializer, 4);
        setanimationsloop.onWarmupCompleted("maxSize", true);
        setanimationsloop.onWarmupCompleted("video", true);
        setanimationsloop.onWarmupCompleted("adIndexBase", true);
        setanimationsloop.onWarmupCompleted("itemIndexes", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 99;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private GetNativeAdsRequestBody$AdRequestOption$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallbackWithResult = GetNativeAdsRequestBody.AdRequestOption.onExtraCallbackWithResult();
        KSerializer<?> kSerializer = oty1.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {kSerializer, sp.IAuthTabCallback(GetNativeAdsRequestBody$VideoOption$$serializer.INSTANCE), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallbackWithResult[3].getValue())};
        int i4 = onWarmupCompleted + 19;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0080 A[PHI: r0 r2 r3
      0x0080: PHI (r0v5 o.yw) = (r0v1 o.yw), (r0v8 o.yw) binds: [B:8:0x003f, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0080: PHI (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v10 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003f, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0080: PHI (r3v11 kotlin.Lazy[]) = (r3v2 kotlin.Lazy[]), (r3v13 kotlin.Lazy[]) binds: [B:8:0x003f, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041 A[PHI: r0 r2 r3
      0x0041: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v8 o.yw) binds: [B:8:0x003f, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0041: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v10 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003f, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0041: PHI (r3v3 kotlin.Lazy[]) = (r3v2 kotlin.Lazy[]), (r3v13 kotlin.Lazy[]) binds: [B:8:0x003f, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final GetNativeAdsRequestBody.AdRequestOption deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrOnExtraCallbackWithResult;
        GetNativeAdsRequestBody.VideoOption videoOption;
        Long l;
        List list;
        long j;
        int i;
        SerialDescriptor serialDescriptor2;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnExtraCallbackWithResult = GetNativeAdsRequestBody.AdRequestOption.onExtraCallbackWithResult();
            int i4 = 63 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                int i5 = onExtraCallbackWithResult + 125;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                videoOption = (GetNativeAdsRequestBody.VideoOption) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, GetNativeAdsRequestBody$VideoOption$$serializer.INSTANCE, (Object) null);
                l = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, oty1.onExtraCallback, (Object) null);
                List list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, (jp) lazyArrOnExtraCallbackWithResult[3].getValue(), (Object) null);
                int i7 = onWarmupCompleted + 119;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                list = list2;
                j = jIAuthTabCallbackDefault;
                SerialDescriptor serialDescriptor3 = serialDescriptor;
                i = 15;
                serialDescriptor2 = serialDescriptor3;
            } else {
                boolean z = true;
                GetNativeAdsRequestBody.VideoOption videoOption2 = null;
                Long l2 = null;
                long jIAuthTabCallbackDefault2 = 0;
                int i9 = 0;
                List list3 = null;
                while (z) {
                    int i10 = onExtraCallbackWithResult + 21;
                    onWarmupCompleted = i10 % 128;
                    if (i10 % 2 == 0) {
                        ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent == 0) {
                        jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i9 |= 1;
                    } else if (iOnNavigationEvent == 1) {
                        videoOption2 = (GetNativeAdsRequestBody.VideoOption) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, GetNativeAdsRequestBody$VideoOption$$serializer.INSTANCE, videoOption2);
                        i9 |= 2;
                    } else if (iOnNavigationEvent == 2) {
                        l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, oty1.onExtraCallback, l2);
                        i9 |= 4;
                    } else {
                        if (iOnNavigationEvent != 3) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        list3 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, (jp) lazyArrOnExtraCallbackWithResult[3].getValue(), list3);
                        i9 |= 8;
                    }
                }
                serialDescriptor2 = serialDescriptor;
                i = i9;
                list = list3;
                videoOption = videoOption2;
                l = l2;
                j = jIAuthTabCallbackDefault2;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnExtraCallbackWithResult = GetNativeAdsRequestBody.AdRequestOption.onExtraCallbackWithResult();
            if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor2);
        return new GetNativeAdsRequestBody.AdRequestOption(i, j, videoOption, l, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        GetNativeAdsRequestBody.AdRequestOption adRequestOptionDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return adRequestOptionDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull GetNativeAdsRequestBody.AdRequestOption adRequestOption) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(adRequestOption, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        GetNativeAdsRequestBody.AdRequestOption.onWarmupCompleted(adRequestOption, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (GetNativeAdsRequestBody.AdRequestOption) obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 67;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
