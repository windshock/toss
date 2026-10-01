package o;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.securities.core.router.spec.TossSecRoute;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import o.ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2;
import o.PullRefreshIndicatorKtExternalSyntheticLambda3;
import o.PullRefreshIndicatorKtExternalSyntheticLambda5;
import o.TypographyKtExternalSyntheticLambda0;
import o.onConsentFormDismissed;
import o.setPopupContentSizefhxjrPA;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onConsentFormDismissed implements r8lambdatXGUzCGUxx0hG43Y4a9qHQvkAnU {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    private static final String IAuthTabCallback;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 1;
    private static int access100;
    private static long asInterface;
    private static int getInterfaceDescriptor;
    private final SessionTrackerb IAuthTabCallbackDefault;
    private final getPrivacyPolicyUri IAuthTabCallbackStub;
    private final setParentLayoutDirection asBinder;
    private final Function0<Boolean> onExtraCallback;
    private final Function0<Boolean> onExtraCallbackWithResult;
    private final Context onNavigationEvent;
    private final Function0<Boolean> onTransact;
    private final accessgetStatep onWarmupCompleted;

    static {
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(new char[]{45936, 4189, 62757, 23271, 16349, 40096, 24686, 50525, 43560, 4026, 60546, 45557, 5487, 64067, 24372, 15587}, 41771 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
        IAuthTabCallback = ((String) objArr[0]).intern();
        Companion = new onExtraCallback(null);
        int i = IAuthTabCallback_Parcel + 83;
        getInterfaceDescriptor = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa) {
        int i = 2 % 2;
        int i2 = access000 + 81;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return onTransact(setpopupcontentsizefhxjrpa);
        }
        onTransact(setpopupcontentsizefhxjrpa);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa = (setPopupContentSizefhxjrPA) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 49;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(setpopupcontentsizefhxjrpa);
        int i4 = access000 + 115;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, TossSecRoute tossSecRoute, onConsentFormDismissed onconsentformdismissed, setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa) {
        int i = 2 % 2;
        int i2 = access100 + 125;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(function1, tossSecRoute, onconsentformdismissed, setpopupcontentsizefhxjrpa);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(function1, tossSecRoute, onconsentformdismissed, setpopupcontentsizefhxjrpa);
        int i3 = access000 + 109;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, onConsentFormDismissed onconsentformdismissed, boolean z, setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa) {
        int i = 2 % 2;
        int i2 = access100 + 69;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(z);
        if (i3 == 0) {
            int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
            int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnNavigationEvent3 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent4 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        Unit unit = (Unit) onWarmupCompleted(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1102076017, iOnNavigationEvent3, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1102076010, iOnNavigationEvent4, new Object[]{function1, onconsentformdismissed, boolValueOf, setpopupcontentsizefhxjrpa});
        int i4 = access100 + 25;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa) {
        int i = 2 % 2;
        int i2 = access000 + 75;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(setpopupcontentsizefhxjrpa);
        int i4 = access100 + 23;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return unitAsBinder;
    }

    private static final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 7;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 91;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PullRefreshIndicatorKtExternalSyntheticLambda5 pullRefreshIndicatorKtExternalSyntheticLambda5) {
        int i = 2 % 2;
        int i2 = access000 + 21;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackDefault(pullRefreshIndicatorKtExternalSyntheticLambda5);
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(pullRefreshIndicatorKtExternalSyntheticLambda5);
        int i3 = access100 + 97;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa) {
        int i = 2 % 2;
        int i2 = access100 + 65;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(setpopupcontentsizefhxjrpa);
        int i4 = access100 + 73;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onNavigationEvent(PullRefreshIndicatorKtExternalSyntheticLambda5 pullRefreshIndicatorKtExternalSyntheticLambda5) {
        int i = 2 % 2;
        int i2 = access000 + 125;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return asInterface(pullRefreshIndicatorKtExternalSyntheticLambda5);
        }
        asInterface(pullRefreshIndicatorKtExternalSyntheticLambda5);
        throw null;
    }

    public static /* synthetic */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access000 + 67;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback();
        int i4 = access100 + 105;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallback;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        PullRefreshIndicatorKtExternalSyntheticLambda5 pullRefreshIndicatorKtExternalSyntheticLambda5 = (PullRefreshIndicatorKtExternalSyntheticLambda5) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 1;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(pullRefreshIndicatorKtExternalSyntheticLambda5);
        int i4 = access000 + 77;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = i7 | i8;
        int i10 = ~(i9 | i3);
        int i11 = (~i3) | i7;
        int i12 = i10 | (~(i11 | i5));
        int i13 = (~(i3 | i7)) | (~i9);
        int i14 = (~i11) | (~(i8 | i2));
        int i15 = i2 + i5 + i6 + (783392123 * i) + ((-786872706) * i4);
        int i16 = i15 * i15;
        int i17 = ((-1525980173) * i2) + 1729888256 + (218870266 * i5) + (i12 * 1744850439) + ((-805266418) * i13) + (1744850439 * i14) + (1963720704 * i6) + ((-1731985408) * i) + ((-471334912) * i4) + ((-600899584) * i16);
        int i18 = (i2 * 375823119) + 1642083618 + (i5 * 375823682) + (i12 * 563) + (i13 * 1126) + (i14 * 563) + (i6 * 375824245) + (i * (-117547465)) + (i4 * 763984278) + (i16 * (-763691008));
        switch (i17 + (i18 * i18 * 1830354944)) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return asBinder(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, onConsentFormDismissed onconsentformdismissed, setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa) {
        int i = 2 % 2;
        int i2 = access000 + 41;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function1, exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, onconsentformdismissed, setpopupcontentsizefhxjrpa);
        int i4 = access000 + 121;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PullRefreshIndicatorKtExternalSyntheticLambda5 pullRefreshIndicatorKtExternalSyntheticLambda5) {
        int i = 2 % 2;
        int i2 = access100 + 49;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(pullRefreshIndicatorKtExternalSyntheticLambda5);
        int i4 = access000 + 11;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onWarmupCompleted(onConsentFormDismissed onconsentformdismissed, TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, Bundle bundle) {
        int i = 2 % 2;
        int i2 = access000 + 87;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(onconsentformdismissed, typographyKtExternalSyntheticLambda0, exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, bundle);
        if (i3 != 0) {
            int i4 = 44 / 0;
        }
    }

    public onConsentFormDismissed(@NotNull Context context, @NotNull SessionTrackerb sessionTrackerb, @NotNull setParentLayoutDirection setparentlayoutdirection, @NotNull accessgetStatep accessgetstatep, @NotNull getPrivacyPolicyUri getprivacypolicyuri, @NotNull Function0<Boolean> function0, @Nullable Function0<Boolean> function02, @NotNull Function0<Boolean> function03) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(sessionTrackerb, "");
        Intrinsics.checkNotNullParameter(setparentlayoutdirection, "");
        Intrinsics.checkNotNullParameter(accessgetstatep, "");
        Intrinsics.checkNotNullParameter(getprivacypolicyuri, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function03, "");
        this.onNavigationEvent = context;
        this.IAuthTabCallbackDefault = sessionTrackerb;
        this.asBinder = setparentlayoutdirection;
        this.onWarmupCompleted = accessgetstatep;
        this.IAuthTabCallbackStub = getprivacypolicyuri;
        this.onExtraCallbackWithResult = function0;
        this.onTransact = function02;
        this.onExtraCallback = function03;
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        onWarmupCompleted(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 2111314194, iOnNavigationEvent, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -2111314190, iOnNavigationEvent2, new Object[]{this});
    }

    private final boolean IAuthTabCallback() {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = access100 + 15;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            zBooleanValue = ((Boolean) this.onExtraCallback.invoke()).booleanValue();
            int i3 = 79 / 0;
        } else {
            zBooleanValue = ((Boolean) this.onExtraCallback.invoke()).booleanValue();
        }
        int i4 = access100 + 17;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = access000 + 69;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        if (!((Boolean) isUserSubjectToGDPR.onNavigationEvent(new Object[]{isUserSubjectToGDPR.onWarmupCompleted}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 655245496, -655245488, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).booleanValue() || !IAuthTabCallback()) {
            return false;
        }
        int i4 = access100 + 99;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        final onConsentFormDismissed onconsentformdismissed = (onConsentFormDismissed) objArr[0];
        int i = 2 % 2;
        onconsentformdismissed.asBinder.onExtraCallback(new TypographyKtExternalSyntheticLambda0.onExtraCallback() { // from class: im.toss.securities.core.router.impl.TossSecRouterNav2Impl$$ExternalSyntheticLambda10
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final void onDestinationChanged(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, Bundle bundle) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 45;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    onConsentFormDismissed.onWarmupCompleted(this.f$0, typographyKtExternalSyntheticLambda0, exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, bundle);
                    throw null;
                }
                onConsentFormDismissed.onWarmupCompleted(this.f$0, typographyKtExternalSyntheticLambda0, exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, bundle);
                int i4 = onExtraCallbackWithResult + 57;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 19 / 0;
                }
            }
        });
        int i2 = access000 + 103;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 76 / 0;
        }
        return null;
    }

    private static final void onExtraCallbackWithResult(onConsentFormDismissed onconsentformdismissed, TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, Bundle bundle) {
        int i = 2 % 2;
        int i2 = access100 + 91;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, "");
        TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0OnWarmupCompleted = onconsentformdismissed.asBinder.onWarmupCompleted();
        if (twoLineExternalSyntheticLambda0OnWarmupCompleted == null) {
            return;
        }
        onconsentformdismissed.IAuthTabCallbackStub.IAuthTabCallback(twoLineExternalSyntheticLambda0OnWarmupCompleted);
        int i4 = access000 + 63;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.r8lambdatXGUzCGUxx0hG43Y4a9qHQvkAnU
    public boolean onExtraCallback(@NotNull String str) {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object obj2 = null;
        if ((StringsKt.isBlank(str) ? null : str) == null) {
            return false;
        }
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(Uri.parse(str));
            int i2 = access000 + 103;
            access100 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 4 / 2;
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            int i4 = access000 + 115;
            access100 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        } else {
            obj2 = obj;
        }
        return r8lambdatXGUzCGUxx0hG43Y4a9qHQvkAnU.IAuthTabCallback(this, (Uri) obj2, false, false, 6, null);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $10 + 11;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = $10 + 97;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 23 - ExpandableListView.getPackedPositionChild(0L), (Process.myTid() >> 22) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() % (asInterface / 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), 59 - TextUtils.indexOf("", ""), View.MeasureSpec.getMode(0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 1), TextUtils.getCapsMode("", 0, 0) + 24, TextUtils.getOffsetBefore("", 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (asInterface ^ 5407414049857832247L);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), TextUtils.indexOf("", "", 0, 0) + 59, Color.blue(0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 59 - View.resolveSize(0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    private static final Unit IAuthTabCallbackDefault(setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setpopupcontentsizefhxjrpa, "");
        setpopupcontentsizefhxjrpa.onNavigationEvent(Reflection.getOrCreateKotlinClass(TossSecRoute.Loading.class), new Function1() { // from class: im.toss.securities.core.router.impl.TossSecRouterNav2Impl$$ExternalSyntheticLambda12
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 47;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
                int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
                Unit unit = (Unit) onConsentFormDismissed.onWarmupCompleted(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1786535942, iOnNavigationEvent, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1786535937, iOnNavigationEvent2, new Object[]{(PullRefreshIndicatorKtExternalSyntheticLambda5) obj});
                int i5 = onExtraCallbackWithResult + 65;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = access100 + 43;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onTransact(PullRefreshIndicatorKtExternalSyntheticLambda5 pullRefreshIndicatorKtExternalSyntheticLambda5) {
        int i = 2 % 2;
        int i2 = access000 + 91;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(pullRefreshIndicatorKtExternalSyntheticLambda5, "");
        pullRefreshIndicatorKtExternalSyntheticLambda5.IAuthTabCallback(true);
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 15;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
        return unit;
    }

    private static final Unit asInterface(setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa) {
        int i = 2 % 2;
        int i2 = access100 + 71;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setpopupcontentsizefhxjrpa, "");
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setpopupcontentsizefhxjrpa, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = access100 + 117;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    @Override // o.r8lambdatXGUzCGUxx0hG43Y4a9qHQvkAnU
    public boolean IAuthTabCallback(@Nullable Uri uri, boolean z, boolean z2) {
        Function1 function1;
        int i = 2 % 2;
        int i2 = access000 + 35;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        if (z) {
            function1 = new Function1() { // from class: im.toss.securities.core.router.impl.TossSecRouterNav2Impl$$ExternalSyntheticLambda5
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj) {
                    int i4 = 2 % 2;
                    int i5 = onWarmupCompleted + 87;
                    onExtraCallbackWithResult = i5 % 128;
                    setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa = (setPopupContentSizefhxjrPA) obj;
                    if (i5 % 2 != 0) {
                        return onConsentFormDismissed.onExtraCallbackWithResult(setpopupcontentsizefhxjrpa);
                    }
                    onConsentFormDismissed.onExtraCallbackWithResult(setpopupcontentsizefhxjrpa);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            };
        } else {
            function1 = new Function1() { // from class: im.toss.securities.core.router.impl.TossSecRouterNav2Impl$$ExternalSyntheticLambda6
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj) {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallback + 71;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    Object[] objArr = {(setPopupContentSizefhxjrPA) obj};
                    int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
                    int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
                    int iOnNavigationEvent3 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
                    int iOnNavigationEvent4 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
                    if (i6 != 0) {
                        throw null;
                    }
                    Unit unit = (Unit) onConsentFormDismissed.onWarmupCompleted(iOnNavigationEvent3, 126803291, iOnNavigationEvent, iOnNavigationEvent4, -126803289, iOnNavigationEvent2, objArr);
                    int i7 = onWarmupCompleted + 1;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        return unit;
                    }
                    throw null;
                }
            };
            int i4 = access000 + 77;
            access100 = i4 % 128;
            int i5 = i4 % 2;
        }
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        return ((Boolean) onWarmupCompleted(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 959805933, iOnNavigationEvent, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -959805927, iOnNavigationEvent2, new Object[]{this, uri, function1})).booleanValue();
    }

    private static final Unit asBinder(setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa) {
        int i = 2 % 2;
        int i2 = access100 + 57;
        access000 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setpopupcontentsizefhxjrpa, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(setpopupcontentsizefhxjrpa, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = access100 + 53;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        onConsentFormDismissed onconsentformdismissed = (onConsentFormDismissed) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa = (setPopupContentSizefhxjrPA) objArr[3];
        int i = 2 % 2;
        int i2 = access000 + 89;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setpopupcontentsizefhxjrpa, "");
            function1.invoke(setpopupcontentsizefhxjrpa);
            onconsentformdismissed.onWarmupCompleted(setpopupcontentsizefhxjrpa, zBooleanValue);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setpopupcontentsizefhxjrpa, "");
        function1.invoke(setpopupcontentsizefhxjrpa);
        onconsentformdismissed.onWarmupCompleted(setpopupcontentsizefhxjrpa, zBooleanValue);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit IAuthTabCallback(Function1 function1, ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, onConsentFormDismissed onconsentformdismissed, setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa) {
        int i = 2 % 2;
        int i2 = access000 + 7;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setpopupcontentsizefhxjrpa, "");
            function1.invoke(setpopupcontentsizefhxjrpa);
            ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2.Companion.onWarmupCompleted(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, Reflection.getOrCreateKotlinClass(TossSecRoute.Main.class));
            throw null;
        }
        Intrinsics.checkNotNullParameter(setpopupcontentsizefhxjrpa, "");
        function1.invoke(setpopupcontentsizefhxjrpa);
        ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2.onNavigationEvent onnavigationevent = ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2.Companion;
        if (!(!onnavigationevent.onWarmupCompleted(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, Reflection.getOrCreateKotlinClass(TossSecRoute.Main.class)))) {
            onconsentformdismissed.IAuthTabCallbackStub(setpopupcontentsizefhxjrpa);
        } else if (onnavigationevent.onWarmupCompleted(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, Reflection.getOrCreateKotlinClass(TossSecRoute.EarningCallHome.class))) {
            int i3 = access100 + 15;
            access000 = i3 % 128;
            if (i3 % 2 == 0) {
                onconsentformdismissed.onWarmupCompleted(setpopupcontentsizefhxjrpa);
                obj.hashCode();
                throw null;
            }
            onconsentformdismissed.onWarmupCompleted(setpopupcontentsizefhxjrpa);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean onExtraCallbackWithResult(boolean z, final onConsentFormDismissed onconsentformdismissed, Uri uri, Uri uri2, final Function1<? super setPopupContentSizefhxjrPA, Unit> function1, final ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2) throws Throwable {
        final boolean z2;
        int i = 2 % 2;
        if (z && exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 == null) {
            return false;
        }
        if ((!z) && onconsentformdismissed.onExtraCallback(uri)) {
            return SessionTrackerb.onExtraCallbackWithResult(onconsentformdismissed.IAuthTabCallbackDefault, onconsentformdismissed.onNavigationEvent, uri.toString(), false, null, null, false, 60, null);
        }
        if (exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 != null) {
            int i2 = access100 + 55;
            access000 = i2 % 128;
            if (i2 % 2 != 0) {
                if (onconsentformdismissed.IAuthTabCallbackDefault() || onconsentformdismissed.onNavigationEvent(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2)) {
                    if (ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2.Companion.onWarmupCompleted(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, Reflection.getOrCreateKotlinClass(TossSecRoute.EarningCallDetail.class))) {
                        if (((String) onWarmupCompleted(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1329284785, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1329284784, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{onconsentformdismissed, uri2, "beforeEntryId"})) != null) {
                            int i3 = access100 + 73;
                            access000 = i3 % 128;
                            int i4 = i3 % 2;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        String str = (String) onWarmupCompleted(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1329284785, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1329284784, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{onconsentformdismissed, uri2, "eventId"});
                        if ((str != null ? StringsKt.toLongOrNull(str) : null) == null) {
                            int i5 = access100 + 27;
                            access000 = i5 % 128;
                            int i6 = i5 % 2;
                            Object[] objArr = new Object[1];
                            a(new char[]{45942, 20458, 19036}, 64668 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
                            AFd1mSDK.onExtraCallbackWithResult("Failed to parse eventId from uri", (Throwable) null, access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), uri2.toString())), false, (Function1) null, 26, (Object) null);
                        } else {
                            onconsentformdismissed.asBinder.onNavigationEvent(uri2, PopupLayoutExternalSyntheticLambda0.onExtraCallbackWithResult(new Function1() { // from class: im.toss.securities.core.router.impl.TossSecRouterNav2Impl$$ExternalSyntheticLambda0
                                private static int onExtraCallbackWithResult = 1;
                                private static int onNavigationEvent;

                                public final Object invoke(Object obj) {
                                    Unit unitOnExtraCallback;
                                    int i7 = 2 % 2;
                                    int i8 = onExtraCallbackWithResult + 95;
                                    onNavigationEvent = i8 % 128;
                                    if (i8 % 2 != 0) {
                                        unitOnExtraCallback = onConsentFormDismissed.onExtraCallback(function1, onconsentformdismissed, z2, (setPopupContentSizefhxjrPA) obj);
                                        int i9 = 83 / 0;
                                    } else {
                                        unitOnExtraCallback = onConsentFormDismissed.onExtraCallback(function1, onconsentformdismissed, z2, (setPopupContentSizefhxjrPA) obj);
                                    }
                                    int i10 = onNavigationEvent + 11;
                                    onExtraCallbackWithResult = i10 % 128;
                                    if (i10 % 2 != 0) {
                                        return unitOnExtraCallback;
                                    }
                                    throw null;
                                }
                            }));
                        }
                    } else {
                        onconsentformdismissed.asBinder.onNavigationEvent(uri2, PopupLayoutExternalSyntheticLambda0.onExtraCallbackWithResult(new Function1() { // from class: im.toss.securities.core.router.impl.TossSecRouterNav2Impl$$ExternalSyntheticLambda1
                            private static int onExtraCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj) {
                                int i7 = 2 % 2;
                                int i8 = onExtraCallback + 77;
                                onWarmupCompleted = i8 % 128;
                                int i9 = i8 % 2;
                                Function1 function12 = function1;
                                if (i9 != 0) {
                                    return onConsentFormDismissed.onWarmupCompleted(function12, exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, onconsentformdismissed, (setPopupContentSizefhxjrPA) obj);
                                }
                                onConsentFormDismissed.onWarmupCompleted(function12, exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, onconsentformdismissed, (setPopupContentSizefhxjrPA) obj);
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                        }));
                    }
                } else {
                    if (z) {
                        return false;
                    }
                    TossSecRoute.EarningCallDetail earningCallDetail = (TossSecRoute.EarningCallDetail) onWarmupCompleted(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 2003008789, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -2003008789, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{onconsentformdismissed, uri2});
                    if (earningCallDetail == null || !onconsentformdismissed.IAuthTabCallbackDefault()) {
                        earningCallDetail = null;
                    }
                    if (earningCallDetail != null) {
                        onWarmupCompleted(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -791385487, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 791385490, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{onconsentformdismissed, earningCallDetail, function1});
                    } else {
                        String string = uri.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        onWarmupCompleted(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -791385487, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 791385490, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{onconsentformdismissed, new TossSecRoute.Web(string, (String) null, 2, (DefaultConstructorMarker) null), function1});
                    }
                }
            } else {
                onconsentformdismissed.IAuthTabCallbackDefault();
                throw null;
            }
        }
        return true;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        onConsentFormDismissed onconsentformdismissed = (onConsentFormDismissed) objArr[0];
        Uri uri = (Uri) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        int i = 2 % 2;
        if (((Boolean) onconsentformdismissed.onExtraCallbackWithResult.invoke()).booleanValue()) {
            int i2 = access100;
            int i3 = i2 + 117;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 59;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (uri != null) {
            int i7 = access000 + 71;
            access100 = i7 % 128;
            Object obj = null;
            if (i7 % 2 != 0) {
                onconsentformdismissed.IAuthTabCallback(uri);
                obj.hashCode();
                throw null;
            }
            Uri uriIAuthTabCallback = onconsentformdismissed.IAuthTabCallback(uri);
            if (uriIAuthTabCallback != null) {
                Iterator it = onconsentformdismissed.asBinder.asBinder().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2) next).onExtraCallbackWithResult(uriIAuthTabCallback)) {
                        obj = next;
                        break;
                    }
                }
                ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 = (ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2) obj;
                boolean zAreEqual = Intrinsics.areEqual(uri.getHost(), "native-securities");
                if (exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 == null || !ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2.Companion.onWarmupCompleted(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, Reflection.getOrCreateKotlinClass(TossSecRoute.OptionPracticeIntroVideo.class)) || onconsentformdismissed.asInterface()) {
                    return Boolean.valueOf(onExtraCallbackWithResult(zAreEqual, onconsentformdismissed, uri, uriIAuthTabCallback, function1, exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2));
                }
                int i8 = access000 + 43;
                access100 = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    @Override // o.r8lambdatXGUzCGUxx0hG43Y4a9qHQvkAnU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onWarmupCompleted(@NotNull TossSecRoute tossSecRoute) {
        int i = 2 % 2;
        int i2 = access100 + 119;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(tossSecRoute, "");
            int i3 = 6 / 0;
            if (!((Boolean) this.onExtraCallbackWithResult.invoke()).booleanValue()) {
                int i4 = access000 + 37;
                access100 = i4 % 128;
                if (i4 % 2 != 0) {
                    boolean z = tossSecRoute instanceof TossSecRoute.OptionPracticeIntroVideo;
                    throw null;
                }
                if (!(tossSecRoute instanceof TossSecRoute.OptionPracticeIntroVideo) || asInterface()) {
                    IAuthTabCallback(this, tossSecRoute, null, 2, null);
                    return;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(tossSecRoute, "");
            if (!((Boolean) this.onExtraCallbackWithResult.invoke()).booleanValue()) {
            }
        }
        int i5 = access000 + 63;
        access100 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.r8lambdatXGUzCGUxx0hG43Y4a9qHQvkAnU
    public boolean onExtraCallbackWithResult() throws Throwable {
        int i = 2 % 2;
        Function0<Boolean> function0 = this.onTransact;
        if (function0 == null) {
            SessionTrackerb sessionTrackerb = this.IAuthTabCallbackDefault;
            Context context = this.onNavigationEvent;
            Object[] objArr = new Object[1];
            a(new char[]{45936, 4189, 62757, 23271, 16349, 40096, 24686, 50525, 43560, 4026, 60546, 45557, 5487, 64067, 24372, 15587}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 41770, objArr);
            boolean zOnExtraCallbackWithResult = SessionTrackerb.onExtraCallbackWithResult(sessionTrackerb, context, ((String) objArr[0]).intern(), false, null, null, false, 60, null);
            int i2 = access100 + 109;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 31 / 0;
            }
            return zOnExtraCallbackWithResult;
        }
        int i4 = access100 + 59;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        boolean zBooleanValue = ((Boolean) function0.invoke()).booleanValue();
        int i6 = access100 + 47;
        access000 = i6 % 128;
        if (i6 % 2 != 0) {
            return zBooleanValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void IAuthTabCallback(onConsentFormDismissed onconsentformdismissed, TossSecRoute tossSecRoute, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: im.toss.securities.core.router.impl.TossSecRouterNav2Impl$$ExternalSyntheticLambda7
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2) {
                    int i3 = 2 % 2;
                    int i4 = onWarmupCompleted + 53;
                    IAuthTabCallback = i4 % 128;
                    setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa = (setPopupContentSizefhxjrPA) obj2;
                    if (i4 % 2 == 0) {
                        onConsentFormDismissed.IAuthTabCallback(setpopupcontentsizefhxjrpa);
                        throw null;
                    }
                    Unit unitIAuthTabCallback = onConsentFormDismissed.IAuthTabCallback(setpopupcontentsizefhxjrpa);
                    int i5 = IAuthTabCallback + 105;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 89 / 0;
                    }
                    return unitIAuthTabCallback;
                }
            };
            int i3 = access100 + 123;
            access000 = i3 % 128;
            int i4 = i3 % 2;
        }
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        onWarmupCompleted(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -791385487, iOnNavigationEvent, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 791385490, iOnNavigationEvent2, new Object[]{onconsentformdismissed, tossSecRoute, function1});
        int i5 = access000 + 99;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onTransact(setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa) {
        int i = 2 % 2;
        int i2 = access100 + 85;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setpopupcontentsizefhxjrpa, "");
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setpopupcontentsizefhxjrpa, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = access000 + 53;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        final onConsentFormDismissed onconsentformdismissed = (onConsentFormDismissed) objArr[0];
        final TossSecRoute tossSecRoute = (TossSecRoute) objArr[1];
        final Function1 function1 = (Function1) objArr[2];
        int i = 2 % 2;
        TypographyKtExternalSyntheticLambda0.onExtraCallback(onconsentformdismissed.asBinder, tossSecRoute, PopupLayoutExternalSyntheticLambda0.onExtraCallbackWithResult(new Function1() { // from class: im.toss.securities.core.router.impl.TossSecRouterNav2Impl$$ExternalSyntheticLambda11
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 55;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = onConsentFormDismissed.onExtraCallback(function1, tossSecRoute, onconsentformdismissed, (setPopupContentSizefhxjrPA) obj);
                int i5 = onExtraCallbackWithResult + 43;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallback;
            }
        }), (PullRefreshIndicatorKtExternalSyntheticLambda3.IAuthTabCallback) null, 4, (Object) null);
        int i2 = access000 + 49;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(Function1 function1, TossSecRoute tossSecRoute, onConsentFormDismissed onconsentformdismissed, setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa) {
        int i = 2 % 2;
        int i2 = access100 + 63;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setpopupcontentsizefhxjrpa, "");
        function1.invoke(setpopupcontentsizefhxjrpa);
        Object obj = null;
        if (tossSecRoute instanceof TossSecRoute.Main) {
            int i4 = access000 + 29;
            access100 = i4 % 128;
            if (i4 % 2 != 0) {
                onconsentformdismissed.IAuthTabCallbackStub(setpopupcontentsizefhxjrpa);
                obj.hashCode();
                throw null;
            }
            onconsentformdismissed.IAuthTabCallbackStub(setpopupcontentsizefhxjrpa);
        } else if (tossSecRoute instanceof TossSecRoute.EarningCallDetail) {
            onconsentformdismissed.onWarmupCompleted(setpopupcontentsizefhxjrpa, ((TossSecRoute.EarningCallDetail) tossSecRoute).IAuthTabCallbackDefault());
            int i5 = access000 + 69;
            access100 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 / 2;
            }
        } else if (tossSecRoute instanceof TossSecRoute.EarningCallHome) {
            int i7 = access100 + 41;
            access000 = i7 % 128;
            if (i7 % 2 == 0) {
                onconsentformdismissed.onWarmupCompleted(setpopupcontentsizefhxjrpa);
                throw null;
            }
            onconsentformdismissed.onWarmupCompleted(setpopupcontentsizefhxjrpa);
        }
        return Unit.INSTANCE;
    }

    private final Uri IAuthTabCallback(Uri uri) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 13;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Uri.Builder builderBuildUpon = uri.buildUpon();
        Object[] objArr = new Object[1];
        a(new char[]{45936, 4897, 62429, 21091, 12845, 37572, 29030, 53521, 45512}, 41046 - TextUtils.lastIndexOf("", '0'), objArr);
        Uri.Builder builderAuthority = builderBuildUpon.scheme(((String) objArr[0]).intern()).authority("native-securities");
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "");
        Uri uriBuild = builderAuthority.path(CollectionsKt.joinToString$default(pathSegments, TossSecRoute.Main.PATH, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null)).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "");
        int i4 = access000 + 119;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return uriBuild;
    }

    private final boolean onNavigationEvent(ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2) {
        int i = 2 % 2;
        int i2 = access000 + 13;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        if (!ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2.Companion.onWarmupCompleted(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, Reflection.getOrCreateKotlinClass(TossSecRoute.OptionPracticeIntroVideo.class))) {
            return false;
        }
        int i4 = access100 + 7;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return asInterface();
    }

    private final boolean asInterface() {
        int i = 2 % 2;
        int i2 = access000 + 101;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = newKnownLengthSink.Companion.onWarmupCompleted(Http1ExchangeCodecAbstractSource.SEAND_4041);
        int i4 = access000 + 75;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    private final Uri onNavigationEvent(Uri uri) {
        Uri uri2;
        int i = 2 % 2;
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        String str = (String) onWarmupCompleted(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1329284785, iOnNavigationEvent, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1329284784, iOnNavigationEvent2, new Object[]{this, uri, "nextLandingUrl"});
        if (str != null) {
            int i2 = access100 + 113;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                uri2 = Uri.parse(str);
                int i3 = 9 / 0;
            } else {
                uri2 = Uri.parse(str);
            }
        } else {
            uri2 = null;
        }
        if (uri2 != null) {
            int i4 = access100 + 31;
            access000 = i4 % 128;
            if (i4 % 2 == 0) {
                uri = onNavigationEvent(uri2);
                int i5 = 76 / 0;
            } else {
                uri = onNavigationEvent(uri2);
            }
            int i6 = access100 + 53;
            access000 = i6 % 128;
            int i7 = i6 % 2;
        }
        return uri;
    }

    private static final Unit IAuthTabCallbackDefault(PullRefreshIndicatorKtExternalSyntheticLambda5 pullRefreshIndicatorKtExternalSyntheticLambda5) {
        int i = 2 % 2;
        int i2 = access100 + 67;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(pullRefreshIndicatorKtExternalSyntheticLambda5, "");
        } else {
            Intrinsics.checkNotNullParameter(pullRefreshIndicatorKtExternalSyntheticLambda5, "");
        }
        pullRefreshIndicatorKtExternalSyntheticLambda5.IAuthTabCallback(false);
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(PullRefreshIndicatorKtExternalSyntheticLambda5 pullRefreshIndicatorKtExternalSyntheticLambda5) {
        int i = 2 % 2;
        int i2 = access100 + 19;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(pullRefreshIndicatorKtExternalSyntheticLambda5, "");
        pullRefreshIndicatorKtExternalSyntheticLambda5.IAuthTabCallback(false);
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 19;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(PullRefreshIndicatorKtExternalSyntheticLambda5 pullRefreshIndicatorKtExternalSyntheticLambda5) {
        int i = 2 % 2;
        int i2 = access000 + 47;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(pullRefreshIndicatorKtExternalSyntheticLambda5, "");
        pullRefreshIndicatorKtExternalSyntheticLambda5.IAuthTabCallback(false);
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 17;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private final void onWarmupCompleted(setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa) {
        ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2OnWarmupCompleted;
        int i = 2 % 2;
        int i2 = access100 + 37;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0IAuthTabCallbackStubProxy = this.asBinder.IAuthTabCallbackStubProxy();
        if (twoLineExternalSyntheticLambda0IAuthTabCallbackStubProxy != null && (exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2OnWarmupCompleted = twoLineExternalSyntheticLambda0IAuthTabCallbackStubProxy.onWarmupCompleted()) != null) {
            int i4 = access100 + 75;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            if (ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2.Companion.onWarmupCompleted(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2OnWarmupCompleted, Reflection.getOrCreateKotlinClass(TossSecRoute.EarningCallHome.class))) {
                setpopupcontentsizefhxjrpa.IAuthTabCallback(TossSecRoute.EarningCallHome.INSTANCE, new Function1() { // from class: im.toss.securities.core.router.impl.TossSecRouterNav2Impl$$ExternalSyntheticLambda9
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = onExtraCallbackWithResult + 51;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unitOnWarmupCompleted = onConsentFormDismissed.onWarmupCompleted((PullRefreshIndicatorKtExternalSyntheticLambda5) obj);
                        if (i8 == 0) {
                            int i9 = 54 / 0;
                        }
                        int i10 = onExtraCallback + 87;
                        onExtraCallbackWithResult = i10 % 128;
                        if (i10 % 2 == 0) {
                            return unitOnWarmupCompleted;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                });
                setpopupcontentsizefhxjrpa.IAuthTabCallback(true);
            }
        }
        int i6 = access000 + 53;
        access100 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // o.r8lambdatXGUzCGUxx0hG43Y4a9qHQvkAnU
    public boolean onExtraCallbackWithResult(@NotNull Uri uri) throws Throwable {
        Object next;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        Uri uriIAuthTabCallback = IAuthTabCallback(onNavigationEvent(uri));
        Iterator it = this.asBinder.asBinder().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i2 = access000 + 17;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            next = it.next();
            if (((ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2) next).onExtraCallbackWithResult(uriIAuthTabCallback)) {
                break;
            }
        }
        ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 = (ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2) next;
        int i4 = access000;
        if (exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 == null) {
            int i5 = i4 + 35;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        int i7 = i4 + 93;
        access100 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 12 / 0;
        }
        return false;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        onConsentFormDismissed onconsentformdismissed = (onConsentFormDismissed) objArr[0];
        Uri uri = (Uri) objArr[1];
        int i = 2 % 2;
        try {
            return uri.getQueryParameter((String) objArr[2]);
        } catch (Exception e) {
            if (!(e instanceof UnsupportedOperationException)) {
                return null;
            }
            if (onconsentformdismissed.onWarmupCompleted.RemoteActionCompatParcelizer()) {
                Toast.makeText(onconsentformdismissed.onNavigationEvent, e.getMessage() + " uri: " + uri, 0).show();
                int i2 = access000 + 3;
                access100 = i2 % 128;
                int i3 = i2 % 2;
            }
            Object[] objArr2 = new Object[1];
            a(new char[]{45942, 20458, 19036}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 64666, objArr2);
            AFd1mSDK.onExtraCallbackWithResult("Try to get a query parameter from Non-hierarchical uri", (Throwable) null, access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), uri)), false, (Function1) null, 26, (Object) null);
            int i4 = access000 + 43;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009f A[PHI: r5
      0x009f: PHI (r5v14 java.lang.String) = (r5v13 java.lang.String), (r5v21 java.lang.String) binds: [B:20:0x009d, B:17:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        String str;
        onConsentFormDismissed onconsentformdismissed = (onConsentFormDismissed) objArr[0];
        Uri uri = (Uri) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 73;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        String str2 = TossSecRoute.Main.PATH + StringsKt.removePrefix(path, TossSecRoute.Main.PATH);
        List<String> listOnExtraCallbackWithResult = TossSecRoute.EarningCallDetail.Companion.onExtraCallbackWithResult();
        if (listOnExtraCallbackWithResult instanceof Collection) {
            int i4 = access000 + 93;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            if (!listOnExtraCallbackWithResult.isEmpty()) {
                Iterator<T> it = listOnExtraCallbackWithResult.iterator();
                int i6 = access100 + 61;
                access000 = i6 % 128;
                int i7 = i6 % 2;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (StringsKt.startsWith$default(str2, (String) it.next(), false, 2, (Object) null)) {
                        int i8 = access000 + 115;
                        access100 = i8 % 128;
                        if (i8 % 2 != 0) {
                            List<String> pathSegments = uri.getPathSegments();
                            Intrinsics.checkNotNullExpressionValue(pathSegments, "");
                            str = (String) CollectionsKt.lastOrNull(pathSegments);
                            int i9 = 84 / 0;
                            if (str != null) {
                                Long longOrNull = StringsKt.toLongOrNull(str);
                                if (longOrNull != null) {
                                    int i10 = access100 + 23;
                                    access000 = i10 % 128;
                                    if (i10 % 2 == 0) {
                                        String.valueOf(longOrNull.longValue());
                                        throw null;
                                    }
                                    String strValueOf = String.valueOf(longOrNull.longValue());
                                    if (strValueOf != null) {
                                        return new TossSecRoute.EarningCallDetail(strValueOf, (String) onWarmupCompleted(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1329284785, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1329284784, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{onconsentformdismissed, uri, TossSecRoute.EarningCallDetail.PARAM_PRODUCT_CODE}), (String) onWarmupCompleted(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1329284785, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1329284784, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{onconsentformdismissed, uri, "beforeEntryId"}), false, (String) null, 24, (DefaultConstructorMarker) null);
                                    }
                                }
                            }
                            Object[] objArr2 = new Object[1];
                            a(new char[]{45942, 20458, 19036}, ((byte) KeyEvent.getModifierMetaStateMask()) + 64668, objArr2);
                            AFd1mSDK.onExtraCallbackWithResult("Failed to parse eventId from uri", (Throwable) null, access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), uri.toString())), false, (Function1) null, 26, (Object) null);
                        } else {
                            List<String> pathSegments2 = uri.getPathSegments();
                            Intrinsics.checkNotNullExpressionValue(pathSegments2, "");
                            str = (String) CollectionsKt.lastOrNull(pathSegments2);
                            if (str != null) {
                            }
                            Object[] objArr22 = new Object[1];
                            a(new char[]{45942, 20458, 19036}, ((byte) KeyEvent.getModifierMetaStateMask()) + 64668, objArr22);
                            AFd1mSDK.onExtraCallbackWithResult("Failed to parse eventId from uri", (Throwable) null, access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr22[0]).intern(), uri.toString())), false, (Function1) null, 26, (Object) null);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    private final boolean onExtraCallback(Uri uri) {
        int i = 2 % 2;
        int i2 = access100 + 107;
        access000 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            r8lambdakSJKa4RMkEAGCUl5MvtfoJNzSuU.onExtraCallback.IAuthTabCallback(uri);
            throw null;
        }
        boolean zIAuthTabCallback = r8lambdakSJKa4RMkEAGCUl5MvtfoJNzSuU.onExtraCallback.IAuthTabCallback(uri);
        int i3 = access100 + 103;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            return zIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallbackStub(setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa) {
        int i = 2 % 2;
        setpopupcontentsizefhxjrpa.IAuthTabCallback(true);
        setpopupcontentsizefhxjrpa.onNavigationEvent(Reflection.getOrCreateKotlinClass(TossSecRoute.Main.class), new Function1() { // from class: im.toss.securities.core.router.impl.TossSecRouterNav2Impl$$ExternalSyntheticLambda8
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 21;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = onConsentFormDismissed.onExtraCallbackWithResult((PullRefreshIndicatorKtExternalSyntheticLambda5) obj);
                int i5 = onWarmupCompleted + 37;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnExtraCallbackWithResult;
                }
                throw null;
            }
        });
        int i2 = access100 + 15;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onWarmupCompleted(setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa, boolean z) {
        int i = 2 % 2;
        int i2 = access000 + 55;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        if (z) {
            setpopupcontentsizefhxjrpa.IAuthTabCallback(true);
            setpopupcontentsizefhxjrpa.onNavigationEvent(Reflection.getOrCreateKotlinClass(TossSecRoute.EarningCallDetail.class), new Function1() { // from class: im.toss.securities.core.router.impl.TossSecRouterNav2Impl$$ExternalSyntheticLambda4
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj) {
                    int i4 = 2 % 2;
                    int i5 = IAuthTabCallback + 89;
                    onNavigationEvent = i5 % 128;
                    PullRefreshIndicatorKtExternalSyntheticLambda5 pullRefreshIndicatorKtExternalSyntheticLambda5 = (PullRefreshIndicatorKtExternalSyntheticLambda5) obj;
                    if (i5 % 2 == 0) {
                        return onConsentFormDismissed.onNavigationEvent(pullRefreshIndicatorKtExternalSyntheticLambda5);
                    }
                    onConsentFormDismissed.onNavigationEvent(pullRefreshIndicatorKtExternalSyntheticLambda5);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            });
            int i4 = access000 + 73;
            access100 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa) {
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        return (Unit) onWarmupCompleted(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 126803291, iOnNavigationEvent, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -126803289, iOnNavigationEvent2, new Object[]{setpopupcontentsizefhxjrpa});
    }

    public static /* synthetic */ Unit IAuthTabCallback(PullRefreshIndicatorKtExternalSyntheticLambda5 pullRefreshIndicatorKtExternalSyntheticLambda5) {
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        return (Unit) onWarmupCompleted(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1786535942, iOnNavigationEvent, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1786535937, iOnNavigationEvent2, new Object[]{pullRefreshIndicatorKtExternalSyntheticLambda5});
    }

    private final String onWarmupCompleted(Uri uri, String str) {
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        return (String) onWarmupCompleted(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1329284785, iOnNavigationEvent, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1329284784, iOnNavigationEvent2, new Object[]{this, uri, str});
    }

    private final boolean onExtraCallbackWithResult(Uri uri, Function1<? super setPopupContentSizefhxjrPA, Unit> function1) {
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        return ((Boolean) onWarmupCompleted(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 959805933, iOnNavigationEvent, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -959805927, iOnNavigationEvent2, new Object[]{this, uri, function1})).booleanValue();
    }

    private static final Unit onNavigationEvent(Function1 function1, onConsentFormDismissed onconsentformdismissed, boolean z, setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa) {
        Object[] objArr = {function1, onconsentformdismissed, Boolean.valueOf(z), setpopupcontentsizefhxjrpa};
        return (Unit) onWarmupCompleted(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1102076017, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1102076010, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), objArr);
    }

    private final void IAuthTabCallback(TossSecRoute tossSecRoute, Function1<? super setPopupContentSizefhxjrPA, Unit> function1) {
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        onWarmupCompleted(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -791385487, iOnNavigationEvent, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 791385490, iOnNavigationEvent2, new Object[]{this, tossSecRoute, function1});
    }

    private final void asBinder() {
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        onWarmupCompleted(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 2111314194, iOnNavigationEvent, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -2111314190, iOnNavigationEvent2, new Object[]{this});
    }

    private final TossSecRoute.EarningCallDetail onWarmupCompleted(Uri uri) {
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        return (TossSecRoute.EarningCallDetail) onWarmupCompleted(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 2003008789, iOnNavigationEvent, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -2003008789, iOnNavigationEvent2, new Object[]{this, uri});
    }

    static void onWarmupCompleted() {
        asInterface = 8660008411167274548L;
    }
}
