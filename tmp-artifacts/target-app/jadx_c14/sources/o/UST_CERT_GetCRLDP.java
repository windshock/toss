package o;

import android.content.Intent;
import android.graphics.ImageFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.tossfamily.TossFamilyRefreshAccountHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CERT_GetCRLDP implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] onExtraCallback = {27293, 27292, 27283, 27391, 27287, 27282, 27265, 27294, 27263, 27181, 27175, 27196, 27199, 27199, 27183, 27183, 27199, 27177, 27181, 27173, 27196, 27172};
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = (~(i5 | i4)) | i6;
        int i8 = (~((~i4) | i5)) | i6;
        int i9 = (~i6) | i5;
        int i10 = i6 + i5 + i2 + (440753341 * i) + ((-634449194) * i3);
        int i11 = i10 * i10;
        int i12 = ((-907101825) * i6) + 1075183616 + ((-1421434046) * i5) + (i7 * (-1603099839)) + ((-1603099839) * i8) + (1603099839 * i9) + (181665792 * i2) + (780402688 * i) + ((-180879360) * i3) + (353763328 * i11);
        int i13 = (i6 * 892202253) + 1676176333 + (i5 * 892200102) + (i7 * (-717)) + (i8 * (-717)) + (i9 * 717) + (i2 * 892200819) + (i * (-770690073)) + (i3 * 448958498) + (i11 * 1390542848);
        if (i12 + (i13 * i13 * (-1042677760)) != 1) {
            return onNavigationEvent(objArr);
        }
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i14 = 2 % 2;
        int i15 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i15 % 128;
        int i16 = i15 % 2;
        onNavigationEvent(function1, obj);
        int i17 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i17 % 128;
        int i18 = i17 % 2;
        return null;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(String str, String str2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(str, str2);
        int i4 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, List list) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        Unit unit = (Unit) IAuthTabCallback(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, 96429440, -96429440, new Object[]{setonoutofmemeryerrorcallback, list});
        int i4 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(setonoutofmemeryerrorcallback, th);
        }
        IAuthTabCallback(setonoutofmemeryerrorcallback, th);
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function1, obj);
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        if (i5 != 0) {
            throw null;
        }
        int i6 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 35 / 0;
        }
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        boolean zOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
            int i3 = 78 / 0;
        } else {
            zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        int i4 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 30 / 0;
        }
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new TossFamilyRefreshAccountHandler$.ExternalSyntheticLambda0());
        int i2 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallback;
    }

    private static final boolean onWarmupCompleted(String str, String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        boolean zOnTransact = filterCreatePageParams.onTransact(Uri.parse(str));
        int i4 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zOnTransact;
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onNavigationEvent + 121;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        String asString;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setText settext = new setText(jsonObject);
        JsonObject jsonObjectOnExtraCallbackWithResult = settext.onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        ArrayList arrayList = null;
        a(new int[]{0, 8, 110, 8}, true, null, objArr);
        JsonElement jsonElement = jsonObjectOnExtraCallbackWithResult.get(((String) objArr[0]).intern());
        if (jsonElement != null) {
            asString = jsonElement.getAsString();
        } else {
            int i2 = onExtraCallbackWithResult + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            asString = null;
        }
        JsonObject jsonObjectOnExtraCallbackWithResult2 = settext.onExtraCallbackWithResult();
        Object[] objArr2 = new Object[1];
        a(new int[]{8, 14, 0, 13}, false, new byte[]{1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0}, objArr2);
        JsonElement jsonElement2 = jsonObjectOnExtraCallbackWithResult2.get(((String) objArr2[0]).intern());
        if (jsonElement2 != null) {
            int i4 = onExtraCallbackWithResult + 69;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            JsonArray asJsonArray = jsonElement2.getAsJsonArray();
            if (asJsonArray != null) {
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asJsonArray, 10));
                Iterator it = asJsonArray.iterator();
                while (it.hasNext()) {
                    int i6 = onNavigationEvent + 13;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 == 0) {
                        arrayList.add(((JsonElement) it.next()).getAsString());
                        int i7 = 85 / 0;
                    } else {
                        arrayList.add(((JsonElement) it.next()).getAsString());
                    }
                }
            }
        }
        setSymmetricKey.onExtraCallback(setSymmetricKey.onExtraCallbackWithResult, asString, arrayList, false, 4, null).onNavigationEvent(new TossFamilyRefreshAccountHandler$.ExternalSyntheticLambda2(new TossFamilyRefreshAccountHandler$.ExternalSyntheticLambda1(setonoutofmemeryerrorcallback)), new TossFamilyRefreshAccountHandler$.ExternalSyntheticLambda4(new TossFamilyRefreshAccountHandler$.ExternalSyntheticLambda3(setonoutofmemeryerrorcallback)));
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = (setOnOutOfMemeryErrorCallback) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, (Function1) null, 1, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(th);
        ALCFaceBox.onExtraCallbackWithResult(setonoutofmemeryerrorcallback, th, (String) null, (Map) null, 6, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = onExtraCallback;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = $11 + 99;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 34 - ImageFormat.getBitsPerPixel(0), 14239 - (ViewConfiguration.getFadingEdgeLength() >> 16), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            int i9 = $10 + 105;
            $11 = i9 % 128;
            char[] cArr4 = i9 % 2 == 0 ? new char[i3] : new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i10 = $11 + 27;
                $10 = i10 % 128;
                if (i10 % 2 == 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 0) {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 30 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 17657 - View.MeasureSpec.getMode(0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 10936), ExpandableListView.getPackedPositionGroup(0L) + 65, TextUtils.getTrimmedLength("") + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        int i13 = $10 + 13;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49466 - TextUtils.lastIndexOf("", '0')), 70 - View.combineMeasuredStates(0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i15 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i15, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i15);
        }
        if (z) {
            int i16 = $10 + 63;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i18 = $10 + 35;
                $11 = i18 % 128;
                int i19 = i18 % 2;
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        IAuthTabCallback(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, -1038292839, 1038292840, new Object[]{function1, obj});
    }

    private static final Unit IAuthTabCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, List list) {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (Unit) IAuthTabCallback(ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, 96429440, -96429440, new Object[]{setonoutofmemeryerrorcallback, list});
    }
}
