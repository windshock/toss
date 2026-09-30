package viva.republica.toss.network.model.transfer;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.aeu2;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.DepositTargetRecommendResponse;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class DepositTargetRecommendResponse$$serializer implements aeu2<DepositTargetRecommendResponse> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final DepositTargetRecommendResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 25;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 19;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return serialDescriptor;
        }
        obj.hashCode();
        throw null;
    }

    static {
        DepositTargetRecommendResponse$$serializer depositTargetRecommendResponse$$serializer = new DepositTargetRecommendResponse$$serializer();
        INSTANCE = depositTargetRecommendResponse$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.DepositTargetRecommendResponse", depositTargetRecommendResponse$$serializer, 5);
        setanimationsloop.onWarmupCompleted("myTargets", true);
        setanimationsloop.onWarmupCompleted("recentTargets", true);
        setanimationsloop.onWarmupCompleted("suggestedTargets", true);
        setanimationsloop.onWarmupCompleted("banner", true);
        setanimationsloop.onWarmupCompleted("shareTransferInProgress", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 39;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private DepositTargetRecommendResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrIAuthTabCallback = DepositTargetRecommendResponse.IAuthTabCallback();
        KSerializer<?>[] kSerializerArr = {lazyArrIAuthTabCallback[0].getValue(), lazyArrIAuthTabCallback[1].getValue(), lazyArrIAuthTabCallback[2].getValue(), sp.IAuthTabCallback(DepositTargetRecommendResponse$Banner$$serializer.INSTANCE), sp.IAuthTabCallback(DepositTargetRecommendResponse$TransferShareInProgressInfoModel$$serializer.INSTANCE)};
        int i4 = onWarmupCompleted + 99;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        DepositTargetRecommendResponse depositTargetRecommendResponseM88deserialize = m88deserialize(decoder);
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
        int i5 = IAuthTabCallback + 117;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return depositTargetRecommendResponseM88deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final DepositTargetRecommendResponse m88deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        DepositTargetRecommendResponse.Banner banner;
        List list2;
        DepositTargetRecommendResponse.TransferShareInProgressInfoModel transferShareInProgressInfoModel;
        int i;
        List list3;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = DepositTargetRecommendResponse.IAuthTabCallback();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            List list4 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), (Object) null);
            List list5 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), (Object) null);
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrIAuthTabCallback[2].getValue(), (Object) null);
            banner = (DepositTargetRecommendResponse.Banner) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, DepositTargetRecommendResponse$Banner$$serializer.INSTANCE, (Object) null);
            list2 = list4;
            transferShareInProgressInfoModel = (DepositTargetRecommendResponse.TransferShareInProgressInfoModel) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, DepositTargetRecommendResponse$TransferShareInProgressInfoModel$$serializer.INSTANCE, (Object) null);
            i = 31;
            list3 = list5;
        } else {
            int i3 = 0;
            boolean z = true;
            List list6 = null;
            DepositTargetRecommendResponse.Banner banner2 = null;
            List list7 = null;
            DepositTargetRecommendResponse.TransferShareInProgressInfoModel transferShareInProgressInfoModel2 = null;
            List list8 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = IAuthTabCallback;
                    int i5 = i4 + 71;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        list7 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), list7);
                        i3 |= 1;
                    } else if (iOnNavigationEvent != 1) {
                        int i6 = i4 + 33;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % 2;
                        if (iOnNavigationEvent != 2) {
                            int i8 = i4 + 33;
                            onWarmupCompleted = i8 % 128;
                            int i9 = i8 % 2;
                            if (iOnNavigationEvent == 3) {
                                banner2 = (DepositTargetRecommendResponse.Banner) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, DepositTargetRecommendResponse$Banner$$serializer.INSTANCE, banner2);
                                i3 |= 8;
                            } else {
                                if (iOnNavigationEvent != 4) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                transferShareInProgressInfoModel2 = (DepositTargetRecommendResponse.TransferShareInProgressInfoModel) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, DepositTargetRecommendResponse$TransferShareInProgressInfoModel$$serializer.INSTANCE, transferShareInProgressInfoModel2);
                                i3 |= 16;
                            }
                        } else {
                            list6 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrIAuthTabCallback[2].getValue(), list6);
                            i3 |= 4;
                        }
                    } else {
                        list8 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), list8);
                        i3 |= 2;
                    }
                } else {
                    z = false;
                }
            }
            int i10 = IAuthTabCallback + 109;
            onWarmupCompleted = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 5 % 3;
            }
            list = list6;
            banner = banner2;
            list2 = list7;
            transferShareInProgressInfoModel = transferShareInProgressInfoModel2;
            i = i3;
            list3 = list8;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DepositTargetRecommendResponse(i, list2, list3, list, banner, transferShareInProgressInfoModel, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DepositTargetRecommendResponse) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 15;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DepositTargetRecommendResponse depositTargetRecommendResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(depositTargetRecommendResponse, BuildConfig.FLAVOR);
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            DepositTargetRecommendResponse.onExtraCallbackWithResult(depositTargetRecommendResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(depositTargetRecommendResponse, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        DepositTargetRecommendResponse.onExtraCallbackWithResult(depositTargetRecommendResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = IAuthTabCallback + 73;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
