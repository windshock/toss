package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class n1a {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static int IAuthTabCallback = 1;
    private static long onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        IAuthTabCallbackDefault();
        Companion = new IAuthTabCallback(null);
        int i = onNavigationEvent + 9;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ n1a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract n5 IAuthTabCallback();

    public abstract setAdViewTracker onExtraCallback();

    public abstract String onExtraCallbackWithResult();

    public abstract String onNavigationEvent();

    public abstract String onWarmupCompleted();

    private n1a() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Bundle onTransact() throws Throwable {
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        bundle.putString("eventName", onExtraCallbackWithResult());
        Object[] objArr = new Object[1];
        a(new char[]{57277, 14983, 5591, 28681}, 58679 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
        bundle.putString(((String) objArr[0]).intern(), onExtraCallback().getValue());
        bundle.putString("sharedBundleName", onWarmupCompleted());
        bundle.putString("serviceBundleName", onNavigationEvent());
        bundle.putString("tabState", IAuthTabCallback().IAuthTabCallbackDefault().name());
        bundle.putString("fragmentState", IAuthTabCallback().onExtraCallback().name());
        bundle.putString("sharedBundleState", IAuthTabCallback().IAuthTabCallback().name());
        bundle.putBoolean("reactHostStarted", IAuthTabCallback().onNavigationEvent());
        bundle.putBoolean("serviceBundleLoaded", IAuthTabCallback().onExtraCallbackWithResult());
        bundle.putString("entryRequestState", IAuthTabCallback().onWarmupCompleted().name());
        if (this instanceof onExtraCallbackWithResult) {
            int i2 = onWarmupCompleted + 93;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) this;
            bundle.putString("sharedBundleSource", onextracallbackwithresult.asBinder().name());
            String strIAuthTabCallbackStub = onextracallbackwithresult.IAuthTabCallbackStub();
            if (strIAuthTabCallbackStub != null) {
                bundle.putString("sharedBundleDeploymentId", strIAuthTabCallbackStub);
                int i4 = onWarmupCompleted + 29;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return bundle;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } else {
            if (!(this instanceof onNavigationEvent)) {
                throw new NoWhenBranchMatchedException();
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) this;
            Object[] objArr2 = new Object[1];
            a(new char[]{57275, 30177, 35634, 8541, 30354, 35878}, KeyEvent.keyCodeFromString("") + 43597, objArr2);
            bundle.putString(((String) objArr2[0]).intern(), onnavigationevent.IAuthTabCallbackStub().name());
            String strAsBinder = onnavigationevent.asBinder();
            if (strAsBinder != null) {
                bundle.putString("throwableClassName", strAsBinder);
            }
            String strAccess000 = onnavigationevent.access000();
            if (strAccess000 != null) {
                bundle.putString("throwableMessage", strAccess000);
                int i5 = IAuthTabCallback + 43;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 / 4;
                }
            }
        }
        int i7 = IAuthTabCallback + 43;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return bundle;
    }

    public static final class onExtraCallbackWithResult extends n1a {
        private static int IAuthTabCallbackStub = 1;
        private static int asBinder;
        private final String IAuthTabCallback;
        private final n5 IAuthTabCallbackDefault;
        private final String onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final n0b onNavigationEvent;
        private final setAdViewTracker onTransact;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = asBinder + 77;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallbackwithresult.onExtraCallbackWithResult) || !Intrinsics.areEqual(this.IAuthTabCallback, onextracallbackwithresult.IAuthTabCallback)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onextracallbackwithresult.onWarmupCompleted)) {
                int i4 = IAuthTabCallbackStub + 29;
                asBinder = i4 % 128;
                return i4 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, onextracallbackwithresult.IAuthTabCallbackDefault)) {
                return false;
            }
            if (this.onNavigationEvent != onextracallbackwithresult.onNavigationEvent) {
                int i5 = asBinder + 67;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallback, onextracallbackwithresult.onExtraCallback)) {
                int i7 = asBinder + 31;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                return true;
            }
            int i9 = IAuthTabCallbackStub + 51;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 33;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                this.onExtraCallbackWithResult.hashCode();
                this.IAuthTabCallback.hashCode();
                this.onWarmupCompleted.hashCode();
                this.IAuthTabCallbackDefault.hashCode();
                this.onNavigationEvent.hashCode();
                throw null;
            }
            int iHashCode2 = this.onExtraCallbackWithResult.hashCode();
            int iHashCode3 = this.IAuthTabCallback.hashCode();
            int iHashCode4 = this.onWarmupCompleted.hashCode();
            int iHashCode5 = this.IAuthTabCallbackDefault.hashCode();
            int iHashCode6 = this.onNavigationEvent.hashCode();
            String str = this.onExtraCallback;
            if (str == null) {
                int i3 = IAuthTabCallbackStub + 11;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            return (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Completed(eventName=" + this.onExtraCallbackWithResult + ", sharedBundleName=" + this.IAuthTabCallback + ", serviceBundleName=" + this.onWarmupCompleted + ", state=" + this.IAuthTabCallbackDefault + ", sharedBundleSource=" + this.onNavigationEvent + ", sharedBundleDeploymentId=" + this.onExtraCallback + ")";
            int i2 = asBinder + 55;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull n5 n5Var, @NotNull n0b n0bVar, @Nullable String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(n5Var, "");
            Intrinsics.checkNotNullParameter(n0bVar, "");
            DefaultConstructorMarker defaultConstructorMarker = null;
            super(defaultConstructorMarker);
            this.onExtraCallbackWithResult = str;
            this.IAuthTabCallback = str2;
            this.onWarmupCompleted = str3;
            this.IAuthTabCallbackDefault = n5Var;
            this.onNavigationEvent = n0bVar;
            this.onExtraCallback = str4;
            asInterface();
            if (IAuthTabCallback().IAuthTabCallback() != n0a.Loaded) {
                throw new IllegalArgumentException("completed event requires loaded shared bundle state");
            }
            if (!IAuthTabCallback().onNavigationEvent()) {
                throw new IllegalArgumentException("completed event requires started ReactHost");
            }
            int i = asBinder + 27;
            IAuthTabCallbackStub = i % 128;
            if (i % 2 == 0) {
                this.onTransact = setAdViewTracker.Completed;
                throw null;
            }
            this.onTransact = setAdViewTracker.Completed;
            int i2 = IAuthTabCallbackStub + 85;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        @Override // o.n1a
        public String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 85;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            String str = this.onExtraCallbackWithResult;
            if (i3 != 0) {
                int i4 = 52 / 0;
            }
            return str;
        }

        @Override // o.n1a
        public String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 29;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            String str = this.IAuthTabCallback;
            int i5 = i2 + 47;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 96 / 0;
            }
            return str;
        }

        @Override // o.n1a
        public String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 125;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onWarmupCompleted;
            int i5 = i2 + 107;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // o.n1a
        public n5 IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asBinder + 53;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            n5 n5Var = this.IAuthTabCallbackDefault;
            int i5 = i3 + 13;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return n5Var;
        }

        public final n0b asBinder() {
            int i = 2 % 2;
            int i2 = asBinder + 125;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            n0b n0bVar = this.onNavigationEvent;
            int i5 = i3 + 83;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                return n0bVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = asBinder + 77;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            String str = this.onExtraCallback;
            int i5 = i3 + 117;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // o.n1a
        public setAdViewTracker onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 65;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            setAdViewTracker setadviewtracker = this.onTransact;
            int i5 = i3 + 29;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                return setadviewtracker;
            }
            throw null;
        }
    }

    public static final class onNavigationEvent extends n1a {
        private static int asBinder = 0;
        private static int asInterface = 1;
        private final n5 IAuthTabCallback;
        private final setAdViewTracker IAuthTabCallbackDefault;
        private final String IAuthTabCallbackStub;
        private final String onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final n2 onNavigationEvent;
        private final String onTransact;
        private final String onWarmupCompleted;

        public static final /* synthetic */ class onExtraCallbackWithResult {
            private static int onExtraCallback = 0;
            public static final /* synthetic */ int[] onExtraCallbackWithResult;
            private static int onNavigationEvent = 1;

            static {
                int[] iArr = new int[n2.values().length];
                try {
                    iArr[n2.ServiceBundleLoadFailed.ordinal()] = 1;
                    int i = onExtraCallback + 81;
                    onNavigationEvent = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 4 % 5;
                    } else {
                        int i3 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[n2.SharedBundleLoadFailed.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[n2.ReactHostStartFailed.ordinal()] = 3;
                    int i4 = onNavigationEvent + 101;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = 2 % 2;
                } catch (NoSuchFieldError unused3) {
                }
                onExtraCallbackWithResult = iArr;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 123;
            int i4 = i3 % 128;
            asBinder = i4;
            int i5 = i3 % 2;
            if (this == obj) {
                int i6 = i4 + 101;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i8 = i2 + 101;
                asBinder = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 55 / 0;
                }
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (!Intrinsics.areEqual(this.onExtraCallback, onnavigationevent.onExtraCallback)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onnavigationevent.onWarmupCompleted)) {
                int i10 = asInterface + 7;
                asBinder = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallbackWithResult, onnavigationevent.onExtraCallbackWithResult)) {
                return !(Intrinsics.areEqual(this.IAuthTabCallback, onnavigationevent.IAuthTabCallback) ^ true) && this.onNavigationEvent == onnavigationevent.onNavigationEvent && Intrinsics.areEqual(this.IAuthTabCallbackStub, onnavigationevent.IAuthTabCallbackStub) && Intrinsics.areEqual(this.onTransact, onnavigationevent.onTransact);
            }
            int i12 = asInterface + 35;
            asBinder = i12 % 128;
            return i12 % 2 != 0;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int iHashCode2 = this.onExtraCallback.hashCode();
            int iHashCode3 = this.onWarmupCompleted.hashCode();
            int iHashCode4 = this.onExtraCallbackWithResult.hashCode();
            int iHashCode5 = this.IAuthTabCallback.hashCode();
            int iHashCode6 = this.onNavigationEvent.hashCode();
            String str = this.IAuthTabCallbackStub;
            if (str == null) {
                int i2 = asInterface;
                int i3 = i2 + 47;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 11;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            String str2 = this.onTransact;
            return (((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Failed(eventName=" + this.onExtraCallback + ", sharedBundleName=" + this.onWarmupCompleted + ", serviceBundleName=" + this.onExtraCallbackWithResult + ", state=" + this.IAuthTabCallback + ", reason=" + this.onNavigationEvent + ", throwableClassName=" + this.IAuthTabCallbackStub + ", throwableMessage=" + this.onTransact + ")";
            int i2 = asBinder + 5;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull n5 n5Var, @NotNull n2 n2Var, @Nullable String str4, @Nullable String str5) throws NoWhenBranchMatchedException {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(n5Var, "");
            Intrinsics.checkNotNullParameter(n2Var, "");
            this.onExtraCallback = str;
            this.onWarmupCompleted = str2;
            this.onExtraCallbackWithResult = str3;
            this.IAuthTabCallback = n5Var;
            this.onNavigationEvent = n2Var;
            this.IAuthTabCallbackStub = str4;
            this.onTransact = str5;
            asInterface();
            int i = onExtraCallbackWithResult.onExtraCallbackWithResult[n2Var.ordinal()];
            if (i == 1 || i == 2) {
                if (IAuthTabCallback().IAuthTabCallback() != n0a.Failed) {
                    throw new IllegalArgumentException("bundle load failure event requires failed shared bundle state");
                }
            } else {
                int i2 = asBinder + 111;
                int i3 = i2 % 128;
                asInterface = i3;
                int i4 = i2 % 2;
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                int i5 = i3 + 43;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                if (IAuthTabCallback().IAuthTabCallback() != n0a.Loaded) {
                    throw new IllegalArgumentException("ReactHost failure event requires loaded shared bundle state");
                }
                if (IAuthTabCallback().onNavigationEvent()) {
                    throw new IllegalArgumentException("ReactHost failure event requires stopped ReactHost");
                }
            }
            this.IAuthTabCallbackDefault = setAdViewTracker.Failed;
        }

        @Override // o.n1a
        public String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asInterface + 91;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            String str = this.onExtraCallback;
            if (i3 != 0) {
                int i4 = 45 / 0;
            }
            return str;
        }

        @Override // o.n1a
        public String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 41;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            String str = this.onWarmupCompleted;
            int i4 = i2 + 47;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 14 / 0;
            }
            return str;
        }

        @Override // o.n1a
        public String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asBinder + 3;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.n1a
        public n5 IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asInterface + 95;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            n5 n5Var = this.IAuthTabCallback;
            int i5 = i3 + 69;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return n5Var;
        }

        public final n2 IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 3;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            n2 n2Var = this.onNavigationEvent;
            int i5 = i2 + 123;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return n2Var;
        }

        public final String asBinder() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 15;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            String str = this.IAuthTabCallbackStub;
            int i5 = i2 + 37;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 82 / 0;
            }
            return str;
        }

        public final String access000() {
            int i = 2 % 2;
            int i2 = asInterface + 99;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onTransact;
            }
            throw null;
        }

        @Override // o.n1a
        public setAdViewTracker onExtraCallback() {
            int i = 2 % 2;
            int i2 = asBinder + 19;
            int i3 = i2 % 128;
            asInterface = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            setAdViewTracker setadviewtracker = this.IAuthTabCallbackDefault;
            int i4 = i3 + 105;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                return setadviewtracker;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (true) {
            obj = null;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                break;
            }
            int i3 = $10 + 17;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), Color.green(0) + 24, 19627 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                try {
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.lastIndexOf("", '0') + 60, TextUtils.getOffsetAfter("", 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), Process.getGidForName("") + 60, 6383 - TextUtils.indexOf("", ""), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        String str = new String(cArr2);
        int i6 = $11 + 123;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    protected final void asInterface() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            StringsKt.isBlank(onExtraCallbackWithResult());
            obj.hashCode();
            throw null;
        }
        if (StringsKt.isBlank(onExtraCallbackWithResult())) {
            throw new IllegalArgumentException("eventName must not be blank");
        }
        if (!(!StringsKt.isBlank(onWarmupCompleted()))) {
            throw new IllegalArgumentException("sharedBundleName must not be blank");
        }
        int i3 = IAuthTabCallback + 31;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (StringsKt.isBlank(onNavigationEvent())) {
            throw new IllegalArgumentException("serviceBundleName must not be blank");
        }
        int i5 = onWarmupCompleted + 65;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static void IAuthTabCallbackDefault() {
        onExtraCallback = -1342159618048435458L;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }
}
