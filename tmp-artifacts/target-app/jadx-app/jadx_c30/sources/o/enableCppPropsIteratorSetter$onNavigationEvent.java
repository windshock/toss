package o;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class enableCppPropsIteratorSetter$onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static char[] onExtraCallbackWithResult = {27256, 27172, 27168, 27178, 27177, 27192, 27168, 27171, 27197, 27170, 27178, 27154};
    final /* synthetic */ boolean $appliesUserSalt;
    final /* synthetic */ GraniteBrownfieldModule_closeView $password;
    final /* synthetic */ asArray $passwordFormat;
    int label;

    public static final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] IAuthTabCallback;

        static {
            int[] iArr = new int[asArray.values().length];
            try {
                iArr[asArray.PW_4_DIGIT_1_ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[asArray.PW_6_DIGIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            IAuthTabCallback = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enableCppPropsIteratorSetter$onNavigationEvent(boolean z, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, asArray asarray, access13800<? super enableCppPropsIteratorSetter$onNavigationEvent> access13800Var) {
        super(2, access13800Var);
        this.$appliesUserSalt = z;
        this.$password = graniteBrownfieldModule_closeView;
        this.$passwordFormat = asarray;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        enableCppPropsIteratorSetter$onNavigationEvent enablecpppropsiteratorsetter_onnavigationevent = new enableCppPropsIteratorSetter$onNavigationEvent(this.$appliesUserSalt, this.$password, this.$passwordFormat, access13800Var);
        int i2 = onExtraCallback + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return enablecpppropsiteratorsetter_onnavigationevent;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        return objOnExtraCallback;
    }

    public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super String> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
        return objInvokeSuspend;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.onNavigationEvent(obj);
        if (!this.$appliesUserSalt) {
            int i2 = onExtraCallbackWithResult.IAuthTabCallback[this.$passwordFormat.ordinal()];
            if (i2 == 1) {
                byte[] bArrOnWarmupCompleted = this.$password.onWarmupCompleted();
                String strOnWarmupCompleted = EstimateFaceQualityFromBGRImage.IAuthTabCallback.onWarmupCompleted(bArrOnWarmupCompleted, false);
                onPageHide.IAuthTabCallback(bArrOnWarmupCompleted);
                return strOnWarmupCompleted;
            }
            if (i2 == 2) {
                int i3 = IAuthTabCallback + 11;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    RemoteWorkManager remoteWorkManager = RemoteWorkManager.onWarmupCompleted;
                    Object[] objArr = new Object[1];
                    a(new int[]{0, 12, 0, 0}, false, new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0}, objArr);
                    byte[] bArrPlus = ArraysKt.plus(PageKey.onWarmupCompleted(remoteWorkManager.IAuthTabCallback(((String) objArr[0]).intern()), (Charset) null, 1, (Object) null), this.$password.onWarmupCompleted());
                    String strOnWarmupCompleted2 = EstimateFaceQualityFromBGRImage.IAuthTabCallback.onWarmupCompleted(bArrPlus, true);
                    onPageHide.IAuthTabCallback(bArrPlus);
                    return strOnWarmupCompleted2;
                }
                RemoteWorkManager remoteWorkManager2 = RemoteWorkManager.onWarmupCompleted;
                Object[] objArr2 = new Object[1];
                a(new int[]{0, 12, 0, 0}, true, new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0}, objArr2);
                byte[] bArrPlus2 = ArraysKt.plus(PageKey.onWarmupCompleted(remoteWorkManager2.IAuthTabCallback(((String) objArr2[0]).intern()), (Charset) null, 1, (Object) null), this.$password.onWarmupCompleted());
                String strOnWarmupCompleted3 = EstimateFaceQualityFromBGRImage.IAuthTabCallback.onWarmupCompleted(bArrPlus2, true);
                onPageHide.IAuthTabCallback(bArrPlus2);
                return strOnWarmupCompleted3;
            }
            throw new NoWhenBranchMatchedException();
        }
        int i4 = onExtraCallback + 115;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            byte[] bArrPlus3 = ArraysKt.plus(PageKey.onWarmupCompleted(setTestMode.onExtraCallback.writeTypedObject(), (Charset) null, 1, (Object) null), this.$password.onWarmupCompleted());
            String strOnWarmupCompleted4 = EstimateFaceQualityFromBGRImage.IAuthTabCallback.onWarmupCompleted(bArrPlus3, true);
            onPageHide.IAuthTabCallback(bArrPlus3);
            return strOnWarmupCompleted4;
        }
        byte[] bArrPlus4 = ArraysKt.plus(PageKey.onWarmupCompleted(setTestMode.onExtraCallback.writeTypedObject(), (Charset) null, 1, (Object) null), this.$password.onWarmupCompleted());
        String strOnWarmupCompleted5 = EstimateFaceQualityFromBGRImage.IAuthTabCallback.onWarmupCompleted(bArrPlus4, true);
        onPageHide.IAuthTabCallback(bArrPlus4);
        return strOnWarmupCompleted5;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = onExtraCallbackWithResult;
        Object obj = null;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 35283), View.resolveSizeAndState(0, 0, 0) + 35, (ViewConfiguration.getTouchSlop() >> 8) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    int i8 = $11 + 121;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
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
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i10 = $11 + 117;
                $10 = i10 % 128;
                if (i10 % 2 == 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 0) {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), 28 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), (ViewConfiguration.getFadingEdgeLength() >> 16) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 10935), (-16777151) - Color.rgb(0, 0, 0), 16717 - ExpandableListView.getPackedPositionChild(0L), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                try {
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 70 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 12486 - KeyEvent.getDeadChar(0, 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i13 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i13, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i13);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i14 = $11 + 95;
            $10 = i14 % 128;
            int i15 = 2;
            int i16 = i14 % 2;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i17 = $10 + 109;
                $11 = i17 % 128;
                if (i17 % i15 == 0) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent << 1;
                } else {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
                i15 = 2;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        String str = new String(cArr3);
        int i18 = $11 + 119;
        $10 = i18 % 128;
        if (i18 % 2 == 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }
}
