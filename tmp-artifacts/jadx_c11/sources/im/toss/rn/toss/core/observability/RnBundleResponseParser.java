package im.toss.rn.toss.core.observability;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RnBundleResponseParser {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    public static final RnBundleResponseParser onWarmupCompleted = new RnBundleResponseParser();

    static {
        int i = onExtraCallback + 25;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 90 / 0;
        }
    }

    private RnBundleResponseParser() {
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ServerTiming onWarmupCompleted(@Nullable String str) {
        Iterator it;
        Object next;
        Object next2;
        String strReplace$default;
        String strRemovePrefix;
        String strTrim;
        String strTake;
        String strRemovePrefix2;
        int i = 2 % 2;
        if (str == null || StringsKt.isBlank(str)) {
            return new ServerTiming(CollectionsKt.emptyList(), null);
        }
        ArrayList arrayList = new ArrayList();
        Double dValueOf = null;
        for (String str2 : StringsKt.split$default(str, new String[]{","}, false, 0, 6, (Object) null)) {
            if (arrayList.size() < 20) {
                List listSplit$default = StringsKt.split$default(str2, new String[]{";"}, false, 0, 6, (Object) null);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
                Iterator it2 = listSplit$default.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(StringsKt.trim((String) it2.next()).toString());
                }
                String str3 = (String) CollectionsKt.firstOrNull(arrayList2);
                if (str3 == null) {
                    str3 = "";
                }
                if (str3.length() != 0) {
                    int i2 = onExtraCallbackWithResult + 37;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        it = arrayList2.iterator();
                        int i3 = 57 / 0;
                    } else {
                        it = arrayList2.iterator();
                    }
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (StringsKt.startsWith$default((String) next, "dur=", false, 2, (Object) null)) {
                            break;
                        }
                    }
                    String str4 = (String) next;
                    Double doubleOrNull = (str4 == null || (strRemovePrefix2 = StringsKt.removePrefix(str4, "dur=")) == null) ? null : StringsKt.toDoubleOrNull(strRemovePrefix2);
                    if (doubleOrNull != null) {
                        int i4 = onExtraCallbackWithResult + 101;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                        if (Math.abs(doubleOrNull.doubleValue()) <= Double.MAX_VALUE && doubleOrNull.doubleValue() >= 0.0d) {
                            int i6 = IAuthTabCallback + 21;
                            onExtraCallbackWithResult = i6 % 128;
                            int i7 = i6 % 2;
                            Iterator it3 = arrayList2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it3.next();
                                if (StringsKt.startsWith$default((String) next2, "desc=", false, 2, (Object) null)) {
                                    break;
                                }
                            }
                            String str5 = (String) next2;
                            if (str5 == null || (strRemovePrefix = StringsKt.removePrefix(str5, "desc=")) == null || (strTrim = StringsKt.trim(strRemovePrefix, new char[]{'\"'})) == null) {
                                strReplace$default = null;
                                StringBuilder sb = new StringBuilder();
                                sb.append(str3);
                                sb.append(';');
                                sb.append("dur=");
                                sb.append(onWarmupCompleted.onNavigationEvent(doubleOrNull.doubleValue()));
                                if (strReplace$default != null) {
                                    sb.append(";");
                                    sb.append("desc=");
                                    sb.append('\"');
                                    sb.append(strReplace$default);
                                    sb.append('\"');
                                }
                                arrayList.add(sb.toString());
                                dValueOf = Double.valueOf((dValueOf == null ? dValueOf.doubleValue() : 0.0d) + doubleOrNull.doubleValue());
                            } else {
                                int i8 = IAuthTabCallback + 123;
                                onExtraCallbackWithResult = i8 % 128;
                                int i9 = i8 % 2;
                                if (strTrim.length() <= 0) {
                                    strTrim = null;
                                }
                                if (strTrim != null && (strTake = StringsKt.take(strTrim, 50)) != null) {
                                    strReplace$default = StringsKt.replace$default(strTake, "\"", "\\\"", false, 4, (Object) null);
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(str3);
                                sb2.append(';');
                                sb2.append("dur=");
                                sb2.append(onWarmupCompleted.onNavigationEvent(doubleOrNull.doubleValue()));
                                if (strReplace$default != null) {
                                }
                                arrayList.add(sb2.toString());
                                dValueOf = Double.valueOf((dValueOf == null ? dValueOf.doubleValue() : 0.0d) + doubleOrNull.doubleValue());
                            }
                        }
                    }
                }
            }
        }
        return new ServerTiming(arrayList, dValueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String onNavigationEvent(double d) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 38 / 0;
            if (d == Math.floor(d)) {
                if (d < 9.223372036854776E18d) {
                    int i4 = IAuthTabCallback + 81;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    String strValueOf = String.valueOf((long) d);
                    int i6 = onExtraCallbackWithResult + 9;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 5 / 0;
                    }
                    return strValueOf;
                }
            }
        } else if (d == Math.floor(d)) {
        }
        return String.valueOf(d);
    }

    public static final class ServerTiming {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private final List<String> IAuthTabCallback;
        private final Double onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ServerTiming)) {
                int i5 = i3 + 43;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            ServerTiming serverTiming = (ServerTiming) obj;
            if (Intrinsics.areEqual(this.IAuthTabCallback, serverTiming.IAuthTabCallback)) {
                if (Intrinsics.areEqual(this.onExtraCallbackWithResult, serverTiming.onExtraCallbackWithResult)) {
                    return true;
                }
                int i7 = onNavigationEvent + 83;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            int i9 = onNavigationEvent + 95;
            int i10 = i9 % 128;
            onExtraCallback = i10;
            int i11 = i9 % 2;
            int i12 = i10 + 23;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0034 A[PHI: r1 r3
          0x0034: PHI (r1v10 int) = (r1v5 int), (r1v12 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
          0x0034: PHI (r3v4 java.lang.Double) = (r3v0 java.lang.Double), (r3v5 java.lang.Double) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r1
          0x0027: PHI (r1v6 int) = (r1v5 int), (r1v12 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int hashCode() {
            int iHashCode;
            Double d;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 23;
            onExtraCallback = i2 % 128;
            int iHashCode2 = 0;
            if (i2 % 2 != 0) {
                iHashCode = this.IAuthTabCallback.hashCode();
                d = this.onExtraCallbackWithResult;
                int i3 = 97 / 0;
                if (d == null) {
                    int i4 = onNavigationEvent + 105;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        iHashCode2 = 1;
                    }
                } else {
                    iHashCode2 = d.hashCode();
                }
            } else {
                iHashCode = this.IAuthTabCallback.hashCode();
                d = this.onExtraCallbackWithResult;
                if (d == null) {
                }
            }
            return (iHashCode * 31) + iHashCode2;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ServerTiming(entries=" + this.IAuthTabCallback + ", totalMs=" + this.onExtraCallbackWithResult + ")";
            int i2 = onNavigationEvent + 121;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public ServerTiming(@NotNull List<String> list, @Nullable Double d) {
            Intrinsics.checkNotNullParameter(list, "");
            this.IAuthTabCallback = list;
            this.onExtraCallbackWithResult = d;
        }

        public final List<String> IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return this.IAuthTabCallback;
            }
            throw null;
        }

        public final Double onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 71;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Double d = this.onExtraCallbackWithResult;
            int i5 = i2 + 109;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return d;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
