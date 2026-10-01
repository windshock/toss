package o;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class wk<Element, Collection, Builder> implements KSerializer<Collection> {
    public /* synthetic */ wk(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    protected abstract Builder IAuthTabCallback(Collection collection);

    protected abstract int onExtraCallback(Collection collection);

    protected abstract Builder onExtraCallbackWithResult();

    protected abstract Iterator<Element> onExtraCallbackWithResult(Collection collection);

    protected abstract Collection onNavigationEvent(Builder builder);

    protected abstract void onNavigationEvent(Builder builder, int i);

    protected abstract void onNavigationEvent(@NotNull yw ywVar, int i, Builder builder, boolean z);

    protected abstract int onWarmupCompleted(Builder builder);

    protected abstract void onWarmupCompleted(@NotNull yw ywVar, Builder builder, int i, int i2);

    private wk() {
    }

    public final Collection onNavigationEvent(@NotNull Decoder decoder, @Nullable Collection collection) {
        Builder builderOnExtraCallbackWithResult;
        Intrinsics.checkNotNullParameter(decoder, "");
        if (collection == null || (builderOnExtraCallbackWithResult = IAuthTabCallback(collection)) == null) {
            builderOnExtraCallbackWithResult = onExtraCallbackWithResult();
        }
        int iOnWarmupCompleted = onWarmupCompleted(builderOnExtraCallbackWithResult);
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(getDescriptor());
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            while (true) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(getDescriptor());
                if (iOnNavigationEvent == -1) {
                    break;
                }
                IAuthTabCallback(this, ywVarOnWarmupCompleted, iOnWarmupCompleted + iOnNavigationEvent, builderOnExtraCallbackWithResult, false, 8, null);
            }
        } else {
            onWarmupCompleted(ywVarOnWarmupCompleted, builderOnExtraCallbackWithResult, iOnWarmupCompleted, onExtraCallbackWithResult(ywVarOnWarmupCompleted, builderOnExtraCallbackWithResult));
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(getDescriptor());
        return onNavigationEvent(builderOnExtraCallbackWithResult);
    }

    public Collection deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return onNavigationEvent(decoder, (Decoder) null);
    }

    private final int onExtraCallbackWithResult(yw ywVar, Builder builder) {
        int iAsBinder = ywVar.asBinder(getDescriptor());
        onNavigationEvent((wk<Element, Collection, Builder>) builder, iAsBinder);
        return iAsBinder;
    }

    public static /* synthetic */ void IAuthTabCallback(wk wkVar, yw ywVar, int i, Object obj, boolean z, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i2 & 8) != 0) {
            z = true;
        }
        wkVar.onNavigationEvent(ywVar, i, obj, z);
    }
}
