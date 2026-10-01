package o;

import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq(onNavigationEvent = dqs.class)
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGNodeStyleSetMarginAutoJNI implements Serializable {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static final jni_YGNodeStyleSetMarginAutoJNI ZERO;
    private static final long serialVersionUID = 0;
    private final ZoneOffset zoneOffset;

    public jni_YGNodeStyleSetMarginAutoJNI(@NotNull ZoneOffset zoneOffset) {
        Intrinsics.checkNotNullParameter(zoneOffset, "");
        this.zoneOffset = zoneOffset;
    }

    public final ZoneOffset onExtraCallbackWithResult() {
        return this.zoneOffset;
    }

    public final int onWarmupCompleted() {
        return this.zoneOffset.getTotalSeconds();
    }

    public int hashCode() {
        return this.zoneOffset.hashCode();
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof jni_YGNodeStyleSetMarginAutoJNI) && Intrinsics.areEqual(this.zoneOffset, ((jni_YGNodeStyleSetMarginAutoJNI) obj).zoneOffset);
    }

    public String toString() {
        String string = this.zoneOffset.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final KSerializer<jni_YGNodeStyleSetMarginAutoJNI> serializer() {
            return dqs.onNavigationEvent;
        }

        public final jni_YGNodeStyleSetMarginAutoJNI onExtraCallbackWithResult(@NotNull CharSequence charSequence, @NotNull jni_YGNodeSwapChildJNI<jni_YGNodeStyleSetMarginAutoJNI> jni_ygnodeswapchildjni) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(jni_ygnodeswapchildjni, "");
            onExtraCallbackWithResult onextracallbackwithresult = onExtraCallbackWithResult.IAuthTabCallback;
            if (jni_ygnodeswapchildjni == onextracallbackwithresult.onNavigationEvent()) {
                DateTimeFormatter dateTimeFormatterIAuthTabCallbackDefault = jni_YGNodeStyleSetMarginJNI.IAuthTabCallbackDefault();
                Intrinsics.checkNotNullExpressionValue(dateTimeFormatterIAuthTabCallbackDefault, "");
                return jni_YGNodeStyleSetMarginJNI.onExtraCallbackWithResult(charSequence, dateTimeFormatterIAuthTabCallbackDefault);
            }
            if (jni_ygnodeswapchildjni == onextracallbackwithresult.onWarmupCompleted()) {
                DateTimeFormatter dateTimeFormatterAsInterface = jni_YGNodeStyleSetMarginJNI.asInterface();
                Intrinsics.checkNotNullExpressionValue(dateTimeFormatterAsInterface, "");
                return jni_YGNodeStyleSetMarginJNI.onExtraCallbackWithResult(charSequence, dateTimeFormatterAsInterface);
            }
            if (jni_ygnodeswapchildjni == onextracallbackwithresult.onExtraCallback()) {
                DateTimeFormatter dateTimeFormatterAsBinder = jni_YGNodeStyleSetMarginJNI.asBinder();
                Intrinsics.checkNotNullExpressionValue(dateTimeFormatterAsBinder, "");
                return jni_YGNodeStyleSetMarginJNI.onExtraCallbackWithResult(charSequence, dateTimeFormatterAsBinder);
            }
            return jni_ygnodeswapchildjni.onExtraCallback(charSequence);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ jni_YGNodeStyleSetMarginAutoJNI onExtraCallbackWithResult(onNavigationEvent onnavigationevent, CharSequence charSequence, jni_YGNodeSwapChildJNI jni_ygnodeswapchildjni, int i, Object obj) {
            if ((i & 2) != 0) {
                jni_ygnodeswapchildjni = jni_YGNodeStyleSetMarginPercentJNI.onWarmupCompleted();
            }
            return onnavigationevent.onExtraCallbackWithResult(charSequence, jni_ygnodeswapchildjni);
        }
    }

    static {
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        Intrinsics.checkNotNullExpressionValue(zoneOffset, "");
        ZERO = new jni_YGNodeStyleSetMarginAutoJNI(zoneOffset);
    }

    public static final class onExtraCallbackWithResult {
        public static final onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();

        private onExtraCallbackWithResult() {
        }

        public final jni_YGNodeSwapChildJNI<jni_YGNodeStyleSetMarginAutoJNI> onNavigationEvent() {
            return fby2.IAuthTabCallbackStub();
        }

        public final jni_YGNodeSwapChildJNI<jni_YGNodeStyleSetMarginAutoJNI> onWarmupCompleted() {
            return fby2.IAuthTabCallbackDefault();
        }

        public final jni_YGNodeSwapChildJNI<jni_YGNodeStyleSetMarginAutoJNI> onExtraCallback() {
            return fby2.onExtraCallbackWithResult();
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("kotlinx.datetime.UtcOffset must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new jni_YGNodeStyleSetFlexWrapJNI(10, this);
    }
}
