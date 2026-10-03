package viva.republica.toss.cardrecommend.issuev2.ui;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.widget.TdsScrollView;
import im.toss.uikit.widget.TdsSegmentedControlV1View;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.PullRefreshStateKtExternalSyntheticLambda0;
import o.RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1;
import o.access15300;
import o.getDigestAlgorithms;
import o.getL;
import o.setProxySelectorokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueSettingFragment extends CardIssueBaseFragment<getL> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(CardIssueSettingFragment cardIssueSettingFragment, TdsSegmentedControlV1View tdsSegmentedControlV1View, TdsSegmentedControlV1View tdsSegmentedControlV1View2, TdsSegmentedControlV1View tdsSegmentedControlV1View3, TdsBottomCtaV1View tdsBottomCtaV1View, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        cardIssueSettingFragment.extraCallback().onExtraCallbackWithResult(tdsSegmentedControlV1View.onWarmupCompleted() == 1 ? "DEFAULT" : null);
        cardIssueSettingFragment.extraCallback().onNavigationEvent(tdsSegmentedControlV1View2.onWarmupCompleted() == 0);
        CardIssueOverviewViewModel cardIssueOverviewViewModelExtraCallback = cardIssueSettingFragment.extraCallback();
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) CollectionsKt.getOrNull(IAuthTabCallback.getEntries(), tdsSegmentedControlV1View3.onWarmupCompleted());
        if (iAuthTabCallback == null) {
            iAuthTabCallback = IAuthTabCallback.NORMAL;
        }
        cardIssueOverviewViewModelExtraCallback.IAuthTabCallback(iAuthTabCallback);
        getDigestAlgorithms.onExtraCallback(cardIssueSettingFragment.writeTypedObject(), PullRefreshStateKtExternalSyntheticLambda0.onExtraCallbackWithResult(tdsBottomCtaV1View), cardIssueSettingFragment.extraCallback(), (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, (String) null, tdsBottomCtaV1View.asInterface().getText().toString(), (Map) null, 40, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private final int displayNameResId;
        public static final IAuthTabCallback NORMAL = new IAuthTabCallback("NORMAL", 0, R.string.app_cardrecommend_issuev2_ui_setting_id_mock_type_a);
        public static final IAuthTabCallback MAINTENANCE = new IAuthTabCallback("MAINTENANCE", 1, R.string.app_cardrecommend_issuev2_ui_setting_id_mock_type_b);
        public static final IAuthTabCallback SYSTEM_ERROR = new IAuthTabCallback("SYSTEM_ERROR", 2, R.string.app_cardrecommend_issuev2_ui_setting_id_mock_type_c);

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            return new IAuthTabCallback[]{NORMAL, MAINTENANCE, SYSTEM_ERROR};
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            return $ENTRIES;
        }

        public static IAuthTabCallback valueOf(String str) {
            return (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
        }

        public static IAuthTabCallback[] values() {
            return (IAuthTabCallback[]) $VALUES.clone();
        }

        private IAuthTabCallback(String str, int i, int i2) {
            this.displayNameResId = i2;
        }

        public final int getDisplayNameResId() {
            return this.displayNameResId;
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
        }
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        TdsScrollView tdsScrollView = new TdsScrollView(contextRequireContext, (AttributeSet) null, 0, 0, 14, (DefaultConstructorMarker) null);
        Context context = tdsScrollView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        TdsTopV1View tdsTopV1View = new TdsTopV1View(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsTopV1View.setUpperType(TdsTopV1View.onExtraCallbackWithResult.TOP3);
        tdsTopV1View.setUpperText(getString(R.string.app_cardrecommend_issuev2_ui___efb60e8218));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsTopV1View);
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        final TdsSegmentedControlV1View tdsSegmentedControlV1View = new TdsSegmentedControlV1View(contextRequireContext2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsSegmentedControlV1View.setLabel(getString(R.string.app_cardrecommend_issuev2_ui___ddf07b8546));
        String string = getString(R.string.app_cardrecommend_issuev2_ui___f6846cfc84);
        Intrinsics.checkNotNullExpressionValue(string, "");
        tdsSegmentedControlV1View.onWarmupCompleted(string);
        String string2 = getString(R.string.app_cardrecommend_issuev2_ui___cfd4944238);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        tdsSegmentedControlV1View.onWarmupCompleted(string2);
        TdsSegmentedControlV1View.onExtraCallback(tdsSegmentedControlV1View, 0, false, false, 6, (Object) null);
        DisplayMetrics displayMetrics = tdsSegmentedControlV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(24, displayMetrics);
        DisplayMetrics displayMetrics2 = tdsSegmentedControlV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(24, displayMetrics2);
        DisplayMetrics displayMetrics3 = tdsSegmentedControlV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        int iOnNavigationEvent3 = varyMatches.onNavigationEvent(24, displayMetrics3);
        DisplayMetrics displayMetrics4 = tdsSegmentedControlV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
        tdsSegmentedControlV1View.setPadding(iOnNavigationEvent, iOnNavigationEvent2, iOnNavigationEvent3, varyMatches.onNavigationEvent(24, displayMetrics4));
        linearLayout.addView(tdsSegmentedControlV1View);
        Context contextRequireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
        final TdsSegmentedControlV1View tdsSegmentedControlV1View2 = new TdsSegmentedControlV1View(contextRequireContext3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsSegmentedControlV1View2.setLabel(getString(R.string.app_cardrecommend_issuev2_ui___af8c145666));
        String string3 = getString(R.string.app_cardrecommend_issuev2_ui___5b4a45c263);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        tdsSegmentedControlV1View2.onWarmupCompleted(string3);
        String string4 = getString(R.string.app_cardrecommend_issuev2_ui___95bcaf5540);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        tdsSegmentedControlV1View2.onWarmupCompleted(string4);
        TdsSegmentedControlV1View.onExtraCallback(tdsSegmentedControlV1View2, 0, false, false, 6, (Object) null);
        DisplayMetrics displayMetrics5 = tdsSegmentedControlV1View2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
        int iOnNavigationEvent4 = varyMatches.onNavigationEvent(24, displayMetrics5);
        DisplayMetrics displayMetrics6 = tdsSegmentedControlV1View2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
        int iOnNavigationEvent5 = varyMatches.onNavigationEvent(24, displayMetrics6);
        DisplayMetrics displayMetrics7 = tdsSegmentedControlV1View2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics7, "");
        int iOnNavigationEvent6 = varyMatches.onNavigationEvent(24, displayMetrics7);
        DisplayMetrics displayMetrics8 = tdsSegmentedControlV1View2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics8, "");
        tdsSegmentedControlV1View2.setPadding(iOnNavigationEvent4, iOnNavigationEvent5, iOnNavigationEvent6, varyMatches.onNavigationEvent(24, displayMetrics8));
        linearLayout.addView(tdsSegmentedControlV1View2);
        Context contextRequireContext4 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "");
        final TdsSegmentedControlV1View tdsSegmentedControlV1View3 = new TdsSegmentedControlV1View(contextRequireContext4, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsSegmentedControlV1View3.setLabel(getString(R.string.app_cardrecommend_issuev2_ui_setting_id_mock_title));
        Iterator it = IAuthTabCallback.getEntries().iterator();
        while (it.hasNext()) {
            String string5 = getString(((IAuthTabCallback) it.next()).getDisplayNameResId());
            Intrinsics.checkNotNullExpressionValue(string5, "");
            tdsSegmentedControlV1View3.onWarmupCompleted(string5);
        }
        TdsSegmentedControlV1View.onExtraCallback(tdsSegmentedControlV1View3, 0, false, false, 6, (Object) null);
        DisplayMetrics displayMetrics9 = tdsSegmentedControlV1View3.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics9, "");
        int iOnNavigationEvent7 = varyMatches.onNavigationEvent(24, displayMetrics9);
        DisplayMetrics displayMetrics10 = tdsSegmentedControlV1View3.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics10, "");
        int iOnNavigationEvent8 = varyMatches.onNavigationEvent(24, displayMetrics10);
        DisplayMetrics displayMetrics11 = tdsSegmentedControlV1View3.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics11, "");
        int iOnNavigationEvent9 = varyMatches.onNavigationEvent(24, displayMetrics11);
        DisplayMetrics displayMetrics12 = tdsSegmentedControlV1View3.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics12, "");
        tdsSegmentedControlV1View3.setPadding(iOnNavigationEvent7, iOnNavigationEvent8, iOnNavigationEvent9, varyMatches.onNavigationEvent(24, displayMetrics12));
        linearLayout.addView(tdsSegmentedControlV1View3);
        tdsSegmentedControlV1View2.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSettingFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj, Object obj2) {
                return CardIssueSettingFragment.onExtraCallbackWithResult(tdsSegmentedControlV1View3, (View) obj, ((Integer) obj2).intValue());
            }
        });
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        final TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context3);
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, R.string.app_cardrecommend_issuev2_ui___389b82de7b, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSettingFragment$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return CardIssueSettingFragment.onNavigationEvent(this.f$0, tdsSegmentedControlV1View, tdsSegmentedControlV1View2, tdsSegmentedControlV1View3, tdsBottomCtaV1View, (View) obj);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        setProxySelectorokhttp.onExtraCallbackWithResult(tdsScrollView, linearLayout);
        return tdsScrollView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(TdsSegmentedControlV1View tdsSegmentedControlV1View, View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        tdsSegmentedControlV1View.setVisibility(i == 0 ? 0 : 8);
        return Unit.INSTANCE;
    }
}
