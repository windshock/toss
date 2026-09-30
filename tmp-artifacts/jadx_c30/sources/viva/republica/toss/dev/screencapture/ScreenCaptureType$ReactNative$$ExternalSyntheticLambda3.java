package viva.republica.toss.dev.screencapture;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import im.toss.uikit.widget.textField.TextField;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.getTypedExportedConstants;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ScreenCaptureType$ReactNative$$ExternalSyntheticLambda3 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ TextField f$1;
    public final /* synthetic */ getTypedExportedConstants f$2;

    public /* synthetic */ ScreenCaptureType$ReactNative$$ExternalSyntheticLambda3(Object obj, TextField textField, getTypedExportedConstants gettypedexportedconstants) {
        this.f$0 = obj;
        this.f$1 = textField;
        this.f$2 = gettypedexportedconstants;
    }

    public final Object invoke(Object obj) throws Throwable {
        int i = 2 % 2;
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int i2 = ~iOnExtraCallbackWithResult;
        int i3 = 1618937141 ^ i2;
        int i4 = 1618937141 & i2;
        int i5 = ~((i4 & i3) | (i3 ^ i4));
        int i6 = (2063537661 & i5) | ((~i5) & (-2063537662));
        int i7 = i5 & (-2063537662);
        int i8 = (i7 & i6) | (i6 ^ i7);
        int i9 = (-1617690642) & iOnExtraCallbackWithResult;
        int i10 = (~i9) & ((-1617690642) | iOnExtraCallbackWithResult);
        int i11 = ~((i9 & i10) | (i10 ^ i9));
        int i12 = ((i8 & i11) | ((~i11) & i8) | ((~i8) & i11)) * (-713);
        int i13 = ((-47408164) ^ i12) + ((i12 & (-47408164)) << 1);
        int i14 = (-1617690642) & iOnExtraCallbackWithResult;
        int i15 = ((-1617690642) | iOnExtraCallbackWithResult) & (~i14);
        int i16 = ~iOnExtraCallbackWithResult;
        int i17 = -(-((~((i14 & i15) | (i15 ^ i14))) * 1426));
        int i18 = (iOnExtraCallbackWithResult | i16) & i2;
        int i19 = (i13 & i17) + (i17 | i13) + ((~((i18 & (-2062291162)) | ((~i18) & (-2062291162)) | (2062291161 & i18))) * 713);
        int iIdentityHashCode = System.identityHashCode(this);
        int i20 = ~iIdentityHashCode;
        int i21 = ~iIdentityHashCode;
        int i22 = (iIdentityHashCode | i21) & i20;
        int i23 = (-118458217) & i22;
        int i24 = (i22 | (-118458217)) & (~i23);
        int i25 = (i24 & i23) | (i24 ^ i23);
        int i26 = (i25 | (~i25)) & (~i25);
        int i27 = ((~i26) & (-377913038)) | (377913037 & i26);
        int i28 = i26 & (-377913038);
        int i29 = ((i28 & i27) | (i27 ^ i28)) * (-933);
        int i30 = ((-1056808164) ^ i29) + ((i29 & (-1056808164)) << 1);
        int i31 = (-377913038) & i21;
        int i32 = ~(i31 | ((~i31) & (i21 | (-377913038))));
        int i33 = ((-276854918) & i32) | ((~i32) & 276854917);
        int i34 = i32 & 276854917;
        int i35 = ((i34 & i33) | (i33 ^ i34)) * 933;
        int i36 = i30 & i35;
        int i37 = ((i30 ^ i35) | i36) << 1;
        int i38 = -((i35 | i30) & (~i36));
        int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
        if (i19 > ((i39 | 540033434) << 1) - (540033434 ^ i39)) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        try {
            Object[] objArr = {this.f$0, this.f$1, this.f$2, (View) obj};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(800025018);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 22037), ((Process.getThreadPriority(0) + 20) >> 6) + 42, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 24487, 519018282, false, "onExtraCallback", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 22038), View.MeasureSpec.makeMeasureSpec(0, 0) + 42, 24489 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), TextField.class, getTypedExportedConstants.class, View.class});
            }
            Object objInvoke = ((Method) objOnExtraCallback).invoke(null, objArr);
            int i40 = IAuthTabCallback;
            int i41 = (i40 ^ 9) + ((i40 & 9) << 1);
            onWarmupCompleted = i41 % 128;
            int i42 = i41 % 2;
            return objInvoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
