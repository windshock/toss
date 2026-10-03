package o;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.core.webkit.bridge.image.Image;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.getUserCertificate;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.common.web.message.handlers.LoadImagesHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getUserCertificate extends ALCTimerLabel {
    public onOutOfMemory onExtraCallback() {
        return new onOutOfMemory.IAuthTabCallback(new LoadImagesHandler$.ExternalSyntheticLambda0());
    }

    public void onExtraCallbackWithResult(@NotNull final String str, @NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull Context context, @NotNull setText settext, @NotNull List<String> list, int i, @NotNull final setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(settext, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        writeRaw writerawOnExtraCallbackWithResult = new unzip(context, i).onExtraCallbackWithResult(list);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.common.web.message.handlers.LoadImagesHandler$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return getUserCertificate.onWarmupCompleted(this.f$0, setonoutofmemeryerrorcallback, (List) obj);
            }
        };
        writeRaw writerawOnWarmupCompleted = writerawOnExtraCallbackWithResult.onWarmupCompleted(new deserializeIntNullableCollection() { // from class: viva.republica.toss.common.web.message.handlers.LoadImagesHandler$$ExternalSyntheticLambda2
            public final Object apply(Object obj) {
                return getUserCertificate.onWarmupCompleted(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
        IconRoundCornerProgressBarSavedState.IAuthTabCallback(setMessageBytes.onExtraCallbackWithResult(writerawOnWarmupCompleted, new Function1() { // from class: viva.republica.toss.common.web.message.handlers.LoadImagesHandler$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return getUserCertificate.onNavigationEvent(this.f$0, str, setonoutofmemeryerrorcallback, (Throwable) obj);
            }
        }, new Function1() { // from class: viva.republica.toss.common.web.message.handlers.LoadImagesHandler$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return getUserCertificate.onExtraCallback((Unit) obj);
            }
        }), r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(Unit unit) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(getUserCertificate getusercertificate, String str, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        getusercertificate.onExtraCallback(str, setonoutofmemeryerrorcallback, th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onNavigationEvent(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Uri uri = Uri.parse(str);
        boolean zOnTransact = filterCreatePageParams.onTransact(uri);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 42121), 17 - (ViewConfiguration.getScrollBarSize() >> 8), 6935 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 4);
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2047150232);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12, 6997 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1262876168, false, "HANA_BANK", (Class[]) null);
        }
        objArr[0] = ((Field) objOnExtraCallback).get(null);
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1927274998);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), View.resolveSizeAndState(0, 0, 0) + 13, Color.red(0) + 6997, 1134501734, false, "SUHYUP_BANK", (Class[]) null);
        }
        objArr[1] = ((Field) objOnExtraCallback2).get(null);
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(785500611);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 12, 6997 - TextUtils.getOffsetBefore("", 0), 529610579, false, "EDUCAR", (Class[]) null);
        }
        objArr[2] = ((Field) objOnExtraCallback3).get(null);
        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2092198808);
        if (objOnExtraCallback4 == null) {
            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') - '0'), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12, 6997 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1307874568, false, "CARROT", (Class[]) null);
        }
        objArr[3] = ((Field) objOnExtraCallback4).get(null);
        return filterCreatePageParams.onExtraCallback$19226060(uri, objArr) | zOnTransact;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(getUserCertificate getusercertificate, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, List list) {
        Object obj;
        Intrinsics.checkNotNullParameter(list, "");
        try {
            Result.Companion companion = Result.Companion;
            wie2 wie2VarOnExtraCallback = EndMotionInteraction.onExtraCallback();
            wie2VarOnExtraCallback.onExtraCallback();
            obj = Result.constructor-impl(wie2VarOnExtraCallback.onWarmupCompleted(new checkCanOpenLandingPage(Image.Companion.serializer()), list));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            obj = null;
        }
        getusercertificate.onNavigationEvent(setonoutofmemeryerrorcallback, (String) obj);
        return Unit.INSTANCE;
    }
}
