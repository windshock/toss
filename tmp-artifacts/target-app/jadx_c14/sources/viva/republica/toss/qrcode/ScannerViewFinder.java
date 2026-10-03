package viva.republica.toss.qrcode;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ApmHelperzb;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.SessionTrackerb;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.dangerouslyForceOverride;
import o.isOneShot;
import o.noStore;
import o.resumeForClick;
import o.setProtocolsokhttp;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;
import viva.republica.toss.qrcode.ScannerViewFinder$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ScannerViewFinder extends FrameLayout implements ApmHelperzb {
    public static final onNavigationEvent Companion;
    private static short[] ICustomTabsCallback;
    private static int access100;
    private static int extraCallbackWithResult;
    private static int getInterfaceDescriptor;
    private static final String onExtraCallback;
    public static final int onExtraCallbackWithResult;
    private static int onMessageChannelReady;
    private static byte[] writeTypedObject;
    private final Handler IAuthTabCallback;
    private View IAuthTabCallbackDefault;
    private View IAuthTabCallbackStub;
    private View IAuthTabCallbackStubProxy;
    private View IAuthTabCallback_Parcel;
    private ValueAnimator access000;
    private TextView asBinder;
    private View asInterface;
    private View onNavigationEvent;
    private TextView onTransact;
    private ImageView onWarmupCompleted;
    private static final byte[] $$a = {48, 86, 58, 71};
    private static final int $$b = 184;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onPostMessage = 0;
    private static int extraCallback = 0;
    private static int readTypedObject = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r7, short r8, byte r9) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 2
            int r8 = r8 + 115
            int r9 = r9 * 3
            int r9 = r9 + 1
            byte[] r0 = viva.republica.toss.qrcode.ScannerViewFinder.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = r7 + r3
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.qrcode.ScannerViewFinder.$$c(short, short, byte):java.lang.String");
    }

    static {
        onMessageChannelReady = 1;
        asInterface();
        Object[] objArr = new Object[1];
        a((short) (26 - Process.getGidForName("")), (byte) (87 - TextUtils.lastIndexOf("", '0')), (-1462395720) - KeyEvent.keyCodeFromString(""), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1417699223, TextUtils.lastIndexOf("", '0', 0, 0) - 97, objArr);
        onExtraCallback = ((String) objArr[0]).intern();
        Companion = new onNavigationEvent(null);
        onExtraCallbackWithResult = 8;
        int i = onPostMessage + 81;
        onMessageChannelReady = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        ScannerViewFinder scannerViewFinder = (ScannerViewFinder) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 83;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(scannerViewFinder);
        int i4 = extraCallback + 69;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws Throwable {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = i7 | i8;
        int i10 = ~(i9 | i3);
        int i11 = (~i3) | i7;
        int i12 = i10 | (~(i11 | i2));
        int i13 = (~(i3 | i7)) | (~i9);
        int i14 = (~i11) | (~(i8 | i5));
        int i15 = i5 + i2 + i + (783392123 * i4) + ((-786872706) * i6);
        int i16 = i15 * i15;
        int i17 = (i5 * 375823119) + 1642083618 + (i2 * 375823682) + (i12 * 563) + (i13 * 1126) + (i14 * 563) + (375824245 * i) + ((-117547465) * i4) + (763984278 * i6) + (i16 * (-763691008));
        int i18 = ((-1525980173) * i5) + 1729888256 + (218870266 * i2) + (i12 * 1744850439) + ((-805266418) * i13) + (1744850439 * i14) + (1963720704 * i) + ((-1731985408) * i4) + ((-471334912) * i6) + ((-600899584) * i16) + (i17 * i17 * 1830354944);
        if (i18 != 1) {
            return i18 != 2 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr);
        }
        ScannerViewFinder scannerViewFinder = (ScannerViewFinder) objArr[0];
        int i19 = 2 % 2;
        int i20 = extraCallback + 51;
        readTypedObject = i20 % 128;
        if (i20 % 2 == 0) {
            scannerViewFinder.IAuthTabCallbackDefault();
            ConvertByteArrayToFloatArray.onExtraCallback(1230165L, false, (String) null, (Map) null, (Function1) null, 17, (Object) null);
        } else {
            scannerViewFinder.IAuthTabCallbackDefault();
            ConvertByteArrayToFloatArray.onExtraCallback(1230165L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        }
        int i21 = extraCallback + 49;
        readTypedObject = i21 % 128;
        int i22 = i21 % 2;
        return null;
    }

    public static /* synthetic */ void onExtraCallback(ScannerViewFinder scannerViewFinder, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 107;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 654827262, iOnExtraCallback, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{scannerViewFinder, view}, -654827261, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
            return;
        }
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 654827262, iOnExtraCallback2, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{scannerViewFinder, view}, -654827261, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        int i3 = 19 / 0;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(ScannerViewFinder scannerViewFinder, float f, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = readTypedObject + 53;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(scannerViewFinder, f, valueAnimator);
        int i4 = readTypedObject + 99;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onNavigationEvent(ScannerViewFinder scannerViewFinder, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = extraCallback + 125;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(scannerViewFinder, valueAnimator);
        int i4 = extraCallback + 83;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void setupViewFinder() {
        int i = 2 % 2;
        int i2 = extraCallback + 91;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(ScannerViewFinder scannerViewFinder, float f) {
        int i = 2 % 2;
        int i2 = readTypedObject + 93;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        scannerViewFinder.onNavigationEvent(f);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = readTypedObject + 101;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScannerViewFinder(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallback = new Handler();
        onTransact();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScannerViewFinder(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.IAuthTabCallback = new Handler();
        onTransact();
    }

    public static final class IAuthTabCallback implements View.OnTouchListener {
        private boolean onWarmupCompleted;

        IAuthTabCallback() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(motionEvent, "");
            int action = motionEvent.getAction();
            boolean z = true;
            if (action == 0) {
                onNavigationEvent(true);
            } else if (action == 1 || action == 3) {
                onNavigationEvent(false);
            } else {
                if (motionEvent.getX() >= 0.0f && motionEvent.getY() >= 0.0f && motionEvent.getX() <= view.getMeasuredWidth() && motionEvent.getY() <= view.getMeasuredHeight()) {
                    z = false;
                }
                if (this.onWarmupCompleted && z) {
                    onNavigationEvent(false);
                }
            }
            return false;
        }

        private final void onNavigationEvent(boolean z) {
            this.onWarmupCompleted = z;
            ScannerViewFinder.onWarmupCompleted(ScannerViewFinder.this, z ? 0.8f : 1.0f);
        }
    }

    private final void onTransact() {
        int i = 2 % 2;
        LayoutInflater.from(getContext()).inflate(R.layout.view_scanner_view_finder, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.flash);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.onNavigationEvent = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.loading_message);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.onTransact = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.guide_message);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.asBinder = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.progress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
        this.asInterface = viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.shoot);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
        this.IAuthTabCallbackDefault = viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.shoot_inner);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
        this.IAuthTabCallback_Parcel = viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.shoot_outer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "");
        this.IAuthTabCallbackStubProxy = viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.gallery);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "");
        this.onWarmupCompleted = (ImageView) viewFindViewById8;
        View viewFindViewById9 = findViewById(R.id.qr_generator);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "");
        this.IAuthTabCallbackStub = viewFindViewById9;
        View view = null;
        if (viewFindViewById9 == null) {
            int i2 = readTypedObject + 69;
            extraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                view.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            viewFindViewById9 = null;
        }
        viewFindViewById9.setOnClickListener(new ScannerViewFinder$.ExternalSyntheticLambda3(this));
        View view2 = this.IAuthTabCallbackDefault;
        if (view2 == null) {
            int i3 = extraCallback + 31;
            readTypedObject = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            view2 = null;
        }
        view2.setOnTouchListener(new IAuthTabCallback());
        View view3 = this.IAuthTabCallbackDefault;
        if (view3 == null) {
            int i4 = extraCallback + 115;
            readTypedObject = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            view = view3;
        }
        setProtocolsokhttp.onExtraCallback(view);
    }

    private final void IAuthTabCallbackDefault() throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 55;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        resumeForClick resumeforclick = resumeForClick.asBinder;
        Context context = getContext();
        Object[] objArr = new Object[1];
        a((short) (MotionEvent.axisFromString("") + 28), (byte) (TextUtils.indexOf("", "", 0) + 88), (-1462395721) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1417699223 + TextUtils.indexOf("", "", 0), KeyEvent.getDeadChar(0, 0) - 98, objArr);
        SessionTrackerb.onExtraCallbackWithResult(resumeforclick, context, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i4 = readTypedObject + 115;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        TextView textView = this.asBinder;
        if (textView == null) {
            int i2 = readTypedObject + 61;
            extraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i3 = 71 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            textView = null;
        }
        textView.setText(str);
        textView.setTextColor(ContextCompat.getColor(textView.getContext(), im.toss.tds.R.color.light_theme_yellow_300));
        try {
            Object[] objArr = {textView.getContext(), textView};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(948703185);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46480 - (ViewConfiguration.getScrollBarSize() >> 8)), (Process.myTid() >> 22) + 13, 22732 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 164426049, false, "onExtraCallbackWithResult", new Class[]{Context.class, View.class});
            }
            ((Method) objOnExtraCallback).invoke(null, objArr);
            isOneShot.onExtraCallbackWithResult(textView, noStore.Companion.onWarmupCompleted());
            Handler handler = this.IAuthTabCallback;
            handler.removeCallbacksAndMessages(null);
            handler.postDelayed(new Runnable() { // from class: viva.republica.toss.qrcode.ScannerViewFinder$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    Object[] objArr2 = {this.f$0};
                    ScannerViewFinder.onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1813752810, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr2, -1813752810, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
                }
            }, 5000L);
            int i4 = readTypedObject + 17;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void IAuthTabCallback(viva.republica.toss.qrcode.ScannerViewFinder r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.qrcode.ScannerViewFinder.readTypedObject
            int r2 = r1 + 39
            int r3 = r2 % 128
            viva.republica.toss.qrcode.ScannerViewFinder.extraCallback = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L17
            android.widget.TextView r4 = r4.asBinder
            r2 = 80
            int r2 = r2 / 0
            if (r4 != 0) goto L31
            goto L1b
        L17:
            android.widget.TextView r4 = r4.asBinder
            if (r4 != 0) goto L31
        L1b:
            int r1 = r1 + 39
            int r4 = r1 % 128
            viva.republica.toss.qrcode.ScannerViewFinder.extraCallback = r4
            int r1 = r1 % r0
            java.lang.String r4 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            int r4 = viva.republica.toss.qrcode.ScannerViewFinder.extraCallback
            int r4 = r4 + 85
            int r1 = r4 % 128
            viva.republica.toss.qrcode.ScannerViewFinder.readTypedObject = r1
            int r4 = r4 % r0
            r4 = 0
        L31:
            int r0 = viva.republica.toss.R.string.message_plz_capture_account
            r4.setText(r0)
            android.content.Context r0 = r4.getContext()
            int r1 = im.toss.tds.R.color.grey_400
            int r0 = androidx.core.content.ContextCompat.getColor(r0, r1)
            r4.setTextColor(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.qrcode.ScannerViewFinder.IAuthTabCallback(viva.republica.toss.qrcode.ScannerViewFinder):void");
    }

    private static final void onNavigationEvent(ScannerViewFinder scannerViewFinder, float f, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        View view = scannerViewFinder.IAuthTabCallbackStubProxy;
        TextView textView = null;
        if (view == null) {
            int i2 = extraCallback + 117;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            view = null;
        }
        view.setAlpha(0.4f - (0.25f * fFloatValue));
        float f2 = 1.0f - (f * fFloatValue);
        view.setScaleX(f2);
        view.setScaleY(f2);
        View view2 = scannerViewFinder.IAuthTabCallback_Parcel;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view2 = null;
        }
        view2.setAlpha(1.0f - (0.85f * fFloatValue));
        TextView textView2 = scannerViewFinder.onTransact;
        if (textView2 == null) {
            int i4 = extraCallback + 79;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i5 == 0) {
                throw null;
            }
        } else {
            textView = textView2;
        }
        textView.setAlpha(fFloatValue);
    }

    private final void onNavigationEvent(float f) {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 105;
        extraCallback = i3 % 128;
        View view = null;
        if (i3 % 2 != 0) {
            view.hashCode();
            throw null;
        }
        ValueAnimator valueAnimator = this.access000;
        if (valueAnimator != null) {
            if (valueAnimator != null) {
                int i4 = i2 + 113;
                extraCallback = i4 % 128;
                int i5 = i4 % 2;
                valueAnimator.cancel();
            }
            this.access000 = null;
        }
        View view2 = this.IAuthTabCallback_Parcel;
        if (view2 == null) {
            int i6 = readTypedObject + 69;
            extraCallback = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            view = view2;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(view.getScaleX(), f);
        valueAnimatorOfFloat.addUpdateListener(new ScannerViewFinder$.ExternalSyntheticLambda0(this));
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.setInterpolator(dangerouslyForceOverride.onExtraCallbackWithResult.IAuthTabCallback());
        valueAnimatorOfFloat.start();
        this.access000 = valueAnimatorOfFloat;
        int i8 = extraCallback + 25;
        readTypedObject = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003d A[PHI: r4
      0x003d: PHI (r4v4 float) = (r4v3 float), (r4v8 float) binds: [B:8:0x003b, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void onWarmupCompleted(viva.republica.toss.qrcode.ScannerViewFinder r3, android.animation.ValueAnimator r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.qrcode.ScannerViewFinder.readTypedObject
            int r1 = r1 + 11
            int r2 = r1 % 128
            viva.republica.toss.qrcode.ScannerViewFinder.extraCallback = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 == 0) goto L29
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            java.lang.Object r4 = r4.getAnimatedValue()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r2)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            android.view.View r3 = r3.IAuthTabCallback_Parcel
            r1 = 84
            int r1 = r1 / 0
            if (r3 != 0) goto L53
            goto L3d
        L29:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            java.lang.Object r4 = r4.getAnimatedValue()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r2)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            android.view.View r3 = r3.IAuthTabCallback_Parcel
            if (r3 != 0) goto L53
        L3d:
            int r3 = viva.republica.toss.qrcode.ScannerViewFinder.readTypedObject
            int r3 = r3 + 59
            int r1 = r3 % 128
            viva.republica.toss.qrcode.ScannerViewFinder.extraCallback = r1
            int r3 = r3 % r0
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            int r3 = viva.republica.toss.qrcode.ScannerViewFinder.extraCallback
            int r3 = r3 + 13
            int r1 = r3 % 128
            viva.republica.toss.qrcode.ScannerViewFinder.readTypedObject = r1
            int r3 = r3 % r0
            r3 = 0
        L53:
            r3.setScaleX(r4)
            r3.setScaleY(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.qrcode.ScannerViewFinder.onWarmupCompleted(viva.republica.toss.qrcode.ScannerViewFinder, android.animation.ValueAnimator):void");
    }

    public Rect onExtraCallbackWithResult() {
        int i = 2 % 2;
        Rect rect = new Rect();
        rect.top = 0;
        rect.left = 0;
        rect.right = getMeasuredWidth();
        rect.bottom = findViewById(R.id.view_finder_bottom_layout).getTop();
        int i2 = extraCallback + 113;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 79 / 0;
        }
        return rect;
    }

    public final View onNavigationEvent() {
        int i = 2 % 2;
        View view = this.onNavigationEvent;
        if (view == null) {
            int i2 = readTypedObject + 107;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            view = null;
        }
        int i4 = extraCallback + 85;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return view;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        boolean z2;
        int i4 = 2;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(getInterfaceDescriptor)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), TextUtils.getCapsMode("", 0, 0) + 42, Color.blue(0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i6 = -1;
            if (iIntValue == -1) {
                z = true;
            } else {
                int i7 = $10 + 17;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                z = false;
            }
            if (z) {
                byte[] bArr = writeTypedObject;
                char c = '0';
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = 0;
                    while (i9 < length) {
                        int i10 = $10 + 93;
                        $11 = i10 % 128;
                        int i11 = i10 % i4;
                        Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            char cMakeMeasureSpec = (char) (12843 - View.MeasureSpec.makeMeasureSpec(0, 0));
                            int iIndexOf = TextUtils.indexOf("", c) + 56;
                            int iIndexOf2 = TextUtils.indexOf("", c, 0, 0) + 2168;
                            byte b2 = (byte) i6;
                            byte b3 = (byte) (b2 + 1);
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cMakeMeasureSpec, iIndexOf, iIndexOf2, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i9++;
                        i4 = 2;
                        i6 = -1;
                        c = '0';
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i12 = $10 + 41;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    byte[] bArr3 = writeTypedObject;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(access100)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 43424), ((Process.getThreadPriority(0) + 20) >> 6) + 42, 22438 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (getInterfaceDescriptor ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (ICustomTabsCallback[i + ((int) (access100 ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (getInterfaceDescriptor ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (access100 ^ j)) + (!(z ^ true) ? 1 : 0);
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(extraCallbackWithResult), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), TextUtils.getOffsetAfter("", 0) + 86, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = writeTypedObject;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i14 = 0; i14 < length2; i14++) {
                        bArr5[i14] = (byte) (bArr4[i14] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i15 = $11 + 101;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = writeTypedObject;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = ICustomTabsCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        ScannerViewFinder scannerViewFinder = (ScannerViewFinder) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 85;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        View view = null;
        View view2 = scannerViewFinder.IAuthTabCallbackDefault;
        if (i3 != 0) {
            view.hashCode();
            throw null;
        }
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            view = view2;
        }
        int i4 = extraCallback + 19;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return view;
    }

    public final ImageView IAuthTabCallback() {
        int i = 2 % 2;
        ImageView imageView = this.onWarmupCompleted;
        if (imageView == null) {
            int i2 = extraCallback + 109;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 == 0) {
                obj.hashCode();
                throw null;
            }
            imageView = null;
        }
        int i4 = readTypedObject + 55;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return imageView;
    }

    public final View onExtraCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 117;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        View view = this.IAuthTabCallbackStub;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = extraCallback + 123;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    public static /* synthetic */ void onExtraCallback(ScannerViewFinder scannerViewFinder) throws Throwable {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1813752810, iOnExtraCallback, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{scannerViewFinder}, -1813752810, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    private static final void IAuthTabCallback(ScannerViewFinder scannerViewFinder, View view) throws Throwable {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 654827262, iOnExtraCallback, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{scannerViewFinder, view}, -654827261, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    public final View onWarmupCompleted() {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (View) onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 539080953, iOnExtraCallback, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this}, -539080951, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    static void asInterface() {
        access100 = -210912448;
        getInterfaceDescriptor = -1538795415;
        extraCallbackWithResult = 255359188;
        writeTypedObject = new byte[]{-59, 50, -124, -104, 74, 50, -108, -125, 58, -123, Byte.MIN_VALUE, 74, 76, -115, 88, 112, 50, -104, 53, 50, -124, 54, -104, 88, 112, -124, 74, 55, 74, 79, -62, 54, -9, 53, -102, -116, 53, 73, Byte.MIN_VALUE, 52, 55, -113, -104, 73, 50, -121};
    }
}
