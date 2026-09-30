package im.toss.rn.toss.core.remoteprocess;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.DERSet;
import o.access15300;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RnRemoteProcessRouting {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final RnRemoteProcessRouting onWarmupCompleted = new RnRemoteProcessRouting();

    static {
        int i = onExtraCallbackWithResult + 55;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private RnRemoteProcessRouting() {
    }

    public static /* synthetic */ Decision IAuthTabCallback(RnRemoteProcessRouting rnRemoteProcessRouting, Uri uri, String str, boolean z, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = IAuthTabCallback + 79;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                DERSet.onExtraCallback.menuHostHelperlambda0();
                throw null;
            }
            z = DERSet.onExtraCallback.menuHostHelperlambda0();
        }
        if ((i & 8) != 0) {
            int i4 = onNavigationEvent + 15;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                DERSet.onExtraCallback.fullyDrawnReporter_delegatelambda0();
                throw null;
            }
            str2 = DERSet.onExtraCallback.fullyDrawnReporter_delegatelambda0();
        }
        return rnRemoteProcessRouting.onNavigationEvent(uri, str, z, str2);
    }

    public final Decision onNavigationEvent(@NotNull Uri uri, @NotNull String str, boolean z, @NotNull String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (Intrinsics.areEqual(uri.getQueryParameter("_translucent"), "true")) {
            Decision.Main main = new Decision.Main(Reason.TRANSLUCENT);
            int i2 = IAuthTabCallback + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return main;
        }
        if (!RnSchemeAndroidOnlyQueryParamsKt.onWarmupCompleted(uri)) {
            return new Decision.Main(Reason.MAIN_NO_REMOTE_PROCESS);
        }
        if (!z) {
            return new Decision.Main(Reason.MAIN_FEATURE_DISABLED);
        }
        if (!onExtraCallbackWithResult(str2).contains(str)) {
            return new Decision.Main(Reason.MAIN_NOT_ALLOWLISTED);
        }
        Decision.RemoteProcess remoteProcess = Decision.RemoteProcess.IAuthTabCallback;
        int i4 = IAuthTabCallback + 5;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return remoteProcess;
    }

    public static /* synthetic */ Reason IAuthTabCallback(RnRemoteProcessRouting rnRemoteProcessRouting, Uri uri, boolean z, boolean z2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 43;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if ((i & 4) != 0) {
            int i6 = i4 + 39;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                DERSet.onExtraCallback.menuHostHelperlambda0();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            z2 = DERSet.onExtraCallback.menuHostHelperlambda0();
        }
        Reason reasonOnExtraCallback = rnRemoteProcessRouting.onExtraCallback(uri, z, z2);
        int i7 = IAuthTabCallback + 93;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return reasonOnExtraCallback;
    }

    public final Reason onExtraCallback(@Nullable Uri uri, boolean z, boolean z2) {
        String queryParameter;
        int i = 2 % 2;
        Object obj = null;
        if (uri != null) {
            int i2 = onNavigationEvent + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            queryParameter = uri.getQueryParameter("_translucent");
        } else {
            queryParameter = null;
        }
        if (Intrinsics.areEqual(queryParameter, "true")) {
            Reason reason = Reason.TRANSLUCENT;
            int i4 = IAuthTabCallback + 83;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return reason;
            }
            obj.hashCode();
            throw null;
        }
        if (!z) {
            return Reason.MAIN_NO_REMOTE_PROCESS;
        }
        if (z2) {
            return null;
        }
        int i5 = onNavigationEvent + 103;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Reason reason2 = Reason.MAIN_FEATURE_DISABLED;
        int i7 = IAuthTabCallback + 93;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            return reason2;
        }
        throw null;
    }

    public static /* synthetic */ Reason IAuthTabCallback(RnRemoteProcessRouting rnRemoteProcessRouting, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 103;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        if (i3 % 2 == 0 ? (i & 2) != 0 : (i & 4) != 0) {
            int i5 = i4 + 9;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                str2 = DERSet.onExtraCallback.fullyDrawnReporter_delegatelambda0();
                int i6 = 38 / 0;
            } else {
                str2 = DERSet.onExtraCallback.fullyDrawnReporter_delegatelambda0();
            }
        }
        return rnRemoteProcessRouting.onExtraCallback(str, str2);
    }

    public final Reason onExtraCallback(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            boolean zContains = onExtraCallbackWithResult(str2).contains(str);
            int i3 = 45 / 0;
            if (!(!zContains)) {
                return null;
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            if (onExtraCallbackWithResult(str2).contains(str)) {
                return null;
            }
        }
        int i4 = onNavigationEvent + 123;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return Reason.MAIN_NOT_ALLOWLISTED;
    }

    private final Set<String> onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        List listSplit$default = StringsKt.split$default(str, new char[]{','}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.trim((String) it.next()).toString());
            int i2 = onNavigationEvent + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int i4 = onNavigationEvent + 59;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                ((String) it2.next()).length();
                throw null;
            }
            Object next = it2.next();
            if (((String) next).length() > 0) {
                arrayList2.add(next);
                int i5 = onNavigationEvent + 83;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        return CollectionsKt.toSet(arrayList2);
    }

    public static abstract class Decision {
        public /* synthetic */ Decision(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class RemoteProcess extends Decision {
            public static final RemoteProcess IAuthTabCallback = new RemoteProcess();
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            private static int onWarmupCompleted;

            static {
                int i = onExtraCallback + 9;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 85;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                if (this == obj) {
                    int i5 = i2 + 107;
                    onWarmupCompleted = i5 % 128;
                    return i5 % 2 == 0;
                }
                if (!(obj instanceof RemoteProcess)) {
                    return false;
                }
                int i6 = i2 + 51;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 26 / 0;
                }
                return true;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 105;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return 1095104354;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 3;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 37;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return "RemoteProcess";
            }

            private RemoteProcess() {
                super(null);
            }
        }

        private Decision() {
        }

        public static final class Main extends Decision {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private final Reason onWarmupCompleted;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 71;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                if (this == obj) {
                    int i5 = i3 + 95;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return true;
                }
                if (!(obj instanceof Main)) {
                    int i7 = i3 + 79;
                    int i8 = i7 % 128;
                    onExtraCallbackWithResult = i8;
                    int i9 = i7 % 2;
                    int i10 = i8 + 53;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                    return false;
                }
                if (this.onWarmupCompleted == ((Main) obj).onWarmupCompleted) {
                    return true;
                }
                int i12 = i3 + 5;
                onExtraCallbackWithResult = i12 % 128;
                if (i12 % 2 != 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 67;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = this.onWarmupCompleted.hashCode();
                int i4 = onExtraCallbackWithResult + 39;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return iHashCode;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Main(reason=" + this.onWarmupCompleted + ")";
                int i2 = IAuthTabCallback + 123;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Main(@NotNull Reason reason) {
                super(null);
                Intrinsics.checkNotNullParameter(reason, "");
                this.onWarmupCompleted = reason;
            }

            public final Reason IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 119;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.onWarmupCompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Reason {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Reason[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private final String value;
        public static final Reason TRANSLUCENT = new Reason("TRANSLUCENT", 0, "translucent");
        public static final Reason MAIN_FEATURE_DISABLED = new Reason("MAIN_FEATURE_DISABLED", 1, "main_feature_disabled");
        public static final Reason MAIN_NOT_ALLOWLISTED = new Reason("MAIN_NOT_ALLOWLISTED", 2, "main_not_allowlisted");
        public static final Reason MAIN_NO_REMOTE_PROCESS = new Reason("MAIN_NO_REMOTE_PROCESS", 3, "main_no_remote_process");

        private static final /* synthetic */ Reason[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Reason reason = TRANSLUCENT;
            if (i3 == 0) {
                return new Reason[]{reason, MAIN_FEATURE_DISABLED, MAIN_NOT_ALLOWLISTED, MAIN_NO_REMOTE_PROCESS};
            }
            Reason reason2 = MAIN_FEATURE_DISABLED;
            Reason reason3 = MAIN_NOT_ALLOWLISTED;
            Reason reason4 = MAIN_NO_REMOTE_PROCESS;
            Reason[] reasonArr = new Reason[4];
            reasonArr[0] = reason;
            reasonArr[1] = reason2;
            reasonArr[5] = reason3;
            reasonArr[4] = reason4;
            return reasonArr;
        }

        public static EnumEntries<Reason> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            EnumEntries<Reason> enumEntries = $ENTRIES;
            int i5 = i3 + 107;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static Reason valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Reason reason = (Reason) Enum.valueOf(Reason.class, str);
            int i4 = IAuthTabCallback + 91;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return reason;
        }

        public static Reason[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 105;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Reason[] reasonArr = (Reason[]) $VALUES.clone();
            int i4 = IAuthTabCallback + 107;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return reasonArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private Reason(String str, int i, String str2) {
            this.value = str2;
        }

        public final String getValue() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 15;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            String str = this.value;
            int i5 = i3 + 79;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        static {
            Reason[] reasonArr$values = $values();
            $VALUES = reasonArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(reasonArr$values);
            int i = onExtraCallback + 81;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }
}
