package viva.republica.toss.network.model.transfer;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
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
import o.EncryptedContentInfoParser;
import o.TimelineExternalSyntheticLambda0;
import o.aeu2;
import o.getBgColor;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.jp;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.MyAccountInfo;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class MyAccountInfo$$serializer implements aeu2<MyAccountInfo> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final MyAccountInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static long onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onWarmupCompleted();
        MyAccountInfo$$serializer myAccountInfo$$serializer = new MyAccountInfo$$serializer();
        INSTANCE = myAccountInfo$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.MyAccountInfo", myAccountInfo$$serializer, 13);
        Object[] objArr = new Object[1];
        a(new char[]{63836, 65336, 47501, 63799, 50768, 46421, 11748}, Color.green(0), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("bankCode", true);
        setanimationsloop.onWarmupCompleted("accountNo", true);
        Object[] objArr2 = new Object[1];
        a(new char[]{3452, 38439, 58018, 3346, 20599, 56398, 30431, 36362}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("accountDescription", true);
        setanimationsloop.onWarmupCompleted("withdrawDescription", true);
        setanimationsloop.onWarmupCompleted("iconUrl", true);
        setanimationsloop.onWarmupCompleted("isPrimaryAccount", true);
        setanimationsloop.onWarmupCompleted("withdrawalStatus", true);
        setanimationsloop.onWarmupCompleted("balanceInfo", true);
        setanimationsloop.onWarmupCompleted("invalidMessage", true);
        setanimationsloop.onWarmupCompleted("selected", true);
        setanimationsloop.onWarmupCompleted("isRecommendedAccount", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 45;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private MyAccountInfo$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallbackWithResult = MyAccountInfo.onExtraCallbackWithResult();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        getBgColor getbgcolor = getBgColor.IAuthTabCallback;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getDynamicHeight.onWarmupCompleted, getwrigglelayout, getwrigglelayout, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), getbgcolor, lazyArrOnExtraCallbackWithResult[8].getValue(), sp.IAuthTabCallback(TransferBalance$$serializer.INSTANCE), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getbgcolor), getbgcolor};
        int i4 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        MyAccountInfo myAccountInfoM86deserialize = m86deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 37;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
        return myAccountInfoM86deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final MyAccountInfo m86deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        MyAccountInfo.WithDrawalStatus withDrawalStatus;
        TransferBalance transferBalance;
        String str;
        String str2;
        int i;
        Boolean bool;
        String str3;
        String str4;
        String str5;
        int i2;
        boolean z;
        boolean zOnExtraCallbackWithResult;
        String str6;
        String str7;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = MyAccountInfo.onExtraCallbackWithResult();
        int i6 = 9;
        String str8 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i7 = onExtraCallbackWithResult + 65;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            int iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            String str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
            String str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
            boolean zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7);
            MyAccountInfo.WithDrawalStatus withDrawalStatus2 = (MyAccountInfo.WithDrawalStatus) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 8, (jp) lazyArrOnExtraCallbackWithResult[8].getValue(), (Object) null);
            TransferBalance transferBalance2 = (TransferBalance) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, TransferBalance$$serializer.INSTANCE, (Object) null);
            String str12 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, getwrigglelayout, (Object) null);
            bool = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, getBgColor.IAuthTabCallback, (Object) null);
            withDrawalStatus = withDrawalStatus2;
            str4 = strAsInterface3;
            transferBalance = transferBalance2;
            z = zOnExtraCallbackWithResult2;
            str7 = str11;
            str = str10;
            str6 = str12;
            str2 = str9;
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12);
            i = 8191;
            str3 = strAsInterface2;
            str5 = strAsInterface;
            i2 = iOnTransact;
        } else {
            MyAccountInfo.WithDrawalStatus withDrawalStatus3 = null;
            TransferBalance transferBalance3 = null;
            String str13 = null;
            String str14 = null;
            String strAsInterface4 = null;
            String strAsInterface5 = null;
            String strAsInterface6 = null;
            int i9 = 0;
            int iOnTransact2 = 0;
            boolean zOnExtraCallbackWithResult3 = false;
            boolean zOnExtraCallbackWithResult4 = false;
            boolean z2 = true;
            String str15 = null;
            Boolean bool2 = null;
            while (z2) {
                int i10 = IAuthTabCallback + 77;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z2 = false;
                        i6 = 9;
                    case 0:
                        i9 |= 1;
                        strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i6 = 9;
                    case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                        iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
                        i9 |= 2;
                        i6 = 9;
                    case 2:
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i9 |= 4;
                        i6 = 9;
                    case 3:
                        strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i9 |= 8;
                        i6 = 9;
                    case 4:
                        i9 |= 16;
                        str14 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str14);
                        i6 = 9;
                    case 5:
                        str15 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, str15);
                        i9 |= 32;
                        i6 = 9;
                    case 6:
                        str13 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, str13);
                        i9 |= 64;
                        i6 = 9;
                    case 7:
                        zOnExtraCallbackWithResult3 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7);
                        i9 |= 128;
                    case 8:
                        withDrawalStatus3 = (MyAccountInfo.WithDrawalStatus) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 8, (jp) lazyArrOnExtraCallbackWithResult[8].getValue(), withDrawalStatus3);
                        i9 |= 256;
                    case 9:
                        transferBalance3 = (TransferBalance) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, TransferBalance$$serializer.INSTANCE, transferBalance3);
                        i9 |= 512;
                    case 10:
                        str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, getWriggleLayout.onNavigationEvent, str8);
                        i9 |= 1024;
                    case 11:
                        bool2 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, getBgColor.IAuthTabCallback, bool2);
                        i9 |= 2048;
                    case 12:
                        zOnExtraCallbackWithResult4 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12);
                        i9 |= 4096;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            withDrawalStatus = withDrawalStatus3;
            transferBalance = transferBalance3;
            str = str15;
            str2 = str14;
            i = i9;
            bool = bool2;
            str3 = strAsInterface4;
            str4 = strAsInterface5;
            str5 = strAsInterface6;
            i2 = iOnTransact2;
            z = zOnExtraCallbackWithResult3;
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult4;
            str6 = str8;
            str7 = str13;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new MyAccountInfo(i, str5, i2, str3, str4, str2, str, str7, z, withDrawalStatus, transferBalance, str6, bool, zOnExtraCallbackWithResult, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (MyAccountInfo) obj);
        int i4 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull MyAccountInfo myAccountInfo) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(myAccountInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        MyAccountInfo.onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1317490221, iOnNavigationEvent2, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{myAccountInfo, vylVarOnExtraCallback, serialDescriptor}, iOnNavigationEvent, -1317490214);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 63;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 111;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - Color.alpha(0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 84, 21233 - Drawable.resolveOpacity(0, 0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14185), 19 - (ViewConfiguration.getDoubleTapTimeout() >> 16), KeyEvent.keyCodeFromString("") + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    static void onWarmupCompleted() {
        onWarmupCompleted = 2580349039446864132L;
    }
}
