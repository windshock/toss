package o;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.tds.graphics.gl.RootLayerContract;
import im.toss.tds.graphics.gl.blur.RenderCommand;
import im.toss.tds.graphics.gl.compose.RenderObject;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt;
import o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0;
import o.basic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class secure implements r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 {
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000;
    private final Map<String, path> IAuthTabCallback;
    private final deprecated_persistent IAuthTabCallbackDefault;
    private final RootLayerContract IAuthTabCallbackStub;
    private final deprecated_hostOnly asBinder;
    private final ConcurrentHashMap<String, basic.onNavigationEvent> asInterface;
    private final Credentials getInterfaceDescriptor;
    private final /* synthetic */ r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 onExtraCallback;
    private final loadForRequest onExtraCallbackWithResult;
    private final ConcurrentHashMap<String, basic.onWarmupCompleted> onNavigationEvent;
    private final ConcurrentHashMap<String, onNavigationEvent> onTransact;
    private final Object onWarmupCompleted;

    public static final /* synthetic */ class onWarmupCompleted {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[deprecated_httpOnly.values().length];
            try {
                iArr[deprecated_httpOnly.ROUND_RECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[deprecated_httpOnly.CIRCLE.ordinal()] = 2;
                int i = IAuthTabCallback + 3;
                onExtraCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallbackWithResult = iArr;
            int i4 = IAuthTabCallback + 123;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 41 / 0;
            }
        }
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~i4;
        int i11 = i9 | (~(i8 | i10));
        int i12 = ~(i4 | i6 | i);
        int i13 = i11 | i12;
        int i14 = i10 | i6;
        int i15 = i6 + i + i5 + (112060874 * i2) + ((-1891258303) * i3);
        int i16 = i15 * i15;
        int i17 = (i6 * 1286644997) + 1783103488 + (1286644997 * i) + (i13 * (-1821943044)) + ((-651081208) * i12) + ((-1821943044) * i14) + ((-535298048) * i5) + ((-1427111936) * i2) + (1712848896 * i3) + (159514624 * i16);
        int i18 = ((i6 * (-1669307009)) - 1771304782) + (i * (-1669307009)) + (i13 * 564) + (i12 * (-1128)) + (i14 * 564) + (i5 * (-1669306445)) + (i2 * (-1582645698)) + (i3 * (-198941581)) + (i16 * (-203030528));
        return i17 + ((i18 * i18) * (-2008154112)) != 1 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    public float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 67;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = this.onExtraCallback;
        if (i3 == 0) {
            return r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback();
        }
        r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback();
        throw null;
    }

    public float IAuthTabCallback(float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 101;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            this.onExtraCallback.IAuthTabCallback(f);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float fIAuthTabCallback = this.onExtraCallback.IAuthTabCallback(f);
        int i3 = access000 + 97;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 93 / 0;
        }
        return fIAuthTabCallback;
    }

    public int a_(long j) {
        int i = 2 % 2;
        int i2 = access000 + 89;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iA_ = this.onExtraCallback.a_(j);
        int i4 = access000 + 125;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
        return iA_;
    }

    public long b_(long j) {
        int i = 2 % 2;
        int i2 = access000 + 89;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        long jB_ = this.onExtraCallback.b_(j);
        int i4 = access000 + 83;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return jB_;
    }

    public float c_(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 41;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = this.onExtraCallback;
        if (i4 == 0) {
            return r8lambdanm9dm2eewl4vrptnjmesfjqky4.c_(i);
        }
        r8lambdanm9dm2eewl4vrptnjmesfjqky4.c_(i);
        throw null;
    }

    public float c_(long j) {
        int i = 2 % 2;
        int i2 = access000 + 81;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        float fC_ = this.onExtraCallback.c_(j);
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
        return fC_;
    }

    public long d_(long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 29;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            this.onExtraCallback.d_(j);
            throw null;
        }
        long jD_ = this.onExtraCallback.d_(j);
        int i3 = access000 + 47;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return jD_;
    }

    public float e_(long j) {
        int i = 2 % 2;
        int i2 = access000 + 33;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.onExtraCallback.e_(j);
            obj.hashCode();
            throw null;
        }
        float fE_ = this.onExtraCallback.e_(j);
        int i3 = IAuthTabCallback_Parcel + 91;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            return fE_;
        }
        throw null;
    }

    public float onExtraCallback(float f) {
        int i = 2 % 2;
        int i2 = access000 + 47;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = this.onExtraCallback;
        if (i3 != 0) {
            return r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(f);
        }
        r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(f);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int onExtraCallbackWithResult(float f) {
        int i = 2 % 2;
        int i2 = access000 + 69;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult(f);
        int i4 = IAuthTabCallback_Parcel + 99;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return iOnExtraCallbackWithResult;
    }

    public float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 61;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            this.onExtraCallback.onNavigationEvent();
            throw null;
        }
        float fOnNavigationEvent = this.onExtraCallback.onNavigationEvent();
        int i3 = access000 + 69;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return fOnNavigationEvent;
    }

    public long onNavigationEvent(float f) {
        long jOnNavigationEvent;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 41;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            jOnNavigationEvent = this.onExtraCallback.onNavigationEvent(f);
            int i3 = 63 / 0;
        } else {
            jOnNavigationEvent = this.onExtraCallback.onNavigationEvent(f);
        }
        int i4 = access000 + 15;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return jOnNavigationEvent;
    }

    public long onWarmupCompleted(float f) {
        long jOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 25;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            jOnWarmupCompleted = this.onExtraCallback.onWarmupCompleted(f);
            int i3 = 66 / 0;
        } else {
            jOnWarmupCompleted = this.onExtraCallback.onWarmupCompleted(f);
        }
        int i4 = access000 + 81;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return jOnWarmupCompleted;
        }
        throw null;
    }

    public secure(@NotNull r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, @NotNull loadForRequest loadforrequest, @NotNull RootLayerContract rootLayerContract, @NotNull Credentials credentials, @NotNull deprecated_hostOnly deprecated_hostonly, @NotNull deprecated_persistent deprecated_persistentVar) {
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        Intrinsics.checkNotNullParameter(loadforrequest, "");
        Intrinsics.checkNotNullParameter(rootLayerContract, "");
        Intrinsics.checkNotNullParameter(credentials, "");
        Intrinsics.checkNotNullParameter(deprecated_hostonly, "");
        Intrinsics.checkNotNullParameter(deprecated_persistentVar, "");
        this.onExtraCallback = r8lambdanm9dm2eewl4vrptnjmesfjqky4;
        this.onExtraCallbackWithResult = loadforrequest;
        this.IAuthTabCallbackStub = rootLayerContract;
        this.getInterfaceDescriptor = credentials;
        this.asBinder = deprecated_hostonly;
        this.IAuthTabCallbackDefault = deprecated_persistentVar;
        this.IAuthTabCallback = new LinkedHashMap();
        this.onWarmupCompleted = new Object();
        this.onTransact = new ConcurrentHashMap<>();
        this.onNavigationEvent = new ConcurrentHashMap<>();
        this.asInterface = new ConcurrentHashMap<>();
    }

    static final class onNavigationEvent {
        private static int IAuthTabCallbackStub = 0;
        private static int asBinder = 1;
        private final float IAuthTabCallback;
        private final deprecated_httpOnly asInterface;
        private final float onExtraCallback;
        private final float onExtraCallbackWithResult;
        private final float onNavigationEvent;
        private final float onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 103;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i5 = i3 + 9;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (this.asInterface != onnavigationevent.asInterface) {
                int i7 = i3 + 67;
                IAuthTabCallbackStub = i7 % 128;
                return i7 % 2 != 0;
            }
            if (Float.compare(this.IAuthTabCallback, onnavigationevent.IAuthTabCallback) != 0 || Float.compare(this.onNavigationEvent, onnavigationevent.onNavigationEvent) != 0 || Float.compare(this.onWarmupCompleted, onnavigationevent.onWarmupCompleted) != 0) {
                return false;
            }
            if (Float.compare(this.onExtraCallback, onnavigationevent.onExtraCallback) != 0) {
                int i8 = IAuthTabCallbackStub + 77;
                asBinder = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (Float.compare(this.onExtraCallbackWithResult, onnavigationevent.onExtraCallbackWithResult) == 0) {
                return true;
            }
            int i10 = IAuthTabCallbackStub + 119;
            asBinder = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 65;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((((((this.asInterface.hashCode() * 31) + Float.hashCode(this.IAuthTabCallback)) * 31) + Float.hashCode(this.onNavigationEvent)) * 31) + Float.hashCode(this.onWarmupCompleted)) * 31) + Float.hashCode(this.onExtraCallback)) * 31) + Float.hashCode(this.onExtraCallbackWithResult);
            int i4 = IAuthTabCallbackStub + 57;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 24 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ShapeMaskParams(type=" + this.asInterface + ", radius=" + this.IAuthTabCallback + ", inset=" + this.onNavigationEvent + ", cx=" + this.onWarmupCompleted + ", cy=" + this.onExtraCallback + ", feather=" + this.onExtraCallbackWithResult + ")";
            int i2 = asBinder + 31;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public onNavigationEvent(@NotNull deprecated_httpOnly deprecated_httponly, float f, float f2, float f3, float f4, float f5) {
            Intrinsics.checkNotNullParameter(deprecated_httponly, "");
            this.asInterface = deprecated_httponly;
            this.IAuthTabCallback = f;
            this.onNavigationEvent = f2;
            this.onWarmupCompleted = f3;
            this.onExtraCallback = f4;
            this.onExtraCallbackWithResult = f5;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onNavigationEvent(deprecated_httpOnly deprecated_httponly, float f, float f2, float f3, float f4, float f5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            float f6;
            float f7;
            float f8;
            float f9 = 0.0f;
            if ((i & 2) != 0) {
                int i2 = asBinder + 125;
                IAuthTabCallbackStub = i2 % 128;
                f6 = i2 % 2 != 0 ? 2.0f : 0.0f;
            } else {
                f6 = f;
            }
            if ((i & 4) != 0) {
                int i3 = IAuthTabCallbackStub + 65;
                asBinder = i3 % 128;
                f7 = i3 % 2 != 0 ? 0.0f : 2.0f;
                int i4 = 2 % 2;
            } else {
                f7 = f2;
            }
            if ((i & 8) != 0) {
                int i5 = IAuthTabCallbackStub + 93;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                f8 = 0.0f;
            } else {
                f8 = f3;
            }
            float f10 = 1.0f;
            if ((i & 16) != 0) {
                int i7 = asBinder + 23;
                IAuthTabCallbackStub = i7 % 128;
                if (i7 % 2 != 0) {
                    f9 = 1.0f;
                }
            } else {
                f9 = f4;
            }
            if ((i & 32) != 0) {
                int i8 = IAuthTabCallbackStub + 41;
                asBinder = i8 % 128;
                int i9 = i8 % 2;
                int i10 = 2 % 2;
            } else {
                f10 = f5;
            }
            this(deprecated_httponly, f6, f7, f8, f9, f10);
        }

        public final deprecated_httpOnly IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 9;
            int i3 = i2 % 128;
            asBinder = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            deprecated_httpOnly deprecated_httponly = this.asInterface;
            int i4 = i3 + 25;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                return deprecated_httponly;
            }
            throw null;
        }

        public final float onExtraCallback() {
            int i = 2 % 2;
            int i2 = asBinder + 63;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            float f = this.IAuthTabCallback;
            int i5 = i3 + 111;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                return f;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final float onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 81;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            float f = this.onNavigationEvent;
            int i5 = i2 + 75;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 66 / 0;
            }
            return f;
        }

        public final float IAuthTabCallback() {
            float f;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 67;
            int i3 = i2 % 128;
            asBinder = i3;
            if (i2 % 2 == 0) {
                f = this.onWarmupCompleted;
                int i4 = 73 / 0;
            } else {
                f = this.onWarmupCompleted;
            }
            int i5 = i3 + 11;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 9 / 0;
            }
            return f;
        }

        public final float onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 17;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            float f = this.onExtraCallback;
            int i5 = i3 + 41;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                return f;
            }
            throw null;
        }

        public final float onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 5;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            float f = this.onExtraCallbackWithResult;
            int i5 = i2 + 79;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                return f;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        secure secureVar = (secure) objArr[0];
        String str = (String) objArr[1];
        basic.onWarmupCompleted onwarmupcompleted = (basic.onWarmupCompleted) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (onwarmupcompleted != null) {
            secureVar.onNavigationEvent.put(str, onwarmupcompleted);
            int i2 = access000 + 29;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = IAuthTabCallback_Parcel + 53;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            secureVar.onNavigationEvent.remove(str);
            return null;
        }
        secureVar.onNavigationEvent.remove(str);
        int i5 = 10 / 0;
        return null;
    }

    public final void onNavigationEvent(@NotNull String str, @Nullable basic.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 31;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (onnavigationevent != null) {
            this.asInterface.put(str, onnavigationevent);
            return;
        }
        int i4 = IAuthTabCallback_Parcel + 25;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            this.asInterface.remove(str);
            return;
        }
        this.asInterface.remove(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(secure secureVar, String str, float f, float f2, float f3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel;
        int i4 = i3 + 25;
        access000 = i4 % 128;
        if (i4 % 2 == 0 ? (i & 4) != 0 : (i & 3) != 0) {
            f2 = 0.0f;
        }
        if ((i & 8) != 0) {
            int i5 = i3 + 83;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i3 + 43;
            access000 = i7 % 128;
            int i8 = i7 % 2;
            f3 = 1.0f;
        }
        secureVar.onExtraCallback(str, f, f2, f3);
        int i9 = IAuthTabCallback_Parcel + 93;
        access000 = i9 % 128;
        int i10 = i9 % 2;
    }

    public final void onExtraCallback(@NotNull String str, float f, float f2, float f3) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.onTransact.put(str, new onNavigationEvent(deprecated_httpOnly.ROUND_RECT, f, f2, 0.0f, 0.0f, f3, 24, null));
        int i2 = access000 + 91;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(secure secureVar, String str, float f, float f2, float f3, float f4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel;
        int i4 = i3 + 21;
        access000 = i4 % 128;
        if (i4 % 2 == 0 ? (i & 16) != 0 : (i & 28) != 0) {
            int i5 = i3 + 33;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            f4 = 1.0f;
        }
        secureVar.IAuthTabCallback(str, f, f2, f3, f4);
    }

    public final void IAuthTabCallback(@NotNull String str, float f, float f2, float f3, float f4) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.onTransact.put(str, new onNavigationEvent(deprecated_httpOnly.CIRCLE, f3, 0.0f, f, f2, f4, 4, null));
        int i2 = access000 + 15;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 62 / 0;
        }
    }

    public final void IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 3;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onTransact.remove(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.onTransact.remove(str);
        int i3 = access000 + 57;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access000 + 1;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult.onExtraCallback();
        if (i3 == 0) {
            throw null;
        }
    }

    private final path onExtraCallbackWithResult() {
        int i = 2 % 2;
        path pathVar = new path(new parseMaxAge(this.asBinder, this.onExtraCallbackWithResult, this.getInterfaceDescriptor, this.IAuthTabCallbackDefault, 0.0f, 16, null), new accesspathMatch(this.onExtraCallbackWithResult, this.asBinder, this.IAuthTabCallbackDefault, this.getInterfaceDescriptor), new CookieCompanion(this.asBinder, this.IAuthTabCallbackDefault, this.onExtraCallbackWithResult, this.getInterfaceDescriptor), new parseExpires(this.asBinder, this.IAuthTabCallbackDefault, this.onExtraCallbackWithResult, this.getInterfaceDescriptor), new accessdomainMatch(this.asBinder, this.onExtraCallbackWithResult, this.IAuthTabCallbackDefault, this.getInterfaceDescriptor), new persistent(this.getInterfaceDescriptor));
        int i2 = IAuthTabCallback_Parcel + 113;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return pathVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02e8 A[Catch: all -> 0x0510, TryCatch #0 {all -> 0x0510, blocks: (B:45:0x02ba, B:47:0x02e8, B:49:0x0303, B:52:0x030c, B:53:0x0326, B:54:0x036e, B:41:0x0250, B:44:0x0291), top: B:101:0x020e }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0303 A[Catch: all -> 0x0510, TryCatch #0 {all -> 0x0510, blocks: (B:45:0x02ba, B:47:0x02e8, B:49:0x0303, B:52:0x030c, B:53:0x0326, B:54:0x036e, B:41:0x0250, B:44:0x0291), top: B:101:0x020e }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03d6 A[Catch: all -> 0x050c, TryCatch #4 {all -> 0x050c, blocks: (B:58:0x03d6, B:61:0x0404, B:63:0x0411, B:59:0x03fc, B:56:0x0395), top: B:107:0x0395 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03fc A[Catch: all -> 0x050c, TryCatch #4 {all -> 0x050c, blocks: (B:58:0x03d6, B:61:0x0404, B:63:0x0411, B:59:0x03fc, B:56:0x0395), top: B:107:0x0395 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0404 A[Catch: all -> 0x050c, TryCatch #4 {all -> 0x050c, blocks: (B:58:0x03d6, B:61:0x0404, B:63:0x0411, B:59:0x03fc, B:56:0x0395), top: B:107:0x0395 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0466 A[Catch: all -> 0x050a, TryCatch #2 {all -> 0x050a, blocks: (B:65:0x0425, B:67:0x0466, B:76:0x0486, B:80:0x04c2, B:82:0x04cb, B:85:0x04fe, B:84:0x04e3, B:68:0x046b, B:70:0x0471, B:72:0x0478, B:74:0x047f), top: B:103:0x0425 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x046b A[Catch: all -> 0x050a, TryCatch #2 {all -> 0x050a, blocks: (B:65:0x0425, B:67:0x0466, B:76:0x0486, B:80:0x04c2, B:82:0x04cb, B:85:0x04fe, B:84:0x04e3, B:68:0x046b, B:70:0x0471, B:72:0x0478, B:74:0x047f), top: B:103:0x0425 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04cb A[Catch: all -> 0x050a, TryCatch #2 {all -> 0x050a, blocks: (B:65:0x0425, B:67:0x0466, B:76:0x0486, B:80:0x04c2, B:82:0x04cb, B:85:0x04fe, B:84:0x04e3, B:68:0x046b, B:70:0x0471, B:72:0x0478, B:74:0x047f), top: B:103:0x0425 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04e3 A[Catch: all -> 0x050a, TryCatch #2 {all -> 0x050a, blocks: (B:65:0x0425, B:67:0x0466, B:76:0x0486, B:80:0x04c2, B:82:0x04cb, B:85:0x04fe, B:84:0x04e3, B:68:0x046b, B:70:0x0471, B:72:0x0478, B:74:0x047f), top: B:103:0x0425 }] */
    /* JADX WARN: Type inference failed for: r37v0 */
    /* JADX WARN: Type inference failed for: r37v1 */
    /* JADX WARN: Type inference failed for: r37v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r37v4 */
    /* JADX WARN: Type inference failed for: r37v5 */
    /* JADX WARN: Type inference failed for: r37v6 */
    /* JADX WARN: Type inference failed for: r37v7 */
    /* JADX WARN: Type inference failed for: r37v8 */
    /* JADX WARN: Type inference failed for: r37v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(@NotNull RenderObject renderObject) throws Throwable {
        ?? r37;
        int i;
        long j;
        basic.onWarmupCompleted onwarmupcompleted;
        basic.onNavigationEvent onnavigationevent;
        accesspathMatch accesspathmatch;
        getTlsVersionsokhttp gettlsversionsokhttpOnExtraCallback;
        basic.onNavigationEvent onnavigationevent2;
        CookieCompanion cookieCompanion;
        getTlsVersionsokhttp gettlsversionsokhttpOnExtraCallback2;
        parseokhttp parseokhttpVarOnWarmupCompleted;
        Rect rectIAuthTabCallback;
        float f;
        int iIAuthTabCallbackDefault;
        float fExtraCallback;
        Intrinsics.checkNotNullParameter(renderObject, "");
        Object obj = this.onWarmupCompleted;
        synchronized (obj) {
            try {
                basic.onNavigationEvent onnavigationevent3 = this.asInterface.get((String) RenderObject.onWarmupCompleted(RNSScreenManagerDelegate.onNavigationEvent(), -1674398856, RNSScreenManagerDelegate.onNavigationEvent(), 1674398857, RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{renderObject}, RNSScreenManagerDelegate.onNavigationEvent()));
                boolean z = renderObject.onTransact().asInterface() > 0 && renderObject.onTransact().IAuthTabCallbackStub() > 0.03f;
                boolean z2 = !z && onnavigationevent3 == null;
                Rect rectIAuthTabCallback2 = renderObject.IAuthTabCallback();
                int iIAuthTabCallback_Parcel = (int) (rectIAuthTabCallback2.IAuthTabCallback_Parcel() - rectIAuthTabCallback2.IAuthTabCallbackStubProxy());
                int iIAuthTabCallbackDefault2 = (int) (rectIAuthTabCallback2.IAuthTabCallbackDefault() - rectIAuthTabCallback2.extraCallback());
                if (iIAuthTabCallback_Parcel > 0 && iIAuthTabCallbackDefault2 > 0) {
                    if (z2) {
                        parseokhttp parseokhttpVarIAuthTabCallback = this.IAuthTabCallbackStub.IAuthTabCallback();
                        int iOnExtraCallback = (int) (parseokhttpVarIAuthTabCallback.onNavigationEvent().onExtraCallback() >> 32);
                        int iOnExtraCallback2 = (int) parseokhttpVarIAuthTabCallback.onNavigationEvent().onExtraCallback();
                        int iIAuthTabCallbackStubProxy = (int) rectIAuthTabCallback2.IAuthTabCallbackStubProxy();
                        int iIAuthTabCallback_Parcel2 = (int) rectIAuthTabCallback2.IAuthTabCallback_Parcel();
                        if (parseokhttpVarIAuthTabCallback.onExtraCallback().onNavigationEvent().onExtraCallbackWithResult()) {
                            f = iOnExtraCallback2;
                            iIAuthTabCallbackDefault = (int) (f - rectIAuthTabCallback2.extraCallback());
                            fExtraCallback = rectIAuthTabCallback2.IAuthTabCallbackDefault();
                        } else {
                            f = iOnExtraCallback2;
                            iIAuthTabCallbackDefault = (int) (f - rectIAuthTabCallback2.IAuthTabCallbackDefault());
                            fExtraCallback = rectIAuthTabCallback2.extraCallback();
                        }
                        int iCoerceIn = RangesKt.coerceIn(iIAuthTabCallbackStubProxy, 0, iOnExtraCallback);
                        int iCoerceIn2 = RangesKt.coerceIn(iIAuthTabCallback_Parcel2, 0, iOnExtraCallback);
                        int iCoerceIn3 = RangesKt.coerceIn(iIAuthTabCallbackDefault, 0, iOnExtraCallback2);
                        int iCoerceIn4 = RangesKt.coerceIn((int) (f - fExtraCallback), 0, iOnExtraCallback2);
                        parseokhttpVarIAuthTabCallback.onNavigationEvent(parseDomain.READ, false);
                        RenderCommand renderCommand = RenderCommand.IAuthTabCallback;
                        renderCommand.IAuthTabCallback(parseDomain.DRAW);
                        renderCommand.onExtraCallback(0, 0, iIAuthTabCallback_Parcel, iIAuthTabCallbackDefault2);
                        RenderCommand.onWarmupCompleted(renderCommand, null, 1, null);
                        RenderCommand.onExtraCallbackWithResult(renderCommand, iCoerceIn, iCoerceIn3, iCoerceIn2, iCoerceIn4, 0, 0, iIAuthTabCallback_Parcel, iIAuthTabCallbackDefault2, 0, 0, 768, null);
                        return;
                    }
                    Map<String, path> map = this.IAuthTabCallback;
                    String str = (String) RenderObject.onWarmupCompleted(RNSScreenManagerDelegate.onNavigationEvent(), -1674398856, RNSScreenManagerDelegate.onNavigationEvent(), 1674398857, RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{renderObject}, RNSScreenManagerDelegate.onNavigationEvent());
                    path pathVarOnExtraCallbackWithResult = map.get(str);
                    if (pathVarOnExtraCallbackWithResult == null) {
                        pathVarOnExtraCallbackWithResult = onExtraCallbackWithResult();
                        map.put(str, pathVarOnExtraCallbackWithResult);
                    }
                    path pathVar = pathVarOnExtraCallbackWithResult;
                    parseMaxAge parsemaxageIAuthTabCallback = pathVar.IAuthTabCallback();
                    accesspathMatch accesspathmatchOnExtraCallbackWithResult = pathVar.onExtraCallbackWithResult();
                    CookieCompanion cookieCompanionOnNavigationEvent = pathVar.onNavigationEvent();
                    parseExpires parseexpiresOnExtraCallback = pathVar.onExtraCallback();
                    accessdomainMatch accessdomainmatchOnWarmupCompleted = pathVar.onWarmupCompleted();
                    persistent persistentVarIAuthTabCallbackStub = pathVar.IAuthTabCallbackStub();
                    parseokhttp parseokhttpVarOnExtraCallbackWithResult = parsemaxageIAuthTabCallback.onExtraCallbackWithResult(this.IAuthTabCallbackStub.IAuthTabCallback(), rectIAuthTabCallback2);
                    float fIAuthTabCallback = (int) (parsemaxageIAuthTabCallback.IAuthTabCallback() >> 32);
                    float fIAuthTabCallback2 = (int) parsemaxageIAuthTabCallback.IAuthTabCallback();
                    float fLongValue = (int) (((Long) parseMaxAge.IAuthTabCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1956828088, -1956828088, new Object[]{parsemaxageIAuthTabCallback}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())).longValue() >> 32);
                    r37 = new Object[]{parsemaxageIAuthTabCallback};
                    float fLongValue2 = (int) ((Long) parseMaxAge.IAuthTabCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1956828088, -1956828088, r37, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())).longValue();
                    float fOnExtraCallbackWithResult = parsemaxageIAuthTabCallback.onExtraCallbackWithResult();
                    long jOnExtraCallback = parsemaxageIAuthTabCallback.onExtraCallback();
                    float f2 = (fIAuthTabCallback - fLongValue) * 0.5f;
                    float f3 = (fIAuthTabCallback2 - fLongValue2) * 0.5f;
                    onNavigationEvent onnavigationevent4 = this.onTransact.get((String) RenderObject.onWarmupCompleted(RNSScreenManagerDelegate.onNavigationEvent(), -1674398856, RNSScreenManagerDelegate.onNavigationEvent(), 1674398857, RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{renderObject}, RNSScreenManagerDelegate.onNavigationEvent()));
                    try {
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        if (onnavigationevent4 == null) {
                            accesspathmatchOnExtraCallbackWithResult.onExtraCallback(0, fIAuthTabCallback, fIAuthTabCallback2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            int i2 = onWarmupCompleted.onExtraCallbackWithResult[onnavigationevent4.IAuthTabCallbackDefault().ordinal()];
                            if (i2 == 1) {
                                r37 = obj;
                                i = iIAuthTabCallback_Parcel;
                                j = jOnExtraCallback;
                                accesspathmatchOnExtraCallbackWithResult.onExtraCallback(1, fIAuthTabCallback, fIAuthTabCallback2, f2, f3, onnavigationevent4.onExtraCallback() * fOnExtraCallbackWithResult, onnavigationevent4.onNavigationEvent() * fOnExtraCallbackWithResult, onnavigationevent4.onWarmupCompleted() * fOnExtraCallbackWithResult);
                                Unit unit = Unit.INSTANCE;
                            } else if (i2 == 2) {
                                try {
                                    r37 = obj;
                                    j = jOnExtraCallback;
                                    i = iIAuthTabCallback_Parcel;
                                    accesspathmatchOnExtraCallbackWithResult.onExtraCallback(2, fIAuthTabCallback, fIAuthTabCallback2, f2 + (((rectIAuthTabCallback2.IAuthTabCallbackStubProxy() + onnavigationevent4.IAuthTabCallback()) - Float.intBitsToFloat((int) (j >> 32))) * fOnExtraCallbackWithResult), f3 + (((rectIAuthTabCallback2.extraCallback() + onnavigationevent4.onExtraCallbackWithResult()) - Float.intBitsToFloat((int) j)) * fOnExtraCallbackWithResult), onnavigationevent4.onExtraCallback() * fOnExtraCallbackWithResult, 0.0f, onnavigationevent4.onWarmupCompleted() * fOnExtraCallbackWithResult);
                                    Unit unit2 = Unit.INSTANCE;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r37 = obj;
                                    throw th;
                                }
                            } else {
                                Unit unit3 = Unit.INSTANCE;
                            }
                            long j2 = j;
                            onwarmupcompleted = this.onNavigationEvent.get((String) RenderObject.onWarmupCompleted(RNSScreenManagerDelegate.onNavigationEvent(), -1674398856, RNSScreenManagerDelegate.onNavigationEvent(), 1674398857, RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{renderObject}, RNSScreenManagerDelegate.onNavigationEvent()));
                            if (onwarmupcompleted != null) {
                                accesspathmatchOnExtraCallbackWithResult.onWarmupCompleted(0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null);
                            } else {
                                int iOnTransact = onwarmupcompleted.onTransact();
                                if (iOnTransact == 1) {
                                    onnavigationevent = onnavigationevent3;
                                    int i3 = (int) (j2 >> 32);
                                    try {
                                        int i4 = (int) j2;
                                        accesspathmatchOnExtraCallbackWithResult.onWarmupCompleted(1, f2 + (((rectIAuthTabCallback2.IAuthTabCallbackStubProxy() + onwarmupcompleted.asBinder()) - Float.intBitsToFloat(i3)) * fOnExtraCallbackWithResult), f3 + (((rectIAuthTabCallback2.extraCallback() + onwarmupcompleted.IAuthTabCallbackDefault()) - Float.intBitsToFloat(i4)) * fOnExtraCallbackWithResult), f2 + (((rectIAuthTabCallback2.IAuthTabCallbackStubProxy() + onwarmupcompleted.IAuthTabCallback()) - Float.intBitsToFloat(i3)) * fOnExtraCallbackWithResult), f3 + (((rectIAuthTabCallback2.extraCallback() + onwarmupcompleted.onExtraCallbackWithResult()) - Float.intBitsToFloat(i4)) * fOnExtraCallbackWithResult), 0.0f, 0.0f, 0.0f, onwarmupcompleted.onNavigationEvent());
                                        Unit unit4 = Unit.INSTANCE;
                                        if (z) {
                                            accesspathmatch = accesspathmatchOnExtraCallbackWithResult;
                                            accesspathmatch.IAuthTabCallback(parseokhttpVarOnExtraCallbackWithResult);
                                            gettlsversionsokhttpOnExtraCallback = accesspathmatch.onExtraCallback(parseokhttpVarOnExtraCallbackWithResult, renderObject.onTransact().IAuthTabCallbackStub(), renderObject.onTransact().asInterface(), renderObject.onTransact().IAuthTabCallbackDefault());
                                        } else {
                                            accesspathmatch = accesspathmatchOnExtraCallbackWithResult;
                                            gettlsversionsokhttpOnExtraCallback = parseokhttpVarOnExtraCallbackWithResult.onExtraCallback();
                                        }
                                        if (onnavigationevent != null) {
                                            onnavigationevent2 = onnavigationevent;
                                            cookieCompanion = cookieCompanionOnNavigationEvent;
                                            gettlsversionsokhttpOnExtraCallback = cookieCompanion.onWarmupCompleted(gettlsversionsokhttpOnExtraCallback, onnavigationevent2);
                                        } else {
                                            onnavigationevent2 = onnavigationevent;
                                            cookieCompanion = cookieCompanionOnNavigationEvent;
                                        }
                                        getTlsVersionsokhttp gettlsversionsokhttpIAuthTabCallback = parseexpiresOnExtraCallback.IAuthTabCallback(gettlsversionsokhttpOnExtraCallback, renderObject.onTransact().asBinder());
                                        gettlsversionsokhttpOnExtraCallback2 = renderObject.onExtraCallback();
                                        int i5 = i;
                                        accessdomainmatchOnWarmupCompleted.IAuthTabCallback(this.IAuthTabCallbackStub.IAuthTabCallback(), rectIAuthTabCallback2, gettlsversionsokhttpIAuthTabCallback, (Rect) parseMaxAge.IAuthTabCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1187178152, -1187178151, new Object[]{parsemaxageIAuthTabCallback}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult()), gettlsversionsokhttpOnExtraCallback2);
                                        if (accessdomainmatchOnWarmupCompleted.onExtraCallback()) {
                                            parseokhttpVarOnWarmupCompleted = accessdomainmatchOnWarmupCompleted.onWarmupCompleted();
                                        } else if (parseexpiresOnExtraCallback.onWarmupCompleted()) {
                                            parseokhttpVarOnWarmupCompleted = parseexpiresOnExtraCallback.onExtraCallbackWithResult();
                                        } else if (z) {
                                            parseokhttpVarOnWarmupCompleted = accesspathmatch.onExtraCallbackWithResult();
                                        } else {
                                            parseokhttpVarOnWarmupCompleted = onnavigationevent2 != null ? cookieCompanion.onWarmupCompleted() : parseokhttpVarOnExtraCallbackWithResult;
                                        }
                                        RenderCommand renderCommand2 = RenderCommand.IAuthTabCallback;
                                        renderCommand2.IAuthTabCallback(parseDomain.DRAW);
                                        renderCommand2.onExtraCallback(0, 0, i5, iIAuthTabCallbackDefault2);
                                        RenderCommand.onWarmupCompleted(renderCommand2, null, 1, null);
                                        float f4 = this.onTransact.get((String) RenderObject.onWarmupCompleted(RNSScreenManagerDelegate.onNavigationEvent(), -1674398856, RNSScreenManagerDelegate.onNavigationEvent(), 1674398857, RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{renderObject}, RNSScreenManagerDelegate.onNavigationEvent())) != null ? 0.999f : 1.0f;
                                        parseokhttp parseokhttpVarIAuthTabCallback2 = this.IAuthTabCallbackStub.IAuthTabCallback();
                                        if (gettlsversionsokhttpOnExtraCallback2 != null) {
                                            rectIAuthTabCallback = RectKt.IAuthTabCallback(setUseCaseAttached.Companion.IAuthTabCallback(), ExtensionsManager2.onExtraCallback(parseokhttpVarOnWarmupCompleted.onNavigationEvent().onExtraCallback()));
                                        } else {
                                            rectIAuthTabCallback = (Rect) parseMaxAge.IAuthTabCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1187178152, -1187178151, new Object[]{parsemaxageIAuthTabCallback}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
                                        }
                                        persistentVarIAuthTabCallbackStub.onExtraCallback(parseokhttpVarIAuthTabCallback2, rectIAuthTabCallback2, parseokhttpVarOnWarmupCompleted, rectIAuthTabCallback, f4);
                                        Unit unit5 = Unit.INSTANCE;
                                        return;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        throw th;
                                    }
                                }
                                if (iOnTransact == 2) {
                                    accesspathmatchOnExtraCallbackWithResult.onWarmupCompleted(2, 0.0f, 0.0f, 0.0f, 0.0f, f2 + (((rectIAuthTabCallback2.IAuthTabCallbackStubProxy() + onwarmupcompleted.onWarmupCompleted()) - Float.intBitsToFloat((int) (j2 >> 32))) * fOnExtraCallbackWithResult), f3 + (((rectIAuthTabCallback2.extraCallback() + onwarmupcompleted.onExtraCallback()) - Float.intBitsToFloat((int) j2)) * fOnExtraCallbackWithResult), onwarmupcompleted.asInterface() * fOnExtraCallbackWithResult, onwarmupcompleted.onNavigationEvent());
                                    Unit unit6 = Unit.INSTANCE;
                                } else {
                                    accesspathmatchOnExtraCallbackWithResult.onWarmupCompleted(0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null);
                                    Unit unit7 = Unit.INSTANCE;
                                }
                            }
                            onnavigationevent = onnavigationevent3;
                            if (z) {
                            }
                            if (onnavigationevent != null) {
                            }
                            getTlsVersionsokhttp gettlsversionsokhttpIAuthTabCallback2 = parseexpiresOnExtraCallback.IAuthTabCallback(gettlsversionsokhttpOnExtraCallback, renderObject.onTransact().asBinder());
                            gettlsversionsokhttpOnExtraCallback2 = renderObject.onExtraCallback();
                            int i52 = i;
                            accessdomainmatchOnWarmupCompleted.IAuthTabCallback(this.IAuthTabCallbackStub.IAuthTabCallback(), rectIAuthTabCallback2, gettlsversionsokhttpIAuthTabCallback2, (Rect) parseMaxAge.IAuthTabCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1187178152, -1187178151, new Object[]{parsemaxageIAuthTabCallback}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult()), gettlsversionsokhttpOnExtraCallback2);
                            if (accessdomainmatchOnWarmupCompleted.onExtraCallback()) {
                            }
                            RenderCommand renderCommand22 = RenderCommand.IAuthTabCallback;
                            renderCommand22.IAuthTabCallback(parseDomain.DRAW);
                            renderCommand22.onExtraCallback(0, 0, i52, iIAuthTabCallbackDefault2);
                            RenderCommand.onWarmupCompleted(renderCommand22, null, 1, null);
                            float f42 = this.onTransact.get((String) RenderObject.onWarmupCompleted(RNSScreenManagerDelegate.onNavigationEvent(), -1674398856, RNSScreenManagerDelegate.onNavigationEvent(), 1674398857, RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{renderObject}, RNSScreenManagerDelegate.onNavigationEvent())) != null ? 0.999f : 1.0f;
                            parseokhttp parseokhttpVarIAuthTabCallback22 = this.IAuthTabCallbackStub.IAuthTabCallback();
                            if (gettlsversionsokhttpOnExtraCallback2 != null) {
                            }
                            persistentVarIAuthTabCallbackStub.onExtraCallback(parseokhttpVarIAuthTabCallback22, rectIAuthTabCallback2, parseokhttpVarOnWarmupCompleted, rectIAuthTabCallback, f42);
                            Unit unit52 = Unit.INSTANCE;
                            return;
                        }
                        int i522 = i;
                        accessdomainmatchOnWarmupCompleted.IAuthTabCallback(this.IAuthTabCallbackStub.IAuthTabCallback(), rectIAuthTabCallback2, gettlsversionsokhttpIAuthTabCallback2, (Rect) parseMaxAge.IAuthTabCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1187178152, -1187178151, new Object[]{parsemaxageIAuthTabCallback}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult()), gettlsversionsokhttpOnExtraCallback2);
                        if (accessdomainmatchOnWarmupCompleted.onExtraCallback()) {
                        }
                        RenderCommand renderCommand222 = RenderCommand.IAuthTabCallback;
                        renderCommand222.IAuthTabCallback(parseDomain.DRAW);
                        renderCommand222.onExtraCallback(0, 0, i522, iIAuthTabCallbackDefault2);
                        RenderCommand.onWarmupCompleted(renderCommand222, null, 1, null);
                        float f422 = this.onTransact.get((String) RenderObject.onWarmupCompleted(RNSScreenManagerDelegate.onNavigationEvent(), -1674398856, RNSScreenManagerDelegate.onNavigationEvent(), 1674398857, RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{renderObject}, RNSScreenManagerDelegate.onNavigationEvent())) != null ? 0.999f : 1.0f;
                        parseokhttp parseokhttpVarIAuthTabCallback222 = this.IAuthTabCallbackStub.IAuthTabCallback();
                        if (gettlsversionsokhttpOnExtraCallback2 != null) {
                        }
                        persistentVarIAuthTabCallbackStub.onExtraCallback(parseokhttpVarIAuthTabCallback222, rectIAuthTabCallback2, parseokhttpVarOnWarmupCompleted, rectIAuthTabCallback, f422);
                        Unit unit522 = Unit.INSTANCE;
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                    r37 = obj;
                    i = iIAuthTabCallback_Parcel;
                    j = jOnExtraCallback;
                    long j22 = j;
                    onwarmupcompleted = this.onNavigationEvent.get((String) RenderObject.onWarmupCompleted(RNSScreenManagerDelegate.onNavigationEvent(), -1674398856, RNSScreenManagerDelegate.onNavigationEvent(), 1674398857, RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{renderObject}, RNSScreenManagerDelegate.onNavigationEvent()));
                    if (onwarmupcompleted != null) {
                    }
                    onnavigationevent = onnavigationevent3;
                    if (z) {
                    }
                    if (onnavigationevent != null) {
                    }
                    getTlsVersionsokhttp gettlsversionsokhttpIAuthTabCallback22 = parseexpiresOnExtraCallback.IAuthTabCallback(gettlsversionsokhttpOnExtraCallback, renderObject.onTransact().asBinder());
                    gettlsversionsokhttpOnExtraCallback2 = renderObject.onExtraCallback();
                }
            } catch (Throwable th5) {
                th = th5;
                r37 = obj;
            }
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        secure secureVar = (secure) objArr[0];
        String str = (String) objArr[1];
        synchronized (secureVar.onWarmupCompleted) {
            path pathVar = (path) TypeIntrinsics.asMutableMap(secureVar.IAuthTabCallback).remove(str);
            if (pathVar != null) {
                pathVar.IAuthTabCallbackDefault();
                Unit unit = Unit.INSTANCE;
            }
        }
        if (str == null) {
            return null;
        }
        secureVar.onNavigationEvent.remove(str);
        secureVar.asInterface.remove(str);
        return null;
    }

    public final void onExtraCallback() {
        synchronized (this.onWarmupCompleted) {
            Iterator<Map.Entry<String, path>> it = this.IAuthTabCallback.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().IAuthTabCallbackDefault();
            }
            this.IAuthTabCallback.clear();
            Unit unit = Unit.INSTANCE;
        }
        this.onNavigationEvent.clear();
        this.asInterface.clear();
    }

    public final void onExtraCallback(@Nullable String str) {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        onWarmupCompleted(929987672, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted2, -929987671, new Object[]{this, str});
    }

    public final void onExtraCallback(@NotNull String str, @Nullable basic.onWarmupCompleted onwarmupcompleted) {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        onWarmupCompleted(915914795, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted2, -915914795, new Object[]{this, str, onwarmupcompleted});
    }
}
