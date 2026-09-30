package o;

import android.content.res.Resources;
import im.toss.securities.widget.data.model.overview.OverviewPrice;
import im.toss.securities.widget.data.model.overview.OverviewRate;
import im.toss.tosssecurities.core.currency.domain.Currency;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r6a {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        if (r0 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r0 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r1 = o.r6a.onNavigationEvent + 21;
        o.r6a.IAuthTabCallback = r1 % 128;
        r1 = r1 % 2;
        r11 = r0.doubleValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (r18 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        r4 = r14.getString(im.toss.securities.widget.overview.R.string.asset_profit_prefix_today) + " ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        r13 = r4;
        r0 = o.isHealthy.IAuthTabCallback(r0, r17, r14, r19, false, (java.text.DecimalFormat) null, (java.text.DecimalFormat) null, 56, (java.lang.Object) null);
        r1 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
    
        if (r11 <= 0.0d) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        r1.append(r13);
        r1.append("+" + r0 + " \u200b(" + r10 + ")");
        r0 = o.r6a.IAuthTabCallback + 37;
        o.r6a.onNavigationEvent = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b8, code lost:
    
        if (r11 != 0.0d) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ba, code lost:
    
        r1.append(r13);
        r1.append(r0 + " \u200b(0.0%)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d2, code lost:
    
        r1.append(r13);
        r1.append(r0 + " \u200b(" + r10 + ")");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f1, code lost:
    
        return r1.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String onWarmupCompleted(@NotNull Resources resources, @Nullable OverviewPrice overviewPrice, @Nullable OverviewRate overviewRate, @NotNull Currency currency, boolean z, boolean z2) throws NoWhenBranchMatchedException, Resources.NotFoundException {
        Double dIAuthTabCallback;
        int i = 2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(resources, "");
        Intrinsics.checkNotNullParameter(currency, "");
        if (overviewRate != null) {
            int i2 = onNavigationEvent + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            String strOnWarmupCompleted = overviewRate.onWarmupCompleted(currency, true);
            if (strOnWarmupCompleted != null) {
                int i4 = IAuthTabCallback + 51;
                int i5 = i4 % 128;
                onNavigationEvent = i5;
                int i6 = i4 % 2;
                if (overviewPrice != null) {
                    int i7 = i5 + 39;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        dIAuthTabCallback = overviewPrice.IAuthTabCallback(currency);
                        int i8 = 6 / 0;
                    } else {
                        dIAuthTabCallback = overviewPrice.IAuthTabCallback(currency);
                    }
                }
            }
        }
        return "";
    }
}
