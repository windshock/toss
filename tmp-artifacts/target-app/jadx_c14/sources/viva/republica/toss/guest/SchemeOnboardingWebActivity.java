package viva.republica.toss.guest;

import android.app.Activity;
import android.content.Context;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CMS_DecEnvelopedDataWithEncryptKey2;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;
import o.FlowRowOverflowCompanionExternalSyntheticLambda4;
import o.RotationProvider1;
import o.SessionTrackerb;
import o.TombstoneProtosMemoryMappingBuilder;
import o.getWrite;
import viva.republica.toss.service.LabFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SchemeOnboardingWebActivity extends Hilt_SchemeOnboardingWebActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access100;
    private final Lazy asInterface = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new IAuthTabCallback(this));

    @Inject
    public SessionTrackerb tossRouter;
    private static char[] asBinder = {32582, 32577, 32591, 32576, 32580, 32586, 32579, 32598, 32545, 32597, 32587};
    private static int IAuthTabCallbackStub = -1184333837;
    private static boolean IAuthTabCallbackDefault = true;
    private static boolean onTransact = true;

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 85;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 5;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return -1L;
        }
        throw null;
    }

    public static final class IAuthTabCallback implements Function0<CMS_DecEnvelopedDataWithEncryptKey2> {
        final /* synthetic */ Activity onExtraCallback;

        public IAuthTabCallback(Activity activity) {
            this.onExtraCallback = activity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final CMS_DecEnvelopedDataWithEncryptKey2 invoke() {
            LayoutInflater layoutInflater = this.onExtraCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CMS_DecEnvelopedDataWithEncryptKey2.onNavigationEvent(layoutInflater);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r1 = r1 + 19;
        viva.republica.toss.guest.SchemeOnboardingWebActivity.access100 = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.SessionTrackerb IAuthTabCallback() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.guest.SchemeOnboardingWebActivity.IAuthTabCallback_Parcel
            int r2 = r1 + 45
            int r3 = r2 % 128
            viva.republica.toss.guest.SchemeOnboardingWebActivity.access100 = r3
            int r2 = r2 % r0
            r3 = 0
            r4 = 19
            if (r2 == 0) goto L18
            o.SessionTrackerb r2 = r6.tossRouter
            int r5 = r4 / 0
            if (r2 == 0) goto L26
            goto L1c
        L18:
            o.SessionTrackerb r2 = r6.tossRouter
            if (r2 == 0) goto L26
        L1c:
            int r1 = r1 + r4
            int r4 = r1 % 128
            viva.republica.toss.guest.SchemeOnboardingWebActivity.access100 = r4
            int r1 = r1 % r0
            if (r1 != 0) goto L25
            return r2
        L25:
            throw r3
        L26:
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.SchemeOnboardingWebActivity.IAuthTabCallback():o.SessionTrackerb");
    }

    public final CMS_DecEnvelopedDataWithEncryptKey2 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 77;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        CMS_DecEnvelopedDataWithEncryptKey2 cMS_DecEnvelopedDataWithEncryptKey2 = (CMS_DecEnvelopedDataWithEncryptKey2) this.asInterface.getValue();
        int i3 = IAuthTabCallback_Parcel + 31;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            return cMS_DecEnvelopedDataWithEncryptKey2;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0620  */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r15v17, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r15v19, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r15v20, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r15v21, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r15v22, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r15v23, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r15v24, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r15v25, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r15v26, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r15v27, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r15v28, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r15v29, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r15v30, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r15v31, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r15v32, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r15v33, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v38, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r21v0, types: [android.app.Activity, androidx.appcompat.app.AppCompatActivity, im.toss.base.BaseActivity, viva.republica.toss.guest.SchemeOnboardingWebActivity] */
    @Override // viva.republica.toss.guest.Hilt_SchemeOnboardingWebActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.SchemeOnboardingWebActivity.onCreate(android.os.Bundle):void");
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = asBinder;
        char c = '0';
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 77 - View.resolveSizeAndState(0, 0, 0), TextUtils.lastIndexOf("", c) + 20953, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(IAuthTabCallbackStub)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 75 - (ViewConfiguration.getScrollDefaultDelay() >> 16), MotionEvent.axisFromString("") + 16038, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            float f = 0.0f;
            if (onTransact) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i4 = $10 + 81;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 63 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 12215 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr5);
                return;
            }
            if (!IAuthTabCallbackDefault) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                int i6 = $11 + 71;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 4 / 4;
                }
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i8 = $10 + 89;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                        int i10 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
                        cArr6[i9] = (char) (cArr3[iArr[0 / defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] >> iIntValue);
                    } else {
                        cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    }
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr6);
                return;
            }
            int i11 = $11 + 53;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i12 = $10 + 19;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback % defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] >>> iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)) + 63, (Process.myTid() >> 22) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } else {
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 63 - View.MeasureSpec.getMode(0), (Process.myPid() >> 22) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
                f = 0.0f;
            }
            objArr[0] = new String(cArr2);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private final void onExtraCallbackWithResult(String str, String str2) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = access100 + 9;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        FlowMeasureLazyPolicyExternalSyntheticLambda3 supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        FlowRowOverflowCompanionExternalSyntheticLambda4 flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult = supportFragmentManager.onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult, "");
        int id = onNavigationEvent().onWarmupCompleted.getId();
        FlowMeasureLazyPolicyExternalSyntheticLambda3 supportFragmentManager2 = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-125, -126, -127}, AndroidCharacter.getMirror('0') + 'O', objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str);
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-117, -124, -120, -126, -118, -120, -119, -120, -121, -122, -123, -124}, 127 - TextUtils.indexOf("", "", 0), objArr2);
        Bundle bundleOnNavigationEvent = RotationProvider1.onNavigationEvent(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), "false")});
        if (str2 != null && !StringsKt.isBlank(str2)) {
            int i4 = access100 + 13;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                Object[] objArr3 = new Object[1];
                a(null, null, new byte[]{-126, -120, -126, -126, -120, -118, -120, -126}, 112 - Gravity.getAbsoluteGravity(0, 0), objArr3);
                obj = objArr3[0];
            } else {
                Object[] objArr4 = new Object[1];
                a(null, null, new byte[]{-126, -120, -126, -126, -120, -118, -120, -126}, 127 - Gravity.getAbsoluteGravity(0, 0), objArr4);
                obj = objArr4[0];
            }
            bundleOnNavigationEvent.putString(((String) obj).intern(), str2);
        }
        Unit unit = Unit.INSTANCE;
        LabFragment labFragmentInstantiate = supportFragmentManager2.onMessageChannelReady().instantiate(ClassLoader.getSystemClassLoader(), LabFragment.class.getName());
        if (labFragmentInstantiate == null) {
            throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.service.LabFragment");
        }
        LabFragment labFragment = labFragmentInstantiate;
        if (bundleOnNavigationEvent != null) {
            int i5 = access100 + 29;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 == 0) {
                labFragment.setArguments(bundleOnNavigationEvent);
                throw null;
            }
            labFragment.setArguments(bundleOnNavigationEvent);
        }
        flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.IAuthTabCallback(id, labFragment);
        flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.IAuthTabCallback();
    }

    @Override // viva.republica.toss.guest.Hilt_SchemeOnboardingWebActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = access100 + 21;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = IAuthTabCallback_Parcel + 91;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.guest.Hilt_SchemeOnboardingWebActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = access100 + 85;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
    }

    @Override // viva.republica.toss.guest.Hilt_SchemeOnboardingWebActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 37;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
        int i4 = access100 + 13;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.guest.Hilt_SchemeOnboardingWebActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = access100 + 77;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = IAuthTabCallback_Parcel + 7;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
    }
}
