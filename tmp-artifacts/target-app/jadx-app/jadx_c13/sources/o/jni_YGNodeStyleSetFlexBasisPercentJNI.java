package o;

import j$.time.DateTimeException;
import j$.time.LocalTime;
import j$.time.format.DateTimeParseException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq(onNavigationEvent = ci.class)
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGNodeStyleSetFlexBasisPercentJNI implements Comparable<jni_YGNodeStyleSetFlexBasisPercentJNI>, Serializable {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static final jni_YGNodeStyleSetFlexBasisPercentJNI MAX;
    private static final jni_YGNodeStyleSetFlexBasisPercentJNI MIN;
    private static final long serialVersionUID = 0;
    private final LocalTime value;

    public jni_YGNodeStyleSetFlexBasisPercentJNI(@NotNull LocalTime localTime) {
        Intrinsics.checkNotNullParameter(localTime, "");
        this.value = localTime;
    }

    public final LocalTime onNavigationEvent() {
        return this.value;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jni_YGNodeStyleSetFlexBasisPercentJNI(int i, int i2, int i3, int i4) {
        try {
            LocalTime localTimeOf = LocalTime.of(i, i2, i3, i4);
            Intrinsics.checkNotNull(localTimeOf);
            this(localTimeOf);
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final int onWarmupCompleted() {
        return this.value.getHour();
    }

    public final int IAuthTabCallback() {
        return this.value.getMinute();
    }

    public final int onExtraCallback() {
        return this.value.getSecond();
    }

    public final int onExtraCallbackWithResult() {
        return this.value.getNano();
    }

    public final int IAuthTabCallbackStub() {
        return this.value.toSecondOfDay();
    }

    public final long asBinder() {
        return this.value.toNanoOfDay();
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof jni_YGNodeStyleSetFlexBasisPercentJNI) && Intrinsics.areEqual(this.value, ((jni_YGNodeStyleSetFlexBasisPercentJNI) obj).value);
        }
        return true;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        String string = this.value.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // java.lang.Comparable
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull jni_YGNodeStyleSetFlexBasisPercentJNI jni_ygnodestylesetflexbasispercentjni) {
        Intrinsics.checkNotNullParameter(jni_ygnodestylesetflexbasispercentjni, "");
        return this.value.compareTo(jni_ygnodestylesetflexbasispercentjni.value);
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final KSerializer<jni_YGNodeStyleSetFlexBasisPercentJNI> serializer() {
            return ci.onExtraCallbackWithResult;
        }

        public final jni_YGNodeStyleSetFlexBasisPercentJNI onExtraCallbackWithResult(@NotNull CharSequence charSequence, @NotNull jni_YGNodeSwapChildJNI<jni_YGNodeStyleSetFlexBasisPercentJNI> jni_ygnodeswapchildjni) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(jni_ygnodeswapchildjni, "");
            if (jni_ygnodeswapchildjni == onWarmupCompleted.onNavigationEvent.onNavigationEvent()) {
                try {
                    return new jni_YGNodeStyleSetFlexBasisPercentJNI(LocalTime.parse(charSequence));
                } catch (DateTimeParseException e) {
                    throw new jni_YGNodeStyleGetMaxHeightJNI(e);
                }
            }
            return jni_ygnodeswapchildjni.onExtraCallback(charSequence);
        }

        public final jni_YGNodeStyleSetFlexBasisPercentJNI onExtraCallbackWithResult(long j) {
            try {
                return new jni_YGNodeStyleSetFlexBasisPercentJNI(LocalTime.ofNanoOfDay(j));
            } catch (DateTimeException e) {
                throw new IllegalArgumentException(e);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ jni_YGNodeStyleSetFlexBasisPercentJNI onNavigationEvent(onNavigationEvent onnavigationevent, CharSequence charSequence, jni_YGNodeSwapChildJNI jni_ygnodeswapchildjni, int i, Object obj) {
            if ((i & 2) != 0) {
                jni_ygnodeswapchildjni = jni_YGNodeStyleSetFlexDirectionJNI.onNavigationEvent();
            }
            return onnavigationevent.onExtraCallbackWithResult(charSequence, jni_ygnodeswapchildjni);
        }
    }

    static {
        LocalTime localTime = LocalTime.MIN;
        Intrinsics.checkNotNullExpressionValue(localTime, "");
        MIN = new jni_YGNodeStyleSetFlexBasisPercentJNI(localTime);
        LocalTime localTime2 = LocalTime.MAX;
        Intrinsics.checkNotNullExpressionValue(localTime2, "");
        MAX = new jni_YGNodeStyleSetFlexBasisPercentJNI(localTime2);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("kotlinx.datetime.LocalTime must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new jni_YGNodeStyleSetFlexWrapJNI(3, this);
    }
}
