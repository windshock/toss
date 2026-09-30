package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import im.toss.features.mobileid.impl.R;
import im.toss.features.mobileid.impl.RrnWidget;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.common.securekey.SecureKeyboardView;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class clearWaitingTask implements SearchBarKtExternalSyntheticLambda5 {
    private static int asBinder = 1;
    private static int asInterface;
    public final TdsButtonV1View IAuthTabCallback;
    public final Toolbar IAuthTabCallbackDefault;
    private final CoordinatorLayout IAuthTabCallbackStub;
    public final SecureKeyboardView onExtraCallback;
    public final AppBarLayout onExtraCallbackWithResult;
    public final RrnWidget onNavigationEvent;
    public final TdsTopV2View onTransact;
    public final TdsBottomCtaV1View onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        CoordinatorLayout coordinatorLayoutOnWarmupCompleted = onWarmupCompleted();
        int i4 = asInterface + 95;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return coordinatorLayoutOnWarmupCompleted;
        }
        throw null;
    }

    private clearWaitingTask(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull TdsButtonV1View tdsButtonV1View, @NonNull RrnWidget rrnWidget, @NonNull SecureKeyboardView secureKeyboardView, @NonNull Toolbar toolbar, @NonNull TdsTopV2View tdsTopV2View) {
        this.IAuthTabCallbackStub = coordinatorLayout;
        this.onExtraCallbackWithResult = appBarLayout;
        this.onWarmupCompleted = tdsBottomCtaV1View;
        this.IAuthTabCallback = tdsButtonV1View;
        this.onNavigationEvent = rrnWidget;
        this.onExtraCallback = secureKeyboardView;
        this.IAuthTabCallbackDefault = toolbar;
        this.onTransact = tdsTopV2View;
    }

    public CoordinatorLayout onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackStub;
        }
        throw null;
    }

    public static clearWaitingTask IAuthTabCallback(@NonNull LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        clearWaitingTask clearwaitingtaskOnWarmupCompleted = onWarmupCompleted(layoutInflater, null, false);
        int i4 = asBinder + 27;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return clearwaitingtaskOnWarmupCompleted;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r3
      0x0022: PHI (r3v4 android.view.View) = (r3v1 android.view.View), (r3v6 android.view.View) binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static clearWaitingTask onWarmupCompleted(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate;
        int i = 2 % 2;
        int i2 = asBinder + 107;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            viewInflate = layoutInflater.inflate(R.layout.mobileid_impl_activity_dev_ci_not_valid, viewGroup, false);
            if (!(!z)) {
                int i3 = asInterface + 83;
                asBinder = i3 % 128;
                if (i3 % 2 != 0) {
                    viewGroup.addView(viewInflate);
                } else {
                    viewGroup.addView(viewInflate);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        } else {
            viewInflate = layoutInflater.inflate(R.layout.mobileid_impl_activity_dev_ci_not_valid, viewGroup, false);
            if (z) {
            }
        }
        return IAuthTabCallback(viewInflate);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053 A[PHI: r0
      0x0053: PHI (r0v5 im.toss.features.mobileid.impl.RrnWidget) = (r0v4 im.toss.features.mobileid.impl.RrnWidget), (r0v11 im.toss.features.mobileid.impl.RrnWidget) binds: [B:16:0x0051, B:13:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static clearWaitingTask IAuthTabCallback(@NonNull View view) {
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        RrnWidget rrnWidget;
        Toolbar toolbarOnNavigationEvent;
        TdsTopV2View tdsTopV2ViewOnNavigationEvent;
        int i = 2 % 2;
        int i2 = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (appBarLayoutOnNavigationEvent != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.bottomCta))) != null) {
            int i3 = asBinder + 125;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                i2 = R.id.keyboardButtonView;
                TdsButtonV1View tdsButtonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                if (tdsButtonV1ViewOnNavigationEvent != null) {
                    int i4 = asInterface + 17;
                    asBinder = i4 % 128;
                    if (i4 % 2 == 0) {
                        i2 = R.id.rrnInput;
                        rrnWidget = (RrnWidget) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                        int i5 = 56 / 0;
                        if (rrnWidget != null) {
                            RrnWidget rrnWidget2 = rrnWidget;
                            i2 = R.id.secureKeyboard;
                            SecureKeyboardView secureKeyboardViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                            if (secureKeyboardViewOnNavigationEvent != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.toolbar))) != null && (tdsTopV2ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.top))) != null) {
                                return new clearWaitingTask((CoordinatorLayout) view, appBarLayoutOnNavigationEvent, tdsBottomCtaV1ViewOnNavigationEvent, tdsButtonV1ViewOnNavigationEvent, rrnWidget2, secureKeyboardViewOnNavigationEvent, toolbarOnNavigationEvent, tdsTopV2ViewOnNavigationEvent);
                            }
                        }
                    } else {
                        i2 = R.id.rrnInput;
                        rrnWidget = (RrnWidget) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                        if (rrnWidget != null) {
                        }
                    }
                }
            } else {
                SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.keyboardButtonView);
                throw null;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
