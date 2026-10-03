package viva.republica.toss.network.model.transfer;

import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.EncryptedContentInfoParser;
import o.aeu2;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.jp;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.TransferResultPage;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class TransferResultPage$MemoLayout$$serializer implements aeu2<TransferResultPage.MemoLayout> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final TransferResultPage$MemoLayout$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 35;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 75;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
        return serialDescriptor;
    }

    static {
        TransferResultPage$MemoLayout$$serializer transferResultPage$MemoLayout$$serializer = new TransferResultPage$MemoLayout$$serializer();
        INSTANCE = transferResultPage$MemoLayout$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.TransferResultPage.MemoLayout", transferResultPage$MemoLayout$$serializer, 6);
        setanimationsloop.onWarmupCompleted("buttonTitle", false);
        setanimationsloop.onWarmupCompleted("innerTitle", true);
        setanimationsloop.onWarmupCompleted("innerMessage", true);
        setanimationsloop.onWarmupCompleted("footerDescription", true);
        setanimationsloop.onWarmupCompleted("lengthCap", true);
        setanimationsloop.onWarmupCompleted("memoLayoutPosition", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 107;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private TransferResultPage$MemoLayout$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnNavigationEvent = TransferResultPage.MemoLayout.onNavigationEvent();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted), lazyArrOnNavigationEvent[5].getValue()};
        int i4 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TransferResultPage.MemoLayout memoLayoutM113deserialize = m113deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
        return memoLayoutM113deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final TransferResultPage.MemoLayout m113deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String str;
        String str2;
        String str3;
        Integer num;
        TransferResultPage.MemoLayout.onNavigationEvent onnavigationevent;
        int i;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = TransferResultPage.MemoLayout.onNavigationEvent();
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            num = null;
            str3 = null;
            onnavigationevent = null;
            i = 0;
            str = null;
            str2 = null;
            strAsInterface = null;
            while (z) {
                int i4 = onExtraCallbackWithResult + 81;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i |= 1;
                        continue;
                    case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                        str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str);
                        i |= 2;
                        i2 = onNavigationEvent + 19;
                        onExtraCallbackWithResult = i2 % 128;
                        break;
                    case 2:
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str2);
                        i |= 4;
                        continue;
                    case 3:
                        str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str3);
                        i |= 8;
                        i2 = onExtraCallbackWithResult + 119;
                        onNavigationEvent = i2 % 128;
                        break;
                    case 4:
                        num = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getDynamicHeight.onWarmupCompleted, num);
                        i |= 16;
                        continue;
                    case 5:
                        onnavigationevent = (TransferResultPage.MemoLayout.onNavigationEvent) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrOnNavigationEvent[5].getValue(), onnavigationevent);
                        i |= 32;
                        continue;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
                int i5 = i2 % 2;
            }
            int i6 = onNavigationEvent + 21;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        } else {
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            num = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getDynamicHeight.onWarmupCompleted, (Object) null);
            onnavigationevent = (TransferResultPage.MemoLayout.onNavigationEvent) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrOnNavigationEvent[5].getValue(), (Object) null);
            int i8 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 5 / 2;
            }
            i = 63;
        }
        Integer num2 = num;
        String str4 = str3;
        TransferResultPage.MemoLayout.onNavigationEvent onnavigationevent2 = onnavigationevent;
        int i10 = i;
        String str5 = str;
        String str6 = str2;
        String str7 = strAsInterface;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TransferResultPage.MemoLayout(i10, str7, str5, str6, str4, num2, onnavigationevent2, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TransferResultPage.MemoLayout) obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TransferResultPage.MemoLayout memoLayout) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(memoLayout, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            TransferResultPage.MemoLayout.onExtraCallback(memoLayout, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 91 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(memoLayout, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            TransferResultPage.MemoLayout.onExtraCallback(memoLayout, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
