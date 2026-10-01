package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.unregisterViewsForInteraction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface unregisterViewsForInteraction {

    public static final class onExtraCallbackWithResult implements unregisterViewsForInteraction {
        public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallbackStub = 1;
        private static int asBinder = 1;
        private static final getUnreadableElfFiles onExtraCallbackWithResult;
        private static final int onNavigationEvent;
        private static int onTransact;
        private final char IAuthTabCallback;
        private final char asInterface;
        private final onItemClicked<Float> onExtraCallback;
        private final getMainImageUri onWarmupCompleted;

        public static final /* synthetic */ class onNavigationEvent {
            private static int onExtraCallbackWithResult = 1;
            public static final /* synthetic */ int[] onNavigationEvent;
            private static int onWarmupCompleted;

            static {
                int[] iArr = new int[getMainImageUri.values().length];
                try {
                    iArr[getMainImageUri.Up.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[getMainImageUri.Down.ordinal()] = 2;
                    int i = onExtraCallbackWithResult + 101;
                    onWarmupCompleted = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused2) {
                }
                onNavigationEvent = iArr;
                int i3 = onWarmupCompleted + 39;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 20 / 0;
                }
            }
        }

        public static /* synthetic */ Unit onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult, setTaggedAddrCtrl settaggedaddrctrl, boolean z, char c, int i, boolean z2, char c2, float f, float f2) throws NoWhenBranchMatchedException {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackDefault + 13;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            Unit unitOnWarmupCompleted = onWarmupCompleted(onextracallbackwithresult, settaggedaddrctrl, z, c, i, z2, c2, f, f2);
            int i5 = IAuthTabCallbackDefault + 89;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return unitOnWarmupCompleted;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallbackDefault + 95;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                int i4 = asBinder + 119;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (this.IAuthTabCallback != onextracallbackwithresult.IAuthTabCallback) {
                int i6 = IAuthTabCallbackDefault + 71;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (this.asInterface == onextracallbackwithresult.asInterface) {
                return this.onWarmupCompleted == onextracallbackwithresult.onWarmupCompleted && Intrinsics.areEqual(this.onExtraCallback, onextracallbackwithresult.onExtraCallback);
            }
            int i8 = IAuthTabCallbackDefault + 13;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 77;
            asBinder = i2 % 128;
            int iHashCode = i2 % 2 == 0 ? (((((Character.hashCode(this.IAuthTabCallback) >>> 33) >> Character.hashCode(this.asInterface)) - 36) % this.onWarmupCompleted.hashCode()) / 80) << this.onExtraCallback.hashCode() : (((((Character.hashCode(this.IAuthTabCallback) * 31) + Character.hashCode(this.asInterface)) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onExtraCallback.hashCode();
            int i3 = asBinder + 125;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Transition(from=" + this.IAuthTabCallback + ", to=" + this.asInterface + ", direction=" + this.onWarmupCompleted + ", spec=" + this.onExtraCallback + ")";
            int i2 = asBinder + 81;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public onExtraCallbackWithResult(char c, char c2, @NotNull getMainImageUri getmainimageuri, @NotNull onItemClicked<Float> onitemclicked) {
            Intrinsics.checkNotNullParameter(getmainimageuri, "");
            Intrinsics.checkNotNullParameter(onitemclicked, "");
            this.IAuthTabCallback = c;
            this.asInterface = c2;
            this.onWarmupCompleted = getmainimageuri;
            this.onExtraCallback = onitemclicked;
        }

        public final char onNavigationEvent() {
            char c;
            int i = 2 % 2;
            int i2 = asBinder + 75;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            if (i2 % 2 != 0) {
                c = this.IAuthTabCallback;
                int i4 = 67 / 0;
            } else {
                c = this.IAuthTabCallback;
            }
            int i5 = i3 + 77;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 47 / 0;
            }
            return c;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object onExtraCallback(int i, boolean z, @NotNull final setTaggedAddrCtrl<? super Character, ? super Character, ? super Character, ? super Float, Unit> settaggedaddrctrl, @NotNull access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
            final boolean z2;
            boolean z3;
            Triple triple;
            Triple triple2;
            int i2;
            int i3;
            int i4;
            int i5 = 2;
            int i6 = 2 % 2;
            int i7 = IAuthTabCallbackDefault + 17;
            asBinder = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            if (!z && this.IAuthTabCallback == this.asInterface) {
                return Unit.INSTANCE;
            }
            getUnreadableElfFiles getunreadableelffiles = onExtraCallbackWithResult;
            char cIAuthTabCallback = getunreadableelffiles.IAuthTabCallback();
            char cOnNavigationEvent = getunreadableelffiles.onNavigationEvent();
            char c = this.IAuthTabCallback;
            if (cIAuthTabCallback <= c) {
                int i8 = asBinder + 107;
                IAuthTabCallbackDefault = i8 % 128;
                int i9 = i8 % 2;
                z2 = c <= cOnNavigationEvent;
            }
            char cIAuthTabCallback2 = getunreadableelffiles.IAuthTabCallback();
            char cOnNavigationEvent2 = getunreadableelffiles.onNavigationEvent();
            char c2 = this.asInterface;
            if (cIAuthTabCallback2 <= c2) {
                int i10 = IAuthTabCallbackDefault + 45;
                asBinder = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
                z3 = c2 <= cOnNavigationEvent2;
            }
            if (z2 && z3) {
                triple2 = new Triple(access14000.onNavigationEvent(this.IAuthTabCallback), access14000.onNavigationEvent(this.asInterface), access14000.onNavigationEvent(0));
            } else if (z2) {
                triple2 = new Triple(access14000.onNavigationEvent(this.IAuthTabCallback), access14000.onNavigationEvent(this.IAuthTabCallback), access14000.onNavigationEvent(1));
            } else if (z3) {
                triple2 = new Triple(access14000.onNavigationEvent(c2), access14000.onNavigationEvent(this.asInterface), access14000.onNavigationEvent(1));
            } else {
                if (onNavigationEvent.onNavigationEvent[this.onWarmupCompleted.ordinal()] == 1) {
                    triple = new Triple(access14000.onNavigationEvent(getunreadableelffiles.IAuthTabCallback()), access14000.onNavigationEvent(getunreadableelffiles.onNavigationEvent()), access14000.onNavigationEvent(2));
                    int i11 = asBinder + 25;
                    IAuthTabCallbackDefault = i11 % 128;
                    int i12 = i11 % 2;
                } else {
                    triple = new Triple(access14000.onNavigationEvent(getunreadableelffiles.onNavigationEvent()), access14000.onNavigationEvent(getunreadableelffiles.IAuthTabCallback()), access14000.onNavigationEvent(2));
                }
                triple2 = triple;
            }
            final char cCharValue = ((Character) triple2.onExtraCallbackWithResult()).charValue();
            final char cCharValue2 = ((Character) triple2.onExtraCallback()).charValue();
            int iIntValue = ((Number) triple2.IAuthTabCallback()).intValue();
            if (i != 0) {
                int i13 = onNavigationEvent.onNavigationEvent[this.onWarmupCompleted.ordinal()];
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (Intrinsics.compare(cCharValue, cCharValue2) > 0) {
                        i4 = cCharValue - cCharValue2;
                        i5 = i4 + 1 + iIntValue + ((i - 1) * onNavigationEvent);
                    } else {
                        i2 = onNavigationEvent;
                        i3 = cCharValue2 - cCharValue;
                        i4 = i2 - i3;
                        i5 = i4 + 1 + iIntValue + ((i - 1) * onNavigationEvent);
                    }
                } else if (Intrinsics.compare(cCharValue, cCharValue2) < 0) {
                    int i14 = asBinder + 51;
                    IAuthTabCallbackDefault = i14 % 128;
                    int i15 = i14 % 2;
                    i4 = cCharValue2 - cCharValue;
                    i5 = i4 + 1 + iIntValue + ((i - 1) * onNavigationEvent);
                } else {
                    i2 = onNavigationEvent;
                    i3 = cCharValue - cCharValue2;
                    i4 = i2 - i3;
                    i5 = i4 + 1 + iIntValue + ((i - 1) * onNavigationEvent);
                }
            }
            final int i16 = i5;
            final boolean z4 = z3;
            Object objOnWarmupCompleted = getShowText.onWarmupCompleted(0.0f, i16 - 1.0f, 0.0f, this.onExtraCallback, new Function2() { // from class: im.toss.tds.compose.component.anim.rollingnumber.CharProperty$Transition$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                    int i17 = 2 % 2;
                    int i18 = onExtraCallback + 33;
                    onExtraCallbackWithResult = i18 % 128;
                    int i19 = i18 % 2;
                    Unit unitOnNavigationEvent = unregisterViewsForInteraction.onExtraCallbackWithResult.onNavigationEvent(this.f$0, settaggedaddrctrl, z2, cCharValue, i16, z4, cCharValue2, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                    int i20 = onExtraCallback + 125;
                    onExtraCallbackWithResult = i20 % 128;
                    if (i20 % 2 != 0) {
                        return unitOnNavigationEvent;
                    }
                    throw null;
                }
            }, access13800Var, 4, (Object) null);
            return objOnWarmupCompleted == access14300.onWarmupCompleted() ? objOnWarmupCompleted : Unit.INSTANCE;
        }

        private static final char onExtraCallback(boolean z, char c, onExtraCallbackWithResult onextracallbackwithresult, int i, boolean z2, char c2, int i2, int i3) {
            int i4 = 2 % 2;
            if (i3 <= 0) {
                return z ? c : onextracallbackwithresult.IAuthTabCallback;
            }
            if (i3 < i - 1) {
                if (!z) {
                    i3--;
                }
                getUnreadableElfFiles getunreadableelffiles = onExtraCallbackWithResult;
                char cIAuthTabCallback = getunreadableelffiles.IAuthTabCallback();
                int i5 = onNavigationEvent;
                int i6 = ((c - cIAuthTabCallback) + (i3 * i2)) % i5;
                return (char) (getunreadableelffiles.IAuthTabCallback() + i6 + (((((-i6) | i6) & (i6 ^ i5)) >> 31) & i5));
            }
            int i7 = IAuthTabCallbackDefault + 121;
            int i8 = i7 % 128;
            asBinder = i8;
            if (i7 % 2 == 0) {
                throw null;
            }
            if (!z2) {
                return onextracallbackwithresult.asInterface;
            }
            int i9 = i8 + 119;
            IAuthTabCallbackDefault = i9 % 128;
            if (i9 % 2 == 0) {
                return c2;
            }
            throw null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        private static final Unit onWarmupCompleted(onExtraCallbackWithResult onextracallbackwithresult, setTaggedAddrCtrl settaggedaddrctrl, boolean z, char c, int i, boolean z2, char c2, float f, float f2) throws NoWhenBranchMatchedException {
            int i2 = 2 % 2;
            int i3 = (int) f;
            float f3 = i3;
            int i4 = onNavigationEvent.onNavigationEvent[onextracallbackwithresult.onWarmupCompleted.ordinal()];
            int i5 = 1;
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i6 = asBinder;
                int i7 = i6 + 61;
                IAuthTabCallbackDefault = i7 % 128;
                int i8 = i7 % 2;
                int i9 = i6 + 49;
                IAuthTabCallbackDefault = i9 % 128;
                int i10 = i9 % 2;
                i5 = -1;
            }
            int i11 = i5;
            int i12 = IAuthTabCallbackDefault + 91;
            asBinder = i12 % 128;
            int i13 = i12 % 2;
            settaggedaddrctrl.invoke(Character.valueOf(onExtraCallback(z, c, onextracallbackwithresult, i, z2, c2, i11, i3 - i11)), Character.valueOf(onExtraCallback(z, c, onextracallbackwithresult, i, z2, c2, i11, i3)), Character.valueOf(onExtraCallback(z, c, onextracallbackwithresult, i, z2, c2, i11, i3 + i11)), Float.valueOf((f - f3) * i11));
            Unit unit = Unit.INSTANCE;
            int i14 = asBinder + 47;
            IAuthTabCallbackDefault = i14 % 128;
            int i15 = i14 % 2;
            return unit;
        }

        public static final class IAuthTabCallback {
            public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private IAuthTabCallback() {
            }
        }

        static {
            getUnreadableElfFiles getunreadableelffiles = new getUnreadableElfFiles('0', '9');
            onExtraCallbackWithResult = getunreadableelffiles;
            onNavigationEvent = CollectionsKt.count(getunreadableelffiles);
            int i = IAuthTabCallbackStub + 113;
            onTransact = i % 128;
            int i2 = i % 2;
        }
    }

    public static final class onWarmupCompleted implements unregisterViewsForInteraction {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private final char IAuthTabCallback;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 95;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            if (this.IAuthTabCallback == ((onWarmupCompleted) obj).IAuthTabCallback) {
                return true;
            }
            int i4 = i2 + 53;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            char c = this.IAuthTabCallback;
            if (i3 == 0) {
                return Character.hashCode(c);
            }
            Character.hashCode(c);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Static(char=" + this.IAuthTabCallback + ")";
            int i2 = onExtraCallback + 113;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onWarmupCompleted(char c) {
            this.IAuthTabCallback = c;
        }

        public final char onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            char c = this.IAuthTabCallback;
            int i5 = i3 + 31;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return c;
            }
            throw null;
        }
    }
}
