package o;

import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getDelegateokhttp {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static final getDelegateokhttp IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int access100 = 1;
    private static int asBinder;
    private static final getDelegateokhttp onExtraCallback;
    private static final getDelegateokhttp onExtraCallbackWithResult;
    private static final getDelegateokhttp onNavigationEvent;
    private static final getDelegateokhttp onWarmupCompleted;
    private final IAuthTabCallback asInterface;
    private final onExtraCallbackWithResult onTransact;

    public static final /* synthetic */ class onNavigationEvent {
        private static int IAuthTabCallback = 1;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[onExtraCallbackWithResult.values().length];
            try {
                iArr[onExtraCallbackWithResult.Default.ordinal()] = 1;
                int i = onWarmupCompleted + 109;
                IAuthTabCallback = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onExtraCallbackWithResult.NoBreakSpace.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onNavigationEvent = iArr;
            int[] iArr2 = new int[IAuthTabCallback.values().length];
            try {
                iArr2[IAuthTabCallback.Default.ordinal()] = 1;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[IAuthTabCallback.NoBreakSpace.ordinal()] = 2;
                int i4 = onWarmupCompleted + 51;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            onExtraCallbackWithResult = iArr2;
            int i7 = IAuthTabCallback + 125;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private getDelegateokhttp(onExtraCallbackWithResult onextracallbackwithresult, IAuthTabCallback iAuthTabCallback) {
        this.onTransact = onextracallbackwithresult;
        this.asInterface = iAuthTabCallback;
    }

    public static final /* synthetic */ getDelegateokhttp IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 97;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        getDelegateokhttp getdelegateokhttp = onExtraCallbackWithResult;
        int i5 = i3 + 69;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return getdelegateokhttp;
    }

    public static final /* synthetic */ getDelegateokhttp onExtraCallback() {
        int i = 2 % 2;
        int i2 = access100 + 13;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        getDelegateokhttp getdelegateokhttp = IAuthTabCallback;
        int i5 = i3 + 93;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return getdelegateokhttp;
    }

    public static final /* synthetic */ getDelegateokhttp onExtraCallbackWithResult() {
        getDelegateokhttp getdelegateokhttp;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        int i3 = i2 % 128;
        access100 = i3;
        if (i2 % 2 == 0) {
            getdelegateokhttp = onNavigationEvent;
            int i4 = 96 / 0;
        } else {
            getdelegateokhttp = onNavigationEvent;
        }
        int i5 = i3 + 51;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return getdelegateokhttp;
    }

    public static final /* synthetic */ getDelegateokhttp onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 49;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getDelegateokhttp getdelegateokhttp = onExtraCallback;
        int i4 = i3 + 19;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return getdelegateokhttp;
    }

    public static final /* synthetic */ getDelegateokhttp onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access100 + 113;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if ((r2 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r1 != 3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r1 != 2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r1 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r1 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r2 = o.getDelegateokhttp.IAuthTabCallbackStub + 117;
        o.getDelegateokhttp.access100 = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean IAuthTabCallbackStub() throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        int i3 = access100 + 47;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            i = onNavigationEvent.onNavigationEvent[this.onTransact.ordinal()];
        } else {
            i = onNavigationEvent.onNavigationEvent[this.onTransact.ordinal()];
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean onTransact() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onNavigationEvent.onExtraCallbackWithResult[this.asInterface.ordinal()];
        if (i2 == 1) {
            return true;
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = IAuthTabCallbackStub;
        int i4 = i3 + 87;
        access100 = i4 % 128;
        boolean z = i4 % 2 == 0;
        int i5 = i3 + 21;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 51;
        int i4 = i3 % 128;
        access100 = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 1;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (obj != null) {
            int i8 = i2 + 117;
            access100 = i8 % 128;
            if (i8 % 2 == 0) {
                cls = obj.getClass();
                int i9 = 71 / 0;
            } else {
                cls = obj.getClass();
            }
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(getDelegateokhttp.class, cls)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        getDelegateokhttp getdelegateokhttp = (getDelegateokhttp) obj;
        return this.onTransact == getdelegateokhttp.onTransact && this.asInterface == getdelegateokhttp.asInterface;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        access100 = i2 % 128;
        return i2 % 2 == 0 ? (this.onTransact.hashCode() << 4) >>> this.asInterface.hashCode() : (this.onTransact.hashCode() * 31) + this.asInterface.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TdsWordBreakStrategy(space=" + this.onTransact + ", newLine=" + this.asInterface + ")";
        int i2 = IAuthTabCallbackStub + 103;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 58 / 0;
        }
        return str;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        public static final onExtraCallbackWithResult Default = new onExtraCallbackWithResult("Default", 0);
        public static final onExtraCallbackWithResult NoBreakSpace = new onExtraCallbackWithResult("NoBreakSpace", 1);

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            onExtraCallbackWithResult[] onextracallbackwithresultArr;
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 83;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                onExtraCallbackWithResult onextracallbackwithresult = Default;
                onExtraCallbackWithResult onextracallbackwithresult2 = NoBreakSpace;
                onextracallbackwithresultArr = new onExtraCallbackWithResult[2];
                onextracallbackwithresultArr[0] = onextracallbackwithresult;
                onextracallbackwithresultArr[0] = onextracallbackwithresult2;
            } else {
                onextracallbackwithresultArr = new onExtraCallbackWithResult[]{Default, NoBreakSpace};
            }
            int i4 = i2 + 97;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallbackwithresultArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return $ENTRIES;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            int i4 = IAuthTabCallback + 53;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresult;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            int i4 = IAuthTabCallback + 87;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresultArr;
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = onExtraCallbackWithResult + 121;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        public static final IAuthTabCallback Default = new IAuthTabCallback("Default", 0);
        public static final IAuthTabCallback NoBreakSpace = new IAuthTabCallback("NoBreakSpace", 1);

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            IAuthTabCallback[] iAuthTabCallbackArr;
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 != 0) {
                IAuthTabCallback iAuthTabCallback = Default;
                IAuthTabCallback iAuthTabCallback2 = NoBreakSpace;
                iAuthTabCallbackArr = new IAuthTabCallback[4];
                iAuthTabCallbackArr[0] = iAuthTabCallback;
                iAuthTabCallbackArr[0] = iAuthTabCallback2;
            } else {
                iAuthTabCallbackArr = new IAuthTabCallback[]{Default, NoBreakSpace};
            }
            int i4 = i3 + 11;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 27;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
            int i4 = i3 + 39;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return enumEntries;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            if (i3 != 0) {
                int i4 = 94 / 0;
            }
            int i5 = onWarmupCompleted + 7;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallback;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            int i3 = onExtraCallback + 39;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return iAuthTabCallbackArr;
            }
            throw null;
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = IAuthTabCallback + 5;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final getDelegateokhttp onExtraCallbackWithResult() {
            getDelegateokhttp getdelegateokhttpIAuthTabCallback;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                getdelegateokhttpIAuthTabCallback = getDelegateokhttp.IAuthTabCallback();
                int i3 = 83 / 0;
            } else {
                getdelegateokhttpIAuthTabCallback = getDelegateokhttp.IAuthTabCallback();
            }
            int i4 = IAuthTabCallback + 111;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return getdelegateokhttpIAuthTabCallback;
        }

        public final getDelegateokhttp onTransact() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return getDelegateokhttp.onNavigationEvent();
            }
            getDelegateokhttp.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final getDelegateokhttp onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 123;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                getDelegateokhttp.onExtraCallback();
                obj.hashCode();
                throw null;
            }
            getDelegateokhttp getdelegateokhttpOnExtraCallback = getDelegateokhttp.onExtraCallback();
            int i3 = IAuthTabCallback + 43;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return getdelegateokhttpOnExtraCallback;
            }
            throw null;
        }

        public final getDelegateokhttp IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getDelegateokhttp getdelegateokhttpOnExtraCallbackWithResult = getDelegateokhttp.onExtraCallbackWithResult();
            int i4 = IAuthTabCallback + 73;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return getdelegateokhttpOnExtraCallbackWithResult;
        }

        public final getDelegateokhttp onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return getDelegateokhttp.onWarmupCompleted();
            }
            getDelegateokhttp.onWarmupCompleted();
            throw null;
        }

        public final getDelegateokhttp onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                if (!Intrinsics.areEqual(getTcfVendorConsentStatus.Companion.asInterface(), Locale.KOREA)) {
                    return onTransact();
                }
                getDelegateokhttp getdelegateokhttpIAuthTabCallback = IAuthTabCallback();
                int i3 = onExtraCallback + 3;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return getdelegateokhttpIAuthTabCallback;
                }
                obj.hashCode();
                throw null;
            }
            Intrinsics.areEqual(getTcfVendorConsentStatus.Companion.asInterface(), Locale.KOREA);
            obj.hashCode();
            throw null;
        }
    }

    static {
        onExtraCallbackWithResult onextracallbackwithresult = onExtraCallbackWithResult.Default;
        IAuthTabCallback iAuthTabCallback = IAuthTabCallback.Default;
        getDelegateokhttp getdelegateokhttp = new getDelegateokhttp(onextracallbackwithresult, iAuthTabCallback);
        onExtraCallbackWithResult = getdelegateokhttp;
        IAuthTabCallback iAuthTabCallback2 = IAuthTabCallback.NoBreakSpace;
        onExtraCallback = new getDelegateokhttp(onextracallbackwithresult, iAuthTabCallback2);
        onExtraCallbackWithResult onextracallbackwithresult2 = onExtraCallbackWithResult.NoBreakSpace;
        IAuthTabCallback = new getDelegateokhttp(onextracallbackwithresult2, iAuthTabCallback);
        onNavigationEvent = new getDelegateokhttp(onextracallbackwithresult2, iAuthTabCallback2);
        onWarmupCompleted = getdelegateokhttp;
        int i = asBinder + 55;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
