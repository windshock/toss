package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.krc.pl_card.enums.ResponseCode;
import com.krc.pl_card.service.model.ServiceException;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Retrofit;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class access23500 extends TransitionTransitionNotificationExternalSyntheticLambda3<Unit, String> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 1268579690993562067L;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final setProgressBackgroundColorSchemeResource onExtraCallback;

    static final class IAuthTabCallback extends Lambda implements Function1<Retrofit, getSignPrikeyCCFBPHFilename<TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1<Unit>>> {
        final /* synthetic */ setProgressBackgroundColorSchemeResource a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(setProgressBackgroundColorSchemeResource setprogressbackgroundcolorschemeresource) {
            super(1);
            this.a = setprogressbackgroundcolorschemeresource;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final getSignPrikeyCCFBPHFilename<TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1<Unit>> invoke(@NotNull Retrofit retrofit) {
            Intrinsics.checkNotNullParameter(retrofit, BuildConfig.FLAVOR);
            return ((setCurrentPlayTimeMillis) retrofit.onNavigationEvent(setCurrentPlayTimeMillis.class)).IAuthTabCallback(this.a.onExtraCallback(), this.a.onExtraCallbackWithResult(), this.a.asInterface(), this.a.IAuthTabCallbackDefault(), this.a.IAuthTabCallbackStub(), this.a.IAuthTabCallback_Parcel(), this.a.onNavigationEvent(), this.a.IAuthTabCallback(), this.a.onWarmupCompleted(), this.a.onTransact(), this.a.asBinder(), this.a.IAuthTabCallbackStubProxy(), this.a.access100());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public access23500(@NotNull setProgressBackgroundColorSchemeResource setprogressbackgroundcolorschemeresource) throws Throwable {
        Intrinsics.checkNotNullParameter(setprogressbackgroundcolorschemeresource, BuildConfig.FLAVOR);
        Object[] objArr = new Object[1];
        a(new char[]{16214, 53791, 45366, 19144, 16190, 39092, 9468, 43557, 5209, 42110, 28707, 18174, 27100, 29609, 24041, 32049, 48396, 7975, 43371, 10667, 37575, 10937, 62196, 50283, 58969, 63035, 56945}, 1 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
        super(((String) objArr[0]).intern(), 7200, new IAuthTabCallback(setprogressbackgroundcolorschemeresource));
        this.onExtraCallback = setprogressbackgroundcolorschemeresource;
    }

    public ServiceException onExtraCallback(@Nullable ResponseCode responseCode, int i, @NotNull String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        if (responseCode != null) {
            return new ServiceException(responseCode, (String) null, str, 2, (DefaultConstructorMarker) null);
        }
        int i3 = onWarmupCompleted + 67;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            onNavigationEvent(i, str);
            throw null;
        }
        ServiceException serviceExceptionOnNavigationEvent = onNavigationEvent(i, str);
        int i4 = onWarmupCompleted + 1;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return serviceExceptionOnNavigationEvent;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.krc.pl_card.service.model.ServiceException */
    protected String onExtraCallback(@NotNull TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1<Unit> twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1) throws ServiceException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1, BuildConfig.FLAVOR);
        String strOnExtraCallbackWithResult = twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1.onExtraCallbackWithResult();
        ResponseCode responseCode = ResponseCode.OK;
        if (!Intrinsics.areEqual(strOnExtraCallbackWithResult, responseCode.getCode())) {
            onExtraCallbackWithResult(twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1);
            throw new ServiceException(ResponseCode.Companion.onExtraCallbackWithResult(twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1.onExtraCallbackWithResult()), twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1.IAuthTabCallback(), twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1.onNavigationEvent());
        }
        int i4 = onNavigationEvent + 47;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return responseCode.getCode();
        }
        int i5 = 59 / 0;
        return responseCode.getCode();
    }

    public /* synthetic */ Object onWarmupCompleted(TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1 twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1) throws ServiceException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallback = onExtraCallback(twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1);
        int i4 = onNavigationEvent + 3;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallback;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 55;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 45811), View.combineMeasuredStates(0, 0) + 84, (ViewConfiguration.getWindowTouchSlop() >> 8) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14184 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0)), 18 - Process.getGidForName(BuildConfig.FLAVOR), Color.green(0) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $10 + 59;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }
}
