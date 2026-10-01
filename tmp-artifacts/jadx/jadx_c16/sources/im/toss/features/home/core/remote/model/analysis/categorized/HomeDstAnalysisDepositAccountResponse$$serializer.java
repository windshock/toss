package im.toss.features.home.core.remote.model.analysis.categorized;

import com.google.firebase.messaging.FcmBroadcastProcessor$;
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
public final /* synthetic */ class HomeDstAnalysisDepositAccountResponse$$serializer implements aeu2<HomeDstAnalysisDepositAccountResponse> {
    private static int IAuthTabCallback = 1;
    public static final HomeDstAnalysisDepositAccountResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 75;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        HomeDstAnalysisDepositAccountResponse$$serializer homeDstAnalysisDepositAccountResponse$$serializer = new HomeDstAnalysisDepositAccountResponse$$serializer();
        INSTANCE = homeDstAnalysisDepositAccountResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.analysis.categorized.HomeDstAnalysisDepositAccountResponse", homeDstAnalysisDepositAccountResponse$$serializer, 10);
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
        int i = IAuthTabCallback + 41;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private HomeDstAnalysisDepositAccountResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArr = (Lazy[]) HomeDstAnalysisDepositAccountResponse.onWarmupCompleted(new Object[0], FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1667992769, -1667992768, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback((KSerializer) lazyArr[1].getValue()), sp.IAuthTabCallback((KSerializer) lazyArr[2].getValue()), sp.IAuthTabCallback(BottomCtaResponse$.serializer.INSTANCE), sp.IAuthTabCallback(TBPermissionHelper.onExtraCallbackWithResult), sp.IAuthTabCallback(ColorAttributeResponse$.serializer.INSTANCE), sp.IAuthTabCallback((KSerializer) lazyArr[6].getValue()), sp.IAuthTabCallback((KSerializer) lazyArr[7].getValue()), lazyArr[8].getValue(), lazyArr[9].getValue()};
        int i4 = onNavigationEvent + 17;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HomeDstAnalysisDepositAccountResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        BottomCtaResponse bottomCtaResponse;
        List list;
        int i;
        HandlerResponse handlerResponse;
        ColorAttributeResponse colorAttributeResponse;
        Map map;
        Map map2;
        List list2;
        List list3;
        List list4;
        String str;
        List list5;
        BottomCtaResponse bottomCtaResponse2;
        HandlerResponse handlerResponse2;
        ColorAttributeResponse colorAttributeResponse2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArr = (Lazy[]) HomeDstAnalysisDepositAccountResponse.onWarmupCompleted(new Object[0], FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1667992769, -1667992768, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
        int i3 = 9;
        int i4 = 7;
        int i5 = 6;
        int i6 = 8;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i7 = 0;
            boolean z = true;
            ColorAttributeResponse colorAttributeResponse3 = null;
            List list6 = null;
            Map map3 = null;
            Map map4 = null;
            List list7 = null;
            List list8 = null;
            List list9 = null;
            String str2 = null;
            BottomCtaResponse bottomCtaResponse3 = null;
            HandlerResponse handlerResponse3 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        list5 = list9;
                        bottomCtaResponse2 = bottomCtaResponse3;
                        handlerResponse2 = handlerResponse3;
                        colorAttributeResponse2 = colorAttributeResponse3;
                        z = false;
                        handlerResponse3 = handlerResponse2;
                        bottomCtaResponse3 = bottomCtaResponse2;
                        colorAttributeResponse3 = colorAttributeResponse2;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        list9 = list5;
                        i6 = 8;
                    case 0:
                        list5 = list9;
                        bottomCtaResponse2 = bottomCtaResponse3;
                        handlerResponse2 = handlerResponse3;
                        colorAttributeResponse2 = colorAttributeResponse3;
                        i7 |= 1;
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str2);
                        handlerResponse3 = handlerResponse2;
                        bottomCtaResponse3 = bottomCtaResponse2;
                        colorAttributeResponse3 = colorAttributeResponse2;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        list9 = list5;
                        i6 = 8;
                    case 1:
                        list9 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArr[1].getValue(), list9);
                        i7 |= 2;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                    case 2:
                        list6 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArr[2].getValue(), list6);
                        i7 |= 4;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                    case 3:
                        i7 |= 8;
                        bottomCtaResponse3 = (BottomCtaResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BottomCtaResponse$.serializer.INSTANCE, bottomCtaResponse3);
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                    case 4:
                        HandlerResponse handlerResponse4 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TBPermissionHelper.onExtraCallbackWithResult, handlerResponse3);
                        i7 |= 16;
                        int i8 = onExtraCallback + 5;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                        handlerResponse3 = handlerResponse4;
                        i3 = 9;
                        i6 = 8;
                    case 5:
                        colorAttributeResponse3 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ColorAttributeResponse$.serializer.INSTANCE, colorAttributeResponse3);
                        i7 |= 32;
                        i3 = 9;
                    case 6:
                        map4 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, (jp) lazyArr[i5].getValue(), map4);
                        i7 |= 64;
                    case 7:
                        map3 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, (jp) lazyArr[i4].getValue(), map3);
                        i7 |= 128;
                    case 8:
                        list7 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i6, (jp) lazyArr[i6].getValue(), list7);
                        i7 |= 256;
                    case 9:
                        list8 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i3, (jp) lazyArr[i3].getValue(), list8);
                        i7 |= 512;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            HandlerResponse handlerResponse5 = handlerResponse3;
            list = list6;
            map2 = map3;
            map = map4;
            i = i7;
            handlerResponse = handlerResponse5;
            bottomCtaResponse = bottomCtaResponse3;
            str = str2;
            list4 = list9;
            list2 = list7;
            list3 = list8;
            colorAttributeResponse = colorAttributeResponse3;
        } else {
            int i10 = onNavigationEvent + 1;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            List list10 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArr[1].getValue(), (Object) null);
            List list11 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArr[2].getValue(), (Object) null);
            BottomCtaResponse bottomCtaResponse4 = (BottomCtaResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BottomCtaResponse$.serializer.INSTANCE, (Object) null);
            HandlerResponse handlerResponse6 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TBPermissionHelper.onExtraCallbackWithResult, (Object) null);
            ColorAttributeResponse colorAttributeResponse4 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ColorAttributeResponse$.serializer.INSTANCE, (Object) null);
            Map map5 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, (jp) lazyArr[6].getValue(), (Object) null);
            Map map6 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArr[7].getValue(), (Object) null);
            List list12 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 8, (jp) lazyArr[8].getValue(), (Object) null);
            List list13 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 9, (jp) lazyArr[9].getValue(), (Object) null);
            int i12 = onNavigationEvent + 29;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            bottomCtaResponse = bottomCtaResponse4;
            list = list11;
            i = 1023;
            handlerResponse = handlerResponse6;
            colorAttributeResponse = colorAttributeResponse4;
            map = map5;
            map2 = map6;
            list2 = list12;
            list3 = list13;
            list4 = list10;
            str = str3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        HomeDstAnalysisDepositAccountResponse homeDstAnalysisDepositAccountResponse = new HomeDstAnalysisDepositAccountResponse(i, str, list4, list, bottomCtaResponse, handlerResponse, colorAttributeResponse, map, map2, list2, list3, (okycx) null);
        int i14 = onExtraCallback + 57;
        onNavigationEvent = i14 % 128;
        if (i14 % 2 != 0) {
            return homeDstAnalysisDepositAccountResponse;
        }
        throw null;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m550deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        HomeDstAnalysisDepositAccountResponse homeDstAnalysisDepositAccountResponseDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 7;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return homeDstAnalysisDepositAccountResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeDstAnalysisDepositAccountResponse homeDstAnalysisDepositAccountResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(homeDstAnalysisDepositAccountResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HomeDstAnalysisDepositAccountResponse.IAuthTabCallback(homeDstAnalysisDepositAccountResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 97;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeDstAnalysisDepositAccountResponse) obj);
        if (i3 == 0) {
            int i4 = 2 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 65;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
