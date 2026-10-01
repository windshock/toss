package im.toss.features.home.feature.cashflow;

import im.toss.features.home.feature.cashflow.CashflowSelectTransactionsViewModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.setNavigationBarVisibility;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CashflowSelectTransactionsViewModel$onWarmupCompleted$onWarmupCompleted implements CashflowSelectTransactionsViewModel.onWarmupCompleted {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final List<String> IAuthTabCallback;
    private final setNavigationBarVisibility onNavigationEvent;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r7 instanceof im.toss.features.home.feature.cashflow.CashflowSelectTransactionsViewModel$onWarmupCompleted$onWarmupCompleted) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r7 = (im.toss.features.home.feature.cashflow.CashflowSelectTransactionsViewModel$onWarmupCompleted$onWarmupCompleted) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if (r6.onNavigationEvent == r7.onNavigationEvent) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        r1 = r1 + 63;
        r7 = r1 % 128;
        im.toss.features.home.feature.cashflow.CashflowSelectTransactionsViewModel$onWarmupCompleted$onWarmupCompleted.onExtraCallbackWithResult = r7;
        r1 = r1 % 2;
        r7 = r7 + 75;
        im.toss.features.home.feature.cashflow.CashflowSelectTransactionsViewModel$onWarmupCompleted$onWarmupCompleted.onWarmupCompleted = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if ((r7 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        r7 = null;
        r7.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.IAuthTabCallback, r7.IAuthTabCallback) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        r7 = im.toss.features.home.feature.cashflow.CashflowSelectTransactionsViewModel$onWarmupCompleted$onWarmupCompleted.onExtraCallbackWithResult + 55;
        r1 = r7 % 128;
        im.toss.features.home.feature.cashflow.CashflowSelectTransactionsViewModel$onWarmupCompleted$onWarmupCompleted.onWarmupCompleted = r1;
        r7 = r7 % 2;
        r1 = r1 + 31;
        im.toss.features.home.feature.cashflow.CashflowSelectTransactionsViewModel$onWarmupCompleted$onWarmupCompleted.onExtraCallbackWithResult = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if ((r1 % 2) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        r7 = 32 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 11;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 41 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i2 % 128;
        return (i2 % 2 == 0 ? this.onNavigationEvent.hashCode() >> 2 : this.onNavigationEvent.hashCode() * 31) + this.IAuthTabCallback.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Saved(mode=" + this.onNavigationEvent + ", selectedIds=" + this.IAuthTabCallback + ")";
        int i2 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public CashflowSelectTransactionsViewModel$onWarmupCompleted$onWarmupCompleted(@NotNull setNavigationBarVisibility setnavigationbarvisibility, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(setnavigationbarvisibility, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.onNavigationEvent = setnavigationbarvisibility;
        this.IAuthTabCallback = list;
    }

    public final setNavigationBarVisibility IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 117;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        setNavigationBarVisibility setnavigationbarvisibility = this.onNavigationEvent;
        int i5 = i2 + 17;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return setnavigationbarvisibility;
    }
}
