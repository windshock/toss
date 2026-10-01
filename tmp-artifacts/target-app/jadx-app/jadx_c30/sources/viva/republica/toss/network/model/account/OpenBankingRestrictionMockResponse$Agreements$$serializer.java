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
public final /* synthetic */ class OpenBankingRestrictionMockResponse$Agreements$$serializer implements aeu2<OpenBankingRestrictionMockResponse.Agreements> {
    private static int IAuthTabCallback = 0;
    public static final OpenBankingRestrictionMockResponse$Agreements$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 19;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 17;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        OpenBankingRestrictionMockResponse$Agreements$$serializer openBankingRestrictionMockResponse$Agreements$$serializer = new OpenBankingRestrictionMockResponse$Agreements$$serializer();
        INSTANCE = openBankingRestrictionMockResponse$Agreements$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.account.OpenBankingRestrictionMockResponse.Agreements", openBankingRestrictionMockResponse$Agreements$$serializer, 2);
        setanimationsloop.onWarmupCompleted("withdrawal", true);
        setanimationsloop.onWarmupCompleted("inquiry", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 31;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private OpenBankingRestrictionMockResponse$Agreements$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            OpenBankingRestrictionMockResponse$Agreements$AgreementInfo$$serializer openBankingRestrictionMockResponse$Agreements$AgreementInfo$$serializer = OpenBankingRestrictionMockResponse$Agreements$AgreementInfo$$serializer.INSTANCE;
            return new KSerializer[]{sp.IAuthTabCallback(openBankingRestrictionMockResponse$Agreements$AgreementInfo$$serializer), sp.IAuthTabCallback(openBankingRestrictionMockResponse$Agreements$AgreementInfo$$serializer)};
        }
        OpenBankingRestrictionMockResponse$Agreements$AgreementInfo$$serializer openBankingRestrictionMockResponse$Agreements$AgreementInfo$$serializer2 = OpenBankingRestrictionMockResponse$Agreements$AgreementInfo$$serializer.INSTANCE;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(openBankingRestrictionMockResponse$Agreements$AgreementInfo$$serializer2);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(openBankingRestrictionMockResponse$Agreements$AgreementInfo$$serializer2);
        KSerializer<?>[] kSerializerArr = new KSerializer[2];
        kSerializerArr[1] = kSerializerIAuthTabCallback;
        kSerializerArr[1] = kSerializerIAuthTabCallback2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        OpenBankingRestrictionMockResponse.Agreements agreementsM23deserialize = m23deserialize(decoder);
        int i4 = onNavigationEvent + 29;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return agreementsM23deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final OpenBankingRestrictionMockResponse.Agreements m23deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        OpenBankingRestrictionMockResponse.Agreements.AgreementInfo agreementInfo;
        OpenBankingRestrictionMockResponse.Agreements.AgreementInfo agreementInfo2;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 119;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            OpenBankingRestrictionMockResponse$Agreements$AgreementInfo$$serializer openBankingRestrictionMockResponse$Agreements$AgreementInfo$$serializer = OpenBankingRestrictionMockResponse$Agreements$AgreementInfo$$serializer.INSTANCE;
            agreementInfo2 = (OpenBankingRestrictionMockResponse.Agreements.AgreementInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, openBankingRestrictionMockResponse$Agreements$AgreementInfo$$serializer, (Object) null);
            agreementInfo = (OpenBankingRestrictionMockResponse.Agreements.AgreementInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, openBankingRestrictionMockResponse$Agreements$AgreementInfo$$serializer, (Object) null);
            i = 3;
        } else {
            int i5 = 0;
            agreementInfo = null;
            OpenBankingRestrictionMockResponse.Agreements.AgreementInfo agreementInfo3 = null;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onNavigationEvent + 1;
                    int i7 = i6 % 128;
                    IAuthTabCallback = i7;
                    int i8 = i6 % 2;
                    if (iOnNavigationEvent != 0) {
                        int i9 = i7 + 111;
                        onNavigationEvent = i9 % 128;
                        if (i9 % 2 == 0) {
                            if (iOnNavigationEvent != 1) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            agreementInfo = (OpenBankingRestrictionMockResponse.Agreements.AgreementInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, OpenBankingRestrictionMockResponse$Agreements$AgreementInfo$$serializer.INSTANCE, agreementInfo);
                            i5 |= 2;
                        } else {
                            if (iOnNavigationEvent != 1) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            agreementInfo = (OpenBankingRestrictionMockResponse.Agreements.AgreementInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, OpenBankingRestrictionMockResponse$Agreements$AgreementInfo$$serializer.INSTANCE, agreementInfo);
                            i5 |= 2;
                        }
                    } else {
                        agreementInfo3 = (OpenBankingRestrictionMockResponse.Agreements.AgreementInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, OpenBankingRestrictionMockResponse$Agreements$AgreementInfo$$serializer.INSTANCE, agreementInfo3);
                        i5 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            agreementInfo2 = agreementInfo3;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        OpenBankingRestrictionMockResponse.Agreements agreements = new OpenBankingRestrictionMockResponse.Agreements(i, agreementInfo2, agreementInfo, (okycx) null);
        int i10 = IAuthTabCallback + 17;
        onNavigationEvent = i10 % 128;
        if (i10 % 2 != 0) {
            return agreements;
        }
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (OpenBankingRestrictionMockResponse.Agreements) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull OpenBankingRestrictionMockResponse.Agreements agreements) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(agreements, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        OpenBankingRestrictionMockResponse.Agreements.onWarmupCompleted(agreements, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 11;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = IAuthTabCallback + 83;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
