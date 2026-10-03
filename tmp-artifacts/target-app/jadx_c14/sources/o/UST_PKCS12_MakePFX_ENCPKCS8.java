package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.TossApplication;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.SessionTrackerb;
import o.UST_PKCS12_MakePFX_ENCPKCS8;
import o.copyFile;
import o.getSWidth;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.dashboard.onboarding.TeensOnboardingTutorialActivity;
import viva.republica.toss.service.LabActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_PKCS12_MakePFX_ENCPKCS8 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static updateAnimatedNodeConfig IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 1;
    private static char IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static char[] asBinder;
    private static int asInterface;
    public static final int onExtraCallback;
    private static final Lazy onExtraCallbackWithResult;
    private static final Lazy onNavigationEvent;
    private static int onTransact;
    public static final UST_PKCS12_MakePFX_ENCPKCS8 onWarmupCompleted;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        copyFile copyfileAsBinder = asBinder();
        int i4 = onTransact + 71;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return copyfileAsBinder;
    }

    public static /* synthetic */ SessionTrackerb onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb sessionTrackerbOnTransact = onTransact();
        int i4 = IAuthTabCallbackDefault + 19;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return sessionTrackerbOnTransact;
        }
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        Intent intentOnNavigationEvent;
        int i7 = ~i3;
        int i8 = ~i6;
        int i9 = (~(i7 | i8)) | i2;
        int i10 = i6 | i7;
        int i11 = (~(i6 | i2)) | (~(i7 | (~i2) | i8)) | (~(i2 | i3));
        int i12 = i2 + i3 + i4 + (764943627 * i5) + (189947931 * i);
        int i13 = i12 * i12;
        int i14 = (i2 * 1860537600) + 224780607 + (i3 * 1860537600) + (i9 * 1034) + (i10 * (-517)) + (i11 * 517) + (1860538117 * i4) + ((-1861700041) * i5) + ((-831392377) * i) + (i13 * 995229696);
        int i15 = ((i2 * (-973936384)) - 801505280) + ((-973936384) * i3) + (1838296578 * i9) + (1228335359 * i10) + ((-1228335359) * i11) + (2092695552 * i4) + ((-1475084288) * i5) + ((-1479278592) * i) + ((-626393088) * i13) + (i14 * i14 * 1053163520);
        if (i15 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i15 == 2) {
            return onWarmupCompleted(objArr);
        }
        UST_PKCS12_MakePFX_ENCPKCS8 uST_PKCS12_MakePFX_ENCPKCS8 = (UST_PKCS12_MakePFX_ENCPKCS8) objArr[0];
        Context context = (Context) objArr[1];
        IEngagementSignalsCallback_Parcel iEngagementSignalsCallback_Parcel = (IEngagementSignalsCallback_Parcel) objArr[2];
        String str = (String) objArr[3];
        int i16 = 2 % 2;
        if (iEngagementSignalsCallback_Parcel != null) {
            if (enableModuleArgumentNSNullConversionIOS.asInterface.IAuthTabCallbackDefault(str)) {
                int i17 = IAuthTabCallbackDefault + 47;
                onTransact = i17 % 128;
                int i18 = i17 % 2;
                intentOnNavigationEvent = uST_PKCS12_MakePFX_ENCPKCS8.asInterface().onExtraCallback(context, str);
            } else {
                intentOnNavigationEvent = LabActivity.IAuthTabCallback.onNavigationEvent(LabActivity.Companion, context, str, "", (String) null, "hide", false, false, false, 232, (Object) null);
            }
            if (intentOnNavigationEvent != null) {
                iEngagementSignalsCallback_Parcel.onNavigationEvent(intentOnNavigationEvent);
            }
        } else if (!enableModuleArgumentNSNullConversionIOS.asInterface.IAuthTabCallbackDefault(str)) {
            context.startActivity(LabActivity.IAuthTabCallback.onNavigationEvent(LabActivity.Companion, context, str, "", (String) null, "hide", false, false, false, 232, (Object) null));
        } else {
            SessionTrackerb.onExtraCallbackWithResult(uST_PKCS12_MakePFX_ENCPKCS8.asInterface(), context, str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            int i19 = onTransact + 13;
            IAuthTabCallbackDefault = i19 % 128;
            int i20 = i19 % 2;
        }
        return null;
    }

    private UST_PKCS12_MakePFX_ENCPKCS8() {
    }

    static {
        IAuthTabCallbackDefault();
        onWarmupCompleted = new UST_PKCS12_MakePFX_ENCPKCS8();
        onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.dashboard.onboarding.TeensOnboardingTutorialHelper$$ExternalSyntheticLambda0
            public final Object invoke() {
                return UST_PKCS12_MakePFX_ENCPKCS8.onExtraCallback();
            }
        });
        onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.dashboard.onboarding.TeensOnboardingTutorialHelper$$ExternalSyntheticLambda1
            public final Object invoke() {
                int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
                int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
                int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
                return (copyFile) UST_PKCS12_MakePFX_ENCPKCS8.onNavigationEvent(TossApplication.onSessionEnded.onExtraCallback(), -692314682, 692314683, new Object[0], iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback);
            }
        });
        IAuthTabCallback = new updateAnimatedNodeConfig(null, null, null, 7, null);
        onExtraCallback = 8;
        int i = asInterface + 89;
        IAuthTabCallbackStubProxy = i % 128;
        int i2 = i % 2;
    }

    private final SessionTrackerb asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 125;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb sessionTrackerb = (SessionTrackerb) onExtraCallbackWithResult.getValue();
        int i4 = IAuthTabCallbackDefault + 71;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return sessionTrackerb;
    }

    private static final SessionTrackerb onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        SessionTrackerb smallIconId = ((SessionTrackerb.onExtraCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), SessionTrackerb.onExtraCallback.class)).getSmallIconId();
        int i4 = onTransact + 113;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return smallIconId;
    }

    private final copyFile IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onTransact + 121;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        copyFile copyfile = (copyFile) onNavigationEvent.getValue();
        int i4 = IAuthTabCallbackDefault + 41;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return copyfile;
    }

    private static final copyFile asBinder() {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        UserChoiceBillingListener userChoiceBillingListener = UserChoiceBillingListener.onExtraCallback;
        if (i3 != 0) {
            return ((copyFile.onWarmupCompleted) Response.onExtraCallback(userChoiceBillingListener.onExtraCallback(), copyFile.onWarmupCompleted.class)).onUnminimized();
        }
        ((copyFile.onWarmupCompleted) Response.onExtraCallback(userChoiceBillingListener.onExtraCallback(), copyFile.onWarmupCompleted.class)).onUnminimized();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 85;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        updateAnimatedNodeConfig updateanimatednodeconfig = IAuthTabCallback;
        int i5 = i2 + 99;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return updateanimatednodeconfig;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return Intrinsics.areEqual(IAuthTabCallback.onExtraCallbackWithResult(), "signUp");
        }
        Intrinsics.areEqual(IAuthTabCallback.onExtraCallbackWithResult(), "signUp");
        throw null;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            if (!IAuthTabCallbackStub().asBinder() && fileSRect.onNavigationEvent.onExtraCallback().length() <= 0) {
                if (!((Boolean) getSWidth.onExtraCallback(-1091048204, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1091048206, new Object[]{getSWidth.onExtraCallback}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult())).booleanValue()) {
                    int i3 = onTransact + 87;
                    IAuthTabCallbackDefault = i3 % 128;
                    int i4 = i3 % 2;
                    return false;
                }
            }
            return true;
        }
        IAuthTabCallbackStub().asBinder();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Intent onExtraCallback(@NotNull Context context, @NotNull String str, @NotNull String str2, boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        updateAnimatedNodeConfig updateanimatednodeconfig = new updateAnimatedNodeConfig(null, null, null, 7, null);
        updateanimatednodeconfig.onExtraCallback(str);
        updateanimatednodeconfig.onNavigationEvent(str2);
        IAuthTabCallback = updateanimatednodeconfig;
        Intent intentOnWarmupCompleted = TeensOnboardingTutorialActivity.Companion.onWarmupCompleted(context, z);
        int i2 = onTransact + 9;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return intentOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(@NotNull Context context) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            addExtra.writeTypedObject(PlayerErrorCode.onWarmupCompleted);
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        if (addExtra.writeTypedObject(PlayerErrorCode.onWarmupCompleted)) {
            updateAnimatedNodeConfig updateanimatednodeconfig = IAuthTabCallback;
            Object[] objArr = new Object[1];
            a(new char[]{18, 1, '!', 3, '\b', 2, 1, 23, 21, 7, 13809, 13809, '!', '\"', 31, 15, 20, '\r', '\r', 6, '\b', ' ', '\"', '!', 25, 17, 15, 5, 14, 17, 25, '\n', 5, 14, '\"', '!', 4, '\t', '\r', '\b', 14, 5, 13883, 13883, 15, 30, 14, 31}, (byte) (60 - View.MeasureSpec.makeMeasureSpec(0, 0)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 48, objArr);
            Uri.Builder builderBuildUpon = Uri.parse(((String) objArr[0]).intern()).buildUpon();
            Object[] objArr2 = new Object[1];
            a(new char[]{3, ' ', ' ', '\"', 13904, 13904, ' ', 3}, (byte) (104 - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getPressedStateDuration() >> 16) + 8, objArr2);
            String string = builderBuildUpon.appendQueryParameter(((String) objArr2[0]).intern(), "onboarding").appendQueryParameter("funnelId", "5624").appendQueryParameter("showCoverView", "true").build().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            updateanimatednodeconfig.onExtraCallback(new getCurrentAppState(string));
            int i3 = IAuthTabCallbackDefault + 21;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
        }
        if (access000()) {
            updateAnimatedNodeConfig updateanimatednodeconfig2 = IAuthTabCallback;
            Object[] objArr3 = new Object[1];
            a(new char[]{18, 1, '!', 3, '\b', 2, 1, 23, 21, 7, 13872, 13872, '!', '\"', 31, 15, 20, '\r', 1, 17, 17, 3, '\b', 1, 17, 28, 14, '\f', '\f', 20, 26, 5, 30, 2, '\t', 19, 19, '\b', 13940, 13940, 0, 1, 14, 31, 23, '\b', 1, 17, 14, 5, '\b', 31, 5, 3, '\"', ' ', ' ', 3, 3, ' ', 1, 26, 23, 25, '\f', 14, 3, 24}, (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 123), 't' - AndroidCharacter.getMirror('0'), objArr3);
            updateanimatednodeconfig2.onNavigationEvent(new getConstants(((String) objArr3[0]).intern()));
            updateAnimatedNodeConfig updateanimatednodeconfig3 = IAuthTabCallback;
            Object[] objArr4 = new Object[1];
            a(new char[]{18, 1, '!', 3, '\b', 2, 1, 23, 21, 7, 13772, 13772, '!', '\"', 31, 15, 20, '\r', 1, 17, 17, 3, '\b', 1, 17, 28, 14, '\f', '\f', 2, 13824, 13824, 23, '\b', '\b', 1, 22, '\n', 3, ' ', ' ', '\"', 13823, 13823, ' ', 3, 31, 25, '#', 23, '\f', 1, 13825}, (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 23), (ViewConfiguration.getLongPressTimeout() >> 16) + 53, objArr4);
            updateanimatednodeconfig3.onNavigationEvent(new NativeAnimatedTurboModuleSpec(((String) objArr4[0]).intern()));
        }
    }

    private final boolean access000() {
        int i = 2 % 2;
        int i2 = onTransact + 21;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (!IAuthTabCallback()) {
            return false;
        }
        PlayerErrorCode playerErrorCode = PlayerErrorCode.onWarmupCompleted;
        if (!(!addExtra.IAuthTabCallback(playerErrorCode)) || addExtra.extraCallback(playerErrorCode)) {
            return false;
        }
        if (addExtra.onExtraCallback(playerErrorCode) && PlayerErrorCode.writeTypedObject() >= 18) {
            int i4 = onTransact + 29;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = IAuthTabCallbackDefault + 101;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public final void IAuthTabCallback(@NotNull Context context, @NotNull IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel) {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallback_Parcel, "");
        getConstants getconstantsOnNavigationEvent = IAuthTabCallback.onNavigationEvent();
        Object obj = null;
        if (getconstantsOnNavigationEvent != null) {
            int i4 = onTransact + 105;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                getconstantsOnNavigationEvent.onWarmupCompleted();
                obj.hashCode();
                throw null;
            }
            String strOnWarmupCompleted = getconstantsOnNavigationEvent.onWarmupCompleted();
            if (strOnWarmupCompleted != null) {
                str = strOnWarmupCompleted;
            }
        }
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
        onNavigationEvent(TossApplication.onSessionEnded.onExtraCallback(), 1193656655, -1193656655, new Object[]{this, context, iEngagementSignalsCallback_Parcel, str}, iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback);
        IAuthTabCallback.onNavigationEvent((getConstants) null);
    }

    public final void onNavigationEvent(@NotNull Context context, @NotNull IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel) {
        String strOnWarmupCompleted;
        int i = 2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallback_Parcel, "");
        NativeAnimatedTurboModuleSpec nativeAnimatedTurboModuleSpecOnWarmupCompleted = IAuthTabCallback.onWarmupCompleted();
        if (nativeAnimatedTurboModuleSpecOnWarmupCompleted == null || (strOnWarmupCompleted = nativeAnimatedTurboModuleSpecOnWarmupCompleted.onWarmupCompleted()) == null) {
            int i2 = IAuthTabCallbackDefault + 11;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
        } else {
            str = strOnWarmupCompleted;
        }
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        onNavigationEvent(TossApplication.onSessionEnded.onExtraCallback(), 1193656655, -1193656655, new Object[]{this, context, iEngagementSignalsCallback_Parcel, str}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback);
        IAuthTabCallback.onNavigationEvent((NativeAnimatedTurboModuleSpec) null);
        int i4 = onTransact + 109;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallback(@NotNull Context context, @NotNull String str, @NotNull IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallback_Parcel, "");
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        Object[] objArr = new Object[1];
        a(new char[]{3, ' ', ' ', '\"', 13904, 13904, ' ', 3}, (byte) (104 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (ViewConfiguration.getTapTimeout() >> 16) + 8, objArr);
        String string = builderBuildUpon.appendQueryParameter(((String) objArr[0]).intern(), "teens_tutorial").build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
        onNavigationEvent(TossApplication.onSessionEnded.onExtraCallback(), 1193656655, -1193656655, new Object[]{this, context, iEngagementSignalsCallback_Parcel, string}, iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback);
        IAuthTabCallback.onNavigationEvent((NativeAnimatedTurboModuleSpec) null);
        int i4 = onTransact + 119;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallback(@NotNull Context context, @NotNull IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel) {
        boolean zBooleanValue;
        String strOnNavigationEvent;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallback_Parcel, "");
        getSWidth getswidth = getSWidth.onExtraCallback;
        if (getswidth.onWarmupCompleted() != null) {
            int i4 = onTransact + 35;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            getSWidth.onExtraCallback onextracallbackOnWarmupCompleted = getswidth.onWarmupCompleted();
            Intrinsics.checkNotNull(onextracallbackOnWarmupCompleted);
            strOnNavigationEvent = onextracallbackOnWarmupCompleted.onNavigationEvent();
            getSWidth.onExtraCallback onextracallbackOnWarmupCompleted2 = getswidth.onWarmupCompleted();
            Intrinsics.checkNotNull(onextracallbackOnWarmupCompleted2);
            zBooleanValue = ((Boolean) onextracallbackOnWarmupCompleted2.onExtraCallback().invoke()).booleanValue();
        } else {
            if (IAuthTabCallbackStub().asBinder() || fileSRect.onNavigationEvent.onExtraCallback().length() > 0) {
                zBooleanValue = true;
            } else {
                int i6 = IAuthTabCallbackDefault + 33;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                zBooleanValue = false;
            }
            strOnNavigationEvent = "fromOnelink";
        }
        getCurrentAppState getcurrentappstateIAuthTabCallback = IAuthTabCallback.IAuthTabCallback();
        if (getcurrentappstateIAuthTabCallback != null) {
            int i8 = IAuthTabCallbackDefault + 105;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            String strOnExtraCallback = getcurrentappstateIAuthTabCallback.onExtraCallback();
            if (strOnExtraCallback != null) {
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(strOnNavigationEvent, String.valueOf(zBooleanValue));
                Uri uri = Uri.parse(strOnExtraCallback);
                Intrinsics.checkNotNullExpressionValue(uri, "");
                String strOnNavigationEvent2 = filterCreatePageParams.onNavigationEvent(uri, new Pair[]{pairIAuthTabCallback});
                if (strOnNavigationEvent2 != null) {
                    str = strOnNavigationEvent2;
                }
            }
        }
        onNavigationEvent(TossApplication.onSessionEnded.onExtraCallback(), 1193656655, -1193656655, new Object[]{this, context, iEngagementSignalsCallback_Parcel, str}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback());
        IAuthTabCallback.onExtraCallback((getCurrentAppState) null);
    }

    public final void onExtraCallbackWithResult(@NotNull Activity activity) throws Throwable {
        boolean z;
        int i = 2 % 2;
        int i2 = onTransact + 27;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(activity, "");
            addExtra.IAuthTabCallback(PlayerErrorCode.onWarmupCompleted);
            throw null;
        }
        Intrinsics.checkNotNullParameter(activity, "");
        if (addExtra.IAuthTabCallback(PlayerErrorCode.onWarmupCompleted) || !IAuthTabCallback()) {
            z = false;
        } else {
            int i3 = onTransact + 13;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        }
        SessionTrackerb sessionTrackerbAsInterface = asInterface();
        Object[] objArr = new Object[1];
        a(new char[]{18, 1, '!', 3, '\b', 2, 1, 23, 21, 7, 13792, 13792, '\r', 6, 25, 17}, (byte) (44 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 16, objArr);
        SessionTrackerb.IAuthTabCallback(sessionTrackerbAsInterface, activity, convertAnyToMap.IAuthTabCallback(((String) objArr[0]).intern(), "onRestartDeferredLinkAction", String.valueOf(z)), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        if (!onWarmupCompleted()) {
            DERSet dERSet = DERSet.onExtraCallback;
            if (dERSet.onBackPressed().length() > 0) {
                SessionTrackerb.IAuthTabCallback(asInterface(), activity, dERSet.onBackPressed(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                int i5 = IAuthTabCallbackDefault + 77;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        int i7 = IAuthTabCallbackDefault + 1;
        onTransact = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr3 = asBinder;
        long j = 0;
        Object obj2 = null;
        if (cArr3 != null) {
            int i4 = $11 + 19;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 79;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 26, 23140 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallbackStub)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), 26 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 23139 - ((Process.getThreadPriority(0) + 20) >> 6), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i8 = $11 + 35;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                i2 = i + 101;
                cArr4[i2] = (char) (cArr[i2] * b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore("", 0) + 24824), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 73, 8088 - KeyEvent.keyCodeFromString(""), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int i9 = $11 + 87;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        try {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), View.resolveSizeAndState(0, 0, 0) + 30, KeyEvent.keyCodeFromString("") + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i11];
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i12];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i13];
                        } else {
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i14];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i15];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        int i16 = 0;
        while (i16 < i) {
            int i17 = $10 + 121;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                cArr4[i16] = (char) (cArr4[i16] ^ 29398);
                i16 += 85;
            } else {
                cArr4[i16] = (char) (cArr4[i16] ^ 13722);
                i16++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    public static /* synthetic */ copyFile onExtraCallbackWithResult() {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
        return (copyFile) onNavigationEvent(TossApplication.onSessionEnded.onExtraCallback(), -692314682, 692314683, new Object[0], iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback);
    }

    private final void onExtraCallback(Context context, IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel, String str) {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
        onNavigationEvent(TossApplication.onSessionEnded.onExtraCallback(), 1193656655, -1193656655, new Object[]{this, context, iEngagementSignalsCallback_Parcel, str}, iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback);
    }

    public final updateAnimatedNodeConfig onNavigationEvent() {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
        return (updateAnimatedNodeConfig) onNavigationEvent(TossApplication.onSessionEnded.onExtraCallback(), 334927683, -334927681, new Object[]{this}, iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback);
    }

    static void IAuthTabCallbackDefault() {
        asBinder = new char[]{64966, 65067, 64961, 65010, 64908, 64988, 65068, 64978, 64979, 64905, 65015, 64976, 64990, 64989, 64924, 64977, 64983, 64980, 64965, 64960, 64926, 64991, 65066, 64987, 65069, 64910, 64984, 64963, 64999, 64986, 64985, 64981, 64967, 64982, 65064, 65065};
        IAuthTabCallbackStub = (char) 51247;
    }
}
