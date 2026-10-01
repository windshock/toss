package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.devtool.action.quickaction.QuickActionBottomSheetActivity$IAuthTabCallbackStub;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import o.getBooleanFromAdObject;

/* loaded from: classes.dex */
public final class AppNode13 extends getEngineProxy {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1014962606;
    private static short[] asBinder = {22496, 10235, -10237, -10233, 10218, -10234, -10219, 10187, -10216, -10240, 10224, -10235, 10237, 10216, -10220, -10230, 10219, -10235, 10201, 22508, -10191, 10185, 10189, -10208, 10188, 10207, -10207, 10196, -10200, 10186, -10182, 10191, -10185, 10178, 22483, 144, -13678, 6899, -2213, -10713, 22495, 8667, 22499, 10201, -10199, 10204, -10204, -10191, 10191, 10192, 10206, -10189, 10207, 10188, -10222, 10224, -10208, -10189, -10188, 10180, 10195, -10190, 10204, -10240, 22497, 10141, -10139, -10143, 10124, -10144, -10125, 10125, -10120, 10116, -10138, 10134, -10141, 10139, -10130, -10134, 10133, 10143, 10124, -10133, 22486, 13649, -6864, 2200, 10724, -6800, 24995, -10243, 10252};
    private static int onExtraCallback = -1977834551;
    private static int onExtraCallbackWithResult = -1538807773;
    private static byte[] onWarmupCompleted;

    public AppNode13() {
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getPressedStateDuration() >> 16), (byte) (Color.blue(0) - 16), (-777747392) + TextUtils.indexOf((CharSequence) "", '0'), 1741110942 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getFadingEdgeLength() >> 16) - 28716, objArr);
        List listListOf = CollectionsKt.listOf(((String) objArr[0]).intern());
        getAppVersion getappversion = getAppVersion.SCHEME;
        getAppContext getappcontext = getAppContext.ANYONE;
        AnonymousClass1 anonymousClass1 = new getAppType() { // from class: o.AppNode13.1
            static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(AnonymousClass1.class);

            static {
                if ((((onWarmupCompleted ^ BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(283)) >> 26) & 1) != 0) {
                    throw null;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
            
                if ((((((r5 ^ r0) | r1) & (~r1)) >> 31) & 1) == 0) goto L12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
            
                return r4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
            
                r4 = null;
                r4.hashCode();
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
            
                r4 = kotlin.Unit.INSTANCE;
                o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(283);
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
            
                return r4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
            
                if (r4 == o.access14300.onWarmupCompleted()) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
            
                if (r4 == o.access14300.onWarmupCompleted()) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
            
                r5 = o.AppNode13.AnonymousClass1.onWarmupCompleted;
                r0 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(503);
                r1 = r5 & r0;
             */
            @Override // o.getAppType
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object onNavigationEvent(o.getMsgHandler r4, o.access13800<? super kotlin.Unit> r5) {
                /*
                    r3 = this;
                    r0 = 2
                    int r0 = r0 % r0
                    o.AppNode611 r0 = new o.AppNode611
                    r0.<init>()
                    java.lang.Object r4 = r0.onExtraCallback(r4, r5)
                    int r5 = o.AppNode13.AnonymousClass1.onWarmupCompleted
                    r0 = 5391(0x150f, float:7.554E-42)
                    int r0 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r0)
                    int r1 = ~r0
                    r1 = r1 & r5
                    int r5 = ~r5
                    r5 = r5 & r0
                    r0 = r1 ^ r5
                    r5 = r5 & r1
                    r5 = r5 | r0
                    int r5 = r5 >> 7
                    r5 = r5 & 1
                    if (r5 != 0) goto L2a
                    java.lang.Object r5 = o.access14300.onWarmupCompleted()
                    r0 = 0
                    int r0 = r0 / r0
                    if (r4 != r5) goto L4a
                    goto L30
                L2a:
                    java.lang.Object r5 = o.access14300.onWarmupCompleted()
                    if (r4 != r5) goto L4a
                L30:
                    int r5 = o.AppNode13.AnonymousClass1.onWarmupCompleted
                    r0 = 503(0x1f7, float:7.05E-43)
                    int r0 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r0)
                    r1 = r5 & r0
                    int r2 = ~r1
                    r5 = r5 ^ r0
                    r5 = r5 | r1
                    r5 = r5 & r2
                    int r5 = r5 >> 31
                    r5 = r5 & 1
                    if (r5 == 0) goto L45
                    return r4
                L45:
                    r4 = 0
                    r4.hashCode()
                    throw r4
                L4a:
                    kotlin.Unit r4 = kotlin.Unit.INSTANCE
                    r5 = 283(0x11b, float:3.97E-43)
                    o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r5)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: o.AppNode13.AnonymousClass1.onNavigationEvent(o.getMsgHandler, o.access13800):java.lang.Object");
            }
        };
        Object[] objArr2 = new Object[1];
        a((short) TextUtils.getOffsetAfter("", 0), (byte) (Color.rgb(0, 0, 0) + 16777274), Color.blue(0) - 777747374, View.MeasureSpec.makeMeasureSpec(0, 0) + 1741110957, ((Process.getThreadPriority(0) + 20) >> 6) - 28716, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a((short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 63), (-777747360) - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getTouchSlop() >> 8) + 1741160702, Color.rgb(0, 0, 0) + 16748500, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a((short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 113), (-777747353) - TextUtils.getOffsetBefore("", 0), TextUtils.getTrimmedLength("") + 1741166231, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 28717, objArr4);
        getExtensionManager getextensionmanager = new getExtensionManager(strIntern, listListOf, strIntern2, null, ((String) objArr4[0]).intern(), getappversion, getappcontext, anonymousClass1);
        Object[] objArr5 = new Object[1];
        a((short) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (byte) (41 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (-794524567) - Color.rgb(0, 0, 0), 1741110942 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-28717) - ((byte) KeyEvent.getModifierMetaStateMask()), objArr5);
        List listListOf2 = CollectionsKt.listOf(((String) objArr5[0]).intern());
        AnonymousClass5 anonymousClass5 = new getAppType() { // from class: o.AppNode13.5
            static int IAuthTabCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(AnonymousClass5.class);

            static {
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2462);
            }

            @Override // o.getAppType
            public final Object onNavigationEvent(getMsgHandler getmsghandler, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                Object objOnExtraCallback = new onNetworkChanged().onExtraCallback(getmsghandler, access13800Var);
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(949);
                if (objOnExtraCallback == access14300.onWarmupCompleted()) {
                    BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3684);
                    BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4780);
                    return objOnExtraCallback;
                }
                Unit unit = Unit.INSTANCE;
                int i2 = IAuthTabCallback;
                int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(13);
                int i3 = (~iOnWarmupCompleted) & i2;
                int i4 = (~i2) & iOnWarmupCompleted;
                if (((((i4 & i3) | (i3 ^ i4)) >> 21) & 1) != 0) {
                    int i5 = 42 / 0;
                }
                return unit;
            }
        };
        Object[] objArr6 = new Object[1];
        a((short) Color.red(0), (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 106), (-777747329) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1741110950 - View.MeasureSpec.getMode(0), (-28716) - View.getDefaultSize(0, 0), objArr6);
        String strIntern3 = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        a((short) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (byte) ((Process.myPid() >> 22) - 4), (-777747309) - View.resolveSize(0, 0), 1741158434 - TextUtils.indexOf("", "", 0, 0), (-28716) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr7);
        String strIntern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        a((short) (ViewConfiguration.getEdgeSlop() >> 16), (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) - 112), (-777747353) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1741166231, (-28716) - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr8);
        super(CollectionsKt.listOf(new getExtensionManager[]{getextensionmanager, new getExtensionManager(strIntern3, listListOf2, strIntern4, null, ((String) objArr8[0]).intern(), getappversion, getappcontext, anonymousClass5)}));
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) {
        boolean z;
        int i4 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        int iO = getBooleanFromAdObject.onWarmupCompleted.o(i3, onExtraCallbackWithResult);
        int i5 = iO == -1 ? 1 : 0;
        if (i5 != 0) {
            byte[] bArr = onWarmupCompleted;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i6 = 0; i6 < length; i6++) {
                    bArr2[i6] = LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.s(bArr[i6]);
                }
                bArr = bArr2;
            }
            iO = bArr != null ? (byte) (((byte) (onWarmupCompleted[getBooleanFromAdObject.onWarmupCompleted.o(i, onExtraCallback)] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))) : (short) (((short) (asBinder[((int) (onExtraCallback ^ (-4629411779493505016L))) + i] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
        }
        if (iO > 0) {
            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iO) - 2) + ((int) (onExtraCallback ^ (-4629411779493505016L))) + i5;
            ((StringBuilder) QuickActionBottomSheetActivity$IAuthTabCallbackStub.r(trackSelectionParametersExternalSyntheticLambda0, i2, IAuthTabCallback, sb)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
            trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
            byte[] bArr3 = onWarmupCompleted;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i7 = 0; i7 < length2; i7++) {
                    int i8 = $11 + 47;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    bArr4[i7] = (byte) (bArr3[i7] ^ (-4629411779493505016L));
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                int i10 = $11 + 65;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                z = true;
            } else {
                z = false;
            }
            trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
            while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iO) {
                int i12 = $11 + 37;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                if (z) {
                    byte[] bArr5 = onWarmupCompleted;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr5[r10] ^ (-4629411779493505016L))) + s)) ^ b));
                    int i14 = $10 + 105;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                } else {
                    short[] sArr = asBinder;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r10] ^ (-4629411779493505016L))) + s)) ^ b));
                }
                sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
            }
        }
        objArr[0] = sb.toString();
    }
}
