package o;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.gson.JsonObject;
import im.toss.ads_sdk.NativeAdsManager;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.NativeAdsError;
import im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody;
import im.toss.core.workerservice.WorkerService$Companion$;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.sf.scuba.smartcards.BuildConfig;
import o.GeckoHubImp;
import o.Iso4217CurrencyCode$onWarmupCompleted;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class Iso4217CurrencyCode$onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 1;
    private static long onNavigationEvent = 6718678906964286913L;
    private static int onWarmupCompleted;
    final /* synthetic */ AppCompatActivity $activity;
    final /* synthetic */ setOnOutOfMemeryErrorCallback $callbackProxy;
    final /* synthetic */ r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ $contentOwner;
    final /* synthetic */ JsonObject $data;
    final /* synthetic */ GetNativeAdsRequestBody.AdRequestOption $option;
    final /* synthetic */ String $referrer;
    final /* synthetic */ String $sdkId;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ String $spaceUnitId;
    final /* synthetic */ String $subBundle;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Iso4217CurrencyCode$onWarmupCompleted(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, String str, String str2, JsonObject jsonObject, AppCompatActivity appCompatActivity, String str3, String str4, GetNativeAdsRequestBody.AdRequestOption adRequestOption, String str5, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, access13800<? super Iso4217CurrencyCode$onWarmupCompleted> access13800Var) {
        super(2, access13800Var);
        this.$contentOwner = r8lambdakrhaimf1bm5cgjbilhp45vln_xq;
        this.$sessionId = str;
        this.$referrer = str2;
        this.$data = jsonObject;
        this.$activity = appCompatActivity;
        this.$spaceUnitId = str3;
        this.$sdkId = str4;
        this.$option = adRequestOption;
        this.$subBundle = str5;
        this.$callbackProxy = setonoutofmemeryerrorcallback;
    }

    public static /* synthetic */ NativeAdsManager onWarmupCompleted(AppCompatActivity appCompatActivity) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallback(appCompatActivity);
            throw null;
        }
        NativeAdsManager nativeAdsManagerOnExtraCallback = onExtraCallback(appCompatActivity);
        int i3 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return nativeAdsManagerOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        Iso4217CurrencyCode$onWarmupCompleted iso4217CurrencyCode$onWarmupCompleted = new Iso4217CurrencyCode$onWarmupCompleted(this.$contentOwner, this.$sessionId, this.$referrer, this.$data, this.$activity, this.$spaceUnitId, this.$sdkId, this.$option, this.$subBundle, this.$callbackProxy, access13800Var);
        int i2 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return iso4217CurrencyCode$onWarmupCompleted;
        }
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i2 % 128;
        Object obj3 = null;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            throw null;
        }
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
        int i3 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return objOnExtraCallbackWithResult;
        }
        obj3.hashCode();
        throw null;
    }

    public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = onWarmupCompleted + 31;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    private static final NativeAdsManager onExtraCallback(AppCompatActivity appCompatActivity) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            ((NativeAdsManager.onWarmupCompleted) Response.onWarmupCompleted(appCompatActivity, NativeAdsManager.onWarmupCompleted.class)).onTransact();
            throw null;
        }
        NativeAdsManager nativeAdsManagerOnTransact = ((NativeAdsManager.onWarmupCompleted) Response.onWarmupCompleted(appCompatActivity, NativeAdsManager.onWarmupCompleted.class)).onTransact();
        int i3 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return nativeAdsManagerOnTransact;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), 25 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onNavigationEvent ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString(BuildConfig.FLAVOR)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 59, Color.blue(0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i4 = $11 + 1;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 5;
        }
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 69;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), View.getDefaultSize(0, 0) + 59, 6383 - (ViewConfiguration.getTapTimeout() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i8 = $11 + 123;
            $10 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0196 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOnExtraCallback;
        int i;
        Object objOnExtraCallback2;
        boolean z;
        Long l;
        Integer numOnNavigationEvent;
        int i2;
        int i3 = 2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = this.label;
        Object obj2 = null;
        if (i4 == 0) {
            ResultKt.onNavigationEvent(obj);
            LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21 = LifecyclesKtawaitStarted21.IAuthTabCallback;
            Boolean boolOnNavigationEvent = access14000.onNavigationEvent(true);
            this.label = 1;
            Object[] objArr = new Object[1];
            a(new char[]{39063, 26101, 25163, 24813, 27929, 27537, 26871, 29961, 29609, 28678, 32415, 31740, 30798, 18088, 17173, 16827, 20171, 19278, 18858, 22141, 21642, 20983, 24137, 23771, 22833, 10136, 9444}, 64871 - View.combineMeasuredStates(0, 0), objArr);
            objOnExtraCallback = LifecyclesKtawaitStarted21.onExtraCallback(new Object[]{lifecyclesKtawaitStarted21, ((String) objArr[0]).intern(), boolOnNavigationEvent, this}, 324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
            if (objOnExtraCallback != objOnWarmupCompleted) {
            }
            i = onExtraCallbackWithResult + 59;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                Object[] objArr2 = new Object[1];
                a(new char[]{39061, 15464, 53604, 30311, 2858, 41081, 17763, 6703, 48937, 21619, 59749, 36464, 9079, 63592, 40289, 12832, 55078, 27771, 381, 42621, 31605, 4207, 46457, 19007, 61241, 33912, 22910, 65125, 37757, 10366, 52593, 25136, 1846, 56414, 28993, 5727, 43842, 16397, 58703, 47680, 24412, 62542, 35157, 11863, 49995, 38987, 15681}, TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 42239, objArr2);
                throw new IllegalStateException(((String) objArr2[0]).intern());
            }
            boolean z2 = this.Z$0;
            ResultKt.onNavigationEvent(obj);
            objOnExtraCallback2 = obj;
            z = z2;
            if (((Number) objOnExtraCallback2).longValue() <= 0) {
                objOnExtraCallback2 = null;
            }
            l = (Long) objOnExtraCallback2;
            if (l == null) {
                numOnNavigationEvent = access14000.onNavigationEvent((int) l.longValue());
            } else {
                int i5 = onWarmupCompleted + 65;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 % 5;
                }
                numOnNavigationEvent = null;
            }
            setMode setmode = setMode.IAuthTabCallback;
            r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq = this.$contentOwner;
            final AppCompatActivity appCompatActivity = this.$activity;
            NativeAdsManager nativeAdsManagerOnExtraCallbackWithResult = setmode.onExtraCallbackWithResult(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, new Function0() { // from class: viva.republica.toss.common.web.message.handlers.ads.NativeAdsSdkLoadHandler$onHandleMessage$1$$ExternalSyntheticLambda0
                public final Object invoke() {
                    return Iso4217CurrencyCode$onWarmupCompleted.onWarmupCompleted(appCompatActivity);
                }
            });
            nativeAdsManagerOnExtraCallbackWithResult.IAuthTabCallbackDefault(this.$sessionId);
            if (!StringsKt.isBlank(this.$referrer)) {
                int i7 = onExtraCallbackWithResult + 121;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    nativeAdsManagerOnExtraCallbackWithResult.asInterface(this.$referrer);
                    throw null;
                }
                nativeAdsManagerOnExtraCallbackWithResult.asInterface(this.$referrer);
            }
            nativeAdsManagerOnExtraCallbackWithResult.onTransact((String) null);
            NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -1221152744, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 1221152788, new Object[]{nativeAdsManagerOnExtraCallbackWithResult, X509NameEntryConverter.IAuthTabCallback(this.$data)}, nSetPosition.onExtraCallbackWithResult());
            final setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.$callbackProxy;
            NativeAdsManager.onWarmupCompleted(nativeAdsManagerOnExtraCallbackWithResult, this.$activity, this.$spaceUnitId, (deleteProfile) null, this.$sdkId, (Set) null, new setStrokeColor() { // from class: o.Iso4217CurrencyCode$onWarmupCompleted.4
                public /* bridge */ void IAuthTabCallback(String str) {
                    super.IAuthTabCallback(str);
                }

                public void onNavigationEvent(AdError adError, NativeAdsDto nativeAdsDto) {
                    Intrinsics.checkNotNullParameter(adError, BuildConfig.FLAVOR);
                    Intrinsics.checkNotNullParameter(nativeAdsDto, BuildConfig.FLAVOR);
                    setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, adError.getMessage(), String.valueOf(adError.getCode()), (Map) null, 4, (Object) null);
                }

                public void onExtraCallback(NativeAdsError nativeAdsError) {
                    Intrinsics.checkNotNullParameter(nativeAdsError, BuildConfig.FLAVOR);
                    setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, nativeAdsError.onExtraCallback(), String.valueOf(nativeAdsError.onNavigationEvent()), (Map) null, 4, (Object) null);
                }

                public void onNavigationEvent(NativeAdsDto nativeAdsDto) {
                    Intrinsics.checkNotNullParameter(nativeAdsDto, BuildConfig.FLAVOR);
                    ALCFaceBox.onWarmupCompleted(setonoutofmemeryerrorcallback, getOIDs.IAuthTabCallback(nativeAdsDto));
                }

                public void onExtraCallback(InterstitialAd interstitialAd) {
                    Intrinsics.checkNotNullParameter(interstitialAd, BuildConfig.FLAVOR);
                    setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback2 = setonoutofmemeryerrorcallback;
                    String adUnitId = interstitialAd.getAdUnitId();
                    Intrinsics.checkNotNullExpressionValue(adUnitId, BuildConfig.FLAVOR);
                    ALCFaceBox.onWarmupCompleted(setonoutofmemeryerrorcallback2, getEmbedViewManager.IAuthTabCallback(getOIDs.onNavigationEvent(interstitialAd, adUnitId)));
                }

                public void IAuthTabCallback(RewardedAd rewardedAd) {
                    Intrinsics.checkNotNullParameter(rewardedAd, BuildConfig.FLAVOR);
                    setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback2 = setonoutofmemeryerrorcallback;
                    String adUnitId = rewardedAd.getAdUnitId();
                    Intrinsics.checkNotNullExpressionValue(adUnitId, BuildConfig.FLAVOR);
                    ALCFaceBox.onWarmupCompleted(setonoutofmemeryerrorcallback2, getEmbedViewManager.IAuthTabCallback((X509NameTokenizer) getOIDs.onNavigationEvent(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), new Object[]{rewardedAd, adUnitId}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1766731590, -1766731590)));
                }
            }, this.$option, z, numOnNavigationEvent, this.$subBundle, 20, (Object) null);
            Unit unit = Unit.INSTANCE;
            i2 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }
        ResultKt.onNavigationEvent(obj);
        objOnExtraCallback = obj;
        boolean zBooleanValue = ((Boolean) objOnExtraCallback).booleanValue();
        LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted212 = LifecyclesKtawaitStarted21.IAuthTabCallback;
        Long lOnExtraCallback = access14000.onExtraCallback(-1L);
        this.Z$0 = zBooleanValue;
        this.label = 2;
        Object[] objArr3 = new Object[1];
        a(new char[]{39063, 34151, 41839, 49415, 61265, 3419, 11043, 18795, 30521, 38148, 45835, 53526, 65510, 7650, 15313, 23017, 18411, 26076, 33710, 41463, 53154, 60829, 2973, 10649, 22113, 29818, 37488, 45155, 56911, 64593, 6694, 14392, 9764, 17456, 25109, 33011, 44775}, TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 7669, objArr3);
        objOnExtraCallback2 = LifecyclesKtawaitStarted21.onExtraCallback(new Object[]{lifecyclesKtawaitStarted212, ((String) objArr3[0]).intern(), lOnExtraCallback, this}, 324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        if (objOnExtraCallback2 != objOnWarmupCompleted) {
            z = zBooleanValue;
            if (((Number) objOnExtraCallback2).longValue() <= 0) {
            }
            l = (Long) objOnExtraCallback2;
            if (l == null) {
            }
            setMode setmode2 = setMode.IAuthTabCallback;
            r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq2 = this.$contentOwner;
            final AppCompatActivity appCompatActivity2 = this.$activity;
            NativeAdsManager nativeAdsManagerOnExtraCallbackWithResult2 = setmode2.onExtraCallbackWithResult(r8lambdakrhaimf1bm5cgjbilhp45vln_xq2, new Function0() { // from class: viva.republica.toss.common.web.message.handlers.ads.NativeAdsSdkLoadHandler$onHandleMessage$1$$ExternalSyntheticLambda0
                public final Object invoke() {
                    return Iso4217CurrencyCode$onWarmupCompleted.onWarmupCompleted(appCompatActivity2);
                }
            });
            nativeAdsManagerOnExtraCallbackWithResult2.IAuthTabCallbackDefault(this.$sessionId);
            if (!StringsKt.isBlank(this.$referrer)) {
            }
            nativeAdsManagerOnExtraCallbackWithResult2.onTransact((String) null);
            NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -1221152744, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 1221152788, new Object[]{nativeAdsManagerOnExtraCallbackWithResult2, X509NameEntryConverter.IAuthTabCallback(this.$data)}, nSetPosition.onExtraCallbackWithResult());
            final setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback2 = this.$callbackProxy;
            NativeAdsManager.onWarmupCompleted(nativeAdsManagerOnExtraCallbackWithResult2, this.$activity, this.$spaceUnitId, (deleteProfile) null, this.$sdkId, (Set) null, new setStrokeColor() { // from class: o.Iso4217CurrencyCode$onWarmupCompleted.4
                public /* bridge */ void IAuthTabCallback(String str) {
                    super.IAuthTabCallback(str);
                }

                public void onNavigationEvent(AdError adError, NativeAdsDto nativeAdsDto) {
                    Intrinsics.checkNotNullParameter(adError, BuildConfig.FLAVOR);
                    Intrinsics.checkNotNullParameter(nativeAdsDto, BuildConfig.FLAVOR);
                    setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback2, adError.getMessage(), String.valueOf(adError.getCode()), (Map) null, 4, (Object) null);
                }

                public void onExtraCallback(NativeAdsError nativeAdsError) {
                    Intrinsics.checkNotNullParameter(nativeAdsError, BuildConfig.FLAVOR);
                    setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback2, nativeAdsError.onExtraCallback(), String.valueOf(nativeAdsError.onNavigationEvent()), (Map) null, 4, (Object) null);
                }

                public void onNavigationEvent(NativeAdsDto nativeAdsDto) {
                    Intrinsics.checkNotNullParameter(nativeAdsDto, BuildConfig.FLAVOR);
                    ALCFaceBox.onWarmupCompleted(setonoutofmemeryerrorcallback2, getOIDs.IAuthTabCallback(nativeAdsDto));
                }

                public void onExtraCallback(InterstitialAd interstitialAd) {
                    Intrinsics.checkNotNullParameter(interstitialAd, BuildConfig.FLAVOR);
                    setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback22 = setonoutofmemeryerrorcallback2;
                    String adUnitId = interstitialAd.getAdUnitId();
                    Intrinsics.checkNotNullExpressionValue(adUnitId, BuildConfig.FLAVOR);
                    ALCFaceBox.onWarmupCompleted(setonoutofmemeryerrorcallback22, getEmbedViewManager.IAuthTabCallback(getOIDs.onNavigationEvent(interstitialAd, adUnitId)));
                }

                public void IAuthTabCallback(RewardedAd rewardedAd) {
                    Intrinsics.checkNotNullParameter(rewardedAd, BuildConfig.FLAVOR);
                    setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback22 = setonoutofmemeryerrorcallback2;
                    String adUnitId = rewardedAd.getAdUnitId();
                    Intrinsics.checkNotNullExpressionValue(adUnitId, BuildConfig.FLAVOR);
                    ALCFaceBox.onWarmupCompleted(setonoutofmemeryerrorcallback22, getEmbedViewManager.IAuthTabCallback((X509NameTokenizer) getOIDs.onNavigationEvent(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), new Object[]{rewardedAd, adUnitId}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1766731590, -1766731590)));
                }
            }, this.$option, z, numOnNavigationEvent, this.$subBundle, 20, (Object) null);
            Unit unit2 = Unit.INSTANCE;
            i2 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
            }
        }
        i = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
        }
    }
}
