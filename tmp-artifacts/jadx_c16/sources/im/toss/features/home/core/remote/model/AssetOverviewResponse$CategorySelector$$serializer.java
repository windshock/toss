package im.toss.features.home.core.remote.model;

import im.toss.features.home.core.remote.model.AssetOverviewResponse;
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
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetOverviewResponse$CategorySelector$$serializer implements aeu2<AssetOverviewResponse.CategorySelector> {
    private static int IAuthTabCallback = 1;
    public static final AssetOverviewResponse$CategorySelector$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 15;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        AssetOverviewResponse$CategorySelector$$serializer assetOverviewResponse$CategorySelector$$serializer = new AssetOverviewResponse$CategorySelector$$serializer();
        INSTANCE = assetOverviewResponse$CategorySelector$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.AssetOverviewResponse.CategorySelector", assetOverviewResponse$CategorySelector$$serializer, 2);
        setanimationsloop.onWarmupCompleted("id", false);
        setanimationsloop.onWarmupCompleted("categories", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private AssetOverviewResponse$CategorySelector$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Lazy[] lazyArrIAuthTabCallback = AssetOverviewResponse.CategorySelector.IAuthTabCallback();
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent);
            KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallback[0].getValue());
            kSerializerArr = new KSerializer[2];
            kSerializerArr[1] = kSerializerIAuthTabCallback;
            kSerializerArr[1] = kSerializerIAuthTabCallback2;
        } else {
            kSerializerArr = new KSerializer[]{sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback((KSerializer) AssetOverviewResponse.CategorySelector.IAuthTabCallback()[1].getValue())};
        }
        int i3 = onWarmupCompleted + 103;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AssetOverviewResponse.CategorySelector deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        List list;
        String str;
        jp jpVar;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = AssetOverviewResponse.CategorySelector.IAuthTabCallback();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onExtraCallback + 85;
            onWarmupCompleted = i3 % 128;
            i = 3;
            if (i3 % 2 == 0) {
                str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
                jpVar = (jp) lazyArrIAuthTabCallback[0].getValue();
            } else {
                str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
                jpVar = (jp) lazyArrIAuthTabCallback[1].getValue();
            }
            list = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, jpVar, (Object) null);
        } else {
            int i4 = 0;
            List list2 = null;
            String str2 = null;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i5 = onWarmupCompleted;
                    int i6 = i5 + 97;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    if (iOnNavigationEvent != 0) {
                        int i8 = i5 + 97;
                        onExtraCallback = i8 % 128;
                        if (i8 % 2 != 0) {
                            if (iOnNavigationEvent != 0) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), list2);
                            i4 |= 2;
                            int i9 = onExtraCallback + 83;
                            onWarmupCompleted = i9 % 128;
                            int i10 = i9 % 2;
                        } else {
                            if (iOnNavigationEvent != 1) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), list2);
                            i4 |= 2;
                            int i92 = onExtraCallback + 83;
                            onWarmupCompleted = i92 % 128;
                            int i102 = i92 % 2;
                        }
                    } else {
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str2);
                        i4 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            i = i4;
            list = list2;
            str = str2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AssetOverviewResponse.CategorySelector(i, str, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m523deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AssetOverviewResponse.CategorySelector categorySelectorDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 31;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return categorySelectorDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AssetOverviewResponse.CategorySelector categorySelector) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(categorySelector, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            AssetOverviewResponse.CategorySelector.IAuthTabCallback(categorySelector, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(categorySelector, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        AssetOverviewResponse.CategorySelector.IAuthTabCallback(categorySelector, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onWarmupCompleted + 41;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AssetOverviewResponse.CategorySelector) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 45;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 0 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onExtraCallback + 125;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
