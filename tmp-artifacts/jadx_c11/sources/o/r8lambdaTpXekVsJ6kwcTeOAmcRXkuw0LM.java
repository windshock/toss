package o;

import im.toss.featurescommon.servicetermsagreement.standardtermsv2.domain.model.entity.Necessity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaTpXekVsJ6kwcTeOAmcRXkuw0LM {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final long IAuthTabCallback;
    private final Long onExtraCallback;
    private final Necessity onExtraCallbackWithResult;

    static {
        int i = onNavigationEvent + 63;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 10 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdaTpXekVsJ6kwcTeOAmcRXkuw0LM)) {
            int i5 = i3 + 27;
            IAuthTabCallbackStub = i5 % 128;
            return i5 % 2 != 0;
        }
        r8lambdaTpXekVsJ6kwcTeOAmcRXkuw0LM r8lambdatpxekvsj6kwcteoamcrxkuw0lm = (r8lambdaTpXekVsJ6kwcTeOAmcRXkuw0LM) obj;
        if (this.IAuthTabCallback == r8lambdatpxekvsj6kwcteoamcrxkuw0lm.IAuthTabCallback) {
            return Intrinsics.areEqual(this.onExtraCallback, r8lambdatpxekvsj6kwcteoamcrxkuw0lm.onExtraCallback) && this.onExtraCallbackWithResult == r8lambdatpxekvsj6kwcteoamcrxkuw0lm.onExtraCallbackWithResult;
        }
        int i6 = i3 + 91;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = asInterface + 15;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = Long.hashCode(this.IAuthTabCallback);
        Long l = this.onExtraCallback;
        if (l == null) {
            int i5 = IAuthTabCallbackStub + 91;
            asInterface = i5 % 128;
            i = i5 % 2 == 0 ? 1 : 0;
        } else {
            int iHashCode2 = l.hashCode();
            int i6 = asInterface + 107;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            i = iHashCode2;
        }
        return (((iHashCode * 31) + i) * 31) + this.onExtraCallbackWithResult.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TermsWrapper(termsId=" + this.IAuthTabCallback + ", currentRevisionId=" + this.onExtraCallback + ", necessity=" + this.onExtraCallbackWithResult + ")";
        int i2 = IAuthTabCallbackStub + 33;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public r8lambdaTpXekVsJ6kwcTeOAmcRXkuw0LM(long j, @Nullable Long l, @NotNull Necessity necessity) {
        Intrinsics.checkNotNullParameter(necessity, "");
        this.IAuthTabCallback = j;
        this.onExtraCallback = l;
        this.onExtraCallbackWithResult = necessity;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 21;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        long j = this.IAuthTabCallback;
        int i5 = i2 + 123;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final r8lambdaTpXekVsJ6kwcTeOAmcRXkuw0LM onExtraCallback(@NotNull initPlayer initplayer) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 93;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(initplayer, "");
                initplayer.extraCallbackWithResult();
                throw null;
            }
            Intrinsics.checkNotNullParameter(initplayer, "");
            Long lExtraCallbackWithResult = initplayer.extraCallbackWithResult();
            if (lExtraCallbackWithResult == null) {
                return null;
            }
            r8lambdaTpXekVsJ6kwcTeOAmcRXkuw0LM r8lambdatpxekvsj6kwcteoamcrxkuw0lm = new r8lambdaTpXekVsJ6kwcTeOAmcRXkuw0LM(lExtraCallbackWithResult.longValue(), initplayer.IAuthTabCallbackStub(), initplayer.getInterfaceDescriptor());
            int i3 = onExtraCallbackWithResult + 105;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return r8lambdatpxekvsj6kwcteoamcrxkuw0lm;
        }
    }
}
