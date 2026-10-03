package viva.republica.toss.network.model.transfer.periodic;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.appInfo;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class PeriodicTransferFrequency$Monthly$$serializer implements aeu2<PeriodicTransferFrequency.Monthly> {
    public static final PeriodicTransferFrequency$Monthly$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static final /* synthetic */ class onExtraCallback implements appInfo {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private final /* synthetic */ String discriminator;

        public onExtraCallback(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.discriminator = str;
        }

        public final /* synthetic */ String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return this.discriminator;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final /* synthetic */ Class annotationType() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return appInfo.class;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            if (!(obj instanceof appInfo)) {
                int i5 = i3 + 21;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(IAuthTabCallback(), ((appInfo) obj).IAuthTabCallback())) {
                return false;
            }
            int i7 = onWarmupCompleted + 11;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return 707790692 ^ this.discriminator.hashCode();
            }
            int i3 = 78 / 0;
            return 707790692 ^ this.discriminator.hashCode();
        }

        public final String toString() {
            int i = 2 % 2;
            String str = "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=" + this.discriminator + ")";
            int i2 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        PeriodicTransferFrequency$Monthly$$serializer periodicTransferFrequency$Monthly$$serializer = new PeriodicTransferFrequency$Monthly$$serializer();
        INSTANCE = periodicTransferFrequency$Monthly$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("MONTHLY", periodicTransferFrequency$Monthly$$serializer, 3);
        setanimationsloop.onWarmupCompleted("startDate", false);
        setanimationsloop.onWarmupCompleted("endDate", false);
        setanimationsloop.onWarmupCompleted("dayOfMonth", false);
        setanimationsloop.onWarmupCompleted(new onExtraCallback("frequencyType"));
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 41;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private PeriodicTransferFrequency$Monthly$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), getDynamicHeight.onWarmupCompleted};
        int i4 = onWarmupCompleted + 77;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            m132deserialize(decoder);
            throw null;
        }
        PeriodicTransferFrequency.Monthly monthlyM132deserialize = m132deserialize(decoder);
        int i3 = onExtraCallback + 115;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return monthlyM132deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final PeriodicTransferFrequency.Monthly m132deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int iOnTransact;
        int i;
        String str;
        String str2;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 1;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onExtraCallback + 115;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 2);
            i = 7;
            str2 = str3;
        } else {
            boolean z = true;
            String str4 = null;
            String str5 = null;
            int iOnTransact2 = 0;
            int i7 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    int i8 = onExtraCallback + 121;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 5 % 2;
                    }
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i10 = onWarmupCompleted;
                    int i11 = i10 + 57;
                    onExtraCallback = i11 % 128;
                    int i12 = i11 % 2;
                    if (iOnNavigationEvent != 1) {
                        int i13 = i10 + 45;
                        onExtraCallback = i13 % 128;
                        if (i13 % 2 != 0) {
                            if (iOnNavigationEvent != 4) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 2);
                            i7 |= 4;
                        } else {
                            if (iOnNavigationEvent != 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 2);
                            i7 |= 4;
                        }
                    } else {
                        str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str4);
                        i7 |= 2;
                    }
                } else {
                    str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str5);
                    i7 |= 1;
                }
            }
            iOnTransact = iOnTransact2;
            i = i7;
            str = str4;
            str2 = str5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        PeriodicTransferFrequency.Monthly monthly = new PeriodicTransferFrequency.Monthly(i, str2, str, iOnTransact, null);
        int i14 = onExtraCallback + 35;
        onWarmupCompleted = i14 % 128;
        int i15 = i14 % 2;
        return monthly;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        serialize(encoder, (PeriodicTransferFrequency.Monthly) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallback + 19;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PeriodicTransferFrequency.Monthly monthly) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(monthly, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        PeriodicTransferFrequency.Monthly.onNavigationEvent(monthly, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 113;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 61;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
