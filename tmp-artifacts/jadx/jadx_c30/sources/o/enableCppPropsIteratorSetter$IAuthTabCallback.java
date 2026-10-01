package o;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class enableCppPropsIteratorSetter$IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
    final /* synthetic */ boolean $appliesUserSalt;
    final /* synthetic */ String $encryptedPrivateKey;
    final /* synthetic */ GraniteBrownfieldModule_closeView $password;
    final /* synthetic */ asArray $passwordFormat;
    Object L$0;
    int label;

    public static final /* synthetic */ class IAuthTabCallback {
        public static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[asArray.values().length];
            try {
                iArr[asArray.PW_6_DIGIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[asArray.PW_4_DIGIT_1_ALPHA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enableCppPropsIteratorSetter$IAuthTabCallback(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, asArray asarray, boolean z, String str, access13800<? super enableCppPropsIteratorSetter$IAuthTabCallback> access13800Var) {
        super(2, access13800Var);
        this.$password = graniteBrownfieldModule_closeView;
        this.$passwordFormat = asarray;
        this.$appliesUserSalt = z;
        this.$encryptedPrivateKey = str;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        return new enableCppPropsIteratorSetter$IAuthTabCallback(this.$password, this.$passwordFormat, this.$appliesUserSalt, this.$encryptedPrivateKey, access13800Var);
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public final Object invoke(findResAndMsg findresandmsg, access13800<? super String> access13800Var) {
        return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objInvoke;
        Object objInvoke2;
        String str;
        int i;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 30 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 24887, -265239605, false, "onWarmupCompleted", (Class[]) null);
            }
            Object obj2 = ((Field) objOnExtraCallback).get(null);
            GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = this.$password;
            asArray asarray = this.$passwordFormat;
            this.label = 1;
            try {
                Object[] objArr = {graniteBrownfieldModule_closeView, asarray, this};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1510310677);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 1), 30 - (ViewConfiguration.getScrollBarSize() >> 8), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 24886, -1799716229, false, "onExtraCallbackWithResult", new Class[]{GraniteBrownfieldModule_closeView.class, asArray.class, access13800.class});
                }
                objInvoke = ((Method) objOnExtraCallback2).invoke(obj2, objArr);
                if (objInvoke == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$0;
                ResultKt.onNavigationEvent(obj);
                objInvoke2 = obj;
                String str2 = (String) objInvoke2;
                i = IAuthTabCallback.onExtraCallbackWithResult[this.$passwordFormat.ordinal()];
                if (i != 1) {
                    EstimateFaceQualityFromBGRImage estimateFaceQualityFromBGRImage = EstimateFaceQualityFromBGRImage.IAuthTabCallback;
                    return estimateFaceQualityFromBGRImage.IAuthTabCallback((String) EstimateFaceQualityFromBGRImage.onWarmupCompleted(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 2046127422, new Object[]{estimateFaceQualityFromBGRImage, this.$encryptedPrivateKey, Page.onNavigationEvent(str, 0, 1, (Object) null)}, -2046127422, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback()), getPageContainer.IAuthTabCallback(str2));
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.$appliesUserSalt) {
                    EstimateFaceQualityFromBGRImage estimateFaceQualityFromBGRImage2 = EstimateFaceQualityFromBGRImage.IAuthTabCallback;
                    return estimateFaceQualityFromBGRImage2.IAuthTabCallback((String) EstimateFaceQualityFromBGRImage.onWarmupCompleted(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 2046127422, new Object[]{estimateFaceQualityFromBGRImage2, this.$encryptedPrivateKey, PageKey.onWarmupCompleted(str, (Charset) null, 1, (Object) null)}, -2046127422, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback()), getPageContainer.IAuthTabCallback(str2));
                }
                return this.$encryptedPrivateKey;
            }
            ResultKt.onNavigationEvent(obj);
            objInvoke = obj;
        }
        String str3 = (String) objInvoke;
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0)), ExpandableListView.getPackedPositionType(0L) + 30, 24888 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj3 = ((Field) objOnExtraCallback3).get(null);
        GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView2 = this.$password;
        asArray asarray2 = this.$passwordFormat;
        boolean z = this.$appliesUserSalt;
        this.L$0 = str3;
        this.label = 2;
        Object[] objArr2 = {graniteBrownfieldModule_closeView2, asarray2, Boolean.valueOf(z), this};
        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-507838093);
        if (objOnExtraCallback4 == null) {
            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), Process.getGidForName(BuildConfig.FLAVOR) + 31, 24887 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -788791325, false, "IAuthTabCallback", new Class[]{GraniteBrownfieldModule_closeView.class, asArray.class, Boolean.TYPE, access13800.class});
        }
        objInvoke2 = ((Method) objOnExtraCallback4).invoke(obj3, objArr2);
        if (objInvoke2 == objOnWarmupCompleted) {
            return objOnWarmupCompleted;
        }
        str = str3;
        String str22 = (String) objInvoke2;
        i = IAuthTabCallback.onExtraCallbackWithResult[this.$passwordFormat.ordinal()];
        if (i != 1) {
        }
    }
}
