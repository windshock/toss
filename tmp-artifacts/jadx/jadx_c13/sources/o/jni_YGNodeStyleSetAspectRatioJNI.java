package o;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.Month;
import j$.time.chrono.ChronoLocalDate;
import j$.time.format.DateTimeParseException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq(onNavigationEvent = setTimeUpdate.class)
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGNodeStyleSetAspectRatioJNI implements Comparable<jni_YGNodeStyleSetAspectRatioJNI>, Serializable {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static final jni_YGNodeStyleSetAspectRatioJNI MAX;
    private static final jni_YGNodeStyleSetAspectRatioJNI MIN;
    private static final long serialVersionUID = 0;
    private final LocalDate value;

    public jni_YGNodeStyleSetAspectRatioJNI(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "");
        this.value = localDate;
    }

    public final LocalDate onExtraCallbackWithResult() {
        return this.value;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final KSerializer<jni_YGNodeStyleSetAspectRatioJNI> serializer() {
            return setTimeUpdate.onExtraCallback;
        }

        public final jni_YGNodeStyleSetAspectRatioJNI onNavigationEvent(@NotNull CharSequence charSequence, @NotNull jni_YGNodeSwapChildJNI<jni_YGNodeStyleSetAspectRatioJNI> jni_ygnodeswapchildjni) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(jni_ygnodeswapchildjni, "");
            if (jni_ygnodeswapchildjni == onNavigationEvent.onNavigationEvent.onExtraCallbackWithResult()) {
                try {
                    return new jni_YGNodeStyleSetAspectRatioJNI(LocalDate.parse(jw10.IAuthTabCallback(charSequence.toString())));
                } catch (DateTimeParseException e) {
                    throw new jni_YGNodeStyleGetMaxHeightJNI(e);
                }
            }
            return jni_ygnodeswapchildjni.onExtraCallback(charSequence);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ jni_YGNodeStyleSetAspectRatioJNI onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted, CharSequence charSequence, jni_YGNodeSwapChildJNI jni_ygnodeswapchildjni, int i, Object obj) {
            if ((i & 2) != 0) {
                jni_ygnodeswapchildjni = jni_YGNodeStyleSetDirectionJNI.onExtraCallback();
            }
            return onwarmupcompleted.onNavigationEvent(charSequence, jni_ygnodeswapchildjni);
        }
    }

    static {
        LocalDate localDate = LocalDate.MIN;
        Intrinsics.checkNotNullExpressionValue(localDate, "");
        MIN = new jni_YGNodeStyleSetAspectRatioJNI(localDate);
        LocalDate localDate2 = LocalDate.MAX;
        Intrinsics.checkNotNullExpressionValue(localDate2, "");
        MAX = new jni_YGNodeStyleSetAspectRatioJNI(localDate2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jni_YGNodeStyleSetAspectRatioJNI(int i, int i2, int i3) {
        try {
            LocalDate localDateOf = LocalDate.of(i, i2, i3);
            Intrinsics.checkNotNull(localDateOf);
            this(localDateOf);
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final int asInterface() {
        return this.value.getYear();
    }

    public final jni_YGNodeStyleSetFlexJNI onWarmupCompleted() {
        Month month = this.value.getMonth();
        Intrinsics.checkNotNullExpressionValue(month, "");
        return jni_YGNodeStyleGetMinWidthJNI.IAuthTabCallback(month);
    }

    public final int IAuthTabCallback() {
        return this.value.getDayOfMonth();
    }

    public final jni_YGNodeStyleGetOverflowJNI onNavigationEvent() {
        DayOfWeek dayOfWeek = this.value.getDayOfWeek();
        Intrinsics.checkNotNullExpressionValue(dayOfWeek, "");
        return jni_YGNodeStyleGetMinWidthJNI.IAuthTabCallback(dayOfWeek);
    }

    public final int onExtraCallback() {
        return this.value.getDayOfYear();
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof jni_YGNodeStyleSetAspectRatioJNI) && Intrinsics.areEqual(this.value, ((jni_YGNodeStyleSetAspectRatioJNI) obj).value);
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
    public int compareTo(@NotNull jni_YGNodeStyleSetAspectRatioJNI jni_ygnodestylesetaspectratiojni) {
        Intrinsics.checkNotNullParameter(jni_ygnodestylesetaspectratiojni, "");
        return this.value.compareTo((ChronoLocalDate) jni_ygnodestylesetaspectratiojni.value);
    }

    public final long asBinder() {
        return this.value.toEpochDay();
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("kotlinx.datetime.LocalDate must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new jni_YGNodeStyleSetFlexWrapJNI(2, this);
    }
}
