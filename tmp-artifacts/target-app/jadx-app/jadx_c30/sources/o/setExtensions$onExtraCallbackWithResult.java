package o;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.setExtensions$onExtraCallbackWithResult;
import org.bouncycastle.asn1.eac.CertificateBody;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setExtensions$onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 1;
    private static int onExtraCallback;
    final /* synthetic */ setOnOutOfMemeryErrorCallback $callbackProxy;
    final /* synthetic */ r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ $contentOwner;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $encodedData;
    final /* synthetic */ String $extension;
    final /* synthetic */ String $fileName;
    final /* synthetic */ String $mimeType;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ setExtensions this$0;
    private static char[] onNavigationEvent = {32696, 32743, 32737, 32542, 32674, 32534, 32531, 32731, 32528, 32741, 32535, 32533, 32541, 32736, 32740, 32537, 32540, 32532, 32543, 32523, 32538, 52242, 47126, 44754, 54146, 47582, 50102, 50710, 46658, 47864, 47814, 47414, 32732, 32761, 32764, 32756, 32705, 32766, 32710, 32739, 32758};
    private static int IAuthTabCallback = -1184333950;
    private static boolean onWarmupCompleted = true;
    private static boolean onExtraCallbackWithResult = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    setExtensions$onExtraCallbackWithResult(Context context, String str, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, String str2, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setExtensions setextensions, String str3, String str4, access13800<? super setExtensions$onExtraCallbackWithResult> access13800Var) {
        super(2, access13800Var);
        this.$context = context;
        this.$encodedData = str;
        this.$callbackProxy = setonoutofmemeryerrorcallback;
        this.$fileName = str2;
        this.$contentOwner = r8lambdakrhaimf1bm5cgjbilhp45vln_xq;
        this.this$0 = setextensions;
        this.$mimeType = str3;
        this.$extension = str4;
    }

    public static /* synthetic */ Unit onExtraCallback(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setExtensions setextensions, String str, String str2, String str3, byte[] bArr, Context context, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = asInterface + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setextensions, str, str2, str3, bArr, context, setonoutofmemeryerrorcallback, dialogInterface);
        }
        onExtraCallbackWithResult(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setextensions, str, str2, str3, bArr, context, setonoutofmemeryerrorcallback, dialogInterface);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Context context, String str, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setExtensions setextensions, String str2, String str3, byte[] bArr, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(context, str, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setextensions, str2, str3, bArr, setonoutofmemeryerrorcallback, commonModule_setLeftEdgeTouchEnabled);
        if (i3 == 0) {
            int i4 = 29 / 0;
        }
        int i5 = onExtraCallback + 13;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(dialogInterface);
        int i4 = onExtraCallback + 23;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
        return unitIAuthTabCallback;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        setExtensions$onExtraCallbackWithResult setextensions_onextracallbackwithresult = new setExtensions$onExtraCallbackWithResult(this.$context, this.$encodedData, this.$callbackProxy, this.$fileName, this.$contentOwner, this.this$0, this.$mimeType, this.$extension, access13800Var);
        setextensions_onextracallbackwithresult.L$0 = obj;
        int i2 = asInterface + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return setextensions_onextracallbackwithresult;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
        int i4 = onExtraCallback + 105;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnExtraCallbackWithResult;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
        return objInvokeSuspend;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super byte[]>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 33501;
        private static int IAuthTabCallbackDefault = 1;
        private static int onExtraCallback = 0;
        private static char onExtraCallbackWithResult = 24349;
        private static char onNavigationEvent = 20005;
        private static char onWarmupCompleted = 42089;
        final /* synthetic */ String $encodedData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(String str, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$encodedData = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$encodedData, access13800Var);
            int i2 = onExtraCallback + 5;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                return onnavigationevent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallbackDefault + 103;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super byte[]> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 84 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 71;
            onExtraCallback = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                Object[] objArr = new Object[1];
                a(new char[]{49052, 53572, 57086, 750, 40763, 347, 10702, 59301, 23355, 53905, 26856, 2987, 13405, 4846, 26698, 4143, 11269, 10433, 22405, 32847, 10212, 26438, 25958, 44066, 3099, 63431, 63852, 64043, 17292, 2166, 26698, 4143, 32802, 20978, 58728, 17393, 43108, 63806, 64766, 64236, 20778, 8490, 25924, 6417, 30281, 812, 19970, 8871}, TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 47, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(obj);
            byte[] bArrDecode = Base64.decode(this.$encodedData, 0);
            int i3 = onExtraCallback + 23;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                return bArrDecode;
            }
            throw null;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            int i4 = $11 + 23;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i6 = $11 + 49;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 58224;
                int i9 = i3;
                while (i9 < 16) {
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i10 = (c2 + i8) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                    int i11 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                        objArr2[2] = Integer.valueOf(i11);
                        objArr2[1] = Integer.valueOf(i10);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char cResolveOpacity = (char) Drawable.resolveOpacity(i3, i3);
                            int offsetAfter = TextUtils.getOffsetAfter(BuildConfig.FLAVOR, i3) + 10;
                            int iMyTid = 12434 - (Process.myTid() >> 22);
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cResolveOpacity, offsetAfter, iMyTid, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 9, KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i8 -= 40503;
                        i9++;
                        int i12 = $11 + 55;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
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
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getScrollBarSize() >> 8)), (-16777202) - Color.rgb(0, 0, 0), 19901 - (ViewConfiguration.getPressedStateDuration() >> 16), -1250968944, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                cArr3 = cArr5;
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static int[] onExtraCallback = {-445536599, 1183625427, 1692955594, 1565838938, 1107538371, 587023629, 1073894309, 1889130111, 1975318808, -43408525, 151855963, -1064562122, -473273324, 1344257414, -1373489460, 1724975216, -1523950630, -512891070};
        private static int onExtraCallbackWithResult;
        final /* synthetic */ setOnOutOfMemeryErrorCallback $callbackProxy;
        final /* synthetic */ Context $context;
        final /* synthetic */ byte[] $decodedData;
        final /* synthetic */ String $extension;
        final /* synthetic */ String $fileName;
        final /* synthetic */ String $mimeType;
        int I$0;
        int I$1;
        Object L$0;
        int label;
        final /* synthetic */ setExtensions this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(setExtensions setextensions, String str, String str2, String str3, byte[] bArr, Context context, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.this$0 = setextensions;
            this.$mimeType = str;
            this.$fileName = str2;
            this.$extension = str3;
            this.$decodedData = bArr;
            this.$context = context;
            this.$callbackProxy = setonoutofmemeryerrorcallback;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 69;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.this$0, this.$mimeType, this.$fileName, this.$extension, this.$decodedData, this.$context, this.$callbackProxy, access13800Var);
            int i2 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onwarmupcompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 13;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    setExtensions setextensions = this.this$0;
                    String str = this.$mimeType;
                    String str2 = this.$fileName;
                    String str3 = this.$extension;
                    byte[] bArr = this.$decodedData;
                    Context context = this.$context;
                    setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.$callbackProxy;
                    Result.Companion companion = Result.Companion;
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    if (setExtensions.onExtraCallback(setextensions, str, str2, str3, bArr, context, setonoutofmemeryerrorcallback, this) == objOnWarmupCompleted) {
                        int i3 = IAuthTabCallback + 5;
                        onExtraCallbackWithResult = i3 % 128;
                        int i4 = i3 % 2;
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i2 != 1) {
                        Object[] objArr = new Object[1];
                        a(new int[]{471197766, -1390548670, 1852654823, -373231659, -1080311934, 2108492555, -521126914, 1715870118, 323320671, -710661617, -2010745819, 144534130, -1880743527, 1592241545, 812386121, -1486517180, 258765831, -676026071, 331285655, 2100418223, 437345126, 1450205666, 70919237, 1439282914}, 48 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
                        throw new IllegalStateException(((String) objArr[0]).intern());
                    }
                    int i5 = onExtraCallbackWithResult + 9;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    ResultKt.onNavigationEvent(obj);
                }
                obj2 = Result.constructor-impl(Unit.INSTANCE);
            } catch (WebResourceResponseModel e) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e));
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback2 = this.$callbackProxy;
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                ALCFaceBox.onExtraCallbackWithResult(setonoutofmemeryerrorcallback2, th, (String) null, (Map) null, 6, (Object) null);
            }
            return Unit.INSTANCE;
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = onExtraCallback;
            long j = 0;
            int i3 = -1469660336;
            if (iArr2 != null) {
                int i4 = $10 + 63;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i6 = 0;
                while (i6 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), 72 - (Process.myTid() >> 22), (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i6++;
                        j = 0;
                        i3 = -1469660336;
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
            int[] iArr5 = onExtraCallback;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i7 = $10 + 81;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                for (int i9 = 0; i9 < length3; i9++) {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i9])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 71, 8849 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i10 = $10 + 65;
                $11 = i10 % 128;
                int i11 = 2;
                int i12 = i10 % 2;
                int i13 = 0;
                while (i13 < 16) {
                    int i14 = $10 + 125;
                    $11 = i14 % 128;
                    int i15 = i14 % i11;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i13];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 22252), Color.alpha(0) + 39, 10301 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i13++;
                    i11 = 2;
                }
                int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 78, View.combineMeasuredStates(0, 0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }

    private static final Unit onExtraCallbackWithResult(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setExtensions setextensions, String str, String str2, String str3, byte[] bArr, Context context, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, DialogInterface dialogInterface) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(r8lambdakrhaimf1bm5cgjbilhp45vln_xq), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(setextensions, str, str2, str3, bArr, context, setonoutofmemeryerrorcallback, null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 99;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 69;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(final Context context, final String str, final r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, final setExtensions setextensions, final String str2, final String str3, final byte[] bArr, final setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) throws Throwable {
        int i = 2 % 2;
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(context.getString(R.string.app_download_base_64_title));
        String string = context.getString(R.string.app_download_base_64_message);
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{ISOFileInfo.DATA_BYTES2}, (ViewConfiguration.getPressedStateDuration() >> 16) + CertificateBody.profileType, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(sb.toString());
        String string2 = context.getString(R.string.app_download_base_64_yes);
        Intrinsics.checkNotNullExpressionValue(string2, BuildConfig.FLAVOR);
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, new Object[]{commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string2, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.common.web.message.handlers.SaveURIDataHandler$onHandleMessage$1$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return setExtensions$onExtraCallbackWithResult.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setextensions, str2, str, str3, bArr, context, setonoutofmemeryerrorcallback, (DialogInterface) obj);
            }
        }, 6, (Object) null)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, new Object[]{commonModule_setLeftEdgeTouchEnabled, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 900372088, new Object[]{commonModule_setLeftEdgeTouchEnabled, new Function1() { // from class: viva.republica.toss.common.web.message.handlers.SaveURIDataHandler$onHandleMessage$1$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return setExtensions$onExtraCallbackWithResult.onExtraCallbackWithResult((DialogInterface) obj);
            }
        }}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -900372086, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallback + 61;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = asInterface + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = this.label;
        try {
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                String str = this.$encodedData;
                Result.Companion companion = Result.Companion;
                GeckoHubImp geckoHubImpOnWarmupCompleted = putChannelInfo.onWarmupCompleted();
                onNavigationEvent onnavigationevent = new onNavigationEvent(str, null);
                this.L$0 = findresandmsg;
                this.L$1 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpOnWarmupCompleted, onnavigationevent, this);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    Object[] objArr = new Object[1];
                    a(null, null, new byte[]{ISOFileInfo.LCS_BYTE, -111, -112, -122, ISOFileInfo.SECURITY_ATTR_COMPACT, ISOFileInfo.FCI_EXT, -119, ISOFileInfo.FCI_EXT, -126, ISOFileInfo.PROP_INFO, -107, -122, -112, -108, ISOFileInfo.PROP_INFO, -120, ISOFileInfo.LCS_BYTE, -109, ISOFileInfo.FCI_EXT, -110, -111, -112, -120, ISOFileInfo.PROP_INFO, ISOFileInfo.LCS_BYTE, -119, ISOFileInfo.FCI_EXT, -113, ISOFileInfo.LCS_BYTE, ISOFileInfo.CHANNEL_SECURITY, ISOFileInfo.PROP_INFO, -120, ISOFileInfo.LCS_BYTE, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.SECURITY_ATTR_COMPACT, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.LCS_BYTE, -119, -120, ISOFileInfo.PROP_INFO, ISOFileInfo.FCI_EXT, -122, ISOFileInfo.PROP_INFO, -124, -124, ISOFileInfo.FILE_IDENTIFIER, -126}, 126 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallback = obj;
            }
            obj2 = Result.constructor-impl(objOnExtraCallback);
            int i5 = asInterface + 105;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
        } catch (WebResourceResponseModel e3) {
            Result.Companion companion3 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
        }
        if (!(!Result.onExtraCallback(obj2))) {
            obj2 = null;
        }
        final byte[] bArr = (byte[]) obj2;
        if (bArr == null) {
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.$callbackProxy;
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{ISOFileInfo.A1, ISOFileInfo.A0, -97, -98, ISOFileInfo.PROP_INFO, -99, -100, -101, -102, ISOFileInfo.PROP_INFO, -103, -104, -105, -106}, ExpandableListView.getPackedPositionGroup(0L) + CertificateBody.profileType, objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            a(null, null, new byte[]{ISOFileInfo.A5, -87, ISOFileInfo.A5, -89, -88, -89, -94, -90, ISOFileInfo.A5, -92, -93, -94}, 127 - Color.alpha(0), objArr3);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern, ((String) objArr3[0]).intern(), (Map) null, 4, (Object) null);
            return Unit.INSTANCE;
        }
        final Context context = this.$context;
        final String str2 = this.$fileName;
        final r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq = this.$contentOwner;
        final setExtensions setextensions = this.this$0;
        final String str3 = this.$mimeType;
        final String str4 = this.$extension;
        final setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback2 = this.$callbackProxy;
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context, new Function1() { // from class: viva.republica.toss.common.web.message.handlers.SaveURIDataHandler$onHandleMessage$1$$ExternalSyntheticLambda2
            public final Object invoke(Object obj3) {
                return setExtensions$onExtraCallbackWithResult.onExtraCallbackWithResult(context, str2, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setextensions, str3, str4, bArr, setonoutofmemeryerrorcallback2, (CommonModule_setLeftEdgeTouchEnabled) obj3);
            }
        });
        return Unit.INSTANCE;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onNavigationEvent;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = $10 + 33;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 76, (Process.myPid() >> 22) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 74, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16036, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i6 = 1052772399;
        if (!onExtraCallbackWithResult) {
            if (!onWarmupCompleted) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i7 = $10 + 7;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback % 1) % defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] >> iIntValue);
                    } else {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    }
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            int i8 = $10 + 71;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 63, 12214 - KeyEvent.normalizeMetaState(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i6 = 1052772399;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i10 = $11 + 35;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i12 = $11 + 41;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >> i] << iIntValue);
                try {
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 63 - View.combineMeasuredStates(0, 0), 12214 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 63 - (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            int i13 = $10 + 115;
            $11 = i13 % 128;
            int i14 = i13 % 2;
        }
        objArr[0] = new String(cArr6);
    }
}
