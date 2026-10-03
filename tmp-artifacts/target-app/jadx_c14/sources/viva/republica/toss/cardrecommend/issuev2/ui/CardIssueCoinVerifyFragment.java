package viva.republica.toss.cardrecommend.issuev2.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import im.toss.define.MobileCarrier;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.KeyBoardVisiblePoint;
import o.RippleNode;
import o.TabBarInfoQueryPointOnTabBarInfoQueryListener;
import o.checkDeviceBrand;
import o.getDigestAlgorithms;
import o.getMaskGenAlgorithm;
import o.getStringArray;
import o.overrideEventDispatcher;
import o.updateRuntimeShadowNodeReferencesOnCommit;
import o.zzaj;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.network.model.verify.SessionKnownType;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueCoinVerifyFragment extends CardIssueBaseFragment<getMaskGenAlgorithm> {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    public static final int IAuthTabCallback = 8;
    private final boolean onExtraCallback;
    private TabBarInfoQueryPointOnTabBarInfoQueryListener onExtraCallbackWithResult;

    public CardIssueCoinVerifyFragment() {
        super(R.layout.fragment_card_issue_coin_verify);
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public boolean ICustomTabsCallback() {
        return this.onExtraCallback;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted = TabBarInfoQueryPointOnTabBarInfoQueryListener.Companion.onWarmupCompleted();
        tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted.onExtraCallbackWithResult(readTypedObject().onExtraCallbackWithResult().onNavigationEvent());
        tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted.asBinder(readTypedObject().onExtraCallbackWithResult().onExtraCallback());
        this.onExtraCallbackWithResult = tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted;
        onTrackView();
        onExtraCallback();
    }

    private final void onExtraCallback() {
        overrideEventDispatcher overrideeventdispatcher = overrideEventDispatcher.onNavigationEvent;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        String strName = SessionKnownType.VERIFY_BANK_ACCOUNT.name();
        KeyBoardVisiblePoint keyBoardVisiblePoint = this.onExtraCallbackWithResult;
        KeyBoardVisiblePoint keyBoardVisiblePoint2 = null;
        if (keyBoardVisiblePoint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            keyBoardVisiblePoint = null;
        }
        String strAsInterface = keyBoardVisiblePoint.asInterface();
        KeyBoardVisiblePoint keyBoardVisiblePoint3 = this.onExtraCallbackWithResult;
        if (keyBoardVisiblePoint3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            keyBoardVisiblePoint2 = keyBoardVisiblePoint3;
        }
        String strBP_ = keyBoardVisiblePoint2.bP_();
        Boolean boolOnWarmupCompleted = readTypedObject().onWarmupCompleted();
        boolean zBooleanValue = boolOnWarmupCompleted != null ? boolOnWarmupCompleted.booleanValue() : false;
        Boolean boolOnWarmupCompleted2 = readTypedObject().onWarmupCompleted();
        startActivityForResult(overrideEventDispatcher.onExtraCallback(overrideeventdispatcher, contextRequireContext, strName, "SV-AFC", (checkDeviceBrand) null, (String) null, false, (String) null, (String) null, (MobileCarrier) null, (String) null, (String) null, false, false, false, "card_issue", (String) null, (String) null, zBooleanValue, Boolean.valueOf(boolOnWarmupCompleted2 != null ? boolOnWarmupCompleted2.booleanValue() : false), false, (String) null, (String) null, strAsInterface, strBP_, false, false, false, (String) null, false, (updateRuntimeShadowNodeReferencesOnCommit) null, 0L, 0L, false, false, false, false, false, (String) null, (String) null, -12992520, 127, (Object) null), 101);
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        String strAsInterface;
        String strBP_;
        String stringExtra;
        super/*im.toss.uikit.base.UIKitBaseFragment*/.onActivityResult(i, i2, intent);
        if (i == 101 && i2 == -1) {
            KeyBoardVisiblePoint keyBoardVisiblePoint = null;
            if (intent == null || (strAsInterface = intent.getStringExtra("EXTRA_BANK_CODE")) == null) {
                KeyBoardVisiblePoint keyBoardVisiblePoint2 = this.onExtraCallbackWithResult;
                if (keyBoardVisiblePoint2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    keyBoardVisiblePoint2 = null;
                }
                strAsInterface = keyBoardVisiblePoint2.asInterface();
            }
            String str = strAsInterface;
            if (intent == null || (stringExtra = intent.getStringExtra("EXTRA_ACCOUNT_NO")) == null) {
                KeyBoardVisiblePoint keyBoardVisiblePoint3 = this.onExtraCallbackWithResult;
                if (keyBoardVisiblePoint3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    keyBoardVisiblePoint = keyBoardVisiblePoint3;
                }
                strBP_ = keyBoardVisiblePoint.bP_();
            } else {
                strBP_ = stringExtra;
            }
            getDigestAlgorithms.onExtraCallback(writeTypedObject(), RippleNode.onNavigationEvent(this), extraCallback(), new getStringArray(str, strBP_, intent != null ? intent.getLongExtra("EXTRA_BANK_ACCOUNT_VERIFY_ID", 0L) : 0L, Long.valueOf(zzaj.onWarmupCompleted().IAuthTabCallbackDefault())), (String) null, (String) null, (Map) null, 40, (Object) null);
            return;
        }
        RippleNode.onNavigationEvent(this).getInterfaceDescriptor();
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }
}
