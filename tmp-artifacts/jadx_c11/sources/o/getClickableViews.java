package o;

import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda18;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getClickableViews {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface;
    private final String onNavigationEvent;
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static final getClickableViews onWarmupCompleted = new getClickableViews("search");
    private static final getClickableViews onExtraCallback = new getClickableViews("shopping");
    private static final getClickableViews onExtraCallbackWithResult = new getClickableViews("testbench");

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getClickableViews)) {
            int i2 = IAuthTabCallbackStub + 3;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onNavigationEvent, ((getClickableViews) obj).onNavigationEvent)) {
            return true;
        }
        int i4 = IAuthTabCallbackStub + 67;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onNavigationEvent.hashCode();
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShoppingTabRnServiceBundleImportLazyRequest(serviceBundleName=" + this.onNavigationEvent + ")";
        int i2 = asInterface + 45;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getClickableViews(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onNavigationEvent = str;
        if (!n3.Companion.onExtraCallbackWithResult(str)) {
            throw new IllegalArgumentException("serviceBundleName must not be blank");
        }
        int i = asInterface + 55;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public static final /* synthetic */ getClickableViews IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.onNavigationEvent;
        int i4 = i3 + 99;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final hcExternalSyntheticLambda0 onWarmupCompleted(@NotNull n3 n3Var) throws Throwable {
        String strOnExtraCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(n3Var, "");
        if (Intrinsics.areEqual(this.onNavigationEvent, n3Var.getInterfaceDescriptor())) {
            int i2 = asInterface + 35;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            strOnExtraCallback = (String) n3.IAuthTabCallback(new Object[]{n3Var}, 1769799668, -1769799666, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult());
        } else {
            strOnExtraCallback = n3.Companion.onExtraCallback(this.onNavigationEvent);
        }
        hcExternalSyntheticLambda0 hcexternalsyntheticlambda0 = new hcExternalSyntheticLambda0(this.onNavigationEvent, strOnExtraCallback, null, null, 12, null);
        int i3 = IAuthTabCallbackStub + 73;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 59 / 0;
        }
        return hcexternalsyntheticlambda0;
    }

    public static final class IAuthTabCallback {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final getClickableViews onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 67;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            getClickableViews getclickableviewsIAuthTabCallback = getClickableViews.IAuthTabCallback();
            if (i3 == 0) {
                int i4 = 97 / 0;
            }
            return getclickableviewsIAuthTabCallback;
        }

        public final getClickableViews onNavigationEvent(@NotNull n3 n3Var) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(n3Var, "");
            getClickableViews getclickableviews = new getClickableViews(n3Var.getInterfaceDescriptor());
            int i2 = onExtraCallback + 21;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return getclickableviews;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = IAuthTabCallbackDefault + 73;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
