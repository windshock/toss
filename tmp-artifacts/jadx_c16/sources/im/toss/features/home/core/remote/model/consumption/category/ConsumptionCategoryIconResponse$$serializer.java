package im.toss.features.home.core.remote.model.consumption.category;

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

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionCategoryIconResponse$$serializer implements aeu2<ConsumptionCategoryIconResponse> {
    private static int IAuthTabCallback = 0;
    public static final ConsumptionCategoryIconResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            serialDescriptor = descriptor;
            int i4 = 45 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i3 + 121;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        ConsumptionCategoryIconResponse$$serializer consumptionCategoryIconResponse$$serializer = new ConsumptionCategoryIconResponse$$serializer();
        INSTANCE = consumptionCategoryIconResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.consumption.category.ConsumptionCategoryIconResponse", consumptionCategoryIconResponse$$serializer, 4);
        setanimationsloop.onWarmupCompleted("categoryIconNo", false);
        setanimationsloop.onWarmupCompleted("imgUri", false);
        setanimationsloop.onWarmupCompleted("imgBgUri", false);
        setanimationsloop.onWarmupCompleted("iconUri", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 39;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ConsumptionCategoryIconResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(CategoryIconUriResponse$$serializer.INSTANCE)};
        int i4 = IAuthTabCallback + 23;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ConsumptionCategoryIconResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        CategoryIconUriResponse categoryIconUriResponse;
        String str2;
        String str3;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        String str4 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            categoryIconUriResponse = (CategoryIconUriResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, CategoryIconUriResponse$$serializer.INSTANCE, (Object) null);
            i = 15;
            str3 = str5;
            str2 = str6;
        } else {
            int i4 = IAuthTabCallback + 27;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 0;
            boolean z = true;
            CategoryIconUriResponse categoryIconUriResponse2 = null;
            String str7 = null;
            String str8 = null;
            while (z) {
                int i7 = IAuthTabCallback + 25;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i9 = onWarmupCompleted;
                    int i10 = i9 + 89;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                    if (iOnNavigationEvent != 0) {
                        if (iOnNavigationEvent == 1) {
                            str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str7);
                            i6 |= 2;
                            i2 = onWarmupCompleted + 67;
                            IAuthTabCallback = i2 % 128;
                        } else if (iOnNavigationEvent == 2) {
                            str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str4);
                            i6 |= 4;
                            i2 = IAuthTabCallback + 99;
                            onWarmupCompleted = i2 % 128;
                        } else {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i12 = i9 + 13;
                            IAuthTabCallback = i12 % 128;
                            int i13 = i12 % 2;
                            categoryIconUriResponse2 = (CategoryIconUriResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, CategoryIconUriResponse$$serializer.INSTANCE, categoryIconUriResponse2);
                            i6 |= 8;
                        }
                        int i14 = i2 % 2;
                    } else {
                        str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str8);
                        i6 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            i = i6;
            str = str4;
            categoryIconUriResponse = categoryIconUriResponse2;
            str2 = str7;
            str3 = str8;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ConsumptionCategoryIconResponse(i, str3, str2, str, categoryIconUriResponse, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m582deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ConsumptionCategoryIconResponse consumptionCategoryIconResponseDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 77;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return consumptionCategoryIconResponseDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ConsumptionCategoryIconResponse consumptionCategoryIconResponse) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(consumptionCategoryIconResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ConsumptionCategoryIconResponse.onExtraCallbackWithResult(consumptionCategoryIconResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 95;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ConsumptionCategoryIconResponse) obj);
        int i4 = IAuthTabCallback + 63;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
