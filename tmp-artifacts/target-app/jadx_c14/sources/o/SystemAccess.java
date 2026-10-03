package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.R;
import im.toss.tds.view.component.atom.text.SubTypography11;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.RecomposerawaitIdle2;
import o.SystemAccess;
import o.toRealPath;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SystemAccess extends enableNativeCSSParsing {
    private final destroyKey ICustomTabsCallback;
    private static final byte[] $$a = {79, 23, 89, 11};
    private static final int $$b = 100;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onPostMessage = 0;
    private static int onMessageChannelReady = 1;
    private static char[] writeTypedObject = {60860, 37080, 5968, 38348, 6215, 40630, 7467, 33715, 1639, 33944, 2821, 35208, 3101, 45743, 12650, 47016, 14907, 47455, 16343, 41490, 8413, 42849, 9643, 43125, 12023, 44291, 21386, 54799, 21723, 56124, 22954, 56379, 17147, 49560, 17500, 51859, 18781, 53231, 29291, 61682, 30521, 62863, 30731, 65164, 32013, 58337, 26160, 58553, 27436, 61016, 27785, 4945, 37339, 5218, 39659, 6450, 40932, 514, 32899};
    private static long extraCallback = 3147866991740424364L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, byte r8) {
        /*
            int r7 = r7 * 3
            int r0 = r7 + 1
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r1 = o.SystemAccess.$$a
            int r8 = r8 * 4
            int r8 = r8 + 97
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2a
        L17:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L26:
            int r3 = r3 + 1
            r4 = r1[r8]
        L2a:
            int r6 = r6 + r4
            int r8 = r8 + 1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SystemAccess.$$c(int, int, byte):java.lang.String");
    }

    public static /* synthetic */ void onExtraCallbackWithResult(enableInteropViewManagerClassLookUpOptimizationIOS enableinteropviewmanagerclasslookupoptimizationios, View view) {
        int i = 2 % 2;
        int i2 = onPostMessage + 87;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(enableinteropviewmanagerclasslookupoptimizationios, view);
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemAccess(@NotNull ViewGroup viewGroup, @NotNull destroyKey destroykey) {
        super(destroykey);
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(destroykey, "");
        this.ICustomTabsCallback = destroykey;
        destroykey.IAuthTabCallback.setGravity(16);
        destroykey.IAuthTabCallback.setBackground(null);
        SubTypography11 subTypography11 = destroykey.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(subTypography11, "");
        Intrinsics.checkNotNullExpressionValue(((RecyclerView.ViewHolder) this).onNavigationEvent.getResources().getDisplayMetrics(), "");
        patch.onExtraCallbackWithResult(subTypography11, varyMatches.onNavigationEvent(4, r4));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SystemAccess(ViewGroup viewGroup, destroyKey destroykey, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = onPostMessage + 19;
            onMessageChannelReady = i2 % 128;
            int i3 = i2 % 2;
            ViewDataBinding viewDataBindingOnWarmupCompleted = ContextMenuAreaKtExternalSyntheticLambda0.onWarmupCompleted(LayoutInflater.from(viewGroup.getContext()), toRealPath.onNavigationEvent.HEADER.getLayoutResId(), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewDataBindingOnWarmupCompleted, "");
            destroykey = (destroyKey) viewDataBindingOnWarmupCompleted;
            int i4 = 2 % 2;
        }
        this(viewGroup, destroykey);
    }

    public static final /* synthetic */ destroyKey onNavigationEvent(SystemAccess systemAccess) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 77;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        destroyKey destroykey = systemAccess.ICustomTabsCallback;
        if (i3 == 0) {
            return destroykey;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onNavigationEvent implements SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda0<View> {
        private final View onExtraCallbackWithResult;

        onNavigationEvent() {
            SubTypography11 subTypography11 = SystemAccess.onNavigationEvent(SystemAccess.this).IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(subTypography11, "");
            this.onExtraCallbackWithResult = subTypography11;
        }

        public /* bridge */ void IAuthTabCallback(CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7) {
            super/*o.ReusableRememberObserverHolder*/.IAuthTabCallback(carouselKtExternalSyntheticLambda7);
        }

        public /* bridge */ void onWarmupCompleted(CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7) {
            super/*o.ReusableRememberObserverHolder*/.onWarmupCompleted(carouselKtExternalSyntheticLambda7);
        }

        public View onExtraCallbackWithResult() {
            return this.onExtraCallbackWithResult;
        }

        public void onExtraCallbackWithResult(CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7) {
            Intrinsics.checkNotNullParameter(carouselKtExternalSyntheticLambda7, "");
            Resources resources = onExtraCallbackWithResult().getContext().getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Drawable drawableOnWarmupCompleted = CarouselPagerStateExternalSyntheticLambda1.onWarmupCompleted(carouselKtExternalSyntheticLambda7, resources);
            SystemAccess systemAccess = SystemAccess.this;
            DisplayMetrics displayMetrics = ((RecyclerView.ViewHolder) systemAccess).onNavigationEvent.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            int iOnNavigationEvent = varyMatches.onNavigationEvent(28, displayMetrics);
            DisplayMetrics displayMetrics2 = ((RecyclerView.ViewHolder) systemAccess).onNavigationEvent.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            drawableOnWarmupCompleted.setBounds(0, 0, iOnNavigationEvent, varyMatches.onNavigationEvent(28, displayMetrics2));
            drawableOnWarmupCompleted.setTint(((RecyclerView.ViewHolder) systemAccess).onNavigationEvent.getContext().getColor(R.color.light_theme_grey_500));
            SubTypography11 subTypography11 = SystemAccess.onNavigationEvent(SystemAccess.this).IAuthTabCallback;
            DisplayMetrics displayMetrics3 = ((RecyclerView.ViewHolder) SystemAccess.this).onNavigationEvent.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
            subTypography11.setCompoundDrawablePadding(varyMatches.onNavigationEvent(4, displayMetrics3));
            SystemAccess.onNavigationEvent(SystemAccess.this).IAuthTabCallback.setCompoundDrawables((Drawable) null, (Drawable) null, drawableOnWarmupCompleted, (Drawable) null);
        }
    }

    public void onExtraCallback(@Nullable final enableInteropViewManagerClassLookUpOptimizationIOS enableinteropviewmanagerclasslookupoptimizationios) throws Throwable {
        CERT_DecryptPrikey cERT_DecryptPrikey;
        int i = 2 % 2;
        super.onExtraCallback(enableinteropviewmanagerclasslookupoptimizationios);
        if (!(!(enableinteropviewmanagerclasslookupoptimizationios instanceof CERT_DecryptPrikey))) {
            int i2 = onPostMessage + 53;
            onMessageChannelReady = i2 % 128;
            int i3 = i2 % 2;
            cERT_DecryptPrikey = (CERT_DecryptPrikey) enableinteropviewmanagerclasslookupoptimizationios;
        } else {
            cERT_DecryptPrikey = null;
        }
        if (cERT_DecryptPrikey != null) {
            int i4 = onMessageChannelReady + 5;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
            if (cERT_DecryptPrikey.onTransact() != null) {
                onNavigationEvent onnavigationevent = new onNavigationEvent();
                Context context = ((RecyclerView.ViewHolder) this).onNavigationEvent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult = CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context);
                Context context2 = ((RecyclerView.ViewHolder) this).onNavigationEvent.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                RecomposerawaitIdle2.onNavigationEvent onnavigationevent2 = new RecomposerawaitIdle2.onNavigationEvent(context2);
                Object[] objArr = new Object[1];
                a(Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 59, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
                RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = onnavigationevent2.onExtraCallback(((String) objArr[0]).intern());
                DisplayMetrics displayMetrics = ((RecyclerView.ViewHolder) this).onNavigationEvent.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                int iOnNavigationEvent = varyMatches.onNavigationEvent(28, displayMetrics);
                DisplayMetrics displayMetrics2 = ((RecyclerView.ViewHolder) this).onNavigationEvent.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult.onWarmupCompleted(onnavigationeventOnExtraCallback.onExtraCallback(iOnNavigationEvent, varyMatches.onNavigationEvent(28, displayMetrics2)).IAuthTabCallback(onnavigationevent).onExtraCallbackWithResult());
                int i6 = onPostMessage + 39;
                onMessageChannelReady = i6 % 128;
                int i7 = i6 % 2;
            } else {
                this.ICustomTabsCallback.IAuthTabCallback.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            if (((CERT_DecryptPrikey) enableinteropviewmanagerclasslookupoptimizationios).asInterface()) {
                this.ICustomTabsCallback.IAuthTabCallback.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.account.detail.viewholder.TransactionHeaderViewHolder$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SystemAccess.onExtraCallbackWithResult(enableinteropviewmanagerclasslookupoptimizationios, view);
                    }
                });
            }
        }
    }

    private static final void onExtraCallback(enableInteropViewManagerClassLookUpOptimizationIOS enableinteropviewmanagerclasslookupoptimizationios, View view) {
        int i = 2 % 2;
        int i2 = onPostMessage + 61;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        ((CERT_DecryptPrikey) enableinteropviewmanagerclasslookupoptimizationios).IAuthTabCallbackStubProxy();
        int i4 = onMessageChannelReady + 101;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $11 + 111;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(writeTypedObject[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 59697), (ViewConfiguration.getFadingEdgeLength() >> 16) + 17, 10973 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(extraCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46135 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), Color.alpha(0) + 31, 20220 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 49124), TextUtils.indexOf("", "", 0) + 44, 1495 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i7 = $11 + 105;
                $10 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode("", 0, 0) + 49123), 43 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1493, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i9 = $11 + 73;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str;
    }
}
