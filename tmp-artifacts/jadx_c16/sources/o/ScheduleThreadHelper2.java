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
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ScheduleThreadHelper2 implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface;
    public final TdsImageView IAuthTabCallback;
    public final Toolbar onExtraCallback;
    private final ConstraintLayout onExtraCallbackWithResult;
    public final AnimateTop onNavigationEvent;
    public final AppBarLayout onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayoutOnExtraCallback = onExtraCallback();
        int i4 = asInterface + 41;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return constraintLayoutOnExtraCallback;
    }

    private ScheduleThreadHelper2(@NonNull ConstraintLayout constraintLayout, @NonNull AnimateTop animateTop, @NonNull AppBarLayout appBarLayout, @NonNull TdsImageView tdsImageView, @NonNull Toolbar toolbar) {
        this.onExtraCallbackWithResult = constraintLayout;
        this.onNavigationEvent = animateTop;
        this.onWarmupCompleted = appBarLayout;
        this.IAuthTabCallback = tdsImageView;
        this.onExtraCallback = toolbar;
    }

    public ConstraintLayout onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 43;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ScheduleThreadHelper2 onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        IAuthTabCallbackStub = i2 % 128;
        ScheduleThreadHelper2 scheduleThreadHelper2OnWarmupCompleted = i2 % 2 == 0 ? onWarmupCompleted(layoutInflater, null, true) : onWarmupCompleted(layoutInflater, null, false);
        int i3 = IAuthTabCallbackStub + 79;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 26 / 0;
        }
        return scheduleThreadHelper2OnWarmupCompleted;
    }

    public static ScheduleThreadHelper2 onWarmupCompleted(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.mobileid_impl_activity_issue_nudge_bridge, viewGroup, false);
        if (z) {
            int i2 = IAuthTabCallbackStub + 1;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                viewGroup.addView(viewInflate);
                int i3 = 36 / 0;
            } else {
                viewGroup.addView(viewInflate);
            }
        }
        ScheduleThreadHelper2 scheduleThreadHelper2OnExtraCallbackWithResult = onExtraCallbackWithResult(viewInflate);
        int i4 = IAuthTabCallbackStub + 81;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return scheduleThreadHelper2OnExtraCallbackWithResult;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        if (r2 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r2 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        r1 = new o.ScheduleThreadHelper2((androidx.constraintlayout.widget.ConstraintLayout) r9, r5, r6, r7, r2);
        r9 = o.ScheduleThreadHelper2.IAuthTabCallbackStub + 109;
        o.ScheduleThreadHelper2.asInterface = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ScheduleThreadHelper2 onExtraCallbackWithResult(@NonNull View view) {
        Toolbar toolbarOnNavigationEvent;
        int i = 2 % 2;
        int i2 = asInterface + 87;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.animateTop;
        AnimateTop animateTopOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
        if (animateTopOnNavigationEvent != null && (r6 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.appBar))) != null && (r7 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.imageView))) != null) {
            int i5 = IAuthTabCallbackStub + 45;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                i4 = R.id.toolbar;
                toolbarOnNavigationEvent = (Toolbar) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                int i6 = 73 / 0;
            } else {
                i4 = R.id.toolbar;
                toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
