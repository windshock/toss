package o;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.getViewTypeCount;
import o.putCharArray;
import o.setCompatibilityId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getViewTypeCount {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public static final getViewTypeCount onExtraCallbackWithResult = new getViewTypeCount();
    private static final accessisMonitoringp<IAuthTabCallbackStub> onWarmupCompleted = setPostviewFormatSelector.onExtraCallback(new Function1() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1$$ExternalSyntheticLambda0
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 81;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStubOnWarmupCompleted = getViewTypeCount.onWarmupCompleted((setCompatibilityId) obj);
            if (i3 == 0) {
                int i4 = 95 / 0;
            }
            return iAuthTabCallbackStubOnWarmupCompleted;
        }
    });

    public static /* synthetic */ IAuthTabCallbackStub onWarmupCompleted(setCompatibilityId setcompatibilityid) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(setcompatibilityid);
        }
        onExtraCallback(setcompatibilityid);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private getViewTypeCount() {
    }

    public static final class onExtraCallback {
        public static final onNavigationEvent Companion;
        private static final onExtraCallback IAuthTabCallback;
        private static int IAuthTabCallbackStub = 0;
        private static int asBinder = 1;
        private static final onExtraCallback onExtraCallbackWithResult;
        private static int onNavigationEvent = 0;
        private static int onTransact = 1;
        private final int onExtraCallback;
        private final float onWarmupCompleted;

        public /* synthetic */ onExtraCallback(int i, float f, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, f);
        }

        private onExtraCallback(int i, float f) {
            this.onExtraCallback = i;
            this.onWarmupCompleted = f;
        }

        public static final /* synthetic */ onExtraCallback onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asBinder + 1;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            onExtraCallback onextracallback = onExtraCallbackWithResult;
            int i5 = i3 + 71;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                return onextracallback;
            }
            throw null;
        }

        public static final /* synthetic */ onExtraCallback onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asBinder + 43;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            onExtraCallback onextracallback = IAuthTabCallback;
            int i5 = i3 + 87;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return onextracallback;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallback(int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i2 & 2) != 0) {
                int i3 = IAuthTabCallbackStub + 51;
                asBinder = i3 % 128;
                f = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(i3 % 2 == 0 ? 1.0f : 0.0f);
                int i4 = asBinder + 33;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            }
            this(i, f, null);
        }

        public final int onNavigationEvent(@NotNull r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, int i, int i2) {
            int i3 = 2 % 2;
            int i4 = asBinder + 21;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
            int iCoerceAtLeast = RangesKt.coerceAtLeast(QuirkSettingsLoader.Companion.IAuthTabCallbackDefault().onExtraCallbackWithResult(i, i2), 0) + r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallbackWithResult(this.onWarmupCompleted);
            int i6 = IAuthTabCallbackStub + 61;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            return iCoerceAtLeast;
        }

        public final int onNavigationEvent(int i, int i2) {
            int i3 = 2 % 2;
            int i4 = asBinder;
            int i5 = i4 + 111;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            if (this.onExtraCallback != 0) {
                int i7 = i4 + 117;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                return i;
            }
            int i9 = i4 + 69;
            IAuthTabCallbackStub = i9 % 128;
            int i10 = i9 % 2;
            return i2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        
            if ((r6 instanceof o.getViewTypeCount.onExtraCallback) != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
        
            if (r5.onExtraCallback != ((o.getViewTypeCount.onExtraCallback) r6).onExtraCallback) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
        
            r1 = r1 + 45;
            o.getViewTypeCount.onExtraCallback.asBinder = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            r1 = r1 + 99;
            o.getViewTypeCount.onExtraCallback.asBinder = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 101;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 57 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 49;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.onExtraCallback;
            int i6 = i2 + 13;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public static final class onNavigationEvent {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onNavigationEvent() {
            }

            public final onExtraCallback onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 51;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return onExtraCallback.onWarmupCompleted();
                }
                onExtraCallback.onWarmupCompleted();
                throw null;
            }

            public final onExtraCallback onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 125;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallback onextracallbackOnExtraCallbackWithResult = onExtraCallback.onExtraCallbackWithResult();
                int i4 = onExtraCallbackWithResult + 55;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return onextracallbackOnExtraCallbackWithResult;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final onExtraCallback onWarmupCompleted(float f) {
                int i = 2 % 2;
                onExtraCallback onextracallback = new onExtraCallback(0, f, null);
                int i2 = IAuthTabCallback + 117;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return onextracallback;
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new onNavigationEvent(defaultConstructorMarker);
            float f = 0.0f;
            int i = 2;
            IAuthTabCallback = new onExtraCallback(1, f, i, defaultConstructorMarker);
            onExtraCallbackWithResult = new onExtraCallback(0, f, i, defaultConstructorMarker);
            int i2 = onTransact + 113;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }
    }

    public static final class onTransact {
        public static final IAuthTabCallback Companion;
        private static final onTransact IAuthTabCallback;
        private static int IAuthTabCallbackDefault = 1;
        private static int IAuthTabCallbackStub = 0;
        private static int asBinder = 0;
        private static final onTransact onExtraCallback;
        private static final onTransact onExtraCallbackWithResult;
        private static final onTransact onNavigationEvent;
        private static int onTransact = 1;
        private static final onTransact onWarmupCompleted;
        private final float asInterface;

        public /* synthetic */ onTransact(float f, DefaultConstructorMarker defaultConstructorMarker) {
            this(f);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onTransact)) {
                int i2 = IAuthTabCallbackStub + 91;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.asInterface, ((onTransact) obj).asInterface)) {
                return true;
            }
            int i4 = onTransact + 91;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onTransact + 83;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            int iOnWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.asInterface);
            int i4 = onTransact + 95;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                return iOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "VerticalPadding(value=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.asInterface) + ")";
            int i2 = IAuthTabCallbackStub + 13;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        private onTransact(float f) {
            this.asInterface = f;
        }

        public static final /* synthetic */ onTransact IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 11;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            onTransact ontransact = onExtraCallback;
            int i5 = i2 + 5;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return ontransact;
        }

        public static final /* synthetic */ onTransact onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 17;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                return onWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ onTransact onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 31;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            onTransact ontransact = IAuthTabCallback;
            int i5 = i2 + 27;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                return ontransact;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ onTransact onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onTransact + 45;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ onTransact onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onTransact + 59;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            onTransact ontransact = onNavigationEvent;
            int i5 = i3 + 93;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return ontransact;
        }

        public final float onTransact() {
            int i = 2 % 2;
            int i2 = onTransact + 71;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            float f = this.asInterface;
            int i5 = i3 + 43;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public static final class IAuthTabCallback {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private IAuthTabCallback() {
            }

            public final onTransact IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 87;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return onTransact.onWarmupCompleted();
                }
                onTransact.onWarmupCompleted();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final onTransact onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 13;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return onTransact.IAuthTabCallback();
                }
                onTransact.IAuthTabCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final onTransact onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 33;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                onTransact ontransactOnNavigationEvent = onTransact.onNavigationEvent();
                int i4 = onWarmupCompleted + 3;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return ontransactOnNavigationEvent;
                }
                throw null;
            }

            public final onTransact onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 51;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                onTransact ontransactOnExtraCallbackWithResult = onTransact.onExtraCallbackWithResult();
                int i4 = onExtraCallback + 19;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return ontransactOnExtraCallbackWithResult;
                }
                throw null;
            }

            public final onTransact onExtraCallback() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 55;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                onTransact ontransactOnExtraCallback = onTransact.onExtraCallback();
                int i4 = onExtraCallback + 59;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return ontransactOnExtraCallback;
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new IAuthTabCallback(defaultConstructorMarker);
            onNavigationEvent = new onTransact(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), defaultConstructorMarker);
            onTransact ontransact = new onTransact(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), defaultConstructorMarker);
            onExtraCallback = ontransact;
            onExtraCallbackWithResult = new onTransact(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), defaultConstructorMarker);
            IAuthTabCallback = new onTransact(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), defaultConstructorMarker);
            onWarmupCompleted = ontransact;
            int i = asBinder + 15;
            IAuthTabCallbackDefault = i % 128;
            if (i % 2 == 0) {
                int i2 = 94 / 0;
            }
        }
    }

    public static final class onNavigationEvent {
        public static final onExtraCallback Companion;
        private static int IAuthTabCallbackDefault = 0;
        private static int asBinder = 1;
        private static int asInterface = 1;
        private static final onNavigationEvent onExtraCallback;
        private static int onExtraCallbackWithResult;
        private static final onNavigationEvent onNavigationEvent;
        private static final onNavigationEvent onWarmupCompleted;
        private final float IAuthTabCallback;

        public /* synthetic */ onNavigationEvent(float f, DefaultConstructorMarker defaultConstructorMarker) {
            this(f);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i2 = asBinder + 41;
                IAuthTabCallbackDefault = i2 % 128;
                return i2 % 2 != 0;
            }
            if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.IAuthTabCallback, ((onNavigationEvent) obj).IAuthTabCallback)) {
                return true;
            }
            int i3 = IAuthTabCallbackDefault + 49;
            asBinder = i3 % 128;
            return i3 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asBinder + 95;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            int iOnWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.IAuthTabCallback);
            if (i3 != 0) {
                int i4 = 98 / 0;
            }
            return iOnWarmupCompleted;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "HorizontalPadding(value=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.IAuthTabCallback) + ")";
            int i2 = IAuthTabCallbackDefault + 79;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        private onNavigationEvent(float f) {
            this.IAuthTabCallback = f;
        }

        public static final /* synthetic */ onNavigationEvent onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 43;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent onnavigationevent = onExtraCallback;
            int i5 = i2 + 77;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                return onnavigationevent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ onNavigationEvent onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 59;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent onnavigationevent = onWarmupCompleted;
            int i5 = i2 + 49;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return onnavigationevent;
        }

        public static final /* synthetic */ onNavigationEvent onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 109;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent onnavigationevent = onNavigationEvent;
            int i5 = i2 + 79;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 39 / 0;
            }
            return onnavigationevent;
        }

        public final float IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 111;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            float f = this.IAuthTabCallback;
            if (i3 == 0) {
                int i4 = 71 / 0;
            }
            return f;
        }

        public static final class onExtraCallback {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onExtraCallback() {
            }

            public final onNavigationEvent onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 67;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                onNavigationEvent onnavigationeventOnWarmupCompleted = onNavigationEvent.onWarmupCompleted();
                int i4 = onExtraCallbackWithResult + 55;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return onnavigationeventOnWarmupCompleted;
            }

            public final onNavigationEvent IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 113;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return onNavigationEvent.onNavigationEvent();
                }
                onNavigationEvent.onNavigationEvent();
                throw null;
            }

            public final onNavigationEvent onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 107;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                onNavigationEvent onnavigationeventOnExtraCallbackWithResult = onNavigationEvent.onExtraCallbackWithResult();
                int i4 = onExtraCallbackWithResult + 95;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return onnavigationeventOnExtraCallbackWithResult;
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new onExtraCallback(defaultConstructorMarker);
            onNavigationEvent onnavigationevent = new onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), defaultConstructorMarker);
            onNavigationEvent = onnavigationevent;
            onWarmupCompleted = new onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), defaultConstructorMarker);
            onExtraCallback = onnavigationevent;
            int i = asInterface + 57;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }
    }

    public static final class asInterface {
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackDefault = 0;
        private static int asBinder = 1;
        private static int onTransact = 1;
        private final IAuthTabCallback onExtraCallback;
        private final boolean onNavigationEvent;
        private final float onWarmupCompleted;
        public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
        private static final asInterface onExtraCallbackWithResult = new asInterface(null, 0.0f, false, 7, null);

        public /* synthetic */ asInterface(IAuthTabCallback iAuthTabCallback, float f, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(iAuthTabCallback, f, z);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
        
            if ((r6 instanceof o.getViewTypeCount.asInterface) != false) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        
            r6 = (o.getViewTypeCount.asInterface) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
        
            if (r5.onExtraCallback == r6.onExtraCallback) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
        
            if (o.VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(r5.onWarmupCompleted, r6.onWarmupCompleted) != false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
        
            r6 = o.getViewTypeCount.asInterface.asBinder + 105;
            o.getViewTypeCount.asInterface.IAuthTabCallbackDefault = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
        
            if (r5.onNavigationEvent == r6.onNavigationEvent) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
        
            r6 = o.getViewTypeCount.asInterface.IAuthTabCallbackDefault + 111;
            o.getViewTypeCount.asInterface.asBinder = r6 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
        
            if ((r6 % 2) != 0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
        
            r6 = 72 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = asBinder + 125;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 6 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asBinder + 117;
            IAuthTabCallbackDefault = i2 % 128;
            int iHashCode = i2 % 2 != 0 ? (((this.onExtraCallback.hashCode() >>> 53) << VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onWarmupCompleted)) << 40) - Boolean.hashCode(this.onNavigationEvent) : (((this.onExtraCallback.hashCode() * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onWarmupCompleted)) * 31) + Boolean.hashCode(this.onNavigationEvent);
            int i3 = asBinder + 7;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "RightIntersectPolicy(primary=" + this.onExtraCallback + ", secondaryMaxWidth=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onWarmupCompleted) + ", secondaryFillRemaining=" + this.onNavigationEvent + ")";
            int i2 = IAuthTabCallbackDefault + 23;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        private asInterface(IAuthTabCallback iAuthTabCallback, float f, boolean z) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            this.onExtraCallback = iAuthTabCallback;
            this.onWarmupCompleted = f;
            this.onNavigationEvent = z;
        }

        public static final /* synthetic */ asInterface onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asBinder + 71;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            asInterface asinterface = onExtraCallbackWithResult;
            int i4 = i3 + 55;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return asinterface;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ asInterface(IAuthTabCallback iAuthTabCallback, float f, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            if ((i & 1) != 0) {
                int i2 = asBinder + 79;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 == 0) {
                    iAuthTabCallback = IAuthTabCallback.Center;
                    int i3 = 2 % 2;
                } else {
                    IAuthTabCallback iAuthTabCallback2 = IAuthTabCallback.Center;
                    defaultConstructorMarker2.hashCode();
                    throw null;
                }
            }
            f = (i & 2) != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(140.0f) : f;
            if ((i & 4) != 0) {
                int i4 = IAuthTabCallbackDefault + 71;
                asBinder = i4 % 128;
                z = i4 % 2 == 0;
                int i5 = 2 % 2;
            }
            this(iAuthTabCallback, f, z, defaultConstructorMarker2);
        }

        public final IAuthTabCallback onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 15;
            IAuthTabCallbackDefault = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                throw null;
            }
            IAuthTabCallback iAuthTabCallback = this.onExtraCallback;
            int i4 = i2 + 77;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                return iAuthTabCallback;
            }
            obj.hashCode();
            throw null;
        }

        public final float onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 21;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            float f = this.onWarmupCompleted;
            int i4 = i2 + 99;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return f;
        }

        public final boolean onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 1;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            boolean z = this.onNavigationEvent;
            int i5 = i3 + 19;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                return z;
            }
            throw null;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class IAuthTabCallback {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ IAuthTabCallback[] $VALUES;
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            public static final IAuthTabCallback Center = new IAuthTabCallback("Center", 0);
            public static final IAuthTabCallback Right = new IAuthTabCallback("Right", 1);

            private static final /* synthetic */ IAuthTabCallback[] $values() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 107;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback iAuthTabCallback = Center;
                if (i3 == 0) {
                    return new IAuthTabCallback[]{iAuthTabCallback, Right};
                }
                IAuthTabCallback iAuthTabCallback2 = Right;
                IAuthTabCallback[] iAuthTabCallbackArr = new IAuthTabCallback[3];
                iAuthTabCallbackArr[0] = iAuthTabCallback;
                iAuthTabCallbackArr[0] = iAuthTabCallback2;
                return iAuthTabCallbackArr;
            }

            public static EnumEntries<IAuthTabCallback> getEntries() {
                EnumEntries<IAuthTabCallback> enumEntries;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 21;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    enumEntries = $ENTRIES;
                    int i4 = 7 / 0;
                } else {
                    enumEntries = $ENTRIES;
                }
                int i5 = i2 + 53;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 94 / 0;
                }
                return enumEntries;
            }

            public static IAuthTabCallback valueOf(String str) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 61;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
                if (i3 != 0) {
                    int i4 = 45 / 0;
                }
                return iAuthTabCallback;
            }

            public static IAuthTabCallback[] values() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 119;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback[] iAuthTabCallbackArr = $VALUES;
                if (i3 == 0) {
                    return (IAuthTabCallback[]) iAuthTabCallbackArr.clone();
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private IAuthTabCallback(String str, int i) {
            }

            static {
                IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
                $VALUES = iAuthTabCallbackArr$values;
                $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
                int i = onNavigationEvent + 55;
                onExtraCallback = i % 128;
                if (i % 2 == 0) {
                    int i2 = 52 / 0;
                }
            }
        }

        public static final class onWarmupCompleted {
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onWarmupCompleted() {
            }

            public final asInterface IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 25;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                asInterface asinterfaceOnWarmupCompleted = asInterface.onWarmupCompleted();
                int i4 = IAuthTabCallback + 37;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return asinterfaceOnWarmupCompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static {
            int i = onTransact + 13;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }
    }

    static {
        int i = IAuthTabCallback + 33;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    public final accessisMonitoringp<IAuthTabCallbackStub> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        accessisMonitoringp<IAuthTabCallbackStub> accessismonitoringp = onWarmupCompleted;
        int i5 = i3 + 11;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return accessismonitoringp;
    }

    public static final class onWarmupCompleted extends IAuthTabCallbackStub {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ float onExtraCallback;
        final /* synthetic */ pin onExtraCallbackWithResult;

        onWarmupCompleted(float f, pin pinVar) {
            this.onExtraCallback = f;
            this.onExtraCallbackWithResult = pinVar;
        }

        @Override // o.getViewTypeCount.IAuthTabCallbackStub
        protected boolean IAuthTabCallback() throws NoWhenBranchMatchedException {
            boolean zOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                zOnNavigationEvent = CipherSuiteCompanionORDER_BY_NAME1.onNavigationEvent(this.onExtraCallback, this.onExtraCallbackWithResult);
                int i3 = 5 / 0;
            } else {
                zOnNavigationEvent = CipherSuiteCompanionORDER_BY_NAME1.onNavigationEvent(this.onExtraCallback, this.onExtraCallbackWithResult);
            }
            int i4 = onNavigationEvent + 35;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return zOnNavigationEvent;
            }
            throw null;
        }
    }

    private static final IAuthTabCallbackStub onExtraCallback(setCompatibilityId setcompatibilityid) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setcompatibilityid, "");
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) setcompatibilityid.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onNavigationEvent(), readIntokhttp.onNavigationEvent((Configuration) setcompatibilityid.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallbackWithResult())));
        int i2 = onNavigationEvent + 113;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onwarmupcompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static abstract class IAuthTabCallbackStub {
        public static final IAuthTabCallback Companion;
        private static int IAuthTabCallback = 0;
        private static int asInterface = 1;
        private static final IAuthTabCallbackStub onExtraCallback = new onWarmupCompleted();
        private static final IAuthTabCallbackStub onExtraCallbackWithResult = new onExtraCallbackWithResult();
        private static int onTransact = 0;
        private static int onWarmupCompleted = 1;
        private final List<putCharArray> onNavigationEvent;

        protected abstract boolean IAuthTabCallback();

        public IAuthTabCallbackStub() {
            putCharArray.onNavigationEvent onnavigationevent = putCharArray.Companion;
            putCharArray putchararrayOnNavigationEvent = putCharArray.onNavigationEvent(onnavigationevent.onMinimized());
            putCharArray putchararrayOnNavigationEvent2 = putCharArray.onNavigationEvent(onnavigationevent.asInterface());
            int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            putCharArray putchararrayOnNavigationEvent3 = putCharArray.onNavigationEvent((String) putCharArray.onNavigationEvent.onExtraCallback(393927074, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{onnavigationevent}, iOnExtraCallback2, -393927070, iOnExtraCallback, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback()));
            int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            int iOnExtraCallback4 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            this.onNavigationEvent = CollectionsKt.listOf(new putCharArray[]{putchararrayOnNavigationEvent, putchararrayOnNavigationEvent2, putchararrayOnNavigationEvent3, putCharArray.onNavigationEvent((String) putCharArray.onNavigationEvent.onExtraCallback(-757856018, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{onnavigationevent}, iOnExtraCallback4, 757856021, iOnExtraCallback3, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback()))});
        }

        public static final /* synthetic */ IAuthTabCallbackStub onExtraCallback() {
            int i = 2 % 2;
            int i2 = asInterface + 109;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = onExtraCallbackWithResult;
            int i5 = i3 + 57;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallbackStub;
        }

        public static final /* synthetic */ IAuthTabCallbackStub onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onTransact + 119;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = onExtraCallback;
            int i5 = i3 + 31;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallbackStub;
        }

        public List<putCharArray> onNavigationEvent() {
            List<putCharArray> list;
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 117;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                list = this.onNavigationEvent;
                int i4 = 53 / 0;
            } else {
                list = this.onNavigationEvent;
            }
            int i5 = i2 + 79;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        public final boolean onExtraCallback(@NotNull putCharSequenceArray putcharsequencearray) {
            int i = 2 % 2;
            int i2 = onTransact + 83;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(putcharsequencearray, "");
            boolean zOnWarmupCompleted = putcharsequencearray.onWarmupCompleted(asBinder.Right, onNavigationEvent());
            int i4 = onTransact + 13;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return zOnWarmupCompleted;
        }

        public final boolean IAuthTabCallback(@NotNull putCharSequenceArray putcharsequencearray) {
            int i = 2 % 2;
            int i2 = asInterface + 9;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(putcharsequencearray, "");
            if (IAuthTabCallback() && onExtraCallback(putcharsequencearray)) {
                int i4 = onTransact + 67;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            int i6 = onTransact + 15;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public static final class IAuthTabCallback {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private IAuthTabCallback() {
            }

            public final IAuthTabCallbackStub onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 61;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    IAuthTabCallbackStub.onWarmupCompleted();
                    throw null;
                }
                IAuthTabCallbackStub iAuthTabCallbackStubOnWarmupCompleted = IAuthTabCallbackStub.onWarmupCompleted();
                int i3 = onExtraCallbackWithResult + 79;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return iAuthTabCallbackStubOnWarmupCompleted;
            }

            public final IAuthTabCallbackStub onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 101;
                onNavigationEvent = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    IAuthTabCallbackStub.onExtraCallback();
                    throw null;
                }
                IAuthTabCallbackStub iAuthTabCallbackStubOnExtraCallback = IAuthTabCallbackStub.onExtraCallback();
                int i3 = onExtraCallbackWithResult + 91;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    return iAuthTabCallbackStubOnExtraCallback;
                }
                obj.hashCode();
                throw null;
            }

            public static final class onWarmupCompleted extends IAuthTabCallbackStub {
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;
                final /* synthetic */ pin IAuthTabCallback;
                final /* synthetic */ Function1<pin, Float> onExtraCallbackWithResult;
                final /* synthetic */ float onWarmupCompleted;

                /* JADX WARN: Multi-variable type inference failed */
                onWarmupCompleted(float f, Function1<? super pin, Float> function1, pin pinVar) {
                    this.onWarmupCompleted = f;
                    this.onExtraCallbackWithResult = function1;
                    this.IAuthTabCallback = pinVar;
                }

                @Override // o.getViewTypeCount.IAuthTabCallbackStub
                protected boolean IAuthTabCallback() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 69;
                    onNavigationEvent = i2 % 128;
                    Object obj = null;
                    if (i2 % 2 == 0) {
                        ((Number) this.onExtraCallbackWithResult.invoke(this.IAuthTabCallback)).floatValue();
                        obj.hashCode();
                        throw null;
                    }
                    if (this.onWarmupCompleted < ((Number) this.onExtraCallbackWithResult.invoke(this.IAuthTabCallback)).floatValue()) {
                        return false;
                    }
                    int i3 = onExtraCallback + 1;
                    int i4 = i3 % 128;
                    onNavigationEvent = i4;
                    int i5 = i3 % 2;
                    int i6 = i4 + 29;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        return true;
                    }
                    throw null;
                }
            }

            public final IAuthTabCallbackStub onNavigationEvent(@NotNull Function1<? super pin, Float> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 21;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(function1, "");
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1453609378, i, -1, "im.toss.tds.compose.component.compound.listrow.TdsListRowV1.RightBreakPolicy.Companion.fontScale (TdsListRowV1.kt:274)");
                }
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onNavigationEvent(), function1, readIntokhttp.onNavigationEvent((Configuration) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallbackWithResult())));
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                int i5 = onExtraCallbackWithResult + 17;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return onwarmupcompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static final class onNavigationEvent extends IAuthTabCallbackStub {
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;
                final /* synthetic */ pin IAuthTabCallback;
                final /* synthetic */ float onWarmupCompleted;

                onNavigationEvent(float f, pin pinVar) {
                    this.onWarmupCompleted = f;
                    this.IAuthTabCallback = pinVar;
                }

                @Override // o.getViewTypeCount.IAuthTabCallbackStub
                protected boolean IAuthTabCallback() throws NoWhenBranchMatchedException {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 117;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    boolean zOnNavigationEvent = CipherSuiteCompanionORDER_BY_NAME1.onNavigationEvent(this.onWarmupCompleted, this.IAuthTabCallback);
                    int i4 = onNavigationEvent + 113;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 39 / 0;
                    }
                    return zOnNavigationEvent;
                }
            }

            public final IAuthTabCallbackStub onWarmupCompleted(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 23;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1811246671, i, -1, "im.toss.tds.compose.component.compound.listrow.TdsListRowV1.RightBreakPolicy.Companion.<get-FontScale> (TdsListRowV1.kt:285)");
                    int i5 = onNavigationEvent + 59;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                }
                onNavigationEvent onnavigationevent = new onNavigationEvent(((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onNavigationEvent(), readIntokhttp.onNavigationEvent((Configuration) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallbackWithResult())));
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                return onnavigationevent;
            }
        }

        public static final class onWarmupCompleted extends IAuthTabCallbackStub {
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // o.getViewTypeCount.IAuthTabCallbackStub
            protected boolean IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 21;
                IAuthTabCallback = i2 % 128;
                return i2 % 2 != 0;
            }

            onWarmupCompleted() {
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new IAuthTabCallback(defaultConstructorMarker);
            int i = IAuthTabCallback + 109;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public static final class onExtraCallbackWithResult extends IAuthTabCallbackStub {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // o.getViewTypeCount.IAuthTabCallbackStub
            protected boolean IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 35;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }

            onExtraCallbackWithResult() {
            }
        }
    }

    public interface onExtraCallbackWithResult {

        public interface IAuthTabCallback extends onExtraCallbackWithResult {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class onNavigationEvent implements IAuthTabCallback {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ onNavigationEvent[] $VALUES;
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;
                public static final onNavigationEvent Small = new onNavigationEvent("Small", 0);
                public static final onNavigationEvent Medium = new onNavigationEvent("Medium", 1);

                private static final /* synthetic */ onNavigationEvent[] $values() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 65;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    onNavigationEvent onnavigationevent = Small;
                    if (i3 == 0) {
                        return new onNavigationEvent[]{onnavigationevent, Medium};
                    }
                    onNavigationEvent onnavigationevent2 = Medium;
                    onNavigationEvent[] onnavigationeventArr = new onNavigationEvent[4];
                    onnavigationeventArr[0] = onnavigationevent;
                    onnavigationeventArr[0] = onnavigationevent2;
                    return onnavigationeventArr;
                }

                public static EnumEntries<onNavigationEvent> getEntries() {
                    EnumEntries<onNavigationEvent> enumEntries;
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 117;
                    int i3 = i2 % 128;
                    onWarmupCompleted = i3;
                    if (i2 % 2 == 0) {
                        enumEntries = $ENTRIES;
                        int i4 = 96 / 0;
                    } else {
                        enumEntries = $ENTRIES;
                    }
                    int i5 = i3 + 1;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return enumEntries;
                }

                public static onNavigationEvent valueOf(String str) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 51;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
                    if (i3 == 0) {
                        int i4 = 9 / 0;
                    }
                    return onnavigationevent;
                }

                public static onNavigationEvent[] values() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 13;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
                    int i4 = onWarmupCompleted + 91;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        return onnavigationeventArr;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                static {
                    onNavigationEvent[] onnavigationeventArr$values = $values();
                    $VALUES = onnavigationeventArr$values;
                    $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
                    int i = onExtraCallback + 119;
                    IAuthTabCallback = i % 128;
                    int i2 = i % 2;
                }

                private onNavigationEvent(String str, int i) {
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* renamed from: o.getViewTypeCount$onExtraCallbackWithResult$IAuthTabCallback$IAuthTabCallback, reason: collision with other inner class name */
            public static final class EnumC0027IAuthTabCallback implements IAuthTabCallback {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ EnumC0027IAuthTabCallback[] $VALUES;
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;
                public static final EnumC0027IAuthTabCallback Small = new EnumC0027IAuthTabCallback("Small", 0);
                public static final EnumC0027IAuthTabCallback Medium = new EnumC0027IAuthTabCallback("Medium", 1);

                private static final /* synthetic */ EnumC0027IAuthTabCallback[] $values() {
                    EnumC0027IAuthTabCallback[] enumC0027IAuthTabCallbackArr;
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 61;
                    int i3 = i2 % 128;
                    onExtraCallbackWithResult = i3;
                    if (i2 % 2 == 0) {
                        EnumC0027IAuthTabCallback enumC0027IAuthTabCallback = Small;
                        EnumC0027IAuthTabCallback enumC0027IAuthTabCallback2 = Medium;
                        enumC0027IAuthTabCallbackArr = new EnumC0027IAuthTabCallback[5];
                        enumC0027IAuthTabCallbackArr[0] = enumC0027IAuthTabCallback;
                        enumC0027IAuthTabCallbackArr[0] = enumC0027IAuthTabCallback2;
                    } else {
                        enumC0027IAuthTabCallbackArr = new EnumC0027IAuthTabCallback[]{Small, Medium};
                    }
                    int i4 = i3 + 21;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return enumC0027IAuthTabCallbackArr;
                }

                public static EnumEntries<EnumC0027IAuthTabCallback> getEntries() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 65;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    EnumEntries<EnumC0027IAuthTabCallback> enumEntries = $ENTRIES;
                    if (i3 != 0) {
                        int i4 = 77 / 0;
                    }
                    return enumEntries;
                }

                public static EnumC0027IAuthTabCallback valueOf(String str) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 59;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    EnumC0027IAuthTabCallback enumC0027IAuthTabCallback = (EnumC0027IAuthTabCallback) Enum.valueOf(EnumC0027IAuthTabCallback.class, str);
                    int i4 = onExtraCallbackWithResult + 107;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 31 / 0;
                    }
                    return enumC0027IAuthTabCallback;
                }

                public static EnumC0027IAuthTabCallback[] values() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 79;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    EnumC0027IAuthTabCallback[] enumC0027IAuthTabCallbackArr = (EnumC0027IAuthTabCallback[]) $VALUES.clone();
                    int i4 = onExtraCallbackWithResult + 3;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 == 0) {
                        return enumC0027IAuthTabCallbackArr;
                    }
                    throw null;
                }

                static {
                    EnumC0027IAuthTabCallback[] enumC0027IAuthTabCallbackArr$values = $values();
                    $VALUES = enumC0027IAuthTabCallbackArr$values;
                    $ENTRIES = access15300.onExtraCallbackWithResult(enumC0027IAuthTabCallbackArr$values);
                    int i = IAuthTabCallback + 73;
                    onExtraCallback = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 74 / 0;
                    }
                }

                private EnumC0027IAuthTabCallback(String str, int i) {
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class onExtraCallback implements IAuthTabCallback {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ onExtraCallback[] $VALUES;
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;
                public static final onExtraCallback Masking = new onExtraCallback("Masking", 0);
                public static final onExtraCallback Background = new onExtraCallback("Background", 1);

                private static final /* synthetic */ onExtraCallback[] $values() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult;
                    int i3 = i2 + 67;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    onExtraCallback[] onextracallbackArr = {Masking, Background};
                    int i5 = i2 + 83;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 1 / 0;
                    }
                    return onextracallbackArr;
                }

                public static EnumEntries<onExtraCallback> getEntries() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 113;
                    int i3 = i2 % 128;
                    onWarmupCompleted = i3;
                    int i4 = i2 % 2;
                    EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
                    int i5 = i3 + 19;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return enumEntries;
                }

                public static onExtraCallback valueOf(String str) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 75;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
                    if (i3 == 0) {
                        return onextracallback;
                    }
                    throw null;
                }

                public static onExtraCallback[] values() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 41;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
                    int i4 = onExtraCallbackWithResult + 85;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 == 0) {
                        return onextracallbackArr;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                private onExtraCallback(String str, int i) {
                }

                static {
                    onExtraCallback[] onextracallbackArr$values = $values();
                    $VALUES = onextracallbackArr$values;
                    $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
                    int i = onExtraCallback + 115;
                    IAuthTabCallback = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 48 / 0;
                    }
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class onWarmupCompleted implements IAuthTabCallback {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ onWarmupCompleted[] $VALUES;
                private static int IAuthTabCallback = 0;
                public static final onWarmupCompleted XSmall = new onWarmupCompleted("XSmall", 0);
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                private static final /* synthetic */ onWarmupCompleted[] $values() {
                    onWarmupCompleted[] onwarmupcompletedArr;
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback;
                    int i3 = i2 + 123;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        onwarmupcompletedArr = new onWarmupCompleted[0];
                        onwarmupcompletedArr[1] = XSmall;
                    } else {
                        onwarmupcompletedArr = new onWarmupCompleted[]{XSmall};
                    }
                    int i4 = i2 + 55;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return onwarmupcompletedArr;
                }

                public static EnumEntries<onWarmupCompleted> getEntries() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 43;
                    int i3 = i2 % 128;
                    IAuthTabCallback = i3;
                    int i4 = i2 % 2;
                    EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
                    int i5 = i3 + 5;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return enumEntries;
                }

                public static onWarmupCompleted valueOf(String str) {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 77;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
                    if (i3 == 0) {
                        int i4 = 4 / 0;
                    }
                    return onwarmupcompleted;
                }

                public static onWarmupCompleted[] values() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 25;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
                    int i4 = IAuthTabCallback + 1;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return onwarmupcompletedArr;
                }

                static {
                    onWarmupCompleted[] onwarmupcompletedArr$values = $values();
                    $VALUES = onwarmupcompletedArr$values;
                    $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
                    int i = onExtraCallbackWithResult + 5;
                    onWarmupCompleted = i % 128;
                    int i2 = i % 2;
                }

                private onWarmupCompleted(String str, int i) {
                }
            }
        }

        public interface onNavigationEvent extends onExtraCallbackWithResult {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class IAuthTabCallback implements onNavigationEvent {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ IAuthTabCallback[] $VALUES;
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;
                public static final IAuthTabCallback XSmall = new IAuthTabCallback("XSmall", 0);
                public static final IAuthTabCallback Small = new IAuthTabCallback("Small", 1);
                public static final IAuthTabCallback Medium = new IAuthTabCallback("Medium", 2);

                private static final /* synthetic */ IAuthTabCallback[] $values() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 53;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    IAuthTabCallback iAuthTabCallback = XSmall;
                    if (i3 != 0) {
                        return new IAuthTabCallback[]{iAuthTabCallback, Small, Medium};
                    }
                    IAuthTabCallback iAuthTabCallback2 = Small;
                    IAuthTabCallback iAuthTabCallback3 = Medium;
                    IAuthTabCallback[] iAuthTabCallbackArr = new IAuthTabCallback[3];
                    iAuthTabCallbackArr[1] = iAuthTabCallback;
                    iAuthTabCallbackArr[0] = iAuthTabCallback2;
                    iAuthTabCallbackArr[4] = iAuthTabCallback3;
                    return iAuthTabCallbackArr;
                }

                public static EnumEntries<IAuthTabCallback> getEntries() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent;
                    int i3 = i2 + 75;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
                    int i5 = i2 + 7;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        return enumEntries;
                    }
                    throw null;
                }

                public static IAuthTabCallback valueOf(String str) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 43;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
                    if (i3 != 0) {
                        int i4 = 75 / 0;
                    }
                    int i5 = onExtraCallbackWithResult + 95;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 62 / 0;
                    }
                    return iAuthTabCallback;
                }

                public static IAuthTabCallback[] values() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 13;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    IAuthTabCallback[] iAuthTabCallbackArr = $VALUES;
                    if (i3 == 0) {
                        return (IAuthTabCallback[]) iAuthTabCallbackArr.clone();
                    }
                    throw null;
                }

                static {
                    IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
                    $VALUES = iAuthTabCallbackArr$values;
                    $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
                    int i = onExtraCallback + 25;
                    onWarmupCompleted = i % 128;
                    int i2 = i % 2;
                }

                private IAuthTabCallback(String str, int i) {
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class onExtraCallback implements onNavigationEvent {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ onExtraCallback[] $VALUES;
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;
                public static final onExtraCallback XSmall = new onExtraCallback("XSmall", 0);
                public static final onExtraCallback Small = new onExtraCallback("Small", 1);
                public static final onExtraCallback Medium = new onExtraCallback("Medium", 2);

                private static final /* synthetic */ onExtraCallback[] $values() {
                    onExtraCallback[] onextracallbackArr;
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 115;
                    int i3 = i2 % 128;
                    onWarmupCompleted = i3;
                    if (i2 % 2 == 0) {
                        onextracallbackArr = new onExtraCallback[]{XSmall, Small};
                        onextracallbackArr[2] = Medium;
                    } else {
                        onextracallbackArr = new onExtraCallback[]{XSmall, Small, Medium};
                    }
                    int i4 = i3 + 109;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        return onextracallbackArr;
                    }
                    throw null;
                }

                public static EnumEntries<onExtraCallback> getEntries() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted;
                    int i3 = i2 + 49;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
                    int i5 = i2 + 35;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 75 / 0;
                    }
                    return enumEntries;
                }

                public static onExtraCallback valueOf(String str) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 123;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
                    if (i3 != 0) {
                        int i4 = 31 / 0;
                    }
                    int i5 = onWarmupCompleted + 115;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0) {
                        return onextracallback;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public static onExtraCallback[] values() {
                    onExtraCallback[] onextracallbackArr;
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 91;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 != 0) {
                        onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
                        int i3 = 32 / 0;
                    } else {
                        onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
                    }
                    int i4 = onExtraCallbackWithResult + 73;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 != 0) {
                        return onextracallbackArr;
                    }
                    throw null;
                }

                static {
                    onExtraCallback[] onextracallbackArr$values = $values();
                    $VALUES = onextracallbackArr$values;
                    $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
                    int i = onNavigationEvent + 113;
                    onExtraCallback = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 64 / 0;
                    }
                }

                private onExtraCallback(String str, int i) {
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* renamed from: o.getViewTypeCount$onExtraCallbackWithResult$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
            public static final class EnumC0033onNavigationEvent implements onNavigationEvent {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ EnumC0033onNavigationEvent[] $VALUES;
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;
                public static final EnumC0033onNavigationEvent Masking = new EnumC0033onNavigationEvent("Masking", 0);
                public static final EnumC0033onNavigationEvent Background = new EnumC0033onNavigationEvent("Background", 1);

                private static final /* synthetic */ EnumC0033onNavigationEvent[] $values() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 43;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    EnumC0033onNavigationEvent enumC0033onNavigationEvent = Masking;
                    if (i3 == 0) {
                        return new EnumC0033onNavigationEvent[]{enumC0033onNavigationEvent, Background};
                    }
                    EnumC0033onNavigationEvent enumC0033onNavigationEvent2 = Background;
                    EnumC0033onNavigationEvent[] enumC0033onNavigationEventArr = new EnumC0033onNavigationEvent[5];
                    enumC0033onNavigationEventArr[0] = enumC0033onNavigationEvent;
                    enumC0033onNavigationEventArr[1] = enumC0033onNavigationEvent2;
                    return enumC0033onNavigationEventArr;
                }

                public static EnumEntries<EnumC0033onNavigationEvent> getEntries() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 15;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 != 0) {
                        return $ENTRIES;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public static EnumC0033onNavigationEvent valueOf(String str) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 101;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    EnumC0033onNavigationEvent enumC0033onNavigationEvent = (EnumC0033onNavigationEvent) Enum.valueOf(EnumC0033onNavigationEvent.class, str);
                    if (i3 != 0) {
                        return enumC0033onNavigationEvent;
                    }
                    throw null;
                }

                public static EnumC0033onNavigationEvent[] values() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 13;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    EnumC0033onNavigationEvent[] enumC0033onNavigationEventArr = $VALUES;
                    if (i3 == 0) {
                        return (EnumC0033onNavigationEvent[]) enumC0033onNavigationEventArr.clone();
                    }
                    int i4 = 17 / 0;
                    return (EnumC0033onNavigationEvent[]) enumC0033onNavigationEventArr.clone();
                }

                private EnumC0033onNavigationEvent(String str, int i) {
                }

                static {
                    EnumC0033onNavigationEvent[] enumC0033onNavigationEventArr$values = $values();
                    $VALUES = enumC0033onNavigationEventArr$values;
                    $ENTRIES = access15300.onExtraCallbackWithResult(enumC0033onNavigationEventArr$values);
                    int i = onExtraCallbackWithResult + 95;
                    IAuthTabCallback = i % 128;
                    if (i % 2 == 0) {
                        throw null;
                    }
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class onWarmupCompleted implements onNavigationEvent {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ onWarmupCompleted[] $VALUES;
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;
                public static final onWarmupCompleted XSmall = new onWarmupCompleted("XSmall", 0);
                public static final onWarmupCompleted Small = new onWarmupCompleted("Small", 1);
                public static final onWarmupCompleted Medium = new onWarmupCompleted("Medium", 2);

                private static final /* synthetic */ onWarmupCompleted[] $values() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted;
                    int i3 = i2 + 33;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    onWarmupCompleted[] onwarmupcompletedArr = {XSmall, Small, Medium};
                    int i5 = i2 + 29;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return onwarmupcompletedArr;
                }

                public static EnumEntries<onWarmupCompleted> getEntries() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 51;
                    int i3 = i2 % 128;
                    onWarmupCompleted = i3;
                    int i4 = i2 % 2;
                    EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
                    int i5 = i3 + 29;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return enumEntries;
                }

                public static onWarmupCompleted valueOf(String str) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 25;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
                    if (i3 == 0) {
                        return onwarmupcompleted;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public static onWarmupCompleted[] values() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 83;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
                    int i4 = onWarmupCompleted + 15;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return onwarmupcompletedArr;
                }

                static {
                    onWarmupCompleted[] onwarmupcompletedArr$values = $values();
                    $VALUES = onwarmupcompletedArr$values;
                    $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
                    int i = onExtraCallback + 51;
                    IAuthTabCallback = i % 128;
                    int i2 = i % 2;
                }

                private onWarmupCompleted(String str, int i) {
                }
            }
        }

        public interface IAuthTabCallbackStub extends onExtraCallbackWithResult {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class onWarmupCompleted implements IAuthTabCallbackStub {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ onWarmupCompleted[] $VALUES;
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;
                public static final onWarmupCompleted Small = new onWarmupCompleted("Small", 0);
                public static final onWarmupCompleted Medium = new onWarmupCompleted("Medium", 1);

                private static final /* synthetic */ onWarmupCompleted[] $values() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 21;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    onWarmupCompleted onwarmupcompleted = Small;
                    if (i3 == 0) {
                        return new onWarmupCompleted[]{onwarmupcompleted, Medium};
                    }
                    onWarmupCompleted onwarmupcompleted2 = Medium;
                    onWarmupCompleted[] onwarmupcompletedArr = new onWarmupCompleted[3];
                    onwarmupcompletedArr[1] = onwarmupcompleted;
                    onwarmupcompletedArr[1] = onwarmupcompleted2;
                    return onwarmupcompletedArr;
                }

                public static EnumEntries<onWarmupCompleted> getEntries() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted;
                    int i3 = i2 + 65;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
                    int i5 = i2 + 79;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 59 / 0;
                    }
                    return enumEntries;
                }

                public static onWarmupCompleted valueOf(String str) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 97;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
                    int i4 = onWarmupCompleted + 97;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        return onwarmupcompleted;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public static onWarmupCompleted[] values() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 67;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
                    int i4 = onExtraCallback + 35;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 33 / 0;
                    }
                    return onwarmupcompletedArr;
                }

                static {
                    onWarmupCompleted[] onwarmupcompletedArr$values = $values();
                    $VALUES = onwarmupcompletedArr$values;
                    $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
                    int i = onNavigationEvent + 41;
                    IAuthTabCallback = i % 128;
                    if (i % 2 != 0) {
                        int i2 = 43 / 0;
                    }
                }

                private onWarmupCompleted(String str, int i) {
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class onNavigationEvent implements IAuthTabCallbackStub {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ onNavigationEvent[] $VALUES;
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;
                private static int onWarmupCompleted;
                public static final onNavigationEvent Small = new onNavigationEvent("Small", 0);
                public static final onNavigationEvent Medium = new onNavigationEvent("Medium", 1);

                private static final /* synthetic */ onNavigationEvent[] $values() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 35;
                    int i3 = i2 % 128;
                    onExtraCallback = i3;
                    int i4 = i2 % 2;
                    onNavigationEvent[] onnavigationeventArr = {Small, Medium};
                    int i5 = i3 + 101;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return onnavigationeventArr;
                }

                public static EnumEntries<onNavigationEvent> getEntries() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback;
                    int i3 = i2 + 73;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
                    int i5 = i2 + 65;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 40 / 0;
                    }
                    return enumEntries;
                }

                public static onNavigationEvent valueOf(String str) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 89;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
                    int i4 = onExtraCallback + 59;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return onnavigationevent;
                }

                public static onNavigationEvent[] values() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 7;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
                    int i4 = onExtraCallback + 15;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return onnavigationeventArr;
                }

                static {
                    onNavigationEvent[] onnavigationeventArr$values = $values();
                    $VALUES = onnavigationeventArr$values;
                    $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
                    int i = IAuthTabCallback + 95;
                    onWarmupCompleted = i % 128;
                    int i2 = i % 2;
                }

                private onNavigationEvent(String str, int i) {
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class IAuthTabCallback implements IAuthTabCallbackStub {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ IAuthTabCallback[] $VALUES;
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted = 1;
                public static final IAuthTabCallback Masking = new IAuthTabCallback("Masking", 0);
                public static final IAuthTabCallback Background = new IAuthTabCallback("Background", 1);

                private static final /* synthetic */ IAuthTabCallback[] $values() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 53;
                    int i3 = i2 % 128;
                    IAuthTabCallback = i3;
                    int i4 = i2 % 2;
                    IAuthTabCallback[] iAuthTabCallbackArr = {Masking, Background};
                    int i5 = i3 + 1;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 78 / 0;
                    }
                    return iAuthTabCallbackArr;
                }

                public static EnumEntries<IAuthTabCallback> getEntries() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 41;
                    int i3 = i2 % 128;
                    IAuthTabCallback = i3;
                    int i4 = i2 % 2;
                    EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
                    int i5 = i3 + 117;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 80 / 0;
                    }
                    return enumEntries;
                }

                public static IAuthTabCallback valueOf(String str) {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 51;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    Object obj = null;
                    IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
                    if (i3 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    int i4 = onExtraCallbackWithResult + 49;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        return iAuthTabCallback;
                    }
                    throw null;
                }

                public static IAuthTabCallback[] values() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 57;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
                    int i4 = onExtraCallbackWithResult + 67;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        return iAuthTabCallbackArr;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                private IAuthTabCallback(String str, int i) {
                }

                static {
                    IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
                    $VALUES = iAuthTabCallbackArr$values;
                    $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
                    int i = onWarmupCompleted + 31;
                    onExtraCallback = i % 128;
                    if (i % 2 != 0) {
                        int i2 = 64 / 0;
                    }
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* renamed from: o.getViewTypeCount$onExtraCallbackWithResult$IAuthTabCallbackStub$onExtraCallbackWithResult, reason: collision with other inner class name */
            public static final class EnumC0028onExtraCallbackWithResult implements IAuthTabCallbackStub {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ EnumC0028onExtraCallbackWithResult[] $VALUES;
                private static int IAuthTabCallback = 0;
                public static final EnumC0028onExtraCallbackWithResult XSmall = new EnumC0028onExtraCallbackWithResult("XSmall", 0);
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                private static final /* synthetic */ EnumC0028onExtraCallbackWithResult[] $values() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 15;
                    int i3 = i2 % 128;
                    onNavigationEvent = i3;
                    int i4 = i2 % 2;
                    EnumC0028onExtraCallbackWithResult[] enumC0028onExtraCallbackWithResultArr = {XSmall};
                    int i5 = i3 + 67;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        return enumC0028onExtraCallbackWithResultArr;
                    }
                    throw null;
                }

                public static EnumEntries<EnumC0028onExtraCallbackWithResult> getEntries() {
                    EnumEntries<EnumC0028onExtraCallbackWithResult> enumEntries;
                    int i = 2 % 2;
                    int i2 = onNavigationEvent;
                    int i3 = i2 + 111;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 == 0) {
                        enumEntries = $ENTRIES;
                        int i4 = 84 / 0;
                    } else {
                        enumEntries = $ENTRIES;
                    }
                    int i5 = i2 + 11;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        return enumEntries;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public static EnumC0028onExtraCallbackWithResult valueOf(String str) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 3;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    EnumC0028onExtraCallbackWithResult enumC0028onExtraCallbackWithResult = (EnumC0028onExtraCallbackWithResult) Enum.valueOf(EnumC0028onExtraCallbackWithResult.class, str);
                    if (i3 != 0) {
                        int i4 = 44 / 0;
                    }
                    return enumC0028onExtraCallbackWithResult;
                }

                public static EnumC0028onExtraCallbackWithResult[] values() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 19;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                    EnumC0028onExtraCallbackWithResult[] enumC0028onExtraCallbackWithResultArr = (EnumC0028onExtraCallbackWithResult[]) $VALUES.clone();
                    int i3 = onWarmupCompleted + 71;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    return enumC0028onExtraCallbackWithResultArr;
                }

                static {
                    EnumC0028onExtraCallbackWithResult[] enumC0028onExtraCallbackWithResultArr$values = $values();
                    $VALUES = enumC0028onExtraCallbackWithResultArr$values;
                    $ENTRIES = access15300.onExtraCallbackWithResult(enumC0028onExtraCallbackWithResultArr$values);
                    int i = IAuthTabCallback + 7;
                    onExtraCallbackWithResult = i % 128;
                    int i2 = i % 2;
                }

                private EnumC0028onExtraCallbackWithResult(String str, int i) {
                }
            }
        }

        public interface asBinder extends onExtraCallbackWithResult {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class onWarmupCompleted implements asBinder {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ onWarmupCompleted[] $VALUES;
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;
                private static int onWarmupCompleted;
                public static final onWarmupCompleted XSmall = new onWarmupCompleted("XSmall", 0);
                public static final onWarmupCompleted Small = new onWarmupCompleted("Small", 1);
                public static final onWarmupCompleted Medium = new onWarmupCompleted("Medium", 2);

                private static final /* synthetic */ onWarmupCompleted[] $values() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 125;
                    int i3 = i2 % 128;
                    onExtraCallback = i3;
                    int i4 = i2 % 2;
                    onWarmupCompleted[] onwarmupcompletedArr = {XSmall, Small, Medium};
                    int i5 = i3 + 71;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    return onwarmupcompletedArr;
                }

                public static EnumEntries<onWarmupCompleted> getEntries() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 123;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
                    if (i3 == 0) {
                        int i4 = 20 / 0;
                    }
                    return enumEntries;
                }

                public static onWarmupCompleted valueOf(String str) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 1;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    Object obj = null;
                    onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
                    if (i3 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    int i4 = onNavigationEvent + 73;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        return onwarmupcompleted;
                    }
                    throw null;
                }

                public static onWarmupCompleted[] values() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 109;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
                    int i4 = onExtraCallback + 87;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 67 / 0;
                    }
                    return onwarmupcompletedArr;
                }

                static {
                    onWarmupCompleted[] onwarmupcompletedArr$values = $values();
                    $VALUES = onwarmupcompletedArr$values;
                    $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
                    int i = onWarmupCompleted + 89;
                    IAuthTabCallback = i % 128;
                    int i2 = i % 2;
                }

                private onWarmupCompleted(String str, int i) {
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class IAuthTabCallback implements asBinder {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ IAuthTabCallback[] $VALUES;
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted = 1;
                public static final IAuthTabCallback XSmall = new IAuthTabCallback("XSmall", 0);
                public static final IAuthTabCallback Small = new IAuthTabCallback("Small", 1);
                public static final IAuthTabCallback Medium = new IAuthTabCallback("Medium", 2);

                private static final /* synthetic */ IAuthTabCallback[] $values() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted;
                    int i3 = i2 + 69;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    IAuthTabCallback[] iAuthTabCallbackArr = {XSmall, Small, Medium};
                    int i5 = i2 + 75;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return iAuthTabCallbackArr;
                }

                public static EnumEntries<IAuthTabCallback> getEntries() {
                    EnumEntries<IAuthTabCallback> enumEntries;
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult;
                    int i3 = i2 + 93;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 == 0) {
                        enumEntries = $ENTRIES;
                        int i4 = 73 / 0;
                    } else {
                        enumEntries = $ENTRIES;
                    }
                    int i5 = i2 + 11;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return enumEntries;
                }

                public static IAuthTabCallback valueOf(String str) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 5;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
                    if (i3 != 0) {
                        return iAuthTabCallback;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public static IAuthTabCallback[] values() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 77;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                    IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
                    int i3 = onExtraCallbackWithResult + 87;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    return iAuthTabCallbackArr;
                }

                static {
                    IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
                    $VALUES = iAuthTabCallbackArr$values;
                    $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
                    int i = onExtraCallback + 101;
                    onNavigationEvent = i % 128;
                    if (i % 2 == 0) {
                        throw null;
                    }
                }

                private IAuthTabCallback(String str, int i) {
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class onExtraCallback implements asBinder {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ onExtraCallback[] $VALUES;
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;
                public static final onExtraCallback Masking = new onExtraCallback("Masking", 0);
                public static final onExtraCallback Background = new onExtraCallback("Background", 1);

                private static final /* synthetic */ onExtraCallback[] $values() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent;
                    int i3 = i2 + 107;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    onExtraCallback[] onextracallbackArr = {Masking, Background};
                    int i5 = i2 + 33;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return onextracallbackArr;
                }

                public static EnumEntries<onExtraCallback> getEntries() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted;
                    int i3 = i2 + 33;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
                    int i5 = i2 + 89;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        return enumEntries;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public static onExtraCallback valueOf(String str) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 69;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
                    if (i3 != 0) {
                        int i4 = 43 / 0;
                    }
                    int i5 = onWarmupCompleted + 93;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    return onextracallback;
                }

                public static onExtraCallback[] values() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 11;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
                    int i4 = onWarmupCompleted + 55;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return onextracallbackArr;
                }

                private onExtraCallback(String str, int i) {
                }

                static {
                    onExtraCallback[] onextracallbackArr$values = $values();
                    $VALUES = onextracallbackArr$values;
                    $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
                    int i = onExtraCallback + 101;
                    IAuthTabCallback = i % 128;
                    if (i % 2 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class onNavigationEvent implements asBinder {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ onNavigationEvent[] $VALUES;
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;
                private static int onWarmupCompleted;
                public static final onNavigationEvent XSmall = new onNavigationEvent("XSmall", 0);
                public static final onNavigationEvent Small = new onNavigationEvent("Small", 1);
                public static final onNavigationEvent Medium = new onNavigationEvent("Medium", 2);

                private static final /* synthetic */ onNavigationEvent[] $values() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback;
                    int i3 = i2 + 87;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    onNavigationEvent[] onnavigationeventArr = {XSmall, Small, Medium};
                    int i5 = i2 + 117;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        return onnavigationeventArr;
                    }
                    throw null;
                }

                public static EnumEntries<onNavigationEvent> getEntries() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 27;
                    int i3 = i2 % 128;
                    onExtraCallback = i3;
                    int i4 = i2 % 2;
                    EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
                    int i5 = i3 + 111;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        return enumEntries;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public static onNavigationEvent valueOf(String str) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 75;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
                    int i4 = onExtraCallback + 1;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return onnavigationevent;
                }

                public static onNavigationEvent[] values() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 35;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
                    int i4 = onWarmupCompleted + 43;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        return onnavigationeventArr;
                    }
                    throw null;
                }

                static {
                    onNavigationEvent[] onnavigationeventArr$values = $values();
                    $VALUES = onnavigationeventArr$values;
                    $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
                    int i = IAuthTabCallback + 31;
                    onExtraCallbackWithResult = i % 128;
                    int i2 = i % 2;
                }

                private onNavigationEvent(String str, int i) {
                }
            }
        }

        public interface onWarmupCompleted extends onExtraCallbackWithResult {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class IAuthTabCallback implements onWarmupCompleted {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ IAuthTabCallback[] $VALUES;
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;
                public static final IAuthTabCallback XSmall = new IAuthTabCallback("XSmall", 0);
                public static final IAuthTabCallback Small = new IAuthTabCallback("Small", 1);
                public static final IAuthTabCallback Medium = new IAuthTabCallback("Medium", 2);

                private static final /* synthetic */ IAuthTabCallback[] $values() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 57;
                    int i3 = i2 % 128;
                    onWarmupCompleted = i3;
                    int i4 = i2 % 2;
                    IAuthTabCallback[] iAuthTabCallbackArr = {XSmall, Small, Medium};
                    int i5 = i3 + 111;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 88 / 0;
                    }
                    return iAuthTabCallbackArr;
                }

                public static EnumEntries<IAuthTabCallback> getEntries() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 17;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 != 0) {
                        return $ENTRIES;
                    }
                    throw null;
                }

                public static IAuthTabCallback valueOf(String str) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 61;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
                    int i4 = onExtraCallbackWithResult + 89;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 == 0) {
                        return iAuthTabCallback;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public static IAuthTabCallback[] values() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 81;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
                    int i4 = onWarmupCompleted + 9;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        return iAuthTabCallbackArr;
                    }
                    throw null;
                }

                static {
                    IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
                    $VALUES = iAuthTabCallbackArr$values;
                    $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
                    int i = IAuthTabCallback + 73;
                    onExtraCallback = i % 128;
                    int i2 = i % 2;
                }

                private IAuthTabCallback(String str, int i) {
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class onNavigationEvent implements onWarmupCompleted {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ onNavigationEvent[] $VALUES;
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;
                public static final onNavigationEvent XSmall = new onNavigationEvent("XSmall", 0);
                public static final onNavigationEvent Small = new onNavigationEvent("Small", 1);
                public static final onNavigationEvent Medium = new onNavigationEvent("Medium", 2);

                private static final /* synthetic */ onNavigationEvent[] $values() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 29;
                    int i3 = i2 % 128;
                    onWarmupCompleted = i3;
                    int i4 = i2 % 2;
                    onNavigationEvent[] onnavigationeventArr = {XSmall, Small, Medium};
                    int i5 = i3 + 21;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        return onnavigationeventArr;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public static EnumEntries<onNavigationEvent> getEntries() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult;
                    int i3 = i2 + 115;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
                    int i5 = i2 + 101;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return enumEntries;
                }

                public static onNavigationEvent valueOf(String str) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 35;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
                    int i4 = onExtraCallbackWithResult + 43;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return onnavigationevent;
                }

                public static onNavigationEvent[] values() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 9;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
                    int i4 = onWarmupCompleted + 87;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        return onnavigationeventArr;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                static {
                    onNavigationEvent[] onnavigationeventArr$values = $values();
                    $VALUES = onnavigationeventArr$values;
                    $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
                    int i = IAuthTabCallback + 1;
                    onNavigationEvent = i % 128;
                    if (i % 2 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                private onNavigationEvent(String str, int i) {
                }
            }

            public static final class onExtraCallback implements onWarmupCompleted {
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;
                public static final onExtraCallback onExtraCallbackWithResult = new onExtraCallback();
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                static {
                    int i = onWarmupCompleted + 87;
                    onExtraCallback = i % 128;
                    if (i % 2 == 0) {
                        throw null;
                    }
                }

                public boolean equals(@Nullable Object obj) {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback;
                    int i3 = i2 + 113;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    if (this != obj) {
                        if (obj instanceof onExtraCallback) {
                            return true;
                        }
                        int i5 = i2 + 99;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        return false;
                    }
                    int i7 = i2 + 49;
                    onNavigationEvent = i7 % 128;
                    boolean z = !(i7 % 2 == 0);
                    int i8 = i2 + 73;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 != 0) {
                        return z;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }

                public int hashCode() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback;
                    int i3 = i2 + 45;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = i2 + 33;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    return -325983618;
                }

                public String toString() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 83;
                    int i3 = i2 % 128;
                    IAuthTabCallback = i3;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    int i4 = i3 + 93;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return "Original";
                }

                private onExtraCallback() {
                }
            }

            /* renamed from: o.getViewTypeCount$onExtraCallbackWithResult$onWarmupCompleted$onExtraCallbackWithResult, reason: collision with other inner class name */
            public static final class C0034onExtraCallbackWithResult implements onWarmupCompleted {
                private static int IAuthTabCallback = 1;
                public static final C0034onExtraCallbackWithResult onExtraCallback = new C0034onExtraCallbackWithResult();
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;
                private static int onWarmupCompleted;

                static {
                    int i = onWarmupCompleted + 67;
                    onExtraCallbackWithResult = i % 128;
                    if (i % 2 == 0) {
                        throw null;
                    }
                }

                public boolean equals(@Nullable Object obj) {
                    int i = 2 % 2;
                    if (this == obj || (obj instanceof C0034onExtraCallbackWithResult)) {
                        return true;
                    }
                    int i2 = IAuthTabCallback + 33;
                    int i3 = i2 % 128;
                    onNavigationEvent = i3;
                    int i4 = i2 % 2;
                    int i5 = i3 + 115;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        return false;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }

                public int hashCode() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback;
                    int i3 = i2 + 105;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 != 0) {
                        throw null;
                    }
                    int i4 = i2 + 113;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return -1665901379;
                }

                public String toString() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback;
                    int i3 = i2 + 113;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = i2 + 13;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        return "Circle";
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                private C0034onExtraCallbackWithResult() {
                }
            }
        }

        public interface onExtraCallback extends onExtraCallbackWithResult {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class IAuthTabCallback implements onExtraCallback {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ IAuthTabCallback[] $VALUES;
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted = 1;
                public static final IAuthTabCallback XSmall = new IAuthTabCallback("XSmall", 0);
                public static final IAuthTabCallback Small = new IAuthTabCallback("Small", 1);
                public static final IAuthTabCallback Medium = new IAuthTabCallback("Medium", 2);

                private static final /* synthetic */ IAuthTabCallback[] $values() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback;
                    int i3 = i2 + 15;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    IAuthTabCallback[] iAuthTabCallbackArr = {XSmall, Small, Medium};
                    int i5 = i2 + 43;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 41 / 0;
                    }
                    return iAuthTabCallbackArr;
                }

                public static EnumEntries<IAuthTabCallback> getEntries() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent;
                    int i3 = i2 + 1;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
                    int i5 = i2 + 59;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return enumEntries;
                }

                public static IAuthTabCallback valueOf(String str) {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 111;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
                    int i4 = IAuthTabCallback + 43;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        return iAuthTabCallback;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public static IAuthTabCallback[] values() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 49;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
                    int i4 = onNavigationEvent + 33;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 2 / 0;
                    }
                    return iAuthTabCallbackArr;
                }

                static {
                    IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
                    $VALUES = iAuthTabCallbackArr$values;
                    $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
                    int i = onExtraCallbackWithResult + 63;
                    onWarmupCompleted = i % 128;
                    int i2 = i % 2;
                }

                private IAuthTabCallback(String str, int i) {
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* renamed from: o.getViewTypeCount$onExtraCallbackWithResult$onExtraCallback$onExtraCallbackWithResult, reason: collision with other inner class name */
            public static final class EnumC0030onExtraCallbackWithResult implements onExtraCallback {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ EnumC0030onExtraCallbackWithResult[] $VALUES;
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;
                public static final EnumC0030onExtraCallbackWithResult XSmall = new EnumC0030onExtraCallbackWithResult("XSmall", 0);
                public static final EnumC0030onExtraCallbackWithResult Small = new EnumC0030onExtraCallbackWithResult("Small", 1);
                public static final EnumC0030onExtraCallbackWithResult Medium = new EnumC0030onExtraCallbackWithResult("Medium", 2);

                private static final /* synthetic */ EnumC0030onExtraCallbackWithResult[] $values() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent;
                    int i3 = i2 + 3;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    EnumC0030onExtraCallbackWithResult[] enumC0030onExtraCallbackWithResultArr = {XSmall, Small, Medium};
                    int i5 = i2 + 3;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return enumC0030onExtraCallbackWithResultArr;
                }

                public static EnumEntries<EnumC0030onExtraCallbackWithResult> getEntries() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent;
                    int i3 = i2 + 47;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    EnumEntries<EnumC0030onExtraCallbackWithResult> enumEntries = $ENTRIES;
                    int i5 = i2 + 17;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 97 / 0;
                    }
                    return enumEntries;
                }

                public static EnumC0030onExtraCallbackWithResult valueOf(String str) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 117;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    EnumC0030onExtraCallbackWithResult enumC0030onExtraCallbackWithResult = (EnumC0030onExtraCallbackWithResult) Enum.valueOf(EnumC0030onExtraCallbackWithResult.class, str);
                    if (i3 != 0) {
                        return enumC0030onExtraCallbackWithResult;
                    }
                    throw null;
                }

                public static EnumC0030onExtraCallbackWithResult[] values() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 31;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    EnumC0030onExtraCallbackWithResult[] enumC0030onExtraCallbackWithResultArr = (EnumC0030onExtraCallbackWithResult[]) $VALUES.clone();
                    int i4 = IAuthTabCallback + 9;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return enumC0030onExtraCallbackWithResultArr;
                }

                static {
                    EnumC0030onExtraCallbackWithResult[] enumC0030onExtraCallbackWithResultArr$values = $values();
                    $VALUES = enumC0030onExtraCallbackWithResultArr$values;
                    $ENTRIES = access15300.onExtraCallbackWithResult(enumC0030onExtraCallbackWithResultArr$values);
                    int i = onWarmupCompleted + 63;
                    onExtraCallback = i % 128;
                    if (i % 2 != 0) {
                        throw null;
                    }
                }

                private EnumC0030onExtraCallbackWithResult(String str, int i) {
                }
            }

            /* renamed from: o.getViewTypeCount$onExtraCallbackWithResult$onExtraCallback$onExtraCallback, reason: collision with other inner class name */
            public static final class C0029onExtraCallback implements onExtraCallback {
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;
                public static final C0029onExtraCallback onWarmupCompleted = new C0029onExtraCallback();

                static {
                    int i = onNavigationEvent + 15;
                    onExtraCallback = i % 128;
                    if (i % 2 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public boolean equals(@Nullable Object obj) {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 29;
                    int i3 = i2 % 128;
                    onExtraCallbackWithResult = i3;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                    if (this == obj || (obj instanceof C0029onExtraCallback)) {
                        return true;
                    }
                    int i4 = i3 + 21;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }

                public int hashCode() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 11;
                    int i3 = i2 % 128;
                    onExtraCallbackWithResult = i3;
                    int i4 = i2 % 2;
                    int i5 = i3 + 41;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return -2122934977;
                }

                public String toString() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 117;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 != 0) {
                        return "Original";
                    }
                    throw null;
                }

                private C0029onExtraCallback() {
                }
            }

            public static final class onNavigationEvent implements onExtraCallback {
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 0;
                public static final onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted = 1;

                static {
                    int i = onWarmupCompleted + 57;
                    onExtraCallback = i % 128;
                    int i2 = i % 2;
                }

                public boolean equals(@Nullable Object obj) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent;
                    int i3 = i2 + 11;
                    int i4 = i3 % 128;
                    IAuthTabCallback = i4;
                    int i5 = i3 % 2;
                    if (this == obj) {
                        int i6 = i2 + 87;
                        IAuthTabCallback = i6 % 128;
                        int i7 = i6 % 2;
                        return true;
                    }
                    if (!(obj instanceof onNavigationEvent)) {
                        return false;
                    }
                    int i8 = i4 + 45;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 != 0) {
                        return true;
                    }
                    throw null;
                }

                public int hashCode() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 107;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        return 821611454;
                    }
                    int i3 = 60 / 0;
                    return 821611454;
                }

                public String toString() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback;
                    int i3 = i2 + 7;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = i2 + 69;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    return "Circle";
                }

                private onNavigationEvent() {
                }
            }
        }

        /* renamed from: o.getViewTypeCount$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        public interface InterfaceC0031onExtraCallbackWithResult extends onExtraCallbackWithResult {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* renamed from: o.getViewTypeCount$onExtraCallbackWithResult$onExtraCallbackWithResult$onWarmupCompleted */
            public static final class onWarmupCompleted implements InterfaceC0031onExtraCallbackWithResult {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ onWarmupCompleted[] $VALUES;
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted = 1;
                public static final onWarmupCompleted XSmall = new onWarmupCompleted("XSmall", 0);
                public static final onWarmupCompleted Small = new onWarmupCompleted("Small", 1);
                public static final onWarmupCompleted Medium = new onWarmupCompleted("Medium", 2);

                private static final /* synthetic */ onWarmupCompleted[] $values() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 19;
                    int i3 = i2 % 128;
                    onNavigationEvent = i3;
                    int i4 = i2 % 2;
                    onWarmupCompleted[] onwarmupcompletedArr = {XSmall, Small, Medium};
                    int i5 = i3 + 95;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return onwarmupcompletedArr;
                }

                public static EnumEntries<onWarmupCompleted> getEntries() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent;
                    int i3 = i2 + 111;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        throw null;
                    }
                    EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
                    int i4 = i2 + 73;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return enumEntries;
                }

                public static onWarmupCompleted valueOf(String str) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 11;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
                    if (i3 == 0) {
                        throw null;
                    }
                    int i4 = onExtraCallback + 27;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return onwarmupcompleted;
                }

                public static onWarmupCompleted[] values() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 109;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
                    int i4 = onNavigationEvent + 41;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        return onwarmupcompletedArr;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                static {
                    onWarmupCompleted[] onwarmupcompletedArr$values = $values();
                    $VALUES = onwarmupcompletedArr$values;
                    $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
                    int i = onWarmupCompleted + 49;
                    onExtraCallbackWithResult = i % 128;
                    if (i % 2 != 0) {
                        throw null;
                    }
                }

                private onWarmupCompleted(String str, int i) {
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* renamed from: o.getViewTypeCount$onExtraCallbackWithResult$onExtraCallbackWithResult$IAuthTabCallback */
            public static final class IAuthTabCallback implements InterfaceC0031onExtraCallbackWithResult {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ IAuthTabCallback[] $VALUES;
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted = 1;
                public static final IAuthTabCallback XSmall = new IAuthTabCallback("XSmall", 0);
                public static final IAuthTabCallback Small = new IAuthTabCallback("Small", 1);
                public static final IAuthTabCallback Medium = new IAuthTabCallback("Medium", 2);

                private static final /* synthetic */ IAuthTabCallback[] $values() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 87;
                    int i3 = i2 % 128;
                    onExtraCallback = i3;
                    int i4 = i2 % 2;
                    IAuthTabCallback[] iAuthTabCallbackArr = {XSmall, Small, Medium};
                    int i5 = i3 + 41;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        return iAuthTabCallbackArr;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public static EnumEntries<IAuthTabCallback> getEntries() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 75;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        return $ENTRIES;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public static IAuthTabCallback valueOf(String str) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 33;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
                    int i4 = onWarmupCompleted + 95;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 71 / 0;
                    }
                    return iAuthTabCallback;
                }

                public static IAuthTabCallback[] values() {
                    IAuthTabCallback[] iAuthTabCallbackArr;
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 37;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 == 0) {
                        iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
                        int i3 = 53 / 0;
                    } else {
                        iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
                    }
                    int i4 = onWarmupCompleted + 75;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        return iAuthTabCallbackArr;
                    }
                    throw null;
                }

                static {
                    IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
                    $VALUES = iAuthTabCallbackArr$values;
                    $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
                    int i = onNavigationEvent + 35;
                    IAuthTabCallback = i % 128;
                    int i2 = i % 2;
                }

                private IAuthTabCallback(String str, int i) {
                }
            }

            /* renamed from: o.getViewTypeCount$onExtraCallbackWithResult$onExtraCallbackWithResult$onNavigationEvent */
            public static final class onNavigationEvent implements InterfaceC0031onExtraCallbackWithResult {
                private static int IAuthTabCallback = 0;
                public static final onNavigationEvent onExtraCallback = new onNavigationEvent();
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                static {
                    int i = onWarmupCompleted + 63;
                    onNavigationEvent = i % 128;
                    int i2 = i % 2;
                }

                public boolean equals(@Nullable Object obj) {
                    int i = 2 % 2;
                    if (this == obj) {
                        int i2 = onExtraCallbackWithResult + 105;
                        IAuthTabCallback = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i3 = 31 / 0;
                        }
                        return true;
                    }
                    if (obj instanceof onNavigationEvent) {
                        return true;
                    }
                    int i4 = onExtraCallbackWithResult + 9;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }

                public int hashCode() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback;
                    int i3 = i2 + 107;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 77 / 0;
                    }
                    int i5 = i2 + 21;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return -1675914405;
                }

                public String toString() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 21;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 != 0) {
                        return "Original";
                    }
                    int i3 = 50 / 0;
                    return "Original";
                }

                private onNavigationEvent() {
                }
            }

            /* renamed from: o.getViewTypeCount$onExtraCallbackWithResult$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
            public static final class C0032onExtraCallbackWithResult implements InterfaceC0031onExtraCallbackWithResult {
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;
                public static final C0032onExtraCallbackWithResult onWarmupCompleted = new C0032onExtraCallbackWithResult();

                static {
                    int i = onNavigationEvent + 103;
                    IAuthTabCallback = i % 128;
                    int i2 = i % 2;
                }

                /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
                
                    if ((!(r6 instanceof o.getViewTypeCount.onExtraCallbackWithResult.InterfaceC0031onExtraCallbackWithResult.C0032onExtraCallbackWithResult)) == true) goto L12;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
                
                    return true;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
                
                    r2 = r2 + 107;
                    o.getViewTypeCount.onExtraCallbackWithResult.InterfaceC0031onExtraCallbackWithResult.C0032onExtraCallbackWithResult.onExtraCallback = r2 % 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
                
                    if ((r2 % 2) == 0) goto L15;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
                
                    return true;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
                
                    return false;
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
                    int i2 = onExtraCallback + 29;
                    int i3 = i2 % 128;
                    onExtraCallbackWithResult = i3;
                    if (i2 % 2 == 0) {
                        int i4 = 15 / 0;
                    }
                }

                public int hashCode() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 101;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        return -2122433241;
                    }
                    throw null;
                }

                public String toString() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 95;
                    int i3 = i2 % 128;
                    onExtraCallback = i3;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    int i4 = i3 + 79;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return "Square";
                }

                private C0032onExtraCallbackWithResult() {
                }
            }

            /* renamed from: o.getViewTypeCount$onExtraCallbackWithResult$onExtraCallbackWithResult$onExtraCallback */
            public static final class onExtraCallback implements InterfaceC0031onExtraCallbackWithResult {
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;
                private static int onNavigationEvent;
                public static final onExtraCallback onWarmupCompleted = new onExtraCallback();

                static {
                    int i = IAuthTabCallback + 125;
                    onNavigationEvent = i % 128;
                    int i2 = i % 2;
                }

                public boolean equals(@Nullable Object obj) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 41;
                    int i3 = i2 % 128;
                    onExtraCallback = i3;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                    if (this == obj || (obj instanceof onExtraCallback)) {
                        return true;
                    }
                    int i4 = i3 + 93;
                    onExtraCallbackWithResult = i4 % 128;
                    return i4 % 2 != 0;
                }

                public int hashCode() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 121;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        return 1706991834;
                    }
                    int i3 = 18 / 0;
                    return 1706991834;
                }

                public String toString() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult;
                    int i3 = i2 + 59;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = i2 + 59;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return "Circle";
                }

                private onExtraCallback() {
                }
            }
        }

        public interface asInterface extends onExtraCallbackWithResult {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class IAuthTabCallback implements asInterface {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ IAuthTabCallback[] $VALUES;
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;
                public static final IAuthTabCallback XSmall = new IAuthTabCallback("XSmall", 0);
                public static final IAuthTabCallback Small = new IAuthTabCallback("Small", 1);
                public static final IAuthTabCallback Medium = new IAuthTabCallback("Medium", 2);

                private static final /* synthetic */ IAuthTabCallback[] $values() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 63;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    IAuthTabCallback iAuthTabCallback = XSmall;
                    if (i3 == 0) {
                        return new IAuthTabCallback[]{iAuthTabCallback, Small, Medium};
                    }
                    IAuthTabCallback iAuthTabCallback2 = Small;
                    IAuthTabCallback iAuthTabCallback3 = Medium;
                    IAuthTabCallback[] iAuthTabCallbackArr = new IAuthTabCallback[5];
                    iAuthTabCallbackArr[0] = iAuthTabCallback;
                    iAuthTabCallbackArr[1] = iAuthTabCallback2;
                    iAuthTabCallbackArr[4] = iAuthTabCallback3;
                    return iAuthTabCallbackArr;
                }

                public static EnumEntries<IAuthTabCallback> getEntries() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 49;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 != 0) {
                        return $ENTRIES;
                    }
                    throw null;
                }

                public static IAuthTabCallback valueOf(String str) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 71;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
                    int i4 = onNavigationEvent + 5;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 8 / 0;
                    }
                    return iAuthTabCallback;
                }

                public static IAuthTabCallback[] values() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 123;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
                    int i3 = onNavigationEvent + 115;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    return iAuthTabCallbackArr;
                }

                static {
                    IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
                    $VALUES = iAuthTabCallbackArr$values;
                    $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
                    int i = IAuthTabCallback + 69;
                    onExtraCallbackWithResult = i % 128;
                    int i2 = i % 2;
                }

                private IAuthTabCallback(String str, int i) {
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class onNavigationEvent implements asInterface {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ onNavigationEvent[] $VALUES;
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;
                public static final onNavigationEvent XSmall = new onNavigationEvent("XSmall", 0);
                public static final onNavigationEvent Small = new onNavigationEvent("Small", 1);
                public static final onNavigationEvent Medium = new onNavigationEvent("Medium", 2);

                private static final /* synthetic */ onNavigationEvent[] $values() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent;
                    int i3 = i2 + 41;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    onNavigationEvent[] onnavigationeventArr = {XSmall, Small, Medium};
                    int i5 = i2 + 67;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return onnavigationeventArr;
                }

                public static EnumEntries<onNavigationEvent> getEntries() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 125;
                    int i3 = i2 % 128;
                    onExtraCallbackWithResult = i3;
                    int i4 = i2 % 2;
                    EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
                    int i5 = i3 + 61;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        return enumEntries;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public static onNavigationEvent valueOf(String str) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 49;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
                    int i4 = onExtraCallbackWithResult + 89;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 75 / 0;
                    }
                    return onnavigationevent;
                }

                public static onNavigationEvent[] values() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 19;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
                    int i4 = onNavigationEvent + 109;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return onnavigationeventArr;
                }

                static {
                    onNavigationEvent[] onnavigationeventArr$values = $values();
                    $VALUES = onnavigationeventArr$values;
                    $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
                    int i = onWarmupCompleted + 63;
                    onExtraCallback = i % 128;
                    if (i % 2 != 0) {
                        throw null;
                    }
                }

                private onNavigationEvent(String str, int i) {
                }
            }
        }
    }

    public static final class IAuthTabCallback {
        public static final onExtraCallback Companion = new onExtraCallback(null);
        private static int IAuthTabCallbackStub = 0;
        private static int asInterface = 1;
        private static int getInterfaceDescriptor = 1;
        private static final IAuthTabCallback onExtraCallback;
        private static final IAuthTabCallback onExtraCallbackWithResult;
        private static final IAuthTabCallback onNavigationEvent;
        private static int onTransact;
        private static final IAuthTabCallback onWarmupCompleted;
        private final onNavigationEvent IAuthTabCallback;
        private final float IAuthTabCallbackDefault;
        private final float asBinder;

        public /* synthetic */ IAuthTabCallback(onNavigationEvent onnavigationevent, float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
            this(onnavigationevent, f, f2);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onTransact + 103;
                getInterfaceDescriptor = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                return false;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            if (this.IAuthTabCallback != iAuthTabCallback.IAuthTabCallback) {
                int i4 = onTransact + 113;
                getInterfaceDescriptor = i4 % 128;
                if (i4 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.IAuthTabCallbackDefault, iAuthTabCallback.IAuthTabCallbackDefault)) {
                return VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.asBinder, iAuthTabCallback.asBinder);
            }
            int i5 = getInterfaceDescriptor + 65;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 115;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((this.IAuthTabCallback.hashCode() * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.IAuthTabCallbackDefault)) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.asBinder);
            int i4 = onTransact + 125;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Arrow(direction=" + this.IAuthTabCallback + ", margin=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.IAuthTabCallbackDefault) + ", size=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.asBinder) + ")";
            int i2 = getInterfaceDescriptor + 7;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        private IAuthTabCallback(onNavigationEvent onnavigationevent, float f, float f2) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            this.IAuthTabCallback = onnavigationevent;
            this.IAuthTabCallbackDefault = f;
            this.asBinder = f2;
        }

        public static final /* synthetic */ IAuthTabCallback IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onTransact + 103;
            int i3 = i2 % 128;
            getInterfaceDescriptor = i3;
            int i4 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = onWarmupCompleted;
            int i5 = i3 + 81;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 26 / 0;
            }
            return iAuthTabCallback;
        }

        public static final /* synthetic */ IAuthTabCallback onExtraCallback() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 109;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = onExtraCallbackWithResult;
            if (i3 != 0) {
                int i4 = 23 / 0;
            }
            return iAuthTabCallback;
        }

        public static final /* synthetic */ IAuthTabCallback onExtraCallbackWithResult() {
            IAuthTabCallback iAuthTabCallback;
            int i = 2 % 2;
            int i2 = onTransact + 121;
            int i3 = i2 % 128;
            getInterfaceDescriptor = i3;
            if (i2 % 2 == 0) {
                iAuthTabCallback = onNavigationEvent;
                int i4 = 67 / 0;
            } else {
                iAuthTabCallback = onNavigationEvent;
            }
            int i5 = i3 + 47;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                return iAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ IAuthTabCallback onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor;
            int i3 = i2 + 51;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback iAuthTabCallback = onExtraCallback;
            int i5 = i2 + 51;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallback;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ IAuthTabCallback(onNavigationEvent onnavigationevent, float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 4) != 0) {
                int i2 = onTransact + 5;
                getInterfaceDescriptor = i2 % 128;
                int i3 = i2 % 2;
                f2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
                int i4 = onTransact + 117;
                getInterfaceDescriptor = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            }
            this(onnavigationevent, f, f2, null);
        }

        public final onNavigationEvent onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onTransact + 109;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = this.IAuthTabCallback;
            if (i3 == 0) {
                int i4 = 62 / 0;
            }
            return onnavigationevent;
        }

        public final float IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onTransact + 33;
            int i3 = i2 % 128;
            getInterfaceDescriptor = i3;
            int i4 = i2 % 2;
            float f = this.IAuthTabCallbackDefault;
            int i5 = i3 + 21;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public final float asInterface() {
            float f;
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor;
            int i3 = i2 + 3;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                f = this.asBinder;
                int i4 = 44 / 0;
            } else {
                f = this.asBinder;
            }
            int i5 = i2 + 121;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                return f;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class onNavigationEvent {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ onNavigationEvent[] $VALUES;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted = 1;
            public static final onNavigationEvent Up = new onNavigationEvent("Up", 0);
            public static final onNavigationEvent Right = new onNavigationEvent("Right", 1);
            public static final onNavigationEvent Down = new onNavigationEvent("Down", 2);

            private static final /* synthetic */ onNavigationEvent[] $values() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 79;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                onNavigationEvent[] onnavigationeventArr = {Up, Right, Down};
                int i5 = i3 + 99;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationeventArr;
            }

            public static EnumEntries<onNavigationEvent> getEntries() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 117;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
                int i5 = i3 + 113;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return enumEntries;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static onNavigationEvent valueOf(String str) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 109;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object obj = null;
                onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
                if (i3 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i4 = onNavigationEvent + 55;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return onnavigationevent;
                }
                throw null;
            }

            public static onNavigationEvent[] values() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 119;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                onNavigationEvent[] onnavigationeventArr = $VALUES;
                if (i3 != 0) {
                    return (onNavigationEvent[]) onnavigationeventArr.clone();
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private onNavigationEvent(String str, int i) {
            }

            static {
                onNavigationEvent[] onnavigationeventArr$values = $values();
                $VALUES = onnavigationeventArr$values;
                $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
                int i = onExtraCallbackWithResult + 27;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }
        }

        public static final class onExtraCallback {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onExtraCallback() {
            }

            public final IAuthTabCallback onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 67;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback IAuthTabCallback2 = IAuthTabCallback.IAuthTabCallback();
                if (i3 == 0) {
                    int i4 = 37 / 0;
                }
                return IAuthTabCallback2;
            }

            public final IAuthTabCallback onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 93;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = IAuthTabCallback.onWarmupCompleted();
                int i4 = IAuthTabCallback + 43;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return iAuthTabCallbackOnWarmupCompleted;
            }

            public final IAuthTabCallback IAuthTabCallback(float f) {
                int i = 2 % 2;
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(onNavigationEvent.Right, f, 0.0f, 4, null);
                int i2 = onExtraCallbackWithResult + 63;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return iAuthTabCallback;
            }

            public final IAuthTabCallback onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 63;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return IAuthTabCallback.onExtraCallbackWithResult();
                }
                IAuthTabCallback.onExtraCallbackWithResult();
                throw null;
            }

            public final IAuthTabCallback IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 1;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback iAuthTabCallbackOnExtraCallback = IAuthTabCallback.onExtraCallback();
                int i4 = IAuthTabCallback + 73;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 1 / 0;
                }
                return iAuthTabCallbackOnExtraCallback;
            }
        }

        static {
            onNavigationEvent onnavigationevent = onNavigationEvent.Up;
            w3a w3aVar = w3a.onWarmupCompleted;
            float f = 0.0f;
            int i = 4;
            DefaultConstructorMarker defaultConstructorMarker = null;
            onWarmupCompleted = new IAuthTabCallback(onnavigationevent, w3aVar.onExtraCallbackWithResult(), f, i, defaultConstructorMarker);
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(onNavigationEvent.Right, w3aVar.onExtraCallbackWithResult(), 0.0f, 4, null);
            onExtraCallback = iAuthTabCallback;
            onNavigationEvent = new IAuthTabCallback(onNavigationEvent.Down, w3aVar.onExtraCallbackWithResult(), f, i, defaultConstructorMarker);
            onExtraCallbackWithResult = iAuthTabCallback;
            int i2 = IAuthTabCallbackStub + 47;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 18 / 0;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class asBinder implements onPostbackSuccess {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ asBinder[] $VALUES;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        public static final asBinder Left = new asBinder("Left", 0);
        public static final asBinder Center = new asBinder("Center", 1);
        public static final asBinder Right = new asBinder("Right", 2);

        private static final /* synthetic */ asBinder[] $values() {
            asBinder[] asbinderArr;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 != 0) {
                asBinder asbinder = Left;
                asBinder asbinder2 = Center;
                asBinder asbinder3 = Right;
                asbinderArr = new asBinder[4];
                asbinderArr[1] = asbinder;
                asbinderArr[1] = asbinder2;
                asbinderArr[2] = asbinder3;
            } else {
                asbinderArr = new asBinder[]{Left, Center, Right};
            }
            int i4 = i3 + 51;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return asbinderArr;
        }

        public static EnumEntries<asBinder> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 109;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<asBinder> enumEntries = $ENTRIES;
            int i5 = i2 + 15;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 37 / 0;
            }
            return enumEntries;
        }

        public static asBinder valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            asBinder asbinder = (asBinder) Enum.valueOf(asBinder.class, str);
            int i4 = onWarmupCompleted + 93;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return asbinder;
        }

        public static asBinder[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            asBinder[] asbinderArr = (asBinder[]) $VALUES.clone();
            int i4 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 79 / 0;
            }
            return asbinderArr;
        }

        private asBinder(String str, int i) {
        }

        static {
            asBinder[] asbinderArr$values = $values();
            $VALUES = asbinderArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(asbinderArr$values);
            int i = onExtraCallback + 49;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }
}
