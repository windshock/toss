package im.toss.features.leave.common.nav;

import im.toss.features.leave.common.nav.RemainingMoneyNav$VisitorRemainingBalanceList$;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.htf1;
import o.liq;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RemainingMoneyNav$VisitorRemainingBalanceList implements RemainingMoneyNav {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final RemainingMoneyNav$VisitorRemainingBalanceList INSTANCE = new RemainingMoneyNav$VisitorRemainingBalanceList();
    private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new RemainingMoneyNav$VisitorRemainingBalanceList$.ExternalSyntheticLambda0());

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
        int i4 = onNavigationEvent + 119;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnWarmupCompleted;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof im.toss.features.leave.common.nav.RemainingMoneyNav$VisitorRemainingBalanceList) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 47;
        im.toss.features.leave.common.nav.RemainingMoneyNav$VisitorRemainingBalanceList.onWarmupCompleted = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            int i4 = 67 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 51;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return 48364302;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return "VisitorRemainingBalanceList";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private RemainingMoneyNav$VisitorRemainingBalanceList() {
    }

    private final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        KSerializer kSerializer = (KSerializer) $cachedSerializer$delegate.getValue();
        int i3 = onNavigationEvent + 109;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 14 / 0;
        }
        return kSerializer;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        htf1 htf1Var = new htf1("im.toss.features.leave.common.nav.RemainingMoneyNav.VisitorRemainingBalanceList", INSTANCE, new Annotation[0]);
        int i2 = onNavigationEvent + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return htf1Var;
    }

    public final KSerializer<RemainingMoneyNav$VisitorRemainingBalanceList> serializer() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<RemainingMoneyNav$VisitorRemainingBalanceList> kSerializerOnExtraCallback = onExtraCallback();
        int i4 = onWarmupCompleted + 21;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallback;
    }
}
