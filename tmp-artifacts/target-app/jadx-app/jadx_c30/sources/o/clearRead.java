package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.krc.pl_card.enums.ResponseCode;
import com.krc.pl_card.service.model.ServiceException;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Retrofit;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class clearRead extends TransitionTransitionNotificationExternalSyntheticLambda3<getStartDelay, RememberUtilsKtExternalSyntheticLambda3<getStartDelay>> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int[] onExtraCallback = {-1157082575, 486949499, -1816827544, -1463989957, 1718269793, 2067428526, 213909520, -1281622229, -1752325113, 1575813396, -1883359137, -1624491936, 186477026, 64097942, 76112772, 1250981117, 149960077, -1658467077};
    private static int onWarmupCompleted;
    private final String onExtraCallbackWithResult;
    private final setOnRefreshListener onNavigationEvent;

    static final class onNavigationEvent extends Lambda implements Function1<Retrofit, getSignPrikeyCCFBPHFilename<TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1<getStartDelay>>> {
        final /* synthetic */ setOnRefreshListener a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(setOnRefreshListener setonrefreshlistener) {
            super(1);
            this.a = setonrefreshlistener;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final getSignPrikeyCCFBPHFilename<TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1<getStartDelay>> invoke(@NotNull Retrofit retrofit) {
            Intrinsics.checkNotNullParameter(retrofit, BuildConfig.FLAVOR);
            return ((setCurrentPlayTimeMillis) retrofit.onNavigationEvent(setCurrentPlayTimeMillis.class)).onExtraCallback(this.a.onWarmupCompleted(), this.a.onExtraCallbackWithResult(), this.a.asBinder(), this.a.IAuthTabCallbackStub(), this.a.onTransact(), this.a.IAuthTabCallbackDefault(), this.a.asInterface(), this.a.access100(), this.a.IAuthTabCallbackStubProxy(), this.a.getInterfaceDescriptor(), this.a.IAuthTabCallback(), this.a.onExtraCallback(), this.a.onNavigationEvent(), this.a.IAuthTabCallback_Parcel(), this.a.access000());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public clearRead(@NotNull setOnRefreshListener setonrefreshlistener, @NotNull String str) throws Throwable {
        Intrinsics.checkNotNullParameter(setonrefreshlistener, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Object[] objArr = new Object[1];
        a(new int[]{-233369254, -1637660442, -1177084604, -118681357, -1020443684, -2009548172, -1114129713, -394576135, 1290179356, 1098728627, 1395079753, 992468512}, Color.rgb(0, 0, 0) + 16777239, objArr);
        super(((String) objArr[0]).intern(), 7200, new onNavigationEvent(setonrefreshlistener));
        this.onNavigationEvent = setonrefreshlistener;
        this.onExtraCallbackWithResult = str;
    }

    public ServiceException onExtraCallback(@Nullable ResponseCode responseCode, int i, @NotNull String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        ApmHelper11.onWarmupCompleted("!!!!!!!!!!!! code " + responseCode + "  status " + i + "  message " + str);
        if (responseCode != null) {
            ServiceException serviceException = new ServiceException(responseCode, (String) null, str, 2, (DefaultConstructorMarker) null);
            int i3 = IAuthTabCallback + 81;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return serviceException;
        }
        int i5 = onWarmupCompleted + 87;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        ServiceException serviceExceptionOnNavigationEvent = onNavigationEvent(i, str);
        int i7 = onWarmupCompleted + 37;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return serviceExceptionOnNavigationEvent;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.krc.pl_card.service.model.ServiceException */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0073, code lost:
    
        if ((r11 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0075, code lost:
    
        r11 = 58 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0078, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0079, code lost:
    
        onExtraCallbackWithResult(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0093, code lost:
    
        throw new com.krc.pl_card.service.model.ServiceException(com.krc.pl_card.enums.ResponseCode.Companion.onExtraCallbackWithResult(r11.onExtraCallbackWithResult()), r11.IAuthTabCallback(), r11.onNavigationEvent());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11.onExtraCallbackWithResult(), com.krc.pl_card.enums.ResponseCode.OK.getCode()) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11.onExtraCallbackWithResult(), com.krc.pl_card.enums.ResponseCode.OK.getCode()) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        r2 = new o.RememberUtilsKtExternalSyntheticLambda3<>(r11.onWarmupCompleted(), kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.trim((java.lang.String) kotlin.text.StringsKt.split$default(r11.onExtraCallback(), new java.lang.String[]{" "}, false, 0, 6, (java.lang.Object) null).get(0)).toString(), "-", net.sf.scuba.smartcards.BuildConfig.FLAVOR, false, 4, (java.lang.Object) null));
        r11 = o.clearRead.IAuthTabCallback + 49;
        o.clearRead.onWarmupCompleted = r11 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected RememberUtilsKtExternalSyntheticLambda3<getStartDelay> onExtraCallback(@NotNull TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1<getStartDelay> twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1) throws ServiceException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1, BuildConfig.FLAVOR);
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
    }

    public /* synthetic */ Object onWarmupCompleted(TwoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1 twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1) throws ServiceException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        RememberUtilsKtExternalSyntheticLambda3<getStartDelay> rememberUtilsKtExternalSyntheticLambda3OnExtraCallback = onExtraCallback(twoPaneExpansionStateKeyImplCompanionExternalSyntheticLambda1);
        int i4 = onWarmupCompleted + 23;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return rememberUtilsKtExternalSyntheticLambda3OnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallback;
        float f = 0.0f;
        int i4 = -1469660336;
        char c = '0';
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 72, 8847 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, c), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    f = 0.0f;
                    i4 = -1469660336;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallback;
        if (iArr5 != null) {
            int i7 = $10 + 93;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                int i10 = $10 + 67;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                Object[] objArr3 = new Object[1];
                objArr3[i5] = Integer.valueOf(iArr5[i9]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', i5, i5) + 1), 73 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i9++;
                i5 = 0;
            }
            i2 = i5;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i12 = 0;
            for (int i13 = 16; i12 < i13; i13 = 16) {
                int i14 = $10 + 113;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 22204), 39 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10300, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i12++;
            }
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0)), 78 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
