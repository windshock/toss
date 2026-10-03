package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setPackageVerifier implements getOther {
    public static final int $stable = 0;
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static int IAuthTabCallback = 1;
    private static final String SAVING_BOX_BANNER_CLOSED = "savingBoxBannerClosed";
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final long seedMoney;
    private final long useAmount;

    static {
        int i = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 55;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 57;
            int i7 = i6 % 128;
            onExtraCallback = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 45;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 31 / 0;
            }
            return true;
        }
        if (!(obj instanceof setPackageVerifier)) {
            return false;
        }
        setPackageVerifier setpackageverifier = (setPackageVerifier) obj;
        if (this.useAmount != setpackageverifier.useAmount) {
            int i11 = i2 + 59;
            IAuthTabCallback = i11 % 128;
            return i11 % 2 == 0;
        }
        if (this.seedMoney != setpackageverifier.seedMoney) {
            return false;
        }
        int i12 = i4 + 125;
        onExtraCallback = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 47 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Long.hashCode(this.useAmount) * 31) + Long.hashCode(this.seedMoney);
        int i4 = IAuthTabCallback + 67;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SavingBoxBannerItem(useAmount=" + this.useAmount + ", seedMoney=" + this.seedMoney + ")";
        int i2 = onExtraCallback + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.useAmount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.seedMoney;
        }
        throw null;
    }

    @Override // o.getOther
    public toASN1EncodableVector onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        toASN1EncodableVector toasn1encodablevector = toASN1EncodableVector.SAVING_BOX_BANNER;
        if (i3 == 0) {
            return toasn1encodablevector;
        }
        throw null;
    }

    public static final class onNavigationEvent {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final void IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            addPolicy.ITrustedWebActivityServiceStub().onNavigationEvent(setPackageVerifier.SAVING_BOX_BANNER_CLOSED, true);
            int i4 = onNavigationEvent + 3;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }
}
