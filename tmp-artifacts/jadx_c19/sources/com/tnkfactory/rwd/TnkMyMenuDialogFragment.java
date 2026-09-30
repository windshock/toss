package com.tnkfactory.rwd;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.tnkfactory.ad.AgreePrivacyPopupListener;
import com.tnkfactory.ad.rwd.AgreePrivacyPopupDialog;
import com.tnkfactory.ad.rwd.Settings;
import com.tnkfactory.ad.rwd.TnkCore;
import com.tnkfactory.ad.rwd.Utils;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraControllerExternalSyntheticLambda0;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageServiceDefault;
import o.IPostMessageService_Parcel;
import o.ITrustedWebActivityCallback;
import o.RenderInTransitionOverlayNodeElement;
import o.TimelineExternalSyntheticLambda1;
import o.onSessionEnded;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkMyMenuDialogFragment extends DialogFragment {
    public static final Companion Companion;
    private static int IAuthTabCallbackStub;
    private static long onExtraCallback;
    private static char[] onWarmupCompleted;
    private WebChromeClient.FileChooserParams fileChooserParams;
    private ValueCallback<Uri[]> filePathCallback;
    private final IEngagementSignalsCallback_Parcel<IPostMessageServiceDefault> intentPhotoPicker;
    private WebView webview;
    private static final byte[] $$a = {1, -9, -86, 35};
    private static final int $$b = 112;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, int i2) {
        int i3;
        byte[] bArr = $$a;
        int i4 = 3 - (s * 4);
        int i5 = 97 - (i2 * 3);
        int i6 = b * 4;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        if (bArr == null) {
            int i8 = i7;
            int i9 = 0;
            i5 += i8;
            i3 = i9;
            bArr2[i3] = (byte) i5;
            i9 = i3 + 1;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            i4++;
            i8 = bArr[i4];
            i5 += i8;
            i3 = i9;
            bArr2[i3] = (byte) i5;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$EijSGPqKHu35N7eUoNJyIjOdo0U(TnkMyMenuDialogFragment tnkMyMenuDialogFragment) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 103;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        appScheme$lambda$2(tnkMyMenuDialogFragment);
        int i5 = IAuthTabCallback + 43;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    /* renamed from: $r8$lambda$IdJmVjwp88h5I0EiupG8W9-8Vao, reason: not valid java name */
    public static /* synthetic */ void m158$r8$lambda$IdJmVjwp88h5I0EiupG8W98Vao(TnkMyMenuDialogFragment tnkMyMenuDialogFragment, String str) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 5;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        appScheme$lambda$1(tnkMyMenuDialogFragment, str);
        int i5 = onNavigationEvent + 47;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 21 / 0;
        }
    }

    public static /* synthetic */ void $r8$lambda$JinYDLS1gaWYgDAQQ2TENBnFhwg(TnkMyMenuDialogFragment tnkMyMenuDialogFragment, String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 19;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        onCreateDialog$lambda$0$0(tnkMyMenuDialogFragment, str);
        int i5 = onNavigationEvent + 39;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void $r8$lambda$WCYQJ6T2kFeaCtlsOUid_rVlV5Q(TnkMyMenuDialogFragment tnkMyMenuDialogFragment, String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 77;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        open_new_window$lambda$0(tnkMyMenuDialogFragment, str);
        int i5 = IAuthTabCallback + 125;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void $r8$lambda$jDZjYn8pDsezLHn38UlFkhn6auc(TnkMyMenuDialogFragment tnkMyMenuDialogFragment, Uri uri) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 105;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        intentPhotoPicker$lambda$0(tnkMyMenuDialogFragment, uri);
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = onNavigationEvent + 9;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: $r8$lambda$mMkhA1Qbqzgw-o2poRmY6QU43vw, reason: not valid java name */
    public static /* synthetic */ boolean m159$r8$lambda$mMkhA1Qbqzgwo2poRmY6QU43vw(TnkMyMenuDialogFragment tnkMyMenuDialogFragment, DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 57;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        boolean zOnCreateDialog$lambda$0 = onCreateDialog$lambda$0(tnkMyMenuDialogFragment, dialogInterface, i2, keyEvent);
        int i6 = onNavigationEvent + 25;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return zOnCreateDialog$lambda$0;
        }
        throw null;
    }

    public static /* synthetic */ WindowInsetsCompat $r8$lambda$oMBH4n3qBIsYGDLspptl02nzeDQ(View view, WindowInsetsCompat windowInsetsCompat) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 19;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        WindowInsetsCompat windowInsetsCompatOnViewCreated$lambda$2 = onViewCreated$lambda$2(view, windowInsetsCompat);
        int i5 = onNavigationEvent + 115;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return windowInsetsCompatOnViewCreated$lambda$2;
        }
        throw null;
    }

    static {
        IAuthTabCallbackStub = 1;
        onNavigationEvent();
        Companion = new Companion(null);
        int i2 = onExtraCallbackWithResult + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    public TnkMyMenuDialogFragment() {
        IEngagementSignalsCallback_Parcel<IPostMessageServiceDefault> iEngagementSignalsCallback_ParcelRegisterForActivityResult = registerForActivityResult(new IPostMessageService_Parcel.onTransact(), new onSessionEnded() { // from class: com.tnkfactory.rwd.TnkMyMenuDialogFragment$$ExternalSyntheticLambda6
            public final void onActivityResult(Object obj) {
                TnkMyMenuDialogFragment.$r8$lambda$jDZjYn8pDsezLHn38UlFkhn6auc(this.f$0, (Uri) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(iEngagementSignalsCallback_ParcelRegisterForActivityResult, "");
        this.intentPhotoPicker = iEngagementSignalsCallback_ParcelRegisterForActivityResult;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TnkMyMenuDialogFragment newInstance() {
            return new TnkMyMenuDialogFragment();
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 3;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        super.onCreate(bundle);
        setStyle(0, R.style.tnk_full_screen_dialog_anim);
        int i5 = onNavigationEvent + 101;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        int i2 = 2 % 2;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(dialogOnCreateDialog, "");
        WebView.setWebContentsDebuggingEnabled(true);
        dialogOnCreateDialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.tnkfactory.rwd.TnkMyMenuDialogFragment$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
                return TnkMyMenuDialogFragment.m159$r8$lambda$mMkhA1Qbqzgwo2poRmY6QU43vw(this.f$0, dialogInterface, i3, keyEvent);
            }
        });
        int i3 = IAuthTabCallback + 49;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 37 / 0;
        }
        return dialogOnCreateDialog;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[PHI: r5
      0x003c: PHI (r5v6 android.webkit.WebView) = (r5v5 android.webkit.WebView), (r5v8 android.webkit.WebView) binds: [B:18:0x003a, B:15:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean onCreateDialog$lambda$0(final TnkMyMenuDialogFragment tnkMyMenuDialogFragment, DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        WebView webView;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 23;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        if (i4 % 2 != 0) {
            if (tnkMyMenuDialogFragment.webview != null) {
                if (i2 != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                int i6 = IAuthTabCallback + 75;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    webView = tnkMyMenuDialogFragment.webview;
                    int i7 = 35 / 0;
                    if (webView != null) {
                        webView.evaluateJavascript("javascript:native_close('aos')", new ValueCallback() { // from class: com.tnkfactory.rwd.TnkMyMenuDialogFragment$$ExternalSyntheticLambda3
                            @Override // android.webkit.ValueCallback
                            public final void onReceiveValue(Object obj) throws Throwable {
                                TnkMyMenuDialogFragment.$r8$lambda$JinYDLS1gaWYgDAQQ2TENBnFhwg(this.f$0, (String) obj);
                            }
                        });
                        int i8 = onNavigationEvent + 17;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                    }
                } else {
                    webView = tnkMyMenuDialogFragment.webview;
                    if (webView != null) {
                    }
                }
                return true;
            }
            int i10 = i5 + 43;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        WebView webView2 = tnkMyMenuDialogFragment.webview;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onCreateDialog$lambda$0$0(TnkMyMenuDialogFragment tnkMyMenuDialogFragment, String str) throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1 - TextUtils.getOffsetBefore("", 0), (char) ((-1) - MotionEvent.axisFromString("")), objArr);
        if (!str.equals(((String) objArr[0]).intern())) {
            int i3 = onNavigationEvent + 93;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            WebView webView = tnkMyMenuDialogFragment.webview;
            if (webView != null) {
                if (!webView.canGoBack()) {
                    tnkMyMenuDialogFragment.dismiss();
                    return;
                }
                int i5 = IAuthTabCallback + 25;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                webView.goBack();
            }
        }
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        LinearLayout linearLayout = new LinearLayout(requireContext());
        linearLayout.setId(View.generateViewId());
        int i3 = IAuthTabCallback + 29;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return linearLayout;
        }
        throw null;
    }

    public final WebView getWebview() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 69;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        WebView webView = this.webview;
        int i6 = i4 + 53;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return webView;
    }

    public final void setWebview(@Nullable WebView webView) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 15;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        this.webview = webView;
        int i6 = i4 + 5;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    private static void a(int i2, int i3, char c, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            int i5 = $11 + 37;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i2 + i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - TextUtils.indexOf("", "", 0, 0)), 17 - View.getDefaultSize(0, 0), 10973 - (ViewConfiguration.getTouchSlop() >> 8), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 46134), ExpandableListView.getPackedPositionGroup(0L) + 31, 20220 - TextUtils.getOffsetAfter("", 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        char c2 = (char) (49123 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        int i7 = 44 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int i8 = 1495 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        byte b = (byte) ($$a[0] - 1);
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, i7, i8, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i9 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(onWarmupCompleted[i2 + i9])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59698 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getPressedStateDuration() >> 16) + 17, Gravity.getAbsoluteGravity(0, 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i9), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46133 - ExpandableListView.getPackedPositionChild(0L)), 31 - TextUtils.indexOf("", "", 0), 20220 - TextUtils.getOffsetBefore("", 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i9] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    char c3 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 49123);
                    int trimmedLength = 44 - TextUtils.getTrimmedLength("");
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 1494;
                    byte b3 = (byte) ($$a[0] - 1);
                    byte b4 = b3;
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, trimmedLength, scrollBarSize, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i10 = $11 + 23;
        $10 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 3 / 4;
        }
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 49124);
                int iRed = 44 - Color.red(0);
                int iIndexOf = 1494 - TextUtils.indexOf("", "", 0);
                byte b5 = (byte) ($$a[0] - 1);
                byte b6 = b5;
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, iRed, iIndexOf, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        try {
            WebView webView = new WebView(requireContext());
            webView.clearCache(true);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setDomStorageEnabled(true);
            webView.getSettings().setTextZoom(100);
            webView.getSettings().setMixedContentMode(0);
            webView.getSettings().setDefaultTextEncodingName("utf-8");
            webView.setFocusableInTouchMode(true);
            webView.setVerticalScrollBarEnabled(false);
            webView.setHorizontalScrollBarEnabled(false);
            webView.setScrollContainer(true);
            webView.setFocusable(true);
            webView.requestFocus();
            webView.addJavascriptInterface(new TnkWebViewBridge(), "TnkWebViewBridge");
            webView.setWebChromeClient(new AdChromeClient());
            webView.setWebViewClient(new AdWebViewClient());
            String webQueryParam = Utils.getWebQueryParam(requireContext());
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(Color.alpha(0) + 4, 63 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) View.MeasureSpec.getMode(0), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(webQueryParam);
            webView.loadUrl(sb.toString());
            ((LinearLayout) view).addView(webView, new FrameLayout.LayoutParams(-1, -1));
            this.webview = webView;
            ViewCompat.onWarmupCompleted(view, new RenderInTransitionOverlayNodeElement() { // from class: com.tnkfactory.rwd.TnkMyMenuDialogFragment$$ExternalSyntheticLambda1
                public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                    return TnkMyMenuDialogFragment.$r8$lambda$oMBH4n3qBIsYGDLspptl02nzeDQ(view2, windowInsetsCompat);
                }
            });
            int i3 = IAuthTabCallback + 23;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception unused) {
            dismiss();
        }
    }

    public final class AdChromeClient extends WebChromeClient {
        public AdChromeClient() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(@Nullable WebView webView, boolean z, boolean z2, @Nullable Message message) {
            Intrinsics.checkNotNull(webView);
            WebView.HitTestResult hitTestResult = webView.getHitTestResult();
            Intrinsics.checkNotNullExpressionValue(hitTestResult, "");
            webView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(hitTestResult.getExtra())));
            return false;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(@Nullable WebView webView, @NotNull ValueCallback<Uri[]> valueCallback, @NotNull WebChromeClient.FileChooserParams fileChooserParams) {
            Intrinsics.checkNotNullParameter(valueCallback, "");
            Intrinsics.checkNotNullParameter(fileChooserParams, "");
            TnkMyMenuDialogFragment.this.photoPicker(valueCallback, fileChooserParams);
            return true;
        }
    }

    public final class AdWebViewClient extends WebViewClient {
        public AdWebViewClient() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@NotNull WebView webView, @Nullable String str) {
            Intrinsics.checkNotNullParameter(webView, "");
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable String str) throws Throwable {
            if (str != null && StringsKt.contains$default(str, "flag=open_new_window", false, 2, (Object) null)) {
                TnkMyMenuDialogFragment.this.open_new_window(str);
                return true;
            }
            Intrinsics.checkNotNull(str);
            if (StringsKt.startsWith$default(str, "tnkscheme://", false, 2, (Object) null)) {
                TnkMyMenuDialogFragment tnkMyMenuDialogFragment = TnkMyMenuDialogFragment.this;
                Uri uri = Uri.parse(str);
                Intrinsics.checkNotNullExpressionValue(uri, "");
                tnkMyMenuDialogFragment.appScheme(uri);
                return true;
            }
            if (StringsKt.startsWith$default(str, "market:", false, 2, (Object) null)) {
                Intent uri2 = Intent.parseUri(str, 1);
                if (uri2 != null) {
                    TnkMyMenuDialogFragment.this.requireContext().startActivity(uri2);
                }
                return true;
            }
            if (StringsKt.startsWith$default(str, "intent:", false, 2, (Object) null)) {
                Intent uri3 = Intent.parseUri(str, 1);
                String str2 = uri3.getPackage();
                if ((str2 != null ? TnkMyMenuDialogFragment.this.requireContext().getPackageManager().getLaunchIntentForPackage(str2) : null) != null) {
                    TnkMyMenuDialogFragment.this.requireContext().startActivity(uri3);
                } else {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse("market://details?id=" + uri3.getPackage()));
                    TnkMyMenuDialogFragment.this.requireContext().startActivity(intent);
                }
                return true;
            }
            if (!StringsKt.startsWith$default(str, "http", false, 2, (Object) null) && StringsKt.contains$default(str, "://", false, 2, (Object) null)) {
                Intent uri4 = Intent.parseUri(str, 1);
                String str3 = uri4.getPackage();
                if ((str3 != null ? TnkMyMenuDialogFragment.this.requireContext().getPackageManager().getLaunchIntentForPackage(str3) : null) != null) {
                    TnkMyMenuDialogFragment.this.requireContext().startActivity(uri4);
                    return true;
                }
                PackageManager packageManager = TnkMyMenuDialogFragment.this.requireContext().getPackageManager();
                Intrinsics.checkNotNullExpressionValue(packageManager, "");
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(Uri.parse(str));
                if (packageManager.queryIntentActivities(intent2, 0).size() > 0) {
                    TnkMyMenuDialogFragment.this.requireContext().startActivity(intent2);
                }
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public final void open_new_window(@NotNull final String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tnkfactory.rwd.TnkMyMenuDialogFragment$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                TnkMyMenuDialogFragment.$r8$lambda$WCYQJ6T2kFeaCtlsOUid_rVlV5Q(this.f$0, str);
            }
        });
        int i3 = onNavigationEvent + 13;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final void open_new_window$lambda$0(TnkMyMenuDialogFragment tnkMyMenuDialogFragment, String str) {
        int i2 = 2 % 2;
        PackageManager packageManager = tnkMyMenuDialogFragment.requireActivity().getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "");
        if (listQueryIntentActivities.size() > 0) {
            int i3 = IAuthTabCallback + 55;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            tnkMyMenuDialogFragment.requireActivity().startActivity(intent);
            if (i4 == 0) {
                throw null;
            }
        }
    }

    private static final void appScheme$lambda$1(TnkMyMenuDialogFragment tnkMyMenuDialogFragment, String str) {
        int i2 = 2 % 2;
        PackageManager packageManager = tnkMyMenuDialogFragment.requireContext().getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "");
        if (listQueryIntentActivities.size() > 0) {
            int i3 = onNavigationEvent + 13;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            tnkMyMenuDialogFragment.requireContext().startActivity(intent);
            if (i4 != 0) {
                int i5 = 85 / 0;
            }
            int i6 = onNavigationEvent + 49;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private static final void appScheme$lambda$2(TnkMyMenuDialogFragment tnkMyMenuDialogFragment) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 57;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        tnkMyMenuDialogFragment.dismiss();
        int i5 = onNavigationEvent + 125;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void appScheme(@NotNull Uri uri) throws Throwable {
        final Context applicationContext;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        Context context = getContext();
        if (context != null) {
            int i3 = onNavigationEvent + 69;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                applicationContext = context.getApplicationContext();
                int i4 = 74 / 0;
                if (applicationContext == null) {
                    return;
                }
            } else {
                applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    return;
                }
            }
            try {
                String host = uri.getHost();
                if (host != null) {
                    int iHashCode = host.hashCode();
                    if (iHashCode == -2061496180) {
                        if (host.equals("close_view")) {
                            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tnkfactory.rwd.TnkMyMenuDialogFragment$$ExternalSyntheticLambda5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    TnkMyMenuDialogFragment.$r8$lambda$EijSGPqKHu35N7eUoNJyIjOdo0U(this.f$0);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    int i5 = onNavigationEvent + 91;
                    int i6 = i5 % 128;
                    IAuthTabCallback = i6;
                    if (i5 % 2 != 0) {
                        throw null;
                    }
                    if (iHashCode == -1564059516) {
                        if (host.equals("open_new_window")) {
                            Object[] objArr = new Object[1];
                            a(1 - (ViewConfiguration.getEdgeSlop() >> 16), 3 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
                            final String queryParameter = uri.getQueryParameter(((String) objArr[0]).intern());
                            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tnkfactory.rwd.TnkMyMenuDialogFragment$$ExternalSyntheticLambda4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    TnkMyMenuDialogFragment.m158$r8$lambda$IdJmVjwp88h5I0EiupG8W98Vao(this.f$0, queryParameter);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    int i7 = i6 + 25;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    if (iHashCode == -1561424053 && host.equals("show_privacy_policy")) {
                        Settings.INSTANCE.setAgreePrivacy(applicationContext, false);
                        dismiss();
                        if (getActivity() == null) {
                            return;
                        }
                        FragmentActivity fragmentActivityRequireActivity = requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                        AgreePrivacyPopupDialog agreePrivacyPopupDialog = new AgreePrivacyPopupDialog(fragmentActivityRequireActivity);
                        agreePrivacyPopupDialog.setAgreePrivacyPopupListener(new AgreePrivacyPopupListener() { // from class: com.tnkfactory.rwd.TnkMyMenuDialogFragment$appScheme$1$1
                            @Override // com.tnkfactory.ad.AgreePrivacyPopupListener
                            public void onCancle() {
                                Context activity = this.this$0.getActivity();
                                if (activity != null) {
                                    Context context2 = applicationContext;
                                    Settings settings = Settings.INSTANCE;
                                    settings.setAgreePrivacy(activity, false);
                                    TnkCore tnkCore = TnkCore.INSTANCE;
                                    tnkCore.getOffRepository().getAdList().clear();
                                    settings.setAgreePrivacy(context2, false);
                                    tnkCore.getOffRepository().getDataChanged().postValue(Boolean.TRUE);
                                }
                            }

                            @Override // com.tnkfactory.ad.AgreePrivacyPopupListener
                            public void onConfirm() {
                                Context activity = this.this$0.getActivity();
                                if (activity != null) {
                                    Settings.INSTANCE.setAgreePrivacy(activity, true);
                                    onConfirm();
                                }
                            }
                        });
                        agreePrivacyPopupDialog.show();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void photoPicker(@NotNull ValueCallback<Uri[]> valueCallback, @NotNull WebChromeClient.FileChooserParams fileChooserParams) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 71;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(valueCallback, "");
        Intrinsics.checkNotNullParameter(fileChooserParams, "");
        this.filePathCallback = valueCallback;
        this.fileChooserParams = fileChooserParams;
        this.intentPhotoPicker.onNavigationEvent(ITrustedWebActivityCallback.onWarmupCompleted(IPostMessageService_Parcel.onTransact.onExtraCallback.onNavigationEvent));
        int i5 = IAuthTabCallback + 17;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public final ValueCallback<Uri[]> getFilePathCallback() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 97;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        ValueCallback<Uri[]> valueCallback = this.filePathCallback;
        int i5 = i3 + 105;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return valueCallback;
    }

    public final void setFilePathCallback(@Nullable ValueCallback<Uri[]> valueCallback) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 51;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        this.filePathCallback = valueCallback;
        int i6 = i4 + 53;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 85 / 0;
        }
    }

    public final WebChromeClient.FileChooserParams getFileChooserParams() {
        WebChromeClient.FileChooserParams fileChooserParams;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 65;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            fileChooserParams = this.fileChooserParams;
            int i5 = 73 / 0;
        } else {
            fileChooserParams = this.fileChooserParams;
        }
        int i6 = i3 + 73;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return fileChooserParams;
    }

    public final void setFileChooserParams(@Nullable WebChromeClient.FileChooserParams fileChooserParams) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 125;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        this.fileChooserParams = fileChooserParams;
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final IEngagementSignalsCallback_Parcel<IPostMessageServiceDefault> getIntentPhotoPicker() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 15;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return this.intentPhotoPicker;
        }
        throw null;
    }

    private static final void intentPhotoPicker$lambda$0(TnkMyMenuDialogFragment tnkMyMenuDialogFragment, Uri uri) {
        int i2 = 2 % 2;
        if (uri != null) {
            int i3 = onNavigationEvent + 91;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            ValueCallback<Uri[]> valueCallback = tnkMyMenuDialogFragment.filePathCallback;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(new Uri[]{uri});
                return;
            }
            return;
        }
        ValueCallback<Uri[]> valueCallback2 = tnkMyMenuDialogFragment.filePathCallback;
        if (valueCallback2 != null) {
            int i5 = onNavigationEvent + 113;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                Uri uri2 = Uri.EMPTY;
                Intrinsics.checkNotNullExpressionValue(uri2, "");
                valueCallback2.onReceiveValue(new Uri[]{uri2});
            } else {
                Uri uri3 = Uri.EMPTY;
                Intrinsics.checkNotNullExpressionValue(uri3, "");
                valueCallback2.onReceiveValue(new Uri[]{uri3});
            }
        }
        int i6 = IAuthTabCallback + 15;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final class TnkWebViewBridge {
        public TnkWebViewBridge() {
        }

        @JavascriptInterface
        public final void share(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", str);
            intent.putExtra("android.intent.extra.TEXT", str2);
            TnkMyMenuDialogFragment.this.startActivity(Intent.createChooser(intent, "공유하기"));
        }

        @JavascriptInterface
        public final void closeWebView() {
            TnkMyMenuDialogFragment.this.dismiss();
        }
    }

    private static final WindowInsetsCompat onViewCreated$lambda$2(View view, WindowInsetsCompat windowInsetsCompat) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 3;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted = windowInsetsCompat.onWarmupCompleted(WindowInsetsCompat.onTransact.asBinder());
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted, "");
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted2 = windowInsetsCompat.onWarmupCompleted(WindowInsetsCompat.onTransact.asInterface());
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted2, "");
        view.setPadding(view.getPaddingLeft(), cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onWarmupCompleted, view.getPaddingRight(), cameraControllerExternalSyntheticLambda0OnWarmupCompleted2.onExtraCallback);
        int i5 = onNavigationEvent + 119;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return windowInsetsCompat;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void onNavigationEvent() {
        onWarmupCompleted = new char[]{60901, 60833, 2372, 9340, 60860, 2370, 9316, 17154, 32303, 38276, 45239, 45013, 51891, 58961, 7543, 14412, 22328, 29376, 27107, 33932, 41877, 57013, 64068, 4477, 3086, 11047, 18070, 32249, 39051, 47019, 54031, 52854, 58626, '%', 16263, 23289, 29153, 27782, 35744, 42845, 49774, 63754, 5238, 13266, 12001, 17802, 24752, 40020, 47934, 54848, 52517, 59595, 2013, 8952, 22991, 29875, 36959, 36714, 43537, 49461, 64714, 7099, 13965, 11683, 18757, 25696, 33614};
        onExtraCallback = 1026981077905180982L;
    }
}
