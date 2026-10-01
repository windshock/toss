package o;

import android.app.Activity;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.AdapterResponseInfo;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdPreloader;
import com.google.android.gms.ads.preload.PreloadCallbackV2;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdPreloader;
import com.tmoney.LiveCheckConstants;
import im.toss.ads_sdk.NativeAdsManager;
import im.toss.ads_sdk.admob.AdmobAdFormat;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.remote.model.AdMobPaidAdValue;
import im.toss.ads_sdk.remote.model.EventType;
import im.toss.ads_sdk.remote.model.ExposureContent;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import o.UtilsKtExternalSyntheticLambda17;
import o.getPackageType;
import o.scrollToItem;
import o.setLogBuffers;
import o.setTrimPathEnd;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setTrimPathEnd {
    public static final IAuthTabCallback Companion;
    private static final long IAuthTabCallback;
    private static int extraCallbackWithResult = 0;
    private static int onActivityLayout = 1;
    private static int onActivityResized = 0;
    public static final int onExtraCallback = 8;
    private static final long onExtraCallbackWithResult;
    private static int readTypedObject = 1;
    private final calculatePageOffsets IAuthTabCallbackDefault;
    private final NativeAdsManager IAuthTabCallbackStub;
    private volatile String IAuthTabCallbackStubProxy;
    private getPackageType IAuthTabCallback_Parcel;
    private volatile String ICustomTabsCallback;
    private volatile boolean access000;
    private final String access100;
    private final onExtraCallbackWithResult asBinder;
    private final findResAndMsg asInterface;
    private final NativeAdsManager.IAuthTabCallbackStubProxy extraCallback;
    private final Integer getInterfaceDescriptor;
    private final AppCompatActivity onNavigationEvent;
    private final NativeAdsDto onTransact;
    private getPackageType onWarmupCompleted;
    private final boolean writeTypedObject;

    public interface onExtraCallbackWithResult {
        void onExtraCallback(@NotNull RewardedAd rewardedAd);

        void onExtraCallbackWithResult(@NotNull AdError adError);

        void onWarmupCompleted(@NotNull InterstitialAd interstitialAd);
    }

    public static /* synthetic */ void IAuthTabCallback(setTrimPathEnd settrimpathend, RewardedAd rewardedAd, setTrimPathOffset settrimpathoffset, scrollToItem scrolltoitem, RewardItem rewardItem) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 63;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(settrimpathend, rewardedAd, settrimpathoffset, scrolltoitem, rewardItem);
        int i4 = readTypedObject + 111;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onExtraCallback(setTrimPathEnd settrimpathend, InterstitialAd interstitialAd, AdValue adValue) {
        int i = 2 % 2;
        int i2 = readTypedObject + 53;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(settrimpathend, interstitialAd, adValue);
        int i4 = readTypedObject + 111;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = (~(i4 | i)) | i6;
        int i8 = i | i4 | i6;
        int i9 = ~i4;
        int i10 = i4 + i6 + i2 + ((-421447895) * i3) + ((-859425246) * i5);
        int i11 = i10 * i10;
        int i12 = (i4 * (-629045104)) + 1817116672 + ((-629045104) * i6) + (i7 * (-1407420559)) + ((-1407420559) * i8) + (1407420559 * i9) + ((-2036465664) * i2) + ((-2125594624) * i3) + (888930304 * i5) + (441384960 * i11);
        int i13 = (i4 * 1303038832) + 2077918271 + (i6 * 1303038832) + (i7 * (-49)) + (i8 * (-49)) + (i9 * 49) + (i2 * 1303038783) + (i3 * 1583617559) + (i5 * (-1102559138)) + (i11 * 510722048);
        switch (i12 + (i13 * i13 * 607191040)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                setTrimPathEnd settrimpathend = (setTrimPathEnd) objArr[0];
                InterstitialAd interstitialAd = (InterstitialAd) objArr[1];
                int i14 = 2 % 2;
                interstitialAd.setFullScreenContentCallback(new onWarmupCompleted(settrimpathend, interstitialAd, ((Boolean) objArr[3]).booleanValue(), (setTrimPathOffset) objArr[2]));
                int i15 = readTypedObject + 1;
                extraCallbackWithResult = i15 % 128;
                int i16 = i15 % 2;
                return null;
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                setTrimPathEnd settrimpathend2 = (setTrimPathEnd) objArr[0];
                int i17 = 2 % 2;
                maybeUpdateAnimatable.onNavigationEvent(settrimpathend2.asInterface, (CoroutineContext) null, (setRandomHost) null, settrimpathend2.new IAuthTabCallbackStubProxy((EventType) objArr[1], (InterstitialAd) objArr[2], null), 3, (Object) null);
                int i18 = extraCallbackWithResult + 11;
                readTypedObject = i18 % 128;
                int i19 = i18 % 2;
                return null;
            case 8:
                return onTransact(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                return asInterface(objArr);
            case 11:
                return IAuthTabCallbackStub(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ void onWarmupCompleted(setTrimPathEnd settrimpathend, RewardedAd rewardedAd, AdValue adValue) {
        int i = 2 % 2;
        int i2 = readTypedObject + 119;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(settrimpathend, rewardedAd, adValue);
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        int i5 = extraCallbackWithResult + 51;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public setTrimPathEnd(@NotNull NativeAdsDto nativeAdsDto, @NotNull String str, @NotNull AppCompatActivity appCompatActivity, @NotNull NativeAdsManager nativeAdsManager, @NotNull calculatePageOffsets calculatepageoffsets, boolean z, @NotNull NativeAdsManager.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy, @Nullable onExtraCallbackWithResult onextracallbackwithresult, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(nativeAdsDto, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        Intrinsics.checkNotNullParameter(nativeAdsManager, "");
        Intrinsics.checkNotNullParameter(calculatepageoffsets, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStubProxy, "");
        this.onTransact = nativeAdsDto;
        this.access100 = str;
        this.onNavigationEvent = appCompatActivity;
        this.IAuthTabCallbackStub = nativeAdsManager;
        this.IAuthTabCallbackDefault = calculatepageoffsets;
        this.writeTypedObject = z;
        this.extraCallback = iAuthTabCallbackStubProxy;
        this.asBinder = onextracallbackwithresult;
        this.getInterfaceDescriptor = num;
        this.asInterface = findRes.onWarmupCompleted(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null).plus(putChannelInfo.IAuthTabCallback()));
    }

    public static final /* synthetic */ PreloadConfiguration IAuthTabCallback(setTrimPathEnd settrimpathend, NativeAdsDto.AdmobInfo admobInfo) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 75;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        PreloadConfiguration preloadConfigurationOnWarmupCompleted = settrimpathend.onWarmupCompleted(admobInfo);
        int i4 = readTypedObject + 87;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return preloadConfigurationOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object IAuthTabCallback(setTrimPathEnd settrimpathend, NativeAdsDto.AdmobInfo admobInfo, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 101;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return settrimpathend.IAuthTabCallback(admobInfo, (access13800<? super Unit>) access13800Var);
        }
        settrimpathend.IAuthTabCallback(admobInfo, (access13800<? super Unit>) access13800Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        setTrimPathEnd settrimpathend = (setTrimPathEnd) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 29;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        AdError adErrorOnWarmupCompleted = settrimpathend.onWarmupCompleted(th);
        int i4 = extraCallbackWithResult + 15;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return adErrorOnWarmupCompleted;
        }
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(setTrimPathEnd settrimpathend, InterstitialAd interstitialAd) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 15;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        settrimpathend.onWarmupCompleted(interstitialAd);
        int i4 = extraCallbackWithResult + 49;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(setTrimPathEnd settrimpathend, EventType eventType, InterstitialAd interstitialAd) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 97;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 2072704601, forceDomainCheck.IAuthTabCallback(), -2072704594, new Object[]{settrimpathend, eventType, interstitialAd});
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 2072704601, forceDomainCheck.IAuthTabCallback(), -2072704594, new Object[]{settrimpathend, eventType, interstitialAd});
        int i3 = extraCallbackWithResult + 25;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        setTrimPathEnd settrimpathend = (setTrimPathEnd) objArr[0];
        NativeAdsDto.AdmobInfo admobInfo = (NativeAdsDto.AdmobInfo) objArr[1];
        access13800<? super Unit> access13800Var = (access13800) objArr[2];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 73;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = settrimpathend.onWarmupCompleted(admobInfo, access13800Var);
        int i4 = readTypedObject + 23;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return objOnWarmupCompleted;
    }

    public static final /* synthetic */ boolean IAuthTabCallbackDefault(setTrimPathEnd settrimpathend) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 25;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean z = settrimpathend.access000;
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        return z;
    }

    public static final /* synthetic */ String IAuthTabCallbackStub(setTrimPathEnd settrimpathend) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 17;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String str = settrimpathend.access100;
        if (i3 != 0) {
            return str;
        }
        throw null;
    }

    public static final /* synthetic */ boolean IAuthTabCallback_Parcel(setTrimPathEnd settrimpathend) {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 11;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        boolean z = settrimpathend.writeTypedObject;
        int i5 = i2 + 73;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public static final /* synthetic */ NativeAdsManager asBinder(setTrimPathEnd settrimpathend) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 107;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        NativeAdsManager nativeAdsManager = settrimpathend.IAuthTabCallbackStub;
        if (i4 == 0) {
            int i5 = 36 / 0;
        }
        int i6 = i3 + 3;
        extraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return nativeAdsManager;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        setTrimPathEnd settrimpathend = (setTrimPathEnd) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 75;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        getPackageType getpackagetype = settrimpathend.IAuthTabCallback_Parcel;
        int i5 = i2 + 109;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return getpackagetype;
    }

    public static final /* synthetic */ onExtraCallbackWithResult asInterface(setTrimPathEnd settrimpathend) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 37;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = settrimpathend.asBinder;
        int i5 = i3 + 37;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return onextracallbackwithresult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ long onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 15;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        long j = onExtraCallbackWithResult;
        int i5 = i3 + 101;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 94 / 0;
        }
        return j;
    }

    public static final /* synthetic */ NativeAdsDto onExtraCallback(setTrimPathEnd settrimpathend) {
        int i = 2 % 2;
        int i2 = readTypedObject + 9;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        NativeAdsDto nativeAdsDto = settrimpathend.onTransact;
        int i5 = i3 + 89;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 92 / 0;
        }
        return nativeAdsDto;
    }

    public static final /* synthetic */ void onExtraCallback(setTrimPathEnd settrimpathend, getPackageType getpackagetype) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 39;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        settrimpathend.IAuthTabCallback_Parcel = getpackagetype;
        int i5 = i2 + 37;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 121;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ CharSequence onExtraCallbackWithResult(setTrimPathEnd settrimpathend, EventType eventType, ExposureContent exposureContent, String str) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 73;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return settrimpathend.IAuthTabCallback(eventType, exposureContent, str);
        }
        settrimpathend.IAuthTabCallback(eventType, exposureContent, str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ findResAndMsg onExtraCallbackWithResult(setTrimPathEnd settrimpathend) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 27;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        findResAndMsg findresandmsg = settrimpathend.asInterface;
        int i5 = i3 + 11;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return findresandmsg;
        }
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(setTrimPathEnd settrimpathend, AdError adError) {
        int i = 2 % 2;
        int i2 = readTypedObject + 61;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1146586069, forceDomainCheck.IAuthTabCallback(), 1146586070, new Object[]{settrimpathend, adError});
            return;
        }
        onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1146586069, forceDomainCheck.IAuthTabCallback(), 1146586070, new Object[]{settrimpathend, adError});
        int i3 = 40 / 0;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(setTrimPathEnd settrimpathend, NativeAdsDto.AdmobInfo admobInfo) {
        int i = 2 % 2;
        int i2 = readTypedObject + 73;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        settrimpathend.onNavigationEvent(admobInfo);
        int i4 = extraCallbackWithResult + 15;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        setTrimPathEnd settrimpathend = (setTrimPathEnd) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 81;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        AppCompatActivity appCompatActivity = settrimpathend.onNavigationEvent;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 35;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
        return appCompatActivity;
    }

    public static final /* synthetic */ String onNavigationEvent(setTrimPathEnd settrimpathend, ResponseInfo responseInfo, String str) {
        int i = 2 % 2;
        int i2 = readTypedObject + 15;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return (String) onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -610098727, forceDomainCheck.IAuthTabCallback(), 610098735, new Object[]{settrimpathend, responseInfo, str});
        }
        String str2 = (String) onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -610098727, forceDomainCheck.IAuthTabCallback(), 610098735, new Object[]{settrimpathend, responseInfo, str});
        int i3 = 35 / 0;
        return str2;
    }

    public static final /* synthetic */ void onNavigationEvent(Ref.BooleanRef booleanRef, maybeRemoveAttachStateListener mayberemoveattachstatelistener, setTrimPathEnd settrimpathend, InterstitialAd interstitialAd, AdError adError) {
        int i = 2 % 2;
        int i2 = readTypedObject + 89;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(booleanRef, (maybeRemoveAttachStateListener<? super Unit>) mayberemoveattachstatelistener, settrimpathend, interstitialAd, adError);
        if (i3 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onNavigationEvent(setTrimPathEnd settrimpathend, RewardedAd rewardedAd) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 43;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        settrimpathend.onExtraCallbackWithResult(rewardedAd);
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        int i5 = readTypedObject + 7;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(setTrimPathEnd settrimpathend, String str) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 93;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        settrimpathend.IAuthTabCallbackStubProxy = str;
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
    }

    public static final /* synthetic */ boolean onNavigationEvent(setTrimPathEnd settrimpathend) {
        int i = 2 % 2;
        int i2 = readTypedObject + 15;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return settrimpathend.onWarmupCompleted();
        }
        settrimpathend.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Ref.BooleanRef booleanRef = (Ref.BooleanRef) objArr[0];
        maybeRemoveAttachStateListener mayberemoveattachstatelistener = (maybeRemoveAttachStateListener) objArr[1];
        setTrimPathEnd settrimpathend = (setTrimPathEnd) objArr[2];
        RewardedAd rewardedAd = (RewardedAd) objArr[3];
        AdError adError = (AdError) objArr[4];
        int i = 2 % 2;
        int i2 = readTypedObject + 99;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {booleanRef, mayberemoveattachstatelistener, settrimpathend, rewardedAd, adError};
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        if (i3 != 0) {
            onNavigationEvent(iIAuthTabCallback, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1778841445, forceDomainCheck.IAuthTabCallback(), 1778841450, objArr2);
            throw null;
        }
        onNavigationEvent(iIAuthTabCallback, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1778841445, forceDomainCheck.IAuthTabCallback(), 1778841450, objArr2);
        int i4 = extraCallbackWithResult + 41;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final /* synthetic */ calculatePageOffsets onWarmupCompleted(setTrimPathEnd settrimpathend) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 69;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        calculatePageOffsets calculatepageoffsets = settrimpathend.IAuthTabCallbackDefault;
        if (i3 != 0) {
            return calculatepageoffsets;
        }
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(setTrimPathEnd settrimpathend, NativeAdsDto.AdmobInfo admobInfo) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 65;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        settrimpathend.onExtraCallback(admobInfo);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = extraCallbackWithResult + 33;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onWarmupCompleted(setTrimPathEnd settrimpathend, EventType eventType, RewardedAd rewardedAd) {
        int i = 2 % 2;
        int i2 = readTypedObject + 125;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        settrimpathend.onExtraCallback(eventType, rewardedAd);
        int i4 = readTypedObject + 23;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(setTrimPathEnd settrimpathend, String str) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 29;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        settrimpathend.ICustomTabsCallback = str;
        if (i3 == 0) {
            throw null;
        }
        int i4 = readTypedObject + 37;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ AdError $error$inlined;
        int label;
        final /* synthetic */ setTrimPathEnd this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackStub(access13800 access13800Var, setTrimPathEnd settrimpathend, AdError adError) {
            super(2, access13800Var);
            this.this$0 = settrimpathend;
            this.$error$inlined = adError;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = new IAuthTabCallbackStub(access13800Var, this.this$0, this.$error$inlined);
            int i2 = onWarmupCompleted + 101;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackStub;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 117;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 105;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStubCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                objInvokeSuspend = iAuthTabCallbackStubCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 2 / 0;
            } else {
                objInvokeSuspend = iAuthTabCallbackStubCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onExtraCallbackWithResult + 99;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 26 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            Object obj2 = null;
            if (i4 != 0) {
                int i5 = onWarmupCompleted + 63;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0 ? i4 != 1 : i4 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    int i6 = onExtraCallbackWithResult + 47;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    obj2.hashCode();
                    throw null;
                }
            }
            try {
                onExtraCallbackWithResult onextracallbackwithresultAsInterface = setTrimPathEnd.asInterface(this.this$0);
                if (onextracallbackwithresultAsInterface != null) {
                    int i7 = onExtraCallbackWithResult + 117;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 != 0) {
                        onextracallbackwithresultAsInterface.onExtraCallbackWithResult(this.$error$inlined);
                        obj2.hashCode();
                        throw null;
                    }
                    onextracallbackwithresultAsInterface.onExtraCallbackWithResult(this.$error$inlined);
                    int i8 = onExtraCallbackWithResult + 43;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 5 % 5;
                    }
                }
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }
    }

    public static final class ICustomTabsCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ AdError $error$inlined;
        int label;
        final /* synthetic */ setTrimPathEnd this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ICustomTabsCallbackDefault(access13800 access13800Var, setTrimPathEnd settrimpathend, AdError adError) {
            super(2, access13800Var);
            this.this$0 = settrimpathend;
            this.$error$inlined = adError;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsCallbackDefault iCustomTabsCallbackDefault = new ICustomTabsCallbackDefault(access13800Var, this.this$0, this.$error$inlined);
            int i2 = onExtraCallback + 121;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return iCustomTabsCallbackDefault;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 45;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ICustomTabsCallbackDefault iCustomTabsCallbackDefaultCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                objInvokeSuspend = iCustomTabsCallbackDefaultCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 32 / 0;
            } else {
                objInvokeSuspend = iCustomTabsCallbackDefaultCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onExtraCallback + 69;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    int i3 = onWarmupCompleted + 49;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onWarmupCompleted + 115;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            }
            try {
                onExtraCallbackWithResult onextracallbackwithresultAsInterface = setTrimPathEnd.asInterface(this.this$0);
                if (onextracallbackwithresultAsInterface != null) {
                    int i6 = onExtraCallback + 69;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    onextracallbackwithresultAsInterface.onExtraCallbackWithResult(this.$error$inlined);
                }
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }
    }

    public static final class ICustomTabsCallbackStubProxy extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ AdError $adError$inlined;
        int label;
        final /* synthetic */ setTrimPathEnd this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ICustomTabsCallbackStubProxy(access13800 access13800Var, setTrimPathEnd settrimpathend, AdError adError) {
            super(2, access13800Var);
            this.this$0 = settrimpathend;
            this.$adError$inlined = adError;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 11;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsCallbackStubProxy iCustomTabsCallbackStubProxy = new ICustomTabsCallbackStubProxy(access13800Var, this.this$0, this.$adError$inlined);
            int i2 = onWarmupCompleted + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iCustomTabsCallbackStubProxy;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i3 = 49 / 0;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    int i5 = onWarmupCompleted + 105;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 88 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i7 = onWarmupCompleted + 113;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    int i8 = 68 / 0;
                } else {
                    ResultKt.onNavigationEvent(obj);
                }
            }
            try {
                onExtraCallbackWithResult onextracallbackwithresultAsInterface = setTrimPathEnd.asInterface(this.this$0);
                if (onextracallbackwithresultAsInterface != null) {
                    onextracallbackwithresultAsInterface.onExtraCallbackWithResult(this.$adError$inlined);
                }
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }
    }

    public static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ setTrimPathOffset $adCallBack$inlined;
        final /* synthetic */ scrollToItem $admobCache$inlined;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asInterface(access13800 access13800Var, setTrimPathOffset settrimpathoffset, scrollToItem scrolltoitem) {
            super(2, access13800Var);
            this.$adCallBack$inlined = settrimpathoffset;
            this.$admobCache$inlined = scrolltoitem;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = new asInterface(access13800Var, this.$adCallBack$inlined, this.$admobCache$inlined);
            int i2 = IAuthTabCallback + 109;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return asinterface;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            if (i3 != 0) {
                int i4 = 29 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 54 / 0;
            }
            int i5 = onExtraCallback + 7;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = IAuthTabCallback + 61;
                int i6 = i5 % 128;
                onExtraCallback = i6;
                if (i5 % 2 == 0 ? i4 != 1 : i4 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i7 = i6 + 63;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    int i8 = IAuthTabCallback + 89;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    return objOnWarmupCompleted;
                }
            }
            try {
                this.$adCallBack$inlined.onExtraCallbackWithResult((scrollToItem.onWarmupCompleted) this.$admobCache$inlined);
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }
    }

    public static final class extraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ AdError $adError$inlined;
        int label;
        final /* synthetic */ setTrimPathEnd this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public extraCallback(access13800 access13800Var, setTrimPathEnd settrimpathend, AdError adError) {
            super(2, access13800Var);
            this.this$0 = settrimpathend;
            this.$adError$inlined = adError;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            extraCallback extracallback = new extraCallback(access13800Var, this.this$0, this.$adError$inlined);
            int i2 = onExtraCallback + 65;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return extracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 113;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 11;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallback + 81;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    int i4 = onExtraCallbackWithResult + 5;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }
            }
            try {
                onExtraCallbackWithResult onextracallbackwithresultAsInterface = setTrimPathEnd.asInterface(this.this$0);
                if (onextracallbackwithresultAsInterface != null) {
                    int i6 = onExtraCallback + 67;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 != 0) {
                        onextracallbackwithresultAsInterface.onExtraCallbackWithResult(this.$adError$inlined);
                        throw null;
                    }
                    onextracallbackwithresultAsInterface.onExtraCallbackWithResult(this.$adError$inlined);
                }
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }
    }

    public static final class onActivityResized extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ RewardedAd $ad$inlined;
        int label;
        final /* synthetic */ setTrimPathEnd this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onActivityResized(access13800 access13800Var, setTrimPathEnd settrimpathend, RewardedAd rewardedAd) {
            super(2, access13800Var);
            this.this$0 = settrimpathend;
            this.$ad$inlined = rewardedAd;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onActivityResized onactivityresizedCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return onactivityresizedCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 31 / 0;
            return onactivityresizedCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onActivityResized onactivityresized = new onActivityResized(access13800Var, this.this$0, this.$ad$inlined);
            int i2 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onactivityresized;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 109;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 107;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[PHI: r1
          0x0048: PHI (r1v17 java.lang.Object) = (r1v4 java.lang.Object), (r1v18 java.lang.Object) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r3
          0x0023: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            int i;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 6 / 0;
                if (i != 0) {
                    int i5 = IAuthTabCallback + 109;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0 ? i != 1 : i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    int i6 = onExtraCallbackWithResult + 109;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    ResultKt.onNavigationEvent(obj);
                    this.label = 1;
                    if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                        int i8 = onExtraCallbackWithResult + 113;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                        return objOnWarmupCompleted;
                    }
                }
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            try {
                onExtraCallbackWithResult onextracallbackwithresultAsInterface = setTrimPathEnd.asInterface(this.this$0);
                if (onextracallbackwithresultAsInterface != null) {
                    int i10 = IAuthTabCallback + 69;
                    onExtraCallbackWithResult = i10 % 128;
                    if (i10 % 2 != 0) {
                        onextracallbackwithresultAsInterface.onExtraCallback(this.$ad$inlined);
                        int i11 = 21 / 0;
                    } else {
                        onextracallbackwithresultAsInterface.onExtraCallback(this.$ad$inlined);
                    }
                }
            } catch (Throwable unused) {
            }
            Unit unit = Unit.INSTANCE;
            int i12 = onExtraCallbackWithResult + 91;
            IAuthTabCallback = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 70 / 0;
            }
            return unit;
        }
    }

    /* renamed from: o.setTrimPathEnd$onExtraCallback, reason: case insensitive filesystem */
    public static final class C0066onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        int label;
        final /* synthetic */ setTrimPathEnd this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0066onExtraCallback(access13800 access13800Var, setTrimPathEnd settrimpathend) {
            super(2, access13800Var);
            this.this$0 = settrimpathend;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            C0066onExtraCallback c0066onExtraCallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                c0066onExtraCallbackCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = c0066onExtraCallbackCreate.invokeSuspend(unit);
            int i4 = onWarmupCompleted + 97;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            C0066onExtraCallback c0066onExtraCallback = new C0066onExtraCallback(access13800Var, this.this$0);
            int i2 = onWarmupCompleted + 85;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return c0066onExtraCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 119;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objIAuthTabCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallback + 3;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    int i5 = onWarmupCompleted + 17;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return objOnWarmupCompleted;
                }
            }
            try {
                onExtraCallbackWithResult onextracallbackwithresultAsInterface = setTrimPathEnd.asInterface(this.this$0);
                if (onextracallbackwithresultAsInterface != null) {
                    onextracallbackwithresultAsInterface.onExtraCallbackWithResult(new AdError(999, "Forced Fail", "Test"));
                }
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }
    }

    public static final class onMessageChannelReady extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ AdError $error$inlined;
        int label;
        final /* synthetic */ setTrimPathEnd this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onMessageChannelReady(access13800 access13800Var, setTrimPathEnd settrimpathend, AdError adError) {
            super(2, access13800Var);
            this.this$0 = settrimpathend;
            this.$error$inlined = adError;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onMessageChannelReady onmessagechannelready = new onMessageChannelReady(access13800Var, this.this$0, this.$error$inlined);
            int i2 = IAuthTabCallback + 59;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onmessagechannelready;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 41;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onMessageChannelReady onmessagechannelreadyCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                onmessagechannelreadyCreate.invokeSuspend(unit);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onmessagechannelreadyCreate.invokeSuspend(unit);
            int i4 = IAuthTabCallback + 43;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onWarmupCompleted + 79;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = IAuthTabCallback + 69;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    int i7 = IAuthTabCallback + 87;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }
            try {
                onExtraCallbackWithResult onextracallbackwithresultAsInterface = setTrimPathEnd.asInterface(this.this$0);
                if (onextracallbackwithresultAsInterface != null) {
                    onextracallbackwithresultAsInterface.onExtraCallbackWithResult(this.$error$inlined);
                }
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }
    }

    public static final class writeTypedObject extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ InterstitialAd $ad$inlined;
        int label;
        final /* synthetic */ setTrimPathEnd this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public writeTypedObject(access13800 access13800Var, setTrimPathEnd settrimpathend, InterstitialAd interstitialAd) {
            super(2, access13800Var);
            this.this$0 = settrimpathend;
            this.$ad$inlined = interstitialAd;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            writeTypedObject writetypedobject = new writeTypedObject(access13800Var, this.this$0, this.$ad$inlined);
            int i2 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 42 / 0;
            }
            return writetypedobject;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 105;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            writeTypedObject writetypedobjectCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                writetypedobjectCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = writetypedobjectCreate.invokeSuspend(unit);
            int i4 = onWarmupCompleted + 33;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onWarmupCompleted + 117;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            try {
                onExtraCallbackWithResult onextracallbackwithresultAsInterface = setTrimPathEnd.asInterface(this.this$0);
                if (onextracallbackwithresultAsInterface != null) {
                    onextracallbackwithresultAsInterface.onWarmupCompleted(this.$ad$inlined);
                }
            } catch (Throwable unused) {
            }
            Unit unit = Unit.INSTANCE;
            int i5 = onExtraCallbackWithResult + 121;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public final void IAuthTabCallback() {
        int i = 2 % 2;
        NativeAdsDto.AdmobInfo admobInfoOnExtraCallbackWithResult = this.onTransact.onTransact().onNavigationEvent().onExtraCallbackWithResult();
        if (admobInfoOnExtraCallbackWithResult != null) {
            int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
            AdmobAdFormat admobAdFormat = (AdmobAdFormat) NativeAdsDto.AdmobInfo.onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 1779197038, new Object[]{admobInfoOnExtraCallbackWithResult}, iOnExtraCallbackWithResult, -1779197038);
            if (admobAdFormat == AdmobAdFormat.INTERSTITIAL || admobAdFormat == AdmobAdFormat.REWARDED) {
                getPackageType getpackagetype = this.onWarmupCompleted;
                Object obj = null;
                if (getpackagetype != null) {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                    int i2 = extraCallbackWithResult + 85;
                    readTypedObject = i2 % 128;
                    int i3 = i2 % 2;
                }
                this.onWarmupCompleted = maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this.onNavigationEvent), (CoroutineContext) null, (setRandomHost) null, new asBinder(admobAdFormat, admobInfoOnExtraCallbackWithResult, null), 3, (Object) null);
                int i4 = readTypedObject + 17;
                extraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ NativeAdsDto.AdmobInfo $admobInfo;
        final /* synthetic */ AdmobAdFormat $format;
        int label;

        public static final /* synthetic */ class IAuthTabCallback {
            private static int IAuthTabCallback = 0;
            public static final /* synthetic */ int[] onExtraCallback;
            private static int onNavigationEvent = 1;

            static {
                int[] iArr = new int[AdmobAdFormat.values().length];
                try {
                    iArr[AdmobAdFormat.INTERSTITIAL.ordinal()] = 1;
                    int i = onNavigationEvent + 11;
                    IAuthTabCallback = i % 128;
                    int i2 = i % 2;
                    int i3 = 2 % 2;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AdmobAdFormat.REWARDED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                onExtraCallback = iArr;
                int i4 = IAuthTabCallback + 79;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(AdmobAdFormat admobAdFormat, NativeAdsDto.AdmobInfo admobInfo, access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
            this.$format = admobAdFormat;
            this.$admobInfo = admobInfo;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 49 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = setTrimPathEnd.this.new asBinder(this.$format, this.$admobInfo, access13800Var);
            int i2 = IAuthTabCallback + 31;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 / 0;
            }
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                IAuthTabCallback(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i3 = onNavigationEvent + 1;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 63 / 0;
            }
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onNavigationEvent + 105;
                int i6 = i5 % 128;
                IAuthTabCallback = i6;
                int i7 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = i6 + 121;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    ((kotlin.Result) obj).onNavigationEvent();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
                objOnWarmupCompleted = ((kotlin.Result) obj).onNavigationEvent();
            } else {
                ResultKt.onNavigationEvent(obj);
                getPivotX getpivotx = getPivotX.onExtraCallback;
                AppCompatActivity appCompatActivity = (AppCompatActivity) setTrimPathEnd.onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -354126174, forceDomainCheck.IAuthTabCallback(), 354126178, new Object[]{setTrimPathEnd.this});
                this.label = 1;
                objOnWarmupCompleted = getpivotx.onWarmupCompleted(appCompatActivity, this);
                if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                    return objOnWarmupCompleted2;
                }
            }
            setTrimPathEnd settrimpathend = setTrimPathEnd.this;
            Throwable th = kotlin.Result.exceptionOrNull-impl(objOnWarmupCompleted);
            if (th != null) {
                setTrimPathEnd.onExtraCallbackWithResult(settrimpathend, (AdError) setTrimPathEnd.onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1578927425, forceDomainCheck.IAuthTabCallback(), 1578927425, new Object[]{settrimpathend, th}));
                return Unit.INSTANCE;
            }
            if (setTrimPathEnd.IAuthTabCallbackDefault(setTrimPathEnd.this)) {
                return Unit.INSTANCE;
            }
            int i9 = IAuthTabCallback.onExtraCallback[this.$format.ordinal()];
            if (i9 == 1) {
                setTrimPathEnd.onExtraCallbackWithResult(setTrimPathEnd.this, this.$admobInfo);
            } else if (i9 == 2) {
                setTrimPathEnd.onWarmupCompleted(setTrimPathEnd.this, this.$admobInfo);
            }
            Unit unit = Unit.INSTANCE;
            int i10 = IAuthTabCallback + 61;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            return unit;
        }
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        if (this.access000) {
            return;
        }
        this.access000 = true;
        getPackageType getpackagetype = this.onWarmupCompleted;
        if (getpackagetype != null) {
            int i2 = readTypedObject + 67;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
        }
        this.onWarmupCompleted = null;
        getPackageType getpackagetype2 = this.IAuthTabCallback_Parcel;
        if (getpackagetype2 != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype2, (CancellationException) null, 1, (Object) null);
        }
        this.IAuthTabCallback_Parcel = null;
        String str = this.IAuthTabCallbackStubProxy;
        if (str != null) {
            try {
                Result.Companion companion = kotlin.Result.Companion;
                kotlin.Result.constructor-impl(Boolean.valueOf(InterstitialAdPreloader.destroy(str)));
            } catch (Throwable th) {
                Result.Companion companion2 = kotlin.Result.Companion;
                kotlin.Result.constructor-impl(ResultKt.createFailure(th));
            }
            this.IAuthTabCallbackStubProxy = null;
        }
        String str2 = this.ICustomTabsCallback;
        if (str2 != null) {
            try {
                Result.Companion companion3 = kotlin.Result.Companion;
                kotlin.Result.constructor-impl(Boolean.valueOf(RewardedAdPreloader.destroy(str2)));
            } catch (Throwable th2) {
                Result.Companion companion4 = kotlin.Result.Companion;
                kotlin.Result.constructor-impl(ResultKt.createFailure(th2));
            }
            this.ICustomTabsCallback = null;
            int i4 = readTypedObject + 29;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* renamed from: o.setTrimPathEnd$onTransact$onExtraCallback, reason: case insensitive filesystem */
    static final class C0067onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ NativeAdsDto.AdmobInfo $admobInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0067onExtraCallback(NativeAdsDto.AdmobInfo admobInfo, access13800<? super C0067onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$admobInfo = admobInfo;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            C0067onExtraCallback c0067onExtraCallback = setTrimPathEnd.this.new C0067onExtraCallback(this.$admobInfo, access13800Var);
            int i2 = onWarmupCompleted + 63;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return c0067onExtraCallback;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 73;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 17 / 0;
            }
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            C0067onExtraCallback c0067onExtraCallbackCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                c0067onExtraCallbackCreate.invokeSuspend(Unit.INSTANCE);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = c0067onExtraCallbackCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 77;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                setTrimPathEnd settrimpathend = setTrimPathEnd.this;
                NativeAdsDto.AdmobInfo admobInfo = this.$admobInfo;
                this.label = 1;
                if (setTrimPathEnd.IAuthTabCallback(settrimpathend, admobInfo, (access13800) this) == objOnWarmupCompleted) {
                    int i3 = onWarmupCompleted + 105;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i4 = onNavigationEvent + 79;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    private final void onNavigationEvent(NativeAdsDto.AdmobInfo admobInfo) {
        Object obj;
        int i = 2 % 2;
        try {
            Result.Companion companion = kotlin.Result.Companion;
            InterstitialAd.load(this.onNavigationEvent, admobInfo.onNavigationEvent(), setStrokeWidth.onNavigationEvent(setStrokeWidth.onExtraCallback, admobInfo, false, 2, null), new onTransact(this, admobInfo));
            obj = kotlin.Result.constructor-impl(Unit.INSTANCE);
            int i2 = extraCallbackWithResult + 37;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            int i4 = extraCallbackWithResult + 65;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            AdError adErrorOnWarmupCompleted = onWarmupCompleted(th2);
            if (i5 != 0) {
                onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1146586069, forceDomainCheck.IAuthTabCallback(), 1146586070, new Object[]{this, adErrorOnWarmupCompleted});
                return;
            }
            onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1146586069, forceDomainCheck.IAuthTabCallback(), 1146586070, new Object[]{this, adErrorOnWarmupCompleted});
            int i6 = 8 / 0;
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ NativeAdsDto.AdmobInfo $admobInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(NativeAdsDto.AdmobInfo admobInfo, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$admobInfo = admobInfo;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = setTrimPathEnd.this.new onExtraCallback(this.$admobInfo, access13800Var);
            int i2 = IAuthTabCallback + 101;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 79 / 0;
            }
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 7;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 28 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 13;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = IAuthTabCallback + 85;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i7 = IAuthTabCallback + 107;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                setTrimPathEnd settrimpathend = setTrimPathEnd.this;
                NativeAdsDto.AdmobInfo admobInfo = this.$admobInfo;
                this.label = 1;
                if (setTrimPathEnd.onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 116087306, forceDomainCheck.IAuthTabCallback(), -116087297, new Object[]{settrimpathend, admobInfo, this}) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final void onExtraCallback(NativeAdsDto.AdmobInfo admobInfo) {
        Object obj;
        int i = 2 % 2;
        try {
            Result.Companion companion = kotlin.Result.Companion;
            RewardedAd.load(this.onNavigationEvent, admobInfo.onNavigationEvent(), setStrokeWidth.onNavigationEvent(setStrokeWidth.onExtraCallback, admobInfo, false, 2, null), new IAuthTabCallbackDefault(this, admobInfo));
            obj = kotlin.Result.constructor-impl(Unit.INSTANCE);
            int i2 = extraCallbackWithResult + 5;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            int i4 = readTypedObject + 101;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1146586069, forceDomainCheck.IAuthTabCallback(), 1146586070, new Object[]{this, onWarmupCompleted(th2)});
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final AdError onWarmupCompleted(Throwable th) {
        String message;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 3;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        if (th != null) {
            int i5 = i3 + 31;
            extraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            message = th.getMessage();
            if (message == null) {
                message = "AdMob is unavailable";
            }
        }
        return new AdError(0, message, "MobileAds");
    }

    static final class access000 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ EventType $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access000(EventType eventType, access13800<? super access000> access13800Var) {
            super(2, access13800Var);
            this.$event = eventType;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access000 access000Var = setTrimPathEnd.this.new access000(this.$event, access13800Var);
            int i2 = IAuthTabCallback + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return access000Var;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 41;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 21;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            access000 access000VarCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return access000VarCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 4 / 0;
            return access000VarCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = IAuthTabCallback + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            setTrimPathEnd.onWarmupCompleted(setTrimPathEnd.this).onWarmupCompleted(setTrimPathEnd.onExtraCallbackWithResult(setTrimPathEnd.this, this.$event, null, null, 6, null));
            NativeAdsManager.onWarmupCompleted(setTrimPathEnd.asBinder(setTrimPathEnd.this), setTrimPathEnd.IAuthTabCallbackStub(setTrimPathEnd.this), setTrimPathEnd.onExtraCallback(setTrimPathEnd.this), this.$event.name(), null, 8, null);
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 23;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    private final void onWarmupCompleted(EventType eventType) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(this.asInterface, (CoroutineContext) null, (setRandomHost) null, new access000(eventType, null), 3, (Object) null);
        int i2 = extraCallbackWithResult + 27;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 32 / 0;
        }
    }

    static final class IAuthTabCallback_Parcel extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ RewardedAd $ad;
        final /* synthetic */ EventType $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback_Parcel(EventType eventType, RewardedAd rewardedAd, access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(2, access13800Var);
            this.$event = eventType;
            this.$ad = rewardedAd;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback_Parcel iAuthTabCallback_Parcel = setTrimPathEnd.this.new IAuthTabCallback_Parcel(this.$event, this.$ad, access13800Var);
            int i2 = IAuthTabCallback + 59;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallback_Parcel;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 67;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 27;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 87 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = i3 + 3;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.onNavigationEvent(obj);
            calculatePageOffsets calculatepageoffsetsOnWarmupCompleted = setTrimPathEnd.onWarmupCompleted(setTrimPathEnd.this);
            setTrimPathEnd settrimpathend = setTrimPathEnd.this;
            EventType eventType = this.$event;
            ExposureContent.Companion companion = ExposureContent.Companion;
            calculatepageoffsetsOnWarmupCompleted.onWarmupCompleted(setTrimPathEnd.onExtraCallbackWithResult(settrimpathend, eventType, companion.IAuthTabCallback(this.$ad), setTrimPathEnd.onNavigationEvent(setTrimPathEnd.this, this.$ad.getResponseInfo(), "REWARDED")));
            setTrimPathEnd.asBinder(setTrimPathEnd.this).onExtraCallback(setTrimPathEnd.IAuthTabCallbackStub(setTrimPathEnd.this), setTrimPathEnd.onExtraCallback(setTrimPathEnd.this), this.$event.name(), companion.IAuthTabCallback(this.$ad));
            return Unit.INSTANCE;
        }
    }

    private final void onExtraCallback(EventType eventType, RewardedAd rewardedAd) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(this.asInterface, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback_Parcel(eventType, rewardedAd, null), 3, (Object) null);
        int i2 = readTypedObject + 119;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class getInterfaceDescriptor extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ RewardedAd $ad;
        final /* synthetic */ ExposureContent $content;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        getInterfaceDescriptor(ExposureContent exposureContent, RewardedAd rewardedAd, access13800<? super getInterfaceDescriptor> access13800Var) {
            super(2, access13800Var);
            this.$content = exposureContent;
            this.$ad = rewardedAd;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getInterfaceDescriptor getinterfacedescriptorCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                getinterfacedescriptorCreate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = getinterfacedescriptorCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 123;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            getInterfaceDescriptor getinterfacedescriptor = setTrimPathEnd.this.new getInterfaceDescriptor(this.$content, this.$ad, access13800Var);
            int i2 = onExtraCallback + 83;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return getinterfacedescriptor;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 77;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = i3 + 53;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.onNavigationEvent(obj);
            calculatePageOffsets calculatepageoffsetsOnWarmupCompleted = setTrimPathEnd.onWarmupCompleted(setTrimPathEnd.this);
            setTrimPathEnd settrimpathend = setTrimPathEnd.this;
            calculatepageoffsetsOnWarmupCompleted.onWarmupCompleted(setTrimPathEnd.onExtraCallbackWithResult(settrimpathend, EventType.PAID, this.$content, setTrimPathEnd.onNavigationEvent(settrimpathend, this.$ad.getResponseInfo(), "REWARDED")));
            setTrimPathEnd.asBinder(setTrimPathEnd.this).onExtraCallback(setTrimPathEnd.IAuthTabCallbackStub(setTrimPathEnd.this), setTrimPathEnd.onExtraCallback(setTrimPathEnd.this), "PAID", this.$content);
            Unit unit = Unit.INSTANCE;
            int i6 = onExtraCallback + 107;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 90 / 0;
            }
            return unit;
        }
    }

    private final void onWarmupCompleted(RewardedAd rewardedAd, ExposureContent exposureContent) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(this.asInterface, (CoroutineContext) null, (setRandomHost) null, new getInterfaceDescriptor(exposureContent, rewardedAd, null), 3, (Object) null);
        int i2 = extraCallbackWithResult + 61;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class IAuthTabCallbackStubProxy extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ InterstitialAd $ad;
        final /* synthetic */ EventType $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStubProxy(EventType eventType, InterstitialAd interstitialAd, access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(2, access13800Var);
            this.$event = eventType;
            this.$ad = interstitialAd;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = setTrimPathEnd.this.new IAuthTabCallbackStubProxy(this.$event, this.$ad, access13800Var);
            int i2 = onExtraCallback + 11;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackStubProxy;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 9;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 97;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 47;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 67;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            calculatePageOffsets calculatepageoffsetsOnWarmupCompleted = setTrimPathEnd.onWarmupCompleted(setTrimPathEnd.this);
            setTrimPathEnd settrimpathend = setTrimPathEnd.this;
            EventType eventType = this.$event;
            ExposureContent.Companion companion = ExposureContent.Companion;
            calculatepageoffsetsOnWarmupCompleted.onWarmupCompleted(setTrimPathEnd.onExtraCallbackWithResult(settrimpathend, eventType, companion.IAuthTabCallback(this.$ad), setTrimPathEnd.onNavigationEvent(setTrimPathEnd.this, this.$ad.getResponseInfo(), "INTERSTITIAL")));
            setTrimPathEnd.asBinder(setTrimPathEnd.this).onExtraCallback(setTrimPathEnd.IAuthTabCallbackStub(setTrimPathEnd.this), setTrimPathEnd.onExtraCallback(setTrimPathEnd.this), this.$event.name(), companion.IAuthTabCallback(this.$ad));
            Unit unit = Unit.INSTANCE;
            int i7 = onExtraCallback + 37;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0) {
                return unit;
            }
            throw null;
        }
    }

    static final class access100 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ InterstitialAd $ad;
        final /* synthetic */ ExposureContent $content;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access100(ExposureContent exposureContent, InterstitialAd interstitialAd, access13800<? super access100> access13800Var) {
            super(2, access13800Var);
            this.$content = exposureContent;
            this.$ad = interstitialAd;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access100 access100Var = setTrimPathEnd.this.new access100(this.$content, this.$ad, access13800Var);
            int i2 = onExtraCallback + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return access100Var;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 45;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 77;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 26 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            access100 access100VarCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                access100VarCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = access100VarCreate.invokeSuspend(unit);
            int i4 = onExtraCallback + 63;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x005f, code lost:
        
            return kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r5.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r5.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            r1 = r1 + 61;
            o.setTrimPathEnd.access100.onExtraCallbackWithResult = r1 % 128;
            r1 = r1 % 2;
            kotlin.ResultKt.onNavigationEvent(r6);
            r6 = o.setTrimPathEnd.onWarmupCompleted(r5.this$0);
            r0 = r5.this$0;
            r6.onWarmupCompleted(o.setTrimPathEnd.onExtraCallbackWithResult(r0, im.toss.ads_sdk.remote.model.EventType.PAID, r5.$content, o.setTrimPathEnd.onNavigationEvent(r0, r5.$ad.getResponseInfo(), "INTERSTITIAL")));
            o.setTrimPathEnd.asBinder(r5.this$0).onExtraCallback(o.setTrimPathEnd.IAuthTabCallbackStub(r5.this$0), o.setTrimPathEnd.onExtraCallback(r5.this$0), "PAID", r5.$content);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 9;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 96 / 0;
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        setTrimPathEnd settrimpathend = (setTrimPathEnd) objArr[0];
        InterstitialAd interstitialAd = (InterstitialAd) objArr[1];
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(settrimpathend.asInterface, (CoroutineContext) null, (setRandomHost) null, settrimpathend.new access100((ExposureContent) objArr[2], interstitialAd, null), 3, (Object) null);
        int i2 = readTypedObject + 95;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 50 / 0;
        }
        return null;
    }

    private final void onExtraCallbackWithResult(final RewardedAd rewardedAd) {
        int i = 2 % 2;
        rewardedAd.setOnPaidEventListener(new OnPaidEventListener() { // from class: im.toss.ads_sdk.admob.AdmobController$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final void onPaidEvent(AdValue adValue) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 61;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    setTrimPathEnd.onWarmupCompleted(this.f$0, rewardedAd, adValue);
                    int i4 = 12 / 0;
                } else {
                    setTrimPathEnd.onWarmupCompleted(this.f$0, rewardedAd, adValue);
                }
                int i5 = IAuthTabCallback + 81;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = extraCallbackWithResult + 25;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(setTrimPathEnd settrimpathend, RewardedAd rewardedAd, AdValue adValue) {
        int i = 2 % 2;
        int i2 = readTypedObject + 65;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(adValue, "");
        settrimpathend.onWarmupCompleted(rewardedAd, ExposureContent.Companion.onNavigationEvent(rewardedAd, adValue));
        int i4 = extraCallbackWithResult + 79;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void onWarmupCompleted(final InterstitialAd interstitialAd) {
        int i = 2 % 2;
        interstitialAd.setOnPaidEventListener(new OnPaidEventListener() { // from class: im.toss.ads_sdk.admob.AdmobController$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final void onPaidEvent(AdValue adValue) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 33;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                setTrimPathEnd settrimpathend = this.f$0;
                if (i4 != 0) {
                    setTrimPathEnd.onExtraCallback(settrimpathend, interstitialAd, adValue);
                } else {
                    setTrimPathEnd.onExtraCallback(settrimpathend, interstitialAd, adValue);
                    throw null;
                }
            }
        });
        int i2 = extraCallbackWithResult + 39;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void IAuthTabCallback(setTrimPathEnd settrimpathend, InterstitialAd interstitialAd, AdValue adValue) {
        int i = 2 % 2;
        int i2 = readTypedObject + 47;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(adValue, "");
        onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1008570211, forceDomainCheck.IAuthTabCallback(), 1008570222, new Object[]{settrimpathend, interstitialAd, ExposureContent.Companion.onExtraCallback(interstitialAd, adValue)});
        int i4 = extraCallbackWithResult + 125;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static /* synthetic */ CharSequence onExtraCallbackWithResult(setTrimPathEnd settrimpathend, EventType eventType, ExposureContent exposureContent, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = extraCallbackWithResult + 49;
            readTypedObject = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 56 / 0;
            }
            exposureContent = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        CharSequence charSequenceIAuthTabCallback = settrimpathend.IAuthTabCallback(eventType, exposureContent, str);
        int i5 = readTypedObject + 41;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return charSequenceIAuthTabCallback;
    }

    private final CharSequence IAuthTabCallback(EventType eventType, ExposureContent exposureContent, String str) {
        String strOnNavigationEvent;
        AdMobPaidAdValue adMobPaidAdValueIAuthTabCallback;
        int i = 2 % 2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str2 = "[ADMOB][" + eventType.name() + "] ";
        spannableStringBuilder.append((CharSequence) str2);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#8B95A1")), 0, str2.length(), 33);
        spannableStringBuilder.append((CharSequence) "space=").append((CharSequence) this.access100);
        spannableStringBuilder.append((CharSequence) " requestId=").append((CharSequence) this.onTransact.IAuthTabCallbackStub());
        SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append((CharSequence) " unitId=");
        NativeAdsDto.AdmobInfo admobInfoOnExtraCallbackWithResult = this.onTransact.onTransact().onNavigationEvent().onExtraCallbackWithResult();
        if (admobInfoOnExtraCallbackWithResult != null) {
            int i2 = readTypedObject + 9;
            extraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                strOnNavigationEvent = admobInfoOnExtraCallbackWithResult.onNavigationEvent();
                int i3 = 66 / 0;
            } else {
                strOnNavigationEvent = admobInfoOnExtraCallbackWithResult.onNavigationEvent();
            }
        } else {
            strOnNavigationEvent = null;
        }
        if (strOnNavigationEvent == null) {
            strOnNavigationEvent = "";
        }
        spannableStringBuilderAppend.append((CharSequence) strOnNavigationEvent);
        if (exposureContent != null) {
            int i4 = extraCallbackWithResult + 57;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            String strOnNavigationEvent2 = exposureContent.onNavigationEvent();
            if (strOnNavigationEvent2 != null) {
                int i6 = readTypedObject + 23;
                extraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    StringsKt.isBlank(strOnNavigationEvent2);
                    throw null;
                }
                if (StringsKt.isBlank(strOnNavigationEvent2)) {
                    strOnNavigationEvent2 = null;
                }
                if (strOnNavigationEvent2 != null) {
                    spannableStringBuilder.append((CharSequence) " responseId=").append((CharSequence) strOnNavigationEvent2);
                }
            }
        }
        if (exposureContent != null) {
            int i7 = readTypedObject + 101;
            extraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            String strOnWarmupCompleted = exposureContent.onWarmupCompleted();
            if (strOnWarmupCompleted != null) {
                if (StringsKt.isBlank(strOnWarmupCompleted)) {
                    strOnWarmupCompleted = null;
                }
                if (strOnWarmupCompleted != null) {
                    spannableStringBuilder.append((CharSequence) " source=").append((CharSequence) strOnWarmupCompleted);
                    int i9 = extraCallbackWithResult + 121;
                    readTypedObject = i9 % 128;
                    int i10 = i9 % 2;
                }
            }
        }
        if (exposureContent != null && (adMobPaidAdValueIAuthTabCallback = exposureContent.IAuthTabCallback()) != null) {
            SpannableStringBuilder spannableStringBuilderAppend2 = spannableStringBuilder.append((CharSequence) " valueMicros=");
            Long lOnExtraCallbackWithResult = adMobPaidAdValueIAuthTabCallback.onExtraCallbackWithResult();
            String strValueOf = lOnExtraCallbackWithResult != null ? String.valueOf(lOnExtraCallbackWithResult.longValue()) : null;
            spannableStringBuilderAppend2.append((CharSequence) (strValueOf != null ? strValueOf : ""));
            spannableStringBuilder.append((CharSequence) " currency=").append((CharSequence) adMobPaidAdValueIAuthTabCallback.IAuthTabCallback());
            spannableStringBuilder.append((CharSequence) " precision=").append((CharSequence) adMobPaidAdValueIAuthTabCallback.onWarmupCompleted());
        }
        if (str != null && !StringsKt.isBlank(str)) {
            spannableStringBuilder.append((CharSequence) " loadedContent=").append((CharSequence) str);
        }
        return spannableStringBuilder;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onTransact(Object[] objArr) throws JSONException {
        Object adSourceName;
        Object mediationAdapterClassName;
        List<AdapterResponseInfo> adapterResponses;
        ResponseInfo responseInfo = (ResponseInfo) objArr[1];
        Object obj = (String) objArr[2];
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adFormat", obj);
        JSONArray jSONArray = null;
        jSONObject.put("responseId", responseInfo != null ? responseInfo.getResponseId() : null);
        if (responseInfo != null) {
            int i2 = readTypedObject + 47;
            extraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                responseInfo.getLoadedAdapterResponseInfo();
                jSONArray.hashCode();
                throw null;
            }
            AdapterResponseInfo loadedAdapterResponseInfo = responseInfo.getLoadedAdapterResponseInfo();
            adSourceName = loadedAdapterResponseInfo != null ? loadedAdapterResponseInfo.getAdSourceName() : null;
        }
        jSONObject.put("adSourceName", adSourceName);
        if (responseInfo != null) {
            int i3 = extraCallbackWithResult + 53;
            readTypedObject = i3 % 128;
            if (i3 % 2 == 0) {
                mediationAdapterClassName = responseInfo.getMediationAdapterClassName();
                int i4 = 88 / 0;
            } else {
                mediationAdapterClassName = responseInfo.getMediationAdapterClassName();
            }
        } else {
            mediationAdapterClassName = null;
        }
        jSONObject.put("mediationAdapterClassName", mediationAdapterClassName);
        if (responseInfo != null && (adapterResponses = responseInfo.getAdapterResponses()) != null) {
            jSONArray = new JSONArray();
            for (AdapterResponseInfo adapterResponseInfo : adapterResponses) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("adSourceName", adapterResponseInfo.getAdSourceName());
                jSONObject2.put("adSourceId", adapterResponseInfo.getAdSourceId());
                jSONObject2.put("adSourceInstanceName", adapterResponseInfo.getAdSourceInstanceName());
                jSONObject2.put("adSourceInstanceId", adapterResponseInfo.getAdSourceInstanceId());
                jSONObject2.put("latencyMillis", adapterResponseInfo.getLatencyMillis());
                jSONArray.put(jSONObject2);
            }
        }
        jSONObject.put("adapterResponses", jSONArray);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i5 = readTypedObject + 99;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 29 / 0;
        }
        return string;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void onWarmupCompleted(@NotNull Activity activity, @NotNull final scrollToItem scrolltoitem, @NotNull NativeAdsDto.AdmobInfo admobInfo, @NotNull final setTrimPathOffset settrimpathoffset) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = readTypedObject + 9;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(scrolltoitem, "");
            Intrinsics.checkNotNullParameter(admobInfo, "");
            Intrinsics.checkNotNullParameter(settrimpathoffset, "");
            boolean z = scrolltoitem instanceof scrollToItem.onExtraCallbackWithResult;
            throw null;
        }
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(scrolltoitem, "");
        Intrinsics.checkNotNullParameter(admobInfo, "");
        Intrinsics.checkNotNullParameter(settrimpathoffset, "");
        if (scrolltoitem instanceof scrollToItem.onExtraCallbackWithResult) {
            int i3 = readTypedObject + 49;
            extraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            InterstitialAd interstitialAdOnExtraCallbackWithResult = ((scrollToItem.onExtraCallbackWithResult) scrolltoitem).onExtraCallbackWithResult();
            IAuthTabCallback(this, interstitialAdOnExtraCallbackWithResult, settrimpathoffset, false, 4, null);
            interstitialAdOnExtraCallbackWithResult.show(activity);
            return;
        }
        if (!(scrolltoitem instanceof scrollToItem.onWarmupCompleted)) {
            throw new NoWhenBranchMatchedException();
        }
        final RewardedAd rewardedAdOnExtraCallbackWithResult = ((scrollToItem.onWarmupCompleted) scrolltoitem).onExtraCallbackWithResult();
        onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -601713681, forceDomainCheck.IAuthTabCallback(), 601713691, new Object[]{this, rewardedAdOnExtraCallbackWithResult, settrimpathoffset, false, 4, null});
        rewardedAdOnExtraCallbackWithResult.show(activity, new OnUserEarnedRewardListener() { // from class: im.toss.ads_sdk.admob.AdmobController$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final void onUserEarnedReward(RewardItem rewardItem) {
                int i5 = 2 % 2;
                int i6 = onNavigationEvent + 47;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    setTrimPathEnd.IAuthTabCallback(this.f$0, rewardedAdOnExtraCallbackWithResult, settrimpathoffset, scrolltoitem, rewardItem);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                setTrimPathEnd.IAuthTabCallback(this.f$0, rewardedAdOnExtraCallbackWithResult, settrimpathoffset, scrolltoitem, rewardItem);
                int i7 = onNavigationEvent + 31;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 22 / 0;
                }
            }
        });
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        boolean z = false;
        setTrimPathEnd settrimpathend = (setTrimPathEnd) objArr[0];
        RewardedAd rewardedAd = (RewardedAd) objArr[1];
        setTrimPathOffset settrimpathoffset = (setTrimPathOffset) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int iIntValue = ((Number) objArr[4]).intValue();
        Object obj = objArr[5];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 83;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0 ? (iIntValue & 4) == 0 : (iIntValue & 3) == 0) {
            z = zBooleanValue;
        }
        settrimpathend.onNavigationEvent(rewardedAd, settrimpathoffset, z);
        int i3 = readTypedObject + 97;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    private final void onNavigationEvent(RewardedAd rewardedAd, setTrimPathOffset settrimpathoffset, boolean z) {
        int i = 2 % 2;
        rewardedAd.setFullScreenContentCallback(new onNavigationEvent(this, rewardedAd, z, settrimpathoffset));
        int i2 = readTypedObject + 109;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void IAuthTabCallback(setTrimPathEnd settrimpathend, InterstitialAd interstitialAd, setTrimPathOffset settrimpathoffset, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult;
        int i4 = i3 + 83;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0 ? (i & 4) != 0 : (i & 5) != 0) {
            int i5 = i3 + 109;
            readTypedObject = i5 % 128;
            z = i5 % 2 == 0;
        }
        onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 765188294, forceDomainCheck.IAuthTabCallback(), -765188292, new Object[]{settrimpathend, interstitialAd, settrimpathoffset, Boolean.valueOf(z)});
        int i6 = extraCallbackWithResult + 55;
        readTypedObject = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(Ref.BooleanRef booleanRef, maybeRemoveAttachStateListener<? super Unit> mayberemoveattachstatelistener, setTrimPathEnd settrimpathend, InterstitialAd interstitialAd, AdError adError) {
        int i = 2 % 2;
        int i2 = readTypedObject + 1;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if ((!booleanRef.element) && mayberemoveattachstatelistener.onNavigationEvent()) {
            booleanRef.element = true;
            if (interstitialAd != null) {
                if (settrimpathend.onWarmupCompleted()) {
                    return;
                }
                settrimpathend.onWarmupCompleted(interstitialAd);
                onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 2072704601, forceDomainCheck.IAuthTabCallback(), -2072704594, new Object[]{settrimpathend, EventType.LOAD, interstitialAd});
                maybeUpdateAnimatable.onNavigationEvent(onExtraCallbackWithResult(settrimpathend), putChannelInfo.onExtraCallback(), (setRandomHost) null, new writeTypedObject(null, settrimpathend, interstitialAd), 2, (Object) null);
                int i4 = extraCallbackWithResult + 3;
                readTypedObject = i4 % 128;
                int i5 = i4 % 2;
            } else if (adError != null) {
                settrimpathend.onWarmupCompleted(EventType.FAILED_TO_LOAD);
                maybeUpdateAnimatable.onNavigationEvent(onExtraCallbackWithResult(settrimpathend), putChannelInfo.onExtraCallback(), (setRandomHost) null, new extraCallback(null, settrimpathend, adError), 2, (Object) null);
            } else {
                AdError adError2 = new AdError(0, "ads exhausted", "");
                settrimpathend.onWarmupCompleted(EventType.FAILED_TO_LOAD);
                maybeUpdateAnimatable.onNavigationEvent(onExtraCallbackWithResult(settrimpathend), putChannelInfo.onExtraCallback(), (setRandomHost) null, new onMessageChannelReady(null, settrimpathend, adError2), 2, (Object) null);
            }
            Result.Companion companion = kotlin.Result.Companion;
            mayberemoveattachstatelistener.resumeWith(kotlin.Result.constructor-impl(Unit.INSTANCE));
        }
    }

    public static final class ICustomTabsCallback extends PreloadCallbackV2 {
        private static int asBinder = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ maybeRemoveAttachStateListener<Unit> IAuthTabCallback;
        final /* synthetic */ Ref.BooleanRef onExtraCallback;
        final /* synthetic */ setTrimPathEnd onExtraCallbackWithResult;
        final /* synthetic */ setTrimPathEnd onNavigationEvent;

        ICustomTabsCallback(Ref.BooleanRef booleanRef, setTrimPathEnd settrimpathend, maybeRemoveAttachStateListener<? super Unit> mayberemoveattachstatelistener, setTrimPathEnd settrimpathend2) {
            this.onExtraCallback = booleanRef;
            this.onNavigationEvent = settrimpathend;
            this.IAuthTabCallback = mayberemoveattachstatelistener;
            this.onExtraCallbackWithResult = settrimpathend2;
        }

        public void onAdPreloaded(String str, ResponseInfo responseInfo) {
            Object obj;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            if (this.onExtraCallback.element) {
                return;
            }
            int i2 = onWarmupCompleted + 59;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            try {
                Result.Companion companion = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(InterstitialAdPreloader.pollAd(str));
            } catch (Throwable th) {
                Result.Companion companion2 = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
            }
            setTrimPathEnd settrimpathend = this.onNavigationEvent;
            Ref.BooleanRef booleanRef = this.onExtraCallback;
            maybeRemoveAttachStateListener<Unit> mayberemoveattachstatelistener = this.IAuthTabCallback;
            setTrimPathEnd settrimpathend2 = this.onExtraCallbackWithResult;
            Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj);
            if (th2 == null) {
                setTrimPathEnd.onNavigationEvent(this.onExtraCallback, this.IAuthTabCallback, this.onExtraCallbackWithResult, (InterstitialAd) obj, null);
                return;
            }
            setTrimPathEnd.onNavigationEvent(booleanRef, mayberemoveattachstatelistener, settrimpathend2, null, (AdError) setTrimPathEnd.onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1578927425, forceDomainCheck.IAuthTabCallback(), 1578927425, new Object[]{settrimpathend, th2}));
            int i4 = asBinder + 27;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }

        public void onAdsExhausted(String str) {
            int i = 2 % 2;
            int i2 = asBinder + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            setTrimPathEnd.onNavigationEvent(this.onExtraCallback, this.IAuthTabCallback, this.onExtraCallbackWithResult, null, null);
            int i4 = onWarmupCompleted + 55;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }

        public void onAdFailedToPreload(String str, AdError adError) {
            int i = 2 % 2;
            int i2 = asBinder + 125;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(adError, "");
            setTrimPathEnd.onNavigationEvent(this.onExtraCallback, this.IAuthTabCallback, this.onExtraCallbackWithResult, null, adError);
            int i4 = asBinder + 75;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 71 / 0;
            }
        }
    }

    static final class extraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ NativeAdsDto.AdmobInfo $admobInfo;
        final /* synthetic */ maybeRemoveAttachStateListener<Unit> $continuation;
        final /* synthetic */ Ref.BooleanRef $finished;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ setTrimPathEnd this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        extraCallbackWithResult(Ref.BooleanRef booleanRef, NativeAdsDto.AdmobInfo admobInfo, setTrimPathEnd settrimpathend, maybeRemoveAttachStateListener<? super Unit> mayberemoveattachstatelistener, access13800<? super extraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$finished = booleanRef;
            this.$admobInfo = admobInfo;
            this.this$0 = settrimpathend;
            this.$continuation = mayberemoveattachstatelistener;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            extraCallbackWithResult extracallbackwithresult = new extraCallbackWithResult(this.$finished, this.$admobInfo, this.this$0, this.$continuation, access13800Var);
            extracallbackwithresult.L$0 = obj;
            int i2 = onExtraCallback + 3;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return extracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            onWarmupCompleted(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            extraCallbackWithResult extracallbackwithresultCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return extracallbackwithresultCreate.invokeSuspend(unit);
            }
            extracallbackwithresultCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            long jCurrentTimeMillis;
            Object obj2;
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            onExtraCallbackWithResult = i2 % 128;
            Object obj3 = null;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                obj3.hashCode();
                throw null;
            }
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 != 0) {
                int i4 = onExtraCallbackWithResult;
                int i5 = i4 + 21;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i7 = i4 + 109;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                jCurrentTimeMillis = this.J$0;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                jCurrentTimeMillis = System.currentTimeMillis() + setLogBuffers.asBinder(setTrimPathEnd.onExtraCallback());
            }
            while (findRes.onWarmupCompleted(findresandmsg)) {
                int i9 = onExtraCallbackWithResult + 31;
                onExtraCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    boolean z = this.$finished.element;
                    throw null;
                }
                if (this.$finished.element || System.currentTimeMillis() > jCurrentTimeMillis) {
                    break;
                }
                NativeAdsDto.AdmobInfo admobInfo = this.$admobInfo;
                try {
                    Result.Companion companion = kotlin.Result.Companion;
                    obj2 = kotlin.Result.constructor-impl(InterstitialAdPreloader.pollAd(admobInfo.onNavigationEvent()));
                } catch (Throwable th) {
                    Result.Companion companion2 = kotlin.Result.Companion;
                    obj2 = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
                }
                setTrimPathEnd settrimpathend = this.this$0;
                Ref.BooleanRef booleanRef = this.$finished;
                maybeRemoveAttachStateListener<Unit> mayberemoveattachstatelistener = this.$continuation;
                Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj2);
                if (th2 != null) {
                    setTrimPathEnd.onNavigationEvent(booleanRef, mayberemoveattachstatelistener, settrimpathend, null, (AdError) setTrimPathEnd.onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1578927425, forceDomainCheck.IAuthTabCallback(), 1578927425, new Object[]{settrimpathend, th2}));
                    return Unit.INSTANCE;
                }
                InterstitialAd interstitialAd = (InterstitialAd) obj2;
                if (interstitialAd != null) {
                    setTrimPathEnd.onNavigationEvent(this.$finished, this.$continuation, this.this$0, interstitialAd, null);
                    return Unit.INSTANCE;
                }
                long jOnExtraCallbackWithResult = setTrimPathEnd.onExtraCallbackWithResult();
                this.L$0 = findresandmsg;
                this.L$1 = access15400.onNavigationEvent(interstitialAd);
                this.J$0 = jCurrentTimeMillis;
                this.label = 1;
                if (formatMsgs.IAuthTabCallback(jOnExtraCallbackWithResult, this) == objOnWarmupCompleted) {
                    int i10 = onExtraCallbackWithResult + 7;
                    onExtraCallback = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 98 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            }
            Ref.BooleanRef booleanRef2 = this.$finished;
            if (!booleanRef2.element) {
                setTrimPathEnd.onNavigationEvent(booleanRef2, this.$continuation, this.this$0, null, null);
            }
            return Unit.INSTANCE;
        }
    }

    static final class readTypedObject implements Function1<Throwable, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ getPackageType onWarmupCompleted;

        readTypedObject(getPackageType getpackagetype) {
            this.onWarmupCompleted = getpackagetype;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 99;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent((Throwable) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                int i4 = 61 / 0;
            }
            int i5 = IAuthTabCallback + 59;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 32 / 0;
            }
            return unit;
        }

        public final void onNavigationEvent(Throwable th) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getPackageType.onWarmupCompleted.onWarmupCompleted(this.onWarmupCompleted, (CancellationException) null, 1, (Object) null);
            int i4 = IAuthTabCallback + 53;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i;
        int i2;
        Ref.BooleanRef booleanRef = (Ref.BooleanRef) objArr[0];
        maybeRemoveAttachStateListener mayberemoveattachstatelistener = (maybeRemoveAttachStateListener) objArr[1];
        setTrimPathEnd settrimpathend = (setTrimPathEnd) objArr[2];
        RewardedAd rewardedAd = (RewardedAd) objArr[3];
        AdError adError = (AdError) objArr[4];
        int i3 = 2 % 2;
        int i4 = readTypedObject + 25;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        if (!booleanRef.element && mayberemoveattachstatelistener.onNavigationEvent()) {
            booleanRef.element = true;
            if (rewardedAd != null) {
                if (!settrimpathend.onWarmupCompleted()) {
                    settrimpathend.onExtraCallbackWithResult(rewardedAd);
                    settrimpathend.onExtraCallback(EventType.LOAD, rewardedAd);
                    maybeUpdateAnimatable.onNavigationEvent(onExtraCallbackWithResult(settrimpathend), putChannelInfo.onExtraCallback(), (setRandomHost) null, new onActivityResized(null, settrimpathend, rewardedAd), 2, (Object) null);
                    i = readTypedObject + 117;
                    i2 = i % 128;
                }
            } else if (adError != null) {
                settrimpathend.onWarmupCompleted(EventType.FAILED_TO_LOAD);
                maybeUpdateAnimatable.onNavigationEvent(onExtraCallbackWithResult(settrimpathend), putChannelInfo.onExtraCallback(), (setRandomHost) null, new ICustomTabsCallbackStubProxy(null, settrimpathend, adError), 2, (Object) null);
                Result.Companion companion = kotlin.Result.Companion;
                mayberemoveattachstatelistener.resumeWith(kotlin.Result.constructor-impl(Unit.INSTANCE));
            } else {
                AdError adError2 = new AdError(0, "ads exhausted", "");
                settrimpathend.onWarmupCompleted(EventType.FAILED_TO_LOAD);
                maybeUpdateAnimatable.onNavigationEvent(onExtraCallbackWithResult(settrimpathend), putChannelInfo.onExtraCallback(), (setRandomHost) null, new ICustomTabsCallbackDefault(null, settrimpathend, adError2), 2, (Object) null);
                i = readTypedObject + 77;
                i2 = i % 128;
            }
            extraCallbackWithResult = i2;
            int i6 = i % 2;
            Result.Companion companion2 = kotlin.Result.Companion;
            mayberemoveattachstatelistener.resumeWith(kotlin.Result.constructor-impl(Unit.INSTANCE));
        }
        return null;
    }

    public static final class onMinimized extends PreloadCallbackV2 {
        private static int IAuthTabCallback = 0;
        private static int onTransact = 1;
        final /* synthetic */ setTrimPathEnd onExtraCallback;
        final /* synthetic */ maybeRemoveAttachStateListener<Unit> onExtraCallbackWithResult;
        final /* synthetic */ Ref.BooleanRef onNavigationEvent;
        final /* synthetic */ setTrimPathEnd onWarmupCompleted;

        onMinimized(Ref.BooleanRef booleanRef, setTrimPathEnd settrimpathend, maybeRemoveAttachStateListener<? super Unit> mayberemoveattachstatelistener, setTrimPathEnd settrimpathend2) {
            this.onNavigationEvent = booleanRef;
            this.onWarmupCompleted = settrimpathend;
            this.onExtraCallbackWithResult = mayberemoveattachstatelistener;
            this.onExtraCallback = settrimpathend2;
        }

        public void onAdPreloaded(String str, ResponseInfo responseInfo) {
            Object obj;
            int i = 2 % 2;
            int i2 = onTransact + 121;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                boolean z = this.onNavigationEvent.element;
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            if (!this.onNavigationEvent.element) {
                try {
                    Result.Companion companion = kotlin.Result.Companion;
                    obj = kotlin.Result.constructor-impl(RewardedAdPreloader.pollAd(str));
                } catch (Throwable th) {
                    Result.Companion companion2 = kotlin.Result.Companion;
                    obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
                }
                setTrimPathEnd settrimpathend = this.onWarmupCompleted;
                Ref.BooleanRef booleanRef = this.onNavigationEvent;
                maybeRemoveAttachStateListener<Unit> mayberemoveattachstatelistener = this.onExtraCallbackWithResult;
                setTrimPathEnd settrimpathend2 = this.onExtraCallback;
                Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj);
                if (th2 != null) {
                    setTrimPathEnd.onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 1218472532, forceDomainCheck.IAuthTabCallback(), -1218472529, new Object[]{booleanRef, mayberemoveattachstatelistener, settrimpathend2, null, (AdError) setTrimPathEnd.onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1578927425, forceDomainCheck.IAuthTabCallback(), 1578927425, new Object[]{settrimpathend, th2})});
                    return;
                }
                int i3 = onTransact + 59;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    setTrimPathEnd.onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 1218472532, forceDomainCheck.IAuthTabCallback(), -1218472529, new Object[]{this.onNavigationEvent, this.onExtraCallbackWithResult, this.onExtraCallback, (RewardedAd) obj, null});
                    return;
                }
                setTrimPathEnd.onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 1218472532, forceDomainCheck.IAuthTabCallback(), -1218472529, new Object[]{this.onNavigationEvent, this.onExtraCallbackWithResult, this.onExtraCallback, (RewardedAd) obj, null});
                int i4 = 68 / 0;
            }
        }

        public void onAdsExhausted(String str) {
            int i = 2 % 2;
            int i2 = onTransact + 121;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                setTrimPathEnd.onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 1218472532, forceDomainCheck.IAuthTabCallback(), -1218472529, new Object[]{this.onNavigationEvent, this.onExtraCallbackWithResult, this.onExtraCallback, null, null});
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            setTrimPathEnd.onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 1218472532, forceDomainCheck.IAuthTabCallback(), -1218472529, new Object[]{this.onNavigationEvent, this.onExtraCallbackWithResult, this.onExtraCallback, null, null});
            int i3 = onTransact + 21;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public void onAdFailedToPreload(String str, AdError adError) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(adError, "");
            Object obj = null;
            setTrimPathEnd.onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 1218472532, forceDomainCheck.IAuthTabCallback(), -1218472529, new Object[]{this.onNavigationEvent, this.onExtraCallbackWithResult, this.onExtraCallback, null, adError});
            int i4 = IAuthTabCallback + 111;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    static final class onActivityLayout extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ NativeAdsDto.AdmobInfo $admobInfo;
        final /* synthetic */ maybeRemoveAttachStateListener<Unit> $continuation;
        final /* synthetic */ Ref.BooleanRef $finished;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ setTrimPathEnd this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onActivityLayout(Ref.BooleanRef booleanRef, NativeAdsDto.AdmobInfo admobInfo, setTrimPathEnd settrimpathend, maybeRemoveAttachStateListener<? super Unit> mayberemoveattachstatelistener, access13800<? super onActivityLayout> access13800Var) {
            super(2, access13800Var);
            this.$finished = booleanRef;
            this.$admobInfo = admobInfo;
            this.this$0 = settrimpathend;
            this.$continuation = mayberemoveattachstatelistener;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onActivityLayout onactivitylayout = new onActivityLayout(this.$finished, this.$admobInfo, this.this$0, this.$continuation, access13800Var);
            onactivitylayout.L$0 = obj;
            int i2 = IAuthTabCallback + 123;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onactivitylayout;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = onNavigationEvent + 65;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 35 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onActivityLayout onactivitylayoutCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return onactivitylayoutCreate.invokeSuspend(unit);
            }
            onactivitylayoutCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            long jCurrentTimeMillis;
            Object obj2;
            int i = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                jCurrentTimeMillis = System.currentTimeMillis() + setLogBuffers.asBinder(setTrimPathEnd.onExtraCallback());
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jCurrentTimeMillis = this.J$0;
                ResultKt.onNavigationEvent(obj);
            }
            while (!(!findRes.onWarmupCompleted(findresandmsg)) && !this.$finished.element) {
                int i3 = IAuthTabCallback + 71;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                if (System.currentTimeMillis() > jCurrentTimeMillis) {
                    break;
                }
                int i5 = onNavigationEvent + 17;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                NativeAdsDto.AdmobInfo admobInfo = this.$admobInfo;
                try {
                    Result.Companion companion = kotlin.Result.Companion;
                    obj2 = kotlin.Result.constructor-impl(RewardedAdPreloader.pollAd(admobInfo.onNavigationEvent()));
                } catch (Throwable th) {
                    Result.Companion companion2 = kotlin.Result.Companion;
                    obj2 = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
                }
                setTrimPathEnd settrimpathend = this.this$0;
                Ref.BooleanRef booleanRef = this.$finished;
                maybeRemoveAttachStateListener<Unit> mayberemoveattachstatelistener = this.$continuation;
                Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj2);
                if (th2 != null) {
                    setTrimPathEnd.onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 1218472532, forceDomainCheck.IAuthTabCallback(), -1218472529, new Object[]{booleanRef, mayberemoveattachstatelistener, settrimpathend, null, (AdError) setTrimPathEnd.onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1578927425, forceDomainCheck.IAuthTabCallback(), 1578927425, new Object[]{settrimpathend, th2})});
                    return Unit.INSTANCE;
                }
                RewardedAd rewardedAd = (RewardedAd) obj2;
                if (rewardedAd != null) {
                    setTrimPathEnd.onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 1218472532, forceDomainCheck.IAuthTabCallback(), -1218472529, new Object[]{this.$finished, this.$continuation, this.this$0, rewardedAd, null});
                    return Unit.INSTANCE;
                }
                long jOnExtraCallbackWithResult = setTrimPathEnd.onExtraCallbackWithResult();
                this.L$0 = findresandmsg;
                this.L$1 = access15400.onNavigationEvent(rewardedAd);
                this.J$0 = jCurrentTimeMillis;
                this.label = 1;
                if (formatMsgs.IAuthTabCallback(jOnExtraCallbackWithResult, this) == objOnWarmupCompleted) {
                    int i7 = onNavigationEvent + 87;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    return objOnWarmupCompleted;
                }
            }
            Ref.BooleanRef booleanRef2 = this.$finished;
            if (!booleanRef2.element) {
                setTrimPathEnd.onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 1218472532, forceDomainCheck.IAuthTabCallback(), -1218472529, new Object[]{booleanRef2, this.$continuation, this.this$0, null, null});
            }
            return Unit.INSTANCE;
        }
    }

    static final class onPostMessage implements Function1<Throwable, Unit> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ getPackageType onExtraCallbackWithResult;

        onPostMessage(getPackageType getpackagetype) {
            this.onExtraCallbackWithResult = getpackagetype;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult((Throwable) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                int i4 = 44 / 0;
            }
            int i5 = onWarmupCompleted + 31;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        public final void onExtraCallbackWithResult(Throwable th) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getPackageType.onWarmupCompleted.onWarmupCompleted(this.onExtraCallbackWithResult, (CancellationException) null, 1, (Object) null);
            int i4 = onWarmupCompleted + 63;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final PreloadConfiguration onWarmupCompleted(NativeAdsDto.AdmobInfo admobInfo) throws Throwable {
        int i = 2 % 2;
        Integer num = null;
        PreloadConfiguration.Builder adRequest = new PreloadConfiguration.Builder(admobInfo.onNavigationEvent()).setAdRequest(setStrokeWidth.onNavigationEvent(setStrokeWidth.onExtraCallback, admobInfo, false, 2, null));
        Integer num2 = this.getInterfaceDescriptor;
        if (num2 != null) {
            int i2 = readTypedObject + 23;
            extraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 87 / 0;
                if (num2.intValue() > 0) {
                    int i4 = extraCallbackWithResult + 73;
                    readTypedObject = i4 % 128;
                    int i5 = i4 % 2;
                    num = num2;
                }
                if (num != null) {
                    adRequest.setBufferSize(num.intValue());
                }
            } else {
                if (num2.intValue() > 0) {
                }
                if (num != null) {
                }
            }
        }
        PreloadConfiguration preloadConfigurationBuild = adRequest.build();
        Intrinsics.checkNotNullExpressionValue(preloadConfigurationBuild, "");
        return preloadConfigurationBuild;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new IAuthTabCallback(defaultConstructorMarker);
        setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
        onExtraCallbackWithResult = setCommandLine.onWarmupCompleted(5, setRevision.SECONDS);
        IAuthTabCallback = setCommandLine.onWarmupCompleted(500, setRevision.MILLISECONDS);
        int i = onActivityLayout + 69;
        onActivityResized = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r1 != im.toss.ads_sdk.NativeAdsManager.IAuthTabCallbackStubProxy.NONE) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r1 = o.setTrimPathEnd.extraCallbackWithResult + 23;
        o.setTrimPathEnd.readTypedObject = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r1 != im.toss.ads_sdk.NativeAdsManager.IAuthTabCallbackStubProxy.NONE) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean onWarmupCompleted() {
        int i = 2 % 2;
        NativeAdsManager.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = this.extraCallback;
        if (iAuthTabCallbackStubProxy != NativeAdsManager.IAuthTabCallbackStubProxy.TOSSAD) {
            int i2 = extraCallbackWithResult + 67;
            readTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 11 / 0;
            }
        }
        onWarmupCompleted(EventType.FAILED_TO_LOAD);
        maybeUpdateAnimatable.onNavigationEvent(onExtraCallbackWithResult(this), putChannelInfo.onExtraCallback(), (setRandomHost) null, new C0066onExtraCallback(null, this), 2, (Object) null);
        return true;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        setTrimPathEnd settrimpathend = (setTrimPathEnd) objArr[0];
        AdError adError = (AdError) objArr[1];
        int i = 2 % 2;
        settrimpathend.onWarmupCompleted(EventType.FAILED_TO_LOAD);
        maybeUpdateAnimatable.onNavigationEvent(onExtraCallbackWithResult(settrimpathend), putChannelInfo.onExtraCallback(), (setRandomHost) null, new IAuthTabCallbackStub(null, settrimpathend, adError), 2, (Object) null);
        int i2 = readTypedObject + 39;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 17 / 0;
        }
        return null;
    }

    private final Object IAuthTabCallback(NativeAdsDto.AdmobInfo admobInfo, access13800<? super Unit> access13800Var) throws Throwable {
        Object obj;
        int i = 2 % 2;
        setResourceInternal setresourceinternal = new setResourceInternal(access14300.onWarmupCompleted(access13800Var), 1);
        setresourceinternal.onTransact();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        PreloadConfiguration preloadConfigurationIAuthTabCallback = IAuthTabCallback(this, admobInfo);
        try {
            Result.Companion companion = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(access14000.onNavigationEvent(InterstitialAdPreloader.start(admobInfo.onNavigationEvent(), preloadConfigurationIAuthTabCallback, new ICustomTabsCallback(booleanRef, this, setresourceinternal, this))));
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj);
        if (th2 == null) {
            int i2 = extraCallbackWithResult + 85;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            if (((Boolean) obj).booleanValue()) {
                int i4 = readTypedObject + 25;
                extraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                onNavigationEvent(this, admobInfo.onNavigationEvent());
            } else {
                setresourceinternal.IAuthTabCallback(new readTypedObject(maybeUpdateAnimatable.onNavigationEvent(findRes.onWarmupCompleted(setresourceinternal.getContext()), (CoroutineContext) null, (setRandomHost) null, new extraCallbackWithResult(booleanRef, admobInfo, this, setresourceinternal, null), 3, (Object) null)));
            }
        } else {
            onNavigationEvent(booleanRef, setresourceinternal, this, null, (AdError) onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1578927425, forceDomainCheck.IAuthTabCallback(), 1578927425, new Object[]{this, th2}));
            int i6 = extraCallbackWithResult + 97;
            readTypedObject = i6 % 128;
            int i7 = i6 % 2;
        }
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14300.onWarmupCompleted()) {
            access14600.IAuthTabCallback(access13800Var);
        }
        if (objIAuthTabCallbackDefault != access14300.onWarmupCompleted()) {
            return Unit.INSTANCE;
        }
        int i8 = readTypedObject + 91;
        extraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return objIAuthTabCallbackDefault;
    }

    private final Object onWarmupCompleted(NativeAdsDto.AdmobInfo admobInfo, access13800<? super Unit> access13800Var) throws Throwable {
        Object obj;
        int i = 2 % 2;
        setResourceInternal setresourceinternal = new setResourceInternal(access14300.onWarmupCompleted(access13800Var), 1);
        setresourceinternal.onTransact();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        PreloadConfiguration preloadConfigurationIAuthTabCallback = IAuthTabCallback(this, admobInfo);
        try {
            Result.Companion companion = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(access14000.onNavigationEvent(RewardedAdPreloader.start(admobInfo.onNavigationEvent(), preloadConfigurationIAuthTabCallback, new onMinimized(booleanRef, this, setresourceinternal, this))));
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj);
        Object obj2 = null;
        if (th2 != null) {
            onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 1218472532, forceDomainCheck.IAuthTabCallback(), -1218472529, new Object[]{booleanRef, setresourceinternal, this, null, (AdError) onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1578927425, forceDomainCheck.IAuthTabCallback(), 1578927425, new Object[]{this, th2})});
        } else if (((Boolean) obj).booleanValue()) {
            int i2 = extraCallbackWithResult + 115;
            readTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                onWarmupCompleted(this, admobInfo.onNavigationEvent());
                obj2.hashCode();
                throw null;
            }
            onWarmupCompleted(this, admobInfo.onNavigationEvent());
        } else {
            setresourceinternal.IAuthTabCallback(new onPostMessage(maybeUpdateAnimatable.onNavigationEvent(findRes.onWarmupCompleted(setresourceinternal.getContext()), (CoroutineContext) null, (setRandomHost) null, new onActivityLayout(booleanRef, admobInfo, this, setresourceinternal, null), 3, (Object) null)));
            int i3 = extraCallbackWithResult + 101;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
        }
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14300.onWarmupCompleted()) {
            access14600.IAuthTabCallback(access13800Var);
        }
        if (objIAuthTabCallbackDefault != access14300.onWarmupCompleted()) {
            return Unit.INSTANCE;
        }
        int i5 = readTypedObject + 109;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 5 / 0;
        }
        return objIAuthTabCallbackDefault;
    }

    private static final void onExtraCallbackWithResult(setTrimPathEnd settrimpathend, RewardedAd rewardedAd, setTrimPathOffset settrimpathoffset, scrollToItem scrolltoitem, RewardItem rewardItem) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rewardItem, "");
        settrimpathend.onExtraCallback(EventType.EARNED_REWARD, rewardedAd);
        maybeUpdateAnimatable.onNavigationEvent(onExtraCallbackWithResult(settrimpathend), putChannelInfo.onExtraCallback(), (setRandomHost) null, new asInterface(null, settrimpathoffset, scrolltoitem), 2, (Object) null);
        int i2 = extraCallbackWithResult + 79;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final /* synthetic */ AdError onExtraCallback(setTrimPathEnd settrimpathend, Throwable th) {
        return (AdError) onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1578927425, forceDomainCheck.IAuthTabCallback(), 1578927425, new Object[]{settrimpathend, th});
    }

    public static final /* synthetic */ AppCompatActivity IAuthTabCallback(setTrimPathEnd settrimpathend) {
        return (AppCompatActivity) onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -354126174, forceDomainCheck.IAuthTabCallback(), 354126178, new Object[]{settrimpathend});
    }

    public static final /* synthetic */ getPackageType onTransact(setTrimPathEnd settrimpathend) {
        return (getPackageType) onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -243368703, forceDomainCheck.IAuthTabCallback(), 243368709, new Object[]{settrimpathend});
    }

    private final void onExtraCallbackWithResult(InterstitialAd interstitialAd, setTrimPathOffset settrimpathoffset, boolean z) {
        onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 765188294, forceDomainCheck.IAuthTabCallback(), -765188292, new Object[]{this, interstitialAd, settrimpathoffset, Boolean.valueOf(z)});
    }

    private final void IAuthTabCallback(AdError adError) {
        onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1146586069, forceDomainCheck.IAuthTabCallback(), 1146586070, new Object[]{this, adError});
    }

    private final String onNavigationEvent(ResponseInfo responseInfo, String str) {
        return (String) onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -610098727, forceDomainCheck.IAuthTabCallback(), 610098735, new Object[]{this, responseInfo, str});
    }

    private final void IAuthTabCallback(EventType eventType, InterstitialAd interstitialAd) {
        onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 2072704601, forceDomainCheck.IAuthTabCallback(), -2072704594, new Object[]{this, eventType, interstitialAd});
    }

    private final void onExtraCallbackWithResult(InterstitialAd interstitialAd, ExposureContent exposureContent) {
        onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1008570211, forceDomainCheck.IAuthTabCallback(), 1008570222, new Object[]{this, interstitialAd, exposureContent});
    }

    private static final void onExtraCallback(Ref.BooleanRef booleanRef, maybeRemoveAttachStateListener<? super Unit> mayberemoveattachstatelistener, setTrimPathEnd settrimpathend, RewardedAd rewardedAd, AdError adError) {
        onNavigationEvent(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1778841445, forceDomainCheck.IAuthTabCallback(), 1778841450, new Object[]{booleanRef, mayberemoveattachstatelistener, settrimpathend, rewardedAd, adError});
    }
}
