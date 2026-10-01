package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.rewarded.RewardedAd;
import im.toss.ads_sdk.NativeAdsManager;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.NativeAdsError;
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
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.GeckoHubImp;
import o.getTypeOfBiometricData$onExtraCallback;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getTypeOfBiometricData$onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static short[] onWarmupCompleted;
    final /* synthetic */ AppCompatActivity $activity;
    final /* synthetic */ NativeAdsDto $adResponse;
    final /* synthetic */ setOnOutOfMemeryErrorCallback $callbackProxy;
    final /* synthetic */ r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ $contentOwner;
    final /* synthetic */ String $referrer;
    final /* synthetic */ String $sdkId;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ String $spaceUnitId;
    boolean Z$0;
    int label;
    private static final byte[] $$a = {109, 5, -57, 108};
    private static final int $$b = 167;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int asBinder = 1;
    private static int onExtraCallbackWithResult = -538877432;
    private static int IAuthTabCallback = -1538795423;
    private static int onNavigationEvent = -343048722;
    private static byte[] onExtraCallback = {-50, 7, 53, 5, 15, 72, 13, 51, 62, 115, ISO7816.INS_GET_DATA, 6, 59, 4, 103, 9, -12, 12, ISO7816.INS_ERASE_BINARY, 9, 58, 53, 116, 55, -53, 3, 51, 57, 49, 51, 116, 9, -12, 10, 10, ISO7816.INS_DECREASE_STAMPED, ISO7816.INS_DECREASE, 3, 123, 55, -63, 11, 102, -58, ISO7816.INS_INCREASE, 59, 0, -70, -19, 126, -19, -23, 125, -18, 46, -108, 125, -50, -41, -19, -124, 103, -21, 120, ISO7816.INS_CREATE_FILE, -24, -89, -83, -23, Byte.MAX_VALUE, 43, 37, -47, -19, ISO7816.INS_READ_BINARY_STAMPED, 47, -87, -110, 57, ISOFileInfo.ENV_TEMP_EF, 59, -104, 73, 119, 90, ISOFileInfo.FCI_EXT, 54, ISOFileInfo.FCI_EXT, ISOFileInfo.FILE_IDENTIFIER, 55, -122, -58, 76, 55, 102, ISOFileInfo.DATA_BYTES2, ISOFileInfo.FCI_EXT, 92, 49, ISOFileInfo.PROP_INFO, ISO7816.INS_DECREASE, -104, ISOFileInfo.DATA_BYTES1, 113, 71, ISOFileInfo.FILE_IDENTIFIER, 73, -59, -1, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.FCI_EXT};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, int i2) {
        int i3;
        int i4;
        int i5 = 3 - (i * 2);
        int i6 = 115 - (i2 * 2);
        int i7 = 1 - (b * 4);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i7;
            int i9 = i5;
            i4 = 0;
            int i10 = (-i5) + i8;
            i3 = i4;
            int i11 = i9;
            i6 = i10;
            i5 = i11;
            int i12 = i5 + 1;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
                return new String(bArr2, 0);
            }
            int i13 = i6;
            i9 = i12;
            i5 = bArr[i12];
            i8 = i13;
            int i102 = (-i5) + i8;
            i3 = i4;
            int i112 = i9;
            i6 = i102;
            i5 = i112;
            int i122 = i5 + 1;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            int i1222 = i5 + 1;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    getTypeOfBiometricData$onExtraCallback(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, String str, String str2, AppCompatActivity appCompatActivity, String str3, NativeAdsDto nativeAdsDto, String str4, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, access13800<? super getTypeOfBiometricData$onExtraCallback> access13800Var) {
        super(2, access13800Var);
        this.$contentOwner = r8lambdakrhaimf1bm5cgjbilhp45vln_xq;
        this.$sessionId = str;
        this.$referrer = str2;
        this.$activity = appCompatActivity;
        this.$spaceUnitId = str3;
        this.$adResponse = nativeAdsDto;
        this.$sdkId = str4;
        this.$callbackProxy = setonoutofmemeryerrorcallback;
    }

    public static /* synthetic */ NativeAdsManager onExtraCallback(AppCompatActivity appCompatActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onWarmupCompleted(appCompatActivity);
            throw null;
        }
        NativeAdsManager nativeAdsManagerOnWarmupCompleted = onWarmupCompleted(appCompatActivity);
        int i3 = asBinder + 43;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return nativeAdsManagerOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        getTypeOfBiometricData$onExtraCallback gettypeofbiometricdata_onextracallback = new getTypeOfBiometricData$onExtraCallback(this.$contentOwner, this.$sessionId, this.$referrer, this.$activity, this.$spaceUnitId, this.$adResponse, this.$sdkId, this.$callbackProxy, access13800Var);
        int i2 = asInterface + 7;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return gettypeofbiometricdata_onextracallback;
        }
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        asBinder = i2 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(findresandmsg, access13800Var);
        }
        onExtraCallbackWithResult(findresandmsg, access13800Var);
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = asBinder + 67;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    private static final NativeAdsManager onWarmupCompleted(AppCompatActivity appCompatActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsManager nativeAdsManagerOnTransact = ((NativeAdsManager.onWarmupCompleted) Response.onWarmupCompleted(appCompatActivity, NativeAdsManager.onWarmupCompleted.class)).onTransact();
        int i4 = asBinder + 117;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return nativeAdsManagerOnTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOnExtraCallback;
        Object objOnExtraCallback2;
        boolean z;
        Long l;
        Integer numOnNavigationEvent;
        int i = 2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.label;
        Object obj2 = null;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21 = LifecyclesKtawaitStarted21.IAuthTabCallback;
            Boolean boolOnNavigationEvent = access14000.onNavigationEvent(true);
            this.label = 1;
            Object[] objArr = new Object[1];
            a((short) (87 - (ViewConfiguration.getPressedStateDuration() >> 16)), (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 63), Color.alpha(0) - 2074524113, (-1338680709) - (Process.myPid() >> 22), (-106) - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
            objOnExtraCallback = LifecyclesKtawaitStarted21.onExtraCallback(new Object[]{lifecyclesKtawaitStarted21, ((String) objArr[0]).intern(), boolOnNavigationEvent, this}, 324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
            if (objOnExtraCallback != objOnWarmupCompleted) {
            }
            return objOnWarmupCompleted;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                Object[] objArr2 = new Object[1];
                a((short) (95 - (Process.myTid() >> 22)), (byte) ((-103) - KeyEvent.getDeadChar(0, 0)), (-2074524160) - TextUtils.getTrimmedLength(BuildConfig.FLAVOR), (-1338680707) - View.resolveSize(0, 0), (-105) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
                throw new IllegalStateException(((String) objArr2[0]).intern());
            }
            int i3 = asInterface + 19;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                ResultKt.onNavigationEvent(obj);
                obj2.hashCode();
                throw null;
            }
            boolean z2 = this.Z$0;
            ResultKt.onNavigationEvent(obj);
            int i4 = asInterface + 25;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            objOnExtraCallback2 = obj;
            z = z2;
            if (((Number) objOnExtraCallback2).longValue() <= 0) {
                int i6 = asInterface + 65;
                asBinder = i6 % 128;
                if (i6 % 2 == 0) {
                    obj2.hashCode();
                    throw null;
                }
                objOnExtraCallback2 = null;
            }
            l = (Long) objOnExtraCallback2;
            if (l == null) {
                int i7 = asBinder + 55;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                numOnNavigationEvent = access14000.onNavigationEvent((int) l.longValue());
            } else {
                numOnNavigationEvent = null;
            }
            setMode setmode = setMode.IAuthTabCallback;
            r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq = this.$contentOwner;
            final AppCompatActivity appCompatActivity = this.$activity;
            NativeAdsManager nativeAdsManagerOnExtraCallbackWithResult = setmode.onExtraCallbackWithResult(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, new Function0() { // from class: viva.republica.toss.common.web.message.handlers.ads.NativeAdsSdkLoadWithDataHandler$onHandleMessage$1$$ExternalSyntheticLambda0
                public final Object invoke() {
                    return getTypeOfBiometricData$onExtraCallback.onExtraCallback(appCompatActivity);
                }
            });
            nativeAdsManagerOnExtraCallbackWithResult.IAuthTabCallbackDefault(this.$sessionId);
            if (!StringsKt.isBlank(this.$referrer)) {
                int i9 = asBinder + 81;
                asInterface = i9 % 128;
                if (i9 % 2 != 0) {
                    nativeAdsManagerOnExtraCallbackWithResult.asInterface(this.$referrer);
                    obj2.hashCode();
                    throw null;
                }
                nativeAdsManagerOnExtraCallbackWithResult.asInterface(this.$referrer);
            }
            final setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.$callbackProxy;
            NativeAdsManager.onExtraCallbackWithResult(nativeAdsManagerOnExtraCallbackWithResult, this.$activity, this.$spaceUnitId, this.$adResponse, (deleteProfile) null, this.$sdkId, (Set) null, new setStrokeColor() { // from class: o.getTypeOfBiometricData$onExtraCallback.5
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
            }, z, numOnNavigationEvent, 40, (Object) null);
            return Unit.INSTANCE;
        }
        ResultKt.onNavigationEvent(obj);
        int i10 = asBinder + 3;
        asInterface = i10 % 128;
        int i11 = i10 % 2;
        objOnExtraCallback = obj;
        boolean zBooleanValue = ((Boolean) objOnExtraCallback).booleanValue();
        LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted212 = LifecyclesKtawaitStarted21.IAuthTabCallback;
        Long lOnExtraCallback = access14000.onExtraCallback(-1L);
        this.Z$0 = zBooleanValue;
        this.label = 2;
        Object[] objArr3 = new Object[1];
        a((short) (29 - ((byte) KeyEvent.getModifierMetaStateMask())), (byte) ((-82) - View.getDefaultSize(0, 0)), (-2074524085) + (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1338680710, TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) - 105, objArr3);
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
            NativeAdsManager nativeAdsManagerOnExtraCallbackWithResult2 = setmode2.onExtraCallbackWithResult(r8lambdakrhaimf1bm5cgjbilhp45vln_xq2, new Function0() { // from class: viva.republica.toss.common.web.message.handlers.ads.NativeAdsSdkLoadWithDataHandler$onHandleMessage$1$$ExternalSyntheticLambda0
                public final Object invoke() {
                    return getTypeOfBiometricData$onExtraCallback.onExtraCallback(appCompatActivity2);
                }
            });
            nativeAdsManagerOnExtraCallbackWithResult2.IAuthTabCallbackDefault(this.$sessionId);
            if (!StringsKt.isBlank(this.$referrer)) {
            }
            final setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback2 = this.$callbackProxy;
            NativeAdsManager.onExtraCallbackWithResult(nativeAdsManagerOnExtraCallbackWithResult2, this.$activity, this.$spaceUnitId, this.$adResponse, (deleteProfile) null, this.$sdkId, (Set) null, new setStrokeColor() { // from class: o.getTypeOfBiometricData$onExtraCallback.5
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
            }, z, numOnNavigationEvent, 40, (Object) null);
            return Unit.INSTANCE;
        }
        return objOnWarmupCompleted;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        boolean z;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 43424), 42 - (Process.myTid() >> 22), 22439 - Color.red(0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                byte[] bArr = onExtraCallback;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i6 = 0; i6 < length; i6++) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12843), (ViewConfiguration.getJumpTapTimeout() >> 16) + 55, 2167 - ((Process.getThreadPriority(0) + 20) >> 6), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i6] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onExtraCallback;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR)), 42 - (KeyEvent.getMaxKeyCode() >> 16), ExpandableListView.getPackedPositionType(0L) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onWarmupCompleted[i + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i7 = $11;
                int i8 = i7 + 9;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                int i10 = ((i + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)));
                if (!z2) {
                    i4 = 0;
                } else {
                    int i11 = i7 + 61;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    i4 = 1;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i10 + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onNavigationEvent), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 86 - View.MeasureSpec.getMode(0), 9567 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallback;
                if (bArr4 != null) {
                    int i13 = $11 + 13;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i15 = 0; i15 < length2; i15++) {
                        int i16 = $11 + 101;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                        bArr5[i15] = (byte) (bArr4[i15] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    z = true;
                } else {
                    int i18 = $10 + 11;
                    $11 = i18 % 128;
                    int i19 = i18 % 2;
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i20 = $11 + 95;
                    $10 = i20 % 128;
                    int i21 = i20 % 2;
                    if (!z) {
                        short[] sArr = onWarmupCompleted;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        byte[] bArr6 = onExtraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }
}
