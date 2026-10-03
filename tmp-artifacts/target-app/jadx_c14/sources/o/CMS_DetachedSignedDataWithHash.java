package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.textField.BaseEditText;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CMS_DetachedSignedDataWithHash implements SearchBarKtExternalSyntheticLambda5 {
    public final Typography7 IAuthTabCallback;
    public final Toolbar IAuthTabCallbackDefault;
    public final ConstraintLayout onExtraCallback;
    public final BaseEditText onExtraCallbackWithResult;
    public final AppBarLayout onNavigationEvent;
    private final ConstraintLayout onTransact;
    public final TdsTopV1View onWarmupCompleted;

    private CMS_DetachedSignedDataWithHash(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull TdsTopV1View tdsTopV1View, @NonNull Typography7 typography7, @NonNull BaseEditText baseEditText, @NonNull ConstraintLayout constraintLayout2, @NonNull Toolbar toolbar) {
        this.onTransact = constraintLayout;
        this.onNavigationEvent = appBarLayout;
        this.onWarmupCompleted = tdsTopV1View;
        this.IAuthTabCallback = typography7;
        this.onExtraCallbackWithResult = baseEditText;
        this.onExtraCallback = constraintLayout2;
        this.IAuthTabCallbackDefault = toolbar;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onTransact;
    }

    public static CMS_DetachedSignedDataWithHash onNavigationEvent(@NonNull LayoutInflater layoutInflater) {
        return onNavigationEvent(layoutInflater, null, false);
    }

    public static CMS_DetachedSignedDataWithHash onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_timeline_memo, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallbackWithResult(viewInflate);
    }

    public static CMS_DetachedSignedDataWithHash onExtraCallbackWithResult(@NonNull View view) {
        TdsTopV1View tdsTopV1ViewOnNavigationEvent;
        Typography7 typography7OnNavigationEvent;
        BaseEditText baseEditTextOnNavigationEvent;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (tdsTopV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.header))) != null && (typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.inputMaxLength))) != null && (baseEditTextOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.inputMemo))) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.toolbar;
            Toolbar toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (toolbarOnNavigationEvent != null) {
                return new CMS_DetachedSignedDataWithHash(constraintLayout, appBarLayoutOnNavigationEvent, tdsTopV1ViewOnNavigationEvent, typography7OnNavigationEvent, baseEditTextOnNavigationEvent, constraintLayout, toolbarOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
