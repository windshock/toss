package com.tnkfactory.ad.basic;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tnkfactory.ad.R;
import com.xwray.groupie.Item;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkAdListPageControlCps extends Item<setColorSchemeColors> {
    public int a;
    public final int b;
    public final Function1 c;
    public int d;
    public int e;
    private static final byte[] $$a = {13, 38, -109, 117};
    private static final int $$b = 69;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private static char[] onNavigationEvent = {60901};
    private static long IAuthTabCallback = -2759730027102992483L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i2, int i3, byte b) {
        int i4;
        int i5 = 97 - (i2 * 2);
        byte[] bArr = $$a;
        int i6 = b * 3;
        int i7 = i3 + 4;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i8 = i7;
            i5 = i6;
            int i9 = 0;
            i5 += i7;
            i7 = i8;
            i4 = i9;
            int i10 = i7 + 1;
            bArr2[i4] = (byte) i5;
            i9 = i4 + 1;
            if (i4 == i6) {
                return new String(bArr2, 0);
            }
            i8 = i10;
            i7 = bArr[i10];
            i5 += i7;
            i7 = i8;
            i4 = i9;
            int i102 = i7 + 1;
            bArr2[i4] = (byte) i5;
            i9 = i4 + 1;
            if (i4 == i6) {
            }
        } else {
            i4 = 0;
            int i1022 = i7 + 1;
            bArr2[i4] = (byte) i5;
            i9 = i4 + 1;
            if (i4 == i6) {
            }
        }
    }

    public TnkAdListPageControlCps(int i2, int i3, @NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.a = i2;
        this.b = i3;
        this.c = function1;
        this.e = i2 / 6;
    }

    @Override // com.xwray.groupie.Item
    public int getLayout() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 101;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = R.layout.com_tnk_offerwall_curation_control_cps_primary;
        int i6 = onWarmupCompleted + 117;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 16 / 0;
        }
        return i5;
    }

    public final int getMaxCount() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 93;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = this.a;
        int i6 = i4 + 91;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int getMaxPageNum() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 109;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = this.e;
        int i6 = i3 + 105;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 13 / 0;
        }
        return i5;
    }

    public final int getNowPageNum() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 37;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        int i6 = this.d;
        int i7 = i4 + 9;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final Function1<Integer, Unit> getOnClickView() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 119;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return this.c;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getType() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 73;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return this.b;
        }
        throw null;
    }

    public final void setMaxCount(int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback;
        int i5 = i4 + 67;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        this.a = i2;
        if (i6 == 0) {
            int i7 = 95 / 0;
        }
        int i8 = i4 + 63;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    public final void setMaxPageNum(int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 81;
        int i5 = i4 % 128;
        onWarmupCompleted = i5;
        int i6 = i4 % 2;
        this.e = i2;
        int i7 = i5 + 125;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 44 / 0;
        }
    }

    public final void setNowPageNum(int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 59;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        this.d = i2;
        if (i5 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void a(TnkAdListPageControlCps tnkAdListPageControlCps, TextView textView, TextView textView2, View view) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 29;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        tnkAdListPageControlCps.c.invoke(-1);
        if (textView != null) {
            int i5 = tnkAdListPageControlCps.d;
            StringBuilder sb = new StringBuilder();
            sb.append(i5 + 1);
            textView.setText(sb.toString());
        }
        if (textView2 != null) {
            textView2.setText(" / " + tnkAdListPageControlCps.e);
            int i6 = onExtraCallback + 59;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public static final void b(TnkAdListPageControlCps tnkAdListPageControlCps, TextView textView, TextView textView2, View view) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 1;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        tnkAdListPageControlCps.c.invoke(1);
        if (textView != null) {
            int i5 = tnkAdListPageControlCps.d;
            StringBuilder sb = new StringBuilder();
            sb.append(i5 + 1);
            textView.setText(sb.toString());
        }
        if (textView2 != null) {
            textView2.setText(" / " + tnkAdListPageControlCps.e);
            int i6 = onExtraCallback + 9;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    @Override // com.xwray.groupie.Item
    public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) throws Throwable {
        final TextView textView;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        View viewFindViewById = ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent.findViewById(R.id.com_tnk_offerwall_curation_control_cps_primary);
        if (this.b == 0) {
            viewFindViewById.setBackgroundColor(viewFindViewById.getContext().getResources().getColor(R.color.tnk_color_background));
        } else {
            viewFindViewById.setBackgroundColor(viewFindViewById.getContext().getResources().getColor(R.color.tnk_color_background_secondary));
        }
        View viewFindViewById2 = ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent.findViewById(R.id.tnk_tv_page_position_idx);
        if (viewFindViewById2 instanceof TextView) {
            int i4 = onWarmupCompleted + 123;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            textView = (TextView) viewFindViewById2;
        } else {
            textView = null;
        }
        View viewFindViewById3 = ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent.findViewById(R.id.tnk_tv_page_position_size);
        final TextView textView2 = viewFindViewById3 instanceof TextView ? (TextView) viewFindViewById3 : null;
        View viewFindViewById4 = ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent.findViewById(R.id.com_tnk_off_page_control_left);
        if (viewFindViewById4 == null) {
            int i6 = onWarmupCompleted + 65;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            viewFindViewById4 = null;
        }
        View viewFindViewById5 = ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent.findViewById(R.id.com_tnk_off_page_control_right);
        if (viewFindViewById5 == null) {
            viewFindViewById5 = null;
        }
        if (textView != null) {
            int i7 = onExtraCallback + 115;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            Object[] objArr = new Object[1];
            f(1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1 - (Process.myTid() >> 22), (char) View.combineMeasuredStates(0, 0), objArr);
            textView.setText(((String) objArr[0]).intern());
        }
        if (textView2 != null) {
            textView2.setText(" / " + this.e);
            int i9 = onWarmupCompleted + 97;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
        }
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkAdListPageControlCps$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TnkAdListPageControlCps.a(this.f$0, textView, textView2, view);
                }
            });
            int i11 = onWarmupCompleted + 51;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
        }
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkAdListPageControlCps$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TnkAdListPageControlCps.b(this.f$0, textView, textView2, view);
                }
            });
        }
        int i13 = onWarmupCompleted + 99;
        onExtraCallback = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    private static void f(int i2, int i3, char c, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            int i5 = $11 + 49;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i2 + i7])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 59697), 17 - TextUtils.indexOf("", "", 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10972, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 46135), 31 - (Process.myPid() >> 22), View.getDefaultSize(0, 0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0, 0) + 49123), (ViewConfiguration.getPressedStateDuration() >> 16) + 44, 1494 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1657859959, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            int i8 = $10 + 113;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = (byte) (b3 - 1);
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 49123), KeyEvent.normalizeMetaState(0) + 44, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1495, -1657859959, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }
}
