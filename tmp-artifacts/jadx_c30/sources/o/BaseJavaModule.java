package o;

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class BaseJavaModule {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("amount")
    private final long amount;

    @SerializedName(ErrorBundle.SUMMARY_ENTRY)
    private final String summary;

    @SerializedName("txDate")
    private final String txDate;

    public BaseJavaModule() {
        this(0L, null, null, 7, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r10 instanceof o.BaseJavaModule) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r10 = (o.BaseJavaModule) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r9.amount == r10.amount) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        r1 = r1 + 87;
        o.BaseJavaModule.onWarmupCompleted = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if ((r1 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r9.summary, r10.summary) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r9.txDate, r10.txDate) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        r10 = o.BaseJavaModule.onWarmupCompleted + 47;
        o.BaseJavaModule.onNavigationEvent = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r9 == r10) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r9 == r10) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 61;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 25 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Long.hashCode(this.amount) * 31) + this.summary.hashCode()) * 31) + this.txDate.hashCode();
        int i4 = onNavigationEvent + 125;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AutoVerifyTransaction(amount=" + this.amount + ", summary=" + this.summary + ", txDate=" + this.txDate + ")";
        int i2 = onWarmupCompleted + 123;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BaseJavaModule(long j, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        this.amount = j;
        this.summary = str;
        this.txDate = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BaseJavaModule(long j, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 79;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            j = 0;
        }
        if ((i & 2) != 0) {
            int i4 = onWarmupCompleted + 69;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str = BuildConfig.FLAVOR;
        }
        if ((i & 4) != 0) {
            int i7 = 2 % 2;
            str2 = BuildConfig.FLAVOR;
        }
        this(j, str, str2);
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.amount;
        }
        int i3 = 40 / 0;
        return this.amount;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 81;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.summary;
        int i5 = i2 + 23;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 125;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.txDate;
        int i5 = i2 + 61;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Date onExtraCallback() {
        Object obj;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(CommonModule_closeView.onWarmupCompleted.onTransact().parse(this.txDate));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            int i4 = onNavigationEvent + 125;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            obj = null;
        }
        Date date = (Date) obj;
        return date == null ? zzaj.onWarmupCompleted().asBinder() : date;
    }
}
