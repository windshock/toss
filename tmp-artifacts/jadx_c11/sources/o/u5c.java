package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class u5c implements reverseSize {
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback;
    private final Function1<RequestOptionConfig1, RequestOptionConfig1> IAuthTabCallback;
    private final Function1<setUseCaseAttached, setUseCaseAttached> onExtraCallbackWithResult;
    private final Function0<Boolean> onNavigationEvent;
    private final Function2<setUseCaseAttached, setUseCaseAttached, setUseCaseAttached> onWarmupCompleted;

    public u5c(@NotNull Function0<Boolean> function0, @NotNull Function1<? super setUseCaseAttached, setUseCaseAttached> function1, @NotNull Function2<? super setUseCaseAttached, ? super setUseCaseAttached, setUseCaseAttached> function2, @NotNull Function1<? super RequestOptionConfig1, RequestOptionConfig1> function12) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.onNavigationEvent = function0;
        this.onExtraCallbackWithResult = function1;
        this.onWarmupCompleted = function2;
        this.IAuthTabCallback = function12;
    }

    /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
    public long m103onPreScrollOzD1aCk(long j, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 31;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (!(!((Boolean) this.onNavigationEvent.invoke()).booleanValue())) {
            int i5 = onExtraCallback + 29;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                return j;
            }
            throw null;
        }
        if (!sizeToRectF.onExtraCallback(i, sizeToRectF.Companion.onExtraCallback())) {
            return setUseCaseAttached.Companion.IAuthTabCallback();
        }
        int i6 = onExtraCallback + 57;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        long jOnExtraCallback = ((setUseCaseAttached) this.onExtraCallbackWithResult.invoke(setUseCaseAttached.onNavigationEvent(j))).onExtraCallback();
        int i8 = onExtraCallback + 51;
        IAuthTabCallbackDefault = i8 % 128;
        int i9 = i8 % 2;
        return jOnExtraCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if ((r8 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        return ((o.setUseCaseAttached) r3.onWarmupCompleted.invoke(o.setUseCaseAttached.onNavigationEvent(r4), o.setUseCaseAttached.onNavigationEvent(r6))).onExtraCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        ((o.setUseCaseAttached) r3.onWarmupCompleted.invoke(o.setUseCaseAttached.onNavigationEvent(r4), o.setUseCaseAttached.onNavigationEvent(r6))).onExtraCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        return o.setUseCaseAttached.Companion.IAuthTabCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (o.sizeToRectF.onExtraCallback(r8, o.sizeToRectF.Companion.onExtraCallback()) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (o.sizeToRectF.onExtraCallback(r8, o.sizeToRectF.Companion.onExtraCallback()) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r8 = o.u5c.IAuthTabCallbackDefault + 21;
        o.u5c.onExtraCallback = r8 % 128;
     */
    /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long m101onPostScrollDzOQY0M(long j, long j2, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 95;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 69 / 0;
        }
    }

    /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
    public Object m102onPreFlingQWom1Mo(long j, @NotNull access13800<? super RequestOptionConfig1> access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object objInvoke = this.IAuthTabCallback.invoke(RequestOptionConfig1.onExtraCallbackWithResult(j));
        int i4 = onExtraCallback + 39;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return objInvoke;
    }
}
