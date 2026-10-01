package viva.republica.toss.verify.unblock.idCard;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.airbnb.lottie.LottieAnimationView;
import gatewayprotocol.v1.AdResponseKtKt;
import im.toss.base.BaseFragment;
import im.toss.core.workerservice.WorkerService$Companion$;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import net.sf.scuba.smartcards.BuildConfig;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.ManagedRetainedValuesStoreKtExternalSyntheticLambda0;
import o.PageContext;
import o.SpannedDataExternalSyntheticLambda0;
import o.TurboModuleManager;
import o.access8100;
import o.addAllCommandLine;
import o.convertClassToJniType;
import o.convertReturnClassToJniType;
import o.getOCSPAddr;
import o.getUrlokhttp;
import o.getWrite;
import o.preFillDefault;
import o.r8lambdaFnmXJTCM06NhGodUBf7CAKxLL0;
import o.setBodyokhttp;
import o.zzck;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.verify.unblock.UnblockSessionActivity;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class UnblockIdCardIntroFragment extends BaseFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 1;
    private static long IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallback;
    public static final int onExtraCallbackWithResult;
    private static int onTransact;
    private final String IAuthTabCallback;
    private final Lazy onNavigationEvent;
    private final PageContext onWarmupCompleted;

    static {
        onWarmupCompleted();
        onExtraCallback = new addAllCommandLine[]{new PropertyReference1Impl<>(UnblockIdCardIntroFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentUnblockIdCardIntroBinding;", 0)};
        onExtraCallbackWithResult = 8;
        int i = asBinder + 111;
        onTransact = i % 128;
        if (i % 2 != 0) {
            int i2 = 73 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        UnblockIdCardIntroFragment unblockIdCardIntroFragment = (UnblockIdCardIntroFragment) objArr[0];
        String str = (String) objArr[1];
        UnblockSessionActivity unblockSessionActivity = (UnblockSessionActivity) objArr[2];
        View view = (View) objArr[3];
        int i = 2 % 2;
        int i2 = asInterface + 57;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(unblockIdCardIntroFragment, str, unblockSessionActivity, view);
        int i4 = asInterface + 111;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i4;
        int i9 = (~(i7 | i8)) | i5;
        int i10 = i8 | i5;
        int i11 = (~((~i5) | i2)) | (~i10);
        int i12 = (~(i4 | i7 | i5)) | (~(i10 | i2));
        int i13 = i5 + i2 + i3 + (528639218 * i6) + ((-532493036) * i);
        int i14 = i13 * i13;
        int i15 = ((i5 * 873666089) - 1460666368) + (873666089 * i2) + ((-875965520) * i9) + (437982760 * i11) + ((-437982760) * i12) + (435683328 * i3) + (1819279360 * i6) + ((-1621098496) * i) + (586088448 * i14);
        int i16 = (i5 * (-1573143961)) + 2078511484 + (i2 * (-1573143961)) + (i9 * 1872) + (i11 * (-936)) + (i12 * 936) + (i3 * (-1573143025)) + (i6 * 123045422) + (i * (-1548035028)) + (i14 * 1845559296);
        return i15 + ((i16 * i16) * 1848705024) != 1 ? IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(UnblockIdCardIntroFragment unblockIdCardIntroFragment, UnblockSessionActivity unblockSessionActivity, UnblockSessionActivity.IAuthTabCallback iAuthTabCallback, TurboModuleManager turboModuleManager) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(unblockIdCardIntroFragment, unblockSessionActivity, iAuthTabCallback, turboModuleManager);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(unblockIdCardIntroFragment, unblockSessionActivity, iAuthTabCallback, turboModuleManager);
        int i3 = asInterface + 83;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(UnblockIdCardIntroFragment unblockIdCardIntroFragment, List list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(unblockIdCardIntroFragment, list);
        int i4 = IAuthTabCallbackDefault + 61;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void onNavigationEvent(UnblockIdCardIntroFragment unblockIdCardIntroFragment, String str, UnblockSessionActivity unblockSessionActivity, View view) {
        int i = 2 % 2;
        int i2 = asInterface + 69;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(unblockIdCardIntroFragment, str, unblockSessionActivity, view);
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 85;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return 1259587L;
    }

    public UnblockIdCardIntroFragment() throws Throwable {
        super(R.layout.fragment_unblock_id_card_intro);
        Object[] objArr = new Object[1];
        a(new char[]{55017, 20188, 59047, 7818, 46678, 11894, 18008, 65457, 6074, 36740, 10106, 24374, 63236, 27895, 33937, 15506, 21630, 52299, 25616, 40356, 13788, 44465, 50472, 32066, 38198, 2804, 41695, 55995, 29336, 59991, 608, 47637, 54208, 19386, 58263, 6965, 45937, 11059, 16638, 63706, 4292, 34915, 8280, 22531, 61923, 27034, 33205, 14709, 20830, 51510}, ExpandableListView.getPackedPositionType(0L) + 38953, objArr);
        this.IAuthTabCallback = ((String) objArr[0]).intern();
        this.onWarmupCompleted = preFillDefault.onExtraCallbackWithResult(this, IAuthTabCallback.onExtraCallbackWithResult);
        this.onNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(convertReturnClassToJniType.class), new onNavigationEvent(this), new onWarmupCompleted(null, this), new onExtraCallbackWithResult(this));
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function1<View, getOCSPAddr> {
        public static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback();

        IAuthTabCallback() {
            super(1, getOCSPAddr.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentUnblockIdCardIntroBinding;", 0);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final getOCSPAddr invoke(View view) {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            return getOCSPAddr.onWarmupCompleted(view);
        }
    }

    private final getOCSPAddr IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        IAuthTabCallbackDefault = i2 % 128;
        return (getOCSPAddr) this.onWarmupCompleted.onExtraCallbackWithResult(this, i2 % 2 == 0 ? onExtraCallback[1] : onExtraCallback[0]);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        UnblockIdCardIntroFragment unblockIdCardIntroFragment = (UnblockIdCardIntroFragment) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 123;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object value = unblockIdCardIntroFragment.onNavigationEvent.getValue();
        if (i3 != 0) {
            return (convertReturnClassToJniType) value;
        }
        int i4 = 31 / 0;
        return (convertReturnClassToJniType) value;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{55027, 43849, 11709, 45027, 8263, 41618, 9450, 47432}, Color.rgb(0, 0, 0) + 16809389, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), ((convertReturnClassToJniType) onExtraCallbackWithResult(new Object[]{this}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1432517166, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -1432517166, SpannedDataExternalSyntheticLambda0.IAuthTabCallback())).extraCallbackWithResult());
        String strExtraCallback = ((convertReturnClassToJniType) onExtraCallbackWithResult(new Object[]{this}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1432517166, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -1432517166, SpannedDataExternalSyntheticLambda0.IAuthTabCallback())).extraCallback();
        if (!(!StringsKt.isBlank(strExtraCallback))) {
            int i4 = IAuthTabCallbackDefault + 99;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                strExtraCallback = ((convertReturnClassToJniType) onExtraCallbackWithResult(new Object[]{this}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1432517166, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -1432517166, SpannedDataExternalSyntheticLambda0.IAuthTabCallback())).onPostMessage();
                int i5 = 91 / 0;
            } else {
                strExtraCallback = ((convertReturnClassToJniType) onExtraCallbackWithResult(new Object[]{this}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1432517166, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -1432517166, SpannedDataExternalSyntheticLambda0.IAuthTabCallback())).onPostMessage();
            }
        }
        return access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback("service_referrer", strExtraCallback)});
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = asInterface + 31;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            super.onViewCreated(view, bundle);
            onNavigationEvent();
        } else {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            super.onViewCreated(view, bundle);
            onNavigationEvent();
            throw null;
        }
    }

    private static final void onWarmupCompleted(UnblockIdCardIntroFragment unblockIdCardIntroFragment, String str, UnblockSessionActivity unblockSessionActivity, View view) {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {convertClassToJniType.IAuthTabCallback, unblockIdCardIntroFragment.getScreenParams(), str};
            int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            convertClassToJniType.onNavigationEvent(1570157394, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, objArr, -1570157392, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
            unblockSessionActivity.ICustomTabsService_Parcel();
            return;
        }
        Object[] objArr2 = {convertClassToJniType.IAuthTabCallback, unblockIdCardIntroFragment.getScreenParams(), str};
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback4 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        convertClassToJniType.onNavigationEvent(1570157394, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, objArr2, -1570157392, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback4);
        unblockSessionActivity.ICustomTabsService_Parcel();
        throw null;
    }

    private static final Unit onWarmupCompleted(UnblockIdCardIntroFragment unblockIdCardIntroFragment, List list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
            convertClassToJniType.IAuthTabCallback.onExtraCallback(unblockIdCardIntroFragment.getScreenParams(), list);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        convertClassToJniType.IAuthTabCallback.onExtraCallback(unblockIdCardIntroFragment.getScreenParams(), list);
        Unit unit2 = Unit.INSTANCE;
        int i3 = asInterface + 95;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x023f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (true) {
            obj = null;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                break;
            }
            int i3 = $11 + 63;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 1), 24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 19627 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() / (IAuthTabCallbackStub % 5407414049857832247L);
                    try {
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 1), 59 - (ViewConfiguration.getPressedStateDuration() >> 16), 6383 - Drawable.resolveOpacity(0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                        }
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 24, 19627 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (IAuthTabCallbackStub ^ 5407414049857832247L);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 58 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), View.MeasureSpec.getSize(0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 113;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 59, 6383 - Gravity.getAbsoluteGravity(0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                obj.hashCode();
                throw null;
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr7 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 59, 6384 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Unit onExtraCallback(UnblockIdCardIntroFragment unblockIdCardIntroFragment, UnblockSessionActivity unblockSessionActivity, UnblockSessionActivity.IAuthTabCallback iAuthTabCallback, TurboModuleManager turboModuleManager) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(turboModuleManager, BuildConfig.FLAVOR);
        if (!(!(turboModuleManager instanceof TurboModuleManager.onNavigationEvent))) {
            int i2 = IAuthTabCallbackDefault + 113;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                convertClassToJniType.IAuthTabCallback.onWarmupCompleted(unblockIdCardIntroFragment.getScreenParams(), iAuthTabCallback);
                int i3 = 64 / 0;
            } else {
                convertClassToJniType.IAuthTabCallback.onWarmupCompleted(unblockIdCardIntroFragment.getScreenParams(), iAuthTabCallback);
            }
            int i4 = IAuthTabCallbackDefault + 29;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 5;
            }
        } else if (!(turboModuleManager instanceof TurboModuleManager.IAuthTabCallback)) {
            int i6 = IAuthTabCallbackDefault + 11;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            if (!Intrinsics.areEqual(turboModuleManager, TurboModuleManager.onWarmupCompleted.onExtraCallback)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (iAuthTabCallback != null) {
            int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            UnblockSessionActivity.onNavigationEvent(547705507, -547705503, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{unblockSessionActivity, iAuthTabCallback});
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(final UnblockIdCardIntroFragment unblockIdCardIntroFragment, String str, final UnblockSessionActivity unblockSessionActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        convertClassToJniType.IAuthTabCallback.IAuthTabCallbackDefault(unblockIdCardIntroFragment.getScreenParams(), str);
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        Object[] objArr = {(convertReturnClassToJniType) onExtraCallbackWithResult(new Object[]{unblockIdCardIntroFragment}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1432517166, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, -1432517166, SpannedDataExternalSyntheticLambda0.IAuthTabCallback())};
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        convertReturnClassToJniType.onNavigationEvent(AdResponseKtKt.IAuthTabCallback(), -513620356, objArr, iIAuthTabCallback2, 513620368, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback());
        Context contextRequireContext = unblockIdCardIntroFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, BuildConfig.FLAVOR);
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        r8lambdaFnmXJTCM06NhGodUBf7CAKxLL0.IAuthTabCallback(contextRequireContext, ((convertReturnClassToJniType) onExtraCallbackWithResult(new Object[]{unblockIdCardIntroFragment}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1432517166, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback3, -1432517166, SpannedDataExternalSyntheticLambda0.IAuthTabCallback())).IAuthTabCallback(), new Function1() { // from class: viva.republica.toss.verify.unblock.idCard.UnblockIdCardIntroFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return UnblockIdCardIntroFragment.onNavigationEvent(this.f$0, (List) obj);
            }
        }, new Function2() { // from class: viva.republica.toss.verify.unblock.idCard.UnblockIdCardIntroFragment$$ExternalSyntheticLambda1
            public final Object invoke(Object obj, Object obj2) {
                return UnblockIdCardIntroFragment.onExtraCallbackWithResult(this.f$0, unblockSessionActivity, (UnblockSessionActivity.IAuthTabCallback) obj, (TurboModuleManager) obj2);
            }
        }, true, (Function1) null, 32, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 71;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private final void onNavigationEvent() {
        int i = 2 % 2;
        getUrlokhttp geturlokhttpOnExtraCallback = setBodyokhttp.onExtraCallback(this);
        String string = getString(R.string.unblock_id_card_title);
        Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
        final String string2 = getString(R.string.unblock_id_card_cta);
        Intrinsics.checkNotNullExpressionValue(string2, BuildConfig.FLAVOR);
        final String string3 = getString(R.string.unblock_session_select_alternative_method);
        Intrinsics.checkNotNullExpressionValue(string3, BuildConfig.FLAVOR);
        UnblockSessionActivity unblockSessionActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(unblockSessionActivityRequireActivity, BuildConfig.FLAVOR);
        final UnblockSessionActivity unblockSessionActivity = unblockSessionActivityRequireActivity;
        getOCSPAddr getocspaddrIAuthTabCallback = IAuthTabCallback();
        TdsTopV1View tdsTopV1View = getocspaddrIAuthTabCallback.onExtraCallbackWithResult;
        tdsTopV1View.setUpperText(string);
        tdsTopV1View.setUpperType(TdsTopV1View.onExtraCallbackWithResult.TOP3);
        tdsTopV1View.setUpperTextColor(ColorStateList.valueOf(geturlokhttpOnExtraCallback.onRelationshipValidationResult()));
        LottieAnimationView lottieAnimationView = getocspaddrIAuthTabCallback.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, BuildConfig.FLAVOR);
        zzck.onExtraCallback(lottieAnimationView, this.IAuthTabCallback, (ManagedRetainedValuesStoreKtExternalSyntheticLambda0) null, 2, (Object) null);
        TdsBottomCtaV1View tdsBottomCtaV1View = getocspaddrIAuthTabCallback.onWarmupCompleted;
        Intrinsics.checkNotNull(tdsBottomCtaV1View);
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string2, new View.OnClickListener() { // from class: viva.republica.toss.verify.unblock.idCard.UnblockIdCardIntroFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UnblockIdCardIntroFragment.onNavigationEvent(this.f$0, string2, unblockSessionActivity, view);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        tdsBottomCtaV1View.setBottomButton(string3, new Function1() { // from class: viva.republica.toss.verify.unblock.idCard.UnblockIdCardIntroFragment$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                Object[] objArr = {this.f$0, string3, unblockSessionActivity, (View) obj};
                int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
                return (Unit) UnblockIdCardIntroFragment.onExtraCallbackWithResult(objArr, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -397721028, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, 397721029, SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
            }
        });
        TdsTextButtonV0View tdsTextButtonV0ViewOnExtraCallbackWithResult = tdsBottomCtaV1View.onExtraCallbackWithResult();
        if (tdsTextButtonV0ViewOnExtraCallbackWithResult != null) {
            int i2 = asInterface + 103;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            tdsTextButtonV0ViewOnExtraCallbackWithResult.setArrow(true);
            tdsTextButtonV0ViewOnExtraCallbackWithResult.setType(TdsTextButtonV0View.IAuthTabCallback.GREY);
            int i4 = IAuthTabCallbackDefault + 85;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(UnblockIdCardIntroFragment unblockIdCardIntroFragment, String str, UnblockSessionActivity unblockSessionActivity, View view) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(new Object[]{unblockIdCardIntroFragment, str, unblockSessionActivity, view}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -397721028, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, 397721029, SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
    }

    private final convertReturnClassToJniType onExtraCallbackWithResult() {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (convertReturnClassToJniType) onExtraCallbackWithResult(new Object[]{this}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1432517166, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, -1432517166, SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
    }

    static void onWarmupCompleted() {
        IAuthTabCallbackStub = -6364680479686175818L;
    }

    public static final class onNavigationEvent extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, BuildConfig.FLAVOR);
            return viewModelStore;
        }
    }

    public static final class onWarmupCompleted extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, BuildConfig.FLAVOR);
            return defaultViewModelCreationExtras;
        }
    }

    public static final class onExtraCallbackWithResult extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, BuildConfig.FLAVOR);
            return defaultViewModelProviderFactory;
        }
    }
}
