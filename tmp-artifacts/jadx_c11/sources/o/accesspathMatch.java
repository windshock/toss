package o;

import im.toss.tds.graphics.gl.blur.RenderCommand;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.saveFromResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class accesspathMatch {
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access000 = 1;
    private final ArrayList<parseokhttp> IAuthTabCallback;
    private final deprecated_persistent IAuthTabCallbackDefault;
    private final Credentials IAuthTabCallbackStub;
    private final ArrayList<parseokhttp> access100;
    private CookieJar asBinder;
    private onNavigationEvent asInterface;
    private final deprecated_hostOnly getInterfaceDescriptor;
    private final loadForRequest onExtraCallback;
    private onWarmupCompleted onExtraCallbackWithResult;
    public toStringokhttp onNavigationEvent;
    private parseokhttp onTransact;
    private boolean onWarmupCompleted;

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i5;
        int i8 = i3 | i7;
        int i9 = ~i4;
        int i10 = ~((~i3) | i7);
        int i11 = i5 + i4 + i + (1977613057 * i6) + (454551927 * i2);
        int i12 = i11 * i11;
        int i13 = (1378041352 * i5) + 473956352 + (953991674 * i4) + (212024839 * i8) + (i9 * (-212024839)) + ((-212024839) * i10) + (1166016512 * i) + ((-981467136) * i6) + ((-830472192) * i2) + ((-499122176) * i12);
        int i14 = (i5 * (-1131120504)) + 246467939 + (i4 * (-1131119078)) + (i8 * (-713)) + (i9 * 713) + (i10 * 713) + (i * (-1131119791)) + (i6 * (-1039407535)) + (i2 * 1820920743) + (i12 * 1447034880);
        int i15 = i13 + (i14 * i14 * 1170210816);
        if (i15 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i15 != 2) {
            return IAuthTabCallback(objArr);
        }
        accesspathMatch accesspathmatch = (accesspathMatch) objArr[0];
        int i16 = 2 % 2;
        int i17 = access000;
        int i18 = i17 + 83;
        IAuthTabCallbackStubProxy = i18 % 128;
        int i19 = i18 % 2;
        toStringokhttp tostringokhttp = accesspathmatch.onNavigationEvent;
        if (tostringokhttp == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i20 = i17 + 73;
        IAuthTabCallbackStubProxy = i20 % 128;
        int i21 = i20 % 2;
        return tostringokhttp;
    }

    public accesspathMatch(@NotNull loadForRequest loadforrequest, @NotNull deprecated_hostOnly deprecated_hostonly, @NotNull deprecated_persistent deprecated_persistentVar, @NotNull Credentials credentials) {
        Intrinsics.checkNotNullParameter(loadforrequest, "");
        Intrinsics.checkNotNullParameter(deprecated_hostonly, "");
        Intrinsics.checkNotNullParameter(deprecated_persistentVar, "");
        Intrinsics.checkNotNullParameter(credentials, "");
        this.onExtraCallback = loadforrequest;
        this.getInterfaceDescriptor = deprecated_hostonly;
        this.IAuthTabCallbackDefault = deprecated_persistentVar;
        this.IAuthTabCallbackStub = credentials;
        this.access100 = new ArrayList<>();
        this.IAuthTabCallback = new ArrayList<>();
    }

    public final void onExtraCallback(@NotNull toStringokhttp tostringokhttp) {
        int i = 2 % 2;
        int i2 = access000 + 43;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tostringokhttp, "");
        this.onNavigationEvent = tostringokhttp;
        int i4 = access000 + 39;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class onWarmupCompleted {
        private static int IAuthTabCallbackStub = 0;
        private static int onTransact = 1;
        private final float IAuthTabCallback;
        private final float IAuthTabCallbackDefault;
        private final int asBinder;
        private final float asInterface;
        private final float onExtraCallback;
        private final float onExtraCallbackWithResult;
        private final float onNavigationEvent;
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
            if (this.asBinder != onwarmupcompleted.asBinder) {
                int i2 = IAuthTabCallbackStub + 119;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (Float.compare(this.IAuthTabCallback, onwarmupcompleted.IAuthTabCallback) != 0) {
                int i4 = IAuthTabCallbackStub + 89;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Float.compare(this.onExtraCallbackWithResult, onwarmupcompleted.onExtraCallbackWithResult) != 0) {
                int i6 = onTransact + 59;
                IAuthTabCallbackStub = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 10 / 0;
                }
                return false;
            }
            if (Float.compare(this.onExtraCallback, onwarmupcompleted.onExtraCallback) != 0) {
                return false;
            }
            if (Float.compare(this.onNavigationEvent, onwarmupcompleted.onNavigationEvent) != 0) {
                int i8 = IAuthTabCallbackStub + 47;
                onTransact = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (Float.compare(this.asInterface, onwarmupcompleted.asInterface) != 0) {
                int i10 = onTransact + 61;
                IAuthTabCallbackStub = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }
            if (Float.compare(this.IAuthTabCallbackDefault, onwarmupcompleted.IAuthTabCallbackDefault) != 0) {
                int i12 = IAuthTabCallbackStub + 21;
                onTransact = i12 % 128;
                return i12 % 2 == 0;
            }
            if (Float.compare(this.onWarmupCompleted, onwarmupcompleted.onWarmupCompleted) == 0) {
                return true;
            }
            int i13 = IAuthTabCallbackStub + 13;
            onTransact = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onTransact + 17;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((((((((((Integer.hashCode(this.asBinder) * 31) + Float.hashCode(this.IAuthTabCallback)) * 31) + Float.hashCode(this.onExtraCallbackWithResult)) * 31) + Float.hashCode(this.onExtraCallback)) * 31) + Float.hashCode(this.onNavigationEvent)) * 31) + Float.hashCode(this.asInterface)) * 31) + Float.hashCode(this.IAuthTabCallbackDefault)) * 31) + Float.hashCode(this.onWarmupCompleted);
            int i4 = IAuthTabCallbackStub + 17;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "MaskParams(type=" + this.asBinder + ", fitW=" + this.IAuthTabCallback + ", fitH=" + this.onExtraCallbackWithResult + ", cx=" + this.onExtraCallback + ", cy=" + this.onNavigationEvent + ", radius=" + this.asInterface + ", inset=" + this.IAuthTabCallbackDefault + ", feather=" + this.onWarmupCompleted + ")";
            int i2 = IAuthTabCallbackStub + 117;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onWarmupCompleted(int i, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            this.asBinder = i;
            this.IAuthTabCallback = f;
            this.onExtraCallbackWithResult = f2;
            this.onExtraCallback = f3;
            this.onNavigationEvent = f4;
            this.asInterface = f5;
            this.IAuthTabCallbackDefault = f6;
            this.onWarmupCompleted = f7;
        }

        public final int IAuthTabCallbackDefault() {
            int i;
            int i2 = 2 % 2;
            int i3 = onTransact + 115;
            int i4 = i3 % 128;
            IAuthTabCallbackStub = i4;
            if (i3 % 2 != 0) {
                i = this.asBinder;
                int i5 = 57 / 0;
            } else {
                i = this.asBinder;
            }
            int i6 = i4 + 45;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            return i;
        }

        public final float onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 1;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            float f = this.IAuthTabCallback;
            int i5 = i3 + 5;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public final float IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 111;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            float f = this.onExtraCallbackWithResult;
            int i5 = i2 + 3;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                return f;
            }
            throw null;
        }

        public final float onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 113;
            int i3 = i2 % 128;
            onTransact = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            float f = this.onExtraCallback;
            int i4 = i3 + 95;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                return f;
            }
            throw null;
        }

        public final float onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 1;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            float f = this.onNavigationEvent;
            int i5 = i3 + 119;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 66 / 0;
            }
            return f;
        }

        public final float IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 29;
            IAuthTabCallbackStub = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            float f = this.asInterface;
            int i4 = i2 + 61;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                return f;
            }
            throw null;
        }

        public final float asInterface() {
            int i = 2 % 2;
            int i2 = onTransact + 37;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            float f = this.IAuthTabCallbackDefault;
            int i5 = i3 + 97;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public final float onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 23;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onWarmupCompleted;
            }
            throw null;
        }
    }

    static final class onNavigationEvent {
        private static int access100 = 1;
        private static int onTransact;
        private final float IAuthTabCallback;
        private final float[] IAuthTabCallbackDefault;
        private final float IAuthTabCallbackStub;
        private final float asBinder;
        private final int asInterface;
        private final float onExtraCallback;
        private final float onExtraCallbackWithResult;
        private final float onNavigationEvent;
        private final float onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            Object obj2 = null;
            if (this == obj) {
                int i2 = access100;
                int i3 = i2 + 55;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 31;
                onTransact = i5 % 128;
                if (i5 % 2 == 0) {
                    return true;
                }
                obj2.hashCode();
                throw null;
            }
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (this.asInterface != onnavigationevent.asInterface) {
                int i6 = access100;
                int i7 = i6 + 21;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                int i9 = i6 + 109;
                onTransact = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            if (Float.compare(this.IAuthTabCallbackStub, onnavigationevent.IAuthTabCallbackStub) != 0) {
                int i11 = onTransact + 89;
                access100 = i11 % 128;
                int i12 = i11 % 2;
                return false;
            }
            if (Float.compare(this.asBinder, onnavigationevent.asBinder) != 0) {
                int i13 = onTransact + 115;
                access100 = i13 % 128;
                if (i13 % 2 != 0) {
                    return false;
                }
                obj2.hashCode();
                throw null;
            }
            if (Float.compare(this.IAuthTabCallback, onnavigationevent.IAuthTabCallback) != 0) {
                int i14 = access100 + 75;
                onTransact = i14 % 128;
                return i14 % 2 != 0;
            }
            if (Float.compare(this.onNavigationEvent, onnavigationevent.onNavigationEvent) != 0 || Float.compare(this.onExtraCallback, onnavigationevent.onExtraCallback) != 0) {
                return false;
            }
            if (Float.compare(this.onExtraCallbackWithResult, onnavigationevent.onExtraCallbackWithResult) == 0) {
                return Float.compare(this.onWarmupCompleted, onnavigationevent.onWarmupCompleted) == 0 && Intrinsics.areEqual(this.IAuthTabCallbackDefault, onnavigationevent.IAuthTabCallbackDefault);
            }
            int i15 = onTransact + 47;
            access100 = i15 % 128;
            int i16 = i15 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int iHashCode2 = Integer.hashCode(this.asInterface);
            int iHashCode3 = Float.hashCode(this.IAuthTabCallbackStub);
            int iHashCode4 = Float.hashCode(this.asBinder);
            int iHashCode5 = Float.hashCode(this.IAuthTabCallback);
            int iHashCode6 = Float.hashCode(this.onNavigationEvent);
            int iHashCode7 = Float.hashCode(this.onExtraCallback);
            int iHashCode8 = Float.hashCode(this.onExtraCallbackWithResult);
            int iHashCode9 = Float.hashCode(this.onWarmupCompleted);
            float[] fArr = this.IAuthTabCallbackDefault;
            if (fArr == null) {
                int i2 = access100 + 105;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = Arrays.hashCode(fArr);
            }
            int i4 = (((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode;
            int i5 = access100 + 77;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                return i4;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ProgressiveParams(type=" + this.asInterface + ", startPxX=" + this.IAuthTabCallbackStub + ", startPxY=" + this.asBinder + ", endPxX=" + this.IAuthTabCallback + ", endPxY=" + this.onNavigationEvent + ", centerPxX=" + this.onExtraCallback + ", centerPxY=" + this.onExtraCallbackWithResult + ", radiusPx=" + this.onWarmupCompleted + ", rawInterpolator=" + Arrays.toString(this.IAuthTabCallbackDefault) + ")";
            int i2 = access100 + 9;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public onNavigationEvent(int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, @Nullable float[] fArr) {
            this.asInterface = i;
            this.IAuthTabCallbackStub = f;
            this.asBinder = f2;
            this.IAuthTabCallback = f3;
            this.onNavigationEvent = f4;
            this.onExtraCallback = f5;
            this.onExtraCallbackWithResult = f6;
            this.onWarmupCompleted = f7;
            this.IAuthTabCallbackDefault = fArr;
        }

        public final int IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onTransact + 1;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = this.asInterface;
            if (i3 == 0) {
                int i5 = 41 / 0;
            }
            return i4;
        }

        public final float asBinder() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 15;
            access100 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            float f = this.IAuthTabCallbackStub;
            int i4 = i2 + 105;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            return f;
        }

        public final float IAuthTabCallbackStub() {
            float f;
            int i = 2 % 2;
            int i2 = access100 + 59;
            int i3 = i2 % 128;
            onTransact = i3;
            if (i2 % 2 != 0) {
                f = this.asBinder;
                int i4 = 74 / 0;
            } else {
                f = this.asBinder;
            }
            int i5 = i3 + 75;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public final float onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = access100 + 113;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            float f = this.IAuthTabCallback;
            int i5 = i3 + 91;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public final float IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 65;
            access100 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            float f = this.onNavigationEvent;
            int i4 = i2 + 5;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            return f;
        }

        public final float onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = access100;
            int i3 = i2 + 43;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            float f = this.onExtraCallback;
            int i5 = i2 + 95;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public final float onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 47;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            float f = this.onExtraCallbackWithResult;
            int i5 = i2 + 53;
            access100 = i5 % 128;
            if (i5 % 2 != 0) {
                return f;
            }
            throw null;
        }

        public final float onExtraCallback() {
            float f;
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 65;
            access100 = i3 % 128;
            if (i3 % 2 == 0) {
                f = this.onWarmupCompleted;
                int i4 = 38 / 0;
            } else {
                f = this.onWarmupCompleted;
            }
            int i5 = i2 + 89;
            access100 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 83 / 0;
            }
            return f;
        }

        public final float[] asInterface() {
            int i = 2 % 2;
            int i2 = access100 + 77;
            int i3 = i2 % 128;
            onTransact = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            float[] fArr = this.IAuthTabCallbackDefault;
            int i4 = i3 + 67;
            access100 = i4 % 128;
            if (i4 % 2 != 0) {
                return fArr;
            }
            throw null;
        }
    }

    public final parseokhttp onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access000 + 17;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        parseokhttp parseokhttpVar = this.onTransact;
        if (parseokhttpVar != null) {
            return parseokhttpVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = access000 + 61;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public final void IAuthTabCallback(@NotNull parseokhttp parseokhttpVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 85;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(parseokhttpVar, "");
            Object[] objArr = {this, Long.valueOf(ExtensionsManager1.onWarmupCompleted(parseokhttpVar.onNavigationEvent().onExtraCallback(), parseokhttpVar.onNavigationEvent().IAuthTabCallback()))};
            int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            onNavigationEvent(((Long) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1085080543, objArr, 1085080543, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).longValue());
            return;
        }
        Intrinsics.checkNotNullParameter(parseokhttpVar, "");
        Object[] objArr2 = {this, Long.valueOf(ExtensionsManager1.onWarmupCompleted(parseokhttpVar.onNavigationEvent().onExtraCallback(), parseokhttpVar.onNavigationEvent().IAuthTabCallback()))};
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        onNavigationEvent(((Long) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1085080543, objArr2, 1085080543, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).longValue());
        throw null;
    }

    public final void onExtraCallback(int i, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        int i2 = 2 % 2;
        this.onExtraCallbackWithResult = new onWarmupCompleted(i, f, f2, f3, f4, f5, f6, f7);
        if (!(!this.onWarmupCompleted)) {
            int i3 = IAuthTabCallbackStubProxy + 117;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1085479112, new Object[]{this}, 1085479113, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
            int i5 = access000 + 57;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public final void onWarmupCompleted(int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, @Nullable float[] fArr) {
        int i2 = 2 % 2;
        this.asInterface = new onNavigationEvent(i, f, f2, f3, f4, f5, f6, f7, fArr);
        if (this.onWarmupCompleted) {
            int i3 = access000 + 111;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback();
            if (i4 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i5 = access000 + 55;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final getTlsVersionsokhttp onExtraCallback(@NotNull parseokhttp parseokhttpVar, float f, int i, long j) {
        Object[] objArr;
        parseokhttp parseokhttpVar2;
        parseokhttp parseokhttpVarOnExtraCallback;
        parseokhttp parseokhttpVar3;
        parseokhttp parseokhttpVarOnExtraCallback2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parseokhttpVar, "");
        IAuthTabCallback(parseokhttpVar);
        onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1085479112, new Object[]{this}, 1085479113, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
        IAuthTabCallback();
        this.onExtraCallback.onExtraCallback();
        onTransact();
        onNavigationEvent onnavigationevent = this.asInterface;
        if (onnavigationevent != null) {
            int i3 = access000 + 99;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            objArr = onnavigationevent.IAuthTabCallbackDefault() != 0;
        }
        int iMin = Math.min(i, Math.min(((toStringokhttp) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 537302565, new Object[]{this}, -537302563, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).onWarmupCompleted().size() - 1, 9));
        CookieBuilder cookieBuilderIAuthTabCallback = ((toStringokhttp) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 537302565, new Object[]{this}, -537302563, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).IAuthTabCallback();
        int i5 = objArr != false ? iMin + 1 : 1;
        this.IAuthTabCallback.clear();
        int i6 = 0;
        while (true) {
            parseokhttpVar2 = null;
            cookieJar = null;
            CookieJar cookieJar = null;
            parseokhttpVar3 = null;
            if (i6 >= i5) {
                break;
            }
            ArrayList<parseokhttp> arrayList = this.IAuthTabCallback;
            loadForRequest loadforrequest = this.onExtraCallback;
            CookieJar cookieJar2 = this.asBinder;
            if (cookieJar2 == null) {
                int i7 = access000 + 45;
                IAuthTabCallbackStubProxy = i7 % 128;
                if (i7 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i8 = 59 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
            } else {
                cookieJar = cookieJar2;
            }
            arrayList.add(loadforrequest.onExtraCallback(cookieJar));
            i6++;
        }
        loadForRequest loadforrequest2 = this.onExtraCallback;
        CookieJar cookieJar3 = this.asBinder;
        if (cookieJar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i9 = access000 + 39;
            IAuthTabCallbackStubProxy = i9 % 128;
            int i10 = i9 % 2;
            cookieJar3 = null;
        }
        this.onTransact = loadforrequest2.onExtraCallback(cookieJar3);
        parseokhttp parseokhttpVar4 = this.access100.get(0);
        Intrinsics.checkNotNullExpressionValue(parseokhttpVar4, "");
        onNavigationEvent(parseokhttpVar, parseokhttpVar4);
        if (objArr != false) {
            parseokhttp parseokhttpVar5 = this.access100.get(0);
            Intrinsics.checkNotNullExpressionValue(parseokhttpVar5, "");
            parseokhttp parseokhttpVar6 = this.IAuthTabCallback.get(0);
            Intrinsics.checkNotNullExpressionValue(parseokhttpVar6, "");
            onNavigationEvent(parseokhttpVar5, parseokhttpVar6);
        }
        if (f <= 0.0f || iMin <= 0) {
            parseokhttp parseokhttpVar7 = this.access100.get(0);
            Intrinsics.checkNotNullExpressionValue(parseokhttpVar7, "");
            parseokhttp parseokhttpVar8 = parseokhttpVar7;
            parseokhttp parseokhttpVar9 = this.onTransact;
            if (parseokhttpVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                parseokhttpVar9 = null;
            }
            onNavigationEvent(parseokhttpVar8, parseokhttpVar9);
            parseokhttp parseokhttpVar10 = this.onTransact;
            if (parseokhttpVar10 == null) {
                int i11 = IAuthTabCallbackStubProxy + 9;
                access000 = i11 % 128;
                int i12 = i11 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                parseokhttpVar2 = parseokhttpVar10;
            }
            return parseokhttpVar2.onExtraCallback();
        }
        int i13 = 1038141928;
        ((deprecated_path) CookieBuilder.onExtraCallback(1038141928, -1038141928, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), new Object[]{cookieBuilderIAuthTabCallback})).onExtraCallbackWithResult(this.IAuthTabCallbackDefault);
        int i14 = 0;
        while (i14 < iMin) {
            int i15 = access000 + 45;
            IAuthTabCallbackStubProxy = i15 % 128;
            int i16 = i15 % 2;
            parseokhttp parseokhttpVar11 = this.access100.get(i14);
            Intrinsics.checkNotNullExpressionValue(parseokhttpVar11, "");
            onNavigationEvent(cookieBuilderIAuthTabCallback, parseokhttpVar11, 1.0f, true);
            parseokhttp parseokhttpVar12 = this.access100.get(i14);
            Intrinsics.checkNotNullExpressionValue(parseokhttpVar12, "");
            i14++;
            parseokhttp parseokhttpVar13 = this.access100.get(i14);
            Intrinsics.checkNotNullExpressionValue(parseokhttpVar13, "");
            int i17 = i13;
            onWarmupCompleted(parseokhttpVar12, parseokhttpVar13, (deprecated_path) CookieBuilder.onExtraCallback(i17, -1038141928, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), new Object[]{cookieBuilderIAuthTabCallback}));
            i13 = 1038141928;
        }
        cookieBuilderIAuthTabCallback.onExtraCallbackWithResult().onExtraCallbackWithResult(this.IAuthTabCallbackDefault);
        if (objArr != true) {
            parseokhttp parseokhttpVar14 = this.access100.get(iMin);
            Intrinsics.checkNotNullExpressionValue(parseokhttpVar14, "");
            parseokhttp parseokhttpVar15 = parseokhttpVar14;
            while (iMin > 0) {
                int i18 = access000 + 121;
                IAuthTabCallbackStubProxy = i18 % 128;
                if (i18 % 2 == 0 ? iMin != 1 : iMin != 1) {
                    parseokhttpVarOnExtraCallback = this.onExtraCallback.onExtraCallback(((toStringokhttp) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 537302565, new Object[]{this}, -537302563, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).onWarmupCompleted().get(iMin - 1));
                } else {
                    parseokhttpVarOnExtraCallback = this.IAuthTabCallback.get(0);
                }
                Intrinsics.checkNotNull(parseokhttpVarOnExtraCallback);
                onNavigationEvent(cookieBuilderIAuthTabCallback, parseokhttpVar15, 1.0f, false);
                onWarmupCompleted(parseokhttpVar15, parseokhttpVarOnExtraCallback, cookieBuilderIAuthTabCallback.onExtraCallbackWithResult());
                iMin--;
                parseokhttpVar15 = parseokhttpVarOnExtraCallback;
            }
        } else if (iMin > 0) {
            int i19 = 1;
            while (true) {
                parseokhttp parseokhttpVar16 = this.access100.get(i19);
                Intrinsics.checkNotNullExpressionValue(parseokhttpVar16, "");
                parseokhttp parseokhttpVar17 = parseokhttpVar16;
                int i20 = i19;
                while (i20 > 0) {
                    if (i20 == 1) {
                        parseokhttpVarOnExtraCallback2 = this.IAuthTabCallback.get(i19);
                    } else {
                        parseokhttpVarOnExtraCallback2 = this.onExtraCallback.onExtraCallback(((toStringokhttp) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 537302565, new Object[]{this}, -537302563, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).onWarmupCompleted().get(i20 - 1));
                        int i21 = IAuthTabCallbackStubProxy + 69;
                        access000 = i21 % 128;
                        int i22 = i21 % 2;
                    }
                    Intrinsics.checkNotNull(parseokhttpVarOnExtraCallback2);
                    onNavigationEvent(cookieBuilderIAuthTabCallback, parseokhttpVar17, 1.0f, false);
                    onWarmupCompleted(parseokhttpVar17, parseokhttpVarOnExtraCallback2, cookieBuilderIAuthTabCallback.onExtraCallbackWithResult());
                    i20--;
                    parseokhttpVar17 = parseokhttpVarOnExtraCallback2;
                }
                if (i19 == iMin) {
                    break;
                }
                i19++;
            }
        }
        int i23 = IAuthTabCallbackStubProxy + 99;
        access000 = i23 % 128;
        int i24 = i23 % 2;
        cookieBuilderIAuthTabCallback.IAuthTabCallback(j);
        parseokhttp parseokhttpVar18 = this.onTransact;
        if (parseokhttpVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            parseokhttpVar18 = null;
        }
        parseokhttp.onWarmupCompleted(parseokhttpVar18, parseDomain.DRAW, false, 2, null);
        RenderCommand.onWarmupCompleted(RenderCommand.IAuthTabCallback, null, 1, null);
        ArrayList<parseokhttp> arrayList2 = this.IAuthTabCallback;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator<T> it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((parseokhttp) it.next()).onExtraCallback());
        }
        cookieBuilderIAuthTabCallback.onExtraCallbackWithResult(arrayList3);
        cookieBuilderIAuthTabCallback.onNavigationEvent().onExtraCallbackWithResult(this.IAuthTabCallbackDefault);
        Credentials.onNavigationEvent(this.IAuthTabCallbackStub, cookieBuilderIAuthTabCallback.onNavigationEvent(), (getTlsVersionsokhttp) arrayList3.get(0), null, 0.0f, 12, null);
        parseokhttp parseokhttpVar19 = this.onTransact;
        if (parseokhttpVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            parseokhttpVar3 = parseokhttpVar19;
        }
        return parseokhttpVar3.onExtraCallback();
    }

    private final void onNavigationEvent(long j) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 89;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (this.onWarmupCompleted) {
            int i5 = i2 + 117;
            int i6 = i5 % 128;
            IAuthTabCallbackStubProxy = i6;
            int i7 = i5 % 2;
            CookieJar cookieJar = this.asBinder;
            if (cookieJar == null) {
                int i8 = i6 + 97;
                access000 = i8 % 128;
                if (i8 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                cookieJar = null;
            }
            if (ExtensionsManager1.IAuthTabCallback(cookieJar.onExtraCallback(), j)) {
                return;
            }
        }
        if (this.onWarmupCompleted) {
            int i9 = access000 + 69;
            IAuthTabCallbackStubProxy = i9 % 128;
            if (i9 % 2 != 0) {
                onNavigationEvent();
                throw null;
            }
            onNavigationEvent();
        }
        this.asBinder = new CookieJar(j, saveFromResponse.onNavigationEvent.onNavigationEvent(saveFromResponse.Companion, pathMatch.RGBA8, false, false, 6, null), 0, 4, null);
        onExtraCallback(toStringokhttp.Companion.onWarmupCompleted(this.getInterfaceDescriptor, this.IAuthTabCallbackDefault, j));
        this.onWarmupCompleted = true;
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1085479112, new Object[]{this}, 1085479113, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
        IAuthTabCallback();
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        accesspathMatch accesspathmatch = (accesspathMatch) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 93;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted onwarmupcompleted = accesspathmatch.onExtraCallbackWithResult;
            throw null;
        }
        onWarmupCompleted onwarmupcompleted2 = accesspathmatch.onExtraCallbackWithResult;
        if (onwarmupcompleted2 == null) {
            return null;
        }
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        ((toStringokhttp) onWarmupCompleted(iOnExtraCallbackWithResult2, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 537302565, new Object[]{accesspathmatch}, -537302563, iOnExtraCallbackWithResult3)).IAuthTabCallback().onNavigationEvent(onwarmupcompleted2.IAuthTabCallbackDefault(), onwarmupcompleted2.onExtraCallbackWithResult(), onwarmupcompleted2.IAuthTabCallback(), onwarmupcompleted2.onNavigationEvent(), onwarmupcompleted2.onWarmupCompleted(), onwarmupcompleted2.IAuthTabCallbackStub(), onwarmupcompleted2.asInterface(), onwarmupcompleted2.onExtraCallback());
        int i3 = access000 + 83;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    private final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 71;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent onnavigationevent = this.asInterface;
        if (onnavigationevent == null) {
            return;
        }
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        ((toStringokhttp) onWarmupCompleted(iOnExtraCallbackWithResult2, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 537302565, new Object[]{this}, -537302563, iOnExtraCallbackWithResult3)).IAuthTabCallback().onExtraCallback(onnavigationevent.IAuthTabCallbackDefault(), onnavigationevent.asBinder(), onnavigationevent.IAuthTabCallbackStub(), onnavigationevent.onExtraCallbackWithResult(), onnavigationevent.IAuthTabCallback(), onnavigationevent.onWarmupCompleted(), onnavigationevent.onNavigationEvent(), onnavigationevent.onExtraCallback(), onnavigationevent.asInterface());
        int i4 = access000 + 111;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
    }

    private final void onTransact() {
        int i = 2 % 2;
        int i2 = access000 + 79;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        this.access100.clear();
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        Iterator<T> it = ((toStringokhttp) onWarmupCompleted(iOnExtraCallbackWithResult2, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 537302565, new Object[]{this}, -537302563, iOnExtraCallbackWithResult3)).onWarmupCompleted().iterator();
        while (it.hasNext()) {
            int i4 = access000 + 93;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                this.access100.add(this.onExtraCallback.onExtraCallback((CookieJar) it.next()));
                throw null;
            }
            this.access100.add(this.onExtraCallback.onExtraCallback((CookieJar) it.next()));
        }
    }

    private final void onNavigationEvent(CookieBuilder cookieBuilder, parseokhttp parseokhttpVar, float f, boolean z) {
        int i = 2 % 2;
        int i2 = access000 + 113;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        float fCoerceAtLeast = RangesKt.coerceAtLeast((int) (parseokhttpVar.onNavigationEvent().onExtraCallback() >> 32), 1);
        float fCoerceAtLeast2 = 1.0f / RangesKt.coerceAtLeast((int) r1, 1);
        Object[] objArr = {cookieBuilder, Long.valueOf(setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits((1.0f / fCoerceAtLeast) * f) << 32) | (Float.floatToRawIntBits(fCoerceAtLeast2 * f) & 4294967295L))), Boolean.valueOf(z)};
        CookieBuilder.onExtraCallback(1295620808, -1295620807, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), objArr);
        int i4 = access000 + 9;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onWarmupCompleted(parseokhttp parseokhttpVar, parseokhttp parseokhttpVar2, deprecated_path deprecated_pathVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 7;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        parseokhttp.onWarmupCompleted(parseokhttpVar2, parseDomain.DRAW, false, 2, null);
        RenderCommand.onWarmupCompleted(RenderCommand.IAuthTabCallback, null, 1, null);
        Credentials.onNavigationEvent(this.IAuthTabCallbackStub, deprecated_pathVar, parseokhttpVar.onExtraCallback(), null, 0.0f, 12, null);
        int i4 = access000 + 51;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onNavigationEvent(parseokhttp parseokhttpVar, parseokhttp parseokhttpVar2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 53;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        parseokhttpVar.onNavigationEvent(parseDomain.READ, false);
        parseokhttp.onWarmupCompleted(parseokhttpVar2, parseDomain.DRAW, false, 2, null);
        RenderCommand renderCommand = RenderCommand.IAuthTabCallback;
        renderCommand.onExtraCallback(0, 0, (int) (parseokhttpVar.onNavigationEvent().onExtraCallback() >> 32), (int) parseokhttpVar.onNavigationEvent().onExtraCallback(), 0, 0, (int) (parseokhttpVar2.onNavigationEvent().onExtraCallback() >> 32), (int) parseokhttpVar2.onNavigationEvent().onExtraCallback(), renderCommand.IAuthTabCallback(), renderCommand.onNavigationEvent());
        int i4 = access000 + 9;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        if (this.onWarmupCompleted) {
            int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            ((toStringokhttp) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 537302565, new Object[]{this}, -537302563, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).IAuthTabCallback().IAuthTabCallback();
            Iterator<T> it = this.access100.iterator();
            while (!(!it.hasNext())) {
                ((parseokhttp) it.next()).onExtraCallbackWithResult();
            }
            this.access100.clear();
            this.IAuthTabCallback.clear();
            parseokhttp parseokhttpVar = this.onTransact;
            if (parseokhttpVar != null) {
                int i2 = IAuthTabCallbackStubProxy + 113;
                int i3 = i2 % 128;
                access000 = i3;
                int i4 = i2 % 2;
                if (parseokhttpVar == null) {
                    int i5 = i3 + 57;
                    IAuthTabCallbackStubProxy = i5 % 128;
                    if (i5 % 2 != 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i6 = 37 / 0;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    parseokhttpVar = null;
                }
                parseokhttpVar.onExtraCallbackWithResult();
            }
            this.onWarmupCompleted = false;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        long jMax;
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 77;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            jMax = Math.max(1, (int) jLongValue) & 4294967295L & (Math.max(0, (int) (jLongValue >>> 75)) << 108);
        } else {
            jMax = (Math.max(1, (int) (jLongValue >> 32)) << 32) | (Math.max(1, (int) jLongValue) & 4294967295L);
        }
        long jOnWarmupCompleted = ExtensionsManager1.onWarmupCompleted(jMax);
        int i3 = access000 + 43;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return Long.valueOf(jOnWarmupCompleted);
        }
        throw null;
    }

    private final void onExtraCallback() {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        onWarmupCompleted(iOnExtraCallbackWithResult2, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1085479112, new Object[]{this}, 1085479113, iOnExtraCallbackWithResult3);
    }

    private final long onExtraCallbackWithResult(long j) {
        Object[] objArr = {this, Long.valueOf(j)};
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return ((Long) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1085080543, objArr, 1085080543, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).longValue();
    }

    public final toStringokhttp onWarmupCompleted() {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (toStringokhttp) onWarmupCompleted(iOnExtraCallbackWithResult2, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 537302565, new Object[]{this}, -537302563, iOnExtraCallbackWithResult3);
    }
}
