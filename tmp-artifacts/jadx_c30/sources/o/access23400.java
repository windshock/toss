package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.krc.pl_card.enums.ResponseCode;
import com.krc.pl_card.service.model.ServiceException;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Retrofit;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class access23400 extends TransitionTransitionNotificationExternalSyntheticLambda3<getRootTransition, RememberUtilsKtExternalSyntheticLambda3<getRootTransition>> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static long onNavigationEvent = 4783041377115425031L;
    private final setDistanceToTriggerSync onExtraCallback;

    static final class onWarmupCompleted extends Lambda implements Function1<Retrofit, getSignPrikeyCCFBPHFilename<TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1<getRootTransition>>> {
        final /* synthetic */ setDistanceToTriggerSync a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(setDistanceToTriggerSync setdistancetotriggersync) {
            super(1);
            this.a = setdistancetotriggersync;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final getSignPrikeyCCFBPHFilename<TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1<getRootTransition>> invoke(@NotNull Retrofit retrofit) {
            Intrinsics.checkNotNullParameter(retrofit, BuildConfig.FLAVOR);
            return ((setDuration) retrofit.onNavigationEvent(setDuration.class)).onExtraCallbackWithResult(this.a.onExtraCallbackWithResult(), this.a.onExtraCallback(), this.a.IAuthTabCallbackDefault(), this.a.asBinder(), this.a.asInterface(), this.a.getInterfaceDescriptor(), this.a.IAuthTabCallback_Parcel(), this.a.IAuthTabCallback(), this.a.onNavigationEvent(), this.a.onTransact(), this.a.IAuthTabCallbackStub(), this.a.onWarmupCompleted());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public access23400(@NotNull setDistanceToTriggerSync setdistancetotriggersync) throws Throwable {
        Intrinsics.checkNotNullParameter(setdistancetotriggersync, BuildConfig.FLAVOR);
        Object[] objArr = new Object[1];
        a(new char[]{19544, 56505, 28094, 65207, 4023, 39163, 10737, 47860, 52138, 21684, 58811, 30339, 34754, 4226, 41353, 12945, 17281, 60564, 32150, 36569, 8087, 43166, 14819}, 37117 - ((Process.getThreadPriority(0) + 20) >> 6), objArr);
        super(((String) objArr[0]).intern(), 7200, new onWarmupCompleted(setdistancetotriggersync));
        this.onExtraCallback = setdistancetotriggersync;
    }

    public ServiceException onExtraCallback(@Nullable ResponseCode responseCode, int i, @NotNull String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        ApmHelper11.onWarmupCompleted("Fail !!!!! code " + responseCode + "  status " + i + "  message " + str);
        if (responseCode != null) {
            ServiceException serviceException = new ServiceException(responseCode, (String) null, str, 2, (DefaultConstructorMarker) null);
            int i3 = onExtraCallbackWithResult + 55;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return serviceException;
        }
        int i5 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return onNavigationEvent(i, str);
        }
        ServiceException serviceExceptionOnNavigationEvent = onNavigationEvent(i, str);
        int i6 = 54 / 0;
        return serviceExceptionOnNavigationEvent;
    }

    protected RememberUtilsKtExternalSyntheticLambda3<getRootTransition> onNavigationEvent(@NotNull TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1<getRootTransition> twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1, BuildConfig.FLAVOR);
        RememberUtilsKtExternalSyntheticLambda3<getRootTransition> rememberUtilsKtExternalSyntheticLambda3 = new RememberUtilsKtExternalSyntheticLambda3<>(twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1.onWarmupCompleted(), StringsKt.replace$default(StringsKt.trim((String) StringsKt.split$default(twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1.onExtraCallback(), new String[]{" "}, false, 0, 6, (Object) null).get(0)).toString(), "-", BuildConfig.FLAVOR, false, 4, (Object) null));
        int i2 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return rememberUtilsKtExternalSyntheticLambda3;
        }
        throw null;
    }

    public /* synthetic */ Object onWarmupCompleted(TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1 twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1);
        }
        onNavigationEvent(twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1);
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 65;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 1), 24 - Color.red(0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 19626, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onNavigationEvent ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), 59 - (ViewConfiguration.getKeyRepeatDelay() >> 16), View.resolveSize(0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 73;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                try {
                    Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), ExpandableListView.getPackedPositionGroup(0L) + 59, 6383 - (Process.myTid() >> 22), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i7 = 3 / 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 59 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        objArr[0] = new String(cArr2);
    }
}
