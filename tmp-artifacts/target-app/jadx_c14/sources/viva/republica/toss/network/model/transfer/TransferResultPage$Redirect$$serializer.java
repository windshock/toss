package viva.republica.toss.network.model.transfer;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.appInfo;
import o.getBgColor;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.TransferResultPage;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class TransferResultPage$Redirect$$serializer implements aeu2<TransferResultPage.Redirect> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final TransferResultPage$Redirect$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static final /* synthetic */ class onNavigationEvent implements appInfo {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private final /* synthetic */ String discriminator;

        public onNavigationEvent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.discriminator = str;
        }

        public final /* synthetic */ String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 67;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.discriminator;
            int i5 = i2 + 5;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final /* synthetic */ Class annotationType() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 3;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 39;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return appInfo.class;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            if (!(obj instanceof appInfo)) {
                int i5 = i3 + 121;
                onNavigationEvent = i5 % 128;
                return i5 % 2 != 0;
            }
            if (!(!Intrinsics.areEqual(IAuthTabCallback(), ((appInfo) obj).IAuthTabCallback()))) {
                return true;
            }
            int i6 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                this.discriminator.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode = this.discriminator.hashCode() ^ 707790692;
            int i3 = onExtraCallbackWithResult + 87;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public final String toString() {
            int i = 2 % 2;
            String str = "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=" + this.discriminator + ")";
            int i2 = onNavigationEvent + 87;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 123;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
        return serialDescriptor;
    }

    static {
        TransferResultPage$Redirect$$serializer transferResultPage$Redirect$$serializer = new TransferResultPage$Redirect$$serializer();
        INSTANCE = transferResultPage$Redirect$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("REDIRECT", transferResultPage$Redirect$$serializer, 5);
        setanimationsloop.onWarmupCompleted("redirectScheme", false);
        setanimationsloop.onWarmupCompleted("toastLayout", true);
        setanimationsloop.onWarmupCompleted("bottomSheetLayout", true);
        setanimationsloop.onWarmupCompleted("clearStack", true);
        setanimationsloop.onWarmupCompleted("logStatus", true);
        setanimationsloop.onWarmupCompleted(new onNavigationEvent("behavior"));
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private TransferResultPage$Redirect$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializer, sp.IAuthTabCallback(TransferResultPage$ToastLayout$$serializer.INSTANCE), sp.IAuthTabCallback(TransferResultPage$BottomSheetLayout$$serializer.INSTANCE), getBgColor.IAuthTabCallback, sp.IAuthTabCallback(kSerializer)};
        int i4 = onNavigationEvent + 47;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TransferResultPage.Redirect redirectM120deserialize = m120deserialize(decoder);
        int i4 = onNavigationEvent + 55;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return redirectM120deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final TransferResultPage.Redirect m120deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        TransferResultPage.BottomSheetLayout bottomSheetLayout;
        String strAsInterface;
        boolean z;
        TransferResultPage.ToastLayout toastLayout;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i3 = 0;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            TransferResultPage.ToastLayout toastLayout2 = (TransferResultPage.ToastLayout) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, TransferResultPage$ToastLayout$$serializer.INSTANCE, (Object) null);
            TransferResultPage.BottomSheetLayout bottomSheetLayout2 = (TransferResultPage.BottomSheetLayout) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, TransferResultPage$BottomSheetLayout$$serializer.INSTANCE, (Object) null);
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
            i = 31;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, (Object) null);
            toastLayout = toastLayout2;
            z = zOnExtraCallbackWithResult;
            bottomSheetLayout = bottomSheetLayout2;
        } else {
            boolean zOnExtraCallbackWithResult2 = false;
            int i4 = 0;
            int i5 = 1;
            TransferResultPage.BottomSheetLayout bottomSheetLayout3 = null;
            String strAsInterface2 = null;
            str = null;
            TransferResultPage.ToastLayout toastLayout3 = null;
            while (i5 != 0) {
                int i6 = onWarmupCompleted + 3;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    i5 = i3;
                } else if (iOnNavigationEvent != 0) {
                    if (iOnNavigationEvent != 1) {
                        int i7 = onWarmupCompleted + 87;
                        int i8 = i7 % 128;
                        onNavigationEvent = i8;
                        int i9 = i7 % 2;
                        if (iOnNavigationEvent == 2) {
                            bottomSheetLayout3 = (TransferResultPage.BottomSheetLayout) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, TransferResultPage$BottomSheetLayout$$serializer.INSTANCE, bottomSheetLayout3);
                            i4 |= 4;
                        } else if (iOnNavigationEvent != 3) {
                            int i10 = i8 + 103;
                            onWarmupCompleted = i10 % 128;
                            int i11 = i10 % 2;
                            if (iOnNavigationEvent != 4) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str);
                            i4 |= 16;
                        } else {
                            zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
                            i4 |= 8;
                        }
                    } else {
                        toastLayout3 = (TransferResultPage.ToastLayout) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, TransferResultPage$ToastLayout$$serializer.INSTANCE, toastLayout3);
                        i4 |= 2;
                    }
                    i3 = 0;
                } else {
                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i3);
                    i4 |= 1;
                }
            }
            bottomSheetLayout = bottomSheetLayout3;
            strAsInterface = strAsInterface2;
            z = zOnExtraCallbackWithResult2;
            toastLayout = toastLayout3;
            i = i4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TransferResultPage.Redirect(i, strAsInterface, toastLayout, bottomSheetLayout, z, str, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TransferResultPage.Redirect) obj);
        int i4 = onWarmupCompleted + 123;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TransferResultPage.Redirect redirect) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(redirect, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TransferResultPage.Redirect.onExtraCallbackWithResult(redirect, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 15;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onWarmupCompleted + 15;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        obj.hashCode();
        throw null;
    }
}
