package o;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.core.R;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.widget.dialog.TdsDialogV1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.getParamImp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getParamImp {
    private static WeakReference<Dialog> IAuthTabCallback = null;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public static /* synthetic */ void onExtraCallback(Function0 function0, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        onWarmupCompleted(function0, dialogInterface, i);
        int i5 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(function1, dialogInterface);
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        int i5 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Dialog onWarmupCompleted(Throwable th, Context context, boolean z, initMiniApp initminiapp, Function0 function0, Function1 function1, int i, Object obj) {
        initMiniApp initminiapp2;
        Function0 function02;
        Function1 function12;
        int i2 = 2 % 2;
        boolean z2 = (i & 2) != 0 ? false : z;
        if ((i & 4) != 0) {
            int i3 = onExtraCallbackWithResult + 109;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 80 / 0;
            }
            initminiapp2 = null;
        } else {
            initminiapp2 = initminiapp;
        }
        if ((i & 8) != 0) {
            int i5 = onExtraCallbackWithResult + 43;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            function02 = null;
        } else {
            function02 = function0;
        }
        if ((i & 16) != 0) {
            int i7 = onNavigationEvent + 99;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            function12 = null;
        } else {
            function12 = function1;
        }
        return onExtraCallback(th, context, z2, initminiapp2, function02, function12);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(Function0 function0, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 71;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
            if (function0 != null) {
                int i6 = i3 + 33;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    function0.invoke();
                } else {
                    function0.invoke();
                    throw null;
                }
            }
        } else if (function0 != null) {
        }
        dialogInterface.dismiss();
    }

    private static final void onExtraCallback(Function1 function1, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(dialogInterface);
        int i4 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final Dialog onExtraCallback(@NotNull Throwable th, @Nullable Context context, boolean z, @Nullable initMiniApp initminiapp, @Nullable final Function0<Unit> function0, @Nullable final Function1<? super DialogInterface, Unit> function1) throws Throwable {
        String message;
        initMiniApp initminiapp2;
        Dialog dialog;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        Context contextOnExtraCallback = context == null ? UserChoiceBillingListener.onExtraCallback.onExtraCallback() : context;
        if (zzcy.onNavigationEvent(th, 0, 1, (Object) null)) {
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1564184796);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46480 - View.combineMeasuredStates(0, 0)), 13 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 22731 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1820028492, false, "IAuthTabCallback", (Class[]) null);
            }
            Object obj = ((Field) objOnExtraCallback).get(null);
            try {
                Object[] objArr = {contextOnExtraCallback};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1907406523);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 46479), 13 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22731, -1089488939, false, "onExtraCallbackWithResult", new Class[]{Context.class});
                }
                ((Method) objOnExtraCallback2).invoke(obj, objArr);
                if (function1 != null) {
                    int i2 = onExtraCallbackWithResult + 107;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    function1.invoke((Object) null);
                }
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        } else if (th instanceof TossApiCallException.ApiError) {
            Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(contextOnExtraCallback);
            if (activityIAuthTabCallback != null && !activityIAuthTabCallback.isFinishing()) {
                int i4 = onNavigationEvent + 115;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                if (!activityIAuthTabCallback.isDestroyed()) {
                    WeakReference<Dialog> weakReference = IAuthTabCallback;
                    if (weakReference != null && (dialog = weakReference.get()) != null && dialog.isShowing()) {
                        try {
                            dialog.dismiss();
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -963962278, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 963962280, new Object[]{TdsDialogV1.Companion.onExtraCallback(activityIAuthTabCallback), Integer.valueOf(R.drawable.img_popup_warning)}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
                    TossApiCallException.ApiError apiError = (TossApiCallException.ApiError) th;
                    String localizedMessage = apiError.getLocalizedMessage();
                    Intrinsics.checkNotNullExpressionValue(localizedMessage, "");
                    TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted2 = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult((TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) onwarmupcompleted.onExtraCallbackWithResult(localizedMessage), im.toss.uikit.R.string.uikit_confirm, new DialogInterface.OnClickListener() { // from class: im.toss.extensions.ThrowablesKt$$ExternalSyntheticLambda0
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i6) {
                            int i7 = 2 % 2;
                            int i8 = onWarmupCompleted + 75;
                            onNavigationEvent = i8 % 128;
                            Object obj2 = null;
                            if (i8 % 2 == 0) {
                                getParamImp.onExtraCallback(function0, dialogInterface, i6);
                                obj2.hashCode();
                                throw null;
                            }
                            getParamImp.onExtraCallback(function0, dialogInterface, i6);
                            int i9 = onNavigationEvent + 109;
                            onWarmupCompleted = i9 % 128;
                            if (i9 % 2 != 0) {
                                throw null;
                            }
                        }
                    }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null).onNavigationEvent(true);
                    String strOnTransact = apiError.onTransact();
                    if (strOnTransact != null && (!StringsKt.isBlank(strOnTransact))) {
                        int i6 = onNavigationEvent + 57;
                        onExtraCallbackWithResult = i6 % 128;
                        if (i6 % 2 != 0) {
                            onwarmupcompleted2.onNavigationEvent(strOnTransact);
                            throw null;
                        }
                        onwarmupcompleted2.onNavigationEvent(strOnTransact);
                    }
                    if (initminiapp == null) {
                        int i7 = onNavigationEvent + 7;
                        int i8 = i7 % 128;
                        onExtraCallbackWithResult = i8;
                        int i9 = i7 % 2;
                        if (activityIAuthTabCallback instanceof initMiniApp) {
                            initminiapp2 = (initMiniApp) activityIAuthTabCallback;
                            int i10 = i8 + 77;
                            onNavigationEvent = i10 % 128;
                            int i11 = i10 % 2;
                        } else {
                            initminiapp2 = null;
                        }
                    } else {
                        initminiapp2 = initminiapp;
                    }
                    if (initminiapp2 != null) {
                        onwarmupcompleted2.onNavigationEvent(initminiapp2);
                    }
                    TdsDialogV1 typedObject = onwarmupcompleted2.readTypedObject();
                    typedObject.setOnDismissListener(function1 != null ? new DialogInterface.OnDismissListener() { // from class: im.toss.extensions.ThrowablesKt$$ExternalSyntheticLambda1
                        private static int onExtraCallbackWithResult = 0;
                        private static int onWarmupCompleted = 1;

                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            int i12 = 2 % 2;
                            int i13 = onExtraCallbackWithResult + 53;
                            onWarmupCompleted = i13 % 128;
                            int i14 = i13 % 2;
                            getParamImp.onExtraCallbackWithResult(function1, dialogInterface);
                            if (i14 == 0) {
                                throw null;
                            }
                        }
                    } : null);
                    IAuthTabCallback = new WeakReference<>(typedObject);
                    return typedObject;
                }
            }
            String localizedMessage2 = ((TossApiCallException.ApiError) th).getLocalizedMessage();
            Intrinsics.checkNotNullExpressionValue(localizedMessage2, "");
            onJsBridgeReady.onWarmupCompleted(localizedMessage2, contextOnExtraCallback);
            if (function1 != null) {
                function1.invoke((Object) null);
            }
        } else {
            if (z && (message = th.getMessage()) != null) {
                int i12 = onExtraCallbackWithResult + 7;
                onNavigationEvent = i12 % 128;
                if (i12 % 2 == 0) {
                    message.length();
                    throw null;
                }
                if (message.length() > 0) {
                    String localizedMessage3 = th.getLocalizedMessage();
                    Intrinsics.checkNotNullExpressionValue(localizedMessage3, "");
                    onJsBridgeReady.onWarmupCompleted(localizedMessage3, contextOnExtraCallback);
                }
            }
            if (function1 != null) {
                int i13 = onExtraCallbackWithResult + 67;
                onNavigationEvent = i13 % 128;
                int i14 = i13 % 2;
                function1.invoke((Object) null);
                if (i14 == 0) {
                    int i15 = 19 / 0;
                }
            }
        }
        return null;
    }
}
