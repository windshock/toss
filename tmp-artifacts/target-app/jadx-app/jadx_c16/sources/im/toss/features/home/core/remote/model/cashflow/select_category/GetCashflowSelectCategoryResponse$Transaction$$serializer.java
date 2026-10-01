package im.toss.features.home.core.remote.model.cashflow.select_category;

import im.toss.features.home.core.remote.model.cashflow.common.CashflowImageResponse;
import im.toss.features.home.core.remote.model.cashflow.select_category.GetCashflowSelectCategoryResponse;
import im.toss.features.home.core.remote.model.cashflow.select_category.GetCashflowSelectCategoryResponse$Category$;
import im.toss.features.home.core.remote.model.dst.widget.TextContentResponse;
import im.toss.features.home.core.remote.model.dst.widget.TextContentResponse$;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.deleteSnapshot;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class GetCashflowSelectCategoryResponse$Transaction$$serializer implements aeu2<GetCashflowSelectCategoryResponse.Transaction> {
    private static int IAuthTabCallback = 1;
    public static final GetCashflowSelectCategoryResponse$Transaction$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 13;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            serialDescriptor = descriptor;
            int i4 = 1 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i2 + 123;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        GetCashflowSelectCategoryResponse$Transaction$$serializer getCashflowSelectCategoryResponse$Transaction$$serializer = new GetCashflowSelectCategoryResponse$Transaction$$serializer();
        INSTANCE = getCashflowSelectCategoryResponse$Transaction$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.cashflow.select_category.GetCashflowSelectCategoryResponse.Transaction", getCashflowSelectCategoryResponse$Transaction$$serializer, 6);
        setanimationsloop.onWarmupCompleted("id", true);
        setanimationsloop.onWarmupCompleted("category", true);
        setanimationsloop.onWarmupCompleted("image", true);
        setanimationsloop.onWarmupCompleted("row1", true);
        setanimationsloop.onWarmupCompleted("row2", true);
        setanimationsloop.onWarmupCompleted("row3", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 19;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private GetCashflowSelectCategoryResponse$Transaction$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(GetCashflowSelectCategoryResponse$Category$.serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(deleteSnapshot.onExtraCallback);
        TextContentResponse$.serializer serializerVar = TextContentResponse$.serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3, sp.IAuthTabCallback(serializerVar), sp.IAuthTabCallback(serializerVar), sp.IAuthTabCallback(serializerVar)};
        int i4 = IAuthTabCallback + 3;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final GetCashflowSelectCategoryResponse.Transaction deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        TextContentResponse textContentResponse;
        TextContentResponse textContentResponse2;
        int i;
        TextContentResponse textContentResponse3;
        String str;
        CashflowImageResponse cashflowImageResponse;
        GetCashflowSelectCategoryResponse.Category category;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i3 = 5;
        TextContentResponse textContentResponse4 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            GetCashflowSelectCategoryResponse.Category category2 = (GetCashflowSelectCategoryResponse.Category) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, GetCashflowSelectCategoryResponse$Category$.serializer.INSTANCE, (Object) null);
            CashflowImageResponse cashflowImageResponse2 = (CashflowImageResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, deleteSnapshot.onExtraCallback, (Object) null);
            TextContentResponse$.serializer serializerVar = TextContentResponse$.serializer.INSTANCE;
            TextContentResponse textContentResponse5 = (TextContentResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, serializerVar, (Object) null);
            TextContentResponse textContentResponse6 = (TextContentResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, serializerVar, (Object) null);
            cashflowImageResponse = cashflowImageResponse2;
            str = str2;
            textContentResponse = (TextContentResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, serializerVar, (Object) null);
            textContentResponse2 = textContentResponse5;
            textContentResponse3 = textContentResponse6;
            category = category2;
            i = 63;
        } else {
            int i4 = 0;
            boolean z = true;
            TextContentResponse textContentResponse7 = null;
            CashflowImageResponse cashflowImageResponse3 = null;
            String str3 = null;
            TextContentResponse textContentResponse8 = null;
            GetCashflowSelectCategoryResponse.Category category3 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                    case 0:
                        str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str3);
                        i4 |= 1;
                        i3 = 5;
                    case 1:
                        category3 = (GetCashflowSelectCategoryResponse.Category) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, GetCashflowSelectCategoryResponse$Category$.serializer.INSTANCE, category3);
                        i4 |= 2;
                        i3 = 5;
                    case 2:
                        cashflowImageResponse3 = (CashflowImageResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, deleteSnapshot.onExtraCallback, cashflowImageResponse3);
                        i4 |= 4;
                        int i5 = onWarmupCompleted + 43;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        i3 = 5;
                    case 3:
                        textContentResponse4 = (TextContentResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, TextContentResponse$.serializer.INSTANCE, textContentResponse4);
                        i4 |= 8;
                        int i7 = onWarmupCompleted + 107;
                        IAuthTabCallback = i7 % 128;
                        int i8 = i7 % 2;
                        i3 = 5;
                    case 4:
                        textContentResponse7 = (TextContentResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TextContentResponse$.serializer.INSTANCE, textContentResponse7);
                        i4 |= 16;
                    case 5:
                        textContentResponse8 = (TextContentResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, TextContentResponse$.serializer.INSTANCE, textContentResponse8);
                        i4 |= 32;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            textContentResponse = textContentResponse8;
            textContentResponse2 = textContentResponse4;
            i = i4;
            GetCashflowSelectCategoryResponse.Category category4 = category3;
            textContentResponse3 = textContentResponse7;
            str = str3;
            cashflowImageResponse = cashflowImageResponse3;
            category = category4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new GetCashflowSelectCategoryResponse.Transaction(i, str, category, cashflowImageResponse, textContentResponse2, textContentResponse3, textContentResponse, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m573deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            throw null;
        }
        GetCashflowSelectCategoryResponse.Transaction transactionDeserialize = deserialize(decoder);
        int i3 = onWarmupCompleted + 83;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return transactionDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull GetCashflowSelectCategoryResponse.Transaction transaction) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(transaction, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            GetCashflowSelectCategoryResponse.Transaction.onNavigationEvent(transaction, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(transaction, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        GetCashflowSelectCategoryResponse.Transaction.onNavigationEvent(transaction, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onWarmupCompleted + 57;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (GetCashflowSelectCategoryResponse.Transaction) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 29;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
