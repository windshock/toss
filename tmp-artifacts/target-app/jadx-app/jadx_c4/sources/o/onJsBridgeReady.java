package o;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.tmoney.LiveCheckConstants;
import im.toss.activitydelegate.DelegateActivity;
import im.toss.base.BaseActivity;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import im.toss.tosssecurities.singlepage.earning_call.EarningCallComposeView$;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.IEngagementSignalsCallbackDefault;
import o.onJsBridgeReady;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class onJsBridgeReady {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ Unit IAuthTabCallback(DelegateActivity delegateActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStubProxy(delegateActivity);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(delegateActivity);
        int i3 = onNavigationEvent + 65;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallbackStubProxy;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(DelegateActivity delegateActivity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(delegateActivity, bundle);
        if (i3 != 0) {
            int i4 = 25 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        DelegateActivity delegateActivity = (DelegateActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback_Parcel(delegateActivity);
            throw null;
        }
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(delegateActivity);
        int i3 = onNavigationEvent + 103;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback_Parcel;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(DelegateActivity delegateActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onMessageChannelReady(delegateActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnMessageChannelReady = onMessageChannelReady(delegateActivity);
        int i3 = onNavigationEvent + 89;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnMessageChannelReady;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        DelegateActivity delegateActivity = (DelegateActivity) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(delegateActivity, bundle);
        int i4 = IAuthTabCallback + 117;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit asBinder(DelegateActivity delegateActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitWriteTypedObject = writeTypedObject(delegateActivity);
        int i4 = onNavigationEvent + 31;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return unitWriteTypedObject;
    }

    public static /* synthetic */ Unit asInterface(DelegateActivity delegateActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
            return (Unit) onWarmupCompleted(2094630198, new Object[]{delegateActivity}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -2094630192, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent);
        }
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean extraCallback(DelegateActivity delegateActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(delegateActivity, "");
        int i4 = IAuthTabCallback + 17;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor(DelegateActivity delegateActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return extraCallbackWithResult(delegateActivity);
        }
        extraCallbackWithResult(delegateActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, getVisibilityChangeInfo getvisibilitychangeinfo, DelegateActivity delegateActivity, Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(function1, getvisibilitychangeinfo, delegateActivity, bundle);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(function1, getvisibilitychangeinfo, delegateActivity, bundle);
        int i3 = IAuthTabCallback + 89;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ boolean onExtraCallback(DelegateActivity delegateActivity) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
            ((Boolean) onWarmupCompleted(2002776980, new Object[]{delegateActivity}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -2002776975, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent)).booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        boolean zBooleanValue = ((Boolean) onWarmupCompleted(2002776980, new Object[]{delegateActivity}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -2002776975, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent2)).booleanValue();
        int i3 = IAuthTabCallback + 11;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 38 / 0;
        }
        return zBooleanValue;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(DelegateActivity delegateActivity, int i, String[] strArr, int[] iArr) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 31;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return IAuthTabCallback(delegateActivity, i, strArr, iArr);
        }
        IAuthTabCallback(delegateActivity, i, strArr, iArr);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Context context, String str, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 93;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback(context, str, i);
        if (i4 == 0) {
            throw null;
        }
        int i5 = onNavigationEvent + 33;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 60 / 0;
        }
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(DelegateActivity delegateActivity) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zExtraCallback = extraCallback(delegateActivity);
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        int i5 = IAuthTabCallback + 103;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return zExtraCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        DelegateActivity delegateActivity = (DelegateActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnPostMessage = onPostMessage(delegateActivity);
        int i4 = IAuthTabCallback + 119;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnPostMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(DelegateActivity delegateActivity) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        Unit unit = (Unit) onWarmupCompleted(451704396, new Object[]{delegateActivity}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -451704385, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent);
        int i4 = IAuthTabCallback + 55;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(DelegateActivity delegateActivity, int i, String[] strArr, int[] iArr) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 95;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(delegateActivity, i, strArr, iArr);
        int i5 = IAuthTabCallback + 41;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(DelegateActivity delegateActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(delegateActivity, iEngagementSignalsCallbackDefault);
        int i4 = IAuthTabCallback + 19;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        getVisibilityChangeInfo getvisibilitychangeinfo = (getVisibilityChangeInfo) objArr[1];
        DelegateActivity delegateActivity = (DelegateActivity) objArr[2];
        Bundle bundle = (Bundle) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        Unit unit = (Unit) onWarmupCompleted(-919679728, new Object[]{getbacktracenote, getvisibilitychangeinfo, delegateActivity, bundle}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 919679732, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent);
        int i4 = IAuthTabCallback + 33;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i;
        int i9 = ~i6;
        int i10 = (~(i7 | i8 | i9)) | (~(i3 | i));
        int i11 = ~(i6 | i);
        int i12 = i10 | i11;
        int i13 = ~(i7 | i);
        int i14 = i11 | i7 | (~(i8 | i9));
        int i15 = i3 + i + i5 + (1349231875 * i2) + (1735201104 * i4);
        int i16 = i15 * i15;
        int i17 = ((-413510627) * i3) + 1558183936 + (237349861 * i) + (i12 * 325430244) + (325430244 * i13) + ((-325430244) * i14) + ((-88080384) * i5) + ((-1337982976) * i2) + (469762048 * i4) + (1272971264 * i16);
        int i18 = ((i3 * 236314795) - 374860141) + (i * 236313123) + (i12 * (-836)) + (i13 * (-836)) + (i14 * 836) + (i5 * 236313959) + (i2 * (-66979019)) + (i4 * (-1872492752)) + (i16 * (-417333248));
        switch (i17 + (i18 * i18 * 639631360)) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                final getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
                getVisibilityChangeInfo getvisibilitychangeinfo = (getVisibilityChangeInfo) objArr[1];
                final DelegateActivity delegateActivity = (DelegateActivity) objArr[2];
                Bundle bundle = (Bundle) objArr[3];
                int i19 = 2 % 2;
                int i20 = IAuthTabCallback + 93;
                onNavigationEvent = i20 % 128;
                int i21 = i20 % 2;
                Intrinsics.checkNotNullParameter(delegateActivity, "");
                if (getbacktracenote != null) {
                    requestPostMessageChannelWithExtras.onExtraCallback(delegateActivity, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-328646942, true, new Function2() { // from class: im.toss.extensions.ContextsKt$$ExternalSyntheticLambda1
                        private static int onExtraCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj, Object obj2) {
                            Unit unitOnWarmupCompleted;
                            int i22 = 2 % 2;
                            int i23 = onExtraCallback + 21;
                            onWarmupCompleted = i23 % 128;
                            if (i23 % 2 != 0) {
                                unitOnWarmupCompleted = onJsBridgeReady.onWarmupCompleted(getbacktracenote, delegateActivity, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                int i24 = 64 / 0;
                            } else {
                                unitOnWarmupCompleted = onJsBridgeReady.onWarmupCompleted(getbacktracenote, delegateActivity, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            }
                            int i25 = onExtraCallback + 79;
                            onWarmupCompleted = i25 % 128;
                            if (i25 % 2 != 0) {
                                int i26 = 52 / 0;
                            }
                            return unitOnWarmupCompleted;
                        }
                    })), 1, (Object) null);
                }
                getvisibilitychangeinfo.onExtraCallbackWithResult().invoke(delegateActivity, bundle);
                Unit unit = Unit.INSTANCE;
                int i22 = onNavigationEvent + 7;
                IAuthTabCallback = i22 % 128;
                int i23 = i22 % 2;
                return unit;
            case 5:
                DelegateActivity delegateActivity2 = (DelegateActivity) objArr[0];
                int i24 = 2 % 2;
                int i25 = IAuthTabCallback + 47;
                onNavigationEvent = i25 % 128;
                int i26 = i25 % 2;
                Intrinsics.checkNotNullParameter(delegateActivity2, "");
                int i27 = IAuthTabCallback + 89;
                onNavigationEvent = i27 % 128;
                int i28 = i27 % 2;
                return false;
            case 6:
                return IAuthTabCallback(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                return asInterface(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return asBinder(objArr);
            case 10:
                return onTransact(objArr);
            case 11:
                return IAuthTabCallbackStub(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        DelegateActivity delegateActivity = (DelegateActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            readTypedObject(delegateActivity);
            throw null;
        }
        Unit typedObject = readTypedObject(delegateActivity);
        int i3 = onNavigationEvent + 75;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return typedObject;
    }

    public static /* synthetic */ Unit onWarmupCompleted(DelegateActivity delegateActivity) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onMinimized(delegateActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnMinimized = onMinimized(delegateActivity);
        int i3 = IAuthTabCallback + 47;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnMinimized;
    }

    public static /* synthetic */ Unit onWarmupCompleted(DelegateActivity delegateActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(delegateActivity, iEngagementSignalsCallbackDefault);
        int i4 = IAuthTabCallback + 97;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getBacktraceNote getbacktracenote, DelegateActivity delegateActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 123;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {getbacktracenote, delegateActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        Unit unit = (Unit) onWarmupCompleted(-312427141, objArr, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 312427149, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent);
        int i5 = onNavigationEvent + 89;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static final void onWarmupCompleted(@NotNull String str, @NotNull Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        onNavigationEvent(context, str, 0, 2, null);
        int i4 = onNavigationEvent + 89;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onNavigationEvent(Context context, String str, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 5;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        int i6 = i4 % 2;
        if ((i2 & 2) != 0) {
            int i7 = i5 + 97;
            IAuthTabCallback = i7 % 128;
            i = i7 % 2 == 0 ? 1 : 0;
            int i8 = i5 + 29;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
        }
        onNavigationEvent(context, str, i);
    }

    public static final void onNavigationEvent(@NotNull final Context context, @Nullable final String str, final int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        if (str != null) {
            int i3 = onNavigationEvent + 1;
            IAuthTabCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                StringsKt.isBlank(str);
                obj.hashCode();
                throw null;
            }
            if (StringsKt.isBlank(str)) {
                return;
            }
            if (!Intrinsics.areEqual(Thread.currentThread(), Looper.getMainLooper().getThread())) {
                Intrinsics.checkNotNull(NetConverter3.onExtraCallback().onExtraCallback(new Runnable() { // from class: im.toss.extensions.ContextsKt$$ExternalSyntheticLambda2
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i4 = 2 % 2;
                        int i5 = onWarmupCompleted + 115;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                        onJsBridgeReady.onExtraCallbackWithResult(context, str, i);
                        int i7 = onExtraCallback + 73;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                    }
                }));
                return;
            }
            int i4 = onNavigationEvent + 53;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            Toast.makeText(context.getApplicationContext(), str, i).show();
            int i6 = onNavigationEvent + 71;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    private static final void IAuthTabCallback(Context context, String str, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 69;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Toast.makeText(context.getApplicationContext(), str, i).show();
        int i5 = IAuthTabCallback + 33;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(Context context, int i, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 93;
        int i6 = i5 % 128;
        onNavigationEvent = i6;
        int i7 = i5 % 2;
        if ((i3 & 2) != 0) {
            int i8 = i6 + 79;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            i2 = 0;
        }
        onWarmupCompleted(context, i, i2);
        int i10 = onNavigationEvent + 29;
        IAuthTabCallback = i10 % 128;
        if (i10 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final void onWarmupCompleted(@NotNull Context context, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 59;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            onNavigationEvent(context, context.getString(i), i2);
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            onNavigationEvent(context, context.getString(i), i2);
            int i5 = 56 / 0;
        }
    }

    public static /* synthetic */ void onExtraCallback(Context context, Throwable th, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 2) != 0) {
            int i4 = onNavigationEvent + 33;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            i = 0;
        }
        IAuthTabCallback(context, th, i);
        int i6 = onNavigationEvent + 121;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@NotNull Context context, @NotNull Throwable th, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 95;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(th, "");
            if (!zzcy.onNavigationEvent(th, 0, 0, (Object) null)) {
                Throwable cause = th.getCause();
                if (cause == null || !zzcy.onNavigationEvent(cause, 0, 1, (Object) null)) {
                    if (!(th instanceof TossApiCallException.ApiError)) {
                        onWarmupCompleted(context, R.string.network_error, i);
                        return;
                    }
                    String message = th.getMessage();
                    if (message == null) {
                        int i4 = onNavigationEvent + 111;
                        IAuthTabCallback = i4 % 128;
                        if (i4 % 2 == 0) {
                            Intrinsics.checkNotNullExpressionValue(context.getString(R.string.network_error), "");
                            throw null;
                        }
                        message = context.getString(R.string.network_error);
                        Intrinsics.checkNotNullExpressionValue(message, "");
                    }
                    onNavigationEvent(context, message, 0, 2, null);
                    return;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(th, "");
            if (!zzcy.onNavigationEvent(th, 0, 1, (Object) null)) {
            }
        }
        onWarmupCompleted(context, R.string.network_error, i);
    }

    public static final void onExtraCallbackWithResult(@NotNull Context context, @Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        onNavigationEvent(context, str, 1);
        int i4 = IAuthTabCallback + 107;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final BaseActivity onWarmupCompleted(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            boolean z = hasVaryAll.IAuthTabCallback(context) instanceof BaseActivity;
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Object objIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
        if (objIAuthTabCallback instanceof BaseActivity) {
            return (BaseActivity) objIAuthTabCallback;
        }
        int i3 = IAuthTabCallback + 15;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static final View onWarmupCompleted(@NotNull Context context, int i, @Nullable ViewGroup viewGroup, boolean z) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 17;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            View viewInflate = LayoutInflater.from(context).inflate(i, viewGroup, z);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return viewInflate;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullExpressionValue(LayoutInflater.from(context).inflate(i, viewGroup, z), "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final float onNavigationEvent(@NotNull Context context, int i) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 25;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        float dimension = context.getResources().getDimension(i);
        int i5 = onNavigationEvent + 35;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return dimension;
    }

    public static final void onExtraCallback(@NotNull Context context, @NotNull final getVisibilityChangeInfo getvisibilitychangeinfo, @Nullable Integer num, boolean z, @Nullable final Function1<? super DelegateActivity, ? extends View> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(getvisibilitychangeinfo, "");
        DelegateActivity.onNavigationEvent onnavigationevent = DelegateActivity.Companion;
        Object[] objArr = {getvisibilitychangeinfo, new Function2() { // from class: im.toss.extensions.ContextsKt$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj, Object obj2) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 97;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Function1 function12 = function1;
                if (i4 != 0) {
                    return onJsBridgeReady.onExtraCallback(function12, getvisibilitychangeinfo, (DelegateActivity) obj, (Bundle) obj2);
                }
                Unit unitOnExtraCallback = onJsBridgeReady.onExtraCallback(function12, getvisibilitychangeinfo, (DelegateActivity) obj, (Bundle) obj2);
                int i5 = 15 / 0;
                return unitOnExtraCallback;
            }
        }, null, null, null, null, null, null, null, null, 510, null};
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onnavigationevent.onExtraCallback(context, num, z, (getVisibilityChangeInfo) getVisibilityChangeInfo.onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 969013689, objArr, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -969013685));
        int i2 = IAuthTabCallback + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit IAuthTabCallback(Function1 function1, getVisibilityChangeInfo getvisibilitychangeinfo, DelegateActivity delegateActivity, Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(delegateActivity, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(delegateActivity, "");
        if (function1 != null) {
            delegateActivity.setContentView((View) function1.invoke(delegateActivity));
            int i3 = onNavigationEvent + 87;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        getvisibilitychangeinfo.onExtraCallbackWithResult().invoke(delegateActivity, bundle);
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 9;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static final void onWarmupCompleted(@NotNull Context context, @NotNull final getVisibilityChangeInfo getvisibilitychangeinfo, @Nullable Integer num, boolean z, @Nullable final getBacktraceNote<? super DelegateActivity, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(getvisibilitychangeinfo, "");
        DelegateActivity.onNavigationEvent onnavigationevent = DelegateActivity.Companion;
        Object[] objArr = {getvisibilitychangeinfo, new Function2() { // from class: im.toss.extensions.ContextsKt$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 33;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    Object[] objArr2 = {getbacktracenote, getvisibilitychangeinfo, (DelegateActivity) obj, (Bundle) obj2};
                    int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                Object[] objArr3 = {getbacktracenote, getvisibilitychangeinfo, (DelegateActivity) obj, (Bundle) obj2};
                int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
                Unit unit = (Unit) onJsBridgeReady.onWarmupCompleted(2045419052, objArr3, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -2045419042, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent2);
                int i4 = onExtraCallback + 67;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 88 / 0;
                }
                return unit;
            }
        }, null, null, null, null, null, null, null, null, 510, null};
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onnavigationevent.onExtraCallback(context, num, z, (getVisibilityChangeInfo) getVisibilityChangeInfo.onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 969013689, objArr, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -969013685));
        int i2 = IAuthTabCallback + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asInterface(Object[] objArr) {
        boolean z;
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        DelegateActivity delegateActivity = (DelegateActivity) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        if ((iIntValue & 3) != 2) {
            int i2 = onNavigationEvent + 23;
            IAuthTabCallback = i2 % 128;
            z = i2 % 2 != 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-328646942, iIntValue, -1, "im.toss.extensions.startComposableDelegateActivity.<anonymous>.<anonymous> (Contexts.kt:148)");
            }
            getbacktracenote.invoke(delegateActivity, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onNavigationEvent + 97;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 63;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Context context, Function2 function2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function2 function22, setTaggedAddrCtrl settaggedaddrctrl, Function1 function16, int i, boolean z, Function1 function17, int i2, Object obj) {
        Function1 function18;
        int i3;
        Function1 function19;
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 11;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Function2 function23 = (i2 & 1) != 0 ? new Function2() { // from class: im.toss.extensions.ContextsKt$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj2, Object obj3) {
                int i7 = 2 % 2;
                int i8 = IAuthTabCallback + 77;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                Unit unitIAuthTabCallback = onJsBridgeReady.IAuthTabCallback((DelegateActivity) obj2, (Bundle) obj3);
                if (i9 != 0) {
                    int i10 = 10 / 0;
                }
                int i11 = onExtraCallback + 59;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    return unitIAuthTabCallback;
                }
                throw null;
            }
        } : function2;
        Function1 function110 = (i2 & 2) != 0 ? new Function1() { // from class: im.toss.extensions.ContextsKt$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj2) {
                int i7 = 2 % 2;
                int i8 = onExtraCallback + 119;
                IAuthTabCallback = i8 % 128;
                DelegateActivity delegateActivity = (DelegateActivity) obj2;
                if (i8 % 2 == 0) {
                    return onJsBridgeReady.getInterfaceDescriptor(delegateActivity);
                }
                onJsBridgeReady.getInterfaceDescriptor(delegateActivity);
                throw null;
            }
        } : function1;
        if ((i2 & 4) != 0) {
            function18 = new Function1() { // from class: im.toss.extensions.ContextsKt$$ExternalSyntheticLambda6
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2) {
                    int i7 = 2 % 2;
                    int i8 = IAuthTabCallback + 79;
                    onWarmupCompleted = i8 % 128;
                    DelegateActivity delegateActivity = (DelegateActivity) obj2;
                    if (i8 % 2 != 0) {
                        onJsBridgeReady.asBinder(delegateActivity);
                        throw null;
                    }
                    Unit unitAsBinder = onJsBridgeReady.asBinder(delegateActivity);
                    int i9 = IAuthTabCallback + 103;
                    onWarmupCompleted = i9 % 128;
                    if (i9 % 2 == 0) {
                        return unitAsBinder;
                    }
                    throw null;
                }
            };
            int i7 = IAuthTabCallback + 83;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
        } else {
            function18 = function12;
        }
        Function1 function111 = (i2 & 8) != 0 ? new Function1() { // from class: im.toss.extensions.ContextsKt$$ExternalSyntheticLambda7
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj2) {
                int i9 = 2 % 2;
                int i10 = onExtraCallback + 33;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
                Unit unit = (Unit) onJsBridgeReady.onWarmupCompleted(1888364944, new Object[]{(DelegateActivity) obj2}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -1888364942, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent);
                int i12 = onExtraCallback + 11;
                onExtraCallbackWithResult = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 71 / 0;
                }
                return unit;
            }
        } : function13;
        Function1 function112 = (i2 & 16) != 0 ? new Function1() { // from class: im.toss.extensions.ContextsKt$$ExternalSyntheticLambda8
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj2) {
                int i9 = 2 % 2;
                int i10 = onNavigationEvent + 27;
                onExtraCallbackWithResult = i10 % 128;
                DelegateActivity delegateActivity = (DelegateActivity) obj2;
                if (i10 % 2 == 0) {
                    onJsBridgeReady.onWarmupCompleted(delegateActivity);
                    throw null;
                }
                Unit unitOnWarmupCompleted = onJsBridgeReady.onWarmupCompleted(delegateActivity);
                int i11 = onExtraCallbackWithResult + 43;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                return unitOnWarmupCompleted;
            }
        } : function14;
        Function1 function113 = (i2 & 32) != 0 ? new Function1() { // from class: im.toss.extensions.ContextsKt$$ExternalSyntheticLambda9
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj2) {
                int i9 = 2 % 2;
                int i10 = onExtraCallbackWithResult + 61;
                onExtraCallback = i10 % 128;
                DelegateActivity delegateActivity = (DelegateActivity) obj2;
                if (i10 % 2 != 0) {
                    return onJsBridgeReady.IAuthTabCallbackStub(delegateActivity);
                }
                onJsBridgeReady.IAuthTabCallbackStub(delegateActivity);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        } : function15;
        Function2 function24 = (i2 & 64) != 0 ? new Function2() { // from class: im.toss.extensions.ContextsKt$$ExternalSyntheticLambda10
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj2, Object obj3) {
                int i9 = 2 % 2;
                int i10 = IAuthTabCallback + 3;
                onWarmupCompleted = i10 % 128;
                DelegateActivity delegateActivity = (DelegateActivity) obj2;
                IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) obj3;
                if (i10 % 2 != 0) {
                    return onJsBridgeReady.onNavigationEvent(delegateActivity, iEngagementSignalsCallbackDefault);
                }
                onJsBridgeReady.onNavigationEvent(delegateActivity, iEngagementSignalsCallbackDefault);
                throw null;
            }
        } : function22;
        setTaggedAddrCtrl settaggedaddrctrl2 = (i2 & 128) != 0 ? new setTaggedAddrCtrl() { // from class: im.toss.extensions.ContextsKt$$ExternalSyntheticLambda11
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                int i9 = 2 % 2;
                int i10 = onExtraCallback + 37;
                onNavigationEvent = i10 % 128;
                DelegateActivity delegateActivity = (DelegateActivity) obj2;
                Integer num = (Integer) obj3;
                if (i10 % 2 != 0) {
                    onJsBridgeReady.onExtraCallbackWithResult(delegateActivity, num.intValue(), (String[]) obj4, (int[]) obj5);
                    Object obj6 = null;
                    obj6.hashCode();
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = onJsBridgeReady.onExtraCallbackWithResult(delegateActivity, num.intValue(), (String[]) obj4, (int[]) obj5);
                int i11 = onExtraCallback + 71;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                return unitOnExtraCallbackWithResult;
            }
        } : settaggedaddrctrl;
        Function1 function114 = (i2 & 256) != 0 ? new Function1() { // from class: im.toss.extensions.ContextsKt$$ExternalSyntheticLambda12
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj2) {
                int i9 = 2 % 2;
                int i10 = onExtraCallback + 37;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                Boolean boolValueOf = Boolean.valueOf(onJsBridgeReady.onExtraCallback((DelegateActivity) obj2));
                int i12 = onWarmupCompleted + 17;
                onExtraCallback = i12 % 128;
                int i13 = i12 % 2;
                return boolValueOf;
            }
        } : function16;
        boolean z2 = false;
        if ((i2 & 512) != 0) {
            int i9 = onNavigationEvent + 53;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 1024) != 0) {
            int i11 = onNavigationEvent + 77;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
        } else {
            z2 = z;
        }
        if ((i2 & 2048) != 0) {
            int i13 = IAuthTabCallback + 33;
            onNavigationEvent = i13 % 128;
            int i14 = i13 % 2;
            function19 = null;
        } else {
            function19 = function17;
        }
        onExtraCallback(context, function23, function110, function18, function111, function112, function113, function24, settaggedaddrctrl2, function114, i3, z2, function19);
    }

    private static final Unit onExtraCallbackWithResult(DelegateActivity delegateActivity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(delegateActivity, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(delegateActivity, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit extraCallbackWithResult(DelegateActivity delegateActivity) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(delegateActivity, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(delegateActivity, "");
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit writeTypedObject(DelegateActivity delegateActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(delegateActivity, "");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 99;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onPostMessage(DelegateActivity delegateActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(delegateActivity, "");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 81;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
        return unit;
    }

    private static final Unit onMinimized(DelegateActivity delegateActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(delegateActivity, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 29;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onMessageChannelReady(DelegateActivity delegateActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(delegateActivity, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(delegateActivity, "");
        int i3 = 15 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(DelegateActivity delegateActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(delegateActivity, "");
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(delegateActivity, "");
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 49;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(DelegateActivity delegateActivity, int i, String[] strArr, int[] iArr) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 21;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(delegateActivity, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallback + 115;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void onExtraCallback(@NotNull Context context, @NotNull Function2<? super DelegateActivity, ? super Bundle, Unit> function2, @NotNull Function1<? super DelegateActivity, Unit> function1, @NotNull Function1<? super DelegateActivity, Unit> function12, @NotNull Function1<? super DelegateActivity, Unit> function13, @NotNull Function1<? super DelegateActivity, Unit> function14, @NotNull Function1<? super DelegateActivity, Unit> function15, @NotNull Function2<? super DelegateActivity, ? super IEngagementSignalsCallbackDefault, Unit> function22, @NotNull setTaggedAddrCtrl<? super DelegateActivity, ? super Integer, ? super String[], ? super int[], Unit> settaggedaddrctrl, @NotNull Function1<? super DelegateActivity, Boolean> function16, int i, boolean z, @Nullable Function1<? super DelegateActivity, ? extends View> function17) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(function14, "");
        Intrinsics.checkNotNullParameter(function15, "");
        Intrinsics.checkNotNullParameter(function22, "");
        Intrinsics.checkNotNullParameter(settaggedaddrctrl, "");
        Intrinsics.checkNotNullParameter(function16, "");
        onExtraCallback(context, new getVisibilityChangeInfo(function2, function1, function12, function13, function14, function15, function22, settaggedaddrctrl, function16), Integer.valueOf(i), z, function17);
        int i3 = IAuthTabCallback + 117;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(Context context, Function2 function2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function2 function22, setTaggedAddrCtrl settaggedaddrctrl, Function1 function16, int i, boolean z, getBacktraceNote getbacktracenote, int i2, Object obj) {
        Function2 function23;
        Function1 function17;
        getBacktraceNote getbacktracenote2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 11;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0 && (i2 & 1) != 0) {
            function23 = new Function2() { // from class: im.toss.extensions.ContextsKt$$ExternalSyntheticLambda13
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i5 = 2 % 2;
                    int i6 = onWarmupCompleted + 117;
                    onExtraCallbackWithResult = i6 % 128;
                    DelegateActivity delegateActivity = (DelegateActivity) obj2;
                    Bundle bundle = (Bundle) obj3;
                    if (i6 % 2 == 0) {
                        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
                        return (Unit) onJsBridgeReady.onWarmupCompleted(-327270363, new Object[]{delegateActivity, bundle}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 327270372, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent);
                    }
                    int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
                    Unit unit = (Unit) onJsBridgeReady.onWarmupCompleted(-327270363, new Object[]{delegateActivity, bundle}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 327270372, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent2);
                    int i7 = 21 / 0;
                    return unit;
                }
            };
            int i5 = IAuthTabCallback + 105;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        } else {
            function23 = function2;
        }
        Function1 function18 = (i2 & 2) != 0 ? new Function1() { // from class: im.toss.extensions.ContextsKt$$ExternalSyntheticLambda14
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj2) {
                int i7 = 2 % 2;
                int i8 = IAuthTabCallback + 91;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
                Unit unit = (Unit) onJsBridgeReady.onWarmupCompleted(-1122002102, new Object[]{(DelegateActivity) obj2}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 1122002109, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent);
                int i10 = onWarmupCompleted + 61;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 != 0) {
                    return unit;
                }
                throw null;
            }
        } : function1;
        Function1 function19 = (i2 & 4) != 0 ? new Function1() { // from class: im.toss.extensions.ContextsKt$$ExternalSyntheticLambda15
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj2) {
                int i7 = 2 % 2;
                int i8 = onExtraCallbackWithResult + 105;
                onExtraCallback = i8 % 128;
                DelegateActivity delegateActivity = (DelegateActivity) obj2;
                if (i8 % 2 == 0) {
                    onJsBridgeReady.IAuthTabCallback(delegateActivity);
                    throw null;
                }
                Unit unitIAuthTabCallback = onJsBridgeReady.IAuthTabCallback(delegateActivity);
                int i9 = onExtraCallback + 19;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                return unitIAuthTabCallback;
            }
        } : function12;
        if ((i2 & 8) != 0) {
            function17 = new Function1() { // from class: im.toss.extensions.ContextsKt$$ExternalSyntheticLambda16
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2) {
                    int i7 = 2 % 2;
                    int i8 = onNavigationEvent + 97;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    Unit unitAsInterface = onJsBridgeReady.asInterface((DelegateActivity) obj2);
                    int i10 = onNavigationEvent + 1;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    return unitAsInterface;
                }
            };
            int i7 = onNavigationEvent + 41;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        } else {
            function17 = function13;
        }
        Function1 function110 = (i2 & 16) != 0 ? new Function1() { // from class: im.toss.extensions.ContextsKt$$ExternalSyntheticLambda17
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj2) {
                int i9 = 2 % 2;
                int i10 = onExtraCallbackWithResult + 61;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
                Unit unit = (Unit) onJsBridgeReady.onWarmupCompleted(-1887271241, new Object[]{(DelegateActivity) obj2}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 1887271244, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent);
                int i12 = onExtraCallbackWithResult + 37;
                IAuthTabCallback = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 21 / 0;
                }
                return unit;
            }
        } : function14;
        Function1 function111 = (i2 & 32) != 0 ? new Function1() { // from class: im.toss.extensions.ContextsKt$$ExternalSyntheticLambda18
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj2) {
                int i9 = 2 % 2;
                int i10 = onExtraCallbackWithResult + 29;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                Unit unitOnNavigationEvent = onJsBridgeReady.onNavigationEvent((DelegateActivity) obj2);
                int i12 = onNavigationEvent + 69;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
                return unitOnNavigationEvent;
            }
        } : function15;
        Function2 function24 = (i2 & 64) != 0 ? new Function2() { // from class: im.toss.extensions.ContextsKt$$ExternalSyntheticLambda19
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj2, Object obj3) {
                Unit unitOnWarmupCompleted;
                int i9 = 2 % 2;
                int i10 = IAuthTabCallback + 89;
                onWarmupCompleted = i10 % 128;
                DelegateActivity delegateActivity = (DelegateActivity) obj2;
                IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) obj3;
                if (i10 % 2 == 0) {
                    unitOnWarmupCompleted = onJsBridgeReady.onWarmupCompleted(delegateActivity, iEngagementSignalsCallbackDefault);
                    int i11 = 8 / 0;
                } else {
                    unitOnWarmupCompleted = onJsBridgeReady.onWarmupCompleted(delegateActivity, iEngagementSignalsCallbackDefault);
                }
                int i12 = onWarmupCompleted + 105;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                return unitOnWarmupCompleted;
            }
        } : function22;
        setTaggedAddrCtrl settaggedaddrctrl2 = (i2 & 128) != 0 ? new setTaggedAddrCtrl() { // from class: im.toss.extensions.ContextsKt$$ExternalSyntheticLambda20
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                int i9 = 2 % 2;
                int i10 = IAuthTabCallback + 109;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                Unit unitOnNavigationEvent = onJsBridgeReady.onNavigationEvent((DelegateActivity) obj2, ((Integer) obj3).intValue(), (String[]) obj4, (int[]) obj5);
                int i12 = IAuthTabCallback + 97;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
                return unitOnNavigationEvent;
            }
        } : settaggedaddrctrl;
        Function1 function112 = (i2 & 256) != 0 ? new Function1() { // from class: im.toss.extensions.ContextsKt$$ExternalSyntheticLambda21
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj2) {
                Boolean boolValueOf;
                int i9 = 2 % 2;
                int i10 = IAuthTabCallback + 9;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                boolean zOnExtraCallbackWithResult = onJsBridgeReady.onExtraCallbackWithResult((DelegateActivity) obj2);
                if (i11 != 0) {
                    boolValueOf = Boolean.valueOf(zOnExtraCallbackWithResult);
                    int i12 = 61 / 0;
                } else {
                    boolValueOf = Boolean.valueOf(zOnExtraCallbackWithResult);
                }
                int i13 = IAuthTabCallback + 85;
                onNavigationEvent = i13 % 128;
                int i14 = i13 % 2;
                return boolValueOf;
            }
        } : function16;
        int i9 = (i2 & 512) != 0 ? 0 : i;
        boolean z2 = (i2 & 1024) == 0 ? z : false;
        if ((i2 & 2048) != 0) {
            int i10 = IAuthTabCallback + 77;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            getbacktracenote2 = null;
        } else {
            getbacktracenote2 = getbacktracenote;
        }
        onWarmupCompleted(-772349068, new Object[]{context, function23, function18, function19, function17, function110, function111, function24, settaggedaddrctrl2, function112, Integer.valueOf(i9), Boolean.valueOf(z2), getbacktracenote2}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 772349068, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
    }

    private static final Unit onNavigationEvent(DelegateActivity delegateActivity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(delegateActivity, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(delegateActivity, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback_Parcel(DelegateActivity delegateActivity) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(delegateActivity, "");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 79;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackStubProxy(DelegateActivity delegateActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(delegateActivity, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 17;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        DelegateActivity delegateActivity = (DelegateActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(delegateActivity, "");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 97;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit readTypedObject(DelegateActivity delegateActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(delegateActivity, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(delegateActivity, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onNavigationEvent + 5;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 37 / 0;
        }
        return unit2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Unit unit;
        DelegateActivity delegateActivity = (DelegateActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(delegateActivity, "");
            unit = Unit.INSTANCE;
            int i3 = 15 / 0;
        } else {
            Intrinsics.checkNotNullParameter(delegateActivity, "");
            unit = Unit.INSTANCE;
        }
        int i4 = IAuthTabCallback + 77;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(DelegateActivity delegateActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(delegateActivity, "");
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(delegateActivity, "");
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(DelegateActivity delegateActivity, int i, String[] strArr, int[] iArr) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 115;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(delegateActivity, "");
            Intrinsics.checkNotNullParameter(strArr, "");
            Intrinsics.checkNotNullParameter(iArr, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(delegateActivity, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Context context = (Context) objArr[0];
        Function2 function2 = (Function2) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        Function1 function12 = (Function1) objArr[3];
        Function1 function13 = (Function1) objArr[4];
        Function1 function14 = (Function1) objArr[5];
        Function1 function15 = (Function1) objArr[6];
        Function2 function22 = (Function2) objArr[7];
        setTaggedAddrCtrl settaggedaddrctrl = (setTaggedAddrCtrl) objArr[8];
        Function1 function16 = (Function1) objArr[9];
        int iIntValue = ((Number) objArr[10]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[11]).booleanValue();
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[12];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(function14, "");
        Intrinsics.checkNotNullParameter(function15, "");
        Intrinsics.checkNotNullParameter(function22, "");
        Intrinsics.checkNotNullParameter(settaggedaddrctrl, "");
        Intrinsics.checkNotNullParameter(function16, "");
        onWarmupCompleted(context, new getVisibilityChangeInfo(function2, function1, function12, function13, function14, function15, function22, settaggedaddrctrl, function16), Integer.valueOf(iIntValue), zBooleanValue, getbacktracenote);
        int i2 = IAuthTabCallback + 3;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 89 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Context context = (Context) objArr[0];
        Long l = (Long) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
        int iIntValue = ((Number) objArr[4]).intValue();
        Object obj = objArr[5];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0 ? (iIntValue & 2) != 0 : (iIntValue & 3) != 0) {
            int i4 = i3 + 105;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            zBooleanValue = true;
        }
        String strIAuthTabCallback = IAuthTabCallback(context, l, zBooleanValue, (iIntValue & 4) == 0 ? zBooleanValue2 : true);
        int i6 = onNavigationEvent + 53;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return strIAuthTabCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final String IAuthTabCallback(@NotNull Context context, @Nullable Long l, boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        if (l == null) {
            return "";
        }
        if (!PageExitListener.onWarmupCompleted(context)) {
            if (z2) {
                return getLongName.onNavigationEvent(l.longValue(), null, 1, null);
            }
            String strIAuthTabCallback = getLongName.IAuthTabCallback(l.longValue(), "");
            int i4 = IAuthTabCallback + 117;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 35 / 0;
            }
            return strIAuthTabCallback;
        }
        int i6 = IAuthTabCallback + 71;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        if (!z2) {
            return getLongName.onExtraCallbackWithResult(l, z);
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = context.getString(R.string.korea_currency_won_template);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String str = String.format(string, Arrays.copyOf(new Object[]{getLongName.onExtraCallbackWithResult(l, z)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public static final boolean onNavigationEvent(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.areEqual(context.getPackageName(), setRgbInputImage.onExtraCallback(context));
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        boolean zAreEqual = Intrinsics.areEqual(context.getPackageName(), setRgbInputImage.onExtraCallback(context));
        int i3 = IAuthTabCallback + 35;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 86 / 0;
        }
        return zAreEqual;
    }

    public static /* synthetic */ Unit onExtraCallback(getBacktraceNote getbacktracenote, getVisibilityChangeInfo getvisibilitychangeinfo, DelegateActivity delegateActivity, Bundle bundle) {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (Unit) onWarmupCompleted(2045419052, new Object[]{getbacktracenote, getvisibilitychangeinfo, delegateActivity, bundle}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -2045419042, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent);
    }

    public static /* synthetic */ Unit onWarmupCompleted(DelegateActivity delegateActivity, Bundle bundle) {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (Unit) onWarmupCompleted(-327270363, new Object[]{delegateActivity, bundle}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 327270372, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent);
    }

    public static /* synthetic */ Unit onTransact(DelegateActivity delegateActivity) {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (Unit) onWarmupCompleted(1888364944, new Object[]{delegateActivity}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -1888364942, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent);
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(DelegateActivity delegateActivity) {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (Unit) onWarmupCompleted(-1122002102, new Object[]{delegateActivity}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 1122002109, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent);
    }

    public static /* synthetic */ Unit access000(DelegateActivity delegateActivity) {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (Unit) onWarmupCompleted(-1887271241, new Object[]{delegateActivity}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 1887271244, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent);
    }

    public static final void IAuthTabCallback(@NotNull Context context, @NotNull Function2<? super DelegateActivity, ? super Bundle, Unit> function2, @NotNull Function1<? super DelegateActivity, Unit> function1, @NotNull Function1<? super DelegateActivity, Unit> function12, @NotNull Function1<? super DelegateActivity, Unit> function13, @NotNull Function1<? super DelegateActivity, Unit> function14, @NotNull Function1<? super DelegateActivity, Unit> function15, @NotNull Function2<? super DelegateActivity, ? super IEngagementSignalsCallbackDefault, Unit> function22, @NotNull setTaggedAddrCtrl<? super DelegateActivity, ? super Integer, ? super String[], ? super int[], Unit> settaggedaddrctrl, @NotNull Function1<? super DelegateActivity, Boolean> function16, int i, boolean z, @Nullable getBacktraceNote<? super DelegateActivity, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote) {
        Object[] objArr = {context, function2, function1, function12, function13, function14, function15, function22, settaggedaddrctrl, function16, Integer.valueOf(i), Boolean.valueOf(z), getbacktracenote};
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        onWarmupCompleted(-772349068, objArr, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 772349068, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent);
    }

    private static final Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, getVisibilityChangeInfo getvisibilitychangeinfo, DelegateActivity delegateActivity, Bundle bundle) {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (Unit) onWarmupCompleted(-919679728, new Object[]{getbacktracenote, getvisibilitychangeinfo, delegateActivity, bundle}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 919679732, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent);
    }

    private static final Unit IAuthTabCallback(getBacktraceNote getbacktracenote, DelegateActivity delegateActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getbacktracenote, delegateActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (Unit) onWarmupCompleted(-312427141, objArr, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 312427149, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent);
    }

    private static final Unit access100(DelegateActivity delegateActivity) {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (Unit) onWarmupCompleted(2094630198, new Object[]{delegateActivity}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -2094630192, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent);
    }

    private static final Unit ICustomTabsCallback(DelegateActivity delegateActivity) {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (Unit) onWarmupCompleted(451704396, new Object[]{delegateActivity}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -451704385, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent);
    }

    private static final boolean onActivityLayout(DelegateActivity delegateActivity) {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return ((Boolean) onWarmupCompleted(2002776980, new Object[]{delegateActivity}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -2002776975, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent)).booleanValue();
    }

    public static /* synthetic */ String onExtraCallbackWithResult(Context context, Long l, boolean z, boolean z2, int i, Object obj) {
        Object[] objArr = {context, l, Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i), obj};
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (String) onWarmupCompleted(-1653879857, objArr, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 1653879858, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent);
    }
}
