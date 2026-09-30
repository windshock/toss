package im.toss.securities.libs.performance.tracker.data.model;

import java.util.List;
import java.util.Map;
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
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class SecuritiesPerformanceLogRequestBody$$serializer implements aeu2<SecuritiesPerformanceLogRequestBody> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final SecuritiesPerformanceLogRequestBody$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 79;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        SecuritiesPerformanceLogRequestBody$$serializer securitiesPerformanceLogRequestBody$$serializer = new SecuritiesPerformanceLogRequestBody$$serializer();
        INSTANCE = securitiesPerformanceLogRequestBody$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.libs.performance.tracker.data.model.SecuritiesPerformanceLogRequestBody", securitiesPerformanceLogRequestBody$$serializer, 6);
        setanimationsloop.onWarmupCompleted("logType", false);
        setanimationsloop.onWarmupCompleted("metrics", false);
        setanimationsloop.onWarmupCompleted("customDimension", false);
        setanimationsloop.onWarmupCompleted("viewName", false);
        setanimationsloop.onWarmupCompleted("sourceType", false);
        setanimationsloop.onWarmupCompleted("metricName", false);
        descriptor = setanimationsloop;
        $stable = 8;
        int i = onExtraCallback + 117;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private SecuritiesPerformanceLogRequestBody$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrIAuthTabCallback = SecuritiesPerformanceLogRequestBody.IAuthTabCallback();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, lazyArrIAuthTabCallback[1].getValue(), lazyArrIAuthTabCallback[2].getValue(), getwrigglelayout, getwrigglelayout, getwrigglelayout};
        int i4 = onNavigationEvent + 125;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final SecuritiesPerformanceLogRequestBody deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        List list;
        String str;
        Map map;
        String str2;
        String str3;
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 113;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = SecuritiesPerformanceLogRequestBody.IAuthTabCallback();
        String strAsInterface2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            List list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), (Object) null);
            Map map2 = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrIAuthTabCallback[2].getValue(), (Object) null);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            map = map2;
            str = strAsInterface4;
            str2 = strAsInterface3;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
            str3 = strAsInterface5;
            i = 63;
            list = list2;
        } else {
            int i5 = 0;
            boolean z = true;
            Map map3 = null;
            String strAsInterface6 = null;
            String strAsInterface7 = null;
            List list3 = null;
            String strAsInterface8 = null;
            while (z) {
                int i6 = onWarmupCompleted + 97;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                    case 0:
                        strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i5 |= 1;
                    case 1:
                        list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), list3);
                        i5 |= 2;
                    case 2:
                        map3 = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrIAuthTabCallback[2].getValue(), map3);
                        i5 |= 4;
                    case 3:
                        strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i5 |= 8;
                        int i8 = onNavigationEvent + 89;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                    case 4:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i5 |= 16;
                    case 5:
                        strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                        i5 |= 32;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            strAsInterface = strAsInterface6;
            list = list3;
            str = strAsInterface7;
            map = map3;
            str2 = strAsInterface8;
            str3 = strAsInterface2;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new SecuritiesPerformanceLogRequestBody(i, str2, list, map, str, str3, strAsInterface, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m29deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        SecuritiesPerformanceLogRequestBody securitiesPerformanceLogRequestBodyDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 76 / 0;
        }
        int i5 = onWarmupCompleted + 105;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return securitiesPerformanceLogRequestBodyDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull SecuritiesPerformanceLogRequestBody securitiesPerformanceLogRequestBody) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(securitiesPerformanceLogRequestBody, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            SecuritiesPerformanceLogRequestBody.IAuthTabCallback(securitiesPerformanceLogRequestBody, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 7 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(securitiesPerformanceLogRequestBody, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            SecuritiesPerformanceLogRequestBody.IAuthTabCallback(securitiesPerformanceLogRequestBody, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onWarmupCompleted + 83;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (SecuritiesPerformanceLogRequestBody) obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
