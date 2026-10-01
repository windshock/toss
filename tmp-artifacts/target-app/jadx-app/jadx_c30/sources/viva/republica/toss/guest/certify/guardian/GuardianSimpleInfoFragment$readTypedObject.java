package viva.republica.toss.guest.certify.guardian;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.APImageInfo;
import o.AdSettingsIntegrationErrorMode;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.GeckoHubImp;
import o.MessageQueueThreadImplCompanionWhenMappings;
import o.MessageQueueThreadSpec;
import o.SetDetectableSize;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14300;
import o.access15400;
import o.findResAndMsg;
import o.getParamImp;
import o.initMiniApp;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.setAutoCaptured;
import o.setOnOutOfMemeryErrorCallback;
import o.shouldAllowBackgroundPlayback;
import o.startNewBackgroundThreadlambda0;
import viva.republica.toss.R;
import viva.republica.toss.network.model.verify.guest.GuestUnderFourteenSessionRequest;
import viva.republica.toss.network.model.verify.guest.GuestUnderFourteenUnblockOneLinkResponse;
import viva.republica.toss.share.ShareToSNSDialog;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class GuardianSimpleInfoFragment$readTypedObject extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static short[] onExtraCallback;
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    int label;
    final /* synthetic */ GuardianSimpleInfoFragment this$0;
    private static final byte[] $$a = {75, -35, 114, 51};
    private static final int $$b = 203;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallbackWithResult = 1539044712;
    private static int onNavigationEvent = -1538795450;
    private static int onWarmupCompleted = -818939652;
    private static byte[] IAuthTabCallback = {-65, 77, 76, -65, 49, ISO7816.INS_READ_RECORD_STAMPED, 101, 102, 83, 97, 65, 109, 103, 99, 94, 103, 75};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, int i2) {
        int i3;
        int i4 = i2 + 4;
        int i5 = 115 - (b * 3);
        byte[] bArr = $$a;
        int i6 = i * 3;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        if (bArr == null) {
            i5 = i7;
            int i8 = i4;
            int i9 = 0;
            i5 += -i4;
            i4 = i8;
            i3 = i9;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            int i10 = i4 + 1;
            int i11 = i3 + 1;
            i8 = i10;
            i4 = bArr[i10];
            i9 = i11;
            i5 += -i4;
            i4 = i8;
            i3 = i9;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GuardianSimpleInfoFragment$readTypedObject(GuardianSimpleInfoFragment guardianSimpleInfoFragment, access13800<? super GuardianSimpleInfoFragment$readTypedObject> access13800Var) {
        super(2, access13800Var);
        this.this$0 = guardianSimpleInfoFragment;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) throws Throwable {
        int i7 = ~i4;
        int i8 = ~i3;
        int i9 = (~(i7 | i2)) | (~(i7 | i8));
        int i10 = ~i2;
        int i11 = (~(i3 | i10 | i4)) | i9;
        int i12 = ~(i8 | i10);
        int i13 = i2 + i4 + i6 + ((-1228711472) * i5) + ((-141981132) * i);
        int i14 = i13 * i13;
        int i15 = (((-639131287) * i2) - 2072313856) + (1118068377 * i4) + (i11 * (-1268883816)) + ((-1757199664) * i9) + ((-1268883816) * i12) + ((-1908015104) * i6) + ((-287309824) * i5) + ((-1573388288) * i) + ((-2138374144) * i14);
        int i16 = ((i2 * (-646461497)) - 273503129) + (i4 * (-646460521)) + (i11 * 488) + (i9 * (-976)) + (i12 * 488) + (i6 * (-646461009)) + (i5 * 1623110960) + (i * (-2035004020)) + (i14 * 33882112);
        int i17 = i15 + (i16 * i16 * (-1051394048));
        if (i17 != 1) {
            if (i17 == 2) {
                return onExtraCallbackWithResult(objArr);
            }
            GuardianSimpleInfoFragment guardianSimpleInfoFragment = (GuardianSimpleInfoFragment) objArr[0];
            SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
            int i18 = 2 % 2;
            int i19 = onTransact + 61;
            IAuthTabCallbackStub = i19 % 128;
            int i20 = i19 % 2;
            Unit unitOnExtraCallback = onExtraCallback(guardianSimpleInfoFragment, setDetectableSize);
            int i21 = onTransact + 63;
            IAuthTabCallbackStub = i21 % 128;
            int i22 = i21 % 2;
            return unitOnExtraCallback;
        }
        GuardianSimpleInfoFragment guardianSimpleInfoFragment2 = (GuardianSimpleInfoFragment) objArr[0];
        SetDetectableSize setDetectableSize2 = (SetDetectableSize) objArr[1];
        int i23 = 2 % 2;
        int i24 = onTransact + 99;
        IAuthTabCallbackStub = i24 % 128;
        int i25 = i24 % 2;
        Object[] objArr2 = new Object[1];
        a((short) (AndroidCharacter.getMirror('0') - 168), (byte) (KeyEvent.getDeadChar(0, 0) + 52), 250528 - Color.blue(0), (-1801986176) - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 79, objArr2);
        setDetectableSize2.onExtraCallback(((String) objArr2[0]).intern(), guardianSimpleInfoFragment2.getString(R.string.guardian_simple_info_unblock_onelink_dialog_title));
        Unit unit = Unit.INSTANCE;
        int i26 = IAuthTabCallbackStub + 1;
        onTransact = i26 % 128;
        int i27 = i26 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        GuardianSimpleInfoFragment guardianSimpleInfoFragment = (GuardianSimpleInfoFragment) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(guardianSimpleInfoFragment, setDetectableSize);
        int i4 = onTransact + 19;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(GuardianSimpleInfoFragment guardianSimpleInfoFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(guardianSimpleInfoFragment, dialogInterface);
        }
        onWarmupCompleted(guardianSimpleInfoFragment, dialogInterface);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(GuardianSimpleInfoFragment guardianSimpleInfoFragment, GuestUnderFourteenUnblockOneLinkResponse guestUnderFourteenUnblockOneLinkResponse, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(guardianSimpleInfoFragment, guestUnderFourteenUnblockOneLinkResponse, dialogInterface);
        int i4 = IAuthTabCallbackStub + 23;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onNavigationEvent(GuardianSimpleInfoFragment guardianSimpleInfoFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onTransact + 109;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = setAutoCaptured.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(setAutoCaptured.onExtraCallbackWithResult(), -571214265, iOnExtraCallbackWithResult, 571214266, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{guardianSimpleInfoFragment, setDetectableSize});
        int i4 = IAuthTabCallbackStub + 35;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(GuardianSimpleInfoFragment guardianSimpleInfoFragment, GuestUnderFourteenUnblockOneLinkResponse guestUnderFourteenUnblockOneLinkResponse, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 105;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(guardianSimpleInfoFragment, guestUnderFourteenUnblockOneLinkResponse, commonModule_setLeftEdgeTouchEnabled);
        }
        onExtraCallback(guardianSimpleInfoFragment, guestUnderFourteenUnblockOneLinkResponse, commonModule_setLeftEdgeTouchEnabled);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        GuardianSimpleInfoFragment$readTypedObject guardianSimpleInfoFragment$readTypedObject = new GuardianSimpleInfoFragment$readTypedObject(this.this$0, access13800Var);
        int i2 = IAuthTabCallbackStub + 49;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return guardianSimpleInfoFragment$readTypedObject;
        }
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 5;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800<? super Unit>) obj2);
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
        int i5 = onTransact + 59;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return objOnWarmupCompleted;
        }
        throw null;
    }

    public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        GuardianSimpleInfoFragment$readTypedObject guardianSimpleInfoFragment$readTypedObjectCreate = create(findresandmsg, access13800Var);
        if (i3 == 0) {
            return guardianSimpleInfoFragment$readTypedObjectCreate.invokeSuspend(Unit.INSTANCE);
        }
        guardianSimpleInfoFragment$readTypedObjectCreate.invokeSuspend(Unit.INSTANCE);
        throw null;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        char c;
        int i4 = 2;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), Drawable.resolveOpacity(0, 0) + 42, Color.alpha(0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            char c2 = '0';
            if (i6 != 0) {
                byte[] bArr = IAuthTabCallback;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i7 = 0;
                    while (i7 < length) {
                        int i8 = $10 + 27;
                        $11 = i8 % 128;
                        int i9 = i8 % i4;
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf(BuildConfig.FLAVOR, c2) + 12844), 54 - ((byte) KeyEvent.getModifierMetaStateMask()), 2167 - (ViewConfiguration.getWindowTouchSlop() >> 8), -299036574, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i7] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i7++;
                            i4 = 2;
                            c2 = '0';
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = IAuthTabCallback;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - ImageFormat.getBitsPerPixel(0)), 42 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onExtraCallback[i + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))) + ((i6 ^ 1) ^ 1);
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 85 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), 9567 - KeyEvent.getDeadChar(0, 0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = IAuthTabCallback;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i10 = 0; i10 < length2; i10++) {
                        bArr5[i10] = (byte) (bArr4[i10] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        int i11 = $11 + 23;
                        $10 = i11 % 128;
                        if (i11 % 2 != 0) {
                            byte[] bArr6 = IAuthTabCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            c = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback << (((byte) (((byte) (bArr6[r8] * (-4629411779493505016L))) / s)) ^ b));
                        } else {
                            byte[] bArr7 = IAuthTabCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            c = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = c;
                    } else {
                        short[] sArr = onExtraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super GuestUnderFourteenUnblockOneLinkResponse>, Object> {
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ GuardianSimpleInfoFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(access13800 access13800Var, GuardianSimpleInfoFragment guardianSimpleInfoFragment) {
            super(2, access13800Var);
            this.this$0 = guardianSimpleInfoFragment;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onExtraCallback(access13800Var, this.this$0);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super GuestUnderFourteenUnblockOneLinkResponse> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                shouldAllowBackgroundPlayback shouldallowbackgroundplaybackRequestPostMessageChannelWithExtras = AdSettingsIntegrationErrorMode.onNavigationEvent.requestPostMessageChannelWithExtras();
                GuestUnderFourteenSessionRequest guestUnderFourteenSessionRequest = new GuestUnderFourteenSessionRequest(GuardianSimpleInfoFragment.getInterfaceDescriptor(this.this$0).access100());
                this.L$0 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.label = 1;
                obj = shouldallowbackgroundplaybackRequestPostMessageChannelWithExtras.onExtraCallbackWithResult(guestUnderFourteenSessionRequest, this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
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
                        return (GuestUnderFourteenUnblockOneLinkResponse) objOnTransact;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.network.model.verify.guest.GuestUnderFourteenUnblockOneLinkResponse");
                } catch (NullPointerException e) {
                    if (Intrinsics.areEqual(GuestUnderFourteenUnblockOneLinkResponse.class, Object.class) || Intrinsics.areEqual(GuestUnderFourteenUnblockOneLinkResponse.class, Unit.class)) {
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

    private static final Unit onExtraCallback(GuardianSimpleInfoFragment guardianSimpleInfoFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 115;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a((short) (Gravity.getAbsoluteGravity(0, 0) - 120), (byte) (52 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0)), ((byte) KeyEvent.getModifierMetaStateMask()) + ISOFileInfo.A1, (-1801986176) + KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), (-79) - (ViewConfiguration.getTapTimeout() >> 16), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), guardianSimpleInfoFragment.getString(R.string.guardian_simple_info_unblock_onelink_dialog_title));
        Object[] objArr2 = new Object[1];
        a((short) (Gravity.getAbsoluteGravity(0, 0) + 29), (byte) (115 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 250532 - ImageFormat.getBitsPerPixel(0), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) - 1801986193, (ViewConfiguration.getTapTimeout() >> 16) - 79, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), guardianSimpleInfoFragment.getString(im.toss.uikit.R.string.uikit_confirm));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 45;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(final GuardianSimpleInfoFragment guardianSimpleInfoFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1498983L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoFragment$showUnblockGuideDialog$1$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                Object[] objArr = {guardianSimpleInfoFragment, (SetDetectableSize) obj};
                int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
                return (Unit) GuardianSimpleInfoFragment$readTypedObject.onExtraCallback(setAutoCaptured.onExtraCallbackWithResult(), -1839786000, iOnExtraCallbackWithResult, 1839786000, setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr);
            }
        }, 14, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 73;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 63 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(GuardianSimpleInfoFragment guardianSimpleInfoFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a((short) ((-120) - Color.argb(0, 0, 0, 0)), (byte) (51 - ((byte) KeyEvent.getModifierMetaStateMask())), 250527 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), (-1801986177) + (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 79, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), guardianSimpleInfoFragment.getString(R.string.guardian_simple_info_unblock_onelink_dialog_title));
        Object[] objArr2 = new Object[1];
        a((short) ((ViewConfiguration.getTouchSlop() >> 8) + 29), (byte) (Color.argb(0, 0, 0, 0) + 115), 250533 + (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-1801986194) + (ViewConfiguration.getWindowTouchSlop() >> 8), (-79) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), guardianSimpleInfoFragment.getString(R.string.guardian_simple_info_unblock_onelink_dialog_negative_button));
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 103;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
        return unit;
    }

    private static final Unit onNavigationEvent(final GuardianSimpleInfoFragment guardianSimpleInfoFragment, GuestUnderFourteenUnblockOneLinkResponse guestUnderFourteenUnblockOneLinkResponse, DialogInterface dialogInterface) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1498983L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoFragment$showUnblockGuideDialog$1$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                Object[] objArr = {guardianSimpleInfoFragment, (SetDetectableSize) obj};
                int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
                return (Unit) GuardianSimpleInfoFragment$readTypedObject.onExtraCallback(setAutoCaptured.onExtraCallbackWithResult(), -1479395969, iOnExtraCallbackWithResult, 1479395971, setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr);
            }
        }, 14, (Object) null);
        BaseActivity baseActivityRequireBaseActivity = guardianSimpleInfoFragment.requireBaseActivity();
        List list = ArraysKt.toList(MessageQueueThreadSpec.values());
        MessageQueueThreadImplCompanionWhenMappings messageQueueThreadImplCompanionWhenMappings = new MessageQueueThreadImplCompanionWhenMappings(guestUnderFourteenUnblockOneLinkResponse.onNavigationEvent(), (String) null, (Uri) null, 6, (DefaultConstructorMarker) null);
        String string = guardianSimpleInfoFragment.getString(R.string.guardian_simple_info_unblock_onelink_sns_bottom_sheet_title, new Object[]{APImageInfo.onNavigationEvent.asBinder()});
        Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
        new ShareToSNSDialog(baseActivityRequireBaseActivity, list, messageQueueThreadImplCompanionWhenMappings, (String) null, string, (startNewBackgroundThreadlambda0) null, 0, (String) null, (String) null, (String) null, (setOnOutOfMemeryErrorCallback) null, 2024, (DefaultConstructorMarker) null).show();
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStub + 85;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(final GuardianSimpleInfoFragment guardianSimpleInfoFragment, final GuestUnderFourteenUnblockOneLinkResponse guestUnderFourteenUnblockOneLinkResponse, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(guardianSimpleInfoFragment.getString(R.string.guardian_simple_info_unblock_onelink_dialog_title));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(guardianSimpleInfoFragment.getString(R.string.guardian_simple_info_unblock_onelink_dialog_message, new Object[]{APImageInfo.onNavigationEvent.asBinder()}));
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, im.toss.uikit.R.string.uikit_confirm, new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.PRIMARY, TdsButtonV1View.IAuthTabCallbackDefault.FILL, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 12, (DefaultConstructorMarker) null), false, new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoFragment$showUnblockGuideDialog$1$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return GuardianSimpleInfoFragment$readTypedObject.onExtraCallbackWithResult(guardianSimpleInfoFragment, (DialogInterface) obj);
            }
        }, 4, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        String string = guardianSimpleInfoFragment.getString(R.string.guardian_simple_info_unblock_onelink_dialog_negative_button);
        Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DARK, TdsButtonV1View.IAuthTabCallbackDefault.WEAK, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 12, (DefaultConstructorMarker) null), false, new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoFragment$showUnblockGuideDialog$1$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return GuardianSimpleInfoFragment$readTypedObject.onExtraCallbackWithResult(guardianSimpleInfoFragment, guestUnderFourteenUnblockOneLinkResponse, (DialogInterface) obj);
            }
        }, 4, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i = 2 % 2;
        int i2 = onTransact + 85;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = this.label;
        try {
            if (i4 != 0) {
                int i5 = IAuthTabCallbackStub + 1;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i7 = IAuthTabCallbackStub + 37;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                GuardianSimpleInfoFragment guardianSimpleInfoFragment = this.this$0;
                Result.Companion companion = Result.Companion;
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                onExtraCallback onextracallback = new onExtraCallback(null, guardianSimpleInfoFragment);
                this.L$0 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.I$1 = 0;
                this.I$2 = 0;
                this.label = 1;
                obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onextracallback, this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            obj2 = Result.constructor-impl(obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
        } catch (WebResourceResponseModel e3) {
            Result.Companion companion3 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            int i9 = IAuthTabCallbackStub + 67;
            onTransact = i9 % 128;
            int i10 = i9 % 2;
        }
        final GuardianSimpleInfoFragment guardianSimpleInfoFragment2 = this.this$0;
        if (Result.onNavigationEvent(obj2)) {
            final GuestUnderFourteenUnblockOneLinkResponse guestUnderFourteenUnblockOneLinkResponse = (GuestUnderFourteenUnblockOneLinkResponse) obj2;
            ConvertByteArrayToFloatArray.onExtraCallback(1498853L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoFragment$showUnblockGuideDialog$1$$ExternalSyntheticLambda0
                public final Object invoke(Object obj3) {
                    return GuardianSimpleInfoFragment$readTypedObject.onNavigationEvent(guardianSimpleInfoFragment2, (SetDetectableSize) obj3);
                }
            }, 14, (Object) null);
            CommonModule_setScreenAwakeMode.onNavigationEvent(guardianSimpleInfoFragment2, new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoFragment$showUnblockGuideDialog$1$$ExternalSyntheticLambda1
                public final Object invoke(Object obj3) {
                    return GuardianSimpleInfoFragment$readTypedObject.onWarmupCompleted(guardianSimpleInfoFragment2, guestUnderFourteenUnblockOneLinkResponse, (CommonModule_setLeftEdgeTouchEnabled) obj3);
                }
            });
        }
        GuardianSimpleInfoFragment guardianSimpleInfoFragment3 = this.this$0;
        Throwable th = Result.exceptionOrNull-impl(obj2);
        if (th != null) {
            int i11 = IAuthTabCallbackStub + 11;
            onTransact = i11 % 128;
            int i12 = i11 % 2;
            getParamImp.onWarmupCompleted(th, guardianSimpleInfoFragment3.requireContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(GuardianSimpleInfoFragment guardianSimpleInfoFragment, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = setAutoCaptured.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(setAutoCaptured.onExtraCallbackWithResult(), -1839786000, iOnExtraCallbackWithResult, 1839786000, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{guardianSimpleInfoFragment, setDetectableSize});
    }

    public static /* synthetic */ Unit IAuthTabCallback(GuardianSimpleInfoFragment guardianSimpleInfoFragment, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = setAutoCaptured.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(setAutoCaptured.onExtraCallbackWithResult(), -1479395969, iOnExtraCallbackWithResult, 1479395971, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{guardianSimpleInfoFragment, setDetectableSize});
    }

    private static final Unit onWarmupCompleted(GuardianSimpleInfoFragment guardianSimpleInfoFragment, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = setAutoCaptured.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(setAutoCaptured.onExtraCallbackWithResult(), -571214265, iOnExtraCallbackWithResult, 571214266, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{guardianSimpleInfoFragment, setDetectableSize});
    }
}
