package o;

import android.util.DisplayMetrics;
import im.toss.observability.instrumentation.memory.PssReader$;
import im.toss.securities.core.router.spec.TossSecRoute;
import java.util.regex.Matcher;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class isCreativeDebuggerEnabled {
    private static int IAuthTabCallback_Parcel = 1;
    private static int onTransact;
    private Float IAuthTabCallback;
    private onExtraCallback IAuthTabCallbackDefault;
    private Function1<? super Float, Unit> IAuthTabCallbackStub;
    private Float asBinder;
    private Float asInterface;
    private Float onExtraCallback;
    private Float onExtraCallbackWithResult;
    private onExtraCallback onNavigationEvent;
    private boolean onWarmupCompleted;

    public /* synthetic */ isCreativeDebuggerEnabled(Float f, Float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }

    public /* synthetic */ isCreativeDebuggerEnabled(Float f, onExtraCallback onextracallback, Float f2, onExtraCallback onextracallback2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, onextracallback, f2, onextracallback2);
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i6);
        int i11 = ~i5;
        int i12 = (~(i8 | i11 | i)) | i10;
        int i13 = (~(i6 | i11)) | (~(i7 | i11));
        int i14 = i + i5 + i4 + (1941422536 * i3) + ((-555707305) * i2);
        int i15 = i14 * i14;
        int i16 = (i * (-2131549542)) + 177471488 + ((-2131549542) * i5) + (i9 * (-207299225)) + (i12 * (-207299225)) + ((-207299225) * i13) + (1956118528 * i4) + ((-1363148800) * i3) + (2141716480 * i2) + ((-573308928) * i15);
        int i17 = ((i * 487360618) - 1291405921) + (i5 * 487360618) + (i9 * 543) + (i12 * 543) + (i13 * 543) + (i4 * 487361161) + (i3 * (-1188264952)) + (i2 * 624576655) + (i15 * (-25952256));
        return i16 + ((i17 * i17) * 74186752) != 1 ? onExtraCallback(objArr) : onWarmupCompleted(objArr);
    }

    public abstract setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled IAuthTabCallback();

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        isCreativeDebuggerEnabled iscreativedebuggerenabled = (isCreativeDebuggerEnabled) objArr[0];
        Float f = (Float) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 95;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        iscreativedebuggerenabled.onExtraCallbackWithResult = f;
        if (i3 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final Float IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 15;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }

    public final void IAuthTabCallback(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 35;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        this.asBinder = f;
        int i5 = i3 + 107;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final Float asInterface() {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Float f = this.asBinder;
        int i4 = i3 + 113;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    public final onExtraCallback onTransact() {
        onExtraCallback onextracallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 67;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 != 0) {
            onextracallback = this.onNavigationEvent;
            int i4 = 41 / 0;
        } else {
            onextracallback = this.onNavigationEvent;
        }
        int i5 = i3 + 123;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return onextracallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        isCreativeDebuggerEnabled iscreativedebuggerenabled = (isCreativeDebuggerEnabled) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 55;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback onextracallback = iscreativedebuggerenabled.IAuthTabCallbackDefault;
        int i5 = i2 + 75;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 63 / 0;
        }
        return onextracallback;
    }

    public final Float asBinder() {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Float f = this.IAuthTabCallback;
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        return f;
    }

    public final void onExtraCallbackWithResult(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 81;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback = f;
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
    }

    public final Float IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 31;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return this.asInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 79;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        this.asInterface = f;
        if (i3 != 0) {
            throw null;
        }
    }

    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 93;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z = this.onWarmupCompleted;
        int i4 = i2 + 101;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 113;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        if (this.onNavigationEvent == null && this.IAuthTabCallbackDefault == null) {
            int i5 = i2 + 105;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = i2 + 47;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    private isCreativeDebuggerEnabled(Float f, Float f2) {
        this(f, null, f2, null, null);
    }

    private isCreativeDebuggerEnabled(Float f, onExtraCallback onextracallback, Float f2, onExtraCallback onextracallback2) {
        this.onWarmupCompleted = true;
        this.onExtraCallbackWithResult = f;
        this.onNavigationEvent = onextracallback;
        this.asBinder = f2;
        this.IAuthTabCallbackDefault = onextracallback2;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        public static final C0038onExtraCallback Companion;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        public static final onExtraCallback Plus = new onExtraCallback("Plus", 0);
        public static final onExtraCallback Minus = new onExtraCallback("Minus", 1);
        public static final onExtraCallback Multiply = new onExtraCallback("Multiply", 2);
        public static final onExtraCallback Divide = new onExtraCallback("Divide", 3);

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 105;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallback[] onextracallbackArr = {Plus, Minus, Multiply, Divide};
            int i5 = i2 + 77;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 61;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i5 = i2 + 89;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            if (i3 == 0) {
                return onextracallback;
            }
            throw null;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            int i4 = onNavigationEvent + 31;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackArr;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            Companion = new C0038onExtraCallback(null);
            int i = onExtraCallback + 63;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        /* renamed from: o.isCreativeDebuggerEnabled$onExtraCallback$onExtraCallback, reason: collision with other inner class name */
        public static final class C0038onExtraCallback {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ C0038onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0038onExtraCallback() {
            }

            /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x010a  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Pair<Float, onExtraCallback> onExtraCallback(@NotNull String str) throws NumberFormatException {
                int iHashCode;
                onExtraCallback onextracallback;
                String strGroup;
                int iOnExtraCallbackWithResult;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                Matcher matcher = new Regex("([*+\\-/])=(\\d+(?:\\.\\d+)?)(dp|px|sp)?").IAuthTabCallback().matcher(str);
                if (!matcher.find()) {
                    throw new IllegalArgumentException();
                }
                int i2 = onExtraCallback + 11;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                String strGroup2 = matcher.group(1);
                if (strGroup2 != null) {
                    int i4 = onWarmupCompleted + 7;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 == 0 ? (iHashCode = strGroup2.hashCode()) == 42 : (iHashCode = strGroup2.hashCode()) == 54) {
                        if (strGroup2.equals("*")) {
                            int i5 = onWarmupCompleted + 29;
                            onExtraCallback = i5 % 128;
                            int i6 = i5 % 2;
                            onextracallback = onExtraCallback.Multiply;
                            strGroup = matcher.group(2);
                            if (strGroup != null) {
                                throw new IllegalArgumentException();
                            }
                            float f = Float.parseFloat(strGroup);
                            DisplayMetrics displayMetrics = contentType.onExtraCallback.IAuthTabCallback_Parcel().getDisplayMetrics();
                            String strGroup3 = matcher.group(3);
                            if (!Intrinsics.areEqual(strGroup3, "dp")) {
                                if (Intrinsics.areEqual(strGroup3, "sp")) {
                                    Intrinsics.checkNotNull(displayMetrics);
                                    iOnExtraCallbackWithResult = varyMatches.onExtraCallbackWithResult(Float.valueOf(f), displayMetrics);
                                }
                                return getWrite.IAuthTabCallback(Float.valueOf(f), onextracallback);
                            }
                            Intrinsics.checkNotNull(displayMetrics);
                            iOnExtraCallbackWithResult = varyMatches.onNavigationEvent(Float.valueOf(f), displayMetrics);
                            f = iOnExtraCallbackWithResult;
                            return getWrite.IAuthTabCallback(Float.valueOf(f), onextracallback);
                        }
                    } else if (iHashCode != 43) {
                        int i7 = onWarmupCompleted + 39;
                        int i8 = i7 % 128;
                        onExtraCallback = i8;
                        int i9 = i7 % 2;
                        if (iHashCode != 45) {
                            int i10 = i8 + 11;
                            onWarmupCompleted = i10 % 128;
                            if (i10 % 2 != 0 ? iHashCode == 47 : iHashCode == 52) {
                                if (strGroup2.equals(TossSecRoute.Main.PATH)) {
                                    int i11 = onWarmupCompleted + 3;
                                    onExtraCallback = i11 % 128;
                                    if (i11 % 2 != 0) {
                                        onExtraCallback onextracallback2 = onExtraCallback.Divide;
                                        throw null;
                                    }
                                    onextracallback = onExtraCallback.Divide;
                                    strGroup = matcher.group(2);
                                    if (strGroup != null) {
                                    }
                                }
                            }
                        } else if (strGroup2.equals("-")) {
                            int i12 = onWarmupCompleted + 33;
                            onExtraCallback = i12 % 128;
                            if (i12 % 2 != 0) {
                                onextracallback = onExtraCallback.Minus;
                                int i13 = 33 / 0;
                            } else {
                                onextracallback = onExtraCallback.Minus;
                            }
                            strGroup = matcher.group(2);
                            if (strGroup != null) {
                            }
                        }
                    } else if (!(!strGroup2.equals("+"))) {
                        onextracallback = onExtraCallback.Plus;
                        strGroup = matcher.group(2);
                        if (strGroup != null) {
                        }
                    }
                }
                throw new IllegalArgumentException();
            }
        }
    }

    public static /* synthetic */ Float onExtraCallbackWithResult(isCreativeDebuggerEnabled iscreativedebuggerenabled, float f, Float f2, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: evaluate");
        }
        int i3 = onTransact;
        int i4 = i3 + 67;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 4) != 0) {
            int i6 = i3 + 73;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        Float fOnNavigationEvent = iscreativedebuggerenabled.onNavigationEvent(f, f2, z);
        int i8 = onTransact + 15;
        IAuthTabCallback_Parcel = i8 % 128;
        int i9 = i8 % 2;
        return fOnNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008a A[PHI: r0 r5
      0x008a: PHI (r0v3 float) = (r0v2 float), (r0v6 float) binds: [B:39:0x0088, B:36:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x008a: PHI (r5v2 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>) = 
      (r5v1 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
      (r5v4 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
     binds: [B:39:0x0088, B:36:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Float onNavigationEvent(float f, @Nullable Float f2, boolean z) {
        float fFloatValue;
        Function1<? super Float, Unit> function1;
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 79;
        int i4 = i3 % 128;
        IAuthTabCallback_Parcel = i4;
        if (i3 % 2 == 0) {
            int i5 = 3 / 0;
            if (!z) {
                if (f == 0.0f) {
                    Float f3 = this.IAuthTabCallback;
                    if (f3 != null) {
                        return f3;
                    }
                } else {
                    if (f != 1.0f) {
                        if (this.onExtraCallback == null) {
                            this.onExtraCallback = f2;
                        }
                        Float f4 = this.IAuthTabCallback;
                        if (f4 == null) {
                            f4 = this.onExtraCallback;
                            int i6 = i4 + 57;
                            onTransact = i6 % 128;
                            int i7 = i6 % 2;
                        }
                        Float f5 = this.asInterface;
                        if (f5 == null) {
                            f5 = this.onExtraCallback;
                        }
                        Object obj = null;
                        if (f5 != null) {
                            int i8 = i4 + 85;
                            int i9 = i8 % 128;
                            onTransact = i9;
                            if (i8 % 2 != 0) {
                                obj.hashCode();
                                throw null;
                            }
                            if (f4 != null) {
                                int i10 = i9 + 89;
                                IAuthTabCallback_Parcel = i10 % 128;
                                if (i10 % 2 == 0) {
                                    fFloatValue = f4.floatValue() * ((f5.floatValue() - f4.floatValue()) / f);
                                    function1 = this.IAuthTabCallbackStub;
                                    if (function1 != null) {
                                        function1.invoke(Float.valueOf(fFloatValue));
                                    }
                                } else {
                                    fFloatValue = f4.floatValue() + ((f5.floatValue() - f4.floatValue()) * f);
                                    function1 = this.IAuthTabCallbackStub;
                                    if (function1 != null) {
                                    }
                                }
                                return Float.valueOf(fFloatValue);
                            }
                        }
                        return null;
                    }
                    int i11 = i2 + 13;
                    IAuthTabCallback_Parcel = i11 % 128;
                    int i12 = i11 % 2;
                    Float f6 = this.asInterface;
                    if (f6 != null) {
                        return f6;
                    }
                }
            }
        } else if (!z) {
        }
        int i13 = IAuthTabCallback_Parcel + 63;
        onTransact = i13 % 128;
        int i14 = i13 % 2;
        return f2;
    }

    public void access000() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 83;
        IAuthTabCallback_Parcel = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.onExtraCallback = null;
            this.IAuthTabCallback = null;
            this.asInterface = null;
            int i4 = i2 + 81;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.onExtraCallback = null;
        this.IAuthTabCallback = null;
        this.asInterface = null;
        obj.hashCode();
        throw null;
    }

    public final onExtraCallback IAuthTabCallbackStub() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (onExtraCallback) onWarmupCompleted(1838065040, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted2, -1838065039, new Object[]{this}, iOnWarmupCompleted);
    }

    public final void onWarmupCompleted(@Nullable Float f) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        onWarmupCompleted(1476872107, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted2, -1476872107, new Object[]{this, f}, iOnWarmupCompleted);
    }
}
