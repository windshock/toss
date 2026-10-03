package viva.republica.toss.network.model.electronicdocument.wallet;

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
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class EDocIssuable$$serializer implements aeu2<EDocIssuable> {
    public static final EDocIssuable$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            serialDescriptor = descriptor;
            int i4 = 25 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i3 + 83;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        EDocIssuable$$serializer eDocIssuable$$serializer = new EDocIssuable$$serializer();
        INSTANCE = eDocIssuable$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable", eDocIssuable$$serializer, 2);
        setanimationsloop.onWarmupCompleted("categoryName", true);
        setanimationsloop.onWarmupCompleted("candidates", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 73;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 86 / 0;
        }
    }

    private EDocIssuable$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback((KSerializer) EDocIssuable.onExtraCallbackWithResult()[0].getValue());
            kSerializerArr = new KSerializer[2];
            kSerializerArr[1] = getWriggleLayout.onNavigationEvent;
            kSerializerArr[1] = kSerializerIAuthTabCallback;
        } else {
            kSerializerArr = new KSerializer[]{getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback((KSerializer) EDocIssuable.onExtraCallbackWithResult()[1].getValue())};
        }
        int i3 = onWarmupCompleted + 33;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        EDocIssuable eDocIssuableM18deserialize = m18deserialize(decoder);
        int i4 = onWarmupCompleted + 11;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return eDocIssuableM18deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final EDocIssuable m18deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        List list;
        String strAsInterface;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = EDocIssuable.onExtraCallbackWithResult();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            list = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnExtraCallbackWithResult[1].getValue(), (Object) null);
            int i3 = onExtraCallback + 23;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            i = 3;
        } else {
            int i5 = onExtraCallback + 39;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            List list2 = null;
            String strAsInterface2 = null;
            int i7 = 0;
            boolean z = true;
            while (z) {
                int i8 = onExtraCallback + 115;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i10 = onExtraCallback;
                    int i11 = i10 + 13;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i13 = i10 + 61;
                    onWarmupCompleted = i13 % 128;
                    int i14 = i13 % 2;
                    list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnExtraCallbackWithResult[1].getValue(), list2);
                    i7 |= 2;
                } else {
                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i7 |= 1;
                }
            }
            i = i7;
            list = list2;
            strAsInterface = strAsInterface2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new EDocIssuable(i, strAsInterface, list, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (EDocIssuable) obj);
        if (i3 != 0) {
            int i4 = 74 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull EDocIssuable eDocIssuable) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(eDocIssuable, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            EDocIssuable.IAuthTabCallback(eDocIssuable, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(eDocIssuable, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        EDocIssuable.IAuthTabCallback(eDocIssuable, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 121;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
