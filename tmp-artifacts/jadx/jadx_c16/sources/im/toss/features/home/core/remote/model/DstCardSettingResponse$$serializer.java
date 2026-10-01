package im.toss.features.home.core.remote.model;

import im.toss.features.home.core.remote.model.dst.handler.HandlerResponse;
import im.toss.features.home.core.remote.model.dst.property.ColorAttributeResponse;
import im.toss.features.home.core.remote.model.dst.property.ColorAttributeResponse$;
import im.toss.features.home.core.remote.model.dst.widget.BottomCtaResponse;
import im.toss.features.home.core.remote.model.dst.widget.BottomCtaResponse$;
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
import o.getDynamicHeight;
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
public final /* synthetic */ class DstCardSettingResponse$$serializer implements aeu2<DstCardSettingResponse> {
    private static int IAuthTabCallback = 0;
    public static final DstCardSettingResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 69;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        DstCardSettingResponse$$serializer dstCardSettingResponse$$serializer = new DstCardSettingResponse$$serializer();
        INSTANCE = dstCardSettingResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.DstCardSettingResponse", dstCardSettingResponse$$serializer, 9);
        setanimationsloop.onWarmupCompleted("navigationBarTitle", true);
        setanimationsloop.onWarmupCompleted("navigationBarRightItems", true);
        setanimationsloop.onWarmupCompleted("sections", true);
        setanimationsloop.onWarmupCompleted("bottomCTA", true);
        setanimationsloop.onWarmupCompleted("initializeHandler", true);
        setanimationsloop.onWarmupCompleted("backgroundColor", true);
        setanimationsloop.onWarmupCompleted("state", true);
        setanimationsloop.onWarmupCompleted("refreshGuide", true);
        setanimationsloop.onWarmupCompleted("cardCode", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 125;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private DstCardSettingResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnWarmupCompleted = DstCardSettingResponse.onWarmupCompleted();
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[1].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[2].getValue()), sp.IAuthTabCallback(BottomCtaResponse$.serializer.INSTANCE), sp.IAuthTabCallback(TBPermissionHelper.onExtraCallbackWithResult), sp.IAuthTabCallback(ColorAttributeResponse$.serializer.INSTANCE), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[6].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[7].getValue()), sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted)};
        int i4 = onWarmupCompleted + 87;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final DstCardSettingResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        ColorAttributeResponse colorAttributeResponse;
        Map map;
        String str;
        int i;
        Integer num;
        Map map2;
        List list;
        List list2;
        HandlerResponse handlerResponse;
        BottomCtaResponse bottomCtaResponse;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 43;
        onWarmupCompleted = i3 % 128;
        Map map3 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            DstCardSettingResponse.onWarmupCompleted();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = DstCardSettingResponse.onWarmupCompleted();
        int i4 = 5;
        int i5 = 8;
        int i6 = 7;
        if (ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            int i7 = onNavigationEvent + 9;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            String str2 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            list = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), (Object) null);
            List list3 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnWarmupCompleted[2].getValue(), (Object) null);
            BottomCtaResponse bottomCtaResponse2 = (BottomCtaResponse) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 3, BottomCtaResponse$.serializer.INSTANCE, (Object) null);
            HandlerResponse handlerResponse2 = (HandlerResponse) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 4, TBPermissionHelper.onExtraCallbackWithResult, (Object) null);
            ColorAttributeResponse colorAttributeResponse2 = (ColorAttributeResponse) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 5, ColorAttributeResponse$.serializer.INSTANCE, (Object) null);
            Map map4 = (Map) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 6, (jp) lazyArrOnWarmupCompleted[6].getValue(), (Object) null);
            list2 = list3;
            map = (Map) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrOnWarmupCompleted[7].getValue(), (Object) null);
            num = (Integer) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 8, getDynamicHeight.onWarmupCompleted, (Object) null);
            colorAttributeResponse = colorAttributeResponse2;
            i = 511;
            handlerResponse = handlerResponse2;
            bottomCtaResponse = bottomCtaResponse2;
            map2 = map4;
            str = str2;
        } else {
            int i9 = onWarmupCompleted + 3;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            ColorAttributeResponse colorAttributeResponse3 = null;
            HandlerResponse handlerResponse3 = null;
            List list4 = null;
            List list5 = null;
            String str3 = null;
            BottomCtaResponse bottomCtaResponse3 = null;
            int i11 = 0;
            boolean z = true;
            Integer num2 = null;
            Map map5 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i4 = 5;
                        i5 = 8;
                        i6 = 7;
                    case 0:
                        str3 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str3);
                        i11 |= 1;
                        i4 = 5;
                        i5 = 8;
                        i6 = 7;
                    case 1:
                        list4 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), list4);
                        i11 |= 2;
                        i4 = 5;
                        i5 = 8;
                    case 2:
                        list5 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnWarmupCompleted[2].getValue(), list5);
                        i11 |= 4;
                        i4 = 5;
                        i5 = 8;
                    case 3:
                        i11 |= 8;
                        bottomCtaResponse3 = (BottomCtaResponse) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 3, BottomCtaResponse$.serializer.INSTANCE, bottomCtaResponse3);
                        i4 = 5;
                        i5 = 8;
                    case 4:
                        handlerResponse3 = (HandlerResponse) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 4, TBPermissionHelper.onExtraCallbackWithResult, handlerResponse3);
                        i11 |= 16;
                        i4 = 5;
                    case 5:
                        colorAttributeResponse3 = (ColorAttributeResponse) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, i4, ColorAttributeResponse$.serializer.INSTANCE, colorAttributeResponse3);
                        i11 |= 32;
                    case 6:
                        map5 = (Map) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 6, (jp) lazyArrOnWarmupCompleted[6].getValue(), map5);
                        i11 |= 64;
                    case 7:
                        map3 = (Map) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, i6, (jp) lazyArrOnWarmupCompleted[i6].getValue(), map3);
                        i11 |= 128;
                    case 8:
                        num2 = (Integer) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, i5, getDynamicHeight.onWarmupCompleted, num2);
                        i11 |= 256;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            String str4 = str3;
            BottomCtaResponse bottomCtaResponse4 = bottomCtaResponse3;
            colorAttributeResponse = colorAttributeResponse3;
            map = map3;
            str = str4;
            i = i11;
            num = num2;
            map2 = map5;
            list = list4;
            list2 = list5;
            handlerResponse = handlerResponse3;
            bottomCtaResponse = bottomCtaResponse4;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new DstCardSettingResponse(i, str, list, list2, bottomCtaResponse, handlerResponse, colorAttributeResponse, map2, map, num, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m532deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DstCardSettingResponse dstCardSettingResponse) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(dstCardSettingResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            DstCardSettingResponse.onExtraCallback(dstCardSettingResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dstCardSettingResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        DstCardSettingResponse.onExtraCallback(dstCardSettingResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onWarmupCompleted + 5;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DstCardSettingResponse) obj);
        int i4 = onWarmupCompleted + 125;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 19;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
