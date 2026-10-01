package o;

import java.lang.Enum;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.TextFieldSelectionManagerKtExternalSyntheticLambda6;
import o.spv;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class findPartiallyOrCompletelyInvisibleChildClosestToEnd<T extends Enum<T>> implements KSerializer<T> {
    private final Lazy IAuthTabCallback;
    private final T[] asBinder;
    private final Map<String, T> onExtraCallback;
    private final Lazy onExtraCallbackWithResult;
    private final SerialDescriptor onNavigationEvent;
    private final Class<T> onWarmupCompleted;

    public findPartiallyOrCompletelyInvisibleChildClosestToEnd(@NotNull Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        this.onWarmupCompleted = cls;
        String simpleName = cls.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        this.onNavigationEvent = ujb.onExtraCallbackWithResult(simpleName, spv.IAuthTabCallbackStub.onExtraCallback);
        T[] enumConstants = cls.getEnumConstants();
        Intrinsics.checkNotNull(enumConstants);
        T[] tArr = enumConstants;
        this.asBinder = tArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(tArr.length), 16));
        for (T t : tArr) {
            linkedHashMap.put(t.name(), t);
        }
        this.onExtraCallback = linkedHashMap;
        this.onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new IAuthTabCallback(this));
        this.IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new onExtraCallbackWithResult(this));
    }

    public SerialDescriptor getDescriptor() {
        return this.onNavigationEvent;
    }

    static final class IAuthTabCallback extends Lambda implements Function0<LinkedHashMap<T, String>> {
        final /* synthetic */ findPartiallyOrCompletelyInvisibleChildClosestToEnd<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(findPartiallyOrCompletelyInvisibleChildClosestToEnd<T> findpartiallyorcompletelyinvisiblechildclosesttoend) {
            super(0);
            this.this$0 = findpartiallyorcompletelyinvisiblechildclosesttoend;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final LinkedHashMap<T, String> invoke() {
            TextFieldSelectionManagerKtExternalSyntheticLambda6.AnonymousClass5 anonymousClass5 = (LinkedHashMap<T, String>) new LinkedHashMap(((findPartiallyOrCompletelyInvisibleChildClosestToEnd) this.this$0).asBinder.length);
            for (Enum r4 : ((findPartiallyOrCompletelyInvisibleChildClosestToEnd) this.this$0).asBinder) {
                nc annotation = ((findPartiallyOrCompletelyInvisibleChildClosestToEnd) this.this$0).onWarmupCompleted.getDeclaredField(r4.name()).getAnnotation(nc.class);
                String strIAuthTabCallback = annotation != null ? annotation.IAuthTabCallback() : null;
                if (strIAuthTabCallback != null && strIAuthTabCallback.length() != 0) {
                    anonymousClass5.put(r4, strIAuthTabCallback);
                }
            }
            return anonymousClass5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<T, String> IAuthTabCallback() {
        return (Map) this.onExtraCallbackWithResult.getValue();
    }

    static final class onExtraCallbackWithResult extends Lambda implements Function0<LinkedHashMap<String, T>> {
        final /* synthetic */ findPartiallyOrCompletelyInvisibleChildClosestToEnd<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(findPartiallyOrCompletelyInvisibleChildClosestToEnd<T> findpartiallyorcompletelyinvisiblechildclosesttoend) {
            super(0);
            this.this$0 = findpartiallyorcompletelyinvisiblechildclosesttoend;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final LinkedHashMap<String, T> invoke() {
            TextFieldSelectionManagerKtExternalSyntheticLambda6.AnonymousClass5 anonymousClass5 = (LinkedHashMap<String, T>) new LinkedHashMap(this.this$0.IAuthTabCallback().size());
            for (Map.Entry entry : this.this$0.IAuthTabCallback().entrySet()) {
                anonymousClass5.put((String) entry.getValue(), (Enum) entry.getKey());
            }
            return anonymousClass5;
        }
    }

    private final Map<String, T> onNavigationEvent() {
        return (Map) this.IAuthTabCallback.getValue();
    }

    private final T onExtraCallback() {
        for (T t : this.asBinder) {
            if (this.onWarmupCompleted.getDeclaredField(t.name()).isAnnotationPresent(recycleByLayoutState.class)) {
                return t;
            }
        }
        return null;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public T deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        String strIAuthTabCallback_Parcel = decoder.IAuthTabCallback_Parcel();
        T t = onNavigationEvent().get(strIAuthTabCallback_Parcel);
        if (t != null) {
            return t;
        }
        T t2 = this.onExtraCallback.get(strIAuthTabCallback_Parcel);
        if (t2 != null) {
            return t2;
        }
        T t3 = (T) onExtraCallback();
        if (t3 != null) {
            return t3;
        }
        throw new IllegalStateException("No matching enum field for value: '" + strIAuthTabCallback_Parcel + "' in enum " + this.onWarmupCompleted.getSimpleName());
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull T t) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(t, "");
        String strName = IAuthTabCallback().get(t);
        if (strName == null) {
            strName = t.name();
        }
        encoder.onExtraCallbackWithResult(strName);
    }
}
