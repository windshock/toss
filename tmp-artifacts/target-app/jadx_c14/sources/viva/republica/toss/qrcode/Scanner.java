package viva.republica.toss.qrcode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.zxing.BarcodeFormat;
import java.util.ArrayList;
import o.ApmHelperzb;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public class Scanner extends TossScanner {
    private ScannerViewFinder onExtraCallbackWithResult;

    public Scanner(Context context) {
        super(context);
        asBinder();
    }

    public Scanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        asBinder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void asBinder() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BarcodeFormat.QR_CODE);
        IAuthTabCallback(true);
        setFormats(arrayList);
        this.onExtraCallbackWithResult = new ScannerViewFinder(getContext());
    }

    public ApmHelperzb onExtraCallback(Context context) {
        return this.onExtraCallbackWithResult;
    }

    public View onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }
}
