package o;

import kotlin.Deprecated;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setLogBuffers implements Comparable<setLogBuffers> {
    private final long onExtraCallbackWithResult;
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static final long IAuthTabCallback = onExtraCallbackWithResult(0);
    private static final long onNavigationEvent = setCommandLine.IAuthTabCallbackStub(4611686018427387903L);
    private static final long onExtraCallback = setCommandLine.IAuthTabCallbackStub(-4611686018427387903L);
    private static final long onWarmupCompleted = onExtraCallbackWithResult(9223372036854759646L);

    public static final boolean IAuthTabCallback(long j, long j2) {
        return j == j2;
    }

    private static final boolean ICustomTabsCallbackStubProxy(long j) {
        return (((int) j) & 1) == 1;
    }

    public static int extraCallback(long j) {
        return Long.hashCode(j);
    }

    @Deprecated
    public static long onExtraCallbackWithResult(long j) {
        return j;
    }

    public static final boolean onMinimized(long j) {
        return j > 0;
    }

    public static boolean onNavigationEvent(long j, Object obj) {
        return (obj instanceof setLogBuffers) && j == ((setLogBuffers) obj).onExtraCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long onRelationshipValidationResult(long j) {
        return j >> 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onUnminimized(long j) {
        return (((int) j) & 1) == 0;
    }

    public static final /* synthetic */ setLogBuffers onWarmupCompleted(long j) {
        return new setLogBuffers(j);
    }

    public static final boolean writeTypedObject(long j) {
        return j < 0;
    }

    public boolean equals(Object obj) {
        return onNavigationEvent(this.onExtraCallbackWithResult, obj);
    }

    public int hashCode() {
        return extraCallback(this.onExtraCallbackWithResult);
    }

    public final /* synthetic */ long onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(setLogBuffers setlogbuffers) {
        return onMessageChannelReady(setlogbuffers.onExtraCallback());
    }

    @Deprecated
    private /* synthetic */ setLogBuffers(long j) {
        this.onExtraCallbackWithResult = j;
    }

    private static final setRevision ICustomTabsCallbackDefault(long j) {
        return onUnminimized(j) ? setRevision.NANOSECONDS : setRevision.MILLISECONDS;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final long onExtraCallback(long j) {
            long jOnExtraCallbackWithResult = setLogBuffers.onExtraCallbackWithResult(j);
            if (setOpenFds.onExtraCallbackWithResult()) {
                if (setLogBuffers.onUnminimized(jOnExtraCallbackWithResult)) {
                    long jOnRelationshipValidationResult = setLogBuffers.onRelationshipValidationResult(jOnExtraCallbackWithResult);
                    if (-4611686018426999999L <= jOnRelationshipValidationResult && jOnRelationshipValidationResult < 4611686018427000000L) {
                        return jOnExtraCallbackWithResult;
                    }
                    throw new AssertionError(setLogBuffers.onRelationshipValidationResult(jOnExtraCallbackWithResult) + " ns is out of nanoseconds range");
                }
                long jOnRelationshipValidationResult2 = setLogBuffers.onRelationshipValidationResult(jOnExtraCallbackWithResult);
                if (-4611686018427387903L >= jOnRelationshipValidationResult2 || jOnRelationshipValidationResult2 >= 4611686018427387903L) {
                    long jOnRelationshipValidationResult3 = setLogBuffers.onRelationshipValidationResult(jOnExtraCallbackWithResult);
                    if (jOnRelationshipValidationResult3 != 4611686018427387903L && jOnRelationshipValidationResult3 != -4611686018427387903L) {
                        throw new AssertionError(setLogBuffers.onRelationshipValidationResult(jOnExtraCallbackWithResult) + " ms is out of milliseconds range");
                    }
                }
                long jOnRelationshipValidationResult4 = setLogBuffers.onRelationshipValidationResult(jOnExtraCallbackWithResult);
                if (-4611686018426L > jOnRelationshipValidationResult4 || jOnRelationshipValidationResult4 >= 4611686018427L) {
                    return jOnExtraCallbackWithResult;
                }
                throw new AssertionError(setLogBuffers.onRelationshipValidationResult(jOnExtraCallbackWithResult) + " ms is denormalized");
            }
            return jOnExtraCallbackWithResult;
        }

        public final long onWarmupCompleted() {
            return setLogBuffers.IAuthTabCallback;
        }

        public final long onExtraCallbackWithResult() {
            return setLogBuffers.onNavigationEvent;
        }

        public final long onNavigationEvent() {
            return setLogBuffers.onExtraCallback;
        }

        public final long onExtraCallback() {
            return setLogBuffers.onWarmupCompleted;
        }

        public final long onNavigationEvent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                long jOnWarmupCompleted = setCommandLine.onWarmupCompleted(str, true, false, 4, null);
                if (setLogBuffers.IAuthTabCallback(jOnWarmupCompleted, setLogBuffers.Companion.onExtraCallback())) {
                    throw new IllegalStateException("invariant failed");
                }
                return jOnWarmupCompleted;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + str + "'.", e);
            }
        }
    }

    public static final long onActivityLayout(long j) {
        return setCommandLine.onExtraCallback(-onRelationshipValidationResult(j), ((int) j) & 1);
    }

    public static final long onNavigationEvent(long j, long j2) {
        if ((((int) j) & 1) != (((int) j2) & 1)) {
            return ICustomTabsCallbackStubProxy(j) ? onWarmupCompleted(j, onRelationshipValidationResult(j), onRelationshipValidationResult(j2)) : onWarmupCompleted(j, onRelationshipValidationResult(j2), onRelationshipValidationResult(j));
        }
        if (onUnminimized(j)) {
            return setCommandLine.IAuthTabCallbackDefault(onRelationshipValidationResult(j) + onRelationshipValidationResult(j2));
        }
        long jIAuthTabCallback = setCommandLine.IAuthTabCallback(onRelationshipValidationResult(j), onRelationshipValidationResult(j2));
        if (jIAuthTabCallback != 9223372036854759646L) {
            return (jIAuthTabCallback == 4611686018427387903L || jIAuthTabCallback == -4611686018427387903L) ? setCommandLine.IAuthTabCallbackStub(jIAuthTabCallback) : setCommandLine.asBinder(jIAuthTabCallback);
        }
        throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
    }

    private static final long onWarmupCompleted(long j, long j2, long j3) {
        long jAccess000 = setCommandLine.access000(j3);
        long jIAuthTabCallback = setCommandLine.IAuthTabCallback(j2, jAccess000);
        if (-4611686018426L > jIAuthTabCallback || jIAuthTabCallback >= 4611686018427L) {
            return setCommandLine.IAuthTabCallbackStub(jIAuthTabCallback);
        }
        return setCommandLine.onTransact(setCommandLine.IAuthTabCallback_Parcel(jIAuthTabCallback) + (j3 - setCommandLine.IAuthTabCallback_Parcel(jAccess000)));
    }

    public static final long onWarmupCompleted(long j, long j2) {
        return onNavigationEvent(j, onActivityLayout(j2));
    }

    public static final long IAuthTabCallback(long j, int i) {
        if (ICustomTabsCallback(j)) {
            if (i != 0) {
                return i > 0 ? j : onActivityLayout(j);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i == 0) {
            return IAuthTabCallback;
        }
        long jOnRelationshipValidationResult = onRelationshipValidationResult(j);
        long j2 = i;
        long j3 = jOnRelationshipValidationResult * j2;
        if (!onUnminimized(j)) {
            if (j3 / j2 == jOnRelationshipValidationResult) {
                return setCommandLine.IAuthTabCallbackStub(RangesKt___RangesKt.coerceIn(j3, (getUnreadableElfFilesCount<Long>) new access4500(-4611686018427387903L, 4611686018427387903L)));
            }
            return getCurrentBacktraceOrBuilderList.onWarmupCompleted(jOnRelationshipValidationResult) * getCurrentBacktraceOrBuilderList.onNavigationEvent(i) > 0 ? onNavigationEvent : onExtraCallback;
        }
        if (-2147483647L <= jOnRelationshipValidationResult && jOnRelationshipValidationResult < 2147483648L) {
            return setCommandLine.onTransact(j3);
        }
        if (j3 / j2 == jOnRelationshipValidationResult) {
            return setCommandLine.IAuthTabCallbackDefault(j3);
        }
        long jAccess000 = setCommandLine.access000(jOnRelationshipValidationResult);
        long j4 = jAccess000 * j2;
        long jAccess0002 = setCommandLine.access000((jOnRelationshipValidationResult - setCommandLine.IAuthTabCallback_Parcel(jAccess000)) * j2) + j4;
        if (j4 / j2 != jAccess000 || (jAccess0002 ^ j4) < 0) {
            return getCurrentBacktraceOrBuilderList.onWarmupCompleted(jOnRelationshipValidationResult) * getCurrentBacktraceOrBuilderList.onNavigationEvent(i) > 0 ? onNavigationEvent : onExtraCallback;
        }
        return setCommandLine.IAuthTabCallbackStub(RangesKt___RangesKt.coerceIn(jAccess0002, (getUnreadableElfFilesCount<Long>) new access4500(-4611686018427387903L, 4611686018427387903L)));
    }

    public static final long onWarmupCompleted(long j, int i) {
        if (i == 0) {
            if (onMinimized(j)) {
                return onNavigationEvent;
            }
            if (writeTypedObject(j)) {
                return onExtraCallback;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (onUnminimized(j)) {
            return setCommandLine.onTransact(onRelationshipValidationResult(j) / i);
        }
        if (ICustomTabsCallback(j)) {
            return IAuthTabCallback(j, getCurrentBacktraceOrBuilderList.onNavigationEvent(i));
        }
        long j2 = i;
        long jOnRelationshipValidationResult = onRelationshipValidationResult(j) / j2;
        if (-4611686018426L > jOnRelationshipValidationResult || jOnRelationshipValidationResult >= 4611686018427L) {
            return setCommandLine.IAuthTabCallbackStub(jOnRelationshipValidationResult);
        }
        return setCommandLine.onTransact(setCommandLine.IAuthTabCallback_Parcel(jOnRelationshipValidationResult) + (setCommandLine.IAuthTabCallback_Parcel(onRelationshipValidationResult(j) - (jOnRelationshipValidationResult * j2)) / j2));
    }

    public static final boolean ICustomTabsCallback(long j) {
        return j == onNavigationEvent || j == onExtraCallback;
    }

    public static final boolean readTypedObject(long j) {
        return !ICustomTabsCallback(j);
    }

    public static final long IAuthTabCallback(long j) {
        return writeTypedObject(j) ? onActivityLayout(j) : j;
    }

    public int onMessageChannelReady(long j) {
        return onExtraCallbackWithResult(this.onExtraCallbackWithResult, j);
    }

    public static int onExtraCallbackWithResult(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.compare(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return writeTypedObject(j) ? -i : i;
    }

    public static final int onTransact(long j) {
        if (ICustomTabsCallback(j)) {
            return 0;
        }
        return (int) (IAuthTabCallbackStub(j) % 24);
    }

    public static final int getInterfaceDescriptor(long j) {
        if (ICustomTabsCallback(j)) {
            return 0;
        }
        return (int) (access100(j) % 60);
    }

    public static final int extraCallbackWithResult(long j) {
        if (ICustomTabsCallback(j)) {
            return 0;
        }
        return (int) (IAuthTabCallbackStubProxy(j) % 60);
    }

    public static final int IAuthTabCallback_Parcel(long j) {
        long jOnRelationshipValidationResult;
        if (ICustomTabsCallback(j)) {
            return 0;
        }
        if (ICustomTabsCallbackStubProxy(j)) {
            jOnRelationshipValidationResult = setCommandLine.IAuthTabCallback_Parcel(onRelationshipValidationResult(j) % 1000);
        } else {
            jOnRelationshipValidationResult = onRelationshipValidationResult(j) % 1000000000;
        }
        return (int) jOnRelationshipValidationResult;
    }

    public static final double onNavigationEvent(long j, @NotNull setRevision setrevision) {
        Intrinsics.checkNotNullParameter(setrevision, "");
        if (j == onNavigationEvent) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == onExtraCallback) {
            return Double.NEGATIVE_INFINITY;
        }
        return setSignalInfo.onWarmupCompleted(onRelationshipValidationResult(j), ICustomTabsCallbackDefault(j), setrevision);
    }

    public static final long onExtraCallbackWithResult(long j, @NotNull setRevision setrevision) {
        Intrinsics.checkNotNullParameter(setrevision, "");
        if (j == onNavigationEvent) {
            return LongCompanionObject.MAX_VALUE;
        }
        if (j == onExtraCallback) {
            return Long.MIN_VALUE;
        }
        return setSignalInfo.onWarmupCompleted(onRelationshipValidationResult(j), ICustomTabsCallbackDefault(j), setrevision);
    }

    public static final long asInterface(long j) {
        return onExtraCallbackWithResult(j, setRevision.DAYS);
    }

    public static final long IAuthTabCallbackStub(long j) {
        return onExtraCallbackWithResult(j, setRevision.HOURS);
    }

    public static final long access100(long j) {
        return onExtraCallbackWithResult(j, setRevision.MINUTES);
    }

    public static final long IAuthTabCallbackStubProxy(long j) {
        return onExtraCallbackWithResult(j, setRevision.SECONDS);
    }

    public static final long asBinder(long j) {
        return (ICustomTabsCallbackStubProxy(j) && readTypedObject(j)) ? onRelationshipValidationResult(j) : onExtraCallbackWithResult(j, setRevision.MILLISECONDS);
    }

    public static final long IAuthTabCallbackDefault(long j) {
        return onExtraCallbackWithResult(j, setRevision.MICROSECONDS);
    }

    public static final long access000(long j) {
        long jOnRelationshipValidationResult = onRelationshipValidationResult(j);
        if (onUnminimized(j)) {
            return jOnRelationshipValidationResult;
        }
        if (jOnRelationshipValidationResult > 9223372036854L) {
            return LongCompanionObject.MAX_VALUE;
        }
        if (jOnRelationshipValidationResult < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return setCommandLine.IAuthTabCallback_Parcel(jOnRelationshipValidationResult);
    }

    public String toString() {
        return onPostMessage(this.onExtraCallbackWithResult);
    }

    public static String onPostMessage(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == onNavigationEvent) {
            return "Infinity";
        }
        if (j == onExtraCallback) {
            return "-Infinity";
        }
        boolean zWriteTypedObject = writeTypedObject(j);
        StringBuilder sb = new StringBuilder();
        if (zWriteTypedObject) {
            sb.append('-');
        }
        long jIAuthTabCallback = IAuthTabCallback(j);
        long jAsInterface = asInterface(jIAuthTabCallback);
        int iOnTransact = onTransact(jIAuthTabCallback);
        int interfaceDescriptor = getInterfaceDescriptor(jIAuthTabCallback);
        int iExtraCallbackWithResult = extraCallbackWithResult(jIAuthTabCallback);
        int iIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(jIAuthTabCallback);
        int i = 0;
        boolean z = jAsInterface != 0;
        boolean z2 = iOnTransact != 0;
        boolean z3 = interfaceDescriptor != 0;
        boolean z4 = (iExtraCallbackWithResult == 0 && iIAuthTabCallback_Parcel == 0) ? false : true;
        if (z) {
            sb.append(jAsInterface);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iOnTransact);
            sb.append('h');
            i++;
        }
        if (z3 || (z4 && (z2 || z))) {
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(interfaceDescriptor);
            sb.append('m');
            i++;
        }
        if (z4) {
            if (i > 0) {
                sb.append(' ');
            }
            if (iExtraCallbackWithResult != 0 || z || z2 || z3) {
                onExtraCallbackWithResult(j, sb, iExtraCallbackWithResult, iIAuthTabCallback_Parcel, 9, "s", false);
            } else if (iIAuthTabCallback_Parcel >= 1000000) {
                onExtraCallbackWithResult(j, sb, iIAuthTabCallback_Parcel / 1000000, iIAuthTabCallback_Parcel % 1000000, 6, "ms", false);
            } else if (iIAuthTabCallback_Parcel >= 1000) {
                onExtraCallbackWithResult(j, sb, iIAuthTabCallback_Parcel / 1000, iIAuthTabCallback_Parcel % 1000, 3, "us", false);
            } else {
                sb.append(iIAuthTabCallback_Parcel);
                sb.append("ns");
            }
            i++;
        }
        if (zWriteTypedObject && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    private static final void onExtraCallbackWithResult(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strPadStart = StringsKt__StringsKt.padStart(String.valueOf(i2), i3, '0');
            int length = strPadStart.length() - 1;
            int i4 = -1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strPadStart.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (!z && i6 < 3) {
                sb.append((CharSequence) strPadStart, 0, i6);
                Intrinsics.checkNotNullExpressionValue(sb, "");
            } else {
                sb.append((CharSequence) strPadStart, 0, ((i4 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb, "");
            }
        }
        sb.append(str);
    }

    public static final String onExtraCallbackWithResult(long j, @NotNull setRevision setrevision, int i) {
        Intrinsics.checkNotNullParameter(setrevision, "");
        if (i < 0) {
            throw new IllegalArgumentException(("decimals must be not negative, but was " + i).toString());
        }
        double dOnNavigationEvent = onNavigationEvent(j, setrevision);
        if (Double.isInfinite(dOnNavigationEvent)) {
            return String.valueOf(dOnNavigationEvent);
        }
        return setOpenFds.IAuthTabCallback(dOnNavigationEvent, RangesKt___RangesKt.coerceAtMost(i, 12)) + setSelinuxLabel.onWarmupCompleted(setrevision);
    }

    public static final String onActivityResized(long j) {
        StringBuilder sb = new StringBuilder();
        if (writeTypedObject(j)) {
            sb.append('-');
        }
        sb.append("PT");
        long jIAuthTabCallback = IAuthTabCallback(j);
        long jIAuthTabCallbackStub = IAuthTabCallbackStub(jIAuthTabCallback);
        int interfaceDescriptor = getInterfaceDescriptor(jIAuthTabCallback);
        int iExtraCallbackWithResult = extraCallbackWithResult(jIAuthTabCallback);
        int iIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(jIAuthTabCallback);
        if (ICustomTabsCallback(j)) {
            jIAuthTabCallbackStub = 9999999999999L;
        }
        boolean z = true;
        boolean z2 = jIAuthTabCallbackStub != 0;
        boolean z3 = (iExtraCallbackWithResult == 0 && iIAuthTabCallback_Parcel == 0) ? false : true;
        if (interfaceDescriptor == 0 && (!z3 || !z2)) {
            z = false;
        }
        if (z2) {
            sb.append(jIAuthTabCallbackStub);
            sb.append('H');
        }
        if (z) {
            sb.append(interfaceDescriptor);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            onExtraCallbackWithResult(j, sb, iExtraCallbackWithResult, iIAuthTabCallback_Parcel, 9, "S", true);
        }
        return sb.toString();
    }
}
