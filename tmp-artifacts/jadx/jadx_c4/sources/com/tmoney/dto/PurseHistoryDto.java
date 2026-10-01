package com.tmoney.dto;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import com.tmoney.LiveCheckConstants;
import com.tmoney.TmoneyConstants;
import com.tmoney.a.f;
import com.tmoney.utils.StringHelper;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class PurseHistoryDto {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 52803;
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 2356;
    private static char onNavigationEvent = 15087;
    private static char onWarmupCompleted = 17166;
    private int amount;
    private int balance;
    private String cardTrdSno;
    private TmoneyConstants.TmoneyTagType tmoneyTagType;

    public PurseHistoryDto(f fVar) throws Throwable {
        TmoneyConstants.TmoneyTagType tmoneyTagType;
        this.amount = fVar.getUseAmt();
        this.balance = fVar.getBalance();
        try {
            String ntep = fVar.getNtep();
            this.cardTrdSno = ntep;
            String strValueOf = String.valueOf(Long.valueOf(Long.parseLong(ntep, 16)));
            Object[] objArr = new Object[1];
            a(new char[]{61607, 55105}, 1 - (ViewConfiguration.getTapTimeout() >> 16), objArr);
            this.cardTrdSno = StringHelper.lpad(strValueOf, 10, ((String) objArr[0]).intern());
            int i = 2 % 2;
        } catch (Exception unused) {
            this.cardTrdSno = "";
        }
        if (fVar.getTag().equals("01")) {
            tmoneyTagType = TmoneyConstants.TmoneyTagType.Purchase;
            int i2 = onExtraCallback + 25;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        } else if (fVar.getTag().equals("02")) {
            int i4 = asInterface + 95;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                tmoneyTagType = TmoneyConstants.TmoneyTagType.Load;
                int i5 = 8 / 0;
            } else {
                tmoneyTagType = TmoneyConstants.TmoneyTagType.Load;
            }
        } else if (!(!fVar.getTag().equals("03"))) {
            tmoneyTagType = TmoneyConstants.TmoneyTagType.Refund;
        } else {
            tmoneyTagType = TmoneyConstants.TmoneyTagType.Others;
            int i6 = onExtraCallback + 115;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            int i32 = 2 % 2;
        }
        this.tmoneyTagType = tmoneyTagType;
        int i8 = asInterface + 31;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
    }

    public int getAmount() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 121;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.amount;
        int i6 = i2 + 81;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public int getBalance() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = this.balance;
        int i6 = i3 + 13;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public String getCardTrdSno() {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.cardTrdSno;
        }
        throw null;
    }

    public TmoneyConstants.TmoneyTagType getTagType() {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TmoneyConstants.TmoneyTagType tmoneyTagType = this.tmoneyTagType;
        int i4 = i3 + 25;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return tmoneyTagType;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        CharSequence charSequence;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $11 + 45;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $10 + 33;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onNavigationEvent);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[c] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                        charSequence = "";
                        int iIndexOf = 10 - TextUtils.indexOf(charSequence, charSequence, i3, i3);
                        int iIndexOf2 = TextUtils.indexOf(charSequence, charSequence) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(trimmedLength, iIndexOf, iIndexOf2, -787580090, false, "C", clsArr);
                    } else {
                        charSequence = "";
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    int i12 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf(charSequence, '0', 0)), Gravity.getAbsoluteGravity(0, 0) + 10, 12434 - View.resolveSize(0, 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i12 + 1;
                    i3 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - Color.argb(0, 0, 0, 0)), 14 - TextUtils.indexOf("", "", 0, 0), 19901 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
