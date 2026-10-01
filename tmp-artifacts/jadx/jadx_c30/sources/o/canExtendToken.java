package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import com.google.gson.JsonParser;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import j$.time.OffsetDateTime;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import net.sf.scuba.smartcards.BuildConfig;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.adInfo;
import o.canExtendToken;
import o.getSupportedHighSpeedResolutionsFor;
import o.getViewTypeCount;
import o.onPreviewFrame;
import o.setCacheComposition;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import o.w5a;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler;
import viva.republica.toss.main.more.CalendarWebMessageTestActivity;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class canExtendToken {
    private static final String IAuthTabCallback;
    private static int access000;
    private static char[] asInterface;
    private static final wie2 onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static char onTransact;
    private static long onWarmupCompleted;
    private static final byte[] $$a = {79, -25, -14, 102};
    private static final int $$b = 77;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 0;
    private static int IAuthTabCallbackDefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, short s) {
        int i3;
        int i4 = i2 + 109;
        int i5 = 4 - (i * 4);
        int i6 = s * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        if (bArr == null) {
            int i8 = i4;
            i4 = i7;
            i3 = 0;
            i5++;
            i4 += i8;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            i3++;
            i8 = bArr[i5];
            i5++;
            i4 += i8;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnMinimized = onMinimized(getsupportedhighspeedresolutionsfor, str);
        int i4 = IAuthTabCallbackDefault + 85;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return unitOnMinimized;
    }

    private static final Unit IAuthTabCallback(String str, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 83;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult(str, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = asBinder + 57;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, String str2, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 47;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str2, function0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = asBinder + 83;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 61 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 117;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            onWarmupCompleted(getsupportedhighspeedresolutionsfor, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(getsupportedhighspeedresolutionsfor, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallbackDefault + 49;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitExtraCallbackWithResult = extraCallbackWithResult(getsupportedhighspeedresolutionsfor, str);
        int i4 = asBinder + 77;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 7;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 53 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ void IAuthTabCallback(CalendarWebMessageTestActivity calendarWebMessageTestActivity, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 35;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(calendarWebMessageTestActivity, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i, i2);
        int i6 = asBinder + 17;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
    }

    public static /* synthetic */ getSupportedHighSpeedResolutionsFor IAuthTabCallbackDefault() throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            readTypedObject();
            throw null;
        }
        getSupportedHighSpeedResolutionsFor typedObject = readTypedObject();
        int i3 = IAuthTabCallbackDefault + 43;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return typedObject;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        w5a w5aVar = (w5a) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 61;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, str2, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = asBinder + 5;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getSupportedHighSpeedResolutionsFor IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforWriteTypedObject = writeTypedObject();
        int i4 = asBinder + 45;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return getsupportedhighspeedresolutionsforWriteTypedObject;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onMessageChannelReady();
        }
        onMessageChannelReady();
        throw null;
    }

    public static /* synthetic */ getSupportedHighSpeedResolutionsFor IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, 2104365810, -2104365799, new Object[0], iOnExtraCallback2, iOnExtraCallback);
        int i4 = asBinder + 39;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return getsupportedhighspeedresolutionsfor;
        }
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[1];
        w5a w5aVar = (w5a) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = asBinder + 39;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ getSupportedHighSpeedResolutionsFor access100() {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforAccess000 = access000();
        int i4 = asBinder + 35;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return getsupportedhighspeedresolutionsforAccess000;
    }

    public static /* synthetic */ getSupportedHighSpeedResolutionsFor asBinder() {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, -1551146451, 1551146452, new Object[0], iOnExtraCallback2, iOnExtraCallback);
        int i4 = asBinder + 113;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return getsupportedhighspeedresolutionsfor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getSupportedHighSpeedResolutionsFor asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, 668721096, -668721088, new Object[0], iOnExtraCallback2, iOnExtraCallback);
        int i4 = IAuthTabCallbackDefault + 87;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return getsupportedhighspeedresolutionsfor;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        Unit unit;
        CalendarWebMessageTestActivity calendarWebMessageTestActivity = (CalendarWebMessageTestActivity) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[2];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objArr[3];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4 = (getSupportedHighSpeedResolutionsFor) objArr[4];
        int i = 2 % 2;
        int i2 = asBinder + 69;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            unit = (Unit) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, -1243119432, 1243119452, new Object[]{calendarWebMessageTestActivity, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4}, iOnExtraCallback2, iOnExtraCallback);
            int i3 = 10 / 0;
        } else {
            Object[] objArr2 = {calendarWebMessageTestActivity, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4};
            int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback5 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            unit = (Unit) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1243119432, 1243119452, objArr2, iOnExtraCallback5, iOnExtraCallback4);
        }
        int i4 = asBinder + 81;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3);
        if (i3 != 0) {
            int i4 = 82 / 0;
        }
        int i5 = asBinder + 1;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 1;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getsupportedhighspeedresolutionsfor, z);
        int i4 = asBinder + 57;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CalendarWebMessageTestActivity calendarWebMessageTestActivity, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = asBinder + 19;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return onNavigationEvent(calendarWebMessageTestActivity, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onNavigationEvent(calendarWebMessageTestActivity, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getSupportedHighSpeedResolutionsFor onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforExtraCallbackWithResult = extraCallbackWithResult();
        int i4 = IAuthTabCallbackDefault + 19;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return getsupportedhighspeedresolutionsforExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        JsonObject jsonObject = (JsonObject) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[2];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objArr[3];
        JsonObject jsonObject2 = (JsonObject) objArr[4];
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(jsonObject, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, jsonObject2, zBooleanValue);
        }
        int i3 = 44 / 0;
        return onWarmupCompleted(jsonObject, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, jsonObject2, zBooleanValue);
    }

    private static final Unit onExtraCallbackWithResult(String str, String str2, String str3, Function1 function1, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = asBinder + 97;
        IAuthTabCallbackDefault = i5 % 128;
        IAuthTabCallback(str, str2, str3, function1, z, cameraCaptureResultEmptyCameraCaptureResult, i5 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallbackDefault + 81;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 25 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(String str, String str2, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 119;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult(str, str2, (Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = asBinder + 1;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor7, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor8) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor5, getsupportedhighspeedresolutionsfor6, getsupportedhighspeedresolutionsfor7, getsupportedhighspeedresolutionsfor8);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor5, getsupportedhighspeedresolutionsfor6, getsupportedhighspeedresolutionsfor7, getsupportedhighspeedresolutionsfor8);
        int i3 = IAuthTabCallbackDefault + 43;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor7, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor8, CalendarWebMessageTestActivity calendarWebMessageTestActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor9, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor10, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor11, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor12) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor5, getsupportedhighspeedresolutionsfor6, getsupportedhighspeedresolutionsfor7, getsupportedhighspeedresolutionsfor8, calendarWebMessageTestActivity, getsupportedhighspeedresolutionsfor9, getsupportedhighspeedresolutionsfor10, getsupportedhighspeedresolutionsfor11, getsupportedhighspeedresolutionsfor12};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1139660870, -1139660849, objArr, iOnExtraCallback2, iOnExtraCallback);
        int i4 = IAuthTabCallbackDefault + 39;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getSupportedHighSpeedResolutionsFor onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnActivityLayout = onActivityLayout();
        if (i3 == 0) {
            int i4 = 29 / 0;
        }
        return getsupportedhighspeedresolutionsforOnActivityLayout;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function2 function2, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, 1992049340, -1992049338, new Object[]{function2, th}, iOnExtraCallback2, iOnExtraCallback);
            int i3 = 60 / 0;
        } else {
            int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback5 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback6 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback6, 1992049340, -1992049338, new Object[]{function2, th}, iOnExtraCallback5, iOnExtraCallback4);
        }
        int i4 = asBinder + 117;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function2 function2, JsonObject jsonObject, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(function2, jsonObject, z);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws Throwable {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted;
        int i7 = i3 | i6;
        int i8 = ~i4;
        int i9 = ~i6;
        int i10 = ~(i8 | i9);
        int i11 = (~(i6 | i8)) | (~(i9 | i3));
        int i12 = i3 + i4 + i5 + (1389894630 * i2) + ((-1243605516) * i);
        int i13 = i12 * i12;
        int i14 = ((-345998475) * i3) + 1335230464 + (862422157 * i4) + ((-1543273332) * i7) + (i10 * 1543273332) + (1543273332 * i11) + ((-1889271808) * i5) + (1607991296 * i2) + ((-548405248) * i) + ((-1553596416) * i13);
        int i15 = ((i3 * (-88671125)) - 261777699) + (i4 * (-88671149)) + (i7 * (-12)) + (i10 * 12) + (i11 * 12) + (i5 * (-88671137)) + (i2 * (-349388198)) + (i * (-147040884)) + (i13 * 182059008);
        switch (i14 + (i15 * i15 * (-132513792))) {
            case 1:
                int i16 = 2 % 2;
                int i17 = asBinder + 17;
                IAuthTabCallbackDefault = i17 % 128;
                if (i17 % 2 != 0) {
                    Object[] objArr2 = new Object[1];
                    a((char) (Color.green(0) + 24710), Process.getGidForName(BuildConfig.FLAVOR) + 1818354854, new char[]{40536, 49240, 13364, 25634, 4374, 48626, 18716, 20779, 27775, 62666, 17223, 38064, 59563, 6784, 45172}, new char[]{20730, 9184, 9568, 58214}, new char[]{42302, 25060, 34412, 64864}, objArr2);
                    getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(((String) objArr2[0]).intern(), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    break;
                } else {
                    Object[] objArr3 = new Object[1];
                    a((char) (Color.green(0) * 28857), Process.getGidForName(BuildConfig.FLAVOR) + 1818354854, new char[]{40536, 49240, 13364, 25634, 4374, 48626, 18716, 20779, 27775, 62666, 17223, 38064, 59563, 6784, 45172}, new char[]{20730, 9184, 9568, 58214}, new char[]{42302, 25060, 34412, 64864}, objArr3);
                    getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(((String) objArr3[0]).intern(), (CameraPresenceProviderExternalSyntheticLambda0) null, 3, (Object) null);
                    break;
                }
            case 2:
                Function2 function2 = (Function2) objArr[0];
                Throwable th = (Throwable) objArr[1];
                int i18 = 2 % 2;
                int i19 = asBinder + 79;
                IAuthTabCallbackDefault = i19 % 128;
                int i20 = i19 % 2;
                function2.invoke(onWarmupCompleted(th.getMessage(), "simulationFailed", (Map) null, 4, (Object) null), Boolean.TRUE);
                return null;
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return onNavigationEvent(objArr);
            case 6:
                return IAuthTabCallback(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                int i21 = 2 % 2;
                int i22 = IAuthTabCallbackDefault + 69;
                asBinder = i22 % 128;
                if (i22 % 2 == 0) {
                    getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    break;
                } else {
                    getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 3, (Object) null);
                    break;
                }
            case 9:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return IAuthTabCallbackDefault(objArr);
            case 11:
                return asInterface(objArr);
            case 12:
                return asBinder(objArr);
            case 13:
                return access000(objArr);
            case 14:
                return access100(objArr);
            case 15:
                return getInterfaceDescriptor(objArr);
            case 16:
                return IAuthTabCallbackStubProxy(objArr);
            case 17:
                return IAuthTabCallback_Parcel(objArr);
            case 18:
                return ICustomTabsCallback(objArr);
            case 19:
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
                String str = (String) objArr[1];
                int i23 = 2 % 2;
                int i24 = asBinder + 115;
                IAuthTabCallbackDefault = i24 % 128;
                int i25 = i24 % 2;
                Unit typedObject = readTypedObject(getsupportedhighspeedresolutionsfor, str);
                int i26 = IAuthTabCallbackDefault + 35;
                asBinder = i26 % 128;
                int i27 = i26 % 2;
                return typedObject;
            case 20:
                return writeTypedObject(objArr);
            case 21:
                return extraCallback(objArr);
            case 22:
                return extraCallbackWithResult(objArr);
            case 23:
                return readTypedObject(objArr);
            case 24:
                return onActivityLayout(objArr);
            default:
                return onExtraCallback(objArr);
        }
        return getsupportedhighspeedresolutionsforOnWarmupCompleted;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        String str = (String) objArr[0];
        RowScope rowScope = (RowScope) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = asBinder + 49;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, String str2, String str3, Function1 function1, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 9;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return onExtraCallbackWithResult(str, str2, str3, function1, z, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onExtraCallbackWithResult(str, str2, str3, function1, z, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 25;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess100 = access100(getsupportedhighspeedresolutionsfor);
        int i4 = asBinder + 95;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitAccess100;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitExtraCallback = extraCallback(getsupportedhighspeedresolutionsfor, str);
        int i4 = asBinder + 117;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unitExtraCallback;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(CalendarWebMessageTestActivity calendarWebMessageTestActivity, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = asBinder + 93;
        IAuthTabCallbackDefault = i5 % 128;
        onWarmupCompleted(calendarWebMessageTestActivity, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i5 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallbackDefault + 77;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 30 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(CalendarWebMessageTestActivity calendarWebMessageTestActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4) {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {calendarWebMessageTestActivity, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(iOnExtraCallback4, iOnExtraCallback3, -1678994771, 1678994789, objArr, iOnExtraCallback2, iOnExtraCallback);
        int i4 = IAuthTabCallbackDefault + 103;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static final /* synthetic */ JsonObject onNavigationEvent(String str, String str2, Map map) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        JsonObject jsonObjectIAuthTabCallback = IAuthTabCallback(str, str2, map);
        if (i3 == 0) {
            int i4 = 28 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 73;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return jsonObjectIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getSupportedHighSpeedResolutionsFor onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 15;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return extraCallback();
        }
        extraCallback();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 83;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnPostMessage = onPostMessage(getsupportedhighspeedresolutionsfor, str);
        int i4 = asBinder + 89;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnPostMessage;
    }

    public static /* synthetic */ Unit onTransact(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            return (Unit) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, -1500673038, 1500673042, new Object[]{getsupportedhighspeedresolutionsfor, str}, iOnExtraCallback2, iOnExtraCallback);
        }
        int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback5 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback6 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getSupportedHighSpeedResolutionsFor onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 23;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnPostMessage = onPostMessage();
        int i4 = asBinder + 23;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return getsupportedhighspeedresolutionsforOnPostMessage;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 31;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return IAuthTabCallback(str, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        IAuthTabCallback(str, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 93;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackDefault + 63;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(adinfo);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(adinfo);
        int i3 = IAuthTabCallbackDefault + 69;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 58 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallback = ICustomTabsCallback(getsupportedhighspeedresolutionsfor, str);
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
        int i5 = asBinder + 111;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return unitICustomTabsCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CalendarWebMessageTestActivity calendarWebMessageTestActivity, Function2 function2, JsonObject jsonObject, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(calendarWebMessageTestActivity, function2, jsonObject, z);
        int i4 = IAuthTabCallbackDefault + 113;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ JsonElement onWarmupCompleted(onPreviewFrame onpreviewframe) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        JsonElement jsonElementOnExtraCallback = onExtraCallback(onpreviewframe);
        if (i3 != 0) {
            int i4 = 48 / 0;
        }
        return jsonElementOnExtraCallback;
    }

    public static /* synthetic */ getSupportedHighSpeedResolutionsFor onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforICustomTabsCallback = ICustomTabsCallback();
        int i4 = IAuthTabCallbackDefault + 7;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return getsupportedhighspeedresolutionsforICustomTabsCallback;
    }

    private static final getSupportedHighSpeedResolutionsFor access000() {
        int i = 2 % 2;
        int i2 = asBinder + 29;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted("대기 중", (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        int i4 = IAuthTabCallbackDefault + 111;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
        return getsupportedhighspeedresolutionsforOnWarmupCompleted;
    }

    private static final getSupportedHighSpeedResolutionsFor onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 51;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted("아직 실행한 액션이 없습니다.", (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        int i4 = IAuthTabCallbackDefault + 31;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
        return getsupportedhighspeedresolutionsforOnWarmupCompleted;
    }

    private static final getSupportedHighSpeedResolutionsFor onPostMessage() {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        IAuthTabCallbackDefault = i2 % 128;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = i2 % 2 == 0 ? CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted("{}", (CameraPresenceProviderExternalSyntheticLambda0) null, 5, (Object) null) : CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted("{}", (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        int i3 = asBinder + 27;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return getsupportedhighspeedresolutionsforOnWarmupCompleted;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted("캘린더 앱브릿지 테스트 이벤트", (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        int i4 = IAuthTabCallbackDefault + 63;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return getsupportedhighspeedresolutionsforOnWarmupCompleted;
    }

    private static final getSupportedHighSpeedResolutionsFor extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((String) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, 66378778, -66378756, new Object[0], iOnExtraCallback2, iOnExtraCallback), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        int i4 = asBinder + 85;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return getsupportedhighspeedresolutionsforOnWarmupCompleted;
        }
        throw null;
    }

    private static final getSupportedHighSpeedResolutionsFor ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        IAuthTabCallbackDefault = i2 % 128;
        return i2 % 2 == 0 ? CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(ICustomTabsCallbackStubProxy(), (CameraPresenceProviderExternalSyntheticLambda0) null, 5, (Object) null) : CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(ICustomTabsCallbackStubProxy(), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    private static final getSupportedHighSpeedResolutionsFor extraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 111;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        int i4 = asBinder + 71;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return getsupportedhighspeedresolutionsforOnWarmupCompleted;
    }

    private static final getSupportedHighSpeedResolutionsFor readTypedObject() throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a((char) Drawable.resolveOpacity(0, 0), (-1475951252) + TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), new char[]{57009, 52569, 37437, 42887, 54443, 43446, 35359, 11471, 16932, 52720, 53784, 3296, 42229, 47943, 53941, 48022, 29254, 22142, 6047, 20667, 7852, 4910, 19818}, new char[]{20730, 9184, 9568, 58214}, new char[]{27859, 1733, 22696, 23651}, objArr);
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(((String) objArr[0]).intern(), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        int i4 = IAuthTabCallbackDefault + 113;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return getsupportedhighspeedresolutionsforOnWarmupCompleted;
    }

    private static final getSupportedHighSpeedResolutionsFor writeTypedObject() {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        IAuthTabCallbackDefault = i2 % 128;
        return CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted("서울특별시 강남구 테헤란로 131", (CameraPresenceProviderExternalSyntheticLambda0) null, i2 % 2 == 0 ? 5 : 2, (Object) null);
    }

    private static final getSupportedHighSpeedResolutionsFor onActivityLayout() {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        IAuthTabCallbackDefault = i2 % 128;
        return CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted("0,-60,-1440", (CameraPresenceProviderExternalSyntheticLambda0) null, i2 % 2 == 0 ? 4 : 2, (Object) null);
    }

    private static final void onExtraCallback(CalendarWebMessageTestActivity calendarWebMessageTestActivity, getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, final getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor2, final getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor3, final getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor4, String str, JsonObject jsonObject) throws Throwable {
        int i = 2 % 2;
        final JsonObject jsonObjectOnExtraCallbackWithResult = onExtraCallbackWithResult(str, jsonObject);
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, -1397456741, 1397456754, new Object[]{getsupportedhighspeedresolutionsfor, str}, iOnExtraCallback2, iOnExtraCallback);
        int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback5 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback6 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback6, 720116416, -720116401, new Object[]{getsupportedhighspeedresolutionsfor2, "핸들러 직접 호출"}, iOnExtraCallback5, iOnExtraCallback4);
        int iOnExtraCallback7 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback8 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback9 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        Object[] objArr = {getsupportedhighspeedresolutionsfor3, onNavigationEvent(((JsonObject) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback9, -1230780978, 1230781001, new Object[]{jsonObjectOnExtraCallbackWithResult}, iOnExtraCallback8, iOnExtraCallback7)).toString())};
        int iOnExtraCallback10 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback11 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 192405069, -192405057, objArr, iOnExtraCallback11, iOnExtraCallback10);
        onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor4, false);
        onExtraCallback(calendarWebMessageTestActivity, jsonObjectOnExtraCallbackWithResult, (Function2<? super JsonObject, ? super Boolean, Unit>) new Function2() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda40
            public final Object invoke(Object obj, Object obj2) {
                Object[] objArr2 = {jsonObjectOnExtraCallbackWithResult, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4, (JsonObject) obj, Boolean.valueOf(((Boolean) obj2).booleanValue())};
                int iOnExtraCallback12 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback13 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                return (Unit) canExtendToken.onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1763215496, -1763215493, objArr2, iOnExtraCallback13, iOnExtraCallback12);
            }
        });
        int i2 = asBinder + 63;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(JsonObject jsonObject, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, JsonObject jsonObject2, boolean z) throws Throwable {
        String str;
        int i = 2 % 2;
        int i2 = asBinder + 33;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(jsonObject2, BuildConfig.FLAVOR);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(jsonObject2, BuildConfig.FLAVOR);
        if (z) {
            int i3 = IAuthTabCallbackDefault + 3;
            int i4 = i3 % 128;
            asBinder = i4;
            int i5 = i3 % 2;
            str = "에러 반환";
            int i6 = i4 + 125;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
        } else {
            str = "성공 반환";
        }
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, 720116416, -720116401, new Object[]{getsupportedhighspeedresolutionsfor, str}, iOnExtraCallback2, iOnExtraCallback);
        Object[] objArr = {getsupportedhighspeedresolutionsfor2, onNavigationEvent(onExtraCallback(jsonObject, jsonObject2, z).toString())};
        int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback5 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 192405069, -192405057, objArr, iOnExtraCallback5, iOnExtraCallback4);
        onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor3, z);
        return Unit.INSTANCE;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        char c2;
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i3 = $10 + 119;
        $11 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 2 / 3;
        }
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), 43 - View.resolveSize(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1451, 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (Process.myPid() >> 22) + 44, 1494 - View.resolveSizeAndState(0, 0, 0), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    c2 = 3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 23971), 49 - Process.getGidForName(BuildConfig.FLAVOR), 22939 - View.MeasureSpec.makeMeasureSpec(0, 0), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                } else {
                    c2 = 3;
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 45848), 29 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), 12578 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onTransact ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i5 = $10 + 51;
                $11 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static final Unit extraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 25;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        IAuthTabCallbackStub(getsupportedhighspeedresolutionsfor, str);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 79;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit extraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        IAuthTabCallbackDefault(getsupportedhighspeedresolutionsfor, str);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 117;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
        return unit;
    }

    private static final Unit ICustomTabsCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        access000(getsupportedhighspeedresolutionsfor, str);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 3;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 15;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, z);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean zOnNavigationEvent;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, BuildConfig.FLAVOR);
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i3 = asBinder + 99;
            IAuthTabCallbackDefault = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                int i4 = 39 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i5 = IAuthTabCallbackDefault + 79;
                    asBinder = i5 % 128;
                    if (i5 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(600306096, i, -1, "viva.republica.toss.main.more.CalendarWebMessageTestContent.<anonymous>.<anonymous> (CalendarWebMessageTestActivity.kt:168)");
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(600306096, i, -1, "viva.republica.toss.main.more.CalendarWebMessageTestContent.<anonymous>.<anonymous> (CalendarWebMessageTestActivity.kt:168)");
                }
                int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                boolean zBooleanValue = ((Boolean) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -653640143, 653640159, new Object[]{getsupportedhighspeedresolutionsfor}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback)).booleanValue();
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent) {
                    int i6 = asBinder + 83;
                    IAuthTabCallbackDefault = i6 % 128;
                    if (i6 % 2 == 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        throw null;
                    }
                    Object obj2 = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Function1 function1 = new Function1() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda8
                            public final Object invoke(Object obj3) {
                                return canExtendToken.onExtraCallback(getsupportedhighspeedresolutionsfor, ((Boolean) obj3).booleanValue());
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function1);
                        obj2 = function1;
                    }
                    AppLovinVastMediaViewc.onExtraCallbackWithResult(zBooleanValue, (Function1) obj2, (QuirksExternalSyntheticBackport0) null, false, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (AppLovinVastMediaViewb) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 60);
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                boolean zBooleanValue2 = ((Boolean) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -653640143, 653640159, new Object[]{getsupportedhighspeedresolutionsfor}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2)).booleanValue();
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit access100(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 65;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, !((Boolean) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, -653640143, 653640159, new Object[]{getsupportedhighspeedresolutionsfor}, iOnExtraCallback2, iOnExtraCallback)).booleanValue());
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 55;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit readTypedObject(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
            IAuthTabCallback_Parcel(getsupportedhighspeedresolutionsfor, str);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        IAuthTabCallback_Parcel(getsupportedhighspeedresolutionsfor, str);
        Unit unit2 = Unit.INSTANCE;
        int i3 = asBinder + 99;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        IAuthTabCallbackStubProxy(getsupportedhighspeedresolutionsfor, str);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 27;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onMinimized(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 65;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
            getInterfaceDescriptor(getsupportedhighspeedresolutionsfor, str);
            unit = Unit.INSTANCE;
            int i3 = 21 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
            getInterfaceDescriptor(getsupportedhighspeedresolutionsfor, str);
            unit = Unit.INSTANCE;
        }
        int i4 = IAuthTabCallbackDefault + 49;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onPostMessage(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
            access100(getsupportedhighspeedresolutionsfor, str);
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        access100(getsupportedhighspeedresolutionsfor, str);
        Unit unit2 = Unit.INSTANCE;
        int i3 = asBinder + 51;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        char[] cArr;
        int length;
        char[] cArr2;
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr3 = asInterface;
        if (cArr3 != null) {
            int i7 = $10 + 1;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i = 0;
            }
            while (i < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 35282), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 34, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14238, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr3, i3, cArr4, 0, i4);
        if (bArr != null) {
            char[] cArr5 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i8 = $11 + 45;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - ExpandableListView.getPackedPositionType(0L)), 65 - (Process.myPid() >> 22), 16718 - View.combineMeasuredStates(0, 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 29 - ExpandableListView.getPackedPositionGroup(0L), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 17656, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0)), 70 - Color.green(0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i12 = $11 + 63;
                $10 = i12 % 128;
                int i13 = i12 % 2;
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            char[] cArr6 = new char[i4];
            System.arraycopy(cArr4, 0, cArr6, 0, i4);
            int i14 = i4 - i6;
            System.arraycopy(cArr6, 0, cArr4, i14, i6);
            System.arraycopy(cArr6, i6, cArr4, 0, i14);
        }
        if (z) {
            int i15 = $11 + 19;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i16 = $10 + 1;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    private static final Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor7, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor8) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 113;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(getsupportedhighspeedresolutionsfor, "캘린더 앱브릿지 테스트 이벤트");
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        IAuthTabCallbackDefault(getsupportedhighspeedresolutionsfor2, (String) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 66378778, -66378756, new Object[0], iOnExtraCallback2, iOnExtraCallback));
        access000(getsupportedhighspeedresolutionsfor3, ICustomTabsCallbackStubProxy());
        IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor4, false);
        Object[] objArr = new Object[1];
        a((char) (Process.myTid() >> 22), View.MeasureSpec.makeMeasureSpec(0, 0) - 1475951252, new char[]{57009, 52569, 37437, 42887, 54443, 43446, 35359, 11471, 16932, 52720, 53784, 3296, 42229, 47943, 53941, 48022, 29254, 22142, 6047, 20667, 7852, 4910, 19818}, new char[]{20730, 9184, 9568, 58214}, new char[]{27859, 1733, 22696, 23651}, objArr);
        IAuthTabCallback_Parcel(getsupportedhighspeedresolutionsfor5, ((String) objArr[0]).intern());
        IAuthTabCallbackStubProxy(getsupportedhighspeedresolutionsfor6, "서울특별시 강남구 테헤란로 131");
        Object[] objArr2 = new Object[1];
        a((char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 24711), 1818354853 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new char[]{40536, 49240, 13364, 25634, 4374, 48626, 18716, 20779, 27775, 62666, 17223, 38064, 59563, 6784, 45172}, new char[]{20730, 9184, 9568, 58214}, new char[]{42302, 25060, 34412, 64864}, objArr2);
        getInterfaceDescriptor(getsupportedhighspeedresolutionsfor7, ((String) objArr2[0]).intern());
        access100(getsupportedhighspeedresolutionsfor8, "0,-60,-1440");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 5;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3) {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, true);
        IAuthTabCallbackDefault(getsupportedhighspeedresolutionsfor2, "2026-05-18T00:00:00+09:00");
        access000(getsupportedhighspeedresolutionsfor3, "2026-05-19T00:00:00+09:00");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 17;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) throws Throwable {
        CalendarWebMessageTestActivity calendarWebMessageTestActivity = (CalendarWebMessageTestActivity) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[2];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objArr[3];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4 = (getSupportedHighSpeedResolutionsFor) objArr[4];
        int i = 2 % 2;
        PangleEncryptManager pangleEncryptManager = new PangleEncryptManager();
        Unit unit = Unit.INSTANCE;
        onExtraCallback(calendarWebMessageTestActivity, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4, "checkCalendarPermission", pangleEncryptManager.onExtraCallbackWithResult());
        int i2 = IAuthTabCallbackDefault + 29;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) throws Throwable {
        CalendarWebMessageTestActivity calendarWebMessageTestActivity = (CalendarWebMessageTestActivity) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[2];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objArr[3];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4 = (getSupportedHighSpeedResolutionsFor) objArr[4];
        int i = 2 % 2;
        PangleEncryptManager pangleEncryptManager = new PangleEncryptManager();
        Unit unit = Unit.INSTANCE;
        onExtraCallback(calendarWebMessageTestActivity, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4, "requestCalendarWritablePermission", pangleEncryptManager.onExtraCallbackWithResult());
        int i2 = IAuthTabCallbackDefault + 97;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) throws Throwable {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[1];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objArr[2];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4 = (getSupportedHighSpeedResolutionsFor) objArr[3];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5 = (getSupportedHighSpeedResolutionsFor) objArr[4];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6 = (getSupportedHighSpeedResolutionsFor) objArr[5];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor7 = (getSupportedHighSpeedResolutionsFor) objArr[6];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor8 = (getSupportedHighSpeedResolutionsFor) objArr[7];
        CalendarWebMessageTestActivity calendarWebMessageTestActivity = (CalendarWebMessageTestActivity) objArr[8];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor9 = (getSupportedHighSpeedResolutionsFor) objArr[9];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor10 = (getSupportedHighSpeedResolutionsFor) objArr[10];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor11 = (getSupportedHighSpeedResolutionsFor) objArr[11];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor12 = (getSupportedHighSpeedResolutionsFor) objArr[12];
        int i = 2 % 2;
        PangleEncryptManager pangleEncryptManager = new PangleEncryptManager();
        Object[] objArr2 = new Object[1];
        a((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 64689), TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 471311449, new char[]{25358, 60983, 45765, 17941, 11407}, new char[]{20730, 9184, 9568, 58214}, new char[]{22851, 6052, 45596, 41468}, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        dynamicTrack.onExtraCallback(pangleEncryptManager, strIntern, (String) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1440245968, 1440245978, new Object[]{getsupportedhighspeedresolutionsfor}, iOnExtraCallback2, iOnExtraCallback));
        dynamicTrack.onExtraCallback(pangleEncryptManager, "startAt", onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor2));
        dynamicTrack.onExtraCallback(pangleEncryptManager, "endAt", asBinder((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor3));
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        dynamicTrack.onExtraCallbackWithResult(pangleEncryptManager, "isAllDay", Boolean.valueOf(((Boolean) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -653640143, 653640159, new Object[]{getsupportedhighspeedresolutionsfor4}, iOnExtraCallback4, iOnExtraCallback3)).booleanValue()));
        String strIAuthTabCallbackDefault = IAuthTabCallbackDefault((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor5);
        Object obj = null;
        if (StringsKt.isBlank(strIAuthTabCallbackDefault)) {
            strIAuthTabCallbackDefault = null;
        }
        if (strIAuthTabCallbackDefault != null) {
            dynamicTrack.onExtraCallback(pangleEncryptManager, "notes", strIAuthTabCallbackDefault);
            int i2 = asBinder + 39;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
        }
        String strOnTransact = onTransact((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor6);
        if (StringsKt.isBlank(strOnTransact)) {
            strOnTransact = null;
        }
        if (strOnTransact != null) {
            dynamicTrack.onExtraCallback(pangleEncryptManager, "location", strOnTransact);
        }
        String strIAuthTabCallbackStub = IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor7);
        if (StringsKt.isBlank(strIAuthTabCallbackStub)) {
            strIAuthTabCallbackStub = null;
        } else {
            int i4 = IAuthTabCallbackDefault + 47;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }
        if (strIAuthTabCallbackStub != null) {
            Object[] objArr3 = new Object[1];
            b(true, new byte[]{0, 0, 1}, new int[]{0, 3, 0, 0}, objArr3);
            dynamicTrack.onExtraCallback(pangleEncryptManager, ((String) objArr3[0]).intern(), strIAuthTabCallbackStub);
        }
        JsonElement jsonElementOnWarmupCompleted = onWarmupCompleted(access000((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor8));
        if (jsonElementOnWarmupCompleted != null) {
            int i6 = IAuthTabCallbackDefault + 47;
            asBinder = i6 % 128;
            if (i6 % 2 != 0) {
                pangleEncryptManager.onExtraCallbackWithResult("alarmOffsetsInMinutes", jsonElementOnWarmupCompleted);
                obj.hashCode();
                throw null;
            }
            pangleEncryptManager.onExtraCallbackWithResult("alarmOffsetsInMinutes", jsonElementOnWarmupCompleted);
        }
        Unit unit = Unit.INSTANCE;
        onExtraCallback(calendarWebMessageTestActivity, getsupportedhighspeedresolutionsfor9, getsupportedhighspeedresolutionsfor10, getsupportedhighspeedresolutionsfor11, getsupportedhighspeedresolutionsfor12, "addCalendarEvent", pangleEncryptManager.onExtraCallbackWithResult());
        int i7 = asBinder + 21;
        IAuthTabCallbackDefault = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0;
        long jLongValue;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, BuildConfig.FLAVOR);
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i4 = IAuthTabCallbackDefault + 55;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        } else {
            int i6 = IAuthTabCallbackDefault + 69;
            asBinder = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 11 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1390754953, i, -1, "viva.republica.toss.main.more.CalendarWebMessageTestContent.<anonymous>.<anonymous> (CalendarWebMessageTestActivity.kt:270)");
                }
                FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f));
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(asbinderOnExtraCallback, QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 6);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                String strOnExtraCallback = onExtraCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor);
                y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnExtraCallback, null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                String str = (String) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1056823255, 1056823255, new Object[]{getsupportedhighspeedresolutionsfor2}, iOnExtraCallback2, iOnExtraCallback);
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-303732248);
                    jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                } else {
                    int i8 = IAuthTabCallbackDefault + 107;
                    asBinder = i8 % 128;
                    int i9 = i8 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-303733208);
                    jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
                }
                long j = jLongValue;
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                i2 = asBinder + 81;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 != 0) {
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, Long.valueOf(j), 1L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 1L, 1, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 1, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i10 = IAuthTabCallbackDefault + 81;
                        asBinder = i10 % 128;
                        int i11 = i10 % 2;
                    }
                } else {
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, Long.valueOf(j), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback2 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f));
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(asbinderOnExtraCallback2, QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 6);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback2);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda02 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                String strOnExtraCallback2 = onExtraCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor);
                y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnExtraCallback2, null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback22 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                String str2 = (String) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1056823255, 1056823255, new Object[]{getsupportedhighspeedresolutionsfor2}, iOnExtraCallback22, iOnExtraCallback3);
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                }
                long j2 = jLongValue;
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                i2 = asBinder + 81;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 != 0) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        long jIEngagementSignalsCallbackStub;
        int i2 = 2 % 2;
        int i3 = asBinder + 75;
        IAuthTabCallbackDefault = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 != 0 ? (i & 3) != 2 : (i & 4) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-610469056, i, -1, "viva.republica.toss.main.more.CalendarWebMessageTestContent.<anonymous>.<anonymous> (CalendarWebMessageTestActivity.kt:280)");
                int i4 = asBinder + 19;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
            }
            String interfaceDescriptor = getInterfaceDescriptor((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor);
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1749759935);
            if (!onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2)) {
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    int i6 = asBinder + 55;
                    IAuthTabCallbackDefault = i6 % 128;
                    if (i6 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1749764679);
                        jIEngagementSignalsCallbackStub = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 46).ICustomTabsService();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1749764679);
                        jIEngagementSignalsCallbackStub = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1749765639);
                    jIEngagementSignalsCallbackStub = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1749760686);
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda02 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda02, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1749761990);
                    jIEngagementSignalsCallbackStub = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -1572738860, OverseasRrnInputTextField.IAuthTabCallback(), 1572738861)).longValue();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1749762918);
                    jIEngagementSignalsCallbackStub = y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).IEngagementSignalsCallbackStub();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{interfaceDescriptor, null, null, Long.valueOf(jIEngagementSignalsCallbackStub), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x09ce  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x09d8  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x051b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(final CalendarWebMessageTestActivity calendarWebMessageTestActivity, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws Throwable {
        int i3;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        long jLongValue;
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor;
        boolean z2;
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6;
        boolean z3;
        int i5;
        int i6 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1463168281);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(calendarWebMessageTestActivity) ^ true ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02))) {
                    int i8 = asBinder + 23;
                    IAuthTabCallbackDefault = i8 % 128;
                    int i9 = i8 % 2;
                    i4 = 32;
                } else {
                    i4 = 16;
                }
                i3 |= i4;
            }
            if ((i3 & 19) == 18) {
                int i10 = asBinder + 45;
                IAuthTabCallbackDefault = i10 % 128;
                int i11 = i10 % 2;
                z = true;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            } else {
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i7 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1463168281, i3, -1, "viva.republica.toss.main.more.CalendarWebMessageTestContent (CalendarWebMessageTestActivity.kt:91)");
                }
                Object[] objArr = new Object[0];
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted2 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted2.onExtraCallback()) {
                    objOnMinimized = new Function0() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda11
                        public final Object invoke() {
                            return canExtendToken.access100();
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor7 = (getSupportedHighSpeedResolutionsFor) RememberSaveableKt.IAuthTabCallback(objArr, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                Object[] objArr2 = new Object[0];
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized2 == onwarmupcompleted2.onExtraCallback()) {
                    objOnMinimized2 = new Function0() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda22
                        public final Object invoke() {
                            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                            int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                            return (getSupportedHighSpeedResolutionsFor) canExtendToken.onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, -1762894134, 1762894151, new Object[0], iOnExtraCallback2, iOnExtraCallback);
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor8 = (getSupportedHighSpeedResolutionsFor) RememberSaveableKt.IAuthTabCallback(objArr2, (Function0) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                Object[] objArr3 = new Object[0];
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized3 == onwarmupcompleted2.onExtraCallback()) {
                    objOnMinimized3 = new Function0() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda32
                        public final Object invoke() {
                            return canExtendToken.onTransact();
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor9 = (getSupportedHighSpeedResolutionsFor) RememberSaveableKt.IAuthTabCallback(objArr3, (Function0) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                Object[] objArr4 = new Object[0];
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized4 == onwarmupcompleted2.onExtraCallback()) {
                    objOnMinimized4 = new Function0() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda33
                        public final Object invoke() {
                            return canExtendToken.asInterface();
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor10 = (getSupportedHighSpeedResolutionsFor) RememberSaveableKt.IAuthTabCallback(objArr4, (Function0) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                Object[] objArr5 = new Object[0];
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized5 == onwarmupcompleted2.onExtraCallback()) {
                    objOnMinimized5 = new Function0() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda34
                        public final Object invoke() {
                            return canExtendToken.IAuthTabCallback_Parcel();
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor11 = (getSupportedHighSpeedResolutionsFor) RememberSaveableKt.IAuthTabCallback(objArr5, (Function0) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                Object[] objArr6 = new Object[0];
                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized6 == onwarmupcompleted2.onExtraCallback()) {
                    objOnMinimized6 = new Function0() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda35
                        public final Object invoke() {
                            return canExtendToken.onExtraCallback();
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor12 = (getSupportedHighSpeedResolutionsFor) RememberSaveableKt.IAuthTabCallback(objArr6, (Function0) objOnMinimized6, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                Object[] objArr7 = new Object[0];
                Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized7 == onwarmupcompleted2.onExtraCallback()) {
                    objOnMinimized7 = new Function0() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda36
                        public final Object invoke() {
                            return canExtendToken.onWarmupCompleted();
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor13 = (getSupportedHighSpeedResolutionsFor) RememberSaveableKt.IAuthTabCallback(objArr7, (Function0) objOnMinimized7, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                Object[] objArr8 = new Object[0];
                Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized8 == onwarmupcompleted2.onExtraCallback()) {
                    objOnMinimized8 = new Function0() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda37
                        public final Object invoke() {
                            return canExtendToken.onNavigationEvent();
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized8);
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor14 = (getSupportedHighSpeedResolutionsFor) RememberSaveableKt.IAuthTabCallback(objArr8, (Function0) objOnMinimized8, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                Object[] objArr9 = new Object[0];
                Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized9 == onwarmupcompleted2.onExtraCallback()) {
                    objOnMinimized9 = new Function0() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda38
                        public final Object invoke() {
                            return canExtendToken.IAuthTabCallbackDefault();
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized9);
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor15 = (getSupportedHighSpeedResolutionsFor) RememberSaveableKt.IAuthTabCallback(objArr9, (Function0) objOnMinimized9, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                Object[] objArr10 = new Object[0];
                Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized10 == onwarmupcompleted2.onExtraCallback()) {
                    objOnMinimized10 = new Function0() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda39
                        public final Object invoke() {
                            return canExtendToken.IAuthTabCallbackStub();
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized10);
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor16 = (getSupportedHighSpeedResolutionsFor) RememberSaveableKt.IAuthTabCallback(objArr10, (Function0) objOnMinimized10, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                Object[] objArr11 = new Object[0];
                Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized11 == onwarmupcompleted2.onExtraCallback()) {
                    objOnMinimized11 = new Function0() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda12
                        public final Object invoke() {
                            return canExtendToken.asBinder();
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized11);
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor17 = (getSupportedHighSpeedResolutionsFor) RememberSaveableKt.IAuthTabCallback(objArr11, (Function0) objOnMinimized11, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                Object[] objArr12 = new Object[0];
                Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                int i12 = i3;
                if (objOnMinimized12 == onwarmupcompleted2.onExtraCallback()) {
                    objOnMinimized12 = new Function0() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda13
                        public final Object invoke() {
                            return canExtendToken.onExtraCallbackWithResult();
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized12);
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor18 = (getSupportedHighSpeedResolutionsFor) RememberSaveableKt.IAuthTabCallback(objArr12, (Function0) objOnMinimized12, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(setContentInsetsAbsolute.IAuthTabCallback(quirksExternalSyntheticBackport03, setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1), false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f));
                FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback = focusMeteringControlExternalSyntheticLambda12.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f));
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(asbinderOnExtraCallback, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"캘린더 웹메시지 핸들러 시뮬레이터", null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1242019780);
                    jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1242020740);
                    jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"실제 WebView 없이 AbsMessageHandler를 직접 호출합니다. full access는 WRITE_CALENDAR + READ_CALENDAR 둘 다 승인된 경우입니다.", null, null, Long.valueOf(jLongValue), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                String str = (String) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1440245968, 1440245978, new Object[]{getsupportedhighspeedresolutionsfor11}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback);
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor11);
                Object objOnMinimized13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!zOnNavigationEvent) {
                    int i13 = asBinder + 43;
                    IAuthTabCallbackDefault = i13 % 128;
                    int i14 = i13 % 2;
                    Object obj = objOnMinimized13;
                    if (objOnMinimized13 == onwarmupcompleted2.onExtraCallback()) {
                        Function1 function1 = new Function1() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda14
                            public final Object invoke(Object obj2) {
                                return canExtendToken.IAuthTabCallback(getsupportedhighspeedresolutionsfor11, (String) obj2);
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function1);
                        obj = function1;
                    }
                    Object[] objArr13 = new Object[1];
                    a((char) (TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 64690), View.MeasureSpec.getMode(0) + 471311449, new char[]{25358, 60983, 45765, 17941, 11407}, new char[]{20730, 9184, 9568, 58214}, new char[]{22851, 6052, 45596, 41468}, objArr13);
                    IAuthTabCallback(str, ((String) objArr13[0]).intern(), "이벤트 제목", (Function1) obj, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 432, 16);
                    String strOnExtraCallbackWithResult = onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor12);
                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor12);
                    Object objOnMinimized14 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!zOnNavigationEvent2) {
                        Object obj2 = objOnMinimized14;
                        if (objOnMinimized14 == onwarmupcompleted2.onExtraCallback()) {
                            Function1 function12 = new Function1() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda15
                                public final Object invoke(Object obj3) {
                                    return canExtendToken.onNavigationEvent(getsupportedhighspeedresolutionsfor12, (String) obj3);
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function12);
                            obj2 = function12;
                        }
                        IAuthTabCallback(strOnExtraCallbackWithResult, "startAt", "2026-05-18T09:00:00+09:00", (Function1) obj2, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 432, 16);
                        String strAsBinder = asBinder((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor13);
                        boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor13);
                        Object objOnMinimized15 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!zOnNavigationEvent3) {
                            Object obj3 = objOnMinimized15;
                            if (objOnMinimized15 == onwarmupcompleted2.onExtraCallback()) {
                                Function1 function13 = new Function1() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda16
                                    public final Object invoke(Object obj4) {
                                        return canExtendToken.onWarmupCompleted(getsupportedhighspeedresolutionsfor13, (String) obj4);
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function13);
                                obj3 = function13;
                            }
                            IAuthTabCallback(strAsBinder, "endAt", "2026-05-18T10:00:00+09:00", (Function1) obj3, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 432, 16);
                            getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteOnWarmupCompleted = ContainerHelpers.onNavigationEvent.onWarmupCompleted();
                            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(600306096, true, new getBacktraceNote() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda17
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    return canExtendToken.IAuthTabCallback(getsupportedhighspeedresolutionsfor14, (RightPreset) obj4, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor14);
                            Object objOnMinimized16 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!zOnNavigationEvent4) {
                                Object obj4 = objOnMinimized16;
                                if (objOnMinimized16 == onwarmupcompleted2.onExtraCallback()) {
                                    Function0 function0 = new Function0() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda18
                                        public final Object invoke() {
                                            return canExtendToken.onNavigationEvent(getsupportedhighspeedresolutionsfor14);
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0);
                                    obj4 = function0;
                                }
                                w4.onExtraCallbackWithResult(getbacktracenoteOnWarmupCompleted, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, encoderProfilesProxyVideoProfileProxyOnExtraCallback, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj4, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196614, 0, 114654);
                                String strIAuthTabCallbackDefault = IAuthTabCallbackDefault((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor15);
                                boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor15);
                                Object objOnMinimized17 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!zOnNavigationEvent5) {
                                    Object obj5 = objOnMinimized17;
                                    if (objOnMinimized17 == onwarmupcompleted2.onExtraCallback()) {
                                        Function1 function14 = new Function1() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda19
                                            public final Object invoke(Object obj6) {
                                                Object[] objArr14 = {getsupportedhighspeedresolutionsfor15, (String) obj6};
                                                int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                                                int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                                                return (Unit) canExtendToken.onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1939400562, 1939400581, objArr14, iOnExtraCallback3, iOnExtraCallback2);
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function14);
                                        obj5 = function14;
                                    }
                                    IAuthTabCallback(strIAuthTabCallbackDefault, "notes", "메모", (Function1) obj5, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 25008, 0);
                                    String strOnTransact = onTransact((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor16);
                                    boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor16);
                                    Object objOnMinimized18 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (!zOnNavigationEvent6) {
                                        int i15 = IAuthTabCallbackDefault + 43;
                                        asBinder = i15 % 128;
                                        if (i15 % 2 != 0) {
                                            onwarmupcompleted2.onExtraCallback();
                                            throw null;
                                        }
                                        Object obj6 = objOnMinimized18;
                                        if (objOnMinimized18 == onwarmupcompleted2.onExtraCallback()) {
                                            Function1 function15 = new Function1() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda20
                                                public final Object invoke(Object obj7) {
                                                    return canExtendToken.onTransact(getsupportedhighspeedresolutionsfor16, (String) obj7);
                                                }
                                            };
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function15);
                                            obj6 = function15;
                                        }
                                        IAuthTabCallback(strOnTransact, "location", "장소", (Function1) obj6, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 432, 16);
                                        String strIAuthTabCallbackStub = IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor17);
                                        boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor17);
                                        Object objOnMinimized19 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (!zOnNavigationEvent7) {
                                            Object obj7 = objOnMinimized19;
                                            if (objOnMinimized19 == onwarmupcompleted2.onExtraCallback()) {
                                                Function1 function16 = new Function1() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda21
                                                    public final Object invoke(Object obj8) {
                                                        Object[] objArr14 = {getsupportedhighspeedresolutionsfor17, (String) obj8};
                                                        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                                                        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                                                        return (Unit) canExtendToken.onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -727591218, 727591224, objArr14, iOnExtraCallback3, iOnExtraCallback2);
                                                    }
                                                };
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function16);
                                                obj7 = function16;
                                            }
                                            Object[] objArr14 = new Object[1];
                                            b(true, new byte[]{0, 0, 1}, new int[]{0, 3, 0, 0}, objArr14);
                                            String strIntern = ((String) objArr14[0]).intern();
                                            Object[] objArr15 = new Object[1];
                                            a((char) ((Process.myPid() >> 22) + 24710), View.MeasureSpec.getSize(0) + 1818354853, new char[]{40536, 49240, 13364, 25634, 4374, 48626, 18716, 20779, 27775, 62666, 17223, 38064, 59563, 6784, 45172}, new char[]{20730, 9184, 9568, 58214}, new char[]{42302, 25060, 34412, 64864}, objArr15);
                                            IAuthTabCallback(strIAuthTabCallbackStub, strIntern, ((String) objArr15[0]).intern(), (Function1) obj7, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 432, 16);
                                            String strAccess000 = access000((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor18);
                                            boolean zOnNavigationEvent8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor18);
                                            Object objOnMinimized20 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if (!zOnNavigationEvent8) {
                                                Object obj8 = objOnMinimized20;
                                                if (objOnMinimized20 == onwarmupcompleted2.onExtraCallback()) {
                                                    Function1 function17 = new Function1() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda23
                                                        public final Object invoke(Object obj9) {
                                                            Object[] objArr16 = {getsupportedhighspeedresolutionsfor18, (String) obj9};
                                                            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                                                            int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                                                            return (Unit) canExtendToken.onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1866262879, -1866262872, objArr16, iOnExtraCallback3, iOnExtraCallback2);
                                                        }
                                                    };
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function17);
                                                    obj8 = function17;
                                                }
                                                IAuthTabCallback(strAccess000, "alarmOffsetsInMinutes (<= 0, 앞의 5개만 등록)", "0,-60,-1440,-2880,-4320,-5760", (Function1) obj8, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 432, 16);
                                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
                                                component5 component5VarOnExtraCallback = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)), onextracallbackwithresult.access000(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                                                Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                                    int i16 = IAuthTabCallbackDefault + 31;
                                                    onwarmupcompleted = onwarmupcompleted2;
                                                    asBinder = i16 % 128;
                                                    if (i16 % 2 != 0) {
                                                        getAwbState.onExtraCallback();
                                                        Object obj9 = null;
                                                        obj9.hashCode();
                                                        throw null;
                                                    }
                                                    getAwbState.onExtraCallback();
                                                } else {
                                                    onwarmupcompleted = onwarmupcompleted2;
                                                }
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                                                } else {
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                                                    int i17 = IAuthTabCallbackDefault + 39;
                                                    asBinder = i17 % 128;
                                                    int i18 = i17 % 2;
                                                }
                                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                                                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                                                RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = RowScope.onNavigationEvent(rowScopeInstance, onextracallback, 1.0f, false, 2, (Object) null);
                                                setCallToAction.onWarmupCompleted onwarmupcompleted3 = setCallToAction.onWarmupCompleted.Dark;
                                                setCallToAction.onExtraCallback onextracallback2 = setCallToAction.onExtraCallback.Weak;
                                                boolean zOnNavigationEvent9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor11);
                                                boolean zOnNavigationEvent10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor12);
                                                boolean zOnNavigationEvent11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor13);
                                                boolean zOnNavigationEvent12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor14);
                                                boolean zOnNavigationEvent13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor15);
                                                boolean zOnNavigationEvent14 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor16);
                                                boolean zOnNavigationEvent15 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor17);
                                                boolean zOnNavigationEvent16 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor18);
                                                Object objOnMinimized21 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                if (!(zOnNavigationEvent9 | zOnNavigationEvent10 | zOnNavigationEvent11 | zOnNavigationEvent12 | zOnNavigationEvent13 | zOnNavigationEvent14 | zOnNavigationEvent15 | zOnNavigationEvent16)) {
                                                    Object obj10 = objOnMinimized21;
                                                    if (objOnMinimized21 == onwarmupcompleted.onExtraCallback()) {
                                                        Function0 function02 = new Function0() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda24
                                                            public final Object invoke() {
                                                                return canExtendToken.onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor11, getsupportedhighspeedresolutionsfor12, getsupportedhighspeedresolutionsfor13, getsupportedhighspeedresolutionsfor14, getsupportedhighspeedresolutionsfor15, getsupportedhighspeedresolutionsfor16, getsupportedhighspeedresolutionsfor17, getsupportedhighspeedresolutionsfor18);
                                                            }
                                                        };
                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function02);
                                                        obj10 = function02;
                                                    }
                                                    setAdvertiser.onExtraCallbackWithResult("기본값", quirksExternalSyntheticBackport0OnNavigationEvent2, (setCallToAction.IAuthTabCallback) null, onwarmupcompleted3, onextracallback2, (setCallToAction.onNavigationEvent) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function0) null, (Function0) obj10, false, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 27654, 0, 1764);
                                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent3 = RowScope.onNavigationEvent(rowScopeInstance, onextracallback, 1.0f, false, 2, (Object) null);
                                                    boolean zOnNavigationEvent17 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor14);
                                                    boolean zOnNavigationEvent18 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor12);
                                                    boolean zOnNavigationEvent19 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor13);
                                                    Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                    if (!(zOnNavigationEvent17 | zOnNavigationEvent18 | zOnNavigationEvent19)) {
                                                        Object obj11 = objOnMinimized22;
                                                        if (objOnMinimized22 == onwarmupcompleted.onExtraCallback()) {
                                                            Function0 function03 = new Function0() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda25
                                                                public final Object invoke() {
                                                                    return canExtendToken.onExtraCallback(getsupportedhighspeedresolutionsfor14, getsupportedhighspeedresolutionsfor12, getsupportedhighspeedresolutionsfor13);
                                                                }
                                                            };
                                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function03);
                                                            obj11 = function03;
                                                        }
                                                        setAdvertiser.onExtraCallbackWithResult("종일 예시", quirksExternalSyntheticBackport0OnNavigationEvent3, (setCallToAction.IAuthTabCallback) null, onwarmupcompleted3, onextracallback2, (setCallToAction.onNavigationEvent) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function0) null, (Function0) obj11, false, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 27654, 0, 1764);
                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                                        onExtraCallbackWithResult("권한", cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                                        boolean zOnNavigationEvent20 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor7);
                                                        boolean zOnNavigationEvent21 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor8);
                                                        boolean zOnNavigationEvent22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor9);
                                                        boolean zOnNavigationEvent23 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor10);
                                                        int i19 = i12 & 14;
                                                        if (i19 == 4) {
                                                            int i20 = asBinder + 45;
                                                            getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor18;
                                                            IAuthTabCallbackDefault = i20 % 128;
                                                            int i21 = i20 % 2;
                                                            z2 = true;
                                                        } else {
                                                            getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor18;
                                                            z2 = false;
                                                        }
                                                        Object objOnMinimized23 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                        if (((zOnNavigationEvent20 | zOnNavigationEvent21 | zOnNavigationEvent22 | zOnNavigationEvent23) || z2) || objOnMinimized23 == onwarmupcompleted.onExtraCallback()) {
                                                            getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor9;
                                                            getsupportedhighspeedresolutionsfor3 = getsupportedhighspeedresolutionsfor;
                                                            getsupportedhighspeedresolutionsfor4 = getsupportedhighspeedresolutionsfor15;
                                                            getsupportedhighspeedresolutionsfor5 = getsupportedhighspeedresolutionsfor7;
                                                            Function0 function04 = new Function0() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda26
                                                                public final Object invoke() {
                                                                    return canExtendToken.onNavigationEvent(calendarWebMessageTestActivity, getsupportedhighspeedresolutionsfor7, getsupportedhighspeedresolutionsfor8, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor10);
                                                                }
                                                            };
                                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function04);
                                                            objOnMinimized23 = function04;
                                                        } else {
                                                            getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor9;
                                                            getsupportedhighspeedresolutionsfor4 = getsupportedhighspeedresolutionsfor15;
                                                            getsupportedhighspeedresolutionsfor3 = getsupportedhighspeedresolutionsfor;
                                                            getsupportedhighspeedresolutionsfor5 = getsupportedhighspeedresolutionsfor7;
                                                        }
                                                        onExtraCallbackWithResult("checkCalendarPermission", "쓰기 권한과 full access 여부를 함께 조회합니다.", (Function0<Unit>) objOnMinimized23, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                                        boolean zOnNavigationEvent24 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor5);
                                                        boolean zOnNavigationEvent25 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor8);
                                                        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor19 = getsupportedhighspeedresolutionsfor2;
                                                        boolean zOnNavigationEvent26 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor19);
                                                        boolean zOnNavigationEvent27 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor10);
                                                        boolean z4 = i19 == 4;
                                                        Object objOnMinimized24 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                        if (((zOnNavigationEvent24 | zOnNavigationEvent25 | zOnNavigationEvent26 | zOnNavigationEvent27) || z4) || objOnMinimized24 == onwarmupcompleted.onExtraCallback()) {
                                                            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor20 = getsupportedhighspeedresolutionsfor5;
                                                            getsupportedhighspeedresolutionsfor6 = getsupportedhighspeedresolutionsfor14;
                                                            Function0 function05 = new Function0() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda27
                                                                public final Object invoke() {
                                                                    Object[] objArr16 = {calendarWebMessageTestActivity, getsupportedhighspeedresolutionsfor20, getsupportedhighspeedresolutionsfor8, getsupportedhighspeedresolutionsfor19, getsupportedhighspeedresolutionsfor10};
                                                                    int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                                                                    int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                                                                    return (Unit) canExtendToken.onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -428026361, 428026385, objArr16, iOnExtraCallback3, iOnExtraCallback2);
                                                                }
                                                            };
                                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function05);
                                                            objOnMinimized24 = function05;
                                                        } else {
                                                            getsupportedhighspeedresolutionsfor6 = getsupportedhighspeedresolutionsfor14;
                                                        }
                                                        onExtraCallbackWithResult("requestCalendarWritablePermission", "쓰기 요청 브릿지이지만 현재는 읽기 + 쓰기를 함께 요청해 full access를 맞춥니다.", (Function0<Unit>) objOnMinimized24, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                                        onExtraCallbackWithResult("이벤트", cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                                        boolean zOnNavigationEvent28 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor5);
                                                        boolean zOnNavigationEvent29 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor8);
                                                        boolean zOnNavigationEvent30 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor19);
                                                        boolean zOnNavigationEvent31 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor10);
                                                        if (i19 == 4) {
                                                            int i22 = IAuthTabCallbackDefault + 33;
                                                            asBinder = i22 % 128;
                                                            int i23 = i22 % 2;
                                                            z3 = true;
                                                        } else {
                                                            z3 = false;
                                                        }
                                                        boolean zOnNavigationEvent32 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor11);
                                                        boolean zOnNavigationEvent33 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor12);
                                                        boolean zOnNavigationEvent34 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor13);
                                                        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor21 = getsupportedhighspeedresolutionsfor6;
                                                        boolean zOnNavigationEvent35 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor21);
                                                        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor22 = getsupportedhighspeedresolutionsfor4;
                                                        boolean zOnNavigationEvent36 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor22);
                                                        boolean zOnNavigationEvent37 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor16);
                                                        boolean zOnNavigationEvent38 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor17);
                                                        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor23 = getsupportedhighspeedresolutionsfor10;
                                                        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor24 = getsupportedhighspeedresolutionsfor3;
                                                        boolean zOnNavigationEvent39 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor24);
                                                        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor25 = getsupportedhighspeedresolutionsfor5;
                                                        Object objOnMinimized25 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                        if (((zOnNavigationEvent28 | zOnNavigationEvent29 | zOnNavigationEvent30 | zOnNavigationEvent31 | z3 | zOnNavigationEvent32 | zOnNavigationEvent33 | zOnNavigationEvent34 | zOnNavigationEvent35 | zOnNavigationEvent36 | zOnNavigationEvent37 | zOnNavigationEvent38) || zOnNavigationEvent39) || objOnMinimized25 == onwarmupcompleted.onExtraCallback()) {
                                                            getsupportedhighspeedresolutionsfor23 = getsupportedhighspeedresolutionsfor23;
                                                            i5 = 6;
                                                            Function0 function06 = new Function0() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda28
                                                                public final Object invoke() {
                                                                    return canExtendToken.onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor11, getsupportedhighspeedresolutionsfor12, getsupportedhighspeedresolutionsfor13, getsupportedhighspeedresolutionsfor21, getsupportedhighspeedresolutionsfor22, getsupportedhighspeedresolutionsfor16, getsupportedhighspeedresolutionsfor17, getsupportedhighspeedresolutionsfor24, calendarWebMessageTestActivity, getsupportedhighspeedresolutionsfor25, getsupportedhighspeedresolutionsfor8, getsupportedhighspeedresolutionsfor19, getsupportedhighspeedresolutionsfor23);
                                                                }
                                                            };
                                                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function06);
                                                            objOnMinimized25 = function06;
                                                        } else {
                                                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                                            i5 = 6;
                                                        }
                                                        onExtraCallbackWithResult("addCalendarEvent", "음수/0 알림만 허용하며 5개를 넘기면 앞의 5개만 등록합니다.", (Function0<Unit>) objOnMinimized25, cameraCaptureResultEmptyCameraCaptureResult2, 54);
                                                        onExtraCallbackWithResult("마지막 실행", cameraCaptureResultEmptyCameraCaptureResult2, i5);
                                                        w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-1390754953, true, new getBacktraceNote() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda29
                                                            public final Object invoke(Object obj12, Object obj13, Object obj14) {
                                                                Object[] objArr16 = {getsupportedhighspeedresolutionsfor25, getsupportedhighspeedresolutionsfor8, (w5a) obj12, (CameraCaptureResultEmptyCameraCaptureResult) obj13, Integer.valueOf(((Integer) obj14).intValue())};
                                                                int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                                                                int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                                                                return (Unit) canExtendToken.onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1115663425, -1115663411, objArr16, iOnExtraCallback3, iOnExtraCallback2);
                                                            }
                                                        }, cameraCaptureResultEmptyCameraCaptureResult2, 54), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult2, 6, 0, 131070);
                                                        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor26 = getsupportedhighspeedresolutionsfor23;
                                                        ImageCaptureExternalSyntheticLambda1.onNavigationEvent((QuirksExternalSyntheticBackport0) null, ForwardingCameraControl.onExtraCallback(-610469056, true, new Function2() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda30
                                                            public final Object invoke(Object obj12, Object obj13) {
                                                                return canExtendToken.IAuthTabCallback(getsupportedhighspeedresolutionsfor19, getsupportedhighspeedresolutionsfor26, (CameraCaptureResultEmptyCameraCaptureResult) obj12, ((Integer) obj13).intValue());
                                                            }
                                                        }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 48, 1);
                                                        cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                                        }
                                                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda31
                    public final Object invoke(Object obj12, Object obj13) {
                        return canExtendToken.onExtraCallback(calendarWebMessageTestActivity, quirksExternalSyntheticBackport02, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj12, ((Integer) obj13).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if ((i3 & 19) == 18) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final void onExtraCallbackWithResult(final String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(115577102);
        Object obj = null;
        if ((i & 6) == 0) {
            int i4 = IAuthTabCallbackDefault + 23;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str);
                obj.hashCode();
                throw null;
            }
            int i5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ^ true ? 2 : 4;
            int i6 = IAuthTabCallbackDefault + 9;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = asBinder + 91;
                IAuthTabCallbackDefault = i8 % 128;
                if (i8 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(115577102, i2, -1, "viva.republica.toss.main.more.SectionTitle (CalendarWebMessageTestActivity.kt:289)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(115577102, i2, -1, "viva.republica.toss.main.more.SectionTitle (CalendarWebMessageTestActivity.kt:289)");
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(i2 & 14), 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i9 = asBinder + 53;
                IAuthTabCallbackDefault = i9 % 128;
                int i10 = i9 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda0
                public final Object invoke(Object obj2, Object obj3) {
                    return canExtendToken.onWarmupCompleted(str, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x02b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(String str, String str2, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        long jLongValue;
        int i2 = 2 % 2;
        int i3 = asBinder + 115;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, BuildConfig.FLAVOR);
        if ((i & 17) != 16) {
            z = true;
        } else {
            int i5 = asBinder + 125;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IAuthTabCallbackDefault + 67;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(485711135, i, -1, "viva.republica.toss.main.more.ActionRow.<anonymous> (CalendarWebMessageTestActivity.kt:304)");
            }
            FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f));
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(asbinderOnExtraCallback, QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 6);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i9 = asBinder + 7;
                IAuthTabCallbackDefault = i9 % 128;
                int i10 = i9 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout())) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                int i11 = IAuthTabCallbackDefault + 117;
                asBinder = i11 % 128;
                if (i11 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-381842576);
                    jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 17).ICustomTabsService();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-381842576);
                    jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-381841616);
                jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
            }
            long j = jLongValue;
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i12 = IAuthTabCallbackDefault + 115;
            asBinder = i12 % 128;
            if (i12 % 2 != 0) {
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str2, null, null, Long.valueOf(j), 0L, 1L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, true, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 1, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str2, null, null, Long.valueOf(j), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(final String str, final String str2, final Function0<Unit> function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i4;
        int i5;
        int i6 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1572154044);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                int i7 = IAuthTabCallbackDefault + 39;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                int i9 = asBinder + 105;
                IAuthTabCallbackDefault = i9 % 128;
                int i10 = i9 % 2;
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        int i11 = i2;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i11 & 147) != 146, i11 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1572154044, i11, -1, "viva.republica.toss.main.more.ActionRow (CalendarWebMessageTestActivity.kt:301)");
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(485711135, true, new getBacktraceNote() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda9
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Object[] objArr = {str, str2, (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                    int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                    int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                    return (Unit) canExtendToken.onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 725190201, -725190192, objArr, iOnExtraCallback2, iOnExtraCallback);
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, function0, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult2, 6, (i11 << 6) & 57344, 114686);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                i3 = asBinder + 65;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda10
                    public final Object invoke(Object obj, Object obj2) {
                        return canExtendToken.IAuthTabCallback(str, str2, function0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                });
                int i12 = IAuthTabCallbackDefault + 91;
                asBinder = i12 % 128;
                int i13 = i12 % 2;
                return;
            }
            return;
        }
        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        i3 = asBinder + 43;
        IAuthTabCallbackDefault = i3 % 128;
        int i14 = i3 % 2;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, BuildConfig.FLAVOR);
        if ((i & 17) != 16) {
            int i3 = asBinder + 77;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = IAuthTabCallbackDefault + 107;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 82 / 0;
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1368705231, i, -1, "viva.republica.toss.main.more.TextInputField.<anonymous> (CalendarWebMessageTestActivity.kt:329)");
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = asBinder + 87;
        IAuthTabCallbackDefault = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, BuildConfig.FLAVOR);
        if ((i & 17) != 16) {
            int i3 = IAuthTabCallbackDefault + 103;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i5 = IAuthTabCallbackDefault + 111;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1541119312, i, -1, "viva.republica.toss.main.more.TextInputField.<anonymous> (CalendarWebMessageTestActivity.kt:330)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i7 = asBinder + 49;
                IAuthTabCallbackDefault = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IAuthTabCallback(final String str, final String str2, final String str3, final Function1<? super String, Unit> function1, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final boolean z3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean z4;
        setCacheComposition.IAuthTabCallback.onExtraCallbackWithResult onnavigationevent;
        int i5;
        int i6;
        int i7 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1237694573);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                int i8 = IAuthTabCallbackDefault + 89;
                asBinder = i8 % 128;
                int i9 = i8 % 2;
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            int i10 = IAuthTabCallbackDefault + 3;
            asBinder = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 64 / 0;
                i5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 2048 : 1024;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
            }
            i3 |= i5;
        }
        int i12 = i2 & 16;
        if (i12 == 0) {
            if ((i & 24576) == 0) {
                z2 = z;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                    int i13 = asBinder + 43;
                    IAuthTabCallbackDefault = i13 % 128;
                    int i14 = i13 % 2;
                    i4 = 16384;
                } else {
                    i4 = PKIFailureInfo.certRevoked;
                }
                i3 |= i4;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(!((i3 & 9363) != 9362), i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                z3 = z2;
            } else {
                if (i12 != 0) {
                    int i15 = asBinder + 17;
                    IAuthTabCallbackDefault = i15 % 128;
                    int i16 = i15 % 2;
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1237694573, i3, -1, "viva.republica.toss.main.more.TextInputField (CalendarWebMessageTestActivity.kt:322)");
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
                setCacheComposition.IAuthTabCallbackStub.onNavigationEvent onnavigationevent2 = new setCacheComposition.IAuthTabCallbackStub.onNavigationEvent((setCacheComposition.onTransact) null, 0, (setCacheComposition.onNavigationEvent) null, 7, (DefaultConstructorMarker) null);
                setCacheComposition.onExtraCallback.onExtraCallbackWithResult onextracallbackwithresult = setCacheComposition.onExtraCallback.onExtraCallbackWithResult.IAuthTabCallback;
                if (z4) {
                    int i17 = IAuthTabCallbackDefault + 35;
                    asBinder = i17 % 128;
                    if (i17 % 2 != 0) {
                        onnavigationevent = setCacheComposition.IAuthTabCallback.onExtraCallbackWithResult.onWarmupCompleted;
                        int i18 = 78 / 0;
                    } else {
                        onnavigationevent = setCacheComposition.IAuthTabCallback.onExtraCallbackWithResult.onWarmupCompleted;
                    }
                } else {
                    onnavigationevent = new setCacheComposition.IAuthTabCallback.onNavigationEvent(0, 1, (DefaultConstructorMarker) null);
                }
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                setDefaultFontFileExtension.onWarmupCompleted(str, function1, onnavigationevent2, quirksExternalSyntheticBackport0OnExtraCallback, onextracallbackwithresult, (Function0) null, ForwardingCameraControl.onExtraCallback(1368705231, true, new getBacktraceNote() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda2
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Object[] objArr = {str2, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                        return (Unit) canExtendToken.onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 203003250, -203003245, objArr, iOnExtraCallback2, iOnExtraCallback);
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), ForwardingCameraControl.onExtraCallback(1541119312, true, new getBacktraceNote() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return canExtendToken.onWarmupCompleted(str3, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), false, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (setCacheComposition.IAuthTabCallbackDefault) null, (getMergedResolutions) null, (setCacheComposition.onWarmupCompleted) null, (setCacheComposition.onExtraCallbackWithResult) null, (CameraUnavailableException) null, (CameraState) null, false, false, false, 0, 0, onnavigationevent, (Function1) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, cameraCaptureResultEmptyCameraCaptureResult2, (i3 & 14) | 14183808 | ((i3 >> 6) & 112), 0, 0, 117440288);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i19 = asBinder + 19;
                    IAuthTabCallbackDefault = i19 % 128;
                    int i20 = i19 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                z3 = z4;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda4
                    public final Object invoke(Object obj, Object obj2) {
                        return canExtendToken.onNavigationEvent(str, str2, str3, function1, z3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                });
            }
            int i21 = IAuthTabCallbackDefault + 99;
            asBinder = i21 % 128;
            int i22 = i21 % 2;
        }
        i3 |= 24576;
        z2 = z;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(!((i3 & 9363) != 9362), i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
        int i212 = IAuthTabCallbackDefault + 99;
        asBinder = i212 % 128;
        int i222 = i212 % 2;
    }

    private static final void onExtraCallback(Function2 function2, JsonObject jsonObject, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function2.invoke(jsonObject, Boolean.valueOf(z));
        int i4 = asBinder + 111;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(CalendarWebMessageTestActivity calendarWebMessageTestActivity, final Function2 function2, final JsonObject jsonObject, final boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonObject, BuildConfig.FLAVOR);
        calendarWebMessageTestActivity.runOnUiThread(new Runnable() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                canExtendToken.onExtraCallbackWithResult(function2, jsonObject, z);
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 121;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0086 A[PHI: r4
      0x0086: PHI (r4v13 kotlinx.serialization.json.JsonElement) = (r4v12 kotlinx.serialization.json.JsonElement), (r4v32 kotlinx.serialization.json.JsonElement) binds: [B:8:0x0084, B:5:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(final CalendarWebMessageTestActivity calendarWebMessageTestActivity, JsonObject jsonObject, final Function2<? super JsonObject, ? super Boolean, Unit> function2) throws Throwable {
        JsonElement jsonElement;
        String strOnWarmupCompleted;
        Object obj;
        int i = 2 % 2;
        int i2 = asBinder + 49;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[1];
            a((char) (19045 % (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), ViewConfiguration.getJumpTapTimeout() / 31, new char[]{10032, 11084, 64781, 23383}, new char[]{20730, 9184, 9568, 58214}, new char[]{4686, 23630, 44232, 43582}, objArr);
            jsonElement = (JsonElement) jsonObject.get(((String) objArr[0]).intern());
            if (jsonElement != null) {
                JsonPrimitive jsonPrimitiveOnNavigationEvent = initRenderFinish.onNavigationEvent(jsonElement);
                strOnWarmupCompleted = jsonPrimitiveOnNavigationEvent != null ? jsonPrimitiveOnNavigationEvent.onWarmupCompleted() : null;
            }
        } else {
            Object[] objArr2 = new Object[1];
            a((char) (16045 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), ViewConfiguration.getJumpTapTimeout() >> 16, new char[]{10032, 11084, 64781, 23383}, new char[]{20730, 9184, 9568, 58214}, new char[]{4686, 23630, 44232, 43582}, objArr2);
            jsonElement = (JsonElement) jsonObject.get(((String) objArr2[0]).intern());
            if (jsonElement != null) {
            }
        }
        if (strOnWarmupCompleted == null) {
            int i3 = IAuthTabCallbackDefault + 85;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            strOnWarmupCompleted = BuildConfig.FLAVOR;
        }
        ALCFaceQuality aLCFaceQualityIAuthTabCallback = IAuthTabCallback(strOnWarmupCompleted);
        if (aLCFaceQualityIAuthTabCallback == null) {
            Object[] objArr3 = new Object[1];
            a((char) (7617 - View.combineMeasuredStates(0, 0)), (-1370448600) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{3434, 24352, 63268, 20837, 36343, 39202, 57740, 54630, 55105, 32033, 54589, 24086, 42107}, new char[]{20730, 9184, 9568, 58214}, new char[]{10241, 20637, 49582, 19485}, objArr3);
            function2.invoke(onWarmupCompleted((String) null, ((String) objArr3[0]).intern(), (Map) null, 5, (Object) null), Boolean.TRUE);
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            com.google.gson.JsonObject asJsonObject = JsonParser.parseString(jsonObject.toString()).getAsJsonObject();
            Intrinsics.checkNotNullExpressionValue(asJsonObject, BuildConfig.FLAVOR);
            aLCFaceQualityIAuthTabCallback.onExtraCallbackWithResult(calendarWebMessageTestActivity, strOnWarmupCompleted, asJsonObject, new RequestOutputStream(new Function2() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda6
                public final Object invoke(Object obj2, Object obj3) {
                    return canExtendToken.onWarmupCompleted(calendarWebMessageTestActivity, function2, (JsonObject) obj2, ((Boolean) obj3).booleanValue());
                }
            }));
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        final Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            calendarWebMessageTestActivity.runOnUiThread(new Runnable() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    canExtendToken.onExtraCallbackWithResult(function2, th2);
                }
            });
            int i5 = asBinder + 109;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private static final ALCFaceQuality IAuthTabCallback(String str) {
        int i = 2 % 2;
        int iHashCode = str.hashCode();
        Object obj = null;
        if (iHashCode != 730528604) {
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 107;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (iHashCode != 1105696469) {
                int i4 = i2 + 23;
                asBinder = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                if (iHashCode == 1876058843 && str.equals("addCalendarEvent")) {
                    return new ExtendedKeyUsage();
                }
            } else if (str.equals("checkCalendarPermission")) {
                return new GeneralName();
            }
        } else if (str.equals("requestCalendarWritablePermission")) {
            return new RequestCalendarWritablePermissionHandler();
        }
        return null;
    }

    static /* synthetic */ JsonObject onWarmupCompleted(String str, String str2, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = asBinder + 43;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 60 / 0;
            }
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            int i5 = IAuthTabCallbackDefault + 53;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            map = access8100.onNavigationEvent();
        }
        return IAuthTabCallback(str, str2, map);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final JsonElement onExtraCallback(onPreviewFrame onpreviewframe) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (Intrinsics.areEqual(onpreviewframe, onPreviewFrame.onWarmupCompleted.onExtraCallbackWithResult)) {
            int i4 = IAuthTabCallbackDefault + 95;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                return JsonNull.INSTANCE;
            }
            JsonNull jsonNull = JsonNull.INSTANCE;
            throw null;
        }
        if (onpreviewframe instanceof onPreviewFrame.onExtraCallback) {
            return initRenderFinish.onWarmupCompleted(Boolean.valueOf(((onPreviewFrame.onExtraCallback) onpreviewframe).IAuthTabCallback()));
        }
        if (onpreviewframe instanceof onPreviewFrame.onExtraCallbackWithResult) {
            int i5 = IAuthTabCallbackDefault + 113;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                return initRenderFinish.IAuthTabCallback(Integer.valueOf(((onPreviewFrame.onExtraCallbackWithResult) onpreviewframe).IAuthTabCallback()));
            }
            initRenderFinish.IAuthTabCallback(Integer.valueOf(((onPreviewFrame.onExtraCallbackWithResult) onpreviewframe).IAuthTabCallback()));
            obj.hashCode();
            throw null;
        }
        if (onpreviewframe instanceof onPreviewFrame.IAuthTabCallback) {
            int i6 = IAuthTabCallbackDefault + 55;
            asBinder = i6 % 128;
            if (i6 % 2 == 0) {
                return initRenderFinish.IAuthTabCallback(Double.valueOf(((onPreviewFrame.IAuthTabCallback) onpreviewframe).onWarmupCompleted()));
            }
            initRenderFinish.IAuthTabCallback(Double.valueOf(((onPreviewFrame.IAuthTabCallback) onpreviewframe).onWarmupCompleted()));
            obj.hashCode();
            throw null;
        }
        if (!(!(onpreviewframe instanceof onPreviewFrame.IAuthTabCallbackDefault))) {
            return initRenderFinish.onNavigationEvent(((onPreviewFrame.IAuthTabCallbackDefault) onpreviewframe).onExtraCallbackWithResult());
        }
        if (!(onpreviewframe instanceof onPreviewFrame.onNavigationEvent)) {
            throw new NoWhenBranchMatchedException();
        }
        int i7 = IAuthTabCallbackDefault + 49;
        asBinder = i7 % 128;
        if (i7 % 2 == 0) {
            return wie2.Default.onExtraCallback(((onPreviewFrame.onNavigationEvent) onpreviewframe).onExtraCallback());
        }
        wie2.Default.onExtraCallback(((onPreviewFrame.onNavigationEvent) onpreviewframe).onExtraCallback());
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String onNavigationEvent(String str) {
        String str2;
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            str2 = Result.constructor-impl(onExtraCallback.onWarmupCompleted(JsonElement.Companion.serializer(), wie2.Default.onExtraCallback(str)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            str2 = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.exceptionOrNull-impl(str2) == null) {
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 25;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 115;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            str = str2;
        }
        String str3 = str;
        int i7 = asBinder + 23;
        IAuthTabCallbackDefault = i7 % 128;
        int i8 = i7 % 2;
        return str3;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        int i;
        OffsetDateTime offsetDateTimeWithMinute;
        int i2 = 2 % 2;
        int i3 = asBinder + 25;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            i = 1;
            offsetDateTimeWithMinute = OffsetDateTime.now().plusHours(0L).withMinute(1);
        } else {
            i = 0;
            offsetDateTimeWithMinute = OffsetDateTime.now().plusHours(1L).withMinute(0);
        }
        String string = offsetDateTimeWithMinute.withSecond(i).withNano(i).toString();
        Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
        int i4 = asBinder + 123;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    private static final String ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String string = OffsetDateTime.now().plusHours(2L).withMinute(0).withSecond(0).withNano(0).toString();
        Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
        int i4 = asBinder + 23;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    static {
        access000 = 1;
        getInterfaceDescriptor();
        Object[] objArr = new Object[1];
        a((char) (24710 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR)), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 1818354853, new char[]{40536, 49240, 13364, 25634, 4374, 48626, 18716, 20779, 27775, 62666, 17223, 38064, 59563, 6784, 45172}, new char[]{20730, 9184, 9568, 58214}, new char[]{42302, 25060, 34412, 64864}, objArr);
        onNavigationEvent = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-1475951252) - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), new char[]{57009, 52569, 37437, 42887, 54443, 43446, 35359, 11471, 16932, 52720, 53784, 3296, 42229, 47943, 53941, 48022, 29254, 22142, 6047, 20667, 7852, 4910, 19818}, new char[]{20730, 9184, 9568, 58214}, new char[]{27859, 1733, 22696, 23651}, objArr2);
        IAuthTabCallback = ((String) objArr2[0]).intern();
        onExtraCallback = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivityKt$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return canExtendToken.onWarmupCompleted((adInfo) obj);
            }
        }, 1, (Object) null);
        int i = IAuthTabCallbackStub + 107;
        access000 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 39;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(adinfo, BuildConfig.FLAVOR);
        adinfo.asBinder(true);
        adinfo.onWarmupCompleted("  ");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 35;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final JsonObject onExtraCallbackWithResult(String str, JsonObject jsonObject) throws Throwable {
        int i = 2 % 2;
        PangleEncryptManager pangleEncryptManager = new PangleEncryptManager();
        Object[] objArr = new Object[1];
        a((char) (TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 16044), Color.red(0), new char[]{10032, 11084, 64781, 23383}, new char[]{20730, 9184, 9568, 58214}, new char[]{4686, 23630, 44232, 43582}, objArr);
        dynamicTrack.onExtraCallback(pangleEncryptManager, ((String) objArr[0]).intern(), str);
        PangleEncryptManager pangleEncryptManager2 = new PangleEncryptManager();
        Iterator it = jsonObject.entrySet().iterator();
        int i2 = asBinder + 59;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        while (!(!it.hasNext())) {
            int i4 = IAuthTabCallbackDefault + 83;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                Map.Entry entry = (Map.Entry) it.next();
                pangleEncryptManager2.onExtraCallbackWithResult((String) entry.getKey(), (JsonElement) entry.getValue());
            } else {
                Map.Entry entry2 = (Map.Entry) it.next();
                pangleEncryptManager2.onExtraCallbackWithResult((String) entry2.getKey(), (JsonElement) entry2.getValue());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        dynamicTrack.onExtraCallback(pangleEncryptManager2, "onSuccess", "calendarTest.onSuccess");
        dynamicTrack.onExtraCallback(pangleEncryptManager2, "onError", "calendarTest.onError");
        Unit unit = Unit.INSTANCE;
        pangleEncryptManager.onExtraCallbackWithResult("params", pangleEncryptManager2.onExtraCallbackWithResult());
        return pangleEncryptManager.onExtraCallbackWithResult();
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) throws Throwable {
        JsonObject jsonObject = (JsonObject) objArr[0];
        int i = 2 % 2;
        PangleEncryptManager pangleEncryptManager = new PangleEncryptManager();
        Object[] objArr2 = new Object[1];
        a((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 51167), View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{49183, 61895, 1055, 20344}, new char[]{20730, 9184, 9568, 58214}, new char[]{33912, 9389, 57329, 29127}, objArr2);
        dynamicTrack.onExtraCallback(pangleEncryptManager, ((String) objArr2[0]).intern(), "direct-handler-simulation");
        dynamicTrack.onExtraCallback(pangleEncryptManager, "status", "pending");
        pangleEncryptManager.onExtraCallbackWithResult("request", jsonObject);
        JsonObject jsonObjectOnExtraCallbackWithResult = pangleEncryptManager.onExtraCallbackWithResult();
        int i2 = asBinder + 37;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 35 / 0;
        }
        return jsonObjectOnExtraCallbackWithResult;
    }

    private static final JsonObject onExtraCallback(JsonObject jsonObject, JsonObject jsonObject2, boolean z) throws Throwable {
        String str;
        int i = 2 % 2;
        PangleEncryptManager pangleEncryptManager = new PangleEncryptManager();
        Object[] objArr = new Object[1];
        a((char) (51166 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0)), ViewConfiguration.getPressedStateDuration() >> 16, new char[]{49183, 61895, 1055, 20344}, new char[]{20730, 9184, 9568, 58214}, new char[]{33912, 9389, 57329, 29127}, objArr);
        dynamicTrack.onExtraCallback(pangleEncryptManager, ((String) objArr[0]).intern(), "direct-handler-simulation");
        if (!z) {
            int i2 = IAuthTabCallbackDefault + 39;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 4 % 4;
            }
            str = "success";
        } else {
            int i4 = IAuthTabCallbackDefault + 37;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            str = "error";
        }
        dynamicTrack.onExtraCallback(pangleEncryptManager, "status", str);
        pangleEncryptManager.onExtraCallbackWithResult("request", jsonObject);
        Object[] objArr2 = new Object[1];
        a((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 64348), ViewConfiguration.getScrollDefaultDelay() >> 16, new char[]{48690, 55843, 427, 29702, 2675, 38786}, new char[]{20730, 9184, 9568, 58214}, new char[]{29051, 39833, 23768, 16891}, objArr2);
        pangleEncryptManager.onExtraCallbackWithResult(((String) objArr2[0]).intern(), jsonObject2);
        return pangleEncryptManager.onExtraCallbackWithResult();
    }

    private static final JsonObject IAuthTabCallback(String str, String str2, Map<String, String> map) throws Throwable {
        int i = 2 % 2;
        PangleEncryptManager pangleEncryptManager = new PangleEncryptManager();
        Object[] objArr = new Object[1];
        b(true, new byte[]{1, 0, 0, 1, 0, 0, 1, 0}, new int[]{3, 8, 0, 8}, objArr);
        dynamicTrack.onExtraCallback(pangleEncryptManager, ((String) objArr[0]).intern(), "onError");
        Object[] objArr2 = new Object[1];
        a((char) View.MeasureSpec.makeMeasureSpec(0, 0), MotionEvent.axisFromString(BuildConfig.FLAVOR) + 638221322, new char[]{28345, 5786, 32106, 11972, 4514, 61165, 58721}, new char[]{20730, 9184, 9568, 58214}, new char[]{2499, 2684, 38182, 39478}, objArr2);
        pangleEncryptManager.onExtraCallbackWithResult(((String) objArr2[0]).intern(), ALCFaceBox.onWarmupCompleted(str, str2, map));
        JsonObject jsonObjectOnExtraCallbackWithResult = pangleEncryptManager.onExtraCallbackWithResult();
        int i2 = IAuthTabCallbackDefault + 33;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return jsonObjectOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static final JsonElement onWarmupCompleted(String str) {
        Object next;
        int i = 2 % 2;
        List listSplit$default = StringsKt.split$default(str, new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.trim((String) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int i2 = asBinder + 1;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                next = it2.next();
                int i3 = 74 / 0;
                if (((String) next).length() > 0) {
                    arrayList2.add(next);
                }
            } else {
                next = it2.next();
                if (((String) next).length() > 0) {
                    arrayList2.add(next);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            int i4 = asBinder + 85;
            int i5 = i4 % 128;
            IAuthTabCallbackDefault = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 51;
            asBinder = i7 % 128;
            if (i7 % 2 == 0) {
                return null;
            }
            throw null;
        }
        xkz2 xkz2Var = new xkz2();
        Iterator it3 = arrayList2.iterator();
        while (!(!it3.hasNext())) {
            Integer intOrNull = StringsKt.toIntOrNull((String) it3.next());
            if (intOrNull == null || intOrNull.intValue() > 0) {
                return null;
            }
            dynamicTrack.onExtraCallback(xkz2Var, intOrNull);
        }
        return xkz2Var.onNavigationEvent();
    }

    private static final String onExtraCallback(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 43;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackDefault + 97;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 57;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 27;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackDefault + 107;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 89;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    private static final String getInterfaceDescriptor(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackDefault + 33;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 21;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = asBinder + 39;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final boolean onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = asBinder + 71;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = asBinder + 63;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    private static final void IAuthTabCallbackStub(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
        int i4 = IAuthTabCallbackDefault + 1;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
    }

    private static final String onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        String str = (String) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 67;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallbackDefault(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
        int i4 = asBinder + 9;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final String asBinder(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 33;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = asBinder + 1;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void access000(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
        int i4 = asBinder + 91;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = asBinder + 47;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = IAuthTabCallbackDefault + 15;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final String IAuthTabCallbackDefault(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 17;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return str;
    }

    private static final void IAuthTabCallback_Parcel(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        int i5 = asBinder + 115;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final String onTransact(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallbackStubProxy(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 113;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final String IAuthTabCallbackStub(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 89;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
        int i5 = asBinder + 111;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void getInterfaceDescriptor(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
        int i4 = IAuthTabCallbackDefault + 121;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final String access000(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    private static final void access100(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 25;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
        int i4 = asBinder + 11;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ getSupportedHighSpeedResolutionsFor IAuthTabCallback() {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (getSupportedHighSpeedResolutionsFor) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, -1762894134, 1762894151, new Object[0], iOnExtraCallback2, iOnExtraCallback);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, -727591218, 727591224, new Object[]{getsupportedhighspeedresolutionsfor, str}, iOnExtraCallback2, iOnExtraCallback);
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, -1939400562, 1939400581, new Object[]{getsupportedhighspeedresolutionsfor, str}, iOnExtraCallback2, iOnExtraCallback);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 203003250, -203003245, objArr, iOnExtraCallback2, iOnExtraCallback);
    }

    public static /* synthetic */ Unit onWarmupCompleted(CalendarWebMessageTestActivity calendarWebMessageTestActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, -428026361, 428026385, new Object[]{calendarWebMessageTestActivity, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4}, iOnExtraCallback2, iOnExtraCallback);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, String str2, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, str2, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 725190201, -725190192, objArr, iOnExtraCallback2, iOnExtraCallback);
    }

    public static /* synthetic */ Unit IAuthTabCallback(JsonObject jsonObject, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, JsonObject jsonObject2, boolean z) {
        Object[] objArr = {jsonObject, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, jsonObject2, Boolean.valueOf(z)};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1763215496, -1763215493, objArr, iOnExtraCallback2, iOnExtraCallback);
    }

    public static /* synthetic */ Unit asBinder(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, 1866262879, -1866262872, new Object[]{getsupportedhighspeedresolutionsfor, str}, iOnExtraCallback2, iOnExtraCallback);
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1115663425, -1115663411, objArr, iOnExtraCallback2, iOnExtraCallback);
    }

    private static final getSupportedHighSpeedResolutionsFor IAuthTabCallbackStubProxy() {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (getSupportedHighSpeedResolutionsFor) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, 2104365810, -2104365799, new Object[0], iOnExtraCallback2, iOnExtraCallback);
    }

    private static final String IAuthTabCallback(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (String) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, -1440245968, 1440245978, new Object[]{getsupportedhighspeedresolutionsfor}, iOnExtraCallback2, iOnExtraCallback);
    }

    private static final void asInterface(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, String str) throws Throwable {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, -1397456741, 1397456754, new Object[]{getsupportedhighspeedresolutionsfor, str}, iOnExtraCallback2, iOnExtraCallback);
    }

    private static final boolean asInterface(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return ((Boolean) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, -653640143, 653640159, new Object[]{getsupportedhighspeedresolutionsfor}, iOnExtraCallback2, iOnExtraCallback)).booleanValue();
    }

    private static final getSupportedHighSpeedResolutionsFor onMinimized() {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (getSupportedHighSpeedResolutionsFor) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, -1551146451, 1551146452, new Object[0], iOnExtraCallback2, iOnExtraCallback);
    }

    private static final Unit onExtraCallback(CalendarWebMessageTestActivity calendarWebMessageTestActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, -1678994771, 1678994789, new Object[]{calendarWebMessageTestActivity, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4}, iOnExtraCallback2, iOnExtraCallback);
    }

    private static final Unit IAuthTabCallback(CalendarWebMessageTestActivity calendarWebMessageTestActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, -1243119432, 1243119452, new Object[]{calendarWebMessageTestActivity, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4}, iOnExtraCallback2, iOnExtraCallback);
    }

    private static final Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor7, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor8, CalendarWebMessageTestActivity calendarWebMessageTestActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor9, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor10, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor11, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor12) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor5, getsupportedhighspeedresolutionsfor6, getsupportedhighspeedresolutionsfor7, getsupportedhighspeedresolutionsfor8, calendarWebMessageTestActivity, getsupportedhighspeedresolutionsfor9, getsupportedhighspeedresolutionsfor10, getsupportedhighspeedresolutionsfor11, getsupportedhighspeedresolutionsfor12};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1139660870, -1139660849, objArr, iOnExtraCallback2, iOnExtraCallback);
    }

    private static final Unit writeTypedObject(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, -1500673038, 1500673042, new Object[]{getsupportedhighspeedresolutionsfor, str}, iOnExtraCallback2, iOnExtraCallback);
    }

    private static final String IAuthTabCallback_Parcel(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (String) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, -1056823255, 1056823255, new Object[]{getsupportedhighspeedresolutionsfor}, iOnExtraCallback2, iOnExtraCallback);
    }

    private static final void onActivityResized(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, String str) throws Throwable {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, 720116416, -720116401, new Object[]{getsupportedhighspeedresolutionsfor, str}, iOnExtraCallback2, iOnExtraCallback);
    }

    private static final void onActivityLayout(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, String str) throws Throwable {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, 192405069, -192405057, new Object[]{getsupportedhighspeedresolutionsfor, str}, iOnExtraCallback2, iOnExtraCallback);
    }

    private static final getSupportedHighSpeedResolutionsFor onActivityResized() {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (getSupportedHighSpeedResolutionsFor) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, 668721096, -668721088, new Object[0], iOnExtraCallback2, iOnExtraCallback);
    }

    private static final JsonObject onWarmupCompleted(JsonObject jsonObject) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (JsonObject) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, -1230780978, 1230781001, new Object[]{jsonObject}, iOnExtraCallback2, iOnExtraCallback);
    }

    private static final String ICustomTabsCallbackStub() {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (String) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, 66378778, -66378756, new Object[0], iOnExtraCallback2, iOnExtraCallback);
    }

    private static final void IAuthTabCallback(Function2 function2, Throwable th) throws Throwable {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, 1992049340, -1992049338, new Object[]{function2, th}, iOnExtraCallback2, iOnExtraCallback);
    }

    static void getInterfaceDescriptor() {
        onWarmupCompleted = -8116566976035210495L;
        onExtraCallbackWithResult = -1776194565;
        onTransact = (char) 27643;
        asInterface = new char[]{27256, 27169, 27197, 27259, 27177, 27180, 27183, 27177, 27170, 27176, 27180};
    }
}
