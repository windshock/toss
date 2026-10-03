package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setExtensions implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static char[] IAuthTabCallback = null;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 0;
    private static int onExtraCallback = 0;
    private static char[] onExtraCallbackWithResult = null;
    private static final Regex onNavigationEvent;
    private static int onTransact = 1;
    private static char onWarmupCompleted;

    static final class onWarmupCompleted extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return setExtensions.onExtraCallback(setExtensions.this, (String) null, (String) null, (String) null, (byte[]) null, (Context) null, (setOnOutOfMemeryErrorCallback) null, (access13800) this);
        }
    }

    public static final /* synthetic */ Object onExtraCallback(setExtensions setextensions, String str, String str2, String str3, byte[] bArr, Context context, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 103;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = setextensions.IAuthTabCallback(str, str2, str3, bArr, context, setonoutofmemeryerrorcallback, access13800Var);
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        int i5 = IAuthTabCallbackStub + 93;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return objIAuthTabCallback;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i4 = IAuthTabCallbackStub + 59;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return onoutofmemoryOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = asInterface + 41;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        if (i5 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        boolean zOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = asInterface + 47;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
            int i3 = 9 / 0;
        } else {
            zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        int i4 = IAuthTabCallbackStub + 109;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 63 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = IAuthTabCallbackStub + 29;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = IAuthTabCallbackStub + 67;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 25;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 != 0) {
            throw null;
        }
        int i6 = asInterface + 75;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 1;
        private static long onNavigationEvent = 1460613680335707687L;
        private static int onWarmupCompleted;
        final /* synthetic */ byte[] $decodedData;
        final /* synthetic */ File $destinationFile;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(File file, byte[] bArr, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$destinationFile = file;
            this.$decodedData = bArr;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 81 / 0;
            }
            int i5 = onWarmupCompleted + 51;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$destinationFile, this.$decodedData, access13800Var);
            int i2 = onWarmupCompleted + 35;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onnavigationevent;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
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
                int i3 = $10 + 83;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), Gravity.getAbsoluteGravity(0, 0) + 24, 19627 - TextUtils.getOffsetBefore("", 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onNavigationEvent ^ 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 59 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ((byte) KeyEvent.getModifierMetaStateMask()) + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i6 = $11 + 25;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
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
                int i8 = $10 + 13;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 59 - (ViewConfiguration.getTapTimeout() >> 16), Gravity.getAbsoluteGravity(0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 11;
            onExtraCallback = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                Object[] objArr = new Object[1];
                a(new char[]{56179, 44484, 13846, 48995, 484, 35565, 4929, 58819, 28319, 63295, 30823, 49828, 19225, 56396, 42643, 12204, 45152, 14711, 33743, 5145, 40283, 26555, 59643, 29043, 64463, 19668, 54556, 24177, 8371, 43514, 12867, 34012, 3472, 38450, 8051, 57819, 27148, 62233, 17837, 52972, 22314, 55682, 41687, 11011, 48229, 1711, 36851}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 30389, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(obj);
            FileOutputStream fileOutputStream = new FileOutputStream(this.$destinationFile);
            try {
                fileOutputStream.write(this.$decodedData);
                fileOutputStream.flush();
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream, (Throwable) null);
                int i3 = onExtraCallback + 53;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    return unit;
                }
                throw null;
            } finally {
            }
        }
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        List groupValues;
        String str2;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonObject, "");
            Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
            Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
            if (context == null) {
                Object[] objArr = new Object[1];
                a(new int[]{104, 15, 0, 4}, false, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1}, objArr);
                setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, ((String) objArr[0]).intern(), (String) null, (Map) null, 6, (Object) null);
                return;
            }
            setText settext = new setText(jsonObject);
            JsonObject jsonObjectOnExtraCallbackWithResult = settext.onExtraCallbackWithResult();
            Object[] objArr2 = new Object[1];
            a(new int[]{119, 4, 2, 0}, false, new byte[]{0, 1, 1, 1}, objArr2);
            String asString = jsonObjectOnExtraCallbackWithResult.get(((String) objArr2[0]).intern()).getAsString();
            if (asString != null) {
                JsonObject jsonObjectOnExtraCallbackWithResult2 = settext.onExtraCallbackWithResult();
                Object[] objArr3 = new Object[1];
                b((byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 34), (ViewConfiguration.getEdgeSlop() >> 16) + 8, new char[]{1, 27, 4, '!', '\'', '#', 11, '\"'}, objArr3);
                String asString2 = jsonObjectOnExtraCallbackWithResult2.get(((String) objArr3[0]).intern()).getAsString();
                if (asString2 == null) {
                    Object[] objArr4 = new Object[1];
                    b((byte) (68 - Color.blue(0)), (ViewConfiguration.getEdgeSlop() >> 16) + 14, new char[]{1, 27, 4, '!', '\'', '#', 11, '\"', 17, 23, '*', 30, 4, '\b'}, objArr4);
                    String strIntern = ((String) objArr4[0]).intern();
                    Object[] objArr5 = new Object[1];
                    a(new int[]{123, 16, 0, 0}, true, new byte[]{1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1}, objArr5);
                    setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern, ((String) objArr5[0]).intern(), (Map) null, 4, (Object) null);
                    return;
                }
                JsonObject jsonObjectOnExtraCallbackWithResult3 = settext.onExtraCallbackWithResult();
                Object[] objArr6 = new Object[1];
                a(new int[]{139, 8, 0, 0}, true, new byte[]{1, 1, 1, 1, 1, 0, 0, 0}, objArr6);
                String asString3 = jsonObjectOnExtraCallbackWithResult3.get(((String) objArr6[0]).intern()).getAsString();
                if (asString3 == null) {
                    Object[] objArr7 = new Object[1];
                    b((byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 52), 14 - KeyEvent.getDeadChar(0, 0), new char[]{'\b', 27, 11, '\"', '*', 18, 11, '!', 17, 23, '*', 30, 4, '\b'}, objArr7);
                    String strIntern2 = ((String) objArr7[0]).intern();
                    Object[] objArr8 = new Object[1];
                    a(new int[]{147, 16, 0, 0}, true, new byte[]{1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1}, objArr8);
                    setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern2, ((String) objArr8[0]).intern(), (Map) null, 4, (Object) null);
                    return;
                }
                MatchResult matchResultFind$default = Regex.find$default(onNavigationEvent, asString3, 0, 2, (Object) null);
                if (matchResultFind$default == null || (groupValues = matchResultFind$default.getGroupValues()) == null || (str2 = (String) groupValues.get(1)) == null) {
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr9 = new Object[1];
                    a(new int[]{163, 30, 27, 10}, true, null, objArr9);
                    sb.append(((String) objArr9[0]).intern());
                    sb.append(asString3);
                    String string = sb.toString();
                    Object[] objArr10 = new Object[1];
                    a(new int[]{193, 14, 0, 4}, true, new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0}, objArr10);
                    setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, string, ((String) objArr10[0]).intern(), (Map) null, 4, (Object) null);
                    return;
                }
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(r8lambdakrhaimf1bm5cgjbilhp45vln_xq), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(context, asString, setonoutofmemeryerrorcallback, asString2, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, this, asString3, str2, (access13800) null), 3, (Object) null);
                return;
            }
            int i3 = asInterface + 75;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr11 = new Object[1];
            b((byte) (KeyEvent.normalizeMetaState(0) + 98), (KeyEvent.getMaxKeyCode() >> 16) + 14, new char[]{'%', 15, 19, 27, 22, '\n', ',', '\r', '&', 23, 23, 6, 4, '\b'}, objArr11);
            String strIntern3 = ((String) objArr11[0]).intern();
            Object[] objArr12 = new Object[1];
            b((byte) (99 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 12 - (ViewConfiguration.getTapTimeout() >> 16), new char[]{'&', '-', 18, 5, 24, ' ', 30, 31, ' ', 1, 4, 11}, objArr12);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern3, ((String) objArr12[0]).intern(), (Map) null, 4, (Object) null);
            return;
        }
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ byte[] $decodedData;
        final /* synthetic */ String $extension;
        final /* synthetic */ String $fileName;
        int label;
        private static final byte[] $$a = {66, 42, 112, 97};
        private static final int $$b = 31;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private static char[] onNavigationEvent = {60855, 58075, 62308, 50162, 53324, 41094, 45359, 33270, 38531, 26488, 30717, 17437, 21641, 9519, 13749, 2689, 6932, 60408, 63501, 51352, 55587, 43424, 48837, 36630, 40867, 27651, 31894, 19768, 23987, 21193, 9045, 13217, '4', 4237, 57633, 61866, 50884, 55058, 42979, 46201, 33942, 38181, 26029, 31450, 19285, 23532, 10357};
        private static long IAuthTabCallback = -1824905966388714822L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r6, int r7, short r8) {
            /*
                int r7 = r7 + 4
                int r6 = r6 * 2
                int r0 = 1 - r6
                byte[] r1 = o.setExtensions.onExtraCallback.$$a
                int r8 = r8 * 3
                int r8 = 97 - r8
                byte[] r0 = new byte[r0]
                r2 = 0
                int r6 = 0 - r6
                if (r1 != 0) goto L17
                r3 = r6
                r8 = r7
                r4 = r2
                goto L2e
            L17:
                r3 = r2
            L18:
                int r7 = r7 + 1
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r6) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L25:
                int r3 = r3 + 1
                r4 = r1[r7]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L2e:
                int r7 = r7 + r3
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setExtensions.onExtraCallback.$$c(byte, int, short):java.lang.String");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(Context context, String str, String str2, byte[] bArr, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$context = context;
            this.$fileName = str;
            this.$extension = str2;
            this.$decodedData = bArr;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$context, this.$fileName, this.$extension, this.$decodedData, access13800Var);
            int i2 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 39;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super String> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            float f;
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (true) {
                f = 0.0f;
                if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                    break;
                }
                int i4 = $10 + 21;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i + i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59696 - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 16, 10973 - (Process.myPid() >> 22), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - View.getDefaultSize(0, 0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31, 20220 - View.combineMeasuredStates(0, 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                            if (objOnExtraCallback3 == null) {
                                byte b = (byte) 0;
                                byte b2 = (byte) (b - 1);
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 49123), 44 - (ViewConfiguration.getDoubleTapTimeout() >> 16), View.combineMeasuredStates(0, 0) + 1494, -1657859959, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            char[] cArr = new char[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            int i7 = $10 + 77;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                try {
                    Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback4 == null) {
                        char c2 = (char) ((ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)) + 49122);
                        int iRed = 44 - Color.red(0);
                        int i9 = (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)) + 1494;
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, iRed, i9, -1657859959, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    f = 0.0f;
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            objArr[0] = new String(cArr);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 23;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (this.label != 0) {
                Object[] objArr = new Object[1];
                a(TextUtils.indexOf("", ""), (-16777169) - Color.rgb(0, 0, 0), (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            int i5 = i2 + 31;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            return Cookies_clearAll.Companion.IAuthTabCallback(this.$context).onWarmupCompleted(this.$fileName).onNavigationEvent(NoticeReference.Companion.onWarmupCompleted(this.$extension)).onWarmupCompleted(95).IAuthTabCallback(this.$decodedData).onWarmupCompleted();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0118, code lost:
    
        if (r1 != r5) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x024d, code lost:
    
        if (o.maybeUpdateAnimatable.onExtraCallback(r9, r13, r3) == r5) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object IAuthTabCallback(java.lang.String r18, java.lang.String r19, java.lang.String r20, byte[] r21, android.content.Context r22, o.setOnOutOfMemeryErrorCallback r23, o.access13800<? super kotlin.Unit> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setExtensions.IAuthTabCallback(java.lang.String, java.lang.String, java.lang.String, byte[], android.content.Context, o.setOnOutOfMemeryErrorCallback, o.access13800):java.lang.Object");
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    static {
        IAuthTabCallback();
        Companion = new IAuthTabCallback(null);
        Object[] objArr = new Object[1];
        a(new int[]{0, 8, 132, 4}, false, new byte[]{1, 0, 0, 0, 0, 1, 1, 1}, objArr);
        onNavigationEvent = new Regex(((String) objArr[0]).intern());
        int i = onTransact + 21;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = IAuthTabCallback;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 35 - ExpandableListView.getPackedPositionType(j), 14238 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
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
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            int i7 = $10 + 123;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = $10 + 3;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - View.resolveSizeAndState(0, 0, 0)), Color.green(0) + 65, 16718 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        throw null;
                    }
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 10935), ExpandableListView.getPackedPositionGroup(0L) + 65, Gravity.getAbsoluteGravity(0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 28 - ExpandableListView.getPackedPositionChild(0L), 17658 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 49468), ((Process.getThreadPriority(0) + 20) >> 6) + 70, 12486 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                int i13 = $11 + 1;
                $10 = i13 % 128;
                int i14 = i13 % 2;
            }
            int i15 = $11 + 89;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i17 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i17, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i17);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            int i18 = $11 + 119;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i20 = $10 + 63;
            $11 = i20 % 128;
            int i21 = i20 % 2;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r31, int r32, char[] r33, java.lang.Object[] r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setExtensions.b(byte, int, char[], java.lang.Object[]):void");
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = new char[]{27153, 27294, 27270, 27360, 27390, 27361, 27275, 27310, 27263, 27180, 27176, 27170, 27144, 27140, 27199, 27145, 27245, 27138, 27173, 27170, 27194, 27199, 27175, 27144, 27245, 27151, 27181, 27179, 27172, 27198, 27173, 27148, 27245, 27142, 27173, 27196, 27196, 27171, 27174, 27144, 27245, 27141, 27198, 27168, 27168, 27146, 27151, 27175, 27198, 27198, 27196, 27194, 27168, 27173, 27175, 27255, 27195, 27193, 27185, 27187, 27186, 27333, 27341, 27192, 27188, 27186, 27143, 27329, 27351, 27353, 27331, 27352, 27356, 27332, 27335, 27355, 27373, 27351, 27355, 27353, 27355, 27348, 27348, 27357, 27328, 27140, 27196, 27191, 27349, 27349, 27373, 27345, 27347, 27349, 27351, 27351, 27351, 27375, 27343, 27172, 27341, 27355, 27348, 27350, 27257, 27199, 27198, 27170, 27161, 27159, 27168, 27199, 27170, 27168, 27192, 27140, 27146, 27168, 27143, 27261, 27178, 27170, 27170, 27244, 27143, 27145, 27145, 27143, 27142, 27140, 27145, 27164, 27167, 27144, 27140, 27144, 27141, 27164, 27141, 27260, 27172, 27194, 27176, 27154, 27175, 27173, 27173, 27244, 27140, 27162, 27160, 27138, 27143, 27141, 27141, 27160, 27167, 27144, 27140, 27144, 27141, 27164, 27141, 27253, 44481, 27342, 27333, 27354, 27169, 27342, 27334, 27338, 27334, 27253, 27163, 27342, 27333, 27354, 27169, 27342, 27334, 27338, 27334, 27253, 27143, 44257, 44817, 44843, 27253, 41877, 54209, 54881, 44041, 27241, 27136, 27166, 27162, 27136, 27140, 27162, 27160, 27138, 27143, 27141, 27141, 27160, 27165};
        onExtraCallbackWithResult = new char[]{14435, 15143, 14583, 10299, 65010, 64991, 64981, 11931, 15263, 17607, 64980, 64925, 64963, 64990, 64970, 15055, 15047, 13747, 17995, 64997, 11395, 14870, 64986, 11967, 64915, 65023, 20915, 14585, 14343, 65015, 65004, 65018, 64982, 10439, 13767, 14439, 20163, 13427, 65021, 14436, 16215, 64978, 14434, 14879, 14453, 14437, 64999, 14438, 16807};
        onWarmupCompleted = (char) 51246;
    }
}
