package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.ConsumptionAmountTopLocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getDynamicHeight;
import o.getServiceBeans;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionAmountTopLocal$Title$Numeric$$serializer implements aeu2<ConsumptionAmountTopLocal.Title.Numeric> {
    private static int IAuthTabCallback = 0;
    public static final ConsumptionAmountTopLocal$Title$Numeric$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 51;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 67;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return serialDescriptor;
        }
        obj.hashCode();
        throw null;
    }

    static {
        ConsumptionAmountTopLocal$Title$Numeric$$serializer consumptionAmountTopLocal$Title$Numeric$$serializer = new ConsumptionAmountTopLocal$Title$Numeric$$serializer();
        INSTANCE = consumptionAmountTopLocal$Title$Numeric$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ConsumptionAmountTopLocal.Title.Numeric", consumptionAmountTopLocal$Title$Numeric$$serializer, 9);
        setanimationsloop.onWarmupCompleted("stringNumber", true);
        setanimationsloop.onWarmupCompleted("unit", false);
        setanimationsloop.onWarmupCompleted("prefix", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("fontSize", false);
        setanimationsloop.onWarmupCompleted("fontWeight", false);
        setanimationsloop.onWarmupCompleted("baseColor", false);
        setanimationsloop.onWarmupCompleted("number", true);
        setanimationsloop.onWarmupCompleted("precision", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 73;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private ConsumptionAmountTopLocal$Title$Numeric$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallback = ConsumptionAmountTopLocal.Title.Numeric.onExtraCallback();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback), getdynamicheight, lazyArrOnExtraCallback[5].getValue(), getwrigglelayout, sp.IAuthTabCallback(oty1.onExtraCallback), sp.IAuthTabCallback(getdynamicheight)};
        int i4 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ConsumptionAmountTopLocal.Title.Numeric deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        int i;
        Integer num;
        Long l;
        getServiceBeans.asBinder asbinder;
        HandlerLocal handlerLocal;
        String str2;
        int i2;
        String str3;
        String str4;
        char c;
        char c2;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = ConsumptionAmountTopLocal.Title.Numeric.onExtraCallback();
        int i7 = 7;
        int i8 = 6;
        int i9 = 8;
        boolean z = true;
        Long l2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i10 = onNavigationEvent + 27;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            String str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            HandlerLocal handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setAppxVersionInWorker.onExtraCallback, (Object) null);
            int iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 4);
            getServiceBeans.asBinder asbinder2 = (getServiceBeans.asBinder) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrOnExtraCallback[5].getValue(), (Object) null);
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
            str = str7;
            asbinder = asbinder2;
            handlerLocal = handlerLocal2;
            l = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, oty1.onExtraCallback, (Object) null);
            str2 = strAsInterface;
            i2 = iOnTransact;
            num = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getDynamicHeight.onWarmupCompleted, (Object) null);
            i = 511;
            str3 = str5;
            str4 = str6;
        } else {
            int i12 = 0;
            int iOnTransact2 = 0;
            boolean z2 = true;
            String str8 = null;
            Integer num2 = null;
            getServiceBeans.asBinder asbinder3 = null;
            HandlerLocal handlerLocal3 = null;
            String strAsInterface2 = null;
            String str9 = null;
            String str10 = null;
            while (z2 == z) {
                int i13 = onNavigationEvent + 9;
                onExtraCallbackWithResult = i13 % 128;
                if (i13 % i3 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z2 = false;
                        i3 = 2;
                        i8 = 6;
                        i9 = 8;
                        z = true;
                    case 0:
                        str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str9);
                        i12 |= 1;
                        str10 = str10;
                        i3 = 2;
                        i7 = 7;
                        i8 = 6;
                        i9 = 8;
                        z = true;
                    case 1:
                        i12 |= 2;
                        str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str10);
                        i3 = 2;
                        i7 = 7;
                        z = true;
                        i8 = 6;
                    case 2:
                        c = 5;
                        str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, getWriggleLayout.onNavigationEvent, str8);
                        i12 |= 4;
                        i7 = 7;
                        i8 = 6;
                        z = true;
                    case 3:
                        c = 5;
                        handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setAppxVersionInWorker.onExtraCallback, handlerLocal3);
                        i12 |= 8;
                        i7 = 7;
                        i8 = 6;
                        z = true;
                    case 4:
                        c2 = 5;
                        iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 4);
                        i12 |= 16;
                        z = true;
                    case 5:
                        c2 = 5;
                        asbinder3 = (getServiceBeans.asBinder) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrOnExtraCallback[5].getValue(), asbinder3);
                        i12 |= 32;
                        z = true;
                    case 6:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i8);
                        i12 |= 64;
                        z = true;
                    case 7:
                        l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i7, oty1.onExtraCallback, l2);
                        i12 |= 128;
                        z = true;
                    case 8:
                        num2 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i9, getDynamicHeight.onWarmupCompleted, num2);
                        i12 |= 256;
                        z = true;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str = str8;
            i = i12;
            num = num2;
            l = l2;
            asbinder = asbinder3;
            handlerLocal = handlerLocal3;
            str2 = strAsInterface2;
            i2 = iOnTransact2;
            str3 = str9;
            str4 = str10;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ConsumptionAmountTopLocal.Title.Numeric(i, str3, str4, str, handlerLocal, i2, asbinder, str2, l, num, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m322deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ConsumptionAmountTopLocal.Title.Numeric numericDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 101;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return numericDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ConsumptionAmountTopLocal.Title.Numeric numeric) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(numeric, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ConsumptionAmountTopLocal.Title.Numeric.onExtraCallbackWithResult(numeric, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(numeric, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        ConsumptionAmountTopLocal.Title.Numeric.onExtraCallbackWithResult(numeric, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 87 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ConsumptionAmountTopLocal.Title.Numeric) obj);
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
