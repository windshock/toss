package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs {
    public /* synthetic */ r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs() {
    }

    public static final class onWarmupCompleted extends r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private final o4 onExtraCallback;
        private final o3 onExtraCallbackWithResult;
        private final o4 onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (obj instanceof onWarmupCompleted) {
                onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
                if (Intrinsics.areEqual(this.onExtraCallbackWithResult, onwarmupcompleted.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onNavigationEvent, onwarmupcompleted.onNavigationEvent)) {
                    if (!(!Intrinsics.areEqual(this.onExtraCallback, onwarmupcompleted.onExtraCallback))) {
                        return true;
                    }
                    int i2 = onWarmupCompleted + 37;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                }
                return false;
            }
            int i4 = IAuthTabCallback;
            int i5 = i4 + 29;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 109;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((this.onExtraCallbackWithResult.hashCode() * 31) + this.onNavigationEvent.hashCode()) * 31) + this.onExtraCallback.hashCode();
            int i4 = IAuthTabCallback + 63;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Loaded(request=" + this.onExtraCallbackWithResult + ", service=" + this.onNavigationEvent + ", shared=" + this.onExtraCallback + ")";
            int i2 = onWarmupCompleted + 5;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 30 / 0;
            }
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(@NotNull o3 o3Var, @NotNull o4 o4Var, @NotNull o4 o4Var2) {
            super(null);
            Intrinsics.checkNotNullParameter(o3Var, "");
            Intrinsics.checkNotNullParameter(o4Var, "");
            Intrinsics.checkNotNullParameter(o4Var2, "");
            this.onExtraCallbackWithResult = o3Var;
            this.onNavigationEvent = o4Var;
            this.onExtraCallback = o4Var2;
        }

        public o3 IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 87;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            o3 o3Var = this.onExtraCallbackWithResult;
            int i5 = i2 + 1;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return o3Var;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final o4 onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            o4 o4Var = this.onNavigationEvent;
            int i4 = i3 + 105;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return o4Var;
            }
            obj.hashCode();
            throw null;
        }

        public final o4 onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 121;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            o4 o4Var = this.onExtraCallback;
            int i4 = i3 + 9;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return o4Var;
        }
    }

    public static final class IAuthTabCallback extends r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        private final o3 onExtraCallback;
        private final o0a onNavigationEvent;
        private final Throwable onWarmupCompleted;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r6 instanceof o.r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs.IAuthTabCallback) != false) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
        
            r6 = (o.r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs.IAuthTabCallback) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onExtraCallback, r6.onExtraCallback) != false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
        
            r6 = o.r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs.IAuthTabCallback.onExtraCallbackWithResult + 121;
            o.r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs.IAuthTabCallback.IAuthTabCallback = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
        
            if (r5.onNavigationEvent == r6.onNavigationEvent) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
        
            r6 = o.r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs.IAuthTabCallback.onExtraCallbackWithResult + 23;
            o.r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs.IAuthTabCallback.IAuthTabCallback = r6 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
        
            if ((r6 % 2) != 0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onWarmupCompleted, r6.onWarmupCompleted) != false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 11 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onExtraCallback.hashCode();
            return i3 != 0 ? (((iHashCode % 127) % this.onNavigationEvent.hashCode()) * 46) - this.onWarmupCompleted.hashCode() : (((iHashCode * 31) + this.onNavigationEvent.hashCode()) * 31) + this.onWarmupCompleted.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Failed(request=" + this.onExtraCallback + ", failedTarget=" + this.onNavigationEvent + ", throwable=" + this.onWarmupCompleted + ")";
            int i2 = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 62 / 0;
            }
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(@NotNull o3 o3Var, @NotNull o0a o0aVar, @NotNull Throwable th) {
            super(null);
            Intrinsics.checkNotNullParameter(o3Var, "");
            Intrinsics.checkNotNullParameter(o0aVar, "");
            Intrinsics.checkNotNullParameter(th, "");
            this.onExtraCallback = o3Var;
            this.onNavigationEvent = o0aVar;
            this.onWarmupCompleted = th;
        }

        public o3 onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallback;
            }
            throw null;
        }

        public final o0a onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            o0a o0aVar = this.onNavigationEvent;
            int i5 = i3 + 123;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return o0aVar;
        }

        public final Throwable onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            Throwable th = this.onWarmupCompleted;
            int i5 = i3 + 11;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return th;
        }
    }
}
