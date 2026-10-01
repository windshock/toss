package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.AmountTopLocal;
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
public final /* synthetic */ class AmountTopLocal$Title$Numeric$$serializer implements aeu2<AmountTopLocal.Title.Numeric> {
    private static int IAuthTabCallback = 0;
    public static final AmountTopLocal$Title$Numeric$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 101;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 57;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        AmountTopLocal$Title$Numeric$$serializer amountTopLocal$Title$Numeric$$serializer = new AmountTopLocal$Title$Numeric$$serializer();
        INSTANCE = amountTopLocal$Title$Numeric$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.AmountTopLocal.Title.Numeric", amountTopLocal$Title$Numeric$$serializer, 9);
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
        int i = onNavigationEvent + 19;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private AmountTopLocal$Title$Numeric$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallbackWithResult = AmountTopLocal.Title.Numeric.onExtraCallbackWithResult();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback), getdynamicheight, lazyArrOnExtraCallbackWithResult[5].getValue(), getwrigglelayout, sp.IAuthTabCallback(oty1.onExtraCallback), sp.IAuthTabCallback(getdynamicheight)};
        int i4 = onWarmupCompleted + 19;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 63 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AmountTopLocal.Title.Numeric deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String str;
        String str2;
        String str3;
        int i;
        Integer num;
        Long l;
        getServiceBeans.asBinder asbinder;
        HandlerLocal handlerLocal;
        int iOnTransact;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 117;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = AmountTopLocal.Title.Numeric.onExtraCallbackWithResult();
        int i6 = 7;
        int i7 = 6;
        Long l2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            HandlerLocal handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setAppxVersionInWorker.onExtraCallback, (Object) null);
            iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 4);
            getServiceBeans.asBinder asbinder2 = (getServiceBeans.asBinder) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrOnExtraCallbackWithResult[5].getValue(), (Object) null);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
            i = 511;
            l = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, oty1.onExtraCallback, (Object) null);
            strAsInterface = strAsInterface2;
            str2 = str6;
            handlerLocal = handlerLocal2;
            str3 = str5;
            num = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getDynamicHeight.onWarmupCompleted, (Object) null);
            asbinder = asbinder2;
            str = str4;
        } else {
            boolean z = true;
            int i8 = 0;
            int iOnTransact2 = 0;
            String str7 = null;
            Integer num2 = null;
            getServiceBeans.asBinder asbinder3 = null;
            HandlerLocal handlerLocal3 = null;
            strAsInterface = null;
            String str8 = null;
            String str9 = null;
            while (z) {
                int i9 = onExtraCallback + 115;
                onWarmupCompleted = i9 % 128;
                if (i9 % i2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        int i10 = onWarmupCompleted + 29;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
                        str9 = str9;
                        str8 = str8;
                        i2 = 2;
                        i6 = 7;
                        i7 = 6;
                        z = false;
                    case 0:
                        str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str9);
                        i8 |= 1;
                        i2 = 2;
                        i6 = 7;
                        i7 = 6;
                    case 1:
                        str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str8);
                        i8 |= 2;
                        i2 = 2;
                        i6 = 7;
                    case 2:
                        str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2, getWriggleLayout.onNavigationEvent, str7);
                        i8 |= 4;
                        i6 = 7;
                    case 3:
                        handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setAppxVersionInWorker.onExtraCallback, handlerLocal3);
                        i8 |= 8;
                        int i12 = onWarmupCompleted + 85;
                        onExtraCallback = i12 % 128;
                        int i13 = i12 % i2;
                        i6 = 7;
                    case 4:
                        iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 4);
                        i8 |= 16;
                    case 5:
                        asbinder3 = (getServiceBeans.asBinder) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrOnExtraCallbackWithResult[5].getValue(), asbinder3);
                        i8 |= 32;
                    case 6:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i7);
                        i8 |= 64;
                    case 7:
                        l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, oty1.onExtraCallback, l2);
                        i8 |= 128;
                    case 8:
                        num2 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getDynamicHeight.onWarmupCompleted, num2);
                        i8 |= 256;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str = str9;
            str2 = str7;
            str3 = str8;
            i = i8;
            num = num2;
            l = l2;
            asbinder = asbinder3;
            handlerLocal = handlerLocal3;
            iOnTransact = iOnTransact2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AmountTopLocal.Title.Numeric(i, str, str3, str2, handlerLocal, iOnTransact, asbinder, strAsInterface, l, num, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m271deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AmountTopLocal.Title.Numeric numericDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        return numericDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AmountTopLocal.Title.Numeric numeric) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(numeric, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AmountTopLocal.Title.Numeric.onExtraCallback(numeric, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 115;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AmountTopLocal.Title.Numeric) obj);
        int i4 = onWarmupCompleted + 69;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
