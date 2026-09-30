package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.ExperimentHomeOverviewAssetRowALocal;
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
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ExperimentHomeOverviewAssetRowALocal$Content$Numeric$$serializer implements aeu2<ExperimentHomeOverviewAssetRowALocal.Content.Numeric> {
    private static int IAuthTabCallback = 1;
    public static final ExperimentHomeOverviewAssetRowALocal$Content$Numeric$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 48 / 0;
        }
        return serialDescriptor;
    }

    static {
        ExperimentHomeOverviewAssetRowALocal$Content$Numeric$$serializer experimentHomeOverviewAssetRowALocal$Content$Numeric$$serializer = new ExperimentHomeOverviewAssetRowALocal$Content$Numeric$$serializer();
        INSTANCE = experimentHomeOverviewAssetRowALocal$Content$Numeric$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ExperimentHomeOverviewAssetRowALocal.Content.Numeric", experimentHomeOverviewAssetRowALocal$Content$Numeric$$serializer, 5);
        setanimationsloop.onWarmupCompleted("prefix", true);
        setanimationsloop.onWarmupCompleted("stringNumber", true);
        setanimationsloop.onWarmupCompleted("unit", true);
        setanimationsloop.onWarmupCompleted("number", true);
        setanimationsloop.onWarmupCompleted("precision", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 103;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 21 / 0;
        }
    }

    private ExperimentHomeOverviewAssetRowALocal$Content$Numeric$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(oty1.onExtraCallback), sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted)};
        int i4 = onWarmupCompleted + 61;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ExperimentHomeOverviewAssetRowALocal.Content.Numeric deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Long l;
        Integer num;
        int i;
        String str;
        String str2;
        String str3;
        char c;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        boolean z = false;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            l = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, oty1.onExtraCallback, (Object) null);
            num = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getDynamicHeight.onWarmupCompleted, (Object) null);
            i = 31;
            str = str4;
            str2 = str5;
        } else {
            int i3 = 0;
            boolean z2 = true;
            String str6 = null;
            Long l2 = null;
            Integer num2 = null;
            String str7 = null;
            String str8 = null;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = onWarmupCompleted;
                    int i5 = i4 + 95;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        throw null;
                    }
                    if (iOnNavigationEvent != 0) {
                        int i6 = i4 + 51;
                        IAuthTabCallback = i6 % 128;
                        int i7 = i6 % 2;
                        if (iOnNavigationEvent == 1) {
                            c = 4;
                            str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str8);
                            i3 |= 2;
                        } else if (iOnNavigationEvent == 2) {
                            c = 4;
                            str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str6);
                            i3 |= 4;
                        } else if (iOnNavigationEvent == 3) {
                            c = 4;
                            l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, oty1.onExtraCallback, l2);
                            i3 |= 8;
                        } else {
                            if (iOnNavigationEvent != 4) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i8 = i4 + 91;
                            IAuthTabCallback = i8 % 128;
                            int i9 = i8 % 2;
                            getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
                            if (i9 == 0) {
                                num2 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getdynamicheight, num2);
                                i3 |= 111;
                                z = false;
                            } else {
                                c = 4;
                                num2 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getdynamicheight, num2);
                                i3 |= 16;
                            }
                        }
                        z = false;
                    } else {
                        str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str7);
                        i3 |= 1;
                        z = false;
                    }
                } else {
                    z2 = z;
                }
            }
            l = l2;
            num = num2;
            i = i3;
            str = str7;
            str2 = str8;
            str3 = str6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ExperimentHomeOverviewAssetRowALocal.Content.Numeric(i, str, str2, str3, l, num, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m365deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            throw null;
        }
        ExperimentHomeOverviewAssetRowALocal.Content.Numeric numericDeserialize = deserialize(decoder);
        int i3 = onWarmupCompleted + 35;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return numericDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ExperimentHomeOverviewAssetRowALocal.Content.Numeric numeric) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(numeric, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ExperimentHomeOverviewAssetRowALocal.Content.Numeric.onExtraCallbackWithResult(numeric, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 39;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ExperimentHomeOverviewAssetRowALocal.Content.Numeric) obj);
        if (i3 == 0) {
            int i4 = 80 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 77;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
