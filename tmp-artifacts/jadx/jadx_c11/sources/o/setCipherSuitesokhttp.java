package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface setCipherSuitesokhttp {
    int IAuthTabCallback();

    onExtraCallback IAuthTabCallbackDefault();

    int IAuthTabCallbackStub();

    boolean onExtraCallback();

    void onExtraCallbackWithResult();

    onExtraCallbackWithResult onNavigationEvent();

    int onWarmupCompleted();

    void onWarmupCompleted(int i);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int IAuthTabCallback = 0;
        public static final onExtraCallback TEXTURE_2D = new onExtraCallback("TEXTURE_2D", 0);
        public static final onExtraCallback TEXTURE_EXTERNAL_OES = new onExtraCallback("TEXTURE_EXTERNAL_OES", 1);
        private static int onExtraCallback = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            onExtraCallback[] onextracallbackArr = {TEXTURE_2D, TEXTURE_EXTERNAL_OES};
            int i5 = i3 + 87;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return onextracallbackArr;
            }
            throw null;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 61;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i5 = i2 + 75;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            int i4 = IAuthTabCallback + 109;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallback;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 53;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            int i4 = onExtraCallback + 85;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return onextracallbackArr;
            }
            throw null;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = onNavigationEvent + 59;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        public static final IAuthTabCallback None = new IAuthTabCallback("None", 0);
        public static final IAuthTabCallback A8 = new IAuthTabCallback("A8", 1);
        public static final IAuthTabCallback R8 = new IAuthTabCallback("R8", 2);
        public static final IAuthTabCallback R16F = new IAuthTabCallback("R16F", 3);
        public static final IAuthTabCallback RGB8 = new IAuthTabCallback("RGB8", 4);
        public static final IAuthTabCallback RGBA8 = new IAuthTabCallback("RGBA8", 5);
        public static final IAuthTabCallback RGB10_A2 = new IAuthTabCallback("RGB10_A2", 6);
        public static final IAuthTabCallback DEPTH24STENCIL8 = new IAuthTabCallback("DEPTH24STENCIL8", 7);

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 63;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = {None, A8, R8, R16F, RGB8, RGBA8, RGB10_A2, DEPTH24STENCIL8};
            int i5 = i2 + 91;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return iAuthTabCallbackArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
            if (i3 != 0) {
                int i4 = 74 / 0;
            }
            return enumEntries;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            if (i3 == 0) {
                int i4 = 23 / 0;
            }
            int i5 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return iAuthTabCallback;
            }
            throw null;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = $VALUES;
            if (i3 != 0) {
                return (IAuthTabCallback[]) iAuthTabCallbackArr.clone();
            }
            int i4 = 16 / 0;
            return (IAuthTabCallback[]) iAuthTabCallbackArr.clone();
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = IAuthTabCallback + 95;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }

    public static final class onExtraCallbackWithResult {
        private static int IAuthTabCallbackStub = 0;
        private static int asBinder = 1;
        private final boolean IAuthTabCallback;
        private final long onExtraCallback;
        private boolean onExtraCallbackWithResult;
        private final IAuthTabCallback onNavigationEvent;
        private final boolean onWarmupCompleted;

        public /* synthetic */ onExtraCallbackWithResult(long j, IAuthTabCallback iAuthTabCallback, boolean z, boolean z2, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, iAuthTabCallback, z, z2, z3);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                int i2 = IAuthTabCallbackStub + 47;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (!ExtensionsManager1.IAuthTabCallback(this.onExtraCallback, onextracallbackwithresult.onExtraCallback)) {
                int i4 = IAuthTabCallbackStub + 93;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (this.onNavigationEvent != onextracallbackwithresult.onNavigationEvent) {
                int i6 = IAuthTabCallbackStub + 101;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (this.onWarmupCompleted != onextracallbackwithresult.onWarmupCompleted || this.onExtraCallbackWithResult != onextracallbackwithresult.onExtraCallbackWithResult) {
                return false;
            }
            if (this.IAuthTabCallback == onextracallbackwithresult.IAuthTabCallback) {
                return true;
            }
            int i8 = IAuthTabCallbackStub + 45;
            asBinder = i8 % 128;
            return i8 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asBinder + 121;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            int iIAuthTabCallback = (((((((ExtensionsManager1.IAuthTabCallback(this.onExtraCallback) * 31) + this.onNavigationEvent.hashCode()) * 31) + Boolean.hashCode(this.onWarmupCompleted)) * 31) + Boolean.hashCode(this.onExtraCallbackWithResult)) * 31) + Boolean.hashCode(this.IAuthTabCallback);
            int i4 = asBinder + 111;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                return iIAuthTabCallback;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Specification(size=" + ExtensionsManager1.onTransact(this.onExtraCallback) + ", format=" + this.onNavigationEvent + ", generateMips=" + this.onWarmupCompleted + ", flipTexture=" + this.onExtraCallbackWithResult + ", mipmapFiltering=" + this.IAuthTabCallback + ")";
            int i2 = asBinder + 65;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        private onExtraCallbackWithResult(long j, IAuthTabCallback iAuthTabCallback, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            this.onExtraCallback = j;
            this.onNavigationEvent = iAuthTabCallback;
            this.onWarmupCompleted = z;
            this.onExtraCallbackWithResult = z2;
            this.IAuthTabCallback = z3;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallbackWithResult(long j, IAuthTabCallback iAuthTabCallback, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            long jOnWarmupCompleted;
            IAuthTabCallback iAuthTabCallback2;
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallbackStub + 7;
                asBinder = i2 % 128;
                if (i2 % 2 != 0) {
                    jOnWarmupCompleted = ExtensionsManager1.onWarmupCompleted(4294967297L);
                    int i3 = 2 % 2;
                } else {
                    ExtensionsManager1.onWarmupCompleted(4294967297L);
                    throw null;
                }
            } else {
                jOnWarmupCompleted = j;
            }
            if ((i & 2) != 0) {
                iAuthTabCallback2 = IAuthTabCallback.RGBA8;
                int i4 = 2 % 2;
            } else {
                iAuthTabCallback2 = iAuthTabCallback;
            }
            boolean z4 = false;
            boolean z5 = (i & 4) != 0 ? false : z;
            boolean z6 = (i & 8) != 0 ? false : z2;
            if ((i & 16) != 0) {
                int i5 = IAuthTabCallbackStub + 49;
                asBinder = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 2;
                }
            } else {
                z4 = z3;
            }
            this(jOnWarmupCompleted, iAuthTabCallback2, z5, z6, z4, null);
        }

        public final long IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 1;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallback;
            }
            int i3 = 31 / 0;
            return this.onExtraCallback;
        }

        public final IAuthTabCallback onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 27;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback iAuthTabCallback = this.onNavigationEvent;
            int i5 = i2 + 119;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallback;
        }

        public final boolean onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 29;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            boolean z = this.onWarmupCompleted;
            int i4 = i2 + 9;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 89 / 0;
            }
            return z;
        }

        public final boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 21;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 21;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            boolean z = this.IAuthTabCallback;
            int i4 = i2 + 101;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }
    }

    static /* synthetic */ void onExtraCallbackWithResult(setCipherSuitesokhttp setciphersuitesokhttp, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
        }
        if ((i2 & 1) != 0) {
            i = 0;
        }
        setciphersuitesokhttp.onWarmupCompleted(i);
    }
}
