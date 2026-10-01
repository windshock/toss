package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import com.tmoney.LiveCheckConstants;
import im.toss.ads_sdk.model.MediationPriority;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.NativeExtension;
import im.toss.ads_sdk.remote.di.NativeAdsApiModule;
import im.toss.ads_sdk.remote.model.SdkTemplate;
import im.toss.ads_sdk.remote.model.SspSdkAd;
import im.toss.ads_sdk.remote.model.SspSdkAdOption;
import im.toss.ads_sdk.remote.model.SspSdkAdResponse;
import im.toss.ads_sdk.remote.model.SspSdkAdReward;
import im.toss.ads_sdk.remote.model.SspSdkMediation;
import im.toss.ads_sdk.remote.model.SspSdkMediationAdmob;
import im.toss.ads_sdk.remote.model.SspSdkMediationEndpoint;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class beginFakeDrag {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 31045;
    private static int asInterface = 1;
    private static char onExtraCallback = 43016;
    private static int onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 37489;
    private static char onWarmupCompleted = 41410;

    public static final NativeAdsDto onWarmupCompleted(@NotNull SspSdkAdResponse sspSdkAdResponse, @NotNull String str) {
        Iterator it;
        Object next;
        int i = 2 % 2;
        int i2 = asInterface + 77;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(sspSdkAdResponse, "");
            Intrinsics.checkNotNullParameter(str, "");
            it = sspSdkAdResponse.onWarmupCompleted().iterator();
            int i3 = 85 / 0;
        } else {
            Intrinsics.checkNotNullParameter(sspSdkAdResponse, "");
            Intrinsics.checkNotNullParameter(str, "");
            it = sspSdkAdResponse.onWarmupCompleted().iterator();
        }
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i4 = onExtraCallbackWithResult + 115;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            next = it.next();
            if (Intrinsics.areEqual(((SspSdkAd) next).onTransact(), str)) {
                int i6 = asInterface + 93;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                break;
            }
        }
        SspSdkAd sspSdkAd = (SspSdkAd) next;
        String strOnExtraCallbackWithResult = sspSdkAdResponse.onExtraCallbackWithResult();
        String strIAuthTabCallbackDefault = sspSdkAd != null ? sspSdkAd.IAuthTabCallbackDefault() : null;
        return new NativeAdsDto((String) null, strOnExtraCallbackWithResult, (String) null, strIAuthTabCallbackDefault == null ? "" : strIAuthTabCallbackDefault, CollectionsKt.listOfNotNull(sspSdkAd != null ? onNavigationEvent(sspSdkAd, sspSdkAdResponse.onExtraCallbackWithResult(), str) : null), onNavigationEvent(sspSdkAdResponse, sspSdkAd), 1, (DefaultConstructorMarker) null);
    }

    private static final NativeAdsDto.AdAsset onNavigationEvent(SspSdkAd sspSdkAd, String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (sspSdkAd.asBinder() != setScrollingCacheEnabled.OK) {
            int i4 = asInterface + 5;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if (sspSdkAd.asBinder() != setScrollingCacheEnabled.TEST_MODE) {
                return null;
            }
        }
        SdkTemplate sdkTemplateOnExtraCallbackWithResult = sspSdkAd.onExtraCallbackWithResult();
        if (sdkTemplateOnExtraCallbackWithResult == null) {
            return null;
        }
        if (sdkTemplateOnExtraCallbackWithResult instanceof SdkTemplate.IAuthTabCallback) {
            SdkTemplate.IAuthTabCallback iAuthTabCallback = (SdkTemplate.IAuthTabCallback) sdkTemplateOnExtraCallbackWithResult;
            if (SdkTemplate.Companion.onExtraCallback().contains(iAuthTabCallback.onExtraCallback())) {
                iAuthTabCallback.onExtraCallback();
                int i6 = onExtraCallbackWithResult + 105;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
            }
            return null;
        }
        String strIAuthTabCallback = sspSdkAd.IAuthTabCallback();
        if (StringsKt.isBlank(strIAuthTabCallback)) {
            strIAuthTabCallback = str + "#" + str2;
        }
        NativeAdsDto.Creative.None none = new NativeAdsDto.Creative.None(strIAuthTabCallback, (String) null, (String) null, sdkTemplateOnExtraCallbackWithResult.onNavigationEvent(), 6, (DefaultConstructorMarker) null);
        NativeExtension nativeExtension = new NativeExtension(sdkTemplateOnExtraCallbackWithResult.onExtraCallback(), 0, NativeAdsApiModule.IAuthTabCallback.IAuthTabCallback().onWarmupCompleted(SdkTemplate.Companion.serializer(), sdkTemplateOnExtraCallbackWithResult), str2);
        Object[] objArr = new Object[1];
        a(new char[]{65040, 31706}, (Process.myPid() >> 22) + 1, objArr);
        return new NativeAdsDto.AdAsset(null, none, ((String) objArr[0]).intern(), null, null, null, nativeExtension, 57, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final NativeAdsDto.ExtraInfo onNavigationEvent(SspSdkAdResponse sspSdkAdResponse, SspSdkAd sspSdkAd) {
        SspSdkAdOption sspSdkAdOptionOnWarmupCompleted;
        boolean zOnWarmupCompleted;
        Double dValueOf;
        NativeAdsDto.Mediation mediation;
        NativeAdsDto.Mediation mediationOnExtraCallbackWithResult;
        Integer numOnExtraCallback;
        SspSdkAdReward sspSdkAdRewardOnNavigationEvent;
        Integer numOnNavigationEvent;
        int i = 2 % 2;
        Object obj = null;
        if (sspSdkAd != null) {
            sspSdkAdOptionOnWarmupCompleted = sspSdkAd.onWarmupCompleted();
        } else {
            int i2 = onExtraCallbackWithResult + 77;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            sspSdkAdOptionOnWarmupCompleted = null;
        }
        String strIAuthTabCallback = sspSdkAdResponse.IAuthTabCallback();
        Double dValueOf2 = (sspSdkAdOptionOnWarmupCompleted == null || (numOnNavigationEvent = sspSdkAdOptionOnWarmupCompleted.onNavigationEvent()) == null) ? null : Double.valueOf(numOnNavigationEvent.intValue());
        NativeAdsDto.Reward reward = (sspSdkAd == null || (sspSdkAdRewardOnNavigationEvent = sspSdkAd.onNavigationEvent()) == null) ? null : new NativeAdsDto.Reward(sspSdkAdRewardOnNavigationEvent.IAuthTabCallback(), sspSdkAdRewardOnNavigationEvent.onExtraCallbackWithResult());
        if (sspSdkAdOptionOnWarmupCompleted != null) {
            int i4 = onExtraCallbackWithResult + 15;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            zOnWarmupCompleted = sspSdkAdOptionOnWarmupCompleted.onWarmupCompleted();
        } else {
            zOnWarmupCompleted = true;
        }
        boolean z = zOnWarmupCompleted;
        if (sspSdkAdOptionOnWarmupCompleted == null || (numOnExtraCallback = sspSdkAdOptionOnWarmupCompleted.onExtraCallback()) == null) {
            dValueOf = null;
        } else {
            int i6 = asInterface + 49;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            dValueOf = Double.valueOf(numOnExtraCallback.intValue());
        }
        if (sspSdkAd != null) {
            int i8 = asInterface + 111;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                sspSdkAd.onExtraCallback();
                obj.hashCode();
                throw null;
            }
            SspSdkMediation sspSdkMediationOnExtraCallback = sspSdkAd.onExtraCallback();
            mediation = (sspSdkMediationOnExtraCallback == null || (mediationOnExtraCallbackWithResult = onExtraCallbackWithResult(sspSdkMediationOnExtraCallback)) == null) ? new NativeAdsDto.Mediation((String) null, (List) null, (NativeAdsDto.AdmobInfo) null, (NativeAdsDto.MediationEndPoint) null, (List) null, (List) null, 63, (DefaultConstructorMarker) null) : mediationOnExtraCallbackWithResult;
        }
        return new NativeAdsDto.ExtraInfo(strIAuthTabCallback, dValueOf2, reward, z, dValueOf, mediation, (NativeAdsDto.Creative.TutorialOverlay) null, 64, (DefaultConstructorMarker) null);
    }

    private static final NativeAdsDto.Mediation onExtraCallbackWithResult(SspSdkMediation sspSdkMediation) {
        NativeAdsDto.AdmobInfo admobInfo;
        String strOnExtraCallbackWithResult;
        Double dValueOf;
        int i = 2 % 2;
        String strIAuthTabCallbackDefault = sspSdkMediation.IAuthTabCallbackDefault();
        List<MediationPriority> listOnTransact = sspSdkMediation.onTransact();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnTransact, 10));
        Iterator<T> it = listOnTransact.iterator();
        while (it.hasNext()) {
            arrayList.add(((MediationPriority) it.next()).name());
            int i2 = onExtraCallbackWithResult + 103;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 / 3;
            }
        }
        SspSdkMediationAdmob sspSdkMediationAdmobOnWarmupCompleted = sspSdkMediation.onWarmupCompleted();
        if (sspSdkMediationAdmobOnWarmupCompleted != null) {
            int i4 = asInterface + 57;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            String strOnWarmupCompleted = sspSdkMediationAdmobOnWarmupCompleted.onWarmupCompleted();
            if (sspSdkMediationAdmobOnWarmupCompleted.onExtraCallback() != null) {
                int i6 = onExtraCallbackWithResult + 117;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                dValueOf = Double.valueOf(r5.longValue());
            } else {
                int i8 = onExtraCallbackWithResult + 69;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
                dValueOf = null;
            }
            String strOnExtraCallbackWithResult2 = sspSdkMediationAdmobOnWarmupCompleted.onExtraCallbackWithResult();
            if (StringsKt.isBlank(strOnExtraCallbackWithResult2)) {
                int i10 = onExtraCallbackWithResult + 45;
                asInterface = i10 % 128;
                if (i10 % 2 == 0) {
                    sspSdkMediationAdmobOnWarmupCompleted.IAuthTabCallback();
                    str.hashCode();
                    throw null;
                }
                strOnExtraCallbackWithResult2 = sspSdkMediationAdmobOnWarmupCompleted.IAuthTabCallback();
            }
            String str = strOnExtraCallbackWithResult2;
            JsonObject jsonObjectOnNavigationEvent = sspSdkMediationAdmobOnWarmupCompleted.onNavigationEvent();
            admobInfo = new NativeAdsDto.AdmobInfo(strOnWarmupCompleted, dValueOf, str, 0.0d, 0.0d, (NativeAdsDto.ThumbnailBannerAdMobRatio) null, jsonObjectOnNavigationEvent != null ? onNavigationEvent(jsonObjectOnNavigationEvent) : null, 56, (DefaultConstructorMarker) null);
        } else {
            admobInfo = null;
        }
        SspSdkMediationEndpoint sspSdkMediationEndpoint = (SspSdkMediationEndpoint) SspSdkMediation.onNavigationEvent(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -672219893, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 672219893, new Object[]{sspSdkMediation}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
        String strOnExtraCallback = sspSdkMediationEndpoint != null ? sspSdkMediationEndpoint.onExtraCallback() : null;
        SspSdkMediationEndpoint sspSdkMediationEndpoint2 = (SspSdkMediationEndpoint) SspSdkMediation.onNavigationEvent(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -672219893, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 672219893, new Object[]{sspSdkMediation}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
        if (sspSdkMediationEndpoint2 != null) {
            int i11 = asInterface + 37;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            strOnExtraCallbackWithResult = sspSdkMediationEndpoint2.onExtraCallbackWithResult();
        } else {
            strOnExtraCallbackWithResult = null;
        }
        SspSdkMediationEndpoint sspSdkMediationEndpoint3 = (SspSdkMediationEndpoint) SspSdkMediation.onNavigationEvent(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -672219893, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 672219893, new Object[]{sspSdkMediation}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
        return new NativeAdsDto.Mediation(strIAuthTabCallbackDefault, arrayList, admobInfo, new NativeAdsDto.MediationEndPoint(strOnExtraCallback, strOnExtraCallbackWithResult, sspSdkMediationEndpoint3 != null ? sspSdkMediationEndpoint3.onWarmupCompleted() : null), (List) SspSdkMediation.onNavigationEvent(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -2128545776, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 2128545777, new Object[]{sspSdkMediation}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult()), sspSdkMediation.onExtraCallbackWithResult());
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $11 + 105;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = i4;
            }
            int i6 = 58224;
            while (i2 < 16) {
                int i7 = $10 + 83;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i9 = (c2 + i6) ^ ((c2 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cArgb = (char) Color.argb(i4, i4, i4, i4);
                        int iArgb = Color.argb(i4, i4, i4, i4) + 10;
                        int i11 = 12434 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cArgb, iArgb, i11, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), View.MeasureSpec.getSize(0) + 10, 12434 - View.MeasureSpec.getSize(0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i2++;
                    cArr3 = cArr4;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 16014), 15 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 19901 - Color.alpha(0), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static final NativeAdsDto.AdmobRequestOptions onNavigationEvent(JsonObject jsonObject) {
        Object obj;
        int i = 2 % 2;
        int i2 = asInterface + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        try {
            Result.Companion companion = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl((NativeAdsDto.AdmobRequestOptions) NativeAdsApiModule.IAuthTabCallback.IAuthTabCallback().onExtraCallbackWithResult(NativeAdsDto.AdmobRequestOptions.Companion.serializer(), jsonObject));
            int i4 = asInterface + 57;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 3;
            }
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (kotlin.Result.onExtraCallback(obj)) {
            int i6 = onExtraCallbackWithResult + 69;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            obj = null;
        }
        return (NativeAdsDto.AdmobRequestOptions) obj;
    }
}
