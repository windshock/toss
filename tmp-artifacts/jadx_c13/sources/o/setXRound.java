package o;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class setXRound<Key, Value, Collection, Builder extends Map<Key, Value>> extends wk<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {
    private final KSerializer<Value> onExtraCallback;
    private final KSerializer<Key> onNavigationEvent;

    public /* synthetic */ setXRound(KSerializer kSerializer, KSerializer kSerializer2, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer, kSerializer2);
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public abstract SerialDescriptor getDescriptor();

    public final KSerializer<Key> onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    public final KSerializer<Value> onExtraCallback() {
        return this.onExtraCallback;
    }

    private setXRound(KSerializer<Key> kSerializer, KSerializer<Value> kSerializer2) {
        super(null);
        this.onNavigationEvent = kSerializer;
        this.onExtraCallback = kSerializer2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public final void onWarmupCompleted(@NotNull yw ywVar, @NotNull Builder builder, int i, int i2) {
        Intrinsics.checkNotNullParameter(ywVar, "");
        Intrinsics.checkNotNullParameter(builder, "");
        if (i2 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.until(0, i2 << 1), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return;
        }
        while (true) {
            onNavigationEvent(ywVar, i + first, (int) builder, false);
            if (first == last) {
                return;
            } else {
                first += step;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public final void onNavigationEvent(@NotNull yw ywVar, int i, @NotNull Builder builder, boolean z) {
        int iOnNavigationEvent;
        Object objOnExtraCallback;
        Intrinsics.checkNotNullParameter(ywVar, "");
        Intrinsics.checkNotNullParameter(builder, "");
        Object objOnExtraCallback2 = yw.onExtraCallback(ywVar, getDescriptor(), i, this.onNavigationEvent, null, 8, null);
        if (z) {
            iOnNavigationEvent = ywVar.onNavigationEvent(getDescriptor());
            if (iOnNavigationEvent != i + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i + ", returned index for value: " + iOnNavigationEvent).toString());
            }
        } else {
            iOnNavigationEvent = i + 1;
        }
        int i2 = iOnNavigationEvent;
        if (builder.containsKey(objOnExtraCallback2) && !(this.onExtraCallback.getDescriptor().IAuthTabCallback() instanceof spv)) {
            objOnExtraCallback = ywVar.onNavigationEvent(getDescriptor(), i2, this.onExtraCallback, access8000.onExtraCallback(builder, objOnExtraCallback2));
        } else {
            objOnExtraCallback = yw.onExtraCallback(ywVar, getDescriptor(), i2, this.onExtraCallback, null, 8, null);
        }
        builder.put(objOnExtraCallback2, objOnExtraCallback);
    }

    @Override // o.py
    public void serialize(@NotNull Encoder encoder, Collection collection) {
        Intrinsics.checkNotNullParameter(encoder, "");
        int iOnExtraCallback = onExtraCallback(collection);
        SerialDescriptor descriptor = getDescriptor();
        vyl vylVarIAuthTabCallback = encoder.IAuthTabCallback(descriptor, iOnExtraCallback);
        Iterator<Map.Entry<? extends Key, ? extends Value>> itOnExtraCallbackWithResult = onExtraCallbackWithResult(collection);
        int i = 0;
        while (itOnExtraCallbackWithResult.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = itOnExtraCallbackWithResult.next();
            Key key = next.getKey();
            Value value = next.getValue();
            vylVarIAuthTabCallback.onNavigationEvent(getDescriptor(), i, onWarmupCompleted(), key);
            vylVarIAuthTabCallback.onNavigationEvent(getDescriptor(), i + 1, onExtraCallback(), value);
            i += 2;
        }
        vylVarIAuthTabCallback.onNavigationEvent(descriptor);
    }
}
