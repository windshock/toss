package viva.republica.toss.home;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import im.toss.base.BaseActivity;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraControllerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.RenderInTransitionOverlayNodeElement;
import o.SessionTrackerb;
import o.TombstoneProtosMemoryMappingBuilder;
import o.enableModuleArgumentNSNullConversionIOS;
import o.filterCreatePageParams;
import o.getAdService;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getSpecialFeatureOptInStatus;
import o.mergeParams;
import o.nSetPosition;
import o.readIntokhttp;
import o.updateCertificate_Close;
import o.zzbq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.home.SchemeTransparentWebActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SchemeTransparentWebActivity extends Hilt_SchemeTransparentWebActivity implements RenderInTransitionOverlayNodeElement {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static boolean access100 = false;
    private static char[] asBinder = null;
    private static int asInterface = 0;
    private static boolean getInterfaceDescriptor = false;
    public static final int onTransact;
    private static int writeTypedObject = 1;

    @Inject
    public SessionTrackerb tossRouter;
    private final Lazy IAuthTabCallbackStub = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onWarmupCompleted(this));
    private final Lazy IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.home.SchemeTransparentWebActivity$$ExternalSyntheticLambda1
        public final Object invoke() {
            return Boolean.valueOf(SchemeTransparentWebActivity.onWarmupCompleted(this.f$0));
        }
    });

    static {
        validateRelationship();
        Companion = new onExtraCallbackWithResult(null);
        onTransact = 8;
        int i = IAuthTabCallback_Parcel + 79;
        writeTypedObject = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = (~(i7 | i)) | (~(i7 | i8));
        int i10 = ~i;
        int i11 = (~(i5 | i10 | i6)) | i9;
        int i12 = ~(i8 | i10);
        int i13 = i + i6 + i4 + ((-1228711472) * i2) + ((-141981132) * i3);
        int i14 = i13 * i13;
        int i15 = (((-639131287) * i) - 2072313856) + (1118068377 * i6) + (i11 * (-1268883816)) + ((-1757199664) * i9) + ((-1268883816) * i12) + ((-1908015104) * i4) + ((-287309824) * i2) + ((-1573388288) * i3) + ((-2138374144) * i14);
        int i16 = ((i * (-646461497)) - 273503129) + (i6 * (-646460521)) + (i11 * 488) + (i9 * (-976)) + (i12 * 488) + (i4 * (-646461009)) + (i2 * 1623110960) + (i3 * (-2035004020)) + (i14 * 33882112);
        return i15 + ((i16 * i16) * (-1051394048)) != 1 ? onWarmupCompleted(objArr) : onExtraCallback(objArr);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        SchemeTransparentWebActivity schemeTransparentWebActivity = (SchemeTransparentWebActivity) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        View view = (View) objArr[4];
        WindowInsetsCompat windowInsetsCompat = (WindowInsetsCompat) objArr[5];
        int i = 2 % 2;
        int i2 = access000 + 43;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        WindowInsetsCompat windowInsetsCompatOnExtraCallbackWithResult = onExtraCallbackWithResult(schemeTransparentWebActivity, str, str2, str3, view, windowInsetsCompat);
        int i4 = IAuthTabCallbackStubProxy + 65;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return windowInsetsCompatOnExtraCallbackWithResult;
    }

    public static /* synthetic */ boolean onWarmupCompleted(SchemeTransparentWebActivity schemeTransparentWebActivity) {
        int i = 2 % 2;
        int i2 = access000 + 3;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onNavigationEvent(schemeTransparentWebActivity);
            obj.hashCode();
            throw null;
        }
        boolean zOnNavigationEvent = onNavigationEvent(schemeTransparentWebActivity);
        int i3 = access000 + 79;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 123;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 85;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return -1L;
    }

    public static final class IAuthTabCallback implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallback(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onWarmupCompleted implements Function0<updateCertificate_Close> {
        final /* synthetic */ Activity onWarmupCompleted;

        public onWarmupCompleted(Activity activity) {
            this.onWarmupCompleted = activity;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final updateCertificate_Close invoke() {
            LayoutInflater layoutInflater = this.onWarmupCompleted.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return updateCertificate_Close.onNavigationEvent(layoutInflater);
        }
    }

    public final updateCertificate_Close onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 121;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        updateCertificate_Close updatecertificate_close = (updateCertificate_Close) this.IAuthTabCallbackStub.getValue();
        int i4 = IAuthTabCallbackStubProxy + 95;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return updatecertificate_close;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        SchemeTransparentWebActivity schemeTransparentWebActivity = (SchemeTransparentWebActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) schemeTransparentWebActivity.IAuthTabCallbackDefault.getValue()).booleanValue();
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 53;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean onNavigationEvent(SchemeTransparentWebActivity schemeTransparentWebActivity) {
        int i = 2 % 2;
        int i2 = access000 + 41;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = filterCreatePageParams.onExtraCallback(schemeTransparentWebActivity.getIntent().getData(), "navBarOverlay", false);
        int i4 = access000 + 37;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnExtraCallback;
        }
        throw null;
    }

    public final SessionTrackerb setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = access000 + 77;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            int i4 = i3 + 23;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i6 = access000 + 51;
        IAuthTabCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String IAuthTabCallback() throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 101;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = getIntent();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-111, -110, -126, -106, -113, -126, -121, -122, -116, -122, -107, -108, -110, -121, -122, -125, -109, -111, -113, -126, -118}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 108, objArr);
        String stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
        int i4 = access000 + 125;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return stringExtra;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.home.Hilt_SchemeTransparentWebActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        String str;
        String path;
        int i = 2 % 2;
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Object[] objArr = new Object[1];
        Object obj = null;
        a(null, null, new byte[]{-125, -126, -127}, 127 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
        String strOnNavigationEvent = zzbq.onNavigationEvent(intent, ((String) objArr[0]).intern(), "");
        if (strOnNavigationEvent.length() == 0) {
            finish();
            return;
        }
        if (enableModuleArgumentNSNullConversionIOS.asInterface.IAuthTabCallbackDefault(strOnNavigationEvent)) {
            String strOnWarmupCompleted = setEngagementSignalsCallback().onWarmupCompleted(strOnNavigationEvent);
            if (strOnWarmupCompleted == null) {
                strOnWarmupCompleted = "";
            }
            Uri uri = Uri.parse(strOnWarmupCompleted);
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-125, -126, -127}, 127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr2);
            str = (String) filterCreatePageParams.onWarmupCompleted(new Object[]{uri, ((String) objArr2[0]).intern(), ""}, 1209790, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1209789);
        } else {
            int i2 = IAuthTabCallbackStubProxy + 13;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            str = strOnNavigationEvent;
        }
        Uri uri2 = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, new Object[]{strOnNavigationEvent});
        if (uri2 != null) {
            int i4 = IAuthTabCallbackStubProxy + 23;
            access000 = i4 % 128;
            if (i4 % 2 == 0) {
                uri2.getPath();
                obj.hashCode();
                throw null;
            }
            path = uri2.getPath();
        } else {
            int i5 = IAuthTabCallbackStubProxy + 97;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            path = null;
        }
        boolean zAreEqual = Intrinsics.areEqual(path, "/payment/bridge/alipay");
        updateVisuals();
        ICustomTabsServiceDefault();
        setContentView(onNavigationEvent().getRoot());
        if (zAreEqual) {
            BaseActivity.IAuthTabCallback(this, (String) null, false, 3, (Object) null);
            FrameLayout root = onNavigationEvent().getRoot();
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            root.setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new IAuthTabCallback(configuration)).onWarmupCompleted());
            int i7 = access000 + 17;
            IAuthTabCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
        }
        Intent intent2 = getIntent();
        Object[] objArr3 = new Object[1];
        a(null, null, new byte[]{-126, -120, -126, -126, -120, -118, -120, -126}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022060).substring(3, 4).codePointAt(0) + 95, objArr3);
        onExtraCallback(str, intent2.getStringExtra(((String) objArr3[0]).intern()));
    }

    public void onDestroy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 113;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            bo_();
            super.onDestroy();
        } else {
            bo_();
            super.onDestroy();
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00bb, code lost:
    
        if (r5 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c0, code lost:
    
        if ((!r5) != true) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c3, code lost:
    
        r3 = r3 + 109;
        viva.republica.toss.home.SchemeTransparentWebActivity.IAuthTabCallbackStubProxy = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ca, code lost:
    
        return false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean newSessionWithExtras() throws java.lang.Throwable {
        /*
            r14 = this;
            r0 = 2
            int r1 = r0 % r0
            android.content.Intent r1 = r14.getIntent()
            r2 = 3
            byte[] r2 = new byte[r2]
            r2 = {x00cc: FILL_ARRAY_DATA , data: [-125, -126, -127} // fill-array
            int r3 = android.view.ViewConfiguration.getFadingEdgeLength()
            int r3 = r3 >> 16
            int r3 = 127 - r3
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            a(r6, r6, r2, r3, r5)
            r2 = 0
            r3 = r5[r2]
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = r3.intern()
            java.lang.String r5 = ""
            java.lang.String r1 = o.zzbq.onNavigationEvent(r1, r3, r5)
            java.lang.Object[] r13 = new java.lang.Object[]{r1}
            int r8 = o.nSetPosition.onExtraCallbackWithResult()
            int r11 = o.nSetPosition.onExtraCallbackWithResult()
            int r7 = o.nSetPosition.onExtraCallbackWithResult()
            int r9 = o.nSetPosition.onExtraCallbackWithResult()
            r12 = 846257509(0x3270dd65, float:1.4020178E-8)
            r10 = -846257502(0xffffffffcd8f22a2, float:-3.0017645E8)
            java.lang.Object r1 = o.mergeParams.onWarmupCompleted(r7, r8, r9, r10, r11, r12, r13)
            android.net.Uri r1 = (android.net.Uri) r1
            if (r1 == 0) goto L52
            java.lang.String r1 = r1.getPath()
            goto L53
        L52:
            r1 = r6
        L53:
            java.lang.String r3 = "/payment/bridge/alipay"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            android.content.Intent r3 = r14.getIntent()
            r7 = 14
            byte[] r8 = new byte[r7]
            r8 = {x00d2: FILL_ARRAY_DATA , data: [-116, -120, -120, -126, -103, -102, -105, -103, -113, -104, -121, -122, -105, -124} // fill-array
            int r5 = android.view.KeyEvent.keyCodeFromString(r5)
            int r5 = r5 + 127
            java.lang.Object[] r9 = new java.lang.Object[r4]
            a(r6, r6, r8, r5, r9)
            r5 = r9[r2]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = r5.intern()
            boolean r3 = r3.getBooleanExtra(r5, r2)
            android.content.Intent r5 = r14.getIntent()
            byte[] r7 = new byte[r7]
            r7 = {x00de: FILL_ARRAY_DATA , data: [-116, -120, -120, -126, -103, -102, -105, -103, -113, -104, -121, -122, -105, -124} // fill-array
            int r8 = android.view.ViewConfiguration.getScrollBarSize()
            int r8 = r8 >> 8
            int r8 = 127 - r8
            java.lang.Object[] r9 = new java.lang.Object[r4]
            a(r6, r6, r7, r8, r9)
            r6 = r9[r2]
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = r6.intern()
            java.lang.String r5 = r5.getStringExtra(r6)
            boolean r5 = java.lang.Boolean.parseBoolean(r5)
            if (r1 != 0) goto Lcb
            int r1 = viva.republica.toss.home.SchemeTransparentWebActivity.IAuthTabCallbackStubProxy
            int r6 = r1 + 49
            int r7 = r6 % 128
            viva.republica.toss.home.SchemeTransparentWebActivity.access000 = r7
            int r6 = r6 % r0
            r3 = r3 ^ r4
            if (r3 == r4) goto Lb0
            goto Lcb
        Lb0:
            int r1 = r1 + 91
            int r3 = r1 % 128
            viva.republica.toss.home.SchemeTransparentWebActivity.access000 = r3
            int r1 = r1 % r0
            if (r1 != 0) goto Lbe
            r1 = 5
            int r1 = r1 / r2
            if (r5 == 0) goto Lc3
            goto Lcb
        Lbe:
            r1 = r5 ^ 1
            if (r1 == r4) goto Lc3
            goto Lcb
        Lc3:
            int r3 = r3 + 109
            int r1 = r3 % 128
            viva.republica.toss.home.SchemeTransparentWebActivity.IAuthTabCallbackStubProxy = r1
            int r3 = r3 % r0
            return r2
        Lcb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.home.SchemeTransparentWebActivity.newSessionWithExtras():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsServiceDefault() throws Throwable {
        int i = 2 % 2;
        Intent intent = getIntent();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-116, -113, -122, -115, -110, -115, -116, -120, -122, -126, -113}, 127 - Color.argb(0, 0, 0, 0), objArr);
        String stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
        if (stringExtra == null) {
            int i2 = access000 + 103;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 38 / 0;
            }
            stringExtra = "";
        }
        if (Intrinsics.areEqual(stringExtra, "landscape")) {
            int i4 = IAuthTabCallbackStubProxy + 47;
            access000 = i4 % 128;
            if (i4 % 2 == 0) {
                setRequestedOrientation(0);
                return;
            } else {
                setRequestedOrientation(0);
                return;
            }
        }
        if (Intrinsics.areEqual(stringExtra, "portrait")) {
            int i5 = access000 + 69;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            setRequestedOrientation(1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007e, code lost:
    
        r1 = getWindow().getDecorView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00aa, code lost:
    
        if (((java.lang.Boolean) o.generateLink.onExtraCallbackWithResult(viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new java.lang.Object[]{r11}, 194147643, viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ac, code lost:
    
        r0 = 1280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00af, code lost:
    
        r3 = viva.republica.toss.home.SchemeTransparentWebActivity.IAuthTabCallbackStubProxy + 77;
        viva.republica.toss.home.SchemeTransparentWebActivity.access000 = r3 % 128;
        r3 = r3 % 2;
        r0 = 9472;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ba, code lost:
    
        r1.setSystemUiVisibility(r0);
        getWindow().setStatusBarColor(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0036, code lost:
    
        if (((java.lang.Boolean) onExtraCallback(-1887933329, im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new java.lang.Object[]{r11}, im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), r7, r8, 1887933329)).booleanValue() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005d, code lost:
    
        if (((java.lang.Boolean) onExtraCallback(-1887933329, im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new java.lang.Object[]{r11}, im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), r8, r9, 1887933329)).booleanValue() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005f, code lost:
    
        getWindow().setFlags(512, 512);
        o.RepeatableSpec.onExtraCallbackWithResult(getWindow(), false);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateVisuals() {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.home.SchemeTransparentWebActivity.IAuthTabCallbackStubProxy
            int r1 = r1 + 59
            int r2 = r1 % 128
            viva.republica.toss.home.SchemeTransparentWebActivity.access000 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L39
            java.lang.Object[] r5 = new java.lang.Object[]{r11}
            int r8 = im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent()
            int r7 = im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent()
            int r4 = im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent()
            int r6 = im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent()
            r3 = -1887933329(0xffffffff8f786c6f, float:-1.22482276E-29)
            r9 = 1887933329(0x70879391, float:3.35671E29)
            java.lang.Object r1 = onExtraCallback(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r3 = 20
            int r3 = r3 / r2
            if (r1 == 0) goto L7e
            goto L5f
        L39:
            java.lang.Object[] r6 = new java.lang.Object[]{r11}
            int r9 = im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent()
            int r8 = im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent()
            int r5 = im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent()
            int r7 = im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent()
            r4 = -1887933329(0xffffffff8f786c6f, float:-1.22482276E-29)
            r10 = 1887933329(0x70879391, float:3.35671E29)
            java.lang.Object r1 = onExtraCallback(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L7e
        L5f:
            android.view.Window r0 = r11.getWindow()
            r1 = 512(0x200, float:7.17E-43)
            r0.setFlags(r1, r1)
            android.view.Window r0 = r11.getWindow()
            o.RepeatableSpec.onExtraCallbackWithResult(r0, r2)
            android.view.Window r0 = r11.getWindow()
            r0.setStatusBarColor(r2)
            android.view.Window r0 = r11.getWindow()
            r0.setNavigationBarColor(r2)
            return
        L7e:
            android.view.Window r1 = r11.getWindow()
            android.view.View r1 = r1.getDecorView()
            java.lang.Object[] r5 = new java.lang.Object[]{r11}
            int r3 = viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback()
            int r7 = viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback()
            int r8 = viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback()
            int r9 = viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback()
            r4 = -194147640(0xfffffffff46d8ac8, float:-7.52801E31)
            r6 = 194147643(0xb92753b, float:5.6413543E-32)
            java.lang.Object r3 = o.generateLink.onExtraCallbackWithResult(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Laf
            r0 = 1280(0x500, float:1.794E-42)
            goto Lba
        Laf:
            int r3 = viva.republica.toss.home.SchemeTransparentWebActivity.IAuthTabCallbackStubProxy
            int r3 = r3 + 77
            int r4 = r3 % 128
            viva.republica.toss.home.SchemeTransparentWebActivity.access000 = r4
            int r3 = r3 % r0
            r0 = 9472(0x2500, float:1.3273E-41)
        Lba:
            r1.setSystemUiVisibility(r0)
            android.view.Window r0 = r11.getWindow()
            r0.setStatusBarColor(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.home.SchemeTransparentWebActivity.updateVisuals():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(String str, String str2) {
        String strIAuthTabCallback;
        int i = 2 % 2;
        Uri data = getIntent().getData();
        Object obj = null;
        if (data != null) {
            int i2 = access000 + 105;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                strIAuthTabCallback = filterCreatePageParams.IAuthTabCallback(data, "onVisibilityChangeCallback", "");
            } else {
                filterCreatePageParams.IAuthTabCallback(data, "onVisibilityChangeCallback", "");
                obj.hashCode();
                throw null;
            }
        } else {
            int i3 = IAuthTabCallbackStubProxy + 55;
            access000 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 % 5;
            }
            strIAuthTabCallback = null;
        }
        ViewCompat.onWarmupCompleted(onNavigationEvent().getRoot(), new SchemeTransparentWebActivity$.ExternalSyntheticLambda0(this, str, strIAuthTabCallback, str2));
        int i5 = access000 + 71;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public WindowInsetsCompat onApplyWindowInsets(@NotNull View view, @NotNull WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted = windowInsetsCompat.onWarmupCompleted(WindowInsetsCompat.onTransact.IAuthTabCallback());
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted, "");
        onNavigationEvent().getRoot().setPadding(0, 0, 0, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback);
        WindowInsetsCompat windowInsetsCompatOnExtraCallbackWithResult = new WindowInsetsCompat.onWarmupCompleted(windowInsetsCompat).onNavigationEvent(WindowInsetsCompat.onTransact.IAuthTabCallback(), CameraControllerExternalSyntheticLambda0.onNavigationEvent(cameraControllerExternalSyntheticLambda0OnWarmupCompleted.IAuthTabCallback, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onWarmupCompleted, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallbackWithResult, 0)).onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompatOnExtraCallbackWithResult, "");
        int i2 = IAuthTabCallbackStubProxy + 61;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return windowInsetsCompatOnExtraCallbackWithResult;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = asBinder;
        if (cArr3 != null) {
            int i4 = $10 + 101;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i2])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 77, Color.rgb(0, 0, 0) + 16798168, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr2[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i2++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i5 = $11 + 59;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(asInterface)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), AndroidCharacter.getMirror('0') + 27, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (!(!getInterfaceDescriptor)) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i7 = $11 + 51;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), TextUtils.indexOf("", "", 0) + 63, (KeyEvent.getMaxKeyCode() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!access100) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            String str = new String(cArr5);
            int i9 = $11 + 95;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
            objArr[0] = str;
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            try {
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 63 - (ViewConfiguration.getTapTimeout() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final androidx.core.view.WindowInsetsCompat onExtraCallbackWithResult(viva.republica.toss.home.SchemeTransparentWebActivity r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, android.view.View r21, androidx.core.view.WindowInsetsCompat r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.home.SchemeTransparentWebActivity.onExtraCallbackWithResult(viva.republica.toss.home.SchemeTransparentWebActivity, java.lang.String, java.lang.String, java.lang.String, android.view.View, androidx.core.view.WindowInsetsCompat):androidx.core.view.WindowInsetsCompat");
    }

    public static /* synthetic */ WindowInsetsCompat onNavigationEvent(SchemeTransparentWebActivity schemeTransparentWebActivity, String str, String str2, String str3, View view, WindowInsetsCompat windowInsetsCompat) {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return (WindowInsetsCompat) onExtraCallback(257905535, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{schemeTransparentWebActivity, str, str2, str3, view, windowInsetsCompat}, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, -257905534);
    }

    private final boolean ICustomTabsServiceStub() {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return ((Boolean) onExtraCallback(-1887933329, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{this}, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, 1887933329)).booleanValue();
    }

    @Override // viva.republica.toss.home.Hilt_SchemeTransparentWebActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = access000 + 41;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.home.Hilt_SchemeTransparentWebActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 89;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = IAuthTabCallbackStubProxy + 37;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
    }

    @Override // viva.republica.toss.home.Hilt_SchemeTransparentWebActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 113;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
        int i4 = access000 + 63;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.home.Hilt_SchemeTransparentWebActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = access000 + 59;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void validateRelationship() {
        asBinder = new char[]{32419, 32430, 32436, 32429, 32417, 32439, 32424, 32435, 32398, 32434, 32432, 32426, 32428, 32396, 32425, 32414, 32427, 32447, 32415, 32423, 32395, 32433, 32437, 32404, 32445, 32397};
        asInterface = -1184333992;
        access100 = true;
        getInterfaceDescriptor = true;
    }
}
