package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class userDrivenScrollEnded {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ userDrivenScrollEnded[] $VALUES;
    public static final IAuthTabCallback Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    public static final userDrivenScrollEnded TOSS_CA_CERT = new userDrivenScrollEnded("TOSS_CA_CERT", 0);
    public static final userDrivenScrollEnded LEGACY_CERT = new userDrivenScrollEnded("LEGACY_CERT", 1);
    public static final userDrivenScrollEnded PRIVATE_PKI = new userDrivenScrollEnded("PRIVATE_PKI", 2);

    private static final /* synthetic */ userDrivenScrollEnded[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        userDrivenScrollEnded[] userdrivenscrollendedArr = {TOSS_CA_CERT, LEGACY_CERT, PRIVATE_PKI};
        int i5 = i3 + 97;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return userdrivenscrollendedArr;
    }

    public static EnumEntries<userDrivenScrollEnded> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<userDrivenScrollEnded> enumEntries = $ENTRIES;
        if (i3 != 0) {
            int i4 = 19 / 0;
        }
        return enumEntries;
    }

    public static userDrivenScrollEnded valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        userDrivenScrollEnded userdrivenscrollended = (userDrivenScrollEnded) Enum.valueOf(userDrivenScrollEnded.class, str);
        if (i3 == 0) {
            int i4 = 19 / 0;
        }
        return userdrivenscrollended;
    }

    public static userDrivenScrollEnded[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        userDrivenScrollEnded[] userdrivenscrollendedArr = (userDrivenScrollEnded[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 125;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return userdrivenscrollendedArr;
    }

    private userDrivenScrollEnded(String str, int i) {
    }

    static {
        userDrivenScrollEnded[] userdrivenscrollendedArr$values = $values();
        $VALUES = userdrivenscrollendedArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(userdrivenscrollendedArr$values);
        Companion = new IAuthTabCallback(null);
        int i = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 37 / 0;
        }
    }

    public static final class IAuthTabCallback {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        
            return o.userDrivenScrollEnded.TOSS_CA_CERT;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        
            if ((!kotlin.jvm.internal.Intrinsics.areEqual(r4, o.TypeUtilsMethodInheritanceComparator.IAuthTabCallback.onExtraCallbackWithResult)) == true) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        
            r4 = o.userDrivenScrollEnded.IAuthTabCallback.onExtraCallback + 75;
            o.userDrivenScrollEnded.IAuthTabCallback.onWarmupCompleted = r4 % 128;
            r4 = r4 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        
            return o.userDrivenScrollEnded.PRIVATE_PKI;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r4, o.TypeUtilsMethodInheritanceComparator.onExtraCallbackWithResult.IAuthTabCallback) == false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
        
            return o.userDrivenScrollEnded.LEGACY_CERT;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
        
            if (r4 != null) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
        
            r4 = o.userDrivenScrollEnded.IAuthTabCallback.onWarmupCompleted + 101;
            o.userDrivenScrollEnded.IAuthTabCallback.onExtraCallback = r4 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
        
            if ((r4 % 2) == 0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
        
            r4 = 97 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
        
            throw new kotlin.NoWhenBranchMatchedException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r4, o.TypeUtils5.onExtraCallback.onExtraCallbackWithResult) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r4, o.TypeUtils5.onExtraCallback.onExtraCallbackWithResult) != false) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final o.userDrivenScrollEnded onNavigationEvent(@org.jetbrains.annotations.Nullable o.TypeUtils3 r4) throws kotlin.NoWhenBranchMatchedException {
            /*
                r3 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = o.userDrivenScrollEnded.IAuthTabCallback.onExtraCallback
                int r1 = r1 + 83
                int r2 = r1 % 128
                o.userDrivenScrollEnded.IAuthTabCallback.onWarmupCompleted = r2
                int r1 = r1 % r0
                if (r1 != 0) goto L1b
                o.TypeUtils5$onExtraCallback r1 = o.TypeUtils5.onExtraCallback.onExtraCallbackWithResult
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r1)
                r2 = 86
                int r2 = r2 / 0
                if (r1 == 0) goto L26
                goto L23
            L1b:
                o.TypeUtils5$onExtraCallback r1 = o.TypeUtils5.onExtraCallback.onExtraCallbackWithResult
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r1)
                if (r1 == 0) goto L26
            L23:
                o.userDrivenScrollEnded r4 = o.userDrivenScrollEnded.TOSS_CA_CERT
                return r4
            L26:
                o.TypeUtilsMethodInheritanceComparator$IAuthTabCallback r1 = o.TypeUtilsMethodInheritanceComparator.IAuthTabCallback.onExtraCallbackWithResult
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r1)
                r2 = 1
                r1 = r1 ^ r2
                if (r1 == r2) goto L3c
                int r4 = o.userDrivenScrollEnded.IAuthTabCallback.onExtraCallback
                int r4 = r4 + 75
                int r1 = r4 % 128
                o.userDrivenScrollEnded.IAuthTabCallback.onWarmupCompleted = r1
                int r4 = r4 % r0
                o.userDrivenScrollEnded r4 = o.userDrivenScrollEnded.PRIVATE_PKI
                return r4
            L3c:
                o.TypeUtilsMethodInheritanceComparator$onExtraCallbackWithResult r1 = o.TypeUtilsMethodInheritanceComparator.onExtraCallbackWithResult.IAuthTabCallback
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r1)
                if (r1 == 0) goto L47
                o.userDrivenScrollEnded r4 = o.userDrivenScrollEnded.LEGACY_CERT
                return r4
            L47:
                if (r4 != 0) goto L5a
                int r4 = o.userDrivenScrollEnded.IAuthTabCallback.onWarmupCompleted
                int r4 = r4 + 101
                int r1 = r4 % 128
                o.userDrivenScrollEnded.IAuthTabCallback.onExtraCallback = r1
                int r4 = r4 % r0
                if (r4 == 0) goto L58
                r4 = 97
                int r4 = r4 / 0
            L58:
                r4 = 0
                return r4
            L5a:
                kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
                r4.<init>()
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.userDrivenScrollEnded.IAuthTabCallback.onNavigationEvent(o.TypeUtils3):o.userDrivenScrollEnded");
        }
    }
}
