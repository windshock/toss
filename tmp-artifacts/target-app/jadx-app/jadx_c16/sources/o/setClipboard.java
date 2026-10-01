package o;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.initech.inibase.logger.helpers.FileWatchdog;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.features.benefit.ads.appbridge.AdmobAppBridgeAdHandler$;
import im.toss.features.benefit.ads.appbridge.RegisterAdMobFullScreenCallbackWebHandler$Callback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.getBillingPeriod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class setClipboard {
    private static long IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 0;
    private static int getInterfaceDescriptor = 1;
    public static final setClipboard onNavigationEvent = new setClipboard();
    private static final Map<String, IAuthTabCallback<InterstitialAd>> onExtraCallbackWithResult = new LinkedHashMap();
    private static final Map<String, IAuthTabCallback<RewardedAd>> IAuthTabCallbackStub = new LinkedHashMap();
    private static final Map<String, List<onExtraCallbackWithResult>> onWarmupCompleted = new LinkedHashMap();
    private static final Map<String, List<onWarmupCompleted>> asInterface = new LinkedHashMap();
    private static final IdentityHashMap<r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, Long> onTransact = new IdentityHashMap<>();
    private static final Map<Long, Set<String>> asBinder = new LinkedHashMap();
    private static final Handler onExtraCallback = new Handler(Looper.getMainLooper());

    public static /* synthetic */ boolean IAuthTabCallback(long j, onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 25;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(j, onwarmupcompleted);
        int i4 = IAuthTabCallback_Parcel + 71;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i5;
        int i8 = (~(i7 | i4)) | (~(i2 | i4));
        int i9 = i2 | i5;
        int i10 = (~(i5 | (~i4))) | (~(i7 | (~i2))) | (~i9);
        int i11 = i2 + i4 + i3 + (1350191703 * i6) + ((-44904237) * i);
        int i12 = i11 * i11;
        int i13 = ((i2 * (-560584373)) - 948043776) + ((-560584373) * i4) + ((-826660534) * i8) + (i9 * 826660534) + (826660534 * i10) + (266076160 * i3) + ((-71041024) * i6) + ((-766246912) * i) + (1339949056 * i12);
        int i14 = (i2 * 1657715387) + 2046152777 + (i4 * 1657715387) + (i8 * (-918)) + (i9 * 918) + (i10 * 918) + (i3 * 1657716305) + (i6 * 1507858311) + (i * 1845144771) + (i12 * 155058176);
        switch (i13 + (i14 * i14 * 417464320)) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                int i15 = 2 % 2;
                int i16 = IAuthTabCallbackDefault;
                int i17 = i16 + 65;
                IAuthTabCallback_Parcel = i17 % 128;
                int i18 = i17 % 2;
                Map<String, List<onExtraCallbackWithResult>> map = onWarmupCompleted;
                int i19 = i16 + 45;
                IAuthTabCallback_Parcel = i19 % 128;
                int i20 = i19 % 2;
                return map;
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return onTransact(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ void onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 91;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(str);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        AddPhoneContactBridgeExtension$onExtraCallbackWithResult addPhoneContactBridgeExtension$onExtraCallbackWithResult = (AddPhoneContactBridgeExtension$onExtraCallbackWithResult) objArr[0];
        RewardItem rewardItem = (RewardItem) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 87;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(addPhoneContactBridgeExtension$onExtraCallbackWithResult, rewardItem);
        int i4 = IAuthTabCallbackDefault + 67;
        IAuthTabCallback_Parcel = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onWarmupCompleted(long j, onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 65;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(j, onextracallbackwithresult);
        int i4 = IAuthTabCallbackDefault + 103;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    private setClipboard() {
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        setClipboard setclipboard = (setClipboard) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        setclipboard.onExtraCallback(str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallback_Parcel + 21;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final /* synthetic */ IdentityHashMap IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 121;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        IdentityHashMap<r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, Long> identityHashMap = onTransact;
        int i5 = i2 + 73;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return identityHashMap;
    }

    public static final /* synthetic */ Map IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 63;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Map<String, List<onWarmupCompleted>> map = asInterface;
        int i5 = i2 + 119;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        throw null;
    }

    public static final /* synthetic */ long onExtraCallback(setClipboard setclipboard) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 11;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        long jOnTransact = setclipboard.onTransact();
        int i4 = IAuthTabCallback_Parcel + 7;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return jOnTransact;
    }

    public static final /* synthetic */ void onExtraCallback(setClipboard setclipboard, long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {setclipboard, Long.valueOf(j)};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        if (i3 == 0) {
            onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), -64470025, iOnExtraCallbackWithResult2, 64470030, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, objArr);
            int i4 = 77 / 0;
        } else {
            onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), -64470025, iOnExtraCallbackWithResult2, 64470030, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, objArr);
        }
        int i5 = IAuthTabCallback_Parcel + 5;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 68 / 0;
        }
    }

    public static final /* synthetic */ Map onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 45;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Map<String, IAuthTabCallback<RewardedAd>> map = IAuthTabCallbackStub;
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
        return map;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 51;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        Map<Long, Set<String>> map = asBinder;
        int i5 = i3 + 13;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public static final /* synthetic */ Map onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        Map<String, IAuthTabCallback<InterstitialAd>> map = onExtraCallbackWithResult;
        int i5 = i3 + 117;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        setClipboard setclipboard = (setClipboard) objArr[0];
        Context context = (Context) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 97;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = setclipboard.onExtraCallbackWithResult(context);
        int i4 = IAuthTabCallback_Parcel + 9;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zOnExtraCallbackWithResult);
        }
        throw null;
    }

    static {
        int i = access000 + 121;
        getInterfaceDescriptor = i % 128;
        int i2 = i % 2;
    }

    public static final class onExtraCallback extends RewardedAdLoadCallback {
        private static int IAuthTabCallbackDefault = 1;
        private static int asBinder;
        final /* synthetic */ Context IAuthTabCallback;
        final /* synthetic */ String onExtraCallback;
        final /* synthetic */ NativeAdsDto.AdmobRequestOptions onExtraCallbackWithResult;
        final /* synthetic */ setClipboard onNavigationEvent;
        final /* synthetic */ String onWarmupCompleted;

        onExtraCallback(String str, setClipboard setclipboard, Context context, String str2, NativeAdsDto.AdmobRequestOptions admobRequestOptions) {
            this.onWarmupCompleted = str;
            this.onNavigationEvent = setclipboard;
            this.IAuthTabCallback = context;
            this.onExtraCallback = str2;
            this.onExtraCallbackWithResult = admobRequestOptions;
        }

        public /* synthetic */ void onAdLoaded(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 23;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((RewardedAd) obj);
            if (i3 != 0) {
                int i4 = 77 / 0;
            }
            int i5 = IAuthTabCallbackDefault + 37;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        public void onExtraCallback(RewardedAd rewardedAd) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(rewardedAd, "");
            List listEmptyList = (List) setClipboard.IAuthTabCallbackDefault().remove(this.onWarmupCompleted);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            String str = this.onExtraCallback;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listEmptyList) {
                int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
                Set set = (Set) ((Map) setClipboard.onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), 1461746592, iOnExtraCallbackWithResult2, -1461746592, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, new Object[0])).get(Long.valueOf(((onWarmupCompleted) obj).onWarmupCompleted()));
                if (set != null && set.contains(str)) {
                    arrayList.add(obj);
                    int i2 = IAuthTabCallbackDefault + 115;
                    asBinder = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 3 % 2;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            int i4 = IAuthTabCallbackDefault + 125;
            asBinder = i4 % 128;
            Object obj2 = null;
            if (i4 % 2 != 0) {
                Object[] objArr = {this.onNavigationEvent, this.IAuthTabCallback};
                int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
                ((Boolean) setClipboard.onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), 1006378862, nSetPosition.onExtraCallbackWithResult(), -1006378860, iOnExtraCallbackWithResult4, nSetPosition.onExtraCallbackWithResult(), objArr)).booleanValue();
                throw null;
            }
            Object[] objArr2 = {this.onNavigationEvent, this.IAuthTabCallback};
            int iOnExtraCallbackWithResult5 = nSetPosition.onExtraCallbackWithResult();
            if (!((Boolean) setClipboard.onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), 1006378862, nSetPosition.onExtraCallbackWithResult(), -1006378860, iOnExtraCallbackWithResult5, nSetPosition.onExtraCallbackWithResult(), objArr2)).booleanValue()) {
                setClipboard.onExtraCallbackWithResult().put(this.onExtraCallback, new IAuthTabCallback(rewardedAd, this.onExtraCallbackWithResult, setClipboard.onExtraCallback(this.onNavigationEvent)));
                Object[] objArr3 = {this.onNavigationEvent, this.onExtraCallback};
                int iOnExtraCallbackWithResult6 = nSetPosition.onExtraCallbackWithResult();
                setClipboard.onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), -1878233515, nSetPosition.onExtraCallbackWithResult(), 1878233516, iOnExtraCallbackWithResult6, nSetPosition.onExtraCallbackWithResult(), objArr3);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((onWarmupCompleted) it.next()).onExtraCallbackWithResult().onExtraCallbackWithResult(rewardedAd);
                }
                return;
            }
            int i5 = IAuthTabCallbackDefault + 69;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                arrayList.iterator();
                obj2.hashCode();
                throw null;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                int i6 = asBinder + 41;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
                ((onWarmupCompleted) it2.next()).onExtraCallbackWithResult().onNavigationEvent("광고 개인정보 동의 상태를 확인할 수 없습니다.", "PRIVACY_CONSENT_UNKNOWN");
            }
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(loadAdError, "");
            List listEmptyList = (List) setClipboard.IAuthTabCallbackDefault().remove(this.onWarmupCompleted);
            if (listEmptyList == null) {
                int i2 = IAuthTabCallbackDefault + 91;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                listEmptyList = CollectionsKt.emptyList();
            }
            Iterator it = listEmptyList.iterator();
            while (it.hasNext()) {
                int i4 = asBinder + 105;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 == 0) {
                    RVClipboardProxy$onExtraCallback rVClipboardProxy$onExtraCallbackOnExtraCallbackWithResult = ((onWarmupCompleted) it.next()).onExtraCallbackWithResult();
                    String message = loadAdError.getMessage();
                    Intrinsics.checkNotNullExpressionValue(message, "");
                    rVClipboardProxy$onExtraCallbackOnExtraCallbackWithResult.onNavigationEvent(message, "ADMOB_LOAD_FAILED");
                    throw null;
                }
                RVClipboardProxy$onExtraCallback rVClipboardProxy$onExtraCallbackOnExtraCallbackWithResult2 = ((onWarmupCompleted) it.next()).onExtraCallbackWithResult();
                String message2 = loadAdError.getMessage();
                Intrinsics.checkNotNullExpressionValue(message2, "");
                rVClipboardProxy$onExtraCallbackOnExtraCallbackWithResult2.onNavigationEvent(message2, "ADMOB_LOAD_FAILED");
            }
        }
    }

    public final void onWarmupCompleted(@NotNull Context context, @NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @Nullable Long l, @Nullable NativeAdsDto.AdmobRequestOptions admobRequestOptions, @NotNull RVClipboardProxy$onExtraCallback rVClipboardProxy$onExtraCallback) {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rVClipboardProxy$onExtraCallback, "");
        if (onExtraCallbackWithResult(context)) {
            rVClipboardProxy$onExtraCallback.onNavigationEvent("광고 개인정보 동의 상태를 확인할 수 없습니다.", "PRIVACY_CONSENT_UNKNOWN");
            return;
        }
        long jOnExtraCallback = onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str);
        RewardedAd rewardedAdOnExtraCallback = onExtraCallback(str, admobRequestOptions);
        if (rewardedAdOnExtraCallback != null) {
            rVClipboardProxy$onExtraCallback.onExtraCallbackWithResult(rewardedAdOnExtraCallback);
            return;
        }
        String strIAuthTabCallback = IAuthTabCallback(str, admobRequestOptions);
        Map<String, List<onWarmupCompleted>> map = asInterface;
        List<onWarmupCompleted> list = map.get(strIAuthTabCallback);
        if (list != null) {
            list.add(new onWarmupCompleted(jOnExtraCallback, rVClipboardProxy$onExtraCallback));
            return;
        }
        map.put(strIAuthTabCallback, CollectionsKt.mutableListOf(new onWarmupCompleted[]{new onWarmupCompleted(jOnExtraCallback, rVClipboardProxy$onExtraCallback)}));
        try {
            Result.Companion companion = Result.Companion;
            RewardedAd.load(context, str, setStrokeWidth.onNavigationEvent(setStrokeWidth.onExtraCallback, l, admobRequestOptions, false, 4, (Object) null), new onExtraCallback(strIAuthTabCallback, this, context, str, admobRequestOptions));
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            int i2 = IAuthTabCallback_Parcel + 37;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            List<onWarmupCompleted> listRemove = asInterface.remove(strIAuthTabCallback);
            Object obj2 = null;
            if (listRemove == null) {
                int i4 = IAuthTabCallbackDefault + 65;
                IAuthTabCallback_Parcel = i4 % 128;
                if (i4 % 2 == 0) {
                    CollectionsKt.emptyList();
                    throw null;
                }
                listRemove = CollectionsKt.emptyList();
            }
            Iterator<T> it = listRemove.iterator();
            while (!(!it.hasNext())) {
                int i5 = IAuthTabCallback_Parcel + 97;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 != 0) {
                    ((onWarmupCompleted) it.next()).onExtraCallbackWithResult();
                    th2.getMessage();
                    obj2.hashCode();
                    throw null;
                }
                RVClipboardProxy$onExtraCallback rVClipboardProxy$onExtraCallbackOnExtraCallbackWithResult = ((onWarmupCompleted) it.next()).onExtraCallbackWithResult();
                String message = th2.getMessage();
                if (message == null) {
                    message = "AdMob load failed";
                }
                rVClipboardProxy$onExtraCallbackOnExtraCallbackWithResult.onNavigationEvent(message, "ADMOB_LOAD_FAILED");
            }
        }
        int i6 = IAuthTabCallbackDefault + 73;
        IAuthTabCallback_Parcel = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 83 / 0;
        }
    }

    public static final class onNavigationEvent extends InterstitialAdLoadCallback {
        private static int IAuthTabCallbackDefault = 0;
        private static int asBinder = 1;
        final /* synthetic */ setClipboard IAuthTabCallback;
        final /* synthetic */ Context onExtraCallback;
        final /* synthetic */ String onExtraCallbackWithResult;
        final /* synthetic */ NativeAdsDto.AdmobRequestOptions onNavigationEvent;
        final /* synthetic */ String onWarmupCompleted;

        onNavigationEvent(String str, setClipboard setclipboard, Context context, String str2, NativeAdsDto.AdmobRequestOptions admobRequestOptions) {
            this.onExtraCallbackWithResult = str;
            this.IAuthTabCallback = setclipboard;
            this.onExtraCallback = context;
            this.onWarmupCompleted = str2;
            this.onNavigationEvent = admobRequestOptions;
        }

        public /* synthetic */ void onAdLoaded(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 61;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult((InterstitialAd) obj);
            if (i3 == 0) {
                int i4 = 45 / 0;
            }
            int i5 = asBinder + 113;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
        }

        public void onExtraCallbackWithResult(InterstitialAd interstitialAd) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(interstitialAd, "");
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            List listEmptyList = (List) ((Map) setClipboard.onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), -1628924768, nSetPosition.onExtraCallbackWithResult(), 1628924771, iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), new Object[0])).remove(this.onExtraCallbackWithResult);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            String str = this.onWarmupCompleted;
            ArrayList arrayList = new ArrayList();
            Iterator it = listEmptyList.iterator();
            while (!(!it.hasNext())) {
                Object next = it.next();
                int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
                Set set = (Set) ((Map) setClipboard.onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), 1461746592, nSetPosition.onExtraCallbackWithResult(), -1461746592, iOnExtraCallbackWithResult2, nSetPosition.onExtraCallbackWithResult(), new Object[0])).get(Long.valueOf(((onExtraCallbackWithResult) next).onNavigationEvent()));
                if (set != null) {
                    int i2 = asBinder + 37;
                    IAuthTabCallbackDefault = i2 % 128;
                    if (i2 % 2 != 0) {
                        if (set.contains(str)) {
                            arrayList.add(next);
                        }
                    } else if (set.contains(str)) {
                        arrayList.add(next);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            int i3 = asBinder + 15;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = {this.IAuthTabCallback, this.onExtraCallback};
            if (!((Boolean) setClipboard.onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), 1006378862, nSetPosition.onExtraCallbackWithResult(), -1006378860, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), objArr)).booleanValue()) {
                setClipboard.onNavigationEvent().put(this.onWarmupCompleted, new IAuthTabCallback(interstitialAd, this.onNavigationEvent, setClipboard.onExtraCallback(this.IAuthTabCallback)));
                Object[] objArr2 = {this.IAuthTabCallback, this.onWarmupCompleted};
                setClipboard.onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), -1878233515, nSetPosition.onExtraCallbackWithResult(), 1878233516, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), objArr2);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((onExtraCallbackWithResult) it2.next()).onExtraCallbackWithResult().onExtraCallbackWithResult(interstitialAd);
                }
                return;
            }
            int i5 = IAuthTabCallbackDefault + 29;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                arrayList.iterator();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((onExtraCallbackWithResult) it3.next()).onExtraCallbackWithResult().IAuthTabCallback("광고 개인정보 동의 상태를 확인할 수 없습니다.", "PRIVACY_CONSENT_UNKNOWN");
                int i6 = IAuthTabCallbackDefault + 81;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
            }
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(loadAdError, "");
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
            List listEmptyList = (List) ((Map) setClipboard.onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), -1628924768, iOnExtraCallbackWithResult2, 1628924771, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, new Object[0])).remove(this.onExtraCallbackWithResult);
            if (listEmptyList == null) {
                int i2 = asBinder + 111;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 != 0) {
                    listEmptyList = CollectionsKt.emptyList();
                    int i3 = 62 / 0;
                } else {
                    listEmptyList = CollectionsKt.emptyList();
                }
            }
            Iterator it = listEmptyList.iterator();
            int i4 = IAuthTabCallbackDefault + 35;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 % 2;
            }
            while (it.hasNext()) {
                ClipboardTextHandler$onNavigationEvent clipboardTextHandler$onNavigationEventOnExtraCallbackWithResult = ((onExtraCallbackWithResult) it.next()).onExtraCallbackWithResult();
                String message = loadAdError.getMessage();
                Intrinsics.checkNotNullExpressionValue(message, "");
                clipboardTextHandler$onNavigationEventOnExtraCallbackWithResult.IAuthTabCallback(message, "ADMOB_LOAD_FAILED");
            }
        }
    }

    public final void onWarmupCompleted(@NotNull Context context, @NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @Nullable Long l, @Nullable NativeAdsDto.AdmobRequestOptions admobRequestOptions, @NotNull ClipboardTextHandler$onNavigationEvent clipboardTextHandler$onNavigationEvent) {
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(clipboardTextHandler$onNavigationEvent, "");
        if (onExtraCallbackWithResult(context)) {
            clipboardTextHandler$onNavigationEvent.IAuthTabCallback("광고 개인정보 동의 상태를 확인할 수 없습니다.", "PRIVACY_CONSENT_UNKNOWN");
            return;
        }
        long jOnExtraCallback = onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str);
        InterstitialAd interstitialAdOnWarmupCompleted = onWarmupCompleted(str, admobRequestOptions);
        if (interstitialAdOnWarmupCompleted != null) {
            int i4 = IAuthTabCallbackDefault + 93;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            clipboardTextHandler$onNavigationEvent.onExtraCallbackWithResult(interstitialAdOnWarmupCompleted);
            return;
        }
        String strIAuthTabCallback = IAuthTabCallback(str, admobRequestOptions);
        Map<String, List<onExtraCallbackWithResult>> map = onWarmupCompleted;
        List<onExtraCallbackWithResult> list = map.get(strIAuthTabCallback);
        if (list != null) {
            list.add(new onExtraCallbackWithResult(jOnExtraCallback, clipboardTextHandler$onNavigationEvent));
            return;
        }
        map.put(strIAuthTabCallback, CollectionsKt.mutableListOf(new onExtraCallbackWithResult[]{new onExtraCallbackWithResult(jOnExtraCallback, clipboardTextHandler$onNavigationEvent)}));
        try {
            Result.Companion companion = Result.Companion;
            InterstitialAd.load(context, str, setStrokeWidth.onNavigationEvent(setStrokeWidth.onExtraCallback, l, admobRequestOptions, false, 4, (Object) null), new onNavigationEvent(strIAuthTabCallback, this, context, str, admobRequestOptions));
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            List<onExtraCallbackWithResult> listRemove = onWarmupCompleted.remove(strIAuthTabCallback);
            if (listRemove == null) {
                listRemove = CollectionsKt.emptyList();
            }
            Iterator<T> it = listRemove.iterator();
            while (it.hasNext()) {
                ClipboardTextHandler$onNavigationEvent clipboardTextHandler$onNavigationEventOnExtraCallbackWithResult = ((onExtraCallbackWithResult) it.next()).onExtraCallbackWithResult();
                String message = th2.getMessage();
                if (message == null) {
                    message = "AdMob load failed";
                }
                clipboardTextHandler$onNavigationEventOnExtraCallbackWithResult.IAuthTabCallback(message, "ADMOB_LOAD_FAILED");
                int i6 = IAuthTabCallbackDefault + 13;
                IAuthTabCallback_Parcel = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    public static final class asInterface extends FullScreenContentCallback {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ RVClipboardProxyCallback$IAuthTabCallback onNavigationEvent;

        asInterface(RVClipboardProxyCallback$IAuthTabCallback rVClipboardProxyCallback$IAuthTabCallback) {
            this.onNavigationEvent = rVClipboardProxyCallback$IAuthTabCallback;
        }

        public void onAdClicked() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent.onNavigationEvent();
            int i4 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 83 / 0;
            }
        }

        public void onAdDismissedFullScreenContent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent.onWarmupCompleted();
            if (i3 != 0) {
                int i4 = 57 / 0;
            }
        }

        public void onAdFailedToShowFullScreenContent(AdError adError) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(adError, "");
                this.onNavigationEvent.onExtraCallbackWithResult();
                int i3 = 82 / 0;
            } else {
                Intrinsics.checkNotNullParameter(adError, "");
                this.onNavigationEvent.onExtraCallbackWithResult();
            }
            int i4 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void onAdImpression() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent.IAuthTabCallback();
            int i4 = onWarmupCompleted + 79;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        public void onAdShowedFullScreenContent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                this.onNavigationEvent.onExtraCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.onNavigationEvent.onExtraCallback();
            int i3 = onWarmupCompleted + 11;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public final void IAuthTabCallback(@NotNull Context context, boolean z, @NotNull String str, @NotNull RVClipboardProxyCallback$IAuthTabCallback rVClipboardProxyCallback$IAuthTabCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rVClipboardProxyCallback$IAuthTabCallback, "");
        if (onExtraCallbackWithResult(context)) {
            onExtraCallbackWithResult.remove(str);
            rVClipboardProxyCallback$IAuthTabCallback.onWarmupCompleted("광고 개인정보 동의 상태를 확인할 수 없습니다.", "PRIVACY_CONSENT_UNKNOWN");
            return;
        }
        InterstitialAd interstitialAdOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
        onExtraCallbackWithResult.remove(str);
        if (interstitialAdOnExtraCallbackWithResult == null) {
            int i2 = IAuthTabCallbackDefault + 75;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 != 0) {
                rVClipboardProxyCallback$IAuthTabCallback.onWarmupCompleted("해당 adUnitId로 로드된 광고가 없습니다.", "ADMOB_NOT_LOADED");
                return;
            } else {
                rVClipboardProxyCallback$IAuthTabCallback.onWarmupCompleted("해당 adUnitId로 로드된 광고가 없습니다.", "ADMOB_NOT_LOADED");
                throw null;
            }
        }
        if (z) {
            interstitialAdOnExtraCallbackWithResult.setFullScreenContentCallback(new asInterface(rVClipboardProxyCallback$IAuthTabCallback));
        }
        Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
        if (activityIAuthTabCallback != null) {
            interstitialAdOnExtraCallbackWithResult.show(activityIAuthTabCallback);
            rVClipboardProxyCallback$IAuthTabCallback.asInterface();
            return;
        }
        rVClipboardProxyCallback$IAuthTabCallback.onWarmupCompleted("context is null", "ADMOB_NOT_LOADED");
        int i3 = IAuthTabCallback_Parcel + 37;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 4 / 0;
        }
    }

    public static final class asBinder extends FullScreenContentCallback {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ AddPhoneContactBridgeExtension$onExtraCallbackWithResult onExtraCallback;

        asBinder(AddPhoneContactBridgeExtension$onExtraCallbackWithResult addPhoneContactBridgeExtension$onExtraCallbackWithResult) {
            this.onExtraCallback = addPhoneContactBridgeExtension$onExtraCallbackWithResult;
        }

        public void onAdClicked() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback.onExtraCallback();
            int i4 = IAuthTabCallback + 15;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }

        public void onAdDismissedFullScreenContent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 1;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                this.onExtraCallback.onWarmupCompleted();
                int i3 = 82 / 0;
            } else {
                this.onExtraCallback.onWarmupCompleted();
            }
            int i4 = IAuthTabCallback + 57;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void onAdFailedToShowFullScreenContent(AdError adError) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(adError, "");
            this.onExtraCallback.IAuthTabCallback();
            int i4 = IAuthTabCallback + 7;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void onAdImpression() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback.onNavigationEvent();
            int i4 = IAuthTabCallback + 49;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 97 / 0;
            }
        }

        public void onAdShowedFullScreenContent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback.onExtraCallbackWithResult();
            int i4 = IAuthTabCallback + 89;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    private static final void onExtraCallback(AddPhoneContactBridgeExtension$onExtraCallbackWithResult addPhoneContactBridgeExtension$onExtraCallbackWithResult, RewardItem rewardItem) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 11;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rewardItem, "");
            addPhoneContactBridgeExtension$onExtraCallbackWithResult.IAuthTabCallbackStub();
            int i3 = 64 / 0;
        } else {
            Intrinsics.checkNotNullParameter(rewardItem, "");
            addPhoneContactBridgeExtension$onExtraCallbackWithResult.IAuthTabCallbackStub();
        }
        int i4 = IAuthTabCallbackDefault + 109;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void onExtraCallbackWithResult(@NotNull Context context, boolean z, @NotNull String str, @NotNull AddPhoneContactBridgeExtension$onExtraCallbackWithResult addPhoneContactBridgeExtension$onExtraCallbackWithResult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 1;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(addPhoneContactBridgeExtension$onExtraCallbackWithResult, "");
            onExtraCallbackWithResult(context);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(addPhoneContactBridgeExtension$onExtraCallbackWithResult, "");
        if (onExtraCallbackWithResult(context)) {
            IAuthTabCallbackStub.remove(str);
            addPhoneContactBridgeExtension$onExtraCallbackWithResult.onNavigationEvent("광고 개인정보 동의 상태를 확인할 수 없습니다.", "PRIVACY_CONSENT_UNKNOWN");
            return;
        }
        RewardedAd rewardedAdIAuthTabCallback = IAuthTabCallback(str);
        IAuthTabCallbackStub.remove(str);
        if (rewardedAdIAuthTabCallback == null) {
            addPhoneContactBridgeExtension$onExtraCallbackWithResult.onNavigationEvent("해당 adUnitId로 로드된 광고가 없습니다.", "ADMOB_NOT_LOADED");
            return;
        }
        if (z) {
            rewardedAdIAuthTabCallback.setFullScreenContentCallback(new asBinder(addPhoneContactBridgeExtension$onExtraCallbackWithResult));
        }
        Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
        if (activityIAuthTabCallback != null) {
            rewardedAdIAuthTabCallback.show(activityIAuthTabCallback, new AdmobAppBridgeAdHandler$.ExternalSyntheticLambda1(addPhoneContactBridgeExtension$onExtraCallbackWithResult));
            addPhoneContactBridgeExtension$onExtraCallbackWithResult.onTransact();
        } else {
            addPhoneContactBridgeExtension$onExtraCallbackWithResult.onNavigationEvent("context is null", "ADMOB_NOT_LOADED");
            int i3 = IAuthTabCallback_Parcel + 7;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public static final class IAuthTabCallbackDefault extends FullScreenContentCallback {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ RegisterAdMobFullScreenCallbackWebHandler$Callback onWarmupCompleted;

        IAuthTabCallbackDefault(RegisterAdMobFullScreenCallbackWebHandler$Callback registerAdMobFullScreenCallbackWebHandler$Callback) {
            this.onWarmupCompleted = registerAdMobFullScreenCallbackWebHandler$Callback;
        }

        public void onAdClicked() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted.IAuthTabCallback();
            int i4 = onExtraCallback + 27;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }

        public void onAdDismissedFullScreenContent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted.onExtraCallback();
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void onAdFailedToShowFullScreenContent(AdError adError) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(adError, "");
            this.onWarmupCompleted.onExtraCallbackWithResult();
            int i4 = onExtraCallback + 43;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void onAdImpression() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                this.onWarmupCompleted.onWarmupCompleted();
                throw null;
            }
            this.onWarmupCompleted.onWarmupCompleted();
            int i3 = onExtraCallback + 97;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 23 / 0;
            }
        }

        public void onAdShowedFullScreenContent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 57;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted.onNavigationEvent();
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        setClipboard setclipboard = (setClipboard) objArr[0];
        String str = (String) objArr[1];
        RegisterAdMobFullScreenCallbackWebHandler$Callback registerAdMobFullScreenCallbackWebHandler$Callback = (RegisterAdMobFullScreenCallbackWebHandler$Callback) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(registerAdMobFullScreenCallbackWebHandler$Callback, "");
        IAuthTabCallbackDefault iAuthTabCallbackDefault = new IAuthTabCallbackDefault(registerAdMobFullScreenCallbackWebHandler$Callback);
        RewardedAd rewardedAdIAuthTabCallback = setclipboard.IAuthTabCallback(str);
        Object obj = null;
        if (rewardedAdIAuthTabCallback != null) {
            int i2 = IAuthTabCallbackDefault + 87;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            registerAdMobFullScreenCallbackWebHandler$Callback.asBinder();
            rewardedAdIAuthTabCallback.setFullScreenContentCallback(iAuthTabCallbackDefault);
            return null;
        }
        InterstitialAd interstitialAdOnExtraCallbackWithResult = setclipboard.onExtraCallbackWithResult(str);
        if (interstitialAdOnExtraCallbackWithResult == null) {
            registerAdMobFullScreenCallbackWebHandler$Callback.onNavigationEvent("해당 adUnitId로 로드된 광고가 없습니다.", "ADMOB_NOT_LOADED");
            return null;
        }
        int i4 = IAuthTabCallbackDefault + 83;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            registerAdMobFullScreenCallbackWebHandler$Callback.asBinder();
            interstitialAdOnExtraCallbackWithResult.setFullScreenContentCallback(iAuthTabCallbackDefault);
            return null;
        }
        registerAdMobFullScreenCallbackWebHandler$Callback.asBinder();
        interstitialAdOnExtraCallbackWithResult.setFullScreenContentCallback(iAuthTabCallbackDefault);
        obj.hashCode();
        throw null;
    }

    public final void asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult.clear();
            IAuthTabCallbackStub.clear();
            onWarmupCompleted.clear();
            asInterface.clear();
            onTransact.clear();
            asBinder.clear();
            int i3 = IAuthTabCallback_Parcel + 99;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        onExtraCallbackWithResult.clear();
        IAuthTabCallbackStub.clear();
        onWarmupCompleted.clear();
        asInterface.clear();
        onTransact.clear();
        asBinder.clear();
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r3 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        r3 = new java.util.LinkedHashSet<>();
        r7.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        r3.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        r2 = o.setClipboard.IAuthTabCallback;
        o.setClipboard.IAuthTabCallback = 1 + r2;
        r1.put(r7, java.lang.Long.valueOf(r2));
        r1 = o.setClipboard.asBinder;
        r4 = java.lang.Long.valueOf(r2);
        r5 = r1.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if (r5 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        r5 = new java.util.LinkedHashSet<>();
        r1.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        r5.add(r8);
        r7.getLifecycle().IAuthTabCallback(new im.toss.features.benefit.ads.appbridge.AdmobAppBridgeAdHandler$bindContentOwner$3(r7, r2));
        r7 = o.setClipboard.IAuthTabCallbackDefault + 45;
        o.setClipboard.IAuthTabCallback_Parcel = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r0 = r2.longValue();
        r7 = o.setClipboard.asBinder;
        r2 = java.lang.Long.valueOf(r0);
        r3 = r7.get(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long onExtraCallback(final r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, String str) {
        IdentityHashMap<r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, Long> identityHashMap;
        Long l;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 107;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            identityHashMap = onTransact;
            l = identityHashMap.get(r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
            int i3 = 73 / 0;
        } else {
            identityHashMap = onTransact;
            l = identityHashMap.get(r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 101;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            asBinder.remove(Long.valueOf(jLongValue));
            obj.hashCode();
            throw null;
        }
        Set<String> setRemove = asBinder.remove(Long.valueOf(jLongValue));
        if (setRemove == null) {
            setRemove = clearFaultAdjacentMetadata.onExtraCallback();
        }
        for (String str : setRemove) {
            setClipboard setclipboard = onNavigationEvent;
            setclipboard.onNavigationEvent(onWarmupCompleted, jLongValue, str);
            setclipboard.onWarmupCompleted(asInterface, jLongValue, str);
            if (!setclipboard.onWarmupCompleted(str)) {
                onExtraCallbackWithResult.remove(str);
                IAuthTabCallbackStub.remove(str);
            }
        }
        int i3 = IAuthTabCallbackDefault + 77;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r1.isEmpty() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r1.isEmpty() != true) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean onWarmupCompleted(String str) {
        int i = 2 % 2;
        Collection<Set<String>> collectionValues = asBinder.values();
        if (collectionValues instanceof Collection) {
            int i2 = IAuthTabCallbackDefault + 49;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 16 / 0;
            }
        }
        Iterator<T> it = collectionValues.iterator();
        int i4 = IAuthTabCallbackDefault + 23;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        while (!(!it.hasNext())) {
            if (((Set) it.next()).contains(str)) {
                int i6 = IAuthTabCallbackDefault + 123;
                IAuthTabCallback_Parcel = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
        }
        return false;
    }

    private final InterstitialAd onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 123;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Map<String, IAuthTabCallback<InterstitialAd>> map = onExtraCallbackWithResult;
        IAuthTabCallback<InterstitialAd> iAuthTabCallback = map.get(str);
        if (iAuthTabCallback != null) {
            if (iAuthTabCallback.onWarmupCompleted()) {
                int i4 = IAuthTabCallbackDefault + 111;
                IAuthTabCallback_Parcel = i4 % 128;
                if (i4 % 2 != 0) {
                    map.remove(str);
                    return null;
                }
                map.remove(str);
                int i5 = 60 / 0;
                return null;
            }
            return (InterstitialAd) iAuthTabCallback.IAuthTabCallback();
        }
        int i6 = IAuthTabCallback_Parcel + 37;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    private final InterstitialAd onWarmupCompleted(String str, NativeAdsDto.AdmobRequestOptions admobRequestOptions) {
        int i = 2 % 2;
        Map<String, IAuthTabCallback<InterstitialAd>> map = onExtraCallbackWithResult;
        IAuthTabCallback<InterstitialAd> iAuthTabCallback = map.get(str);
        if (iAuthTabCallback == null) {
            int i2 = IAuthTabCallback_Parcel + 117;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 71 / 0;
            }
            return null;
        }
        if (iAuthTabCallback.onWarmupCompleted()) {
            int i4 = IAuthTabCallbackDefault + 71;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            map.remove(str);
            return null;
        }
        Object objIAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
        if (!Intrinsics.areEqual(iAuthTabCallback.onNavigationEvent(), admobRequestOptions)) {
            objIAuthTabCallback = null;
        }
        InterstitialAd interstitialAd = (InterstitialAd) objIAuthTabCallback;
        int i6 = IAuthTabCallbackDefault + 3;
        IAuthTabCallback_Parcel = i6 % 128;
        if (i6 % 2 != 0) {
            return interstitialAd;
        }
        throw null;
    }

    private final RewardedAd IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 19;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Map<String, IAuthTabCallback<RewardedAd>> map = IAuthTabCallbackStub;
        IAuthTabCallback<RewardedAd> iAuthTabCallback = map.get(str);
        Object obj = null;
        if (iAuthTabCallback == null) {
            return null;
        }
        if (!(!iAuthTabCallback.onWarmupCompleted())) {
            map.remove(str);
            return null;
        }
        RewardedAd rewardedAd = (RewardedAd) iAuthTabCallback.IAuthTabCallback();
        int i4 = IAuthTabCallback_Parcel + 125;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return rewardedAd;
        }
        obj.hashCode();
        throw null;
    }

    private final RewardedAd onExtraCallback(String str, NativeAdsDto.AdmobRequestOptions admobRequestOptions) {
        int i = 2 % 2;
        Map<String, IAuthTabCallback<RewardedAd>> map = IAuthTabCallbackStub;
        IAuthTabCallback<RewardedAd> iAuthTabCallback = map.get(str);
        if (iAuthTabCallback == null) {
            return null;
        }
        if (iAuthTabCallback.onWarmupCompleted()) {
            int i2 = IAuthTabCallback_Parcel + 105;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            map.remove(str);
            int i4 = IAuthTabCallback_Parcel + 83;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        Object objIAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
        return (RewardedAd) (Intrinsics.areEqual(iAuthTabCallback.onNavigationEvent(), admobRequestOptions) ? objIAuthTabCallback : null);
    }

    private final void onExtraCallback(String str) {
        int i = 2 % 2;
        onExtraCallback.postDelayed(new AdmobAppBridgeAdHandler$.ExternalSyntheticLambda3(str), IAuthTabCallbackStub());
        int i2 = IAuthTabCallbackDefault + 71;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallbackStub(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        setClipboard setclipboard = onNavigationEvent;
        setclipboard.onExtraCallbackWithResult(str);
        setclipboard.IAuthTabCallback(str);
        int i4 = IAuthTabCallbackDefault + 61;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private final long onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 103;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        long jCurrentTimeMillis = System.currentTimeMillis() + IAuthTabCallbackStub();
        int i4 = IAuthTabCallbackDefault + 111;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return jCurrentTimeMillis;
    }

    private final boolean onExtraCallbackWithResult(Context context) {
        int i = 2 % 2;
        getBillingPeriod.onNavigationEvent onnavigationevent = getBillingPeriod.Companion;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        if (onnavigationevent.IAuthTabCallback(applicationContext).onExtraCallbackWithResult() != getPricingPhaseList.EU || getTrimPathStart.onExtraCallbackWithResult.onWarmupCompleted()) {
            return false;
        }
        int i2 = IAuthTabCallback_Parcel + 35;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        boolean z = i2 % 2 == 0;
        int i4 = i3 + 83;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 49;
        IAuthTabCallbackDefault = i2 % 128;
        long jCoerceAtLeast = i2 % 2 != 0 ? RangesKt.coerceAtLeast(DERSet.onExtraCallback.onExtraCallback(), 1) - FileWatchdog.DEFAULT_DELAY : RangesKt.coerceAtLeast(DERSet.onExtraCallback.onExtraCallback(), 1) * FileWatchdog.DEFAULT_DELAY;
        int i3 = IAuthTabCallbackDefault + 19;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            return jCoerceAtLeast;
        }
        throw null;
    }

    private static final boolean onExtraCallbackWithResult(long j, onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            onextracallbackwithresult.onNavigationEvent();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if (onextracallbackwithresult.onNavigationEvent() == j) {
            return true;
        }
        int i3 = IAuthTabCallbackDefault + 49;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    private final void onNavigationEvent(Map<String, List<onExtraCallbackWithResult>> map, long j, String str) {
        int i = 2 % 2;
        Set<String> setKeySet = map.keySet();
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (onNavigationEvent.onWarmupCompleted((String) obj, str)) {
                arrayList.add(obj);
            }
        }
        for (String str2 : arrayList) {
            int i2 = IAuthTabCallback_Parcel + 85;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            List<onExtraCallbackWithResult> list = map.get(str2);
            if (list != null) {
                CollectionsKt.removeAll(list, new AdmobAppBridgeAdHandler$.ExternalSyntheticLambda2(j));
            }
            List<onExtraCallbackWithResult> listEmptyList = map.get(str2);
            if (listEmptyList == null) {
                int i4 = IAuthTabCallbackDefault + 37;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
                listEmptyList = CollectionsKt.emptyList();
            }
            if (!(!listEmptyList.isEmpty())) {
                int i6 = IAuthTabCallback_Parcel + 37;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
                map.remove(str2);
                if (i7 != 0) {
                    int i8 = 15 / 0;
                }
            }
        }
    }

    private static final boolean onWarmupCompleted(long j, onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        if (onwarmupcompleted.onWarmupCompleted() != j) {
            return false;
        }
        int i2 = IAuthTabCallbackDefault + 35;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 31;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onWarmupCompleted(Map<String, List<onWarmupCompleted>> map, long j, String str) {
        int i = 2 % 2;
        Set<String> setKeySet = map.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (onNavigationEvent.onWarmupCompleted((String) obj, str)) {
                int i2 = IAuthTabCallback_Parcel + 77;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 != 0) {
                    arrayList.add(obj);
                    throw null;
                }
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        int i3 = IAuthTabCallbackDefault + 23;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        while (it.hasNext()) {
            int i5 = IAuthTabCallbackDefault + 31;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 == 0) {
                map.get((String) it.next());
                throw null;
            }
            String str2 = (String) it.next();
            List<onWarmupCompleted> list = map.get(str2);
            if (list != null) {
                CollectionsKt.removeAll(list, new AdmobAppBridgeAdHandler$.ExternalSyntheticLambda0(j));
                int i6 = IAuthTabCallback_Parcel + 95;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
            }
            List<onWarmupCompleted> listEmptyList = map.get(str2);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            if (listEmptyList.isEmpty()) {
                map.remove(str2);
            }
        }
    }

    private final String IAuthTabCallback(String str, NativeAdsDto.AdmobRequestOptions admobRequestOptions) {
        int i = 2 % 2;
        String str2 = str + "\u0000" + admobRequestOptions;
        int i2 = IAuthTabCallback_Parcel + 31;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 27 / 0;
        }
        return str2;
    }

    private final boolean onWarmupCompleted(String str, String str2) {
        int i = 2 % 2;
        boolean zStartsWith$default = StringsKt.startsWith$default(str, str2 + "\u0000", false, 2, (Object) null);
        int i2 = IAuthTabCallbackDefault + 83;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return zStartsWith$default;
        }
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(AddPhoneContactBridgeExtension$onExtraCallbackWithResult addPhoneContactBridgeExtension$onExtraCallbackWithResult, RewardItem rewardItem) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), 487316978, iOnExtraCallbackWithResult2, -487316972, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, new Object[]{addPhoneContactBridgeExtension$onExtraCallbackWithResult, rewardItem});
    }

    public static final /* synthetic */ Map onWarmupCompleted() {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (Map) onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), -1628924768, iOnExtraCallbackWithResult2, 1628924771, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, new Object[0]);
    }

    public static final /* synthetic */ Map onExtraCallback() {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (Map) onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), 1461746592, iOnExtraCallbackWithResult2, -1461746592, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, new Object[0]);
    }

    public static final /* synthetic */ boolean IAuthTabCallback(setClipboard setclipboard, Context context) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), 1006378862, iOnExtraCallbackWithResult2, -1006378860, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, new Object[]{setclipboard, context})).booleanValue();
    }

    public static final /* synthetic */ void onNavigationEvent(setClipboard setclipboard, String str) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), -1878233515, iOnExtraCallbackWithResult2, 1878233516, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, new Object[]{setclipboard, str});
    }

    private final void onWarmupCompleted(long j) {
        Object[] objArr = {this, Long.valueOf(j)};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), -64470025, nSetPosition.onExtraCallbackWithResult(), 64470030, iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), objArr);
    }

    public final void onWarmupCompleted(@NotNull String str, @NotNull RegisterAdMobFullScreenCallbackWebHandler$Callback registerAdMobFullScreenCallbackWebHandler$Callback) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), -426990591, iOnExtraCallbackWithResult2, 426990595, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, new Object[]{this, str, registerAdMobFullScreenCallbackWebHandler$Callback});
    }
}
