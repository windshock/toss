package viva.republica.toss.send.periodic;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.ViewModel;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tosssecurities.singlepage.earning_call.EarningCallComposeView$;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AFj1rSDK;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.CheckMask;
import o.CloseableUtils;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.EncryptedContentInfoParser;
import o.NativeMapCompanion;
import o.NativeModule;
import o.ParamImpl;
import o.ProcessTextApi23ImplExternalSyntheticLambda0;
import o.ReactMarkerMarkerListener;
import o.ResetInputBGRLivenessChecker;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TypeUtils2;
import o.TypeUtils7;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.access2800;
import o.access8100;
import o.findResAndMsg;
import o.followRedirects;
import o.fromArray;
import o.fromBundle;
import o.getBorderRadius;
import o.getJSMessageQueueThread;
import o.getLongName;
import o.getMediaViewVideoRendererApi;
import o.getNativeModulesMessageQueueThread;
import o.getPackageType;
import o.getShine;
import o.getSupportedHighSpeedResolutionsFor;
import o.getTileModeX;
import o.getWrite;
import o.hasVaryAll;
import o.isHighSpeedSupported;
import o.maybeRemoveAttachStateListener;
import o.maybeUpdateAnimatable;
import o.moduleName;
import o.onCatalystInstanceDestroy;
import o.onDisclaimerClick;
import o.onJsBridgeReady;
import o.removeCameraStateObserver;
import o.setRandomHost;
import o.ycxycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.network.model.transfer.MyAccountInfo;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferDraftRequest;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferPostParam;
import viva.republica.toss.send.periodic.view.PeriodicTransferPicker;
import viva.republica.toss.send.v3.ReceiverType;
import viva.republica.toss.send.v3.TransferMessageActivity;
import viva.republica.toss.send.v4.receiver.ReceiverParam;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PeriodicTransferEditViewModel extends ViewModel {
    public static final IAuthTabCallback Companion;
    private static int ICustomTabsService_Parcel;
    private static int IEngagementSignalsCallback;
    private static short[] IEngagementSignalsCallbackDefault;
    private static byte[] access200;
    private static int onSessionEnded;
    public static final int onWarmupCompleted;
    private static int writeTypedList;
    private final getBorderRadius<Unit> IAuthTabCallback;
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallbackDefault;
    private final getBorderRadius<Boolean> IAuthTabCallbackStub;
    private final CameraPresenceProviderExternalSyntheticLambda6 IAuthTabCallbackStubProxy;
    private final CameraPresenceProviderExternalSyntheticLambda6 IAuthTabCallback_Parcel;
    private final CameraPresenceProviderExternalSyntheticLambda6 ICustomTabsCallback;
    private final CameraPresenceProviderExternalSyntheticLambda6 ICustomTabsCallbackDefault;
    private final CameraPresenceProviderExternalSyntheticLambda6 ICustomTabsCallbackStub;
    private getPackageType ICustomTabsCallbackStubProxy;
    private final CameraPresenceProviderExternalSyntheticLambda6 ICustomTabsCallback_Parcel;
    private final getSupportedHighSpeedResolutionsFor ICustomTabsService;
    private final CameraPresenceProviderExternalSyntheticLambda6 ICustomTabsServiceDefault;
    private final getSupportedHighSpeedResolutionsFor ICustomTabsServiceStub;
    private final getSupportedHighSpeedResolutionsFor ICustomTabsServiceStubProxy;
    private final CameraPresenceProviderExternalSyntheticLambda6 access000;
    private final CameraPresenceProviderExternalSyntheticLambda6 access100;
    private final getSupportedHighSpeedResolutionsFor asBinder;
    private final getSupportedHighSpeedResolutionsFor asInterface;
    private final CameraPresenceProviderExternalSyntheticLambda6 extraCallback;
    private final CameraPresenceProviderExternalSyntheticLambda6 extraCallbackWithResult;
    private final getSupportedHighSpeedResolutionsFor extraCommand;
    private final CameraPresenceProviderExternalSyntheticLambda6 getInterfaceDescriptor;
    private final CameraPresenceProviderExternalSyntheticLambda6 isEngagementSignalsApiAvailable;
    private final getSupportedHighSpeedResolutionsFor mayLaunchUrl;
    private final CameraPresenceProviderExternalSyntheticLambda6 newAuthTabSession;
    private final getSupportedHighSpeedResolutionsFor newSession;
    private final getSupportedHighSpeedResolutionsFor newSessionWithExtras;
    private final getSupportedHighSpeedResolutionsFor onActivityLayout;
    private final getSupportedHighSpeedResolutionsFor onActivityResized;
    private final getSupportedHighSpeedResolutionsFor onExtraCallback;
    private final getSupportedHighSpeedResolutionsFor onExtraCallbackWithResult;
    private final getSupportedHighSpeedResolutionsFor onMessageChannelReady;
    private final getSupportedHighSpeedResolutionsFor onMinimized;
    private final getSupportedHighSpeedResolutionsFor onNavigationEvent;
    private final getSupportedHighSpeedResolutionsFor onPostMessage;
    private final getSupportedHighSpeedResolutionsFor onRelationshipValidationResult;
    private final isHighSpeedSupported onTransact;
    private boolean onUnminimized;
    private PeriodicTransferModel postMessage;
    private String prefetch;
    private final getSupportedHighSpeedResolutionsFor prefetchWithMultipleUrls;
    private final getSupportedHighSpeedResolutionsFor readTypedObject;
    private final Lazy receiveFile;
    private boolean requestPostMessageChannel;
    private final getSupportedHighSpeedResolutionsFor requestPostMessageChannelWithExtras;
    private final getTileModeX<Unit> setEngagementSignalsCallback;
    private final access2800 updateVisuals;
    private final onCatalystInstanceDestroy validateRelationship;
    private final getSupportedHighSpeedResolutionsFor warmup;
    private final CameraPresenceProviderExternalSyntheticLambda6 writeTypedObject;
    private static final byte[] $$a = {90, 10, -103, 87};
    private static final int $$b = 219;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IEngagementSignalsCallbackStub = 1;
    private static int onGreatestScrollPercentageIncreased = 0;
    private static int onVerticalScrollEvent = 1;

    static final class IAuthTabCallbackDefault extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PeriodicTransferEditViewModel.onWarmupCompleted(-2017445382, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{PeriodicTransferEditViewModel.this, null, null, this}, 2017445390, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
        }
    }

    static final class asBinder extends ContinuationImpl {
        int I$0;
        int label;
        /* synthetic */ Object result;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PeriodicTransferEditViewModel.IAuthTabCallback(PeriodicTransferEditViewModel.this, (access13800) this);
        }
    }

    static final class onExtraCallback extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PeriodicTransferEditViewModel.onWarmupCompleted(-1031508994, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{PeriodicTransferEditViewModel.this, null, null, null, this}, 1031509005, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
        }
    }

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PeriodicTransferEditViewModel.this.onWarmupCompleted((Context) null, (access13800<? super Boolean>) this);
        }
    }

    static final class onTransact extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PeriodicTransferEditViewModel.onExtraCallbackWithResult(PeriodicTransferEditViewModel.this, null, null, null, null, this);
        }
    }

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] IAuthTabCallback;
        public static final /* synthetic */ int[] onExtraCallback;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[fromBundle.values().length];
            try {
                iArr[fromBundle.USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fromBundle.BANK_ACCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fromBundle.TOSS_ACCOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onWarmupCompleted = iArr;
            int[] iArr2 = new int[fromArray.values().length];
            try {
                iArr2[fromArray.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[fromArray.DAY_OF_WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[fromArray.DAILY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[fromArray.ONE_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[fromArray.DELAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[fromArray.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            IAuthTabCallback = iArr2;
            int[] iArr3 = new int[PeriodicTransferPicker.IAuthTabCallback.values().length];
            try {
                iArr3[PeriodicTransferPicker.IAuthTabCallback.MONTHLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[PeriodicTransferPicker.IAuthTabCallback.WEEKLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[PeriodicTransferPicker.IAuthTabCallback.DAILY.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[PeriodicTransferPicker.IAuthTabCallback.ONE_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            onExtraCallback = iArr3;
            int[] iArr4 = new int[ReceiverType.values().length];
            try {
                iArr4[ReceiverType.MY_TOSS.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[ReceiverType.ACCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[ReceiverType.MEMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            onExtraCallbackWithResult = iArr4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, short r7, byte r8) {
        /*
            byte[] r0 = viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.$$a
            int r6 = r6 * 2
            int r1 = 1 - r6
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r8 = r8 * 2
            int r8 = r8 + 115
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2d
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2d:
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.$$c(byte, short, byte):java.lang.String");
    }

    static {
        onSessionEnded = 0;
        prefetchWithMultipleUrls();
        Companion = new IAuthTabCallback(null);
        onWarmupCompleted = 8;
        int i = IEngagementSignalsCallbackStub + 5;
        onSessionEnded = i % 128;
        if (i % 2 != 0) {
            int i2 = 90 / 0;
        }
    }

    public static /* synthetic */ String IAuthTabCallbackDefault(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        String str;
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 89;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {periodicTransferEditViewModel};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted4 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        if (i3 != 0) {
            str = (String) onWarmupCompleted(-987882557, iOnWarmupCompleted4, iOnWarmupCompleted3, objArr, 987882581, iOnWarmupCompleted, iOnWarmupCompleted2);
            int i4 = 39 / 0;
        } else {
            str = (String) onWarmupCompleted(-987882557, iOnWarmupCompleted4, iOnWarmupCompleted3, objArr, 987882581, iOnWarmupCompleted, iOnWarmupCompleted2);
        }
        int i5 = onVerticalScrollEvent + 13;
        onGreatestScrollPercentageIncreased = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static /* synthetic */ String IAuthTabCallbackStub(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 57;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        String strOnMinimized = onMinimized(periodicTransferEditViewModel);
        int i4 = onGreatestScrollPercentageIncreased + 89;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
        return strOnMinimized;
    }

    public static /* synthetic */ long IAuthTabCallbackStubProxy(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 19;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        long jIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable(periodicTransferEditViewModel);
        int i4 = onGreatestScrollPercentageIncreased + 81;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
        return jIsEngagementSignalsApiAvailable;
    }

    public static /* synthetic */ boolean IAuthTabCallback_Parcel(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 25;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel(periodicTransferEditViewModel);
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
        return zICustomTabsCallback_Parcel;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        PeriodicTransferEditViewModel periodicTransferEditViewModel = (PeriodicTransferEditViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 47;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        String strOnPostMessage = onPostMessage(periodicTransferEditViewModel);
        int i4 = onGreatestScrollPercentageIncreased + 65;
        onVerticalScrollEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return strOnPostMessage;
    }

    public static /* synthetic */ int access000(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 19;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        int iExtraCommand = extraCommand(periodicTransferEditViewModel);
        int i4 = onVerticalScrollEvent + 111;
        onGreatestScrollPercentageIncreased = i4 % 128;
        int i5 = i4 % 2;
        return iExtraCommand;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        boolean zBooleanValue;
        PeriodicTransferEditViewModel periodicTransferEditViewModel = (PeriodicTransferEditViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 39;
        onGreatestScrollPercentageIncreased = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            zBooleanValue = ((Boolean) onWarmupCompleted(-1753133256, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{periodicTransferEditViewModel}, 1753133259, iOnWarmupCompleted, iOnWarmupCompleted2)).booleanValue();
            int i3 = 86 / 0;
        } else {
            int iOnWarmupCompleted4 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted5 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted6 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            zBooleanValue = ((Boolean) onWarmupCompleted(-1753133256, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted6, new Object[]{periodicTransferEditViewModel}, 1753133259, iOnWarmupCompleted4, iOnWarmupCompleted5)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static /* synthetic */ String access100(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 67;
        onGreatestScrollPercentageIncreased = i2 % 128;
        if (i2 % 2 == 0) {
            return onUnminimized(periodicTransferEditViewModel);
        }
        onUnminimized(periodicTransferEditViewModel);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Map asBinder(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 43;
        onGreatestScrollPercentageIncreased = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            return (Map) onWarmupCompleted(1444085618, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{periodicTransferEditViewModel}, -1444085616, iOnWarmupCompleted, iOnWarmupCompleted2);
        }
        int iOnWarmupCompleted4 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted5 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted6 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        throw null;
    }

    public static /* synthetic */ String asInterface(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 15;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        String strICustomTabsCallbackDefault = ICustomTabsCallbackDefault(periodicTransferEditViewModel);
        int i4 = onGreatestScrollPercentageIncreased + 101;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
        return strICustomTabsCallbackDefault;
    }

    public static /* synthetic */ String extraCallback(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 59;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {periodicTransferEditViewModel};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        if (i3 != 0) {
            int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            throw null;
        }
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        String str = (String) onWarmupCompleted(-711687642, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, 711687646, iOnWarmupCompleted, iOnWarmupCompleted3);
        int i4 = onVerticalScrollEvent + 113;
        onGreatestScrollPercentageIncreased = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ String getInterfaceDescriptor(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 19;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        String strOnActivityResized = onActivityResized(periodicTransferEditViewModel);
        int i4 = onVerticalScrollEvent + 23;
        onGreatestScrollPercentageIncreased = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
        return strOnActivityResized;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, Context context, PeriodicTransferEditViewModel periodicTransferEditViewModel, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 101;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, context, periodicTransferEditViewModel, commonModule_setLeftEdgeTouchEnabled);
        int i4 = onGreatestScrollPercentageIncreased + 45;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, PeriodicTransferEditViewModel periodicTransferEditViewModel, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 39;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, periodicTransferEditViewModel, setDetectableSize);
        int i4 = onVerticalScrollEvent + 1;
        onGreatestScrollPercentageIncreased = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ boolean onExtraCallback(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 101;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        boolean zICustomTabsCallbackStub = ICustomTabsCallbackStub(periodicTransferEditViewModel);
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
        int i5 = onVerticalScrollEvent + 33;
        onGreatestScrollPercentageIncreased = i5 % 128;
        if (i5 % 2 == 0) {
            return zICustomTabsCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Context context, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 21;
        onGreatestScrollPercentageIncreased = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(context, setDetectableSize);
        }
        onExtraCallback(context, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, PeriodicTransferEditViewModel periodicTransferEditViewModel, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 121;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        Unit unit = (Unit) onWarmupCompleted(436432483, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{str, periodicTransferEditViewModel, setDetectableSize}, -436432465, iOnWarmupCompleted, iOnWarmupCompleted2);
        int i4 = onVerticalScrollEvent + 65;
        onGreatestScrollPercentageIncreased = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PeriodicTransferEditViewModel periodicTransferEditViewModel, Context context, String str, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 3;
        onVerticalScrollEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onNavigationEvent(periodicTransferEditViewModel, context, str, dialogInterface);
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(periodicTransferEditViewModel, context, str, dialogInterface);
        int i3 = onVerticalScrollEvent + 19;
        onGreatestScrollPercentageIncreased = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Context context, PeriodicTransferEditViewModel periodicTransferEditViewModel, TypeUtils7 typeUtils7) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 13;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        Unit unit = (Unit) onWarmupCompleted(-765510949, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{context, periodicTransferEditViewModel, typeUtils7}, 765510963, iOnWarmupCompleted, iOnWarmupCompleted2);
        int i4 = onGreatestScrollPercentageIncreased + 11;
        onVerticalScrollEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, PeriodicTransferEditViewModel periodicTransferEditViewModel, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 49;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, periodicTransferEditViewModel, dialogInterface);
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, PeriodicTransferEditViewModel periodicTransferEditViewModel, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 7;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnWarmupCompleted4 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted5 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted6 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        Unit unit = (Unit) onWarmupCompleted(-310552638, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted6, new Object[]{str, periodicTransferEditViewModel, setDetectableSize}, 310552654, iOnWarmupCompleted4, iOnWarmupCompleted5);
        int i3 = onGreatestScrollPercentageIncreased + 9;
        onVerticalScrollEvent = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ boolean onNavigationEvent(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 69;
        onVerticalScrollEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            mayLaunchUrl(periodicTransferEditViewModel);
            obj.hashCode();
            throw null;
        }
        boolean zMayLaunchUrl = mayLaunchUrl(periodicTransferEditViewModel);
        int i3 = onGreatestScrollPercentageIncreased + 85;
        onVerticalScrollEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return zMayLaunchUrl;
        }
        throw null;
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) throws Throwable {
        Context context = (Context) objArr[0];
        PeriodicTransferEditViewModel periodicTransferEditViewModel = (PeriodicTransferEditViewModel) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 125;
        onGreatestScrollPercentageIncreased = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onNavigationEvent(context, periodicTransferEditViewModel, setDetectableSize);
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(context, periodicTransferEditViewModel, setDetectableSize);
        int i3 = onGreatestScrollPercentageIncreased + 59;
        onVerticalScrollEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ String onTransact(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 59;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        String typedObject = readTypedObject(periodicTransferEditViewModel);
        int i4 = onVerticalScrollEvent + 103;
        onGreatestScrollPercentageIncreased = i4 % 128;
        int i5 = i4 % 2;
        return typedObject;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) throws Throwable {
        int i7 = ~((~i5) | i);
        int i8 = (~((~i) | (~i4))) | i7;
        int i9 = i | i4;
        int i10 = i + i4 + i6 + ((-39394691) * i3) + ((-2104995841) * i2);
        int i11 = i10 * i10;
        int i12 = (i * (-1880913482)) + 198443008 + ((-1880913482) * i4) + ((-1126725195) * i7) + (i8 * 1126725195) + (1126725195 * i9) + ((-754188288) * i6) + ((-1529085952) * i3) + ((-319553536) * i2) + ((-289079296) * i11);
        int i13 = ((i * 1773844906) - 1404835566) + (i4 * 1773844906) + (i7 * (-613)) + (i8 * 613) + (i9 * 613) + (i6 * 1773845519) + (i3 * 1055723859) + (i2 * 1996616689) + (i11 * (-1450508288));
        switch (i12 + (i13 * i13 * (-778371072))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return IAuthTabCallback(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return IAuthTabCallbackDefault(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return asBinder(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return IAuthTabCallback_Parcel(objArr);
            case 11:
                return IAuthTabCallbackStubProxy(objArr);
            case 12:
                return access100(objArr);
            case 13:
                return getInterfaceDescriptor(objArr);
            case 14:
                Context context = (Context) objArr[0];
                PeriodicTransferEditViewModel periodicTransferEditViewModel = (PeriodicTransferEditViewModel) objArr[1];
                TypeUtils7 typeUtils7 = (TypeUtils7) objArr[2];
                int i14 = 2 % 2;
                int i15 = onGreatestScrollPercentageIncreased + 125;
                onVerticalScrollEvent = i15 % 128;
                int i16 = i15 % 2;
                Intrinsics.checkNotNullParameter(typeUtils7, "");
                typeUtils7.onExtraCallbackWithResult(context.getString(R.string.app_transfer_period_and_amount, periodicTransferEditViewModel.IAuthTabCallbackStub(), getLongName.onExtraCallbackWithResult(Long.valueOf(periodicTransferEditViewModel.onWarmupCompleted()), "", (ParamImpl) null, 2, (Object) null)));
                Unit unit = Unit.INSTANCE;
                int i17 = onGreatestScrollPercentageIncreased + 59;
                onVerticalScrollEvent = i17 % 128;
                int i18 = i17 % 2;
                return unit;
            case 15:
                return access000(objArr);
            case 16:
                String str = (String) objArr[0];
                PeriodicTransferEditViewModel periodicTransferEditViewModel2 = (PeriodicTransferEditViewModel) objArr[1];
                SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
                int i19 = 2 % 2;
                int i20 = onGreatestScrollPercentageIncreased + 97;
                onVerticalScrollEvent = i20 % 128;
                int i21 = i20 % 2;
                Intrinsics.checkNotNullParameter(setDetectableSize, "");
                Object[] objArr2 = new Object[1];
                a((short) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) View.resolveSizeAndState(0, 0, 0), (-1126624721) + (Process.myTid() >> 22), (-1214758144) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (-4) - KeyEvent.keyCodeFromString(""), objArr2);
                setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str);
                Object[] objArr3 = new Object[1];
                a((short) (ImageFormat.getBitsPerPixel(0) + 1), (byte) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (-1126624714) - Color.argb(0, 0, 0, 0), Process.getGidForName("") - 1214758142, TextUtils.indexOf("", "", 0) - 5, objArr3);
                setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), "leave");
                setDetectableSize.onExtraCallback(periodicTransferEditViewModel2.onRelationshipValidationResult());
                Unit unit2 = Unit.INSTANCE;
                int i22 = onGreatestScrollPercentageIncreased + 79;
                onVerticalScrollEvent = i22 % 128;
                int i23 = i22 % 2;
                return unit2;
            case 17:
                return extraCallback(objArr);
            case 18:
                return extraCallbackWithResult(objArr);
            case 19:
                return ICustomTabsCallback(objArr);
            case 20:
                PeriodicTransferEditViewModel periodicTransferEditViewModel3 = (PeriodicTransferEditViewModel) objArr[0];
                int i24 = 2 % 2;
                int i25 = onVerticalScrollEvent + 95;
                onGreatestScrollPercentageIncreased = i25 % 128;
                int i26 = i25 % 2;
                String strIAuthTabCallback = NativeModule.onExtraCallbackWithResult.IAuthTabCallback(periodicTransferEditViewModel3.onMessageChannelReady());
                int i27 = onGreatestScrollPercentageIncreased + 91;
                onVerticalScrollEvent = i27 % 128;
                int i28 = i27 % 2;
                return strIAuthTabCallback;
            case 21:
                return writeTypedObject(objArr);
            case 22:
                return readTypedObject(objArr);
            case 23:
                return onPostMessage(objArr);
            case 24:
                return onActivityResized(objArr);
            case 25:
                return onActivityLayout(objArr);
            case 26:
                return onMinimized(objArr);
            case 27:
                return onMessageChannelReady(objArr);
            case 28:
                PeriodicTransferEditViewModel periodicTransferEditViewModel4 = (PeriodicTransferEditViewModel) objArr[0];
                int i29 = 2 % 2;
                int i30 = onVerticalScrollEvent + 37;
                onGreatestScrollPercentageIncreased = i30 % 128;
                int i31 = i30 % 2;
                String str2 = (String) periodicTransferEditViewModel4.prefetchWithMultipleUrls.onExtraCallbackWithResult();
                int i32 = onGreatestScrollPercentageIncreased + 105;
                onVerticalScrollEvent = i32 % 128;
                int i33 = i32 % 2;
                return str2;
            case 29:
                return ICustomTabsCallbackDefault(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ String onWarmupCompleted(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 11;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            return (String) onWarmupCompleted(-158377447, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{periodicTransferEditViewModel}, 158377467, iOnWarmupCompleted, iOnWarmupCompleted2);
        }
        int iOnWarmupCompleted4 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted5 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted6 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Context context, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 125;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            return (Unit) onWarmupCompleted(1312855289, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{context, setDetectableSize}, -1312855276, iOnWarmupCompleted, iOnWarmupCompleted2);
        }
        int iOnWarmupCompleted4 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted5 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted6 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        Unit unit = (Unit) onWarmupCompleted(1312855289, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted6, new Object[]{context, setDetectableSize}, -1312855276, iOnWarmupCompleted4, iOnWarmupCompleted5);
        int i3 = 70 / 0;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PeriodicTransferEditViewModel periodicTransferEditViewModel, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 19;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(periodicTransferEditViewModel, setDetectableSize);
        int i4 = onVerticalScrollEvent + 11;
        onGreatestScrollPercentageIncreased = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Inject
    public PeriodicTransferEditViewModel(@NotNull access2800 access2800Var) {
        Intrinsics.checkNotNullParameter(access2800Var, "");
        this.updateVisuals = access2800Var;
        this.validateRelationship = onCatalystInstanceDestroy.onWarmupCompleted;
        this.receiveFile = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel$$ExternalSyntheticLambda11
            public final Object invoke() {
                return PeriodicTransferEditViewModel.asBinder(this.f$0);
            }
        });
        this.requestPostMessageChannelWithExtras = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onMessageChannelReady = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        Boolean bool = Boolean.FALSE;
        this.extraCommand = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onRelationshipValidationResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.ICustomTabsServiceStub = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.ICustomTabsService = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.ICustomTabsServiceDefault = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel$$ExternalSyntheticLambda18
            public final Object invoke() {
                return Boolean.valueOf(PeriodicTransferEditViewModel.IAuthTabCallback_Parcel(this.f$0));
            }
        });
        this.onTransact = removeCameraStateObserver.IAuthTabCallback(0L);
        this.getInterfaceDescriptor = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel$$ExternalSyntheticLambda19
            public final Object invoke() {
                return PeriodicTransferEditViewModel.extraCallback(this.f$0);
            }
        });
        this.ICustomTabsCallback_Parcel = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel$$ExternalSyntheticLambda20
            public final Object invoke() {
                return Long.valueOf(PeriodicTransferEditViewModel.IAuthTabCallbackStubProxy(this.f$0));
            }
        });
        this.IAuthTabCallback_Parcel = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel$$ExternalSyntheticLambda21
            public final Object invoke() {
                return PeriodicTransferEditViewModel.onTransact(this.f$0);
            }
        });
        this.IAuthTabCallbackDefault = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.ICustomTabsCallbackStub = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel$$ExternalSyntheticLambda22
            public final Object invoke() {
                Object[] objArr = {this.f$0};
                int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
                int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
                return Boolean.valueOf(((Boolean) PeriodicTransferEditViewModel.onWarmupCompleted(549631037, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, -549631025, iOnWarmupCompleted, iOnWarmupCompleted2)).booleanValue());
            }
        });
        this.readTypedObject = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.asBinder = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onNavigationEvent = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(CollectionsKt.emptyList(), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.ICustomTabsCallback = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel$$ExternalSyntheticLambda23
            public final Object invoke() {
                return PeriodicTransferEditViewModel.asInterface(this.f$0);
            }
        });
        getBorderRadius<Unit> getborderradiusOnWarmupCompleted = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        this.IAuthTabCallback = getborderradiusOnWarmupCompleted;
        this.setEngagementSignalsCallback = ycxycx.onExtraCallbackWithResult(getborderradiusOnWarmupCompleted);
        this.IAuthTabCallbackStub = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        this.ICustomTabsServiceStubProxy = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.newSessionWithExtras = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.extraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel$$ExternalSyntheticLambda24
            public final Object invoke() {
                return PeriodicTransferEditViewModel.onWarmupCompleted(this.f$0);
            }
        });
        this.writeTypedObject = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel$$ExternalSyntheticLambda25
            public final Object invoke() {
                Object[] objArr = {this.f$0};
                int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
                int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
                return (String) PeriodicTransferEditViewModel.onWarmupCompleted(823167823, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, -823167804, iOnWarmupCompleted, iOnWarmupCompleted2);
            }
        });
        this.onExtraCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.access100 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel$$ExternalSyntheticLambda26
            public final Object invoke() {
                return PeriodicTransferEditViewModel.IAuthTabCallbackDefault(this.f$0);
            }
        });
        this.newSession = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.ICustomTabsCallbackDefault = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel$$ExternalSyntheticLambda12
            public final Object invoke() {
                return Boolean.valueOf(PeriodicTransferEditViewModel.onExtraCallback(this.f$0));
            }
        });
        this.warmup = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onPostMessage = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.IAuthTabCallbackStubProxy = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel$$ExternalSyntheticLambda13
            public final Object invoke() {
                return PeriodicTransferEditViewModel.IAuthTabCallbackStub(this.f$0);
            }
        });
        this.onActivityLayout = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.mayLaunchUrl = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.newAuthTabSession = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel$$ExternalSyntheticLambda14
            public final Object invoke() {
                return Integer.valueOf(PeriodicTransferEditViewModel.access000(this.f$0));
            }
        });
        this.prefetchWithMultipleUrls = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.extraCallback = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel$$ExternalSyntheticLambda15
            public final Object invoke() {
                return PeriodicTransferEditViewModel.access100(this.f$0);
            }
        });
        this.onActivityResized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.access000 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel$$ExternalSyntheticLambda16
            public final Object invoke() {
                return PeriodicTransferEditViewModel.getInterfaceDescriptor(this.f$0);
            }
        });
        this.asInterface = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.TRUE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.isEngagementSignalsApiAvailable = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel$$ExternalSyntheticLambda17
            public final Object invoke() {
                return Boolean.valueOf(PeriodicTransferEditViewModel.onNavigationEvent(this.f$0));
            }
        });
    }

    public static final /* synthetic */ Object IAuthTabCallback(PeriodicTransferEditViewModel periodicTransferEditViewModel, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 67;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = periodicTransferEditViewModel.onExtraCallbackWithResult((access13800<? super Boolean>) access13800Var);
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
        int i5 = onVerticalScrollEvent + 53;
        onGreatestScrollPercentageIncreased = i5 % 128;
        if (i5 % 2 == 0) {
            return objOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static final /* synthetic */ getBorderRadius ICustomTabsCallback(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 23;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        getBorderRadius<Unit> getborderradius = periodicTransferEditViewModel.IAuthTabCallback;
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        return getborderradius;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) throws Throwable {
        PeriodicTransferEditViewModel periodicTransferEditViewModel = (PeriodicTransferEditViewModel) objArr[0];
        TypeUtils2 typeUtils2 = (TypeUtils2) objArr[1];
        PeriodicTransferPostParam periodicTransferPostParam = (PeriodicTransferPostParam) objArr[2];
        access13800<? super Unit> access13800Var = (access13800) objArr[3];
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 57;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 == 0) {
            periodicTransferEditViewModel.onNavigationEvent(typeUtils2, periodicTransferPostParam, access13800Var);
            throw null;
        }
        Object objOnNavigationEvent = periodicTransferEditViewModel.onNavigationEvent(typeUtils2, periodicTransferPostParam, access13800Var);
        int i3 = onGreatestScrollPercentageIncreased + 49;
        onVerticalScrollEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return objOnNavigationEvent;
        }
        throw null;
    }

    public static final /* synthetic */ getBorderRadius extraCallbackWithResult(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 53;
        int i3 = i2 % 128;
        onVerticalScrollEvent = i3;
        int i4 = i2 % 2;
        getBorderRadius<Boolean> getborderradius = periodicTransferEditViewModel.IAuthTabCallbackStub;
        int i5 = i3 + 53;
        onGreatestScrollPercentageIncreased = i5 % 128;
        if (i5 % 2 == 0) {
            return getborderradius;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(PeriodicTransferEditViewModel periodicTransferEditViewModel, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 93;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(1562157607, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{periodicTransferEditViewModel, th}, -1562157597, iOnWarmupCompleted, iOnWarmupCompleted2);
        int i4 = onVerticalScrollEvent + 57;
        onGreatestScrollPercentageIncreased = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(PeriodicTransferEditViewModel periodicTransferEditViewModel, Context context, SessionTrackerb sessionTrackerb, getNativeModulesMessageQueueThread.onExtraCallback onextracallback, PeriodicTransferPostParam periodicTransferPostParam, access13800 access13800Var) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 93;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 == 0) {
            periodicTransferEditViewModel.IAuthTabCallback(context, sessionTrackerb, onextracallback, periodicTransferPostParam, access13800Var);
            throw null;
        }
        Object objIAuthTabCallback = periodicTransferEditViewModel.IAuthTabCallback(context, sessionTrackerb, onextracallback, periodicTransferPostParam, access13800Var);
        int i3 = onVerticalScrollEvent + 89;
        onGreatestScrollPercentageIncreased = i3 % 128;
        int i4 = i3 % 2;
        return objIAuthTabCallback;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(PeriodicTransferEditViewModel periodicTransferEditViewModel, Date date) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 45;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        periodicTransferEditViewModel.IAuthTabCallback(date);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ PeriodicTransferDraftRequest writeTypedObject(PeriodicTransferEditViewModel periodicTransferEditViewModel) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 103;
        onGreatestScrollPercentageIncreased = i2 % 128;
        if (i2 % 2 == 0) {
            return periodicTransferEditViewModel.setEngagementSignalsCallback();
        }
        periodicTransferEditViewModel.setEngagementSignalsCallback();
        throw null;
    }

    public final onCatalystInstanceDestroy mayLaunchUrl() {
        onCatalystInstanceDestroy oncatalystinstancedestroy;
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased;
        int i3 = i2 + 21;
        onVerticalScrollEvent = i3 % 128;
        if (i3 % 2 == 0) {
            oncatalystinstancedestroy = this.validateRelationship;
            int i4 = 89 / 0;
        } else {
            oncatalystinstancedestroy = this.validateRelationship;
        }
        int i5 = i2 + 85;
        onVerticalScrollEvent = i5 % 128;
        int i6 = i5 % 2;
        return oncatalystinstancedestroy;
    }

    public final void IAuthTabCallbackDefault(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 5;
        int i3 = i2 % 128;
        onVerticalScrollEvent = i3;
        int i4 = i2 % 2;
        this.prefetch = str;
        int i5 = i3 + 23;
        onGreatestScrollPercentageIncreased = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final String ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 23;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        String str = this.prefetch;
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        PeriodicTransferEditViewModel periodicTransferEditViewModel = (PeriodicTransferEditViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 23;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        a((short) TextUtils.indexOf("", "", 0, 0), (byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-1126624710) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (-1214758145) - ExpandableListView.getPackedPositionGroup(0L), TextUtils.indexOf("", "") - 1, objArr2);
        Map mapOnNavigationEvent = access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), periodicTransferEditViewModel.prefetch));
        int i4 = onGreatestScrollPercentageIncreased + 9;
        onVerticalScrollEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return mapOnNavigationEvent;
        }
        throw null;
    }

    public final Map<String, String> onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 53;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Map<String, String> map = (Map) this.receiveFile.getValue();
        int i3 = onGreatestScrollPercentageIncreased + 89;
        onVerticalScrollEvent = i3 % 128;
        int i4 = i3 % 2;
        return map;
    }

    public final void IAuthTabCallbackDefault(boolean z) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 57;
        int i3 = i2 % 128;
        onGreatestScrollPercentageIncreased = i3;
        int i4 = i2 % 2;
        this.requestPostMessageChannel = z;
        int i5 = i3 + 125;
        onVerticalScrollEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onTransact(boolean z) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 29;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        this.onUnminimized = z;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r7 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r7 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        r7 = viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.onVerticalScrollEvent + 121;
        viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.onGreatestScrollPercentageIncreased = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean ICustomTabsCallback_Parcel(viva.republica.toss.send.periodic.PeriodicTransferEditViewModel r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.onGreatestScrollPercentageIncreased
            int r1 = r1 + 55
            int r2 = r1 % 128
            viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.onVerticalScrollEvent = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L1a
            long r5 = r7.onWarmupCompleted()
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L50
            goto L22
        L1a:
            long r5 = r7.onWarmupCompleted()
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L50
        L22:
            java.lang.String r1 = r7.ICustomTabsService()
            if (r1 == 0) goto L50
            int r1 = r1.length()
            if (r1 == 0) goto L50
            int r1 = viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.onGreatestScrollPercentageIncreased
            int r1 = r1 + 41
            int r3 = r1 % 128
            viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.onVerticalScrollEvent = r3
            int r1 = r1 % r0
            java.util.Date r7 = r7.requestPostMessageChannel()
            if (r1 != 0) goto L43
            r1 = 34
            int r1 = r1 / r2
            if (r7 == 0) goto L50
            goto L45
        L43:
            if (r7 == 0) goto L50
        L45:
            int r7 = viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.onVerticalScrollEvent
            int r7 = r7 + 121
            int r1 = r7 % 128
            viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.onGreatestScrollPercentageIncreased = r1
            int r7 = r7 % r0
            r7 = 1
            return r7
        L50:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.ICustomTabsCallback_Parcel(viva.republica.toss.send.periodic.PeriodicTransferEditViewModel):boolean");
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        PeriodicTransferEditViewModel periodicTransferEditViewModel = (PeriodicTransferEditViewModel) objArr[0];
        int i = 2 % 2;
        Object obj = null;
        if (periodicTransferEditViewModel.onWarmupCompleted() == 0) {
            int i2 = onGreatestScrollPercentageIncreased + 25;
            onVerticalScrollEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return "";
            }
            obj.hashCode();
            throw null;
        }
        String strValueOf = String.valueOf(periodicTransferEditViewModel.onWarmupCompleted());
        int i3 = onVerticalScrollEvent + 71;
        onGreatestScrollPercentageIncreased = i3 % 128;
        if (i3 % 2 == 0) {
            return strValueOf;
        }
        throw null;
    }

    private static final long isEngagementSignalsApiAvailable(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 95;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 == 0) {
            periodicTransferEditViewModel.validateRelationship.IAuthTabCallback(periodicTransferEditViewModel.isEngagementSignalsApiAvailable(), periodicTransferEditViewModel.onMessageChannelReady(), periodicTransferEditViewModel.onNavigationEvent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long jIAuthTabCallback = periodicTransferEditViewModel.validateRelationship.IAuthTabCallback(periodicTransferEditViewModel.isEngagementSignalsApiAvailable(), periodicTransferEditViewModel.onMessageChannelReady(), periodicTransferEditViewModel.onNavigationEvent());
        int i3 = onGreatestScrollPercentageIncreased + 43;
        onVerticalScrollEvent = i3 % 128;
        int i4 = i3 % 2;
        return jIAuthTabCallback;
    }

    private static final String readTypedObject(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 63;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        if (periodicTransferEditViewModel.onWarmupCompleted() > periodicTransferEditViewModel.extraCallback()) {
            int i4 = onGreatestScrollPercentageIncreased + 69;
            onVerticalScrollEvent = i4 % 128;
            int i5 = i4 % 2;
            return AFj1rSDK.onExtraCallback.onExtraCallback(R.string.app_send_periodic___a2a0154976, new Object[]{getLongName.onNavigationEvent(periodicTransferEditViewModel.extraCallback(), (ParamImpl) null, 1, (Object) null)});
        }
        if (periodicTransferEditViewModel.onWarmupCompleted() < 10000) {
            int i6 = onVerticalScrollEvent + 101;
            onGreatestScrollPercentageIncreased = i6 % 128;
            if (i6 % 2 == 0) {
                return null;
            }
            throw null;
        }
        String strReceiveFile = periodicTransferEditViewModel.receiveFile();
        int i7 = onGreatestScrollPercentageIncreased + 95;
        onVerticalScrollEvent = i7 % 128;
        if (i7 % 2 != 0) {
            return strReceiveFile;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        PeriodicTransferEditViewModel periodicTransferEditViewModel = (PeriodicTransferEditViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 109;
        onGreatestScrollPercentageIncreased = i2 % 128;
        if (i2 % 2 != 0) {
            periodicTransferEditViewModel.onWarmupCompleted();
            periodicTransferEditViewModel.extraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (periodicTransferEditViewModel.onWarmupCompleted() <= periodicTransferEditViewModel.extraCallback()) {
            return false;
        }
        int i3 = onGreatestScrollPercentageIncreased + 59;
        int i4 = i3 % 128;
        onVerticalScrollEvent = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 39;
        onGreatestScrollPercentageIncreased = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        int i7 = 63 / 0;
        return true;
    }

    public final void IAuthTabCallback(@NotNull Context context) {
        Object objOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 25;
        onGreatestScrollPercentageIncreased = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Object[] objArr = {context, Long.valueOf(onWarmupCompleted()), true, true, 3, null};
            int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
            objOnWarmupCompleted = onJsBridgeReady.onWarmupCompleted(-1653879857, objArr, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 1653879858, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent);
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            Object[] objArr2 = {context, Long.valueOf(onWarmupCompleted()), false, false, 4, null};
            int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
            objOnWarmupCompleted = onJsBridgeReady.onWarmupCompleted(-1653879857, objArr2, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 1653879858, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent2);
        }
        getInterfaceDescriptor((String) objOnWarmupCompleted);
    }

    public final MyAccountInfo isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 35;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        MyAccountInfo myAccountInfo = (MyAccountInfo) onWarmupCompleted(-1460897947, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{this}, 1460897969, iOnWarmupCompleted, iOnWarmupCompleted2);
        int i4 = onGreatestScrollPercentageIncreased + 123;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
        return myAccountInfo;
    }

    public final List<MyAccountInfo> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 109;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        List<MyAccountInfo> listRequestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras();
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
        return listRequestPostMessageChannelWithExtras;
    }

    private static final String ICustomTabsCallbackDefault(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 45;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = NativeModule.onExtraCallbackWithResult.onExtraCallbackWithResult(periodicTransferEditViewModel.isEngagementSignalsApiAvailable());
        int i4 = onVerticalScrollEvent + 77;
        onGreatestScrollPercentageIncreased = i4 % 128;
        if (i4 % 2 == 0) {
            return strOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getTileModeX<Unit> ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased;
        int i3 = i2 + 113;
        onVerticalScrollEvent = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        getTileModeX<Unit> gettilemodex = this.setEngagementSignalsCallback;
        int i4 = i2 + 97;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
        return gettilemodex;
    }

    public final void IAuthTabCallback(@NotNull MyAccountInfo myAccountInfo) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 85;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(myAccountInfo, "");
        onExtraCallbackWithResult(myAccountInfo);
        onTransact((String) null);
        int i4 = onGreatestScrollPercentageIncreased + 51;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallback(@NotNull List<MyAccountInfo> list) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 33;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        IAuthTabCallback(list);
        int i4 = onGreatestScrollPercentageIncreased + 75;
        onVerticalScrollEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final ReceiverParam onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 75;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        ReceiverParam receiverParam = (ReceiverParam) onWarmupCompleted(376732962, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{this}, -376732956, iOnWarmupCompleted, iOnWarmupCompleted2);
        int i4 = onVerticalScrollEvent + 83;
        onGreatestScrollPercentageIncreased = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return receiverParam;
    }

    private static final String onPostMessage(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 9;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallback = NativeModule.onExtraCallbackWithResult.onExtraCallback(periodicTransferEditViewModel.onMessageChannelReady());
        int i4 = onGreatestScrollPercentageIncreased + 41;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void IAuthTabCallback(@org.jetbrains.annotations.NotNull viva.republica.toss.send.v4.receiver.ReceiverParam r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            viva.republica.toss.send.v4.receiver.ReceiverParam r2 = r6.onMessageChannelReady()
            r3 = 0
            if (r2 == 0) goto L1d
            viva.republica.toss.send.v3.ReceiverType r2 = r2.IAuthTabCallbackDefault()
            int r4 = viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.onVerticalScrollEvent
            int r4 = r4 + 109
            int r5 = r4 % 128
            viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.onGreatestScrollPercentageIncreased = r5
            int r4 = r4 % r0
            goto L1e
        L1d:
            r2 = r3
        L1e:
            viva.republica.toss.send.v3.ReceiverType r4 = r7.IAuthTabCallbackDefault()
            if (r2 == r4) goto L45
            int r2 = viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.onGreatestScrollPercentageIncreased
            int r2 = r2 + 123
            int r4 = r2 % 128
            viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.onVerticalScrollEvent = r4
            int r2 = r2 % r0
            if (r2 == 0) goto L3f
            viva.republica.toss.send.v3.ReceiverType r2 = r7.IAuthTabCallbackDefault()
            viva.republica.toss.send.v3.ReceiverType r4 = viva.republica.toss.send.v3.ReceiverType.ACCOUNT
            if (r2 != r4) goto L3b
            java.lang.String r1 = o.PlayerErrorCode.onPostMessage()
        L3b:
            r6.onExtraCallbackWithResult(r1)
            goto L45
        L3f:
            r7.IAuthTabCallbackDefault()
            viva.republica.toss.send.v3.ReceiverType r7 = viva.republica.toss.send.v3.ReceiverType.ACCOUNT
            throw r3
        L45:
            java.lang.String r1 = r6.ICustomTabsService()
            if (r1 == 0) goto L6e
            int r1 = r1.length()
            if (r1 == 0) goto L6e
            int r1 = viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.onGreatestScrollPercentageIncreased
            int r1 = r1 + 21
            int r2 = r1 % 128
            viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.onVerticalScrollEvent = r2
            int r1 = r1 % r0
            java.lang.String r0 = r6.ICustomTabsService()
            viva.republica.toss.send.v4.receiver.ReceiverParam r1 = r6.onMessageChannelReady()
            if (r1 == 0) goto L68
            java.lang.String r3 = r1.onWarmupCompleted()
        L68:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r0 == 0) goto L75
        L6e:
            java.lang.String r0 = r7.onWarmupCompleted()
            r6.asBinder(r0)
        L75:
            r6.onExtraCallback(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.IAuthTabCallback(viva.republica.toss.send.v4.receiver.ReceiverParam):void");
    }

    private static final Unit onExtraCallback(Context context, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 47;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((short) TextUtils.getOffsetBefore("", 0), (byte) (TextUtils.indexOf((CharSequence) "", '0') + 1), (-1126624722) - ((byte) KeyEvent.getModifierMetaStateMask()), (-1214758143) - (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) - 3, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), context.getString(R.string.transfer_request_account_receiver_name_title));
        Unit unit = Unit.INSTANCE;
        int i4 = onGreatestScrollPercentageIncreased + 67;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) throws Throwable {
        Context context = (Context) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 89;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr2 = new Object[1];
        a((short) Gravity.getAbsoluteGravity(0, 0), (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (-1126624721) + (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-1214758143) + (ViewConfiguration.getWindowTouchSlop() >> 8), (-4) - View.MeasureSpec.getMode(0), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), context.getString(R.string.transfer_request_account_receiver_name_title));
        Unit unit = Unit.INSTANCE;
        int i4 = onGreatestScrollPercentageIncreased + 35;
        onVerticalScrollEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01c1 A[PHI: r0
      0x01c1: PHI (r0v36 int) = (r0v8 int), (r0v39 int) binds: [B:48:0x01bf, B:45:0x01ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c3 A[PHI: r0
      0x01c3: PHI (r0v9 int) = (r0v8 int), (r0v39 int) binds: [B:48:0x01bf, B:45:0x01ac] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r23, byte r24, int r25, int r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.a(short, byte, int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        if (r2.length() == 0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onWarmupCompleted(@org.jetbrains.annotations.NotNull final android.content.Context r25, @org.jetbrains.annotations.NotNull o.access13800<? super java.lang.Boolean> r26) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.onWarmupCompleted(android.content.Context, o.access13800):java.lang.Object");
    }

    public final moduleName onMinimized() {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 9;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        moduleName modulenameUpdateVisuals = updateVisuals();
        int i4 = onGreatestScrollPercentageIncreased + 59;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
        return modulenameUpdateVisuals;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        int i = 2 % 2;
        moduleName modulenameOnMinimized = ((PeriodicTransferEditViewModel) objArr[0]).onMinimized();
        if (modulenameOnMinimized != null) {
            int i2 = onGreatestScrollPercentageIncreased + 69;
            onVerticalScrollEvent = i2 % 128;
            int i3 = i2 % 2;
            return PeriodicTransferPicker.Companion.onWarmupCompleted(modulenameOnMinimized.onExtraCallback(), modulenameOnMinimized.onExtraCallbackWithResult());
        }
        int i4 = onGreatestScrollPercentageIncreased + 15;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final boolean ICustomTabsCallbackStub(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        PeriodicTransferPicker.IAuthTabCallback iAuthTabCallbackOnExtraCallback;
        int i = 2 % 2;
        moduleName modulenameOnMinimized = periodicTransferEditViewModel.onMinimized();
        if (modulenameOnMinimized != null) {
            int i2 = onVerticalScrollEvent + 115;
            onGreatestScrollPercentageIncreased = i2 % 128;
            int i3 = i2 % 2;
            iAuthTabCallbackOnExtraCallback = modulenameOnMinimized.onExtraCallback();
        } else {
            iAuthTabCallbackOnExtraCallback = null;
        }
        if (iAuthTabCallbackOnExtraCallback != PeriodicTransferPicker.IAuthTabCallback.ONE_TIME) {
            return false;
        }
        int i4 = onGreatestScrollPercentageIncreased + 91;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public final void onNavigationEvent(@NotNull moduleName modulename) throws Throwable {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 7;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(modulename, "");
        onExtraCallback(modulename);
        Object obj = null;
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(1080870165, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{this, null}, -1080870150, iOnWarmupCompleted, iOnWarmupCompleted2);
        int i4 = onVerticalScrollEvent + 55;
        onGreatestScrollPercentageIncreased = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final String onMinimized(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        ResetInputBGRLivenessChecker resetInputBGRLivenessCheckerIAuthTabCallback;
        Object objIAuthTabCallback;
        int i = 2 % 2;
        Date dateRequestPostMessageChannel = periodicTransferEditViewModel.requestPostMessageChannel();
        if (dateRequestPostMessageChannel == null) {
            int i2 = onVerticalScrollEvent + 55;
            onGreatestScrollPercentageIncreased = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        int i3 = onVerticalScrollEvent + 107;
        onGreatestScrollPercentageIncreased = i3 % 128;
        if (i3 % 2 != 0) {
            resetInputBGRLivenessCheckerIAuthTabCallback = CheckMask.onExtraCallbackWithResult.onWarmupCompleted.IAuthTabCallback();
            Object[] objArr = {followRedirects.onExtraCallbackWithResult};
            int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            objIAuthTabCallback = followRedirects.IAuthTabCallback(-603441979, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, 603441979, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
        } else {
            resetInputBGRLivenessCheckerIAuthTabCallback = CheckMask.onExtraCallbackWithResult.onWarmupCompleted.IAuthTabCallback();
            Object[] objArr2 = {followRedirects.onExtraCallbackWithResult};
            int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            objIAuthTabCallback = followRedirects.IAuthTabCallback(-603441979, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr2, 603441979, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
        }
        return ResetInputBGRLivenessChecker.onExtraCallback(resetInputBGRLivenessCheckerIAuthTabCallback, dateRequestPostMessageChannel, (Context) objIAuthTabCallback, (TimeZone) null, 4, (Object) null);
    }

    private static final int extraCommand(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        int i = 2 % 2;
        ReceiverParam receiverParamOnMessageChannelReady = periodicTransferEditViewModel.onMessageChannelReady();
        if (receiverParamOnMessageChannelReady != null) {
            int i2 = onGreatestScrollPercentageIncreased + 75;
            onVerticalScrollEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return NativeModule.onExtraCallbackWithResult.onExtraCallbackWithResult(receiverParamOnMessageChannelReady);
            }
            NativeModule.onExtraCallbackWithResult.onExtraCallbackWithResult(receiverParamOnMessageChannelReady);
            throw null;
        }
        int i3 = R.string.app_fragment_automatic_transfer_post___dddf0f5b1c;
        int i4 = onVerticalScrollEvent + 115;
        onGreatestScrollPercentageIncreased = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return i3;
    }

    public final Intent onNavigationEvent(@NotNull Context context) {
        String strValueOf;
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 95;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        TransferMessageActivity.onWarmupCompleted onwarmupcompleted = TransferMessageActivity.Companion;
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        String str = (String) onWarmupCompleted(-2106272258, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, 2106272283, iOnWarmupCompleted, iOnWarmupCompleted2);
        if (str == null) {
            int i4 = onVerticalScrollEvent + 85;
            onGreatestScrollPercentageIncreased = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 66 / 0;
            }
            str = "";
        }
        ReceiverParam receiverParamOnMessageChannelReady = onMessageChannelReady();
        Intrinsics.checkNotNull(receiverParamOnMessageChannelReady);
        ReceiverType receiverTypeIAuthTabCallbackDefault = receiverParamOnMessageChannelReady.IAuthTabCallbackDefault();
        ReceiverParam receiverParamOnMessageChannelReady2 = onMessageChannelReady();
        Intrinsics.checkNotNull(receiverParamOnMessageChannelReady2);
        String strOnExtraCallbackWithResult = receiverParamOnMessageChannelReady2.onExtraCallbackWithResult();
        ReceiverParam receiverParamOnMessageChannelReady3 = onMessageChannelReady();
        Intrinsics.checkNotNull(receiverParamOnMessageChannelReady3);
        String strIAuthTabCallback = receiverParamOnMessageChannelReady3.IAuthTabCallback();
        MyAccountInfo myAccountInfoIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable();
        if (myAccountInfoIsEngagementSignalsApiAvailable != null) {
            int i6 = onVerticalScrollEvent + 51;
            onGreatestScrollPercentageIncreased = i6 % 128;
            int i7 = i6 % 2;
            strValueOf = String.valueOf(myAccountInfoIsEngagementSignalsApiAvailable.IAuthTabCallbackStub());
        } else {
            strValueOf = null;
        }
        Intent intentOnExtraCallback = TransferMessageActivity.onWarmupCompleted.onExtraCallback(onwarmupcompleted, context, str, receiverTypeIAuthTabCallbackDefault, strOnExtraCallbackWithResult, strIAuthTabCallback, (onDisclaimerClick) null, strValueOf, (String) null, true, 160, (Object) null);
        int i8 = onVerticalScrollEvent + 65;
        onGreatestScrollPercentageIncreased = i8 % 128;
        if (i8 % 2 == 0) {
            return intentOnExtraCallback;
        }
        throw null;
    }

    private static final String onUnminimized(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        int i = 2 % 2;
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        String str = (String) onWarmupCompleted(380564782, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{periodicTransferEditViewModel}, -380564754, iOnWarmupCompleted, iOnWarmupCompleted2);
        if (str == null) {
            int i2 = onGreatestScrollPercentageIncreased + 113;
            onVerticalScrollEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw null;
        }
        String strOnExtraCallback = PeriodicTransferPicker.Companion.onExtraCallback(str);
        int i3 = onVerticalScrollEvent + 9;
        onGreatestScrollPercentageIncreased = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 86 / 0;
        }
        return strOnExtraCallback;
    }

    private static final String onActivityResized(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 15;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        String str = (String) onWarmupCompleted(-668121366, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{periodicTransferEditViewModel}, 668121366, iOnWarmupCompleted, iOnWarmupCompleted2);
        if (str == null) {
            return null;
        }
        int i4 = onVerticalScrollEvent + 95;
        onGreatestScrollPercentageIncreased = i4 % 128;
        int i5 = i4 % 2;
        PeriodicTransferPicker.onExtraCallback onextracallback = PeriodicTransferPicker.Companion;
        if (i5 == 0) {
            return onextracallback.onExtraCallbackWithResult(PeriodicTransferPicker.IAuthTabCallback.ONE_TIME, str);
        }
        onextracallback.onExtraCallbackWithResult(PeriodicTransferPicker.IAuthTabCallback.ONE_TIME, str);
        throw null;
    }

    private static final boolean mayLaunchUrl(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        String strICustomTabsService;
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 19;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        if (periodicTransferEditViewModel.onWarmupCompleted() <= 0) {
            return false;
        }
        int i4 = onGreatestScrollPercentageIncreased + 59;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
        if (!(!periodicTransferEditViewModel.newSessionWithExtras())) {
            return false;
        }
        int i6 = onVerticalScrollEvent + 45;
        onGreatestScrollPercentageIncreased = i6 % 128;
        if (i6 % 2 != 0) {
            periodicTransferEditViewModel.requestPostMessageChannel();
            throw null;
        }
        if (periodicTransferEditViewModel.requestPostMessageChannel() == null || (strICustomTabsService = periodicTransferEditViewModel.ICustomTabsService()) == null || strICustomTabsService.length() == 0) {
            return false;
        }
        int i7 = onGreatestScrollPercentageIncreased + 75;
        onVerticalScrollEvent = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0317 A[PHI: r3
      0x0317: PHI (r3v22 viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel$InvalidFields$Field) = 
      (r3v21 viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel$InvalidFields$Field)
      (r3v45 viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel$InvalidFields$Field)
     binds: [B:85:0x0315, B:82:0x030e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.onExtraCallbackWithResult(viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel):void");
    }

    static final class IAuthTabCallback_Parcel extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ String $endDate;
        final /* synthetic */ moduleName $period;
        final /* synthetic */ String $startDate;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback_Parcel(moduleName modulename, String str, String str2, access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(2, access13800Var);
            this.$period = modulename;
            this.$startDate = str;
            this.$endDate = str2;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return PeriodicTransferEditViewModel.this.new IAuthTabCallback_Parcel(this.$period, this.$startDate, this.$endDate, access13800Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 241
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.IAuthTabCallback_Parcel.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void onNavigationEvent(@NotNull moduleName modulename, @Nullable String str, @Nullable String str2) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 29;
        onGreatestScrollPercentageIncreased = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(modulename, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(modulename, "");
        if (str != null && NativeMapCompanion.onExtraCallback.onWarmupCompleted(str2, str)) {
            int i3 = onGreatestScrollPercentageIncreased + 51;
            onVerticalScrollEvent = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback((String) null);
            return;
        }
        getPackageType getpackagetype = this.ICustomTabsCallbackStubProxy;
        if (getpackagetype != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
        }
        this.ICustomTabsCallbackStubProxy = maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback_Parcel(modulename, str, str2, null), 3, (Object) null);
        int i5 = onVerticalScrollEvent + 65;
        onGreatestScrollPercentageIncreased = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final Unit IAuthTabCallback(String str, PeriodicTransferEditViewModel periodicTransferEditViewModel, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 41;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((short) (TextUtils.lastIndexOf("", '0') + 1), (byte) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 1126624721, (-1214758142) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (-5) - MotionEvent.axisFromString(""), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        setDetectableSize.onExtraCallback(periodicTransferEditViewModel.onRelationshipValidationResult());
        Unit unit = Unit.INSTANCE;
        int i4 = onGreatestScrollPercentageIncreased + 71;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final void onExtraCallback(@NotNull final Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        final String string = context.getString(R.string.app_send_periodic_back_pressed_dialog_title_edit);
        Intrinsics.checkNotNullExpressionValue(string, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1294489L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return PeriodicTransferEditViewModel.onExtraCallback(string, this, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context, new Function1() { // from class: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return PeriodicTransferEditViewModel.onExtraCallback(string, context, this, (CommonModule_setLeftEdgeTouchEnabled) obj);
            }
        });
        int i2 = onVerticalScrollEvent + 69;
        onGreatestScrollPercentageIncreased = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        PeriodicTransferEditViewModel periodicTransferEditViewModel = (PeriodicTransferEditViewModel) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 55;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr2 = new Object[1];
        a((short) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), Drawable.resolveOpacity(0, 0) - 1126624721, (ViewConfiguration.getDoubleTapTimeout() >> 16) - 1214758143, (-4) - KeyEvent.keyCodeFromString(""), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str);
        Object[] objArr3 = new Object[1];
        a((short) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) (Color.rgb(0, 0, 0) + 16777216), (-1126624714) - Gravity.getAbsoluteGravity(0, 0), (-1214758143) - ExpandableListView.getPackedPositionGroup(0L), (-5) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), "continue");
        setDetectableSize.onExtraCallback(periodicTransferEditViewModel.onRelationshipValidationResult());
        Unit unit = Unit.INSTANCE;
        int i4 = onVerticalScrollEvent + 23;
        onGreatestScrollPercentageIncreased = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(final String str, final PeriodicTransferEditViewModel periodicTransferEditViewModel, DialogInterface dialogInterface) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1294491L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel$$ExternalSyntheticLambda9
            public final Object invoke(Object obj) {
                return PeriodicTransferEditViewModel.onExtraCallbackWithResult(str, periodicTransferEditViewModel, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i2 = onVerticalScrollEvent + 79;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    static final class getInterfaceDescriptor extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        getInterfaceDescriptor(access13800<? super getInterfaceDescriptor> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return PeriodicTransferEditViewModel.this.new getInterfaceDescriptor(access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                onCatalystInstanceDestroy oncatalystinstancedestroyMayLaunchUrl = PeriodicTransferEditViewModel.this.mayLaunchUrl();
                PeriodicTransferDraftRequest periodicTransferDraftRequestWriteTypedObject = PeriodicTransferEditViewModel.writeTypedObject(PeriodicTransferEditViewModel.this);
                this.label = 1;
                if (oncatalystinstancedestroyMayLaunchUrl.onExtraCallback(periodicTransferDraftRequestWriteTypedObject, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onNavigationEvent(final PeriodicTransferEditViewModel periodicTransferEditViewModel, Context context, final String str, DialogInterface dialogInterface) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1294491L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel$$ExternalSyntheticLambda10
            public final Object invoke(Object obj) {
                return PeriodicTransferEditViewModel.onNavigationEvent(str, periodicTransferEditViewModel, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(periodicTransferEditViewModel), (CoroutineContext) null, (setRandomHost) null, periodicTransferEditViewModel.new getInterfaceDescriptor(null), 3, (Object) null);
        Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
        if (activityIAuthTabCallback != null) {
            int i2 = onGreatestScrollPercentageIncreased + 23;
            onVerticalScrollEvent = i2 % 128;
            int i3 = i2 % 2;
            activityIAuthTabCallback.finish();
            int i4 = onGreatestScrollPercentageIncreased + 45;
            onVerticalScrollEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(final String str, final Context context, final PeriodicTransferEditViewModel periodicTransferEditViewModel, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(str);
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(context.getString(R.string.app_send_periodic_back_pressed_dialog_desc_edit));
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, R.string.app_send_periodic_back_pressed_btn_continue, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return PeriodicTransferEditViewModel.onNavigationEvent(str, periodicTransferEditViewModel, (DialogInterface) obj);
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, R.string.app_send_periodic_back_pressed_btn_exit, new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DANGER, (TdsButtonV1View.IAuthTabCallbackDefault) null, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 14, (DefaultConstructorMarker) null), false, new Function1() { // from class: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return PeriodicTransferEditViewModel.onExtraCallbackWithResult(this.f$0, context, str, (DialogInterface) obj);
            }
        }, 4, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = onGreatestScrollPercentageIncreased + 19;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private final PeriodicTransferDraftRequest setEngagementSignalsCallback() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 7;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        PeriodicTransferDraftRequest.Companion companion = PeriodicTransferDraftRequest.Companion;
        long jOnWarmupCompleted = onWarmupCompleted();
        MyAccountInfo myAccountInfoIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable();
        ReceiverParam receiverParamOnMessageChannelReady = onMessageChannelReady();
        moduleName modulenameOnMinimized = onMinimized();
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        String str = (String) onWarmupCompleted(380564782, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{this}, -380564754, iOnWarmupCompleted, iOnWarmupCompleted2);
        int iOnWarmupCompleted4 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted5 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted6 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        String str2 = (String) onWarmupCompleted(-668121366, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted6, new Object[]{this}, 668121366, iOnWarmupCompleted4, iOnWarmupCompleted5);
        String strICustomTabsService = ICustomTabsService();
        int iOnWarmupCompleted7 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted8 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted9 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        PeriodicTransferDraftRequest periodicTransferDraftRequestOnExtraCallback = companion.onExtraCallback(null, jOnWarmupCompleted, myAccountInfoIsEngagementSignalsApiAvailable, receiverParamOnMessageChannelReady, modulenameOnMinimized, str, str2, strICustomTabsService, (String) onWarmupCompleted(-2106272258, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted9, new Object[]{this}, 2106272283, iOnWarmupCompleted7, iOnWarmupCompleted8), this.prefetch);
        int i4 = onVerticalScrollEvent + 61;
        onGreatestScrollPercentageIncreased = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
        return periodicTransferDraftRequestOnExtraCallback;
    }

    private static final Unit onExtraCallback(PeriodicTransferEditViewModel periodicTransferEditViewModel, SetDetectableSize setDetectableSize) throws Throwable {
        String str;
        String str2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        int i2 = -1;
        Object[] objArr = new Object[1];
        a((short) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (byte) TextUtils.indexOf("", ""), (-1126624718) - TextUtils.indexOf((CharSequence) "", '0', 0), (-1214758143) - View.MeasureSpec.getSize(0), (-5) - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), AFj1rSDK.onExtraCallback.onExtraCallbackWithResult(R.string.app_periodic_transfer_edit_cta_title));
        Object[] objArr2 = new Object[1];
        a((short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-1126624714) - TextUtils.getOffsetAfter("", 0), (-1214758143) - (ViewConfiguration.getJumpTapTimeout() >> 16), ExpandableListView.getPackedPositionGroup(0L) - 5, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), "edit");
        ReceiverParam receiverParamOnMessageChannelReady = periodicTransferEditViewModel.onMessageChannelReady();
        ReceiverType receiverTypeIAuthTabCallbackDefault = receiverParamOnMessageChannelReady != null ? receiverParamOnMessageChannelReady.IAuthTabCallbackDefault() : null;
        if (receiverTypeIAuthTabCallbackDefault == null) {
            int i3 = onVerticalScrollEvent + 95;
            onGreatestScrollPercentageIncreased = i3 % 128;
            int i4 = i3 % 2;
        } else {
            i2 = onWarmupCompleted.onExtraCallbackWithResult[receiverTypeIAuthTabCallbackDefault.ordinal()];
        }
        if (i2 == 1) {
            str = "toss_account";
        } else if (i2 == 2) {
            str = "account";
        } else if (i2 != 3) {
            int i5 = onGreatestScrollPercentageIncreased + 39;
            onVerticalScrollEvent = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            str = "custom";
        } else {
            int i6 = onVerticalScrollEvent + 25;
            onGreatestScrollPercentageIncreased = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 / 2;
            }
            str = "phone";
        }
        setDetectableSize.onExtraCallback("deposit_target_type", str);
        ReactMarkerMarkerListener reactMarkerMarkerListener = ReactMarkerMarkerListener.onNavigationEvent;
        setDetectableSize.onExtraCallback("is_favorite_deposit_target", reactMarkerMarkerListener.onNavigationEvent().get("is_favorite_deposit_target"));
        setDetectableSize.onExtraCallback("deposit_target_input_method", reactMarkerMarkerListener.onNavigationEvent().get("deposit_target_input_method"));
        moduleName modulenameOnMinimized = periodicTransferEditViewModel.onMinimized();
        setDetectableSize.onExtraCallback("period", modulenameOnMinimized != null ? PeriodicTransferPicker.Companion.onWarmupCompleted(modulenameOnMinimized.onExtraCallback(), modulenameOnMinimized.onExtraCallbackWithResult()) : null);
        setDetectableSize.onExtraCallback("amount", Long.valueOf(periodicTransferEditViewModel.onWarmupCompleted()));
        Object[] objArr3 = new Object[1];
        a((short) View.resolveSizeAndState(0, 0, 0), (byte) TextUtils.getOffsetAfter("", 0), TextUtils.getTrimmedLength("") - 1126624721, Color.argb(0, 0, 0, 0) - 1214758143, (-4) - TextUtils.indexOf("", ""), objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), periodicTransferEditViewModel.ICustomTabsService());
        setDetectableSize.onExtraCallback("receiver_account_memo", (String) onWarmupCompleted(-2106272258, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{periodicTransferEditViewModel}, 2106272283, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted()));
        setDetectableSize.onExtraCallback("start_date", (String) onWarmupCompleted(380564782, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{periodicTransferEditViewModel}, -380564754, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted()));
        setDetectableSize.onExtraCallback("end_date", (String) onWarmupCompleted(-668121366, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{periodicTransferEditViewModel}, 668121366, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted()));
        if (periodicTransferEditViewModel.IAuthTabCallback()) {
            int i8 = onGreatestScrollPercentageIncreased + 35;
            onVerticalScrollEvent = i8 % 128;
            int i9 = i8 % 2;
            str2 = "on";
        } else {
            str2 = "off";
        }
        setDetectableSize.onExtraCallback("alarm_in_advance", str2);
        setDetectableSize.onExtraCallback(periodicTransferEditViewModel.onRelationshipValidationResult());
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(Context context, PeriodicTransferEditViewModel periodicTransferEditViewModel, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 19;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((short) KeyEvent.normalizeMetaState(0), (byte) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (-1126624721) - View.MeasureSpec.getMode(0), TextUtils.indexOf("", "", 0) - 1214758143, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 5, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), context.getString(R.string.app_send_periodic___3a99dcdde1));
        setDetectableSize.onExtraCallback(periodicTransferEditViewModel.onRelationshipValidationResult());
        Unit unit = Unit.INSTANCE;
        int i4 = onVerticalScrollEvent + 81;
        onGreatestScrollPercentageIncreased = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object IAuthTabCallbackStubProxy(java.lang.Object[] r38) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instructions count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.IAuthTabCallbackStubProxy(java.lang.Object[]):java.lang.Object");
    }

    static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ maybeRemoveAttachStateListener<Boolean> $cont;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        asInterface(maybeRemoveAttachStateListener<? super Boolean> mayberemoveattachstatelistener, access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
            this.$cont = mayberemoveattachstatelistener;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return PeriodicTransferEditViewModel.this.new asInterface(this.$cont, access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
        
            if (r5 == r0) goto L17;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = o.access14300.onWarmupCompleted()
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.onNavigationEvent(r5)
                goto L40
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.ResultKt.onNavigationEvent(r5)
                goto L31
            L1e:
                kotlin.ResultKt.onNavigationEvent(r5)
                viva.republica.toss.send.periodic.PeriodicTransferEditViewModel r5 = viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.this
                o.getBorderRadius r5 = viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.ICustomTabsCallback(r5)
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                r4.label = r3
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 == r0) goto L58
            L31:
                viva.republica.toss.send.periodic.PeriodicTransferEditViewModel r5 = viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.this
                o.getBorderRadius r5 = viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.extraCallbackWithResult(r5)
                r4.label = r2
                java.lang.Object r5 = o.ycxycx.onExtraCallback(r5, r4)
                if (r5 != r0) goto L40
                goto L58
            L40:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                o.maybeRemoveAttachStateListener<java.lang.Boolean> r0 = r4.$cont
                kotlin.Result$Companion r1 = kotlin.Result.Companion
                java.lang.Boolean r5 = o.access14000.onNavigationEvent(r5)
                java.lang.Object r5 = kotlin.Result.constructor-impl(r5)
                r0.resumeWith(r5)
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L58:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.asInterface.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onExtraCallbackWithResult(o.access13800<? super java.lang.Boolean> r13) {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r13 instanceof viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.asBinder
            r2 = 0
            if (r1 == 0) goto L30
            int r1 = viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.onGreatestScrollPercentageIncreased
            int r1 = r1 + 59
            int r3 = r1 % 128
            viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.onVerticalScrollEvent = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L2b
            r1 = r13
            viva.republica.toss.send.periodic.PeriodicTransferEditViewModel$asBinder r1 = (viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.asBinder) r1
            int r3 = r1.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L30
            int r13 = viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.onVerticalScrollEvent
            int r13 = r13 + 99
            int r5 = r13 % 128
            viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.onGreatestScrollPercentageIncreased = r5
            int r13 = r13 % r0
            int r3 = r3 + r4
            r1.label = r3
            goto L35
        L2b:
            viva.republica.toss.send.periodic.PeriodicTransferEditViewModel$asBinder r13 = (viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.asBinder) r13
            int r13 = r13.label
            throw r2
        L30:
            viva.republica.toss.send.periodic.PeriodicTransferEditViewModel$asBinder r1 = new viva.republica.toss.send.periodic.PeriodicTransferEditViewModel$asBinder
            r1.<init>(r13)
        L35:
            java.lang.Object r13 = r1.result
            java.lang.Object r3 = o.access14300.onWarmupCompleted()
            int r4 = r1.label
            r5 = 1
            if (r4 == 0) goto L57
            if (r4 != r5) goto L4f
            int r1 = viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.onVerticalScrollEvent
            int r1 = r1 + 93
            int r2 = r1 % 128
            viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.onGreatestScrollPercentageIncreased = r2
            int r1 = r1 % r0
            kotlin.ResultKt.onNavigationEvent(r13)
            goto L94
        L4f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L57:
            kotlin.ResultKt.onNavigationEvent(r13)
            r13 = 0
            r1.I$0 = r13
            r1.label = r5
            o.setResourceInternal r13 = new o.setResourceInternal
            o.access13800 r4 = o.access14300.onWarmupCompleted(r1)
            r13.<init>(r4, r5)
            r13.onTransact()
            o.findResAndMsg r6 = o.ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(r12)
            r7 = 0
            r8 = 0
            viva.republica.toss.send.periodic.PeriodicTransferEditViewModel$asInterface r9 = new viva.republica.toss.send.periodic.PeriodicTransferEditViewModel$asInterface
            r9.<init>(r13, r2)
            r10 = 3
            r11 = 0
            o.maybeUpdateAnimatable.onNavigationEvent(r6, r7, r8, r9, r10, r11)
            java.lang.Object r13 = r13.IAuthTabCallbackDefault()
            java.lang.Object r2 = o.access14300.onWarmupCompleted()
            if (r13 != r2) goto L91
            int r2 = viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.onGreatestScrollPercentageIncreased
            int r2 = r2 + 51
            int r4 = r2 % 128
            viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.onVerticalScrollEvent = r4
            int r2 = r2 % r0
            o.access14600.IAuthTabCallback(r1)
        L91:
            if (r13 != r3) goto L94
            return r3
        L94:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            java.lang.Boolean r13 = o.access14000.onNavigationEvent(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.onExtraCallbackWithResult(o.access13800):java.lang.Object");
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ boolean $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(boolean z, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$result = z;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return PeriodicTransferEditViewModel.this.new onNavigationEvent(this.$result, access13800Var);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                getBorderRadius getborderradiusExtraCallbackWithResult = PeriodicTransferEditViewModel.extraCallbackWithResult(PeriodicTransferEditViewModel.this);
                Boolean boolOnNavigationEvent = access14000.onNavigationEvent(this.$result);
                this.label = 1;
                if (getborderradiusExtraCallbackWithResult.emit(boolOnNavigationEvent, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(z, null), 3, (Object) null);
        int i2 = onVerticalScrollEvent + 111;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0129, code lost:
    
        if (onNavigationEvent(r7, r5, (o.access13800<? super kotlin.Unit>) r8) == r2) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object IAuthTabCallback(final android.content.Context r23, o.SessionTrackerb r24, o.getNativeModulesMessageQueueThread.onExtraCallback r25, viva.republica.toss.network.model.transfer.periodic.PeriodicTransferPostParam r26, o.access13800<? super kotlin.Unit> r27) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.IAuthTabCallback(android.content.Context, o.SessionTrackerb, o.getNativeModulesMessageQueueThread$onExtraCallback, viva.republica.toss.network.model.transfer.periodic.PeriodicTransferPostParam, o.access13800):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onNavigationEvent(o.TypeUtils2 r13, viva.republica.toss.network.model.transfer.periodic.PeriodicTransferPostParam r14, o.access13800<? super kotlin.Unit> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.periodic.PeriodicTransferEditViewModel.onNavigationEvent(o.TypeUtils2, viva.republica.toss.network.model.transfer.periodic.PeriodicTransferPostParam, o.access13800):java.lang.Object");
    }

    public static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super PeriodicTransferModel>, Object> {
        final /* synthetic */ PeriodicTransferPostParam $params$inlined;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackStub(access13800 access13800Var, PeriodicTransferPostParam periodicTransferPostParam) {
            super(2, access13800Var);
            this.$params$inlined = periodicTransferPostParam;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super PeriodicTransferModel> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new IAuthTabCallbackStub(access13800Var, this.$params$inlined);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29426), 22 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 24734 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -842029757, false, "onWarmupCompleted", (Class[]) null);
                }
                Object obj2 = ((Field) objOnExtraCallback).get(null);
                try {
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1971988338);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 29425), 22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 24734 - View.resolveSizeAndState(0, 0, 0), -1154144738, false, "access000", new Class[0]);
                    }
                    getMediaViewVideoRendererApi getmediaviewvideorendererapi = (getMediaViewVideoRendererApi) ((Method) objOnExtraCallback2).invoke(obj2, null);
                    PeriodicTransferPostParam periodicTransferPostParam = this.$params$inlined;
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = getmediaviewvideorendererapi.onNavigationEvent(periodicTransferPostParam, (access13800<? super BaseApiResponse<PeriodicTransferModel>>) this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                try {
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact != null) {
                        return (PeriodicTransferModel) objOnTransact;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel");
                } catch (NullPointerException e) {
                    if (Intrinsics.areEqual(PeriodicTransferModel.class, Object.class) || Intrinsics.areEqual(PeriodicTransferModel.class, Unit.class)) {
                        return Unit.INSTANCE;
                    }
                    TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                    apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                    throw apiErrorOnExtraCallbackWithResult;
                }
            }
            TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
            if (apiErrorExtraCallbackWithResult == null) {
                throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
            }
            throw apiErrorExtraCallbackWithResult;
        }
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        PeriodicTransferEditViewModel periodicTransferEditViewModel = (PeriodicTransferEditViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 1;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 != 0) {
            PeriodicTransferModel periodicTransferModel = (PeriodicTransferModel) periodicTransferEditViewModel.requestPostMessageChannelWithExtras.onExtraCallbackWithResult();
            int i3 = onVerticalScrollEvent + 35;
            onGreatestScrollPercentageIncreased = i3 % 128;
            int i4 = i3 % 2;
            return periodicTransferModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onWarmupCompleted(PeriodicTransferModel periodicTransferModel) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 51;
        onGreatestScrollPercentageIncreased = i2 % 128;
        if (i2 % 2 != 0) {
            this.requestPostMessageChannelWithExtras.IAuthTabCallback(periodicTransferModel);
            int i3 = 27 / 0;
        } else {
            this.requestPostMessageChannelWithExtras.IAuthTabCallback(periodicTransferModel);
        }
    }

    public final Throwable readTypedObject() {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 95;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        Throwable th = (Throwable) this.onMessageChannelReady.onExtraCallbackWithResult();
        int i4 = onVerticalScrollEvent + 27;
        onGreatestScrollPercentageIncreased = i4 % 128;
        int i5 = i4 % 2;
        return th;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        PeriodicTransferEditViewModel periodicTransferEditViewModel = (PeriodicTransferEditViewModel) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 69;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        periodicTransferEditViewModel.onMessageChannelReady.IAuthTabCallback(th);
        int i4 = onGreatestScrollPercentageIncreased + 43;
        onVerticalScrollEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        PeriodicTransferEditViewModel periodicTransferEditViewModel = (PeriodicTransferEditViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 67;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) periodicTransferEditViewModel.extraCommand.onExtraCallbackWithResult()).booleanValue();
        int i4 = onVerticalScrollEvent + 89;
        onGreatestScrollPercentageIncreased = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    private final void IAuthTabCallbackStub(boolean z) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 73;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        this.extraCommand.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onGreatestScrollPercentageIncreased + 101;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public final boolean postMessage() {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 9;
        onGreatestScrollPercentageIncreased = i2 % 128;
        if (i2 % 2 == 0) {
            return ((Boolean) this.onRelationshipValidationResult.onExtraCallbackWithResult()).booleanValue();
        }
        ((Boolean) this.onRelationshipValidationResult.onExtraCallbackWithResult()).booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 17;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 == 0) {
            this.onRelationshipValidationResult.IAuthTabCallback(Boolean.valueOf(z));
            int i3 = 47 / 0;
        } else {
            this.onRelationshipValidationResult.IAuthTabCallback(Boolean.valueOf(z));
        }
        int i4 = onGreatestScrollPercentageIncreased + 59;
        onVerticalScrollEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final String ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 43;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.ICustomTabsServiceStub.onExtraCallbackWithResult();
        int i4 = onVerticalScrollEvent + 11;
        onGreatestScrollPercentageIncreased = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
        }
        return str;
    }

    public final void asInterface(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 91;
        onGreatestScrollPercentageIncreased = i2 % 128;
        if (i2 % 2 == 0) {
            this.ICustomTabsServiceStub.IAuthTabCallback(str);
            int i3 = onGreatestScrollPercentageIncreased + 107;
            onVerticalScrollEvent = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.ICustomTabsServiceStub.IAuthTabCallback(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean access100() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 53;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.onMinimized.onExtraCallbackWithResult()).booleanValue();
        int i4 = onGreatestScrollPercentageIncreased + 37;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static /* synthetic */ Object ICustomTabsCallbackDefault(Object[] objArr) {
        PeriodicTransferEditViewModel periodicTransferEditViewModel = (PeriodicTransferEditViewModel) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 103;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        periodicTransferEditViewModel.onMinimized.IAuthTabCallback(Boolean.valueOf(zBooleanValue));
        int i4 = onGreatestScrollPercentageIncreased + 111;
        onVerticalScrollEvent = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean writeTypedObject() {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 103;
        onGreatestScrollPercentageIncreased = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 2 / 0;
            return ((Boolean) this.ICustomTabsService.onExtraCallbackWithResult()).booleanValue();
        }
        return ((Boolean) this.ICustomTabsService.onExtraCallbackWithResult()).booleanValue();
    }

    public final void asInterface(boolean z) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 115;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        this.ICustomTabsService.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onVerticalScrollEvent + 115;
        onGreatestScrollPercentageIncreased = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final boolean extraCommand() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 51;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 != 0) {
            boolean zBooleanValue = ((Boolean) this.ICustomTabsServiceDefault.onExtraCallbackWithResult()).booleanValue();
            int i3 = onVerticalScrollEvent + 119;
            onGreatestScrollPercentageIncreased = i3 % 128;
            int i4 = i3 % 2;
            return zBooleanValue;
        }
        ((Boolean) this.ICustomTabsServiceDefault.onExtraCallbackWithResult()).booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 69;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        long jOnWarmupCompleted = this.onTransact.onWarmupCompleted();
        int i4 = onVerticalScrollEvent + 11;
        onGreatestScrollPercentageIncreased = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
        return jOnWarmupCompleted;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        PeriodicTransferEditViewModel periodicTransferEditViewModel = (PeriodicTransferEditViewModel) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 15;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        periodicTransferEditViewModel.onTransact.onNavigationEvent(jLongValue);
        int i4 = onVerticalScrollEvent + 97;
        onGreatestScrollPercentageIncreased = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
        return null;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 87;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 != 0) {
            String str = (String) this.getInterfaceDescriptor.onExtraCallbackWithResult();
            int i3 = onVerticalScrollEvent + 59;
            onGreatestScrollPercentageIncreased = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }
        throw null;
    }

    public final long extraCallback() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 125;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        long jLongValue = ((Number) this.ICustomTabsCallback_Parcel.onExtraCallbackWithResult()).longValue();
        int i4 = onGreatestScrollPercentageIncreased + 11;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
        return jLongValue;
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        PeriodicTransferEditViewModel periodicTransferEditViewModel = (PeriodicTransferEditViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 61;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) periodicTransferEditViewModel.IAuthTabCallback_Parcel.onExtraCallbackWithResult();
        int i4 = onGreatestScrollPercentageIncreased + 13;
        onVerticalScrollEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return str;
    }

    public final String onExtraCallbackWithResult() {
        String str;
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 3;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 == 0) {
            str = (String) this.IAuthTabCallbackDefault.onExtraCallbackWithResult();
            int i3 = 50 / 0;
        } else {
            str = (String) this.IAuthTabCallbackDefault.onExtraCallbackWithResult();
        }
        int i4 = onVerticalScrollEvent + 15;
        onGreatestScrollPercentageIncreased = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        PeriodicTransferEditViewModel periodicTransferEditViewModel = (PeriodicTransferEditViewModel) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 39;
        onVerticalScrollEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            periodicTransferEditViewModel.IAuthTabCallbackDefault.IAuthTabCallback(str);
            int i3 = onGreatestScrollPercentageIncreased + 49;
            onVerticalScrollEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            throw null;
        }
        periodicTransferEditViewModel.IAuthTabCallbackDefault.IAuthTabCallback(str);
        obj.hashCode();
        throw null;
    }

    public final boolean newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 61;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 96 / 0;
            return ((Boolean) this.ICustomTabsCallbackStub.onExtraCallbackWithResult()).booleanValue();
        }
        return ((Boolean) this.ICustomTabsCallbackStub.onExtraCallbackWithResult()).booleanValue();
    }

    private final String receiveFile() {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 61;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.readTypedObject.onExtraCallbackWithResult();
        int i4 = onGreatestScrollPercentageIncreased + 89;
        onVerticalScrollEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return str;
    }

    private final void getInterfaceDescriptor(String str) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 75;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        this.readTypedObject.IAuthTabCallback(str);
        int i4 = onVerticalScrollEvent + 97;
        onGreatestScrollPercentageIncreased = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        PeriodicTransferEditViewModel periodicTransferEditViewModel = (PeriodicTransferEditViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 63;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        MyAccountInfo myAccountInfo = (MyAccountInfo) periodicTransferEditViewModel.asBinder.onExtraCallbackWithResult();
        int i4 = onVerticalScrollEvent + 75;
        onGreatestScrollPercentageIncreased = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
        return myAccountInfo;
    }

    private final void onExtraCallbackWithResult(MyAccountInfo myAccountInfo) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 71;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        this.asBinder.IAuthTabCallback(myAccountInfo);
        int i4 = onVerticalScrollEvent + 97;
        onGreatestScrollPercentageIncreased = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final List<MyAccountInfo> requestPostMessageChannelWithExtras() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 37;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 != 0) {
            List<MyAccountInfo> list = (List) this.onNavigationEvent.onExtraCallbackWithResult();
            int i3 = onGreatestScrollPercentageIncreased + 81;
            onVerticalScrollEvent = i3 % 128;
            int i4 = i3 % 2;
            return list;
        }
        throw null;
    }

    private final void IAuthTabCallback(List<MyAccountInfo> list) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 25;
        onGreatestScrollPercentageIncreased = i2 % 128;
        if (i2 % 2 == 0) {
            this.onNavigationEvent.IAuthTabCallback(list);
        } else {
            this.onNavigationEvent.IAuthTabCallback(list);
            throw null;
        }
    }

    public final String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 121;
        onGreatestScrollPercentageIncreased = i2 % 128;
        if (i2 % 2 == 0) {
            String str = (String) this.ICustomTabsCallback.onExtraCallbackWithResult();
            int i3 = onGreatestScrollPercentageIncreased + 49;
            onVerticalScrollEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 42 / 0;
            }
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String prefetch() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 105;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.ICustomTabsServiceStubProxy.onExtraCallbackWithResult();
        int i4 = onVerticalScrollEvent + 11;
        onGreatestScrollPercentageIncreased = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void onTransact(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 85;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 == 0) {
            this.ICustomTabsServiceStubProxy.IAuthTabCallback(str);
            int i3 = 73 / 0;
        } else {
            this.ICustomTabsServiceStubProxy.IAuthTabCallback(str);
        }
        int i4 = onVerticalScrollEvent + 63;
        onGreatestScrollPercentageIncreased = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        PeriodicTransferEditViewModel periodicTransferEditViewModel = (PeriodicTransferEditViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 47;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 37 / 0;
            return (ReceiverParam) periodicTransferEditViewModel.onExtraCallbackWithResult.onExtraCallbackWithResult();
        }
        return (ReceiverParam) periodicTransferEditViewModel.onExtraCallbackWithResult.onExtraCallbackWithResult();
    }

    private final void onExtraCallback(ReceiverParam receiverParam) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 65;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult.IAuthTabCallback(receiverParam);
        int i4 = onGreatestScrollPercentageIncreased + 123;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String onActivityLayout() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 103;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return (String) this.newSessionWithExtras.onExtraCallbackWithResult();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 47;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        this.newSessionWithExtras.IAuthTabCallback(str);
        int i4 = onGreatestScrollPercentageIncreased + 37;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 75;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 != 0) {
            String str = (String) this.extraCallbackWithResult.onExtraCallbackWithResult();
            int i3 = onVerticalScrollEvent + 103;
            onGreatestScrollPercentageIncreased = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 49;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.writeTypedObject.onExtraCallbackWithResult();
        int i4 = onGreatestScrollPercentageIncreased + 89;
        onVerticalScrollEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final moduleName updateVisuals() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 89;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        moduleName modulename = (moduleName) this.onExtraCallback.onExtraCallbackWithResult();
        int i4 = onGreatestScrollPercentageIncreased + 19;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
        return modulename;
    }

    private final void onExtraCallback(moduleName modulename) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 59;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback.IAuthTabCallback(modulename);
        int i4 = onVerticalScrollEvent + 19;
        onGreatestScrollPercentageIncreased = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 93;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.access100.onExtraCallbackWithResult();
        int i4 = onGreatestScrollPercentageIncreased + 103;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        PeriodicTransferEditViewModel periodicTransferEditViewModel = (PeriodicTransferEditViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 59;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) periodicTransferEditViewModel.newSession.onExtraCallbackWithResult();
        int i4 = onGreatestScrollPercentageIncreased + 9;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        PeriodicTransferEditViewModel periodicTransferEditViewModel = (PeriodicTransferEditViewModel) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 97;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        periodicTransferEditViewModel.newSession.IAuthTabCallback(str);
        int i4 = onGreatestScrollPercentageIncreased + 81;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final boolean newSession() {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 15;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 == 0) {
            zBooleanValue = ((Boolean) this.ICustomTabsCallbackDefault.onExtraCallbackWithResult()).booleanValue();
            int i3 = 31 / 0;
        } else {
            zBooleanValue = ((Boolean) this.ICustomTabsCallbackDefault.onExtraCallbackWithResult()).booleanValue();
        }
        int i4 = onVerticalScrollEvent + 29;
        onGreatestScrollPercentageIncreased = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public final String ICustomTabsService() {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 89;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.warmup.onExtraCallbackWithResult();
        int i4 = onGreatestScrollPercentageIncreased + 113;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void asBinder(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 7;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 != 0) {
            this.warmup.IAuthTabCallback(str);
            int i3 = onVerticalScrollEvent + 91;
            onGreatestScrollPercentageIncreased = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.warmup.IAuthTabCallback(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Date requestPostMessageChannel() {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 119;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        Date date = (Date) this.onPostMessage.onExtraCallbackWithResult();
        int i4 = onVerticalScrollEvent + 51;
        onGreatestScrollPercentageIncreased = i4 % 128;
        if (i4 % 2 == 0) {
            return date;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallback(Date date) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 113;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        this.onPostMessage.IAuthTabCallback(date);
        int i4 = onVerticalScrollEvent + 1;
        onGreatestScrollPercentageIncreased = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 115;
        onGreatestScrollPercentageIncreased = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            String str = (String) this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult();
            int i3 = onGreatestScrollPercentageIncreased + 59;
            onVerticalScrollEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }
        throw null;
    }

    public final boolean extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 105;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.onActivityLayout.onExtraCallbackWithResult()).booleanValue();
        int i4 = onGreatestScrollPercentageIncreased + 71;
        onVerticalScrollEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
        return zBooleanValue;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        PeriodicTransferEditViewModel periodicTransferEditViewModel = (PeriodicTransferEditViewModel) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 33;
        onGreatestScrollPercentageIncreased = i2 % 128;
        if (i2 % 2 != 0) {
            periodicTransferEditViewModel.onActivityLayout.IAuthTabCallback(Boolean.valueOf(zBooleanValue));
            int i3 = 52 / 0;
            return null;
        }
        periodicTransferEditViewModel.onActivityLayout.IAuthTabCallback(Boolean.valueOf(zBooleanValue));
        return null;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        PeriodicTransferEditViewModel periodicTransferEditViewModel = (PeriodicTransferEditViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 39;
        onVerticalScrollEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            String str = (String) periodicTransferEditViewModel.mayLaunchUrl.onExtraCallbackWithResult();
            int i3 = onGreatestScrollPercentageIncreased + 37;
            onVerticalScrollEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }
        throw null;
    }

    public final void onExtraCallbackWithResult(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 85;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        this.mayLaunchUrl.IAuthTabCallback(str);
        int i4 = onVerticalScrollEvent + 17;
        onGreatestScrollPercentageIncreased = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        PeriodicTransferEditViewModel periodicTransferEditViewModel = (PeriodicTransferEditViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 111;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) periodicTransferEditViewModel.newAuthTabSession.onExtraCallbackWithResult()).intValue();
        int i4 = onVerticalScrollEvent + 47;
        onGreatestScrollPercentageIncreased = i4 % 128;
        if (i4 % 2 == 0) {
            return Integer.valueOf(iIntValue);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallbackStub(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 57;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        this.prefetchWithMultipleUrls.IAuthTabCallback(str);
        int i4 = onVerticalScrollEvent + 97;
        onGreatestScrollPercentageIncreased = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 63 / 0;
        }
    }

    public final String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 97;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.extraCallback.onExtraCallbackWithResult();
        int i4 = onGreatestScrollPercentageIncreased + 45;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        PeriodicTransferEditViewModel periodicTransferEditViewModel = (PeriodicTransferEditViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 99;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) periodicTransferEditViewModel.onActivityResized.onExtraCallbackWithResult();
        int i4 = onVerticalScrollEvent + 23;
        onGreatestScrollPercentageIncreased = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void IAuthTabCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 103;
        onGreatestScrollPercentageIncreased = i2 % 128;
        if (i2 % 2 == 0) {
            this.onActivityResized.IAuthTabCallback(str);
            return;
        }
        this.onActivityResized.IAuthTabCallback(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 71;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.access000.onExtraCallbackWithResult();
        int i4 = onVerticalScrollEvent + 85;
        onGreatestScrollPercentageIncreased = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean IAuthTabCallback() {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 61;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 == 0) {
            zBooleanValue = ((Boolean) this.asInterface.onExtraCallbackWithResult()).booleanValue();
            int i3 = 73 / 0;
        } else {
            zBooleanValue = ((Boolean) this.asInterface.onExtraCallbackWithResult()).booleanValue();
        }
        int i4 = onGreatestScrollPercentageIncreased + 97;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 19;
        onGreatestScrollPercentageIncreased = i2 % 128;
        if (i2 % 2 == 0) {
            this.asInterface.IAuthTabCallback(Boolean.valueOf(z));
            int i3 = onVerticalScrollEvent + 49;
            onGreatestScrollPercentageIncreased = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.asInterface.IAuthTabCallback(Boolean.valueOf(z));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String IAuthTabCallback(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (String) onWarmupCompleted(823167823, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{periodicTransferEditViewModel}, -823167804, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return ((Boolean) onWarmupCompleted(549631037, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{periodicTransferEditViewModel}, -549631025, iOnWarmupCompleted, iOnWarmupCompleted2)).booleanValue();
    }

    public static /* synthetic */ Unit onWarmupCompleted(Context context, PeriodicTransferEditViewModel periodicTransferEditViewModel, SetDetectableSize setDetectableSize) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onWarmupCompleted(1386791023, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{context, periodicTransferEditViewModel, setDetectableSize}, -1386791000, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    public static final /* synthetic */ Object onWarmupCompleted(PeriodicTransferEditViewModel periodicTransferEditViewModel, TypeUtils2 typeUtils2, PeriodicTransferPostParam periodicTransferPostParam, access13800 access13800Var) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return onWarmupCompleted(-2017445382, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{periodicTransferEditViewModel, typeUtils2, periodicTransferPostParam, access13800Var}, 2017445390, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    private static final Unit IAuthTabCallback(Context context, SetDetectableSize setDetectableSize) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onWarmupCompleted(1312855289, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{context, setDetectableSize}, -1312855276, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    private static final String onActivityLayout(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (String) onWarmupCompleted(-711687642, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{periodicTransferEditViewModel}, 711687646, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    private static final String onMessageChannelReady(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (String) onWarmupCompleted(-987882557, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{periodicTransferEditViewModel}, 987882581, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    private static final String ICustomTabsCallbackStubProxy(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (String) onWarmupCompleted(-158377447, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{periodicTransferEditViewModel}, 158377467, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    private final ReceiverParam ICustomTabsServiceStub() {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (ReceiverParam) onWarmupCompleted(376732962, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{this}, -376732956, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    private final MyAccountInfo ICustomTabsServiceDefault() {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (MyAccountInfo) onWarmupCompleted(-1460897947, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{this}, 1460897969, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    private static final boolean onRelationshipValidationResult(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return ((Boolean) onWarmupCompleted(-1753133256, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{periodicTransferEditViewModel}, 1753133259, iOnWarmupCompleted, iOnWarmupCompleted2)).booleanValue();
    }

    private static final Unit onExtraCallbackWithResult(Context context, PeriodicTransferEditViewModel periodicTransferEditViewModel, TypeUtils7 typeUtils7) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onWarmupCompleted(-765510949, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{context, periodicTransferEditViewModel, typeUtils7}, 765510963, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    private static final Map ICustomTabsService(PeriodicTransferEditViewModel periodicTransferEditViewModel) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Map) onWarmupCompleted(1444085618, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{periodicTransferEditViewModel}, -1444085616, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    private final void onExtraCallbackWithResult(Throwable th) throws Throwable {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(1562157607, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{this, th}, -1562157597, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    private static final Unit onWarmupCompleted(String str, PeriodicTransferEditViewModel periodicTransferEditViewModel, SetDetectableSize setDetectableSize) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onWarmupCompleted(436432483, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{str, periodicTransferEditViewModel, setDetectableSize}, -436432465, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    private static final Unit IAuthTabCallbackDefault(String str, PeriodicTransferEditViewModel periodicTransferEditViewModel, SetDetectableSize setDetectableSize) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onWarmupCompleted(-310552638, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{str, periodicTransferEditViewModel, setDetectableSize}, 310552654, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    public final Object onNavigationEvent(@NotNull Context context, @NotNull SessionTrackerb sessionTrackerb, @NotNull getJSMessageQueueThread getjsmessagequeuethread, @NotNull access13800<? super Unit> access13800Var) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return onWarmupCompleted(-1031508994, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{this, context, sessionTrackerb, getjsmessagequeuethread, access13800Var}, 1031509005, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    public final String onExtraCallback() {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (String) onWarmupCompleted(878453986, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{this}, -878453960, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    public final String access000() {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (String) onWarmupCompleted(-668121366, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{this}, 668121366, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    public final String ICustomTabsCallback() {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (String) onWarmupCompleted(-2106272258, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{this}, 2106272283, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    public final int onActivityResized() {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return ((Integer) onWarmupCompleted(-1593452352, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{this}, 1593452361, iOnWarmupCompleted, iOnWarmupCompleted2)).intValue();
    }

    public final String onPostMessage() {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (String) onWarmupCompleted(-791181328, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{this}, 791181329, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    public final PeriodicTransferModel onUnminimized() {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (PeriodicTransferModel) onWarmupCompleted(-1222752014, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{this}, 1222752031, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    public final String ICustomTabsCallbackStub() {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (String) onWarmupCompleted(380564782, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{this}, -380564754, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    public final boolean newAuthTabSession() {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return ((Boolean) onWarmupCompleted(1888060109, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{this}, -1888060102, iOnWarmupCompleted, iOnWarmupCompleted2)).booleanValue();
    }

    public final void onExtraCallback(long j) throws Throwable {
        Object[] objArr = {this, Long.valueOf(j)};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(-258351427, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, 258351454, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    public final void onNavigationEvent(@Nullable String str) throws Throwable {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(-1071367160, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{this, str}, 1071367165, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    public final void onWarmupCompleted(boolean z) throws Throwable {
        Object[] objArr = {this, Boolean.valueOf(z)};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(994890789, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, -994890760, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    public final void onExtraCallback(boolean z) throws Throwable {
        Object[] objArr = {this, Boolean.valueOf(z)};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(-752112251, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, 752112272, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    public final void onExtraCallback(@Nullable String str) throws Throwable {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(1080870165, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{this, str}, -1080870150, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    static void prefetchWithMultipleUrls() {
        IEngagementSignalsCallback = -413059623;
        writeTypedList = -1538795519;
        ICustomTabsService_Parcel = -333421189;
        access200 = new byte[]{-15, -16, 3, -3, -12, 27, -7, -3, -1, 13, 5, -5, 8, 5, -9, 9, -5, 8, 8, 8, 8};
    }
}
