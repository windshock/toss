package im.toss.features.leave.common.nav;

import im.toss.features.leave.common.nav.LeaveNav$Intro$;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.htf1;
import o.liq;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LeaveNav$Intro extends LeaveNav {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    public static final LeaveNav$Intro INSTANCE = new LeaveNav$Intro();
    private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new LeaveNav$Intro$.ExternalSyntheticLambda0());

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallback = onExtraCallback();
        int i4 = onExtraCallback + 77;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if ((!(r6 instanceof im.toss.features.leave.common.nav.LeaveNav$Intro)) == true) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        r1 = r1 + 51;
        im.toss.features.leave.common.nav.LeaveNav$Intro.onWarmupCompleted = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 53;
        im.toss.features.leave.common.nav.LeaveNav$Intro.onWarmupCompleted = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 33;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 10 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 43;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
        return 1755054841;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 83;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return "Intro";
    }

    static {
        int i = IAuthTabCallback + 79;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private LeaveNav$Intro() {
        super((DefaultConstructorMarker) null);
    }

    private final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializer = (KSerializer) $cachedSerializer$delegate.getValue();
        int i4 = onWarmupCompleted + 27;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializer;
    }

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        htf1 htf1Var = new htf1("im.toss.features.leave.common.nav.LeaveNav.Intro", INSTANCE, new Annotation[0]);
        int i2 = onWarmupCompleted + 63;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 87 / 0;
        }
        return htf1Var;
    }

    public final KSerializer<LeaveNav$Intro> serializer() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IAuthTabCallback();
            obj.hashCode();
            throw null;
        }
        KSerializer<LeaveNav$Intro> kSerializerIAuthTabCallback = IAuthTabCallback();
        int i3 = onWarmupCompleted + 3;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }
}
