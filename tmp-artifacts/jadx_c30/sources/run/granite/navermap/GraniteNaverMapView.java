package run.granite.navermap;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.CertTransferMgrTransferException;
import o.CertTransferMgra;
import o.CertTransferMgrb;
import o.CertUtil;
import o.FPUtil;
import o.compareWithCurrent;
import o.convertFromFingerRecoveryToNPKI;
import o.convertFromNPKItoFinger;
import o.decryptForHidingPrivateKeyWithPin;
import o.decryptForPrivateKey;
import o.getCertPolicyString;
import o.getDateString;
import o.getKeyUsageString;
import o.parseDN;
import o.r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI;
import o.readFileToByteArray;
import o.transV2GetOtherRole;
import o.transV2VerifyQRCodeCheckSum;
import o.verifyPass;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class GraniteNaverMapView extends FrameLayout implements LifecycleEventListener, convertFromFingerRecoveryToNPKI {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static int onExtraCallback;
    private final Runnable IAuthTabCallback;
    private final ReactContext asBinder;
    private final int onExtraCallbackWithResult;
    private readFileToByteArray onNavigationEvent;
    private View onWarmupCompleted;

    public final void IAuthTabCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
    }

    public final void IAuthTabCallback(@NotNull String str, double d, double d2, @NotNull String str2, float f, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
    }

    public final void onExtraCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
    }

    public final void onExtraCallbackWithResult(@NotNull String str, double d, double d2, double d3, double d4, @NotNull String str2, float f, int i) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
    }

    public void onHostResume() {
    }

    public final void onNavigationEvent(@NotNull String str, double d, double d2, @NotNull String str2, float f, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
    }

    public final void onWarmupCompleted(@NotNull String str, double d, double d2, double d3, double d4, @NotNull String str2, float f, int i) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraniteNaverMapView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        int i = onExtraCallback + 1;
        onExtraCallback = i;
        this.onExtraCallbackWithResult = i;
        this.asBinder = (ReactContext) context;
        onNavigationEvent();
        this.IAuthTabCallback = new Runnable() { // from class: run.granite.navermap.GraniteNaverMapView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                GraniteNaverMapView.onExtraCallback(this.f$0);
            }
        };
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    private final EventDispatcher onExtraCallbackWithResult() {
        return r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallbackWithResult(this.asBinder, getId());
    }

    private final int IAuthTabCallback() {
        return r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallback(this);
    }

    private final void onNavigationEvent() {
        decryptForPrivateKey decryptforprivatekey = decryptForPrivateKey.onNavigationEvent;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, BuildConfig.FLAVOR);
        readFileToByteArray readfiletobytearrayIAuthTabCallback = decryptforprivatekey.IAuthTabCallback(context);
        if (readfiletobytearrayIAuthTabCallback == null) {
            TextView textView = new TextView(getContext());
            textView.setText("NaverMap provider not registered");
            textView.setTextAlignment(4);
            addView(textView, new FrameLayout.LayoutParams(-1, -1));
            return;
        }
        this.onNavigationEvent = readfiletobytearrayIAuthTabCallback;
        readfiletobytearrayIAuthTabCallback.onNavigationEvent(this);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, BuildConfig.FLAVOR);
        View viewOnExtraCallback = readfiletobytearrayIAuthTabCallback.onExtraCallback(context2);
        this.onWarmupCompleted = viewOnExtraCallback;
        addView(viewOnExtraCallback, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.IAuthTabCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(GraniteNaverMapView graniteNaverMapView) {
        graniteNaverMapView.measure(View.MeasureSpec.makeMeasureSpec(graniteNaverMapView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(graniteNaverMapView.getHeight(), 1073741824));
        graniteNaverMapView.layout(graniteNaverMapView.getLeft(), graniteNaverMapView.getTop(), graniteNaverMapView.getRight(), graniteNaverMapView.getBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.asBinder.addLifecycleEventListener(this);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.onExtraCallbackWithResult(i, i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.asBinder.removeLifecycleEventListener(this);
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.onExtraCallback();
        }
        super.onDetachedFromWindow();
    }

    public void onExtraCallback() {
        EventDispatcher eventDispatcherOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (eventDispatcherOnExtraCallbackWithResult != null) {
            eventDispatcherOnExtraCallbackWithResult.onWarmupCompleted(new getKeyUsageString(IAuthTabCallback(), getId()));
        }
    }

    public void IAuthTabCallback(@NotNull transV2VerifyQRCodeCheckSum transv2verifyqrcodechecksum, @NotNull List<CertTransferMgrb> list, @NotNull List<CertTransferMgrb> list2) {
        Intrinsics.checkNotNullParameter(transv2verifyqrcodechecksum, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(list2, BuildConfig.FLAVOR);
        EventDispatcher eventDispatcherOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (eventDispatcherOnExtraCallbackWithResult != null) {
            eventDispatcherOnExtraCallbackWithResult.onWarmupCompleted(new CertTransferMgra(IAuthTabCallback(), getId(), transv2verifyqrcodechecksum.onExtraCallback().onWarmupCompleted(), transv2verifyqrcodechecksum.onExtraCallback().onExtraCallback(), transv2verifyqrcodechecksum.onExtraCallbackWithResult(), list, list2));
        }
    }

    public void onExtraCallbackWithResult(int i, boolean z) {
        EventDispatcher eventDispatcherOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (eventDispatcherOnExtraCallbackWithResult != null) {
            eventDispatcherOnExtraCallbackWithResult.onWarmupCompleted(new decryptForHidingPrivateKeyWithPin(IAuthTabCallback(), getId(), i, z));
        }
    }

    public void onExtraCallback(double d, double d2, double d3, double d4) {
        EventDispatcher eventDispatcherOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (eventDispatcherOnExtraCallbackWithResult != null) {
            eventDispatcherOnExtraCallbackWithResult.onWarmupCompleted(new CertTransferMgrTransferException(IAuthTabCallback(), getId(), d, d2, d3, d4));
        }
    }

    public void onNavigationEvent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        EventDispatcher eventDispatcherOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (eventDispatcherOnExtraCallbackWithResult != null) {
            eventDispatcherOnExtraCallbackWithResult.onWarmupCompleted(new getDateString(IAuthTabCallback(), getId(), str));
        }
    }

    public final void setCenter(double d, double d2, double d3, double d4, double d5) {
        transV2VerifyQRCodeCheckSum transv2verifyqrcodechecksum = new transV2VerifyQRCodeCheckSum(new CertTransferMgrb(d, d2), d3, d4, d5);
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.onExtraCallbackWithResult(transv2verifyqrcodechecksum, true);
        }
    }

    public final void onExtraCallback(double d, double d2) {
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.onExtraCallbackWithResult(new CertTransferMgrb(d, d2));
        }
    }

    public final void onWarmupCompleted(double d, double d2, double d3, double d4) {
        transV2GetOtherRole transv2getotherrole = new transV2GetOtherRole(new CertTransferMgrb(Math.min(d, d3), Math.min(d2, d4)), new CertTransferMgrb(Math.max(d, d3), Math.max(d2, d4)));
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.IAuthTabCallback(transv2getotherrole, 24);
        }
    }

    public final void IAuthTabCallback(double d, double d2, double d3, double d4) {
        double d5 = d3 / 2.0d;
        double d6 = d4 / 2.0d;
        transV2GetOtherRole transv2getotherrole = new transV2GetOtherRole(new CertTransferMgrb(d - d5, d2 - d6), new CertTransferMgrb(d + d5, d2 + d6));
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.IAuthTabCallback(transv2getotherrole, 0);
        }
    }

    public final void setLayerGroupEnabled(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.onExtraCallback(str, z);
        }
    }

    public final void setShowsMyLocationButton(boolean z) {
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.onNavigationEvent(z);
        }
    }

    public final void setCompass(boolean z) {
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.onExtraCallbackWithResult(z);
        }
    }

    public final void setScaleBar(boolean z) {
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.onWarmupCompleted(z);
        }
    }

    public final void setZoomControl(boolean z) {
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.asBinder(z);
        }
    }

    public final void setMapType(int i) {
        convertFromNPKItoFinger[] convertfromnpkitofingerArrValues = convertFromNPKItoFinger.values();
        convertFromNPKItoFinger convertfromnpkitofinger = (i < 0 || i >= convertfromnpkitofingerArrValues.length) ? convertFromNPKItoFinger.BASIC : convertfromnpkitofingerArrValues[i];
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.onNavigationEvent(convertfromnpkitofinger);
        }
    }

    public final void setBuildingHeight(float f) {
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.IAuthTabCallback(f);
        }
    }

    public final void setNightMode(boolean z) {
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.onExtraCallback(z);
        }
    }

    public final void setMinZoomLevel(double d) {
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.onExtraCallbackWithResult(d);
        }
    }

    public final void setMaxZoomLevel(double d) {
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.onWarmupCompleted(d);
        }
    }

    public final void setScrollGesturesEnabled(boolean z) {
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.IAuthTabCallbackDefault(z);
        }
    }

    public final void setZoomGesturesEnabled(boolean z) {
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.IAuthTabCallbackStub(z);
        }
    }

    public final void setTiltGesturesEnabled(boolean z) {
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.asInterface(z);
        }
    }

    public final void setRotateGesturesEnabled(boolean z) {
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.IAuthTabCallback(z);
        }
    }

    public final void setStopGesturesEnabled(boolean z) {
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.onTransact(z);
        }
    }

    public final void setLocationTrackingMode(int i) {
        compareWithCurrent[] comparewithcurrentArrValues = compareWithCurrent.values();
        compareWithCurrent comparewithcurrent = (i < 0 || i >= comparewithcurrentArrValues.length) ? compareWithCurrent.NONE : comparewithcurrentArrValues[i];
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.onWarmupCompleted(comparewithcurrent);
        }
    }

    public final void setMapPadding(int i, int i2, int i3, int i4) {
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.onExtraCallbackWithResult(i, i2, i3, i4);
        }
    }

    public final void IAuthTabCallbackDefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.onExtraCallback(str);
        }
    }

    public final void onNavigationEvent(@NotNull String str, double d, double d2, int i, int i2, int i3, float f, boolean z, float f2, int i4, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        getCertPolicyString getcertpolicystring = new getCertPolicyString(str, new CertTransferMgrb(d, d2), i, i2, i3, f, z, f2, i4, str2);
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.onWarmupCompleted(getcertpolicystring);
        }
    }

    public final void onExtraCallbackWithResult(@NotNull String str, double d, double d2, int i, int i2, int i3, float f, boolean z, float f2, int i4, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        getCertPolicyString getcertpolicystring = new getCertPolicyString(str, new CertTransferMgrb(d, d2), i, i2, i3, f, z, f2, i4, str2);
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.onExtraCallbackWithResult(getcertpolicystring);
        }
    }

    public final void onNavigationEvent(@NotNull String str, @NotNull String str2, float f, int i, int i2, int i3, int i4, @NotNull String str3) throws JSONException {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        List<CertTransferMgrb> listAsInterface = asInterface(str2);
        if (listAsInterface.size() >= 2) {
            parseDN parsedn = new parseDN(str, listAsInterface, f, i, i2, i3, i4, access100(str3));
            readFileToByteArray readfiletobytearray = this.onNavigationEvent;
            if (readfiletobytearray != null) {
                readfiletobytearray.onWarmupCompleted(parsedn);
            }
        }
    }

    public final void onExtraCallback(@NotNull String str, @NotNull String str2, float f, int i, int i2, int i3, int i4, @NotNull String str3) throws JSONException {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        List<CertTransferMgrb> listAsInterface = asInterface(str2);
        if (listAsInterface.size() >= 2) {
            parseDN parsedn = new parseDN(str, listAsInterface, f, i, i2, i3, i4, access100(str3));
            readFileToByteArray readfiletobytearray = this.onNavigationEvent;
            if (readfiletobytearray != null) {
                readfiletobytearray.onExtraCallback(parsedn);
            }
        }
    }

    public final void IAuthTabCallbackStub(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.onNavigationEvent(str);
        }
    }

    public final void onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, int i2, float f, int i3) throws JSONException {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        List<CertTransferMgrb> listAsInterface = asInterface(str2);
        if (listAsInterface.size() >= 3) {
            FPUtil fPUtil = new FPUtil(str, listAsInterface, IAuthTabCallbackStubProxy(str3), i, i2, f, i3);
            readFileToByteArray readfiletobytearray = this.onNavigationEvent;
            if (readfiletobytearray != null) {
                readfiletobytearray.onExtraCallbackWithResult(fPUtil);
            }
        }
    }

    public final void onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, int i2, float f, int i3) throws JSONException {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        List<CertTransferMgrb> listAsInterface = asInterface(str2);
        if (listAsInterface.size() >= 3) {
            FPUtil fPUtil = new FPUtil(str, listAsInterface, IAuthTabCallbackStubProxy(str3), i, i2, f, i3);
            readFileToByteArray readfiletobytearray = this.onNavigationEvent;
            if (readfiletobytearray != null) {
                readfiletobytearray.IAuthTabCallback(fPUtil);
            }
        }
    }

    public final void onTransact(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.IAuthTabCallback(str);
        }
    }

    public final void onExtraCallback(@NotNull String str, double d, double d2, double d3, int i, int i2, float f, int i3) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        CertUtil certUtil = new CertUtil(str, new CertTransferMgrb(d, d2), d3, i, i2, f, i3);
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.onExtraCallback(certUtil);
        }
    }

    public final void onExtraCallbackWithResult(@NotNull String str, double d, double d2, double d3, int i, int i2, float f, int i3) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        CertUtil certUtil = new CertUtil(str, new CertTransferMgrb(d, d2), d3, i, i2, f, i3);
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.IAuthTabCallback(certUtil);
        }
    }

    public final void onWarmupCompleted(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.onExtraCallbackWithResult(str);
        }
    }

    public final void onNavigationEvent(@NotNull String str, @NotNull String str2, float f, float f2, int i, int i2, int i3, int i4, @NotNull String str3, int i5, float f3, int i6) throws JSONException {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        List<CertTransferMgrb> listAsInterface = asInterface(str2);
        if (listAsInterface.size() >= 2) {
            verifyPass verifypass = new verifyPass(str, listAsInterface, f, f2, i, i2, i3, i4, str3, i5, f3, i6);
            readFileToByteArray readfiletobytearray = this.onNavigationEvent;
            if (readfiletobytearray != null) {
                readfiletobytearray.onExtraCallback(verifypass);
            }
        }
    }

    public final void onExtraCallback(@NotNull String str, @NotNull String str2, float f, float f2, int i, int i2, int i3, int i4, @NotNull String str3, int i5, float f3, int i6) throws JSONException {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        List<CertTransferMgrb> listAsInterface = asInterface(str2);
        if (listAsInterface.size() >= 2) {
            verifyPass verifypass = new verifyPass(str, listAsInterface, f, f2, i, i2, i3, i4, str3, i5, f3, i6);
            readFileToByteArray readfiletobytearray = this.onNavigationEvent;
            if (readfiletobytearray != null) {
                readfiletobytearray.IAuthTabCallback(verifypass);
            }
        }
    }

    public final void asBinder(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        readFileToByteArray readfiletobytearray = this.onNavigationEvent;
        if (readfiletobytearray != null) {
            readfiletobytearray.onWarmupCompleted(str);
        }
    }

    public final void onExtraCallback(@NotNull String str, @NotNull String str2, float f, float f2, int i, int i2, float f3, int i3) throws JSONException {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        onNavigationEvent(str, str2, f, f2, i, i2, i, i2, BuildConfig.FLAVOR, 0, 0.0f, i3);
    }

    public final void onNavigationEvent(@NotNull String str, @NotNull String str2, float f, float f2, int i, int i2, float f3, int i3) throws JSONException {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        onExtraCallback(str, str2, f, f2, i, i2, i, i2, BuildConfig.FLAVOR, 0, 0.0f, i3);
    }

    public final void onExtraCallbackWithResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        asBinder(str);
    }

    private final List<CertTransferMgrb> asInterface(String str) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                arrayList.add(new CertTransferMgrb(jSONObject.getDouble("latitude"), jSONObject.getDouble("longitude")));
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    private final List<List<CertTransferMgrb>> IAuthTabCallbackStubProxy(String str) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                ArrayList arrayList2 = new ArrayList();
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject = jSONArray2.getJSONObject(i2);
                    arrayList2.add(new CertTransferMgrb(jSONObject.getDouble("latitude"), jSONObject.getDouble("longitude")));
                }
                arrayList.add(arrayList2);
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    private final List<Integer> access100(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(Integer.valueOf(jSONArray.getInt(i)));
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }
}
