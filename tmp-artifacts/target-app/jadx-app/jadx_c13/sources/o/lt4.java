package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class lt4<Object, Field> implements jw4<Object, Field> {
    private final access5500<Object, Field> onExtraCallback;
    private final String onWarmupCompleted;

    public lt4(@NotNull access5500<Object, Field> access5500Var, @NotNull String str) {
        Intrinsics.checkNotNullParameter(access5500Var, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallback = access5500Var;
        this.onWarmupCompleted = str;
    }

    public /* synthetic */ lt4(access5500 access5500Var, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(access5500Var, (i & 2) != 0 ? access5500Var.getName() : str);
    }

    @Override // o.removePauseListener
    public String onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    @Override // o.removePauseListener
    public Field onWarmupCompleted(Object object, Field field) {
        Field field2 = this.onExtraCallback.get(object);
        if (field2 == null) {
            this.onExtraCallback.set(object, field);
            return null;
        }
        if (Intrinsics.areEqual(field2, field)) {
            return null;
        }
        return field2;
    }

    @Override // o.jw4
    public Field onNavigationEvent(Object object) {
        return this.onExtraCallback.get(object);
    }
}
