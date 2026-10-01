package o;

import android.net.Uri;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import javax.inject.Inject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class r8lambdaGeF1OpgRxhfJiXGWbs9OMNOxg implements getHasConsentForAdStorage {
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final accessgetStatep IAuthTabCallback;
    public static final onExtraCallback Companion = new onExtraCallback(null);
    public static final int onExtraCallbackWithResult = 8;

    static {
        int i = onNavigationEvent + 107;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Inject
    public r8lambdaGeF1OpgRxhfJiXGWbs9OMNOxg(@NotNull accessgetStatep accessgetstatep) {
        Intrinsics.checkNotNullParameter(accessgetstatep, "");
        this.IAuthTabCallback = accessgetstatep;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00da A[PHI: r5
      0x00da: PHI (r5v19 android.net.Uri) = (r5v18 android.net.Uri), (r5v23 android.net.Uri) binds: [B:24:0x00d8, B:21:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void IAuthTabCallback(@Nullable TossCoreWebView tossCoreWebView, @Nullable String str) {
        String host;
        Uri uri;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 73;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (tossCoreWebView != null) {
            int i5 = i2 + 89;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            if (str != null) {
                int i7 = i2 + 107;
                asInterface = i7 % 128;
                String host2 = null;
                if (i7 % 2 == 0) {
                    throw null;
                }
                Uri uri2 = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, new Object[]{str});
                if (uri2 == null || (host = uri2.getHost()) == null) {
                    return;
                }
                Uri uri3 = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, new Object[]{this.IAuthTabCallback.ResultReceiver()});
                if (!Intrinsics.areEqual(host, uri3 != null ? uri3.getHost() : null)) {
                    int i8 = asInterface + 75;
                    onExtraCallback = i8 % 128;
                    if (i8 % 2 != 0) {
                        uri = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, new Object[]{this.IAuthTabCallback.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss()});
                        int i9 = 56 / 0;
                        if (uri != null) {
                            host2 = uri.getHost();
                        }
                        if (!Intrinsics.areEqual(host, host2)) {
                            return;
                        }
                    } else {
                        uri = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, new Object[]{this.IAuthTabCallback.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss()});
                        if (uri != null) {
                        }
                        if (!Intrinsics.areEqual(host, host2)) {
                        }
                    }
                }
                setTopGuideFontStyle settopguidefontstyleOnNavigationEvent = Companion.onNavigationEvent(true);
                if (settopguidefontstyleOnNavigationEvent != null) {
                    int i10 = onExtraCallback + 23;
                    asInterface = i10 % 128;
                    int i11 = i10 % 2;
                    tossCoreWebView.onExtraCallbackWithResult(settopguidefontstyleOnNavigationEvent);
                }
            }
        }
    }

    public static final class onExtraCallback {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final setTopGuideFontStyle onNavigationEvent(boolean z) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            if (z) {
                int i5 = i3 + 51;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    ((Boolean) isUserSubjectToGDPR.onNavigationEvent(new Object[]{isUserSubjectToGDPR.onWarmupCompleted}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 655245496, -655245488, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).booleanValue();
                    throw null;
                }
                if (!((Boolean) isUserSubjectToGDPR.onNavigationEvent(new Object[]{isUserSubjectToGDPR.onWarmupCompleted}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 655245496, -655245488, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).booleanValue()) {
                    return null;
                }
            }
            isUserSubjectToGDPR isusersubjecttogdpr = isUserSubjectToGDPR.onWarmupCompleted;
            if (!isusersubjecttogdpr.onPostMessage()) {
                return null;
            }
            return AFi1bSDK.Companion.onExtraCallbackWithResult(!isusersubjecttogdpr.onMinimized(), isusersubjecttogdpr.ICustomTabsCallbackStub(), ((Boolean) isUserSubjectToGDPR.onNavigationEvent(new Object[]{isusersubjecttogdpr}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1585908745, 1585908745, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).booleanValue());
        }
    }
}
