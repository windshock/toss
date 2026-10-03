package o;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import im.toss.core.webkit.bridge.image.AnalyzedImage;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.common.web.message.handlers.LoadAnalyzedImagesHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getVersionNumber extends ALCTimerLabel {
    public static final onExtraCallbackWithResult Companion;
    private static final String IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    private static long IAuthTabCallbackStub;
    private static int IAuthTabCallback_Parcel;
    public static final int onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static char onTransact;
    private static long onWarmupCompleted;
    private static final byte[] $$d = {52, -58, -85, 74};
    private static final int $$e = 117;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int asInterface = 0;
    private static int asBinder = 1;

    static final class IAuthTabCallback extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return getVersionNumber.onExtraCallback(getVersionNumber.this, null, null, this);
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return getVersionNumber.onNavigationEvent(getVersionNumber.this, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$f(byte r6, short r7, int r8) {
        /*
            int r8 = r8 + 4
            byte[] r0 = o.getVersionNumber.$$d
            int r7 = 110 - r7
            int r6 = r6 * 3
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r6
            r3 = r8
            r4 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L29:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getVersionNumber.$$f(byte, short, int):java.lang.String");
    }

    static {
        IAuthTabCallback_Parcel = 0;
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        c(new char[]{3483, 3567, 37531, 64807, 39100, 18294, 43248, 59151}, 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        c(new char[]{39743, 39773, 17005, 11733, 10669, 63085, 42929, 59481, 9268, 652, 46814}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, objArr2);
        onNavigationEvent = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        c(new char[]{7141, 7057, 52257, 41857, 53926, 3428, 5177, 23511}, -TextUtils.indexOf((CharSequence) "", '0'), objArr3);
        IAuthTabCallback = ((String) objArr3[0]).intern();
        Companion = new onExtraCallbackWithResult(null);
        onExtraCallback = 8;
        int i = IAuthTabCallbackStubProxy + 125;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ boolean onWarmupCompleted(String str, String str2) {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str2);
        int i4 = asBinder + 97;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ Object onExtraCallback(getVersionNumber getversionnumber, Context context, Uri uri, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getversionnumber.onExtraCallback(context, uri, (access13800<? super List<String>>) access13800Var);
            obj.hashCode();
            throw null;
        }
        Object objOnExtraCallback = getversionnumber.onExtraCallback(context, uri, (access13800<? super List<String>>) access13800Var);
        int i3 = asBinder + 69;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(getVersionNumber getversionnumber, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        getversionnumber.onNavigationEvent(setonoutofmemeryerrorcallback, str);
        int i4 = asInterface + 119;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
    }

    public static final /* synthetic */ Object onNavigationEvent(getVersionNumber getversionnumber, Context context, Uri uri, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = getversionnumber.onExtraCallbackWithResult(context, uri, access13800Var);
        int i4 = asBinder + 119;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
        return objOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ void onWarmupCompleted(getVersionNumber getversionnumber, String str, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        getversionnumber.onExtraCallback(str, setonoutofmemeryerrorcallback, th);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = asBinder + 79;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new LoadAnalyzedImagesHandler$.ExternalSyntheticLambda0());
        int i2 = asBinder + 105;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallback;
    }

    private static final boolean onExtraCallbackWithResult(String str, String str2) {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Uri uri = Uri.parse(str);
        boolean zOnTransact = filterCreatePageParams.onTransact(uri);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (Color.rgb(0, 0, 0) + 16819338), 17 - KeyEvent.normalizeMetaState(0), 6934 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 4);
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2047150232);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), ExpandableListView.getPackedPositionChild(0L) + 14, Color.argb(0, 0, 0, 0) + 6997, 1262876168, false, "HANA_BANK", (Class[]) null);
        }
        Object obj = null;
        objArr[0] = ((Field) objOnExtraCallback).get(null);
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1927274998);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 13, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6996, 1134501734, false, "SUHYUP_BANK", (Class[]) null);
        }
        objArr[1] = ((Field) objOnExtraCallback2).get(null);
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(785500611);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 13 - Color.red(0), 6997 - TextUtils.getOffsetBefore("", 0), 529610579, false, "EDUCAR", (Class[]) null);
        }
        objArr[2] = ((Field) objOnExtraCallback3).get(null);
        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2092198808);
        if (objOnExtraCallback4 == null) {
            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), 13 - (ViewConfiguration.getEdgeSlop() >> 16), 6996 - ExpandableListView.getPackedPositionChild(0L), -1307874568, false, "CARROT", (Class[]) null);
        }
        objArr[3] = ((Field) objOnExtraCallback4).get(null);
        boolean zOnExtraCallback$19226060 = filterCreatePageParams.onExtraCallback$19226060(uri, objArr) | zOnTransact;
        int i4 = asBinder + 11;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnExtraCallback$19226060;
        }
        obj.hashCode();
        throw null;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 17;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 45813), 132 - AndroidCharacter.getMirror('0'), TextUtils.indexOf((CharSequence) "", '0') + 21234, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 14184), 19 - (KeyEvent.getMaxKeyCode() >> 16), 8808 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        int i6 = $11 + 71;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    public void onExtraCallbackWithResult(@NotNull String str, @NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull Context context, @NotNull setText settext, @NotNull List<String> list, int i, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        int i2 = 2 % 2;
        int i3 = asInterface + 73;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(settext, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        FragmentActivity activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
        if (activity != null) {
            int i5 = asInterface + 47;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(activity);
            if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent != null) {
                maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(list, context, i, settext, this, setonoutofmemeryerrorcallback, str, null), 3, (Object) null);
                int i7 = asBinder + 33;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
            }
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ String $appBridgeName;
        final /* synthetic */ setOnOutOfMemeryErrorCallback $callbackProxy;
        final /* synthetic */ Context $context;
        final /* synthetic */ int $maxWidth;
        final /* synthetic */ setText $parsedMessage;
        final /* synthetic */ List<String> $rawImageUrls;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ getVersionNumber this$0;
        private static final byte[] $$a = {48, -22, 122, 126};
        private static final int $$b = 160;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onWarmupCompleted = 0;
        private static int onNavigationEvent = 1;
        private static int onExtraCallback = 478308902;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r6, int r7, byte r8) {
            /*
                int r6 = r6 * 2
                int r0 = 1 - r6
                int r7 = r7 * 4
                int r7 = r7 + 4
                int r8 = r8 * 4
                int r8 = r8 + 105
                byte[] r1 = o.getVersionNumber.onNavigationEvent.$$a
                byte[] r0 = new byte[r0]
                r2 = 0
                int r6 = 0 - r6
                if (r1 != 0) goto L19
                r3 = r8
                r4 = r2
                r8 = r7
                goto L2d
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r8
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L27:
                r3 = r1[r7]
                r5 = r8
                r8 = r7
                r7 = r3
                r3 = r5
            L2d:
                int r7 = -r7
                int r8 = r8 + 1
                int r7 = r7 + r3
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getVersionNumber.onNavigationEvent.$$c(byte, int, byte):java.lang.String");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(List<String> list, Context context, int i, setText settext, getVersionNumber getversionnumber, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, String str, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$rawImageUrls = list;
            this.$context = context;
            this.$maxWidth = i;
            this.$parsedMessage = settext;
            this.this$0 = getversionnumber;
            this.$callbackProxy = setonoutofmemeryerrorcallback;
            this.$appBridgeName = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$rawImageUrls, this.$context, this.$maxWidth, this.$parsedMessage, this.this$0, this.$callbackProxy, this.$appBridgeName, access13800Var);
            onnavigationevent.L$0 = obj;
            int i2 = onNavigationEvent + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            onWarmupCompleted(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                onnavigationeventCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = onnavigationeventCreate.invokeSuspend(unit);
            int i4 = onNavigationEvent + 21;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super AnalyzedImage>, Object> {
            private static int $10 = 0;
            private static int $11 = 1;
            private static int IAuthTabCallback = 0;
            private static int asBinder = 1;
            private static char onExtraCallback = 44262;
            private static char onExtraCallbackWithResult = 57299;
            private static char onNavigationEvent = 2716;
            private static char onWarmupCompleted = 44279;
            final /* synthetic */ Context $context;
            final /* synthetic */ int $maxWidth;
            final /* synthetic */ setText $parsedMessage;
            final /* synthetic */ Uri $uri;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            int label;
            final /* synthetic */ getVersionNumber this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onWarmupCompleted(Context context, int i, setText settext, Uri uri, getVersionNumber getversionnumber, access13800<? super onWarmupCompleted> access13800Var) {
                super(2, access13800Var);
                this.$context = context;
                this.$maxWidth = i;
                this.$parsedMessage = settext;
                this.$uri = uri;
                this.this$0 = getversionnumber;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$context, this.$maxWidth, this.$parsedMessage, this.$uri, this.this$0, access13800Var);
                int i2 = IAuthTabCallback + 89;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                return onwarmupcompleted;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                int i = 2 % 2;
                int i2 = asBinder + 73;
                IAuthTabCallback = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super AnalyzedImage> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    return onWarmupCompleted(findresandmsg, access13800Var);
                }
                onWarmupCompleted(findresandmsg, access13800Var);
                throw null;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super AnalyzedImage> access13800Var) throws Throwable {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 33;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
                if (i3 != 0) {
                    return onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
                }
                onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0094 A[PHI: r0
              0x0094: PHI (r0v16 java.lang.Object) = (r0v4 java.lang.Object), (r0v36 java.lang.Object) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0179  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x01aa  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x01da  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x01df  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r0 r7
              0x0028: PHI (r0v5 java.lang.Object) = (r0v4 java.lang.Object), (r0v36 java.lang.Object) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
              0x0028: PHI (r7v1 int) = (r7v0 int), (r7v16 int) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 612
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getVersionNumber.onNavigationEvent.onWarmupCompleted.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
                char[] cArr2 = new char[cArr.length];
                int i3 = 0;
                defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
                char[] cArr3 = new char[2];
                while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                    int i4 = $10 + 107;
                    $11 = i4 % 128;
                    if (i4 % 2 == 0) {
                        cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                        cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent / i3];
                    } else {
                        cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                        cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                    }
                    int i5 = $10 + 25;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = 58224;
                    int i8 = i3;
                    while (i8 < 16) {
                        int i9 = $10 + 21;
                        $11 = i9 % 128;
                        int i10 = i9 % 2;
                        char c = cArr3[1];
                        char c2 = cArr3[i3];
                        int i11 = (c2 + i7) ^ ((c2 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)));
                        int i12 = c2 >>> 5;
                        try {
                            Object[] objArr2 = new Object[4];
                            objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                            objArr2[2] = Integer.valueOf(i12);
                            objArr2[1] = Integer.valueOf(i11);
                            objArr2[i3] = Integer.valueOf(c);
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                            if (objOnExtraCallback == null) {
                                char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                                int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 10;
                                int defaultSize = View.getDefaultSize(i3, i3) + 12434;
                                Class[] clsArr = new Class[4];
                                clsArr[i3] = Integer.TYPE;
                                clsArr[1] = Integer.TYPE;
                                clsArr[2] = Integer.TYPE;
                                clsArr[3] = Integer.TYPE;
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(scrollBarSize, scrollBarSize2, defaultSize, -787580090, false, "C", clsArr);
                            }
                            char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            cArr3[1] = cCharValue;
                            char[] cArr4 = cArr3;
                            Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 10 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                            i7 -= 40503;
                            i8++;
                            cArr3 = cArr4;
                            i3 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    char[] cArr5 = cArr3;
                    cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
                    cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 16014), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14, 19902 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1250968944, false, "B", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    cArr3 = cArr5;
                    i3 = 0;
                }
                objArr[0] = new String(cArr2, 0, i);
            }
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            Object objIAuthTabCallback;
            Object obj3;
            int i = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    List<String> list = this.$rawImageUrls;
                    Context context = this.$context;
                    int i3 = this.$maxWidth;
                    setText settext = this.$parsedMessage;
                    getVersionNumber getversionnumber = this.this$0;
                    Result.Companion companion = Result.Companion;
                    List<String> list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        ArrayList arrayList2 = arrayList;
                        arrayList2.add(maybeUpdateAnimatable.onExtraCallback(findresandmsg, putChannelInfo.onWarmupCompleted(), (setRandomHost) null, new onWarmupCompleted(context, i3, settext, Uri.parse((String) it.next()), getversionnumber, null), 2, (Object) null));
                        settext = settext;
                        context = context;
                        arrayList = arrayList2;
                        getversionnumber = getversionnumber;
                        i3 = i3;
                    }
                    this.L$0 = access15400.onNavigationEvent(findresandmsg);
                    this.L$1 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    objIAuthTabCallback = ResourceCallback.IAuthTabCallback(arrayList, this);
                    if (objIAuthTabCallback == objOnWarmupCompleted) {
                        int i4 = onWarmupCompleted;
                        int i5 = i4 + 81;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        int i7 = i4 + 89;
                        onNavigationEvent = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i8 = 62 / 0;
                        }
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i2 != 1) {
                        Object[] objArr = new Object[1];
                        a(48 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), Process.getGidForName("") + 17, new char[]{65483, 65476, 27, '\r', 24, '\f', 65476, 7, 19, 22, 19, 25, 24, '\r', 18, '\t', 7, 5, 16, 16, 65476, 24, 19, 65476, 65483, 22, '\t', 23, 25, 17, '\t', 65483, 65476, 6, '\t', '\n', 19, 22, '\t', 65476, 65483, '\r', 18, 26, 19, 15, '\t'}, false, MotionEvent.axisFromString("") + 108, objArr);
                        throw new IllegalStateException(((String) objArr[0]).intern());
                    }
                    ResultKt.onNavigationEvent(obj);
                    objIAuthTabCallback = obj;
                }
                try {
                    Result.Companion companion2 = Result.Companion;
                    wie2 wie2VarOnExtraCallback = EndMotionInteraction.onExtraCallback();
                    wie2VarOnExtraCallback.onExtraCallback();
                    obj3 = Result.constructor-impl(wie2VarOnExtraCallback.onWarmupCompleted(new checkCanOpenLandingPage(AnalyzedImage.Companion.serializer()), objIAuthTabCallback));
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.Companion;
                    obj3 = Result.constructor-impl(ResultKt.createFailure(th));
                }
                if (Result.onExtraCallback(obj3)) {
                    obj3 = null;
                }
                obj2 = Result.constructor-impl((String) obj3);
            } catch (WebResourceResponseModel e) {
                Result.Companion companion4 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e));
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception e3) {
                Result.Companion companion5 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            getVersionNumber getversionnumber2 = this.this$0;
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.$callbackProxy;
            if (!(!Result.onNavigationEvent(obj2))) {
                getVersionNumber.onExtraCallback(getversionnumber2, setonoutofmemeryerrorcallback, (String) obj2);
            }
            getVersionNumber getversionnumber3 = this.this$0;
            String str = this.$appBridgeName;
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback2 = this.$callbackProxy;
            Throwable th2 = Result.exceptionOrNull-impl(obj2);
            if (th2 != null) {
                getVersionNumber.onWarmupCompleted(getversionnumber3, str, setonoutofmemeryerrorcallback2, th2);
                int i9 = onNavigationEvent + 9;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0167  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0168  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r22, int r23, char[] r24, boolean r25, int r26, java.lang.Object[] r27) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 370
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getVersionNumber.onNavigationEvent.a(int, int, char[], boolean, int, java.lang.Object[]):void");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onExtraCallbackWithResult(android.content.Context r20, android.net.Uri r21, o.access13800<? super java.util.List<java.lang.String>> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getVersionNumber.onExtraCallbackWithResult(android.content.Context, android.net.Uri, o.access13800):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onExtraCallback(android.content.Context r20, android.net.Uri r21, o.access13800<? super java.util.List<java.lang.String>> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getVersionNumber.onExtraCallback(android.content.Context, android.net.Uri, o.access13800):java.lang.Object");
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    private static void d(int i, char[] cArr, char[] cArr2, char c, char[] cArr3, Object[] objArr) throws Throwable {
        char c2;
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i4 = $11 + 71;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i6 = $11 + 23;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int i8 = 43 - (TypedValue.complexToFraction(i3, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i3, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i9 = (TypedValue.complexToFraction(i3, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i3, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1451;
                    byte b = (byte) i3;
                    byte b2 = b;
                    String str$$f = $$f(b, b2, (byte) (b2 - 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(windowTouchSlop, i8, i9, 228868077, false, str$$f, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char c3 = (char) (49123 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                    int iCombineMeasuredStates = View.combineMeasuredStates(i3, i3) + 44;
                    int iResolveSize = 1494 - View.resolveSize(i3, i3);
                    byte b3 = (byte) i3;
                    byte b4 = (byte) (b3 + 1);
                    String str$$f2 = $$f(b3, b4, (byte) (-b4));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i3] = Object.class;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, iCombineMeasuredStates, iResolveSize, 1533236389, false, str$$f2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                int i10 = cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i10);
                objArr4[i3] = trackSelectionParametersBuilderExternalSyntheticLambda0;
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    char scrollDefaultDelay = (char) (23972 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 50;
                    int defaultSize = View.getDefaultSize(i3, i3) + 22939;
                    Class[] clsArr3 = new Class[3];
                    clsArr3[i3] = Object.class;
                    clsArr3[1] = Integer.TYPE;
                    clsArr3[2] = Integer.TYPE;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(scrollDefaultDelay, pressedStateDuration, defaultSize, 1872485556, false, "k", clsArr3);
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i11 = cArr4[iIntValue2] * 32718;
                Object[] objArr5 = new Object[2];
                objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[i3] = Integer.valueOf(i11);
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    char c4 = (char) (45849 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int i12 = 29 - (ExpandableListView.getPackedPositionForGroup(i3) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i3) == 0L ? 0 : -1));
                    int i13 = 12578 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    c2 = 2;
                    Class[] clsArr4 = new Class[2];
                    clsArr4[i3] = Integer.TYPE;
                    clsArr4[1] = Integer.TYPE;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c4, i12, i13, 1401536470, false, "l", clsArr4);
                } else {
                    c2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (IAuthTabCallbackDefault ^ 7798559133331975163L)) ^ ((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (IAuthTabCallbackStub ^ 7798559133331975163L))) ^ ((char) (onTransact ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i3 = 0;
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

    static void onWarmupCompleted() {
        onWarmupCompleted = 419042959527384277L;
        IAuthTabCallbackStub = 7798559133331975163L;
        IAuthTabCallbackDefault = -1776194565;
        onTransact = (char) 10408;
    }
}
