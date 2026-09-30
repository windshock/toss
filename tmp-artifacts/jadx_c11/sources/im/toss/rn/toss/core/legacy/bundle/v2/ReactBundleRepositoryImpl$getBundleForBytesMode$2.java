package im.toss.rn.toss.core.legacy.bundle.v2;

import android.graphics.Color;
import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Date;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.access8100;
import o.findResAndMsg;
import o.getWrite;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class ReactBundleRepositoryImpl$getBundleForBytesMode$2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    final /* synthetic */ String $bundleName;
    final /* synthetic */ String $company;
    final /* synthetic */ String $countryCode;
    final /* synthetic */ Date $minDeployedAt;
    int label;
    final /* synthetic */ ReactBundleRepositoryImpl this$0;
    private static char[] IAuthTabCallback = {64983, 64988, 64982, 64990};
    private static char onNavigationEvent = 51243;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReactBundleRepositoryImpl$getBundleForBytesMode$2(String str, String str2, String str3, ReactBundleRepositoryImpl reactBundleRepositoryImpl, Date date, access13800<? super ReactBundleRepositoryImpl$getBundleForBytesMode$2> access13800Var) {
        super(2, access13800Var);
        this.$bundleName = str;
        this.$countryCode = str2;
        this.$company = str3;
        this.this$0 = reactBundleRepositoryImpl;
        this.$minDeployedAt = date;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        ReactBundleRepositoryImpl$getBundleForBytesMode$2 reactBundleRepositoryImpl$getBundleForBytesMode$2 = new ReactBundleRepositoryImpl$getBundleForBytesMode$2(this.$bundleName, this.$countryCode, this.$company, this.this$0, this.$minDeployedAt, access13800Var);
        int i2 = onExtraCallback + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return reactBundleRepositoryImpl$getBundleForBytesMode$2;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onExtraCallback = i2 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(findresandmsg, access13800Var);
        }
        onExtraCallbackWithResult(findresandmsg, access13800Var);
        throw null;
    }

    public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
        Object objInvokeSuspend;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ReactBundleRepositoryImpl$getBundleForBytesMode$2 reactBundleRepositoryImpl$getBundleForBytesMode$2Create = create(findresandmsg, access13800Var);
        if (i3 == 0) {
            objInvokeSuspend = reactBundleRepositoryImpl$getBundleForBytesMode$2Create.invokeSuspend(Unit.INSTANCE);
            int i4 = 72 / 0;
        } else {
            objInvokeSuspend = reactBundleRepositoryImpl$getBundleForBytesMode$2Create.invokeSuspend(Unit.INSTANCE);
        }
        int i5 = onExtraCallback + 21;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("from", "ReactBundleRepositoryImpl");
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("bundleName", this.$bundleName);
            Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("region", this.$countryCode);
            Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("company", this.$company);
            Object[] objArr = new Object[1];
            a(new char[]{1, 3, 2, 0}, (byte) (View.resolveSize(0, 0) + 59), TextUtils.getCapsMode("", 0, 0) + 4, objArr);
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "react_native_debug", "background_fetch_started_bytes_mode", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "bytes")}), (String) null, false, (String) null, 56, (Object) null);
            ReactRemoteBundleSource reactRemoteBundleSourceOnWarmupCompleted = ReactBundleRepositoryImpl.onWarmupCompleted(this.this$0);
            String str = this.$bundleName;
            String str2 = this.$countryCode;
            String str3 = this.$company;
            Date date = this.$minDeployedAt;
            this.label = 1;
            if (ReactRemoteBundleSource.onNavigationEvent(reactRemoteBundleSourceOnWarmupCompleted, str, str2, str3, date, false, this, 16, null) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            int i3 = onExtraCallback + 75;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallback + 21;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = IAuthTabCallback;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 51;
                $11 = i6 % 128;
                int i7 = i6 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27, Color.green(0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    i3 = 2;
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
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 26 - (KeyEvent.getMaxKeyCode() >> 16), 23139 - TextUtils.getCapsMode("", 0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i8 = $11 + 9;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            int i10 = $10 + 93;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    int i12 = $11 + 41;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 24824), 74 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 30 - TextUtils.getCapsMode("", 0, 0), 19488 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                        } else {
                            int i17 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i17];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            int i20 = $11 + 3;
            $10 = i20 % 128;
            int i21 = i20 % 2;
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }
}
