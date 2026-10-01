package o;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setRecycler {
    private final setTimeOut onExtraCallback;
    private boolean onExtraCallbackWithResult;

    final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function2<SerialDescriptor, Integer, Boolean> {
        IAuthTabCallback(Object obj) {
            super(2, obj, setRecycler.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Boolean invoke(SerialDescriptor serialDescriptor, Integer num) {
            return onExtraCallbackWithResult(serialDescriptor, num.intValue());
        }

        public final Boolean onExtraCallbackWithResult(SerialDescriptor serialDescriptor, int i) {
            Intrinsics.checkNotNullParameter(serialDescriptor, "");
            return Boolean.valueOf(((setRecycler) this.receiver).onNavigationEvent(serialDescriptor, i));
        }
    }

    public setRecycler(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        this.onExtraCallback = new setTimeOut(serialDescriptor, new IAuthTabCallback(this));
    }

    public final boolean onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    public final void onNavigationEvent(int i) {
        this.onExtraCallback.onExtraCallback(i);
    }

    public final int onExtraCallbackWithResult() {
        return this.onExtraCallback.IAuthTabCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onNavigationEvent(SerialDescriptor serialDescriptor, int i) {
        boolean z = !serialDescriptor.onExtraCallback(i) && serialDescriptor.onNavigationEvent(i).asInterface();
        this.onExtraCallbackWithResult = z;
        return z;
    }
}
