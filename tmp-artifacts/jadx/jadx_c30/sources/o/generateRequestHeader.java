package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
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
public final class generateRequestHeader extends TransitionTransitionNotificationExternalSyntheticLambda3<getPathMotion, RememberUtilsKtExternalSyntheticLambda3<getPathMotion>> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallbackDefault = 56770;
    private static char IAuthTabCallbackStub = 43942;
    private static int IAuthTabCallback_Parcel = 0;
    private static char asInterface = 59168;
    private static int getInterfaceDescriptor = 1;
    private static char onTransact = 65029;
    private final String IAuthTabCallback;
    private final String asBinder;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final setProgressViewOffset onWarmupCompleted;

    static final class onExtraCallbackWithResult extends Lambda implements Function1<Retrofit, getSignPrikeyCCFBPHFilename<TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1<getPathMotion>>> {
        final /* synthetic */ setProgressViewOffset a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;
        final /* synthetic */ String e;
        final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(setProgressViewOffset setprogressviewoffset, String str, String str2, String str3, String str4, String str5) {
            super(1);
            this.a = setprogressviewoffset;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final getSignPrikeyCCFBPHFilename<TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1<getPathMotion>> invoke(@NotNull Retrofit retrofit) {
            Intrinsics.checkNotNullParameter(retrofit, BuildConfig.FLAVOR);
            return ((setEpicenterCallback) retrofit.onNavigationEvent(setEpicenterCallback.class)).onWarmupCompleted(this.a.onExtraCallback(), this.a.onExtraCallbackWithResult(), this.a.IAuthTabCallback(), this.a.onWarmupCompleted(), this.a.onNavigationEvent(), this.a.IAuthTabCallbackStub(), this.a.IAuthTabCallbackDefault(), this.a.asBinder(), this.b, this.c, this.d, this.e, this.f);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public generateRequestHeader(@NotNull setProgressViewOffset setprogressviewoffset, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) throws Throwable {
        Intrinsics.checkNotNullParameter(setprogressviewoffset, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str4, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str5, BuildConfig.FLAVOR);
        Object[] objArr = new Object[1];
        a(new char[]{62867, 34906, 32955, 35687, 36407, 5919, 22603, 35009, 37322, 34697, 51626, 4906, 23302, 14202, 38270, 20042, 40334, 57129, 37900, 60884, 21904, 38174, 15808, 39167}, 22 - Process.getGidForName(BuildConfig.FLAVOR), objArr);
        super(((String) objArr[0]).intern(), 7200, new onExtraCallbackWithResult(setprogressviewoffset, str, str2, str3, str4, str5));
        this.onWarmupCompleted = setprogressviewoffset;
        this.onExtraCallback = str;
        this.IAuthTabCallback = str2;
        this.onNavigationEvent = str3;
        this.onExtraCallbackWithResult = str4;
        this.asBinder = str5;
    }

    public ServiceException onExtraCallback(@Nullable ResponseCode responseCode, int i, @NotNull String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 77;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        if (responseCode != null) {
            ServiceException serviceException = new ServiceException(responseCode, (String) null, str, 2, (DefaultConstructorMarker) null);
            int i5 = IAuthTabCallback_Parcel + 17;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            return serviceException;
        }
        int i7 = IAuthTabCallback_Parcel + 101;
        getInterfaceDescriptor = i7 % 128;
        if (i7 % 2 != 0) {
            return onNavigationEvent(i, str);
        }
        onNavigationEvent(i, str);
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.krc.pl_card.service.model.ServiceException */
    protected RememberUtilsKtExternalSyntheticLambda3<getPathMotion> onExtraCallback(@NotNull TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1<getPathMotion> twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1) throws ServiceException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 25;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1, BuildConfig.FLAVOR);
        if (!Intrinsics.areEqual(twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1.onExtraCallbackWithResult(), ResponseCode.OK.getCode())) {
            onExtraCallbackWithResult(twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1);
            throw new ServiceException(ResponseCode.Companion.onExtraCallbackWithResult(twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1.onExtraCallbackWithResult()), twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1.IAuthTabCallback(), twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1.onNavigationEvent());
        }
        RememberUtilsKtExternalSyntheticLambda3<getPathMotion> rememberUtilsKtExternalSyntheticLambda3 = new RememberUtilsKtExternalSyntheticLambda3<>(twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1.onWarmupCompleted(), StringsKt.replace$default(StringsKt.trim((String) StringsKt.split$default(twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1.onExtraCallback(), new String[]{" "}, false, 0, 6, (Object) null).get(0)).toString(), "-", BuildConfig.FLAVOR, false, 4, (Object) null));
        int i4 = getInterfaceDescriptor + 53;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return rememberUtilsKtExternalSyntheticLambda3;
    }

    public /* synthetic */ Object onWarmupCompleted(TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1 twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1) throws ServiceException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 63;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        RememberUtilsKtExternalSyntheticLambda3<getPathMotion> rememberUtilsKtExternalSyntheticLambda3OnExtraCallback = onExtraCallback(twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1);
        int i4 = getInterfaceDescriptor + 119;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return rememberUtilsKtExternalSyntheticLambda3OnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
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
            int i4 = $10 + 15;
            $11 = i4 % 128;
            int i5 = 58224;
            if (i4 % 2 == 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent >> 1];
            } else {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            }
            int i6 = i3;
            while (i6 < 16) {
                int i7 = $11 + 47;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i9 = (c2 + i5) ^ ((c2 << 4) + ((char) (asInterface ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onTransact);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        int i11 = 11 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int iGreen = 12434 - Color.green(i3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), i11, iGreen, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (IAuthTabCallbackStub ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallbackDefault)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 11 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 12434 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16015 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 14, Drawable.resolveOpacity(0, 0) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
