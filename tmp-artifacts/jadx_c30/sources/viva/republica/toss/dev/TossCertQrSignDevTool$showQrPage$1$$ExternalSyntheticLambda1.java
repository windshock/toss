package viva.republica.toss.dev;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ExpandableListView;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import java.lang.reflect.Method;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.resumeForClick;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TossCertQrSignDevTool$showQrPage$1$$ExternalSyntheticLambda1 implements View.OnClickListener {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ resumeForClick f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Context f$2;
    public final /* synthetic */ TdsTextButtonV0View f$3;

    public /* synthetic */ TossCertQrSignDevTool$showQrPage$1$$ExternalSyntheticLambda1(resumeForClick resumeforclick, String str, Context context, TdsTextButtonV0View tdsTextButtonV0View) {
        this.f$0 = resumeforclick;
        this.f$1 = str;
        this.f$2 = context;
        this.f$3 = tdsTextButtonV0View;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = ((i2 & (-120)) | ((~i2) & 119)) + ((i2 & 119) << 1);
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        resumeForClick resumeforclick = this.f$0;
        String str = this.f$1;
        Context context = this.f$2;
        int i6 = i4 & 31;
        int i7 = ((i4 ^ 31) | i6) << 1;
        int i8 = -((i4 | 31) & (~i6));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        try {
            Object[] objArr = {resumeforclick, str, context, this.f$3, view};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1017874536);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionGroup(0L) + 9882), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 32, KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 22907, -233535224, false, "onExtraCallback", new Class[]{resumeForClick.class, String.class, Context.class, TdsTextButtonV0View.class, View.class});
            }
            ((Method) objOnExtraCallback).invoke(null, objArr);
            int i11 = onExtraCallback;
            int i12 = ((i11 ^ 74) + ((i11 & 74) << 1)) - 1;
            onNavigationEvent = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 21 / 0;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
