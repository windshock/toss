package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzgsa;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;
import java.util.WeakHashMap;
import kotlin.Deprecated;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.pedometer.StepCountServiceHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CryptoException implements ALCFaceQuality {
    public static final onExtraCallback Companion;
    private static final WeakHashMap<r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, deserializeUriNullableCollection> IAuthTabCallback;
    private static byte[] IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy;
    private static short[] asInterface;
    private static int[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {15, -112, -70, -94};
    private static final int $$b = 36;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 0;
    private static int asBinder = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, short r8) {
        /*
            int r7 = r7 * 4
            int r7 = 115 - r7
            int r8 = r8 * 3
            int r8 = r8 + 4
            int r6 = r6 * 3
            int r0 = r6 + 1
            byte[] r1 = o.CryptoException.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L29:
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CryptoException.$$c(int, int, short):java.lang.String");
    }

    public static /* synthetic */ boolean IAuthTabCallback(String str, String str2) {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(str, str2);
        int i4 = onTransact + 91;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onWarmupCompleted(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Pair pair) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(setonoutofmemeryerrorcallback, pair);
        if (i3 == 0) {
            int i4 = 95 / 0;
        }
        int i5 = onTransact + 91;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq) {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
        int i4 = asBinder + 11;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = asBinder + 5;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = onTransact + 105;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.drawTextBox*/.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i3 = asBinder + 17;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.drawTextBox*/.onNavigationEvent();
        }
        super/*o.drawTextBox*/.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        if (i3 != 0) {
            int i4 = 48 / 0;
        }
        int i5 = onTransact + 87;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return aLCFaceValidationOnWarmupCompleted;
        }
        throw null;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onTransact + 87;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new StepCountServiceHandler$.ExternalSyntheticLambda2());
        int i2 = onTransact + 35;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return iAuthTabCallback;
        }
        throw null;
    }

    private static final boolean onWarmupCompleted(String str, String str2) {
        int i = 2 % 2;
        int i2 = asBinder + 61;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        boolean zIAuthTabCallback = filterCreatePageParams.IAuthTabCallback(Uri.parse(str));
        int i4 = onTransact + 9;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback;
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Object[] objArr = new Object[1];
        b((byte) (TextUtils.indexOf("", "") - 69), (short) (45 - MotionEvent.axisFromString("")), (-1630245044) - TextUtils.indexOf("", "", 0), Color.rgb(0, 0, 0) + 16777193, TextUtils.indexOf("", "", 0) - 150038400, objArr);
        Object obj = null;
        if (Intrinsics.areEqual(str, ((String) objArr[0]).intern())) {
            onNavigationEvent(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback);
            int i4 = onTransact + 121;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = new Object[1];
        b((byte) (122 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (short) ((-42) - Color.blue(0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1630245023, (-25) - TextUtils.lastIndexOf("", '0', 0, 0), (-150038400) - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr2);
        if (Intrinsics.areEqual(str, ((String) objArr2[0]).intern())) {
            int i5 = asBinder + 119;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback);
            if (i6 != 0) {
                throw null;
            }
        }
    }

    private static final void IAuthTabCallback(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq) {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback.remove(r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
        int i4 = asBinder + 53;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onNavigationEvent(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Pair pair) throws Throwable {
        int i = 2 % 2;
        int iIntValue = ((Number) pair.onExtraCallbackWithResult()).intValue();
        Calendar calendar = (Calendar) pair.IAuthTabCallback();
        JsonObject jsonObject = new JsonObject();
        GuardedAsyncTask guardedAsyncTask = GuardedAsyncTask.IAuthTabCallback;
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "");
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        String str = (String) GuardedAsyncTask.onExtraCallback(iOnWarmupCompleted, -1654718401, zzgsa.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, new Object[]{guardedAsyncTask, time}, 1654718408);
        Object[] objArr = new Object[1];
        a(new int[]{-633002127, -1254263042, 1245604398, 126492742, -284572469, -218346995}, 10 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
        jsonObject.addProperty(((String) objArr[0]).intern(), Integer.valueOf(iIntValue));
        Object[] objArr2 = new Object[1];
        a(new int[]{1363856287, 1596081405, 1899030139, -1817364749}, 8 - Gravity.getAbsoluteGravity(0, 0), objArr2);
        jsonObject.addProperty(((String) objArr2[0]).intern(), str);
        ALCFaceBox.onWarmupCompleted(setonoutofmemeryerrorcallback, jsonObject);
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 51;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private final void onNavigationEvent(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            WeakHashMap<r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, deserializeUriNullableCollection> weakHashMap = IAuthTabCallback;
            deserializeUriNullableCollection deserializeurinullablecollection = weakHashMap.get(r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
            if (deserializeurinullablecollection != null) {
                zzbr.onWarmupCompleted(deserializeurinullablecollection);
            }
            isExpired isexpiredOnExtraCallbackWithResult = GuardedAsyncTask.IAuthTabCallback.onExtraCallbackWithResult();
            JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = JsonReaderUnknownNumberParsing.onNavigationEvent(JsonReaderUnknownNumberParsing.onExtraCallback(getWrite.IAuthTabCallback(Integer.valueOf(isexpiredOnExtraCallbackWithResult.onExtraCallback()), isexpiredOnExtraCallbackWithResult.onNavigationEvent())), GuardedRunnable.onExtraCallbackWithResult.IAuthTabCallback().IAuthTabCallback(wasNull.LATEST)).asInterface().IAuthTabCallback(new StepCountServiceHandler$.ExternalSyntheticLambda0(r8lambdakrhaimf1bm5cgjbilhp45vln_xq)).onWarmupCompleted(NetConverter3.onExtraCallback());
            Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
            weakHashMap.put(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, IconRoundCornerProgressBarSavedState.IAuthTabCallback(setMessageBytes.onNavigationEvent(jsonReaderUnknownNumberParsingOnWarmupCompleted, (Function1) null, (Function0) null, new StepCountServiceHandler$.ExternalSyntheticLambda1(setonoutofmemeryerrorcallback), 3, (Object) null), r8lambdakrhaimf1bm5cgjbilhp45vln_xq));
            onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
            int i3 = asBinder + 7;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        IAuthTabCallback.get(r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
        throw null;
    }

    private final void onExtraCallback(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        deserializeUriNullableCollection deserializeurinullablecollectionRemove = IAuthTabCallback.remove(r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
        if (deserializeurinullablecollectionRemove != null) {
            int i4 = onTransact + 51;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            zzbr.onWarmupCompleted(deserializeurinullablecollectionRemove);
        }
        setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, (Function1) null, 1, (Object) null);
        int i6 = asBinder + 11;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
    }

    private final void onExtraCallback(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq) {
        int i = 2 % 2;
        int i2 = asBinder + 29;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context != null && GuardedAsyncTask.IAuthTabCallback.IAuthTabCallbackDefault(context)) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(r8lambdakrhaimf1bm5cgjbilhp45vln_xq), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(context, null), 3, (Object) null);
            int i4 = asBinder + 23;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = asBinder + 17;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static char[] onExtraCallbackWithResult = {27343, 27470, 27280, 27381, 27309, 27462, 27464, 27464, 27282, 27287, 27471, 27462, 27462, 27460, 27458, 27464, 27469, 27471, 27314, 27316, 27312, 27466, 27280, 27308, 27463, 27281, 27381, 27306, 27469, 27466, 27458, 27463, 27471, 27280, 27381, 27287, 27317, 27315, 27468, 27462, 27469, 27284, 27381, 27310, 27469, 27460, 27460, 27219, 27267, 27381, 27284, 27267, 27282, 27288, 27283, 27289, 27365, 27286, 27267, 27282, 27381, 27282, 27284, 27271, 27282, 27285, 27267, 27269, 27295, 27280, 27284};
        private static int onNavigationEvent = 1;
        final /* synthetic */ Context $context;
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(Context context, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$context = context;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 1;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 37;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$context, access13800Var);
            int i2 = onNavigationEvent + 103;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onnavigationevent;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 99;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 13;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 88 / 0;
            }
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objIAuthTabCallback;
            String str;
            long j;
            doInBackgroundGuarded doinbackgroundguarded;
            int iIntValue;
            String localizedMessage;
            Object obj2;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onNavigationEvent + 31;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a(new int[]{0, 47, 152, 18}, false, new byte[]{1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1}, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                long j2 = this.J$0;
                String str2 = (String) this.L$1;
                ResultKt.onNavigationEvent(obj);
                j = j2;
                str = str2;
                objIAuthTabCallback = obj;
            } else {
                ResultKt.onNavigationEvent(obj);
                GuardedAsyncTask guardedAsyncTask = GuardedAsyncTask.IAuthTabCallback;
                int iIntValue2 = ((Integer) GuardedAsyncTask.onExtraCallback(zzgsa.onWarmupCompleted(), 339510305, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{guardedAsyncTask, null, 1, null}, -339510300)).intValue();
                Date time = JSBundleLoaderCompanioncreateAssetLoader1.onExtraCallbackWithResult.onNavigationEvent().getTime();
                Intrinsics.checkNotNullExpressionValue(time, "");
                String str3 = (String) GuardedAsyncTask.onExtraCallback(zzgsa.onWarmupCompleted(), -1654718401, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{guardedAsyncTask, time}, 1654718408);
                long jOnWarmupCompleted = doInBackgroundGuarded.onWarmupCompleted.onWarmupCompleted();
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                Object[] objArr2 = new Object[1];
                a(new int[]{47, 1, 0, 0}, true, new byte[]{0}, objArr2);
                sb.append(((String) objArr2[0]).intern());
                sb.append(iIntValue2);
                String string = sb.toString();
                GeckoHubImp1 geckoHubImp1OnExtraCallbackWithResult = createFileLoader.onExtraCallbackWithResult(createFileLoader.onExtraCallbackWithResult, this.$context, iIntValue2, str3, (JSInstance) null, 8, (Object) null);
                this.L$0 = access15400.onNavigationEvent(str3);
                this.L$1 = string;
                this.I$0 = iIntValue2;
                this.J$0 = jOnWarmupCompleted;
                this.label = 1;
                objIAuthTabCallback = geckoHubImp1OnExtraCallbackWithResult.IAuthTabCallback(this);
                if (objIAuthTabCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                str = string;
                j = jOnWarmupCompleted;
            }
            Throwable th = Result.exceptionOrNull-impl(((Result) objIAuthTabCallback).onNavigationEvent());
            if (th != null) {
                int i5 = onExtraCallback + 65;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    doinbackgroundguarded = doInBackgroundGuarded.onWarmupCompleted;
                    iIntValue = ((Integer) GuardedAsyncTask.onExtraCallback(zzgsa.onWarmupCompleted(), 339510305, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{GuardedAsyncTask.IAuthTabCallback, null, 1, null}, -339510300)).intValue();
                    localizedMessage = th.getLocalizedMessage();
                    Object[] objArr3 = new Object[1];
                    a(new int[]{48, 23, 104, 18}, false, null, objArr3);
                    obj2 = objArr3[0];
                } else {
                    doinbackgroundguarded = doInBackgroundGuarded.onWarmupCompleted;
                    iIntValue = ((Integer) GuardedAsyncTask.onExtraCallback(zzgsa.onWarmupCompleted(), 339510305, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{GuardedAsyncTask.IAuthTabCallback, null, 1, null}, -339510300)).intValue();
                    localizedMessage = th.getLocalizedMessage();
                    Object[] objArr4 = new Object[1];
                    a(new int[]{48, 23, 104, 18}, true, null, objArr4);
                    obj2 = objArr4[0];
                }
                doinbackgroundguarded.onNavigationEvent(j, ((String) obj2).intern(), iIntValue, str, localizedMessage);
            }
            return Unit.INSTANCE;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr = onExtraCallbackWithResult;
            char c = '0';
            Throwable th = null;
            if (cArr != null) {
                int i6 = $10 + 43;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i8 = 0;
                while (i8 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35331 - AndroidCharacter.getMirror(c)), 35 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-16762977) - Color.rgb(0, 0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i8++;
                        c = '0';
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                int i9 = $10 + 117;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                cArr = cArr2;
            }
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr, i2, cArr3, 0, i3);
            if (bArr != null) {
                char[] cArr4 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c2 = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1) {
                        int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29, ExpandableListView.getPackedPositionGroup(0L) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } else {
                        int i12 = $10 + 85;
                        $11 = i12 % 128;
                        if (i12 % 2 == 0) {
                            int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 10935), Color.green(0) + 65, TextUtils.getTrimmedLength("") + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(th, objArr4)).charValue();
                            throw th;
                        }
                        int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 'q' - AndroidCharacter.getMirror('0'), 16718 - TextUtils.indexOf("", "", 0, 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    }
                    c2 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 49468), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 70, 12486 - KeyEvent.getDeadChar(0, 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                    th = null;
                }
                cArr3 = cArr4;
            }
            if (i5 > 0) {
                int i15 = $11 + 121;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    char[] cArr5 = new char[i3];
                    System.arraycopy(cArr3, 1, cArr5, 1, i3);
                    System.arraycopy(cArr5, 1, cArr3, i3 * i5, i5);
                    System.arraycopy(cArr5, i5, cArr3, 1, i3 - i5);
                } else {
                    char[] cArr6 = new char[i3];
                    System.arraycopy(cArr3, 0, cArr6, 0, i3);
                    int i16 = i3 - i5;
                    System.arraycopy(cArr6, 0, cArr3, i16, i5);
                    System.arraycopy(cArr6, i5, cArr3, 0, i16);
                }
            }
            if (z) {
                int i17 = $11 + 85;
                $10 = i17 % 128;
                int i18 = i17 % 2;
                char[] cArr7 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr3 = cArr7;
            }
            if (i4 > 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr3);
        }
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    static {
        IAuthTabCallbackStubProxy = 1;
        IAuthTabCallback();
        Companion = new onExtraCallback(null);
        IAuthTabCallback = new WeakHashMap<>();
        int i = IAuthTabCallbackDefault + 25;
        IAuthTabCallbackStubProxy = i % 128;
        int i2 = i % 2;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onExtraCallback;
        int i4 = -1469660336;
        float f = 0.0f;
        int i5 = 1;
        int i6 = 0;
        if (iArr3 != null) {
            int i7 = $11 + 31;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 27;
                $10 = i9 % 128;
                if (i9 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i8])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)) - 1), (ViewConfiguration.getPressedStateDuration() >> 16) + 72, ExpandableListView.getPackedPositionType(0L) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr2[i8] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i8 /= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(iArr3[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), View.resolveSizeAndState(0, 0, 0) + 72, TextUtils.indexOf((CharSequence) "", '0') + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr2[i8] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i8++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i2 = 2;
                f = 0.0f;
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallback;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                int i11 = $11 + 123;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    try {
                        Object[] objArr4 = new Object[i5];
                        objArr4[i6] = Integer.valueOf(iArr5[i10]);
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback3 == null) {
                            char c = (char) (TypedValue.complexToFloat(i6) > 0.0f ? 1 : (TypedValue.complexToFloat(i6) == 0.0f ? 0 : -1));
                            int i12 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 71;
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 8848;
                            Class[] clsArr = new Class[i5];
                            clsArr[0] = Integer.TYPE;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c, i12, longPressTimeout, -1725547072, false, "h", clsArr);
                        }
                        iArr6[i10] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        i6 = 0;
                        i4 = -1469660336;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } else {
                    Object[] objArr5 = new Object[i5];
                    objArr5[0] = Integer.valueOf(iArr5[i10]);
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 72 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 8847 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    i10++;
                    i6 = 0;
                    i4 = -1469660336;
                    i5 = 1;
                }
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, i6, iArr4, i6, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i6;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i13 = $10 + 19;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 22252), 39 - Color.alpha(0), 10300 - TextUtils.indexOf((CharSequence) "", '0', 0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i15++;
                int i17 = $10 + 13;
                $11 = i17 % 128;
                int i18 = i17 % 2;
            }
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i19;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i21 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4032 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), Color.red(0) + 78, 7398 - TextUtils.getTrimmedLength(""), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
            int i22 = $11 + 113;
            $10 = i22 % 128;
            int i23 = i22 % 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01aa A[PHI: r0
      0x01aa: PHI (r0v9 int) = (r0v8 int), (r0v44 int) binds: [B:43:0x01a8, B:40:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ac A[PHI: r0
      0x01ac: PHI (r0v41 int) = (r0v8 int), (r0v44 int) binds: [B:43:0x01a8, B:40:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r24, short r25, int r26, int r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CryptoException.b(byte, short, int, int, int, java.lang.Object[]):void");
    }

    static void IAuthTabCallback() {
        onExtraCallback = new int[]{1958705605, -1555845196, 1755109248, -1300948384, -2562133, -74901333, -787370763, 2867943, -1154991994, 1208918069, -1919817454, 1751099501, -1880299935, -13249047, 620778753, 920473566, -1495739229, -2038909127};
        onExtraCallbackWithResult = -982759236;
        onWarmupCompleted = -1538795482;
        onNavigationEvent = -1397309445;
        IAuthTabCallbackStub = new byte[]{-125, 27, 18, -103, Byte.MIN_VALUE, 115, 36, Byte.MIN_VALUE, 20, -121, 28, -121, 97, 50, -118, 20, 100, 62, -125, 116, 32, -124, -83, -91, -68, -81, -106, -99, -54, -106, -70, -95, -94, -95, 119, -36, -108, -70, -118, -52, -86, -92, -86, 8, 8};
    }
}
