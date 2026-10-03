package viva.republica.toss.main;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import im.toss.core.R;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.ALCCamera;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BufferedDecoder;
import o.ConvertFloatArrayToByteArray;
import o.ForwardingLiveDataExternalSyntheticLambda0;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.ITrustedWebActivityServiceStub;
import o.SessionTrackerb;
import o.TrackGroupExternalSyntheticLambda0;
import o.UST_CMP_Update_Confirm;
import o.enableLayoutAnimationsOnIOS;
import o.enableMainQueueCoordinatorOnIOS;
import o.filterCreatePageParams;
import o.getAdService;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getSpecialFeatureOptInStatus;
import o.onAdViewAdDisplayFailed;
import o.onPageExit;
import o.readIntokhttp;
import o.removeOnConfigurationChangedListener;
import o.removeOnContextAvailableListener;
import o.zzbq;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.main.ExternalWebActivity;
import viva.republica.toss.main.SchemeWebActivity$;
import viva.republica.toss.service.BottomSheetLabActivity;
import viva.republica.toss.service.LabActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SchemeWebActivity extends Hilt_SchemeWebActivity implements enableLayoutAnimationsOnIOS {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    public static final int IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int asInterface;
    private static long onTransact;
    private boolean IAuthTabCallbackDefault;
    private final IEngagementSignalsCallback_Parcel<Intent> asBinder = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.main.SchemeWebActivity$$ExternalSyntheticLambda1
        public final Object invoke(Object obj) {
            return SchemeWebActivity.onNavigationEvent(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });

    @Inject
    public SessionTrackerb tossRouter;

    static {
        setEngagementSignalsCallback();
        Companion = new onExtraCallback(null);
        IAuthTabCallbackStub = 8;
        int i = access000 + 69;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i3;
        int i9 = ~i2;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i8 | i4 | i2);
        int i12 = (~(i2 | i4)) | (~(i7 | i9)) | i8;
        int i13 = i3 + i4 + i5 + (62936680 * i) + ((-2032430997) * i6);
        int i14 = i13 * i13;
        int i15 = ((-476632153) * i3) + 797966336 + (1756943451 * i4) + (i10 * (-1030695846)) + ((-1030695846) * i11) + (1030695846 * i12) + ((-1507328000) * i5) + ((-264241152) * i) + ((-222822400) * i6) + (2040594432 * i14);
        int i16 = ((i3 * 1175661207) - 43826732) + (i4 * 1175659659) + (i10 * (-774)) + (i11 * (-774)) + (i12 * 774) + (i5 * 1175660433) + (i * 1188219112) + (i6 * (-816965221)) + (i14 * 1798373376);
        int i17 = i15 + (i16 * i16 * 914292736);
        if (i17 == 1) {
            return onExtraCallback(objArr);
        }
        if (i17 == 2) {
            return onNavigationEvent(objArr);
        }
        if (i17 == 3) {
            return onExtraCallbackWithResult(objArr);
        }
        SchemeWebActivity schemeWebActivity = (SchemeWebActivity) objArr[0];
        IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
        int i18 = 2 % 2;
        int i19 = IAuthTabCallbackStubProxy + 95;
        asInterface = i19 % 128;
        int i20 = i19 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        schemeWebActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i21 = asInterface + 89;
        IAuthTabCallbackStubProxy = i21 % 128;
        int i22 = i21 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SchemeWebActivity schemeWebActivity, Uri uri, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(schemeWebActivity, uri, z);
        }
        onNavigationEvent(schemeWebActivity, uri, z);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SchemeWebActivity schemeWebActivity, String str, String str2, String str3, String str4, Uri uri, boolean z, String str5, boolean z2) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 79;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(schemeWebActivity, str, str2, str3, str4, uri, z, str5, z2);
        int i4 = asInterface + 49;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(SchemeWebActivity schemeWebActivity, View view) {
        int i = 2 % 2;
        int i2 = asInterface + 41;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(schemeWebActivity, view);
        int i4 = IAuthTabCallbackStubProxy + 17;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(SchemeWebActivity schemeWebActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1651466922, -1651466922, new Object[]{schemeWebActivity, iEngagementSignalsCallbackDefault}, iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        int i4 = IAuthTabCallbackStubProxy + 25;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SchemeWebActivity schemeWebActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = asInterface + 113;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onNavigationEvent(schemeWebActivity, th);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(schemeWebActivity, th);
        int i3 = asInterface + 33;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return -1L;
        }
        throw null;
    }

    public boolean newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 77;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 17;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public AppCompatActivity onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 87;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r4 = viva.republica.toss.main.SchemeWebActivity.asInterface + 95;
        viva.republica.toss.main.SchemeWebActivity.IAuthTabCallbackStubProxy = r4 % 128;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if ((r4 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        r3 = r3 + 111;
        viva.republica.toss.main.SchemeWebActivity.IAuthTabCallbackStubProxy = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onNavigationEvent(java.lang.Object[] r4) {
        /*
            r0 = 0
            r4 = r4[r0]
            viva.republica.toss.main.SchemeWebActivity r4 = (viva.republica.toss.main.SchemeWebActivity) r4
            r1 = 2
            int r2 = r1 % r1
            int r2 = viva.republica.toss.main.SchemeWebActivity.IAuthTabCallbackStubProxy
            int r2 = r2 + 1
            int r3 = r2 % 128
            viva.republica.toss.main.SchemeWebActivity.asInterface = r3
            int r2 = r2 % r1
            o.SessionTrackerb r4 = r4.tossRouter
            if (r2 == 0) goto L1b
            r2 = 85
            int r2 = r2 / r0
            if (r4 == 0) goto L25
            goto L1d
        L1b:
            if (r4 == 0) goto L25
        L1d:
            int r3 = r3 + 111
            int r0 = r3 % 128
            viva.republica.toss.main.SchemeWebActivity.IAuthTabCallbackStubProxy = r0
            int r3 = r3 % r1
            return r4
        L25:
            java.lang.String r4 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            int r4 = viva.republica.toss.main.SchemeWebActivity.asInterface
            int r4 = r4 + 95
            int r0 = r4 % 128
            viva.republica.toss.main.SchemeWebActivity.IAuthTabCallbackStubProxy = r0
            int r4 = r4 % r1
            r0 = 0
            if (r4 == 0) goto L37
            return r0
        L37:
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.SchemeWebActivity.onNavigationEvent(java.lang.Object[]):java.lang.Object");
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 17;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), 24 - (ViewConfiguration.getFadingEdgeLength() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 19626, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() + (onTransact * 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 59, ExpandableListView.getPackedPositionChild(0L) + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString("")), 24 - (ViewConfiguration.getScrollBarSize() >> 8), 19627 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (5407414049857832247L ^ onTransact);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 58 - TextUtils.lastIndexOf("", '0'), TextUtils.lastIndexOf("", '0') + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 27;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), TextUtils.getOffsetAfter("", 0) + 59, 6383 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    private static final Unit onExtraCallback(SchemeWebActivity schemeWebActivity, String str, String str2, String str3, String str4, Uri uri, boolean z, String str5, boolean z2) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            schemeWebActivity.onWarmupCompleted(str, str2, str3, str4, uri, z, str5, z2);
            int i3 = 49 / 0;
            return Unit.INSTANCE;
        }
        schemeWebActivity.onWarmupCompleted(str, str2, str3, str4, uri, z, str5, z2);
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(SchemeWebActivity schemeWebActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 13;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(th, "");
            schemeWebActivity.finish();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(th, "");
        schemeWebActivity.finish();
        int i3 = 81 / 0;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:230:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0ce6  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0ce8  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0d04  */
    @Override // viva.republica.toss.main.Hilt_SchemeWebActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.SchemeWebActivity.onCreate(android.os.Bundle):void");
    }

    private final boolean onExtraCallbackWithResult(Intent intent) {
        int i = 2 % 2;
        if ((!zzbq.onNavigationEvent(intent) && intent.getBooleanExtra("skipVerify", false)) || intent.getBooleanExtra("urlFromServer", false)) {
            return true;
        }
        int i2 = IAuthTabCallbackStubProxy + 3;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean booleanExtra = intent.getBooleanExtra("SKIP_VERIFY_BY_OPEN", false);
        if (i3 != 0) {
            if (booleanExtra) {
                return true;
            }
        } else if (booleanExtra) {
            return true;
        }
        int i4 = IAuthTabCallbackStubProxy + 49;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 51;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bundle, "");
            super.onSaveInstanceState(bundle);
            bundle.putBoolean("isCustomTabSessionConnected", this.IAuthTabCallbackDefault);
        } else {
            Intrinsics.checkNotNullParameter(bundle, "");
            super.onSaveInstanceState(bundle);
            bundle.putBoolean("isCustomTabSessionConnected", this.IAuthTabCallbackDefault);
            int i3 = 91 / 0;
        }
    }

    @Override // viva.republica.toss.main.Hilt_SchemeWebActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 85;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            super.onResume();
            if (this.IAuthTabCallbackDefault) {
                int i3 = asInterface + 33;
                IAuthTabCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
                finish();
                int i5 = IAuthTabCallbackStubProxy + 99;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            return;
        }
        super.onResume();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        if (this.IAuthTabCallbackDefault) {
            ALCCamera.onExtraCallbackWithResult(this);
        }
        int i4 = IAuthTabCallbackStubProxy + 59;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(String str, String str2, String str3, String str4, Uri uri, boolean z, String str5, boolean z2) throws Throwable {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        int i2 = asInterface + 99;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0 ? !(!StringsKt.equals("browser", str, true)) : StringsKt.equals("browser", str, true)) {
            iAuthTabCallback = IAuthTabCallback.Browser;
        } else {
            boolean zEquals = StringsKt.equals("true", str, true);
            Object[] objArr = new Object[1];
            a(new char[]{48453, 28336}, Color.red(0) + 54193, objArr);
            if (Intrinsics.areEqual(str3, ((String) objArr[0]).intern()) && !zEquals) {
                iAuthTabCallback = IAuthTabCallback.External;
            } else if (zEquals || !filterCreatePageParams.onTransact(uri)) {
                if (Intrinsics.areEqual(str2, "pagesheet")) {
                    int i3 = asInterface + 53;
                    IAuthTabCallbackStubProxy = i3 % 128;
                    int i4 = i3 % 2;
                    iAuthTabCallback = IAuthTabCallback.ExternalPageSheets;
                } else {
                    iAuthTabCallback = IAuthTabCallback.CustomTabs;
                }
            } else {
                iAuthTabCallback = IAuthTabCallback.Internal;
            }
        }
        int i5 = onNavigationEvent.IAuthTabCallback[iAuthTabCallback.ordinal()];
        if (i5 == 1) {
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "");
            onExtraCallbackWithResult(str2, intent);
            return;
        }
        if (i5 == 2) {
            onNavigationEvent(str4, uri, z, str5, z2);
            return;
        }
        if (i5 == 3) {
            onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1199217418, -1199217415, new Object[]{this, uri, str4}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
            return;
        }
        if (i5 == 4) {
            onExtraCallbackWithResult(uri);
            return;
        }
        if (i5 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        int i6 = asInterface + 103;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 != 0) {
            if (IAuthTabCallback(uri)) {
                return;
            }
            onWarmupCompleted(uri);
            return;
        }
        IAuthTabCallback(uri);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(String str, Intent intent) {
        Intent intentIAuthTabCallback;
        int i = 2 % 2;
        int i2 = asInterface + 87;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        if (Intrinsics.areEqual(str, "pagesheet")) {
            intentIAuthTabCallback = BottomSheetLabActivity.Companion.onNavigationEvent(this, intent);
        } else {
            intentIAuthTabCallback = LabActivity.Companion.IAuthTabCallback(this, intent);
            int i4 = IAuthTabCallbackStubProxy + 77;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        startActivity(intentIAuthTabCallback);
        finish();
    }

    public static final class onExtraCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static char[] onExtraCallback = {27252, 27197, 27169, 27252, 27170, 27174, 27198, 27168, 27175, 27292, 27291, 27295, 27273};
        private static int onNavigationEvent = 1;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr = onExtraCallback;
            char c = '0';
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 35, 14238 - TextUtils.indexOf("", c, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i6++;
                        c = '0';
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
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr, i2, cArr3, 0, i3);
            if (bArr != null) {
                int i7 = $10 + 39;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char[] cArr4 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c2 = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 10935), TextUtils.getTrimmedLength("") + 65, (Process.myPid() >> 22) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } else {
                        int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        try {
                            Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 29, 17656 - TextUtils.lastIndexOf("", '0'), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    c2 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49466), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 70, 12534 - AndroidCharacter.getMirror('0'), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i5 > 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr3, 0, cArr5, 0, i3);
                int i11 = i3 - i5;
                System.arraycopy(cArr5, 0, cArr3, i11, i5);
                System.arraycopy(cArr5, i5, cArr3, 0, i11);
            }
            if (z) {
                char[] cArr6 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                    int i12 = $10 + 17;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                }
                cArr3 = cArr6;
            }
            if (i4 > 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr3);
        }

        private onExtraCallback() {
        }

        public static /* synthetic */ Intent onExtraCallback(onExtraCallback onextracallback, Context context, String str, String str2, String str3, boolean z, boolean z2, int i, Object obj) {
            String str4;
            boolean z3;
            boolean z4;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 61;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 4) != 0) {
                int i6 = i3 + 65;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                int i8 = i3 + 101;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                str4 = "";
            } else {
                str4 = str2;
            }
            String str5 = (i & 8) != 0 ? "" : str3;
            if ((i & 16) != 0) {
                int i10 = IAuthTabCallback + 113;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                z3 = false;
            } else {
                z3 = z;
            }
            if ((i & 32) != 0) {
                int i12 = IAuthTabCallback + 79;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                z4 = false;
            } else {
                z4 = z2;
            }
            return onextracallback.onExtraCallbackWithResult(context, str, str4, str5, z3, z4);
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, boolean z2) throws Throwable {
            Intent intentPutExtra;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            if (filterCreatePageParams.onTransact(Uri.parse(str))) {
                intentPutExtra = new Intent(context, (Class<?>) LabActivity.class);
                int i4 = onNavigationEvent + 59;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            } else {
                intentPutExtra = new Intent(context, (Class<?>) SchemeWebActivity.class).putExtra("external", str3).putExtra("skipVerify", z);
                Intrinsics.checkNotNull(intentPutExtra);
            }
            Object[] objArr = new Object[1];
            a(new int[]{0, 3, 0, 0}, false, new byte[]{1, 1, 0}, objArr);
            intentPutExtra.putExtra(((String) objArr[0]).intern(), str);
            Object[] objArr2 = new Object[1];
            a(new int[]{3, 5, 0, 1}, true, new byte[]{0, 1, 1, 0, 1}, objArr2);
            intentPutExtra.putExtra(((String) objArr2[0]).intern(), str2);
            if (z2) {
                int i6 = onNavigationEvent + 11;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                Object[] objArr3 = new Object[1];
                a(new int[]{8, 5, 95, 0}, false, new byte[]{0, 1, 1, 1, 1}, objArr3);
                intentPutExtra.putExtra(((String) objArr3[0]).intern(), "pagesheet");
            }
            return intentPutExtra;
        }

        public static /* synthetic */ Intent onNavigationEvent(onExtraCallback onextracallback, Context context, String str, String str2, String str3, boolean z, boolean z2, String str4, boolean z3, String str5, boolean z4, int i, Object obj) {
            String str6;
            boolean z5;
            boolean z6;
            boolean z7;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 61;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0 ? (i & 4) == 0 : (i & 3) == 0) {
                str6 = str2;
            } else {
                int i5 = i3 + 77;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                str6 = "";
            }
            String str7 = (i & 8) != 0 ? "" : str3;
            if ((i & 16) != 0) {
                int i7 = i3 + 37;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                z5 = false;
            } else {
                z5 = z;
            }
            boolean z8 = (i & 32) != 0 ? false : z2;
            String str8 = (i & 64) != 0 ? "" : str4;
            if ((i & 128) != 0) {
                int i9 = i3 + 119;
                IAuthTabCallback = i9 % 128;
                z6 = i9 % 2 != 0;
            } else {
                z6 = z3;
            }
            String str9 = (i & 256) != 0 ? "" : str5;
            if ((i & 512) != 0) {
                int i10 = i3 + 5;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 4 % 4;
                }
                z7 = false;
            } else {
                z7 = z4;
            }
            return onextracallback.onWarmupCompleted(context, str, str6, str7, z5, z8, str8, z6, str9, z7);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x004d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final android.content.Intent onWarmupCompleted(@org.jetbrains.annotations.NotNull android.content.Context r6, @org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String r9, boolean r10, boolean r11, @org.jetbrains.annotations.NotNull java.lang.String r12, boolean r13, @org.jetbrains.annotations.NotNull java.lang.String r14, boolean r15) throws java.lang.Throwable {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.main.SchemeWebActivity.onExtraCallback.onNavigationEvent
                r2 = 5
                int r1 = r1 + r2
                int r3 = r1 % 128
                viva.republica.toss.main.SchemeWebActivity.onExtraCallback.IAuthTabCallback = r3
                int r1 = r1 % r0
                java.lang.String r3 = ""
                r4 = 0
                if (r1 == 0) goto L31
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r3)
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r3)
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r3)
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r3)
                android.net.Uri r1 = android.net.Uri.parse(r7)
                boolean r1 = o.filterCreatePageParams.onTransact(r1)
                r3 = 58
                int r3 = r3 / r4
                if (r1 == 0) goto L55
                goto L4d
            L31:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r3)
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r3)
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r3)
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r3)
                android.net.Uri r1 = android.net.Uri.parse(r7)
                boolean r1 = o.filterCreatePageParams.onTransact(r1)
                if (r1 == 0) goto L55
            L4d:
                android.content.Intent r9 = new android.content.Intent
                java.lang.Class<viva.republica.toss.service.LabActivity> r10 = viva.republica.toss.service.LabActivity.class
                r9.<init>(r6, r10)
                goto L8c
            L55:
                android.content.Intent r1 = new android.content.Intent
                java.lang.Class<viva.republica.toss.main.SchemeWebActivity> r3 = viva.republica.toss.main.SchemeWebActivity.class
                r1.<init>(r6, r3)
                java.lang.String r6 = "external"
                android.content.Intent r6 = r1.putExtra(r6, r9)
                java.lang.String r9 = "skipVerify"
                android.content.Intent r6 = r6.putExtra(r9, r10)
                java.lang.String r9 = "ui"
                android.content.Intent r6 = r6.putExtra(r9, r12)
                java.lang.String r9 = "hideTitle"
                android.content.Intent r6 = r6.putExtra(r9, r13)
                java.lang.String r9 = "icon"
                android.content.Intent r6 = r6.putExtra(r9, r14)
                java.lang.String r9 = "showBackButton"
                android.content.Intent r9 = r6.putExtra(r9, r15)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
                int r6 = viva.republica.toss.main.SchemeWebActivity.onExtraCallback.onNavigationEvent
                int r6 = r6 + 117
                int r10 = r6 % 128
                viva.republica.toss.main.SchemeWebActivity.onExtraCallback.IAuthTabCallback = r10
                int r6 = r6 % r0
            L8c:
                r6 = 3
                int[] r10 = new int[]{r4, r6, r4, r4}
                byte[] r12 = new byte[r6]
                r12 = {x00e2: FILL_ARRAY_DATA , data: [1, 1, 0} // fill-array
                r13 = 1
                java.lang.Object[] r14 = new java.lang.Object[r13]
                a(r10, r4, r12, r14)
                r10 = r14[r4]
                java.lang.String r10 = (java.lang.String) r10
                java.lang.String r10 = r10.intern()
                r9.putExtra(r10, r7)
                int[] r6 = new int[]{r6, r2, r4, r13}
                byte[] r7 = new byte[r2]
                r7 = {x00e8: FILL_ARRAY_DATA , data: [0, 1, 1, 0, 1} // fill-array
                java.lang.Object[] r10 = new java.lang.Object[r13]
                a(r6, r13, r7, r10)
                r6 = r10[r4]
                java.lang.String r6 = (java.lang.String) r6
                java.lang.String r6 = r6.intern()
                r9.putExtra(r6, r8)
                if (r11 == 0) goto Le1
                r6 = 8
                r7 = 95
                int[] r6 = new int[]{r6, r2, r7, r4}
                byte[] r7 = new byte[r2]
                r7 = {x00f0: FILL_ARRAY_DATA , data: [0, 1, 1, 1, 1} // fill-array
                java.lang.Object[] r8 = new java.lang.Object[r13]
                a(r6, r4, r7, r8)
                r6 = r8[r4]
                java.lang.String r6 = (java.lang.String) r6
                java.lang.String r6 = r6.intern()
                java.lang.String r7 = "pagesheet"
                r9.putExtra(r6, r7)
            Le1:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.SchemeWebActivity.onExtraCallback.onWarmupCompleted(android.content.Context, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, boolean, java.lang.String, boolean):android.content.Intent");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean IAuthTabCallback(Uri uri) {
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intent intentOnWarmupCompleted = BufferedDecoder.onWarmupCompleted.onWarmupCompleted(this, uri, "im.toss.business");
        if (intentOnWarmupCompleted == null) {
            int i4 = asInterface + 107;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        try {
            Result.Companion companion = Result.Companion;
            this.asBinder.onNavigationEvent(intentOnWarmupCompleted);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        return Result.onNavigationEvent(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(Uri uri) {
        int i = 2 % 2;
        try {
            Intent intentAddFlags = new Intent("android.intent.action.VIEW", uri).addFlags(268435456);
            Intrinsics.checkNotNullExpressionValue(intentAddFlags, "");
            startActivity(intentAddFlags);
            int i2 = IAuthTabCallbackStubProxy + 111;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
        } catch (ActivityNotFoundException e) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, getScreenName(), "activity not found for uri:" + uri, e, (Map) null, 8, (Object) null);
        }
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(String str, Uri uri, boolean z, String str2, boolean z2) {
        int i = 2 % 2;
        int i2 = asInterface + 103;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            ExternalWebActivity.onWarmupCompleted onwarmupcompleted = ExternalWebActivity.Companion;
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            startActivity(onwarmupcompleted.IAuthTabCallback(this, string, str, z, str2, z2));
            finish();
            return;
        }
        ExternalWebActivity.onWarmupCompleted onwarmupcompleted2 = ExternalWebActivity.Companion;
        String string2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        startActivity(onwarmupcompleted2.IAuthTabCallback(this, string2, str, z, str2, z2));
        finish();
        int i3 = 16 / 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(Uri uri) {
        int i = 2 % 2;
        ALCCamera.onExtraCallbackWithResult(this, new SchemeWebActivity$.ExternalSyntheticLambda4(this, uri));
        int i2 = IAuthTabCallbackStubProxy + 103;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onNavigationEvent(SchemeWebActivity schemeWebActivity, Uri uri, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 33;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (!(!z)) {
            schemeWebActivity.IAuthTabCallbackDefault = true;
            try {
                onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1891632973, -1891632972, new Object[]{schemeWebActivity, uri}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
            } catch (Throwable th) {
                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback(schemeWebActivity.getScreenName(), th);
            }
        } else {
            schemeWebActivity.onWarmupCompleted(uri);
            int i3 = asInterface + 27;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Bitmap bitmapOnExtraCallback;
        enableLayoutAnimationsOnIOS enablelayoutanimationsonios = (SchemeWebActivity) objArr[0];
        Uri uri = (Uri) objArr[1];
        int i = 2 % 2;
        removeOnContextAvailableListener.onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallback = new removeOnContextAvailableListener.onExtraCallbackWithResult(ALCCamera.onExtraCallbackWithResult()).onWarmupCompleted(false).onExtraCallbackWithResult(true).IAuthTabCallback(2);
        Drawable drawableOnExtraCallbackWithResult = ITrustedWebActivityServiceStub.onExtraCallbackWithResult(enablelayoutanimationsonios, R.drawable.icn_navigation_close);
        if (drawableOnExtraCallbackWithResult != null) {
            int i2 = asInterface + 63;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            bitmapOnExtraCallback = ForwardingLiveDataExternalSyntheticLambda0.onExtraCallback(drawableOnExtraCallbackWithResult, 0, 0, (Bitmap.Config) null, 7, (Object) null);
        } else {
            int i4 = asInterface + 49;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            bitmapOnExtraCallback = null;
        }
        if (bitmapOnExtraCallback != null) {
            onextracallbackwithresultIAuthTabCallback.onWarmupCompleted(bitmapOnExtraCallback);
        }
        removeOnConfigurationChangedListener.onExtraCallback onextracallback = new removeOnConfigurationChangedListener.onExtraCallback();
        Resources resources = enablelayoutanimationsonios.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        removeOnConfigurationChangedListener.onExtraCallback onextracallbackOnExtraCallbackWithResult = onextracallback.onExtraCallbackWithResult(new getDEFAULT_CONNECTION_SPECSokhttp(new onExtraCallbackWithResult(configuration)).onWarmupCompleted());
        Resources resources2 = enablelayoutanimationsonios.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        Configuration configuration2 = resources2.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        onextracallbackwithresultIAuthTabCallback.onWarmupCompleted(onextracallbackOnExtraCallbackWithResult.onExtraCallback(new getDEFAULT_CONNECTION_SPECSokhttp(new onWarmupCompleted(configuration2)).onWarmupCompleted()).onNavigationEvent()).onExtraCallbackWithResult().onExtraCallback(enablelayoutanimationsonios, uri);
        return null;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = asInterface + 91;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 69;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return "";
    }

    private static final void onWarmupCompleted(SchemeWebActivity schemeWebActivity, View view) {
        int i = 2 % 2;
        int i2 = asInterface + 53;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        schemeWebActivity.onBackPressed();
        int i4 = IAuthTabCallbackStubProxy + 73;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Activity, im.toss.base.BaseActivity, o.enableLayoutAnimationsOnIOS, viva.republica.toss.main.SchemeWebActivity] */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        final ?? r1 = (SchemeWebActivity) objArr[0];
        Uri uri = (Uri) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        UST_CMP_Update_Confirm uST_CMP_Update_ConfirmOnNavigationEvent = UST_CMP_Update_Confirm.onNavigationEvent(r1.getLayoutInflater());
        r1.setContentView(uST_CMP_Update_ConfirmOnNavigationEvent.getRoot());
        uST_CMP_Update_ConfirmOnNavigationEvent.IAuthTabCallback.setNavigationOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.main.SchemeWebActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SchemeWebActivity.onExtraCallbackWithResult(this.f$0, view);
            }
        });
        uST_CMP_Update_ConfirmOnNavigationEvent.IAuthTabCallback.setTitle(str);
        LinearLayoutCompat linearLayoutCompat = uST_CMP_Update_ConfirmOnNavigationEvent.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        FrameLayout frameLayout = uST_CMP_Update_ConfirmOnNavigationEvent.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        enableMainQueueCoordinatorOnIOS.onExtraCallbackWithResult((enableLayoutAnimationsOnIOS) r1, linearLayoutCompat, frameLayout, uri);
        int i2 = asInterface + 89;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 43 / 0;
        }
        return null;
    }

    private static final Unit onExtraCallbackWithResult(SchemeWebActivity schemeWebActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1651466922, -1651466922, new Object[]{schemeWebActivity, iEngagementSignalsCallbackDefault}, iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    private final void onNavigationEvent(Uri uri) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1891632973, -1891632972, new Object[]{this, uri}, iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    private final void onNavigationEvent(Uri uri, String str) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1199217418, -1199217415, new Object[]{this, uri, str}, iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    public final SessionTrackerb IAuthTabCallback() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (SessionTrackerb) onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1680978630, 1680978632, new Object[]{this}, iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    @Override // viva.republica.toss.main.Hilt_SchemeWebActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = asInterface + 113;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = asInterface + 69;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.main.Hilt_SchemeWebActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = asInterface + 97;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.main.Hilt_SchemeWebActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            throw null;
        }
    }

    static void setEngagementSignalsCallback() {
        onTransact = -6155159462864603132L;
    }
}
