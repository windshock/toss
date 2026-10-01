package im.toss.rn.toss.core.observability;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.internal.ads.zzgc;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenFragment;
import im.toss.observability.lcp.RnEmbeddedShowTriggerRegistry;
import im.toss.observability.lcp.RnRuntimeVariantProvider;
import im.toss.observability.lcp.RnScreenNavigationTypeRegistry;
import im.toss.rn.toss.core.observability.ReactNativeRouteLcpSessionPolicy;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;
import o.access8100;
import o.adOpenedFullscreen;
import o.clearRevision;
import o.finishFromSdk;
import o.isHidingNavigationBar;
import o.r8lambdaqkORy4QEzD5SEb4LtHIWqneWssE;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ReactNativeRouteLcpSessionManager {
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private final Provider<finishFromSdk> IAuthTabCallback;
    private final ReactNativeRouteLcpSessionPolicy IAuthTabCallbackDefault;
    private final RnEmbeddedShowTriggerRegistry asBinder;
    private final RnScreenNavigationTypeRegistry asInterface;
    private final Set<FlowMeasureLazyPolicyExternalSyntheticLambda3> onExtraCallback;
    private final Set<Fragment> onExtraCallbackWithResult;
    private final adOpenedFullscreen onNavigationEvent;
    private final ReactNativeRouteLcpSessionManager$callbacks$1 onWarmupCompleted;

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i6;
        int i9 = (~(i7 | i8)) | (~(i7 | i5)) | (~(i8 | i5));
        int i10 = ~(i6 | i7);
        int i11 = i5 | i10 | (~(i8 | i));
        int i12 = i5 + i + i3 + (1997535707 * i4) + (1930545336 * i2);
        int i13 = i12 * i12;
        int i14 = ((-1352905585) * i5) + 1468203008 + ((-417352845) * i) + (i9 * 1679707278) + (1679707278 * i10) + ((-1679707278) * i11) + (1262354432 * i3) + ((-1408630784) * i4) + ((-2070937600) * i2) + (392888320 * i13);
        int i15 = (i5 * (-2054695253)) + 138751921 + (i * (-2054693473)) + (i9 * (-890)) + (i10 * (-890)) + (i11 * 890) + (i3 * (-2054694363)) + (i4 * 1502648999) + (i2 * 931574424) + (i13 * (-2139684864));
        if (i14 + (i15 * i15 * (-174260224)) == 1) {
            return onExtraCallback(objArr);
        }
        ReactNativeRouteLcpSessionManager reactNativeRouteLcpSessionManager = (ReactNativeRouteLcpSessionManager) objArr[0];
        FragmentActivity fragmentActivity = (FragmentActivity) objArr[1];
        int i16 = 2 % 2;
        int i17 = onTransact + 31;
        IAuthTabCallbackStub = i17 % 128;
        int i18 = i17 % 2;
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        FlowMeasureLazyPolicyExternalSyntheticLambda3 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        reactNativeRouteLcpSessionManager.IAuthTabCallback(supportFragmentManager);
        int i19 = onTransact + 83;
        IAuthTabCallbackStub = i19 % 128;
        int i20 = i19 % 2;
        return null;
    }

    @Inject
    public ReactNativeRouteLcpSessionManager(@NotNull Provider<finishFromSdk> provider, @NotNull adOpenedFullscreen adopenedfullscreen, @NotNull RnScreenNavigationTypeRegistry rnScreenNavigationTypeRegistry, @NotNull RnEmbeddedShowTriggerRegistry rnEmbeddedShowTriggerRegistry) {
        Intrinsics.checkNotNullParameter(provider, "");
        Intrinsics.checkNotNullParameter(adopenedfullscreen, "");
        Intrinsics.checkNotNullParameter(rnScreenNavigationTypeRegistry, "");
        Intrinsics.checkNotNullParameter(rnEmbeddedShowTriggerRegistry, "");
        this.IAuthTabCallback = provider;
        this.onNavigationEvent = adopenedfullscreen;
        this.asInterface = rnScreenNavigationTypeRegistry;
        this.asBinder = rnEmbeddedShowTriggerRegistry;
        this.IAuthTabCallbackDefault = new ReactNativeRouteLcpSessionPolicy();
        this.onExtraCallbackWithResult = new LinkedHashSet();
        this.onExtraCallback = new LinkedHashSet();
        this.onWarmupCompleted = new ReactNativeRouteLcpSessionManager$callbacks$1(this);
    }

    public static final /* synthetic */ adOpenedFullscreen onExtraCallback(ReactNativeRouteLcpSessionManager reactNativeRouteLcpSessionManager) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 121;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        adOpenedFullscreen adopenedfullscreen = reactNativeRouteLcpSessionManager.onNavigationEvent;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 11;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return adopenedfullscreen;
    }

    public static final /* synthetic */ Set onWarmupCompleted(ReactNativeRouteLcpSessionManager reactNativeRouteLcpSessionManager) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        Set<Fragment> set = reactNativeRouteLcpSessionManager.onExtraCallbackWithResult;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 5;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return set;
        }
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(ReactNativeRouteLcpSessionManager reactNativeRouteLcpSessionManager, Fragment fragment, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        reactNativeRouteLcpSessionManager.onExtraCallback(fragment, str);
        int i4 = onTransact + 11;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(ReactNativeRouteLcpSessionManager reactNativeRouteLcpSessionManager, ScreenFragment screenFragment, Screen screen) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 89;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        reactNativeRouteLcpSessionManager.onNavigationEvent(screenFragment, screen);
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        int i5 = onTransact + 55;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 88 / 0;
        }
    }

    public final void onExtraCallbackWithResult(@NotNull Fragment fragment) {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(fragment, "");
            FlowMeasureLazyPolicyExternalSyntheticLambda3 childFragmentManager = fragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            IAuthTabCallback(childFragmentManager);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(fragment, "");
        FlowMeasureLazyPolicyExternalSyntheticLambda3 childFragmentManager2 = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
        IAuthTabCallback(childFragmentManager2);
        int i3 = onTransact + 11;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 53 / 0;
        }
    }

    private final void IAuthTabCallback(FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3) {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (!this.onExtraCallback.contains(flowMeasureLazyPolicyExternalSyntheticLambda3)) {
            int i4 = IAuthTabCallbackStub + 105;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                if (((finishFromSdk) this.IAuthTabCallback.get()).onExtraCallbackWithResult()) {
                    this.onExtraCallback.add(flowMeasureLazyPolicyExternalSyntheticLambda3);
                    flowMeasureLazyPolicyExternalSyntheticLambda3.onNavigationEvent(this.onWarmupCompleted, true);
                    return;
                }
                return;
            }
            ((finishFromSdk) this.IAuthTabCallback.get()).onExtraCallbackWithResult();
            throw null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        if (r3 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        if (r3 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        r1 = r1 + 3;
        im.toss.rn.toss.core.observability.ReactNativeRouteLcpSessionManager.onTransact = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
    
        if ((r1 % 2) != 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        r15 = com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult();
        r11 = com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult();
        r13 = com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult();
        onWarmupCompleted(-1859275491, com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult(), r11, new java.lang.Object[]{r16, r17, r3, true, 4, null}, r13, 1859275492, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b8, code lost:
    
        r15 = com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult();
        r11 = com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult();
        r13 = com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult();
        onWarmupCompleted(-1859275491, com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult(), r11, new java.lang.Object[]{r16, r17, r3, false, 4, null}, r13, 1859275492, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00eb, code lost:
    
        throw new java.lang.IllegalArgumentException("Required value was null.");
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(ScreenFragment screenFragment, Screen screen) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        String screenId = screen.getScreenId();
        if (screenId != null) {
            int i2 = onTransact + 89;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 98 / 0;
                if (screenId.length() <= 0) {
                    screenId = null;
                }
            } else if (screenId.length() <= 0) {
            }
        }
        String str = screenId;
        ReactNativeRouteLcpSessionPolicy.Decision decisionOnExtraCallback = this.IAuthTabCallbackDefault.onExtraCallback(str);
        if (decisionOnExtraCallback instanceof ReactNativeRouteLcpSessionPolicy.Decision.Skip) {
            r8lambdaqkORy4QEzD5SEb4LtHIWqneWssE.onExtraCallbackWithResult();
            ReactNativeRouteLcpSessionPolicy.Decision.Skip skip = (ReactNativeRouteLcpSessionPolicy.Decision.Skip) decisionOnExtraCallback;
            skip.onExtraCallbackWithResult();
            if (Intrinsics.areEqual(skip.onExtraCallbackWithResult(), "initial-route")) {
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                int i4 = onTransact + 107;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                onNavigationEvent(screenFragment, str, true);
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(decisionOnExtraCallback, ReactNativeRouteLcpSessionPolicy.Decision.Start.IAuthTabCallback)) {
            throw new NoWhenBranchMatchedException();
        }
        int i6 = IAuthTabCallbackStub;
        int i7 = i6 + 91;
        onTransact = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 70 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        boolean z = false;
        ReactNativeRouteLcpSessionManager reactNativeRouteLcpSessionManager = (ReactNativeRouteLcpSessionManager) objArr[0];
        ScreenFragment screenFragment = (ScreenFragment) objArr[1];
        String str = (String) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int iIntValue = ((Number) objArr[4]).intValue();
        Object obj = objArr[5];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 3;
        onTransact = i3 % 128;
        if (i3 % 2 != 0 ? (4 & iIntValue) == 0 : (4 & iIntValue) == 0) {
            z = zBooleanValue;
        } else {
            int i4 = i2 + 89;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        reactNativeRouteLcpSessionManager.onNavigationEvent(screenFragment, str, z);
        int i6 = onTransact + 109;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private final void onNavigationEvent(ScreenFragment screenFragment, String str, boolean z) {
        String strIEngagementSignalsCallbackStubProxy;
        boolean zUpdateVisuals;
        String str2;
        Map screenMetaData;
        int i = 2 % 2;
        int i2 = onTransact + 103;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        View view = screenFragment.getView();
        if (view != null) {
            Fragment parentFragment = screenFragment.getParentFragment();
            ReactNativeRouteHostResolverKt$findReactNativeRouteHost$1 reactNativeRouteHostResolverKt$findReactNativeRouteHost$1 = ReactNativeRouteHostResolverKt$findReactNativeRouteHost$1.onWarmupCompleted;
            Sequence sequenceOnWarmupCompleted = clearRevision.onWarmupCompleted(clearRevision.onExtraCallbackWithResult(parentFragment, reactNativeRouteHostResolverKt$findReactNativeRouteHost$1), new Function1<Object, Boolean>() { // from class: im.toss.rn.toss.core.observability.ReactNativeRouteLcpSessionManager$startSession$$inlined$findReactNativeRouteHost$1
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                static {
                    int i4 = onNavigationEvent + 95;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                }

                public /* synthetic */ Object invoke(Object obj) {
                    int i4 = 2 % 2;
                    int i5 = onWarmupCompleted + 99;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    Boolean boolOnWarmupCompleted = onWarmupCompleted(obj);
                    int i7 = onWarmupCompleted + 61;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    return boolOnWarmupCompleted;
                }

                public final Boolean onWarmupCompleted(Object obj) {
                    int i4 = 2 % 2;
                    int i5 = onWarmupCompleted + 65;
                    onExtraCallback = i5 % 128;
                    boolean z2 = obj instanceof ReactNativeScreenServiceHost;
                    if (i5 % 2 != 0) {
                        return Boolean.valueOf(z2);
                    }
                    Boolean.valueOf(z2);
                    throw null;
                }
            });
            Intrinsics.checkNotNull(sequenceOnWarmupCompleted, "");
            Object objAsBinder = clearRevision.asBinder(sequenceOnWarmupCompleted);
            if (objAsBinder == null) {
                Object activity = screenFragment.getActivity();
                if (!(activity instanceof ReactNativeScreenServiceHost)) {
                    activity = null;
                }
                objAsBinder = (ReactNativeScreenServiceHost) activity;
            }
            ReactNativeScreenServiceHost reactNativeScreenServiceHost = (ReactNativeScreenServiceHost) objAsBinder;
            ReactNativeRouteKey reactNativeRouteKey = ReactNativeRouteKey.onExtraCallbackWithResult;
            if (reactNativeScreenServiceHost != null) {
                strIEngagementSignalsCallbackStubProxy = reactNativeScreenServiceHost.IEngagementSignalsCallbackStubProxy();
                int i4 = onTransact + 49;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
            } else {
                strIEngagementSignalsCallbackStubProxy = null;
            }
            String strIAuthTabCallback = reactNativeRouteKey.IAuthTabCallback(strIEngagementSignalsCallbackStubProxy, reactNativeRouteKey.onNavigationEvent(str));
            if (strIAuthTabCallback != null) {
                if (reactNativeScreenServiceHost != null) {
                    int i6 = IAuthTabCallbackStub + 93;
                    onTransact = i6 % 128;
                    int i7 = i6 % 2;
                    zUpdateVisuals = reactNativeScreenServiceHost.updateVisuals();
                } else {
                    zUpdateVisuals = true;
                }
                if (z) {
                    int i8 = onTransact + 59;
                    IAuthTabCallbackStub = i8 % 128;
                    int i9 = i8 % 2;
                    if (zUpdateVisuals) {
                        return;
                    }
                }
                String str3 = (reactNativeScreenServiceHost == null || !this.asBinder.onWarmupCompleted(reactNativeScreenServiceHost)) ? "soft" : "warmup";
                this.asInterface.onExtraCallback(screenFragment, str3);
                finishFromSdk finishfromsdkOnExtraCallbackWithResult = this.onNavigationEvent.onExtraCallbackWithResult(screenFragment);
                finishfromsdkOnExtraCallbackWithResult.onExtraCallbackWithResult(screenFragment);
                finishfromsdkOnExtraCallbackWithResult.onNavigationEvent(true);
                finishfromsdkOnExtraCallbackWithResult.onWarmupCompleted(true);
                Map mapOnExtraCallback = access8100.onExtraCallback();
                mapOnExtraCallback.put("screenName", strIAuthTabCallback);
                mapOnExtraCallback.put("navigationType", str3);
                Sequence sequenceOnWarmupCompleted2 = clearRevision.onWarmupCompleted(clearRevision.onExtraCallbackWithResult(screenFragment.getParentFragment(), reactNativeRouteHostResolverKt$findReactNativeRouteHost$1), new Function1<Object, Boolean>() { // from class: im.toss.rn.toss.core.observability.ReactNativeRouteLcpSessionManager$startSession$lambda$0$$inlined$findReactNativeRouteHost$1
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    static {
                        int i10 = onWarmupCompleted + 11;
                        onNavigationEvent = i10 % 128;
                        if (i10 % 2 != 0) {
                            throw null;
                        }
                    }

                    public final Boolean IAuthTabCallback(Object obj) {
                        int i10 = 2 % 2;
                        int i11 = onExtraCallbackWithResult + 3;
                        onExtraCallback = i11 % 128;
                        int i12 = i11 % 2;
                        Boolean boolValueOf = Boolean.valueOf(obj instanceof isHidingNavigationBar);
                        int i13 = onExtraCallbackWithResult + 91;
                        onExtraCallback = i13 % 128;
                        if (i13 % 2 == 0) {
                            return boolValueOf;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }

                    public /* synthetic */ Object invoke(Object obj) {
                        int i10 = 2 % 2;
                        int i11 = onExtraCallbackWithResult + 103;
                        onExtraCallback = i11 % 128;
                        if (i11 % 2 == 0) {
                            return IAuthTabCallback(obj);
                        }
                        IAuthTabCallback(obj);
                        throw null;
                    }
                });
                Intrinsics.checkNotNull(sequenceOnWarmupCompleted2, "");
                Object objAsBinder2 = clearRevision.asBinder(sequenceOnWarmupCompleted2);
                if (objAsBinder2 == null) {
                    FragmentActivity activity2 = screenFragment.getActivity();
                    if (!(activity2 instanceof isHidingNavigationBar)) {
                        activity2 = null;
                    }
                    objAsBinder2 = (isHidingNavigationBar) activity2;
                }
                isHidingNavigationBar ishidingnavigationbar = (isHidingNavigationBar) objAsBinder2;
                Object obj = (ishidingnavigationbar == null || (screenMetaData = ishidingnavigationbar.getScreenMetaData()) == null) ? null : screenMetaData.get("company");
                if (obj instanceof String) {
                    int i10 = onTransact + 111;
                    IAuthTabCallbackStub = i10 % 128;
                    if (i10 % 2 != 0) {
                        throw null;
                    }
                    str2 = (String) obj;
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    mapOnExtraCallback.put("company", str2);
                }
                Sequence sequenceOnWarmupCompleted3 = clearRevision.onWarmupCompleted(clearRevision.onExtraCallbackWithResult(screenFragment.getParentFragment(), reactNativeRouteHostResolverKt$findReactNativeRouteHost$1), new Function1<Object, Boolean>() { // from class: im.toss.rn.toss.core.observability.ReactNativeRouteLcpSessionManager$startSession$lambda$0$$inlined$findReactNativeRouteHost$2
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    static {
                        int i11 = IAuthTabCallback + 25;
                        onNavigationEvent = i11 % 128;
                        if (i11 % 2 == 0) {
                            return;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }

                    public /* synthetic */ Object invoke(Object obj2) {
                        int i11 = 2 % 2;
                        int i12 = onWarmupCompleted + 59;
                        onExtraCallback = i12 % 128;
                        int i13 = i12 % 2;
                        Boolean boolOnWarmupCompleted = onWarmupCompleted(obj2);
                        int i14 = onWarmupCompleted + 13;
                        onExtraCallback = i14 % 128;
                        if (i14 % 2 == 0) {
                            return boolOnWarmupCompleted;
                        }
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }

                    public final Boolean onWarmupCompleted(Object obj2) {
                        int i11 = 2 % 2;
                        int i12 = onWarmupCompleted + 17;
                        onExtraCallback = i12 % 128;
                        boolean z2 = obj2 instanceof RnRuntimeVariantProvider;
                        if (i12 % 2 == 0) {
                            return Boolean.valueOf(z2);
                        }
                        Boolean.valueOf(z2);
                        throw null;
                    }
                });
                Intrinsics.checkNotNull(sequenceOnWarmupCompleted3, "");
                Object objAsBinder3 = clearRevision.asBinder(sequenceOnWarmupCompleted3);
                if (objAsBinder3 == null) {
                    FragmentActivity activity3 = screenFragment.getActivity();
                    objAsBinder3 = (RnRuntimeVariantProvider) (activity3 instanceof RnRuntimeVariantProvider ? activity3 : null);
                }
                RnRuntimeVariantProvider rnRuntimeVariantProvider = (RnRuntimeVariantProvider) objAsBinder3;
                if (rnRuntimeVariantProvider != null) {
                    int i11 = onTransact + 49;
                    IAuthTabCallbackStub = i11 % 128;
                    int i12 = i11 % 2;
                    String strOnExtraCallback = rnRuntimeVariantProvider.onExtraCallback();
                    if (strOnExtraCallback != null) {
                        mapOnExtraCallback.put("runtimeVariant", strOnExtraCallback);
                    }
                }
                Unit unit = Unit.INSTANCE;
                finishfromsdkOnExtraCallbackWithResult.IAuthTabCallback(view, access8100.onExtraCallbackWithResult(mapOnExtraCallback));
                this.onExtraCallbackWithResult.add(screenFragment);
            }
        }
    }

    private final void onExtraCallback(Fragment fragment, String str) {
        finishFromSdk finishfromsdkOnNavigationEvent;
        int i = 2 % 2;
        if (this.onExtraCallbackWithResult.remove(fragment)) {
            int i2 = IAuthTabCallbackStub + 13;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                finishfromsdkOnNavigationEvent = this.onNavigationEvent.onNavigationEvent(fragment);
                int i3 = 68 / 0;
                if (finishfromsdkOnNavigationEvent == null) {
                    return;
                }
            } else {
                finishfromsdkOnNavigationEvent = this.onNavigationEvent.onNavigationEvent(fragment);
                if (finishfromsdkOnNavigationEvent == null) {
                    return;
                }
            }
            finishfromsdkOnNavigationEvent.onNavigationEvent(str);
            int i4 = IAuthTabCallbackStub + 107;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static /* synthetic */ void IAuthTabCallback(ReactNativeRouteLcpSessionManager reactNativeRouteLcpSessionManager, ScreenFragment screenFragment, String str, boolean z, int i, Object obj) {
        Object[] objArr = {reactNativeRouteLcpSessionManager, screenFragment, str, Boolean.valueOf(z), Integer.valueOf(i), obj};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        onWarmupCompleted(-1859275491, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr, zzgc.onExtraCallbackWithResult(), 1859275492, iOnExtraCallbackWithResult);
    }

    public final void onNavigationEvent(@NotNull FragmentActivity fragmentActivity) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
        onWarmupCompleted(-546862392, zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this, fragmentActivity}, iOnExtraCallbackWithResult3, 546862392, iOnExtraCallbackWithResult);
    }
}
