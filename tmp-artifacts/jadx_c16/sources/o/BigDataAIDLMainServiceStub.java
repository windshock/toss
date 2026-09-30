package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.Fragment;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BigDataAIDLMainServiceStub implements ExtHubPage {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 1;
    private static char IAuthTabCallbackStub = 22915;
    private static char asBinder = 20852;
    private static int asInterface = 0;
    private static char onExtraCallbackWithResult = 64085;
    private static char onTransact = 7870;
    private final MySubscribeProxySubscriptionsSetting IAuthTabCallback;
    private final getInternalContentView onExtraCallback;
    private final RVTabbarLayout onNavigationEvent;
    private final onRenderInit onWarmupCompleted;

    public BigDataAIDLMainServiceStub(@NotNull RVTabbarLayout rVTabbarLayout, @NotNull MySubscribeProxySubscriptionsSetting mySubscribeProxySubscriptionsSetting, @NotNull onRenderInit onrenderinit, @NotNull getInternalContentView getinternalcontentview) {
        Intrinsics.checkNotNullParameter(rVTabbarLayout, "");
        Intrinsics.checkNotNullParameter(mySubscribeProxySubscriptionsSetting, "");
        Intrinsics.checkNotNullParameter(onrenderinit, "");
        Intrinsics.checkNotNullParameter(getinternalcontentview, "");
        this.onNavigationEvent = rVTabbarLayout;
        this.IAuthTabCallback = mySubscribeProxySubscriptionsSetting;
        this.onWarmupCompleted = onrenderinit;
        this.onExtraCallback = getinternalcontentview;
    }

    @Override // o.ExtHubPage
    public /* bridge */ Fragment onExtraCallback(@NotNull FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, @NotNull String str, @Nullable Bundle bundle, @Nullable Integer num) {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Fragment fragmentOnExtraCallback = super.onExtraCallback(flowMeasureLazyPolicyExternalSyntheticLambda3, str, bundle, num);
        int i4 = asInterface + 47;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return fragmentOnExtraCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r11 == 40) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r11 == 20) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r11 == 106) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        switch(r11) {
            case 100: goto L51;
            case 101: goto L45;
            case 102: goto L41;
            case 103: goto L23;
            case 104: goto L21;
            default: goto L20;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        return onExtraCallback(r10, r9.onWarmupCompleted.onExtraCallback(), r12, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if (r12 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        r2 = r2 + 67;
        o.BigDataAIDLMainServiceStub.IAuthTabCallbackDefault = r2 % 128;
        r2 = r2 % 2;
        r11 = im.toss.features.main.ui.MainTabFragment.Companion.IAuthTabCallback(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (r11 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        r11 = android.net.Uri.EMPTY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        if (r13 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        if (r13.intValue() != 103) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        r12 = o.BigDataAIDLMainServiceStub.asInterface + 47;
        o.BigDataAIDLMainServiceStub.IAuthTabCallbackDefault = r12 % 128;
        r13 = "last_tab";
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        if ((r12 % 2) != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        r12 = 44 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        r13 = "tab";
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0078, code lost:
    
        r2 = new java.lang.Object[1];
        a(new char[]{37197, 47305, 4695, 27523, 30773, 65341, 55273, 60921}, 8 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), r2);
        r13 = o.filterCreatePageParams.IAuthTabCallback(r11, ((java.lang.String) r2[0]).intern(), r13);
        r0 = new android.os.Bundle();
        r12 = new java.lang.Object[1];
        a(new char[]{37197, 47305, 4695, 27523, 30773, 65341, 55273, 60921}, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 8, r12);
        r0.putString(((java.lang.String) r12[0]).intern(), r13);
        r0.putBoolean("from_home_launcher", kotlin.jvm.internal.Intrinsics.areEqual(r11.getQueryParameter("from_home_launcher"), "true"));
        r10 = r10.onMessageChannelReady().instantiate(java.lang.ClassLoader.getSystemClassLoader(), im.toss.features.benefit.ui.GlobalBenefitTabFragment.class.getName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00da, code lost:
    
        if (r10 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dc, code lost:
    
        r10 = r10;
        r10.setArguments(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e1, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e9, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type im.toss.features.benefit.ui.GlobalBenefitTabFragment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ea, code lost:
    
        r10 = onExtraCallback(r10, r9.onExtraCallback.onWarmupCompleted(), r12, r13);
        r11 = o.BigDataAIDLMainServiceStub.asInterface + 17;
        o.BigDataAIDLMainServiceStub.IAuthTabCallbackDefault = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fd, code lost:
    
        if ((r11 % 2) != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ff, code lost:
    
        r11 = 88 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0102, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0103, code lost:
    
        r10 = r10.onMessageChannelReady().instantiate(java.lang.ClassLoader.getSystemClassLoader(), im.toss.global.features.home.features.asset_home.GlobalAssetHomeFragment.class.getName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0115, code lost:
    
        if (r10 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0119, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0121, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type im.toss.global.features.home.features.asset_home.GlobalAssetHomeFragment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0122, code lost:
    
        r7 = new java.lang.Object[]{r10, null, r9.IAuthTabCallback.onNavigationEvent(), 1, null};
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014c, code lost:
    
        return (im.toss.base.BaseFragment) o.onRenderReady.onWarmupCompleted(o.getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -679646364, 679646364, o.getPreRenderJob.onNavigationEvent.IAuthTabCallback(), o.getPreRenderJob.onNavigationEvent.IAuthTabCallback(), r7, o.getPreRenderJob.onNavigationEvent.IAuthTabCallback());
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014d, code lost:
    
        r10 = r10.onMessageChannelReady().instantiate(java.lang.ClassLoader.getSystemClassLoader(), im.toss.features.setting.AppSettingFragment.class.getName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x015f, code lost:
    
        if (r10 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0161, code lost:
    
        r11 = o.BigDataAIDLMainServiceStub.asInterface + 57;
        o.BigDataAIDLMainServiceStub.IAuthTabCallbackDefault = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016a, code lost:
    
        if ((r11 % 2) != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x016c, code lost:
    
        r11 = 69 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0171, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r11 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0174, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x017c, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type im.toss.features.setting.AppSettingFragment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x017d, code lost:
    
        r10 = onExtraCallback(r10, r9.onNavigationEvent.onNavigationEvent(), r12, r13);
        r11 = o.BigDataAIDLMainServiceStub.asInterface + 65;
        o.BigDataAIDLMainServiceStub.IAuthTabCallbackDefault = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0190, code lost:
    
        if ((r11 % 2) != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0192, code lost:
    
        r11 = 10 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0195, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r11 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r1 = o.BigDataAIDLMainServiceStub.IAuthTabCallbackDefault + 27;
        r2 = r1 % 128;
        o.BigDataAIDLMainServiceStub.asInterface = r2;
     */
    @Override // o.ExtHubPage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Fragment onExtraCallbackWithResult(@NotNull FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, int i, @Nullable Bundle bundle, @Nullable Integer num) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 11;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(flowMeasureLazyPolicyExternalSyntheticLambda3, "");
        } else {
            Intrinsics.checkNotNullParameter(flowMeasureLazyPolicyExternalSyntheticLambda3, "");
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $11 + 83;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = $11 + 93;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                int i10 = $11 + 21;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i12 = (c2 + i8) ^ ((c2 << 4) + ((char) (asBinder ^ 1094535280733222934L)));
                int i13 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallbackStub);
                    objArr2[2] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char c3 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                        int packedPositionType = 10 - ExpandableListView.getPackedPositionType(0L);
                        int iIndexOf = TextUtils.indexOf("", "") + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, packedPositionType, iIndexOf, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onTransact)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), KeyEvent.getDeadChar(0, 0) + 10, 12434 - (ViewConfiguration.getEdgeSlop() >> 16), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (Process.myTid() >> 22)), View.combineMeasuredStates(0, 0) + 14, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
