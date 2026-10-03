package viva.republica.toss.network.model.transfer;

import android.view.ViewConfiguration;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.EncryptedContentInfoParser;
import o.aeu2;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.TransferResultPage;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class TransferResultPage$LogInfo$$serializer implements aeu2<TransferResultPage.LogInfo> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final TransferResultPage$LogInfo$$serializer INSTANCE;
    private static int asBinder = 1;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static char[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 1;
    private static char onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(char[] r36, byte r37, int r38, java.lang.Object[] r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage$LogInfo$$serializer.a(char[], byte, int, java.lang.Object[]):void");
    }

    static {
        onExtraCallbackWithResult();
        TransferResultPage$LogInfo$$serializer transferResultPage$LogInfo$$serializer = new TransferResultPage$LogInfo$$serializer();
        INSTANCE = transferResultPage$LogInfo$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.TransferResultPage.LogInfo", transferResultPage$LogInfo$$serializer, 8);
        setanimationsloop.onWarmupCompleted("status", true);
        setanimationsloop.onWarmupCompleted("nextScreenType", true);
        Object[] objArr = new Object[1];
        a(new char[]{0, 2, 3, 1}, (byte) (27 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 4, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("withdrawalBankCode", true);
        setanimationsloop.onWarmupCompleted("depositBankCode", true);
        setanimationsloop.onWarmupCompleted("selfTransferType", true);
        setanimationsloop.onWarmupCompleted("transferType", true);
        setanimationsloop.onWarmupCompleted("intelligenceLogParams", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 19;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private TransferResultPage$LogInfo$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getwrigglelayout);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(getwrigglelayout);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(getwrigglelayout);
        getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3, sp.IAuthTabCallback(getdynamicheight), sp.IAuthTabCallback(getdynamicheight), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(TransferResultPage$IntelligenceLogParams$$serializer.INSTANCE)};
        int i4 = onExtraCallback + 41;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TransferResultPage.LogInfo logInfoM112deserialize = m112deserialize(decoder);
        int i4 = onExtraCallback + 111;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return logInfoM112deserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final TransferResultPage.LogInfo m112deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Integer num;
        String str;
        String str2;
        TransferResultPage.IntelligenceLogParams intelligenceLogParams;
        int i;
        String str3;
        String str4;
        Integer num2;
        String str5;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 17;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i5 = 7;
        int i6 = 6;
        String str6 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            Integer num3 = null;
            String str7 = null;
            intelligenceLogParams = null;
            str2 = null;
            str = null;
            num = null;
            String str8 = null;
            int i7 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        String str9 = str8;
                        int i8 = onExtraCallback + 29;
                        asBinder = i8 % 128;
                        if (i8 % 2 == 0) {
                            int i9 = 4 % 2;
                        }
                        str8 = str9;
                        i5 = 7;
                        i6 = 6;
                        z = false;
                    case 0:
                        i7 |= 1;
                        str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str8);
                        i5 = 7;
                        i6 = 6;
                    case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                        str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str7);
                        i7 |= 2;
                        i5 = 7;
                    case 2:
                        str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str6);
                        i7 |= 4;
                        int i10 = onExtraCallback + 91;
                        asBinder = i10 % 128;
                        int i11 = i10 % 2;
                        i5 = 7;
                    case 3:
                        num3 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getDynamicHeight.onWarmupCompleted, num3);
                        i7 |= 8;
                    case 4:
                        num = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getDynamicHeight.onWarmupCompleted, num);
                        i7 |= 16;
                    case 5:
                        str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, str);
                        i7 |= 32;
                    case 6:
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, getWriggleLayout.onNavigationEvent, str2);
                        i7 |= 64;
                    case 7:
                        intelligenceLogParams = (TransferResultPage.IntelligenceLogParams) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, TransferResultPage$IntelligenceLogParams$$serializer.INSTANCE, intelligenceLogParams);
                        i7 |= 128;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            num2 = num3;
            i = i7;
            str3 = str8;
            str5 = str7;
            str4 = str6;
        } else {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            String str12 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
            Integer num4 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getdynamicheight, (Object) null);
            num = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getdynamicheight, (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
            intelligenceLogParams = (TransferResultPage.IntelligenceLogParams) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, TransferResultPage$IntelligenceLogParams$$serializer.INSTANCE, (Object) null);
            i = 255;
            str3 = str10;
            str4 = str12;
            num2 = num4;
            str5 = str11;
        }
        String str13 = str2;
        String str14 = str;
        Integer num5 = num;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TransferResultPage.LogInfo(i, str3, str5, str4, num2, num5, str14, str13, intelligenceLogParams, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TransferResultPage.LogInfo) obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TransferResultPage.LogInfo logInfo) {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(logInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TransferResultPage.LogInfo.onNavigationEvent(logInfo, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 111;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = new char[]{64970, 64963, 64967, 64982};
        onWarmupCompleted = (char) 51243;
    }
}
