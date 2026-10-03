package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import im.toss.tds.view.component.atom.text.SubTypography11;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.textField.BaseEditText;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import viva.republica.toss.R;
import viva.republica.toss.send.view.EmojiFountainView;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CMS_GetPKCS9AuthAttributesInSignedData implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsTopV1View IAuthTabCallback;
    public final SubTypography11 IAuthTabCallbackDefault;
    public final BaseEditText IAuthTabCallbackStub;
    public final LinearLayout IAuthTabCallback_Parcel;
    private final RelativeLayout access000;
    public final SubTypography11 asBinder;
    public final TdsTopV1View asInterface;
    public final Toolbar getInterfaceDescriptor;
    public final LinearLayout onExtraCallback;
    public final AppBarLayout onExtraCallbackWithResult;
    public final LinearLayout onNavigationEvent;
    public final BaseEditText onTransact;
    public final EmojiFountainView onWarmupCompleted;

    private CMS_GetPKCS9AuthAttributesInSignedData(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull AppBarLayout appBarLayout, @NonNull EmojiFountainView emojiFountainView, @NonNull LinearLayout linearLayout2, @NonNull TdsTopV1View tdsTopV1View, @NonNull SubTypography11 subTypography11, @NonNull BaseEditText baseEditText, @NonNull TdsTopV1View tdsTopV1View2, @NonNull SubTypography11 subTypography112, @NonNull BaseEditText baseEditText2, @NonNull LinearLayout linearLayout3, @NonNull Toolbar toolbar) {
        this.access000 = relativeLayout;
        this.onExtraCallback = linearLayout;
        this.onExtraCallbackWithResult = appBarLayout;
        this.onWarmupCompleted = emojiFountainView;
        this.onNavigationEvent = linearLayout2;
        this.IAuthTabCallback = tdsTopV1View;
        this.asBinder = subTypography11;
        this.IAuthTabCallbackStub = baseEditText;
        this.asInterface = tdsTopV1View2;
        this.IAuthTabCallbackDefault = subTypography112;
        this.onTransact = baseEditText2;
        this.IAuthTabCallback_Parcel = linearLayout3;
        this.getInterfaceDescriptor = toolbar;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.access000;
    }

    public static CMS_GetPKCS9AuthAttributesInSignedData IAuthTabCallback(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallbackWithResult(layoutInflater, null, false);
    }

    public static CMS_GetPKCS9AuthAttributesInSignedData onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_transfer_message, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return IAuthTabCallback(viewInflate);
    }

    public static CMS_GetPKCS9AuthAttributesInSignedData IAuthTabCallback(@NonNull View view) {
        AppBarLayout appBarLayoutOnNavigationEvent;
        EmojiFountainView emojiFountainViewOnNavigationEvent;
        TdsTopV1View tdsTopV1ViewOnNavigationEvent;
        SubTypography11 subTypography11OnNavigationEvent;
        BaseEditText baseEditTextOnNavigationEvent;
        TdsTopV1View tdsTopV1ViewOnNavigationEvent2;
        SubTypography11 subTypography11OnNavigationEvent2;
        BaseEditText baseEditTextOnNavigationEvent2;
        Toolbar toolbarOnNavigationEvent;
        int i = R.id.account_message_container;
        LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (linearLayout != null && (appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.appBarLayout))) != null && (emojiFountainViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.emoji_fountain))) != null) {
            i = R.id.emoji_list;
            LinearLayout linearLayout2 = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (linearLayout2 != null && (tdsTopV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.input_account_header_view))) != null && (subTypography11OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.input_account_max_length))) != null && (baseEditTextOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.input_account_message))) != null && (tdsTopV1ViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.input_sms_header_view))) != null && (subTypography11OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.input_sms_max_length))) != null && (baseEditTextOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.input_sms_message))) != null) {
                i = R.id.sms_message_container;
                LinearLayout linearLayout3 = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                if (linearLayout3 != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null) {
                    return new CMS_GetPKCS9AuthAttributesInSignedData((RelativeLayout) view, linearLayout, appBarLayoutOnNavigationEvent, emojiFountainViewOnNavigationEvent, linearLayout2, tdsTopV1ViewOnNavigationEvent, subTypography11OnNavigationEvent, baseEditTextOnNavigationEvent, tdsTopV1ViewOnNavigationEvent2, subTypography11OnNavigationEvent2, baseEditTextOnNavigationEvent2, linearLayout3, toolbarOnNavigationEvent);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
