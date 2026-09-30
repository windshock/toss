package viva.republica.toss.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.LoadControl;
import im.toss.base.BaseActivity;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CMS_VerifySignedDataWithContent;
import o.CommonModule_setSecureScreen;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class VideoViewerActivity extends BaseActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    public static final int IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 0;
    private static int[] access100 = null;
    private static int getInterfaceDescriptor = 1;
    private ExoPlayer IAuthTabCallbackStub;
    private int asBinder;
    private final Lazy asInterface = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onNavigationEvent(this));
    private String onTransact = BuildConfig.FLAVOR;

    static {
        onNavigationEvent();
        Companion = new onExtraCallback(null);
        IAuthTabCallbackDefault = 8;
        int i = IAuthTabCallbackStubProxy + 3;
        getInterfaceDescriptor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(ExoPlayer exoPlayer) {
        int i = 2 % 2;
        int i2 = access000 + 53;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(exoPlayer);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(exoPlayer);
        int i3 = IAuthTabCallback_Parcel + 21;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onWarmupCompleted(VideoViewerActivity videoViewerActivity, View view) {
        int i = 2 % 2;
        int i2 = access000 + 3;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(videoViewerActivity, view);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallback_Parcel + 41;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = access000 + 19;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 13;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return -1L;
    }

    public static final class onNavigationEvent implements Function0<CMS_VerifySignedDataWithContent> {
        final /* synthetic */ Activity onWarmupCompleted;

        public onNavigationEvent(Activity activity) {
            this.onWarmupCompleted = activity;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final CMS_VerifySignedDataWithContent invoke() {
            LayoutInflater layoutInflater = this.onWarmupCompleted.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, BuildConfig.FLAVOR);
            return CMS_VerifySignedDataWithContent.onWarmupCompleted(layoutInflater);
        }
    }

    private final CMS_VerifySignedDataWithContent IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 101;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        CMS_VerifySignedDataWithContent cMS_VerifySignedDataWithContent = (CMS_VerifySignedDataWithContent) this.asInterface.getValue();
        int i4 = access000 + 25;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return cMS_VerifySignedDataWithContent;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    private static final Unit onExtraCallback(ExoPlayer exoPlayer) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 21;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(exoPlayer, BuildConfig.FLAVOR);
        exoPlayer.setPlayWhenReady(true);
        exoPlayer.prepare();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 35;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onNavigationEvent(VideoViewerActivity videoViewerActivity, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 121;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        videoViewerActivity.finish();
        if (i3 != 0) {
            int i4 = 39 / 0;
        }
        int i5 = access000 + 111;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 121;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setContentView(IAuthTabCallback().getRoot());
        Intent intent = getIntent();
        Object[] objArr = new Object[1];
        a(new int[]{-829806881, -1648426186}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022418).substring(0, 12).length() - 9, objArr);
        String stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
        if (stringExtra != null) {
            this.onTransact = stringExtra;
            this.asBinder = getIntent().getIntExtra("serviceId", 0);
            this.IAuthTabCallbackStub = CommonModule_setSecureScreen.IAuthTabCallback(CommonModule_setSecureScreen.onWarmupCompleted, this, this.onTransact, (LoadControl) null, (Function1) null, new Function1() { // from class: viva.republica.toss.util.VideoViewerActivity$$ExternalSyntheticLambda0
                public final Object invoke(Object obj) {
                    return VideoViewerActivity.onWarmupCompleted((ExoPlayer) obj);
                }
            }, 12, (Object) null);
            IAuthTabCallback().onNavigationEvent.setPlayer(this.IAuthTabCallbackStub);
            IAuthTabCallback().onNavigationEvent.setControllerShowTimeoutMs(3000);
            IAuthTabCallback().onExtraCallbackWithResult.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.util.VideoViewerActivity$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VideoViewerActivity.onWarmupCompleted(this.f$0, view);
                }
            });
            return;
        }
        int i4 = access000 + 45;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            finish();
        } else {
            finish();
            int i5 = 47 / 0;
        }
    }

    public void onPause() {
        int i = 2 % 2;
        super.onPause();
        ExoPlayer exoPlayer = this.IAuthTabCallbackStub;
        if (exoPlayer != null) {
            int i2 = access000 + 79;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            exoPlayer.setPlayWhenReady(false);
            int i4 = access000 + 31;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 4;
            }
        }
    }

    public void onDestroy() {
        ExoPlayer exoPlayer;
        int i = 2 % 2;
        int i2 = access000 + 111;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            super.onDestroy();
            exoPlayer = this.IAuthTabCallbackStub;
            int i3 = 87 / 0;
            if (exoPlayer == null) {
                return;
            }
        } else {
            super.onDestroy();
            exoPlayer = this.IAuthTabCallbackStub;
            if (exoPlayer == null) {
                return;
            }
        }
        exoPlayer.release();
        int i4 = access000 + 29;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 3;
        }
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 49;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 33;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return "media_view";
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("category", "common");
        linkedHashMap.put("service_id", Integer.valueOf(this.asBinder));
        Object[] objArr = new Object[1];
        a(new int[]{-190203834, 202129674}, 4 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
        linkedHashMap.put(((String) objArr[0]).intern(), "video");
        Object[] objArr2 = new Object[1];
        a(new int[]{-829806881, -1648426186}, (KeyEvent.getMaxKeyCode() >> 16) + 3, objArr2);
        linkedHashMap.put(((String) objArr2[0]).intern(), this.onTransact);
        int i2 = IAuthTabCallback_Parcel + 51;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 68 / 0;
        }
        return linkedHashMap;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = access100;
        int i3 = -1469660336;
        if (iArr3 != null) {
            int i4 = $11 + 107;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 1), 72 - Color.argb(0, 0, 0, 0), 8848 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i5] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i5++;
                    i3 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = access100;
        int i6 = 16;
        if (iArr5 != null) {
            int i7 = $11 + 11;
            $10 = i7 % 128;
            int i8 = 2;
            int i9 = i7 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                int i11 = $10 + 1;
                $11 = i11 % 128;
                int i12 = i11 % i8;
                Object[] objArr3 = {Integer.valueOf(iArr5[i10])};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> i6), 72 - View.MeasureSpec.getMode(0), 8848 - ExpandableListView.getPackedPositionGroup(0L), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i10] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i10++;
                i6 = 16;
                i8 = 2;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i13];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - Gravity.getAbsoluteGravity(0, 0)), 39 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i13++;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i15;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16773183) - Color.rgb(0, 0, 0)), Gravity.getAbsoluteGravity(0, 0) + 78, 7398 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            int i18 = $11 + 65;
            $10 = i18 % 128;
            if (i18 % 2 != 0) {
                int i19 = 4 / 4;
            }
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 3;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = access000 + 95;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = access000 + 67;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = IAuthTabCallback_Parcel + 103;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = access000 + 45;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = access000 + 95;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
    }

    static void onNavigationEvent() {
        access100 = new int[]{95687172, -338735173, -737870081, -1575859895, -976956426, -1484743284, 295067592, -1092552046, 896469504, 4304592, -1634743026, -2114702184, -920415764, -1993428514, 2057139505, 1543595065, -1410277065, -170753597};
    }
}
