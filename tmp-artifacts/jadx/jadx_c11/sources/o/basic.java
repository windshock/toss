package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Point;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.uimanager.LayoutShadowNode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import o.basic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class basic {
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access100;
    private static int getInterfaceDescriptor;
    private static Context onNavigationEvent;
    public static final basic onExtraCallbackWithResult = new basic();
    private static final AtomicBoolean onTransact = new AtomicBoolean(false);
    private static final ConcurrentHashMap<String, findExistingCallWithHost> asInterface = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, String> access000 = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, AtomicBoolean> IAuthTabCallback = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, CopyOnWriteArrayList<WeakReference<Function0<Unit>>>> onExtraCallback = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, Pair<Float, Float>> IAuthTabCallbackDefault = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, onWarmupCompleted> IAuthTabCallbackStub = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, onNavigationEvent> asBinder = new ConcurrentHashMap<>();
    public static final int onWarmupCompleted = 8;

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i4;
        int i8 = ~i;
        int i9 = ~i6;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i6 | i);
        int i12 = i10 | i11;
        int i13 = (~(i7 | i)) | (~(i7 | i9)) | (~(i9 | i));
        int i14 = i + i4 + i3 + (669352129 * i2) + (266941808 * i5);
        int i15 = i14 * i14;
        int i16 = (720661947 * i) + 1572077568 + ((-1243901369) * i4) + (1165201990 * i12) + (i11 * (-1165201990)) + ((-1165201990) * i13) + (1885863936 * i3) + ((-1100480512) * i2) + ((-1249902592) * i5) + ((-491520000) * i15);
        int i17 = (i * 1617402437) + 56426783 + (i4 * 1617401273) + (i12 * (-582)) + (i11 * 582) + (i13 * 582) + (i3 * 1617401855) + (i2 * 1244927807) + (i5 * (-404665712)) + (i15 * (-45350912));
        int i18 = i16 + (i17 * i17 * 1565261824);
        return i18 != 1 ? i18 != 2 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 37;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str);
        int i4 = getInterfaceDescriptor + 87;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    private basic() {
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallbackStub = 0;
        private static int access100 = 1;
        private final float IAuthTabCallback;
        private final int IAuthTabCallbackDefault;
        private final float asBinder;
        private final float asInterface;
        private final float onExtraCallback;
        private final float[] onExtraCallbackWithResult;
        private final float onNavigationEvent;
        private final float onTransact;
        private final float onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (this.IAuthTabCallbackDefault != onwarmupcompleted.IAuthTabCallbackDefault) {
                int i2 = IAuthTabCallbackStub + 63;
                access100 = i2 % 128;
                return i2 % 2 == 0;
            }
            if (Float.compare(this.onTransact, onwarmupcompleted.onTransact) != 0) {
                int i3 = access100 + 59;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (Float.compare(this.asInterface, onwarmupcompleted.asInterface) == 0) {
                return Float.compare(this.IAuthTabCallback, onwarmupcompleted.IAuthTabCallback) == 0 && Float.compare(this.onNavigationEvent, onwarmupcompleted.onNavigationEvent) == 0 && Float.compare(this.onExtraCallback, onwarmupcompleted.onExtraCallback) == 0 && Float.compare(this.onWarmupCompleted, onwarmupcompleted.onWarmupCompleted) == 0 && Float.compare(this.asBinder, onwarmupcompleted.asBinder) == 0 && Intrinsics.areEqual(this.onExtraCallbackWithResult, onwarmupcompleted.onExtraCallbackWithResult);
            }
            int i5 = IAuthTabCallbackStub + 101;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = access100 + 81;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((((((((((((Integer.hashCode(this.IAuthTabCallbackDefault) * 31) + Float.hashCode(this.onTransact)) * 31) + Float.hashCode(this.asInterface)) * 31) + Float.hashCode(this.IAuthTabCallback)) * 31) + Float.hashCode(this.onNavigationEvent)) * 31) + Float.hashCode(this.onExtraCallback)) * 31) + Float.hashCode(this.onWarmupCompleted)) * 31) + Float.hashCode(this.asBinder)) * 31) + Arrays.hashCode(this.onExtraCallbackWithResult);
            int i4 = IAuthTabCallbackStub + 57;
            access100 = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ProgressiveBlurParams(type=" + this.IAuthTabCallbackDefault + ", startX=" + this.onTransact + ", startY=" + this.asInterface + ", endX=" + this.IAuthTabCallback + ", endY=" + this.onNavigationEvent + ", centerX=" + this.onExtraCallback + ", centerY=" + this.onWarmupCompleted + ", radius=" + this.asBinder + ", interpolatorValues=" + Arrays.toString(this.onExtraCallbackWithResult) + ")";
            int i2 = access100 + 43;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onWarmupCompleted(int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, @NotNull float[] fArr) {
            Intrinsics.checkNotNullParameter(fArr, "");
            this.IAuthTabCallbackDefault = i;
            this.onTransact = f;
            this.asInterface = f2;
            this.IAuthTabCallback = f3;
            this.onNavigationEvent = f4;
            this.onExtraCallback = f5;
            this.onWarmupCompleted = f6;
            this.asBinder = f7;
            this.onExtraCallbackWithResult = fArr;
        }

        public final int onTransact() {
            int i;
            int i2 = 2 % 2;
            int i3 = access100 + 85;
            int i4 = i3 % 128;
            IAuthTabCallbackStub = i4;
            if (i3 % 2 != 0) {
                i = this.IAuthTabCallbackDefault;
                int i5 = 26 / 0;
            } else {
                i = this.IAuthTabCallbackDefault;
            }
            int i6 = i4 + 53;
            access100 = i6 % 128;
            if (i6 % 2 != 0) {
                return i;
            }
            throw null;
        }

        public final float asBinder() {
            int i = 2 % 2;
            int i2 = access100 + 81;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            float f = this.onTransact;
            int i4 = i3 + 53;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            return f;
        }

        public final float IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = access100;
            int i3 = i2 + 95;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            float f = this.asInterface;
            int i5 = i2 + 97;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 96 / 0;
            }
            return f;
        }

        public final float IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = access100 + 11;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            float f = this.IAuthTabCallback;
            int i4 = i3 + 109;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            return f;
        }

        public final float onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = access100 + 71;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onNavigationEvent;
            }
            throw null;
        }

        public final float onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 67;
            int i3 = i2 % 128;
            access100 = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            float f = this.onExtraCallback;
            int i4 = i3 + 79;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 35 / 0;
            }
            return f;
        }

        public final float onExtraCallback() {
            int i = 2 % 2;
            int i2 = access100 + 39;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            float f = this.onWarmupCompleted;
            int i4 = i3 + 79;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            return f;
        }

        public final float asInterface() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 5;
            int i3 = i2 % 128;
            access100 = i3;
            int i4 = i2 % 2;
            float f = this.asBinder;
            int i5 = i3 + 89;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public final float[] onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 23;
            int i3 = i2 % 128;
            access100 = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            float[] fArr = this.onExtraCallbackWithResult;
            int i4 = i3 + 105;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return fArr;
        }
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallbackDefault = 1;
        private static int asBinder = 0;
        private static int asInterface = 0;
        private static int getInterfaceDescriptor = 1;
        private final String IAuthTabCallback;
        private final String IAuthTabCallbackStub;
        private final String onExtraCallback;
        private final Float onNavigationEvent;
        private final String onTransact;
        private final String onWarmupCompleted;
        public static final C0011onNavigationEvent Companion = new C0011onNavigationEvent(null);
        private static final Regex onExtraCallbackWithResult = new Regex("\\buniform\\s+(?:(?:lowp|mediump|highp)\\s+)?float\\s+a\\s*;");

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this != obj) {
                if (!(!(obj instanceof onNavigationEvent))) {
                    onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
                    return Intrinsics.areEqual(this.onWarmupCompleted, onnavigationevent.onWarmupCompleted) && Intrinsics.areEqual(this.IAuthTabCallbackStub, onnavigationevent.IAuthTabCallbackStub) && Intrinsics.areEqual(this.IAuthTabCallback, onnavigationevent.IAuthTabCallback) && !(Intrinsics.areEqual(this.onTransact, onnavigationevent.onTransact) ^ true) && Intrinsics.areEqual(this.onExtraCallback, onnavigationevent.onExtraCallback) && Intrinsics.areEqual(this.onNavigationEvent, onnavigationevent.onNavigationEvent);
                }
                int i2 = asInterface + 73;
                getInterfaceDescriptor = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = asInterface + 33;
            int i5 = i4 % 128;
            getInterfaceDescriptor = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 61;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            int iHashCode3 = this.onWarmupCompleted.hashCode();
            String str = this.IAuthTabCallbackStub;
            int iHashCode4 = 0;
            if (str == null) {
                int i2 = getInterfaceDescriptor + 73;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            String str2 = this.IAuthTabCallback;
            int iHashCode5 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.onTransact;
            int iHashCode6 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.onExtraCallback;
            if (str4 == null) {
                int i4 = asInterface;
                int i5 = i4 + 79;
                getInterfaceDescriptor = i5 % 128;
                iHashCode2 = i5 % 2 == 0 ? 1 : 0;
                int i6 = i4 + 59;
                getInterfaceDescriptor = i6 % 128;
                int i7 = i6 % 2;
            } else {
                iHashCode2 = str4.hashCode();
            }
            Float f = this.onNavigationEvent;
            if (f != null) {
                int i8 = getInterfaceDescriptor + 83;
                asInterface = i8 % 128;
                if (i8 % 2 != 0) {
                    int iHashCode7 = f.hashCode();
                    int i9 = 55 / 0;
                    iHashCode4 = iHashCode7;
                } else {
                    iHashCode4 = f.hashCode();
                }
            }
            return (((((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode2) * 31) + iHashCode4;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ShaderEffectParams(name=" + this.onWarmupCompleted + ", vertexShader=" + this.IAuthTabCallbackStub + ", fragmentShader=" + this.IAuthTabCallback + ", vertexShaderFileName=" + this.onTransact + ", fragmentShaderFileName=" + this.onExtraCallback + ", fraction=" + this.onNavigationEvent + ")";
            int i2 = asInterface + 59;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 77 / 0;
            }
            return str;
        }

        public onNavigationEvent(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Float f) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onWarmupCompleted = str;
            this.IAuthTabCallbackStub = str2;
            this.IAuthTabCallback = str3;
            this.onTransact = str4;
            this.onExtraCallback = str5;
            this.onNavigationEvent = f;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onNavigationEvent(String str, String str2, String str3, String str4, String str5, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str6;
            String str7;
            String str8;
            Float f2 = null;
            if ((i & 2) != 0) {
                int i2 = getInterfaceDescriptor + 97;
                asInterface = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 4 % 2;
                } else {
                    int i4 = 2 % 2;
                }
                str6 = null;
            } else {
                str6 = str2;
            }
            if ((i & 4) != 0) {
                int i5 = 2 % 2;
                str7 = null;
            } else {
                str7 = str3;
            }
            if ((i & 8) != 0) {
                int i6 = getInterfaceDescriptor + 43;
                asInterface = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 2 % 2;
                }
                str8 = null;
            } else {
                str8 = str4;
            }
            String str9 = (i & 16) != 0 ? null : str5;
            if ((i & 32) != 0) {
                int i8 = getInterfaceDescriptor;
                int i9 = i8 + 61;
                asInterface = i9 % 128;
                int i10 = i9 % 2;
                int i11 = i8 + 27;
                asInterface = i11 % 128;
                int i12 = i11 % 2;
                int i13 = 2 % 2;
            } else {
                f2 = f;
            }
            this(str, str6, str7, str8, str9, f2);
        }

        public static final /* synthetic */ Regex onExtraCallback() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 59;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Regex regex = onExtraCallbackWithResult;
            if (i3 != 0) {
                int i4 = 15 / 0;
            }
            return regex;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 17;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onWarmupCompleted;
            int i5 = i2 + 105;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final String IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 77;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            String str = this.IAuthTabCallbackStub;
            int i5 = i2 + 123;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 62 / 0;
            }
            return str;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 53;
            int i3 = i2 % 128;
            asInterface = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.IAuthTabCallback;
            int i4 = i3 + 97;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final String onTransact() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor;
            int i3 = i2 + 49;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onTransact;
            int i5 = i2 + 85;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 73;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onExtraCallback;
            int i5 = i2 + 49;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 66 / 0;
            }
            return str;
        }

        public final Float onNavigationEvent() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor;
            int i3 = i2 + 1;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            Float f = this.onNavigationEvent;
            int i5 = i2 + 15;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        /* renamed from: o.basic$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        public static final class C0011onNavigationEvent {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public /* synthetic */ C0011onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0011onNavigationEvent() {
            }

            public final Regex IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 13;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    onNavigationEvent.onExtraCallback();
                    throw null;
                }
                Regex regexOnExtraCallback = onNavigationEvent.onExtraCallback();
                int i3 = onExtraCallback + 39;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return regexOnExtraCallback;
            }
        }

        static {
            int i = asBinder + 19;
            IAuthTabCallbackDefault = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }

    static {
        int i = IAuthTabCallback_Parcel + 85;
        access100 = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        basic basicVar = (basic) objArr[0];
        Context context = (Context) objArr[1];
        synchronized (basicVar) {
            Intrinsics.checkNotNullParameter(context, "");
            if (onTransact.compareAndSet(false, true)) {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                onNavigationEvent = applicationContext;
            }
        }
        return null;
    }

    private static final Unit IAuthTabCallback(String str) {
        int i = 2 % 2;
        AtomicBoolean atomicBoolean = IAuthTabCallback.get(str);
        if (atomicBoolean != null) {
            int i2 = IAuthTabCallbackStubProxy + 1;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 == 0 ? atomicBoolean.compareAndSet(false, true) : !atomicBoolean.compareAndSet(true, false)) {
                ArrayList arrayList = new ArrayList();
                Iterator<Map.Entry<String, CopyOnWriteArrayList<WeakReference<Function0<Unit>>>>> it = onExtraCallback.entrySet().iterator();
                while (it.hasNext()) {
                    int i3 = getInterfaceDescriptor + 21;
                    IAuthTabCallbackStubProxy = i3 % 128;
                    if (i3 % 2 == 0) {
                        Map.Entry<String, CopyOnWriteArrayList<WeakReference<Function0<Unit>>>> next = it.next();
                        String key = next.getKey();
                        next.getValue();
                        Intrinsics.areEqual(access000.get(key), str);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    Map.Entry<String, CopyOnWriteArrayList<WeakReference<Function0<Unit>>>> next2 = it.next();
                    String key2 = next2.getKey();
                    CopyOnWriteArrayList<WeakReference<Function0<Unit>>> value = next2.getValue();
                    if (Intrinsics.areEqual(access000.get(key2), str)) {
                        ArrayList<Function0> arrayList2 = new ArrayList();
                        Iterator<T> it2 = value.iterator();
                        int i4 = IAuthTabCallbackStubProxy + 9;
                        getInterfaceDescriptor = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = 4 / 5;
                        }
                        while (it2.hasNext()) {
                            Function0 function0 = (Function0) ((WeakReference) it2.next()).get();
                            if (function0 != null) {
                                arrayList2.add(function0);
                            }
                        }
                        for (Function0 function02 : arrayList2) {
                            try {
                                Result.Companion companion = Result.Companion;
                                function02.invoke();
                                Result.constructor-impl(Unit.INSTANCE);
                                int i6 = IAuthTabCallbackStubProxy + 91;
                                getInterfaceDescriptor = i6 % 128;
                                if (i6 % 2 != 0) {
                                    int i7 = 3 % 4;
                                }
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.Companion;
                                Result.constructor-impl(ResultKt.createFailure(th));
                            }
                        }
                        arrayList.add(key2);
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    onExtraCallback.remove((String) it3.next());
                }
            }
        }
        return Unit.INSTANCE;
    }

    public final void IAuthTabCallback(@NotNull String str, @NotNull View view, @NotNull Surface surface, @NotNull Size size, int i, @NotNull String str2) {
        ViewGroup viewGroup;
        CopyOnWriteArrayList<WeakReference<Function0<Unit>>> copyOnWriteArrayList;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(surface, "");
        Intrinsics.checkNotNullParameter(size, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!onTransact.get()) {
            int i3 = getInterfaceDescriptor + 41;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 == 0) {
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
                onExtraCallback(-1447607608, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1447607609, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{this, context}, iOnNavigationEvent);
                int i4 = 69 / 0;
            } else {
                Context context2 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
                onExtraCallback(-1447607608, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1447607609, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{this, context2}, iOnNavigationEvent2);
            }
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            int i5 = getInterfaceDescriptor + 57;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            final String strValueOf = String.valueOf(viewGroup.hashCode());
            access000.put(str, strValueOf);
            ConcurrentHashMap<String, AtomicBoolean> concurrentHashMap = IAuthTabCallback;
            concurrentHashMap.putIfAbsent(strValueOf, new AtomicBoolean(false));
            ConcurrentHashMap<String, findExistingCallWithHost> concurrentHashMap2 = asInterface;
            findExistingCallWithHost findexistingcallwithhostPutIfAbsent = concurrentHashMap2.get(strValueOf);
            if (findexistingcallwithhostPutIfAbsent == null) {
                Context context3 = onNavigationEvent;
                if (context3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    context3 = null;
                }
                AssetManager assets = context3.getAssets();
                Intrinsics.checkNotNullExpressionValue(assets, "");
                findExistingCallWithHost findexistingcallwithhost = new findExistingCallWithHost(viewGroup, i, str2, assets, new Function0() { // from class: im.toss.tds.graphics.gl.view.UiLayerRendererCore$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke() {
                        int i6 = 2 % 2;
                        int i7 = IAuthTabCallback + 69;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unitOnWarmupCompleted = basic.onWarmupCompleted(strValueOf);
                        int i9 = IAuthTabCallback + 5;
                        onExtraCallbackWithResult = i9 % 128;
                        if (i9 % 2 == 0) {
                            int i10 = 24 / 0;
                        }
                        return unitOnWarmupCompleted;
                    }
                });
                findexistingcallwithhostPutIfAbsent = concurrentHashMap2.putIfAbsent(strValueOf, findexistingcallwithhost);
                if (findexistingcallwithhostPutIfAbsent == null) {
                    findexistingcallwithhostPutIfAbsent = findexistingcallwithhost;
                }
            }
            findExistingCallWithHost findexistingcallwithhost2 = findexistingcallwithhostPutIfAbsent;
            findexistingcallwithhost2.onWarmupCompleted(str, surface, new Point(size.getWidth(), size.getHeight()));
            ConcurrentHashMap<String, Pair<Float, Float>> concurrentHashMap3 = IAuthTabCallbackDefault;
            Pair<Float, Float> pair = concurrentHashMap3.get(str);
            if (pair != null) {
                int i6 = getInterfaceDescriptor + 27;
                IAuthTabCallbackStubProxy = i6 % 128;
                if (i6 % 2 == 0) {
                    findexistingcallwithhost2.IAuthTabCallback(str, ((Number) pair.onExtraCallbackWithResult()).floatValue(), ((Number) pair.IAuthTabCallback()).floatValue());
                    concurrentHashMap3.remove(str);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                findexistingcallwithhost2.IAuthTabCallback(str, ((Number) pair.onExtraCallbackWithResult()).floatValue(), ((Number) pair.IAuthTabCallback()).floatValue());
                concurrentHashMap3.remove(str);
            }
            ConcurrentHashMap<String, onWarmupCompleted> concurrentHashMap4 = IAuthTabCallbackStub;
            onWarmupCompleted onwarmupcompleted = concurrentHashMap4.get(str);
            if (onwarmupcompleted != null) {
                findExistingCallWithHost.IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 1103942702, -1103942702, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{findexistingcallwithhost2, str, onwarmupcompleted});
                concurrentHashMap4.remove(str);
            }
            ConcurrentHashMap<String, onNavigationEvent> concurrentHashMap5 = asBinder;
            onNavigationEvent onnavigationevent = concurrentHashMap5.get(str);
            if (onnavigationevent != null) {
                int i7 = getInterfaceDescriptor + 69;
                IAuthTabCallbackStubProxy = i7 % 128;
                int i8 = i7 % 2;
                findexistingcallwithhost2.onExtraCallback(str, onnavigationevent);
                concurrentHashMap5.remove(str);
            }
            AtomicBoolean atomicBoolean = concurrentHashMap.get(strValueOf);
            if (atomicBoolean == null || !atomicBoolean.get()) {
                return;
            }
            int i9 = getInterfaceDescriptor + 31;
            IAuthTabCallbackStubProxy = i9 % 128;
            if (i9 % 2 == 0) {
                copyOnWriteArrayList = onExtraCallback.get(str);
                int i10 = 76 / 0;
                if (copyOnWriteArrayList == null) {
                    return;
                }
            } else {
                copyOnWriteArrayList = onExtraCallback.get(str);
                if (copyOnWriteArrayList == null) {
                    return;
                }
            }
            ArrayList<Function0> arrayList = new ArrayList();
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                int i11 = IAuthTabCallbackStubProxy + 33;
                getInterfaceDescriptor = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
                Function0 function0 = (Function0) ((WeakReference) it.next()).get();
                if (function0 != null) {
                    arrayList.add(function0);
                }
            }
            for (Function0 function02 : arrayList) {
                try {
                    Result.Companion companion = Result.Companion;
                    function02.invoke();
                    Result.constructor-impl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    Result.constructor-impl(ResultKt.createFailure(th));
                }
            }
            onExtraCallback.remove(str);
        }
    }

    public final void IAuthTabCallback(@NotNull String str, @NotNull Function0<Unit> function0) {
        CopyOnWriteArrayList<WeakReference<Function0<Unit>>> copyOnWriteArrayListPutIfAbsent;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        String str2 = access000.get(str);
        Object obj = null;
        if (str2 != null) {
            int i2 = IAuthTabCallbackStubProxy + 95;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 != 0) {
                IAuthTabCallback.get(str2);
                obj.hashCode();
                throw null;
            }
            AtomicBoolean atomicBoolean = IAuthTabCallback.get(str2);
            if (atomicBoolean != null && atomicBoolean.get()) {
                try {
                    Result.Companion companion = Result.Companion;
                    function0.invoke();
                    Result.constructor-impl(Unit.INSTANCE);
                    return;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    Result.constructor-impl(ResultKt.createFailure(th));
                    return;
                }
            }
        }
        ConcurrentHashMap<String, CopyOnWriteArrayList<WeakReference<Function0<Unit>>>> concurrentHashMap = onExtraCallback;
        CopyOnWriteArrayList<WeakReference<Function0<Unit>>> copyOnWriteArrayList = concurrentHashMap.get(str);
        if (copyOnWriteArrayList == null && (copyOnWriteArrayListPutIfAbsent = concurrentHashMap.putIfAbsent(str, (copyOnWriteArrayList = new CopyOnWriteArrayList<>()))) != null) {
            int i3 = getInterfaceDescriptor + 1;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            copyOnWriteArrayList = copyOnWriteArrayListPutIfAbsent;
        }
        CopyOnWriteArrayList<WeakReference<Function0<Unit>>> copyOnWriteArrayList2 = copyOnWriteArrayList;
        Intrinsics.checkNotNull(copyOnWriteArrayList2);
        if (copyOnWriteArrayList2.isEmpty()) {
            copyOnWriteArrayList2.add(new WeakReference<>(function0));
            int i5 = getInterfaceDescriptor + 31;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
        } else {
            Iterator<T> it = copyOnWriteArrayList2.iterator();
            while (it.hasNext()) {
                int i7 = getInterfaceDescriptor + 57;
                IAuthTabCallbackStubProxy = i7 % 128;
                if (i7 % 2 == 0) {
                    ((WeakReference) it.next()).get();
                    obj.hashCode();
                    throw null;
                }
                if (((WeakReference) it.next()).get() == function0) {
                    break;
                }
            }
            copyOnWriteArrayList2.add(new WeakReference<>(function0));
            int i52 = getInterfaceDescriptor + 31;
            IAuthTabCallbackStubProxy = i52 % 128;
            int i62 = i52 % 2;
        }
        onTransact(str);
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 39;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        CopyOnWriteArrayList<WeakReference<Function0<Unit>>> copyOnWriteArrayList = onExtraCallback.get(str);
        if (copyOnWriteArrayList != null) {
            int i4 = getInterfaceDescriptor + 59;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.checkNotNullExpressionValue(copyOnWriteArrayList.iterator(), "");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Iterator<WeakReference<Function0<Unit>>> it = copyOnWriteArrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                int i5 = getInterfaceDescriptor + 101;
                IAuthTabCallbackStubProxy = i5 % 128;
                int i6 = i5 % 2;
                WeakReference<Function0<Unit>> next = it.next();
                Function0<Unit> function02 = next.get();
                if (function02 == null || function02 == function0) {
                    copyOnWriteArrayList.remove(next);
                }
            }
            if (copyOnWriteArrayList.isEmpty()) {
                onExtraCallback.remove(str);
            }
        }
    }

    private final void onTransact(String str) {
        int i = 2 % 2;
        CopyOnWriteArrayList<WeakReference<Function0<Unit>>> copyOnWriteArrayList = onExtraCallback.get(str);
        if (copyOnWriteArrayList != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                int i2 = getInterfaceDescriptor + 7;
                IAuthTabCallbackStubProxy = i2 % 128;
                int i3 = i2 % 2;
                if (((WeakReference) obj).get() == null) {
                    int i4 = IAuthTabCallbackStubProxy + 75;
                    getInterfaceDescriptor = i4 % 128;
                    int i5 = i4 % 2;
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int i6 = IAuthTabCallbackStubProxy + 65;
                getInterfaceDescriptor = i6 % 128;
                if (i6 % 2 != 0) {
                    copyOnWriteArrayList.remove((WeakReference) it.next());
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                copyOnWriteArrayList.remove((WeakReference) it.next());
            }
            if (copyOnWriteArrayList.isEmpty()) {
                onExtraCallback.remove(str);
                int i7 = getInterfaceDescriptor + 1;
                IAuthTabCallbackStubProxy = i7 % 128;
                int i8 = i7 % 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c A[PHI: r11
      0x006c: PHI (r11v9 o.findExistingCallWithHost) = (r11v8 o.findExistingCallWithHost), (r11v12 o.findExistingCallWithHost) binds: [B:16:0x006a, B:13:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull String str) {
        findExistingCallWithHost findexistingcallwithhostRemove;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ConcurrentHashMap<String, String> concurrentHashMap = access000;
        String str2 = concurrentHashMap.get(str);
        if (str2 != null) {
            int i2 = IAuthTabCallbackStubProxy + 103;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            ConcurrentHashMap<String, findExistingCallWithHost> concurrentHashMap2 = asInterface;
            findExistingCallWithHost findexistingcallwithhost = concurrentHashMap2.get(str2);
            if (findexistingcallwithhost != null) {
                findexistingcallwithhost.onNavigationEvent(str);
            }
            concurrentHashMap.remove(str);
            onExtraCallback.remove(str);
            IAuthTabCallbackDefault.remove(str);
            IAuthTabCallbackStub.remove(str);
            asBinder.remove(str);
            if (!(!concurrentHashMap.values().contains(str2))) {
                return;
            }
            int i4 = IAuthTabCallbackStubProxy + 71;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                findexistingcallwithhostRemove = concurrentHashMap2.remove(str2);
                int i5 = 75 / 0;
                if (findexistingcallwithhostRemove != null) {
                    findExistingCallWithHost.IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -1156102849, 1156102856, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{findexistingcallwithhostRemove});
                }
            } else {
                findexistingcallwithhostRemove = concurrentHashMap2.remove(str2);
                if (findexistingcallwithhostRemove != null) {
                }
            }
            IAuthTabCallback.remove(str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0049, code lost:
    
        if ((r5 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        r1 = o.basic.asInterface.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (r1 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        r2 = o.basic.getInterfaceDescriptor + 31;
        o.basic.IAuthTabCallbackStubProxy = r2 % 128;
        r2 = r2 % 2;
        r1.IAuthTabCallback(r5, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        o.basic.IAuthTabCallbackDefault.put(r5, o.getWrite.IAuthTabCallback(java.lang.Float.valueOf(r6), java.lang.Float.valueOf(r7)));
        r5 = o.basic.IAuthTabCallbackStubProxy + 67;
        o.basic.getInterfaceDescriptor = r5 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(@NotNull String str, float f, float f2) {
        String str2;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            str2 = access000.get(str);
            int i3 = 92 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            str2 = access000.get(str);
        }
    }

    public final void onWarmupCompleted(@NotNull String str, @NotNull deprecated_secure deprecated_secureVar) {
        findExistingCallWithHost findexistingcallwithhost;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(deprecated_secureVar, "");
        String str2 = access000.get(str);
        if (str2 == null || (findexistingcallwithhost = asInterface.get(str2)) == null) {
            return;
        }
        int i2 = getInterfaceDescriptor + 115;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        findexistingcallwithhost.IAuthTabCallback(str, deprecated_secureVar);
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        int i5 = getInterfaceDescriptor + 27;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onExtraCallback(@NotNull String str, @Nullable Integer num) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = access000.get(str);
        if (str2 != null) {
            int i2 = IAuthTabCallbackStubProxy + 101;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 != 0) {
                asInterface.get(str2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            findExistingCallWithHost findexistingcallwithhost = asInterface.get(str2);
            if (findexistingcallwithhost != null) {
                findexistingcallwithhost.onExtraCallbackWithResult(num);
            }
        }
        int i3 = getInterfaceDescriptor + 81;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        String str = (String) objArr[1];
        onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) objArr[2];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 103;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = access000.get(str);
        if (str2 != null) {
            findExistingCallWithHost findexistingcallwithhost = asInterface.get(str2);
            if (findexistingcallwithhost != null) {
                int i4 = IAuthTabCallbackStubProxy + 59;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
                int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
                findExistingCallWithHost.IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 1103942702, -1103942702, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent, new Object[]{findexistingcallwithhost, str, onwarmupcompleted});
            }
            return null;
        }
        int i6 = IAuthTabCallbackStubProxy + 117;
        int i7 = i6 % 128;
        getInterfaceDescriptor = i7;
        int i8 = i6 % 2;
        if (onwarmupcompleted != null) {
            IAuthTabCallbackStub.put(str, onwarmupcompleted);
            return null;
        }
        int i9 = i7 + 47;
        IAuthTabCallbackStubProxy = i9 % 128;
        if (i9 % 2 == 0) {
            IAuthTabCallbackStub.remove(str);
            int i10 = 17 / 0;
        } else {
            IAuthTabCallbackStub.remove(str);
        }
        return null;
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @Nullable onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = access000.get(str);
        if (str2 != null) {
            findExistingCallWithHost findexistingcallwithhost = asInterface.get(str2);
            if (findexistingcallwithhost != null) {
                int i2 = getInterfaceDescriptor + 67;
                IAuthTabCallbackStubProxy = i2 % 128;
                int i3 = i2 % 2;
                findexistingcallwithhost.onExtraCallback(str, onnavigationevent);
                if (i3 == 0) {
                    throw null;
                }
                return;
            }
            return;
        }
        int i4 = getInterfaceDescriptor + 3;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        if (onnavigationevent == null) {
            asBinder.remove(str);
            return;
        }
        asBinder.put(str, onnavigationevent);
        int i6 = IAuthTabCallbackStubProxy + 35;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = access000.get(str);
        if (str2 != null) {
            int i2 = getInterfaceDescriptor + 67;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            findExistingCallWithHost findexistingcallwithhost = asInterface.get(str2);
            if (findexistingcallwithhost != null) {
                int i4 = IAuthTabCallbackStubProxy + 89;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
                findexistingcallwithhost.IAuthTabCallback();
                if (i5 != 0) {
                    throw null;
                }
            }
        }
        int i6 = getInterfaceDescriptor + 71;
        IAuthTabCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void onExtraCallback() {
        Iterator it;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Collection<findExistingCallWithHost> collectionValues = asInterface.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "");
            it = collectionValues.iterator();
            int i3 = 48 / 0;
        } else {
            Collection<findExistingCallWithHost> collectionValues2 = asInterface.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues2, "");
            it = collectionValues2.iterator();
        }
        while (it.hasNext()) {
            int i4 = getInterfaceDescriptor + 109;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            ((findExistingCallWithHost) it.next()).IAuthTabCallback();
            int i6 = getInterfaceDescriptor + 35;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        findExistingCallWithHost findexistingcallwithhost;
        String str = (String) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = access000.get(str);
        if (str2 == null) {
            return null;
        }
        int i2 = getInterfaceDescriptor + 81;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            findexistingcallwithhost = asInterface.get(str2);
            int i3 = 53 / 0;
            if (findexistingcallwithhost == null) {
                return null;
            }
        } else {
            findexistingcallwithhost = asInterface.get(str2);
            if (findexistingcallwithhost == null) {
                return null;
            }
        }
        findexistingcallwithhost.onWarmupCompleted(str, fFloatValue);
        int i4 = getInterfaceDescriptor + 59;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void onNavigationEvent(@NotNull String str, float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 19;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = access000.get(str);
        if (str2 != null) {
            int i4 = getInterfaceDescriptor + 27;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                asInterface.get(str2);
                throw null;
            }
            findExistingCallWithHost findexistingcallwithhost = asInterface.get(str2);
            if (findexistingcallwithhost != null) {
                findexistingcallwithhost.onWarmupCompleted(str, f, f2, f3);
            }
        }
    }

    public final void onExtraCallbackWithResult(@NotNull String str) {
        findExistingCallWithHost findexistingcallwithhost;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = access000.get(str);
        if (str2 != null && (findexistingcallwithhost = asInterface.get(str2)) != null) {
            int i2 = IAuthTabCallbackStubProxy + 117;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            findexistingcallwithhost.onExtraCallbackWithResult(str);
            if (i3 != 0) {
                int i4 = 12 / 0;
            }
        }
        int i5 = getInterfaceDescriptor + 5;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onNavigationEvent(@NotNull Context context) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        onExtraCallback(-1447607608, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent2, 1447607609, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{this, context}, iOnNavigationEvent);
    }

    public final void onWarmupCompleted(@NotNull String str, float f) {
        Object[] objArr = {this, str, Float.valueOf(f)};
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        onExtraCallback(-556633724, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 556633724, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), objArr, iOnNavigationEvent);
    }

    public final void IAuthTabCallback(@NotNull String str, @Nullable onWarmupCompleted onwarmupcompleted) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        onExtraCallback(-1951306524, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent2, 1951306526, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{this, str, onwarmupcompleted}, iOnNavigationEvent);
    }
}
