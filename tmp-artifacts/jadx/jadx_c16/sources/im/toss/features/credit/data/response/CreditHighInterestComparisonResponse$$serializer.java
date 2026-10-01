package im.toss.features.credit.data.response;

import im.toss.features.credit.data.response.CreditHighInterestComparisonResponse;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditHighInterestComparisonResponse$$serializer implements aeu2<CreditHighInterestComparisonResponse> {
    private static int IAuthTabCallback = 0;
    public static final CreditHighInterestComparisonResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        CreditHighInterestComparisonResponse$$serializer creditHighInterestComparisonResponse$$serializer = new CreditHighInterestComparisonResponse$$serializer();
        INSTANCE = creditHighInterestComparisonResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.CreditHighInterestComparisonResponse", creditHighInterestComparisonResponse$$serializer, 8);
        setanimationsloop.onWarmupCompleted("score", true);
        setanimationsloop.onWarmupCompleted("totalOwnedLoanAmount", true);
        setanimationsloop.onWarmupCompleted("ownedLoanCount", true);
        setanimationsloop.onWarmupCompleted("myLoan", true);
        setanimationsloop.onWarmupCompleted("interestRateComparison", true);
        setanimationsloop.onWarmupCompleted("interestAmountComparison", true);
        setanimationsloop.onWarmupCompleted("interestInfo", true);
        setanimationsloop.onWarmupCompleted("interestRateInfo", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 53;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private CreditHighInterestComparisonResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(CreditHighInterestComparisonResponse$MyLoan$$serializer.INSTANCE);
        CreditHighInterestComparisonResponse$Comparison$$serializer creditHighInterestComparisonResponse$Comparison$$serializer = CreditHighInterestComparisonResponse$Comparison$$serializer.INSTANCE;
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(creditHighInterestComparisonResponse$Comparison$$serializer);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(creditHighInterestComparisonResponse$Comparison$$serializer);
        CreditHighInterestComparisonResponse$BottomSheetInfo$$serializer creditHighInterestComparisonResponse$BottomSheetInfo$$serializer = CreditHighInterestComparisonResponse$BottomSheetInfo$$serializer.INSTANCE;
        KSerializer<?> kSerializerIAuthTabCallback4 = sp.IAuthTabCallback(creditHighInterestComparisonResponse$BottomSheetInfo$$serializer);
        KSerializer<?> kSerializerIAuthTabCallback5 = sp.IAuthTabCallback(creditHighInterestComparisonResponse$BottomSheetInfo$$serializer);
        getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {getdynamicheight, getWriggleLayout.onNavigationEvent, getdynamicheight, kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3, kSerializerIAuthTabCallback4, kSerializerIAuthTabCallback5};
        int i4 = onExtraCallback + 13;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditHighInterestComparisonResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        CreditHighInterestComparisonResponse.BottomSheetInfo bottomSheetInfo;
        CreditHighInterestComparisonResponse.Comparison comparison;
        CreditHighInterestComparisonResponse.BottomSheetInfo bottomSheetInfo2;
        int i2;
        int i3;
        CreditHighInterestComparisonResponse.MyLoan myLoan;
        CreditHighInterestComparisonResponse.Comparison comparison2;
        String str;
        int i4;
        int i5;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i7 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i8 = onWarmupCompleted + 73;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            int iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            int iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 2);
            CreditHighInterestComparisonResponse.MyLoan myLoan2 = (CreditHighInterestComparisonResponse.MyLoan) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, CreditHighInterestComparisonResponse$MyLoan$$serializer.INSTANCE, (Object) null);
            CreditHighInterestComparisonResponse$Comparison$$serializer creditHighInterestComparisonResponse$Comparison$$serializer = CreditHighInterestComparisonResponse$Comparison$$serializer.INSTANCE;
            CreditHighInterestComparisonResponse.Comparison comparison3 = (CreditHighInterestComparisonResponse.Comparison) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, creditHighInterestComparisonResponse$Comparison$$serializer, (Object) null);
            CreditHighInterestComparisonResponse.Comparison comparison4 = (CreditHighInterestComparisonResponse.Comparison) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, creditHighInterestComparisonResponse$Comparison$$serializer, (Object) null);
            CreditHighInterestComparisonResponse$BottomSheetInfo$$serializer creditHighInterestComparisonResponse$BottomSheetInfo$$serializer = CreditHighInterestComparisonResponse$BottomSheetInfo$$serializer.INSTANCE;
            CreditHighInterestComparisonResponse.BottomSheetInfo bottomSheetInfo3 = (CreditHighInterestComparisonResponse.BottomSheetInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, creditHighInterestComparisonResponse$BottomSheetInfo$$serializer, (Object) null);
            i = iOnTransact2;
            i2 = iOnTransact;
            bottomSheetInfo = (CreditHighInterestComparisonResponse.BottomSheetInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, creditHighInterestComparisonResponse$BottomSheetInfo$$serializer, (Object) null);
            bottomSheetInfo2 = bottomSheetInfo3;
            comparison = comparison4;
            myLoan = myLoan2;
            comparison2 = comparison3;
            str = strAsInterface;
            i3 = 255;
        } else {
            int i10 = 1;
            int iOnTransact3 = 0;
            int i11 = 0;
            CreditHighInterestComparisonResponse.BottomSheetInfo bottomSheetInfo4 = null;
            CreditHighInterestComparisonResponse.Comparison comparison5 = null;
            CreditHighInterestComparisonResponse.BottomSheetInfo bottomSheetInfo5 = null;
            CreditHighInterestComparisonResponse.MyLoan myLoan3 = null;
            CreditHighInterestComparisonResponse.Comparison comparison6 = null;
            String strAsInterface2 = null;
            int iOnTransact4 = 0;
            while (i10 == i7) {
                int i12 = onExtraCallback + 119;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (i13 != 0) {
                    int i14 = 56 / 0;
                    switch (iOnNavigationEvent) {
                        case -1:
                            i7 = 1;
                            i10 = 0;
                            break;
                        case 0:
                            i4 = 1;
                            iOnTransact4 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                            i11 |= 1;
                            i7 = i4;
                            break;
                        case 1:
                            i4 = 1;
                            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i4);
                            i11 |= 2;
                            i7 = i4;
                            break;
                        case 2:
                            iOnTransact3 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 2);
                            i11 |= 4;
                            i7 = 1;
                            break;
                        case 3:
                            myLoan3 = (CreditHighInterestComparisonResponse.MyLoan) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, CreditHighInterestComparisonResponse$MyLoan$$serializer.INSTANCE, myLoan3);
                            i11 |= 8;
                            i7 = 1;
                            break;
                        case 4:
                            comparison6 = (CreditHighInterestComparisonResponse.Comparison) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, CreditHighInterestComparisonResponse$Comparison$$serializer.INSTANCE, comparison6);
                            i11 |= 16;
                            i7 = 1;
                            break;
                        case 5:
                            comparison5 = (CreditHighInterestComparisonResponse.Comparison) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, CreditHighInterestComparisonResponse$Comparison$$serializer.INSTANCE, comparison5);
                            i11 |= 32;
                            i7 = 1;
                            break;
                        case 6:
                            bottomSheetInfo5 = (CreditHighInterestComparisonResponse.BottomSheetInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, CreditHighInterestComparisonResponse$BottomSheetInfo$$serializer.INSTANCE, bottomSheetInfo5);
                            i11 |= 64;
                            i5 = onExtraCallback + 103;
                            onWarmupCompleted = i5 % 128;
                            int i15 = i5 % 2;
                            i7 = 1;
                            break;
                        case 7:
                            bottomSheetInfo4 = (CreditHighInterestComparisonResponse.BottomSheetInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, CreditHighInterestComparisonResponse$BottomSheetInfo$$serializer.INSTANCE, bottomSheetInfo4);
                            i11 |= 128;
                            i5 = onWarmupCompleted + 23;
                            onExtraCallback = i5 % 128;
                            int i152 = i5 % 2;
                            i7 = 1;
                            break;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                } else {
                    switch (iOnNavigationEvent) {
                        case -1:
                            i7 = 1;
                            i10 = 0;
                            break;
                        case 0:
                            i4 = 1;
                            iOnTransact4 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                            i11 |= 1;
                            i7 = i4;
                            break;
                        case 1:
                            i4 = 1;
                            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i4);
                            i11 |= 2;
                            i7 = i4;
                            break;
                        case 2:
                            iOnTransact3 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 2);
                            i11 |= 4;
                            i7 = 1;
                            break;
                        case 3:
                            myLoan3 = (CreditHighInterestComparisonResponse.MyLoan) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, CreditHighInterestComparisonResponse$MyLoan$$serializer.INSTANCE, myLoan3);
                            i11 |= 8;
                            i7 = 1;
                            break;
                        case 4:
                            comparison6 = (CreditHighInterestComparisonResponse.Comparison) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, CreditHighInterestComparisonResponse$Comparison$$serializer.INSTANCE, comparison6);
                            i11 |= 16;
                            i7 = 1;
                            break;
                        case 5:
                            comparison5 = (CreditHighInterestComparisonResponse.Comparison) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, CreditHighInterestComparisonResponse$Comparison$$serializer.INSTANCE, comparison5);
                            i11 |= 32;
                            i7 = 1;
                            break;
                        case 6:
                            bottomSheetInfo5 = (CreditHighInterestComparisonResponse.BottomSheetInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, CreditHighInterestComparisonResponse$BottomSheetInfo$$serializer.INSTANCE, bottomSheetInfo5);
                            i11 |= 64;
                            i5 = onExtraCallback + 103;
                            onWarmupCompleted = i5 % 128;
                            int i1522 = i5 % 2;
                            i7 = 1;
                            break;
                        case 7:
                            bottomSheetInfo4 = (CreditHighInterestComparisonResponse.BottomSheetInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, CreditHighInterestComparisonResponse$BottomSheetInfo$$serializer.INSTANCE, bottomSheetInfo4);
                            i11 |= 128;
                            i5 = onWarmupCompleted + 23;
                            onExtraCallback = i5 % 128;
                            int i15222 = i5 % 2;
                            i7 = 1;
                            break;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                }
            }
            i = iOnTransact3;
            bottomSheetInfo = bottomSheetInfo4;
            comparison = comparison5;
            bottomSheetInfo2 = bottomSheetInfo5;
            i2 = iOnTransact4;
            i3 = i11;
            myLoan = myLoan3;
            comparison2 = comparison6;
            str = strAsInterface2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditHighInterestComparisonResponse(i3, i2, str, i, myLoan, comparison2, comparison, bottomSheetInfo2, bottomSheetInfo, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m147deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CreditHighInterestComparisonResponse creditHighInterestComparisonResponseDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 107;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return creditHighInterestComparisonResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditHighInterestComparisonResponse creditHighInterestComparisonResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(creditHighInterestComparisonResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CreditHighInterestComparisonResponse.onExtraCallbackWithResult(creditHighInterestComparisonResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditHighInterestComparisonResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CreditHighInterestComparisonResponse.onExtraCallbackWithResult(creditHighInterestComparisonResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onWarmupCompleted + 11;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditHighInterestComparisonResponse) obj);
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        int i5 = onExtraCallback + 1;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onWarmupCompleted + 19;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
