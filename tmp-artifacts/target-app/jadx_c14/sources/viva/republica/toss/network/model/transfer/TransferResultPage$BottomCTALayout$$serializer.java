package viva.republica.toss.network.model.transfer;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.TransferResultPage;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class TransferResultPage$BottomCTALayout$$serializer implements aeu2<TransferResultPage.BottomCTALayout> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final TransferResultPage$BottomCTALayout$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 51;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        TransferResultPage$BottomCTALayout$$serializer transferResultPage$BottomCTALayout$$serializer = new TransferResultPage$BottomCTALayout$$serializer();
        INSTANCE = transferResultPage$BottomCTALayout$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.TransferResultPage.BottomCTALayout", transferResultPage$BottomCTALayout$$serializer, 4);
        setanimationsloop.onWarmupCompleted("primaryButton", true);
        setanimationsloop.onWarmupCompleted("secondaryButton", true);
        setanimationsloop.onWarmupCompleted("bottomAccessory", true);
        setanimationsloop.onWarmupCompleted("bottomDescription", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 13;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private TransferResultPage$BottomCTALayout$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TransferResultPage$ButtonLayout$$serializer transferResultPage$ButtonLayout$$serializer = TransferResultPage$ButtonLayout$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(transferResultPage$ButtonLayout$$serializer), sp.IAuthTabCallback(transferResultPage$ButtonLayout$$serializer), sp.IAuthTabCallback(transferResultPage$ButtonLayout$$serializer), sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent)};
        int i4 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TransferResultPage.BottomCTALayout bottomCTALayoutM103deserialize = m103deserialize(decoder);
        int i4 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return bottomCTALayoutM103deserialize;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final TransferResultPage.BottomCTALayout m103deserialize(@NotNull Decoder decoder) throws Throwable {
        int i;
        TransferResultPage.ButtonLayout buttonLayout;
        TransferResultPage.ButtonLayout buttonLayout2;
        TransferResultPage.ButtonLayout buttonLayout3;
        String str;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Throwable th = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onNavigationEvent + 121;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            TransferResultPage$ButtonLayout$$serializer transferResultPage$ButtonLayout$$serializer = TransferResultPage$ButtonLayout$$serializer.INSTANCE;
            TransferResultPage.ButtonLayout buttonLayout4 = (TransferResultPage.ButtonLayout) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, transferResultPage$ButtonLayout$$serializer, (Object) null);
            TransferResultPage.ButtonLayout buttonLayout5 = (TransferResultPage.ButtonLayout) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, transferResultPage$ButtonLayout$$serializer, (Object) null);
            buttonLayout3 = (TransferResultPage.ButtonLayout) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, transferResultPage$ButtonLayout$$serializer, (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, (Object) null);
            i = 15;
            buttonLayout = buttonLayout4;
            buttonLayout2 = buttonLayout5;
        } else {
            int i5 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
            boolean z = true;
            TransferResultPage.ButtonLayout buttonLayout6 = null;
            String str2 = null;
            buttonLayout = null;
            buttonLayout2 = null;
            while (z) {
                int i7 = onExtraCallbackWithResult + 13;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    th.hashCode();
                    throw th;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i8 = onExtraCallbackWithResult;
                    int i9 = i8 + 105;
                    onNavigationEvent = i9 % 128;
                    if (i9 % 2 != 0) {
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        buttonLayout = (TransferResultPage.ButtonLayout) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, TransferResultPage$ButtonLayout$$serializer.INSTANCE, buttonLayout);
                        i |= 1;
                    } else if (iOnNavigationEvent == 1) {
                        buttonLayout2 = (TransferResultPage.ButtonLayout) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, TransferResultPage$ButtonLayout$$serializer.INSTANCE, buttonLayout2);
                        i |= 2;
                    } else if (iOnNavigationEvent == 2) {
                        buttonLayout6 = (TransferResultPage.ButtonLayout) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, TransferResultPage$ButtonLayout$$serializer.INSTANCE, buttonLayout6);
                        i |= 4;
                    } else {
                        if (iOnNavigationEvent != 3) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i10 = i8 + 5;
                        onNavigationEvent = i10 % 128;
                        int i11 = i10 % 2;
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str2);
                        i = i11 != 0 ? i | 12 : i | 8;
                    }
                    th = null;
                } else {
                    z = false;
                }
            }
            buttonLayout3 = buttonLayout6;
            str = str2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TransferResultPage.BottomCTALayout(i, buttonLayout, buttonLayout2, buttonLayout3, str, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TransferResultPage.BottomCTALayout) obj);
        int i4 = onExtraCallbackWithResult + 61;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TransferResultPage.BottomCTALayout bottomCTALayout) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(bottomCTALayout, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            TransferResultPage.BottomCTALayout.onWarmupCompleted(bottomCTALayout, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(bottomCTALayout, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        TransferResultPage.BottomCTALayout.onWarmupCompleted(bottomCTALayout, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 47 / 0;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
