package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.parcelStartParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.account.wait.delegate.HistoryDividerDelegate$;
import viva.republica.toss.databinding.RowScrapingAccountHistoryDividerBinding;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DERGeneralizedTime {
    public static final int onWarmupCompleted = exitAllPages.onExtraCallbackWithResult;
    private final exitAllPages<Object> IAuthTabCallback;

    public DERGeneralizedTime(@NotNull exitAllPages<Object> exitallpages) {
        Intrinsics.checkNotNullParameter(exitallpages, "");
        this.IAuthTabCallback = exitallpages;
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements getBacktraceNote<LayoutInflater, ViewGroup, Boolean, RowScrapingAccountHistoryDividerBinding> {
        public static final onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
            super(3, RowScrapingAccountHistoryDividerBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lviva/republica/toss/databinding/RowScrapingAccountHistoryDividerBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return onExtraCallback((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        public final RowScrapingAccountHistoryDividerBinding onExtraCallback(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            return RowScrapingAccountHistoryDividerBinding.onNavigationEvent(layoutInflater, viewGroup, z);
        }
    }

    public final void IAuthTabCallback() {
        exitAllPages<Object> exitallpages = this.IAuthTabCallback;
        parcelStartParams.onNavigationEvent onnavigationevent = new parcelStartParams.onNavigationEvent();
        onnavigationevent.onExtraCallback(onExtraCallbackWithResult.IAuthTabCallback);
        onnavigationevent.onExtraCallback(new HistoryDividerDelegate$.ExternalSyntheticLambda0());
        if (onnavigationevent.onNavigationEvent() == null && onnavigationevent.IAuthTabCallback() == null) {
            onnavigationevent.onExtraCallbackWithResult(onWarmupCompleted.onExtraCallback);
        }
        exitallpages.onExtraCallbackWithResult(onnavigationevent.onExtraCallback());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(AppNode appNode, IAuthTabCallback iAuthTabCallback) {
        int iIsEngagementSignalsApiAvailable;
        Intrinsics.checkNotNullParameter(appNode, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        RowScrapingAccountHistoryDividerBinding rowScrapingAccountHistoryDividerBindingOnExtraCallbackWithResult = appNode.onExtraCallbackWithResult();
        View view = rowScrapingAccountHistoryDividerBindingOnExtraCallbackWithResult.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = iAuthTabCallback.onTransact();
            marginLayoutParams.bottomMargin = iAuthTabCallback.IAuthTabCallback();
            marginLayoutParams.leftMargin = iAuthTabCallback.onExtraCallback();
            marginLayoutParams.height = iAuthTabCallback.onExtraCallbackWithResult();
            view.setLayoutParams(marginLayoutParams);
            View view2 = rowScrapingAccountHistoryDividerBindingOnExtraCallbackWithResult.IAuthTabCallback;
            Integer numOnNavigationEvent = iAuthTabCallback.onNavigationEvent();
            if (numOnNavigationEvent != null) {
                iIsEngagementSignalsApiAvailable = numOnNavigationEvent.intValue();
            } else {
                View view3 = ((RecyclerView.ViewHolder) appNode).onNavigationEvent;
                Intrinsics.checkNotNullExpressionValue(view3, "");
                Context context = view3.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                Configuration configuration = context.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                iIsEngagementSignalsApiAvailable = new getUrlokhttp(new onNavigationEvent(configuration)).isEngagementSignalsApiAvailable();
            }
            view2.setBackgroundColor(iIsEngagementSignalsApiAvailable);
            return Unit.INSTANCE;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final class onNavigationEvent implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onNavigationEvent(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallback {
        private final int IAuthTabCallback;
        private final int asBinder;
        private final long onExtraCallback;
        private final Integer onExtraCallbackWithResult;
        private final int onNavigationEvent;
        private final int onWarmupCompleted;

        public IAuthTabCallback() {
            this(0, 0, 0, 0, null, 31, null);
        }

        public IAuthTabCallback(int i, int i2, int i3, int i4, @Nullable Integer num) {
            this.asBinder = i;
            this.onNavigationEvent = i2;
            this.IAuthTabCallback = i3;
            this.onWarmupCompleted = i4;
            this.onExtraCallbackWithResult = num;
            this.onExtraCallback = (i + ":" + i2 + ":" + i3).hashCode();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ IAuthTabCallback(int i, int i2, int i3, int i4, Integer num, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            int iOnNavigationEvent;
            int iOnNavigationEvent2;
            int i6 = (i5 & 1) != 0 ? 0 : i;
            int i7 = (i5 & 2) == 0 ? i2 : 0;
            if ((i5 & 4) != 0) {
                DisplayMetrics displayMetrics = ((Resources) followRedirects.IAuthTabCallback(1316113812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{followRedirects.onExtraCallbackWithResult}, -1316113811, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                iOnNavigationEvent = varyMatches.onNavigationEvent(24, displayMetrics);
            } else {
                iOnNavigationEvent = i3;
            }
            if ((i5 & 8) != 0) {
                DisplayMetrics displayMetrics2 = ((Resources) followRedirects.IAuthTabCallback(1316113812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{followRedirects.onExtraCallbackWithResult}, -1316113811, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                iOnNavigationEvent2 = varyMatches.onNavigationEvent(Double.valueOf(0.5d), displayMetrics2);
            } else {
                iOnNavigationEvent2 = i4;
            }
            this(i6, i7, iOnNavigationEvent, iOnNavigationEvent2, (i5 & 16) != 0 ? null : num);
        }

        public final int onTransact() {
            return this.asBinder;
        }

        public final int IAuthTabCallback() {
            return this.onNavigationEvent;
        }

        public final int onExtraCallback() {
            return this.IAuthTabCallback;
        }

        public final int onExtraCallbackWithResult() {
            return this.onWarmupCompleted;
        }

        public final Integer onNavigationEvent() {
            return this.onExtraCallbackWithResult;
        }

        public final long onWarmupCompleted() {
            return this.onExtraCallback;
        }
    }

    public static final class onWarmupCompleted implements Function1<Object, Boolean> {
        public static final onWarmupCompleted onExtraCallback = new onWarmupCompleted();

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof IAuthTabCallback);
        }
    }
}
