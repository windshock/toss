package com.swmansion.rnscreens.transition;

import android.animation.FloatEvaluator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ExternalBoundaryValuesEvaluator extends FloatEvaluator {
    private Number endValueCache;
    private final Function1<Number, Float> endValueProvider;
    private Number startValueCache;
    private final Function1<Number, Float> startValueProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public ExternalBoundaryValuesEvaluator(@NotNull Function1<? super Number, Float> function1, @NotNull Function1<? super Number, Float> function12) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.startValueProvider = function1;
        this.endValueProvider = function12;
    }

    public final Function1<Number, Float> getStartValueProvider() {
        return this.startValueProvider;
    }

    public final Function1<Number, Float> getEndValueProvider() {
        return this.endValueProvider;
    }

    public final Number getStartValueCache() {
        return this.startValueCache;
    }

    public final void setStartValueCache(@Nullable Number number) {
        this.startValueCache = number;
    }

    public final Number getEndValueCache() {
        return this.endValueCache;
    }

    public final void setEndValueCache(@Nullable Number number) {
        this.endValueCache = number;
    }

    private final Number getStartValue(Number number) {
        if (this.startValueCache == null) {
            this.startValueCache = (Number) this.startValueProvider.invoke(number);
        }
        return this.startValueCache;
    }

    private final Number getEndValue(Number number) {
        if (this.endValueCache == null) {
            this.endValueCache = (Number) this.endValueProvider.invoke(number);
        }
        return this.endValueCache;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.animation.TypeEvaluator
    public Float evaluate(float f, @Nullable Number number, @Nullable Number number2) {
        Number startValue = getStartValue(number);
        Number endValue = getEndValue(number2);
        if (startValue == null || endValue == null) {
            return null;
        }
        return super.evaluate(f, startValue, endValue);
    }
}
