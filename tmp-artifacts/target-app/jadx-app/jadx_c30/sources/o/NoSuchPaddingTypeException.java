package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import im.toss.base.BaseActivity;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.rx2.RxAwaitKt;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.setProgressColor;
import o.shortValue;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class NoSuchPaddingTypeException {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final String IAuthTabCallback;
    public static final String IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallbackStubProxy = 1;
    private static char[] asBinder;
    private static int asInterface;
    public static final String onExtraCallback;
    public static final String onExtraCallbackWithResult;
    public static final NoSuchPaddingTypeException onNavigationEvent;
    private static int onTransact;
    public static final String onWarmupCompleted;

    static final class IAuthTabCallback extends ContinuationImpl {
        long J$0;
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= PKIFailureInfo.systemUnavail;
            return NoSuchPaddingTypeException.this.onWarmupCompleted(null, 0L, false, this);
        }
    }

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[isNumber.values().length];
            try {
                iArr[isNumber.PASSWORD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[isNumber.BIOMETRIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[isNumber.TOSS_FACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new int[]{0, 13, 0, 0}, true, new byte[]{1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0}, objArr);
        IAuthTabCallbackDefault = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new int[]{13, 13, 0, 0}, false, new byte[]{1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1}, objArr2);
        IAuthTabCallback = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new int[]{26, 4, 0, 0}, true, new byte[]{0, 0, 1, 0}, objArr3);
        onWarmupCompleted = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(new int[]{30, 2, 129, 1}, true, null, objArr4);
        onExtraCallbackWithResult = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a(new int[]{32, 13, 0, 0}, false, new byte[]{1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1}, objArr5);
        onExtraCallback = ((String) objArr5[0]).intern();
        onNavigationEvent = new NoSuchPaddingTypeException();
        int i = IAuthTabCallbackStub + 11;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = (~(i3 | i6)) | i5;
        int i8 = ~i3;
        int i9 = ~((~i5) | i8 | i6);
        int i10 = (~(i6 | i5)) | (~(i8 | (~i6)));
        int i11 = i3 + i5 + i + (1616745821 * i2) + (2077170981 * i4);
        int i12 = i11 * i11;
        int i13 = ((-162656556) * i3) + 1587019776 + (806482222 * i5) + ((-484569389) * i7) + (i9 * 484569389) + (484569389 * i10) + (321912832 * i) + ((-395313152) * i2) + (904921088 * i4) + (345505792 * i12);
        int i14 = (i3 * (-1558553916)) + 318941677 + (i5 * (-1558553002)) + (i7 * (-457)) + (i9 * 457) + (i10 * 457) + (i * (-1558553459)) + (i2 * 397062201) + (i4 * 609114465) + (i12 * (-138936320));
        return i13 + ((i14 * i14) * 1630011392) != 1 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    private NoSuchPaddingTypeException() {
    }

    public static final /* synthetic */ byte[] IAuthTabCallback(NoSuchPaddingTypeException noSuchPaddingTypeException) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 63;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArrOnWarmupCompleted = noSuchPaddingTypeException.onWarmupCompleted();
        int i4 = IAuthTabCallbackStubProxy + 9;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return bArrOnWarmupCompleted;
    }

    public static final /* synthetic */ byte[] onExtraCallback(NoSuchPaddingTypeException noSuchPaddingTypeException) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 1;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        byte[] bArr = (byte[]) onNavigationEvent(setCurrentIndex.onNavigationEvent(), new Object[]{noSuchPaddingTypeException}, setCurrentIndex.onNavigationEvent(), 1049548574, setCurrentIndex.onNavigationEvent(), -1049548574, iOnNavigationEvent);
        int i4 = IAuthTabCallbackStubProxy + 121;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    public static final /* synthetic */ byte[] onExtraCallback(NoSuchPaddingTypeException noSuchPaddingTypeException, byte[] bArr, byte[] bArr2) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArrOnNavigationEvent = noSuchPaddingTypeException.onNavigationEvent(bArr, bArr2);
        int i4 = onTransact + 23;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return bArrOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onWarmupCompleted(@NotNull BaseActivity baseActivity, long j, boolean z, @NotNull access13800<? super Pair<byte[], String>> access13800Var) throws Throwable {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        if (!(!(access13800Var instanceof IAuthTabCallback))) {
            int i2 = IAuthTabCallbackStubProxy + 103;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = ((IAuthTabCallback) access13800Var).label;
                throw null;
            }
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i4 = iAuthTabCallback.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                iAuthTabCallback.label = i4 + PKIFailureInfo.systemUnavail;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        Object objOnExtraCallback = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = iAuthTabCallback.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            getByteBuffer getbytebufferIAuthTabCallback = shortValue.IAuthTabCallback(shortValue.Companion, baseActivity, UTF8Decoder.PASSWORD_AUTHENTICATE, j, z, false, false, false, (shortValue.onNavigationEvent) null, false, (Function0) null, false, (TypeUtils1) null, false, (String) null, (Function1) null, 32752, (Object) null);
            iAuthTabCallback.L$0 = access15400.onNavigationEvent(baseActivity);
            iAuthTabCallback.J$0 = j;
            iAuthTabCallback.Z$0 = z;
            iAuthTabCallback.label = 1;
            objOnExtraCallback = RxAwaitKt.onExtraCallback(getbytebufferIAuthTabCallback, iAuthTabCallback);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                int i6 = IAuthTabCallbackStubProxy + 65;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                return objOnWarmupCompleted;
            }
        } else {
            if (i5 != 1) {
                Object[] objArr = new Object[1];
                a(new int[]{66, 47, 52, 5}, true, null, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
        }
        isJSONTypeIgnore isjsontypeignore = (isJSONTypeIgnore) objOnExtraCallback;
        return getWrite.IAuthTabCallback(PageKey.onWarmupCompleted(isjsontypeignore.onNavigationEvent(), (Charset) null, 1, (Object) null), onNavigationEvent.IAuthTabCallback(isjsontypeignore.IAuthTabCallback()));
    }

    private final byte[] onNavigationEvent(byte[] bArr, byte[] bArr2) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 13;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 30, 24887 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        try {
            Object[] objArr = {((Field) objOnExtraCallback).get(null), bArr, bArr2, 0, 600000, 4, null};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1455613670);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 1), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 31, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 24886, -1736579190, false, "onExtraCallbackWithResult", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (Process.myTid() >> 22), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 30, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24887), byte[].class, byte[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Object.class});
            }
            byte[] bArr3 = (byte[]) ((Method) objOnExtraCallback2).invoke(null, objArr);
            int i4 = IAuthTabCallbackStubProxy + 97;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                return bArr3;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        int i2 = IAuthTabCallbackStubProxy + 87;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return bArr;
    }

    private final byte[] onWarmupCompleted() {
        int i = 2 % 2;
        byte[] bArr = new byte[12];
        new SecureRandom().nextBytes(bArr);
        int i2 = IAuthTabCallbackStubProxy + 3;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return bArr;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super UST_API_GetInfo>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 1;
        private static int onNavigationEvent;
        final /* synthetic */ String $data;
        final /* synthetic */ byte[] $passwordHashBytes;
        int label;
        private static char[] onExtraCallback = {32524, 32526, 32571, 32719, 32563, 32568, 32704, 32573, 32514, 32572, 32562, 32570, 32525, 32513, 32518, 32569, 32561, 32516, 32560, 32519};
        private static int onExtraCallbackWithResult = -1184333905;
        private static boolean onWarmupCompleted = true;
        private static boolean IAuthTabCallback = true;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(byte[] bArr, String str, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$passwordHashBytes = bArr;
            this.$data = str;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super UST_API_GetInfo> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return onwarmupcompletedCreate.invokeSuspend(unit);
            }
            onwarmupcompletedCreate.invokeSuspend(unit);
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$passwordHashBytes, this.$data, access13800Var);
            int i2 = IAuthTabCallbackDefault + 85;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            if (i3 != 0) {
                int i4 = 54 / 0;
            }
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 57;
            onNavigationEvent = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                Object[] objArr = new Object[1];
                a(null, null, new byte[]{-119, -112, -113, ISOFileInfo.PROP_INFO, ISOFileInfo.SECURITY_ATTR_EXP, -122, -120, -122, ISOFileInfo.DATA_BYTES2, -124, -108, ISOFileInfo.PROP_INFO, -113, -109, -124, ISOFileInfo.FCI_EXT, -119, -110, -122, -111, -112, -113, ISOFileInfo.FCI_EXT, -124, -119, -120, -122, ISOFileInfo.CHANNEL_SECURITY, -119, ISOFileInfo.ENV_TEMP_EF, -124, ISOFileInfo.FCI_EXT, -119, ISOFileInfo.SECURITY_ATTR_COMPACT, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.LCS_BYTE, -119, -120, ISOFileInfo.FCI_EXT, -124, -122, ISOFileInfo.PROP_INFO, -124, ISOFileInfo.FILE_IDENTIFIER, ISOFileInfo.FILE_IDENTIFIER, -126, ISOFileInfo.DATA_BYTES2}, 127 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(obj);
            NoSuchPaddingTypeException noSuchPaddingTypeException = NoSuchPaddingTypeException.onNavigationEvent;
            byte[] bArrIAuthTabCallback = NoSuchPaddingTypeException.IAuthTabCallback(noSuchPaddingTypeException);
            byte[] bArrOnExtraCallback = NoSuchPaddingTypeException.onExtraCallback(noSuchPaddingTypeException);
            UST_API_GetInfo uST_API_GetInfo = new UST_API_GetInfo(Page.onExtraCallbackWithResult(setProgressColor.onNavigationEvent.onWarmupCompleted(setProgressColor.Companion, NoSuchPaddingTypeException.onExtraCallback(noSuchPaddingTypeException, this.$passwordHashBytes, bArrOnExtraCallback), new GCMParameterSpec(128, bArrIAuthTabCallback), (byte[]) null, 4, (Object) null).a_(Page.onNavigationEvent(this.$data, 0, 1, (Object) null)), 0, 1, (Object) null), Page.onExtraCallbackWithResult(bArrOnExtraCallback, 0, 1, (Object) null), Page.onExtraCallbackWithResult(bArrIAuthTabCallback, 0, 1, (Object) null));
            int i3 = IAuthTabCallbackDefault + 91;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 19 / 0;
            }
            return uST_API_GetInfo;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            char[] cArr2;
            int i2 = 2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr3 = onExtraCallback;
            long j = 0;
            if (cArr3 != null) {
                int i4 = $10 + 15;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    int i7 = $11 + 101;
                    $10 = i7 % 128;
                    if (i7 % i2 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(j), ExpandableListView.getPackedPositionType(j) + 77, TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 20953, 1064889259, false, "x", new Class[]{Integer.TYPE});
                            }
                            cArr4[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr3[i6])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), Color.green(0) + 77, 20952 - Drawable.resolveOpacity(0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                            }
                            cArr4[i6] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                            i6++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    i2 = 2;
                    j = 0;
                }
                cArr3 = cArr4;
            }
            Object[] objArr4 = {Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), 75 - ExpandableListView.getPackedPositionType(0L), (Process.myPid() >> 22) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
            if (!(!IAuthTabCallback)) {
                int i8 = $11 + 113;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
                } else {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                }
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), 62 - ExpandableListView.getPackedPositionChild(0L), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr2);
                return;
            }
            if (!onWarmupCompleted) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            int i9 = $10 + 29;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), MotionEvent.axisFromString(BuildConfig.FLAVOR) + 64, ExpandableListView.getPackedPositionType(0L) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            String str = new String(cArr6);
            int i11 = $10 + 11;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            objArr[0] = str;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        byte[] bArr = (byte[]) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.onWarmupCompleted(), new onWarmupCompleted(bArr, str, null), (access13800) objArr[3]);
        int i2 = IAuthTabCallbackStubProxy + 123;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 62610;
        private static int asInterface = 1;
        private static char onExtraCallback = 48745;
        private static char onExtraCallbackWithResult = 31904;
        private static int onNavigationEvent = 0;
        private static char onWarmupCompleted = 58123;
        final /* synthetic */ String $encryptedData;
        final /* synthetic */ String $iv;
        final /* synthetic */ byte[] $passwordHashBytes;
        final /* synthetic */ String $salt;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(byte[] bArr, String str, String str2, String str3, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$passwordHashBytes = bArr;
            this.$salt = str;
            this.$iv = str2;
            this.$encryptedData = str3;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$passwordHashBytes, this.$salt, this.$iv, this.$encryptedData, access13800Var);
            int i2 = asInterface + 23;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 22 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super String> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = asInterface + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 111;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                int i4 = $10 + 91;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                char c = 1;
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i6 = 58224;
                int i7 = i3;
                while (i7 < 16) {
                    int i8 = $10 + 39;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    char c2 = cArr3[c];
                    char c3 = cArr3[i3];
                    int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                    int i11 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onExtraCallback);
                        objArr2[2] = Integer.valueOf(i11);
                        objArr2[c] = Integer.valueOf(i10);
                        objArr2[i3] = Integer.valueOf(c2);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int iLastIndexOf = TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 11;
                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 12434;
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[c] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maximumFlingVelocity, iLastIndexOf, jumpTapTimeout, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[c] = cCharValue;
                        int i12 = i7;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), 11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i7 = i12 + 1;
                        i3 = 0;
                        c = 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getTouchSlop() >> 8)), 14 - View.getDefaultSize(0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = asInterface + 37;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this.label != 0) {
                Object[] objArr = new Object[1];
                a(new char[]{24242, 19007, 53154, 45073, 13151, 12577, 45531, 17677, 40154, 64322, 15851, 29931, 28858, 54313, 1157, 57371, 43234, 11910, 7254, 62193, 33566, 28968, 46401, 0, 7165, 58932, 50934, 45059, 50139, 24032, 1157, 57371, 32047, 9895, 48622, 26999, 24915, 55989, 57600, 28618, 34778, 43651, 26009, 42105, 49733, 43341, 54272, 1018}, 48 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(obj);
            String strOnExtraCallbackWithResult = Page.onExtraCallbackWithResult(setProgressColor.onNavigationEvent.onExtraCallback(setProgressColor.Companion, NoSuchPaddingTypeException.onExtraCallback(NoSuchPaddingTypeException.onNavigationEvent, this.$passwordHashBytes, Page.onNavigationEvent(this.$salt, 0, 1, (Object) null)), new GCMParameterSpec(128, Page.onNavigationEvent(this.$iv, 0, 1, (Object) null)), (byte[]) null, 4, (Object) null).onExtraCallbackWithResult(Page.onNavigationEvent(this.$encryptedData, 0, 1, (Object) null)), 0, 1, (Object) null);
            int i3 = onNavigationEvent + 3;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return strOnExtraCallbackWithResult;
        }
    }

    public final Object onExtraCallback(@NotNull byte[] bArr, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull access13800<? super String> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.onWarmupCompleted(), new onExtraCallback(bArr, str3, str2, str, null), access13800Var);
        int i2 = IAuthTabCallbackStubProxy + 11;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final String IAuthTabCallback(isNumber isnumber) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent.onExtraCallbackWithResult[isnumber.ordinal()];
        if (i2 == 1) {
            Object[] objArr = new Object[1];
            a(new int[]{63, 3, 0, 2}, true, new byte[]{1, 1, 0}, objArr);
            return ((String) objArr[0]).intern();
        }
        int i3 = IAuthTabCallbackStubProxy + 97;
        int i4 = i3 % 128;
        onTransact = i4;
        int i5 = i3 % 2;
        if (i2 == 2) {
            Object[] objArr2 = new Object[1];
            a(new int[]{54, 9, 0, 9}, false, new byte[]{0, 1, 0, 0, 0, 1, 0, 1, 0}, objArr2);
            return ((String) objArr2[0]).intern();
        }
        int i6 = i4 + 37;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 != 0 ? i2 != 3 : i2 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        Object[] objArr3 = new Object[1];
        a(new int[]{45, 9, 0, 5}, true, new byte[]{1, 0, 0, 0, 1, 1, 0, 0, 1}, objArr3);
        String strIntern = ((String) objArr3[0]).intern();
        int i7 = IAuthTabCallbackStubProxy + 7;
        onTransact = i7 % 128;
        if (i7 % 2 == 0) {
            return strIntern;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
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
        char[] cArr2 = asBinder;
        long j = 0;
        if (cArr2 != null) {
            int i8 = $11;
            int i9 = i8 + 13;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 0;
            }
            int i10 = i8 + 25;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            while (i2 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i2])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 35283), 35 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 14238, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i2++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr2, i4, cArr3, 0, i5);
        if (bArr != null) {
            int i12 = $10 + 53;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr4 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i14 = $10 + 43;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i16 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10934 - ((byte) KeyEvent.getModifierMetaStateMask())), 66 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 16718 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i16] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i17 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 28 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i17] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49515 - AndroidCharacter.getMirror('0')), 69 - ExpandableListView.getPackedPositionChild(0L), TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i18 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i18, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i18);
        }
        if (z) {
            int i19 = $11 + 111;
            $10 = i19 % 128;
            int i20 = i19 % 2;
            char[] cArr6 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i21 = $11 + 107;
                $10 = i21 % 128;
                if (i21 % 2 != 0) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 >> trackGroupExternalSyntheticLambda0.onNavigationEvent) % 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent % 1;
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

    private final byte[] onExtraCallbackWithResult() {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (byte[]) onNavigationEvent(setCurrentIndex.onNavigationEvent(), new Object[]{this}, setCurrentIndex.onNavigationEvent(), 1049548574, setCurrentIndex.onNavigationEvent(), -1049548574, iOnNavigationEvent);
    }

    public final Object onWarmupCompleted(@NotNull byte[] bArr, @NotNull String str, @NotNull access13800<? super UST_API_GetInfo> access13800Var) {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return onNavigationEvent(setCurrentIndex.onNavigationEvent(), new Object[]{this, bArr, str, access13800Var}, setCurrentIndex.onNavigationEvent(), -409783171, setCurrentIndex.onNavigationEvent(), 409783172, iOnNavigationEvent);
    }

    static void IAuthTabCallback() {
        asBinder = new char[]{27263, 27176, 27171, 27197, 27170, 27175, 27168, 27170, 27163, 27159, 27170, 27172, 27169, 27255, 27168, 27174, 27172, 27173, 27173, 27172, 27156, 27159, 27170, 27168, 27173, 27175, 27252, 27198, 27176, 27172, 27300, 27321, 27260, 27175, 27174, 27172, 27195, 27194, 27196, 27170, 27178, 27162, 27164, 27172, 27172, 27233, 27159, 27165, 27167, 27167, 27138, 27146, 27148, 27149, 27247, 27147, 27138, 27136, 27143, 27138, 27165, 27139, 27144, 27242, 27138, 27137, 27162, 27374, 27374, 27355, 27353, 27351, 27372, 27347, 27366, 27367, 27373, 27368, 27373, 27353, 27162, 27346, 27366, 27347, 27365, 27162, 27157, 27351, 27345, 27373, 27364, 27372, 27347, 27157, 27162, 27351, 27368, 27373, 27348, 27351, 27352, 27162, 27157, 27351, 27375, 27367, 27369, 27351, 27368, 27157, 27162, 27373, 27366};
    }
}
