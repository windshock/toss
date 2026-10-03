package viva.republica.toss.common.web.message.handlers;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.gson.JsonObject;
import im.toss.core.tuba.VarsResult;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ALCFaceBox;
import o.ALCFaceQuality;
import o.ALCFaceValidation;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.IconRoundCornerProgressBarSavedState;
import o.MapConverter;
import o.NetConverter3;
import o.clearTid;
import o.deserializeUriNullableCollection;
import o.onExitFullscreen;
import o.onOutOfMemory;
import o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ;
import o.setOnOutOfMemeryErrorCallback;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.RefreshTubaVarsHandler$;
import viva.republica.toss.common.web.message.handlers.RefreshTubaVarsHandler$onHandleMessage$;
import viva.republica.toss.core.AppStateManager;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RefreshTubaVarsHandler implements ALCFaceQuality {
    public /* bridge */ onOutOfMemory onExtraCallback() {
        return super/*o.drawTextBox*/.onExtraCallback();
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        return super/*o.drawTextBox*/.onExtraCallbackWithResult();
    }

    public /* bridge */ boolean onNavigationEvent() {
        return super/*o.drawTextBox*/.onNavigationEvent();
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        return super/*o.drawTextBox*/.onWarmupCompleted(str);
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - Color.green(0)), 22 - TextUtils.getOffsetBefore("", 0), 24734 - (ViewConfiguration.getWindowTouchSlop() >> 8), -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1328718023);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29425 - TextUtils.indexOf((CharSequence) "", '0', 0)), KeyEvent.getDeadChar(0, 0) + 22, AndroidCharacter.getMirror('0') + 24686, -2121424471, false, "IAuthTabCallbackStubProxy", new Class[0]);
            }
            writeRaw writerawOnNavigationEvent = onExitFullscreen.onNavigationEvent((onExitFullscreen) ((Method) objOnExtraCallback2).invoke(obj, null), false, false, 3, null);
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new RefreshTubaVarsHandler$onHandleMessage$.inlined.asApiWorker.default.1(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback.onNavigationEvent(new RefreshTubaVarsHandler$.ExternalSyntheticLambda1(new RefreshTubaVarsHandler$.ExternalSyntheticLambda0())).onNavigationEvent(new RefreshTubaVarsHandler$.ExternalSyntheticLambda3(new RefreshTubaVarsHandler$.ExternalSyntheticLambda2(setonoutofmemeryerrorcallback)), new RefreshTubaVarsHandler$.ExternalSyntheticLambda5(new RefreshTubaVarsHandler$.ExternalSyntheticLambda4(setonoutofmemeryerrorcallback)));
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
            IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionOnNavigationEvent, r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(VarsResult varsResult) {
        AppStateManager.onExtraCallbackWithResult.onMinimized().onExtraCallbackWithResult(varsResult.onNavigationEvent());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, VarsResult varsResult) {
        setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, (Function1) null, 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onTransact(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) {
        Intrinsics.checkNotNull(th);
        ALCFaceBox.onExtraCallbackWithResult(setonoutofmemeryerrorcallback, th, (String) null, (Map) null, 6, (Object) null);
        return Unit.INSTANCE;
    }
}
