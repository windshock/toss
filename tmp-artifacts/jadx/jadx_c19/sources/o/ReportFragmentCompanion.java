package o;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;

@FragmentManagerExternalSyntheticLambda0
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ReportFragmentCompanion extends ReportFragmentLifecycleCallbacksCompanion<Calendar> {
    public static final ReportFragmentCompanion onWarmupCompleted = new ReportFragmentCompanion();

    public ReportFragmentCompanion() {
        this(null, null);
    }

    public ReportFragmentCompanion(Boolean bool, DateFormat dateFormat) {
        super(Calendar.class, bool, dateFormat);
    }

    @Override // o.ReportFragmentLifecycleCallbacksCompanion
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public ReportFragmentCompanion onNavigationEvent(Boolean bool, DateFormat dateFormat) {
        return new ReportFragmentCompanion(bool, dateFormat);
    }

    protected long IAuthTabCallback(Calendar calendar) {
        if (calendar == null) {
            return 0L;
        }
        return calendar.getTimeInMillis();
    }

    @Override // o.LifecycleEffectKtExternalSyntheticLambda14, o.FragmentFactory
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void onExtraCallback(Calendar calendar, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1) throws IOException {
        if (onExtraCallback(fragmentManagerExternalSyntheticLambda1)) {
            getview.onExtraCallback(IAuthTabCallback(calendar));
        } else {
            onNavigationEvent(calendar.getTime(), getview, fragmentManagerExternalSyntheticLambda1);
        }
    }
}
