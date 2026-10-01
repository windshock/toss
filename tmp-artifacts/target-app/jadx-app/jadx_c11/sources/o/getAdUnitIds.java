package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface getAdUnitIds {
    public static final onWarmupCompleted Companion = onWarmupCompleted.onWarmupCompleted;

    public interface IAuthTabCallback {
        getAdUnitIds ReportDrawnCompositionExternalSyntheticLambda1();
    }

    void onEvent(@NotNull onExtraCallbackWithResult onextracallbackwithresult);

    onExtraCallback onExtraCallbackWithResult();

    JsonReaderUnknownNumberParsing<onExtraCallback> onWarmupCompleted();

    public interface onExtraCallback {

        public static final class onNavigationEvent implements onExtraCallback {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;
            public static final onNavigationEvent onWarmupCompleted = new onNavigationEvent();

            static {
                int i = IAuthTabCallback + 7;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
            }

            private onNavigationEvent() {
            }
        }

        /* renamed from: o.getAdUnitIds$onExtraCallback$onExtraCallback, reason: collision with other inner class name */
        public static final class C0014onExtraCallback implements onExtraCallback {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            public static final C0014onExtraCallback onExtraCallbackWithResult = new C0014onExtraCallback();

            static {
                int i = onExtraCallback + 19;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
            }

            private C0014onExtraCallback() {
            }
        }

        public static final class onWarmupCompleted implements onExtraCallback {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;
            private final setMediationProvider onExtraCallbackWithResult;

            /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
            
                if ((r5 instanceof o.getAdUnitIds.onExtraCallback.onWarmupCompleted) != false) goto L12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.areEqual(r4.onExtraCallbackWithResult, ((o.getAdUnitIds.onExtraCallback.onWarmupCompleted) r5).onExtraCallbackWithResult) == false) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
            
                r5 = o.getAdUnitIds.onExtraCallback.onWarmupCompleted.IAuthTabCallback + 71;
                o.getAdUnitIds.onExtraCallback.onWarmupCompleted.onNavigationEvent = r5 % 128;
                r5 = r5 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
            
                if (r4 == r5) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
            
                if (r4 == r5) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
            
                return true;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 69;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 18 / 0;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
            
                return 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
            
                return r1.hashCode();
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
            
                if (r1 == null) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
            
                if (r1 == null) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
            
                r2 = r2 + 25;
                o.getAdUnitIds.onExtraCallback.onWarmupCompleted.onNavigationEvent = r2 % 128;
                r2 = r2 % 2;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public int hashCode() {
                setMediationProvider setmediationprovider;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 93;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                if (i2 % 2 != 0) {
                    setmediationprovider = this.onExtraCallbackWithResult;
                    int i4 = 18 / 0;
                } else {
                    setmediationprovider = this.onExtraCallbackWithResult;
                }
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Force(checkVersionResult=" + this.onExtraCallbackWithResult + ")";
                int i2 = onNavigationEvent + 7;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public onWarmupCompleted(@Nullable setMediationProvider setmediationprovider) {
                this.onExtraCallbackWithResult = setmediationprovider;
            }

            public final setMediationProvider IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 11;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                setMediationProvider setmediationprovider = this.onExtraCallbackWithResult;
                int i4 = i2 + 119;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 9 / 0;
                }
                return setmediationprovider;
            }
        }
    }

    public interface onExtraCallbackWithResult {

        public static final class onNavigationEvent implements onExtraCallbackWithResult {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            public static final onNavigationEvent onNavigationEvent = new onNavigationEvent();

            static {
                int i = IAuthTabCallback + 47;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private onNavigationEvent() {
            }
        }

        public static final class IAuthTabCallback implements onExtraCallbackWithResult {
            public static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback();
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            static {
                int i = onNavigationEvent + 77;
                onWarmupCompleted = i % 128;
                if (i % 2 != 0) {
                    int i2 = 36 / 0;
                }
            }

            private IAuthTabCallback() {
            }
        }

        public static final class onWarmupCompleted implements onExtraCallbackWithResult {
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;
            private final setMediationProvider IAuthTabCallback;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = onNavigationEvent + 101;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 == 0) {
                        return true;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (!(obj instanceof onWarmupCompleted)) {
                    int i3 = onWarmupCompleted + 21;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    return false;
                }
                if (!(!Intrinsics.areEqual(this.IAuthTabCallback, ((onWarmupCompleted) obj).IAuthTabCallback))) {
                    return true;
                }
                int i5 = onWarmupCompleted + 27;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                setMediationProvider setmediationprovider = this.IAuthTabCallback;
                if (setmediationprovider != null) {
                    return setmediationprovider.hashCode();
                }
                int i2 = onWarmupCompleted + 75;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 103;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 43 / 0;
                }
                return 0;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "OnForce(checkVersionResult=" + this.IAuthTabCallback + ")";
                int i2 = onWarmupCompleted + 39;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public onWarmupCompleted(@Nullable setMediationProvider setmediationprovider) {
                this.IAuthTabCallback = setmediationprovider;
            }

            public final setMediationProvider onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 111;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                setMediationProvider setmediationprovider = this.IAuthTabCallback;
                int i5 = i2 + 35;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return setmediationprovider;
                }
                throw null;
            }
        }
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        static final /* synthetic */ onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

        static {
            int i = onExtraCallbackWithResult + 5;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        private onWarmupCompleted() {
        }

        public final getAdUnitIds onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Response response = Response.onNavigationEvent;
            UserChoiceBillingListener userChoiceBillingListener = UserChoiceBillingListener.onExtraCallback;
            if (i3 == 0) {
                return ((IAuthTabCallback) Response.onExtraCallback(userChoiceBillingListener.onExtraCallback(), IAuthTabCallback.class)).ReportDrawnCompositionExternalSyntheticLambda1();
            }
            ((IAuthTabCallback) Response.onExtraCallback(userChoiceBillingListener.onExtraCallback(), IAuthTabCallback.class)).ReportDrawnCompositionExternalSyntheticLambda1();
            throw null;
        }
    }
}
