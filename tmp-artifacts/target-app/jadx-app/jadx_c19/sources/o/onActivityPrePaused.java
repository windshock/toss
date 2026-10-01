package o;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

@FragmentManagerExternalSyntheticLambda0
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class onActivityPrePaused extends ReportFragmentLifecycleCallbacksCompanion<Date> {
    public static final onActivityPrePaused onExtraCallbackWithResult = new onActivityPrePaused();

    public onActivityPrePaused() {
        this(null, null);
    }

    public onActivityPrePaused(Boolean bool, DateFormat dateFormat) {
        super(Date.class, bool, dateFormat);
    }

    @Override // o.ReportFragmentLifecycleCallbacksCompanion
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public onActivityPrePaused onNavigationEvent(Boolean bool, DateFormat dateFormat) {
        return new onActivityPrePaused(bool, dateFormat);
    }

    protected long onNavigationEvent(Date date) {
        if (date == null) {
            return 0L;
        }
        return date.getTime();
    }

    @Override // o.LifecycleEffectKtExternalSyntheticLambda14, o.FragmentFactory
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public void onExtraCallback(Date date, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1) throws IOException {
        if (onExtraCallback(fragmentManagerExternalSyntheticLambda1)) {
            getview.onExtraCallback(onNavigationEvent(date));
        } else {
            onNavigationEvent(date, getview, fragmentManagerExternalSyntheticLambda1);
        }
    }
}
