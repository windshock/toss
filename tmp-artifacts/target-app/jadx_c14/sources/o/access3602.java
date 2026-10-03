package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View;
import im.toss.tds.view.component.atom.badge.TdsBadgeV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.widget.TdsTooltipV1View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AppNode;
import o.NativeReactDevToolsSettingsManagerSpec;
import o.access3602;
import o.parcelStartParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.databinding.RowTransactionListHeaderBinding;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class access3602 {
    public static final int IAuthTabCallback = exitAllPages.onExtraCallbackWithResult;
    private final exitAllPages<NativeKeyboardObserverSpec> onExtraCallback;
    private final onWarmupCompleted onWarmupCompleted;

    public interface onWarmupCompleted {
        default void IAuthTabCallback(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
        }

        default void ICustomTabsServiceDefault() {
        }

        default void onExtraCallback(@NotNull IAuthTabCallback iAuthTabCallback) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        }
    }

    public access3602(@NotNull exitAllPages<NativeKeyboardObserverSpec> exitallpages, @Nullable onWarmupCompleted onwarmupcompleted) {
        Intrinsics.checkNotNullParameter(exitallpages, "");
        this.onExtraCallback = exitallpages;
        this.onWarmupCompleted = onwarmupcompleted;
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements getBacktraceNote<LayoutInflater, ViewGroup, Boolean, RowTransactionListHeaderBinding> {
        public static final onExtraCallback onExtraCallback = new onExtraCallback();

        onExtraCallback() {
            super(3, RowTransactionListHeaderBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lviva/republica/toss/databinding/RowTransactionListHeaderBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return onWarmupCompleted((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        public final RowTransactionListHeaderBinding onWarmupCompleted(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            return RowTransactionListHeaderBinding.onWarmupCompleted(layoutInflater, viewGroup, z);
        }
    }

    public final void onNavigationEvent() {
        exitAllPages<NativeKeyboardObserverSpec> exitallpages = this.onExtraCallback;
        parcelStartParams.onNavigationEvent onnavigationevent = new parcelStartParams.onNavigationEvent();
        onnavigationevent.onExtraCallback(onExtraCallback.onExtraCallback);
        onnavigationevent.onExtraCallback(new Function2() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionHeaderDelegate$$ExternalSyntheticLambda0
            public final Object invoke(Object obj, Object obj2) {
                return access3602.onExtraCallbackWithResult(this.f$0, (AppNode) obj, (access3602.IAuthTabCallback) obj2);
            }
        });
        if (onnavigationevent.onNavigationEvent() == null && onnavigationevent.IAuthTabCallback() == null) {
            onnavigationevent.onExtraCallbackWithResult(onNavigationEvent.onNavigationEvent);
        }
        exitallpages.onExtraCallbackWithResult(onnavigationevent.onExtraCallback());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(final access3602 access3602Var, AppNode appNode, final IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(appNode, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        final RowTransactionListHeaderBinding rowTransactionListHeaderBinding = (RowTransactionListHeaderBinding) appNode.onExtraCallbackWithResult();
        if (iAuthTabCallback.asInterface().length() == 0) {
            rowTransactionListHeaderBinding.onWarmupCompleted.setTitle(rowTransactionListHeaderBinding.getRoot().getContext().getString(R.string.app_amount_empty));
        } else {
            rowTransactionListHeaderBinding.onWarmupCompleted.setTitle(iAuthTabCallback.asInterface());
        }
        rowTransactionListHeaderBinding.onWarmupCompleted.setSubtitle(iAuthTabCallback.asBinder());
        if (iAuthTabCallback.IAuthTabCallbackDefault().length() == 0) {
            TdsImageView tdsImageView = rowTransactionListHeaderBinding.onTransact;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            tdsImageView.setVisibility(8);
        } else {
            TdsImageView tdsImageView2 = rowTransactionListHeaderBinding.onTransact;
            Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
            tdsImageView2.setVisibility(0);
            if (iAuthTabCallback.access000()) {
                TdsImageView tdsImageView3 = rowTransactionListHeaderBinding.onTransact;
                Intrinsics.checkNotNullExpressionValue(tdsImageView3, "");
                UST_PKCS12_MakePFX.onWarmupCompleted(tdsImageView3, iAuthTabCallback.IAuthTabCallbackDefault(), false);
            } else {
                UST_PKCS12_MakePFX.IAuthTabCallback((ImageView) rowTransactionListHeaderBinding.onTransact, iAuthTabCallback.IAuthTabCallbackDefault(), (204 & 4) != 0 ? 38.0f : 0.0f, (204 & 8) != 0 ? 60.0f : 0.0f, (204 & 16) != 0 ? 2.0f : 4.0f, (204 & 32) != 0, (204 & 64) == 0 ? false : true, (204 & 128) != 0 ? null : null);
            }
        }
        if (iAuthTabCallback.onExtraCallbackWithResult().length() == 0) {
            TdsRoundLayout tdsRoundLayout = rowTransactionListHeaderBinding.asBinder;
            Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
            tdsRoundLayout.setVisibility(8);
        } else {
            TdsRoundLayout tdsRoundLayout2 = rowTransactionListHeaderBinding.asBinder;
            Intrinsics.checkNotNullExpressionValue(tdsRoundLayout2, "");
            tdsRoundLayout2.setVisibility(0);
            rowTransactionListHeaderBinding.IAuthTabCallback.setText(iAuthTabCallback.onExtraCallbackWithResult());
            if (access3602Var.onWarmupCompleted != null) {
                rowTransactionListHeaderBinding.onExtraCallbackWithResult.setBackgroundResource(R.drawable.ripple_adaptive_grey_100);
                rowTransactionListHeaderBinding.onExtraCallbackWithResult.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionHeaderDelegate$$ExternalSyntheticLambda1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        access3602.IAuthTabCallback(this.f$0, view);
                    }
                });
            }
        }
        if (iAuthTabCallback.IAuthTabCallbackStub()) {
            access3602Var.onNavigationEvent(rowTransactionListHeaderBinding, false);
            Typography7 typography7 = rowTransactionListHeaderBinding.asInterface;
            Intrinsics.checkNotNullExpressionValue(typography7, "");
            typography7.setVisibility(0);
            TdsImageView tdsImageView4 = rowTransactionListHeaderBinding.IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(tdsImageView4, "");
            tdsImageView4.setVisibility(0);
            TdsTooltipV1View tdsTooltipV1View = rowTransactionListHeaderBinding.IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(tdsTooltipV1View, "");
            tdsTooltipV1View.setVisibility(4);
            rowTransactionListHeaderBinding.asInterface.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionHeaderDelegate$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    access3602.onNavigationEvent(rowTransactionListHeaderBinding, access3602Var, view);
                }
            });
            rowTransactionListHeaderBinding.IAuthTabCallbackDefault.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionHeaderDelegate$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    access3602.onWarmupCompleted(rowTransactionListHeaderBinding, access3602Var, view);
                }
            });
        } else {
            Typography7 typography72 = rowTransactionListHeaderBinding.asInterface;
            Intrinsics.checkNotNullExpressionValue(typography72, "");
            typography72.setVisibility(8);
            TdsImageView tdsImageView5 = rowTransactionListHeaderBinding.IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(tdsImageView5, "");
            tdsImageView5.setVisibility(8);
            TdsTooltipV1View tdsTooltipV1View2 = rowTransactionListHeaderBinding.IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(tdsTooltipV1View2, "");
            tdsTooltipV1View2.setVisibility(8);
        }
        if (iAuthTabCallback.onTransact().length() > 0) {
            Typography7 typography73 = rowTransactionListHeaderBinding.access100;
            Intrinsics.checkNotNullExpressionValue(typography73, "");
            typography73.setVisibility(0);
            rowTransactionListHeaderBinding.access100.setText(iAuthTabCallback.onTransact());
        } else {
            Typography7 typography74 = rowTransactionListHeaderBinding.access100;
            Intrinsics.checkNotNullExpressionValue(typography74, "");
            typography74.setVisibility(8);
        }
        if (iAuthTabCallback.onNavigationEvent().length() > 0) {
            TdsBadgeV1View tdsBadgeV1View = rowTransactionListHeaderBinding.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(tdsBadgeV1View, "");
            tdsBadgeV1View.setVisibility(0);
            rowTransactionListHeaderBinding.onNavigationEvent.setText(iAuthTabCallback.onNavigationEvent());
            rowTransactionListHeaderBinding.onNavigationEvent.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionHeaderDelegate$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    access3602.onExtraCallback(this.f$0, iAuthTabCallback, view);
                }
            });
        } else {
            TdsBadgeV1View tdsBadgeV1View2 = rowTransactionListHeaderBinding.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(tdsBadgeV1View2, "");
            tdsBadgeV1View2.setVisibility(8);
        }
        if (iAuthTabCallback.onExtraCallback() == NativeReactDevToolsSettingsManagerSpec.onWarmupCompleted.CREDIT && DERSet.onExtraCallback.ITrustedWebActivityCallback_Parcel().length() > 0) {
            TdsRollingNumberV1View tdsRollingNumberV1ViewIAuthTabCallback = rowTransactionListHeaderBinding.onWarmupCompleted.IAuthTabCallback();
            TdsRollingNumberV1View.setCompoundDrawablePadding$default(tdsRollingNumberV1ViewIAuthTabCallback, varyMatches.IAuthTabCallback(tdsRollingNumberV1ViewIAuthTabCallback, 4), false, 2, (Object) null);
            TdsRollingNumberV1View.setCompoundDrawablesWithIntrinsicBounds$default(tdsRollingNumberV1ViewIAuthTabCallback, 0, Integer.valueOf(im.toss.core.R.drawable.icon_question_circle_mono), false, 4, (Object) null);
            M_ m_ = M_.onExtraCallback;
            Context context = tdsRollingNumberV1ViewIAuthTabCallback.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            tdsRollingNumberV1ViewIAuthTabCallback.setBackgroundResource(m_.onWarmupCompleted(context));
            tdsRollingNumberV1ViewIAuthTabCallback.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionHeaderDelegate$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    access3602.onNavigationEvent(this.f$0, view);
                }
            });
            onWarmupCompleted onwarmupcompleted = access3602Var.onWarmupCompleted;
        } else {
            TdsRollingNumberV1View tdsRollingNumberV1ViewIAuthTabCallback2 = rowTransactionListHeaderBinding.onWarmupCompleted.IAuthTabCallback();
            tdsRollingNumberV1ViewIAuthTabCallback2.setBackgroundResource(0);
            tdsRollingNumberV1ViewIAuthTabCallback2.setOnClickListener(null);
            tdsRollingNumberV1ViewIAuthTabCallback2.setClickable(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(access3602 access3602Var, View view) {
        access3602Var.onWarmupCompleted.ICustomTabsServiceDefault();
    }

    public static final class onNavigationEvent implements Function1<Object, Boolean> {
        public static final onNavigationEvent onNavigationEvent = new onNavigationEvent();

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof IAuthTabCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(RowTransactionListHeaderBinding rowTransactionListHeaderBinding, access3602 access3602Var, View view) {
        TdsTooltipV1View tdsTooltipV1View = rowTransactionListHeaderBinding.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(tdsTooltipV1View, "");
        if (tdsTooltipV1View.getVisibility() == 0) {
            TdsTooltipV1View tdsTooltipV1View2 = rowTransactionListHeaderBinding.IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(tdsTooltipV1View2, "");
            tdsTooltipV1View2.setVisibility(4);
        } else {
            TdsTooltipV1View tdsTooltipV1View3 = rowTransactionListHeaderBinding.IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(tdsTooltipV1View3, "");
            tdsTooltipV1View3.setVisibility(0);
        }
        TdsTooltipV1View tdsTooltipV1View4 = rowTransactionListHeaderBinding.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(tdsTooltipV1View4, "");
        access3602Var.onNavigationEvent(rowTransactionListHeaderBinding, tdsTooltipV1View4.getVisibility() == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(RowTransactionListHeaderBinding rowTransactionListHeaderBinding, access3602 access3602Var, View view) {
        TdsTooltipV1View tdsTooltipV1View = rowTransactionListHeaderBinding.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(tdsTooltipV1View, "");
        if (tdsTooltipV1View.getVisibility() == 0) {
            TdsTooltipV1View tdsTooltipV1View2 = rowTransactionListHeaderBinding.IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(tdsTooltipV1View2, "");
            tdsTooltipV1View2.setVisibility(4);
        } else {
            TdsTooltipV1View tdsTooltipV1View3 = rowTransactionListHeaderBinding.IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(tdsTooltipV1View3, "");
            tdsTooltipV1View3.setVisibility(0);
        }
        TdsTooltipV1View tdsTooltipV1View4 = rowTransactionListHeaderBinding.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(tdsTooltipV1View4, "");
        access3602Var.onNavigationEvent(rowTransactionListHeaderBinding, tdsTooltipV1View4.getVisibility() == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(access3602 access3602Var, IAuthTabCallback iAuthTabCallback, View view) {
        onWarmupCompleted onwarmupcompleted = access3602Var.onWarmupCompleted;
        if (onwarmupcompleted != null) {
            onwarmupcompleted.onExtraCallback(iAuthTabCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(access3602 access3602Var, View view) {
        onWarmupCompleted onwarmupcompleted = access3602Var.onWarmupCompleted;
        if (onwarmupcompleted != null) {
            onwarmupcompleted.IAuthTabCallback(DERSet.onExtraCallback.ITrustedWebActivityCallback_Parcel());
        }
    }

    private final void onNavigationEvent(RowTransactionListHeaderBinding rowTransactionListHeaderBinding, boolean z) {
        if (z) {
            rowTransactionListHeaderBinding.asInterface.setContentDescription(rowTransactionListHeaderBinding.getRoot().getContext().getString(R.string.accessibility_foreign_payment_help_open));
            rowTransactionListHeaderBinding.IAuthTabCallbackDefault.setContentDescription(rowTransactionListHeaderBinding.getRoot().getContext().getString(R.string.accessibility_help_close));
            TdsTooltipV1View tdsTooltipV1View = rowTransactionListHeaderBinding.IAuthTabCallbackStub;
            tdsTooltipV1View.announceForAccessibility(tdsTooltipV1View.asBinder());
            return;
        }
        rowTransactionListHeaderBinding.asInterface.setContentDescription(rowTransactionListHeaderBinding.getRoot().getContext().getString(R.string.accessibility_foreign_payment_help_open));
        rowTransactionListHeaderBinding.IAuthTabCallbackDefault.setContentDescription(rowTransactionListHeaderBinding.getRoot().getContext().getString(R.string.accessibility_help_open));
    }

    public static final class IAuthTabCallback implements NativeKeyboardObserverSpec {
        private final String IAuthTabCallback;
        private final String IAuthTabCallbackDefault;
        private final String IAuthTabCallbackStub;
        private final String asBinder;
        private final boolean asInterface;
        private final boolean onExtraCallback;
        private final NativeReactDevToolsSettingsManagerSpec.onWarmupCompleted onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final String onWarmupCompleted;

        public IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5, @NotNull String str6, boolean z2, @Nullable NativeReactDevToolsSettingsManagerSpec.onWarmupCompleted onwarmupcompleted) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            this.IAuthTabCallbackDefault = str;
            this.IAuthTabCallbackStub = str2;
            this.onWarmupCompleted = str3;
            this.IAuthTabCallback = str4;
            this.asInterface = z;
            this.asBinder = str5;
            this.onNavigationEvent = str6;
            this.onExtraCallback = z2;
            this.onExtraCallbackWithResult = onwarmupcompleted;
        }

        public /* synthetic */ IAuthTabCallback(String str, String str2, String str3, String str4, boolean z, String str5, String str6, boolean z2, NativeReactDevToolsSettingsManagerSpec.onWarmupCompleted onwarmupcompleted, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? null : onwarmupcompleted);
        }

        @Override // o.NativeKeyboardObserverSpec
        public /* bridge */ long IAuthTabCallback() {
            return super.IAuthTabCallback();
        }

        public final String asInterface() {
            return this.IAuthTabCallbackDefault;
        }

        public final String asBinder() {
            return this.IAuthTabCallbackStub;
        }

        public final String IAuthTabCallbackDefault() {
            return this.onWarmupCompleted;
        }

        public final String onExtraCallbackWithResult() {
            return this.IAuthTabCallback;
        }

        public final boolean IAuthTabCallbackStub() {
            return this.asInterface;
        }

        public final String onTransact() {
            return this.asBinder;
        }

        public final String onNavigationEvent() {
            return this.onNavigationEvent;
        }

        public final boolean access000() {
            return this.onExtraCallback;
        }

        public final NativeReactDevToolsSettingsManagerSpec.onWarmupCompleted onExtraCallback() {
            return this.onExtraCallbackWithResult;
        }

        @Override // o.NativeKeyboardObserverSpec
        public String onWarmupCompleted() {
            return "HEADER:" + this.IAuthTabCallbackDefault;
        }
    }
}
