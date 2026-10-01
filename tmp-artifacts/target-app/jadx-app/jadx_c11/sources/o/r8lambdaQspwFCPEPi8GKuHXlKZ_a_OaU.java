package o;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.getPreRenderJob;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaQspwFCPEPi8GKuHXlKZ_a_OaU {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static int ICustomTabsCallback = 1;
    private static int access000 = 0;
    private static int access100 = 1;
    private static int extraCallbackWithResult;
    private long IAuthTabCallback;
    private final long IAuthTabCallbackDefault;
    private long IAuthTabCallbackStub;
    private onExtraCallback IAuthTabCallbackStubProxy;
    private final Function0<Long> IAuthTabCallback_Parcel;
    private final Object asBinder;
    private volatile long asInterface;
    private long getInterfaceDescriptor;
    private long onExtraCallback;
    private long onExtraCallbackWithResult;
    private long onNavigationEvent;
    private q7 onTransact;
    private boolean onWarmupCompleted;

    public static final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        static {
            int[] iArr = new int[onExtraCallback.values().length];
            try {
                iArr[onExtraCallback.CONNECTED.ordinal()] = 1;
                int i = onExtraCallbackWithResult + 109;
                onNavigationEvent = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onExtraCallback.DISCONNECTED.ordinal()] = 2;
                int i3 = onNavigationEvent + 29;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            IAuthTabCallback = iArr;
        }
    }

    static {
        int i = access000 + 59;
        access100 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~(i | i3);
        int i8 = ~(i3 | i4);
        int i9 = i7 | i8;
        int i10 = ~i;
        int i11 = ~i3;
        int i12 = (~(i10 | i4)) | (~(i10 | i11)) | (~(i11 | i4));
        int i13 = ~i4;
        int i14 = i12 | (~(i13 | i | i3));
        int i15 = (~(i13 | i11)) | i | i8;
        int i16 = i + i3 + i6 + (1962400304 * i5) + (1167700406 * i2);
        int i17 = i16 * i16;
        int i18 = ((i * (-1019457937)) - 559939584) + ((-1019457937) * i3) + (2001489518 * i9) + (i14 * (-2001489518)) + ((-2001489518) * i15) + (1274019840 * i6) + ((-1660944384) * i5) + ((-325058560) * i2) + (867827712 * i17);
        int i19 = ((i * (-1629562239)) - 1134582380) + (i3 * (-1629562239)) + (i9 * (-910)) + (i14 * 910) + (i15 * 910) + (i6 * (-1629561329)) + (i5 * (-1621399344)) + (i2 * (-873382486)) + (i17 * 1407582208);
        int i20 = i18 + (i19 * i19 * (-1895432192));
        if (i20 == 1) {
            return onNavigationEvent(objArr);
        }
        if (i20 == 2) {
            return onWarmupCompleted(objArr);
        }
        r8lambdaQspwFCPEPi8GKuHXlKZ_a_OaU r8lambdaqspwfcpepi8gkuhxlkz_a_oau = (r8lambdaQspwFCPEPi8GKuHXlKZ_a_OaU) objArr[0];
        q7 q7Var = (q7) objArr[1];
        r8lambdapher_XsWcKlWwdNoY6vZZ6sfZg r8lambdapher_xswcklwwdnoy6vzz6sfzg = (r8lambdapher_XsWcKlWwdNoY6vZZ6sfZg) objArr[2];
        int i21 = 2 % 2;
        int i22 = ICustomTabsCallback + 35;
        extraCallbackWithResult = i22 % 128;
        int i23 = i22 % 2;
        Intrinsics.checkNotNullParameter(q7Var, "");
        Intrinsics.checkNotNullParameter(r8lambdapher_xswcklwwdnoy6vzz6sfzg, "");
        List<r8lambdapY5Er7TZ9VPEzs0mwV6GH0ShJF8> listOnNavigationEvent = r8lambdaqspwfcpepi8gkuhxlkz_a_oau.onNavigationEvent(q7Var, onExtraCallback.DISCONNECTED, r8lambdapher_xswcklwwdnoy6vzz6sfzg);
        int i24 = ICustomTabsCallback + 89;
        extraCallbackWithResult = i24 % 128;
        int i25 = i24 % 2;
        return listOnNavigationEvent;
    }

    public r8lambdaQspwFCPEPi8GKuHXlKZ_a_OaU(long j, @NotNull Function0<Long> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.IAuthTabCallbackDefault = j;
        this.IAuthTabCallback_Parcel = function0;
        this.asBinder = new Object();
        this.IAuthTabCallbackStubProxy = onExtraCallback.DISCONNECTED;
        long jLongValue = ((Number) function0.invoke()).longValue();
        this.getInterfaceDescriptor = jLongValue;
        this.IAuthTabCallbackStub = jLongValue;
        this.asInterface = Long.MAX_VALUE;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r8lambdaQspwFCPEPi8GKuHXlKZ_a_OaU(long j, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = extraCallbackWithResult + 45;
            int i3 = i2 % 128;
            ICustomTabsCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 93;
            extraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            j = 60000;
        }
        this(j, function0);
    }

    public final List<r8lambdapY5Er7TZ9VPEzs0mwV6GH0ShJF8> onExtraCallbackWithResult(@NotNull q7 q7Var) {
        List<r8lambdapY5Er7TZ9VPEzs0mwV6GH0ShJF8> listPlus;
        Intrinsics.checkNotNullParameter(q7Var, "");
        long jLongValue = ((Number) this.IAuthTabCallback_Parcel.invoke()).longValue();
        synchronized (this.asBinder) {
            List<r8lambdapY5Er7TZ9VPEzs0mwV6GH0ShJF8> listIAuthTabCallback = IAuthTabCallback(q7Var, jLongValue);
            if (this.onWarmupCompleted) {
                onWarmupCompleted(jLongValue);
            } else {
                onExtraCallback(q7Var, jLongValue);
            }
            listPlus = CollectionsKt.plus(listIAuthTabCallback, (List) onExtraCallbackWithResult(-1454934441, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{this, Long.valueOf(jLongValue)}, 1454934442, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback()));
        }
        return listPlus;
    }

    public final List<r8lambdapY5Er7TZ9VPEzs0mwV6GH0ShJF8> onWarmupCompleted(@NotNull q7 q7Var) {
        List<r8lambdapY5Er7TZ9VPEzs0mwV6GH0ShJF8> listOnNavigationEvent;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 125;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(q7Var, "");
            listOnNavigationEvent = onNavigationEvent(q7Var, onExtraCallback.CONNECTED, null);
            int i3 = 91 / 0;
        } else {
            Intrinsics.checkNotNullParameter(q7Var, "");
            listOnNavigationEvent = onNavigationEvent(q7Var, onExtraCallback.CONNECTED, null);
        }
        int i4 = extraCallbackWithResult + 25;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 69 / 0;
        }
        return listOnNavigationEvent;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        r8lambdaQspwFCPEPi8GKuHXlKZ_a_OaU r8lambdaqspwfcpepi8gkuhxlkz_a_oau = (r8lambdaQspwFCPEPi8GKuHXlKZ_a_OaU) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 65;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            long j = r8lambdaqspwfcpepi8gkuhxlkz_a_oau.asInterface;
            throw null;
        }
        if (jLongValue >= r8lambdaqspwfcpepi8gkuhxlkz_a_oau.asInterface) {
            return true;
        }
        int i3 = extraCallbackWithResult + 13;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final List<r8lambdapY5Er7TZ9VPEzs0mwV6GH0ShJF8> onNavigationEvent(@NotNull q7 q7Var, long j) {
        List<r8lambdapY5Er7TZ9VPEzs0mwV6GH0ShJF8> listPlus;
        Intrinsics.checkNotNullParameter(q7Var, "");
        synchronized (this.asBinder) {
            List<r8lambdapY5Er7TZ9VPEzs0mwV6GH0ShJF8> listIAuthTabCallback = IAuthTabCallback(q7Var, j);
            if (!this.onWarmupCompleted) {
                listPlus = CollectionsKt.emptyList();
            } else {
                onWarmupCompleted(j);
                listPlus = CollectionsKt.plus(listIAuthTabCallback, (List) onExtraCallbackWithResult(-1454934441, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{this, Long.valueOf(j)}, 1454934442, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback()));
            }
        }
        return listPlus;
    }

    public final List<r8lambdapY5Er7TZ9VPEzs0mwV6GH0ShJF8> onWarmupCompleted(@NotNull String str) {
        List<r8lambdapY5Er7TZ9VPEzs0mwV6GH0ShJF8> listListOfNotNull;
        Intrinsics.checkNotNullParameter(str, "");
        long jLongValue = ((Number) this.IAuthTabCallback_Parcel.invoke()).longValue();
        synchronized (this.asBinder) {
            if (!this.onWarmupCompleted) {
                IAuthTabCallback(jLongValue);
                listListOfNotNull = CollectionsKt.emptyList();
            } else {
                onWarmupCompleted(jLongValue);
                r8lambdapY5Er7TZ9VPEzs0mwV6GH0ShJF8 r8lambdapy5er7tz9vpezs0mwv6gh0shjf8OnExtraCallbackWithResult = onExtraCallbackWithResult(str, jLongValue);
                IAuthTabCallback(jLongValue);
                listListOfNotNull = CollectionsKt.listOfNotNull(r8lambdapy5er7tz9vpezs0mwv6gh0shjf8OnExtraCallbackWithResult);
            }
        }
        return listListOfNotNull;
    }

    public final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 43;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(((Number) this.IAuthTabCallback_Parcel.invoke()).longValue());
        int i4 = extraCallbackWithResult + 67;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onNavigationEvent(long j) {
        synchronized (this.asBinder) {
            IAuthTabCallback(j);
            Unit unit = Unit.INSTANCE;
        }
    }

    private final List<r8lambdapY5Er7TZ9VPEzs0mwV6GH0ShJF8> onNavigationEvent(q7 q7Var, onExtraCallback onextracallback, r8lambdapher_XsWcKlWwdNoY6vZZ6sfZg r8lambdapher_xswcklwwdnoy6vzz6sfzg) {
        List<r8lambdapY5Er7TZ9VPEzs0mwV6GH0ShJF8> listPlus;
        long jLongValue = ((Number) this.IAuthTabCallback_Parcel.invoke()).longValue();
        synchronized (this.asBinder) {
            if (!this.onWarmupCompleted) {
                listPlus = CollectionsKt.emptyList();
            } else {
                List<r8lambdapY5Er7TZ9VPEzs0mwV6GH0ShJF8> listIAuthTabCallback = IAuthTabCallback(q7Var, jLongValue);
                onWarmupCompleted(jLongValue);
                boolean z = onextracallback == onExtraCallback.DISCONNECTED && this.IAuthTabCallbackStubProxy == onExtraCallback.CONNECTED;
                if (z) {
                    this.onExtraCallbackWithResult++;
                }
                if (z && r8lambdapher_xswcklwwdnoy6vzz6sfzg == r8lambdapher_XsWcKlWwdNoY6vZZ6sfZg.FAULT) {
                    this.onNavigationEvent++;
                }
                this.IAuthTabCallbackStubProxy = onextracallback;
                this.IAuthTabCallbackStub = jLongValue;
                listPlus = CollectionsKt.plus(listIAuthTabCallback, (List) onExtraCallbackWithResult(-1454934441, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{this, Long.valueOf(jLongValue)}, 1454934442, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback()));
            }
        }
        return listPlus;
    }

    private final List<r8lambdapY5Er7TZ9VPEzs0mwV6GH0ShJF8> IAuthTabCallback(q7 q7Var, long j) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        if (this.onWarmupCompleted) {
            int i2 = ICustomTabsCallback + 25;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!Intrinsics.areEqual(this.onTransact, q7Var)) {
                onWarmupCompleted(j);
                r8lambdapY5Er7TZ9VPEzs0mwV6GH0ShJF8 r8lambdapy5er7tz9vpezs0mwv6gh0shjf8OnExtraCallbackWithResult = onExtraCallbackWithResult("key_change", j);
                onExtraCallback(q7Var, j);
                List<r8lambdapY5Er7TZ9VPEzs0mwV6GH0ShJF8> listListOfNotNull = CollectionsKt.listOfNotNull(r8lambdapy5er7tz9vpezs0mwv6gh0shjf8OnExtraCallbackWithResult);
                int i4 = ICustomTabsCallback + 17;
                extraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return listListOfNotNull;
            }
        }
        return CollectionsKt.emptyList();
    }

    private final void onExtraCallback(q7 q7Var, long j) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 35;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted = true;
        this.onTransact = q7Var;
        this.IAuthTabCallbackStubProxy = onExtraCallback.DISCONNECTED;
        this.getInterfaceDescriptor = j;
        this.IAuthTabCallbackStub = j;
        onExtraCallback();
        onNavigationEvent();
        int i4 = extraCallbackWithResult + 7;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057 A[PHI: r1
      0x0057: PHI (r1v7 long) = (r1v4 long), (r1v8 long) binds: [B:8:0x0037, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039 A[PHI: r1 r3
      0x0039: PHI (r1v5 long) = (r1v4 long), (r1v8 long) binds: [B:8:0x0037, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]
      0x0039: PHI (r3v3 int) = (r3v2 int), (r3v11 int) binds: [B:8:0x0037, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(long j) throws NoWhenBranchMatchedException {
        long jCoerceAtLeast;
        int i;
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 87;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            jCoerceAtLeast = RangesKt.coerceAtLeast(this.IAuthTabCallbackStub | j, 0L);
            i = onExtraCallbackWithResult.IAuthTabCallback[this.IAuthTabCallbackStubProxy.ordinal()];
            if (i == 0) {
                this.IAuthTabCallback += jCoerceAtLeast;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i4 = extraCallbackWithResult + 113;
                int i5 = i4 % 128;
                ICustomTabsCallback = i5;
                int i6 = i4 % 2;
                this.onExtraCallback += jCoerceAtLeast;
                int i7 = i5 + 27;
                extraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            jCoerceAtLeast = RangesKt.coerceAtLeast(j - this.IAuthTabCallbackStub, 0L);
            i = onExtraCallbackWithResult.IAuthTabCallback[this.IAuthTabCallbackStubProxy.ordinal()];
            if (i != 1) {
            }
        }
        this.IAuthTabCallbackStub = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        r8lambdaQspwFCPEPi8GKuHXlKZ_a_OaU r8lambdaqspwfcpepi8gkuhxlkz_a_oau = (r8lambdaQspwFCPEPi8GKuHXlKZ_a_OaU) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 117;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            int i4 = 16 / 0;
            if (r8lambdaqspwfcpepi8gkuhxlkz_a_oau.onWarmupCompleted) {
                int i5 = i3 + 21;
                ICustomTabsCallback = i5 % 128;
                int i6 = i5 % 2;
                if (jLongValue - r8lambdaqspwfcpepi8gkuhxlkz_a_oau.getInterfaceDescriptor >= r8lambdaqspwfcpepi8gkuhxlkz_a_oau.IAuthTabCallbackDefault) {
                    int i7 = i3 + 63;
                    ICustomTabsCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        r8lambdapY5Er7TZ9VPEzs0mwV6GH0ShJF8 r8lambdapy5er7tz9vpezs0mwv6gh0shjf8OnExtraCallbackWithResult = r8lambdaqspwfcpepi8gkuhxlkz_a_oau.onExtraCallbackWithResult("interval", jLongValue);
                        r8lambdaqspwfcpepi8gkuhxlkz_a_oau.getInterfaceDescriptor = jLongValue;
                        r8lambdaqspwfcpepi8gkuhxlkz_a_oau.onExtraCallback();
                        r8lambdaqspwfcpepi8gkuhxlkz_a_oau.onNavigationEvent();
                        int i8 = 1 / 0;
                        return CollectionsKt.listOfNotNull(r8lambdapy5er7tz9vpezs0mwv6gh0shjf8OnExtraCallbackWithResult);
                    }
                    r8lambdapY5Er7TZ9VPEzs0mwV6GH0ShJF8 r8lambdapy5er7tz9vpezs0mwv6gh0shjf8OnExtraCallbackWithResult2 = r8lambdaqspwfcpepi8gkuhxlkz_a_oau.onExtraCallbackWithResult("interval", jLongValue);
                    r8lambdaqspwfcpepi8gkuhxlkz_a_oau.getInterfaceDescriptor = jLongValue;
                    r8lambdaqspwfcpepi8gkuhxlkz_a_oau.onExtraCallback();
                    r8lambdaqspwfcpepi8gkuhxlkz_a_oau.onNavigationEvent();
                    return CollectionsKt.listOfNotNull(r8lambdapy5er7tz9vpezs0mwv6gh0shjf8OnExtraCallbackWithResult2);
                }
            }
        } else if (!(!r8lambdaqspwfcpepi8gkuhxlkz_a_oau.onWarmupCompleted)) {
        }
        return CollectionsKt.emptyList();
    }

    private final r8lambdapY5Er7TZ9VPEzs0mwV6GH0ShJF8 onExtraCallbackWithResult(String str, long j) {
        int i = 2 % 2;
        q7 q7Var = this.onTransact;
        if (q7Var == null) {
            return null;
        }
        long j2 = this.IAuthTabCallback + this.onExtraCallback;
        if (j2 <= 0 && this.onNavigationEvent <= 0) {
            int i2 = extraCallbackWithResult + 31;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            if (this.onExtraCallbackWithResult <= 0) {
                return null;
            }
        }
        r8lambdapY5Er7TZ9VPEzs0mwV6GH0ShJF8 r8lambdapy5er7tz9vpezs0mwv6gh0shjf8 = new r8lambdapY5Er7TZ9VPEzs0mwV6GH0ShJF8(q7Var, j2, this.IAuthTabCallback, this.onExtraCallback, this.onExtraCallbackWithResult, this.onNavigationEvent, q4ExternalSyntheticLambda9.onNavigationEvent(q4ExternalSyntheticLambda9.onExtraCallbackWithResult, str, 0, 2, null), q5b.Companion.onExtraCallbackWithResult(RangesKt.coerceAtLeast(j - this.getInterfaceDescriptor, 0L)), onWarmupCompleted());
        int i4 = ICustomTabsCallback + 103;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdapy5er7tz9vpezs0mwv6gh0shjf8;
    }

    private final void IAuthTabCallback(long j) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 117;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            this.onWarmupCompleted = false;
            this.onTransact = null;
            this.IAuthTabCallbackStubProxy = onExtraCallback.DISCONNECTED;
            this.getInterfaceDescriptor = j;
        } else {
            this.onWarmupCompleted = false;
            this.onTransact = null;
            this.IAuthTabCallbackStubProxy = onExtraCallback.DISCONNECTED;
            this.getInterfaceDescriptor = j;
        }
        this.IAuthTabCallbackStub = j;
        onExtraCallback();
        onNavigationEvent();
    }

    private final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 51;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            this.IAuthTabCallback = 0L;
            this.onExtraCallback = 1L;
            this.onExtraCallbackWithResult = 1L;
        } else {
            this.IAuthTabCallback = 0L;
            this.onExtraCallback = 0L;
            this.onExtraCallbackWithResult = 0L;
        }
        this.onNavigationEvent = 0L;
    }

    private final void onNavigationEvent() {
        long j;
        int i = 2 % 2;
        if (!this.onWarmupCompleted) {
            int i2 = ICustomTabsCallback + 79;
            extraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 % 2;
            }
            j = Long.MAX_VALUE;
        } else {
            int i4 = ICustomTabsCallback + 51;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            j = this.getInterfaceDescriptor + this.IAuthTabCallbackDefault;
        }
        this.asInterface = j;
    }

    private final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 37;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        long j = this.IAuthTabCallback;
        if (j > 0) {
            int i5 = i2 + 71;
            int i6 = i5 % 128;
            extraCallbackWithResult = i6;
            if (i5 % 2 == 0 ? this.onExtraCallback > 0 : this.onExtraCallback > 1) {
                int i7 = i6 + 37;
                ICustomTabsCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    return "mixed";
                }
                int i8 = 79 / 0;
                return "mixed";
            }
        }
        if (j > 0) {
            return "connected";
        }
        if (this.onExtraCallback <= 0) {
            return "empty";
        }
        int i9 = i2 + 25;
        extraCallbackWithResult = i9 % 128;
        int i10 = i9 % 2;
        return "disconnected";
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        public static final onExtraCallback CONNECTED = new onExtraCallback("CONNECTED", 0);
        public static final onExtraCallback DISCONNECTED = new onExtraCallback("DISCONNECTED", 1);
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            onExtraCallback[] onextracallbackArr = {CONNECTED, DISCONNECTED};
            int i5 = i3 + 11;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return onextracallbackArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 39;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i5 = i2 + 1;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            if (i3 != 0) {
                int i4 = 85 / 0;
            }
            int i5 = onNavigationEvent + 115;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return onextracallback;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = $VALUES;
            if (i3 == 0) {
                return (onExtraCallback[]) onextracallbackArr.clone();
            }
            throw null;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = onExtraCallbackWithResult + 43;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    private final List<r8lambdapY5Er7TZ9VPEzs0mwV6GH0ShJF8> onExtraCallback(long j) {
        Object[] objArr = {this, Long.valueOf(j)};
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return (List) onExtraCallbackWithResult(-1454934441, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), objArr, 1454934442, iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback2);
    }

    public final List<r8lambdapY5Er7TZ9VPEzs0mwV6GH0ShJF8> onExtraCallback(@NotNull q7 q7Var, @NotNull r8lambdapher_XsWcKlWwdNoY6vZZ6sfZg r8lambdapher_xswcklwwdnoy6vzz6sfzg) {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return (List) onExtraCallbackWithResult(193434837, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{this, q7Var, r8lambdapher_xswcklwwdnoy6vzz6sfzg}, -193434837, iIAuthTabCallback, iIAuthTabCallback3, iIAuthTabCallback2);
    }

    public final boolean onExtraCallbackWithResult(long j) {
        Object[] objArr = {this, Long.valueOf(j)};
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return ((Boolean) onExtraCallbackWithResult(-64295703, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), objArr, 64295705, iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue();
    }
}
