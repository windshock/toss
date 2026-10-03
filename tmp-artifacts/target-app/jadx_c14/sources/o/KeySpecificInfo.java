package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.SessionTrackerb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class KeySpecificInfo implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int onExtraCallback = 1;
    public static final String onExtraCallbackWithResult;
    private static char[] onNavigationEvent = null;
    private static int onTransact = 1;
    private static long onWarmupCompleted;

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new int[]{0, 16, 70, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1}, objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onWarmupCompleted(defaultConstructorMarker);
        int i = onExtraCallback + 63;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 123;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 29;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public static final /* synthetic */ Intent onNavigationEvent(KeySpecificInfo keySpecificInfo, Context context, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return keySpecificInfo.onExtraCallback(context, str);
        }
        keySpecificInfo.onExtraCallback(context, str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 97;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i4 = onTransact + 103;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return onoutofmemoryOnExtraCallback;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        super/*o.drawTextBox*/.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onTransact + 121;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = IAuthTabCallbackDefault + 85;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onTransact + 95;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 != 0) {
            throw null;
        }
        int i6 = IAuthTabCallbackDefault + 95;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 82 / 0;
        }
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        String strIntern;
        String strIntern2;
        Map map;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        Object obj = null;
        a(new int[]{59, 4, 98, 1}, true, null, objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        if (strOnNavigationEvent.length() != 0) {
            FragmentActivity activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
            if (activity == null) {
                return;
            }
            Object objOnWarmupCompleted$6be8ddc4 = onWarmupCompleted$6be8ddc4(activity);
            Response response = Response.onNavigationEvent;
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(activity), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(objOnWarmupCompleted$6be8ddc4, ((SessionTrackerb.onExtraCallback) Response.onExtraCallback(activity, SessionTrackerb.onExtraCallback.class)).getSmallIconId(), activity, strOnNavigationEvent, this, setonoutofmemeryerrorcallback, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, null), 3, (Object) null);
            int i3 = onTransact + 119;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 5;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            Object[] objArr2 = new Object[1];
            a(new int[]{63, 7, 155, 0}, false, new byte[]{1, 0, 0, 1, 0, 0, 1}, objArr2);
            strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            a(new int[]{63, 7, 155, 0}, false, new byte[]{1, 0, 0, 1, 0, 0, 1}, objArr3);
            strIntern2 = ((String) objArr3[0]).intern();
            map = null;
            i = 3;
        } else {
            Object[] objArr4 = new Object[1];
            a(new int[]{63, 7, 155, 0}, true, new byte[]{1, 0, 0, 1, 0, 0, 1}, objArr4);
            strIntern = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            a(new int[]{63, 7, 155, 0}, true, new byte[]{1, 0, 0, 1, 0, 0, 1}, objArr5);
            strIntern2 = ((String) objArr5[0]).intern();
            map = null;
            i = 4;
        }
        setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern, strIntern2, map, i, (Object) null);
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char[] IAuthTabCallback = {27176, 27294, 27292, 27291, 27285, 27287, 27289, 27289, 27294, 27366, 27365, 27291, 27291, 27289, 27388, 27332, 27363, 27265, 27290, 27287, 27287, 27292, 27361, 27332, 27367, 27292, 27289, 27295, 27266, 27268, 27366, 27332, 27363, 27294, 27286, 27285, 27293, 27292, 27389, 27332, 27360, 27286, 27391, 27363, 27293, 27267, 27271, 27216, 27137, 27172, 27172, 27180, 27167, 27154, 27169, 27177, 27171, 27173, 27171, 27164, 27143, 27176, 27141, 27143, 27174, 27172, 27179, 27174, 27168, 27136, 27233, 27258, 27160, 27197, 27199, 27199, 27197, 27173, 27172, 27196, 27194, 27237, 27154, 27158, 27152, 27199, 27154, 27152, 27198, 27168, 27197, 27197, 27173, 27170, 27194, 27197, 27198, 27259, 27172, 27175, 27196, 27173, 27181};
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ setOnOutOfMemeryErrorCallback $callbackProxy;
        final /* synthetic */ r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ $contentOwner;
        final /* synthetic */ String $m200;
        final /* synthetic */ Object $mobileIdManager;
        final /* synthetic */ SessionTrackerb $tossRouter;
        int label;
        final /* synthetic */ KeySpecificInfo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(Object obj, SessionTrackerb sessionTrackerb, FragmentActivity fragmentActivity, String str, KeySpecificInfo keySpecificInfo, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$mobileIdManager = obj;
            this.$tossRouter = sessionTrackerb;
            this.$activity = fragmentActivity;
            this.$m200 = str;
            this.this$0 = keySpecificInfo;
            this.$callbackProxy = setonoutofmemeryerrorcallback;
            this.$contentOwner = r8lambdakrhaimf1bm5cgjbilhp45vln_xq;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$mobileIdManager, this.$tossRouter, this.$activity, this.$m200, this.this$0, this.$callbackProxy, this.$contentOwner, access13800Var);
            int i2 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 75;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 76 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 49;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 53 / 0;
            }
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00f8, code lost:
        
            if (r0 == null) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0115, code lost:
        
            if (r0 == null) goto L29;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 479
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.KeySpecificInfo.onExtraCallback.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i;
            int i2 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr = IAuthTabCallback;
            long j = 0;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $10 + 65;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 34, 14239 - View.MeasureSpec.getSize(0), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i7++;
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i4];
            System.arraycopy(cArr, i3, cArr3, 0, i4);
            if (bArr != null) {
                char[] cArr4 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    int i10 = $11 + 97;
                    $10 = i10 % 128;
                    if (i10 % 2 == 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 0) {
                        int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), 30 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 17657 - ExpandableListView.getPackedPositionType(0L), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10934 - TextUtils.lastIndexOf("", '0')), 65 - Drawable.resolveOpacity(0, 0), 16718 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16727749) - Color.rgb(0, 0, 0)), 69 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 12486 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                int i13 = $10 + 39;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                cArr3 = cArr4;
            }
            if (i6 > 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 0, cArr5, 0, i4);
                int i15 = i4 - i6;
                System.arraycopy(cArr5, 0, cArr3, i15, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i15);
            }
            if (z) {
                int i16 = $11 + 79;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                char[] cArr6 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    int i18 = $10 + 7;
                    $11 = i18 % 128;
                    if (i18 % 2 == 0) {
                        cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[i4 >> trackGroupExternalSyntheticLambda0.onNavigationEvent];
                        i = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    } else {
                        cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                        i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                    }
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
                }
                cArr3 = cArr6;
            }
            if (i5 > 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    int i19 = $11 + 71;
                    $10 = i19 % 128;
                    int i20 = i19 % 2;
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr3);
        }
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 119;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45813 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 83 - TextUtils.lastIndexOf("", '0', 0), Color.red(0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (KeyEvent.getMaxKeyCode() >> 16) + 19, 8808 - View.getDefaultSize(0, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $10 + 21;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    public void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) throws Throwable {
        String string;
        boolean z;
        String str2;
        String strIntern;
        Object obj;
        byte[] byteArray;
        Object obj2;
        Object obj3;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        if (i2 != -1) {
            int i4 = onTransact + 89;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            if (i2 != 1001) {
                Object[] objArr = new Object[1];
                a(new int[]{37, 8, 180, 7}, false, new byte[]{1, 1, 1, 0, 1, 1, 1, 1}, objArr);
                String strIntern2 = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                a(new int[]{37, 8, 180, 7}, false, new byte[]{1, 1, 1, 0, 1, 1, 1, 1}, objArr2);
                setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern2, ((String) objArr2[0]).intern(), (Map) null, 4, (Object) null);
                return;
            }
            Object[] objArr3 = new Object[1];
            b(new char[]{33797, 33879, 35674, 15669, 32310, 4659, 3451, 12112, 23784, 1499, 15006, 63000, 13585, 60543, 25540, 57078, 3490, 52022, 34869, 41305, 59130, 37845, 45210, 34860, 48926, 31356}, Color.rgb(0, 0, 0) + 16777216, objArr3);
            String strIntern3 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            b(new char[]{33797, 33879, 35674, 15669, 32310, 4659, 3451, 12112, 23784, 1499, 15006, 63000, 13585, 60543, 25540, 57078, 3490, 52022, 34869, 41305, 59130, 37845, 45210, 34860, 48926, 31356}, View.resolveSize(0, 0), objArr4);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern3, ((String) objArr4[0]).intern(), (Map) null, 4, (Object) null);
            return;
        }
        String string2 = null;
        if (bundle != null) {
            Object[] objArr5 = new Object[1];
            b(new char[]{35481, 35581, 31561, 52482, 53566, 48414, 33079, 41768, 21102, 62959, 38331, 31329, 15276}, Process.myTid() >> 22, objArr5);
            string = bundle.getString(((String) objArr5[0]).intern());
        } else {
            string = null;
        }
        if (string == null) {
            int i6 = IAuthTabCallbackDefault + 17;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            string = "";
        }
        if (bundle != null) {
            Object[] objArr6 = new Object[1];
            a(new int[]{45, 7, 77, 4}, false, new byte[]{0, 0, 0, 0, 0, 0, 0}, objArr6);
            z = bundle.getBoolean(((String) objArr6[0]).intern(), false);
        } else {
            z = false;
        }
        if (bundle != null) {
            Object[] objArr7 = new Object[1];
            b(new char[]{12122, 12095, 427, 47091, 2589, 26171, 57702, 50039, 63360, 36646, 20108, 6693, 40569, 26274, 6104, 13007, 42695}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr7);
            str2 = bundle.getString(((String) objArr7[0]).intern());
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        if (z) {
            if (bundle != null) {
                int i8 = onTransact + 31;
                IAuthTabCallbackDefault = i8 % 128;
                if (i8 % 2 != 0) {
                    Object[] objArr8 = new Object[1];
                    b(new char[]{27771, 27679, 46275, 648, 64144, 38576, 59637, 51946}, ViewConfiguration.getScrollBarFadeDuration() - 6, objArr8);
                    obj3 = objArr8[0];
                } else {
                    Object[] objArr9 = new Object[1];
                    b(new char[]{27771, 27679, 46275, 648, 64144, 38576, 59637, 51946}, ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr9);
                    obj3 = objArr9[0];
                }
                string2 = bundle.getString(((String) obj3).intern());
            }
            String str3 = string2 != null ? string2 : "";
            if (str3.length() > 0) {
                ALCFaceBox.onExtraCallback(setonoutofmemeryerrorcallback, str3);
                return;
            }
            if (str2.length() == 0) {
                Object[] objArr10 = new Object[1];
                a(new int[]{52, 7, 18, 0}, false, new byte[]{0, 1, 0, 0, 1, 0, 0}, objArr10);
                str2 = ((String) objArr10[0]).intern();
            }
            Object[] objArr11 = new Object[1];
            a(new int[]{52, 7, 18, 0}, false, new byte[]{0, 1, 0, 0, 1, 0, 0}, objArr11);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, str2, ((String) objArr11[0]).intern(), (Map) null, 4, (Object) null);
            return;
        }
        Object[] objArr12 = new Object[1];
        b(new char[]{29276, 29246, 49814, 29893, 37178, 64794, 2174, 10853}, Drawable.resolveOpacity(0, 0), objArr12);
        if (Intrinsics.areEqual(string, ((String) objArr12[0]).intern())) {
            if (bundle != null) {
                int i9 = onTransact + 93;
                IAuthTabCallbackDefault = i9 % 128;
                if (i9 % 2 != 0) {
                    Object[] objArr13 = new Object[1];
                    b(new char[]{27771, 27679, 46275, 648, 64144, 38576, 59637, 51946}, View.MeasureSpec.getSize(1), objArr13);
                    obj2 = objArr13[0];
                } else {
                    Object[] objArr14 = new Object[1];
                    b(new char[]{27771, 27679, 46275, 648, 64144, 38576, 59637, 51946}, View.MeasureSpec.getSize(0), objArr14);
                    obj2 = objArr14[0];
                }
                byteArray = bundle.getByteArray(((String) obj2).intern());
            } else {
                byteArray = null;
            }
            if (byteArray != null) {
                string2 = new String(byteArray, Charsets.UTF_8);
            }
        } else if (bundle != null) {
            int i10 = onTransact + 81;
            IAuthTabCallbackDefault = i10 % 128;
            int i11 = i10 % 2;
            Object[] objArr15 = new Object[1];
            b(new char[]{27771, 27679, 46275, 648, 64144, 38576, 59637, 51946}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, objArr15);
            string2 = bundle.getString(((String) objArr15[0]).intern());
        }
        if (string2 != null) {
            byte[] bArrDecode = Base64.decode(string2, 8);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
            str2 = new String(bArrDecode, Charsets.UTF_8);
        }
        if (str2.length() == 0) {
            int i12 = IAuthTabCallbackDefault + 95;
            onTransact = i12 % 128;
            if (i12 % 2 == 0) {
                Object[] objArr16 = new Object[1];
                b(new char[]{45326, 45384, 64967, 19372, 30223, 6674, 21315, 29041, 27107, 29521}, 1 << (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr16);
                obj = objArr16[0];
            } else {
                Object[] objArr17 = new Object[1];
                b(new char[]{45326, 45384, 64967, 19372, 30223, 6674, 21315, 29041, 27107, 29521}, 1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr17);
                obj = objArr17[0];
            }
            strIntern = ((String) obj).intern();
        } else {
            strIntern = str2;
        }
        Object[] objArr18 = new Object[1];
        b(new char[]{45326, 45384, 64967, 19372, 30223, 6674, 21315, 29041, 27107, 29521}, TextUtils.getCapsMode("", 0, 0), objArr18);
        setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern, ((String) objArr18[0]).intern(), (Map) null, 4, (Object) null);
    }

    private final Intent onExtraCallback(Context context, String str) throws Throwable {
        Pair pairIAuthTabCallback;
        int i = 2 % 2;
        if (!onExtraCallbackWithResult(context)) {
            Object[] objArr = new Object[1];
            b(new char[]{17140, 17049, 16925, 62552, 9785, 18959, 17057, 24758, 39472, 52394, 25260, 47587}, ViewConfiguration.getJumpTapTimeout() >> 16, objArr);
            pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), (Object) null);
            int i2 = onTransact + 109;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = IAuthTabCallbackDefault + 69;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr2 = new Object[1];
            b(new char[]{36245, 36344, 29404, 50329, 18117, 10995, 29309, 20586, 21841, 64619, 592, 35135, 15523, 5585}, (-1) - TextUtils.lastIndexOf("", '0', 0, 0), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            b(new char[]{9818, 9785, 14049, 32932, 28614, 1023, 3237, 12021, 65153, 47186, 11095, 63472, 38783, 20981, 29189, 57157, 44995, 30381, 39406, 41121, 17557, 11842, 41302, 35221, 7521, 51168, 51251, 20741, 13784, 64666, 61423, 15022, 51893, 37964, 14168, 984}, ViewConfiguration.getWindowTouchSlop() >> 8, objArr3);
            pairIAuthTabCallback = getWrite.IAuthTabCallback(strIntern, ((String) objArr3[0]).intern());
        }
        String str2 = (String) pairIAuthTabCallback.onExtraCallbackWithResult();
        String str3 = (String) pairIAuthTabCallback.IAuthTabCallback();
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        Object[] objArr4 = new Object[1];
        a(new int[]{16, 15, 0, 14}, true, new byte[]{1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1}, objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(str);
        Uri uri = Uri.parse(sb.toString());
        Object[] objArr5 = new Object[1];
        a(new int[]{31, 6, 142, 6}, true, new byte[]{1, 1, 1, 1, 1, 1}, objArr5);
        Intent intent = new Intent(((String) objArr5[0]).intern(), uri).setPackage(str3);
        Intrinsics.checkNotNullExpressionValue(intent, "");
        return intent;
    }

    private final boolean onExtraCallbackWithResult(Context context) throws Throwable {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        a(new int[]{31, 6, 142, 6}, true, new byte[]{1, 1, 1, 1, 1, 1}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(new char[]{56901, 56872, 27339, 56462, 5377, 31031, 1070, 9785, 1665, 58492, 20884, 65388, 28531, 3526, 2207, 55247, 22418, 10911, 58152, 43050, 48268, 29287, 56204}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, objArr2);
        Intent intent = new Intent(strIntern, Uri.parse(((String) objArr2[0]).intern()));
        Object[] objArr3 = new Object[1];
        b(new char[]{9818, 9785, 14049, 32932, 28614, 1023, 3237, 12021, 65153, 47186, 11095, 63472, 38783, 20981, 29189, 57157, 44995, 30381, 39406, 41121, 17557, 11842, 41302, 35221, 7521, 51168, 51251, 20741, 13784, 64666, 61423, 15022, 51893, 37964, 14168, 984}, TextUtils.indexOf("", ""), objArr3);
        intent.setPackage(((String) objArr3[0]).intern());
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            int i2 = IAuthTabCallbackDefault + 71;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = IAuthTabCallbackDefault + 47;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private final Object onWarmupCompleted$6be8ddc4(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 89;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return ((BigDataLiteService) Response.onExtraCallback(context, BigDataLiteService.class)).getActiveNotifications$60b4c886();
        }
        ((BigDataLiteService) Response.onExtraCallback(context, BigDataLiteService.class)).getActiveNotifications$60b4c886();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = onNavigationEvent;
        if (cArr2 != null) {
            int i7 = $11 + 83;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 69;
                $10 = i9 % 128;
                if (i9 % i != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - View.combineMeasuredStates(0, 0)), 35 - Drawable.resolveOpacity(0, 0), Process.getGidForName("") + 14240, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i8])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 35 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 14240 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr[i8] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8++;
                }
                i = 2;
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr2, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = $10 + 19;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 10935), Drawable.resolveOpacity(0, 0) + 65, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), TextUtils.getCapsMode("", 0, 0) + 29, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 17656, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 49467), 70 - (ViewConfiguration.getPressedStateDuration() >> 16), 12486 - Gravity.getAbsoluteGravity(0, 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i14 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i14, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i14);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            int i15 = $11 + 95;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i17 = $11 + 111;
                $10 = i17 % 128;
                int i18 = i17 % 2;
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void IAuthTabCallback() {
        onNavigationEvent = new char[]{27154, 27391, 27388, 27380, 27383, 27384, 27366, 27372, 27344, 27370, 27385, 27372, 27370, 27384, 27386, 27383, 27262, 27172, 27172, 27180, 27167, 27154, 27169, 27177, 27171, 27173, 27171, 27164, 27233, 27258, 27253, 27341, 27315, 27323, 27317, 27319, 27317, 27188, 27317, 27314, 27318, 27314, 27314, 27318, 27321, 27158, 27391, 27383, 27278, 27278, 27279, 27383, 27262, 27182, 27175, 27174, 27164, 27146, 27148, 27265, 27356, 27356, 27354, 27179, 27269, 27266, 27284, 27327, 27324, 27303};
        onWarmupCompleted = 7603479000592796966L;
    }
}
