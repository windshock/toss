package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSettingFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AccessDescription {
    private final CardIssueSettingFragment.IAuthTabCallback IAuthTabCallback;

    static final class IAuthTabCallbackStub extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccessDescription.this.onNavigationEvent(null, null, null, this);
        }
    }

    static final class onExtraCallback extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccessDescription.this.IAuthTabCallback(null, null, null, null, null, this);
        }
    }

    public static final class onExtraCallbackWithResult extends RuntimeException {
    }

    public static final class onNavigationEvent extends RuntimeException {
    }

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[CardIssueSettingFragment.IAuthTabCallback.values().length];
            try {
                iArr[CardIssueSettingFragment.IAuthTabCallback.SYSTEM_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            onNavigationEvent = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AccessDescription() {
        CardIssueSettingFragment.IAuthTabCallback iAuthTabCallback = null;
        this(iAuthTabCallback, 1, iAuthTabCallback);
    }

    public AccessDescription(@NotNull CardIssueSettingFragment.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        this.IAuthTabCallback = iAuthTabCallback;
    }

    public /* synthetic */ AccessDescription(CardIssueSettingFragment.IAuthTabCallback iAuthTabCallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CardIssueSettingFragment.IAuthTabCallback.NORMAL : iAuthTabCallback);
    }

    public static final class IAuthTabCallback extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(@NotNull String str) {
            super(str);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onNavigationEvent(@org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull o.BaseRoundCornerProgressBar1 r10, @org.jetbrains.annotations.NotNull java.util.Date r11, @org.jetbrains.annotations.NotNull o.access13800<? super viva.republica.toss.network.model.cardsales.verify.VerifyIdCardResponse> r12) throws im.toss.network.throwable.TossApiCallException.ApiError {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AccessDescription.onNavigationEvent(java.lang.String, o.BaseRoundCornerProgressBar1, java.util.Date, o.access13800):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object IAuthTabCallback(@org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.Nullable java.lang.String r12, @org.jetbrains.annotations.Nullable java.lang.String r13, @org.jetbrains.annotations.NotNull o.access13800<? super viva.republica.toss.network.model.cardsales.verify.VerifyIdCardResponse> r14) throws im.toss.network.throwable.TossApiCallException.ApiError {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AccessDescription.IAuthTabCallback(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, o.access13800):java.lang.Object");
    }
}
