package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.ImageViewerActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class X509Extensions implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent = 0;
    private static long onWarmupCompleted = 3840759020506592817L;

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = X509Extensions.onNavigationEvent(X509Extensions.this, null, null, this);
            return objOnNavigationEvent == access14300.onWarmupCompleted() ? objOnNavigationEvent : Result.IAuthTabCallback(objOnNavigationEvent);
        }
    }

    public static final /* synthetic */ void onExtraCallback(X509Extensions x509Extensions, Context context, String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        x509Extensions.onExtraCallbackWithResult(context, str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 85;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onNavigationEvent(X509Extensions x509Extensions, Context context, String str, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = x509Extensions.IAuthTabCallback(context, str, access13800Var);
        int i4 = IAuthTabCallback + 23;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallback;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i4 = onNavigationEvent + 47;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return onoutofmemoryOnExtraCallback;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 113;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = IAuthTabCallback + 109;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.drawTextBox*/.onExtraCallbackWithResult();
            throw null;
        }
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i3 = IAuthTabCallback + 51;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.drawTextBox*/.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i3 = onNavigationEvent + 121;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.drawTextBox*/.onWarmupCompleted(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i3 = IAuthTabCallback + 69;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 69;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        a(new char[]{39927, 39838, 933, 34646, 53585, 20213, 7501, 13953, 44902, 33217, 18506, 52630}, 1 - (ViewConfiguration.getTapTimeout() >> 16), objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context == null) {
            int i2 = IAuthTabCallback + 87;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, "", (String) null, (Map) null, 62, (Object) null);
                return;
            } else {
                setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, "", (String) null, (Map) null, 6, (Object) null);
                return;
            }
        }
        if (strOnNavigationEvent.length() > 0) {
            int i3 = IAuthTabCallback + 59;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                onExtraCallbackWithResult(context, strOnNavigationEvent);
                return;
            } else {
                onExtraCallbackWithResult(context, strOnNavigationEvent);
                int i4 = 64 / 0;
                return;
            }
        }
        Object[] objArr2 = new Object[1];
        a(new char[]{16632, 16529, 44598, 20571, 'U', 58214, 51776, 59269, 29801}, -TextUtils.indexOf((CharSequence) "", '0', 0), objArr2);
        String strOnNavigationEvent2 = settext.onNavigationEvent(((String) objArr2[0]).intern(), "");
        if (strOnNavigationEvent2.length() != 0) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(r8lambdakrhaimf1bm5cgjbilhp45vln_xq), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(context, strOnNavigationEvent2, setonoutofmemeryerrorcallback, null), 3, (Object) null);
            return;
        }
        Object[] objArr3 = new Object[1];
        a(new char[]{33495, 17827, 11698, 39636, 33130, 56183, 51566, 26365, 32479, 28175, 63930, 40417, 12025, 22562, 11390, 25105, 7205}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, objArr3);
        setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, ((String) objArr3[0]).intern(), (String) null, (Map) null, 6, (Object) null);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 67;
        while (true) {
            $10 = i3 % 128;
            int i4 = i3 % 2;
            if (timelineExternalSyntheticLambda0.onNavigationEvent >= cArrOnWarmupCompleted.length) {
                objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
                return;
            }
            int i5 = $10 + 25;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 45812), 84 - ExpandableListView.getPackedPositionType(0L), 21233 - TextUtils.getTrimmedLength(""), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 14185), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 18, 8808 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                i3 = $11 + 95;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ setOnOutOfMemeryErrorCallback $callbackProxy;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $imageBase64;
        int label;
        private static final byte[] $$a = {109, 5, -57, 108};
        private static final int $$b = 191;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onNavigationEvent = 0;
        private static int onExtraCallback = 1;
        private static char[] onWarmupCompleted = {39148, 58907, 25865, 58428, 25467, 57906, 24926, 57372, 28416, 61024, 28024, 60539, 27526, 60051, 27020, 59635, 30719, 63144, 30160, 62662, 29636, 62180, 29156, 61612, 32336, 64779, 31747, 64302, 31276, 63781, 30812, 50947, 17935, 50541, 17516, 50052, 17043, 49606, 16562, 53171, 20149, 52701, 19656, 52188, 19194, 51696, 18668};
        private static long IAuthTabCallback = -7380887317011590367L;

        private static String $$c(byte b, byte b2, short s) {
            int i = 4 - (s * 4);
            byte[] bArr = $$a;
            int i2 = 97 - (b * 4);
            int i3 = b2 * 3;
            byte[] bArr2 = new byte[1 - i3];
            int i4 = 0 - i3;
            int i5 = -1;
            if (bArr == null) {
                i2 += i;
                i++;
                i5 = -1;
            }
            while (true) {
                int i6 = i5 + 1;
                bArr2[i6] = (byte) i2;
                if (i6 == i4) {
                    return new String(bArr2, 0);
                }
                int i7 = i;
                i2 += bArr[i];
                i = i7 + 1;
                i5 = i6;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(Context context, String str, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$context = context;
            this.$imageBase64 = str;
            this.$callbackProxy = setonoutofmemeryerrorcallback;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 47;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = X509Extensions.this.new onExtraCallback(this.$context, this.$imageBase64, this.$callbackProxy, access13800Var);
            int i2 = onNavigationEvent + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 33;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnNavigationEvent;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            Object obj2 = null;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                X509Extensions x509Extensions = X509Extensions.this;
                Context context = this.$context;
                String str = this.$imageBase64;
                this.label = 1;
                objOnNavigationEvent = X509Extensions.onNavigationEvent(x509Extensions, context, str, this);
                if (objOnNavigationEvent == objOnWarmupCompleted) {
                    int i3 = onNavigationEvent + 103;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a(View.MeasureSpec.getMode(0), 46 - TextUtils.lastIndexOf("", '0', 0, 0), (char) ((ViewConfiguration.getTapTimeout() >> 16) + 30043), objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                int i4 = onNavigationEvent + 43;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                ResultKt.onNavigationEvent(obj);
                objOnNavigationEvent = ((Result) obj).onNavigationEvent();
            }
            X509Extensions x509Extensions2 = X509Extensions.this;
            Context context2 = this.$context;
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.$callbackProxy;
            if (!(!Result.onNavigationEvent(objOnNavigationEvent))) {
                String string = ((Uri) objOnNavigationEvent).toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                X509Extensions.onExtraCallback(x509Extensions2, context2, string);
                setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, (Function1) null, 1, (Object) null);
            }
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback2 = this.$callbackProxy;
            if (Result.exceptionOrNull-impl(objOnNavigationEvent) != null) {
                setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback2, "", (String) null, (Map) null, 6, (Object) null);
            }
            return Unit.INSTANCE;
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i + i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 59697), TextUtils.indexOf("", "") + 17, 10973 - (ViewConfiguration.getEdgeSlop() >> 16), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 46134), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31, 20219 - TextUtils.lastIndexOf("", '0', 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 49123), View.resolveSizeAndState(0, 0, 0) + 44, ExpandableListView.getPackedPositionType(0L) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i5 = $11 + 51;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i7 = $11 + 113;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 49123), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 44, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr);
        }
    }

    private final void onExtraCallbackWithResult(Context context, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        context.startActivity(ImageViewerActivity.Companion.onWarmupCompleted(context, str));
        int i4 = IAuthTabCallback + 109;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Uri>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long onExtraCallback = -1835949317300869957L;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $image;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(String str, Context context, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$image = str;
            this.$context = context;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$image, this.$context, access13800Var);
            int i2 = onWarmupCompleted + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 11;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Uri> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 85;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                iAuthTabCallbackCreate.invokeSuspend(unit);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = iAuthTabCallbackCreate.invokeSuspend(unit);
            int i4 = onExtraCallbackWithResult + 87;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
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
                int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), TextUtils.lastIndexOf("", '0') + 25, 19627 - View.MeasureSpec.getSize(0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (KeyEvent.getMaxKeyCode() >> 16) + 59, 6383 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            int i4 = $10 + 41;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i6 = $11 + 47;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                    Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), 60 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 6383 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i7 = 14 / 0;
                } else {
                    cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                    Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), AndroidCharacter.getMirror('0') + 11, Color.blue(0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
            }
            objArr[0] = new String(cArr2);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 99;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                Object[] objArr = new Object[1];
                a(new char[]{41455, 25258, 10094, 59445, 44208, 29083, 12873, 63325, 48019, 31873, 303, 50674, 34477, 19322, 3083, 53378, 38364, 22105, 6935, 57263, 57455, 42285, 27123, 10957, 61187, 45066, 29908, 14727, 64039, 48876, 17339, 1074, 51532, 36316, 20107, 4941, 54296, 39151, 23909, 7730, 8934, 59324, 43103, 27925, 12753, 62105, 46891}, 49991 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(obj);
            byte[] bArrDecode = Base64.decode(this.$image, 0);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            AFj1qSDK aFj1qSDK = AFj1qSDK.onNavigationEvent;
            Context applicationContext = this.$context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            Intrinsics.checkNotNull(bitmapDecodeByteArray);
            Uri uriOnExtraCallbackWithResult = aFj1qSDK.onExtraCallbackWithResult(applicationContext, bitmapDecodeByteArray);
            int i4 = onExtraCallbackWithResult + 99;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return uriOnExtraCallbackWithResult;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object IAuthTabCallback(android.content.Context r7, java.lang.String r8, o.access13800<? super kotlin.Result<? extends android.net.Uri>> r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.X509Extensions.IAuthTabCallback(android.content.Context, java.lang.String, o.access13800):java.lang.Object");
    }
}
