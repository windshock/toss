package com.tnkfactory.ad.f;

import android.content.Context;
import android.text.TextUtils;
import com.tnkfactory.ad.Logger;
import com.tnkfactory.ad.ServiceCallback;
import com.tnkfactory.ad.rwd.Settings;
import com.tnkfactory.ad.rwd.TnkApi;
import com.tnkfactory.ad.rwd.data.ResultState;
import com.tnkfactory.framework.vo.ValueObject;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class e extends ServiceCallback {
    public final String a;
    public final int b;
    public final String c;

    public e(String str, int i2, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.a = str;
        this.b = i2;
        this.c = str2;
    }

    @Override // com.tnkfactory.ad.ServiceCallback
    public final void onReturn(Context context, Object obj) {
        Intrinsics.checkNotNullParameter(context, "");
        if (!(obj instanceof ResultState.Success)) {
            if (obj instanceof ResultState.Error) {
                ((ResultState.Error) obj).getE();
                return;
            }
            return;
        }
        Object value = ((ResultState.Success) obj).getValue();
        ValueObject valueObject = value instanceof ValueObject ? (ValueObject) value : null;
        if (valueObject != null) {
            int i2 = valueObject.getInt("ret_cd");
            Logger.d("request for payment returned. retrun code = " + i2);
            if (i2 == 0 || i2 == 2 || i2 == 4 || i2 == 9) {
                Settings.INSTANCE.addPayedApp(context, this.a, this.b, this.c, null);
            }
            int i3 = valueObject.getInt("user_brth");
            if (i3 >= 0) {
                TnkApi.INSTANCE.setUserAge(context, i3);
            }
            String string = valueObject.getString("user_sex");
            String str = string != null ? string : "";
            if (TextUtils.isEmpty(str)) {
                return;
            }
            TnkApi.INSTANCE.setUserGender(context, str);
        }
    }
}
