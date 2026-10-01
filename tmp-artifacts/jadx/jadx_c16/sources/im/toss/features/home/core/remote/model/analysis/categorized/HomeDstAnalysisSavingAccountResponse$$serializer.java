package im.toss.features.home.core.remote.model.analysis.categorized;

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
public final /* synthetic */ class HomeDstAnalysisSavingAccountResponse$$serializer implements aeu2<HomeDstAnalysisSavingAccountResponse> {
    private static int IAuthTabCallback = 0;
    public static final HomeDstAnalysisSavingAccountResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 47;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 1;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        HomeDstAnalysisSavingAccountResponse$$serializer homeDstAnalysisSavingAccountResponse$$serializer = new HomeDstAnalysisSavingAccountResponse$$serializer();
        INSTANCE = homeDstAnalysisSavingAccountResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.analysis.categorized.HomeDstAnalysisSavingAccountResponse", homeDstAnalysisSavingAccountResponse$$serializer, 10);
        setanimationsloop.onWarmupCompleted("navigationBarTitle", true);
        setanimationsloop.onWarmupCompleted("navigationBarRightItems", true);
        setanimationsloop.onWarmupCompleted("sections", true);
        setanimationsloop.onWarmupCompleted("bottomCTA", true);
        setanimationsloop.onWarmupCompleted("initializeHandler", true);
        setanimationsloop.onWarmupCompleted("backgroundColor", true);
        setanimationsloop.onWarmupCompleted("state", true);
        setanimationsloop.onWarmupCompleted("refreshGuide", true);
        setanimationsloop.onWarmupCompleted("overviewSections", false);
        setanimationsloop.onWarmupCompleted("groupedByAccountSections", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private HomeDstAnalysisSavingAccountResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrAsBinder = HomeDstAnalysisSavingAccountResponse.asBinder();
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback((KSerializer) lazyArrAsBinder[1].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrAsBinder[2].getValue()), sp.IAuthTabCallback(BottomCtaResponse$.serializer.INSTANCE), sp.IAuthTabCallback(TBPermissionHelper.onExtraCallbackWithResult), sp.IAuthTabCallback(ColorAttributeResponse$.serializer.INSTANCE), sp.IAuthTabCallback((KSerializer) lazyArrAsBinder[6].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrAsBinder[7].getValue()), lazyArrAsBinder[8].getValue(), lazyArrAsBinder[9].getValue()};
        int i4 = onExtraCallback + 115;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HomeDstAnalysisSavingAccountResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        BottomCtaResponse bottomCtaResponse;
        int i;
        HandlerResponse handlerResponse;
        Map map;
        Map map2;
        ColorAttributeResponse colorAttributeResponse;
        List list;
        List list2;
        List list3;
        List list4;
        String str;
        BottomCtaResponse bottomCtaResponse2;
        HandlerResponse handlerResponse2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrAsBinder = HomeDstAnalysisSavingAccountResponse.asBinder();
        int i3 = 9;
        int i4 = 7;
        int i5 = 6;
        int i6 = 8;
        List list5 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            Map map3 = null;
            List list6 = null;
            Map map4 = null;
            ColorAttributeResponse colorAttributeResponse2 = null;
            List list7 = null;
            List list8 = null;
            String str2 = null;
            BottomCtaResponse bottomCtaResponse3 = null;
            HandlerResponse handlerResponse3 = null;
            int i7 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        bottomCtaResponse2 = bottomCtaResponse3;
                        handlerResponse2 = handlerResponse3;
                        z = false;
                        handlerResponse3 = handlerResponse2;
                        bottomCtaResponse3 = bottomCtaResponse2;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                    case 0:
                        bottomCtaResponse2 = bottomCtaResponse3;
                        handlerResponse2 = handlerResponse3;
                        String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str2);
                        i7 |= 1;
                        int i8 = onNavigationEvent + 91;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % 2;
                        str2 = str3;
                        handlerResponse3 = handlerResponse2;
                        bottomCtaResponse3 = bottomCtaResponse2;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                    case 1:
                        list7 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrAsBinder[1].getValue(), list7);
                        i7 |= 2;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                    case 2:
                        bottomCtaResponse2 = bottomCtaResponse3;
                        handlerResponse2 = handlerResponse3;
                        list8 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrAsBinder[2].getValue(), list8);
                        i7 |= 4;
                        int i10 = onNavigationEvent + 51;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
                        handlerResponse3 = handlerResponse2;
                        bottomCtaResponse3 = bottomCtaResponse2;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                    case 3:
                        i7 |= 8;
                        bottomCtaResponse3 = (BottomCtaResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BottomCtaResponse$.serializer.INSTANCE, bottomCtaResponse3);
                        i3 = 9;
                        i4 = 7;
                        i6 = 8;
                    case 4:
                        i7 |= 16;
                        handlerResponse3 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TBPermissionHelper.onExtraCallbackWithResult, handlerResponse3);
                        i3 = 9;
                        i6 = 8;
                    case 5:
                        colorAttributeResponse2 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ColorAttributeResponse$.serializer.INSTANCE, colorAttributeResponse2);
                        i7 |= 32;
                        i3 = 9;
                    case 6:
                        map3 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, (jp) lazyArrAsBinder[i5].getValue(), map3);
                        i7 |= 64;
                    case 7:
                        map4 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, (jp) lazyArrAsBinder[i4].getValue(), map4);
                        i7 |= 128;
                    case 8:
                        list6 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i6, (jp) lazyArrAsBinder[i6].getValue(), list6);
                        i7 |= 256;
                    case 9:
                        list5 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i3, (jp) lazyArrAsBinder[i3].getValue(), list5);
                        i7 |= 512;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            HandlerResponse handlerResponse4 = handlerResponse3;
            map = map3;
            list = list6;
            map2 = map4;
            colorAttributeResponse = colorAttributeResponse2;
            i = i7;
            handlerResponse = handlerResponse4;
            str = str2;
            list2 = list7;
            bottomCtaResponse = bottomCtaResponse3;
            list3 = list5;
            list4 = list8;
        } else {
            int i12 = onNavigationEvent + 107;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            List list9 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrAsBinder[1].getValue(), (Object) null);
            List list10 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrAsBinder[2].getValue(), (Object) null);
            BottomCtaResponse bottomCtaResponse4 = (BottomCtaResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BottomCtaResponse$.serializer.INSTANCE, (Object) null);
            HandlerResponse handlerResponse5 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TBPermissionHelper.onExtraCallbackWithResult, (Object) null);
            ColorAttributeResponse colorAttributeResponse3 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ColorAttributeResponse$.serializer.INSTANCE, (Object) null);
            Map map5 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, (jp) lazyArrAsBinder[6].getValue(), (Object) null);
            bottomCtaResponse = bottomCtaResponse4;
            i = 1023;
            handlerResponse = handlerResponse5;
            map = map5;
            map2 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrAsBinder[7].getValue(), (Object) null);
            colorAttributeResponse = colorAttributeResponse3;
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 8, (jp) lazyArrAsBinder[8].getValue(), (Object) null);
            list2 = list9;
            list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 9, (jp) lazyArrAsBinder[9].getValue(), (Object) null);
            list4 = list10;
            str = str4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeDstAnalysisSavingAccountResponse(i, str, list2, list4, bottomCtaResponse, handlerResponse, colorAttributeResponse, map, map2, list, list3, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m552deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        HomeDstAnalysisSavingAccountResponse homeDstAnalysisSavingAccountResponseDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 39;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return homeDstAnalysisSavingAccountResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeDstAnalysisSavingAccountResponse homeDstAnalysisSavingAccountResponse) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(homeDstAnalysisSavingAccountResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            HomeDstAnalysisSavingAccountResponse.onNavigationEvent(homeDstAnalysisSavingAccountResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(homeDstAnalysisSavingAccountResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        HomeDstAnalysisSavingAccountResponse.onNavigationEvent(homeDstAnalysisSavingAccountResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeDstAnalysisSavingAccountResponse) obj);
        int i4 = onNavigationEvent + 103;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 121;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
