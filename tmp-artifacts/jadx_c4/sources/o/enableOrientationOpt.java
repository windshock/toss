package o;

import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.setLogBuffers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableOrientationOpt {
    private static final onWarmupCompleted Companion;
    private static int IAuthTabCallback = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback;
    private static int onNavigationEvent;
    private final zzag onExtraCallbackWithResult;
    private final TextRoundCornerProgressBarSavedState1 onWarmupCompleted;

    public static final /* synthetic */ class IAuthTabCallback {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[enableNebulaServiceInitOpt.values().length];
            try {
                iArr[enableNebulaServiceInitOpt.KCB.ordinal()] = 1;
                int i = onNavigationEvent + 71;
                onExtraCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[enableNebulaServiceInitOpt.NICE.ordinal()] = 2;
                int i4 = onNavigationEvent + 23;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 5 % 4;
                } else {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            onWarmupCompleted = iArr;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onWarmupCompleted(defaultConstructorMarker);
        int i = IAuthTabCallback + 27;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    @Inject
    public enableOrientationOpt(@NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1, @NotNull zzag zzagVar) {
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        Intrinsics.checkNotNullParameter(zzagVar, "");
        this.onWarmupCompleted = textRoundCornerProgressBarSavedState1;
        this.onExtraCallbackWithResult = zzagVar;
    }

    static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    public final void IAuthTabCallback(@Nullable Integer num, @NotNull enableNebulaServiceInitOpt enablenebulaserviceinitopt) {
        enableOverridePendingTransition enableoverridependingtransition;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(enablenebulaserviceinitopt, "");
        if (num == null || num.intValue() <= 0) {
            return;
        }
        int i2 = IAuthTabCallbackStub + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Integer numIAuthTabCallback = IAuthTabCallback(enablenebulaserviceinitopt);
        if (numIAuthTabCallback != null && !Intrinsics.areEqual(numIAuthTabCallback, num)) {
            if (num.intValue() > numIAuthTabCallback.intValue()) {
                int i4 = IAuthTabCallbackStub + 91;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                enableoverridependingtransition = enableOverridePendingTransition.UP;
            } else if (num.intValue() < numIAuthTabCallback.intValue()) {
                int i6 = IAuthTabCallbackStub + 65;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                enableoverridependingtransition = enableOverridePendingTransition.DOWN;
            } else {
                enableoverridependingtransition = enableOverridePendingTransition.SAME;
            }
            this.onWarmupCompleted.onNavigationEvent(onNavigationEvent(enablenebulaserviceinitopt), enableoverridependingtransition.name());
            this.onWarmupCompleted.onNavigationEvent(onExtraCallbackWithResult(enablenebulaserviceinitopt), this.onExtraCallbackWithResult.IAuthTabCallbackDefault());
            int i8 = onExtraCallback + 23;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
        }
        this.onWarmupCompleted.onExtraCallbackWithResult(onWarmupCompleted(enablenebulaserviceinitopt), num.intValue());
        int i10 = IAuthTabCallbackStub + 19;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
    }

    public final Integer IAuthTabCallback(@NotNull enableNebulaServiceInitOpt enablenebulaserviceinitopt) {
        Integer numValueOf;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(enablenebulaserviceinitopt, "");
            numValueOf = Integer.valueOf(this.onWarmupCompleted.onWarmupCompleted(onWarmupCompleted(enablenebulaserviceinitopt), 0));
            if (numValueOf.intValue() <= 0) {
                return null;
            }
        } else {
            Intrinsics.checkNotNullParameter(enablenebulaserviceinitopt, "");
            numValueOf = Integer.valueOf(this.onWarmupCompleted.onWarmupCompleted(onWarmupCompleted(enablenebulaserviceinitopt), 0));
            if (numValueOf.intValue() <= 0) {
                return null;
            }
        }
        int i3 = IAuthTabCallbackStub + 51;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return numValueOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r1
      0x0023: PHI (r1v6 java.lang.Integer) = (r1v5 java.lang.Integer), (r1v10 java.lang.Integer) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<Integer, Integer> onNavigationEvent() {
        Integer numIAuthTabCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 45;
        onExtraCallback = i2 % 128;
        int iIntValue = 0;
        if (i2 % 2 != 0) {
            numIAuthTabCallback = IAuthTabCallback(enableNebulaServiceInitOpt.KCB);
            int i3 = 28 / 0;
            if (numIAuthTabCallback != null) {
                int i4 = onExtraCallback + 67;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 == 0) {
                    numIAuthTabCallback.intValue();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                iIntValue = numIAuthTabCallback.intValue();
            }
        } else {
            numIAuthTabCallback = IAuthTabCallback(enableNebulaServiceInitOpt.KCB);
            if (numIAuthTabCallback != null) {
            }
        }
        return getWrite.IAuthTabCallback(Integer.valueOf(iIntValue), IAuthTabCallback(enableNebulaServiceInitOpt.NICE));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005a, code lost:
    
        if ((r7 - r5) <= o.setLogBuffers.asBinder(o.setCommandLine.onWarmupCompleted(7, o.setRevision.DAYS))) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
    
        r10 = o.enableOrientationOpt.IAuthTabCallbackStub + 77;
        o.enableOrientationOpt.onExtraCallback = r10 % 128;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
    
        if ((r10 % 2) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        r10 = o.enableOverridePendingTransition.getEntries().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        if ((!r10.hasNext()) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        r3 = o.enableOrientationOpt.IAuthTabCallbackStub + 21;
        o.enableOrientationOpt.onExtraCallback = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
    
        if ((r3 % 2) != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
    
        r3 = r10.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0093, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(((o.enableOverridePendingTransition) r3).name(), r1) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
    
        r2 = (o.enableOverridePendingTransition) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
    
        if (r2 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
    
        r10 = o.enableOrientationOpt.onExtraCallback + 39;
        o.enableOrientationOpt.IAuthTabCallbackStub = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
    
        if ((r10 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:
    
        r0 = 30 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ab, code lost:
    
        return o.enableOverridePendingTransition.SAME;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ae, code lost:
    
        return o.enableOverridePendingTransition.SAME;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00af, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        kotlin.jvm.internal.Intrinsics.areEqual(((o.enableOverridePendingTransition) r10.next()).name(), r1);
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c1, code lost:
    
        o.enableOverridePendingTransition.getEntries().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0047, code lost:
    
        if ((r7 & r5) <= o.setLogBuffers.asBinder(o.setCommandLine.onWarmupCompleted(40, o.setRevision.DAYS))) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final enableOverridePendingTransition onExtraCallback(@NotNull enableNebulaServiceInitOpt enablenebulaserviceinitopt) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(enablenebulaserviceinitopt, "");
        String strOnExtraCallbackWithResult = this.onWarmupCompleted.onExtraCallbackWithResult(onNavigationEvent(enablenebulaserviceinitopt), "SAME");
        long jOnExtraCallback = this.onWarmupCompleted.onExtraCallback(onExtraCallbackWithResult(enablenebulaserviceinitopt), 0L);
        long jIAuthTabCallbackDefault = this.onExtraCallbackWithResult.IAuthTabCallbackDefault();
        if (jOnExtraCallback > 0) {
            int i2 = IAuthTabCallbackStub + 65;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
            } else {
                setLogBuffers.IAuthTabCallback iAuthTabCallback2 = setLogBuffers.Companion;
            }
        }
        return enableOverridePendingTransition.SAME;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final String onWarmupCompleted(enableNebulaServiceInitOpt enablenebulaserviceinitopt) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = IAuthTabCallback.onWarmupCompleted[enablenebulaserviceinitopt.ordinal()];
        if (i4 != 1) {
            int i5 = onExtraCallback + 45;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                if (i4 == 3) {
                    return "pref_key_saved_credit_score_nice";
                }
            } else if (i4 == 2) {
                return "pref_key_saved_credit_score_nice";
            }
            throw new NoWhenBranchMatchedException();
        }
        return "pref_key_saved_credit_score";
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final String onNavigationEvent(enableNebulaServiceInitOpt enablenebulaserviceinitopt) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback.onWarmupCompleted[enablenebulaserviceinitopt.ordinal()];
        if (i2 == 1) {
            return "pref_key_saved_kcb_score_change";
        }
        int i3 = onExtraCallback + 97;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        int i5 = i3 % 2;
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i6 = i4 + 73;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return "pref_key_saved_nice_score_change";
        }
        int i7 = 55 / 0;
        return "pref_key_saved_nice_score_change";
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final String onExtraCallbackWithResult(enableNebulaServiceInitOpt enablenebulaserviceinitopt) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback.onWarmupCompleted[enablenebulaserviceinitopt.ordinal()];
        if (i2 != 1) {
            int i3 = IAuthTabCallbackStub + 77;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                if (i2 == 4) {
                    return "pref_key_saved_nice_change_date";
                }
            } else if (i2 == 2) {
                return "pref_key_saved_nice_change_date";
            }
            throw new NoWhenBranchMatchedException();
        }
        int i4 = onExtraCallback + 125;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return "pref_key_saved_kcb_change_date";
    }
}
