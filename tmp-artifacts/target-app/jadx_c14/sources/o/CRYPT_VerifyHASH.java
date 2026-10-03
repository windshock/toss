package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CRYPT_VerifyHASH implements SearchBarKtExternalSyntheticLambda5 {
    public final BottomSheetHeader IAuthTabCallback;
    private final ScrollView asInterface;
    public final TdsListRowV1View onExtraCallback;
    public final TdsListRowV1View onExtraCallbackWithResult;
    public final Typography6 onNavigationEvent;
    public final TdsBottomCtaV1View onWarmupCompleted;

    private CRYPT_VerifyHASH(@NonNull ScrollView scrollView, @NonNull TdsListRowV1View tdsListRowV1View, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull Typography6 typography6, @NonNull TdsListRowV1View tdsListRowV1View2, @NonNull BottomSheetHeader bottomSheetHeader) {
        this.asInterface = scrollView;
        this.onExtraCallback = tdsListRowV1View;
        this.onWarmupCompleted = tdsBottomCtaV1View;
        this.onNavigationEvent = typography6;
        this.onExtraCallbackWithResult = tdsListRowV1View2;
        this.IAuthTabCallback = bottomSheetHeader;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.asInterface;
    }

    public static CRYPT_VerifyHASH onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater) {
        return onNavigationEvent(layoutInflater, null, false);
    }

    public static CRYPT_VerifyHASH onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_open_banking_transition, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onNavigationEvent(viewInflate);
    }

    public static CRYPT_VerifyHASH onNavigationEvent(@NonNull View view) {
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        Typography6 typography6OnNavigationEvent;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent;
        BottomSheetHeader bottomSheetHeaderOnNavigationEvent;
        int i = R.id.account_list_row;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsListRowV1ViewOnNavigationEvent2 != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bottom_cta))) != null && (typography6OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.description))) != null && (tdsListRowV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.detail_row))) != null && (bottomSheetHeaderOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.header))) != null) {
            return new CRYPT_VerifyHASH((ScrollView) view, tdsListRowV1ViewOnNavigationEvent2, tdsBottomCtaV1ViewOnNavigationEvent, typography6OnNavigationEvent, tdsListRowV1ViewOnNavigationEvent, bottomSheetHeaderOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
