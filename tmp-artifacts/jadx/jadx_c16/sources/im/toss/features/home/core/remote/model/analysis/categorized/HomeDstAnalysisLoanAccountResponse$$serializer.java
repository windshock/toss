package im.toss.features.home.core.remote.model.analysis.categorized;

import im.toss.features.home.core.remote.model.dst.handler.HandlerResponse;
import im.toss.features.home.core.remote.model.dst.property.ColorAttributeResponse;
import im.toss.features.home.core.remote.model.dst.property.ColorAttributeResponse$;
import im.toss.features.home.core.remote.model.dst.widget.BottomCtaResponse;
import im.toss.features.home.core.remote.model.dst.widget.BottomCtaResponse$;
import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;
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
public final /* synthetic */ class HomeDstAnalysisLoanAccountResponse$$serializer implements aeu2<HomeDstAnalysisLoanAccountResponse> {
    private static int IAuthTabCallback = 1;
    public static final HomeDstAnalysisLoanAccountResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 61;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        HomeDstAnalysisLoanAccountResponse$$serializer homeDstAnalysisLoanAccountResponse$$serializer = new HomeDstAnalysisLoanAccountResponse$$serializer();
        INSTANCE = homeDstAnalysisLoanAccountResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.analysis.categorized.HomeDstAnalysisLoanAccountResponse", homeDstAnalysisLoanAccountResponse$$serializer, 10);
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
        int i = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 59 / 0;
        }
    }

    private HomeDstAnalysisLoanAccountResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        Lazy[] lazyArr = (Lazy[]) HomeDstAnalysisLoanAccountResponse.onNavigationEvent(-1820687358, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[0], 1820687359, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent);
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback((KSerializer) lazyArr[1].getValue()), sp.IAuthTabCallback((KSerializer) lazyArr[2].getValue()), sp.IAuthTabCallback(BottomCtaResponse$.serializer.INSTANCE), sp.IAuthTabCallback(TBPermissionHelper.onExtraCallbackWithResult), sp.IAuthTabCallback(ColorAttributeResponse$.serializer.INSTANCE), sp.IAuthTabCallback((KSerializer) lazyArr[6].getValue()), sp.IAuthTabCallback((KSerializer) lazyArr[7].getValue()), lazyArr[8].getValue(), lazyArr[9].getValue()};
        int i4 = onExtraCallback + 5;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HomeDstAnalysisLoanAccountResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Map map;
        List list;
        List list2;
        List list3;
        ColorAttributeResponse colorAttributeResponse;
        int i;
        HandlerResponse handlerResponse;
        BottomCtaResponse bottomCtaResponse;
        String str;
        Map map2;
        List list4;
        BottomCtaResponse bottomCtaResponse2;
        HandlerResponse handlerResponse2;
        String str2;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 107;
        onExtraCallback = i3 % 128;
        List list5 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        Lazy[] lazyArr = (Lazy[]) HomeDstAnalysisLoanAccountResponse.onNavigationEvent(-1820687358, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[0], 1820687359, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2);
        int i4 = 9;
        int i5 = 7;
        int i6 = 6;
        int i7 = 8;
        if (ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            String str3 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            List list6 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArr[1].getValue(), (Object) null);
            List list7 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArr[2].getValue(), (Object) null);
            BottomCtaResponse bottomCtaResponse3 = (BottomCtaResponse) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 3, BottomCtaResponse$.serializer.INSTANCE, (Object) null);
            HandlerResponse handlerResponse3 = (HandlerResponse) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 4, TBPermissionHelper.onExtraCallbackWithResult, (Object) null);
            ColorAttributeResponse colorAttributeResponse2 = (ColorAttributeResponse) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 5, ColorAttributeResponse$.serializer.INSTANCE, (Object) null);
            Map map3 = (Map) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 6, (jp) lazyArr[6].getValue(), (Object) null);
            Map map4 = (Map) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArr[7].getValue(), (Object) null);
            List list8 = (List) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 8, (jp) lazyArr[8].getValue(), (Object) null);
            list4 = list7;
            list2 = (List) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 9, (jp) lazyArr[9].getValue(), (Object) null);
            str = str3;
            i = 1023;
            list = list6;
            colorAttributeResponse = colorAttributeResponse2;
            bottomCtaResponse = bottomCtaResponse3;
            handlerResponse = handlerResponse3;
            map2 = map4;
            map = map3;
            list3 = list8;
        } else {
            int i8 = 0;
            Map map5 = null;
            List list9 = null;
            List list10 = null;
            ColorAttributeResponse colorAttributeResponse3 = null;
            List list11 = null;
            String str4 = null;
            BottomCtaResponse bottomCtaResponse4 = null;
            HandlerResponse handlerResponse4 = null;
            boolean z = true;
            Map map6 = null;
            while (z) {
                int iOnNavigationEvent3 = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent3) {
                    case -1:
                        bottomCtaResponse2 = bottomCtaResponse4;
                        handlerResponse2 = handlerResponse4;
                        str2 = str4;
                        z = false;
                        str4 = str2;
                        handlerResponse4 = handlerResponse2;
                        bottomCtaResponse4 = bottomCtaResponse2;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        i7 = 8;
                    case 0:
                        bottomCtaResponse2 = bottomCtaResponse4;
                        handlerResponse2 = handlerResponse4;
                        str2 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str4);
                        i8 |= 1;
                        int i9 = onExtraCallback + 13;
                        onNavigationEvent = i9 % 128;
                        int i10 = i9 % 2;
                        str4 = str2;
                        handlerResponse4 = handlerResponse2;
                        bottomCtaResponse4 = bottomCtaResponse2;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        i7 = 8;
                    case 1:
                        list9 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArr[1].getValue(), list9);
                        i8 |= 2;
                        handlerResponse4 = handlerResponse4;
                        bottomCtaResponse4 = bottomCtaResponse4;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                    case 2:
                        list11 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArr[2].getValue(), list11);
                        i8 |= 4;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                    case 3:
                        bottomCtaResponse4 = (BottomCtaResponse) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 3, BottomCtaResponse$.serializer.INSTANCE, bottomCtaResponse4);
                        i8 |= 8;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                    case 4:
                        handlerResponse4 = (HandlerResponse) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 4, TBPermissionHelper.onExtraCallbackWithResult, handlerResponse4);
                        i8 |= 16;
                        i4 = 9;
                        i5 = 7;
                    case 5:
                        colorAttributeResponse3 = (ColorAttributeResponse) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 5, ColorAttributeResponse$.serializer.INSTANCE, colorAttributeResponse3);
                        i8 |= 32;
                        i4 = 9;
                    case 6:
                        map5 = (Map) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, i6, (jp) lazyArr[i6].getValue(), map5);
                        i8 |= 64;
                    case 7:
                        map6 = (Map) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, i5, (jp) lazyArr[i5].getValue(), map6);
                        i8 |= 128;
                    case 8:
                        list10 = (List) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, i7, (jp) lazyArr[i7].getValue(), list10);
                        i8 |= 256;
                    case 9:
                        list5 = (List) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, i4, (jp) lazyArr[i4].getValue(), list5);
                        i8 |= 512;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent3);
                }
            }
            String str5 = str4;
            int i11 = onExtraCallback + 95;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            map = map5;
            list = list9;
            list2 = list5;
            list3 = list10;
            colorAttributeResponse = colorAttributeResponse3;
            i = i8;
            handlerResponse = handlerResponse4;
            bottomCtaResponse = bottomCtaResponse4;
            str = str5;
            map2 = map6;
            list4 = list11;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new HomeDstAnalysisLoanAccountResponse(i, str, list, list4, bottomCtaResponse, handlerResponse, colorAttributeResponse, map, map2, list3, list2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m551deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeDstAnalysisLoanAccountResponse homeDstAnalysisLoanAccountResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(homeDstAnalysisLoanAccountResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            HomeDstAnalysisLoanAccountResponse.onWarmupCompleted(homeDstAnalysisLoanAccountResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(homeDstAnalysisLoanAccountResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        HomeDstAnalysisLoanAccountResponse.onWarmupCompleted(homeDstAnalysisLoanAccountResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 64 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeDstAnalysisLoanAccountResponse) obj);
        int i4 = onNavigationEvent + 31;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 72 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onExtraCallback + 117;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
