package o;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.parcelStartParams;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.account.wait.delegate.HistoryEmptyDelegate$;
import viva.republica.toss.databinding.RowScrapingAccountHistoryEmptyBinding;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DEREncodableVector {
    public static final int IAuthTabCallback = exitAllPages.onExtraCallbackWithResult;
    private final exitAllPages<Object> onExtraCallback;

    public DEREncodableVector(@NotNull exitAllPages<Object> exitallpages) {
        Intrinsics.checkNotNullParameter(exitallpages, "");
        this.onExtraCallback = exitallpages;
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements getBacktraceNote<LayoutInflater, ViewGroup, Boolean, RowScrapingAccountHistoryEmptyBinding> {
        public static final IAuthTabCallback IAuthTabCallback = new IAuthTabCallback();

        IAuthTabCallback() {
            super(3, RowScrapingAccountHistoryEmptyBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lviva/republica/toss/databinding/RowScrapingAccountHistoryEmptyBinding;", 0);
        }

        public final RowScrapingAccountHistoryEmptyBinding IAuthTabCallback(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            return RowScrapingAccountHistoryEmptyBinding.onExtraCallback(layoutInflater, viewGroup, z);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return IAuthTabCallback((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    public final void onExtraCallbackWithResult() {
        exitAllPages<Object> exitallpages = this.onExtraCallback;
        parcelStartParams.onNavigationEvent onnavigationevent = new parcelStartParams.onNavigationEvent();
        onnavigationevent.onExtraCallback(IAuthTabCallback.IAuthTabCallback);
        onnavigationevent.onExtraCallback(new HistoryEmptyDelegate$.ExternalSyntheticLambda0());
        if (onnavigationevent.onNavigationEvent() == null && onnavigationevent.IAuthTabCallback() == null) {
            onnavigationevent.onExtraCallbackWithResult(onWarmupCompleted.onExtraCallbackWithResult);
        }
        exitallpages.onExtraCallbackWithResult(onnavigationevent.onExtraCallback());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(AppNode appNode, onExtraCallbackWithResult onextracallbackwithresult) {
        Intrinsics.checkNotNullParameter(appNode, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        RowScrapingAccountHistoryEmptyBinding rowScrapingAccountHistoryEmptyBindingOnExtraCallbackWithResult = appNode.onExtraCallbackWithResult();
        DisplayMetrics displayMetrics = ((RecyclerView.ViewHolder) appNode).onNavigationEvent.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iMin = Math.min(varyMatches.onNavigationEvent(64, displayMetrics), M_.onExtraCallback.IAuthTabCallbackDefault() / 12);
        rowScrapingAccountHistoryEmptyBindingOnExtraCallbackWithResult.onExtraCallbackWithResult().setPadding(0, iMin, 0, iMin);
        LottieAnimationView lottieAnimationViewWriteTypedObject = rowScrapingAccountHistoryEmptyBindingOnExtraCallbackWithResult.onExtraCallback.writeTypedObject();
        if (lottieAnimationViewWriteTypedObject != null) {
            ViewGroup.LayoutParams layoutParams = lottieAnimationViewWriteTypedObject.getLayoutParams();
            if (layoutParams != null) {
                DisplayMetrics displayMetrics2 = ((RecyclerView.ViewHolder) appNode).onNavigationEvent.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                layoutParams.width = varyMatches.onNavigationEvent(64, displayMetrics2);
                DisplayMetrics displayMetrics3 = ((RecyclerView.ViewHolder) appNode).onNavigationEvent.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
                layoutParams.height = varyMatches.onNavigationEvent(64, displayMetrics3);
                lottieAnimationViewWriteTypedObject.setLayoutParams(layoutParams);
                lottieAnimationViewWriteTypedObject.setRepeatCount(-1);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        return Unit.INSTANCE;
    }

    public static final class onExtraCallbackWithResult {
        public static final onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();
        private static final long onExtraCallback = 206355364;

        private onExtraCallbackWithResult() {
        }

        public final long IAuthTabCallback() {
            return onExtraCallback;
        }
    }

    public static final class onWarmupCompleted implements Function1<Object, Boolean> {
        public static final onWarmupCompleted onExtraCallbackWithResult = new onWarmupCompleted();

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof onExtraCallbackWithResult);
        }
    }
}
