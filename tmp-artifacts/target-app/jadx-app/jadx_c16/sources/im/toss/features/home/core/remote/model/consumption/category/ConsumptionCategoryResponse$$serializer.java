package im.toss.features.home.core.remote.model.consumption.category;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionCategoryResponse$$serializer implements aeu2<ConsumptionCategoryResponse> {
    private static int IAuthTabCallback = 1;
    public static final ConsumptionCategoryResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 95;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        ConsumptionCategoryResponse$$serializer consumptionCategoryResponse$$serializer = new ConsumptionCategoryResponse$$serializer();
        INSTANCE = consumptionCategoryResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.consumption.category.ConsumptionCategoryResponse", consumptionCategoryResponse$$serializer, 7);
        setanimationsloop.onWarmupCompleted("categoryNo", false);
        setanimationsloop.onWarmupCompleted("categoryName", false);
        setanimationsloop.onWarmupCompleted("categoryIconNo", false);
        setanimationsloop.onWarmupCompleted("imgUri", false);
        setanimationsloop.onWarmupCompleted("imgBgUri", false);
        setanimationsloop.onWarmupCompleted("iconUri", true);
        setanimationsloop.onWarmupCompleted("isCustom", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 103;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ConsumptionCategoryResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(CategoryIconUriResponse$$serializer.INSTANCE), sp.IAuthTabCallback(getBgColor.IAuthTabCallback)};
        int i4 = onWarmupCompleted + 25;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ConsumptionCategoryResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Boolean bool;
        CategoryIconUriResponse categoryIconUriResponse;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 111;
        onWarmupCompleted = i3 % 128;
        String str6 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 6;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            String str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            String str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            String str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            CategoryIconUriResponse categoryIconUriResponse2 = (CategoryIconUriResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, CategoryIconUriResponse$$serializer.INSTANCE, (Object) null);
            str2 = str9;
            str = str11;
            bool = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getBgColor.IAuthTabCallback, (Object) null);
            i = 127;
            categoryIconUriResponse = categoryIconUriResponse2;
            str5 = str10;
            str4 = str8;
            str3 = str7;
        } else {
            Boolean bool2 = null;
            CategoryIconUriResponse categoryIconUriResponse3 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            boolean z = true;
            int i5 = 0;
            while (z) {
                int i6 = onWarmupCompleted + 43;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        int i8 = IAuthTabCallback + 113;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                        i4 = 6;
                        z = false;
                    case 0:
                        str13 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str13);
                        i5 |= 1;
                        i4 = 6;
                    case 1:
                        str15 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str15);
                        i5 |= 2;
                    case 2:
                        str12 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str12);
                        i5 |= 4;
                    case 3:
                        str14 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str14);
                        i5 |= 8;
                    case 4:
                        str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str6);
                        i5 |= 16;
                    case 5:
                        categoryIconUriResponse3 = (CategoryIconUriResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, CategoryIconUriResponse$$serializer.INSTANCE, categoryIconUriResponse3);
                        i5 |= 32;
                    case 6:
                        bool2 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, getBgColor.IAuthTabCallback, bool2);
                        i5 |= 64;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            bool = bool2;
            categoryIconUriResponse = categoryIconUriResponse3;
            i = i5;
            str = str6;
            String str16 = str14;
            str2 = str12;
            str3 = str13;
            str4 = str15;
            str5 = str16;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ConsumptionCategoryResponse(i, str3, str4, str2, str5, str, categoryIconUriResponse, bool, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m583deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ConsumptionCategoryResponse consumptionCategoryResponseDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 37;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return consumptionCategoryResponseDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ConsumptionCategoryResponse consumptionCategoryResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(consumptionCategoryResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ConsumptionCategoryResponse.onNavigationEvent(consumptionCategoryResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 107;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ConsumptionCategoryResponse) obj);
        int i4 = IAuthTabCallback + 35;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 99;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
