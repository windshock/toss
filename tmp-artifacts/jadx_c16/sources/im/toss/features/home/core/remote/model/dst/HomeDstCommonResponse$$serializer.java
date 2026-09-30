package im.toss.features.home.core.remote.model.dst;

import im.toss.features.home.core.remote.model.dst.handler.HandlerResponse;
import im.toss.features.home.core.remote.model.dst.property.ColorAttributeResponse;
import im.toss.features.home.core.remote.model.dst.property.ColorAttributeResponse$;
import im.toss.features.home.core.remote.model.dst.widget.BottomCtaResponse;
import im.toss.features.home.core.remote.model.dst.widget.BottomCtaResponse$;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
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
public final /* synthetic */ class HomeDstCommonResponse$$serializer implements aeu2<HomeDstCommonResponse> {
    private static int IAuthTabCallback = 1;
    public static final HomeDstCommonResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        HomeDstCommonResponse$$serializer homeDstCommonResponse$$serializer = new HomeDstCommonResponse$$serializer();
        INSTANCE = homeDstCommonResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.dst.HomeDstCommonResponse", homeDstCommonResponse$$serializer, 8);
        setanimationsloop.onWarmupCompleted("navigationBarTitle", true);
        setanimationsloop.onWarmupCompleted("navigationBarRightItems", true);
        setanimationsloop.onWarmupCompleted("sections", true);
        setanimationsloop.onWarmupCompleted("bottomCTA", true);
        setanimationsloop.onWarmupCompleted("initializeHandler", true);
        setanimationsloop.onWarmupCompleted("backgroundColor", true);
        setanimationsloop.onWarmupCompleted("state", true);
        setanimationsloop.onWarmupCompleted("refreshGuide", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 63;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 57 / 0;
        }
    }

    private HomeDstCommonResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        Lazy[] lazyArr = (Lazy[]) HomeDstCommonResponse.IAuthTabCallback(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1038326283, -1038326283, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[0]);
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback((KSerializer) lazyArr[1].getValue()), sp.IAuthTabCallback((KSerializer) lazyArr[2].getValue()), sp.IAuthTabCallback(BottomCtaResponse$.serializer.INSTANCE), sp.IAuthTabCallback(TBPermissionHelper.onExtraCallbackWithResult), sp.IAuthTabCallback(ColorAttributeResponse$.serializer.INSTANCE), sp.IAuthTabCallback((KSerializer) lazyArr[6].getValue()), sp.IAuthTabCallback((KSerializer) lazyArr[7].getValue())};
        int i4 = IAuthTabCallback + 73;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HomeDstCommonResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        ColorAttributeResponse colorAttributeResponse;
        int i;
        String str;
        List list;
        HandlerResponse handlerResponse;
        List list2;
        BottomCtaResponse bottomCtaResponse;
        Map map;
        Map map2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        Lazy[] lazyArr = (Lazy[]) HomeDstCommonResponse.IAuthTabCallback(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1038326283, -1038326283, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[0]);
        int i3 = 5;
        int i4 = 3;
        int i5 = 4;
        List list3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i6 = onNavigationEvent + 61;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            String str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            list = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArr[1].getValue(), (Object) null);
            List list4 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArr[2].getValue(), (Object) null);
            bottomCtaResponse = (BottomCtaResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BottomCtaResponse$.serializer.INSTANCE, (Object) null);
            handlerResponse = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TBPermissionHelper.onExtraCallbackWithResult, (Object) null);
            ColorAttributeResponse colorAttributeResponse2 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ColorAttributeResponse$.serializer.INSTANCE, (Object) null);
            map2 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, (jp) lazyArr[6].getValue(), (Object) null);
            Map map3 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArr[7].getValue(), (Object) null);
            str = str2;
            i = 255;
            colorAttributeResponse = colorAttributeResponse2;
            list2 = list4;
            map = map3;
        } else {
            int i8 = 0;
            boolean z = true;
            ColorAttributeResponse colorAttributeResponse3 = null;
            HandlerResponse handlerResponse2 = null;
            BottomCtaResponse bottomCtaResponse2 = null;
            Map map4 = null;
            Map map5 = null;
            List list5 = null;
            String str3 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                    case 0:
                        str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str3);
                        i8 |= 1;
                        list5 = list5;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                    case 1:
                        list5 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArr[1].getValue(), list5);
                        i8 |= 2;
                        i3 = 5;
                        i4 = 3;
                    case 2:
                        list3 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArr[2].getValue(), list3);
                        i8 |= 4;
                        i3 = 5;
                    case 3:
                        bottomCtaResponse2 = (BottomCtaResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, BottomCtaResponse$.serializer.INSTANCE, bottomCtaResponse2);
                        i8 |= 8;
                    case 4:
                        handlerResponse2 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, TBPermissionHelper.onExtraCallbackWithResult, handlerResponse2);
                        i8 |= 16;
                    case 5:
                        colorAttributeResponse3 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, ColorAttributeResponse$.serializer.INSTANCE, colorAttributeResponse3);
                        i8 |= 32;
                    case 6:
                        map5 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, (jp) lazyArr[6].getValue(), map5);
                        i8 |= 64;
                    case 7:
                        map4 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArr[7].getValue(), map4);
                        i8 |= 128;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            colorAttributeResponse = colorAttributeResponse3;
            i = i8;
            str = str3;
            list = list5;
            handlerResponse = handlerResponse2;
            list2 = list3;
            bottomCtaResponse = bottomCtaResponse2;
            map = map4;
            map2 = map5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        HomeDstCommonResponse homeDstCommonResponse = new HomeDstCommonResponse(i, str, list, list2, bottomCtaResponse, handlerResponse, colorAttributeResponse, map2, map, (okycx) null);
        int i9 = IAuthTabCallback + 31;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        return homeDstCommonResponse;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m593deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        HomeDstCommonResponse homeDstCommonResponseDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
        int i5 = IAuthTabCallback + 109;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 13 / 0;
        }
        return homeDstCommonResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeDstCommonResponse homeDstCommonResponse) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(homeDstCommonResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            HomeDstCommonResponse.onExtraCallback(homeDstCommonResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(homeDstCommonResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        HomeDstCommonResponse.onExtraCallback(homeDstCommonResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = IAuthTabCallback + 35;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeDstCommonResponse) obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 75;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
