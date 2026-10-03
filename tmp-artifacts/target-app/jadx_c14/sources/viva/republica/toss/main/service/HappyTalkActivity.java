package viva.republica.toss.main.service;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConstraintsSizeResolverExternalSyntheticLambda0;
import o.IPostMessageServiceStubProxy;
import o.SessionTrackerb;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TrackGroupExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class HappyTalkActivity extends Hilt_HappyTalkActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static int IAuthTabCallbackDefault = 0;
    private static char[] IAuthTabCallbackStub = null;
    private static int IAuthTabCallback_Parcel = 1;
    private static int asBinder = 1;
    public static final int asInterface;
    private static int onTransact;

    @Inject
    public SessionTrackerb tossRouter;

    @Inject
    public ConstraintsSizeResolverExternalSyntheticLambda0 unique;

    static {
        IAuthTabCallback();
        Companion = new onNavigationEvent(null);
        asInterface = 8;
        int i = asBinder + 87;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return -1L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean postMessage() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 123;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 87;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 20 / 0;
        }
        return false;
    }

    public final SessionTrackerb onNavigationEvent() {
        int i = 2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        Object obj = null;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i2 = IAuthTabCallbackDefault + 49;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = IAuthTabCallbackDefault + 79;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return sessionTrackerb;
        }
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.main.service.Hilt_HappyTalkActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 41;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_happy_talk);
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.onNavigationEvent(true);
        }
        setEngagementSignalsCallback();
        int i4 = IAuthTabCallback_Parcel + 31;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05ac  */
    /* JADX WARN: Type inference failed for: r1v100 */
    /* JADX WARN: Type inference failed for: r1v101 */
    /* JADX WARN: Type inference failed for: r1v106, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v111, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v116, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v121, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v126, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v131, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v136, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v141, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v146, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v148, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r1v150, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r1v151, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r1v152, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r1v153, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r1v154, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r1v155, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r1v156 */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v160, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v52, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v62, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v67, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v72, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v74, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r1v76, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r1v77, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r1v78, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r1v79, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r1v80, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r1v81, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r1v83, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v93, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v94 */
    /* JADX WARN: Type inference failed for: r1v95 */
    /* JADX WARN: Type inference failed for: r27v0, types: [android.app.Activity, im.toss.base.BaseActivity, viva.republica.toss.main.service.HappyTalkActivity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setEngagementSignalsCallback() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3159
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.service.HappyTalkActivity.setEngagementSignalsCallback():void");
    }

    public static final class onNavigationEvent {
        private static final byte[] $$a = {111, -17, 11, -125};
        private static final int $$b = 197;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private static int onNavigationEvent = 478308882;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(short r6, byte r7, short r8) {
            /*
                byte[] r0 = viva.republica.toss.main.service.HappyTalkActivity.onNavigationEvent.$$a
                int r7 = r7 * 3
                int r7 = r7 + 1
                int r8 = r8 * 3
                int r8 = r8 + 4
                int r6 = r6 * 3
                int r6 = r6 + 105
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r7
                r4 = r2
                goto L26
            L16:
                r3 = r2
            L17:
                int r4 = r3 + 1
                byte r5 = (byte) r6
                r1[r3] = r5
                if (r4 != r7) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L24:
                r3 = r0[r8]
            L26:
                int r3 = -r3
                int r6 = r6 + r3
                int r8 = r8 + 1
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.service.HappyTalkActivity.onNavigationEvent.$$c(short, byte, short):java.lang.String");
        }

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public static /* synthetic */ Intent onExtraCallbackWithResult(onNavigationEvent onnavigationevent, Context context, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 5;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 2) != 0) {
                int i6 = i3 + 13;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                str = null;
            }
            return onnavigationevent.onExtraCallback(context, str);
        }

        public final Intent onExtraCallback(@NotNull Context context, @Nullable String str) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) HappyTalkActivity.class);
            Object[] objArr = new Object[1];
            a(3 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2, new char[]{65531, 1, 4}, true, TextUtils.indexOf((CharSequence) "", '0') + 173, objArr);
            Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), str);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            int i2 = IAuthTabCallback + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return intentPutExtra;
        }

        private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
            int i4;
            int i5 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr2 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (true) {
                i4 = 2083011369;
                if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                    break;
                }
                int i6 = $10 + 15;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 35125), KeyEvent.getDeadChar(0, 0) + 23, (ViewConfiguration.getFadingEdgeLength() >> 16) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - KeyEvent.keyCodeFromString("")), 55 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i9 = $11 + 65;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            if (i2 > 0) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            }
            if (z) {
                char[] cArr4 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    try {
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16790059), TextUtils.getCapsMode("", 0, 0) + 55, 2167 - Color.blue(0), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        i4 = 2083011369;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                cArr2 = cArr4;
            }
            String str = new String(cArr2);
            int i11 = $11 + 49;
            $10 = i11 % 128;
            if (i11 % 2 == 0) {
                objArr[0] = str;
            } else {
                int i12 = 92 / 0;
                objArr[0] = str;
            }
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        char c;
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = IAuthTabCallbackStub;
        if (cArr2 != null) {
            int i7 = $11 + 37;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 9;
                $10 = i10 % 128;
                if (i10 % i != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 35 - (ViewConfiguration.getScrollBarSize() >> 8), 14239 - (ViewConfiguration.getLongPressTimeout() >> 16), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr3[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i9])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35282 - TextUtils.lastIndexOf("", '0', 0, 0)), TextUtils.getOffsetAfter("", 0) + 35, TextUtils.getOffsetAfter("", 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                }
                i9++;
                i = 2;
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            int i11 = $10 + 35;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
                c = 1;
            } else {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10935), 65 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getJumpTapTimeout() >> 16) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), 29 - TextUtils.getOffsetBefore("", 0), 17658 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i13] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 49468), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 69, 12486 - View.MeasureSpec.getMode(0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr4 = cArr;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr4, 0, cArr5, 0, i4);
            int i14 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr4, i14, i6);
            System.arraycopy(cArr5, i6, cArr4, 0, i14);
        }
        if (z) {
            int i15 = $10 + 95;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr4 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    @Override // viva.republica.toss.main.service.Hilt_HappyTalkActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
    }

    @Override // viva.republica.toss.main.service.Hilt_HappyTalkActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 119;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = IAuthTabCallbackDefault + 65;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
    }

    @Override // viva.republica.toss.main.service.Hilt_HappyTalkActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 65;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = IAuthTabCallbackDefault + 31;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.main.service.Hilt_HappyTalkActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 47;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            int i4 = 10 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 49;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    static void IAuthTabCallback() {
        IAuthTabCallbackStub = new char[]{27149, 27339, 27343, 27194, 27470, 27477, 27473, 27464, 27314, 27459, 27484, 27319, 27285, 27310, 27468, 27473, 27475, 27475, 27473, 27481, 27480, 27472, 27502, 27255, 27170, 27173, 27194, 27169, 27176, 27178, 27170, 27199, 27199, 27197, 27160, 27258, 27233, 27143, 27170, 27194, 27197, 27199, 27168, 27175, 27173, 27137, 27166, 27170, 27173, 27194, 27169, 27176, 27178, 27143, 27142, 27178, 27175, 27199, 27170, 27173, 27166, 27142, 27172, 27171, 27176, 27179, 27176, 27140, 27141, 27176, 27174, 27168, 27172, 27178, 27170, 27169};
    }
}
