package o;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import im.toss.components.tuba.distribution.TubaDistributionMessageHandler$;
import im.toss.network.throwable.TossApiCallException;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class UtilsKtExternalSyntheticLambda15 implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent = 0;
    private static long onWarmupCompleted = -7553636155664224966L;

    public static /* synthetic */ Unit onExtraCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(setonoutofmemeryerrorcallback, th);
        int i4 = onNavigationEvent + 95;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function1, obj);
        int i4 = onNavigationEvent + 73;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Boolean bool) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(setonoutofmemeryerrorcallback, bool);
        int i4 = onNavigationEvent + 39;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function1, obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallback + 123;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
    }

    @Override // o.drawTextBox
    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super.onExtraCallback();
        int i4 = onNavigationEvent + 29;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return onoutofmemoryOnExtraCallback;
    }

    @Override // o.ALCFaceQuality
    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 13;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = IAuthTabCallback + 109;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            super.onExtraCallbackWithResult();
            throw null;
        }
        boolean zOnExtraCallbackWithResult = super.onExtraCallbackWithResult();
        int i3 = IAuthTabCallback + 81;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 56 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super.onNavigationEvent();
        int i4 = IAuthTabCallback + 1;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    @Override // o.drawTextBox
    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return super.onWarmupCompleted(str);
        }
        super.onWarmupCompleted(str);
        throw null;
    }

    @Override // o.ALCFaceQuality
    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 47;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = IAuthTabCallback + 99;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallback + 21;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Boolean bool) throws Throwable {
        int i = 2 % 2;
        JsonObject jsonObject = new JsonObject();
        Object[] objArr = new Object[1];
        a(new char[]{43108, 65527, 1867, 44791, 63067, 7623, 42334, 52422}, 22408 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
        jsonObject.addProperty(((String) objArr[0]).intern(), bool);
        ALCFaceBox.onWarmupCompleted(setonoutofmemeryerrorcallback, (JsonElement) jsonObject);
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onNavigationEvent + 53;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029 A[PHI: r10
      0x0029: PHI (r10v6 im.toss.network.throwable.TossApiCallException$ApiError) = 
      (r10v5 im.toss.network.throwable.TossApiCallException$ApiError)
      (r10v10 im.toss.network.throwable.TossApiCallException$ApiError)
     binds: [B:10:0x0027, B:7:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[PHI: r1 r10
      0x0033: PHI (r1v11 java.lang.String) = (r1v6 java.lang.String), (r1v12 java.lang.String) binds: [B:10:0x0027, B:7:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r10v9 im.toss.network.throwable.TossApiCallException$ApiError) = 
      (r10v5 im.toss.network.throwable.TossApiCallException$ApiError)
      (r10v10 im.toss.network.throwable.TossApiCallException$ApiError)
     binds: [B:10:0x0027, B:7:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) {
        String str;
        TossApiCallException.ApiError apiError;
        String message;
        int i = 2 % 2;
        String str2 = "";
        if (th instanceof TossApiCallException.ApiError) {
            int i2 = onNavigationEvent + 117;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                apiError = (TossApiCallException.ApiError) th;
                message = apiError.getMessage();
                int i3 = 39 / 0;
                if (message == null) {
                    int i4 = IAuthTabCallback + 109;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    str2 = message;
                }
            } else {
                apiError = (TossApiCallException.ApiError) th;
                message = apiError.getMessage();
                if (message == null) {
                }
            }
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, str2, apiError.asBinder(), null, 4, null);
            int i6 = IAuthTabCallback + 99;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        } else {
            String message2 = th.getMessage();
            if (message2 == null) {
                int i8 = onNavigationEvent + 55;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                str = "";
            } else {
                str = message2;
            }
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, str, null, null, 6, null);
        }
        return Unit.INSTANCE;
    }

    @Override // o.ALCFaceQuality
    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        a(new char[]{43108, 19006}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 57943, objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        if (strOnNavigationEvent.length() == 0) {
            int i2 = onNavigationEvent + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr2 = new Object[1];
            a(new char[]{43108, 33356, 64615, 54795, 234, 31380, 21686, 36707, 63829, 54068, 3334}, TextUtils.lastIndexOf("", '0', 0) + 10790, objArr2);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, ((String) objArr2[0]).intern(), null, null, 6, null);
            return;
        }
        Object obj = null;
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = UtilsKtExternalSyntheticLambda11.onExtraCallback(UtilsKtExternalSyntheticLambda11.IAuthTabCallback, strOnNavigationEvent, null, 2, null).onNavigationEvent(clearTid.onExtraCallback()).IAuthTabCallback(NetConverter3.onExtraCallback()).onNavigationEvent(new TubaDistributionMessageHandler$.ExternalSyntheticLambda1(new TubaDistributionMessageHandler$.ExternalSyntheticLambda0(setonoutofmemeryerrorcallback)), new TubaDistributionMessageHandler$.ExternalSyntheticLambda3(new TubaDistributionMessageHandler$.ExternalSyntheticLambda2(setonoutofmemeryerrorcallback)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionOnNavigationEvent, r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
        int i4 = onNavigationEvent + 103;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 55;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), 24 - ExpandableListView.getPackedPositionType(0L), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onWarmupCompleted ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getPressedStateDuration() >> 16) + 59, 6383 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $10 + 51;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 3 % 3;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 59 - (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.lastIndexOf("", '0') + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        String str = new String(cArr2);
        int i8 = $11 + 59;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }
}
