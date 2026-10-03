package viva.republica.toss.pedometer.main;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CMP_IssueCertificate_NoConf;
import o.ConvertByteArrayToFloatArray;
import o.EncodedDataImplExternalSyntheticLambda0;
import o.GuardedAsyncTask;
import o.IPostMessageServiceStubProxy;
import o.SetDetectableSize;
import o.TimelineExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.disableImageViewPreallocationAndroid;
import o.sendBroadcastWithAdObject;
import o.trackCheckout;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.pedometer.main.PedometerNotificationSettingActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PedometerNotificationSettingActivity extends Hilt_PedometerNotificationSettingActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallbackDefault = 5270619041094544685L;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private final Lazy IAuthTabCallbackStub = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onNavigationEvent(this));

    @Inject
    public trackCheckout notificationHelper;

    public static /* synthetic */ Unit IAuthTabCallback(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(setDetectableSize);
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void IAuthTabCallback(PedometerNotificationSettingActivity pedometerNotificationSettingActivity, View view) {
        int i = 2 % 2;
        int i2 = asInterface + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(pedometerNotificationSettingActivity, view);
        if (i3 != 0) {
            throw null;
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 43;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 69;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return -1L;
    }

    public static final class onNavigationEvent implements Function0<CMP_IssueCertificate_NoConf> {
        final /* synthetic */ Activity onWarmupCompleted;

        public onNavigationEvent(Activity activity) {
            this.onWarmupCompleted = activity;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final CMP_IssueCertificate_NoConf invoke() {
            LayoutInflater layoutInflater = this.onWarmupCompleted.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CMP_IssueCertificate_NoConf.onExtraCallbackWithResult(layoutInflater);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r1 = viva.republica.toss.pedometer.main.PedometerNotificationSettingActivity.asBinder + 93;
        viva.republica.toss.pedometer.main.PedometerNotificationSettingActivity.asInterface = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.trackCheckout IAuthTabCallback() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.pedometer.main.PedometerNotificationSettingActivity.asBinder
            int r1 = r1 + 51
            int r2 = r1 % 128
            viva.republica.toss.pedometer.main.PedometerNotificationSettingActivity.asInterface = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L17
            o.trackCheckout r1 = r3.notificationHelper
            r2 = 12
            int r2 = r2 / 0
            if (r1 == 0) goto L1c
            goto L1b
        L17:
            o.trackCheckout r1 = r3.notificationHelper
            if (r1 == 0) goto L1c
        L1b:
            return r1
        L1c:
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            int r1 = viva.republica.toss.pedometer.main.PedometerNotificationSettingActivity.asBinder
            int r1 = r1 + 93
            int r2 = r1 % 128
            viva.republica.toss.pedometer.main.PedometerNotificationSettingActivity.asInterface = r2
            int r1 = r1 % r0
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.pedometer.main.PedometerNotificationSettingActivity.IAuthTabCallback():o.trackCheckout");
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 79;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 81;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return "";
    }

    private final CMP_IssueCertificate_NoConf onNavigationEvent() {
        CMP_IssueCertificate_NoConf cMP_IssueCertificate_NoConf;
        int i = 2 % 2;
        int i2 = asBinder + 31;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            cMP_IssueCertificate_NoConf = (CMP_IssueCertificate_NoConf) this.IAuthTabCallbackStub.getValue();
            int i3 = 91 / 0;
        } else {
            cMP_IssueCertificate_NoConf = (CMP_IssueCertificate_NoConf) this.IAuthTabCallbackStub.getValue();
        }
        int i4 = asInterface + 63;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return cMP_IssueCertificate_NoConf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.pedometer.main.Hilt_PedometerNotificationSettingActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.onCreate(bundle);
            setContentView(onNavigationEvent().getRoot());
            IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.onNavigationEvent(true);
            }
            ConstraintLayout root = onNavigationEvent().getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            disableImageViewPreallocationAndroid.onNavigationEvent(root, onNavigationEvent().onWarmupCompleted, (View) null, (View) null, false, 14, (Object) null);
            onNavigationEvent().onExtraCallbackWithResult.asInterface().setOnClickListener(new PedometerNotificationSettingActivity$.ExternalSyntheticLambda1(this));
            int i3 = asBinder + 39;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        super.onCreate(bundle);
        setContentView(onNavigationEvent().getRoot());
        getSupportActionBar();
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback().put("view", "pedometer_main");
        setDetectableSize.onExtraCallback().put("category", sendBroadcastWithAdObject.PEDOMETER);
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        Object[] objArr = new Object[1];
        a(new char[]{50100, 50134, 32839, 37428, 36544, 22035, 39775, 30936, 15874, 3287}, 1 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), "os_notification_on");
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 39;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final void onExtraCallback(PedometerNotificationSettingActivity pedometerNotificationSettingActivity, View view) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onWarmupCompleted("click_button", false, (String) null, (List) null, (Map) null, new PedometerNotificationSettingActivity$.ExternalSyntheticLambda0(), 30, (Object) null);
        pedometerNotificationSettingActivity.validateRelationship();
        int i2 = asInterface + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.pedometer.main.Hilt_PedometerNotificationSettingActivity
    public void onStart() {
        int i = 2 % 2;
        super.onStart();
        if (GuardedAsyncTask.IAuthTabCallback.asInterface((Context) this)) {
            setResult(-1);
            finish();
            int i2 = asInterface + 111;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = asInterface + 3;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void validateRelationship() {
        int i = 2 % 2;
        int i2 = asInterface + 101;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (EncodedDataImplExternalSyntheticLambda0.onNavigationEvent(this).onWarmupCompleted()) {
            if (!updateVisuals()) {
                setEngagementSignalsCallback();
                int i4 = asInterface + 9;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
            }
            int i6 = asInterface + 65;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        int i8 = asBinder + 115;
        asInterface = i8 % 128;
        int i9 = i8 % 2;
        setEngagementSignalsCallback();
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallbackDefault ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 99;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallbackDefault)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - View.combineMeasuredStates(0, 0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 84, 21233 - (ViewConfiguration.getFadingEdgeLength() >> 16), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myTid() >> 22) + 14185), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 20, Color.blue(0) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $10 + 25;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback().asBinder(this);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean updateVisuals() {
        int i = 2 % 2;
        int i2 = asInterface + 39;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Intent intentPutExtra = new Intent("android.settings.APP_CHANNELLIST_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", getPackageName());
                Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
                startActivity(intentPutExtra);
                return true;
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        }
        int i4 = asBinder;
        int i5 = i4 + 37;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 35;
        asInterface = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override // viva.republica.toss.pedometer.main.Hilt_PedometerNotificationSettingActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = asInterface + 77;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.pedometer.main.Hilt_PedometerNotificationSettingActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = asBinder + 7;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.pedometer.main.Hilt_PedometerNotificationSettingActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = asBinder + 99;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
