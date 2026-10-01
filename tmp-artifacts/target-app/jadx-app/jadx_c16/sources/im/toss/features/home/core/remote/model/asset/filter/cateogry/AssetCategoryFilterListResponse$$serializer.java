package im.toss.features.home.core.remote.model.asset.filter.cateogry;

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
public final /* synthetic */ class AssetCategoryFilterListResponse$$serializer implements aeu2<AssetCategoryFilterListResponse> {
    private static int IAuthTabCallback = 0;
    public static final AssetCategoryFilterListResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 15;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 21;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        AssetCategoryFilterListResponse$$serializer assetCategoryFilterListResponse$$serializer = new AssetCategoryFilterListResponse$$serializer();
        INSTANCE = assetCategoryFilterListResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.asset.filter.cateogry.AssetCategoryFilterListResponse", assetCategoryFilterListResponse$$serializer, 3);
        setanimationsloop.onWarmupCompleted("headerSections", false);
        setanimationsloop.onWarmupCompleted("categories", false);
        setanimationsloop.onWarmupCompleted("footerSections", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 41;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private AssetCategoryFilterListResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnWarmupCompleted = AssetCategoryFilterListResponse.onWarmupCompleted();
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[0].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[1].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[2].getValue())};
        int i4 = onNavigationEvent + 7;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AssetCategoryFilterListResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        List list;
        List list2;
        List list3;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 49;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            AssetCategoryFilterListResponse.onWarmupCompleted();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = AssetCategoryFilterListResponse.onWarmupCompleted();
        if (!(!ywVarOnWarmupCompleted2.extraCallbackWithResult())) {
            List list4 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), (Object) null);
            List list5 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), (Object) null);
            list2 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnWarmupCompleted[2].getValue(), (Object) null);
            i = 7;
            list3 = list4;
            list = list5;
        } else {
            int i4 = IAuthTabCallback + 47;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            List list6 = null;
            List list7 = null;
            List list8 = null;
            boolean z = true;
            int i6 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    list8 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), list8);
                    i6 |= 1;
                } else if (iOnNavigationEvent == 1) {
                    list6 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), list6);
                    i6 |= 2;
                } else {
                    if (iOnNavigationEvent != 2) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    list7 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnWarmupCompleted[2].getValue(), list7);
                    i6 |= 4;
                }
            }
            i = i6;
            list = list6;
            list2 = list7;
            list3 = list8;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new AssetCategoryFilterListResponse(i, list3, list, list2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m554deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AssetCategoryFilterListResponse assetCategoryFilterListResponseDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 31 / 0;
        }
        int i5 = onNavigationEvent + 123;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return assetCategoryFilterListResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AssetCategoryFilterListResponse assetCategoryFilterListResponse) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(assetCategoryFilterListResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AssetCategoryFilterListResponse.onWarmupCompleted(assetCategoryFilterListResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 69;
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
        int i2 = onNavigationEvent + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AssetCategoryFilterListResponse) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 89;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
