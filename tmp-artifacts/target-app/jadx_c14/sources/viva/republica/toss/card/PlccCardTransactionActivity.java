package viva.republica.toss.card;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.base.BaseActivity;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CMS_DecEnvelopedDataWithEncryptKey;
import o.CommonModule_closeView;
import o.ConvertByteArrayToFloatArray;
import o.EnvelopedData;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;
import o.IdGeneratorExternalSyntheticLambda1;
import o.KEKIdentifier;
import o.KitKatPurgeableDecoder;
import o.ManagedRetainedValuesStoreKtExternalSyntheticLambda0;
import o.NetConverter3;
import o.OriginatorIdentifierOrKey;
import o.RightClickGesturesKtonRightClickDown2;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.access8100;
import o.copyBitmap;
import o.getAdService;
import o.getInitializationType;
import o.getNavigationBar;
import o.getOther;
import o.getParamImp;
import o.getSpecialFeatureOptInStatus;
import o.getTypedExportedConstants;
import o.getUrlokhttp;
import o.getWrite;
import o.initMiniApp;
import o.logAndOpenStore;
import o.nativeToCircleWithBorderFilter;
import o.onJsBridgeReady;
import o.readIntokhttp;
import o.setMessageBytes;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setPingIntervalokhttp;
import o.setProxySelectorokhttp;
import o.toCircle;
import o.toHashtable;
import o.varyMatches;
import o.writeRaw;
import o.zzag;
import o.zzbq;
import o.zzck;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.card.CardMonthSelectDialog;
import viva.republica.toss.card.PlccCardTransactionActivity$;
import viva.republica.toss.card.PlccCardTransactionActivity$showSelectMonthDialog$1$;
import viva.republica.toss.plcc.activity.PlccCardTransactionDetailActivity;
import viva.republica.toss.plcc.activity.PlccIssueStatusActivity;
import viva.republica.toss.plcc.activity.PlccSettingV2Activity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PlccCardTransactionActivity extends Hilt_PlccCardTransactionActivity {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int IAuthTabCallbackDefault = 8;
    private final toHashtable IAuthTabCallbackStub;

    @Inject
    public zzag tossClock;

    @Inject
    public SessionTrackerb tossRouter;
    private long asInterface = -1;
    private final Lazy asBinder = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(EnvelopedData.class), new extraCallback(this), new writeTypedObject(this), new readTypedObject(null, this));
    private final Lazy onTransact = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new extraCallbackWithResult(this));

    public long getScreenId() {
        return 1000474L;
    }

    public static final class extraCallbackWithResult implements Function0<CMS_DecEnvelopedDataWithEncryptKey> {
        final /* synthetic */ Activity onNavigationEvent;

        public extraCallbackWithResult(Activity activity) {
            this.onNavigationEvent = activity;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final CMS_DecEnvelopedDataWithEncryptKey invoke() {
            LayoutInflater layoutInflater = this.onNavigationEvent.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CMS_DecEnvelopedDataWithEncryptKey.onExtraCallbackWithResult(layoutInflater);
        }
    }

    public static final class getInterfaceDescriptor implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public getInterfaceDescriptor(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class access100 implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        public static final access100 onWarmupCompleted = new access100();

        public final void IAuthTabCallback(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        }

        public /* synthetic */ Object invoke(Object obj) {
            IAuthTabCallback((initMiniApp.onWarmupCompleted) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlccCardTransactionActivity() {
        toHashtable tohashtable = new toHashtable();
        tohashtable.onExtraCallback(new IAuthTabCallback());
        this.IAuthTabCallbackStub = tohashtable;
    }

    public final SessionTrackerb IAuthTabCallback() {
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final zzag onNavigationEvent() {
        zzag zzagVar = this.tossClock;
        if (zzagVar != null) {
            return zzagVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public static final class writeTypedObject implements Function0<ViewModelProvider.onWarmupCompleted> {
        public static int onNavigationEvent;
        public static int onWarmupCompleted;
        final /* synthetic */ ComponentActivity onExtraCallbackWithResult;

        public writeTypedObject(ComponentActivity componentActivity) {
            this.onExtraCallbackWithResult = componentActivity;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            return this.onExtraCallbackWithResult.getDefaultViewModelProviderFactory();
        }

        public static int onNavigationEvent() {
            int i = onWarmupCompleted;
            int i2 = i % 6203716;
            onWarmupCompleted = i + 1;
            if (i2 != 0) {
                return onNavigationEvent;
            }
            int streamMaxVolume = ((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService("audio")).getStreamMaxVolume(3);
            onNavigationEvent = streamMaxVolume;
            return streamMaxVolume;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EnvelopedData ICustomTabsServiceDefault() {
        return (EnvelopedData) this.asBinder.getValue();
    }

    private final CMS_DecEnvelopedDataWithEncryptKey setEngagementSignalsCallback() {
        Object value = this.onTransact.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (CMS_DecEnvelopedDataWithEncryptKey) value;
    }

    static final class onWarmupCompleted implements View.OnClickListener {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long IAuthTabCallback = 2327673717014759513L;
        private static int asInterface = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ PlccCardTransactionActivity onExtraCallback;
        final /* synthetic */ String onNavigationEvent;
        final /* synthetic */ getTypedExportedConstants onWarmupCompleted;

        onWarmupCompleted(getTypedExportedConstants gettypedexportedconstants, String str, PlccCardTransactionActivity plccCardTransactionActivity) {
            this.onWarmupCompleted = gettypedexportedconstants;
            this.onNavigationEvent = str;
            this.onExtraCallback = plccCardTransactionActivity;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = $11 + 109;
                $10 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), 24 - TextUtils.getCapsMode("", 0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 19626, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() & (IAuthTabCallback * 5407414049857832247L);
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 58, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), Process.getGidForName("") + 25, 19627 - TextUtils.getOffsetAfter("", 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                    Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), Color.argb(0, 0, 0, 0) + 59, (ViewConfiguration.getTouchSlop() >> 8) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i6 = $10 + 21;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                    Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 59 - KeyEvent.keyCodeFromString(""), TextUtils.getOffsetBefore("", 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                    int i7 = 86 / 0;
                } else {
                    cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                    Object[] objArr7 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback6 == null) {
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 58, 6382 - TextUtils.lastIndexOf("", '0', 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback6).invoke(null, objArr7);
                }
            }
            objArr[0] = new String(cArr2);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) throws Throwable {
            SessionTrackerb sessionTrackerbIAuthTabCallback;
            BaseActivity baseActivity;
            String str;
            boolean z;
            Function1 function1;
            Bundle bundle;
            boolean z2;
            int i;
            int i2 = 2 % 2;
            this.onWarmupCompleted.dismiss();
            String str2 = this.onNavigationEvent;
            if (str2 != null) {
                int i3 = onExtraCallbackWithResult + 63;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                if (str2.length() != 0) {
                    int i5 = asInterface + 69;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        String str3 = this.onNavigationEvent;
                        Object[] objArr = new Object[1];
                        a(new char[]{3357, 476, 5264, 11102, 15872, 13049, 16811, 21612, 27429, 32683, 29319, 33228, 37972, 43802, 49122, 45730}, 2924 >> (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
                        if (Intrinsics.areEqual(str3, ((String) objArr[0]).intern())) {
                            return;
                        }
                    } else {
                        String str4 = this.onNavigationEvent;
                        Object[] objArr2 = new Object[1];
                        a(new char[]{3357, 476, 5264, 11102, 15872, 13049, 16811, 21612, 27429, 32683, 29319, 33228, 37972, 43802, 49122, 45730}, 3272 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
                        if (Intrinsics.areEqual(str4, ((String) objArr2[0]).intern())) {
                            return;
                        }
                    }
                    int i6 = asInterface + 57;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    PlccCardTransactionActivity plccCardTransactionActivity = this.onExtraCallback;
                    if (i7 != 0) {
                        sessionTrackerbIAuthTabCallback = plccCardTransactionActivity.IAuthTabCallback();
                        baseActivity = this.onExtraCallback;
                        str = this.onNavigationEvent;
                        z = false;
                        function1 = null;
                        bundle = null;
                        z2 = false;
                        i = 95;
                    } else {
                        sessionTrackerbIAuthTabCallback = plccCardTransactionActivity.IAuthTabCallback();
                        baseActivity = this.onExtraCallback;
                        str = this.onNavigationEvent;
                        z = false;
                        function1 = null;
                        bundle = null;
                        z2 = false;
                        i = 60;
                    }
                    SessionTrackerb.IAuthTabCallback(sessionTrackerbIAuthTabCallback, baseActivity, str, z, function1, bundle, z2, i, (Object) null);
                }
            }
        }
    }

    public static final class extraCallback implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ ComponentActivity onExtraCallbackWithResult;

        public extraCallback(ComponentActivity componentActivity) {
            this.onExtraCallbackWithResult = componentActivity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            return this.onExtraCallbackWithResult.getViewModelStore();
        }
    }

    private final RecyclerView ICustomTabsServiceStub() {
        RecyclerView recyclerView = setEngagementSignalsCallback().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        return recyclerView;
    }

    public static final class readTypedObject implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ ComponentActivity onExtraCallbackWithResult;
        final /* synthetic */ Function0 onNavigationEvent;

        public readTypedObject(Function0 function0, ComponentActivity componentActivity) {
            this.onNavigationEvent = function0;
            this.onExtraCallbackWithResult = componentActivity;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.onNavigationEvent;
            return (function0 == null || (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) == null) ? this.onExtraCallbackWithResult.getDefaultViewModelCreationExtras() : androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SwipeRefreshLayout updateVisuals() {
        SwipeRefreshLayout swipeRefreshLayout = setEngagementSignalsCallback().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(swipeRefreshLayout, "");
        return swipeRefreshLayout;
    }

    public static final class IAuthTabCallback implements toHashtable.IAuthTabCallback {
        @Override // o.toHashtable.IAuthTabCallback
        public void onExtraCallback(getInitializationType getinitializationtype) {
            Intrinsics.checkNotNullParameter(getinitializationtype, "");
        }

        IAuthTabCallback() {
        }

        @Override // o.toHashtable.IAuthTabCallback
        public void onExtraCallbackWithResult(KEKIdentifier kEKIdentifier) {
            Intrinsics.checkNotNullParameter(kEKIdentifier, "");
            if (kEKIdentifier instanceof KitKatPurgeableDecoder) {
                getNavigationBar.IAuthTabCallback(PlccCardTransactionDetailActivity.Companion.onExtraCallback(PlccCardTransactionActivity.this, (KitKatPurgeableDecoder) kEKIdentifier), PlccCardTransactionActivity.this);
            }
        }
    }

    public String getScreenName() {
        return "tosscreditcard__payment_history";
    }

    public Map<String, Object> getScreenParams() {
        return access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("service", "tosscreditcard")});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0a7d  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0a9a  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0fd7  */
    /* JADX WARN: Type inference failed for: r1v135, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v136 */
    /* JADX WARN: Type inference failed for: r1v137 */
    /* JADX WARN: Type inference failed for: r1v143 */
    /* JADX WARN: Type inference failed for: r1v144 */
    /* JADX WARN: Type inference failed for: r1v149, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v154, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v159, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v164, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v169, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v174, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v179, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v184, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v189, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v191, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r1v193, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r1v194, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r1v195, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r1v196, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r1v197, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r1v198, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r1v199 */
    /* JADX WARN: Type inference failed for: r1v203, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r25v0, types: [android.app.Activity, android.content.Context, androidx.appcompat.app.AppCompatActivity, im.toss.base.BaseActivity, im.toss.uikit.base.UIKitBaseActivity, viva.republica.toss.card.PlccCardTransactionActivity] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v39, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r7v49, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v50, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r7v51, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r7v52, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v54, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object[]] */
    @Override // viva.republica.toss.card.Hilt_PlccCardTransactionActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 4135
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.card.PlccCardTransactionActivity.onCreate(android.os.Bundle):void");
    }

    public static final class IAuthTabCallbackStubProxy implements Function1<Pair<? extends String, ? extends copyBitmap>, Unit> {
        private static final byte[] $$a = {7, 75, -84, -52};
        private static final int $$b = 100;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onNavigationEvent = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int IAuthTabCallback = 478308979;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(short r7, byte r8, byte r9) {
            /*
                byte[] r0 = viva.republica.toss.card.PlccCardTransactionActivity.IAuthTabCallbackStubProxy.$$a
                int r8 = r8 + 4
                int r7 = r7 * 4
                int r7 = r7 + 1
                int r9 = r9 * 4
                int r9 = 105 - r9
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r7
                r9 = r8
                r4 = r2
                goto L2b
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r7) goto L23
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L23:
                int r8 = r8 + 1
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r6
            L2b:
                int r8 = -r8
                int r8 = r8 + r3
                r3 = r4
                r6 = r9
                r9 = r8
                r8 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.card.PlccCardTransactionActivity.IAuthTabCallbackStubProxy.$$c(short, byte, byte):java.lang.String");
        }

        public IAuthTabCallbackStubProxy() {
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0176  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0177  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r22, int r23, char[] r24, boolean r25, int r26, java.lang.Object[] r27) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 411
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.card.PlccCardTransactionActivity.IAuthTabCallbackStubProxy.a(int, int, char[], boolean, int, java.lang.Object[]):void");
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return unit;
            }
            throw null;
        }

        public final void IAuthTabCallback(Pair<? extends String, ? extends copyBitmap> pair) throws Throwable {
            int i = 2 % 2;
            Pair<? extends String, ? extends copyBitmap> pair2 = pair;
            String str = (String) pair2.onExtraCallbackWithResult();
            copyBitmap copybitmap = (copyBitmap) pair2.IAuthTabCallback();
            if (copybitmap != null) {
                BaseActivity baseActivity = PlccCardTransactionActivity.this;
                access100 access100Var = access100.onWarmupCompleted;
                logAndOpenStore.IAuthTabCallback(baseActivity, (Long) null);
                getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(baseActivity, 0, false, false, -1L, access100Var, 14, (DefaultConstructorMarker) null);
                Context context = gettypedexportedconstants.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                Context context2 = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                bottomSheetHeader.setTitle(copybitmap.asInterface());
                bottomSheetHeader.setShowCloseIcon(false);
                setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
                BaseTextView baseTextView = (BaseTextView) Typography5.class.getDeclaredConstructor(Context.class).newInstance(linearLayout.getContext());
                Intrinsics.checkNotNull(baseTextView);
                Class cls = Integer.TYPE;
                ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
                Intrinsics.checkNotNull(layoutParams);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                DisplayMetrics displayMetrics = baseTextView.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                layoutParams2.leftMargin = varyMatches.onNavigationEvent(24, displayMetrics);
                DisplayMetrics displayMetrics2 = baseTextView.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                layoutParams2.rightMargin = varyMatches.onNavigationEvent(24, displayMetrics2);
                baseTextView.setLayoutParams(layoutParams);
                baseTextView.setText(copybitmap.onExtraCallback());
                Context context3 = baseTextView.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                Configuration configuration = context3.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                baseTextView.setTextColor(new getUrlokhttp(new getInterfaceDescriptor(configuration)).ICustomTabsCallbackStubProxy());
                Intrinsics.checkNotNull(baseTextView);
                setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, baseTextView);
                LottieAnimationView lottieAnimationView = new LottieAnimationView(linearLayout.getContext());
                ViewGroup.LayoutParams layoutParams3 = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
                Intrinsics.checkNotNull(layoutParams3);
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                DisplayMetrics displayMetrics3 = lottieAnimationView.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
                layoutParams4.width = varyMatches.onNavigationEvent(Float.valueOf(240.0f), displayMetrics3);
                DisplayMetrics displayMetrics4 = lottieAnimationView.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
                layoutParams4.height = varyMatches.onNavigationEvent(Float.valueOf(120.0f), displayMetrics4);
                layoutParams4.gravity = 1;
                lottieAnimationView.setLayoutParams(layoutParams3);
                if (copybitmap.onExtraCallbackWithResult().length() > 0) {
                    int i2 = onNavigationEvent + 9;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    zzck.onExtraCallback(lottieAnimationView, copybitmap.onExtraCallbackWithResult(), (ManagedRetainedValuesStoreKtExternalSyntheticLambda0) null, 2, (Object) null);
                    int i4 = onExtraCallbackWithResult + 53;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 5 / 3;
                    }
                }
                lottieAnimationView.setRepeatMode(1);
                lottieAnimationView.setRepeatCount(-1);
                lottieAnimationView.playAnimation();
                DisplayMetrics displayMetrics5 = lottieAnimationView.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
                setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(lottieAnimationView, varyMatches.onNavigationEvent(16, displayMetrics5));
                setPingIntervalokhttp.onWarmupCompleted(lottieAnimationView);
                setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, lottieAnimationView);
                Context context4 = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context4);
                TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, copybitmap.onNavigationEvent(), new onWarmupCompleted(gettypedexportedconstants, str, PlccCardTransactionActivity.this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
                setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
                gettypedexportedconstants.setContentView(linearLayout);
                gettypedexportedconstants.show();
            } else if (str != null && str.length() != 0) {
                Object[] objArr = new Object[1];
                a(17 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1 - KeyEvent.getDeadChar(0, 0), new char[]{1, 15, 17, '\f', 1, 14, 16, 11, 15, 15, 65494, 65483, 65483, '\n', 11, '\n'}, false, TextUtils.getOffsetAfter("", 0) + 190, objArr);
                if (!Intrinsics.areEqual(str, ((String) objArr[0]).intern())) {
                    int i6 = onExtraCallbackWithResult + 23;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    SessionTrackerb.IAuthTabCallback(PlccCardTransactionActivity.this.IAuthTabCallback(), PlccCardTransactionActivity.this, str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                }
            }
            ConvertByteArrayToFloatArray.onWarmupCompleted("click__new_benefit_v2_notice", false, (String) null, (List) null, (Map) null, PlccCardTransactionActivity.this.new onExtraCallback(), 30, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(PlccCardTransactionActivity plccCardTransactionActivity) throws Throwable {
        plccCardTransactionActivity.ICustomTabsServiceDefault().IAuthTabCallbackStubProxy();
    }

    public void onNewIntent(@NotNull Intent intent) throws Throwable {
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        if (zzbq.onNavigationEvent(intent)) {
            IEngagementSignalsCallback();
        } else {
            ICustomTabsService_Parcel();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallback() {
        writeRaw writerawIAuthTabCallback = ICustomTabsServiceDefault().IAuthTabCallback().IAuthTabCallback(NetConverter3.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        setMessageBytes.onExtraCallbackWithResult(writerawIAuthTabCallback, new PlccCardTransactionActivity$.ExternalSyntheticLambda2(), new PlccCardTransactionActivity$.ExternalSyntheticLambda3(this));
        Uri data = getIntent().getData();
        if (data == null || !data.getBooleanQueryParameter("seasonChanged", false)) {
            return;
        }
        ConstraintLayout constraintLayout = setEngagementSignalsCallback().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        String string = getString(R.string.app_card___9dacfc091c);
        Intrinsics.checkNotNullExpressionValue(string, "");
        new TdsToastV1.onNavigationEvent(constraintLayout, string).onNavigationEvent();
        ConvertByteArrayToFloatArray.onExtraCallback(1006050L, false, (String) null, (Map) null, new PlccCardTransactionActivity$.ExternalSyntheticLambda4(this), 14, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onNavigationEvent(PlccCardTransactionActivity plccCardTransactionActivity, Unit unit) throws Throwable {
        Long lOnWarmupCompleted = plccCardTransactionActivity.ICustomTabsServiceDefault().onWarmupCompleted();
        if (lOnWarmupCompleted == null || lOnWarmupCompleted.longValue() != -1) {
            EnvelopedData.onExtraCallback(plccCardTransactionActivity.ICustomTabsServiceDefault(), 0, false, 3, null);
        } else {
            onJsBridgeReady.onNavigationEvent(plccCardTransactionActivity, plccCardTransactionActivity.getString(R.string.app_card___def0e5704b), 0, 2, (Object) null);
            plccCardTransactionActivity.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallbackDefault(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(PlccCardTransactionActivity plccCardTransactionActivity, SetDetectableSize setDetectableSize) {
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("screen_name", plccCardTransactionActivity.getScreenName());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsService_Parcel() throws Throwable {
        long longExtra = getIntent().getLongExtra("extra_card_id", -1L);
        if (longExtra < 0) {
            onJsBridgeReady.onNavigationEvent(this, getString(R.string.app_card___def0e5704b), 0, 2, (Object) null);
            finish();
            return;
        }
        toCircle tocircle = (toCircle) getIntent().getParcelableExtra("extra_plcc_card");
        EnvelopedData envelopedDataICustomTabsServiceDefault = ICustomTabsServiceDefault();
        envelopedDataICustomTabsServiceDefault.onExtraCallbackWithResult(Long.valueOf(longExtra));
        envelopedDataICustomTabsServiceDefault.IAuthTabCallback(tocircle);
        EnvelopedData.onExtraCallback(ICustomTabsServiceDefault(), 0, false, 3, null);
    }

    private final void validateRelationship() {
        EnvelopedData envelopedDataICustomTabsServiceDefault = ICustomTabsServiceDefault();
        envelopedDataICustomTabsServiceDefault.onTransact().observe(this, new BaseActivity.prefetchWithMultipleUrls(new asBinder()));
        envelopedDataICustomTabsServiceDefault.onExtraCallback().observe(this, new BaseActivity.prefetchWithMultipleUrls(new onTransact()));
        envelopedDataICustomTabsServiceDefault.access000().observe(this, new BaseActivity.prefetchWithMultipleUrls(new IAuthTabCallbackDefault()));
        envelopedDataICustomTabsServiceDefault.asInterface().observe(this, new BaseActivity.prefetchWithMultipleUrls(new asInterface()));
        envelopedDataICustomTabsServiceDefault.onNavigationEvent().observe(this, new BaseActivity.prefetchWithMultipleUrls(new IAuthTabCallbackStub()));
        envelopedDataICustomTabsServiceDefault.onExtraCallbackWithResult().observe(this, new BaseActivity.prefetchWithMultipleUrls(new access000()));
        envelopedDataICustomTabsServiceDefault.IAuthTabCallbackStub().observe(this, new BaseActivity.prefetchWithMultipleUrls(new IAuthTabCallback_Parcel()));
        envelopedDataICustomTabsServiceDefault.IAuthTabCallbackDefault().observe(this, new BaseActivity.prefetchWithMultipleUrls(new IAuthTabCallbackStubProxy()));
    }

    static final class onNavigationEvent implements Function1<SetDetectableSize, Unit> {
        onNavigationEvent() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallback((SetDetectableSize) obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallback(SetDetectableSize setDetectableSize) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("action_type", "click");
            setDetectableSize.onExtraCallback("screen_name", PlccCardTransactionActivity.this.getScreenName());
        }
    }

    public static final class ICustomTabsCallback implements CardMonthSelectDialog.onNavigationEvent {
        private static short[] asInterface;
        private static final byte[] $$a = {32, 13, -54, -47};
        private static final int $$b = 125;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onTransact = 0;
        private static int asBinder = 1;
        private static int onExtraCallback = -784906213;
        private static int onNavigationEvent = -1538795509;
        private static int IAuthTabCallback = -2136628403;
        private static byte[] onWarmupCompleted = {-3, -1, 13, 8};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r7, short r8, short r9) {
            /*
                int r8 = r8 * 2
                int r8 = 1 - r8
                byte[] r0 = viva.republica.toss.card.PlccCardTransactionActivity.ICustomTabsCallback.$$a
                int r7 = r7 * 3
                int r7 = 115 - r7
                int r9 = r9 + 4
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r8
                r7 = r9
                r5 = r2
                goto L2a
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r7
                int r9 = r9 + 1
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r8) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L25:
                r3 = r0[r9]
                r6 = r9
                r9 = r7
                r7 = r6
            L2a:
                int r3 = -r3
                int r9 = r9 + r3
                r3 = r5
                r6 = r9
                r9 = r7
                r7 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.card.PlccCardTransactionActivity.ICustomTabsCallback.$$c(byte, short, short):java.lang.String");
        }

        public static /* synthetic */ Unit onNavigationEvent(PlccCardTransactionActivity plccCardTransactionActivity, int i, SetDetectableSize setDetectableSize) throws Throwable {
            int i2 = 2 % 2;
            int i3 = asBinder + 119;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                onExtraCallbackWithResult(plccCardTransactionActivity, i, setDetectableSize);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(plccCardTransactionActivity, i, setDetectableSize);
            int i4 = onTransact + 23;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallbackWithResult;
        }

        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            int i4;
            int i5;
            int i6 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 43424), (ViewConfiguration.getTapTimeout() >> 16) + 42, ImageFormat.getBitsPerPixel(0) + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                Object obj = null;
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i7 = $10 + 67;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                long j = 0;
                if (i4 != 0) {
                    int i9 = $11 + 95;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    byte[] bArr = onWarmupCompleted;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i10 = 0;
                        while (i10 < length) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - MotionEvent.axisFromString("")), 56 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), 2167 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -299036574, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i10] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i10++;
                            j = 0;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        int i11 = $11 + 75;
                        $10 = i11 % 128;
                        if (i11 % 2 != 0) {
                            byte[] bArr3 = onWarmupCompleted;
                            Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore("", 0) + 43424), 41 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i5 = ((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] - 4629411779493505016L)) - ((int) (onNavigationEvent ^ (-4629411779493505016L)));
                        } else {
                            byte[] bArr4 = onWarmupCompleted;
                            Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 43424), 42 - Color.red(0), TextUtils.getOffsetBefore("", 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i5 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L)));
                        }
                        iIntValue = (byte) i5;
                    } else {
                        iIntValue = (short) (((short) (asInterface[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    }
                }
                if (iIntValue > 0) {
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ (-4629411779493505016L))) + i4;
                    Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), 86 - (Process.myTid() >> 22), ImageFormat.getBitsPerPixel(0) + 9568, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr5 = onWarmupCompleted;
                    if (bArr5 != null) {
                        int i12 = $10 + 105;
                        $11 = i12 % 128;
                        int i13 = i12 % 2;
                        int length2 = bArr5.length;
                        byte[] bArr6 = new byte[length2];
                        for (int i14 = 0; i14 < length2; i14++) {
                            bArr6[i14] = (byte) (bArr5[i14] ^ (-4629411779493505016L));
                        }
                        bArr5 = bArr6;
                    }
                    boolean z = bArr5 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        int i15 = $11 + 113;
                        $10 = i15 % 128;
                        if (i15 % 2 != 0) {
                            throw null;
                        }
                        if (!z) {
                            short[] sArr = asInterface;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            byte[] bArr7 = onWarmupCompleted;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b));
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

        ICustomTabsCallback() {
        }

        public void onExtraCallbackWithResult(int i) throws Throwable {
            int i2 = 2 % 2;
            int i3 = onTransact + 73;
            asBinder = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                Object[] objArr = {PlccCardTransactionActivity.this.ICustomTabsServiceDefault()};
                if (i != ((Integer) EnvelopedData.onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), objArr, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 469955197, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -469955195, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).intValue()) {
                    EnvelopedData.onExtraCallback(PlccCardTransactionActivity.this.ICustomTabsServiceDefault(), i, false, 2, null);
                    ConvertByteArrayToFloatArray.onWarmupCompleted("tosscreditcard__payment_history_select_month", false, (String) null, (List) null, (Map) null, new PlccCardTransactionActivity$showSelectMonthDialog$1$.ExternalSyntheticLambda0(PlccCardTransactionActivity.this, i), 30, (Object) null);
                }
                int i4 = asBinder + 117;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            Object[] objArr2 = {PlccCardTransactionActivity.this.ICustomTabsServiceDefault()};
            ((Integer) EnvelopedData.onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), objArr2, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 469955197, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -469955195, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).intValue();
            obj.hashCode();
            throw null;
        }

        private static final Unit onExtraCallbackWithResult(PlccCardTransactionActivity plccCardTransactionActivity, int i, SetDetectableSize setDetectableSize) throws Throwable {
            int i2 = 2 % 2;
            int i3 = asBinder + 49;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1WriteTypedObject = CommonModule_closeView.onWarmupCompleted.writeTypedObject();
            Calendar calendarOnNavigationEvent = plccCardTransactionActivity.onNavigationEvent().onNavigationEvent();
            calendarOnNavigationEvent.add(2, i);
            String str = idGeneratorExternalSyntheticLambda1WriteTypedObject.format(calendarOnNavigationEvent.getTime());
            setDetectableSize.onExtraCallback("action_type", "click");
            setDetectableSize.onExtraCallback("screen_name", plccCardTransactionActivity.getScreenName());
            Object[] objArr = new Object[1];
            a((short) Color.red(0), (byte) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) - 1970311187, (-618822353) - (Process.myTid() >> 22), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr);
            setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
            Unit unit = Unit.INSTANCE;
            int i5 = onTransact + 93;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }
    }

    static final class onExtraCallback implements Function1<SetDetectableSize, Unit> {
        onExtraCallback() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallbackWithResult((SetDetectableSize) obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallbackWithResult(SetDetectableSize setDetectableSize) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("action_type", "click");
            setDetectableSize.onExtraCallback("screen_name", PlccCardTransactionActivity.this.getScreenName());
        }
    }

    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "");
        getMenuInflater().inflate(R.menu.menu_text_item, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.item_text);
        if (menuItemFindItem == null) {
            return true;
        }
        menuItemFindItem.setTitle(R.string.option_menu_item_card_setting);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onOptionsItemSelected(@NotNull MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        if (menuItem.getItemId() == R.id.item_text) {
            startActivity(PlccSettingV2Activity.Companion.onWarmupCompleted(this));
            ConvertByteArrayToFloatArray.onWarmupCompleted("tosscreditcard__payment_history_view_more", false, (String) null, (List) null, (Map) null, new PlccCardTransactionActivity$.ExternalSyntheticLambda1(this), 30, (Object) null);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(PlccCardTransactionActivity plccCardTransactionActivity, SetDetectableSize setDetectableSize) {
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("action_type", "click");
        setDetectableSize.onExtraCallback("screen_name", plccCardTransactionActivity.getScreenName());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onWarmupCompleted(nativeToCircleWithBorderFilter nativetocirclewithborderfilter) {
        StringBuilder sb = new StringBuilder();
        sb.append("토스신용카드");
        String strOnWarmupCompleted = nativetocirclewithborderfilter.onWarmupCompleted();
        if (strOnWarmupCompleted.length() < 4) {
            strOnWarmupCompleted = null;
        }
        if (strOnWarmupCompleted != null) {
            sb.append("(" + StringsKt.takeLast(strOnWarmupCompleted, 4) + ")");
        }
        setTitle(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onExtraCallbackWithResult(int i) {
        OriginatorIdentifierOrKey originatorIdentifierOrKey = OriginatorIdentifierOrKey.onExtraCallbackWithResult;
        FlowMeasureLazyPolicyExternalSyntheticLambda3 supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Object[] objArr = {ICustomTabsServiceDefault()};
        int iIntValue = ((Integer) EnvelopedData.onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), objArr, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 469955197, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -469955195, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).intValue();
        String string = getString(R.string.app_plcc_benefit_date_select_bottom_sheet_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        originatorIdentifierOrKey.onWarmupCompleted(supportFragmentManager, (4 & 2) != 0 ? 0 : iIntValue, (4 & 4) != 0 ? 0 : 0, (4 & 8) != 0 ? 3 : i, string, (4 & 32) != 0 ? null : new ICustomTabsCallback());
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public static /* synthetic */ Intent IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult, Context context, long j, toCircle tocircle, int i, Object obj) {
            if ((i & 4) != 0) {
                tocircle = null;
            }
            return onextracallbackwithresult.onExtraCallbackWithResult(context, j, tocircle);
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context, long j, @Nullable toCircle tocircle) {
            Intrinsics.checkNotNullParameter(context, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) PlccCardTransactionActivity.class).putExtra("extra_card_id", j).putExtra("extra_plcc_card", tocircle);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            return intentPutExtra;
        }
    }

    @Override // viva.republica.toss.card.Hilt_PlccCardTransactionActivity
    public void onStart() {
        super.onStart();
    }

    @Override // viva.republica.toss.card.Hilt_PlccCardTransactionActivity
    public void onResume() {
        super.onResume();
    }

    @Override // viva.republica.toss.card.Hilt_PlccCardTransactionActivity
    public void onPause() {
        super.onPause();
    }

    @Override // viva.republica.toss.card.Hilt_PlccCardTransactionActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public static final class IAuthTabCallbackDefault implements Function1<Boolean, Unit> {
        public IAuthTabCallbackDefault() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onWarmupCompleted(obj);
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(Boolean bool) {
            PlccCardTransactionActivity.this.updateVisuals().setRefreshing(bool.booleanValue());
        }
    }

    public static final class IAuthTabCallbackStub implements Function1<Unit, Unit> {
        public IAuthTabCallbackStub() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallbackWithResult(obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallbackWithResult(Unit unit) {
            ConvertByteArrayToFloatArray.onWarmupCompleted("tosscreditcard__payment_history_cashback", false, (String) null, (List) null, (Map) null, PlccCardTransactionActivity.this.new onNavigationEvent(), 30, (Object) null);
        }
    }

    public static final class IAuthTabCallback_Parcel implements Function1<Throwable, Unit> {
        public IAuthTabCallback_Parcel() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onWarmupCompleted(obj);
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(Throwable th) {
            Throwable th2 = th;
            Intrinsics.checkNotNull(th2);
            getParamImp.onWarmupCompleted(th2, PlccCardTransactionActivity.this, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        }
    }

    public static final class access000 implements Function1<toCircle, Unit> {
        public access000() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onWarmupCompleted(obj);
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(toCircle tocircle) {
            toCircle tocircle2 = tocircle;
            PlccIssueStatusActivity.onWarmupCompleted onwarmupcompleted = PlccIssueStatusActivity.Companion;
            BaseActivity baseActivity = PlccCardTransactionActivity.this;
            Intrinsics.checkNotNull(tocircle2);
            getNavigationBar.IAuthTabCallback(onwarmupcompleted.onExtraCallbackWithResult(baseActivity, tocircle2), PlccCardTransactionActivity.this);
        }
    }

    public static final class asBinder implements Function1<List<? extends getOther>, Unit> {
        public asBinder() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onWarmupCompleted(obj);
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(List<? extends getOther> list) {
            List<? extends getOther> list2 = list;
            toHashtable tohashtable = PlccCardTransactionActivity.this.IAuthTabCallbackStub;
            Intrinsics.checkNotNull(list2);
            tohashtable.onNavigationEvent(list2);
        }
    }

    public static final class asInterface implements Function1<Integer, Unit> {
        public asInterface() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onWarmupCompleted(obj);
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(Integer num) {
            Integer num2 = num;
            PlccCardTransactionActivity plccCardTransactionActivity = PlccCardTransactionActivity.this;
            Intrinsics.checkNotNull(num2);
            plccCardTransactionActivity.onExtraCallbackWithResult(num2.intValue());
        }
    }

    public static final class onTransact implements Function1<nativeToCircleWithBorderFilter, Unit> {
        public onTransact() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallback(obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallback(nativeToCircleWithBorderFilter nativetocirclewithborderfilter) {
            nativeToCircleWithBorderFilter nativetocirclewithborderfilter2 = nativetocirclewithborderfilter;
            if (nativetocirclewithborderfilter2 != null) {
                PlccCardTransactionActivity.this.onWarmupCompleted(nativetocirclewithborderfilter2);
            }
        }
    }
}
