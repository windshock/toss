package o;

import java.util.Calendar;
import javax.inject.Inject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class switchPreload {
    private static final onExtraCallback Companion;
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public static final int onWarmupCompleted = 8;
    private final zzag IAuthTabCallback;
    private final TextRoundCornerProgressBarSavedState1 onNavigationEvent;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallback(defaultConstructorMarker);
        int i = onExtraCallbackWithResult + 41;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    @Inject
    public switchPreload(@NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1, @NotNull zzag zzagVar) {
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        Intrinsics.checkNotNullParameter(zzagVar, "");
        this.onNavigationEvent = textRoundCornerProgressBarSavedState1;
        this.IAuthTabCallback = zzagVar;
    }

    static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    public final boolean onExtraCallback() {
        long jOnExtraCallback;
        zzag zzagVar;
        int i = 2 % 2;
        int i2 = asBinder + 55;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            jOnExtraCallback = this.onNavigationEvent.onExtraCallback("pref_key_loan_needs_first_row_shown_date", 0L);
            zzagVar = this.IAuthTabCallback;
        } else {
            jOnExtraCallback = this.onNavigationEvent.onExtraCallback("pref_key_loan_needs_first_row_shown_date", 0L);
            zzagVar = this.IAuthTabCallback;
        }
        return onExtraCallbackWithResult(jOnExtraCallback, zzagVar.IAuthTabCallbackDefault());
    }

    public final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 23;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            this.onNavigationEvent.onNavigationEvent("pref_key_loan_needs_first_row_shown_date", this.IAuthTabCallback.IAuthTabCallbackDefault());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.onNavigationEvent.onNavigationEvent("pref_key_loan_needs_first_row_shown_date", this.IAuthTabCallback.IAuthTabCallbackDefault());
        int i3 = IAuthTabCallbackDefault + 121;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (!onExtraCallbackWithResult(this.onNavigationEvent.onExtraCallback("pref_key_loan_needs_expand_anim_date", 0L), this.IAuthTabCallback.IAuthTabCallbackDefault())) {
            return true;
        }
        if (this.onNavigationEvent.onWarmupCompleted("pref_key_loan_needs_expand_anim_count", 0) >= 2) {
            return false;
        }
        int i4 = IAuthTabCallbackDefault + 43;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 49;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        long jIAuthTabCallbackDefault = this.IAuthTabCallback.IAuthTabCallbackDefault();
        int iOnWarmupCompleted = 0;
        if (!(!onExtraCallbackWithResult(this.onNavigationEvent.onExtraCallback("pref_key_loan_needs_expand_anim_date", 0L), jIAuthTabCallbackDefault))) {
            int i4 = asBinder + 111;
            IAuthTabCallbackDefault = i4 % 128;
            iOnWarmupCompleted = i4 % 2 != 0 ? this.onNavigationEvent.onWarmupCompleted("pref_key_loan_needs_expand_anim_count", 0) : this.onNavigationEvent.onWarmupCompleted("pref_key_loan_needs_expand_anim_count", 0);
        }
        this.onNavigationEvent.onNavigationEvent("pref_key_loan_needs_expand_anim_date", jIAuthTabCallbackDefault);
        this.onNavigationEvent.onExtraCallbackWithResult("pref_key_loan_needs_expand_anim_count", iOnWarmupCompleted + 1);
        int i5 = IAuthTabCallbackDefault + 95;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean z = !onExtraCallbackWithResult(this.onNavigationEvent.onExtraCallback("pref_key_dual_row_anim_shown_date", 0L), this.IAuthTabCallback.IAuthTabCallbackDefault());
        int i4 = IAuthTabCallbackDefault + 83;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            this.onNavigationEvent.onNavigationEvent("pref_key_dual_row_anim_shown_date", this.IAuthTabCallback.IAuthTabCallbackDefault());
            throw null;
        }
        this.onNavigationEvent.onNavigationEvent("pref_key_dual_row_anim_shown_date", this.IAuthTabCallback.IAuthTabCallbackDefault());
        int i3 = IAuthTabCallbackDefault + 17;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
    }

    private final boolean onExtraCallbackWithResult(long j, long j2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        asBinder = i2 % 128;
        if (i2 % 2 != 0 ? j == 0 : j == 1) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        if (calendar.get(1) != calendar2.get(1) || calendar.get(6) != calendar2.get(6)) {
            return false;
        }
        int i3 = asBinder + 51;
        IAuthTabCallbackDefault = i3 % 128;
        return i3 % 2 == 0;
    }
}
