package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.ads_sdk.NativeAdsManager;
import im.toss.ads_sdk.remote.model.SdkTemplate;
import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.ProfileStore;
import o.QuirksExternalSyntheticBackport0;
import o.WebViewCompatExternalSyntheticLambda1;
import o.calculatePageOffsets;
import o.dispatchOnPageScrolled;
import o.findResAndMsg;
import o.onPageScrollStateChanged;
import o.onSafeBrowsingHit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class onSafeBrowsingHit {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        onPageScrollStateChanged onpagescrollstatechanged = (onPageScrollStateChanged) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            asInterface(onpagescrollstatechanged, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
            obj.hashCode();
            throw null;
        }
        Unit unitAsInterface = asInterface(onpagescrollstatechanged, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i3 = onExtraCallbackWithResult + 57;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitAsInterface;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String IAuthTabCallback(SdkTemplate.onNavigationEvent onnavigationevent, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 43;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String strOnWarmupCompleted = onWarmupCompleted(onnavigationevent, i);
        int i5 = onExtraCallback + 91;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return strOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(calculatePageOffsets calculatepageoffsets, findResAndMsg findresandmsg, ProfileStore profileStore, SdkTemplate.onNavigationEvent onnavigationevent, ConcurrentHashMap concurrentHashMap, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 19;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(calculatepageoffsets, findresandmsg, profileStore, onnavigationevent, concurrentHashMap, i);
        int i5 = onExtraCallback + 17;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    private static final Unit IAuthTabCallback(onPageScrollStateChanged onpagescrollstatechanged, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 93;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(onpagescrollstatechanged, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 97;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ boolean IAuthTabCallback(ConcurrentHashMap concurrentHashMap, int i, ProfileStore profileStore) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 91;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            asInterface(concurrentHashMap, i, profileStore);
            throw null;
        }
        boolean zAsInterface = asInterface(concurrentHashMap, i, profileStore);
        int i4 = onExtraCallback + 3;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return zAsInterface;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(onPageScrollStateChanged onpagescrollstatechanged, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 101;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(onpagescrollstatechanged, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 111;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit asInterface(onPageScrollStateChanged onpagescrollstatechanged, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 69;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(onpagescrollstatechanged, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 25;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        onPageScrollStateChanged onpagescrollstatechanged = (onPageScrollStateChanged) objArr[0];
        Integer num = (Integer) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(onpagescrollstatechanged, num);
        int i4 = onExtraCallback + 27;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(ConcurrentHashMap concurrentHashMap, Function1 function1, int i, WebViewCompatExternalSyntheticLambda1 webViewCompatExternalSyntheticLambda1) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 5;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(concurrentHashMap, function1, i, webViewCompatExternalSyntheticLambda1);
        if (i4 == 0) {
            int i5 = 68 / 0;
        }
        int i6 = onExtraCallbackWithResult + 83;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(onPageScrollStateChanged onpagescrollstatechanged, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 65;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnTransact = onTransact(onpagescrollstatechanged, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallbackWithResult + 67;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ boolean onExtraCallback(ConcurrentHashMap concurrentHashMap, int i, ProfileStore profileStore) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 55;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            onNavigationEvent(concurrentHashMap, i, profileStore);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnNavigationEvent = onNavigationEvent(concurrentHashMap, i, profileStore);
        int i4 = onExtraCallbackWithResult + 23;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(onPageScrollStateChanged onpagescrollstatechanged, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 125;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(onpagescrollstatechanged, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 24 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = i7 | i5;
        int i9 = ~i8;
        int i10 = ~i3;
        int i11 = i9 | (~(i10 | i5));
        int i12 = i8 | i10;
        int i13 = (~(i3 | i5)) | (~(i7 | (~i5)));
        int i14 = i5 + i + i4 + ((-1311665080) * i2) + (1761575915 * i6);
        int i15 = i14 * i14;
        int i16 = ((-2073022045) * i5) + 412680192 + (1917570655 * i) + (i11 * (-1995296350)) + (1995296350 * i12) + ((-1995296350) * i13) + ((-77725696) * i4) + (175112192 * i2) + ((-649461760) * i6) + (1783169024 * i15);
        int i17 = ((i5 * 1226044109) - 1701849991) + (i * 1226043089) + (i11 * 510) + (i12 * (-510)) + (i13 * 510) + (i4 * 1226043599) + (i2 * (-858626504)) + (i6 * 1069087493) + (i15 * 1627848704);
        int i18 = i16 + (i17 * i17 * 739704832);
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? onExtraCallback(objArr) : IAuthTabCallback(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        onPageScrollStateChanged onpagescrollstatechanged = (onPageScrollStateChanged) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(onpagescrollstatechanged);
        int i4 = onExtraCallback + 69;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    private static final Unit onTransact(onPageScrollStateChanged onpagescrollstatechanged, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 77;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            i |= 1;
        }
        IAuthTabCallback(onpagescrollstatechanged, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallbackWithResult + 95;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        ProfileStore profileStore = (ProfileStore) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return Boolean.valueOf(onWarmupCompleted(concurrentHashMap, iIntValue, profileStore));
        }
        onWarmupCompleted(concurrentHashMap, iIntValue, profileStore);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(onPageScrollStateChanged onpagescrollstatechanged, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 37;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(onpagescrollstatechanged, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallbackWithResult + 35;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onWarmupCompleted(ProfileStore profileStore, SdkTemplate.onNavigationEvent onnavigationevent, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 23;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {profileStore, onnavigationevent, Integer.valueOf(i)};
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
        if (i4 != 0) {
            return (QuirksExternalSyntheticBackport0) onNavigationEvent(2136572791, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), objArr, iOnNavigationEvent, iOnNavigationEvent2, -2136572789, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent());
        }
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(Function1 function1, Map map) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback((Function1<? super Integer, Unit>) function1, (Map<Integer, WebViewCompatExternalSyntheticLambda1>) map);
        if (i3 == 0) {
            int i4 = 29 / 0;
        }
        int i5 = onExtraCallbackWithResult + 71;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean onNavigationEvent(ConcurrentHashMap concurrentHashMap, int i, ProfileStore profileStore) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 79;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        WebViewCompatExternalSyntheticLambda1 webViewCompatExternalSyntheticLambda1 = (WebViewCompatExternalSyntheticLambda1) concurrentHashMap.get(Integer.valueOf(i));
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (webViewCompatExternalSyntheticLambda1 != null && webViewCompatExternalSyntheticLambda1.onExtraCallbackWithResult()) {
            int i5 = onExtraCallback + 99;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                boolean zBooleanValue = ((Boolean) profileStore.IAuthTabCallbackDefault().invoke()).booleanValue();
                int i6 = 98 / 0;
                if (zBooleanValue) {
                    return true;
                }
            } else if (!(!((Boolean) profileStore.IAuthTabCallbackDefault().invoke()).booleanValue())) {
            }
        }
        return false;
    }

    private static final boolean onWarmupCompleted(ConcurrentHashMap concurrentHashMap, int i, ProfileStore profileStore) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 1;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object obj = concurrentHashMap.get(Integer.valueOf(i));
        if (i4 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        WebViewCompatExternalSyntheticLambda1 webViewCompatExternalSyntheticLambda1 = (WebViewCompatExternalSyntheticLambda1) obj;
        if (webViewCompatExternalSyntheticLambda1 == null || !webViewCompatExternalSyntheticLambda1.IAuthTabCallback() || !((Boolean) profileStore.IAuthTabCallbackDefault().invoke()).booleanValue()) {
            return false;
        }
        int i5 = onExtraCallback + 115;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean asInterface(ConcurrentHashMap concurrentHashMap, int i, ProfileStore profileStore) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 77;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        WebViewCompatExternalSyntheticLambda1 webViewCompatExternalSyntheticLambda1 = (WebViewCompatExternalSyntheticLambda1) concurrentHashMap.get(Integer.valueOf(i));
        if (webViewCompatExternalSyntheticLambda1 != null) {
            int i5 = onExtraCallback + 25;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (webViewCompatExternalSyntheticLambda1.onExtraCallback()) {
                int i7 = onExtraCallbackWithResult + 95;
                onExtraCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    boolean zBooleanValue = ((Boolean) profileStore.IAuthTabCallbackDefault().invoke()).booleanValue();
                    int i8 = 39 / 0;
                    if (zBooleanValue) {
                        return true;
                    }
                } else if (((Boolean) profileStore.IAuthTabCallbackDefault().invoke()).booleanValue()) {
                }
            }
        }
        return false;
    }

    private static final Unit onWarmupCompleted(calculatePageOffsets calculatepageoffsets, findResAndMsg findresandmsg, final ProfileStore profileStore, SdkTemplate.onNavigationEvent onnavigationevent, final ConcurrentHashMap concurrentHashMap, final int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 11;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (calculatepageoffsets != null) {
            Object[] objArr = {calculatepageoffsets, findresandmsg, profileStore.IAuthTabCallback(), dispatchOnPageScrolled.onNavigationEvent.IAuthTabCallback(dispatchOnPageSelected.onExtraCallback(onnavigationevent, i)), dispatchOnPageSelected.IAuthTabCallback(onnavigationevent, i), new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNanaListTemplateKt$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = onWarmupCompleted + 3;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    Boolean boolValueOf = Boolean.valueOf(onSafeBrowsingHit.onExtraCallback(concurrentHashMap, i, profileStore));
                    int i7 = onWarmupCompleted + 57;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        return boolValueOf;
                    }
                    throw null;
                }
            }, new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNanaListTemplateKt$$ExternalSyntheticLambda1
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = onNavigationEvent + 99;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                    int i7 = i;
                    Boolean boolValueOf = Boolean.valueOf(((Boolean) onSafeBrowsingHit.onNavigationEvent(-2075902433, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{concurrentHashMap2, Integer.valueOf(i7), profileStore}, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), 2075902434, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent())).booleanValue());
                    int i8 = onExtraCallbackWithResult + 57;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    return boolValueOf;
                }
            }, new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNanaListTemplateKt$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = IAuthTabCallback + 59;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    Boolean boolValueOf = Boolean.valueOf(onSafeBrowsingHit.IAuthTabCallback(concurrentHashMap, i, profileStore));
                    int i7 = IAuthTabCallback + 125;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 != 0) {
                        return boolValueOf;
                    }
                    throw null;
                }
            }};
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            calculatePageOffsets.onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, 13907675, -13907655, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent);
            int i4 = onExtraCallback + 107;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(onPageScrollStateChanged onpagescrollstatechanged, Integer num) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onpagescrollstatechanged.onNavigationEvent().invoke(num);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 121;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(onPageScrollStateChanged onpagescrollstatechanged) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onpagescrollstatechanged.asInterface();
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 7;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(ConcurrentHashMap concurrentHashMap, Function1 function1, int i, WebViewCompatExternalSyntheticLambda1 webViewCompatExternalSyntheticLambda1) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 117;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(webViewCompatExternalSyntheticLambda1, "");
        concurrentHashMap.put(Integer.valueOf(i), webViewCompatExternalSyntheticLambda1);
        function1.invoke(Integer.valueOf(i));
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallbackWithResult + 119;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        ProfileStore profileStore = (ProfileStore) objArr[0];
        final SdkTemplate.onNavigationEvent onnavigationevent = (SdkTemplate.onNavigationEvent) objArr[1];
        final int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = onPageSelected.onExtraCallbackWithResult(profileStore.onWarmupCompleted(), profileStore.onExtraCallback().onExtraCallbackWithResult().IAuthTabCallback(), new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNanaListTemplateKt$$ExternalSyntheticLambda12
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 49;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                SdkTemplate.onNavigationEvent onnavigationevent2 = onnavigationevent;
                if (i4 != 0) {
                    return onSafeBrowsingHit.IAuthTabCallback(onnavigationevent2, iIntValue);
                }
                int i5 = 0 / 0;
                return onSafeBrowsingHit.IAuthTabCallback(onnavigationevent2, iIntValue);
            }
        });
        int i2 = onExtraCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 76 / 0;
        }
        return quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
    }

    private static final String onWarmupCompleted(SdkTemplate.onNavigationEvent onnavigationevent, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 29;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String strIAuthTabCallback = dispatchOnPageSelected.IAuthTabCallback(onnavigationevent, i);
        int i5 = onExtraCallback + 55;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return strIAuthTabCallback;
        }
        throw null;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Function1<Integer, Unit> $fireRow;
        final /* synthetic */ ConcurrentHashMap<Integer, WebViewCompatExternalSyntheticLambda1> $rowImpressions;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallback(Function1<? super Integer, Unit> function1, ConcurrentHashMap<Integer, WebViewCompatExternalSyntheticLambda1> concurrentHashMap, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$fireRow = function1;
            this.$rowImpressions = concurrentHashMap;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$fireRow, this.$rowImpressions, access13800Var);
            int i2 = IAuthTabCallback + 9;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 77;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 97;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r3.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r3.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            kotlin.ResultKt.onNavigationEvent(r4);
            o.onSafeBrowsingHit.onWarmupCompleted(r3.$fireRow, r3.$rowImpressions);
            r4 = kotlin.Unit.INSTANCE;
            r1 = o.onSafeBrowsingHit.IAuthTabCallback.onNavigationEvent + 95;
            o.onSafeBrowsingHit.IAuthTabCallback.IAuthTabCallback = r1 % 128;
            r1 = r1 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 85 / 0;
            }
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Function1<Integer, Unit> $fireRow;
        final /* synthetic */ ConcurrentHashMap<Integer, WebViewCompatExternalSyntheticLambda1> $rowImpressions;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onNavigationEvent(Function1<? super Integer, Unit> function1, ConcurrentHashMap<Integer, WebViewCompatExternalSyntheticLambda1> concurrentHashMap, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$fireRow = function1;
            this.$rowImpressions = concurrentHashMap;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$fireRow, this.$rowImpressions, access13800Var);
            int i2 = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 117;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallback;
            }
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                objInvokeSuspend = onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 31 / 0;
            } else {
                objInvokeSuspend = onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onWarmupCompleted + 63;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onWarmupCompleted + 101;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = onWarmupCompleted + 23;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(400L, this) == objOnWarmupCompleted) {
                    int i7 = onExtraCallbackWithResult + 69;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            }
            onSafeBrowsingHit.onWarmupCompleted(this.$fireRow, this.$rowImpressions);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b A[PHI: r1
      0x003b: PHI (r1v9 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v10 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x002e, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[PHI: r1
      0x0030: PHI (r1v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v10 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x002e, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@NotNull final onPageScrollStateChanged onpagescrollstatechanged, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function2 function2;
        ConcurrentHashMap concurrentHashMap;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 47;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onpagescrollstatechanged, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1717828040);
            if ((i & 121) == 0) {
                i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onpagescrollstatechanged) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(onpagescrollstatechanged, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1717828040);
            if ((i & 6) == 0) {
            }
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 3) != 2, i2 & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1717828040, i2, -1, "im.toss.ads_sdk.ui.compose.NanaListTemplate (NativeAdsNanaListTemplate.kt:29)");
            }
            SdkTemplate sdkTemplateIAuthTabCallbackStub = onpagescrollstatechanged.IAuthTabCallbackStub();
            Object obj = null;
            final SdkTemplate.onNavigationEvent onnavigationevent = !(sdkTemplateIAuthTabCallbackStub instanceof SdkTemplate.onNavigationEvent) ? null : (SdkTemplate.onNavigationEvent) sdkTemplateIAuthTabCallbackStub;
            if (onnavigationevent == null) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i5 = onExtraCallback + 11;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    return;
                } else {
                    function2 = new Function2() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNanaListTemplateKt$$ExternalSyntheticLambda3
                        private static int onExtraCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj2, Object obj3) {
                            int i6 = 2 % 2;
                            int i7 = onExtraCallback + 113;
                            onNavigationEvent = i7 % 128;
                            int i8 = i7 % 2;
                            Unit unitOnWarmupCompleted = onSafeBrowsingHit.onWarmupCompleted(onpagescrollstatechanged, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i9 = onNavigationEvent + 121;
                            onExtraCallback = i9 % 128;
                            if (i9 % 2 != 0) {
                                return unitOnWarmupCompleted;
                            }
                            Object obj4 = null;
                            obj4.hashCode();
                            throw null;
                        }
                    };
                }
            } else {
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onnavigationevent);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!zOnNavigationEvent) {
                    int i6 = onExtraCallbackWithResult + 117;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda0.onNavigationEvent(onnavigationevent);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    RearDisplayPresentationSessionPresenterImpl rearDisplayPresentationSessionPresenterImpl = (RearDisplayPresentationSessionPresenterImpl) objOnMinimized;
                    if (rearDisplayPresentationSessionPresenterImpl == null) {
                        int i8 = onExtraCallback + 97;
                        onExtraCallbackWithResult = i8 % 128;
                        if (i8 % 2 != 0) {
                            CameraConfigExternalSyntheticLambda0.asBinder();
                            throw null;
                        }
                        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                            return;
                        } else {
                            function2 = new Function2() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNanaListTemplateKt$$ExternalSyntheticLambda4
                                private static int IAuthTabCallback = 0;
                                private static int onNavigationEvent = 1;

                                public final Object invoke(Object obj2, Object obj3) {
                                    int i9 = 2 % 2;
                                    int i10 = IAuthTabCallback + 57;
                                    onNavigationEvent = i10 % 128;
                                    if (i10 % 2 == 0) {
                                        onSafeBrowsingHit.onExtraCallback(onpagescrollstatechanged, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                        Object obj4 = null;
                                        obj4.hashCode();
                                        throw null;
                                    }
                                    Unit unitOnExtraCallback = onSafeBrowsingHit.onExtraCallback(onpagescrollstatechanged, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                    int i11 = onNavigationEvent + 79;
                                    IAuthTabCallback = i11 % 128;
                                    int i12 = i11 % 2;
                                    return unitOnExtraCallback;
                                }
                            };
                        }
                    } else {
                        final ProfileStore profileStoreOnWarmupCompleted = onpagescrollstatechanged.onWarmupCompleted();
                        if (profileStoreOnWarmupCompleted == null) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1279576755);
                            WebViewProviderAdapterExternalSyntheticLambda3.onExtraCallbackWithResult(rearDisplayPresentationSessionPresenterImpl, null, null, null, null, onpagescrollstatechanged.onExtraCallback(), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 94);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                return;
                            } else {
                                function2 = new Function2() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNanaListTemplateKt$$ExternalSyntheticLambda5
                                    private static int onExtraCallback = 0;
                                    private static int onWarmupCompleted = 1;

                                    public final Object invoke(Object obj2, Object obj3) {
                                        int i9 = 2 % 2;
                                        int i10 = onWarmupCompleted + 113;
                                        onExtraCallback = i10 % 128;
                                        if (i10 % 2 != 0) {
                                            onPageScrollStateChanged onpagescrollstatechanged2 = onpagescrollstatechanged;
                                            int i11 = i;
                                            int iIntValue = ((Integer) obj3).intValue();
                                            throw null;
                                        }
                                        onPageScrollStateChanged onpagescrollstatechanged3 = onpagescrollstatechanged;
                                        int i12 = i;
                                        int iIntValue2 = ((Integer) obj3).intValue();
                                        Unit unit = (Unit) onSafeBrowsingHit.onNavigationEvent(-1902247915, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{onpagescrollstatechanged3, Integer.valueOf(i12), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue2)}, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), 1902247919, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent());
                                        int i13 = onExtraCallback + 115;
                                        onWarmupCompleted = i13 % 128;
                                        int i14 = i13 % 2;
                                        return unit;
                                    }
                                };
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1279456630);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                                int i9 = onExtraCallback + 33;
                                onExtraCallbackWithResult = i9 % 128;
                                int i10 = i9 % 2;
                                objOnMinimized2 = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                            }
                            final findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized2;
                            getPageWidth getpagewidthIAuthTabCallback = profileStoreOnWarmupCompleted.IAuthTabCallback();
                            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onnavigationevent);
                            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getpagewidthIAuthTabCallback);
                            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if ((zOnNavigationEvent3 | zOnNavigationEvent2) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized3 = new ConcurrentHashMap();
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                            }
                            final ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) objOnMinimized3;
                            NativeAdsManager nativeAdsManagerOnExtraCallbackWithResult = profileStoreOnWarmupCompleted.onExtraCallbackWithResult();
                            final calculatePageOffsets calculatepageoffsetsOnExtraCallbackWithResult = nativeAdsManagerOnExtraCallbackWithResult != null ? nativeAdsManagerOnExtraCallbackWithResult.onExtraCallbackWithResult() : null;
                            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(calculatepageoffsetsOnExtraCallbackWithResult);
                            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(findresandmsg);
                            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(profileStoreOnWarmupCompleted);
                            boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onnavigationevent);
                            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(concurrentHashMap2);
                            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (((zOnExtraCallback | zOnExtraCallback2 | zOnExtraCallback3 | zOnExtraCallback4) || zOnNavigationEvent4) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                                final SdkTemplate.onNavigationEvent onnavigationevent2 = onnavigationevent;
                                concurrentHashMap = concurrentHashMap2;
                                objOnMinimized4 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNanaListTemplateKt$$ExternalSyntheticLambda6
                                    private static int onExtraCallbackWithResult = 1;
                                    private static int onNavigationEvent;

                                    public final Object invoke(Object obj2) {
                                        int i11 = 2 % 2;
                                        int i12 = onNavigationEvent + 5;
                                        onExtraCallbackWithResult = i12 % 128;
                                        int i13 = i12 % 2;
                                        calculatePageOffsets calculatepageoffsets = calculatepageoffsetsOnExtraCallbackWithResult;
                                        findResAndMsg findresandmsg2 = findresandmsg;
                                        ProfileStore profileStore = profileStoreOnWarmupCompleted;
                                        SdkTemplate.onNavigationEvent onnavigationevent3 = onnavigationevent2;
                                        ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
                                        int iIntValue = ((Integer) obj2).intValue();
                                        if (i13 == 0) {
                                            onSafeBrowsingHit.IAuthTabCallback(calculatepageoffsets, findresandmsg2, profileStore, onnavigationevent3, concurrentHashMap3, iIntValue);
                                            Object obj3 = null;
                                            obj3.hashCode();
                                            throw null;
                                        }
                                        Unit unitIAuthTabCallback = onSafeBrowsingHit.IAuthTabCallback(calculatepageoffsets, findresandmsg2, profileStore, onnavigationevent3, concurrentHashMap3, iIntValue);
                                        int i14 = onNavigationEvent + 57;
                                        onExtraCallbackWithResult = i14 % 128;
                                        int i15 = i14 % 2;
                                        return unitIAuthTabCallback;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                            } else {
                                concurrentHashMap = concurrentHashMap2;
                            }
                            final Function1 function1 = (Function1) objOnMinimized4;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1565256937, profileStoreOnWarmupCompleted.IAuthTabCallback());
                            boolean zOnExtraCallback5 = onpagescrollstatechanged.onExtraCallback();
                            boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onpagescrollstatechanged);
                            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!zOnExtraCallback6) {
                                int i11 = onExtraCallback + 67;
                                onExtraCallbackWithResult = i11 % 128;
                                int i12 = i11 % 2;
                                if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized5 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNanaListTemplateKt$$ExternalSyntheticLambda7
                                        private static int onExtraCallbackWithResult = 0;
                                        private static int onWarmupCompleted = 1;

                                        public final Object invoke(Object obj2) {
                                            int i13 = 2 % 2;
                                            int i14 = onWarmupCompleted + 25;
                                            onExtraCallbackWithResult = i14 % 128;
                                            int i15 = i14 % 2;
                                            onPageScrollStateChanged onpagescrollstatechanged2 = onpagescrollstatechanged;
                                            Integer num = (Integer) obj2;
                                            if (i15 == 0) {
                                                int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
                                                int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
                                                return (Unit) onSafeBrowsingHit.onNavigationEvent(-32577231, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{onpagescrollstatechanged2, num}, iOnNavigationEvent, iOnNavigationEvent2, 32577231, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent());
                                            }
                                            int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
                                            int iOnNavigationEvent4 = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
                                            Unit unit = (Unit) onSafeBrowsingHit.onNavigationEvent(-32577231, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{onpagescrollstatechanged2, num}, iOnNavigationEvent3, iOnNavigationEvent4, 32577231, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent());
                                            int i16 = 9 / 0;
                                            return unit;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                                }
                                Function1 function12 = (Function1) objOnMinimized5;
                                boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onpagescrollstatechanged);
                                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!zOnExtraCallback7) {
                                    int i13 = onExtraCallback + 67;
                                    onExtraCallbackWithResult = i13 % 128;
                                    if (i13 % 2 != 0) {
                                        onwarmupcompleted.onExtraCallback();
                                        throw null;
                                    }
                                    if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                                        objOnMinimized6 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNanaListTemplateKt$$ExternalSyntheticLambda8
                                            private static int onExtraCallback = 0;
                                            private static int onExtraCallbackWithResult = 1;

                                            public final Object invoke() {
                                                int i14 = 2 % 2;
                                                int i15 = onExtraCallbackWithResult + 49;
                                                onExtraCallback = i15 % 128;
                                                int i16 = i15 % 2;
                                                Unit unit = (Unit) onSafeBrowsingHit.onNavigationEvent(-376372578, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{onpagescrollstatechanged}, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), 376372581, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent());
                                                int i17 = onExtraCallbackWithResult + 113;
                                                onExtraCallback = i17 % 128;
                                                if (i17 % 2 == 0) {
                                                    return unit;
                                                }
                                                Object obj2 = null;
                                                obj2.hashCode();
                                                throw null;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                                    }
                                    Function0 function0 = (Function0) objOnMinimized6;
                                    final ConcurrentHashMap concurrentHashMap3 = concurrentHashMap;
                                    boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(concurrentHashMap3);
                                    boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(function1);
                                    Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (!(zOnNavigationEvent5 | zOnNavigationEvent6)) {
                                        int i14 = onExtraCallback + 9;
                                        onExtraCallbackWithResult = i14 % 128;
                                        int i15 = i14 % 2;
                                        Object obj2 = objOnMinimized7;
                                        if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                                            Function2 function22 = new Function2() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNanaListTemplateKt$$ExternalSyntheticLambda9
                                                private static int onExtraCallback = 1;
                                                private static int onNavigationEvent;

                                                public final Object invoke(Object obj3, Object obj4) {
                                                    int i16 = 2 % 2;
                                                    int i17 = onNavigationEvent + 117;
                                                    onExtraCallback = i17 % 128;
                                                    int i18 = i17 % 2;
                                                    ConcurrentHashMap concurrentHashMap4 = concurrentHashMap3;
                                                    if (i18 != 0) {
                                                        return onSafeBrowsingHit.onExtraCallback(concurrentHashMap4, function1, ((Integer) obj3).intValue(), (WebViewCompatExternalSyntheticLambda1) obj4);
                                                    }
                                                    onSafeBrowsingHit.onExtraCallback(concurrentHashMap4, function1, ((Integer) obj3).intValue(), (WebViewCompatExternalSyntheticLambda1) obj4);
                                                    Object obj5 = null;
                                                    obj5.hashCode();
                                                    throw null;
                                                }
                                            };
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function22);
                                            int i16 = onExtraCallback + 55;
                                            onExtraCallbackWithResult = i16 % 128;
                                            int i17 = i16 % 2;
                                            obj2 = function22;
                                        }
                                        Function2 function23 = (Function2) obj2;
                                        boolean zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(profileStoreOnWarmupCompleted);
                                        boolean zOnExtraCallback9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onnavigationevent);
                                        Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (!(zOnExtraCallback8 | zOnExtraCallback9)) {
                                            Object obj3 = objOnMinimized8;
                                            if (objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                                                Function1 function13 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNanaListTemplateKt$$ExternalSyntheticLambda10
                                                    private static int onExtraCallbackWithResult = 0;
                                                    private static int onWarmupCompleted = 1;

                                                    public final Object invoke(Object obj4) {
                                                        int i18 = 2 % 2;
                                                        int i19 = onWarmupCompleted + 25;
                                                        onExtraCallbackWithResult = i19 % 128;
                                                        int i20 = i19 % 2;
                                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = onSafeBrowsingHit.onWarmupCompleted(profileStoreOnWarmupCompleted, onnavigationevent, ((Integer) obj4).intValue());
                                                        int i21 = onExtraCallbackWithResult + 23;
                                                        onWarmupCompleted = i21 % 128;
                                                        int i22 = i21 % 2;
                                                        return quirksExternalSyntheticBackport0OnWarmupCompleted;
                                                    }
                                                };
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function13);
                                                obj3 = function13;
                                            }
                                            WebViewProviderAdapterExternalSyntheticLambda3.onExtraCallbackWithResult(rearDisplayPresentationSessionPresenterImpl, null, function12, function0, function23, zOnExtraCallback5, (Function1) obj3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 2);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStub();
                                            Boolean bool = (Boolean) profileStoreOnWarmupCompleted.IAuthTabCallbackDefault().invoke();
                                            getPageWidth getpagewidthIAuthTabCallback2 = profileStoreOnWarmupCompleted.IAuthTabCallback();
                                            boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(function1);
                                            boolean zOnNavigationEvent8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(concurrentHashMap3);
                                            Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if ((zOnNavigationEvent7 | zOnNavigationEvent8) || objOnMinimized9 == onwarmupcompleted.onExtraCallback()) {
                                                objOnMinimized9 = new IAuthTabCallback(function1, concurrentHashMap3, null);
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized9);
                                            }
                                            isZslDisabledByByUserCaseConfig.IAuthTabCallback(bool, onnavigationevent, getpagewidthIAuthTabCallback2, (Function2) objOnMinimized9, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                            getPageWidth getpagewidthIAuthTabCallback3 = profileStoreOnWarmupCompleted.IAuthTabCallback();
                                            boolean zOnNavigationEvent9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(function1);
                                            boolean zOnNavigationEvent10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(concurrentHashMap3);
                                            Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if ((zOnNavigationEvent9 | zOnNavigationEvent10) || objOnMinimized10 == onwarmupcompleted.onExtraCallback()) {
                                                objOnMinimized10 = new onNavigationEvent(function1, concurrentHashMap3, null);
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized10);
                                            }
                                            isZslDisabledByByUserCaseConfig.onExtraCallback(onnavigationevent, getpagewidthIAuthTabCallback3, (Function2) objOnMinimized10, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                CameraConfigExternalSyntheticLambda0.onTransact();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
        }
        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            function2 = new Function2() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNanaListTemplateKt$$ExternalSyntheticLambda11
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj4, Object obj5) {
                    int i18 = 2 % 2;
                    int i19 = onWarmupCompleted + 111;
                    onExtraCallback = i19 % 128;
                    int i20 = i19 % 2;
                    Unit unitOnExtraCallbackWithResult = onSafeBrowsingHit.onExtraCallbackWithResult(onpagescrollstatechanged, i, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                    int i21 = onWarmupCompleted + 13;
                    onExtraCallback = i21 % 128;
                    int i22 = i21 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            };
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
        }
    }

    private static final void onExtraCallback(Function1<? super Integer, Unit> function1, Map<Integer, WebViewCompatExternalSyntheticLambda1> map) {
        int i = 2 % 2;
        Iterator it = CollectionsKt.toList(map.keySet()).iterator();
        while (it.hasNext()) {
            function1.invoke(it.next());
            int i2 = onExtraCallbackWithResult + 59;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = onExtraCallback + 47;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallback(onPageScrollStateChanged onpagescrollstatechanged, Integer num) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
        return (Unit) onNavigationEvent(-32577231, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{onpagescrollstatechanged, num}, iOnNavigationEvent, iOnNavigationEvent2, 32577231, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallback(onPageScrollStateChanged onpagescrollstatechanged) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
        return (Unit) onNavigationEvent(-376372578, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{onpagescrollstatechanged}, iOnNavigationEvent, iOnNavigationEvent2, 376372581, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent());
    }

    public static /* synthetic */ Unit onNavigationEvent(onPageScrollStateChanged onpagescrollstatechanged, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onNavigationEvent(-1902247915, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{onpagescrollstatechanged, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), 1902247919, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent());
    }

    private static final QuirksExternalSyntheticBackport0 onExtraCallback(ProfileStore profileStore, SdkTemplate.onNavigationEvent onnavigationevent, int i) {
        return (QuirksExternalSyntheticBackport0) onNavigationEvent(2136572791, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{profileStore, onnavigationevent, Integer.valueOf(i)}, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), -2136572789, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent());
    }
}
