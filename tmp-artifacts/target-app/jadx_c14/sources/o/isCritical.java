package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import com.google.gson.JsonObject;
import im.toss.compose.widget.point.overlay.PointComponentOverlayView;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.uikit.widget.TdsPointToastV2View;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.LottieDrawableExternalSyntheticLambda1;
import o.SessionTrackerb;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.isCritical;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.ShowPointComponentHandler$;
import viva.republica.toss.common.web.message.handlers.ShowPointComponentHandler$onHandleMessage$1$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class isCritical implements ALCFaceQuality {
    private final Lazy onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.common.web.message.handlers.ShowPointComponentHandler$$ExternalSyntheticLambda0
        public final Object invoke() {
            return isCritical.IAuthTabCallback();
        }
    });
    private static final byte[] $$a = {101, 74, 115, 66};
    private static final int $$b = 40;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int asBinder = 1;
    private static char[] onWarmupCompleted = {60834, 31000, 50428, 21434, 48897, 2779, 37294, 22905, 52681, 28707, 59238, 3036, 44712, 14851, 34787, 4264, 64518, 18894, 53945, 48645, 60836, 30998, 50429, 21434, 48916, 2780, 37301, 64769, 60855, 31004, 50400, 21415, 48901, 2759, 18664, 56392, 25008, 63207, 6745, 44939, 13549, 22636, 60815, 29433, 34339, 11142, 45309};
    private static long onExtraCallbackWithResult = -7242557136649815687L;
    private static int onExtraCallback = 478308879;

    private static String $$c(int i, byte b, int i2) {
        int i3 = 105 - (i2 * 8);
        int i4 = i * 4;
        int i5 = 4 - (b * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i5++;
            i3 += -i5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            byte b2 = bArr[i5];
            i5++;
            i3 += -b2;
        }
    }

    public static /* synthetic */ SessionTrackerb IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb sessionTrackerbIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i4 = asBinder + 103;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return sessionTrackerbIAuthTabCallbackStub;
    }

    public static /* synthetic */ boolean onNavigationEvent(String str, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(str, str2);
        int i4 = asBinder + 59;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
        return zIAuthTabCallback;
    }

    public static final /* synthetic */ SessionTrackerb onWarmupCompleted(isCritical iscritical) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb sessionTrackerbOnWarmupCompleted = iscritical.onWarmupCompleted();
        int i4 = asBinder + 21;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return sessionTrackerbOnWarmupCompleted;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 121;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = IAuthTabCallback + 69;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        if (i3 == 0) {
            int i4 = 28 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super/*o.drawTextBox*/.onNavigationEvent();
            obj.hashCode();
            throw null;
        }
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i3 = asBinder + 65;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.drawTextBox*/.onWarmupCompleted(str);
        }
        super/*o.drawTextBox*/.onWarmupCompleted(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 69;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 == 0) {
            throw null;
        }
        int i6 = IAuthTabCallback + 85;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final SessionTrackerb onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb sessionTrackerb = (SessionTrackerb) this.onNavigationEvent.getValue();
        int i4 = asBinder + 19;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
        return sessionTrackerb;
    }

    private static final SessionTrackerb IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Response response = Response.onNavigationEvent;
            SessionTrackerb smallIconId = ((SessionTrackerb.onExtraCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), SessionTrackerb.onExtraCallback.class)).getSmallIconId();
            int i3 = asBinder + 69;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return smallIconId;
        }
        Response response2 = Response.onNavigationEvent;
        ((SessionTrackerb.onExtraCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), SessionTrackerb.onExtraCallback.class)).getSmallIconId();
        throw null;
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new ShowPointComponentHandler$.ExternalSyntheticLambda1());
        int i2 = asBinder + 49;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 45 / 0;
        }
        return iAuthTabCallback;
    }

    private static final boolean IAuthTabCallback(String str, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        boolean zOnTransact = filterCreatePageParams.onTransact(Uri.parse(str));
        int i4 = asBinder + 17;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zOnTransact;
    }

    public static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static char[] onWarmupCompleted = {27181, 27267, 27288, 27287, 27288, 27293, 27189, 27320, 27316, 27470, 27284, 27280, 27467, 27285, 27385, 27310, 27313, 27470, 27462, 27467, 27315, 27284, 27385, 27291, 27321, 27319, 27312, 27466, 27313, 27288, 27385, 27282, 27313, 27464, 27464, 27471, 27314, 27284, 27385, 27281, 27466, 27468, 27468, 27286, 27291, 27315, 27466, 27466, 27464, 27462, 27468, 27313, 27315};
        final /* synthetic */ ComponentActivity $activity;
        final /* synthetic */ float $bottomOffset;
        final /* synthetic */ long $closeLockDuration;
        final /* synthetic */ Context $context;
        final /* synthetic */ long $duration;
        final /* synthetic */ String $landingScheme;
        final /* synthetic */ String $position;
        final /* synthetic */ String $subtitle;
        final /* synthetic */ String $text;
        final /* synthetic */ String $title;
        final /* synthetic */ int $topOffset;
        final /* synthetic */ onExtraCallbackWithResult $type;
        int label;
        final /* synthetic */ isCritical this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult, Context context, int i, long j, String str, String str2, String str3, ComponentActivity componentActivity, String str4, String str5, long j2, float f, isCritical iscritical, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$type = onextracallbackwithresult;
            this.$context = context;
            this.$topOffset = i;
            this.$duration = j;
            this.$text = str;
            this.$landingScheme = str2;
            this.$position = str3;
            this.$activity = componentActivity;
            this.$title = str4;
            this.$subtitle = str5;
            this.$closeLockDuration = j2;
            this.$bottomOffset = f;
            this.this$0 = iscritical;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(isCritical iscritical, ComponentActivity componentActivity, String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(iscritical, componentActivity, str);
            int i4 = onExtraCallbackWithResult + 1;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return unitIAuthTabCallback;
            }
            throw null;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
            }
            iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$type, this.$context, this.$topOffset, this.$duration, this.$text, this.$landingScheme, this.$position, this.$activity, this.$title, this.$subtitle, this.$closeLockDuration, this.$bottomOffset, this.this$0, access13800Var);
            int i2 = onNavigationEvent + 123;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallback;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 1;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objIAuthTabCallback;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                Object[] objArr = new Object[1];
                a(new int[]{6, 47, 148, 0}, false, new byte[]{1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1}, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(obj);
            if (this.$type == onExtraCallbackWithResult.TOAST) {
                TdsPointToastV2View.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = new TdsPointToastV2View.onExtraCallbackWithResult(this.$context).onWarmupCompleted(this.$topOffset).onExtraCallback(this.$duration).onNavigationEvent(this.$text);
                String str = this.$landingScheme;
                if (str.length() <= 0) {
                    int i4 = onNavigationEvent + 95;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    str = null;
                }
                TdsPointToastV2View.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresultOnNavigationEvent, str != null ? new ShowPointComponentHandler$onHandleMessage$1$.ExternalSyntheticLambda0(this.this$0, this.$activity, str) : null, (Function1) null, (TossBundleLoader_loadBundle) null, 6, (Object) null);
            } else {
                PointComponentOverlayView.onExtraCallbackWithResult onextracallbackwithresult = PointComponentOverlayView.Companion;
                String str2 = this.$position;
                Object[] objArr2 = new Object[1];
                a(new int[]{0, 6, 101, 0}, false, new byte[]{1, 1, 1, 0, 1, 0}, objArr2);
                PointComponentOverlayView.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, this.$activity, this.$title, this.$subtitle, 0, 0, 0, this.$closeLockDuration, this.$bottomOffset, StringsKt.equals(str2, ((String) objArr2[0]).intern(), true) ? LottieDrawableExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback.onNavigationEvent : LottieDrawableExternalSyntheticLambda1.onWarmupCompleted.onWarmupCompleted.onExtraCallback, this.$duration, false, false, (String) null, (Function1) null, 14392, (Object) null);
                int i6 = onNavigationEvent + 9;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
            }
            return Unit.INSTANCE;
        }

        private static final Unit IAuthTabCallback(isCritical iscritical, ComponentActivity componentActivity, String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 79;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                SessionTrackerb.IAuthTabCallback(isCritical.onWarmupCompleted(iscritical), componentActivity, str, true, (Function1) null, (Bundle) null, false, 44, (Object) null);
            } else {
                SessionTrackerb.IAuthTabCallback(isCritical.onWarmupCompleted(iscritical), componentActivity, str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
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
            char[] cArr = onWarmupCompleted;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                for (int i6 = 0; i6 < length; i6++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 35284), 35 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getScrollBarSize() >> 8) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
                int i7 = $11 + 45;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char[] cArr4 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 10935), 65 - Drawable.resolveOpacity(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16717, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } else {
                        int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        try {
                            Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 29 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 17656 - Process.getGidForName(""), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49466 - TextUtils.lastIndexOf("", '0', 0)), 70 - TextUtils.indexOf("", ""), 12486 - TextUtils.indexOf("", "", 0, 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i5 > 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr3, 0, cArr5, 0, i3);
                int i11 = i3 - i5;
                System.arraycopy(cArr5, 0, cArr3, i11, i5);
                System.arraycopy(cArr5, i5, cArr3, 0, i11);
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
                int i12 = $11 + 89;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                int i14 = $10 + 81;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr3);
        }
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        String str2;
        ComponentActivity componentActivity;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context != null) {
            setText settext = new setText(jsonObject);
            onExtraCallbackWithResult.onExtraCallback onextracallback = onExtraCallbackWithResult.Companion;
            Object[] objArr = new Object[1];
            a((-1) - TextUtils.lastIndexOf("", '0', 0), ExpandableListView.getPackedPositionType(0L) + 7, (char) View.getDefaultSize(0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b(5 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 5 - (ViewConfiguration.getJumpTapTimeout() >> 16), new char[]{4, 65522, 0, 5, 5}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 149, true, objArr2);
            onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = onextracallback.onWarmupCompleted(settext.onNavigationEvent(strIntern, ((String) objArr2[0]).intern()));
            Object[] objArr3 = new Object[1];
            a(TextUtils.indexOf((CharSequence) "", '0') + 8, 5 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 46297), objArr3);
            String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr3[0]).intern(), "");
            Object[] objArr4 = new Object[1];
            a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12, View.getDefaultSize(0, 0) + 8, (char) (17167 - View.combineMeasuredStates(0, 0)), objArr4);
            String strOnNavigationEvent2 = settext.onNavigationEvent(((String) objArr4[0]).intern(), "");
            if (StringsKt.isBlank(strOnNavigationEvent2)) {
                int i2 = asBinder + 93;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                str2 = null;
            } else {
                str2 = strOnNavigationEvent2;
            }
            Object[] objArr5 = new Object[1];
            b((ViewConfiguration.getKeyRepeatDelay() >> 16) + 1, View.resolveSize(0, 0) + 4, new char[]{3, 3, 65524, 7}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 151, false, objArr5);
            String strOnNavigationEvent3 = settext.onNavigationEvent(((String) objArr5[0]).intern(), "");
            Object[] objArr6 = new Object[1];
            b(8 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 8 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{2, 3, 65533, '\b', 65525, 6, '\t', 65528}, (ViewConfiguration.getEdgeSlop() >> 16) + 146, true, objArr6);
            long jLongValue = ((Long) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -616100104, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 616100108, new Object[]{settext, ((String) objArr6[0]).intern(), 3000L})).longValue();
            Object[] objArr7 = new Object[1];
            b((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4, Drawable.resolveOpacity(0, 0) + 9, new char[]{65509, 6, 5, '\n', '\n', 65531, '\t', 65532, 65532}, TextUtils.lastIndexOf("", '0') + 145, true, objArr7);
            int iOnNavigationEvent = settext.onNavigationEvent(((String) objArr7[0]).intern(), varyMatches.IAuthTabCallback(46, context));
            Object[] objArr8 = new Object[1];
            a(AndroidCharacter.getMirror('0') - 28, (-16777208) - Color.rgb(0, 0, 0), (char) ExpandableListView.getPackedPositionType(0L), objArr8);
            String strIntern2 = ((String) objArr8[0]).intern();
            String str3 = str2;
            Object[] objArr9 = new Object[1];
            a((ViewConfiguration.getPressedStateDuration() >> 16) + 28, 6 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((-1) - TextUtils.lastIndexOf("", '0')), objArr9);
            String strOnNavigationEvent4 = settext.onNavigationEvent(strIntern2, ((String) objArr9[0]).intern());
            Object[] objArr10 = new Object[1];
            a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 35, KeyEvent.normalizeMetaState(0) + 13, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 42320), objArr10);
            String strOnNavigationEvent5 = settext.onNavigationEvent(((String) objArr10[0]).intern(), "");
            Object[] objArr11 = new Object[1];
            b(8 - KeyEvent.getDeadChar(0, 0), 12 - (ViewConfiguration.getJumpTapTimeout() >> 16), new char[]{65532, 65509, 3, 5, '\n', '\n', 5, 65528, '\n', 65531, '\t', 65532}, 144 - (ViewConfiguration.getFadingEdgeLength() >> 16), true, objArr11);
            float fFloatValue = ((Float) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -702054883, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 702054886, new Object[]{settext, ((String) objArr11[0]).intern(), Float.valueOf(0.0f)})).floatValue();
            Object[] objArr12 = new Object[1];
            b((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 16, ((byte) KeyEvent.getModifierMetaStateMask()) + 18, new char[]{5, '\b', '\f', 65534, 65509, '\b', 65532, 4, 65501, 14, 11, 65530, '\r', 2, '\b', 7, 65532}, Color.red(0) + 141, false, objArr12);
            long jLongValue2 = ((Long) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -616100104, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 616100108, new Object[]{settext, ((String) objArr12[0]).intern(), 1000L})).longValue();
            ComponentActivity componentActivityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
            if (componentActivityIAuthTabCallback instanceof ComponentActivity) {
                int i4 = IAuthTabCallback + 53;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                componentActivity = componentActivityIAuthTabCallback;
            } else {
                componentActivity = null;
            }
            ComponentActivity componentActivity2 = componentActivity;
            if (componentActivity2 == null || !componentActivity2.getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED)) {
                return;
            }
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(componentActivity2), putChannelInfo.onExtraCallback(), (setRandomHost) null, new IAuthTabCallback(onextracallbackwithresultOnWarmupCompleted, context, iOnNavigationEvent, jLongValue, strOnNavigationEvent3, strOnNavigationEvent5, strOnNavigationEvent4, componentActivity2, strOnNavigationEvent, str3, jLongValue2, fFloatValue, this, null), 2, (Object) null);
            int i5 = IAuthTabCallback + 103;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
        }
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
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - Color.argb(0, 0, 0, 0)), (KeyEvent.getMaxKeyCode() >> 16) + 17, ExpandableListView.getPackedPositionChild(0L) + 10974, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 46134), 32 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (Process.myPid() >> 22) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 49123), (ViewConfiguration.getPressedStateDuration() >> 16) + 44, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1493, -1657859959, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i5 = $11 + 11;
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
            int i7 = $10 + 125;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getEdgeSlop() >> 16)), View.resolveSize(0, 0) + 44, TextUtils.getCapsMode("", 0, 0) + 1494, -1657859959, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i8 = 23 / 0;
            } else {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 49123), Color.rgb(0, 0, 0) + 16777260, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1493, -1657859959, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
        }
        String str = new String(cArr);
        int i9 = $10 + 1;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r22, int r23, char[] r24, int r25, boolean r26, java.lang.Object[] r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isCritical.b(int, int, char[], int, boolean, java.lang.Object[]):void");
    }
}
