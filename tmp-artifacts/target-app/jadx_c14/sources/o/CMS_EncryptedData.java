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
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CMS_EncryptedData implements SearchBarKtExternalSyntheticLambda5 {
    public final Typography7 IAuthTabCallback;
    private final ConstraintLayout IAuthTabCallbackDefault;
    public final Toolbar onExtraCallback;
    public final BaseEditText onExtraCallbackWithResult;
    public final AppBarLayout onNavigationEvent;
    public final ConstraintLayout onWarmupCompleted;

    private CMS_EncryptedData(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull Typography7 typography7, @NonNull BaseEditText baseEditText, @NonNull ConstraintLayout constraintLayout2, @NonNull Toolbar toolbar) {
        this.IAuthTabCallbackDefault = constraintLayout;
        this.onNavigationEvent = appBarLayout;
        this.IAuthTabCallback = typography7;
        this.onExtraCallbackWithResult = baseEditText;
        this.onWarmupCompleted = constraintLayout2;
        this.onExtraCallback = toolbar;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallbackDefault;
    }

    public static CMS_EncryptedData onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater) {
        return IAuthTabCallback(layoutInflater, null, false);
    }

    public static CMS_EncryptedData IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_transaction_memo, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return IAuthTabCallback(viewInflate);
    }

    public static CMS_EncryptedData IAuthTabCallback(@NonNull View view) {
        Typography7 typography7OnNavigationEvent;
        BaseEditText baseEditTextOnNavigationEvent;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.inputMaxLength))) != null && (baseEditTextOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.inputMemo))) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.toolbar;
            Toolbar toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (toolbarOnNavigationEvent != null) {
                return new CMS_EncryptedData(constraintLayout, appBarLayoutOnNavigationEvent, typography7OnNavigationEvent, baseEditTextOnNavigationEvent, constraintLayout, toolbarOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
