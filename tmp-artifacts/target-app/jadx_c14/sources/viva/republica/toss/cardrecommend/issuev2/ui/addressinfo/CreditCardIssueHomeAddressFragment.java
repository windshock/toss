package viva.republica.toss.cardrecommend.issuev2.ui.addressinfo;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import im.toss.featurescommon.address.model.LocalUserAddress;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BaseMessagePopItemView;
import o.GriverPageContainerH5CloseHandler;
import o.IDEACBCPar;
import o.RippleNode;
import o.getG;
import o.onProgressEnd;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CreditCardIssueHomeAddressFragment extends Hilt_CreditCardIssueHomeAddressFragment<getG> {

    @Inject
    public BaseMessagePopItemView inputHomeAddressFragmentFactory;

    public CreditCardIssueHomeAddressFragment() {
        super(R.layout.fragment_credit_card_issue_common_container);
    }

    public final BaseMessagePopItemView onWarmupCompleted() {
        BaseMessagePopItemView baseMessagePopItemView = this.inputHomeAddressFragmentFactory;
        if (baseMessagePopItemView != null) {
            return baseMessagePopItemView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        BaseMessagePopItemView baseMessagePopItemViewOnWarmupCompleted = onWarmupCompleted();
        String string = getString(R.string.app_credit_card_issue_home_address_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Fragment fragmentIAuthTabCallback = baseMessagePopItemViewOnWarmupCompleted.IAuthTabCallback(new GriverPageContainerH5CloseHandler(string, (String) null, (HashMap) null, false, extraCallback().onActivityResized(), false, false, (String) null, 230, (DefaultConstructorMarker) null), new onProgressEnd(new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.addressinfo.CreditCardIssueHomeAddressFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return CreditCardIssueHomeAddressFragment.onWarmupCompleted(this.f$0, (String) obj);
            }
        }, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.addressinfo.CreditCardIssueHomeAddressFragment$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return CreditCardIssueHomeAddressFragment.onExtraCallback(this.f$0, (LocalUserAddress) obj);
            }
        }, new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.addressinfo.CreditCardIssueHomeAddressFragment$$ExternalSyntheticLambda2
            public final Object invoke() {
                return CreditCardIssueHomeAddressFragment.onNavigationEvent(this.f$0);
            }
        }, new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.addressinfo.CreditCardIssueHomeAddressFragment$$ExternalSyntheticLambda3
            public final Object invoke() {
                return CreditCardIssueHomeAddressFragment.IAuthTabCallback(this.f$0);
            }
        }));
        if (bundle == null) {
            getChildFragmentManager().onExtraCallbackWithResult().onWarmupCompleted(R.id.container, fragmentIAuthTabCallback).IAuthTabCallback();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final String onWarmupCompleted(CreditCardIssueHomeAddressFragment creditCardIssueHomeAddressFragment, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt.isBlank(str)) {
            return null;
        }
        return ((getG) creditCardIssueHomeAddressFragment.readTypedObject()).onNavigationEvent(str.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(CreditCardIssueHomeAddressFragment creditCardIssueHomeAddressFragment, LocalUserAddress localUserAddress) {
        Intrinsics.checkNotNullParameter(localUserAddress, "");
        creditCardIssueHomeAddressFragment.onNavigationEvent();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(CreditCardIssueHomeAddressFragment creditCardIssueHomeAddressFragment) {
        creditCardIssueHomeAddressFragment.onActivityLayout();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(CreditCardIssueHomeAddressFragment creditCardIssueHomeAddressFragment) {
        creditCardIssueHomeAddressFragment.onActivityLayout();
        return Unit.INSTANCE;
    }

    private final void onNavigationEvent() {
        IDEACBCPar.onExtraCallback(RippleNode.onNavigationEvent(this), R.id.addressSelectAction, requireArguments(), null, null, 12, null);
    }
}
