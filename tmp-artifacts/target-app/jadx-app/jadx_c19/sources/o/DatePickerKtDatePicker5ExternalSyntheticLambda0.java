package o;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.DatePickerKtExternalSyntheticLambda31;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DatePickerKtDatePicker5ExternalSyntheticLambda0 {
    private final getCornerRadius<DatePickerKtExternalSyntheticLambda16> IAuthTabCallback;
    private final setRubIn<DatePickerKtExternalSyntheticLambda16> onExtraCallback;
    private final CopyOnWriteArrayList<Function1<DatePickerKtExternalSyntheticLambda16, Unit>> onWarmupCompleted = new CopyOnWriteArrayList<>();

    public DatePickerKtDatePicker5ExternalSyntheticLambda0() {
        getCornerRadius<DatePickerKtExternalSyntheticLambda16> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent((Object) null);
        this.IAuthTabCallback = getcornerradiusOnNavigationEvent;
        this.onExtraCallback = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent);
    }

    public final setRubIn<DatePickerKtExternalSyntheticLambda16> onNavigationEvent() {
        return this.onExtraCallback;
    }

    static final class IAuthTabCallback extends Lambda implements Function1<DatePickerKtExternalSyntheticLambda16, DatePickerKtExternalSyntheticLambda16> {
        final /* synthetic */ DatePickerKtExternalSyntheticLambda32 $remoteLoadStates;
        final /* synthetic */ DatePickerKtExternalSyntheticLambda32 $sourceLoadStates;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda32, DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda322) {
            super(1);
            this.$sourceLoadStates = datePickerKtExternalSyntheticLambda32;
            this.$remoteLoadStates = datePickerKtExternalSyntheticLambda322;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final DatePickerKtExternalSyntheticLambda16 invoke(@Nullable DatePickerKtExternalSyntheticLambda16 datePickerKtExternalSyntheticLambda16) {
            return DatePickerKtDatePicker5ExternalSyntheticLambda0.this.onWarmupCompleted(datePickerKtExternalSyntheticLambda16, this.$sourceLoadStates, this.$remoteLoadStates);
        }
    }

    public final void IAuthTabCallback(@NotNull DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda32, @Nullable DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda322) {
        Intrinsics.checkNotNullParameter(datePickerKtExternalSyntheticLambda32, "");
        onNavigationEvent(new IAuthTabCallback(datePickerKtExternalSyntheticLambda32, datePickerKtExternalSyntheticLambda322));
    }

    static final class onWarmupCompleted extends Lambda implements Function1<DatePickerKtExternalSyntheticLambda16, DatePickerKtExternalSyntheticLambda16> {
        final /* synthetic */ boolean $remote;
        final /* synthetic */ DatePickerKtExternalSyntheticLambda31 $state;
        final /* synthetic */ DatePickerKtExternalSyntheticLambda8 $type;
        final /* synthetic */ DatePickerKtDatePicker5ExternalSyntheticLambda0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(boolean z, DatePickerKtExternalSyntheticLambda8 datePickerKtExternalSyntheticLambda8, DatePickerKtExternalSyntheticLambda31 datePickerKtExternalSyntheticLambda31, DatePickerKtDatePicker5ExternalSyntheticLambda0 datePickerKtDatePicker5ExternalSyntheticLambda0) {
            super(1);
            this.$remote = z;
            this.$type = datePickerKtExternalSyntheticLambda8;
            this.$state = datePickerKtExternalSyntheticLambda31;
            this.this$0 = datePickerKtDatePicker5ExternalSyntheticLambda0;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final DatePickerKtExternalSyntheticLambda16 invoke(@Nullable DatePickerKtExternalSyntheticLambda16 datePickerKtExternalSyntheticLambda16) {
            DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda32IAuthTabCallback;
            DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda32IAuthTabCallback2;
            if (datePickerKtExternalSyntheticLambda16 == null || (datePickerKtExternalSyntheticLambda32IAuthTabCallback = datePickerKtExternalSyntheticLambda16.onWarmupCompleted()) == null) {
                datePickerKtExternalSyntheticLambda32IAuthTabCallback = DatePickerKtExternalSyntheticLambda32.Companion.IAuthTabCallback();
            }
            if (datePickerKtExternalSyntheticLambda16 == null || (datePickerKtExternalSyntheticLambda32IAuthTabCallback2 = datePickerKtExternalSyntheticLambda16.onExtraCallback()) == null) {
                datePickerKtExternalSyntheticLambda32IAuthTabCallback2 = DatePickerKtExternalSyntheticLambda32.Companion.IAuthTabCallback();
            }
            if (this.$remote) {
                datePickerKtExternalSyntheticLambda32IAuthTabCallback2 = datePickerKtExternalSyntheticLambda32IAuthTabCallback2.IAuthTabCallback(this.$type, this.$state);
            } else {
                datePickerKtExternalSyntheticLambda32IAuthTabCallback = datePickerKtExternalSyntheticLambda32IAuthTabCallback.IAuthTabCallback(this.$type, this.$state);
            }
            return this.this$0.onWarmupCompleted(datePickerKtExternalSyntheticLambda16, datePickerKtExternalSyntheticLambda32IAuthTabCallback, datePickerKtExternalSyntheticLambda32IAuthTabCallback2);
        }
    }

    public final void onNavigationEvent(@NotNull DatePickerKtExternalSyntheticLambda8 datePickerKtExternalSyntheticLambda8, boolean z, @NotNull DatePickerKtExternalSyntheticLambda31 datePickerKtExternalSyntheticLambda31) {
        Intrinsics.checkNotNullParameter(datePickerKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(datePickerKtExternalSyntheticLambda31, "");
        onNavigationEvent(new onWarmupCompleted(z, datePickerKtExternalSyntheticLambda8, datePickerKtExternalSyntheticLambda31, this));
    }

    private final void onNavigationEvent(Function1<? super DatePickerKtExternalSyntheticLambda16, DatePickerKtExternalSyntheticLambda16> function1) {
        Object objIAuthTabCallback;
        DatePickerKtExternalSyntheticLambda16 datePickerKtExternalSyntheticLambda16;
        getCornerRadius<DatePickerKtExternalSyntheticLambda16> getcornerradius = this.IAuthTabCallback;
        do {
            objIAuthTabCallback = getcornerradius.IAuthTabCallback();
            DatePickerKtExternalSyntheticLambda16 datePickerKtExternalSyntheticLambda162 = (DatePickerKtExternalSyntheticLambda16) objIAuthTabCallback;
            datePickerKtExternalSyntheticLambda16 = (DatePickerKtExternalSyntheticLambda16) function1.invoke(datePickerKtExternalSyntheticLambda162);
            if (Intrinsics.areEqual(datePickerKtExternalSyntheticLambda162, datePickerKtExternalSyntheticLambda16)) {
                return;
            }
        } while (!getcornerradius.onWarmupCompleted(objIAuthTabCallback, datePickerKtExternalSyntheticLambda16));
        if (datePickerKtExternalSyntheticLambda16 != null) {
            Iterator<T> it = this.onWarmupCompleted.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(datePickerKtExternalSyntheticLambda16);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DatePickerKtExternalSyntheticLambda16 onWarmupCompleted(DatePickerKtExternalSyntheticLambda16 datePickerKtExternalSyntheticLambda16, DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda32, DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda322) {
        DatePickerKtExternalSyntheticLambda31 datePickerKtExternalSyntheticLambda31OnWarmupCompleted;
        DatePickerKtExternalSyntheticLambda31 datePickerKtExternalSyntheticLambda31OnWarmupCompleted2;
        DatePickerKtExternalSyntheticLambda31 datePickerKtExternalSyntheticLambda31OnWarmupCompleted3;
        if (datePickerKtExternalSyntheticLambda16 == null || (datePickerKtExternalSyntheticLambda31OnWarmupCompleted = datePickerKtExternalSyntheticLambda16.IAuthTabCallback()) == null) {
            datePickerKtExternalSyntheticLambda31OnWarmupCompleted = DatePickerKtExternalSyntheticLambda31.onExtraCallbackWithResult.Companion.onWarmupCompleted();
        }
        DatePickerKtExternalSyntheticLambda31 datePickerKtExternalSyntheticLambda31OnExtraCallback = onExtraCallback(datePickerKtExternalSyntheticLambda31OnWarmupCompleted, datePickerKtExternalSyntheticLambda32.IAuthTabCallback(), datePickerKtExternalSyntheticLambda32.IAuthTabCallback(), datePickerKtExternalSyntheticLambda322 != null ? datePickerKtExternalSyntheticLambda322.IAuthTabCallback() : null);
        if (datePickerKtExternalSyntheticLambda16 == null || (datePickerKtExternalSyntheticLambda31OnWarmupCompleted2 = datePickerKtExternalSyntheticLambda16.onExtraCallbackWithResult()) == null) {
            datePickerKtExternalSyntheticLambda31OnWarmupCompleted2 = DatePickerKtExternalSyntheticLambda31.onExtraCallbackWithResult.Companion.onWarmupCompleted();
        }
        DatePickerKtExternalSyntheticLambda31 datePickerKtExternalSyntheticLambda31OnExtraCallback2 = onExtraCallback(datePickerKtExternalSyntheticLambda31OnWarmupCompleted2, datePickerKtExternalSyntheticLambda32.IAuthTabCallback(), datePickerKtExternalSyntheticLambda32.onWarmupCompleted(), datePickerKtExternalSyntheticLambda322 != null ? datePickerKtExternalSyntheticLambda322.onWarmupCompleted() : null);
        if (datePickerKtExternalSyntheticLambda16 == null || (datePickerKtExternalSyntheticLambda31OnWarmupCompleted3 = datePickerKtExternalSyntheticLambda16.onNavigationEvent()) == null) {
            datePickerKtExternalSyntheticLambda31OnWarmupCompleted3 = DatePickerKtExternalSyntheticLambda31.onExtraCallbackWithResult.Companion.onWarmupCompleted();
        }
        return new DatePickerKtExternalSyntheticLambda16(datePickerKtExternalSyntheticLambda31OnExtraCallback, datePickerKtExternalSyntheticLambda31OnExtraCallback2, onExtraCallback(datePickerKtExternalSyntheticLambda31OnWarmupCompleted3, datePickerKtExternalSyntheticLambda32.IAuthTabCallback(), datePickerKtExternalSyntheticLambda32.onExtraCallbackWithResult(), datePickerKtExternalSyntheticLambda322 != null ? datePickerKtExternalSyntheticLambda322.onExtraCallbackWithResult() : null), datePickerKtExternalSyntheticLambda32, datePickerKtExternalSyntheticLambda322);
    }

    private final DatePickerKtExternalSyntheticLambda31 onExtraCallback(DatePickerKtExternalSyntheticLambda31 datePickerKtExternalSyntheticLambda31, DatePickerKtExternalSyntheticLambda31 datePickerKtExternalSyntheticLambda312, DatePickerKtExternalSyntheticLambda31 datePickerKtExternalSyntheticLambda313, DatePickerKtExternalSyntheticLambda31 datePickerKtExternalSyntheticLambda314) {
        return datePickerKtExternalSyntheticLambda314 == null ? datePickerKtExternalSyntheticLambda313 : datePickerKtExternalSyntheticLambda31 instanceof DatePickerKtExternalSyntheticLambda31.onExtraCallback ? (((datePickerKtExternalSyntheticLambda312 instanceof DatePickerKtExternalSyntheticLambda31.onExtraCallbackWithResult) && (datePickerKtExternalSyntheticLambda314 instanceof DatePickerKtExternalSyntheticLambda31.onExtraCallbackWithResult)) || (datePickerKtExternalSyntheticLambda314 instanceof DatePickerKtExternalSyntheticLambda31.onWarmupCompleted)) ? datePickerKtExternalSyntheticLambda314 : datePickerKtExternalSyntheticLambda31 : datePickerKtExternalSyntheticLambda314;
    }
}
