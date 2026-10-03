package viva.republica.toss.membership.profile.photo;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.tbruyelle.rxpermissions2.RxPermissions;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageServiceDefault;
import o.IPostMessageService_Parcel;
import o.ITrustedWebActivityCallback;
import o.PlayerErrorCode;
import o.PreviewView1ExternalSyntheticLambda2;
import o.SetDetectableSize;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TitleBarRightButtonView;
import o.access13800;
import o.access14300;
import o.clearTestDevices;
import o.findResAndMsg;
import o.getByteBuffer;
import o.getTypedExportedConstants;
import o.initMiniApp;
import o.logAndOpenStore;
import o.maybeUpdateAnimatable;
import o.minFresh;
import o.noStore;
import o.onPageExit;
import o.onSessionEnded;
import o.setMessageBytes;
import o.setRandomHost;
import o.shouldBeKeptAsChild;
import o.zzad;
import o.zzag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.membership.profile.photo.PhotoChangeActivity$;
import viva.republica.toss.membership.profile.photo.PhotoChangeActivity$initView$1$;
import viva.republica.toss.membership.profile.photo.PhotoCropActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PhotoChangeActivity extends Hilt_PhotoChangeActivity {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    public static final int IAuthTabCallbackDefault = 8;
    private clearTestDevices IAuthTabCallback_Parcel;
    private PhotoChangeView asBinder;
    private getTypedExportedConstants asInterface;

    @Inject
    public zzad environments;

    @Inject
    public zzag tossClock;
    private String access000 = "";
    private Uri onTransact = Uri.EMPTY;
    private final IEngagementSignalsCallback_Parcel<IPostMessageServiceDefault> getInterfaceDescriptor = registerForActivityResult(new IPostMessageService_Parcel.onTransact(), new onSessionEnded() { // from class: viva.republica.toss.membership.profile.photo.PhotoChangeActivity$$ExternalSyntheticLambda1
        public final void onActivityResult(Object obj) {
            PhotoChangeActivity.onWarmupCompleted(this.f$0, (Uri) obj);
        }
    });
    private final IEngagementSignalsCallback_Parcel<Uri> access100 = registerForActivityResult(new IPostMessageService_Parcel.access000(), new onSessionEnded() { // from class: viva.republica.toss.membership.profile.photo.PhotoChangeActivity$$ExternalSyntheticLambda2
        public final void onActivityResult(Object obj) {
            PhotoChangeActivity.IAuthTabCallback(this.f$0, ((Boolean) obj).booleanValue());
        }
    });
    private final IEngagementSignalsCallback_Parcel<Intent> IAuthTabCallbackStub = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.membership.profile.photo.PhotoChangeActivity$$ExternalSyntheticLambda3
        public final Object invoke(Object obj) {
            return PhotoChangeActivity.onExtraCallback(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });

    public long getScreenId() {
        return 1008841L;
    }

    public static final class onNavigationEvent implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        public static final onNavigationEvent onExtraCallback = new onNavigationEvent();

        public final void onNavigationEvent(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        }

        public /* synthetic */ Object invoke(Object obj) {
            onNavigationEvent((initMiniApp.onWarmupCompleted) obj);
            return Unit.INSTANCE;
        }
    }

    public final zzag onNavigationEvent() {
        zzag zzagVar = this.tossClock;
        if (zzagVar != null) {
            return zzagVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final zzad IAuthTabCallback() {
        zzad zzadVar = this.environments;
        if (zzadVar != null) {
            return zzadVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onWarmupCompleted(PhotoChangeActivity photoChangeActivity, Uri uri) {
        if (uri != null) {
            IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = photoChangeActivity.IAuthTabCallbackStub;
            PhotoCropActivity.onWarmupCompleted onwarmupcompleted = PhotoCropActivity.Companion;
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            iEngagementSignalsCallback_Parcel.onNavigationEvent(onwarmupcompleted.onNavigationEvent(photoChangeActivity, string, Long.parseLong(PlayerErrorCode.onMinimized()), "import_picture"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void IAuthTabCallback(PhotoChangeActivity photoChangeActivity, boolean z) {
        if (!z || Intrinsics.areEqual(photoChangeActivity.onTransact, Uri.EMPTY)) {
            return;
        }
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = photoChangeActivity.IAuthTabCallbackStub;
        PhotoCropActivity.onWarmupCompleted onwarmupcompleted = PhotoCropActivity.Companion;
        String string = photoChangeActivity.onTransact.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        iEngagementSignalsCallback_Parcel.onNavigationEvent(onwarmupcompleted.onNavigationEvent(photoChangeActivity, string, Long.parseLong(PlayerErrorCode.onMinimized()), "take_picture"));
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static long onExtraCallbackWithResult = 6149018921088461338L;
        Object L$0;
        int label;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        public static /* synthetic */ Unit IAuthTabCallback(PhotoChangeActivity photoChangeActivity, Throwable th) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(photoChangeActivity, th);
            }
            onExtraCallbackWithResult(photoChangeActivity, th);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit IAuthTabCallback(PhotoChangeActivity photoChangeActivity, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = onNavigationEvent(photoChangeActivity, setDetectableSize);
            if (i3 != 0) {
                int i4 = 37 / 0;
            }
            return unitOnNavigationEvent;
        }

        public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
            int i7 = ~i2;
            int i8 = ~(i7 | i3);
            int i9 = ~i3;
            int i10 = ~(i9 | i2);
            int i11 = ~((~i) | i3);
            int i12 = i10 | i11;
            int i13 = i11 | (~(i7 | i9));
            int i14 = i3 + i2 + i4 + ((-1232316077) * i5) + ((-263306238) * i6);
            int i15 = i14 * i14;
            int i16 = (((-69115011) * i3) - 1785593856) + (933837065 * i2) + (763021048 * i8) + (1765973124 * i12) + ((-1765973124) * i13) + (1696858112 * i4) + (1319895040 * i5) + (1514668032 * i6) + (1334968320 * i15);
            int i17 = ((i3 * (-2046307327)) - 1888090795) + (i2 * (-2046308995)) + (i8 * 1112) + (i12 * (-556)) + (i13 * 556) + (i4 * (-2046307883)) + (i5 * 1526207759) + (i6 * (-1095616598)) + (i15 * 1719271424);
            return i16 + ((i17 * i17) * 2111700992) != 1 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr);
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[0];
            Object obj = objArr[1];
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult2 = PhotoChangeActivity.this.new onExtraCallbackWithResult((access13800) objArr[2]);
            int i2 = IAuthTabCallback + 95;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult2;
        }

        public static /* synthetic */ Unit onNavigationEvent(PhotoChangeActivity photoChangeActivity, clearTestDevices cleartestdevices) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unit = (Unit) onExtraCallbackWithResult(PushInfo.Companion.onExtraCallback(), -1662531927, 1662531927, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{photoChangeActivity, cleartestdevices}, PushInfo.Companion.onExtraCallback());
            int i4 = onExtraCallback + 45;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 98 / 0;
            }
            return unit;
        }

        public static /* synthetic */ Unit onNavigationEvent(PhotoChangeActivity photoChangeActivity, clearTestDevices cleartestdevices, shouldBeKeptAsChild shouldbekeptaschild) throws IOException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 3;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(photoChangeActivity, cleartestdevices, shouldbekeptaschild);
            if (i3 != 0) {
                int i4 = 73 / 0;
            }
            return unitIAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws NumberFormatException {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800<? super Unit>) obj2);
            int i4 = IAuthTabCallback + 115;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 58 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws NumberFormatException {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                objInvokeSuspend = ((access13800) onExtraCallbackWithResult(PushInfo.Companion.onExtraCallback(), 1892277201, -1892277200, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{this, findresandmsg, access13800Var}, PushInfo.Companion.onExtraCallback())).invokeSuspend(Unit.INSTANCE);
                int i3 = 42 / 0;
            } else {
                objInvokeSuspend = ((access13800) onExtraCallbackWithResult(PushInfo.Companion.onExtraCallback(), 1892277201, -1892277200, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{this, findresandmsg, access13800Var}, PushInfo.Companion.onExtraCallback())).invokeSuspend(Unit.INSTANCE);
            }
            int i4 = onExtraCallback + 101;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            int i3 = $10 + 5;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i5 = $10 + 121;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 24 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 19628 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i6] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() / (onExtraCallbackWithResult - 5407414049857832247L);
                        try {
                            Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 60 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 6383 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback2).invoke(null, objArr3);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24, 19628 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i7] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                        Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 59 - KeyEvent.getDeadChar(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), Color.red(0) + 59, 6383 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2);
        }

        private static final Unit onNavigationEvent(PhotoChangeActivity photoChangeActivity, SetDetectableSize setDetectableSize) throws Throwable {
            String str;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                if (photoChangeActivity.access000.length() == 0) {
                    int i3 = IAuthTabCallback + 63;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    str = "picture_n";
                } else {
                    str = "picture_y";
                }
                Object[] objArr = new Object[1];
                a(new char[]{44889, 27323, 9347, 65157}, 50670 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr);
                setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
                return Unit.INSTANCE;
            }
            photoChangeActivity.access000.length();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static final Unit IAuthTabCallback(PhotoChangeActivity photoChangeActivity, clearTestDevices cleartestdevices, shouldBeKeptAsChild shouldbekeptaschild) throws IOException {
            int i = 2 % 2;
            if (!(!shouldbekeptaschild.onNavigationEvent)) {
                int i2 = IAuthTabCallback + 73;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                photoChangeActivity.onNavigationEvent(cleartestdevices);
            } else {
                Toast.makeText((Context) photoChangeActivity.getActivity(), (CharSequence) photoChangeActivity.getString(R.string.profile_toast_request_camera_permission), 0).show();
                int i4 = onExtraCallback + 45;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static final Unit onExtraCallbackWithResult(PhotoChangeActivity photoChangeActivity, Throwable th) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Toast.makeText((Context) photoChangeActivity.getActivity(), (CharSequence) photoChangeActivity.getString(R.string.profile_toast_request_camera_permission), 0).show();
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 5;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 86 / 0;
            }
            return unit;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws IOException {
            PhotoChangeActivity photoChangeActivity = (PhotoChangeActivity) objArr[0];
            clearTestDevices cleartestdevices = (clearTestDevices) objArr[1];
            int i = 2 % 2;
            photoChangeActivity.IAuthTabCallback_Parcel = cleartestdevices;
            if (cleartestdevices.onNavigationEvent()) {
                getByteBuffer getbytebufferOnTransact = new RxPermissions(photoChangeActivity).onTransact(new String[]{"android.permission.CAMERA"});
                Intrinsics.checkNotNullExpressionValue(getbytebufferOnTransact, "");
                photoChangeActivity.onNavigationEvent((PhotoChangeActivity) setMessageBytes.onExtraCallbackWithResult(getbytebufferOnTransact, new PhotoChangeActivity$initView$1$.ExternalSyntheticLambda0(photoChangeActivity), (Function0) null, new PhotoChangeActivity$initView$1$.ExternalSyntheticLambda1(photoChangeActivity, cleartestdevices), 2, (Object) null));
            } else if (cleartestdevices.onWarmupCompleted()) {
                photoChangeActivity.onNavigationEvent(cleartestdevices);
            } else {
                photoChangeActivity.onWarmupCompleted(cleartestdevices);
                int i2 = IAuthTabCallback + 43;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
            }
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 53;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final Object invokeSuspend(Object obj) throws NumberFormatException {
            PhotoChangeActivity photoChangeActivity;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onExtraCallback = i2 % 128;
            PhotoChangeView photoChangeView = null;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                photoChangeView.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                PhotoChangeActivity photoChangeActivity2 = PhotoChangeActivity.this;
                TitleBarRightButtonView titleBarRightButtonView = TitleBarRightButtonView.onExtraCallback;
                long j = Long.parseLong(PlayerErrorCode.onMinimized());
                this.L$0 = photoChangeActivity2;
                this.label = 1;
                Object objOnExtraCallbackWithResult = titleBarRightButtonView.onExtraCallbackWithResult(j, this);
                if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                    int i4 = IAuthTabCallback + 33;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }
                photoChangeActivity = photoChangeActivity2;
                obj = objOnExtraCallbackWithResult;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                photoChangeActivity = (PhotoChangeActivity) this.L$0;
                ResultKt.onNavigationEvent(obj);
            }
            String str = (String) obj;
            if (str == null) {
                int i6 = onExtraCallback + 107;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                str = "";
            }
            photoChangeActivity.access000 = str;
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1008843L, false, (String) null, (Map) null, new PhotoChangeActivity$initView$1$.ExternalSyntheticLambda2(PhotoChangeActivity.this), 14, (Object) null);
            PhotoChangeView photoChangeView2 = PhotoChangeActivity.this.asBinder;
            if (photoChangeView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i8 = onExtraCallback + 105;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 4 % 3;
                }
            } else {
                photoChangeView = photoChangeView2;
            }
            photoChangeView.setEmojiList(new PhotoChangeActivity$initView$1$.ExternalSyntheticLambda3(PhotoChangeActivity.this));
            return Unit.INSTANCE;
        }

        private static final Unit IAuthTabCallback(PhotoChangeActivity photoChangeActivity, clearTestDevices cleartestdevices) {
            return (Unit) onExtraCallbackWithResult(PushInfo.Companion.onExtraCallback(), -1662531927, 1662531927, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{photoChangeActivity, cleartestdevices}, PushInfo.Companion.onExtraCallback());
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return (access13800) onExtraCallbackWithResult(PushInfo.Companion.onExtraCallback(), 1892277201, -1892277200, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{this, obj, access13800Var}, PushInfo.Companion.onExtraCallback());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onExtraCallback(final PhotoChangeActivity photoChangeActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            Intent intentOnExtraCallbackWithResult = iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
            String stringExtra = intentOnExtraCallbackWithResult != null ? intentOnExtraCallbackWithResult.getStringExtra("imageUri") : null;
            if (stringExtra == null) {
                stringExtra = "";
            }
            TitleBarRightButtonView.onExtraCallback.onWarmupCompleted(stringExtra);
            PhotoChangeView photoChangeView = photoChangeActivity.asBinder;
            if (photoChangeView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                photoChangeView = null;
            }
            photoChangeView.IAuthTabCallback(stringExtra);
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1008845L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.membership.profile.photo.PhotoChangeActivity$$ExternalSyntheticLambda0
                public final Object invoke(Object obj) {
                    return PhotoChangeActivity.onExtraCallback(this.f$0, (SetDetectableSize) obj);
                }
            }, 14, (Object) null);
            photoChangeActivity.setResult(-1);
            getTypedExportedConstants gettypedexportedconstants = photoChangeActivity.asInterface;
            if (gettypedexportedconstants != null) {
                gettypedexportedconstants.dismiss();
            }
        }
        photoChangeActivity.IAuthTabCallback_Parcel = null;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(PhotoChangeActivity photoChangeActivity, SetDetectableSize setDetectableSize) {
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("picture", "Y");
        clearTestDevices cleartestdevices = photoChangeActivity.IAuthTabCallback_Parcel;
        setDetectableSize.onExtraCallback("profile_emoji_url", cleartestdevices != null ? cleartestdevices.onExtraCallback() : null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.membership.profile.photo.Hilt_PhotoChangeActivity
    public void onCreate(@Nullable Bundle bundle) {
        Uri uri;
        super.onCreate(bundle);
        if (bundle != null && (uri = (Uri) ((Parcelable) PreviewView1ExternalSyntheticLambda2.onNavigationEvent(bundle, "cameraOutputUri", Uri.class))) != null) {
            this.onTransact = uri;
        }
        this.asBinder = new PhotoChangeView(this, null, 0, 6, null);
        setContentView(R.layout.activity_photo_change);
        setEngagementSignalsCallback();
        onNavigationEvent onnavigationevent = onNavigationEvent.onExtraCallback;
        PhotoChangeView photoChangeView = null;
        logAndOpenStore.IAuthTabCallback(this, (Long) null);
        getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(this, 0, false, false, -1L, onnavigationevent, 14, (DefaultConstructorMarker) null);
        Context context = gettypedexportedconstants.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        PhotoChangeView photoChangeView2 = this.asBinder;
        if (photoChangeView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            photoChangeView2 = null;
        }
        linearLayout.addView(photoChangeView2);
        gettypedexportedconstants.setContentView(linearLayout);
        gettypedexportedconstants.setOnDismissListener(new PhotoChangeActivity$.ExternalSyntheticLambda4(this));
        this.asInterface = gettypedexportedconstants;
        PhotoChangeView photoChangeView3 = this.asBinder;
        if (photoChangeView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            photoChangeView = photoChangeView3;
        }
        photoChangeView.setDialog(this.asInterface);
        getTypedExportedConstants gettypedexportedconstants2 = this.asInterface;
        if (gettypedexportedconstants2 != null) {
            gettypedexportedconstants2.show();
        }
        minFresh.onNavigationEvent(this, noStore.Companion.IAuthTabCallbackStub());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(PhotoChangeActivity photoChangeActivity, DialogInterface dialogInterface) {
        photoChangeActivity.finish();
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("cameraOutputUri", this.onTransact);
    }

    private final void setEngagementSignalsCallback() {
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(null), 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onWarmupCompleted(clearTestDevices cleartestdevices) {
        PhotoChangeView photoChangeView = this.asBinder;
        if (photoChangeView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            photoChangeView = null;
        }
        photoChangeView.IAuthTabCallback(cleartestdevices.onExtraCallback());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onNavigationEvent(clearTestDevices cleartestdevices) throws IOException {
        if (cleartestdevices.onWarmupCompleted()) {
            this.getInterfaceDescriptor.onNavigationEvent(ITrustedWebActivityCallback.onExtraCallbackWithResult(IPostMessageService_Parcel.onTransact.onExtraCallback.onNavigationEvent, 0, false, (IPostMessageService_Parcel.onTransact.onExtraCallbackWithResult) null, 14, (Object) null));
            return;
        }
        if (cleartestdevices.onNavigationEvent()) {
            try {
                Uri uriForFile = FileProvider.getUriForFile(this, IAuthTabCallback().onUnminimized(), File.createTempFile("Toss_profile_" + onNavigationEvent().IAuthTabCallbackDefault(), ".jpg", getCacheDir()));
                this.onTransact = uriForFile;
                IEngagementSignalsCallback_Parcel<Uri> iEngagementSignalsCallback_Parcel = this.access100;
                Intrinsics.checkNotNullExpressionValue(uriForFile, "");
                iEngagementSignalsCallback_Parcel.onNavigationEvent(uriForFile);
            } catch (Exception e) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "PhotoChangeActivity", "failed to take picture", e, (Map) null, 8, (Object) null);
            }
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new Intent(context, (Class<?>) PhotoChangeActivity.class);
        }
    }

    @Override // viva.republica.toss.membership.profile.photo.Hilt_PhotoChangeActivity
    public void onStart() {
        super.onStart();
    }

    @Override // viva.republica.toss.membership.profile.photo.Hilt_PhotoChangeActivity
    public void onResume() {
        super.onResume();
    }

    @Override // viva.republica.toss.membership.profile.photo.Hilt_PhotoChangeActivity
    public void onPause() {
        super.onPause();
    }

    @Override // viva.republica.toss.membership.profile.photo.Hilt_PhotoChangeActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
