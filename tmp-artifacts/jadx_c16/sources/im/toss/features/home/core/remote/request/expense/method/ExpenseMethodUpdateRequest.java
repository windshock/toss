package im.toss.features.home.core.remote.request.expense.method;

import im.toss.features.home.core.remote.request.expense.method.ExpenseMethodUpdateRequest$;
import im.toss.features.home.core.remote.request.expense.method.ExpenseMethodUpdateRequest$Item$;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.ul1;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ExpenseMethodUpdateRequest {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final Set<Item> changed;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new ExpenseMethodUpdateRequest$.ExternalSyntheticLambda0())};

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        ul1 ul1Var = new ul1(ExpenseMethodUpdateRequest$Item$.serializer.INSTANCE);
        int i2 = IAuthTabCallback + 3;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return ul1Var;
        }
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback();
        }
        IAuthTabCallback();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof im.toss.features.home.core.remote.request.expense.method.ExpenseMethodUpdateRequest) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.changed, ((im.toss.features.home.core.remote.request.expense.method.ExpenseMethodUpdateRequest) r6).changed) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r6 = r2 + 69;
        im.toss.features.home.core.remote.request.expense.method.ExpenseMethodUpdateRequest.IAuthTabCallback = r6 % 128;
        r6 = r6 % 2;
        r2 = r2 + 35;
        im.toss.features.home.core.remote.request.expense.method.ExpenseMethodUpdateRequest.IAuthTabCallback = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if ((r2 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        throw null;
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
        int i2 = IAuthTabCallback + 11;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            int i4 = 25 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Set<Item> set = this.changed;
        if (i3 != 0) {
            return set.hashCode();
        }
        set.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ExpenseMethodUpdateRequest(changed=" + this.changed + ")";
        int i2 = onExtraCallback + 17;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = onNavigationEvent + 27;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ ExpenseMethodUpdateRequest(int i, Set set, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 1;
        if (1 != (i & 1)) {
            int i3 = IAuthTabCallback + 33;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = ExpenseMethodUpdateRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 0;
            } else {
                descriptor = ExpenseMethodUpdateRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = onExtraCallback + 9;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.changed = set;
    }

    public ExpenseMethodUpdateRequest(@NotNull Set<Item> set) {
        Intrinsics.checkNotNullParameter(set, "");
        this.changed = set;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(ExpenseMethodUpdateRequest expenseMethodUpdateRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i;
        Lazy<KSerializer<Object>> lazy;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 5;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (i4 != 0) {
            i = 1;
            lazy = lazyArr[1];
        } else {
            i = 0;
            lazy = lazyArr[0];
        }
        vylVar.onNavigationEvent(serialDescriptor, i, (py) lazy.getValue(), expenseMethodUpdateRequest.changed);
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 17;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }
}
