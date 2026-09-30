package im.toss.securities.widget.overview.ui.medium.model;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState;
import im.toss.tosssecurities.core.currency.domain.Currency;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
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
import o.HostnamesKt;
import o.aeu2;
import o.dj3;
import o.getBgColor;
import o.getWriggleLayout;
import o.jp;
import o.r2ExternalSyntheticLambda1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class OverviewMediumWidgetState$Success$$serializer implements aeu2<OverviewMediumWidgetState.Success> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    public static final OverviewMediumWidgetState$Success$$serializer INSTANCE;
    private static int asInterface = 0;
    private static final SerialDescriptor descriptor;
    private static boolean onExtraCallback = false;
    private static char[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static boolean onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 65;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 1;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
        return serialDescriptor;
    }

    static {
        IAuthTabCallback();
        OverviewMediumWidgetState$Success$$serializer overviewMediumWidgetState$Success$$serializer = new OverviewMediumWidgetState$Success$$serializer();
        INSTANCE = overviewMediumWidgetState$Success$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("Success", overviewMediumWidgetState$Success$$serializer, 14);
        setanimationsloop.onWarmupCompleted("displaySetting", true);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-127, -124, -125, -126, -127}, 127 - View.MeasureSpec.getSize(0), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("accountKey", false);
        setanimationsloop.onWarmupCompleted("overview", false);
        setanimationsloop.onWarmupCompleted("formattedTime", false);
        setanimationsloop.onWarmupCompleted("imageUrlList", false);
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-118, -123, -119, -120, -121, -121, -122, -123}, (ViewConfiguration.getLongPressTimeout() >> 16) + 127, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("itemCurrency", true);
        setanimationsloop.onWarmupCompleted("includeExpense", false);
        setanimationsloop.onWarmupCompleted("showAmount", false);
        setanimationsloop.onWarmupCompleted("userName", false);
        setanimationsloop.onWarmupCompleted("userMode", false);
        setanimationsloop.onWarmupCompleted("bondValuationBasis", false);
        setanimationsloop.onWarmupCompleted("isDaily", true);
        descriptor = setanimationsloop;
        int i = onTransact + 75;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private OverviewMediumWidgetState$Success$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrAsInterface = OverviewMediumWidgetState.Success.asInterface();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        getBgColor getbgcolor = getBgColor.IAuthTabCallback;
        KSerializer<?>[] kSerializerArr = {lazyArrAsInterface[0].getValue(), dj3.onWarmupCompleted, sp.IAuthTabCallback(getwrigglelayout), OverviewUiData$$serializer.INSTANCE, getwrigglelayout, lazyArrAsInterface[5].getValue(), lazyArrAsInterface[6].getValue(), lazyArrAsInterface[7].getValue(), getbgcolor, getbgcolor, sp.IAuthTabCallback(getwrigglelayout), lazyArrAsInterface[11].getValue(), lazyArrAsInterface[12].getValue(), getbgcolor};
        int i4 = asInterface + 53;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final OverviewMediumWidgetState.Success deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        DisplaySetting displaySetting;
        r2ExternalSyntheticLambda1 r2externalsyntheticlambda1;
        boolean z;
        OverviewUiData overviewUiData;
        Currency currency;
        String str;
        boolean z2;
        String str2;
        Currency currency2;
        String str3;
        float f;
        boolean z3;
        int i;
        HostnamesKt hostnamesKt;
        List list;
        String str4;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrAsInterface = OverviewMediumWidgetState.Success.asInterface();
        int i3 = 9;
        int i4 = 8;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = IAuthTabCallbackDefault + 119;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            DisplaySetting displaySetting2 = (DisplaySetting) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrAsInterface[0].getValue(), (Object) null);
            float fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            OverviewUiData overviewUiData2 = (OverviewUiData) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, OverviewUiData$$serializer.INSTANCE, (Object) null);
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            List list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrAsInterface[5].getValue(), (Object) null);
            Currency currency3 = (Currency) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, (jp) lazyArrAsInterface[6].getValue(), (Object) null);
            Currency currency4 = (Currency) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 7, (jp) lazyArrAsInterface[7].getValue(), (Object) null);
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8);
            boolean zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9);
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, getwrigglelayout, (Object) null);
            HostnamesKt hostnamesKt2 = (HostnamesKt) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 11, (jp) lazyArrAsInterface[11].getValue(), (Object) null);
            r2ExternalSyntheticLambda1 r2externalsyntheticlambda12 = (r2ExternalSyntheticLambda1) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 12, (jp) lazyArrAsInterface[12].getValue(), (Object) null);
            boolean zOnExtraCallbackWithResult3 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13);
            int i7 = IAuthTabCallbackDefault + 29;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            hostnamesKt = hostnamesKt2;
            i = 16383;
            r2externalsyntheticlambda1 = r2externalsyntheticlambda12;
            displaySetting = displaySetting2;
            f = fOnWarmupCompleted;
            str = str6;
            z = zOnExtraCallbackWithResult2;
            str3 = strAsInterface;
            z2 = zOnExtraCallbackWithResult;
            list = list2;
            z3 = zOnExtraCallbackWithResult3;
            currency = currency4;
            currency2 = currency3;
            overviewUiData = overviewUiData2;
            str2 = str5;
        } else {
            float fOnWarmupCompleted2 = 0.0f;
            boolean z4 = true;
            int i9 = 0;
            boolean zOnExtraCallbackWithResult4 = false;
            boolean zOnExtraCallbackWithResult5 = false;
            r2ExternalSyntheticLambda1 r2externalsyntheticlambda13 = null;
            HostnamesKt hostnamesKt3 = null;
            Currency currency5 = null;
            Currency currency6 = null;
            String strAsInterface2 = null;
            List list3 = null;
            OverviewUiData overviewUiData3 = null;
            String str7 = null;
            DisplaySetting displaySetting3 = null;
            String str8 = null;
            boolean zOnExtraCallbackWithResult6 = false;
            while (z4) {
                int i10 = IAuthTabCallbackDefault + 83;
                asInterface = i10 % 128;
                int i11 = i10 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        str4 = str7;
                        z4 = false;
                        lazyArrAsInterface = lazyArrAsInterface;
                        i3 = 9;
                        i4 = 8;
                        str7 = str4;
                    case 0:
                        str4 = str7;
                        Lazy[] lazyArr = lazyArrAsInterface;
                        displaySetting3 = (DisplaySetting) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrAsInterface[0].getValue(), displaySetting3);
                        i9 |= 1;
                        int i12 = IAuthTabCallbackDefault + 59;
                        asInterface = i12 % 128;
                        int i13 = i12 % 2;
                        overviewUiData3 = overviewUiData3;
                        list3 = list3;
                        lazyArrAsInterface = lazyArr;
                        fOnWarmupCompleted2 = fOnWarmupCompleted2;
                        i3 = 9;
                        i4 = 8;
                        str7 = str4;
                    case 1:
                        i9 |= 2;
                        fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
                        i3 = 9;
                        i4 = 8;
                    case 2:
                        String str9 = str7;
                        i9 |= 4;
                        i3 = 9;
                        i4 = 8;
                        str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str9);
                        fOnWarmupCompleted2 = fOnWarmupCompleted2;
                    case 3:
                        overviewUiData3 = (OverviewUiData) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, OverviewUiData$$serializer.INSTANCE, overviewUiData3);
                        i9 |= 8;
                        list3 = list3;
                        i3 = 9;
                        i4 = 8;
                    case 4:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i9 |= 16;
                        i3 = 9;
                        i4 = 8;
                    case 5:
                        list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrAsInterface[5].getValue(), list3);
                        i9 |= 32;
                        i3 = 9;
                        i4 = 8;
                    case 6:
                        currency6 = (Currency) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, (jp) lazyArrAsInterface[6].getValue(), currency6);
                        i9 |= 64;
                        i3 = 9;
                        i4 = 8;
                    case 7:
                        currency5 = (Currency) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 7, (jp) lazyArrAsInterface[7].getValue(), currency5);
                        i9 |= 128;
                        i3 = 9;
                    case 8:
                        zOnExtraCallbackWithResult6 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4);
                        i9 |= 256;
                    case 9:
                        zOnExtraCallbackWithResult4 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3);
                        i9 |= 512;
                    case 10:
                        str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, getWriggleLayout.onNavigationEvent, str8);
                        i9 |= 1024;
                    case 11:
                        hostnamesKt3 = (HostnamesKt) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 11, (jp) lazyArrAsInterface[11].getValue(), hostnamesKt3);
                        i9 |= 2048;
                    case 12:
                        r2externalsyntheticlambda13 = (r2ExternalSyntheticLambda1) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 12, (jp) lazyArrAsInterface[12].getValue(), r2externalsyntheticlambda13);
                        i9 |= 4096;
                    case 13:
                        zOnExtraCallbackWithResult5 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13);
                        i9 |= 8192;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            List list4 = list3;
            displaySetting = displaySetting3;
            r2externalsyntheticlambda1 = r2externalsyntheticlambda13;
            z = zOnExtraCallbackWithResult4;
            overviewUiData = overviewUiData3;
            currency = currency5;
            str = str8;
            z2 = zOnExtraCallbackWithResult6;
            str2 = str7;
            currency2 = currency6;
            str3 = strAsInterface2;
            f = fOnWarmupCompleted2;
            z3 = zOnExtraCallbackWithResult5;
            i = i9;
            hostnamesKt = hostnamesKt3;
            list = list4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new OverviewMediumWidgetState.Success(i, displaySetting, f, str2, overviewUiData, str3, list, currency2, currency, z2, z, str, hostnamesKt, r2externalsyntheticlambda1, z3, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m72deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        OverviewMediumWidgetState.Success successDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        return successDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull OverviewMediumWidgetState.Success success) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(success, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            OverviewMediumWidgetState.Success.onExtraCallback(iOnExtraCallback, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1598662612, iOnExtraCallback2, new Object[]{success, vylVarOnExtraCallback, serialDescriptor}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1598662612);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(success, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback4 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        OverviewMediumWidgetState.Success.onExtraCallback(iOnExtraCallback3, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1598662612, iOnExtraCallback4, new Object[]{success, vylVarOnExtraCallback2, serialDescriptor2}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1598662612);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (OverviewMediumWidgetState.Success) obj);
        int i4 = asInterface + 125;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = asInterface + 9;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onExtraCallbackWithResult;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 77, 20953 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
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
            Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), View.combineMeasuredStates(0, 0) + 75, 16037 - ((Process.getThreadPriority(0) + 20) >> 6), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i4 = 1052772399;
            if (onWarmupCompleted) {
                int i5 = $11 + 39;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i7 = $11 + 77;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback << 1) * defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] / i] % iIntValue);
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 64 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 12214 - Drawable.resolveOpacity(0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } else {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') - '0'), (Process.myTid() >> 22) + 63, Color.red(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    }
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onExtraCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i8 = $11 + 3;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i10 = $11 + 41;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), KeyEvent.keyCodeFromString("") + 63, 12214 - (ViewConfiguration.getEdgeSlop() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                i4 = 1052772399;
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
        onExtraCallbackWithResult = new char[]{32438, 32419, 32423, 32431, 32436, 32474, 32421, 32426, 32417, 32478};
        onNavigationEvent = -1184333993;
        onExtraCallback = true;
        onWarmupCompleted = true;
    }
}
