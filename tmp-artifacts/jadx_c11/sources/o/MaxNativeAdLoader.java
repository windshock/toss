package o;

import im.toss.tds.compose.foundation.anim.rally.RallyModifierKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxNativeAdLoader extends setCreativeDebuggerEnabled<shouldPrepareViewForInteractionOnMainThread> {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaxNativeAdLoader() {
        shouldPrepareViewForInteractionOnMainThread shouldprepareviewforinteractiononmainthread = null;
        this(shouldprepareviewforinteractiononmainthread, 1, shouldprepareviewforinteractiononmainthread);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxNativeAdLoader(@NotNull shouldPrepareViewForInteractionOnMainThread shouldprepareviewforinteractiononmainthread) {
        super(shouldprepareviewforinteractiononmainthread);
        Intrinsics.checkNotNullParameter(shouldprepareviewforinteractiononmainthread, "");
    }

    public /* synthetic */ MaxNativeAdLoader(shouldPrepareViewForInteractionOnMainThread shouldprepareviewforinteractiononmainthread, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            shouldprepareviewforinteractiononmainthread = new shouldPrepareViewForInteractionOnMainThread();
            int i2 = onNavigationEvent + 105;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 / 5;
            } else {
                int i4 = 2 % 2;
            }
        }
        this(shouldprepareviewforinteractiononmainthread);
    }

    @Override // o.setCreativeDebuggerEnabled
    public void onExtraCallbackWithResult(@NotNull isCreativeDebuggerEnabled iscreativedebuggerenabled, float f) {
        long jOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iscreativedebuggerenabled, "");
        boolean z = false;
        MaxNativeAd maxNativeAd = null;
        if (RallyModifierKt.onNavigationEvent(ICustomTabsCallback().IAuthTabCallback())) {
            jOnExtraCallbackWithResult = ICustomTabsCallback().IAuthTabCallback();
        } else {
            ExtensionsManager1 extensionsManager1OnNavigationEvent = ExtensionsManager1.onNavigationEvent(ICustomTabsCallback().onExtraCallback());
            if (!RallyModifierKt.onNavigationEvent(extensionsManager1OnNavigationEvent.onExtraCallbackWithResult())) {
                int i4 = onNavigationEvent + 21;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 77 / 0;
                }
                extensionsManager1OnNavigationEvent = null;
            }
            jOnExtraCallbackWithResult = extensionsManager1OnNavigationEvent != null ? extensionsManager1OnNavigationEvent.onExtraCallbackWithResult() : ExtensionsManager1.onWarmupCompleted(0L);
        }
        if (iscreativedebuggerenabled instanceof deprecated_connectionSpecs) {
            MaxRewardedAd maxRewardedAd = iscreativedebuggerenabled instanceof MaxRewardedAd ? (MaxRewardedAd) iscreativedebuggerenabled : null;
            if (maxRewardedAd != null) {
                int i6 = IAuthTabCallback + 23;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                if (maxRewardedAd.onWarmupCompleted()) {
                    z = true;
                }
            }
            ICustomTabsCallback().onExtraCallbackWithResult(ExtensionsManager1.onWarmupCompleted((((int) f) << 32) | (4294967295L & ((int) jOnExtraCallbackWithResult))), z);
            int i8 = IAuthTabCallback + 101;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 == 0) {
                return;
            }
            maxNativeAd.hashCode();
            throw null;
        }
        if (iscreativedebuggerenabled instanceof AppLovinSdkInitializationConfigurationBuilder) {
            if (iscreativedebuggerenabled instanceof MaxNativeAd) {
                int i9 = onNavigationEvent + 109;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    maxNativeAd.hashCode();
                    throw null;
                }
                maxNativeAd = (MaxNativeAd) iscreativedebuggerenabled;
            }
            if (maxNativeAd != null && maxNativeAd.onExtraCallback()) {
                z = true;
            }
            ICustomTabsCallback().onExtraCallbackWithResult(ExtensionsManager1.onWarmupCompleted((((int) (jOnExtraCallbackWithResult >> 32)) << 32) | (((int) f) & 4294967295L)), z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004c  */
    @Override // o.setCreativeDebuggerEnabled
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Float onWarmupCompleted(@NotNull isCreativeDebuggerEnabled iscreativedebuggerenabled) {
        ExtensionsManager1 extensionsManager1OnNavigationEvent;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iscreativedebuggerenabled, "");
            extensionsManager1OnNavigationEvent = ExtensionsManager1.onNavigationEvent(ICustomTabsCallback().onExtraCallback());
            int i3 = 21 / 0;
            if (!RallyModifierKt.onNavigationEvent(extensionsManager1OnNavigationEvent.onExtraCallbackWithResult())) {
                extensionsManager1OnNavigationEvent = null;
            }
        } else {
            Intrinsics.checkNotNullParameter(iscreativedebuggerenabled, "");
            extensionsManager1OnNavigationEvent = ExtensionsManager1.onNavigationEvent(ICustomTabsCallback().onExtraCallback());
            if (!RallyModifierKt.onNavigationEvent(extensionsManager1OnNavigationEvent.onExtraCallbackWithResult())) {
            }
        }
        long jOnExtraCallbackWithResult = extensionsManager1OnNavigationEvent != null ? extensionsManager1OnNavigationEvent.onExtraCallbackWithResult() : ExtensionsManager1.onWarmupCompleted(0L);
        if (iscreativedebuggerenabled instanceof deprecated_connectionSpecs) {
            int i4 = IAuthTabCallback + 93;
            onNavigationEvent = i4 % 128;
            return i4 % 2 != 0 ? Float.valueOf((int) (jOnExtraCallbackWithResult << 97)) : Float.valueOf((int) (jOnExtraCallbackWithResult >> 32));
        }
        if (!(iscreativedebuggerenabled instanceof AppLovinSdkInitializationConfigurationBuilder)) {
            return null;
        }
        int i5 = onNavigationEvent + 115;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return Float.valueOf((int) jOnExtraCallbackWithResult);
        }
        int i6 = 69 / 0;
        return Float.valueOf((int) jOnExtraCallbackWithResult);
    }
}
