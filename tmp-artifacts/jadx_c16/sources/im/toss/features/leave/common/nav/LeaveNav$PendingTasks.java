package im.toss.features.leave.common.nav;

import im.toss.features.leave.common.nav.LeaveNav$PendingTasks$;
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
public final class LeaveNav$PendingTasks extends LeaveNav {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final LeaveNav$PendingTasks INSTANCE = new LeaveNav$PendingTasks();
    private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new LeaveNav$PendingTasks$.ExternalSyntheticLambda0());

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onExtraCallback + 33;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if ((!(r7 instanceof im.toss.features.leave.common.nav.LeaveNav$PendingTasks)) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        r3 = r3 + 43;
        im.toss.features.leave.common.nav.LeaveNav$PendingTasks.onExtraCallback = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if ((r3 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 93;
        im.toss.features.leave.common.nav.LeaveNav$PendingTasks.IAuthTabCallback = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r1 % 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 75;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        if (i3 % 2 != 0) {
            int i5 = 76 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 115;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 78 / 0;
        }
        int i5 = i2 + 3;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return -522976502;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 37;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 43;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return "PendingTasks";
    }

    static {
        int i = onNavigationEvent + 39;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 53 / 0;
        }
    }

    private LeaveNav$PendingTasks() {
        super((DefaultConstructorMarker) null);
    }

    private final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializer = (KSerializer) $cachedSerializer$delegate.getValue();
        int i4 = onExtraCallback + 101;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        htf1 htf1Var = new htf1("im.toss.features.leave.common.nav.LeaveNav.PendingTasks", INSTANCE, new Annotation[0]);
        int i2 = IAuthTabCallback + 113;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 51 / 0;
        }
        return htf1Var;
    }

    public final KSerializer<LeaveNav$PendingTasks> serializer() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallback();
            obj.hashCode();
            throw null;
        }
        KSerializer<LeaveNav$PendingTasks> kSerializerOnExtraCallback = onExtraCallback();
        int i3 = onExtraCallback + 83;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }
}
