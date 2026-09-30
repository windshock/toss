package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getBreadcrumbIndex {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final boolean onExtraCallbackWithResult;

    public getBreadcrumbIndex() {
        this(false, 1, null);
    }

    public getBreadcrumbIndex(boolean z) {
        this.onExtraCallbackWithResult = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getBreadcrumbIndex(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 45;
            onNavigationEvent = i2 % 128;
            z = i2 % 2 != 0;
            int i3 = 2 % 2;
        }
        this(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0129 A[PHI: r1
      0x0129: PHI (r1v8 boolean) = (r1v7 boolean), (r1v10 boolean) binds: [B:41:0x011b, B:44:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final logNull onWarmupCompleted(@NotNull String str) {
        int i;
        boolean z;
        Regex regex;
        Iterator it;
        boolean z2;
        int i2;
        int i3;
        Iterator it2;
        boolean z3;
        String str2;
        int i4 = 2;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Pair<String, String> pairIAuthTabCallback = IAuthTabCallback(str);
        String strOnExtraCallbackWithResult = pairIAuthTabCallback.onExtraCallbackWithResult();
        String strIAuthTabCallback = pairIAuthTabCallback.IAuthTabCallback();
        StringBuilder sb = new StringBuilder("^");
        if (strOnExtraCallbackWithResult != null) {
            int i6 = onWarmupCompleted + 97;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            sb.append("(?i:");
            sb.append(Regex.Companion.IAuthTabCallback(strOnExtraCallbackWithResult));
            sb.append(")");
        } else {
            sb.append("(?:[a-z][a-z0-9+.-]*://[^/?#]*)?");
            int i8 = onNavigationEvent + 5;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 5 % 2;
            }
        }
        ?? r7 = 0;
        if (StringsKt__StringsJVMKt.startsWith$default(strIAuthTabCallback, "/", false, 2, null)) {
            sb.append("/");
            strIAuthTabCallback = strIAuthTabCallback.substring(1);
            Intrinsics.checkNotNullExpressionValue(strIAuthTabCallback, "");
            int i10 = onNavigationEvent + 33;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (strIAuthTabCallback.length() > 0) {
            int i12 = onNavigationEvent + 11;
            onWarmupCompleted = i12 % 128;
            if (i12 % 2 != 0) {
                it = onExtraCallbackWithResult(strIAuthTabCallback).iterator();
                z2 = false;
                i2 = 0;
                i3 = 1;
            } else {
                it = onExtraCallbackWithResult(strIAuthTabCallback).iterator();
                z2 = false;
                i2 = 0;
                i3 = 0;
            }
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (i3 > 0) {
                    sb.append("/");
                }
                if (str3.length() == 0) {
                    Unit unit = Unit.INSTANCE;
                } else {
                    if (Intrinsics.areEqual(str3, "*")) {
                        sb.append("[^/?#]+");
                        int i13 = onNavigationEvent + 59;
                        onWarmupCompleted = i13 % 128;
                        int i14 = i13 % i4;
                    } else {
                        if (Intrinsics.areEqual(str3, "**")) {
                            int i15 = onNavigationEvent + 35;
                            onWarmupCompleted = i15 % 128;
                            if (i15 % i4 != 0) {
                                int i16 = 35 / r7;
                                if (i3 > 0) {
                                    sb.deleteCharAt(sb.length() - 1);
                                    sb.append("(?:/[^?#]*)?");
                                } else {
                                    sb.append("(?:[^?#]*)?");
                                }
                            } else if (i3 > 0) {
                            }
                            it2 = it;
                            z3 = true;
                            z2 = true;
                        } else {
                            it2 = it;
                            boolean zStartsWith$default = StringsKt__StringsJVMKt.startsWith$default(str3, "{", r7, i4, null);
                            boolean z4 = true;
                            if (!zStartsWith$default) {
                                i2++;
                                sb.append(Regex.Companion.IAuthTabCallback(str3));
                                z3 = z4;
                            } else {
                                z4 = true;
                                if (!(!StringsKt__StringsJVMKt.endsWith$default(str3, "}", r7, 2, null))) {
                                    String strSubstring = str3.substring(1, str3.length() - 1);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                                    onWarmupCompleted onwarmupcompletedOnNavigationEvent = onNavigationEvent(strSubstring);
                                    if (onwarmupcompletedOnNavigationEvent instanceof onWarmupCompleted.IAuthTabCallback) {
                                        onWarmupCompleted.IAuthTabCallback iAuthTabCallback = (onWarmupCompleted.IAuthTabCallback) onwarmupcompletedOnNavigationEvent;
                                        arrayList.add(iAuthTabCallback.onWarmupCompleted());
                                        linkedHashSet.add(iAuthTabCallback.onWarmupCompleted());
                                        if (i3 > 0) {
                                            z3 = true;
                                            sb.deleteCharAt(sb.length() - 1);
                                            sb.append("(?:/(?<" + iAuthTabCallback.onWarmupCompleted() + ">[^?#]*?))?");
                                        } else {
                                            z3 = true;
                                            sb.append("(?<" + iAuthTabCallback.onWarmupCompleted() + ">[^?#]*?)");
                                        }
                                        z2 = z3;
                                    } else {
                                        if (!(onwarmupcompletedOnNavigationEvent instanceof onWarmupCompleted.C0030onWarmupCompleted)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i17 = onWarmupCompleted + 83;
                                        onNavigationEvent = i17 % 128;
                                        int i18 = i17 % 2;
                                        onWarmupCompleted.C0030onWarmupCompleted c0030onWarmupCompleted = (onWarmupCompleted.C0030onWarmupCompleted) onwarmupcompletedOnNavigationEvent;
                                        String strOnExtraCallback = c0030onWarmupCompleted.onExtraCallback();
                                        String str4 = strOnExtraCallback != null ? strOnExtraCallback : "[^/?#]+";
                                        if (c0030onWarmupCompleted.onNavigationEvent() != null) {
                                            arrayList.add(c0030onWarmupCompleted.onNavigationEvent());
                                            str2 = "(?<" + c0030onWarmupCompleted.onNavigationEvent() + ">" + str4 + ")";
                                        } else {
                                            str2 = "(?:" + str4 + ")";
                                        }
                                        if (!c0030onWarmupCompleted.IAuthTabCallback()) {
                                            sb.append(str2);
                                        } else if (i3 > 0) {
                                            sb.deleteCharAt(sb.length() - 1);
                                            sb.append("(?:/" + str2 + ")?");
                                        } else {
                                            sb.append("(?:" + str2 + ")?");
                                        }
                                        z3 = true;
                                    }
                                }
                            }
                        }
                        i3++;
                        it = it2;
                        i4 = 2;
                        r7 = 0;
                    }
                }
                it2 = it;
                z3 = true;
                i3++;
                it = it2;
                i4 = 2;
                r7 = 0;
            }
            z = z2;
            i = i2;
        } else {
            i = 0;
            z = false;
        }
        sb.append("$");
        if (this.onExtraCallbackWithResult) {
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            regex = new Regex(string);
        } else {
            String string2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "");
            regex = new Regex(string2, RegexOption.IGNORE_CASE);
        }
        return new logNull(regex, arrayList, linkedHashSet, i, z);
    }

    private final Pair<String, String> IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        MatchResult matchResultFind$default = Regex.find$default(accessgetTypep.IAuthTabCallback(), str, 0, 2, null);
        if (matchResultFind$default != null) {
            String strOnExtraCallbackWithResult = matchResultFind$default.onExtraCallbackWithResult();
            String strSubstring = str.substring(strOnExtraCallbackWithResult.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            Pair<String, String> pairIAuthTabCallback = getWrite.IAuthTabCallback(strOnExtraCallbackWithResult, strSubstring);
            int i4 = onWarmupCompleted + 37;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 / 0;
            }
            return pairIAuthTabCallback;
        }
        int i6 = onWarmupCompleted + 115;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return getWrite.IAuthTabCallback(null, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<String> onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '{') {
                i2++;
                sb.append(cCharAt);
            } else if (cCharAt == '}') {
                if (i2 > 0) {
                    int i4 = onNavigationEvent + 7;
                    onWarmupCompleted = i4 % 128;
                    i2 = i4 % 2 != 0 ? i2 >>> 1 : i2 - 1;
                }
                sb.append(cCharAt);
            } else if (cCharAt == '/') {
                int i5 = onWarmupCompleted + 37;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 29 / 0;
                    if (i2 == 0) {
                        String string = sb.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        arrayList.add(string);
                        sb.setLength(0);
                        Unit unit = Unit.INSTANCE;
                    } else {
                        sb.append(cCharAt);
                    }
                } else if (i2 == 0) {
                }
            }
        }
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        arrayList.add(string2);
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r12.length() > 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        return new o.getBreadcrumbIndex.onWarmupCompleted.IAuthTabCallback(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        throw new java.lang.IllegalArgumentException("Multi-segment capture must have a name. Use '**' for unnamed multi-segment match.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r12.length() > 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final onWarmupCompleted onNavigationEvent(String str) {
        String strSubstring;
        int i = 2 % 2;
        String strSubstring2 = null;
        if (!StringsKt__StringsJVMKt.startsWith$default(str, "**", false, 2, null)) {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, ':', 0, false, 6, (Object) null);
            if (iIndexOf$default >= 0) {
                String strSubstring3 = str.substring(0, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
                strSubstring2 = str.substring(iIndexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                asBinder(strSubstring2);
                str = strSubstring3;
            }
            Pair<String, Boolean> pairOnExtraCallback = onExtraCallback(str);
            onWarmupCompleted.C0030onWarmupCompleted c0030onWarmupCompleted = new onWarmupCompleted.C0030onWarmupCompleted(pairOnExtraCallback.onExtraCallbackWithResult(), pairOnExtraCallback.IAuthTabCallback().booleanValue(), strSubstring2);
            int i2 = onNavigationEvent + 15;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return c0030onWarmupCompleted;
        }
        int i4 = onWarmupCompleted + 109;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            strSubstring = str.substring(2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        } else {
            strSubstring = str.substring(2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        }
    }

    private final Pair<String, Boolean> onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (str.length() == 0) {
            return getWrite.IAuthTabCallback(null, Boolean.FALSE);
        }
        if (!Intrinsics.areEqual(str, "?")) {
            return !(StringsKt__StringsJVMKt.endsWith$default(str, "?", false, 2, null) ^ true) ? getWrite.IAuthTabCallback(StringsKt___StringsKt.dropLast(str, 1), Boolean.TRUE) : getWrite.IAuthTabCallback(str, Boolean.FALSE);
        }
        int i4 = onNavigationEvent + 105;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return getWrite.IAuthTabCallback(null, Boolean.TRUE);
    }

    private final void asBinder(String str) {
        int i = 2 % 2;
        try {
            if (new Regex(str).onExtraCallback("/")) {
                throw new IllegalArgumentException("Path regex constraint must not match '/' (segment-level only): '" + str + "'. Use '**' or '{**name}' for multi-segment matching.");
            }
            int i2 = onNavigationEvent + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (accessgetTypep.onNavigationEvent().onExtraCallback(str)) {
                throw new IllegalArgumentException("Path regex constraint must not contain capturing groups: '" + str + "'. Use '(?:...)' for grouping.");
            }
            int i4 = onNavigationEvent + 59;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid regex constraint: '" + str + "'", e);
        }
    }

    interface onWarmupCompleted {

        /* renamed from: o.getBreadcrumbIndex$onWarmupCompleted$onWarmupCompleted, reason: collision with other inner class name */
        public static final class C0030onWarmupCompleted implements onWarmupCompleted {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;
            private final boolean onExtraCallback;
            private final String onExtraCallbackWithResult;
            private final String onWarmupCompleted;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 65;
                IAuthTabCallback = i3 % 128;
                Object obj2 = null;
                if (i3 % 2 != 0) {
                    throw null;
                }
                if (this != obj) {
                    if (!(obj instanceof C0030onWarmupCompleted)) {
                        return false;
                    }
                    C0030onWarmupCompleted c0030onWarmupCompleted = (C0030onWarmupCompleted) obj;
                    return Intrinsics.areEqual(this.onWarmupCompleted, c0030onWarmupCompleted.onWarmupCompleted) && this.onExtraCallback == c0030onWarmupCompleted.onExtraCallback && !(Intrinsics.areEqual(this.onExtraCallbackWithResult, c0030onWarmupCompleted.onExtraCallbackWithResult) ^ true);
                }
                int i4 = i2 + 97;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return true;
                }
                obj2.hashCode();
                throw null;
            }

            public int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                String str = this.onWarmupCompleted;
                int iHashCode2 = str == null ? 0 : str.hashCode();
                int iHashCode3 = Boolean.hashCode(this.onExtraCallback);
                String str2 = this.onExtraCallbackWithResult;
                if (str2 != null) {
                    int i2 = onNavigationEvent + 109;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        str2.hashCode();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    iHashCode = str2.hashCode();
                } else {
                    iHashCode = 0;
                }
                int i3 = (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
                int i4 = onNavigationEvent + 87;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 32 / 0;
                }
                return i3;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Single(name=" + this.onWarmupCompleted + ", optional=" + this.onExtraCallback + ", regex=" + this.onExtraCallbackWithResult + ")";
                int i2 = IAuthTabCallback + 33;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 8 / 0;
                }
                return str;
            }

            public C0030onWarmupCompleted(@Nullable String str, boolean z, @Nullable String str2) {
                this.onWarmupCompleted = str;
                this.onExtraCallback = z;
                this.onExtraCallbackWithResult = str2;
            }

            public final String onNavigationEvent() {
                String str;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 63;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                if (i2 % 2 != 0) {
                    str = this.onWarmupCompleted;
                    int i4 = 48 / 0;
                } else {
                    str = this.onWarmupCompleted;
                }
                int i5 = i3 + 35;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final boolean IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 77;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.onExtraCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final String onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 113;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                String str = this.onExtraCallbackWithResult;
                int i5 = i3 + Imgproc.COLOR_YUV2RGB_YVYU;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 84 / 0;
                }
                return str;
            }
        }

        public static final class IAuthTabCallback implements onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;
            private final String onWarmupCompleted;

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
            
                if ((r6 instanceof o.getBreadcrumbIndex.onWarmupCompleted.IAuthTabCallback) != false) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onWarmupCompleted, ((o.getBreadcrumbIndex.onWarmupCompleted.IAuthTabCallback) r6).onWarmupCompleted) != false) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
            
                r6 = o.getBreadcrumbIndex.onWarmupCompleted.IAuthTabCallback.onExtraCallbackWithResult + 39;
                o.getBreadcrumbIndex.onWarmupCompleted.IAuthTabCallback.IAuthTabCallback = r6 % 128;
                r6 = r6 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
            
                r6 = r2 + 23;
                o.getBreadcrumbIndex.onWarmupCompleted.IAuthTabCallback.IAuthTabCallback = r6 % 128;
                r6 = r6 % 2;
                r2 = r2 + 99;
                o.getBreadcrumbIndex.onWarmupCompleted.IAuthTabCallback.IAuthTabCallback = r2 % 128;
                r2 = r2 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
            
                return true;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 47;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                if (i2 % 2 != 0) {
                    int i4 = 71 / 0;
                }
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 105;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = this.onWarmupCompleted.hashCode();
                int i4 = IAuthTabCallback + 111;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "MultiCapture(name=" + this.onWarmupCompleted + ")";
                int i2 = onExtraCallbackWithResult + 103;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 22 / 0;
                }
                return str;
            }

            public IAuthTabCallback(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.onWarmupCompleted = str;
            }

            public final String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 87;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                String str = this.onWarmupCompleted;
                int i5 = i3 + 1;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }
        }
    }
}
