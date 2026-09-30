package im.toss.di;

import com.google.zxing.oned.Code128Writer;
import com.google.zxing.qrcode.QRCodeWriter;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.GeckoHubImp;
import o.getOuterRootPath;
import o.toolbarMenusUpdated;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TossPayBarcodeModule {
    private static int IAuthTabCallback = 1;
    public static final TossPayBarcodeModule onExtraCallback = new TossPayBarcodeModule();
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        int i = IAuthTabCallback + 63;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 43 / 0;
        }
    }

    private TossPayBarcodeModule() {
    }

    @Singleton
    public final toolbarMenusUpdated onExtraCallback(@NotNull GeckoHubImp geckoHubImp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(geckoHubImp, "");
        toolbarMenusUpdated toolbarmenusupdated = new toolbarMenusUpdated(geckoHubImp, new QRCodeWriter(), new Code128Writer());
        int i2 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 26 / 0;
        }
        return toolbarmenusupdated;
    }

    @Singleton
    public final getOuterRootPath IAuthTabCallback(@NotNull toolbarMenusUpdated toolbarmenusupdated, @NotNull GeckoHubImp geckoHubImp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(toolbarmenusupdated, "");
        Intrinsics.checkNotNullParameter(geckoHubImp, "");
        getOuterRootPath getouterrootpath = new getOuterRootPath(toolbarmenusupdated, geckoHubImp);
        int i2 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return getouterrootpath;
        }
        throw null;
    }
}
