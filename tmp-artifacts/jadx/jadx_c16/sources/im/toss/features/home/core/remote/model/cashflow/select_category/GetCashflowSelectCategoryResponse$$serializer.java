package im.toss.features.home.core.remote.model.cashflow.select_category;

import im.toss.features.home.core.remote.model.cashflow.select_category.GetCashflowSelectCategoryResponse;
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
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class GetCashflowSelectCategoryResponse$$serializer implements aeu2<GetCashflowSelectCategoryResponse> {
    public static final GetCashflowSelectCategoryResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 109;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        GetCashflowSelectCategoryResponse$$serializer getCashflowSelectCategoryResponse$$serializer = new GetCashflowSelectCategoryResponse$$serializer();
        INSTANCE = getCashflowSelectCategoryResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.cashflow.select_category.GetCashflowSelectCategoryResponse", getCashflowSelectCategoryResponse$$serializer, 3);
        setanimationsloop.onWarmupCompleted("transaction", true);
        setanimationsloop.onWarmupCompleted("categories", true);
        setanimationsloop.onWarmupCompleted("customCategories", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 59;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private GetCashflowSelectCategoryResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrIAuthTabCallback = GetCashflowSelectCategoryResponse.IAuthTabCallback();
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(GetCashflowSelectCategoryResponse$Transaction$$serializer.INSTANCE), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallback[1].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallback[2].getValue())};
        int i4 = onWarmupCompleted + 31;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final GetCashflowSelectCategoryResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        GetCashflowSelectCategoryResponse.Transaction transaction;
        List list;
        List list2;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = GetCashflowSelectCategoryResponse.IAuthTabCallback();
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            i = 0;
            list = null;
            list2 = null;
            transaction = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i3 = onWarmupCompleted + 123;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        if (iOnNavigationEvent == 1) {
                            list = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), list);
                            i |= 2;
                        } else {
                            if (iOnNavigationEvent == 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrIAuthTabCallback[2].getValue(), list2);
                            i |= 4;
                            int i4 = onExtraCallback + 123;
                            onWarmupCompleted = i4 % 128;
                            int i5 = i4 % 2;
                        }
                    } else if (iOnNavigationEvent == 1) {
                        list = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), list);
                        i |= 2;
                    } else if (iOnNavigationEvent == 2) {
                    }
                } else {
                    transaction = (GetCashflowSelectCategoryResponse.Transaction) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, GetCashflowSelectCategoryResponse$Transaction$$serializer.INSTANCE, transaction);
                    i |= 1;
                }
            }
        } else {
            transaction = (GetCashflowSelectCategoryResponse.Transaction) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, GetCashflowSelectCategoryResponse$Transaction$$serializer.INSTANCE, (Object) null);
            list = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), (Object) null);
            list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrIAuthTabCallback[2].getValue(), (Object) null);
            i = 7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        GetCashflowSelectCategoryResponse getCashflowSelectCategoryResponse = new GetCashflowSelectCategoryResponse(i, transaction, list, list2, (okycx) null);
        int i6 = onWarmupCompleted + 39;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return getCashflowSelectCategoryResponse;
        }
        throw null;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m572deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        GetCashflowSelectCategoryResponse getCashflowSelectCategoryResponseDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 19;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return getCashflowSelectCategoryResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull GetCashflowSelectCategoryResponse getCashflowSelectCategoryResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(getCashflowSelectCategoryResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            GetCashflowSelectCategoryResponse.onExtraCallback(getCashflowSelectCategoryResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(getCashflowSelectCategoryResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        GetCashflowSelectCategoryResponse.onExtraCallback(getCashflowSelectCategoryResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (GetCashflowSelectCategoryResponse) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallback + 47;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
