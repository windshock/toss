package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.features.cardissue.R;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography4;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.widget.TdsRoundLayout;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SystemSettingFieldGroup implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallbackStub = 1;
    private static int onTransact;
    public final TdsImageView IAuthTabCallback;
    private final ConstraintLayout asBinder;
    public final Typography6 onExtraCallback;
    public final LinearLayout onExtraCallbackWithResult;
    public final TdsRoundLayout onNavigationEvent;
    public final Typography4 onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConstraintLayout constraintLayoutOnNavigationEvent = onNavigationEvent();
        int i3 = onTransact + 99;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 42 / 0;
        }
        return constraintLayoutOnNavigationEvent;
    }

    private SystemSettingFieldGroup(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull TdsImageView tdsImageView, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull Typography6 typography6, @NonNull Typography4 typography4) {
        this.asBinder = constraintLayout;
        this.onExtraCallbackWithResult = linearLayout;
        this.IAuthTabCallback = tdsImageView;
        this.onNavigationEvent = tdsRoundLayout;
        this.onExtraCallback = typography6;
        this.onWarmupCompleted = typography4;
    }

    public ConstraintLayout onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 31;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConstraintLayout constraintLayout = this.asBinder;
        int i4 = i2 + 17;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return constraintLayout;
    }

    public static SystemSettingFieldGroup onExtraCallback(@NonNull LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 105;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        SystemSettingFieldGroup systemSettingFieldGroupOnNavigationEvent = onNavigationEvent(layoutInflater, null, false);
        int i4 = IAuthTabCallbackStub + 79;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return systemSettingFieldGroupOnNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r3
      0x0021: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001f, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SystemSettingFieldGroup onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            viewInflate = layoutInflater.inflate(R.layout.card_issue_event_list_item, viewGroup, true);
            if (z) {
                viewGroup.addView(viewInflate);
                int i3 = onTransact + 53;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
            }
        } else {
            viewInflate = layoutInflater.inflate(R.layout.card_issue_event_list_item, viewGroup, false);
            if (z) {
            }
        }
        return onNavigationEvent(viewInflate);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r2
      0x0027: PHI (r2v3 android.widget.LinearLayout) = (r2v2 android.widget.LinearLayout), (r2v9 android.widget.LinearLayout) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SystemSettingFieldGroup onNavigationEvent(@NonNull View view) {
        int i;
        LinearLayout linearLayout;
        Typography6 typography6OnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = onTransact + 21;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.id.content;
            linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            int i4 = 59 / 0;
            if (linearLayout != null) {
                LinearLayout linearLayout2 = linearLayout;
                int i5 = onTransact + 47;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                i = R.id.image;
                TdsImageView tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                if (tdsImageViewOnNavigationEvent != null) {
                    int i7 = onTransact + 13;
                    IAuthTabCallbackStub = i7 % 128;
                    Object obj = null;
                    if (i7 % 2 != 0) {
                        i = R.id.roundView;
                        TdsRoundLayout tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                        if (tdsRoundLayoutOnNavigationEvent != null && (typography6OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.subtitle))) != null) {
                            int i8 = onTransact + 53;
                            IAuthTabCallbackStub = i8 % 128;
                            if (i8 % 2 != 0) {
                                i = R.id.title;
                                Typography4 typography4OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                                if (typography4OnNavigationEvent != null) {
                                    return new SystemSettingFieldGroup((ConstraintLayout) view, linearLayout2, tdsImageViewOnNavigationEvent, tdsRoundLayoutOnNavigationEvent, typography6OnNavigationEvent, typography4OnNavigationEvent);
                                }
                            } else {
                                SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.title);
                                obj.hashCode();
                                throw null;
                            }
                        }
                    } else {
                        SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.roundView);
                        obj.hashCode();
                        throw null;
                    }
                }
            }
        } else {
            i = R.id.content;
            linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (linearLayout != null) {
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
