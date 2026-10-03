package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CMP_UpdateCertificate_Close implements SearchBarKtExternalSyntheticLambda5 {
    public final AppBarLayout IAuthTabCallback;
    public final TdsListRowV1View IAuthTabCallbackDefault;
    public final TdsListRowV1View IAuthTabCallbackStub;
    public final LinearLayout IAuthTabCallbackStubProxy;
    public final TdsListRowV1View IAuthTabCallback_Parcel;
    public final Toolbar access000;
    public final Typography6 access100;
    public final Typography7 asBinder;
    public final TdsListRowV1View asInterface;
    public final TdsListRowV1View extraCallback;
    public final TdsTopV1View getInterfaceDescriptor;
    public final TdsListRowV1View onExtraCallback;
    public final TdsListRowV1View onExtraCallbackWithResult;
    public final LinearLayout onNavigationEvent;
    public final View onTransact;
    public final TdsListRowV1View onWarmupCompleted;
    public final TdsListRowV1View readTypedObject;
    private final LinearLayout writeTypedObject;

    private CMP_UpdateCertificate_Close(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TdsListRowV1View tdsListRowV1View, @NonNull AppBarLayout appBarLayout, @NonNull TdsListRowV1View tdsListRowV1View2, @NonNull TdsListRowV1View tdsListRowV1View3, @NonNull TdsListRowV1View tdsListRowV1View4, @NonNull TdsListRowV1View tdsListRowV1View5, @NonNull View view, @NonNull TdsListRowV1View tdsListRowV1View6, @NonNull Typography7 typography7, @NonNull TdsTopV1View tdsTopV1View, @NonNull LinearLayout linearLayout3, @NonNull Typography6 typography6, @NonNull TdsListRowV1View tdsListRowV1View7, @NonNull Toolbar toolbar, @NonNull TdsListRowV1View tdsListRowV1View8, @NonNull TdsListRowV1View tdsListRowV1View9) {
        this.writeTypedObject = linearLayout;
        this.onNavigationEvent = linearLayout2;
        this.onWarmupCompleted = tdsListRowV1View;
        this.IAuthTabCallback = appBarLayout;
        this.onExtraCallbackWithResult = tdsListRowV1View2;
        this.onExtraCallback = tdsListRowV1View3;
        this.IAuthTabCallbackStub = tdsListRowV1View4;
        this.IAuthTabCallbackDefault = tdsListRowV1View5;
        this.onTransact = view;
        this.asInterface = tdsListRowV1View6;
        this.asBinder = typography7;
        this.getInterfaceDescriptor = tdsTopV1View;
        this.IAuthTabCallbackStubProxy = linearLayout3;
        this.access100 = typography6;
        this.IAuthTabCallback_Parcel = tdsListRowV1View7;
        this.access000 = toolbar;
        this.readTypedObject = tdsListRowV1View8;
        this.extraCallback = tdsListRowV1View9;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.writeTypedObject;
    }

    public static CMP_UpdateCertificate_Close onNavigationEvent(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallback(layoutInflater, null, false);
    }

    public static CMP_UpdateCertificate_Close onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_plcc_card_transaction_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return IAuthTabCallback(viewInflate);
    }

    public static CMP_UpdateCertificate_Close IAuthTabCallback(@NonNull View view) {
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent;
        AppBarLayout appBarLayoutOnNavigationEvent;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent2;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent3;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent4;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent5;
        View viewOnNavigationEvent;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent6;
        Typography7 typography7OnNavigationEvent;
        TdsTopV1View tdsTopV1ViewOnNavigationEvent;
        Typography6 typography6OnNavigationEvent;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent7;
        Toolbar toolbarOnNavigationEvent;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent8;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent9;
        int i = R.id.amountDetailContainer;
        LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (linearLayout != null && (tdsListRowV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.amountRow))) != null && (appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.appBarLayout))) != null && (tdsListRowV1ViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.approveAmountRow))) != null && (tdsListRowV1ViewOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.approveNumberRow))) != null && (tdsListRowV1ViewOnNavigationEvent4 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.approveStatusRow))) != null && (tdsListRowV1ViewOnNavigationEvent5 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.cancelAmountRow))) != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.detailDivider))) != null && (tdsListRowV1ViewOnNavigationEvent6 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.diffAmountRow))) != null && (typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.foreignDiffGuide))) != null && (tdsTopV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.header))) != null) {
            i = R.id.storeAddressContainer;
            LinearLayout linearLayout2 = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (linearLayout2 != null && (typography6OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.storeAddressRow))) != null && (tdsListRowV1ViewOnNavigationEvent7 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.storeTelephoneRow))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null && (tdsListRowV1ViewOnNavigationEvent8 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.typeRow))) != null && (tdsListRowV1ViewOnNavigationEvent9 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.wonAmountRow))) != null) {
                return new CMP_UpdateCertificate_Close((LinearLayout) view, linearLayout, tdsListRowV1ViewOnNavigationEvent, appBarLayoutOnNavigationEvent, tdsListRowV1ViewOnNavigationEvent2, tdsListRowV1ViewOnNavigationEvent3, tdsListRowV1ViewOnNavigationEvent4, tdsListRowV1ViewOnNavigationEvent5, viewOnNavigationEvent, tdsListRowV1ViewOnNavigationEvent6, typography7OnNavigationEvent, tdsTopV1ViewOnNavigationEvent, linearLayout2, typography6OnNavigationEvent, tdsListRowV1ViewOnNavigationEvent7, toolbarOnNavigationEvent, tdsListRowV1ViewOnNavigationEvent8, tdsListRowV1ViewOnNavigationEvent9);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
