package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.devtool.runtime.ui.scheme.history.Hilt_SchemeHistoryActivity$5;
import im.toss.features.home.core.local.model.TransactionFilterLocal;
import im.toss.global.features.leave.test.Hilt_GlobalLeaveTestActivity$4;
import im.toss.security.impl.appium.AppiumUiAutomationThreatMonitorImpl$;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import o.EngineConfig1;
import o.getPackageType;
import o.s3;
import o.s5a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class s3c implements s8ExternalSyntheticLambda0 {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static final String IAuthTabCallback;
    private static char[] IAuthTabCallbackDefault = null;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 1;
    private static char[] asBinder;
    private static long asInterface;
    private static int getInterfaceDescriptor;
    private static final String onNavigationEvent;
    private final findResAndMsg IAuthTabCallbackStub;
    private getPackageType onExtraCallback;
    private final Context onExtraCallbackWithResult;
    private Function1<? super String, Unit> onTransact;
    private final onNavigationEvent onWarmupCompleted;

    public static final class asBinder extends ContinuationImpl {
        private static final byte[] $$a;
        Object L$0;
        int label;
        /* synthetic */ Object result;
        static int IAuthTabCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(asBinder.class);
        private static final int $$b = 228;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r6, int r7, short r8) {
            /*
                int r6 = r6 * 2
                int r6 = 4 - r6
                int r8 = r8 * 3
                int r8 = r8 + 102
                byte[] r0 = o.s3c.asBinder.$$a
                int r7 = r7 * 4
                int r1 = 11 - r7
                byte[] r1 = new byte[r1]
                int r7 = 10 - r7
                r2 = 0
                if (r0 != 0) goto L18
                r3 = r7
                r4 = r2
                goto L2c
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r7) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L24:
                r4 = r0[r6]
                int r3 = r3 + 1
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2c:
                int r8 = -r8
                int r3 = r3 + r8
                int r8 = r3 + 2
                int r6 = r6 + 1
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.s3c.asBinder.$$c(byte, int, short):java.lang.String");
        }

        static {
            byte[] bArr = {65, -53, 110, -39, -1, -3, 12, 26, -27, 9, -14, 19, -15, -5};
            $$a = bArr;
            ClassLoader parent = asBinder.class.getClassLoader().getParent();
            try {
                byte b = (byte) (bArr[4] + 1);
                byte b2 = b;
                Method declaredMethod = ClassLoader.class.getDeclaredMethod($$c(b, b2, b2), String.class);
                declaredMethod.setAccessible(true);
                System.load((String) declaredMethod.invoke(parent, "ea56"));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        asBinder(access13800<? super asBinder> access13800Var) {
            super(access13800Var);
        }

        public static native void B(Object obj, Object obj2);

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(949);
            int i3 = i2 & iOnWarmupCompleted;
            int i4 = ((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 15) & 1;
            this.result = obj;
            if (i4 != 0) {
                throw null;
            }
            int i5 = this.label;
            int i6 = i5 & Integer.MIN_VALUE;
            int i7 = ((i5 | Integer.MIN_VALUE) & (~i6)) | i6;
            int i8 = IAuthTabCallback;
            int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2665);
            int i9 = i8 & iOnWarmupCompleted2;
            int i10 = ((((i8 ^ iOnWarmupCompleted2) | i9) & (~i9)) >> 9) & 1;
            this.label = i7;
            Object objOnNavigationEvent = s3c.this.onNavigationEvent((access13800<? super Boolean>) this);
            if (i10 != 0) {
                int i11 = 0 / 0;
            }
            return objOnNavigationEvent;
        }
    }

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onExtraCallbackWithResult.class);
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1725);
            int i3 = (~iOnWarmupCompleted) & i2;
            int i4 = (~i2) & iOnWarmupCompleted;
            int i5 = (((i4 & i3) | (i3 ^ i4)) >> 4) & 1;
            this.result = obj;
            int i6 = this.label;
            if (i5 != 0) {
                int i7 = 53 / 0;
            }
            int i8 = i6 ^ Integer.MIN_VALUE;
            int i9 = i6 & Integer.MIN_VALUE;
            this.label = (i9 & i8) | (i8 ^ i9);
            Object objOnWarmupCompleted = s3c.onWarmupCompleted(s3c.this, this);
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2265);
            return objOnWarmupCompleted;
        }
    }

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(Color.argb(0, 0, 0, 0), 31 - Color.argb(0, 0, 0, 0), (char) TextUtils.getTrimmedLength(""), objArr);
        IAuthTabCallback = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(32 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 30, (char) (KeyEvent.getMaxKeyCode() >> 16), objArr2);
        onNavigationEvent = ((String) objArr2[0]).intern();
        Companion = new onWarmupCompleted(null);
        int i = IAuthTabCallback_Parcel + 5;
        getInterfaceDescriptor = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = access000 + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str);
        int i4 = IAuthTabCallbackStubProxy + 121;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = access000 + 53;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
        int i4 = access000 + 67;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0102 A[PHI: r10
      0x0102: PHI (r10v11 java.util.List<android.accessibilityservice.AccessibilityServiceInfo>) = 
      (r10v10 java.util.List<android.accessibilityservice.AccessibilityServiceInfo>)
      (r10v17 java.util.List<android.accessibilityservice.AccessibilityServiceInfo>)
     binds: [B:16:0x00ff, B:13:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object onWarmupCompleted(int r6, int r7, int r8, int r9, int r10, int r11, java.lang.Object[] r12) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.s3c.onWarmupCompleted(int, int, int, int, int, int, java.lang.Object[]):java.lang.Object");
    }

    public s3c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallbackWithResult = context;
        this.IAuthTabCallbackStub = findRes.onWarmupCompleted(putChannelInfo.IAuthTabCallback().plus(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null)));
        this.onTransact = new AppiumUiAutomationThreatMonitorImpl$.ExternalSyntheticLambda0();
        this.onWarmupCompleted = new onNavigationEvent();
    }

    public static final /* synthetic */ boolean IAuthTabCallback(s3c s3cVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 65;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = s3cVar.onExtraCallback();
        int i4 = IAuthTabCallbackStubProxy + 39;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnExtraCallback;
        }
        throw null;
    }

    public static final /* synthetic */ void asBinder(s3c s3cVar) {
        int i = 2 % 2;
        int i2 = access000 + 33;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        s3cVar.asBinder();
        int i4 = IAuthTabCallbackStubProxy + 37;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Context onExtraCallback(s3c s3cVar) {
        int i = 2 % 2;
        int i2 = access000 + 103;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        Object obj = null;
        Context context = s3cVar.onExtraCallbackWithResult;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 91;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return context;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(s3c s3cVar, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = s3cVar.onExtraCallback((access13800<? super Boolean>) access13800Var);
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
        return objOnExtraCallback;
    }

    public static final /* synthetic */ Object onNavigationEvent(s3c s3cVar, List list, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = access000 + 67;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            s3cVar.onExtraCallbackWithResult((List<Integer>) list, (access13800<? super Boolean>) access13800Var);
            throw null;
        }
        Object objOnExtraCallbackWithResult = s3cVar.onExtraCallbackWithResult((List<Integer>) list, (access13800<? super Boolean>) access13800Var);
        int i3 = access000 + 123;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 88 / 0;
        }
        return objOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ Function1 onNavigationEvent(s3c s3cVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 79;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Function1<? super String, Unit> function1 = s3cVar.onTransact;
        int i5 = i2 + 33;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 29 / 0;
        }
        return function1;
    }

    public static final /* synthetic */ Object onWarmupCompleted(s3c s3cVar, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 43;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return s3cVar.onWarmupCompleted((access13800<? super List<Integer>>) access13800Var);
        }
        s3cVar.onWarmupCompleted((access13800<? super List<Integer>>) access13800Var);
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        s3c s3cVar = (s3c) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = s3cVar.onNavigationEvent();
        int i4 = access000 + 123;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zOnNavigationEvent);
    }

    public static final /* synthetic */ findResAndMsg onWarmupCompleted(s3c s3cVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 21;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsg = s3cVar.IAuthTabCallbackStub;
        if (i3 != 0) {
            return findresandmsg;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 51;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Override // o.s8ExternalSyntheticLambda0
    public void onExtraCallback(@NotNull Function1<? super String, Unit> function1) {
        int i = 2 % 2;
        int i2 = access000 + 85;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        if (!zzaj.onNavigationEvent().RemoteActionCompatParcelizer()) {
            int i4 = access000 + 61;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                zzaj.onNavigationEvent().MediaBrowserCompatMediaItem();
                throw null;
            }
            if (!zzaj.onNavigationEvent().MediaBrowserCompatMediaItem()) {
                int i5 = access000 + 5;
                IAuthTabCallbackStubProxy = i5 % 128;
                int i6 = i5 % 2;
                if (!zzaj.onNavigationEvent().MediaMetadataCompat() && DERSet.onExtraCallback.extraCommand()) {
                    int i7 = access000 + 19;
                    IAuthTabCallbackStubProxy = i7 % 128;
                    if (i7 % 2 != 0) {
                        this.onTransact = function1;
                        onExtraCallbackWithResult();
                        asBinder();
                        throw null;
                    }
                    this.onTransact = function1;
                    onExtraCallbackWithResult();
                    asBinder();
                }
            }
        }
        int i8 = IAuthTabCallbackStubProxy + 99;
        access000 = i8 % 128;
        int i9 = i8 % 2;
    }

    private static final Unit IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = access000 + 69;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    @Override // o.s8ExternalSyntheticLambda0
    public void onWarmupCompleted() {
        int i = 2 % 2;
        this.onTransact = new AppiumUiAutomationThreatMonitorImpl$.ExternalSyntheticLambda1();
        getPackageType getpackagetype = this.onExtraCallback;
        if (getpackagetype != null) {
            int i2 = IAuthTabCallbackStubProxy + 105;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            int i4 = access000 + 27;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
        this.onExtraCallback = null;
        onTransact();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // o.s8ExternalSyntheticLambda0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onNavigationEvent(@org.jetbrains.annotations.NotNull o.access13800<? super java.lang.Boolean> r11) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.s3c.onNavigationEvent(o.access13800):java.lang.Object");
    }

    public final class onNavigationEvent extends BroadcastReceiver {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static char[] onNavigationEvent = {27255, 27198, 27170, 27176, 27143, 27141, 27173, 27199, 27170, 27175, 27199, 27167, 27145, 27180, 27173, 27168, 27170, 27168, 27136, 27249, 27142, 27148, 27145, 27144, 27146, 27144, 27164, 27166, 27148, 27146, 27146, 27146, 27164, 27177, 27175, 27258, 27158, 27177, 27337, 27339, 27337, 27338, 27189, 27182, 27172, 27332, 27340, 27339, 27332, 27338, 27178, 27180, 27185, 27339, 27335, 27338, 27340, 27342, 27173, 27155, 27155, 27157, 27153, 27177, 27181, 27178, 27199, 27173, 27153, 27155, 27153, 27182, 27157};
        private static int onWarmupCompleted = 1;

        static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int $10 = 0;
            private static int $11 = 1;
            private static long onExtraCallback = 463309339688708717L;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;
            int label;
            final /* synthetic */ s3c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallbackWithResult(s3c s3cVar, access13800<? super onExtraCallbackWithResult> access13800Var) {
                super(2, access13800Var);
                this.this$0 = s3cVar;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.this$0, access13800Var);
                int i2 = onWarmupCompleted + 77;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return onextracallbackwithresult;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 67;
                onNavigationEvent = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    onWarmupCompleted(findresandmsg, access13800Var);
                    throw null;
                }
                Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
                int i3 = onWarmupCompleted + 95;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return objOnWarmupCompleted;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 101;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
                if (i3 == 0) {
                    return onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
                }
                int i4 = 32 / 0;
                return onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            }

            private static void a(char[] cArr, int i, Object[] objArr) {
                int i2 = 2 % 2;
                AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
                audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
                int length = cArr.length;
                long[] jArr = new long[length];
                audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
                while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                    jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = s3.onWarmupCompleted.AnonymousClass2.u(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback], audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0) ^ (onExtraCallback ^ 5407414049857832247L);
                    SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
                }
                char[] cArr2 = new char[length];
                audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
                while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                    int i3 = $11 + 23;
                    $10 = i3 % 128;
                    int i4 = i3 % 2;
                    cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                    SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
                }
                String str = new String(cArr2);
                int i5 = $11 + 49;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                objArr[0] = str;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[PHI: r2
              0x0053: PHI (r2v24 java.lang.Object) = (r2v4 java.lang.Object), (r2v25 java.lang.Object) binds: [B:8:0x0029, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x002b A[PHI: r8
              0x002b: PHI (r8v1 int) = (r8v0 int), (r8v9 int) binds: [B:8:0x0029, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r25) {
                /*
                    Method dump skipped, instructions count: 380
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: o.s3c.onNavigationEvent.onExtraCallbackWithResult.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public onNavigationEvent() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            String action;
            int i = 2 % 2;
            Object obj = null;
            if (intent != null) {
                int i2 = onExtraCallbackWithResult + 35;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    action = intent.getAction();
                    int i3 = onWarmupCompleted + 19;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                } else {
                    intent.getAction();
                    obj.hashCode();
                    throw null;
                }
            } else {
                action = null;
            }
            Object[] objArr = new Object[1];
            a(new int[]{0, 35, 0, 32}, false, new byte[]{0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0}, objArr);
            if (!Intrinsics.areEqual(action, ((String) objArr[0]).intern())) {
                int i5 = onExtraCallbackWithResult + 29;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    Object[] objArr2 = new Object[1];
                    a(new int[]{35, 38, 25, 23}, false, new byte[]{1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0}, objArr2);
                    if (!Intrinsics.areEqual(action, ((String) objArr2[0]).intern())) {
                        return;
                    }
                } else {
                    Object[] objArr3 = new Object[1];
                    a(new int[]{35, 38, 25, 23}, true, new byte[]{1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0}, objArr3);
                    if (!Intrinsics.areEqual(action, ((String) objArr3[0]).intern())) {
                        return;
                    }
                }
            }
            maybeUpdateAnimatable.onNavigationEvent(s3c.onWarmupCompleted(s3c.this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(s3c.this, null), 3, (Object) null);
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) {
            int i;
            int length;
            char[] cArr;
            int i2;
            int i3 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i4 = iArr[0];
            int i5 = iArr[1];
            int i6 = iArr[2];
            int i7 = iArr[3];
            char[] cArr2 = onNavigationEvent;
            if (cArr2 != null) {
                int i8 = $10 + 21;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    length = cArr2.length;
                    cArr = new char[length];
                    i2 = 1;
                } else {
                    length = cArr2.length;
                    cArr = new char[length];
                    i2 = 0;
                }
                while (i2 < length) {
                    cArr[i2] = EngineConfig1.onNavigationEvent.AnonymousClass4.t(cArr2[i2]);
                    i2++;
                }
                cArr2 = cArr;
            }
            char[] cArr3 = new char[i5];
            System.arraycopy(cArr2, i4, cArr3, 0, i5);
            if (bArr != null) {
                char[] cArr4 = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                int i9 = $11 + 121;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                    int i11 = $11 + 97;
                    $10 = i11 % 128;
                    if (i11 % 2 == 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 0) {
                        cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = getExternalTransactionToken.q(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                    } else {
                        cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = Hilt_GlobalLeaveTestActivity$4.p(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Hilt_SchemeHistoryActivity$5.w(trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0);
                }
                cArr3 = cArr4;
            }
            if (i7 > 0) {
                char[] cArr5 = new char[i5];
                System.arraycopy(cArr3, 0, cArr5, 0, i5);
                int i12 = i5 - i7;
                System.arraycopy(cArr5, 0, cArr3, i12, i7);
                System.arraycopy(cArr5, i7, cArr3, 0, i12);
            }
            if (z) {
                char[] cArr6 = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                int i13 = $11 + 5;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                    int i15 = $10 + 15;
                    $11 = i15 % 128;
                    if (i15 % 2 == 0) {
                        cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[i5 % trackGroupExternalSyntheticLambda0.onNavigationEvent];
                        i = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    } else {
                        cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                        i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                    }
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
                }
                cArr3 = cArr6;
            }
            if (i6 > 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr3);
        }
    }

    private final void asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        access000 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getPackageType getpackagetype = this.onExtraCallback;
            if (getpackagetype != null) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                int i3 = access000 + 63;
                IAuthTabCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
            }
            this.onExtraCallback = maybeUpdateAnimatable.onNavigationEvent(this.IAuthTabCallbackStub, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStub(null), 3, (Object) null);
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ List<Integer> $ports;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ s3c this$0;
        private static char[] onExtraCallbackWithResult = {60860, 53138, 43460, 35634, 25894, 18177, 8407, 721, 64638, 56876, 47121, 38319, 30646, 14157, 5411, 29539, 20871, 49113, 40433, 64033, 55378, 9857, 60819, 53155, 43492, 58662, 50981, 41331, 33688, 28122, 20464, 10270, 2640, 62646, 54992, 45287, 40238, 32594, 22924, 15279, 58848, 50728, 41051, 33463, 27833, 20221, 11032, 5450, 63341, 53636, 46054, 39954, 32335, 22641, 15016, 58569, 60833, 53135, 43503, 35619, 25961, 18266, 8343, 743, 64549, 56930, 47177, 38301, 30690, 20737, 13084, 60754, 52870, 43235, 35377, 25622, 18019, 9130, 7677, 65502, 55553, 47957, 38068, 30455, 20680, 60855, 53127, 43484, 35630, 25916, 18266, 8343, 682, 64611, 56932, 47173, 38273, 30713, 20787, 13069, 60701, 52948, 43236, 35381, 25604, 18003, 9148, 7677, 65418, 55619, 47967, 38062, 30436, 20675, 12821, 60525, 51709, 43956, 34257, 26393, 16758, 8884, 7374, 65243, 55333, 47734, 38841, 29077, 21446, 3365, 61296, 51533};
        private static long onExtraCallback = -6592838488579321882L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(List<Integer> list, s3c s3cVar, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$ports = list;
            this.this$0 = s3cVar;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$ports, this.this$0, access13800Var);
            onextracallback.L$0 = obj;
            int i2 = onWarmupCompleted + 33;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallback;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 93;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 115;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 73;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 53 / 0;
            }
            return objInvokeSuspend;
        }

        private static void a(int i, int i2, char c, Object[] objArr) {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            int i4 = $11 + 105;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                jArr[i6] = s5a.onExtraCallbackWithResult.b(getPageByNodeId.c(onExtraCallbackWithResult[i + i6]), i6, onExtraCallback, c);
                HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
            }
            char[] cArr = new char[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            int i7 = $10 + 11;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
            }
            objArr[0] = new String(cArr);
        }

        public final Object invokeSuspend(Object obj) {
            HttpURLConnection httpURLConnection;
            HttpURLConnection httpURLConnection2;
            String text;
            String str = "";
            int i = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            char c = '0';
            long j = 0;
            if (this.label != 0) {
                Object[] objArr = new Object[1];
                a((ViewConfiguration.getFadingEdgeLength() >> 16) + 85, ExpandableListView.getPackedPositionChild(0L) + 48, (char) ExpandableListView.getPackedPositionType(0L), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            int i2 = IAuthTabCallback + 31;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            Iterator<Integer> it = this.$ports.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                findRes.onExtraCallbackWithResult(findresandmsg);
                try {
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr2 = new Object[1];
                    a(View.MeasureSpec.makeMeasureSpec(0, 0), 13 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) - 1), objArr2);
                    sb.append(((String) objArr2[0]).intern());
                    sb.append(iIntValue);
                    Object[] objArr3 = new Object[1];
                    a(TextUtils.indexOf(str, c, 0) + 14, TextUtils.getOffsetAfter(str, 0) + 9, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 55989), objArr3);
                    sb.append(((String) objArr3[0]).intern());
                    URLConnection uRLConnectionOpenConnection = new URL(sb.toString()).openConnection();
                    Intrinsics.checkNotNull(uRLConnectionOpenConnection, str);
                    httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
                    try {
                        Object[] objArr4 = new Object[1];
                        a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 22, 3 - Color.argb(0, 0, 0, 0), (char) (1 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1))), objArr4);
                        httpURLConnection2.setRequestMethod(((String) objArr4[0]).intern());
                        httpURLConnection2.setConnectTimeout(5000);
                        httpURLConnection2.setReadTimeout(5000);
                        InputStream inputStream = httpURLConnection2.getInputStream();
                        Intrinsics.checkNotNullExpressionValue(inputStream, str);
                        text = TextStreamsKt.readText(new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192));
                        Intrinsics.checkNotNullExpressionValue(s3c.onExtraCallback(this.this$0).getPackageName(), str);
                    } catch (Throwable unused) {
                        httpURLConnection = httpURLConnection2;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        c = '0';
                        j = 0;
                    }
                } catch (Throwable unused2) {
                    httpURLConnection = null;
                }
                if (!(!StringsKt.contains$default(text, r12, false, 2, (Object) null))) {
                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    Object[] objArr5 = new Object[1];
                    a(Color.red(0) + 25, 31 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 2227), objArr5);
                    String strIntern = ((String) objArr5[0]).intern();
                    Object[] objArr6 = new Object[1];
                    a(56 - (ViewConfiguration.getPressedStateDuration() >> 16), Color.argb(0, 0, 0, 0) + 29, (char) KeyEvent.normalizeMetaState(0), objArr6);
                    ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray, strIntern, ((String) objArr6[0]).intern(), null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                    Boolean boolOnNavigationEvent = access14000.onNavigationEvent(true);
                    httpURLConnection2.disconnect();
                    return boolOnNavigationEvent;
                }
                httpURLConnection2.disconnect();
                c = '0';
                j = 0;
            }
            Boolean boolOnNavigationEvent2 = access14000.onNavigationEvent(false);
            int i4 = IAuthTabCallback + 29;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 82 / 0;
            }
            return boolOnNavigationEvent2;
        }
    }

    private static void a(int i, int i2, char c, Object[] objArr) {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            jArr[i4] = s5a.onExtraCallbackWithResult.b(getPageByNodeId.c(IAuthTabCallbackDefault[i + i4]), i4, asInterface, c);
            HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i5 = $11 + 21;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $10 + 29;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
                int i8 = 19 / 0;
            } else {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
            }
        }
        objArr[0] = new String(cArr);
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char[] IAuthTabCallback = {27258, 27173, 27196, 27196, 27171, 27174, 27144, 27245, 27141, 27198, 27168, 27168, 27146, 27151, 27175, 27198, 27198, 27196, 27194, 27168, 27173, 27175, 27178, 27180, 27176, 27170, 27144, 27140, 27199, 27145, 27245, 27138, 27173, 27170, 27194, 27199, 27175, 27144, 27245, 27151, 27181, 27179, 27172, 27198, 27173, 27148, 27245, 27363, 27369, 27388, 27345, 27365, 27363, 27388, 27389, 27185, 27369, 27357, 27365, 27389, 27369, 27360, 27360, 27185, 27390, 27373, 27362, 27362, 27345, 27375, 27359, 27388, 27345, 27373, 27390, 27368, 27356, 27362, 27253, 27198, 27176, 27170, 27195, 27196, 27169, 27174, 27173, 27169, 27171, 27169, 27177, 27172, 27194, 27173, 27174, 27172, 27181, 27177, 27168, 27169, 27172, 27181, 27180, 27179, 27171, 27171, 27179, 27170, 27171, 27179, 27260, 27178, 27170, 27173, 27178, 27170, 27170, 27178, 27183, 27180, 27178, 27176, 27169, 27194, 27173, 27170, 27175, 27170, 27192, 27168, 27172, 27172, 27179, 27179, 27168, 27197, 27170, 27178, 27181, 27180, 27193, 27301, 27309, 27304, 27304, 27307, 27301, 27311, 27310, 27302, 27304, 27302, 27299, 27304, 27304, 27309, 27309, 27299, 27301, 27301, 27252, 27172, 27181, 27173, 27171, 27152, 27183, 27168, 27170, 27168, 27172, 27177, 27168, 27199, 27194, 27157, 27163, 27153, 27183, 27199, 27169, 27170, 27198, 27158, 27159, 27198, 27198, 27196, 27173, 27148, 27143, 27198, 27199, 27168, 27173, 27168, 27152};
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = s3c.this.new IAuthTabCallbackStub(access13800Var);
            iAuthTabCallbackStub.L$0 = obj;
            int i2 = onWarmupCompleted + 11;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackStub;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 9 / 0;
            }
            int i5 = onWarmupCompleted + 27;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStubCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return iAuthTabCallbackStubCreate.invokeSuspend(Unit.INSTANCE);
            }
            iAuthTabCallbackStubCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        /* JADX WARN: Path cross not found for [B:29:0x00be, B:37:0x00cb], limit reached: 79 */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00d1 A[Catch: Exception -> 0x0246, CancellationException -> 0x0252, WebResourceResponseModel -> 0x0254, TryCatch #3 {CancellationException -> 0x0252, Exception -> 0x0246, WebResourceResponseModel -> 0x0254, blocks: (B:9:0x003e, B:50:0x0187, B:52:0x0190, B:61:0x021a, B:53:0x01b6, B:56:0x01d8, B:59:0x01e9, B:14:0x0071, B:17:0x0084, B:49:0x0183, B:21:0x009e, B:43:0x015a, B:46:0x016b, B:65:0x023e, B:24:0x00ab, B:29:0x00be, B:31:0x00c4, B:39:0x00d1, B:37:0x00cb, B:40:0x0141), top: B:81:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0190 A[Catch: Exception -> 0x0246, CancellationException -> 0x0252, WebResourceResponseModel -> 0x0254, TryCatch #3 {CancellationException -> 0x0252, Exception -> 0x0246, WebResourceResponseModel -> 0x0254, blocks: (B:9:0x003e, B:50:0x0187, B:52:0x0190, B:61:0x021a, B:53:0x01b6, B:56:0x01d8, B:59:0x01e9, B:14:0x0071, B:17:0x0084, B:49:0x0183, B:21:0x009e, B:43:0x015a, B:46:0x016b, B:65:0x023e, B:24:0x00ab, B:29:0x00be, B:31:0x00c4, B:39:0x00d1, B:37:0x00cb, B:40:0x0141), top: B:81:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01b6 A[Catch: Exception -> 0x0246, CancellationException -> 0x0252, WebResourceResponseModel -> 0x0254, TryCatch #3 {CancellationException -> 0x0252, Exception -> 0x0246, WebResourceResponseModel -> 0x0254, blocks: (B:9:0x003e, B:50:0x0187, B:52:0x0190, B:61:0x021a, B:53:0x01b6, B:56:0x01d8, B:59:0x01e9, B:14:0x0071, B:17:0x0084, B:49:0x0183, B:21:0x009e, B:43:0x015a, B:46:0x016b, B:65:0x023e, B:24:0x00ab, B:29:0x00be, B:31:0x00c4, B:39:0x00d1, B:37:0x00cb, B:40:0x0141), top: B:81:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x01e0  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0235  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0236  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0236 -> B:50:0x0187). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 785
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.s3c.IAuthTabCallbackStub.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) {
            int i = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr = IAuthTabCallback;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    int i7 = $10 + 63;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        cArr2[i6] = EngineConfig1.onNavigationEvent.AnonymousClass4.t(cArr[i6]);
                    } else {
                        cArr2[i6] = EngineConfig1.onNavigationEvent.AnonymousClass4.t(cArr[i6]);
                        i6++;
                    }
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr, i2, cArr3, 0, i3);
            if (bArr != null) {
                int i8 = $10 + 103;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char[] cArr4 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = Hilt_GlobalLeaveTestActivity$4.p(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                    } else {
                        cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = getExternalTransactionToken.q(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Hilt_SchemeHistoryActivity$5.w(trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0);
                }
                cArr3 = cArr4;
            }
            if (i5 > 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr3, 0, cArr5, 0, i3);
                int i10 = i3 - i5;
                System.arraycopy(cArr5, 0, cArr3, i10, i5);
                System.arraycopy(cArr5, i5, cArr3, 0, i10);
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
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                    int i11 = $11 + 97;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                }
            }
            objArr[0] = new String(cArr3);
        }
    }

    private final Object onExtraCallbackWithResult(List<Integer> list, access13800<? super Boolean> access13800Var) {
        int i = 2 % 2;
        Object obj = null;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onExtraCallback(list, this, null), access13800Var);
        int i2 = access000 + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return objOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007b, code lost:
    
        r3 = new java.lang.Object[1];
        a(android.view.KeyEvent.keyCodeFromString("") + 119, 16 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1))), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a6, code lost:
    
        if (android.provider.Settings.Global.getInt(r1, ((java.lang.String) r3[0]).intern(), 0) != 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a8, code lost:
    
        r1 = o.s3c.access000 + 75;
        o.s3c.IAuthTabCallbackStubProxy = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b1, code lost:
    
        if ((r1 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b4, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b5, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003e, code lost:
    
        if (android.provider.Settings.Global.getInt(r1, ((java.lang.String) r9[0]).intern(), 0) == 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006f, code lost:
    
        if (android.provider.Settings.Global.getInt(r1, ((java.lang.String) r9[0]).intern(), 0) == 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0071, code lost:
    
        r1 = o.s3c.IAuthTabCallbackStubProxy + 63;
        o.s3c.access000 = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean onNavigationEvent() {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.s3c.access000
            int r1 = r1 + 67
            int r2 = r1 % 128
            o.s3c.IAuthTabCallbackStubProxy = r2
            int r1 = r1 % r0
            r2 = 0
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L41
            android.content.Context r1 = r10.onExtraCallbackWithResult
            android.content.ContentResolver r1 = r1.getContentResolver()
            int r6 = android.view.ViewConfiguration.getScrollDefaultDelay()
            int r6 = r6 * 7526
            int r7 = android.widget.ExpandableListView.getPackedPositionChild(r2)
            int r7 = r7 * 125
            int r8 = android.view.KeyEvent.getMaxKeyCode()
            int r8 = r8 + (-53)
            int r8 = 1104 - r8
            char r8 = (char) r8
            java.lang.Object[] r9 = new java.lang.Object[r5]
            a(r6, r7, r8, r9)
            r6 = r9[r4]
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = r6.intern()
            int r6 = android.provider.Settings.Global.getInt(r1, r6, r4)
            if (r6 != r5) goto L7b
            goto L71
        L41:
            android.content.Context r1 = r10.onExtraCallbackWithResult
            android.content.ContentResolver r1 = r1.getContentResolver()
            int r6 = android.view.ViewConfiguration.getScrollDefaultDelay()
            int r6 = r6 >> 16
            int r6 = 108 - r6
            int r7 = android.widget.ExpandableListView.getPackedPositionChild(r2)
            int r7 = r7 + 12
            int r8 = android.view.KeyEvent.getMaxKeyCode()
            int r8 = r8 >> 16
            int r8 = 28257 - r8
            char r8 = (char) r8
            java.lang.Object[] r9 = new java.lang.Object[r5]
            a(r6, r7, r8, r9)
            r6 = r9[r4]
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = r6.intern()
            int r6 = android.provider.Settings.Global.getInt(r1, r6, r4)
            if (r6 != r5) goto L7b
        L71:
            int r1 = o.s3c.IAuthTabCallbackStubProxy
            int r1 = r1 + 63
            int r2 = r1 % 128
            o.s3c.access000 = r2
            int r1 = r1 % r0
            return r5
        L7b:
            java.lang.String r6 = ""
            int r6 = android.view.KeyEvent.keyCodeFromString(r6)
            int r6 = r6 + 119
            r7 = 0
            float r8 = android.graphics.PointF.length(r7, r7)
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            int r7 = 16 - r7
            long r8 = android.os.SystemClock.elapsedRealtimeNanos()
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            int r2 = 1 - r2
            char r2 = (char) r2
            java.lang.Object[] r3 = new java.lang.Object[r5]
            a(r6, r7, r2, r3)
            r2 = r3[r4]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            int r1 = android.provider.Settings.Global.getInt(r1, r2, r4)
            if (r1 != r5) goto Lb5
            int r1 = o.s3c.access000
            int r1 = r1 + 75
            int r2 = r1 % 128
            o.s3c.IAuthTabCallbackStubProxy = r2
            int r1 = r1 % r0
            if (r1 == 0) goto Lb4
            return r4
        Lb4:
            return r5
        Lb5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.s3c.onNavigationEvent():boolean");
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char[] IAuthTabCallback = {27192, 27298, 27307, 27302, 27297, 27296, 27294, 27360, 27264, 27300, 27303, 27324, 27301, 27303, 27301, 27300, 27266, 27275, 27304, 27296, 27300, 27299, 27297, 27269, 27265, 27299, 27309, 27303, 27324, 27263, 27180, 27176, 27170, 27144, 27140, 27199, 27145, 27245, 27138, 27173, 27170, 27194, 27199, 27175, 27144, 27245, 27151, 27181, 27179, 27172, 27198, 27173, 27148, 27245, 27142, 27173, 27196, 27196, 27171, 27174, 27144, 27245, 27141, 27198, 27168, 27168, 27146, 27151, 27175, 27198, 27198, 27196, 27194, 27168, 27173, 27175};
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = s3c.this.new IAuthTabCallback(access13800Var);
            int i2 = onExtraCallbackWithResult + 45;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            Object objOnExtraCallback;
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Boolean> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
                int i3 = 37 / 0;
            } else {
                objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            }
            int i4 = onExtraCallbackWithResult + 111;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 31;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 28 / 0;
            }
            int i5 = onExtraCallback + 55;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            boolean z = false;
            if (this.label != 0) {
                Object[] objArr = new Object[1];
                a(new int[]{29, 47, 0, 0}, false, new byte[]{1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1}, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(obj);
            try {
                PackageManager packageManager = s3c.onExtraCallback(s3c.this).getPackageManager();
                Object[] objArr2 = new Object[1];
                a(new int[]{0, 29, 126, 14}, false, new byte[]{1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1}, objArr2);
                packageManager.getApplicationInfo(((String) objArr2[0]).intern(), 0);
                z = true;
            } catch (Throwable unused) {
            }
            Boolean boolOnNavigationEvent = access14000.onNavigationEvent(z);
            int i4 = onExtraCallbackWithResult + 77;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return boolOnNavigationEvent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) {
            char[] cArr;
            char[] cArr2;
            int length;
            char[] cArr3;
            int i = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr4 = IAuthTabCallback;
            if (cArr4 != null) {
                int i6 = $11;
                int i7 = i6 + 65;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    length = cArr4.length;
                    cArr3 = new char[length];
                } else {
                    length = cArr4.length;
                    cArr3 = new char[length];
                }
                int i8 = i6 + 5;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = $10 + 83;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr3[i10] = EngineConfig1.onNavigationEvent.AnonymousClass4.t(cArr4[i10]);
                }
                cArr4 = cArr3;
            }
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr4, i2, cArr5, 0, i3);
            if (bArr != null) {
                int i13 = $10 + 9;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    cArr2 = new char[i3];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
                } else {
                    cArr2 = new char[i3];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                }
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        cArr2[trackGroupExternalSyntheticLambda0.onNavigationEvent] = Hilt_GlobalLeaveTestActivity$4.p(cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                    } else {
                        cArr2[trackGroupExternalSyntheticLambda0.onNavigationEvent] = getExternalTransactionToken.q(cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                    }
                    c = cArr2[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Hilt_SchemeHistoryActivity$5.w(trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0);
                }
                cArr5 = cArr2;
            }
            if (i5 > 0) {
                char[] cArr6 = new char[i3];
                System.arraycopy(cArr5, 0, cArr6, 0, i3);
                int i14 = i3 - i5;
                System.arraycopy(cArr6, 0, cArr5, i14, i5);
                System.arraycopy(cArr6, i5, cArr5, 0, i14);
            }
            if (!(!z)) {
                int i15 = $10 + 3;
                $11 = i15 % 128;
                if (i15 % 2 == 0) {
                    cArr = new char[i3];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
                } else {
                    cArr = new char[i3];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                }
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr5[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr5 = cArr;
            }
            if (i4 > 0) {
                loop3: while (true) {
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                        int i16 = $11 + 61;
                        $10 = i16 % 128;
                        if (i16 % 2 != 0) {
                            break;
                        }
                        cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                        trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                    }
                    cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent] % iArr[4]);
                    int i17 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                }
            }
            objArr[0] = new String(cArr5);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        s3c s3cVar = (s3c) objArr[0];
        int i = 2 % 2;
        Object obj = null;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), s3cVar.new IAuthTabCallback(null), (access13800) objArr[1]);
        int i2 = access000 + 57;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return objOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        s3c s3cVar = (s3c) objArr[0];
        int i = 2 % 2;
        onNavigationEvent onnavigationevent = s3cVar.onWarmupCompleted;
        Context context = s3cVar.onExtraCallbackWithResult;
        IntentFilter intentFilter = new IntentFilter();
        Object[] objArr2 = new Object[1];
        a(135 - Color.alpha(0), 35 - (KeyEvent.getMaxKeyCode() >> 16), (char) (10506 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr2);
        intentFilter.addAction(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        b(true, new byte[]{0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, new int[]{63, 38, 134, 0}, objArr3);
        intentFilter.addAction(((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        a(169 - TextUtils.lastIndexOf("", '0', 0), 7 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) Drawable.resolveOpacity(0, 0), objArr4);
        intentFilter.addDataScheme(((String) objArr4[0]).intern());
        Unit unit = Unit.INSTANCE;
        zzbb.onExtraCallbackWithResult(onnavigationevent, context, intentFilter, 4);
        int i2 = IAuthTabCallbackStubProxy + 77;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 28 / 0;
        }
        return null;
    }

    private final void onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 71;
        access000 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.onExtraCallbackWithResult.unregisterReceiver(this.onWarmupCompleted);
                int i3 = 18 / 0;
            } else {
                this.onExtraCallbackWithResult.unregisterReceiver(this.onWarmupCompleted);
            }
            int i4 = IAuthTabCallbackStubProxy + 43;
            access000 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable unused) {
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = asBinder;
        if (cArr != null) {
            int i6 = $11 + 65;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i8 = 0; i8 < length; i8++) {
                int i9 = $10 + 89;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                cArr2[i8] = EngineConfig1.onNavigationEvent.AnonymousClass4.t(cArr[i8]);
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i11 = $11 + 3;
                $10 = i11 % 128;
                if (i11 % 2 == 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1) {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = getExternalTransactionToken.q(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                } else {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = Hilt_GlobalLeaveTestActivity$4.p(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Hilt_SchemeHistoryActivity$5.w(trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i12 = $10 + 85;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr3, 0, cArr5, 1, i3);
                int i13 = i3 >> i5;
                System.arraycopy(cArr5, 0, cArr3, i13, i5);
                System.arraycopy(cArr5, i5, cArr3, 0, i13);
            } else {
                char[] cArr6 = new char[i3];
                System.arraycopy(cArr3, 0, cArr6, 0, i3);
                int i14 = i3 - i5;
                System.arraycopy(cArr6, 0, cArr3, i14, i5);
                System.arraycopy(cArr6, i5, cArr3, 0, i14);
            }
        }
        if (z) {
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
                int i15 = $10 + 77;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onWarmupCompleted(o.access13800<? super java.util.List<java.lang.Integer>> r15) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.s3c.onWarmupCompleted(o.access13800):java.lang.Object");
    }

    public static final /* synthetic */ boolean onExtraCallbackWithResult(s3c s3cVar) {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        return ((Boolean) onWarmupCompleted(1273316351, TransactionFilterLocal.Companion.onNavigationEvent(), -1273316349, TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, new Object[]{s3cVar})).booleanValue();
    }

    private final Object onExtraCallback(access13800<? super Boolean> access13800Var) {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        return onWarmupCompleted(-946683889, TransactionFilterLocal.Companion.onNavigationEvent(), 946683892, TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, new Object[]{this, access13800Var});
    }

    private final boolean onExtraCallback() {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        return ((Boolean) onWarmupCompleted(971955052, TransactionFilterLocal.Companion.onNavigationEvent(), -971955051, TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, new Object[]{this})).booleanValue();
    }

    private final void onExtraCallbackWithResult() {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        onWarmupCompleted(949625830, TransactionFilterLocal.Companion.onNavigationEvent(), -949625830, TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, new Object[]{this});
    }

    static void IAuthTabCallback() {
        IAuthTabCallbackDefault = new char[]{60821, 19146, 41848, 7159, 28697, 43167, 277, 31167, 55013, 3967, 26604, 56321, 13457, 27939, 50596, 8911, 39771, 62452, 10300, 32918, 63806, 20919, 36545, 59202, 24535, 46089, 60569, 17696, 48562, 6855, 29506, 60861, 19157, 41766, 7167, 28700, 43138, 297, 31139, 54985, 3876, 26605, 56327, 13469, 27959, 50596, 8905, 39769, 62459, 10268, 32913, 63806, 20960, 36494, 59205, 24545, 46104, 60558, 17707, 48558, 60855, 19163, 41828, 7154, 28748, 43142, 303, 31222, 54915, 3960, 26621, 56349, 13449, 27951, 50613, 8833, 39700, 62456, 10253, 32920, 63779, 20896, 36549, 59158, 24483, 46083, 60566, 17720, 48563, 6857, 29525, 43937, '4', 30861, 53537, 2474, 26308, 57106, 14307, 27769, 50326, 15653, 38317, 62170, 11093, 33772, 63605, 60920, 33748, 9407, 52491, 30112, 7784, 50941, 28480, 6101, 47273, 24846, 2461, 60853, 19166, 41834, 7105, 28699, 43163, 294, 31167, 55035, 3951, 26614, 56335, 13470, 27950, 50613, 8898, 50367, 25566, 35430, 13030, 22793, 33169, 10286, 20722, 65479, 9838, 20198, 62721, 7576, 17468, 60660, 3021, 45661, 56036, 267, 43419, 53288, 30966, 43002, 52861, 30413, 40235, 50611, 27651, 38035, 13303, 23163, 33480, 10586, 20917, 63494, 60836, 19163, 41835, 7157, 28685, 43157, 293};
        asInterface = -8275268167352104262L;
        asBinder = new char[]{27142, 27193, 27191, 27352, 27346, 27374, 27349, 27351, 27353, 27193, 27187, 27345, 27374, 27348, 27347, 27348, 27352, 27344, 27375, 27373, 27373, 27374, 27329, 27359, 27349, 27347, 27370, 27349, 27330, 27358, 27344, 27346, 27344, 27348, 27353, 27344, 27375, 27370, 27333, 27339, 27329, 27359, 27375, 27345, 27346, 27374, 27221, 27253, 27249, 27251, 27262, 27171, 27192, 27168, 27172, 27172, 27179, 27179, 27168, 27197, 27170, 27178, 27181, 27179, 27268, 27268, 27270, 27266, 27290, 27294, 27295, 27280, 27286, 27266, 27268, 27266, 27267, 27270, 27264, 27275, 27290, 27322, 27324, 27322, 27327, 27302, 27267, 27289, 27321, 27297, 27324, 27321, 27327, 27295, 27265, 27298, 27324, 27320, 27327, 27297, 27299};
    }
}
