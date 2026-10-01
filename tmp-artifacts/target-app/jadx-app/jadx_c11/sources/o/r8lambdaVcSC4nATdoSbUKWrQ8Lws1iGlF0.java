package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 {
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private int IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private int asBinder;
    private int onExtraCallback;
    private int onExtraCallbackWithResult;
    private int onNavigationEvent;
    private int onTransact;
    private int onWarmupCompleted;

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog.values().length];
            try {
                iArr[r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog.Digit.ordinal()] = 1;
                int i = onWarmupCompleted + 121;
                onNavigationEvent = i % 128;
                if (i % 2 != 0) {
                    int i2 = 4 / 2;
                } else {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog.Comma.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog.Dash.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog.Dot.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            IAuthTabCallback = iArr;
            int i4 = onWarmupCompleted + 59;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0() {
        this(0, 0, 0, 0, 15, null);
    }

    public r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0(int i, int i2, int i3, int i4) {
        this.onNavigationEvent = i;
        this.onExtraCallbackWithResult = i2;
        this.onExtraCallback = i3;
        this.IAuthTabCallback = i4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i5 & 1) != 0) {
            int i6 = asInterface + 95;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            i = 0;
        }
        if ((i5 & 2) != 0) {
            int i9 = IAuthTabCallbackStub + 99;
            asInterface = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 % 2;
            }
            i2 = 0;
        }
        i3 = (i5 & 4) != 0 ? 0 : i3;
        if ((i5 & 8) != 0) {
            int i11 = asInterface + 47;
            IAuthTabCallbackStub = i11 % 128;
            i4 = i11 % 2 != 0 ? 1 : 0;
        }
        this(i, i2, i3, i4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0(@NotNull getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks, @NotNull getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks2, boolean z) {
        this(0, 0, 0, 0, 15, null);
        Intrinsics.checkNotNullParameter(getdirectclicktrackingpostbacks, "");
        Intrinsics.checkNotNullParameter(getdirectclicktrackingpostbacks2, "");
        if (z && getdirectclicktrackingpostbacks.asInterface() < getdirectclicktrackingpostbacks2.asInterface()) {
            int i = asInterface + 119;
            IAuthTabCallbackStub = i % 128;
            int i2 = i % 2;
            this.asBinder = getdirectclicktrackingpostbacks.onNavigationEvent() - getdirectclicktrackingpostbacks2.onNavigationEvent();
            this.onWarmupCompleted = getdirectclicktrackingpostbacks.IAuthTabCallback() - getdirectclicktrackingpostbacks2.IAuthTabCallback();
            this.IAuthTabCallbackDefault = getdirectclicktrackingpostbacks.onExtraCallback() - getdirectclicktrackingpostbacks2.onExtraCallback();
            this.onTransact = getdirectclicktrackingpostbacks.IAuthTabCallbackDefault() - getdirectclicktrackingpostbacks2.IAuthTabCallbackDefault();
            int i3 = asInterface + 119;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
        }
        int i5 = IAuthTabCallbackStub + 17;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 65;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.onNavigationEvent;
        return i3 != 0 ? i4 - this.asBinder : i4 + this.asBinder;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 97;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = this.onExtraCallbackWithResult + this.onWarmupCompleted;
        int i6 = i3 + 83;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return this.onExtraCallback + this.IAuthTabCallbackDefault;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 23;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.IAuthTabCallback + this.onTransact;
        int i6 = i2 + 51;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.asBinder;
        return i3 == 0 ? ((i4 + this.onWarmupCompleted) - this.IAuthTabCallbackDefault) >> this.onTransact : i4 + this.onWarmupCompleted + this.IAuthTabCallbackDefault + this.onTransact;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final int IAuthTabCallback(@NotNull r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog r8lambdasffek4_3mtpbpfpmfomvpbvbnog) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdasffek4_3mtpbpfpmfomvpbvbnog, "");
        int i2 = onWarmupCompleted.IAuthTabCallback[r8lambdasffek4_3mtpbpfpmfomvpbvbnog.ordinal()];
        if (i2 == 1) {
            return onNavigationEvent();
        }
        if (i2 == 2) {
            return IAuthTabCallback();
        }
        int i3 = IAuthTabCallbackStub + 113;
        int i4 = i3 % 128;
        asInterface = i4;
        if (i3 % 2 != 0 ? i2 == 3 : i2 == 4) {
            int iOnWarmupCompleted = onWarmupCompleted();
            int i5 = IAuthTabCallbackStub + 79;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return iOnWarmupCompleted;
        }
        int i7 = i4 + 79;
        IAuthTabCallbackStub = i7 % 128;
        if (i7 % 2 == 0 ? i2 != 4 : i2 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return onExtraCallback();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r4 == 5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r4 == 2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r4 == 3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r2 = r2 + 109;
        o.r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0.IAuthTabCallbackStub = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r4 != 4) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        return r3.onTransact;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        return r3.IAuthTabCallbackDefault;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        return r3.onWarmupCompleted;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        r4 = r3.asBinder;
        r1 = o.r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0.asInterface + 31;
        o.r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0.IAuthTabCallbackStub = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        if ((r1 % 2) == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        r0 = 42 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r4 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r4 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        r1 = o.r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0.IAuthTabCallbackStub + 77;
        r2 = r1 % 128;
        o.r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0.asInterface = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int onExtraCallback(@NotNull r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog r8lambdasffek4_3mtpbpfpmfomvpbvbnog) throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        int i3 = asInterface + 119;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(r8lambdasffek4_3mtpbpfpmfomvpbvbnog, "");
            i = onWarmupCompleted.IAuthTabCallback[r8lambdasffek4_3mtpbpfpmfomvpbvbnog.ordinal()];
        } else {
            Intrinsics.checkNotNullParameter(r8lambdasffek4_3mtpbpfpmfomvpbvbnog, "");
            i = onWarmupCompleted.IAuthTabCallback[r8lambdasffek4_3mtpbpfpmfomvpbvbnog.ordinal()];
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void onNavigationEvent(@NotNull r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog r8lambdasffek4_3mtpbpfpmfomvpbvbnog) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdasffek4_3mtpbpfpmfomvpbvbnog, "");
        int i2 = onWarmupCompleted.IAuthTabCallback[r8lambdasffek4_3mtpbpfpmfomvpbvbnog.ordinal()];
        if (i2 == 1) {
            this.onNavigationEvent++;
            return;
        }
        if (i2 == 2) {
            this.onExtraCallbackWithResult++;
            return;
        }
        if (i2 == 3) {
            this.onExtraCallback++;
            int i3 = IAuthTabCallbackStub + 81;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 97 / 0;
                return;
            }
            return;
        }
        int i5 = asInterface + 51;
        int i6 = i5 % 128;
        IAuthTabCallbackStub = i6;
        int i7 = i5 % 2;
        if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int i8 = i6 + 43;
        asInterface = i8 % 128;
        int i9 = i8 % 2;
        this.IAuthTabCallback++;
    }
}
