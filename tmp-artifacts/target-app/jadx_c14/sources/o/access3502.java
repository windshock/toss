package o;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.uikit.widget.TdsResultV0View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AppNode;
import o.ComposableLambdaImplExternalSyntheticLambda2;
import o.access3502;
import o.parcelStartParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.databinding.RowConsumptionTransactionEmptyBinding;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class access3502 {
    public static final int onExtraCallback = exitAllPages.onExtraCallbackWithResult;
    private final onExtraCallback IAuthTabCallback;
    private final exitAllPages<NativeKeyboardObserverSpec> onExtraCallbackWithResult;

    public interface onExtraCallback {
        void updateVisuals();
    }

    public access3502(@NotNull exitAllPages<NativeKeyboardObserverSpec> exitallpages, @Nullable onExtraCallback onextracallback) {
        Intrinsics.checkNotNullParameter(exitallpages, "");
        this.onExtraCallbackWithResult = exitallpages;
        this.IAuthTabCallback = onextracallback;
    }

    static final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements getBacktraceNote<LayoutInflater, ViewGroup, Boolean, RowConsumptionTransactionEmptyBinding> {
        public static final onNavigationEvent onNavigationEvent = new onNavigationEvent();

        onNavigationEvent() {
            super(3, RowConsumptionTransactionEmptyBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lviva/republica/toss/databinding/RowConsumptionTransactionEmptyBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return onExtraCallback((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        public final RowConsumptionTransactionEmptyBinding onExtraCallback(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            return RowConsumptionTransactionEmptyBinding.onExtraCallback(layoutInflater, viewGroup, z);
        }
    }

    public final void onNavigationEvent() {
        exitAllPages<NativeKeyboardObserverSpec> exitallpages = this.onExtraCallbackWithResult;
        parcelStartParams.onNavigationEvent onnavigationevent = new parcelStartParams.onNavigationEvent();
        onnavigationevent.onExtraCallback(onNavigationEvent.onNavigationEvent);
        onnavigationevent.onExtraCallback(new Function2() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionEmptyDelegate$$ExternalSyntheticLambda0
            public final Object invoke(Object obj, Object obj2) {
                return access3502.onExtraCallbackWithResult(this.f$0, (AppNode) obj, (access3502.IAuthTabCallback) obj2);
            }
        });
        if (onnavigationevent.onNavigationEvent() == null && onnavigationevent.IAuthTabCallback() == null) {
            onnavigationevent.onExtraCallbackWithResult(onExtraCallbackWithResult.onWarmupCompleted);
        }
        exitallpages.onExtraCallbackWithResult(onnavigationevent.onExtraCallback());
    }

    public static final class onWarmupCompleted implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public onWarmupCompleted(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(final access3502 access3502Var, AppNode appNode, IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(appNode, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        final RowConsumptionTransactionEmptyBinding rowConsumptionTransactionEmptyBinding = (RowConsumptionTransactionEmptyBinding) appNode.onExtraCallbackWithResult();
        DisplayMetrics displayMetrics = ((RecyclerView.ViewHolder) appNode).onNavigationEvent.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iMin = Math.min(varyMatches.onNavigationEvent(52, displayMetrics), M_.onExtraCallback.IAuthTabCallbackDefault() / 12);
        rowConsumptionTransactionEmptyBinding.getRoot().setPadding(0, iMin, 0, iMin);
        Object[] objArr = {rowConsumptionTransactionEmptyBinding.onExtraCallback};
        BaseTextView baseTextView = (BaseTextView) TdsResultV0View.onExtraCallbackWithResult(alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 2034279471, -2034279471, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), objArr);
        ConstraintLayout root = rowConsumptionTransactionEmptyBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        Context context = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        baseTextView.setTextColor(new getUrlokhttp(new onWarmupCompleted(configuration)).onRelationshipValidationResult());
        rowConsumptionTransactionEmptyBinding.onExtraCallback.setTitle(iAuthTabCallback.onExtraCallback());
        rowConsumptionTransactionEmptyBinding.onExtraCallback.setButtonLabel(iAuthTabCallback.onNavigationEvent());
        rowConsumptionTransactionEmptyBinding.onExtraCallback.setOnButtonClickListener(new Function1() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionEmptyDelegate$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return access3502.onWarmupCompleted(this.f$0, (View) obj);
            }
        });
        setDoubleTapZoomDpi setdoubletapzoomdpi = setDoubleTapZoomDpi.IAuthTabCallback;
        Context context2 = rowConsumptionTransactionEmptyBinding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setdoubletapzoomdpi.onNavigationEvent(context2, iAuthTabCallback.onExtraCallbackWithResult(), new Function1() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionEmptyDelegate$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return access3502.onExtraCallbackWithResult(rowConsumptionTransactionEmptyBinding, (ComposableLambdaImplExternalSyntheticLambda2) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(access3502 access3502Var, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        onExtraCallback onextracallback = access3502Var.IAuthTabCallback;
        if (onextracallback != null) {
            onextracallback.updateVisuals();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(RowConsumptionTransactionEmptyBinding rowConsumptionTransactionEmptyBinding, ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2) {
        Intrinsics.checkNotNullParameter(composableLambdaImplExternalSyntheticLambda2, "");
        setDoubleTapZoomDpi setdoubletapzoomdpi = setDoubleTapZoomDpi.IAuthTabCallback;
        LottieAnimationView lottieAnimationViewWriteTypedObject = rowConsumptionTransactionEmptyBinding.onExtraCallback.writeTypedObject();
        Intrinsics.checkNotNullExpressionValue(lottieAnimationViewWriteTypedObject, "");
        setDoubleTapZoomDpi.onExtraCallbackWithResult(setdoubletapzoomdpi, lottieAnimationViewWriteTypedObject, composableLambdaImplExternalSyntheticLambda2, 0, false, 0L, 8, null);
        return Unit.INSTANCE;
    }

    public static final class IAuthTabCallback implements NativeKeyboardObserverSpec {
        private final String onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final String onWarmupCompleted;

        public IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.onExtraCallbackWithResult = str;
            this.onWarmupCompleted = str2;
            this.onExtraCallback = str3;
        }

        @Override // o.NativeKeyboardObserverSpec
        public /* bridge */ long IAuthTabCallback() {
            return super.IAuthTabCallback();
        }

        public final String onExtraCallback() {
            return this.onExtraCallbackWithResult;
        }

        public final String onExtraCallbackWithResult() {
            return this.onWarmupCompleted;
        }

        public final String onNavigationEvent() {
            return this.onExtraCallback;
        }

        @Override // o.NativeKeyboardObserverSpec
        public String onWarmupCompleted() {
            return this.onExtraCallbackWithResult + ":" + this.onWarmupCompleted + ":" + this.onExtraCallback;
        }
    }

    public static final class onExtraCallbackWithResult implements Function1<Object, Boolean> {
        public static final onExtraCallbackWithResult onWarmupCompleted = new onExtraCallbackWithResult();

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof IAuthTabCallback);
        }
    }
}
