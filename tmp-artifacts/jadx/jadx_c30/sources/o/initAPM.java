package o;

import android.text.TextUtils;
import android.view.KeyEvent;
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
public final class initAPM extends TransitionTransitionNotificationExternalSyntheticLambda3<getTargetNames, RememberUtilsKtExternalSyntheticLambda3<getTargetNames>> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 61274;
    private static char IAuthTabCallbackDefault = 8497;
    private static int asInterface = 0;
    private static char onExtraCallback = 52077;
    private static int onTransact = 1;
    private static char onWarmupCompleted = 8755;
    private final String onExtraCallbackWithResult;
    private final setProgressBackgroundColor onNavigationEvent;

    static final class IAuthTabCallback extends Lambda implements Function1<Retrofit, getSignPrikeyCCFBPHFilename<TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1<getTargetNames>>> {
        final /* synthetic */ setProgressBackgroundColor a;
        final /* synthetic */ getPathMotion b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(setProgressBackgroundColor setprogressbackgroundcolor, getPathMotion getpathmotion, String str) {
            super(1);
            this.a = setprogressbackgroundcolor;
            this.b = getpathmotion;
            this.c = str;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final getSignPrikeyCCFBPHFilename<TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1<getTargetNames>> invoke(@NotNull Retrofit retrofit) {
            Intrinsics.checkNotNullParameter(retrofit, BuildConfig.FLAVOR);
            return ((setEpicenterCallback) retrofit.onNavigationEvent(setEpicenterCallback.class)).IAuthTabCallback(this.a.onNavigationEvent(), this.a.onExtraCallbackWithResult(), this.a.onExtraCallback(), this.a.onWarmupCompleted(), this.a.IAuthTabCallback(), this.a.onTransact(), this.b.IAuthTabCallback(), " ", this.c, this.b.onNavigationEvent(), this.b.onExtraCallback());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public initAPM(@NotNull setProgressBackgroundColor setprogressbackgroundcolor, @NotNull getPathMotion getpathmotion, @NotNull String str) throws Throwable {
        Intrinsics.checkNotNullParameter(setprogressbackgroundcolor, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(getpathmotion, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Object[] objArr = new Object[1];
        a(new char[]{50257, 2349, 61506, 27460, 30676, 52972, 39264, 51309, 27031, 10604, 57478, 4267, 1521, 1791, 16934, 49546, 46347, 21835, 6413, 14463, 20885, 44982, 7824, 43213}, (KeyEvent.getMaxKeyCode() >> 16) + 23, objArr);
        super(((String) objArr[0]).intern(), 7200, new IAuthTabCallback(setprogressbackgroundcolor, getpathmotion, str));
        this.onNavigationEvent = setprogressbackgroundcolor;
        this.onExtraCallbackWithResult = str;
    }

    public ServiceException onExtraCallback(@Nullable ResponseCode responseCode, int i, @NotNull String str) {
        int i2 = 2 % 2;
        int i3 = onTransact + 55;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        if (i4 != 0) {
            throw null;
        }
        if (responseCode == null) {
            return onNavigationEvent(i, str);
        }
        ServiceException serviceException = new ServiceException(responseCode, (String) null, str, 2, (DefaultConstructorMarker) null);
        int i5 = asInterface + 85;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return serviceException;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.krc.pl_card.service.model.ServiceException */
    protected RememberUtilsKtExternalSyntheticLambda3<getTargetNames> onExtraCallback(@NotNull TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1<getTargetNames> twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1) throws ServiceException {
        int i = 2 % 2;
        int i2 = onTransact + 51;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1, BuildConfig.FLAVOR);
        if (!Intrinsics.areEqual(twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1.onExtraCallbackWithResult(), ResponseCode.OK.getCode())) {
            onExtraCallbackWithResult(twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1);
            throw new ServiceException(ResponseCode.Companion.onExtraCallbackWithResult(twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1.onExtraCallbackWithResult()), twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1.IAuthTabCallback(), twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1.onNavigationEvent());
        }
        RememberUtilsKtExternalSyntheticLambda3<getTargetNames> rememberUtilsKtExternalSyntheticLambda3 = new RememberUtilsKtExternalSyntheticLambda3<>(twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1.onWarmupCompleted(), StringsKt.replace$default(StringsKt.trim((String) StringsKt.split$default(twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1.onExtraCallback(), new String[]{" "}, false, 0, 6, (Object) null).get(0)).toString(), "-", BuildConfig.FLAVOR, false, 4, (Object) null));
        int i4 = asInterface + 85;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
        return rememberUtilsKtExternalSyntheticLambda3;
    }

    public /* synthetic */ Object onWarmupCompleted(TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1 twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1) throws ServiceException {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        RememberUtilsKtExternalSyntheticLambda3<getTargetNames> rememberUtilsKtExternalSyntheticLambda3OnExtraCallback = onExtraCallback(twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1);
        int i4 = onTransact + 33;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return rememberUtilsKtExternalSyntheticLambda3OnExtraCallback;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i6 = (c2 + i4) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i7 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallbackDefault);
                    objArr2[2] = Integer.valueOf(i7);
                    objArr2[1] = Integer.valueOf(i6);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', i3, i3));
                        int trimmedLength = 10 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR);
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, trimmedLength, tapTimeout, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), 10 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 12434 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
                    int i8 = $10 + 79;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - ExpandableListView.getPackedPositionGroup(0L)), 13 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), 19901 - (ViewConfiguration.getTouchSlop() >> 8), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i10 = $10 + 105;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
