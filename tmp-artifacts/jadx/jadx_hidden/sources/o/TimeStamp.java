package o;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import im.toss.base.BaseFragment;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.decryptPrikey;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class TimeStamp {
    static int onExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(TimeStamp.class);

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i3)) | i9 | (~(i8 | i3));
        int i11 = ~i3;
        int i12 = (~(i8 | i11)) | i9;
        int i13 = (~(i11 | i7)) | i4;
        int i14 = i6 + i4 + i5 + ((-700610695) * i2) + ((-1151578525) * i);
        int i15 = i14 * i14;
        int i16 = (1165304685 * i6) + 1030029312 + ((-1366800679) * i4) + (i10 * (-1762861932)) + (i12 * (-1762861932)) + ((-1762861932) * i13) + ((-597557248) * i5) + ((-665714688) * i2) + (367394816 * i) + (374145024 * i15);
        int i17 = ((i6 * 323709325) - 650539883) + (i4 * 323709049) + (i10 * 276) + (i12 * 276) + (i13 * 276) + (i5 * 323709601) + (i2 * (-499299047)) + (i * 1568885315) + (i15 * (-395509760));
        int i18 = i16 + (i17 * i17 * (-772603904));
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
    
        if (onNavigationEvent((java.util.List<? extends androidx.fragment.app.Fragment>) r4) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ec, code lost:
    
        if (onExtraCallback((java.util.List<? extends androidx.fragment.app.Fragment>) r9) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f6, code lost:
    
        if (onExtraCallback((java.util.List<? extends androidx.fragment.app.Fragment>) r9) == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onWarmupCompleted(java.lang.Object[] r9) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.TimeStamp.onWarmupCompleted(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        List list = (List) objArr[0];
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2876);
        Object obj = null;
        if (list.isEmpty()) {
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2116);
            int i2 = onExtraCallback;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(894);
            int i3 = i2 & iOnWarmupCompleted;
            if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 15) & 1) != 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        }
        List<Fragment> list2 = list;
        if (list2 instanceof Collection) {
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3073);
            if (!(!list2.isEmpty())) {
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(126);
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2457);
                return false;
            }
        }
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1654);
        for (Fragment fragment : list2) {
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(283);
            if (!onExtraCallbackWithResult(fragment)) {
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2106);
                List listOnActivityLayout = fragment.getChildFragmentManager().onActivityLayout();
                int i4 = onExtraCallback;
                int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(338);
                int i5 = (((i4 | iOnWarmupCompleted2) & (~(i4 & iOnWarmupCompleted2))) >> 2) & 1;
                Intrinsics.checkNotNullExpressionValue(listOnActivityLayout, "");
                if (i5 != 0) {
                    onExtraCallback((List<? extends Fragment>) listOnActivityLayout);
                    throw null;
                }
                if (!(!onExtraCallback((List<? extends Fragment>) listOnActivityLayout))) {
                }
            }
            int i6 = onExtraCallback;
            int iOnWarmupCompleted3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2717);
            if ((((((~i6) & iOnWarmupCompleted3) | ((~iOnWarmupCompleted3) & i6)) >> 27) & 1) == 0) {
                return true;
            }
            int i7 = 94 / 0;
            return true;
        }
        int i8 = onExtraCallback;
        int iOnWarmupCompleted4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4403);
        if (((i8 | iOnWarmupCompleted4) & (~(i8 & iOnWarmupCompleted4)) & 1) != 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        List list = (List) objArr[0];
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4098);
        if (list.isEmpty()) {
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5837);
            int i2 = onExtraCallback;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1846);
            if ((((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 27) & 1) == 0) {
                int i3 = 46 / 0;
            }
            return false;
        }
        List<Fragment> list2 = list;
        Object obj = null;
        if (list2 instanceof Collection) {
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2570);
            if (list2.isEmpty()) {
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4709);
                int i4 = onExtraCallback;
                int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(737);
                int i5 = i4 & iOnWarmupCompleted2;
                if ((((((i4 ^ iOnWarmupCompleted2) | i5) & (~i5)) >> 18) & 1) != 0) {
                    return false;
                }
                throw null;
            }
        }
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(283);
        for (Fragment fragment : list2) {
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1959);
            if (!IAuthTabCallback(fragment)) {
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(221);
                List listOnActivityLayout = fragment.getChildFragmentManager().onActivityLayout();
                Intrinsics.checkNotNullExpressionValue(listOnActivityLayout, "");
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5161);
                if (onNavigationEvent((List<? extends Fragment>) listOnActivityLayout)) {
                }
            }
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1823);
            return true;
        }
        int i6 = onExtraCallback;
        int iOnWarmupCompleted3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(13);
        if ((((((~i6) & iOnWarmupCompleted3) | ((~iOnWarmupCompleted3) & i6)) >> 10) & 1) != 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        WebViewContentOwner webViewContentOwner = (Fragment) objArr[0];
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4906);
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        if (webViewContentOwner instanceof WebViewContentOwner) {
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4901);
            if (!(!(webViewContentOwner instanceof BaseFragment))) {
                int i2 = onExtraCallback;
                int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2106);
                int i3 = ((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 14) & 1;
                Object obj = null;
                if (i3 == 0) {
                    ((BaseFragment) webViewContentOwner).isVisibleToUser();
                    obj.hashCode();
                    throw null;
                }
                if (!(!((BaseFragment) webViewContentOwner).isVisibleToUser())) {
                    int i4 = onExtraCallback;
                    int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3558);
                    int i5 = (~iOnWarmupCompleted2) & i4;
                    int i6 = (~i4) & iOnWarmupCompleted2;
                    WebViewContentOwner webViewContentOwner2 = webViewContentOwner;
                    if (((((i6 & i5) | (i5 ^ i6)) >> 25) & 1) == 0) {
                        webViewContentOwner2.getWebView();
                        throw null;
                    }
                    TossCoreWebView webView = webViewContentOwner2.getWebView();
                    if (webView != null && webView.isShown()) {
                        int i7 = onExtraCallback;
                        int iOnWarmupCompleted3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4295);
                        return Boolean.valueOf(((((i7 | iOnWarmupCompleted3) & (~(i7 & iOnWarmupCompleted3))) >> 2) & 1) == 0);
                    }
                }
            }
        }
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5320);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if (r3.isVisible() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallback(java.lang.Object[] r3) {
        /*
            r0 = 0
            r3 = r3[r0]
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            r1 = 2
            int r1 = r1 % r1
            r1 = 221(0xdd, float:3.1E-43)
            o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r1)
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            boolean r1 = r3 instanceof im.toss.rn.spec.base.ReactNativeContentOwner
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == r2) goto L50
            r1 = 4878(0x130e, float:6.836E-42)
            o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r1)
            boolean r1 = r3 instanceof im.toss.base.BaseFragment
            if (r1 == 0) goto L2e
            r1 = 3679(0xe5f, float:5.155E-42)
            o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r1)
            r1 = r3
            im.toss.base.BaseFragment r1 = (im.toss.base.BaseFragment) r1
            boolean r1 = r1.isVisibleToUser()
            if (r1 != 0) goto L34
        L2e:
            boolean r3 = r3.isVisible()
            if (r3 == 0) goto L50
        L34:
            int r3 = o.TimeStamp.onExtraCallback
            r0 = 3949(0xf6d, float:5.534E-42)
            int r0 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r0)
            int r1 = ~r0
            r1 = r1 & r3
            int r3 = ~r3
            r3 = r3 & r0
            r0 = r1 ^ r3
            r3 = r3 & r1
            r3 = r3 | r0
            int r3 = r3 >> 15
            r3 = r3 & r2
            if (r3 == 0) goto L4e
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            return r3
        L4e:
            r3 = 0
            throw r3
        L50:
            r3 = 3393(0xd41, float:4.755E-42)
            o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.TimeStamp.onExtraCallback(java.lang.Object[]):java.lang.Object");
    }

    public static final decryptPrikey onNavigationEvent(@NotNull decryptPrikey.onWarmupCompleted onwarmupcompleted, @NotNull Activity activity) {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return (decryptPrikey) onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, -1909633497, new Object[]{onwarmupcompleted, activity}, iIAuthTabCallback2, 1909633501);
    }

    private static final boolean onNavigationEvent(List<? extends Fragment> list) {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return ((Boolean) onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, 2098146259, new Object[]{list}, iIAuthTabCallback2, -2098146256)).booleanValue();
    }

    private static final boolean onExtraCallback(List<? extends Fragment> list) {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return ((Boolean) onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, -1594289153, new Object[]{list}, iIAuthTabCallback2, 1594289153)).booleanValue();
    }

    public static final boolean IAuthTabCallback(@NotNull Fragment fragment) {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return ((Boolean) onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, -120363317, new Object[]{fragment}, iIAuthTabCallback2, 120363319)).booleanValue();
    }

    public static final boolean onExtraCallbackWithResult(@NotNull Fragment fragment) {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return ((Boolean) onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, 1198898483, new Object[]{fragment}, iIAuthTabCallback2, -1198898482)).booleanValue();
    }
}
