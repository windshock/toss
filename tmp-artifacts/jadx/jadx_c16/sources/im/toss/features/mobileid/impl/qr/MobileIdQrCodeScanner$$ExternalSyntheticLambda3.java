package im.toss.features.mobileid.impl.qr;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import im.toss.tosssecurities.singlepage.earning_call.EarningCallComposeView$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdQrCodeScanner$$ExternalSyntheticLambda3 implements OnCompleteListener {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ MobileIdQrCodeScanner f$0;

    public final void onComplete(Task task) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, task};
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        MobileIdQrCodeScanner.IAuthTabCallback(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent, -360080519, 360080520, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), objArr);
        int i4 = IAuthTabCallback + 117;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
