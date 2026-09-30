package im.toss.features.home.core.remote.model.asset.home;

import im.toss.features.home.core.remote.model.asset.home.AssetOtherHome;
import im.toss.features.home.core.remote.model.dst.handler.HandlerResponse;
import im.toss.features.home.core.remote.model.dst.property.ColorAttributeResponse;
import im.toss.features.home.core.remote.model.dst.property.ColorAttributeResponse$;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.TBPermissionHelper;
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
public final /* synthetic */ class AssetOtherHome$$serializer implements aeu2<AssetOtherHome> {
    private static int IAuthTabCallback = 0;
    public static final AssetOtherHome$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 17;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        AssetOtherHome$$serializer assetOtherHome$$serializer = new AssetOtherHome$$serializer();
        INSTANCE = assetOtherHome$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.asset.home.AssetOtherHome", assetOtherHome$$serializer, 7);
        setanimationsloop.onWarmupCompleted("navigationBarTitle", true);
        setanimationsloop.onWarmupCompleted("navigationBarRightItems", true);
        setanimationsloop.onWarmupCompleted("sections", true);
        setanimationsloop.onWarmupCompleted("initializeHandler", true);
        setanimationsloop.onWarmupCompleted("backgroundColor", true);
        setanimationsloop.onWarmupCompleted("state", true);
        setanimationsloop.onWarmupCompleted("bottomButton", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 31;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 82 / 0;
        }
    }

    private AssetOtherHome$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnWarmupCompleted = AssetOtherHome.onWarmupCompleted();
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[1].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[2].getValue()), sp.IAuthTabCallback(TBPermissionHelper.onExtraCallbackWithResult), sp.IAuthTabCallback(ColorAttributeResponse$.serializer.INSTANCE), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[5].getValue()), sp.IAuthTabCallback(AssetOtherHome$BottomButton$$serializer.INSTANCE)};
        int i4 = onExtraCallback + 99;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AssetOtherHome deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        List list;
        List list2;
        HandlerResponse handlerResponse;
        ColorAttributeResponse colorAttributeResponse;
        AssetOtherHome.BottomButton bottomButton;
        Map map;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = AssetOtherHome.onWarmupCompleted();
        int i3 = 6;
        int i4 = 3;
        List list3 = null;
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            String str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            List list4 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), (Object) null);
            List list5 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnWarmupCompleted[2].getValue(), (Object) null);
            HandlerResponse handlerResponse2 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, TBPermissionHelper.onExtraCallbackWithResult, (Object) null);
            ColorAttributeResponse colorAttributeResponse2 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, ColorAttributeResponse$.serializer.INSTANCE, (Object) null);
            Map map2 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, (jp) lazyArrOnWarmupCompleted[5].getValue(), (Object) null);
            AssetOtherHome.BottomButton bottomButton2 = (AssetOtherHome.BottomButton) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, AssetOtherHome$BottomButton$$serializer.INSTANCE, (Object) null);
            int i5 = onExtraCallbackWithResult + 59;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            i = 127;
            map = map2;
            str = str2;
            list = list4;
            bottomButton = bottomButton2;
            handlerResponse = handlerResponse2;
            colorAttributeResponse = colorAttributeResponse2;
            list2 = list5;
        } else {
            boolean z = true;
            int i7 = 0;
            List list6 = null;
            HandlerResponse handlerResponse3 = null;
            ColorAttributeResponse colorAttributeResponse3 = null;
            AssetOtherHome.BottomButton bottomButton3 = null;
            Map map3 = null;
            String str3 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        int i8 = onExtraCallbackWithResult + 27;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % 2;
                        str3 = str3;
                        i3 = 6;
                        i4 = 3;
                        z = false;
                        continue;
                    case 0:
                        str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str3);
                        i7 |= 1;
                        i3 = 6;
                        i4 = 3;
                        continue;
                    case 1:
                        list6 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), list6);
                        i7 |= 2;
                        i3 = 6;
                        continue;
                    case 2:
                        list3 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnWarmupCompleted[2].getValue(), list3);
                        i7 |= 4;
                        break;
                    case 3:
                        handlerResponse3 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, TBPermissionHelper.onExtraCallbackWithResult, handlerResponse3);
                        i7 |= 8;
                        break;
                    case 4:
                        colorAttributeResponse3 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, ColorAttributeResponse$.serializer.INSTANCE, colorAttributeResponse3);
                        i7 |= 16;
                        break;
                    case 5:
                        map3 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, (jp) lazyArrOnWarmupCompleted[5].getValue(), map3);
                        i7 |= 32;
                        break;
                    case 6:
                        bottomButton3 = (AssetOtherHome.BottomButton) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, AssetOtherHome$BottomButton$$serializer.INSTANCE, bottomButton3);
                        i7 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            int i10 = onExtraCallbackWithResult + 43;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            i = i7;
            str = str3;
            list = list6;
            list2 = list3;
            handlerResponse = handlerResponse3;
            colorAttributeResponse = colorAttributeResponse3;
            bottomButton = bottomButton3;
            map = map3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AssetOtherHome(i, str, list, list2, handlerResponse, colorAttributeResponse, map, bottomButton, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m555deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            obj.hashCode();
            throw null;
        }
        AssetOtherHome assetOtherHomeDeserialize = deserialize(decoder);
        int i3 = onExtraCallback + 49;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return assetOtherHomeDeserialize;
        }
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AssetOtherHome assetOtherHome) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(assetOtherHome, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AssetOtherHome.onWarmupCompleted(assetOtherHome, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 103;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AssetOtherHome) obj);
        int i4 = onExtraCallbackWithResult + 27;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 64 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onExtraCallback + 89;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
