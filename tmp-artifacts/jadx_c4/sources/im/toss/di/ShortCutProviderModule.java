package im.toss.di;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.UST_CERT_SetCACert;
import o.UST_CERT_SetCertVerifyEnvExternal;
import o.UST_CERT_SetTrustRootCACert;
import o.getDynamicProductToken;
import o.getPricingPhaseList;
import o.getUnfetchedProductList;
import o.includeSuspendedSubscriptions;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ShortCutProviderModule {
    public static final ShortCutProviderModule IAuthTabCallback = new ShortCutProviderModule();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static final /* synthetic */ class onNavigationEvent {
        private static int IAuthTabCallback = 1;
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onNavigationEvent;

        static {
            int[] iArr = new int[getPricingPhaseList.values().length];
            try {
                iArr[getPricingPhaseList.KR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getPricingPhaseList.AU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getPricingPhaseList.EU.ordinal()] = 3;
                int i = onNavigationEvent + 37;
                IAuthTabCallback = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 5;
                } else {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[getPricingPhaseList.JP.ordinal()] = 4;
                int i4 = IAuthTabCallback + 41;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused4) {
            }
            onExtraCallback = iArr;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 63;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ShortCutProviderModule() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    public final UST_CERT_SetTrustRootCACert onExtraCallback(@NotNull getPricingPhaseList getpricingphaselist, @NotNull getUnfetchedProductList getunfetchedproductlist, @NotNull getDynamicProductToken getdynamicproducttoken) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getpricingphaselist, "");
        Intrinsics.checkNotNullParameter(getunfetchedproductlist, "");
        Intrinsics.checkNotNullParameter(getdynamicproducttoken, "");
        if (Build.VERSION.SDK_INT < 25) {
            getunfetchedproductlist = new onExtraCallbackWithResult();
        } else {
            int i2 = onNavigationEvent.onExtraCallback[getpricingphaselist.ordinal()];
            if (i2 != 1) {
                int i3 = onWarmupCompleted + 95;
                int i4 = i3 % 128;
                onNavigationEvent = i4;
                if (i3 % 2 == 0 ? i2 != 2 : i2 != 4) {
                    if (i2 != 3 && i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                int i5 = i4 + 73;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                getunfetchedproductlist = getdynamicproducttoken;
            }
        }
        return new includeSuspendedSubscriptions(getunfetchedproductlist);
    }

    public static final class onExtraCallbackWithResult implements UST_CERT_SetCACert {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        onExtraCallbackWithResult() {
        }

        public /* bridge */ Intent onExtraCallback(String str, String str2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                super.onExtraCallback(str, str2);
                throw null;
            }
            Intent intentOnExtraCallback = super.onExtraCallback(str, str2);
            int i3 = onExtraCallbackWithResult + 99;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return intentOnExtraCallback;
        }

        public /* bridge */ List<ShortcutInfo> onNavigationEvent(Context context) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            List<ShortcutInfo> listOnNavigationEvent = super.onNavigationEvent(context);
            int i4 = IAuthTabCallback + 19;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return listOnNavigationEvent;
        }

        public List<UST_CERT_SetCertVerifyEnvExternal> onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return CollectionsKt.emptyList();
            }
            CollectionsKt.emptyList();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
