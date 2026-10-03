package o;

import java.text.SimpleDateFormat;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.getNativeAdLayoutApi;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class getNativeAdLayoutApi {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final Lazy date$delegate = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.network.model.account.AccountTransactionItem$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            String strOnExtraCallback = getNativeAdLayoutApi.onExtraCallback(this.f$0);
            int i4 = onWarmupCompleted + 5;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return strOnExtraCallback;
        }
    });
    private final Lazy hourAndAbridge$delegate = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.network.model.account.AccountTransactionItem$$ExternalSyntheticLambda1
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String strIAuthTabCallback = getNativeAdLayoutApi.IAuthTabCallback(this.f$0);
            int i4 = onExtraCallback + 19;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return strIAuthTabCallback;
        }
    });
    private final Lazy year$delegate = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.network.model.account.AccountTransactionItem$$ExternalSyntheticLambda2
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Integer numValueOf = Integer.valueOf(getNativeAdLayoutApi.onExtraCallbackWithResult(this.f$0));
            int i4 = onExtraCallback + 45;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return numValueOf;
            }
            throw null;
        }
    });

    public static /* synthetic */ String IAuthTabCallback(getNativeAdLayoutApi getnativeadlayoutapi) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(getnativeadlayoutapi);
            throw null;
        }
        String strOnWarmupCompleted = onWarmupCompleted(getnativeadlayoutapi);
        int i3 = onWarmupCompleted + 113;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return strOnWarmupCompleted;
    }

    public static /* synthetic */ String onExtraCallback(getNativeAdLayoutApi getnativeadlayoutapi) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = onNavigationEvent(getnativeadlayoutapi);
        int i4 = onWarmupCompleted + 51;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return strOnNavigationEvent;
    }

    public static /* synthetic */ int onExtraCallbackWithResult(getNativeAdLayoutApi getnativeadlayoutapi) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnTransact = onTransact(getnativeadlayoutapi);
        int i4 = onWarmupCompleted + 59;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iOnTransact;
    }

    public abstract long IAuthTabCallback();

    public abstract long IAuthTabCallbackDefault();

    public abstract String IAuthTabCallbackStub();

    public abstract String asBinder();

    public abstract String onNavigationEvent();

    public abstract long onWarmupCompleted();

    private static final String onNavigationEvent(getNativeAdLayoutApi getnativeadlayoutapi) {
        int i = 2 % 2;
        String str = new SimpleDateFormat("M.d").format(Long.valueOf(getnativeadlayoutapi.onWarmupCompleted()));
        int i2 = onNavigationEvent + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.date$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        String str = (String) value;
        int i4 = onWarmupCompleted + 21;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return str;
    }

    private static final String onWarmupCompleted(getNativeAdLayoutApi getnativeadlayoutapi) {
        String str;
        int i = 2 % 2;
        String str2 = new SimpleDateFormat("HH:mm").format(Long.valueOf(getnativeadlayoutapi.onWarmupCompleted()));
        if (getnativeadlayoutapi.onNavigationEvent().length() == 0) {
            int i2 = onNavigationEvent + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            str = "";
        } else {
            str = " | " + getnativeadlayoutapi.onNavigationEvent();
            int i4 = onWarmupCompleted + 61;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        return str2 + str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.hourAndAbridge$delegate.getValue();
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        return str;
    }

    private static final int onTransact(getNativeAdLayoutApi getnativeadlayoutapi) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int i4 = zzaj.onWarmupCompleted().onNavigationEvent(getnativeadlayoutapi.onWarmupCompleted()).get(1);
        int i5 = onWarmupCompleted + 119;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.year$delegate.getValue();
        if (i3 != 0) {
            return ((Number) value).intValue();
        }
        ((Number) value).intValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
