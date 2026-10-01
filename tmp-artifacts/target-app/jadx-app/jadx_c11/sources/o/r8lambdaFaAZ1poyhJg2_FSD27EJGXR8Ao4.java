package o;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaFaAZ1poyhJg2_FSD27EJGXR8Ao4 extends AbstractCoroutineContextElement {
    private static int asBinder = 1;
    private static int onExtraCallback = 1;
    public static final onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent(null);
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String IAuthTabCallback;

    static {
        int i = onExtraCallback + 119;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaFaAZ1poyhJg2_FSD27EJGXR8Ao4(@NotNull String str) {
        super(onExtraCallbackWithResult);
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallback = str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i3 + 77;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final class onNavigationEvent implements CoroutineContext.onExtraCallback<r8lambdaFaAZ1poyhJg2_FSD27EJGXR8Ao4> {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }
}
