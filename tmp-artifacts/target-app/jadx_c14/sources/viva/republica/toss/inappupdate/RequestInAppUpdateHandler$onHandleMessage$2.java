package viva.republica.toss.inappupdate;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.ALCFaceBox;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.access13800;
import o.access14000;
import o.getNavigationBar;
import o.onPreviewFrame;
import o.setOnOutOfMemeryErrorCallback;
import o.setText;
import o.withOnAnimationEventListener;
import viva.republica.toss.inappupdate.InAppUpdateLauncherActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
final class RequestInAppUpdateHandler$onHandleMessage$2 extends SuspendLambda implements Function2<withOnAnimationEventListener, access13800<? super Unit>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 1;
    private static int onExtraCallback;
    final /* synthetic */ setOnOutOfMemeryErrorCallback $callbackProxy;
    final /* synthetic */ Context $context;
    final /* synthetic */ setText $parsedMessage;
    /* synthetic */ Object L$0;
    int label;
    private static char[] onNavigationEvent = {32462, 32449, 32458, 32477};
    private static int onExtraCallbackWithResult = -1184333958;
    private static boolean IAuthTabCallback = true;
    private static boolean onWarmupCompleted = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RequestInAppUpdateHandler$onHandleMessage$2(setText settext, Context context, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, access13800<? super RequestInAppUpdateHandler$onHandleMessage$2> access13800Var) {
        super(2, access13800Var);
        this.$parsedMessage = settext;
        this.$context = context;
        this.$callbackProxy = setonoutofmemeryerrorcallback;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RequestInAppUpdateHandler$onHandleMessage$2 requestInAppUpdateHandler$onHandleMessage$2 = new RequestInAppUpdateHandler$onHandleMessage$2(this.$parsedMessage, this.$context, this.$callbackProxy, access13800Var);
        requestInAppUpdateHandler$onHandleMessage$2.L$0 = obj;
        int i2 = onExtraCallback + 87;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return requestInAppUpdateHandler$onHandleMessage$2;
        }
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        onExtraCallback = i2 % 128;
        Object obj3 = null;
        withOnAnimationEventListener withonanimationeventlistener = (withOnAnimationEventListener) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i2 % 2 != 0) {
            onWarmupCompleted(withonanimationeventlistener, access13800Var);
            throw null;
        }
        Object objOnWarmupCompleted = onWarmupCompleted(withonanimationeventlistener, access13800Var);
        int i3 = asInterface + 15;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return objOnWarmupCompleted;
        }
        obj3.hashCode();
        throw null;
    }

    public final Object onWarmupCompleted(withOnAnimationEventListener withonanimationeventlistener, access13800<? super Unit> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        RequestInAppUpdateHandler$onHandleMessage$2 requestInAppUpdateHandler$onHandleMessage$2Create = create(withonanimationeventlistener, access13800Var);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            requestInAppUpdateHandler$onHandleMessage$2Create.invokeSuspend(unit);
            throw null;
        }
        Object objInvokeSuspend = requestInAppUpdateHandler$onHandleMessage$2Create.invokeSuspend(unit);
        int i4 = onExtraCallback + 41;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return objInvokeSuspend;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        withOnAnimationEventListener withonanimationeventlistener = (withOnAnimationEventListener) this.L$0;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i2 = onExtraCallback + 47;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ResultKt.onNavigationEvent(obj);
        if (withonanimationeventlistener instanceof withOnAnimationEventListener.IAuthTabCallbackStub) {
            int iAvailableVersionCode = ((withOnAnimationEventListener.IAuthTabCallbackStub) withonanimationeventlistener).onExtraCallbackWithResult().getUpdateInfo().availableVersionCode();
            setText settext = this.$parsedMessage;
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-124, -125, -126, -127}, ExpandableListView.getPackedPositionGroup(0L) + 127, objArr);
            getNavigationBar.IAuthTabCallback(InAppUpdateLauncherActivity.Companion.onExtraCallback(this.$context, InAppUpdateLauncherActivity.onExtraCallbackWithResult.onWarmupCompleted.valueOf(settext.onNavigationEvent(((String) objArr[0]).intern(), InAppUpdateLauncherActivity.onExtraCallbackWithResult.onWarmupCompleted.FLEXIBLE.getValue())), false), this.$context);
            ALCFaceBox.onExtraCallback(this.$callbackProxy, access14000.onNavigationEvent(iAvailableVersionCode));
        } else if ((withonanimationeventlistener instanceof withOnAnimationEventListener.asBinder) || Intrinsics.areEqual(withonanimationeventlistener, withOnAnimationEventListener.onNavigationEvent.IAuthTabCallback) || Intrinsics.areEqual(withonanimationeventlistener, withOnAnimationEventListener.IAuthTabCallbackDefault.onExtraCallbackWithResult) || Intrinsics.areEqual(withonanimationeventlistener, withOnAnimationEventListener.IAuthTabCallback.IAuthTabCallback)) {
            Object[] objArr2 = {this.$callbackProxy, onPreviewFrame.onWarmupCompleted.onExtraCallbackWithResult};
            ALCFaceBox.onWarmupCompleted(1684873911, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr2, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), -1684873909);
        } else {
            int i4 = onExtraCallback + 17;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            if (!(withonanimationeventlistener instanceof withOnAnimationEventListener.onExtraCallbackWithResult) && !Intrinsics.areEqual(withonanimationeventlistener, withOnAnimationEventListener.onExtraCallback.onExtraCallback)) {
                int i6 = asInterface + 35;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                if ((!Intrinsics.areEqual(withonanimationeventlistener, withOnAnimationEventListener.onWarmupCompleted.onNavigationEvent)) && (!Intrinsics.areEqual(withonanimationeventlistener, withOnAnimationEventListener.asInterface.onNavigationEvent)) && !Intrinsics.areEqual(withonanimationeventlistener, withOnAnimationEventListener.onTransact.onNavigationEvent)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onNavigationEvent;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $10 + 75;
                $11 = i5 % 128;
                if (i5 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0) + 78, 20952 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), 77 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 20952 - (ViewConfiguration.getScrollBarSize() >> 8), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4++;
                }
                i2 = 2;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(onExtraCallbackWithResult)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 75, 16036 - TextUtils.indexOf((CharSequence) "", '0'), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
        if (onWarmupCompleted) {
            int i6 = $11 + 19;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i8 = $11 + 7;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), 62 - TextUtils.lastIndexOf("", '0', 0), TextUtils.indexOf((CharSequence) "", '0') + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!IAuthTabCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 63 - View.MeasureSpec.getMode(0), Color.green(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr6);
    }
}
