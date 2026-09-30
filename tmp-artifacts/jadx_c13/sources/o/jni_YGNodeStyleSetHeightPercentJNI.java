package o;

import j$.time.DateTimeException;
import j$.time.Month;
import j$.time.YearMonth;
import j$.time.format.DateTimeParseException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq(onNavigationEvent = kh.class)
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGNodeStyleSetHeightPercentJNI implements Comparable<jni_YGNodeStyleSetHeightPercentJNI>, Serializable {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static final long serialVersionUID = 0;
    private final YearMonth value;

    public jni_YGNodeStyleSetHeightPercentJNI(@NotNull YearMonth yearMonth) {
        Intrinsics.checkNotNullParameter(yearMonth, "");
        this.value = yearMonth;
    }

    public final int onWarmupCompleted() {
        return this.value.getYear();
    }

    public final int onExtraCallbackWithResult() {
        return this.value.getMonthValue();
    }

    public final jni_YGNodeStyleSetFlexJNI IAuthTabCallback() {
        Month month = this.value.getMonth();
        Intrinsics.checkNotNullExpressionValue(month, "");
        return jni_YGNodeStyleGetMinWidthJNI.IAuthTabCallback(month);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jni_YGNodeStyleSetHeightPercentJNI(int i, int i2) {
        try {
            YearMonth yearMonthOf = YearMonth.of(i, i2);
            Intrinsics.checkNotNull(yearMonthOf);
            this(yearMonthOf);
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final KSerializer<jni_YGNodeStyleSetHeightPercentJNI> serializer() {
            return kh.onExtraCallback;
        }

        public final jni_YGNodeStyleSetHeightPercentJNI onNavigationEvent(@NotNull CharSequence charSequence, @NotNull jni_YGNodeSwapChildJNI<jni_YGNodeStyleSetHeightPercentJNI> jni_ygnodeswapchildjni) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(jni_ygnodeswapchildjni, "");
            if (jni_ygnodeswapchildjni == onNavigationEvent.onNavigationEvent.onNavigationEvent()) {
                try {
                    return new jni_YGNodeStyleSetHeightPercentJNI(YearMonth.parse(jw10.onExtraCallback(charSequence.toString())));
                } catch (DateTimeParseException e) {
                    throw new jni_YGNodeStyleGetMaxHeightJNI(e);
                }
            }
            return jni_ygnodeswapchildjni.onExtraCallback(charSequence);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ jni_YGNodeStyleSetHeightPercentJNI onNavigationEvent(onWarmupCompleted onwarmupcompleted, CharSequence charSequence, jni_YGNodeSwapChildJNI jni_ygnodeswapchildjni, int i, Object obj) {
            if ((i & 2) != 0) {
                jni_ygnodeswapchildjni = onNavigationEvent.onNavigationEvent.onNavigationEvent();
            }
            return onwarmupcompleted.onNavigationEvent(charSequence, jni_ygnodeswapchildjni);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull jni_YGNodeStyleSetHeightPercentJNI jni_ygnodestylesetheightpercentjni) {
        Intrinsics.checkNotNullParameter(jni_ygnodestylesetheightpercentjni, "");
        return this.value.compareTo(jni_ygnodestylesetheightpercentjni.value);
    }

    public String toString() {
        String str = jni_YGNodeStyleSetJustifyContentJNI.onExtraCallback().format(this.value);
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof jni_YGNodeStyleSetHeightPercentJNI) && Intrinsics.areEqual(this.value, ((jni_YGNodeStyleSetHeightPercentJNI) obj).value);
        }
        return true;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("kotlinx.datetime.YearMonth must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new jni_YGNodeStyleSetFlexWrapJNI(11, this);
    }
}
