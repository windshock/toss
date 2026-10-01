package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import im.toss.feature.credit.ui.main.R;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class StackSampler implements SearchBarKtExternalSyntheticLambda5 {
    private static int onExtraCallback = 0;
    private static int onTransact = 1;
    public final Typography5 IAuthTabCallback;
    public final AppBarLayout onExtraCallbackWithResult;
    public final Toolbar onNavigationEvent;
    private final LinearLayout onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout linearLayoutOnNavigationEvent = onNavigationEvent();
        int i4 = onTransact + 119;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return linearLayoutOnNavigationEvent;
        }
        throw null;
    }

    private StackSampler(@NonNull LinearLayout linearLayout, @NonNull AppBarLayout appBarLayout, @NonNull Typography5 typography5, @NonNull Toolbar toolbar) {
        this.onWarmupCompleted = linearLayout;
        this.onExtraCallbackWithResult = appBarLayout;
        this.IAuthTabCallback = typography5;
        this.onNavigationEvent = toolbar;
    }

    public LinearLayout onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 35;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        LinearLayout linearLayout = this.onWarmupCompleted;
        int i4 = i2 + 47;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return linearLayout;
    }

    public static StackSampler onExtraCallback(@NonNull LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onTransact = i2 % 128;
        StackSampler stackSamplerOnNavigationEvent = onNavigationEvent(layoutInflater, null, i2 % 2 == 0);
        int i3 = onExtraCallback + 23;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return stackSamplerOnNavigationEvent;
    }

    public static StackSampler onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.activity_credit_consulting, viewGroup, false);
        if (z) {
            int i2 = onTransact + 39;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            viewGroup.addView(viewInflate);
            int i4 = onExtraCallback + 101;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        return onExtraCallback(viewInflate);
    }

    public static StackSampler onExtraCallback(@NonNull View view) {
        Typography5 typography5OnNavigationEvent;
        int i = 2 % 2;
        int i2 = onTransact + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
        if (appBarLayoutOnNavigationEvent != null && (typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.my_reservation))) != null) {
            int i5 = onTransact + 89;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                i4 = R.id.toolbar;
                Toolbar toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                if (toolbarOnNavigationEvent != null) {
                    return new StackSampler((LinearLayout) view, appBarLayoutOnNavigationEvent, typography5OnNavigationEvent, toolbarOnNavigationEvent);
                }
            } else {
                SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.toolbar);
                throw null;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
