package viva.republica.toss.network.model.transfer;

import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$;
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
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class TransferBalance$$serializer implements aeu2<TransferBalance> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final TransferBalance$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 29;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 51;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        TransferBalance$$serializer transferBalance$$serializer = new TransferBalance$$serializer();
        INSTANCE = transferBalance$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.TransferBalance", transferBalance$$serializer, 5);
        setanimationsloop.onWarmupCompleted("balance", true);
        setanimationsloop.onWarmupCompleted("withdrawableAmount", true);
        setanimationsloop.onWarmupCompleted("shouldRefresh", true);
        setanimationsloop.onWarmupCompleted("sourceType", true);
        setanimationsloop.onWarmupCompleted("balanceStatus", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private TransferBalance$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[0];
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        if (i3 == 0) {
            Lazy[] lazyArr = (Lazy[]) TransferBalance.onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), 220112568, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr, -220112566, iIAuthTabCallback);
            oty1 oty1Var = oty1.onExtraCallback;
            return new KSerializer[]{oty1Var, oty1Var, getBgColor.IAuthTabCallback, getWriggleLayout.onNavigationEvent, lazyArr[4].getValue()};
        }
        Lazy[] lazyArr2 = (Lazy[]) TransferBalance.onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), 220112568, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr, -220112566, iIAuthTabCallback);
        KSerializer<?>[] kSerializerArr = new KSerializer[5];
        oty1 oty1Var2 = oty1.onExtraCallback;
        kSerializerArr[0] = oty1Var2;
        kSerializerArr[0] = oty1Var2;
        kSerializerArr[2] = getBgColor.IAuthTabCallback;
        kSerializerArr[2] = getWriggleLayout.onNavigationEvent;
        kSerializerArr[3] = lazyArr2[2].getValue();
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return m100deserialize(decoder);
        }
        m100deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final TransferBalance m100deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean zOnExtraCallbackWithResult;
        int i;
        TransferBalanceStatus transferBalanceStatus;
        String strAsInterface;
        long j;
        long j2;
        int i2;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 31;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        Lazy[] lazyArr = (Lazy[]) TransferBalance.onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), 220112568, iIAuthTabCallback2, new Object[0], -220112566, iIAuthTabCallback);
        TransferBalanceStatus transferBalanceStatus2 = null;
        int i6 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
            long jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
            i = 31;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            transferBalanceStatus = (TransferBalanceStatus) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArr[4].getValue(), (Object) null);
            j = jIAuthTabCallbackDefault;
            j2 = jIAuthTabCallbackDefault2;
        } else {
            boolean zOnExtraCallbackWithResult2 = false;
            int i7 = 0;
            boolean z = true;
            long jIAuthTabCallbackDefault3 = 0;
            long jIAuthTabCallbackDefault4 = 0;
            String strAsInterface2 = null;
            while (!(!z)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    if (iOnNavigationEvent == 0) {
                        jIAuthTabCallbackDefault4 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i7 |= 1;
                        i2 = onExtraCallback + 29;
                        onWarmupCompleted = i2 % 128;
                    } else if (iOnNavigationEvent != i6) {
                        if (iOnNavigationEvent != 2) {
                            int i8 = onWarmupCompleted + 35;
                            onExtraCallback = i8 % 128;
                            int i9 = i8 % 2;
                            if (iOnNavigationEvent == 3) {
                                strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                                i7 |= 8;
                            } else {
                                if (iOnNavigationEvent != 4) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                transferBalanceStatus2 = (TransferBalanceStatus) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArr[4].getValue(), transferBalanceStatus2);
                                i7 |= 16;
                            }
                        } else {
                            zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
                            i7 |= 4;
                        }
                        i6 = 1;
                    } else {
                        jIAuthTabCallbackDefault3 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, i6);
                        i7 |= 2;
                        i2 = onWarmupCompleted + 41;
                        onExtraCallback = i2 % 128;
                    }
                    int i10 = i2 % 2;
                    i6 = 1;
                } else {
                    z = false;
                }
            }
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            i = i7;
            transferBalanceStatus = transferBalanceStatus2;
            strAsInterface = strAsInterface2;
            j = jIAuthTabCallbackDefault4;
            j2 = jIAuthTabCallbackDefault3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TransferBalance(i, j, j2, zOnExtraCallbackWithResult, strAsInterface, transferBalanceStatus, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TransferBalance) obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallback + 45;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TransferBalance transferBalance) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(transferBalance, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TransferBalance.IAuthTabCallback(transferBalance, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 89;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 77 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onExtraCallback + 89;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
