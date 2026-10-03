package o;

import android.content.Intent;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
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
import viva.republica.toss.common.web.message.handlers.tossfamily.TossFamilyRefreshBalanceHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CERT_GetBasicConstraints implements ALCFaceQuality {
    private static final byte[] $$a = {8, -40, 43, -43};
    private static final int $$b = 21;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private static long onExtraCallback = 7798559133331975163L;
    private static int IAuthTabCallback = -1776194565;
    private static char onNavigationEvent = 4705;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, byte r7, byte r8) {
        /*
            byte[] r0 = o.UST_CERT_GetBasicConstraints.$$a
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r8 = 110 - r8
            int r6 = r6 * 4
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetBasicConstraints.$$c(byte, byte, byte):java.lang.String");
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(function1, obj);
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        int i5 = onWarmupCompleted + 3;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = ~(i7 | i8 | i3);
        int i10 = ~i3;
        int i11 = (~(i7 | i10)) | (~(i8 | i5 | i3));
        int i12 = (~(i3 | i7)) | (~(i8 | i10));
        int i13 = i5 + i6 + i4 + ((-1255669517) * i) + (533247121 * i2);
        int i14 = i13 * i13;
        int i15 = ((i5 * (-1895547823)) - 858849280) + ((-1895547823) * i6) + (i9 * (-204618832)) + (i11 * (-204618832)) + ((-204618832) * i12) + ((-2100166656) * i4) + (760610816 * i) + ((-1057882112) * i2) + (1344208896 * i14);
        int i16 = ((i5 * (-122328301)) - 2132886715) + (i6 * (-122328301)) + (i9 * 272) + (i11 * 272) + (i12 * 272) + (i4 * (-122328029)) + (i * (-1196579527)) + (i2 * 656595923) + (i14 * 138215424);
        int i17 = i15 + (i16 * i16 * (-833028096));
        if (i17 == 1) {
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = (setOnOutOfMemeryErrorCallback) objArr[0];
            List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener> list = (List) objArr[1];
            int i18 = 2 % 2;
            setSymmetricKey setsymmetrickey = setSymmetricKey.onExtraCallbackWithResult;
            Intrinsics.checkNotNull(list);
            setsymmetrickey.onNavigationEvent(list).onNavigationEvent(new TossFamilyRefreshBalanceHandler$.ExternalSyntheticLambda8(new TossFamilyRefreshBalanceHandler$.ExternalSyntheticLambda7(setonoutofmemeryerrorcallback)), new TossFamilyRefreshBalanceHandler$.ExternalSyntheticLambda10(new TossFamilyRefreshBalanceHandler$.ExternalSyntheticLambda9(setonoutofmemeryerrorcallback)));
            Unit unit = Unit.INSTANCE;
            int i19 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i19 % 128;
            int i20 = i19 % 2;
            return unit;
        }
        if (i17 == 2) {
            return onNavigationEvent(objArr);
        }
        if (i17 == 3) {
            return onWarmupCompleted(objArr);
        }
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i21 = 2 % 2;
        int i22 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i22 % 128;
        int i23 = i22 % 2;
        IAuthTabCallbackStub(function1, obj);
        int i24 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i24 % 128;
        int i25 = i24 % 2;
        return null;
    }

    public static /* synthetic */ List onExtraCallback(String str, List list, List list2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        List listOnNavigationEvent = onNavigationEvent(str, list, list2);
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        return listOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(setonoutofmemeryerrorcallback, th);
        int i4 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, List list) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onWarmupCompleted(setonoutofmemeryerrorcallback, list);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(setonoutofmemeryerrorcallback, list);
        int i3 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ List onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        List listAsBinder = asBinder(function1, obj);
        int i4 = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return listAsBinder;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(setonoutofmemeryerrorcallback, th);
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = (setOnOutOfMemeryErrorCallback) objArr[0];
        List list = (List) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallback(new Object[]{setonoutofmemeryerrorcallback, list}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 1143201981, -1143201980);
        int i4 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ boolean onNavigationEvent(String str, String str2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(str, str2);
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
        int i5 = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 87 / 0;
        }
        return zIAuthTabCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onTransact(function1, obj);
        int i4 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        asInterface(function1, obj);
        int i4 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        if (i5 == 0) {
            int i6 = 38 / 0;
        }
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        super/*o.drawTextBox*/.onExtraCallbackWithResult();
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.drawTextBox*/.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i3 = onExtraCallbackWithResult + 75;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 72 / 0;
        }
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.drawTextBox*/.onWarmupCompleted(str);
        }
        super/*o.drawTextBox*/.onWarmupCompleted(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new TossFamilyRefreshBalanceHandler$.ExternalSyntheticLambda6());
        int i2 = onExtraCallbackWithResult + 83;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return iAuthTabCallback;
        }
        throw null;
    }

    private static final boolean IAuthTabCallback(String str, String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Uri uri = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(uri, "");
        boolean zOnTransact = filterCreatePageParams.onTransact(uri);
        int i4 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnTransact;
        }
        throw null;
    }

    private static final List asBinder(Function1 function1, Object obj) {
        List list;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            list = (List) function1.invoke(obj);
            int i3 = 59 / 0;
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            list = (List) function1.invoke(obj);
        }
        int i4 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return list;
    }

    private static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 49 / 0;
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
        a((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{63883, 20129, 44834, 50185, 52118, 52323, 6647, 2343}, new char[]{0, 0, 0, 0}, new char[]{58251, 10412, 52434, 10584}, objArr);
        JsonElement jsonElement = jsonObjectOnExtraCallbackWithResult.get(((String) objArr[0]).intern());
        ArrayList arrayList = null;
        if (jsonElement != null) {
            int i2 = onExtraCallbackWithResult + 115;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            asString = jsonElement.getAsString();
            int i4 = onExtraCallbackWithResult + 49;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 % 5;
            }
        } else {
            asString = null;
        }
        JsonObject jsonObjectOnExtraCallbackWithResult2 = settext.onExtraCallbackWithResult();
        Object[] objArr2 = new Object[1];
        a((char) (AndroidCharacter.getMirror('0') + 52020), 1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), new char[]{13225, 55043, 57708, 47403, 9483, 24025, 30119, 12241, 39008, 14263, 35326, 37168, 28778, 32428}, new char[]{0, 0, 0, 0}, new char[]{65449, 16297, 25826, 64715}, objArr2);
        JsonElement jsonElement2 = jsonObjectOnExtraCallbackWithResult2.get(((String) objArr2[0]).intern());
        if (jsonElement2 != null) {
            int i6 = onExtraCallbackWithResult + 109;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                jsonElement2.getAsJsonArray();
                throw null;
            }
            JsonArray asJsonArray = jsonElement2.getAsJsonArray();
            if (asJsonArray != null) {
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asJsonArray, 10));
                Iterator it = asJsonArray.iterator();
                while (it.hasNext()) {
                    arrayList.add(((JsonElement) it.next()).getAsString());
                }
            }
        }
        PageShowPoint.Companion.onExtraCallback().onWarmupCompleted(new TossFamilyRefreshBalanceHandler$.ExternalSyntheticLambda1(new TossFamilyRefreshBalanceHandler$.ExternalSyntheticLambda0(asString, arrayList))).onNavigationEvent(new TossFamilyRefreshBalanceHandler$.ExternalSyntheticLambda3(new TossFamilyRefreshBalanceHandler$.ExternalSyntheticLambda2(setonoutofmemeryerrorcallback)), new TossFamilyRefreshBalanceHandler$.ExternalSyntheticLambda5(new TossFamilyRefreshBalanceHandler$.ExternalSyntheticLambda4(setonoutofmemeryerrorcallback)));
        int i7 = onExtraCallbackWithResult + 45;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 39 / 0;
        }
    }

    private static final void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onExtraCallbackWithResult + 39;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
    }

    private static final Unit onWarmupCompleted(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, List list) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, (Function1) null, 1, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNull(th);
            ALCFaceBox.onExtraCallbackWithResult(setonoutofmemeryerrorcallback, th, (String) null, (Map) null, 3, (Object) null);
        } else {
            Intrinsics.checkNotNull(th);
            ALCFaceBox.onExtraCallbackWithResult(setonoutofmemeryerrorcallback, th, (String) null, (Map) null, 6, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private static final void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
    }

    private static final Unit onWarmupCompleted(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNull(th);
            ALCFaceBox.onExtraCallbackWithResult(setonoutofmemeryerrorcallback, th, (String) null, (Map) null, 41, (Object) null);
        } else {
            Intrinsics.checkNotNull(th);
            ALCFaceBox.onExtraCallbackWithResult(setonoutofmemeryerrorcallback, th, (String) null, (Map) null, 6, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final List onNavigationEvent(String str, List list, List list2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list2, "");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((TabBarInfoQueryPointOnTabBarInfoQueryListener) obj).ICustomTabsCallbackDefault() == queryTabBarInfo.TOSS_FAMILY) {
                int i2 = onExtraCallbackWithResult + 85;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener = (TabBarInfoQueryPointOnTabBarInfoQueryListener) obj2;
            if (str != null) {
                int i4 = onExtraCallbackWithResult + 39;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    if (str.length() <= 0) {
                        continue;
                    }
                } else if (str.length() > 0) {
                }
                int i5 = onWarmupCompleted + 33;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    Intrinsics.areEqual(tabBarInfoQueryPointOnTabBarInfoQueryListener.asInterface(), str);
                    throw null;
                }
                if (Intrinsics.areEqual(tabBarInfoQueryPointOnTabBarInfoQueryListener.asInterface(), str)) {
                }
            }
            int i6 = onExtraCallbackWithResult + 5;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            arrayList2.add(obj2);
        }
        ArrayList arrayList3 = new ArrayList();
        int i8 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        for (Object obj3 : arrayList2) {
            TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener2 = (TabBarInfoQueryPointOnTabBarInfoQueryListener) obj3;
            if (list == null || list.isEmpty()) {
                int i10 = onWarmupCompleted + 97;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                arrayList3.add(obj3);
            } else {
                int i12 = onWarmupCompleted + 23;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
                if (list.contains(tabBarInfoQueryPointOnTabBarInfoQueryListener2.bP_())) {
                    arrayList3.add(obj3);
                }
            }
        }
        return arrayList3;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $10 + 103;
            $11 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char c2 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    int trimmedLength = 43 - TextUtils.getTrimmedLength("");
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1451;
                    byte b = (byte) i4;
                    byte b2 = b;
                    String str$$c = $$c(b, b2, b2);
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, trimmedLength, windowTouchSlop, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) i4;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 49122), View.combineMeasuredStates(i4, i4) + 44, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1493, 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 23972), KeyEvent.getDeadChar(0, 0) + 50, 22938 - ((byte) KeyEvent.getModifierMetaStateMask()), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 45848), 29 - (ViewConfiguration.getFadingEdgeLength() >> 16), KeyEvent.getDeadChar(0, 0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallback ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i7 = $10 + 79;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                i2 = 2;
                i4 = 0;
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

    public static /* synthetic */ Unit onNavigationEvent(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, List list) {
        return (Unit) onExtraCallback(new Object[]{setonoutofmemeryerrorcallback, list}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -558188063, 558188065);
    }

    private static final Unit onExtraCallbackWithResult(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, List list) {
        return (Unit) onExtraCallback(new Object[]{setonoutofmemeryerrorcallback, list}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 1143201981, -1143201980);
    }
}
