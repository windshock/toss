package im.toss.securities.widget.data.model.overview;

import im.toss.securities.widget.data.model.overview.Product;
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
import o.getBgColor;
import o.jp;
import o.r2ExternalSyntheticLambda4;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class Product$$serializer implements aeu2<Product> {
    private static int IAuthTabCallback = 1;
    public static final Product$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 121;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        Product$$serializer product$$serializer = new Product$$serializer();
        INSTANCE = product$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.widget.data.model.overview.Product", product$$serializer, 13);
        setanimationsloop.onWarmupCompleted("dailyProfitLossAmount", false);
        setanimationsloop.onWarmupCompleted("dailyProfitLossRate", false);
        setanimationsloop.onWarmupCompleted("evaluatedAmount", false);
        setanimationsloop.onWarmupCompleted("principalAmount", false);
        setanimationsloop.onWarmupCompleted("profitLossAmount", false);
        setanimationsloop.onWarmupCompleted("profitLossRate", false);
        setanimationsloop.onWarmupCompleted("hasDelisting", false);
        setanimationsloop.onWarmupCompleted("marketType", true);
        setanimationsloop.onWarmupCompleted("sorted", false);
        setanimationsloop.onWarmupCompleted("items", false);
        setanimationsloop.onWarmupCompleted("evaluatedAmountAfterFees", true);
        setanimationsloop.onWarmupCompleted("profitLossAmountAfterFees", true);
        setanimationsloop.onWarmupCompleted("profitLossRateAfterFees", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 13;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private Product$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnNavigationEvent = Product.onNavigationEvent();
        KSerializer<?> kSerializer = OverviewPrice$$serializer.INSTANCE;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback((KSerializer) lazyArrOnNavigationEvent[7].getValue());
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback4 = sp.IAuthTabCallback(OverviewRate$$serializer.INSTANCE);
        getBgColor getbgcolor = getBgColor.IAuthTabCallback;
        KSerializer<?>[] kSerializerArr = {kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, getbgcolor, kSerializerIAuthTabCallback, getbgcolor, r2ExternalSyntheticLambda4.IAuthTabCallback, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3, kSerializerIAuthTabCallback4};
        int i4 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final Product deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        OverviewPrice overviewPrice;
        OverviewPrice overviewPrice2;
        OverviewPrice overviewPrice3;
        OverviewPrice overviewPrice4;
        OverviewPrice overviewPrice5;
        OverviewPrice overviewPrice6;
        List list;
        OverviewRate overviewRate;
        boolean zOnExtraCallbackWithResult;
        boolean z;
        Product.onExtraCallback onextracallback;
        OverviewPrice overviewPrice7;
        OverviewPrice overviewPrice8;
        OverviewPrice overviewPrice9;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = Product.onNavigationEvent();
        int i2 = 9;
        int i3 = 8;
        int i4 = 0;
        OverviewPrice overviewPrice10 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            OverviewPrice$$serializer overviewPrice$$serializer = OverviewPrice$$serializer.INSTANCE;
            OverviewPrice overviewPrice11 = (OverviewPrice) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, overviewPrice$$serializer, (Object) null);
            OverviewPrice overviewPrice12 = (OverviewPrice) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, overviewPrice$$serializer, (Object) null);
            OverviewPrice overviewPrice13 = (OverviewPrice) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, overviewPrice$$serializer, (Object) null);
            OverviewPrice overviewPrice14 = (OverviewPrice) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, overviewPrice$$serializer, (Object) null);
            OverviewPrice overviewPrice15 = (OverviewPrice) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, overviewPrice$$serializer, (Object) null);
            OverviewPrice overviewPrice16 = (OverviewPrice) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, overviewPrice$$serializer, (Object) null);
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6);
            Product.onExtraCallback onextracallback2 = (Product.onExtraCallback) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrOnNavigationEvent[7].getValue(), (Object) null);
            boolean zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8);
            List list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 9, r2ExternalSyntheticLambda4.IAuthTabCallback, (Object) null);
            OverviewPrice overviewPrice17 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, overviewPrice$$serializer, (Object) null);
            OverviewPrice overviewPrice18 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, overviewPrice$$serializer, (Object) null);
            OverviewRate overviewRate2 = (OverviewRate) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, OverviewRate$$serializer.INSTANCE, (Object) null);
            int i7 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 % 2;
            }
            overviewPrice3 = overviewPrice18;
            overviewPrice7 = overviewPrice12;
            overviewPrice8 = overviewPrice17;
            overviewPrice = overviewPrice13;
            overviewPrice4 = overviewPrice15;
            overviewRate = overviewRate2;
            onextracallback = onextracallback2;
            overviewPrice2 = overviewPrice11;
            i4 = 8191;
            overviewPrice6 = overviewPrice14;
            z = zOnExtraCallbackWithResult2;
            list = list2;
            overviewPrice5 = overviewPrice16;
        } else {
            int i9 = 2;
            int i10 = IAuthTabCallback + 35;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            boolean zOnExtraCallbackWithResult3 = false;
            boolean zOnExtraCallbackWithResult4 = false;
            OverviewRate overviewRate3 = null;
            Product.onExtraCallback onextracallback3 = null;
            OverviewPrice overviewPrice19 = null;
            OverviewPrice overviewPrice20 = null;
            OverviewPrice overviewPrice21 = null;
            OverviewPrice overviewPrice22 = null;
            OverviewPrice overviewPrice23 = null;
            OverviewPrice overviewPrice24 = null;
            OverviewPrice overviewPrice25 = null;
            boolean z2 = true;
            List list3 = null;
            while (z2) {
                int i12 = IAuthTabCallback + 95;
                onExtraCallbackWithResult = i12 % 128;
                if (i12 % i9 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        overviewPrice9 = overviewPrice22;
                        z2 = false;
                        overviewRate3 = overviewRate3;
                        i3 = 8;
                        overviewPrice22 = overviewPrice9;
                        i9 = 2;
                    case 0:
                        overviewPrice9 = overviewPrice22;
                        overviewPrice10 = (OverviewPrice) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, OverviewPrice$$serializer.INSTANCE, overviewPrice10);
                        i4 |= 1;
                        overviewRate3 = overviewRate3;
                        i2 = 9;
                        i3 = 8;
                        overviewPrice22 = overviewPrice9;
                        i9 = 2;
                    case 1:
                        i4 |= 2;
                        overviewRate3 = overviewRate3;
                        i3 = 8;
                        i9 = 2;
                        overviewPrice22 = (OverviewPrice) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, OverviewPrice$$serializer.INSTANCE, overviewPrice22);
                        i2 = 9;
                    case 2:
                        i9 = 2;
                        overviewPrice24 = (OverviewPrice) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, OverviewPrice$$serializer.INSTANCE, overviewPrice24);
                        i4 |= 4;
                        overviewPrice25 = overviewPrice25;
                        overviewPrice23 = overviewPrice23;
                        i2 = 9;
                        i3 = 8;
                    case 3:
                        overviewPrice23 = (OverviewPrice) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, OverviewPrice$$serializer.INSTANCE, overviewPrice23);
                        i4 |= 8;
                        i2 = 9;
                        i3 = 8;
                        i9 = 2;
                    case 4:
                        overviewPrice25 = (OverviewPrice) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, OverviewPrice$$serializer.INSTANCE, overviewPrice25);
                        i4 |= 16;
                        i2 = 9;
                        i3 = 8;
                        i9 = 2;
                    case 5:
                        overviewPrice21 = (OverviewPrice) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, OverviewPrice$$serializer.INSTANCE, overviewPrice21);
                        i4 |= 32;
                        i2 = 9;
                        i3 = 8;
                        i9 = 2;
                    case 6:
                        zOnExtraCallbackWithResult3 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6);
                        i4 |= 64;
                        i9 = 2;
                        i2 = 9;
                    case 7:
                        onextracallback3 = (Product.onExtraCallback) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrOnNavigationEvent[7].getValue(), onextracallback3);
                        i4 |= 128;
                        i2 = 9;
                        i9 = 2;
                    case 8:
                        zOnExtraCallbackWithResult4 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3);
                        i4 |= 256;
                        i9 = 2;
                    case 9:
                        list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i2, r2ExternalSyntheticLambda4.IAuthTabCallback, list3);
                        i4 |= 512;
                        i9 = 2;
                    case 10:
                        overviewPrice20 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, OverviewPrice$$serializer.INSTANCE, overviewPrice20);
                        i4 |= 1024;
                        i9 = 2;
                    case 11:
                        overviewPrice19 = (OverviewPrice) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, OverviewPrice$$serializer.INSTANCE, overviewPrice19);
                        i4 |= 2048;
                        i9 = 2;
                    case 12:
                        overviewRate3 = (OverviewRate) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, OverviewRate$$serializer.INSTANCE, overviewRate3);
                        i4 |= 4096;
                        i9 = 2;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            overviewPrice = overviewPrice24;
            overviewPrice2 = overviewPrice10;
            overviewPrice3 = overviewPrice19;
            overviewPrice4 = overviewPrice25;
            overviewPrice5 = overviewPrice21;
            overviewPrice6 = overviewPrice23;
            list = list3;
            overviewRate = overviewRate3;
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult3;
            z = zOnExtraCallbackWithResult4;
            OverviewPrice overviewPrice26 = overviewPrice20;
            onextracallback = onextracallback3;
            overviewPrice7 = overviewPrice22;
            overviewPrice8 = overviewPrice26;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new Product(i4, overviewPrice2, overviewPrice7, overviewPrice, overviewPrice6, overviewPrice4, overviewPrice5, zOnExtraCallbackWithResult, onextracallback, z, list, overviewPrice8, overviewPrice3, overviewRate, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m53deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Product productDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
        return productDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull Product product) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(product, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            Product.onExtraCallbackWithResult(product, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(product, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        Product.onExtraCallbackWithResult(product, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (Product) obj);
        int i4 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 38 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
