package o;

import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ebExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ebExternalSyntheticLambda0 {
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted;
    private final AppSetIdAndScope1 IAuthTabCallback;
    private final zzad onExtraCallback;
    private final TextRoundCornerProgressBarSavedState1 onNavigationEvent;
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static final Lazy<ebExternalSyntheticLambda0> onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.common.log.TossReactDebug$$ExternalSyntheticLambda0
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ebExternalSyntheticLambda0 ebexternalsyntheticlambda0OnNavigationEvent = ebExternalSyntheticLambda0.onNavigationEvent();
            int i4 = onNavigationEvent + 113;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return ebexternalsyntheticlambda0OnNavigationEvent;
        }
    });

    public interface onNavigationEvent {
        ebExternalSyntheticLambda0 ComponentActivityExternalSyntheticLambda10();
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i3)) | i9 | (~(i8 | i3));
        int i11 = ~i3;
        int i12 = (~(i11 | i8 | i2)) | (~(i7 | i11 | i5));
        int i13 = i2 + i5 + i4 + ((-195996979) * i) + ((-904719387) * i6);
        int i14 = i13 * i13;
        int i15 = (i2 * 1886715248) + 940376064 + (1886715248 * i5) + (i10 * (-42925423)) + (i9 * (-42925423)) + ((-42925423) * i12) + (1843789824 * i4) + ((-1389494272) * i) + (1623064576 * i6) + (1510801408 * i14);
        int i16 = (i2 * 1590984816) + 1398186415 + (i5 * 1590984816) + (i10 * 737) + (i9 * 737) + (i12 * 737) + (i4 * 1590985553) + (i * (-1025631779)) + (i6 * 1121679989) + (i14 * 622657536);
        return i15 + ((i16 * i16) * (-1928134656)) != 1 ? IAuthTabCallback(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ ebExternalSyntheticLambda0 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        ebExternalSyntheticLambda0 ebexternalsyntheticlambda0 = (ebExternalSyntheticLambda0) IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1931874181, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[0], -1931874181, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
        int i4 = onWarmupCompleted + 75;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
        return ebexternalsyntheticlambda0;
    }

    public ebExternalSyntheticLambda0(@NotNull zzad zzadVar, @NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1) {
        Intrinsics.checkNotNullParameter(zzadVar, "");
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        this.onExtraCallback = zzadVar;
        this.onNavigationEvent = textRoundCornerProgressBarSavedState1;
        AppSetIdAndScope1 appSetIdAndScope1OnExtraCallbackWithResult = ea10.onExtraCallbackWithResult("TossReact");
        Intrinsics.checkNotNullExpressionValue(appSetIdAndScope1OnExtraCallbackWithResult, "");
        this.IAuthTabCallback = appSetIdAndScope1OnExtraCallbackWithResult;
    }

    public static final /* synthetic */ Lazy onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 89;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Lazy<ebExternalSyntheticLambda0> lazy = onExtraCallbackWithResult;
        int i5 = i3 + 83;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return lazy;
        }
        throw null;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (!this.onExtraCallback.onActivityLayout() && !this.onExtraCallback.RemoteActionCompatParcelizer() && !this.onExtraCallback.MediaBrowserCompatMediaItem()) {
            return false;
        }
        int i4 = onWarmupCompleted + 71;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ebExternalSyntheticLambda0 ebexternalsyntheticlambda0 = (ebExternalSyntheticLambda0) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1 = ebexternalsyntheticlambda0.IAuthTabCallback;
        int i5 = i3 + 59;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return appSetIdAndScope1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 38 / 0;
            if (onExtraCallback()) {
                int i4 = IAuthTabCallbackStub + 115;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0 ? this.onNavigationEvent.onExtraCallback("RN_DEV_SUPPORT_ENABLED", false) : this.onNavigationEvent.onExtraCallback("RN_DEV_SUPPORT_ENABLED", false)) {
                    int i5 = onWarmupCompleted + 31;
                    IAuthTabCallbackStub = i5 % 128;
                    int i6 = i5 % 2;
                    return true;
                }
            }
        } else if (onExtraCallback()) {
        }
        return false;
    }

    public final boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        if (!(!onExtraCallback())) {
            int i2 = onWarmupCompleted + 91;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            if (this.onNavigationEvent.onExtraCallback("RN_BUNDLE_FORCE_LOAD_ASSETS", false)) {
                int i4 = IAuthTabCallbackStub;
                int i5 = i4 + 105;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 95;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 78 / 0;
            if (onExtraCallback()) {
                if (!(!this.onNavigationEvent.onExtraCallback("RN_SHOW_ERROR_ALERT", false))) {
                    int i4 = onWarmupCompleted + 43;
                    IAuthTabCallbackStub = i4 % 128;
                    int i5 = i4 % 2;
                    return true;
                }
            }
        } else if (onExtraCallback()) {
        }
        return false;
    }

    public final boolean asInterface() {
        int i = 2 % 2;
        if (!(!onExtraCallback())) {
            int i2 = onWarmupCompleted + 21;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            if (this.onNavigationEvent.onExtraCallback("RN_BUNDLE_FORCE_LOAD_REMOTE", false)) {
                int i4 = onWarmupCompleted + 3;
                int i5 = i4 % 128;
                IAuthTabCallbackStub = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 19;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                return true;
            }
        }
        return false;
    }

    public final boolean asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 1;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback();
            throw null;
        }
        boolean zOnExtraCallback = onExtraCallback();
        int i3 = IAuthTabCallbackStub + 113;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return zOnExtraCallback;
    }

    public static final class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final ebExternalSyntheticLambda0 onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 45;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object value = ebExternalSyntheticLambda0.onWarmupCompleted().getValue();
            if (i3 != 0) {
                return (ebExternalSyntheticLambda0) value;
            }
            int i4 = 21 / 0;
            return (ebExternalSyntheticLambda0) value;
        }
    }

    static {
        int i = onTransact + 33;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Response response = Response.onNavigationEvent;
            ebExternalSyntheticLambda0 ebexternalsyntheticlambda0ComponentActivityExternalSyntheticLambda10 = ((onNavigationEvent) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), onNavigationEvent.class)).ComponentActivityExternalSyntheticLambda10();
            int i3 = onWarmupCompleted + 1;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return ebexternalsyntheticlambda0ComponentActivityExternalSyntheticLambda10;
        }
        Response response2 = Response.onNavigationEvent;
        ((onNavigationEvent) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), onNavigationEvent.class)).ComponentActivityExternalSyntheticLambda10();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final ebExternalSyntheticLambda0 onTransact() {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (ebExternalSyntheticLambda0) IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1931874181, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[0], -1931874181, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }

    public final AppSetIdAndScope1 IAuthTabCallback() {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (AppSetIdAndScope1) IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -489761568, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{this}, 489761569, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }
}
