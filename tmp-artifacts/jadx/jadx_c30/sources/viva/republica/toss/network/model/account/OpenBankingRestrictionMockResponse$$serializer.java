package viva.republica.toss.network.model.account;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.aeu2;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.account.OpenBankingRestrictionMockResponse;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class OpenBankingRestrictionMockResponse$$serializer implements aeu2<OpenBankingRestrictionMockResponse> {
    private static int IAuthTabCallback = 1;
    public static final OpenBankingRestrictionMockResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        OpenBankingRestrictionMockResponse$$serializer openBankingRestrictionMockResponse$$serializer = new OpenBankingRestrictionMockResponse$$serializer();
        INSTANCE = openBankingRestrictionMockResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.account.OpenBankingRestrictionMockResponse", openBankingRestrictionMockResponse$$serializer, 2);
        setanimationsloop.onWarmupCompleted("agreements", true);
        setanimationsloop.onWarmupCompleted("restrictionStatus", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 51;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private OpenBankingRestrictionMockResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(OpenBankingRestrictionMockResponse$Agreements$$serializer.INSTANCE);
            KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(OpenBankingRestrictionMockResponse$RestrictionStatus$$serializer.INSTANCE);
            kSerializerArr = new KSerializer[3];
            kSerializerArr[1] = kSerializerIAuthTabCallback;
            kSerializerArr[0] = kSerializerIAuthTabCallback2;
        } else {
            kSerializerArr = new KSerializer[]{sp.IAuthTabCallback(OpenBankingRestrictionMockResponse$Agreements$$serializer.INSTANCE), sp.IAuthTabCallback(OpenBankingRestrictionMockResponse$RestrictionStatus$$serializer.INSTANCE)};
        }
        int i3 = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        OpenBankingRestrictionMockResponse openBankingRestrictionMockResponseM22deserialize = m22deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
        return openBankingRestrictionMockResponseM22deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final OpenBankingRestrictionMockResponse m22deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        OpenBankingRestrictionMockResponse.Agreements agreements;
        OpenBankingRestrictionMockResponse.RestrictionStatus restrictionStatus;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            agreements = (OpenBankingRestrictionMockResponse.Agreements) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, OpenBankingRestrictionMockResponse$Agreements$$serializer.INSTANCE, (Object) null);
            restrictionStatus = (OpenBankingRestrictionMockResponse.RestrictionStatus) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, OpenBankingRestrictionMockResponse$RestrictionStatus$$serializer.INSTANCE, (Object) null);
            i = 3;
        } else {
            int i3 = 0;
            OpenBankingRestrictionMockResponse.Agreements agreements2 = null;
            OpenBankingRestrictionMockResponse.RestrictionStatus restrictionStatus2 = null;
            boolean z = true;
            while (z) {
                int i4 = onExtraCallbackWithResult + 13;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i6 = onExtraCallbackWithResult + 103;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        if (iOnNavigationEvent != 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        restrictionStatus2 = (OpenBankingRestrictionMockResponse.RestrictionStatus) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, OpenBankingRestrictionMockResponse$RestrictionStatus$$serializer.INSTANCE, restrictionStatus2);
                        i3 |= 2;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        restrictionStatus2 = (OpenBankingRestrictionMockResponse.RestrictionStatus) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, OpenBankingRestrictionMockResponse$RestrictionStatus$$serializer.INSTANCE, restrictionStatus2);
                        i3 |= 2;
                    }
                } else {
                    agreements2 = (OpenBankingRestrictionMockResponse.Agreements) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, OpenBankingRestrictionMockResponse$Agreements$$serializer.INSTANCE, agreements2);
                    i3 |= 1;
                }
            }
            agreements = agreements2;
            restrictionStatus = restrictionStatus2;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new OpenBankingRestrictionMockResponse(i, agreements, restrictionStatus, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (OpenBankingRestrictionMockResponse) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull OpenBankingRestrictionMockResponse openBankingRestrictionMockResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(openBankingRestrictionMockResponse, BuildConfig.FLAVOR);
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            OpenBankingRestrictionMockResponse.IAuthTabCallback(openBankingRestrictionMockResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(openBankingRestrictionMockResponse, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        OpenBankingRestrictionMockResponse.IAuthTabCallback(openBankingRestrictionMockResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 31 / 0;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 71;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
