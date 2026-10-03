package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.network.model.BaseApiResponse;
import im.toss.utils.RxUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.toLocaleUpperCase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.home.HomeEventManager$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setDebug {
    private final Set<String> onExtraCallbackWithResult = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(BaseApiResponse baseApiResponse) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onTransact(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(setDebug setdebug, FlipperPlugin flipperPlugin, Throwable th) {
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("HomeEventManager::trackImpression", th);
        setdebug.onExtraCallbackWithResult.remove(flipperPlugin.IAuthTabCallbackStub());
        return Unit.INSTANCE;
    }

    public final boolean onExtraCallbackWithResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.onExtraCallbackWithResult.contains(str)) {
            return false;
        }
        this.onExtraCallbackWithResult.add(str);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onExtraCallback(setDebug setdebug, NativeVibrationSpec nativeVibrationSpec, Function0 function0, int i, Object obj) throws Throwable {
        if ((i & 2) != 0) {
            function0 = null;
        }
        setdebug.onExtraCallbackWithResult(nativeVibrationSpec, (Function0<Unit>) function0);
    }

    public final void onExtraCallbackWithResult(@NotNull NativeVibrationSpec nativeVibrationSpec, @Nullable Function0<Unit> function0) throws Throwable {
        Intrinsics.checkNotNullParameter(nativeVibrationSpec, "");
        if (!nativeVibrationSpec.IAuthTabCallbackStub() || nativeVibrationSpec.asInterface() == null) {
            return;
        }
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - TextUtils.indexOf("", "", 0, 0)), 23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 24734 - TextUtils.indexOf("", "", 0), -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-745626470);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore("", 0) + 29426), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 21, Color.red(0) + 24734, -489793014, false, "IAuthTabCallbackDefault", new Class[0]);
            }
            FullScreenAd fullScreenAd = (FullScreenAd) ((Method) objOnExtraCallback2).invoke(obj, null);
            toLocaleUpperCase.onWarmupCompleted onwarmupcompleted = toLocaleUpperCase.Companion;
            int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            String str = (String) NativeVibrationSpec.IAuthTabCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, new Object[]{nativeVibrationSpec}, iIAuthTabCallback3, 2128801435, -2128801435, iIAuthTabCallback2);
            showWithGravityAndOffset showwithgravityandoffsetAsInterface = nativeVibrationSpec.asInterface();
            Intrinsics.checkNotNull(showwithgravityandoffsetAsInterface);
            writeRaw writerawIAuthTabCallback = fullScreenAd.onExtraCallback(onwarmupcompleted.IAuthTabCallback(str, showwithgravityandoffsetAsInterface.name())).IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            writerawIAuthTabCallback.onNavigationEvent(new HomeEventManager$.ExternalSyntheticLambda5(new HomeEventManager$.ExternalSyntheticLambda4(function0)), new HomeEventManager$.ExternalSyntheticLambda7(new HomeEventManager$.ExternalSyntheticLambda6()));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asBinder(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(Function0 function0, BaseApiResponse baseApiResponse) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(Throwable th) {
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("HomeEventManager::trackClick", th);
        return Unit.INSTANCE;
    }
}
