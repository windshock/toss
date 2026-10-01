package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw {

    public static final class onWarmupCompleted implements r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        private final getConfiguration<Float> onNavigationEvent;
        private final onItemClicked<Float> onWarmupCompleted;

        public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, float f, float f2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(function1, f, f2);
            }
            onExtraCallbackWithResult(function1, f, f2);
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 123;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i5 = i2 + 45;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i2 + 53;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (!Intrinsics.areEqual(this.onNavigationEvent, onwarmupcompleted.onNavigationEvent)) {
                int i9 = onExtraCallbackWithResult + 85;
                IAuthTabCallback = i9 % 128;
                return i9 % 2 == 0;
            }
            if (Intrinsics.areEqual(this.onWarmupCompleted, onwarmupcompleted.onWarmupCompleted)) {
                return true;
            }
            int i10 = onExtraCallbackWithResult + 89;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onExtraCallbackWithResult = i2 % 128;
            int iHashCode = i2 % 2 != 0 ? (this.onNavigationEvent.hashCode() >>> 32) >> this.onWarmupCompleted.hashCode() : (this.onNavigationEvent.hashCode() * 31) + this.onWarmupCompleted.hashCode();
            int i3 = onExtraCallbackWithResult + 43;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Transition(range=" + this.onNavigationEvent + ", spec=" + this.onWarmupCompleted + ")";
            int i2 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 68 / 0;
            }
            return str;
        }

        public onWarmupCompleted(@NotNull getConfiguration<Float> getconfiguration, @NotNull onItemClicked<Float> onitemclicked) {
            Intrinsics.checkNotNullParameter(getconfiguration, "");
            Intrinsics.checkNotNullParameter(onitemclicked, "");
            this.onNavigationEvent = getconfiguration;
            this.onWarmupCompleted = onitemclicked;
        }

        public final getConfiguration<Float> IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(float f, float f2, @NotNull onItemClicked<Float> onitemclicked) {
            this(new AppLovinSdk(f, f2), onitemclicked);
            Intrinsics.checkNotNullParameter(onitemclicked, "");
        }

        public final Object onExtraCallbackWithResult(@NotNull final Function1<? super Float, Unit> function1, @NotNull access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = getShowText.onWarmupCompleted(this.onNavigationEvent.onExtraCallback().floatValue(), this.onNavigationEvent.onWarmupCompleted().floatValue(), 0.0f, this.onWarmupCompleted, new Function2() { // from class: im.toss.tds.compose.component.anim.rollingnumber.FloatProperty$Transition$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 69;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    Unit unitOnWarmupCompleted = r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw.onWarmupCompleted.onWarmupCompleted(function1, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                    int i5 = onNavigationEvent + 43;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0) {
                        return unitOnWarmupCompleted;
                    }
                    throw null;
                }
            }, access13800Var, 4, (Object) null);
            Object obj = null;
            if (objOnWarmupCompleted == access14300.onWarmupCompleted()) {
                int i2 = onExtraCallbackWithResult + 95;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return objOnWarmupCompleted;
                }
                obj.hashCode();
                throw null;
            }
            Unit unit = Unit.INSTANCE;
            int i3 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        private static final Unit onExtraCallbackWithResult(Function1 function1, float f, float f2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            function1.invoke(Float.valueOf(f));
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    public static final class onExtraCallback implements r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        private final float onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 15;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(!(obj instanceof onExtraCallback))) {
                return Float.compare(this.onWarmupCompleted, ((onExtraCallback) obj).onWarmupCompleted) == 0;
            }
            int i4 = onExtraCallbackWithResult + 31;
            IAuthTabCallback = i4 % 128;
            return i4 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 49;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Float.hashCode(this.onWarmupCompleted);
                throw null;
            }
            int iHashCode = Float.hashCode(this.onWarmupCompleted);
            int i3 = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Static(value=" + this.onWarmupCompleted + ")";
            int i2 = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public onExtraCallback(float f) {
            this.onWarmupCompleted = f;
        }

        public final float IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 77;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            float f = this.onWarmupCompleted;
            int i5 = i2 + 39;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }
    }
}
