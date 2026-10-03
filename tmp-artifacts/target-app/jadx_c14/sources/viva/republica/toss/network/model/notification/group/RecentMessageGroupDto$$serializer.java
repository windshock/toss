package viva.republica.toss.network.model.notification.group;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.EncryptedContentInfoParser;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.jp;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class RecentMessageGroupDto$$serializer implements aeu2<RecentMessageGroupDto> {
    private static int IAuthTabCallback = 1;
    public static final RecentMessageGroupDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        RecentMessageGroupDto$$serializer recentMessageGroupDto$$serializer = new RecentMessageGroupDto$$serializer();
        INSTANCE = recentMessageGroupDto$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.notification.group.RecentMessageGroupDto", recentMessageGroupDto$$serializer, 10);
        setanimationsloop.onWarmupCompleted("serviceId", false);
        setanimationsloop.onWarmupCompleted("serviceName", false);
        setanimationsloop.onWarmupCompleted("serviceIcon", false);
        setanimationsloop.onWarmupCompleted("totalMessageCount", true);
        setanimationsloop.onWarmupCompleted("serviceCorporationCodes", true);
        setanimationsloop.onWarmupCompleted("contents", false);
        setanimationsloop.onWarmupCompleted("isAllBlocked", true);
        setanimationsloop.onWarmupCompleted("isMore", true);
        setanimationsloop.onWarmupCompleted("company", true);
        setanimationsloop.onWarmupCompleted("isFold", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 109;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private RecentMessageGroupDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallback = RecentMessageGroupDto.onExtraCallback();
        oty1 oty1Var = oty1.onExtraCallback;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        getBgColor getbgcolor = getBgColor.IAuthTabCallback;
        KSerializer<?>[] kSerializerArr = {oty1Var, getwrigglelayout, getwrigglelayout, oty1Var, lazyArrOnExtraCallback[4].getValue(), lazyArrOnExtraCallback[5].getValue(), getbgcolor, getbgcolor, sp.IAuthTabCallback(getwrigglelayout), getbgcolor};
        int i4 = onExtraCallback + 117;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        RecentMessageGroupDto recentMessageGroupDtoM62deserialize = m62deserialize(decoder);
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
        return recentMessageGroupDtoM62deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final RecentMessageGroupDto m62deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        List list;
        List list2;
        String str;
        boolean z;
        long j;
        boolean z2;
        boolean z3;
        String str2;
        String str3;
        long jIAuthTabCallbackDefault;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = RecentMessageGroupDto.onExtraCallback();
        int i3 = 9;
        int i4 = 7;
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            long jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 3);
            List list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArrOnExtraCallback[4].getValue(), (Object) null);
            List list4 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrOnExtraCallback[5].getValue(), (Object) null);
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6);
            boolean zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7);
            String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getWriggleLayout.onNavigationEvent, (Object) null);
            boolean zOnExtraCallbackWithResult3 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9);
            int i5 = onExtraCallback + 71;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 / 3;
            }
            list = list4;
            z = zOnExtraCallbackWithResult3;
            z2 = zOnExtraCallbackWithResult2;
            z3 = zOnExtraCallbackWithResult;
            str = str4;
            list2 = list3;
            j = jIAuthTabCallbackDefault2;
            i = 1023;
            str3 = strAsInterface;
            str2 = strAsInterface2;
        } else {
            boolean z4 = true;
            int i7 = 0;
            List list5 = null;
            List list6 = null;
            String strAsInterface3 = null;
            String strAsInterface4 = null;
            long jIAuthTabCallbackDefault3 = 0;
            long jIAuthTabCallbackDefault4 = 0;
            boolean zOnExtraCallbackWithResult4 = false;
            boolean zOnExtraCallbackWithResult5 = false;
            String str5 = null;
            boolean zOnExtraCallbackWithResult6 = false;
            while (z4) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z4 = false;
                    case 0:
                        jIAuthTabCallbackDefault3 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i7 |= 1;
                        int i8 = onNavigationEvent + 37;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % 2;
                        i3 = 9;
                        i4 = 7;
                    case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i7 |= 2;
                        i3 = 9;
                    case 2:
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i7 |= 4;
                        i3 = 9;
                    case 3:
                        jIAuthTabCallbackDefault4 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 3);
                        i7 |= 8;
                    case 4:
                        list5 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArrOnExtraCallback[4].getValue(), list5);
                        i7 |= 16;
                    case 5:
                        list6 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrOnExtraCallback[5].getValue(), list6);
                        i7 |= 32;
                    case 6:
                        zOnExtraCallbackWithResult5 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6);
                        i7 |= 64;
                    case 7:
                        zOnExtraCallbackWithResult4 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4);
                        i7 |= 128;
                    case 8:
                        str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getWriggleLayout.onNavigationEvent, str5);
                        i7 |= 256;
                    case 9:
                        zOnExtraCallbackWithResult6 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3);
                        i7 |= 512;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            i = i7;
            list = list6;
            String str6 = strAsInterface4;
            list2 = list5;
            long j2 = jIAuthTabCallbackDefault4;
            str = str5;
            z = zOnExtraCallbackWithResult6;
            j = jIAuthTabCallbackDefault3;
            z2 = zOnExtraCallbackWithResult4;
            z3 = zOnExtraCallbackWithResult5;
            str2 = strAsInterface3;
            str3 = str6;
            jIAuthTabCallbackDefault = j2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new RecentMessageGroupDto(i, j, str3, str2, jIAuthTabCallbackDefault, list2, list, z3, z2, str, z, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (RecentMessageGroupDto) obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull RecentMessageGroupDto recentMessageGroupDto) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(recentMessageGroupDto, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        RecentMessageGroupDto.onExtraCallbackWithResult(recentMessageGroupDto, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 103;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 30 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onNavigationEvent + 101;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
