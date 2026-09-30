package im.toss.features.mobileid.impl.qr;

import com.google.mlkit.vision.barcode.BarcodeScanner;
import im.toss.tosssecurities.singlepage.earning_call.EarningCallComposeView$;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdQrCodeScanner$$ExternalSyntheticLambda4 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ MobileIdQrCodeScanner f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0};
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        BarcodeScanner barcodeScanner = (BarcodeScanner) MobileIdQrCodeScanner.IAuthTabCallback(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent, 1584212041, -1584212041, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), objArr);
        int i4 = onExtraCallback + 55;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return barcodeScanner;
    }
}
