package o;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.parcelStartParams;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.account.wait.delegate.HistoryDateDelegate$;
import viva.republica.toss.databinding.RowScrapingAccountHistoryDateBinding;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DEREncodable {
    public static final int onNavigationEvent = exitAllPages.onExtraCallbackWithResult;
    private final exitAllPages<Object> onExtraCallback;

    public DEREncodable(@NotNull exitAllPages<Object> exitallpages) {
        Intrinsics.checkNotNullParameter(exitallpages, "");
        this.onExtraCallback = exitallpages;
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements getBacktraceNote<LayoutInflater, ViewGroup, Boolean, RowScrapingAccountHistoryDateBinding> {
        public static final onExtraCallback onExtraCallbackWithResult = new onExtraCallback();

        onExtraCallback() {
            super(3, RowScrapingAccountHistoryDateBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lviva/republica/toss/databinding/RowScrapingAccountHistoryDateBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return onExtraCallbackWithResult((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        public final RowScrapingAccountHistoryDateBinding onExtraCallbackWithResult(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            return RowScrapingAccountHistoryDateBinding.onExtraCallback(layoutInflater, viewGroup, z);
        }
    }

    public final void onExtraCallback() {
        exitAllPages<Object> exitallpages = this.onExtraCallback;
        parcelStartParams.onNavigationEvent onnavigationevent = new parcelStartParams.onNavigationEvent();
        onnavigationevent.onExtraCallback(onExtraCallback.onExtraCallbackWithResult);
        onnavigationevent.onExtraCallback(new HistoryDateDelegate$.ExternalSyntheticLambda0());
        if (onnavigationevent.onNavigationEvent() == null && onnavigationevent.IAuthTabCallback() == null) {
            onnavigationevent.onExtraCallbackWithResult(IAuthTabCallback.onExtraCallback);
        }
        exitallpages.onExtraCallbackWithResult(onnavigationevent.onExtraCallback());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(AppNode appNode, onExtraCallbackWithResult onextracallbackwithresult) {
        Intrinsics.checkNotNullParameter(appNode, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        appNode.onExtraCallbackWithResult().IAuthTabCallback.setText(onextracallbackwithresult.onNavigationEvent());
        return Unit.INSTANCE;
    }

    public static final class onExtraCallbackWithResult {
        private final String onExtraCallback;
        private final long onWarmupCompleted;

        public onExtraCallbackWithResult(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallback = str;
            this.onWarmupCompleted = str.hashCode();
        }

        public final String onNavigationEvent() {
            return this.onExtraCallback;
        }

        public final long IAuthTabCallback() {
            return this.onWarmupCompleted;
        }
    }

    public static final class IAuthTabCallback implements Function1<Object, Boolean> {
        public static final IAuthTabCallback onExtraCallback = new IAuthTabCallback();

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof onExtraCallbackWithResult);
        }
    }
}
