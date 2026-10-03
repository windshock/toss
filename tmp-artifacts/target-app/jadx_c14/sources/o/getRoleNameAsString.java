package o;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.gson.JsonObject;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.rn.spec.base.ReactNativeContentOwner;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.getPackageType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getRoleNameAsString implements ALCFaceResult, r8lambda_TGyvW_ZWE2FNGas5LTboepDiQ {
    public static final onWarmupCompleted Companion;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static final String onWarmupCompleted;
    private static final byte[] $$a = {66, 42, 112, 97};
    private static final int $$b = 170;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int asInterface = 1;
    private static int onExtraCallback = 0;

    private static String $$c(short s, short s2, int i) {
        int i2 = s + 4;
        byte[] bArr = $$a;
        int i3 = s2 * 2;
        int i4 = 105 - (i * 4);
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i4 = (-i2) + i5;
            i2 = i2;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            int i8 = i2 + 1;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            i6 = i7;
            i4 = (-bArr[i8]) + i4;
            i2 = i8;
        }
    }

    static {
        onNavigationEvent = 1;
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(23 - (ViewConfiguration.getEdgeSlop() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 11, new char[]{65503, 4, 1, 1, 65520, 11, 65535, 65532, 15, 0, 65535, '\n', '\t', 65518, 0, '\r', 17, 0, '\r', 65519, 4, '\b', 0}, false, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 277, objArr);
        onWarmupCompleted = ((String) objArr[0]).intern();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onWarmupCompleted(defaultConstructorMarker);
        int i = onExtraCallback + 103;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i4 = asInterface + 119;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return onoutofmemoryOnExtraCallback;
        }
        throw null;
    }

    @Deprecated
    public /* bridge */ void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = asInterface + 5;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallbackWithResult(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, bundle, uri);
        if (i5 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        boolean zOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = asInterface + 87;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
            int i3 = 57 / 0;
        } else {
            zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        int i4 = IAuthTabCallback + 101;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnExtraCallbackWithResult;
        }
        throw null;
    }

    public /* bridge */ void onNavigationEvent(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 119;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        super.onNavigationEvent(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, intent);
        int i6 = asInterface + 77;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 81 / 0;
        }
    }

    public /* bridge */ void onNavigationEvent(@NotNull ReactNativeContentOwner reactNativeContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 123;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        super.onNavigationEvent(reactNativeContentOwner, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = asInterface + 79;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 6 / 0;
        }
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.drawTextBox*/.onNavigationEvent();
            throw null;
        }
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i3 = IAuthTabCallback + 55;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = IAuthTabCallback + 31;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<Long, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static long onExtraCallbackWithResult = -9054526434307399262L;
        final /* synthetic */ setTopGuideBackgroundColor $callbackProxy;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(setTopGuideBackgroundColor settopguidebackgroundcolor, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$callbackProxy = settopguidebackgroundcolor;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$callbackProxy, access13800Var);
            onnavigationevent.L$0 = obj;
            int i2 = IAuthTabCallback + 59;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((Long) obj, (access13800) obj2);
            int i4 = onExtraCallback + 79;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(Long l, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(l, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 75;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 1 / 0;
            }
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0071, code lost:
        
            if ((r1 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0073, code lost:
        
            return r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0075, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0076, code lost:
        
            r2 = new java.lang.Object[1];
            a(new char[]{42230, 65379, 5079, 46652, 51945, 27922, 33136, 9620, 30730, 40104, 14102, 19355, 61428, 595, 42674, 63851, 7621, 45552, 54382, 26822, 33590, 10116, 31242, 40484, 12954, 21827, 59821, 3086, 41086, 50405, 8002, 46075, 54869, 27285, 36594, 8516, 17857, 39014, 15516, 20731, 60287, 4053, 41510, 50876, 6408, 48496, 53714}, 23447 - android.view.View.combineMeasuredStates(0, 0), r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0095, code lost:
        
            throw new java.lang.IllegalStateException(((java.lang.String) r2[0]).intern());
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        
            if (r10.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        
            if (r10.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        
            kotlin.ResultKt.onNavigationEvent(r11);
            r11 = r10.$callbackProxy;
            r2 = new java.lang.Object[1];
            a(new char[]{42234, 24454, 21052, 22151, 18707, 19858, 16414, 17548, 32553, 29593, 30234, 27311, 27917, 24997, 25637, 6304, 4880, 6056, 2619, 3763, 293, 1457, 14415}, android.graphics.Color.argb(0, 0, 0, 0) + 64381, r2);
            r7 = new java.lang.Object[]{r11, ((java.lang.String) r2[0]).intern(), o.getRoleAuthorityAsString.onExtraCallbackWithResult(r1)};
            r4 = im.toss.tds.compose.component.compound.tab.v1.ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
            r8 = im.toss.tds.compose.component.compound.tab.v1.ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
            o.ALCFaceBox.onWarmupCompleted(-908557745, r4, im.toss.tds.compose.component.compound.tab.v1.ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), im.toss.tds.compose.component.compound.tab.v1.ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), r7, r8, 908557753);
            r11 = kotlin.Unit.INSTANCE;
            r1 = o.getRoleNameAsString.onNavigationEvent.onExtraCallback + 85;
            o.getRoleNameAsString.onNavigationEvent.IAuthTabCallback = r1 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = o.getRoleNameAsString.onNavigationEvent.IAuthTabCallback
                int r1 = r1 + 5
                int r2 = r1 % 128
                o.getRoleNameAsString.onNavigationEvent.onExtraCallback = r2
                int r1 = r1 % r0
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L1c
                java.lang.Object r1 = r10.L$0
                java.lang.Long r1 = (java.lang.Long) r1
                int r4 = r10.label
                r5 = 38
                int r5 = r5 / r3
                if (r4 != 0) goto L76
                goto L24
            L1c:
                java.lang.Object r1 = r10.L$0
                java.lang.Long r1 = (java.lang.Long) r1
                int r4 = r10.label
                if (r4 != 0) goto L76
            L24:
                kotlin.ResultKt.onNavigationEvent(r11)
                o.setTopGuideBackgroundColor r11 = r10.$callbackProxy
                r4 = 23
                char[] r4 = new char[r4]
                r4 = {x0096: FILL_ARRAY_DATA , data: [-23302, 24454, 21052, 22151, 18707, 19858, 16414, 17548, 32553, 29593, 30234, 27311, 27917, 24997, 25637, 6304, 4880, 6056, 2619, 3763, 293, 1457, 14415} // fill-array
                r5 = 64381(0xfb7d, float:9.0217E-41)
                int r6 = android.graphics.Color.argb(r3, r3, r3, r3)
                int r6 = r6 + r5
                java.lang.Object[] r2 = new java.lang.Object[r2]
                a(r4, r6, r2)
                r2 = r2[r3]
                java.lang.String r2 = (java.lang.String) r2
                java.lang.String r2 = r2.intern()
                com.google.gson.JsonObject r1 = o.getRoleAuthorityAsString.onExtraCallbackWithResult(r1)
                java.lang.Object[] r7 = new java.lang.Object[]{r11, r2, r1}
                int r4 = im.toss.tds.compose.component.compound.tab.v1.ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback()
                int r8 = im.toss.tds.compose.component.compound.tab.v1.ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback()
                int r6 = im.toss.tds.compose.component.compound.tab.v1.ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback()
                int r5 = im.toss.tds.compose.component.compound.tab.v1.ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback()
                r9 = 908557753(0x36277db9, float:2.495812E-6)
                r3 = -908557745(0xffffffffc9d8824f, float:-1773641.9)
                o.ALCFaceBox.onWarmupCompleted(r3, r4, r5, r6, r7, r8, r9)
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                int r1 = o.getRoleNameAsString.onNavigationEvent.onExtraCallback
                int r1 = r1 + 85
                int r2 = r1 % 128
                o.getRoleNameAsString.onNavigationEvent.IAuthTabCallback = r2
                int r1 = r1 % r0
                if (r1 != 0) goto L74
                return r11
            L74:
                r11 = 0
                throw r11
            L76:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                r0 = 47
                char[] r0 = new char[r0]
                r0 = {x00b2: FILL_ARRAY_DATA , data: [-23306, -157, 5079, -18884, -13591, 27922, -32400, 9620, 30730, -25432, 14102, 19355, -4108, 595, -22862, -1685, 7621, -19984, -11154, 26822, -31946, 10116, 31242, -25052, 12954, 21827, -5715, 3086, -24450, -15131, 8002, -19461, -10667, 27285, -28942, 8516, 17857, -26522, 15516, 20731, -5249, 4053, -24026, -14660, 6408, -17040, -11822} // fill-array
                int r1 = android.view.View.combineMeasuredStates(r3, r3)
                int r1 = 23447 - r1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                a(r0, r1, r2)
                r0 = r2[r3]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = r0.intern()
                r11.<init>(r0)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getRoleNameAsString.onNavigationEvent.invokeSuspend(java.lang.Object):java.lang.Object");
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
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23, Gravity.getAbsoluteGravity(0, 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 59, 6383 - Color.red(0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
            int i4 = $10 + 115;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i6 = $10 + 31;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), ImageFormat.getBitsPerPixel(0) + 60, 6383 - (ViewConfiguration.getEdgeSlop() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2);
        }
    }

    public void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor) {
        getPackageType getpackagetype;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        View view = webViewContentOwner.getView();
        Object tag = view != null ? view.getTag(R.id.get_server_time_diff_handler_collect_job_id) : null;
        if (tag instanceof getPackageType) {
            int i2 = IAuthTabCallback + 123;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            getpackagetype = (getPackageType) tag;
        } else {
            int i3 = asInterface + 57;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            getpackagetype = null;
        }
        if (getpackagetype != null) {
            int i5 = asInterface + 53;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            if (getpackagetype.onExtraCallback()) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            }
        }
        getPackageType getpackagetypeOnWarmupCompleted = ycxycx.onWarmupCompleted(ycxycx.IAuthTabCallback(TextFieldKeyInputExternalSyntheticLambda8.onWarmupCompleted(zzaj.onWarmupCompleted().IAuthTabCallback(), webViewContentOwner.getLifecycle(), TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED), new onNavigationEvent(settopguidebackgroundcolor, null)), TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(webViewContentOwner));
        View view2 = webViewContentOwner.getView();
        if (view2 != null) {
            int i7 = IAuthTabCallback + 15;
            asInterface = i7 % 128;
            if (i7 % 2 != 0) {
                view2.setTag(R.id.get_server_time_diff_handler_collect_job_id, getpackagetypeOnWarmupCompleted);
            } else {
                view2.setTag(R.id.get_server_time_diff_handler_collect_job_id, getpackagetypeOnWarmupCompleted);
                throw null;
            }
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<Long, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int[] onWarmupCompleted = {-1357615609, -1925334227, 1649305239, 1299398832, 1069772535, 574255054, 1052898140, -898380414, -1220285633, -1046685887, 216342937, -1327001312, 56859769, -1183791361, -253795552, 914518574, 1369869448, -850556925};
        final /* synthetic */ setOnOutOfMemeryErrorCallback $callbackProxy;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$callbackProxy = setonoutofmemeryerrorcallback;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$callbackProxy, access13800Var);
            iAuthTabCallback.L$0 = obj;
            int i2 = IAuthTabCallback + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 81;
            IAuthTabCallback = i2 % 128;
            Long l = (Long) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onNavigationEvent(l, access13800Var);
            }
            onNavigationEvent(l, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(Long l, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallbackCreate = create(l, access13800Var);
            if (i3 != 0) {
                return iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 60 / 0;
            return iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            Long l = (Long) this.L$0;
            if (this.label != 0) {
                Object[] objArr = new Object[1];
                a(new int[]{168191430, -984951202, 210415855, -220429658, 798356705, -1392824039, 187038118, -1080495945, -563275128, 838672842, 112503857, 1079041425, 1402095426, -1018983138, 2112556828, 1748655583, -528551161, 1509443001, 1329119426, 1828973230, -605447735, 1329476882, 1044023436, 1779261541}, Color.red(0) + 47, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(obj);
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.$callbackProxy;
            Object[] objArr2 = new Object[1];
            a(new int[]{1358044724, 1123417529, 1584901270, 974075197, -7801239, 1170206590, 590601724, 846912838, 919783299, 1009604221, 2014359847, 1607836843}, (Process.myPid() >> 22) + 23, objArr2);
            setonoutofmemeryerrorcallback.onNavigationEvent(((String) objArr2[0]).intern(), getRoleAuthorityAsString.onWarmupCompleted(l));
            Unit unit = Unit.INSTANCE;
            int i3 = IAuthTabCallback + 101;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = onWarmupCompleted;
            int i5 = -1469660336;
            int i6 = 0;
            if (iArr2 != null) {
                int i7 = $11 + 53;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i9 = 0;
                while (i9 < length) {
                    int i10 = $11 + 97;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), Color.alpha(0) + 72, 8848 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i9] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i9++;
                        i5 = -1469660336;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = onWarmupCompleted;
            if (iArr5 != null) {
                int i12 = $11 + 31;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i14 = 0;
                while (i14 < length3) {
                    int i15 = $11 + 93;
                    $10 = i15 % 128;
                    int i16 = i15 % i3;
                    try {
                        Object[] objArr3 = new Object[1];
                        objArr3[i6] = Integer.valueOf(iArr5[i14]);
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), View.combineMeasuredStates(i6, i6) + 72, 8848 - TextUtils.getCapsMode("", i6, i6), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i14] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i14++;
                        i3 = 2;
                        i6 = 0;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i2 = i6;
                iArr5 = iArr6;
            } else {
                i2 = 0;
            }
            System.arraycopy(iArr5, i2, iArr4, i2, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i17 = 0;
                for (int i18 = 16; i17 < i18; i18 = 16) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i17];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 22252), 40 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 10301 - Drawable.resolveOpacity(0, 0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i17++;
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
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 4032), (ViewConfiguration.getJumpTapTimeout() >> 16) + 78, 7399 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                i2 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }

    public void IAuthTabCallback(@NotNull ReactNativeContentOwner reactNativeContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        Object tag;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(reactNativeContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        a(Color.green(0) + 23, 11 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{65503, 4, 1, 1, 65520, 11, 65535, 65532, 15, 0, 65535, '\n', '\t', 65518, 0, '\r', 17, 0, '\r', 65519, 4, '\b', 0}, false, 278 - TextUtils.getTrimmedLength(""), objArr);
        if (settext.onWarmupCompleted(((String) objArr[0]).intern()) != null) {
            View view = reactNativeContentOwner.getView();
            if (view != null) {
                int i2 = asInterface + 79;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                tag = view.getTag(R.id.get_server_time_diff_handler_react_collect_job_id);
            } else {
                tag = null;
            }
            getPackageType getpackagetype = tag instanceof getPackageType ? (getPackageType) tag : null;
            if (getpackagetype != null) {
                int i4 = asInterface + 107;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    getpackagetype.onExtraCallback();
                    throw null;
                }
                if (getpackagetype.onExtraCallback()) {
                    int i5 = asInterface + 31;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                }
            }
            getPackageType getpackagetypeOnWarmupCompleted = ycxycx.onWarmupCompleted(ycxycx.IAuthTabCallback(TextFieldKeyInputExternalSyntheticLambda8.onWarmupCompleted(zzaj.onWarmupCompleted().IAuthTabCallback(), reactNativeContentOwner.getLifecycle(), TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED), new IAuthTabCallback(setonoutofmemeryerrorcallback, null)), TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(reactNativeContentOwner));
            View view2 = reactNativeContentOwner.getView();
            if (view2 != null) {
                int i7 = IAuthTabCallback + 9;
                asInterface = i7 % 128;
                if (i7 % 2 != 0) {
                    view2.setTag(R.id.get_server_time_diff_handler_react_collect_job_id, getpackagetypeOnWarmupCompleted);
                } else {
                    view2.setTag(R.id.get_server_time_diff_handler_react_collect_job_id, getpackagetypeOnWarmupCompleted);
                    int i8 = 79 / 0;
                }
            }
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r22, int r23, char[] r24, boolean r25, int r26, java.lang.Object[] r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getRoleNameAsString.a(int, int, char[], boolean, int, java.lang.Object[]):void");
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = 478309016;
    }
}
