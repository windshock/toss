package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getBaseCertificateID implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static final String onExtraCallbackWithResult;
    private static int onNavigationEvent = 1;
    private static int onTransact = 1;
    private static char[] onWarmupCompleted;

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new int[]{0, 31, 41, 0}, false, new byte[]{0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        Companion = new IAuthTabCallback(null);
        int i = onNavigationEvent + 113;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public static final /* synthetic */ Object onExtraCallback(getBaseCertificateID getbasecertificateid, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = getbasecertificateid.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, access13800Var);
        int i4 = onTransact + 63;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return objOnWarmupCompleted;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i4 = onExtraCallback + 37;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return onoutofmemoryOnExtraCallback;
        }
        throw null;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onTransact + 69;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = onExtraCallback + 25;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 60 / 0;
        }
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        super/*o.drawTextBox*/.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = onExtraCallback + 27;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onTransact + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = onExtraCallback + 3;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 81;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = onExtraCallback + 65;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(r8lambdakrhaimf1bm5cgjbilhp45vln_xq), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback, null), 3, (Object) null);
        int i2 = onTransact + 89;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static long onExtraCallback = 45740089126649960L;
        private static int onWarmupCompleted;
        final /* synthetic */ setOnOutOfMemeryErrorCallback $callbackProxy;
        final /* synthetic */ r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ $contentOwner;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$contentOwner = r8lambdakrhaimf1bm5cgjbilhp45vln_xq;
            this.$callbackProxy = setonoutofmemeryerrorcallback;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = getBaseCertificateID.this.new onNavigationEvent(this.$contentOwner, this.$callbackProxy, access13800Var);
            int i2 = onWarmupCompleted + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            onWarmupCompleted(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 3;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                getBaseCertificateID getbasecertificateid = getBaseCertificateID.this;
                r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq = this.$contentOwner;
                this.label = 1;
                obj = getBaseCertificateID.onExtraCallback(getbasecertificateid, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, this);
                if (obj == objOnWarmupCompleted) {
                    int i3 = onWarmupCompleted + 5;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            } else {
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a(new char[]{29127, 59711, 29092, 59777, 60509, 4666, 7973, 7709, 40055, 447, 3510, 13249, 43712, 16329, 14348, 8546, 47362, 11590, 22172, 22182, 51111, 22777, 17644, 17495, 53880, 30329, 29564, 31105, 57472, 26002, 25031, 28583, 3928, 37632, 40028, 40294, 7527, 36524, 35488, 45701, 11199, 48235, 47418, 40974, 13845, 43604, 55196, 54757, 17566, 55749, 49692}, 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.$callbackProxy;
            JsonObject jsonObject = new JsonObject();
            Object[] objArr2 = new Object[1];
            a(new char[]{57762, 59867, 57799, 51996, 53069, 4817, 15797, 15619, 3166, 330, 12064}, ViewConfiguration.getDoubleTapTimeout() >> 16, objArr2);
            jsonObject.addProperty(((String) objArr2[0]).intern(), access14000.onNavigationEvent(zBooleanValue));
            ALCFaceBox.onWarmupCompleted(setonoutofmemeryerrorcallback, jsonObject);
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 119;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            int i3 = $10 + 103;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (ViewConfiguration.getScrollBarSize() >> 8)), 84 - (ViewConfiguration.getWindowTouchSlop() >> 8), 21233 - (ViewConfiguration.getTouchSlop() >> 8), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 14186), 20 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), TextUtils.indexOf("", "") + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
            int i6 = $10 + 103;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            objArr[0] = str;
        }
    }

    static final class onExtraCallbackWithResult implements Function1<LocationSettingsResponse, Unit> {
        final /* synthetic */ maybeRemoveAttachStateListener<Boolean> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallbackWithResult(maybeRemoveAttachStateListener<? super Boolean> mayberemoveattachstatelistener) {
            this.onWarmupCompleted = mayberemoveattachstatelistener;
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallbackWithResult((LocationSettingsResponse) obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallbackWithResult(LocationSettingsResponse locationSettingsResponse) {
            maybeRemoveAttachStateListener<Boolean> mayberemoveattachstatelistener = this.onWarmupCompleted;
            Result.Companion companion = Result.Companion;
            mayberemoveattachstatelistener.resumeWith(Result.constructor-impl(Boolean.TRUE));
        }
    }

    static final class onWarmupCompleted implements OnFailureListener {
        final /* synthetic */ maybeRemoveAttachStateListener<Boolean> onExtraCallbackWithResult;
        private static final byte[] $$a = {113, 66, 51, 67};
        private static final int $$b = 150;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onWarmupCompleted = 0;
        private static int IAuthTabCallbackStub = 1;
        private static long onExtraCallback = -8548803675715583569L;
        private static int IAuthTabCallback = -1776194565;
        private static char onNavigationEvent = 27643;

        /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r6, int r7, int r8) {
            /*
                byte[] r0 = o.getBaseCertificateID.onWarmupCompleted.$$a
                int r7 = r7 + 4
                int r6 = r6 * 4
                int r1 = r6 + 1
                int r8 = 110 - r8
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L13
                r3 = r6
                r8 = r7
                r4 = r2
                goto L2a
            L13:
                r3 = r2
            L14:
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r6) goto L1f
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L1f:
                int r3 = r3 + 1
                int r7 = r7 + 1
                r4 = r0[r7]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L2a:
                int r7 = -r7
                int r7 = r7 + r3
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getBaseCertificateID.onWarmupCompleted.$$c(int, int, int):java.lang.String");
        }

        /* JADX WARN: Multi-variable type inference failed */
        onWarmupCompleted(maybeRemoveAttachStateListener<? super Boolean> mayberemoveattachstatelistener) {
            this.onExtraCallbackWithResult = mayberemoveattachstatelistener;
        }

        public final void onFailure(Exception exc) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(exc, "");
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a((char) (11533 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (-1885582060) - (Process.myTid() >> 22), new char[]{36891, 22204, 55134, 32421, 55763, 61865, 51693, 32270, 34735, 16555, 36693, 19163, 42301, 30250, 23840, 3168, 52184, 38290, 59818, 9356, 44742, 35668, 41812, 218, 64114, 6891, 43678, 56603, 34887, 41486, 59202}, new char[]{10836, 8266, 32879, 58726}, new char[]{5189, 40013, 3471, 27437}, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 10053), ViewConfiguration.getTouchSlop() >> 8, new char[]{44028, 46711, 3576, 21794, 16511, 9599, 4452, 41567, 61233, 4097, 36164, 12035, 44182, 43601, 12417, 25440, 7105, 12307, 15390, 49780, 16000, 64159, 35096, 42635, 42080, 22440, 6980, 24686}, new char[]{10836, 8266, 32879, 58726}, new char[]{30205, 12273, 17881, 49959}, objArr2);
            ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, strIntern, ((String) objArr2[0]).intern(), exc, (Map) null, 8, (Object) null);
            maybeRemoveAttachStateListener<Boolean> mayberemoveattachstatelistener = this.onExtraCallbackWithResult;
            Result.Companion companion = Result.Companion;
            mayberemoveattachstatelistener.resumeWith(Result.constructor-impl(Boolean.FALSE));
            int i4 = onWarmupCompleted + 119;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            int i5 = $11 + 31;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i7 = $11 + 67;
                $10 = i7 % 128;
                int i8 = i7 % i3;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b - 1);
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 1), 43 - ExpandableListView.getPackedPositionType(0L), 1451 - TextUtils.getTrimmedLength(""), 228868077, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - KeyEvent.keyCodeFromString("")), View.getDefaultSize(0, 0) + 44, 1494 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1533236389, false, $$c(b3, b4, (byte) (-b4)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (KeyEvent.getMaxKeyCode() >> 16)), 50 - View.getDefaultSize(0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        i2 = 2;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45847 - MotionEvent.axisFromString("")), TextUtils.lastIndexOf("", '0') + 30, 12625 - AndroidCharacter.getMirror('0'), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    } else {
                        i2 = 2;
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallback ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    i3 = i2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
        }
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    private final Object onWarmupCompleted(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, access13800<? super Boolean> access13800Var) throws Throwable {
        Object obj;
        int i = 2 % 2;
        setResourceInternal setresourceinternal = new setResourceInternal(access14300.onWarmupCompleted(access13800Var), 1);
        setresourceinternal.onTransact();
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context == null) {
            Result.Companion companion = Result.Companion;
            setresourceinternal.resumeWith(Result.constructor-impl(access14000.onNavigationEvent(false)));
        } else {
            LocationRequest locationRequestBuild = new LocationRequest.Builder(100, 3000L).build();
            Intrinsics.checkNotNullExpressionValue(locationRequestBuild, "");
            LocationSettingsRequest locationSettingsRequestBuild = new LocationSettingsRequest.Builder().addLocationRequest(locationRequestBuild).build();
            Intrinsics.checkNotNullExpressionValue(locationSettingsRequestBuild, "");
            try {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(LocationServices.getSettingsClient(context).checkLocationSettings(locationSettingsRequestBuild).addOnSuccessListener(new OnSuccessListener(new onExtraCallbackWithResult(setresourceinternal)) { // from class: o.getBaseCertificateID.onExtraCallback
                    private final /* synthetic */ Function1 onNavigationEvent;

                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.onNavigationEvent = function1;
                    }

                    public final /* synthetic */ void onSuccess(Object obj2) {
                        this.onNavigationEvent.invoke(obj2);
                    }
                }).addOnFailureListener(new onWarmupCompleted(setresourceinternal)));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                int i2 = onExtraCallback + 65;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Object[] objArr = new Object[1];
                a(new int[]{0, 31, 41, 0}, false, new byte[]{0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                a(new int[]{31, 28, 0, 0}, true, new byte[]{0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1}, objArr2);
                ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, strIntern, ((String) objArr2[0]).intern(), th2, (Map) null, 8, (Object) null);
                Result.Companion companion4 = Result.Companion;
                setresourceinternal.resumeWith(Result.constructor-impl(access14000.onNavigationEvent(false)));
            }
        }
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14300.onWarmupCompleted()) {
            access14600.IAuthTabCallback(access13800Var);
            int i4 = onTransact + 61;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        return objIAuthTabCallbackDefault;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        char[] cArr;
        int length;
        char[] cArr2;
        int i2;
        int i3 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr3 = onWarmupCompleted;
        if (cArr3 != null) {
            int i8 = $10 + 117;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i2])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - TextUtils.indexOf("", "", 0, 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 35, (ViewConfiguration.getEdgeSlop() >> 16) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i2++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        char[] cArr4 = new char[i5];
        System.arraycopy(cArr3, i4, cArr4, 0, i5);
        if (bArr != null) {
            int i9 = $10 + 71;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                cArr = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 10935), 65 - Color.blue(0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), Color.argb(0, 0, 0, 0) + 29, 17657 - Color.green(0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), View.MeasureSpec.getSize(0) + 70, 12486 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr4 = cArr;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr4, 0, cArr5, 0, i5);
            int i12 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr4, i12, i7);
            System.arraycopy(cArr5, i7, cArr4, 0, i12);
        }
        if (z) {
            char[] cArr6 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i13 = $11 + 63;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[i5 << trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                } else {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
            cArr4 = cArr6;
        }
        if (i6 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i14 = $10 + 57;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = new char[]{27256, 27184, 27329, 27331, 27358, 27340, 27185, 27357, 27352, 27352, 27356, 27333, 27357, 27353, 27355, 27353, 27335, 27339, 27355, 27347, 27353, 27354, 27357, 27352, 27336, 27187, 27358, 27356, 27359, 27359, 27354, 27260, 27178, 27174, 27172, 27179, 27181, 27149, 27143, 27171, 27172, 27173, 27168, 27194, 27170, 27154, 27182, 27168, 27170, 27168, 27172, 27180, 27175, 27155, 27157, 27177, 27178, 27176, 27179};
    }
}
