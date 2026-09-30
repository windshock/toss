package o;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.widget.TdsNestedScrollView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ToolkitManagerb;
import o.initMiniApp;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ToolkitManagerb {
    public static final ToolkitManagerb IAuthTabCallback = new ToolkitManagerb();

    private ToolkitManagerb() {
    }

    public static final class onWarmupCompleted implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

        public final void IAuthTabCallback(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            IAuthTabCallback(onwarmupcompleted);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(getTypedExportedConstants gettypedexportedconstants, TdsBottomCtaV1View tdsBottomCtaV1View, NestedScrollView nestedScrollView, View view) {
        gettypedexportedconstants.dismiss();
        TdsBottomCtaV1View.IAuthTabCallback(tdsBottomCtaV1View, nestedScrollView, false, 0, 6, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [android.app.Dialog, o.BrickModuleImplExternalSyntheticLambda0, o.getTypedExportedConstants] */
    public final void onWarmupCompleted(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        onWarmupCompleted onwarmupcompleted = onWarmupCompleted.onWarmupCompleted;
        logAndOpenStore.IAuthTabCallback(context, null);
        final ?? gettypedexportedconstants = new getTypedExportedConstants(context, 0, false, false, -1L, onwarmupcompleted, 14, null);
        Context context2 = gettypedexportedconstants.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(1);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        final TdsNestedScrollView tdsNestedScrollView = new TdsNestedScrollView(context3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = -1;
        layoutParams2.height = 0;
        layoutParams2.weight = 1.0f;
        tdsNestedScrollView.setLayoutParams(layoutParams);
        Context context4 = tdsNestedScrollView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        LinearLayout linearLayout2 = new LinearLayout(context4);
        linearLayout2.setOrientation(1);
        DisplayMetrics displayMetrics = linearLayout2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(24, displayMetrics);
        DisplayMetrics displayMetrics2 = linearLayout2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(24, displayMetrics2);
        DisplayMetrics displayMetrics3 = linearLayout2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        linearLayout2.setPadding(iOnNavigationEvent, iOnNavigationEvent2, varyMatches.onNavigationEvent(24, displayMetrics3), linearLayout2.getPaddingBottom());
        BaseTextView baseTextView = (BaseTextView) Typography5.class.getDeclaredConstructor(Context.class).newInstance(linearLayout2.getContext());
        Intrinsics.checkNotNull(baseTextView);
        baseTextView.setText(context.getString(R.string.prepaid_account_disclaimer_text, str, FaceDetectCallBack.onExtraCallbackWithResult.IAuthTabCallback(str, false) ? "은" : "는"));
        Intrinsics.checkNotNull(baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(tdsNestedScrollView, linearLayout2);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsNestedScrollView);
        Context context5 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        final TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context5);
        String string = context.getString(im.toss.uikit.R.string.uikit_confirm);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new View.OnClickListener() { // from class: viva.republica.toss.account.PrepaidAccountDisclaimerBottomSheetHelper$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToolkitManagerb.onExtraCallbackWithResult(gettypedexportedconstants, tdsBottomCtaV1View, tdsNestedScrollView, view);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        gettypedexportedconstants.setContentView(linearLayout);
        gettypedexportedconstants.show();
    }
}
