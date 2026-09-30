package im.toss.features.home.core.remote.model.consumption.transaction;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.remote.model.consumption.transaction.ConsumptionTransactionDetailResponse;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.SaveVideoToAlbumBridgeExtension;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionTransactionDetailResponse$$serializer implements aeu2<ConsumptionTransactionDetailResponse> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static boolean IAuthTabCallback = false;
    public static final ConsumptionTransactionDetailResponse$$serializer INSTANCE;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static char[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onTransact;
    private static boolean onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 73;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        IAuthTabCallback();
        ConsumptionTransactionDetailResponse$$serializer consumptionTransactionDetailResponse$$serializer = new ConsumptionTransactionDetailResponse$$serializer();
        INSTANCE = consumptionTransactionDetailResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.consumption.transaction.ConsumptionTransactionDetailResponse", consumptionTransactionDetailResponse$$serializer, 18);
        setanimationsloop.onWarmupCompleted("itemId", false);
        setanimationsloop.onWarmupCompleted("amount", false);
        setanimationsloop.onWarmupCompleted("categoryNo", false);
        setanimationsloop.onWarmupCompleted("categoryName", false);
        setanimationsloop.onWarmupCompleted("sourceIds", false);
        setanimationsloop.onWarmupCompleted("time", false);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-120, -121, -122, -123, -124, -125, -126, -127}, 127 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("lottieUrl", false);
        setanimationsloop.onWarmupCompleted("titleContent", false);
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-123, -120, -119, -127, -119}, KeyEvent.keyCodeFromString("") + 127, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        Object[] objArr3 = new Object[1];
        a(null, null, new byte[]{-123, -117, -120, -125, -118}, AndroidCharacter.getMirror('0') + 'O', objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), false);
        Object[] objArr4 = new Object[1];
        a(null, null, new byte[]{-111, -112, -127, -119, -113, -127, -121, -114, -115, -123, -116}, Color.green(0) + 127, objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("brandName", false);
        setanimationsloop.onWarmupCompleted("timelineItemType", false);
        setanimationsloop.onWarmupCompleted("methodType", true);
        setanimationsloop.onWarmupCompleted("transactionType", true);
        setanimationsloop.onWarmupCompleted("useStore", true);
        setanimationsloop.onWarmupCompleted("memo", true);
        descriptor = setanimationsloop;
        int i = asInterface + 25;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private ConsumptionTransactionDetailResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallback = ConsumptionTransactionDetailResponse.onExtraCallback();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(oty1.onExtraCallback), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallback[4].getValue()), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(ConsumptionTransactionDetailResponse$TitleContent$$serializer.INSTANCE), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallback[15].getValue()), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = asBinder + 41;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0109 A[PHI: r0 r2 r12
      0x0109: PHI (r0v5 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0047, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r2v11 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v12 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0047, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r12v11 kotlin.Lazy[]) = (r12v1 kotlin.Lazy[]), (r12v13 kotlin.Lazy[]) binds: [B:8:0x0047, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049 A[PHI: r0 r2 r12
      0x0049: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0047, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v12 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0047, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r12v2 kotlin.Lazy[]) = (r12v1 kotlin.Lazy[]), (r12v13 kotlin.Lazy[]) binds: [B:8:0x0047, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ConsumptionTransactionDetailResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrOnExtraCallback;
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        String str5;
        String str6;
        ConsumptionTransactionDetailResponse.TitleContent titleContent;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        Long l;
        List list;
        SaveVideoToAlbumBridgeExtension saveVideoToAlbumBridgeExtension;
        String str14;
        String str15;
        int i2;
        String str16;
        SaveVideoToAlbumBridgeExtension saveVideoToAlbumBridgeExtension2;
        String str17;
        String str18;
        String str19;
        SaveVideoToAlbumBridgeExtension saveVideoToAlbumBridgeExtension3;
        String str20;
        int i3 = 2 % 2;
        int i4 = asBinder + 61;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnExtraCallback = ConsumptionTransactionDetailResponse.onExtraCallback();
            int i5 = 12 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
                String str21 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
                Long l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, oty1.onExtraCallback, (Object) null);
                String str22 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
                String str23 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
                List list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, (jp) lazyArrOnExtraCallback[4].getValue(), (Object) null);
                String str24 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
                str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
                str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getwrigglelayout, (Object) null);
                ConsumptionTransactionDetailResponse.TitleContent titleContent2 = (ConsumptionTransactionDetailResponse.TitleContent) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, ConsumptionTransactionDetailResponse$TitleContent$$serializer.INSTANCE, (Object) null);
                String str25 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, getwrigglelayout, (Object) null);
                String str26 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, getwrigglelayout, (Object) null);
                String str27 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, getwrigglelayout, (Object) null);
                String str28 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, getwrigglelayout, (Object) null);
                String str29 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13, getwrigglelayout, (Object) null);
                String str30 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 14, getwrigglelayout, (Object) null);
                SaveVideoToAlbumBridgeExtension saveVideoToAlbumBridgeExtension4 = (SaveVideoToAlbumBridgeExtension) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 15, (jp) lazyArrOnExtraCallback[15].getValue(), (Object) null);
                String str31 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 16, getwrigglelayout, (Object) null);
                str3 = str30;
                String str32 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 17, getwrigglelayout, (Object) null);
                i = 262143;
                str4 = str23;
                str5 = str31;
                str6 = str22;
                titleContent = titleContent2;
                str7 = str26;
                str8 = str29;
                str9 = str28;
                str10 = str27;
                str11 = str32;
                str12 = str25;
                str13 = str24;
                l = l2;
                list = list2;
                saveVideoToAlbumBridgeExtension = saveVideoToAlbumBridgeExtension4;
                str14 = str21;
            } else {
                String str33 = null;
                String str34 = null;
                String str35 = null;
                SaveVideoToAlbumBridgeExtension saveVideoToAlbumBridgeExtension5 = null;
                String str36 = null;
                ConsumptionTransactionDetailResponse.TitleContent titleContent3 = null;
                String str37 = null;
                String str38 = null;
                String str39 = null;
                String str40 = null;
                String str41 = null;
                String str42 = null;
                String str43 = null;
                String str44 = null;
                Long l3 = null;
                String str45 = null;
                List list3 = null;
                boolean z = true;
                int i6 = 0;
                String str46 = null;
                while (z) {
                    String str47 = str40;
                    int i7 = onTransact + 81;
                    String str48 = str42;
                    asBinder = i7 % 128;
                    int i8 = i7 % 2;
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    switch (iOnNavigationEvent) {
                        case -1:
                            str16 = str46;
                            saveVideoToAlbumBridgeExtension2 = saveVideoToAlbumBridgeExtension5;
                            str17 = str44;
                            str42 = str48;
                            str18 = str47;
                            z = false;
                            str40 = str18;
                            saveVideoToAlbumBridgeExtension5 = saveVideoToAlbumBridgeExtension2;
                            str46 = str16;
                            str44 = str17;
                        case 0:
                            str16 = str46;
                            saveVideoToAlbumBridgeExtension2 = saveVideoToAlbumBridgeExtension5;
                            str17 = str44;
                            str42 = str48;
                            str18 = str47;
                            str45 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str45);
                            i6 |= 1;
                            str35 = str35;
                            l3 = l3;
                            str40 = str18;
                            saveVideoToAlbumBridgeExtension5 = saveVideoToAlbumBridgeExtension2;
                            str46 = str16;
                            str44 = str17;
                        case 1:
                            str16 = str46;
                            saveVideoToAlbumBridgeExtension2 = saveVideoToAlbumBridgeExtension5;
                            str42 = str48;
                            str18 = str47;
                            str17 = str44;
                            l3 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, oty1.onExtraCallback, l3);
                            i6 |= 2;
                            str35 = str35;
                            str40 = str18;
                            saveVideoToAlbumBridgeExtension5 = saveVideoToAlbumBridgeExtension2;
                            str46 = str16;
                            str44 = str17;
                        case 2:
                            str19 = str46;
                            str42 = str48;
                            i6 |= 4;
                            str35 = str35;
                            str40 = str47;
                            saveVideoToAlbumBridgeExtension5 = saveVideoToAlbumBridgeExtension5;
                            str34 = str34;
                            str44 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str44);
                            str46 = str19;
                        case 3:
                            str19 = str46;
                            saveVideoToAlbumBridgeExtension3 = saveVideoToAlbumBridgeExtension5;
                            str42 = str48;
                            str20 = str47;
                            i6 |= 8;
                            str34 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str34);
                            str35 = str35;
                            list3 = list3;
                            str40 = str20;
                            saveVideoToAlbumBridgeExtension5 = saveVideoToAlbumBridgeExtension3;
                            str46 = str19;
                        case 4:
                            str19 = str46;
                            saveVideoToAlbumBridgeExtension3 = saveVideoToAlbumBridgeExtension5;
                            str42 = str48;
                            str20 = str47;
                            list3 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, (jp) lazyArrOnExtraCallback[4].getValue(), list3);
                            i6 |= 16;
                            str35 = str35;
                            str40 = str20;
                            saveVideoToAlbumBridgeExtension5 = saveVideoToAlbumBridgeExtension3;
                            str46 = str19;
                        case 5:
                            str19 = str46;
                            str42 = str48;
                            i6 |= 32;
                            str35 = str35;
                            saveVideoToAlbumBridgeExtension5 = saveVideoToAlbumBridgeExtension5;
                            str40 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, str47);
                            str46 = str19;
                        case 6:
                            str42 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, str48);
                            i6 |= 64;
                            str35 = str35;
                            str46 = str46;
                            str40 = str47;
                        case 7:
                            str15 = str35;
                            i6 |= 128;
                            str43 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getWriggleLayout.onNavigationEvent, str43);
                            str35 = str15;
                            str42 = str48;
                            str40 = str47;
                        case 8:
                            str15 = str35;
                            titleContent3 = (ConsumptionTransactionDetailResponse.TitleContent) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, ConsumptionTransactionDetailResponse$TitleContent$$serializer.INSTANCE, titleContent3);
                            i6 |= 256;
                            str35 = str15;
                            str42 = str48;
                            str40 = str47;
                        case 9:
                            str15 = str35;
                            str38 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, getWriggleLayout.onNavigationEvent, str38);
                            i6 |= 512;
                            int i9 = onTransact + 41;
                            asBinder = i9 % 128;
                            int i10 = i9 % 2;
                            str35 = str15;
                            str42 = str48;
                            str40 = str47;
                        case 10:
                            str15 = str35;
                            str41 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, getWriggleLayout.onNavigationEvent, str41);
                            i6 |= 1024;
                            int i11 = asBinder + 123;
                            onTransact = i11 % 128;
                            int i12 = i11 % 2;
                            str35 = str15;
                            str42 = str48;
                            str40 = str47;
                        case 11:
                            str15 = str35;
                            str46 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, getWriggleLayout.onNavigationEvent, str46);
                            i6 |= 2048;
                            str35 = str15;
                            str42 = str48;
                            str40 = str47;
                        case 12:
                            str15 = str35;
                            str37 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, getWriggleLayout.onNavigationEvent, str37);
                            i6 |= 4096;
                            str35 = str15;
                            str42 = str48;
                            str40 = str47;
                        case 13:
                            str15 = str35;
                            str36 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13, getWriggleLayout.onNavigationEvent, str36);
                            i6 |= 8192;
                            str35 = str15;
                            str42 = str48;
                            str40 = str47;
                        case 14:
                            str15 = str35;
                            str39 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 14, getWriggleLayout.onNavigationEvent, str39);
                            i6 |= 16384;
                            str35 = str15;
                            str42 = str48;
                            str40 = str47;
                        case 15:
                            saveVideoToAlbumBridgeExtension5 = (SaveVideoToAlbumBridgeExtension) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 15, (jp) lazyArrOnExtraCallback[15].getValue(), saveVideoToAlbumBridgeExtension5);
                            i6 |= 32768;
                            str42 = str48;
                            str40 = str47;
                        case 16:
                            str33 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 16, getWriggleLayout.onNavigationEvent, str33);
                            i2 = 65536;
                            i6 |= i2;
                            str42 = str48;
                            str40 = str47;
                        case 17:
                            str35 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 17, getWriggleLayout.onNavigationEvent, str35);
                            i2 = 131072;
                            i6 |= i2;
                            str42 = str48;
                            str40 = str47;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                }
                String str49 = str35;
                SaveVideoToAlbumBridgeExtension saveVideoToAlbumBridgeExtension6 = saveVideoToAlbumBridgeExtension5;
                str6 = str44;
                str14 = str45;
                str5 = str33;
                str8 = str36;
                str12 = str38;
                i = i6;
                str7 = str41;
                str = str42;
                str11 = str49;
                l = l3;
                saveVideoToAlbumBridgeExtension = saveVideoToAlbumBridgeExtension6;
                str10 = str46;
                str4 = str34;
                str9 = str37;
                str3 = str39;
                str2 = str43;
                str13 = str40;
                titleContent = titleContent3;
                list = list3;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnExtraCallback = ConsumptionTransactionDetailResponse.onExtraCallback();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        ConsumptionTransactionDetailResponse consumptionTransactionDetailResponse = new ConsumptionTransactionDetailResponse(i, str14, l, str6, str4, list, str13, str, str2, titleContent, str12, str7, str10, str9, str8, str3, saveVideoToAlbumBridgeExtension, str5, str11, (okycx) null);
        int i13 = asBinder + 7;
        onTransact = i13 % 128;
        int i14 = i13 % 2;
        return consumptionTransactionDetailResponse;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m588deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ConsumptionTransactionDetailResponse consumptionTransactionDetailResponseDeserialize = deserialize(decoder);
        int i4 = onTransact + 61;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return consumptionTransactionDetailResponseDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ConsumptionTransactionDetailResponse consumptionTransactionDetailResponse) {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(consumptionTransactionDetailResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ConsumptionTransactionDetailResponse.onExtraCallback(consumptionTransactionDetailResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asBinder + 91;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 81;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ConsumptionTransactionDetailResponse) obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onTransact + 121;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 54 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onTransact + 75;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onExtraCallbackWithResult;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 77, 20952 - TextUtils.indexOf("", "", 0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            long j = 0;
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 75 - (ViewConfiguration.getEdgeSlop() >> 16), 16036 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            if (IAuthTabCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 62 - ImageFormat.getBitsPerPixel(0), 12214 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i4 = $10 + 27;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    j = 0;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onWarmupCompleted) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i6 = $10 + 75;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), 64 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), MotionEvent.axisFromString("") + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = new char[]{32525, 32513, 32533, 32527, 32521, 32537, 32516, 32514, 32570, 32568, 32569, 32522, 32571, 32523, 32518, 32519, 32512};
        onExtraCallback = -1184333898;
        onWarmupCompleted = true;
        IAuthTabCallback = true;
    }
}
