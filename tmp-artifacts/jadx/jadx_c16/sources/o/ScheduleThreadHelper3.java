package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.features.mobileid.impl.R;
import im.toss.tds.view.component.anim.top.AnimateTop;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ScheduleThreadHelper3 implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallbackStub = 1;
    private static int onTransact;
    public final Toolbar IAuthTabCallback;
    private final ConstraintLayout IAuthTabCallbackDefault;
    public final AnimateTop onExtraCallback;
    public final TdsBottomCtaV1View onExtraCallbackWithResult;
    public final TdsImageView onNavigationEvent;
    public final AppBarLayout onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback();
        }
        IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ScheduleThreadHelper3(@NonNull ConstraintLayout constraintLayout, @NonNull AnimateTop animateTop, @NonNull AppBarLayout appBarLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull TdsImageView tdsImageView, @NonNull Toolbar toolbar) {
        this.IAuthTabCallbackDefault = constraintLayout;
        this.onExtraCallback = animateTop;
        this.onWarmupCompleted = appBarLayout;
        this.onExtraCallbackWithResult = tdsBottomCtaV1View;
        this.onNavigationEvent = tdsImageView;
        this.IAuthTabCallback = toolbar;
    }

    public ConstraintLayout IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.IAuthTabCallbackDefault;
        int i5 = i3 + 91;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return constraintLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ScheduleThreadHelper3 onWarmupCompleted(@NonNull LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ScheduleThreadHelper3 scheduleThreadHelper3OnExtraCallbackWithResult = onExtraCallbackWithResult(layoutInflater, null, false);
        int i4 = onTransact + 73;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return scheduleThreadHelper3OnExtraCallbackWithResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r3
      0x0020: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ScheduleThreadHelper3 onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate;
        int i = 2 % 2;
        int i2 = onTransact + 51;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            viewInflate = layoutInflater.inflate(R.layout.mobileid_impl_activity_issue_nudge_for_mydata, viewGroup, false);
            if (z) {
                viewGroup.addView(viewInflate);
            }
        } else {
            viewInflate = layoutInflater.inflate(R.layout.mobileid_impl_activity_issue_nudge_for_mydata, viewGroup, false);
            if (z) {
            }
        }
        ScheduleThreadHelper3 scheduleThreadHelper3OnWarmupCompleted = onWarmupCompleted(viewInflate);
        int i3 = onTransact + 31;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return scheduleThreadHelper3OnWarmupCompleted;
    }

    public static ScheduleThreadHelper3 onWarmupCompleted(@NonNull View view) {
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        int i = 2 % 2;
        int i2 = R.id.animateTop;
        AnimateTop animateTopOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (animateTopOnNavigationEvent != null) {
            int i3 = onTransact + 27;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.appBar);
                throw null;
            }
            i2 = R.id.appBar;
            AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
            if (appBarLayoutOnNavigationEvent != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.bottomCta))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.imageView))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.toolbar))) != null) {
                ScheduleThreadHelper3 scheduleThreadHelper3 = new ScheduleThreadHelper3((ConstraintLayout) view, animateTopOnNavigationEvent, appBarLayoutOnNavigationEvent, tdsBottomCtaV1ViewOnNavigationEvent, tdsImageViewOnNavigationEvent, toolbarOnNavigationEvent);
                int i4 = IAuthTabCallbackStub + 89;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                return scheduleThreadHelper3;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
