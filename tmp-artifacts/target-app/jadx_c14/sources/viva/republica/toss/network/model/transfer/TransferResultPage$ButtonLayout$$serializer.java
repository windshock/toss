package viva.republica.toss.network.model.transfer;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import im.toss.inventory_sdk.model.InventoryAdDto;
import im.toss.inventory_sdk.model.InventoryAdDto$Dynamic$;
import java.lang.reflect.Method;
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
import o.EncryptedContentInfoParser;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.BridgeModel;
import viva.republica.toss.network.model.transfer.TransferResultPage;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class TransferResultPage$ButtonLayout$$serializer implements aeu2<TransferResultPage.ButtonLayout> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static boolean IAuthTabCallback = false;
    public static final TransferResultPage$ButtonLayout$$serializer INSTANCE;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static final SerialDescriptor descriptor;
    private static boolean onExtraCallback = false;
    private static char[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 59;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 91;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onExtraCallbackWithResult;
        float f = 0.0f;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 77 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)), KeyEvent.keyCodeFromString("") + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            char c = '0';
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 74 - TextUtils.lastIndexOf("", '0', 0, 0), 16037 - (ViewConfiguration.getTouchSlop() >> 8), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            if (IAuthTabCallback) {
                int i4 = $10 + 113;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), TextUtils.lastIndexOf("", c) + 64, 12214 - (Process.myPid() >> 22), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    c = '0';
                }
                objArr[0] = new String(cArr5);
                return;
            }
            if (!onExtraCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                    int i6 = $10 + 1;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                }
                objArr[0] = new String(cArr6);
                return;
            }
            int i8 = $11 + 17;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            }
            int i9 = $10 + 53;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i11 = $11 + 103;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback / defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] * i] >>> iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), 63 - Color.red(0), 12214 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } else {
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 1), 64 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
            }
            objArr[0] = new String(cArr2);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static {
        onExtraCallback();
        TransferResultPage$ButtonLayout$$serializer transferResultPage$ButtonLayout$$serializer = new TransferResultPage$ButtonLayout$$serializer();
        INSTANCE = transferResultPage$ButtonLayout$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.TransferResultPage.ButtonLayout", transferResultPage$ButtonLayout$$serializer, 10);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-124, -125, -127, -126, -127}, 127 - TextUtils.getTrimmedLength(""), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-124, -120, -124, -121, -122, -123}, TextUtils.indexOf("", "", 0, 0) + 127, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("nextScheme", true);
        setanimationsloop.onWarmupCompleted("actionType", true);
        setanimationsloop.onWarmupCompleted("shareMessage", true);
        setanimationsloop.onWarmupCompleted("bridgePageInfo", true);
        setanimationsloop.onWarmupCompleted("standardTermsBridgePageInfo", true);
        setanimationsloop.onWarmupCompleted("phoneNumber", true);
        setanimationsloop.onWarmupCompleted("animatedBoostingBridgePageInfo", true);
        setanimationsloop.onWarmupCompleted("dynamicIntelligencePageInfo", true);
        descriptor = setanimationsloop;
        int i = onTransact + 115;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private TransferResultPage$ButtonLayout$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArr = (Lazy[]) TransferResultPage.ButtonLayout.onExtraCallback(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 146833430, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), new Object[0], TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -146833430, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializer, sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback((KSerializer) lazyArr[3].getValue()), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(BridgeModel$Page$$serializer.INSTANCE), sp.IAuthTabCallback(BridgeModel$StandardTerms$$serializer.INSTANCE), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(TransferResultPage$AnimatedBoostingBridgePageInfo$$serializer.INSTANCE), sp.IAuthTabCallback(InventoryAdDto$Dynamic$.serializer.INSTANCE)};
        int i4 = asBinder + 97;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        TransferResultPage.ButtonLayout buttonLayoutM105deserialize = m105deserialize(decoder);
        int i4 = asInterface + 29;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return buttonLayoutM105deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final TransferResultPage.ButtonLayout m105deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        BridgeModel.StandardTerms standardTerms;
        String str;
        int i;
        String str2;
        TransferResultPage.AnimatedBoostingBridgePageInfo animatedBoostingBridgePageInfo;
        InventoryAdDto.Dynamic dynamic;
        BridgeModel.Page page;
        TransferResultPage.ButtonLayout.ActionType actionType;
        String str3;
        String str4;
        String strAsInterface;
        char c;
        int i2 = 2 % 2;
        int i3 = asInterface + 69;
        asBinder = i3 % 128;
        BridgeModel.Page page2 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            page2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArr = (Lazy[]) TransferResultPage.ButtonLayout.onExtraCallback(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 146833430, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), new Object[0], TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -146833430, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
        int i4 = 9;
        int i5 = 7;
        if (ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            strAsInterface = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 0);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str5 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            String str6 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            TransferResultPage.ButtonLayout.ActionType actionType2 = (TransferResultPage.ButtonLayout.ActionType) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 3, (jp) lazyArr[3].getValue(), (Object) null);
            String str7 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            BridgeModel.Page page3 = (BridgeModel.Page) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 5, BridgeModel$Page$$serializer.INSTANCE, (Object) null);
            BridgeModel.StandardTerms standardTerms2 = (BridgeModel.StandardTerms) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 6, BridgeModel$StandardTerms$$serializer.INSTANCE, (Object) null);
            String str8 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 7, getwrigglelayout, (Object) null);
            TransferResultPage.AnimatedBoostingBridgePageInfo animatedBoostingBridgePageInfo2 = (TransferResultPage.AnimatedBoostingBridgePageInfo) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 8, TransferResultPage$AnimatedBoostingBridgePageInfo$$serializer.INSTANCE, (Object) null);
            dynamic = (InventoryAdDto.Dynamic) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 9, InventoryAdDto$Dynamic$.serializer.INSTANCE, (Object) null);
            str2 = str8;
            str4 = str5;
            str3 = str6;
            actionType = actionType2;
            i = 1023;
            animatedBoostingBridgePageInfo = animatedBoostingBridgePageInfo2;
            str = str7;
            standardTerms = standardTerms2;
            page = page3;
        } else {
            int i6 = 0;
            String str9 = null;
            TransferResultPage.ButtonLayout.ActionType actionType3 = null;
            standardTerms = null;
            String str10 = null;
            TransferResultPage.AnimatedBoostingBridgePageInfo animatedBoostingBridgePageInfo3 = null;
            String str11 = null;
            String str12 = null;
            String strAsInterface2 = null;
            boolean z = true;
            InventoryAdDto.Dynamic dynamic2 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        i4 = 9;
                        z = false;
                    case 0:
                        c = 2;
                        strAsInterface2 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 0);
                        i6 |= 1;
                        i4 = 9;
                        i5 = 7;
                    case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                        str9 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str9);
                        i6 |= 2;
                        int i7 = asBinder + 51;
                        asInterface = i7 % 128;
                        c = 2;
                        int i8 = i7 % 2;
                        str12 = str12;
                        i4 = 9;
                        i5 = 7;
                    case 2:
                        str11 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str11);
                        i6 |= 4;
                        i4 = 9;
                        i5 = 7;
                    case 3:
                        actionType3 = (TransferResultPage.ButtonLayout.ActionType) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 3, (jp) lazyArr[3].getValue(), actionType3);
                        i6 |= 8;
                        i4 = 9;
                        i5 = 7;
                    case 4:
                        str12 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str12);
                        i6 |= 16;
                        i4 = 9;
                        i5 = 7;
                    case 5:
                        page2 = (BridgeModel.Page) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 5, BridgeModel$Page$$serializer.INSTANCE, page2);
                        i6 |= 32;
                        i4 = 9;
                    case 6:
                        standardTerms = (BridgeModel.StandardTerms) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 6, BridgeModel$StandardTerms$$serializer.INSTANCE, standardTerms);
                        i6 |= 64;
                        i4 = 9;
                    case 7:
                        str10 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, i5, getWriggleLayout.onNavigationEvent, str10);
                        i6 |= 128;
                        int i9 = asBinder + 39;
                        asInterface = i9 % 128;
                        int i10 = i9 % 2;
                        i4 = 9;
                    case 8:
                        animatedBoostingBridgePageInfo3 = (TransferResultPage.AnimatedBoostingBridgePageInfo) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 8, TransferResultPage$AnimatedBoostingBridgePageInfo$$serializer.INSTANCE, animatedBoostingBridgePageInfo3);
                        i6 |= 256;
                    case 9:
                        dynamic2 = (InventoryAdDto.Dynamic) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, i4, InventoryAdDto$Dynamic$.serializer.INSTANCE, dynamic2);
                        i6 |= 512;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str = str12;
            i = i6;
            str2 = str10;
            animatedBoostingBridgePageInfo = animatedBoostingBridgePageInfo3;
            dynamic = dynamic2;
            page = page2;
            actionType = actionType3;
            str3 = str11;
            str4 = str9;
            strAsInterface = strAsInterface2;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new TransferResultPage.ButtonLayout(i, strAsInterface, str4, str3, actionType, str, page, standardTerms, str2, animatedBoostingBridgePageInfo, dynamic, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TransferResultPage.ButtonLayout) obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = asInterface + 37;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TransferResultPage.ButtonLayout buttonLayout) {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(buttonLayout, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TransferResultPage.ButtonLayout.onNavigationEvent(buttonLayout, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asInterface + 47;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = asBinder + 55;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = new char[]{32425, 32444, 32433, 32440, 32426, 32442, 32445, 32432};
        onNavigationEvent = -1184334043;
        onExtraCallback = true;
        IAuthTabCallback = true;
    }
}
