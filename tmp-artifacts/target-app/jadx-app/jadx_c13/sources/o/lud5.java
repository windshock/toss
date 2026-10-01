package o;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class lud5 implements access5900 {
    private final access5900 onExtraCallbackWithResult;

    public lud5(@NotNull access5900 access5900Var) {
        Intrinsics.checkNotNullParameter(access5900Var, "");
        this.onExtraCallbackWithResult = access5900Var;
    }

    @Override // o.access4600
    public List<Annotation> getAnnotations() {
        return this.onExtraCallbackWithResult.getAnnotations();
    }

    @Override // o.access5900
    public List<KTypeProjection> getArguments() {
        return this.onExtraCallbackWithResult.getArguments();
    }

    @Override // o.access5900
    public access5200 getClassifier() {
        return this.onExtraCallbackWithResult.getClassifier();
    }

    @Override // o.access5900
    public boolean isMarkedNullable() {
        return this.onExtraCallbackWithResult.isMarkedNullable();
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        access5900 access5900Var = this.onExtraCallbackWithResult;
        lud5 lud5Var = obj instanceof lud5 ? (lud5) obj : null;
        if (!Intrinsics.areEqual(access5900Var, lud5Var != null ? lud5Var.onExtraCallbackWithResult : null)) {
            return false;
        }
        access5200 classifier = getClassifier();
        if (classifier instanceof KClass) {
            access5900 access5900Var2 = obj instanceof access5900 ? (access5900) obj : null;
            access5200 classifier2 = access5900Var2 != null ? access5900Var2.getClassifier() : null;
            if (classifier2 != null && (classifier2 instanceof KClass)) {
                return Intrinsics.areEqual(clearRegisters.onNavigationEvent((KClass) classifier), clearRegisters.onNavigationEvent((KClass) classifier2));
            }
        }
        return false;
    }

    public int hashCode() {
        return this.onExtraCallbackWithResult.hashCode();
    }

    public String toString() {
        return "KTypeWrapper: " + this.onExtraCallbackWithResult;
    }
}
