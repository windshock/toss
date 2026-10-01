package im.toss.features.home.core.remote.model.card;

import com.google.android.gms.internal.firebase-auth-api.zzmr;
import im.toss.features.home.core.remote.model.TransactionToggleOptionResponse;
import im.toss.features.home.core.remote.model.TransactionToggleOptionResponse$$serializer;
import im.toss.features.home.core.remote.model.dst.handler.HandlerResponse;
import im.toss.features.home.core.remote.model.dst.property.ColorAttributeResponse;
import im.toss.features.home.core.remote.model.dst.property.ColorAttributeResponse$;
import im.toss.features.home.core.remote.model.dst.widget.BottomCtaResponse;
import im.toss.features.home.core.remote.model.dst.widget.BottomCtaResponse$;
import im.toss.features.home.core.remote.model.dst.widget.YearMonthSelectorAttributeResponse;
import im.toss.features.home.core.remote.model.dst.widget.YearMonthSelectorAttributeResponse$;
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
public final /* synthetic */ class CardTransactionsResponse$$serializer implements aeu2<CardTransactionsResponse> {
    private static int IAuthTabCallback = 0;
    public static final CardTransactionsResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 69;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 1;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 27 / 0;
        }
        return serialDescriptor;
    }

    static {
        CardTransactionsResponse$$serializer cardTransactionsResponse$$serializer = new CardTransactionsResponse$$serializer();
        INSTANCE = cardTransactionsResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.card.CardTransactionsResponse", cardTransactionsResponse$$serializer, 11);
        setanimationsloop.onWarmupCompleted("navigationBarTitle", true);
        setanimationsloop.onWarmupCompleted("navigationBarRightItems", true);
        setanimationsloop.onWarmupCompleted("sections", true);
        setanimationsloop.onWarmupCompleted("bottomCTA", true);
        setanimationsloop.onWarmupCompleted("initializeHandler", true);
        setanimationsloop.onWarmupCompleted("backgroundColor", true);
        setanimationsloop.onWarmupCompleted("state", true);
        setanimationsloop.onWarmupCompleted("refreshGuide", true);
        setanimationsloop.onWarmupCompleted("yearMonthSelector", false);
        setanimationsloop.onWarmupCompleted("transactionToggleOption", false);
        setanimationsloop.onWarmupCompleted("referenceId", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 49;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private CardTransactionsResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArr = (Lazy[]) CardTransactionsResponse.onExtraCallbackWithResult(new Object[0], zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 1359615139, zzmr.onExtraCallbackWithResult(), -1359615139, zzmr.onExtraCallbackWithResult());
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback((KSerializer) lazyArr[1].getValue()), sp.IAuthTabCallback((KSerializer) lazyArr[2].getValue()), sp.IAuthTabCallback(BottomCtaResponse$.serializer.INSTANCE), sp.IAuthTabCallback(TBPermissionHelper.onExtraCallbackWithResult), sp.IAuthTabCallback(ColorAttributeResponse$.serializer.INSTANCE), sp.IAuthTabCallback((KSerializer) lazyArr[6].getValue()), sp.IAuthTabCallback((KSerializer) lazyArr[7].getValue()), YearMonthSelectorAttributeResponse$.serializer.INSTANCE, sp.IAuthTabCallback(TransactionToggleOptionResponse$$serializer.INSTANCE), kSerializer};
        int i4 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CardTransactionsResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        List list;
        String strAsInterface;
        HandlerResponse handlerResponse;
        List list2;
        String str;
        ColorAttributeResponse colorAttributeResponse;
        BottomCtaResponse bottomCtaResponse;
        Map map;
        YearMonthSelectorAttributeResponse yearMonthSelectorAttributeResponse;
        TransactionToggleOptionResponse transactionToggleOptionResponse;
        Map map2;
        YearMonthSelectorAttributeResponse yearMonthSelectorAttributeResponse2;
        HandlerResponse handlerResponse2;
        Map map3;
        int i2 = 2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArr = (Lazy[]) CardTransactionsResponse.onExtraCallbackWithResult(new Object[0], zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 1359615139, zzmr.onExtraCallbackWithResult(), -1359615139, zzmr.onExtraCallbackWithResult());
        int i4 = 9;
        Map map4 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            List list3 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArr[1].getValue(), (Object) null);
            List list4 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArr[2].getValue(), (Object) null);
            bottomCtaResponse = (BottomCtaResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BottomCtaResponse$.serializer.INSTANCE, (Object) null);
            HandlerResponse handlerResponse3 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TBPermissionHelper.onExtraCallbackWithResult, (Object) null);
            colorAttributeResponse = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ColorAttributeResponse$.serializer.INSTANCE, (Object) null);
            Map map5 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, (jp) lazyArr[6].getValue(), (Object) null);
            Map map6 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArr[7].getValue(), (Object) null);
            YearMonthSelectorAttributeResponse yearMonthSelectorAttributeResponse3 = (YearMonthSelectorAttributeResponse) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 8, YearMonthSelectorAttributeResponse$.serializer.INSTANCE, (Object) null);
            TransactionToggleOptionResponse transactionToggleOptionResponse2 = (TransactionToggleOptionResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, TransactionToggleOptionResponse$$serializer.INSTANCE, (Object) null);
            i = 2047;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 10);
            transactionToggleOptionResponse = transactionToggleOptionResponse2;
            handlerResponse = handlerResponse3;
            map2 = map5;
            yearMonthSelectorAttributeResponse = yearMonthSelectorAttributeResponse3;
            map = map6;
            list2 = list3;
            list = list4;
        } else {
            i = 0;
            boolean z = true;
            List list5 = null;
            list = null;
            String str2 = null;
            YearMonthSelectorAttributeResponse yearMonthSelectorAttributeResponse4 = null;
            TransactionToggleOptionResponse transactionToggleOptionResponse3 = null;
            ColorAttributeResponse colorAttributeResponse2 = null;
            BottomCtaResponse bottomCtaResponse2 = null;
            HandlerResponse handlerResponse4 = null;
            Map map7 = null;
            strAsInterface = null;
            while (z) {
                int i7 = onExtraCallbackWithResult + 121;
                onWarmupCompleted = i7 % 128;
                if (i7 % i2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        yearMonthSelectorAttributeResponse2 = yearMonthSelectorAttributeResponse4;
                        handlerResponse2 = handlerResponse4;
                        map3 = map7;
                        z = false;
                        handlerResponse4 = handlerResponse2;
                        map7 = map3;
                        yearMonthSelectorAttributeResponse4 = yearMonthSelectorAttributeResponse2;
                        i2 = 2;
                        i4 = 9;
                    case 0:
                        yearMonthSelectorAttributeResponse2 = yearMonthSelectorAttributeResponse4;
                        handlerResponse2 = handlerResponse4;
                        map3 = map7;
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str2);
                        i |= 1;
                        handlerResponse4 = handlerResponse2;
                        map7 = map3;
                        yearMonthSelectorAttributeResponse4 = yearMonthSelectorAttributeResponse2;
                        i2 = 2;
                        i4 = 9;
                    case 1:
                        yearMonthSelectorAttributeResponse2 = yearMonthSelectorAttributeResponse4;
                        list5 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArr[1].getValue(), list5);
                        i |= 2;
                        yearMonthSelectorAttributeResponse4 = yearMonthSelectorAttributeResponse2;
                        i2 = 2;
                        i4 = 9;
                    case 2:
                        int i8 = i2;
                        list = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i8, (jp) lazyArr[i8].getValue(), list);
                        i |= 4;
                        i2 = i8;
                        yearMonthSelectorAttributeResponse4 = yearMonthSelectorAttributeResponse4;
                        i4 = 9;
                    case 3:
                        yearMonthSelectorAttributeResponse2 = yearMonthSelectorAttributeResponse4;
                        bottomCtaResponse2 = (BottomCtaResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BottomCtaResponse$.serializer.INSTANCE, bottomCtaResponse2);
                        i |= 8;
                        yearMonthSelectorAttributeResponse4 = yearMonthSelectorAttributeResponse2;
                        i2 = 2;
                        i4 = 9;
                    case 4:
                        yearMonthSelectorAttributeResponse2 = yearMonthSelectorAttributeResponse4;
                        handlerResponse4 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TBPermissionHelper.onExtraCallbackWithResult, handlerResponse4);
                        i |= 16;
                        yearMonthSelectorAttributeResponse4 = yearMonthSelectorAttributeResponse2;
                        i2 = 2;
                        i4 = 9;
                    case 5:
                        colorAttributeResponse2 = (ColorAttributeResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ColorAttributeResponse$.serializer.INSTANCE, colorAttributeResponse2);
                        i |= 32;
                        map7 = map7;
                        i2 = 2;
                        i4 = 9;
                    case 6:
                        map7 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, (jp) lazyArr[6].getValue(), map7);
                        i |= 64;
                        i4 = 9;
                    case 7:
                        map4 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArr[7].getValue(), map4);
                        i |= 128;
                        i4 = 9;
                    case 8:
                        yearMonthSelectorAttributeResponse4 = (YearMonthSelectorAttributeResponse) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 8, YearMonthSelectorAttributeResponse$.serializer.INSTANCE, yearMonthSelectorAttributeResponse4);
                        i |= 256;
                        i4 = 9;
                    case 9:
                        transactionToggleOptionResponse3 = (TransactionToggleOptionResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, TransactionToggleOptionResponse$$serializer.INSTANCE, transactionToggleOptionResponse3);
                        i |= 512;
                        int i9 = onExtraCallbackWithResult + 29;
                        onWarmupCompleted = i9 % 128;
                        int i10 = i9 % i2;
                        i4 = 9;
                    case 10:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 10);
                        i |= 1024;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            YearMonthSelectorAttributeResponse yearMonthSelectorAttributeResponse5 = yearMonthSelectorAttributeResponse4;
            handlerResponse = handlerResponse4;
            list2 = list5;
            str = str2;
            colorAttributeResponse = colorAttributeResponse2;
            bottomCtaResponse = bottomCtaResponse2;
            map = map4;
            yearMonthSelectorAttributeResponse = yearMonthSelectorAttributeResponse5;
            transactionToggleOptionResponse = transactionToggleOptionResponse3;
            map2 = map7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CardTransactionsResponse(i, str, list2, list, bottomCtaResponse, handlerResponse, colorAttributeResponse, map2, map, yearMonthSelectorAttributeResponse, transactionToggleOptionResponse, strAsInterface, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m559deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CardTransactionsResponse cardTransactionsResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(cardTransactionsResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CardTransactionsResponse.onWarmupCompleted(cardTransactionsResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 67;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CardTransactionsResponse) obj);
        int i4 = onExtraCallbackWithResult + 9;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
