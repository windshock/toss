package im.toss.tds.compose.foundation.anim.rally;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.constrain;
import o.getCallToActionButton;
import o.getStarRatingContentViewGroup;
import o.getWrite;
import o.onQueryRefine;
import o.setOnQueryTextListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RallyKeyframes<T> {
    private static int onExtraCallback = 0;
    private static int onTransact = 1;
    private final T IAuthTabCallback;
    private final List<Pair<Integer, Entity<T>>> onExtraCallbackWithResult = new ArrayList();
    private final Integer onNavigationEvent;
    private final setOnQueryTextListener onWarmupCompleted;

    public static /* synthetic */ Unit onWarmupCompleted(RallyKeyframes rallyKeyframes, constrain.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onTransact + 67;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(rallyKeyframes, onnavigationevent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(rallyKeyframes, onnavigationevent);
        int i3 = onExtraCallback + 11;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public RallyKeyframes(@Nullable Integer num, @Nullable T t, @Nullable setOnQueryTextListener setonquerytextlistener) {
        this.onNavigationEvent = num;
        this.IAuthTabCallback = t;
        this.onWarmupCompleted = setonquerytextlistener;
    }

    public final Entity<T> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Entity<T> entity = (Entity) ((Pair) CollectionsKt.last(this.onExtraCallbackWithResult)).getSecond();
        int i3 = onExtraCallback + 93;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return entity;
    }

    public static final class Entity<T> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        private final T onExtraCallback;
        private setOnQueryTextListener onExtraCallbackWithResult;
        private final int onNavigationEvent;

        public Entity(int i, T t, @Nullable setOnQueryTextListener setonquerytextlistener) {
            this.onNavigationEvent = i;
            this.onExtraCallback = t;
            this.onExtraCallbackWithResult = setonquerytextlistener;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Entity(int i, Object obj, setOnQueryTextListener setonquerytextlistener, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i2 & 4) != 0) {
                int i3 = IAuthTabCallback;
                int i4 = i3 + 123;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 29;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
                setonquerytextlistener = null;
            }
            this(i, obj, setonquerytextlistener);
        }

        public final T onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            T t = this.onExtraCallback;
            int i5 = i3 + 67;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return t;
        }

        public final setOnQueryTextListener IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 77;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void onWarmupCompleted(@Nullable setOnQueryTextListener setonquerytextlistener) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 7;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            this.onExtraCallbackWithResult = setonquerytextlistener;
            int i5 = i2 + 85;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final Entity<T> onWarmupCompleted(T t, int i) {
        int i2 = 2 % 2;
        Entity<T> entity = new Entity<>(i, t, null, 4, null);
        this.onExtraCallbackWithResult.add(getWrite.IAuthTabCallback(Integer.valueOf(i), entity));
        int i3 = onTransact + 101;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return entity;
    }

    public final void onWarmupCompleted(T t, @NotNull getStarRatingContentViewGroup getstarratingcontentviewgroup) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getstarratingcontentviewgroup, "");
        int iOnExtraCallback = getstarratingcontentviewgroup.onExtraCallback();
        this.onExtraCallbackWithResult.add(getWrite.IAuthTabCallback(Integer.valueOf(iOnExtraCallback), new Entity(iOnExtraCallback, t, getstarratingcontentviewgroup)));
        int i2 = onTransact + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    public final Entity<T> onExtraCallbackWithResult(@NotNull Entity<T> entity, @NotNull setOnQueryTextListener setonquerytextlistener) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(entity, "");
        Intrinsics.checkNotNullParameter(setonquerytextlistener, "");
        entity.onWarmupCompleted(setonquerytextlistener);
        int i4 = onTransact + 55;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return entity;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final constrain<T> onExtraCallback() {
        int i = 2 % 2;
        constrain<T> constrainVarOnNavigationEvent = onQueryRefine.onNavigationEvent(new Function1() { // from class: im.toss.tds.compose.foundation.anim.rally.RallyKeyframes$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 37;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = RallyKeyframes.onWarmupCompleted(this.f$0, (constrain.onNavigationEvent) obj);
                if (i4 != 0) {
                    int i5 = 53 / 0;
                }
                return unitOnWarmupCompleted;
            }
        });
        int i2 = onTransact + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return constrainVarOnNavigationEvent;
    }

    private static final Unit onExtraCallback(RallyKeyframes rallyKeyframes, constrain.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Iterator<T> it = rallyKeyframes.onExtraCallbackWithResult.iterator();
        int i2 = 0;
        int iIntValue = 0;
        while (it.hasNext()) {
            int i3 = onExtraCallback + 115;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            iIntValue += ((Number) ((Pair) it.next()).getFirst()).intValue();
        }
        onnavigationevent.onWarmupCompleted(iIntValue);
        Integer num = rallyKeyframes.onNavigationEvent;
        if (num != null) {
            int i5 = onTransact + 5;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                onnavigationevent.IAuthTabCallback(num.intValue());
                int i6 = 29 / 0;
            } else {
                onnavigationevent.IAuthTabCallback(num.intValue());
            }
        }
        T t = rallyKeyframes.IAuthTabCallback;
        if (t != null) {
            constrain.onExtraCallback onExtraCallback2 = onnavigationevent.onExtraCallback(t, 0);
            setOnQueryTextListener setonquerytextlistenerOnTransact = rallyKeyframes.onWarmupCompleted;
            if (setonquerytextlistenerOnTransact == null) {
                setonquerytextlistenerOnTransact = getCallToActionButton.onExtraCallback.onTransact();
            }
            onnavigationevent.onExtraCallback(onExtraCallback2, setonquerytextlistenerOnTransact);
        }
        Iterator<T> it2 = rallyKeyframes.onExtraCallbackWithResult.iterator();
        while (!(!it2.hasNext())) {
            Pair pair = (Pair) it2.next();
            int iIntValue2 = ((Number) pair.onExtraCallbackWithResult()).intValue();
            Entity entity = (Entity) pair.IAuthTabCallback();
            i2 += iIntValue2;
            constrain.onExtraCallback onExtraCallback3 = onnavigationevent.onExtraCallback(entity.onExtraCallback(), i2);
            setOnQueryTextListener setonquerytextlistenerIAuthTabCallback = entity.IAuthTabCallback();
            if (setonquerytextlistenerIAuthTabCallback == null && (setonquerytextlistenerIAuthTabCallback = rallyKeyframes.onWarmupCompleted) == null) {
                setonquerytextlistenerIAuthTabCallback = getCallToActionButton.onExtraCallback.IAuthTabCallback();
            }
            onnavigationevent.onExtraCallback(onExtraCallback3, setonquerytextlistenerIAuthTabCallback);
            int i7 = onTransact + 67;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 3;
            }
        }
        return Unit.INSTANCE;
    }
}
