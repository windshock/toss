package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.feature.credit.ui.kcbsurvey.R;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ThreadOptimizeSwitch implements SearchBarKtExternalSyntheticLambda5 {
    private static int asInterface = 0;
    private static int onTransact = 1;
    public final ComposeView IAuthTabCallback;
    public final TdsTopV2View IAuthTabCallbackDefault;
    private final ConstraintLayout IAuthTabCallbackStub;
    public final Toolbar asBinder;
    public final AppBarLayout onExtraCallback;
    public final TdsBottomCtaV1View onExtraCallbackWithResult;
    public final ComposeView onNavigationEvent;
    public final ScrollView onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = asInterface + 1;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayoutOnWarmupCompleted = onWarmupCompleted();
        int i4 = onTransact + 91;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return constraintLayoutOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ThreadOptimizeSwitch(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull ComposeView composeView, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull ComposeView composeView2, @NonNull ScrollView scrollView, @NonNull Toolbar toolbar, @NonNull TdsTopV2View tdsTopV2View) {
        this.IAuthTabCallbackStub = constraintLayout;
        this.onExtraCallback = appBarLayout;
        this.IAuthTabCallback = composeView;
        this.onExtraCallbackWithResult = tdsBottomCtaV1View;
        this.onNavigationEvent = composeView2;
        this.onWarmupCompleted = scrollView;
        this.asBinder = toolbar;
        this.IAuthTabCallbackDefault = tdsTopV2View;
    }

    public ConstraintLayout onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.IAuthTabCallbackStub;
        int i5 = i3 + 13;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static ThreadOptimizeSwitch onWarmupCompleted(@NonNull LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        onTransact = i2 % 128;
        ThreadOptimizeSwitch threadOptimizeSwitchOnExtraCallbackWithResult = onExtraCallbackWithResult(layoutInflater, null, i2 % 2 == 0);
        int i3 = asInterface + 97;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return threadOptimizeSwitchOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static ThreadOptimizeSwitch onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.activity_kcb_survey_intro, viewGroup, false);
        if (!(!z)) {
            int i2 = onTransact + 125;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            viewGroup.addView(viewInflate);
            int i4 = asInterface + 83;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        return onExtraCallback(viewInflate);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (r0 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
    
        if (r0 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        return new o.ThreadOptimizeSwitch((androidx.constraintlayout.widget.ConstraintLayout) r12, r5, r6, r7, r8, r9, r10, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[PHI: r2
      0x0048: PHI (r2v7 android.widget.ScrollView) = (r2v6 android.widget.ScrollView), (r2v13 android.widget.ScrollView) binds: [B:16:0x0052, B:13:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ThreadOptimizeSwitch onExtraCallback(@NonNull View view) {
        ScrollView scrollView;
        TdsTopV2View tdsTopV2ViewOnNavigationEvent;
        int i = 2 % 2;
        int i2 = R.id.appbar;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (appBarLayoutOnNavigationEvent != null && (r6 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.composeView))) != null && (r7 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.cta))) != null && (r8 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.disclaimer))) != null) {
            int i3 = asInterface + 53;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                i2 = R.id.scrollView;
                scrollView = (ScrollView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                int i4 = 21 / 0;
                if (scrollView != null) {
                    ScrollView scrollView2 = scrollView;
                    i2 = R.id.toolbar;
                    Toolbar toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                    if (toolbarOnNavigationEvent != null) {
                        int i5 = onTransact + 59;
                        asInterface = i5 % 128;
                        if (i5 % 2 != 0) {
                            i2 = R.id.top;
                            tdsTopV2ViewOnNavigationEvent = (TdsTopV2View) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                            int i6 = 94 / 0;
                        } else {
                            i2 = R.id.top;
                            tdsTopV2ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                        }
                    }
                }
            } else {
                i2 = R.id.scrollView;
                scrollView = (ScrollView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                if (scrollView != null) {
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
