package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class enableCppPropsIteratorSetter$asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Map<String, ? extends String>>, Object> {
    final /* synthetic */ GraniteBrownfieldModule_closeView $password;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enableCppPropsIteratorSetter$asBinder(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, access13800<? super enableCppPropsIteratorSetter$asBinder> access13800Var) {
        super(2, access13800Var);
        this.$password = graniteBrownfieldModule_closeView;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        return new enableCppPropsIteratorSetter$asBinder(this.$password, access13800Var);
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public final Object invoke(findResAndMsg findresandmsg, access13800<? super Map<String, String>> access13800Var) {
        return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.onNavigationEvent(obj);
        Map map = (Map) setTestMode.onExtraCallback(-466877690, 466877690, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{setTestMode.onExtraCallback}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        if (map.isEmpty()) {
            return access8100.onNavigationEvent();
        }
        byte[] bArrOnWarmupCompleted = this.$password.onWarmupCompleted();
        byte[] bArrOnNavigationEvent = EstimateFaceQualityFromBGRImage.onNavigationEvent(EstimateFaceQualityFromBGRImage.IAuthTabCallback, bArrOnWarmupCompleted, false, 2, (Object) null);
        onPageHide.IAuthTabCallback(bArrOnWarmupCompleted);
        LinkedHashMap linkedHashMap = new LinkedHashMap(access8100.IAuthTabCallback(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            byte[] bArrIAuthTabCallback = getPageContainer.IAuthTabCallback((String) entry.getValue());
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), Drawable.resolveOpacity(0, 0) + 30, (Process.myTid() >> 22) + 24887, -265239605, false, "onWarmupCompleted", (Class[]) null);
            }
            Object obj2 = ((Field) objOnExtraCallback).get(null);
            try {
                Object[] objArr = {bArrOnNavigationEvent, bArrIAuthTabCallback, 32, 310000};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1280300143);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), Color.alpha(0) + 30, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24887, 2098146047, false, "onNavigationEvent", new Class[]{byte[].class, byte[].class, Integer.TYPE, Integer.TYPE});
                }
                linkedHashMap.put(key, Page.onExtraCallbackWithResult((byte[]) ((Method) objOnExtraCallback2).invoke(obj2, objArr), 0, 1, (Object) null));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return linkedHashMap;
    }
}
